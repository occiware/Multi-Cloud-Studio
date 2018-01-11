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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/aws# - term: awsaccount - title:
 */
public class AwsaccountConnector extends org.eclipse.cmf.occi.multicloud.aws.ec2.impl.AwsaccountImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(AwsaccountConnector.class);

	// TODO : manage client via resource AwsAccount.
	private AwsEC2Client ec2Client = new AwsEC2Client(null, null, this.getRegionId());

	// Start of user code Awsaccountconnector_constructor
	/**
	 * Constructs a awsaccount connector.
	 */
	AwsaccountConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code AwsaccountocciCreate
	/**
	 * Called when this Awsaccount instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Awsaccount_occiRetrieve_method
	/**
	 * Called when this Awsaccount instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Awsaccount_occiUpdate_method
	/**
	 * Called when this Awsaccount instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code AwsaccountocciDelete_method
	/**
	 * Called when this Awsaccount instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	public AwsEC2Client getEc2Client() {
		if (ec2Client == null) {
			ec2Client = new AwsEC2Client(null, null, this.getRegionId());
		}
		return ec2Client;
	}

	//
	// Awsaccount actions.
	//

	
	
	
}
