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
 * Generated at Wed Aug 23 15:21:16 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.elasticocci/model/elasticocci.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.elasticocci.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.cmf.occi.core.Resource;




/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
 * - term: elasticlink
 * - title: 
 */
public class ElasticlinkConnector extends org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticlinkImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ElasticlinkConnector.class);

	// Start of user code Elasticlinkconnector_constructor
	/**
	 * Constructs a elasticlink connector.
	 */
	ElasticlinkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ElasticlinkocciCreate
	/**
	 * Called when this Elasticlink instance is completely created.
	 */
	///////////////////////////////////////////////
	String controllerName;
	public void retrieveResourceTarget() {
		Resource sourceConroller = getSource();
		Resource targetCompute = getTarget();
		
		if (sourceConroller != null && sourceConroller instanceof ElasticcontrollerConnector) {
			controllerName = sourceConroller.getTitle();
		}
		
	}
	///////////////////////////////////////////
	
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Elasticlink_occiRetrieve_method
	/**
	 * Called when this Elasticlink instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Elasticlink_occiUpdate_method
	/**
	 * Called when this Elasticlink instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ElasticlinkocciDelete_method
	/**
	 * Called when this Elasticlink instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Elasticlink actions.
	//
}	
