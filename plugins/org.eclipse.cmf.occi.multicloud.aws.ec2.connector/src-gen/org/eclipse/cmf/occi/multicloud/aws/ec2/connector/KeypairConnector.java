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

import java.util.List;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.driver.KeyPairHelper;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsAccountModelException;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.amazonaws.services.ec2.model.KeyPair;
import com.amazonaws.services.ec2.model.KeyPairInfo;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/aws# - term: keypair - title:
 */
public class KeypairConnector extends org.eclipse.cmf.occi.multicloud.aws.ec2.impl.KeypairImpl {

	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(KeypairConnector.class);
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	// Start of user code Keypairconnector_constructor
	/**
	 * Constructs a keypair connector.
	 */
	KeypairConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code KeypairocciCreate
	/**
	 * Called when this Keypair instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		// Check if this keyPair already exist on this region.
		try {
			AwsEC2Client ec2Client = getClientInstance();

			if (ec2Client != null) {

				if (checkIfKeyPairExist(ec2Client)) {
					LOGGER.warn("Cant create the keypair as it already exist");
					return;
				}
				createKeyPair(ec2Client);

			} else {
				LOGGER.warn("ec2 client is not ready, the keypair " + this.getName()
						+ " resource may be not connected to an aws instance, please check your configuration.");
			}
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}

	}
	// End of user code

	// Start of user code Keypair_occiRetrieve_method
	/**
	 * Called when this Keypair instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		try {
			AwsEC2Client ec2Client = getClientInstance();
			if (ec2Client != null) {
				// Check if keypair exist.
				if (checkIfKeyPairExist(ec2Client)) {
					// Retrieve infos.
					KeyPairInfo keyPairInfo = KeyPairHelper.describeKeyPair(ec2Client, this.getName());
					if (keyPairInfo != null) {
						this.setFingerPrint(keyPairInfo.getKeyFingerprint());
						this.setPrivateKey(null); // For security reason, remove values from this attribute.
					} else {
						LOGGER.warn("keypair doesnt exist on your aws account and region.");
					}

				} else {
					LOGGER.warn("keypair : " + this.getName() + " doesnt exist on your aws account and region.");
				}

			}
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}

	}
	// End of user code

	// Start of user code Keypair_occiUpdate_method
	/**
	 * Called when this Keypair instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code KeypairocciDelete_method
	/**
	 * Called when this Keypair instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		LOGGER.info("Remove keypair: " + getName() + " from provider.");
		try {
			AwsEC2Client ec2Client = getClientInstance();
			if (ec2Client != null) {
				if (!checkIfKeyPairExist(ec2Client)) {
					LOGGER.warn("keypair : " + this.getName() + " doesnt exist anymore");
					return;
				}

				KeyPairHelper.deleteKeyPair(ec2Client, this.getName());

			}
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}

	}
	// End of user code

	//
	// Keypair actions.
	//
	/**
	 * Import a new keypair.
	 */
	@Override
	public void importkeypair() {
		try {
			AwsEC2Client ec2Client = getClientInstance();
			if (ec2Client != null) {
				if (checkIfKeyPairExist(ec2Client)) {
					LOGGER.warn("Cant create the keypair as it already exist");
					return;
				}
				if (this.getName() == null || this.getName().trim().isEmpty()) {
					throw new RuntimeException("The keypair name must be provided for action importkeypair()");
				}

				if (this.getEncodedPublicKey() == null || this.getEncodedPublicKey().trim().isEmpty()) {
					throw new RuntimeException(
							"The keypair encodedPublicKey must be provided for action importkeypair()");
				}

				KeyPairInfo keyPairInfo = KeyPairHelper.importKeyPair(ec2Client, this.getName(),
						this.getEncodedPublicKey());
				this.setFingerPrint(keyPairInfo.getKeyFingerprint());
				this.setPrivateKey(null);

				// TODO : check and Update key reference for the linked instance.

			}
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	// Start of user code getClientInstance
	/**
	 * @throws AwsAccountModelException
	 * 
	 */
	public AwsEC2Client getClientInstance() throws AwsAccountModelException {
		return ModelUtils.getClientInstance(this);
	}
	// End of user code

	// Start of user code checkIfKeyPairExist
	/**
	 * Check if this keypair exist on account.
	 * 
	 * @param ec2Client
	 *            the aws sdk client.
	 * @return true if it exist, false elsewhere.
	 */
	public boolean checkIfKeyPairExist(AwsEC2Client ec2Client) {
		// A keyPair is applied on a resource compute typically.
		try {
			return KeyPairHelper.isExistKey(ec2Client, this.getName());
		} catch (AwsOperationException ex) {
			throw new RuntimeException("Cannot retrieve keypair, error on aws : " + ex.getCause().getMessage());
		}
	}
	// End of user code

	// Start of user code createKeyPair
	/**
	 * Create a new keypair.
	 * 
	 * @param ec2Client
	 */
	public void createKeyPair(AwsEC2Client ec2Client) {
		try {
			KeyPair keyPair = KeyPairHelper.createKeyPair(ec2Client, this.getName());
			this.setFingerPrint(keyPair.getKeyFingerprint());
			this.setPrivateKey(keyPair.getKeyMaterial());

		} catch (AwsOperationException ex) {
			throw new RuntimeException(
					"Cant create the keyPair : " + this.getName() + " error :" + ex.getCause().getMessage());
		}
	}
	// End of user code

}
