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
 * Generated at Fri Aug 18 18:41:53 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.elasticocci/model/elasticocci.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.elasticocci.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
 * - term: strategycpu
 * - title: 
 */
public class StrategycpuConnector extends org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StrategycpuConnector.class);

	// Start of user code Strategycpuconnector_constructor
	/**
	 * Constructs a strategycpu connector.
	 */
	StrategycpuConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Strategycpu_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/elasticocci/strategycpu/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// TODO: Implement how to start this strategycpu.
	}
		// End of user code

	// Start of user code Strategycpu_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/elasticocci/strategycpu/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this strategycpu.
	}
		// End of user code

}	
