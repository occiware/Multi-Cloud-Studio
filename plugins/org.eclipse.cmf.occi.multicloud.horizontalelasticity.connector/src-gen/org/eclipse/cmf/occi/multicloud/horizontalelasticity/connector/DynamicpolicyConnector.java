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
 * Generated at Mon Dec 04 11:58:56 CET 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: dynamicpolicy
 * - title: 
 */
public class DynamicpolicyConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(DynamicpolicyConnector.class);

	// Start of user code Dynamicpolicyconnector_constructor
	/**
	 * Constructs a dynamicpolicy connector.
	 */
	DynamicpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code DynamicpolicyocciCreate
	/**
	 * Called when this Dynamicpolicy instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Dynamicpolicy_occiRetrieve_method
	/**
	 * Called when this Dynamicpolicy instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Dynamicpolicy_occiUpdate_method
	/**
	 * Called when this Dynamicpolicy instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code DynamicpolicyocciDelete_method
	/**
	 * Called when this Dynamicpolicy instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Dynamicpolicy actions.
	//

	// Start of user code Dynamicpolicy_Kind_stop_action
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

		// TODO: Implement how to stop this dynamicpolicy.
	}
	// End of user code
	// Start of user code Dynamicpolicy_Kind_start_action
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
		//** action("add", "instanceCount", 1);
		//System.out.println("the hg is " + hg);
		// TODO: Implement how to start this dynamicpolicy.
	}
	// End of user code
	
	public double getMetricUsage(String metricName, int period, int consecutive)
	{
		double metrcUsage = 70.0;
		if (metricName.equals("CPUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		} 
		else if(metricName.equals("MemoryUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		else if(metricName.equals("AverageCpuUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		
		return metrcUsage;
		
	}
		


}	
