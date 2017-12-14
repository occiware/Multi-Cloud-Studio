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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl;
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
 * - term: uniqueschedulingpolicy
 * - title: 
 */
public class UniqueschedulingpolicyConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniqueschedulingpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(UniqueschedulingpolicyConnector.class);
	Timer timer = new Timer();
	
	// Start of user code Uniqueschedulingpolicyconnector_constructor
	/**
	 * Constructs a uniqueschedulingpolicy connector.
	 */
	UniqueschedulingpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Uniqueschedulingpolicy_Mixin_Start_action
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
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = dateFormatter.format(getUniqueschedulingpolicyStartDate());
		System.out.println(date);
		
		Date date1 = null;
		try {
			date1 = (Date) dateFormatter.parse(date);
			System.out.println(date1);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		//Entity  entity = getEntity();
		Entity  entity = getEntity();
		
		Resource res = (Resource) this.eContainer();
		ElasticitycontrollerImpl elasticity = (ElasticitycontrollerImpl) res;
		ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)elasticity;
		
		List<MixinBase> mixinsBase = ec.getParts();
		
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
							 for (MixinBase mixinB : mixinsBase) {
								 LOGGER.debug("Mixin found : " + mixinB.getMixin().getTerm() + " --> class: " + mixinB.getClass().getName());
								 if (mixinB instanceof ManualscalingpolicyConnector) {
										ManualscalingpolicyConnector man = (ManualscalingpolicyConnector) mixinB;
										man.start();
										break;
									}
									
									else if (mixinB instanceof Simpledynamicscalingpolicy) {
										SimpledynamicscalingpolicyConnector man = (SimpledynamicscalingpolicyConnector) mixinB;
										man.start();
										break;
									}
									
									else if (mixinB instanceof Stepdynamicscalingpolicy) {
										StepdynamicscalingpolicyConnector man = (StepdynamicscalingpolicyConnector) mixinB;
										man.start();
										break;
									}
									
									else if (mixinB instanceof Dynamicadjustmentscalingpolicy) {
										DynamicadjustmentscalingpolicyConnector man = (DynamicadjustmentscalingpolicyConnector) mixinB;
										man.start();
										break;
									}
							 }
								 
						}
        					
	        	});
        		}
        },date1); 
        
        ///////////////////////////////// stop the timer, using quartz  
        if ((this.getUniqueschedulingpolicyEndDate() != null)) {
        	JobDetail job2 = JobBuilder.newJob(Job2.class)
    				.withIdentity("dummyJobName", "group1").build();
        //	job2.getJobDataMap().put("key", entity);
            
            // Trigger the job 
            Trigger trigger = TriggerBuilder
    				.newTrigger()
    				.withIdentity("triggerkeyname", "group1")
    				.startAt(this.getUniqueschedulingpolicyEndDate())
    				//.withSchedule(simpleSchedule())
    				.build();
            
            org.quartz.Scheduler scheduler1;
    		try {
    			scheduler1 =  new StdSchedulerFactory().getScheduler();
    			scheduler1.getContext().put("key", mixinsBase);
    			scheduler1.getContext().put("key2", entity);
    			scheduler1.start();
    			scheduler1.scheduleJob(job2, trigger);
    		} catch (SchedulerException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();  

    		}
        }

	}
	// End of user code
	// Start of user code Uniqueschedulingpolicy_Mixin_Stop_action
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
		LOGGER.debug("Action stop() called on " + this);

		if(this.timer != null) {
			this.timer.cancel();
		}

		// TODO: Implement how to stop this uniqueschedulingpolicy.
	}
	// End of user code
		


}	
