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
 * - term: elasticcontroller
 * - title: 
 */
public class ElasticcontrollerConnector extends org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticcontrollerImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ElasticcontrollerConnector.class);

	// Start of user code Elasticcontrollerconnector_constructor
	/**
	 * Constructs a elasticcontroller connector.
	 */
	ElasticcontrollerConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ElasticcontrollerocciCreate
	/**
	 * Called when this Elasticcontroller instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Elasticcontroller_occiRetrieve_method
	/**
	 * Called when this Elasticcontroller instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Elasticcontroller_occiUpdate_method
	/**
	 * Called when this Elasticcontroller instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ElasticcontrollerocciDelete_method
	/**
	 * Called when this Elasticcontroller instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Elasticcontroller actions.
	//
}	
