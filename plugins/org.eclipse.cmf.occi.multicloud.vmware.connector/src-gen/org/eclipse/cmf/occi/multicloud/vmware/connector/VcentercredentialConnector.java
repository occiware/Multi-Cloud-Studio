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
 * Generated at Mon Dec 18 14:05:14 CET 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.vmware/model/vmware.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.vmware.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/vmware# - term: vcentercredential -
 * title:
 */
public class VcentercredentialConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.VcentercredentialImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(VcentercredentialConnector.class);

	// Start of user code Vcentercredentialconnector_constructor
	/**
	 * Constructs a vcentercredential connector.
	 */
	VcentercredentialConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code

	// Start of user code Vcentercredential_Mixin_updatepassword_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/infrastructure/security/basiccredential/action# -
	 * term: updatepassword - title:
	 */
	@Override
	public void updatepassword() {
		LOGGER.debug("Action updatepassword() called on " + this);

		// TODO: Implement how to updatepassword this vcentercredential.
	}
	// End of user code

}
