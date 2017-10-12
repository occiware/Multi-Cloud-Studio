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

import org.eclipse.cmf.occi.core.Entity;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: recurringschedule
 * - title: 
 */
public class RecurringscheduleConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(RecurringscheduleConnector.class);

	// Start of user code Recurringscheduleconnector_constructor
	/**
	 * Constructs a recurringschedule connector.
	 */
	RecurringscheduleConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	
	}
	// End of user code
	// Start of user code Recurringschedule_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/recurringschedule/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		Entity entity = getEntity();
		JobDetail job1 = JobBuilder.newJob(Job1.class)
				.withIdentity("dummyJobName", "group1").build();
		//job1.getJobDataMap().put("key", entity); /// pass paramaters to job
		
		Trigger trigger = TriggerBuilder
				.newTrigger()
				.withIdentity("dummyTriggerName", "group1")
				.withSchedule(
					CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
				.build();

		    //schedule it
		Scheduler scheduler;
		try {
			scheduler = new StdSchedulerFactory().getScheduler();
		    scheduler.getContext().put("key", entity);

			scheduler.start();
			scheduler.scheduleJob(job1, trigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO: Implement how to start this recurringschedule.
	}
		// End of user code

	// Start of user code Recurringschedule_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/recurringschedule/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this recurringschedule.
	}

	
	public void executeEntity()
	{
		Entity entity = getEntity();
		if(entity instanceof ManualConnector) {
			ManualConnector man = (ManualConnector) entity;
			man.occiCreate();
		}	
	}
		// End of user code

}	
