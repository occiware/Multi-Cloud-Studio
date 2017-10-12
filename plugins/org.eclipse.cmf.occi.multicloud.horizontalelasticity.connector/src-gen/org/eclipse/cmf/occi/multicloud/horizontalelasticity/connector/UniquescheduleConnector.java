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
 * Generated at Wed Oct 11 20:59:30 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.Scheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: uniqueschedule
 * - title: 
 */
public class UniquescheduleConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(UniquescheduleConnector.class);
	Timer timer = new Timer();
	// Start of user code Uniquescheduleconnector_constructor
	/**
	 * Constructs a uniqueschedule connector.
	 */
	UniquescheduleConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Uniqueschedule_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/uniqueschedule/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = dateFormatter.format(getUniqueScheduleStartDate());
		System.out.println(date);
		
		Date date1 = null;
		try {
			date1 = (Date) dateFormatter.parse(date);
			System.out.println(date1);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		this.timer = new Timer();
		timer.schedule(new Scheduler() {
				@Override
				public void run() {
					try {
						Entity  entity = getEntity();
						System.out.println("entity " + entity);
						if(entity instanceof ManualConnector) {
							ManualConnector man = (ManualConnector) entity;
							man.occiCreate();
						}
						//Resource r = eContainer;
						//HorizontalelasticcontrollerConnector res = (HorizontalelasticcontrollerConnector) this.eContainer();
						//res.start();
					} catch (Exception e) {
						e.getMessage();
					}	
				}
		}, date1);

		// TODO: Implement how to start this uniqueschedule.
	}
		// End of user code

	// Start of user code Uniqueschedule_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/uniqueschedule/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this uniqueschedule.
	}
		// End of user code

}	