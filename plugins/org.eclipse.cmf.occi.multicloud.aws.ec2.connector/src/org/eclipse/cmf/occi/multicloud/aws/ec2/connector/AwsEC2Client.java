/**
 * Copyright (c) 2018 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.eclipse.cmf.occi.multicloud.aws.ec2.connector;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccountlink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Awscredential;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsAccountModelException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.DescribeRegionsResult;
import com.amazonaws.services.ec2.model.Region;

/**
 * Manage AWS client for ec2 service (elastic compute).
 * @author Christophe Gourdin
 *
 */
public class AwsEC2Client {
	
	private String accessKey = null;
	private String secretKey = null;
	/**
	 * AWS endpoint, if null this is defaulted to default region url.
	 */
	private String endpoint = "https://{1}.{0}.amazonaws.com/";
	private String region = null;
	
	private static Logger LOGGER = LoggerFactory.getLogger(AwsEC2Client.class);
	
	private AmazonEC2 ec2Client;
	

	/**
	 * @param accessKey
	 * @param secretKey
	 * @param region
	 * @param endpoint
	 */
	public AwsEC2Client(String accessKey, String secretKey, String region) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
		this.region = region;
		if (region != null && !region.trim().isEmpty()) {
			this.endpoint = MessageFormat.format(endpoint, region, "ec2");
		}
	}

	/**
	 * Read credentials from property file object.
	 * 
	 * @throws IOException
	 */
	public void loadFromPropertyFile() throws IOException {
		if (accessKey == null) {
			Properties prop = new Properties();

			String homePath = System.getProperty("user.home") + File.separator;
			InputStream in = new FileInputStream(homePath + "aws-credential.properties");

			prop.load(in);
			if (in != null) {
				try {
					in.close();

				} catch (IOException ex) {
					// no op.
				}
			}
			if (prop.containsKey("aws.accesskey")) {
				LOGGER.info("Setting aws credential...");
				this.accessKey = prop.getProperty("aws.accessKey");
				this.secretKey = prop.getProperty("aws.secretKey");
				this.endpoint = prop.getProperty("aws.endpoint");
				// TODO : define a default region in property file. if set this override extension default region on resources.
				
			} else {
				throw new FileNotFoundException("credential property file not found !");
			}
		}
	}
	
	/**
	 * Read login, password and url from a vcenter credential mixin.
	 * @param vcenterCred
	 */
	public void loadFromCredentialMixin(Awscredential awsCred) {
		this.accessKey = awsCred.getAccessKey();
		this.secretKey = awsCred.getSecretKey();
		if (awsCred.getUrl() != null) {
			// Override endpoint url by the provided in mixin.
			this.endpoint = awsCred.getUrl();
		}
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public AmazonEC2 getEc2Client() {
		return ec2Client;
	}

	public void setEc2Client(AmazonEC2Client ec2Client) {
		this.ec2Client = ec2Client;
	}
	
	
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
		if (region != null && !region.trim().isEmpty()) {
			this.endpoint = MessageFormat.format(endpoint, region, "ec2");
		}
	}

	/**
	 * Build a new aws ec2 client.
	 * @return
	 */
	public AmazonEC2 initEC2Client() {
		ClientConfiguration config = new ClientConfiguration();
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        config.withRequestTimeout(5000); // TODO : Define a field in AwsAccount for aws request timeout.
        
        if (region != null) {
        		// Build with region.
        		ec2Client = AmazonEC2ClientBuilder.standard()
        				.withRegion(region)
        				.withClientConfiguration(config)
        				.withCredentials(new AWSStaticCredentialsProvider(credentials))
        				.build();
        } else {
        		// TODO : get region from endpoint string and set it if endpoint is non null value.
        		if (endpoint != null && !endpoint.trim().isEmpty()) {
        			
        		} else {
        			LOGGER.warn("No region defined, using default set by AWS");
        			ec2Client = AmazonEC2ClientBuilder.standard()
        				.withClientConfiguration(config)
        				.withCredentials(new AWSStaticCredentialsProvider(credentials))
        				.build();
        		}
        }
        
        return ec2Client;
	}
	
	
	public AmazonEC2 getClientInstance() {
        return this.ec2Client;
    }

	/**
	 * Initialize a connection to aws server by describing regions.
	 * 
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public void connect() throws AmazonServiceException {
		if (ec2Client == null && accessKey != null && secretKey != null) {
			initEC2Client();
		}
		// Describe region if connected.
		try {
			DescribeRegionsResult result = ec2Client.describeRegions();
			List<Region> regions = result.getRegions();
			for (Region region : regions) {
				LOGGER.info("Region found after aws connect : " + region.getRegionName());
			}
		} catch (AmazonClientException ex) {
			initEC2Client();
			
		}
		
	}
	
	/**
	 * Clean up resources linked to this client.
	 */
    public void destroyClient() {
        this.ec2Client.shutdown();
        this.ec2Client = null;
    }
    
    /**
     * Check if the client is ready for queries. if not, this instantiate a new client for the account and region.
     * @param entity
     * @return
     */
    public boolean checkConnection(Entity entity) throws AmazonClientException, AwsAccountModelException {
    		boolean connected = false;
    		
    		if (ec2Client == null) {
    			Optional<Awscredential> optCred;
    			// Search for AwsAccount resource (mandatory), without account => no client.
    			Awsaccount awsAccount = null; 
    			if (entity instanceof Awsaccount) {
    				awsAccount = (Awsaccount)entity;
    			} else {
    				// Search by Cloudaccountlink.
    				if (entity instanceof Resource) {
    					Resource res = (Resource) entity;
    					List<Link> links = res.getRlinks(); // From target to source : source awsAccount -> cloudaccountlink -> target resource.
    					for (Link link : links) {
    						if (link instanceof Cloudaccountlink && link.getSource() instanceof Awsaccount) {
    							awsAccount = (Awsaccount) link.getSource();
    							break;
    						}
    					}
    					
    					
    				} else {
    					// Entity is a link. Account is maybe on source
    					Link link = (Link) entity;
    					Resource source = link.getSource();
    					if (source instanceof Awsaccount) {
    						awsAccount = (Awsaccount)entity;
    					} else {
    						// Search on sublinked resources.
    						List<Link> links = source.getRlinks();
    						for (Link linkSrc : links) {
    							if (linkSrc instanceof Cloudaccountlink && linkSrc.getSource() instanceof Awsaccount) {
        							awsAccount = (Awsaccount) linkSrc.getSource();
        							break;
        						}
    						}
    					}
    				}
    			}
    			if (awsAccount == null) {
    				throw new AwsAccountModelException("AwsAccount resource doesnt exist, please add awsaccount resource and link it with cloudaccountlink on a resource.");
    			}
    			
    			optCred = OcciHelper.getMixinBase(awsAccount.getParts(), Awscredential.class);
    			if (optCred.isPresent()) {
    				this.setAccessKey(optCred.get().getAccessKey());
    				this.setSecretKey(optCred.get().getSecretKey());
    				this.setEndpoint(optCred.get().getUrl());
    			}
    			// Search for region mixin.
    			Optional<org.eclipse.cmf.occi.multicloud.regions.Region> optRegion = OcciHelper.getMixinBase(awsAccount.getParts(), org.eclipse.cmf.occi.multicloud.regions.Region.class);
    			if (optRegion.isPresent()) {
    				org.eclipse.cmf.occi.multicloud.regions.Region regionMixin = optRegion.get();
    				// Get the region name attribute.
    				for (AttributeState attrState : regionMixin.getAttributes()) {
    					if (attrState.getName().equalsIgnoreCase("regionName")) {
    						this.setRegion(attrState.getValue());
    						LOGGER.warn("Region is set on ec2 client to : " + attrState.getValue());
    						break;
    					}
    				}
    				if (region == null) {
    					LOGGER.warn("No mixin region found and no region is set on client, using aws default");
    				}
    				
    			}
    			
    		} else {
    			try {
    				this.connect();
    				
    				// If no exceptions thrown, the sdk can connect to aws account.
        			connected = true;
    			} catch (AmazonServiceException ex) {
    				LOGGER.error(ex.getErrorCode() + "--> " + ex.getErrorMessage() + " --< type :-->" + ex.getErrorType());
    				
    			} catch (AmazonClientException ex) {
    				LOGGER.error("AmazonClientException : " + ex.getMessage());
    			}
    			
    		}
    		return connected;
    }
	
}
