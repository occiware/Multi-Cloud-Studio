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

import org.eclipse.cmf.occi.core.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
///////Quartz//////////
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;



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
	Scheduler scheduler;
	//TriggerKey triggerKey;
	Trigger trigger;
	
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


	// Start of user code Recurringschedule_Mixin_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/scheduler/action#
     * - term: start
     * - title: 
	 */


	// End of user code
	// Start of user code Recurringschedule_Mixin_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/scheduler/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void start()
	{
		Entity entity = getEntity();
		JobDetail job1 = JobBuilder.newJob(Job1.class)
				.withIdentity("dummyJobName", "group1").build();
		//job1.getJobDataMap().put("key", entity); /// pass paramaters to job
		
		//Trigger trigger = TriggerBuilder
		this.trigger = TriggerBuilder
				.newTrigger()
				.withIdentity("triggerkeyname", "group1")
				.startAt(this.getRecurringscheduleStartDate())
				.withSchedule(CronScheduleBuilder.cronSchedule("0 0/4 * * * ?"))
				.build();
			//.endAt(enddate)
		    //schedule it
		//Scheduler scheduler;
		try {
			this.scheduler = new StdSchedulerFactory().getScheduler();
			this.scheduler.getContext().put("key", entity);
			this.scheduler.start();
			this.scheduler.scheduleJob(job1, this.trigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void stop()
	{
		////// just test of record //////////////
		//RecurrenceStep arr {second,{20,24}, minutes,{55}, hour,{15}, domonth,{30}, month,{12}, doweek,{1}, year,{2007}}
		////EList<RecurrenceStep> xy = (EList<RecurrenceStep>) getRecurringscheduleRecurrence();
		//ArrofRecStep xy =  getRecurringscheduleRecurrence();
		////for(RecurrenceStep element: xy) {
			////System.out.println(element);
		////}
		
		LOGGER.debug("Action stop() called on " + this);
		//this.scheduler.unscheduleJob("dummyTriggerName", "group1");
		try {
			this.scheduler.unscheduleJob(this.trigger.getKey());
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// End of user code
		


}	
