/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Wed Jan 10 17:36:43 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.aws.ec2/model/ec2.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.aws.ec2.connector;

import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.driver.SecurityGroupHelper;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsAccountModelException;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.amazonaws.services.ec2.model.SecurityGroup;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/aws# - term: securitygroup - title:
 */
public class SecuritygroupConnector extends org.eclipse.cmf.occi.multicloud.aws.ec2.impl.SecuritygroupImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SecuritygroupConnector.class);

	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	// Start of user code Securitygroupconnector_constructor
	/**
	 * Constructs a securitygroup connector.
	 */
	SecuritygroupConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code SecuritygroupocciCreate
	/**
	 * Called when this Securitygroup instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		LOGGER.info("Create a new SecurityGroup for name : " + this.getSecurityGroupName() + " and description: "
				+ this.getSecurityGroupDescription());

		// Get the ec2Client from linked instance.
		try {
			AwsEC2Client ec2Client = getClientInstance();
			if (ec2Client != null) {
				// Check if security group already exist.
				if (checkIfSecurityGroupExist(ec2Client)) {
					LOGGER.warn(
							"Cant create the security group : " + this.getSecurityGroupName() + " as it already exist");
					return;
				}
				// Create the security group (firewall) effectively.
				createSecurityGroup(ec2Client);
			} else {
				LOGGER.warn("ec2 client is not ready, the security group : " + this.getSecurityGroupName()
						+ " may be not connected to an aws instance, please check your configuration.");
			}
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}

	}
	// End of user code

	// Start of user code Securitygroup_occiRetrieve_method
	/**
	 * Called when this Securitygroup instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		try {
			AwsEC2Client ec2Client = getClientInstance();
			if (ec2Client != null) {
				// Check if keypair exist.
				if (checkIfSecurityGroupExist(ec2Client)) {
					// Retrieve infos.

					SecurityGroup securityGroup = SecurityGroupHelper.describeSecurityGroup(ec2Client,
							this.getSecurityGroupId());
					if (securityGroup != null) {
						this.setSecurityGroupId(securityGroup.getGroupId());
						this.setVpcId(securityGroup.getVpcId());
						this.setSummary(securityGroup.getDescription());

					} else {
						LOGGER.warn("security group doesnt exist on your aws account and region.");
					}

				} else {
					LOGGER.warn("security group : " + this.getSecurityGroupName()
							+ " doesnt exist on your aws account and region.");
				}
			}
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	// End of user code

	// Start of user code Securitygroup_occiUpdate_method
	/**
	 * Called when this Securitygroup instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code SecuritygroupocciDelete_method
	/**
	 * Called when this Securitygroup instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		LOGGER.info("Remove securityGroup : " + getSecurityGroupName() + " from provider.");
		try {
			AwsEC2Client ec2Client = getClientInstance();
			if (ec2Client != null) {
				if (!checkIfSecurityGroupExist(ec2Client)) {
					LOGGER.warn("security group : " + this.getSecurityGroupName() + " doesnt exist anymore");
					return;
				}
				SecurityGroupHelper.deleteSecurityGroup(ec2Client, this.getSecurityGroupId());
			}
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	// End of user code

	//
	// Securitygroup actions.
	//

	// Start of user code getAwsEC2ClientFromLinkedInstance
	/**
	 * get ec2Client instance from Awsaccount resource associated with this
	 * resource.
	 * 
	 * @return
	 */
	public AwsEC2Client getClientInstance() throws AwsAccountModelException {
		AwsEC2Client ec2Client = ModelUtils.getClientInstance(this);
		if (ec2Client == null) {
			// Must never arrive.
			globalMessage = "Client is not instanciated, its maybe a bug, please report it.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			throw new AwsAccountModelException(globalMessage);
		}
		if (!ec2Client.checkConnection(this)) {

			// Must return true if connection is established.
			globalMessage = "No connection to aws has been established, please check your credentials or your configuration.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			throw new AwsAccountModelException(globalMessage);
		}
		return ec2Client; 
	}
	// End of user code

	// Start of user code checkIfSecurityGroupExist
	/**
	 * Check if this security group exist on account.
	 * 
	 * @param ec2Client
	 *            the aws sdk client.
	 * @return true if it exist, false elsewhere.
	 */
	public boolean checkIfSecurityGroupExist(AwsEC2Client ec2Client) {
		// A security group is applied on a resource compute typically.
		try {
			return SecurityGroupHelper.isExistSecurityGroup(ec2Client, this.getSecurityGroupName());
		} catch (AwsOperationException ex) {
			throw new RuntimeException("Cannot retrieve security group, error on aws : " + ex.getCause().getMessage());
		}
	}

	// End of user code

	// Start of user code createSecurityGroup
	/**
	 * Create a new security group (firewall).
	 * 
	 * @param ec2Client
	 */
	public void createSecurityGroup(AwsEC2Client ec2Client) throws AwsOperationException {
		// Find ipPermission object.
		SecurityGroup securityGroup = SecurityGroupHelper.createSecurityGroup(ec2Client, this);

		// Update model attributes.
		this.setSecurityGroupId(securityGroup.getGroupId());
		this.setVpcId(securityGroup.getVpcId());
		

	}
	// End of user code
}
