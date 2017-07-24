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
 * Generated at Wed Jul 19 15:09:17 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.vmware/model/vmware.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.vmware.connector;

import org.eclipse.core.runtime.IProgressMonitor;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.UserDataHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/infrastructure/vmware#
 * - term: ssh_user_data
 * - title: 
 */
public class Ssh_user_dataConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.Ssh_user_dataImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Ssh_user_dataConnector.class);

	// Start of user code Ssh_user_dataconnector_constructor
	/**
	 * Constructs a ssh_user_data connector.
	 */
	Ssh_user_dataConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code

	/**
	 * Apply user data with thread management.
	 * @param instanceId
	 * @param vmName
	 * @param monitor
	 */
	public void applyUserData(final String instanceId, final String vmName, IProgressMonitor monitor) {
		
		if (occiComputeUserdata != null && !occiComputeUserdata.trim().isEmpty()) {
			LOGGER.info("applying user datas, to file : " + occiComputeUserdataFile + " in vm : " + vmName + " with content : "
					+ occiComputeUserdata);
			UserDataHelper userDataHelper = new UserDataHelper(instanceId, vmName, occiComputeUserdata, user,
					password, getOcciComputeUserdataFile());
			try {
				if (monitor != null) {
					// Run directly the operation within this eclipse thread.
					userDataHelper.run(monitor);
				} else {
					// Create a new thread with simple runnable.
					Thread thread = new Thread(userDataHelper);
					thread.start();
				}

			} catch (Exception ex) {
				ex.printStackTrace();
				LOGGER.error("Exception thrown : " + ex.getClass().getName());
				LOGGER.error("Message: " + ex.getMessage());
			}
		}
		
		
	}
	
	
	
	
}	
