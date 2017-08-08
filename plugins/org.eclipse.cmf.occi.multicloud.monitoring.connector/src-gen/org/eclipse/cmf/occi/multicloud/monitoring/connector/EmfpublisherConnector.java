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

import java.util.UUID;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.tinom.EMFTinomPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloudmonitoring.impl.EmfpublisherImpl;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/monitoring#
 * - term: emfpublisher
 * - title: 
 */
public class EmfpublisherConnector extends EmfpublisherImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(EmfpublisherConnector.class);

	private EMFTinomPublisher emfTinomPublisher = null;
	private String uuid = UUID.randomUUID().toString();
	
	// Start of user code Emfpublisherconnector_constructor
	/**
	 * Constructs a emfpublisher connector.
	 */
	EmfpublisherConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code
	
	// Start of user code Emfpublisherconnector_constructor
	public EMFTinomPublisher buildTinomPublisher() {
		LOGGER.info("Build sensor with publisher : EMFTinomPublisher");
		emfTinomPublisher = new EMFTinomPublisher("emf" + uuid, this);
		return emfTinomPublisher;
	}
	// End of user code
	
}	
