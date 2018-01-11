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
package org.eclipse.cmf.occi.multicloud.aws.ec2.connector.driver;

import java.util.List;

import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.AwsEC2Client;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.ec2.model.CreateKeyPairRequest;
import com.amazonaws.services.ec2.model.CreateKeyPairResult;
import com.amazonaws.services.ec2.model.DeleteKeyPairRequest;
import com.amazonaws.services.ec2.model.DescribeKeyPairsRequest;
import com.amazonaws.services.ec2.model.DescribeKeyPairsResult;
import com.amazonaws.services.ec2.model.ImportKeyPairRequest;
import com.amazonaws.services.ec2.model.ImportKeyPairResult;
import com.amazonaws.services.ec2.model.KeyPair;
import com.amazonaws.services.ec2.model.KeyPairInfo;

public class KeyPairHelper {
	private static Logger LOGGER = LoggerFactory.getLogger(KeyPairHelper.class);
	
	/**
	 * Check if a keypair exist on account for the provided name.
	 * @param ec2Client the sdk client.
	 * @param keyPairName the keypair name.
	 * @return
	 * @throws AwsOperationException
	 */
	public static boolean isExistKey(AwsEC2Client ec2Client, final String keyPairName) throws AwsOperationException {
		DescribeKeyPairsRequest req = new DescribeKeyPairsRequest().withKeyNames(keyPairName);
		try {
			DescribeKeyPairsResult result = ec2Client.getClientInstance().describeKeyPairs(req);
			List<KeyPairInfo> keyPairs = result.getKeyPairs();
			if (keyPairs != null && !keyPairs.isEmpty()) {
				return true;
			}
			return false;
		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
	}
	
	/**
	 * Describe a keyPair.
	 * @param ec2Client the aws sdk client.
	 * @param keyPairName the keypair name.
	 * @return an aws KeyPairInfo object or null if keypair doesnt exist.
	 * @throws AwsOperationException if errors from aws.
	 */
	public static KeyPairInfo describeKeyPair(AwsEC2Client ec2Client, final String keyPairName) throws AwsOperationException {
		DescribeKeyPairsRequest req = new DescribeKeyPairsRequest().withKeyNames(keyPairName);
		try {
			DescribeKeyPairsResult result = ec2Client.getClientInstance().describeKeyPairs(req);
			List<KeyPairInfo> keyPairs = result.getKeyPairs();
			if (keyPairs != null && !keyPairs.isEmpty()) {
				return keyPairs.get(0);
			}
			LOGGER.warn("Keypair for name : " + keyPairName + " doesnt exist on your aws account");
			return null;
		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
	}
	
	/**
	 * Create a new key pair.
	 * @param ec2Client
	 * @param keyPairName
	 * @return
	 * @throws AwsOperationException
	 */
	public static KeyPair createKeyPair(AwsEC2Client ec2Client, final String keyPairName) throws AwsOperationException {
		if (keyPairName == null) {
			throw new AwsOperationException("The keypair name must be provided for operation create KeyPair. Constraints: Accepts alphanumeric characters, spaces, dashes, and underscores.");
		}
		try {
            CreateKeyPairResult result = ec2Client.getClientInstance().createKeyPair(new CreateKeyPairRequest(keyPairName));
            return result.getKeyPair();
        } catch (AmazonServiceException ase) {
            LOGGER.error("Exception thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
            throw new AwsOperationException(ase);
        } catch (AmazonClientException ace) {
            LOGGER.error("Exception thrown from aws : " + ace.getMessage());
            throw new AwsOperationException(ace);
        }
	}
	
	/**
     * Import key pair to AWS.
     * @param ec2Client 
     * @param keyPairName
     * @param encodedPublicKey Base 64 encoded, DER
     * @throws AwsOperationException aws exception when importing a new key pair.
     */
    public static KeyPairInfo importKeyPair(AwsEC2Client ec2Client, final String keyPairName, final String encodedPublicKey) throws AwsOperationException {
        if (keyPairName == null) {
            throw new AwsOperationException("The keyPair name must be provided for operation import KeyPair.");
        }
        if (encodedPublicKey == null) {
            throw new AwsOperationException("The keyPair public key encoded base 64, DER must be provided for operation importKeyPair.");
        }
        try {
            ImportKeyPairResult result = ec2Client.getClientInstance().importKeyPair(new ImportKeyPairRequest(keyPairName, encodedPublicKey));
            KeyPairInfo keyPairInfo = new KeyPairInfo();
            keyPairInfo.setKeyName(result.getKeyName());
            keyPairInfo.setKeyFingerprint(result.getKeyFingerprint());
            return keyPairInfo;
        } catch (AmazonServiceException ase) {
            LOGGER.error("Exception thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
            throw new AwsOperationException(ase);
        } catch (AmazonClientException ace) {
            LOGGER.error("Exception thrown from aws : " + ace.getMessage());
            throw new AwsOperationException(ace);
        }
    }

    /**
     * Delete a key pair from AWS EC2 Service.
     * @param keyPairName
     * @throws KeyPairOperationException
     */
    public static void deleteKeyPair(AwsEC2Client ec2Client, final String keyPairName) throws AwsOperationException {
    		
        if (keyPairName == null) {
            throw new AwsOperationException("The keyPair name must be provided for operation delete KeyPair.");
        }
        try {
            ec2Client.getClientInstance().deleteKeyPair(new DeleteKeyPairRequest(keyPairName));
        } catch (AmazonServiceException ase) {
            LOGGER.error("Exception thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
            throw new AwsOperationException(ase);
        } catch (AmazonClientException ace) {
            LOGGER.error("Exception thrown from aws : " + ace.getMessage());
            throw new AwsOperationException(ace);
        } 

    }
	
}
