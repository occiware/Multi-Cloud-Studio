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

import org.occiware.tinom.model.Metric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloudmonitoring.impl.DiskioImpl;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/monitoring#
 * - term: diskio
 * - title: 
 */
public class DiskioConnector extends DiskioImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(DiskioConnector.class);

	private Metric diskIoTinomMetric;
	
	// Start of user code Diskioconnector_constructor
	/**
	 * Constructs a diskio connector.
	 */
	DiskioConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code

	public Metric getDiskIoTinomMetric() {
		return diskIoTinomMetric;
	}

	public void setDiskIoTinomMetric(Metric diskIoTinomMetric) {
		this.diskIoTinomMetric = diskIoTinomMetric;
	}
	
}	
