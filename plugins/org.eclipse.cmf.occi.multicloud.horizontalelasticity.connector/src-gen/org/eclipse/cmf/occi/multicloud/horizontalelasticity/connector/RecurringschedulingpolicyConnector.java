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
 * Generated at Mon Dec 11 12:24:18 CET 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl;
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
 * - term: recurringschedulingpolicy
 * - title: 
 */
public class RecurringschedulingpolicyConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(RecurringschedulingpolicyConnector.class);
	Scheduler scheduler;
	//TriggerKey triggerKey;
	Trigger trigger;

	// Start of user code Recurringschedulingpolicyconnector_constructor
	/**
	 * Constructs a recurringschedulingpolicy connector.
	 */
	RecurringschedulingpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Recurringschedulingpolicy_Mixin_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/scheduler/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		Entity entity = getEntity();
		Resource res = (Resource) this.eContainer();
		ElasticitycontrollerImpl elasticity = (ElasticitycontrollerImpl) res;
		ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)elasticity;
		List<MixinBase> mixinsBase = ec.getParts();
		
		JobDetail job1 = JobBuilder.newJob(Job1.class)
				.withIdentity("dummyJobName", "group1").build();
		//job1.getJobDataMap().put("key", entity); /// pass paramaters to job
		
		//Trigger trigger = TriggerBuilder
		this.trigger = TriggerBuilder
				.newTrigger()
				.withIdentity("triggerkeyname", "group1")
				.startAt(this.getRecurringschedulingpolicyStartDate())
				.withSchedule(CronScheduleBuilder.cronSchedule("0 0/4 * * * ?"))
				.build();
			//.endAt(enddate)
		    //schedule it
		//Scheduler scheduler;
		try {
			this.scheduler = new StdSchedulerFactory().getScheduler();
			this.scheduler.getContext().put("key", mixinsBase);
			this.scheduler.getContext().put("key2", entity);
			this.scheduler.getContext().put("key3", this.getRecurringschedulingpolicyInterval());
			this.scheduler.start();
			this.scheduler.scheduleJob(job1, this.trigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// End of user code
	// Start of user code Recurringschedulingpolicy_Mixin_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/scheduler/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);
		try {
			this.scheduler.unscheduleJob(this.trigger.getKey());
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// End of user code
		


}	
