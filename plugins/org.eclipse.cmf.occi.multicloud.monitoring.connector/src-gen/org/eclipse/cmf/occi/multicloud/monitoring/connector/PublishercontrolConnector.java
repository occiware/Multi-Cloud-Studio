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
 * Generated at Mon Aug 07 10:24:06 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.monitoring/model/cloudmonitoring.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.monitoring.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloudmonitoring.impl.PublishercontrolImpl;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/monitoring#
 * - term: publishercontrol
 * - title: 
 */
public class PublishercontrolConnector extends PublishercontrolImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(PublishercontrolConnector.class);

	// Start of user code Publishercontrolconnector_constructor
	/**
	 * Constructs a publishercontrol connector.
	 */
	PublishercontrolConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Publishercontrol_Kind_enable_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/monitoring/publishercontrol/action#
     * - term: enable
     * - title: Enable the p
	 */
	@Override
	public void enable()
	{
		LOGGER.debug("Action enable() called on " + this);

		// TODO: Implement how to enable this publishercontrol.
	}
		// End of user code

	// Start of user code Publishercontrol_Kind_disable_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/monitoring/publishercontrol/action#
     * - term: disable
     * - title: 
	 */
	@Override
	public void disable()
	{
		LOGGER.debug("Action disable() called on " + this);

		// TODO: Implement how to disable this publishercontrol.
	}
		// End of user code

}	
