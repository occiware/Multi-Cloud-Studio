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
 * Generated at Fri Jan 12 17:15:05 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.accounts/model/accounts.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.accounts.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/infrastructure/security#
 * - term: keypaircredential
 * - title: 
 */
public class KeypaircredentialConnector extends org.eclipse.cmf.occi.multicloud.accounts.impl.KeypaircredentialImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(KeypaircredentialConnector.class);

	// Start of user code Keypaircredentialconnector_constructor
	/**
	 * Constructs a keypaircredential connector.
	 */
	KeypaircredentialConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Keypaircredential_Mixin_generate_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/infrastructure/security/keypaircredential/action#
     * - term: generate
     * - title: 
	 */
	@Override
	public void generate()
	{
		LOGGER.debug("Action generate() called on " + this);

		// TODO: Implement how to generate this keypaircredential.
	}
	// End of user code
		


}	
