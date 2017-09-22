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
 * Generated at Thu Sep 21 17:11:14 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: manual
 * - title: 
 */
public class ManualConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ManualConnector.class);

	// Start of user code Manualconnector_constructor
	/**
	 * Constructs a manual connector.
	 */
	ManualConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ManualocciCreate
	/**
	 * Called when this Manual instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Manual_occiRetrieve_method
	/**
	 * Called when this Manual instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Manual_occiUpdate_method
	/**
	 * Called when this Manual instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ManualocciDelete_method
	/**
	 * Called when this Manual instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Manual actions.
	//
	// Start of user code Manual_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/manual/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// TODO: Implement how to start this manual.
	}
		// End of user code

}	
