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

import cloudmonitoring.impl.SensorcontrolImpl;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/multicloud/monitoring# - term: sensorcontrol -
 * title:
 */
public class SensorcontrolConnector extends SensorcontrolImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SensorcontrolConnector.class);

	// Start of user code Sensorcontrolconnector_constructor
	/**
	 * Constructs a sensorcontrol connector.
	 */
	SensorcontrolConnector() {
		LOGGER.debug("Constructor called on " + this);
		System.out.println("Constructor called on " + this);
	}

	// End of user code
	// Start of user code Sensorcontrol_Kind_startMonitoring_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/multicloud/monitoring/sensorcontrol/action# - term:
	 * startmonitoring - title: Start the monitoring system for this sensor
	 */
	@Override
	public void startmonitoring() {
		LOGGER.debug("Action startmonitoring() called on " + this);

		// TODO: Implement how to startmonitoring this sensorcontrol.
	}
	// End of user code

	// Start of user code Sensorcontrol_Kind_stopMonitoring_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/multicloud/monitoring/sensorcontrol/action# - term:
	 * stopmonitoring - title: Stop monitoring for this sensor
	 */
	@Override
	public void stopmonitoring() {
		LOGGER.debug("Action stopmonitoring() called on " + this);

		// TODO: Implement how to stopmonitoring this sensorcontrol.
	}
	// End of user code

}
