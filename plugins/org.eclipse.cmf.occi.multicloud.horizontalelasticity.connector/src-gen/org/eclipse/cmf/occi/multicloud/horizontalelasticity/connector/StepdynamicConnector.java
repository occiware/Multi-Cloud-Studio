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
 * Generated at Tue Oct 17 14:17:54 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: stepdynamic
 * - title: 
 */
public class StepdynamicConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StepdynamicConnector.class);

	// Start of user code Stepdynamicconnector_constructor
	/**
	 * Constructs a stepdynamic connector.
	 */
	StepdynamicConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code StepdynamicocciCreate
	/**
	 * Called when this Stepdynamic instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Stepdynamic_occiRetrieve_method
	/**
	 * Called when this Stepdynamic instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Stepdynamic_occiUpdate_method
	/**
	 * Called when this Stepdynamic instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code StepdynamicocciDelete_method
	/**
	 * Called when this Stepdynamic instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Stepdynamic actions.
	//

	// Start of user code Stepdynamic_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalelasticcontroller/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this stepdynamic.
	}
	// End of user code
	// Start of user code Stepdynamic_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalelasticcontroller/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		Link rule = null;
		for (Link link : this.getLinks()) {
			   rule = link;
			   }
			if ((rule != null) && (rule instanceof Rule)) {
				System.out.println(rule);
				String ruleID = rule.getAttributes().get(0).getValue();
				String ruletitle = rule.getAttributes().get(1).getName();

				System.out.println(rule);
			} else {
				System.out.println("there is not or rule");
			}
		// TODO: Implement how to start this stepdynamic.
	}
	// End of user code
		


}	
