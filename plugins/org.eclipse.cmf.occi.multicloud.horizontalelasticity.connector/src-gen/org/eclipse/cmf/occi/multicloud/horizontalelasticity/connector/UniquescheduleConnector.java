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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
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


	// Start of user code Uniqueschedule_Mixin_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/scheduler/action#
     * - term: start
     * - title: 
	 */
	// Start of user code Uniqueschedule_Mixin_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/scheduler/action#
     * - term: stop
     * - title: 
	 */

	// End of user code
	// Start of user code Uniqueschedule_Mixin_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/scheduler/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action stop() called on " + this);
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
		
///		this.timer = new Timer();
///		timer.schedule(new Scheduler() {
///				@Override
///				public void run() {
///					try {
///						Entity  entity = getEntity();
///						System.out.println("entity " + entity);
///						if(entity instanceof ManualConnector) {
///							ManualConnector man = (ManualConnector) entity;
///							man.start();
///						}
///							
///					} catch (Exception e) {
///						e.getMessage();
///					}	
///				}
///		}, date1);
		// TODO: Implement how to stop this uniqueschedule.
		
		final Entity  entity = getEntity();
        final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
        System.out.println("the domain " + domain);
       // Timer timer = new Timer(true);
        this.timer = new Timer(true);
        timer.schedule(new Scheduler() {
        		@Override
            public void run() {
        			domain.getCommandStack().execute(new RecordingCommand(domain) {

						@Override
						protected void doExecute() {
							if (entity instanceof ManualConnector) {
								ManualConnector man = (ManualConnector) entity;
								man.start();
							}
							
							else if (entity instanceof Simpledynamic) {
								SimpledynamicConnector man = (SimpledynamicConnector) entity;
								man.start();
							}
							
							else if (entity instanceof Stepdynamic) {
								StepdynamicConnector man = (StepdynamicConnector) entity;
								man.start();
							}
							
							else if (entity instanceof Dynamicadjustment) {
								DynamicadjustmentConnector man = (DynamicadjustmentConnector) entity;
								man.start();
							}
						}
        					
	        	});
        		}
        },date1); 
        
        
        ///////////////////////////////// stop the timer, using quartz  
        if ((this.getUniqueScheduleEndDate() != null)) {
        	JobDetail job2 = JobBuilder.newJob(Job2.class)
    				.withIdentity("dummyJobName", "group1").build();
            
            // Trigger the job 
            Trigger trigger = TriggerBuilder
    				.newTrigger()
    				.withIdentity("triggerkeyname", "group1")
    				.startAt(this.getUniqueScheduleEndDate())
    				//.withSchedule(simpleSchedule())
    				.build();
            
            org.quartz.Scheduler scheduler1;
    		try {
    			scheduler1 =  new StdSchedulerFactory().getScheduler();
    			scheduler1.getContext().put("key", entity);
    			scheduler1.start();
    			scheduler1.scheduleJob(job2, trigger);
    		} catch (SchedulerException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();  

    		}
        }
        	
    }


		
	@Override
	
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		if(this.timer != null) {
			this.timer.cancel();
		}
	}
	// End of user code
		


}	
