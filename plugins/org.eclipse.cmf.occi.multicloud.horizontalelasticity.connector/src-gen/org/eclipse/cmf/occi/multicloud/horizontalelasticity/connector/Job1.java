package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;
//package horizontalElasticity;


import java.util.Date;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector.RecurringscheduleConnector;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector.ManualConnector;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.quartz.PersistJobDataAfterExecution;


public class Job1 implements Job{ 
	//public static final String object = "value";
	//@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		//Entity  entity1 = null;
			//Entity entity = null;
			//SchedulerContext schedulerContext = arg0.getScheduler().getContext();
			//String objectFromContext = (String) schedulerContext.get("myContextVar");
			//Entity  entity = (Entity) schedulerContext.get("entity");
			//JobDataMap dataMap = context.getJobDetail().getJobDataMap();
			//Entity entity = (Entity) dataMap.get(entity1);
			//System.out.println("entity " +  entity);
			//if(entity instanceof ManualConnector) {
			//	ManualConnector man = (ManualConnector) entity;
			//	man.occiCreate();}
			//RecurringscheduleConnector rs = new RecurringscheduleConnector();
			//rs.executeEntity();
			//System.out.println("Job1 --->>> Hello geeks! Time is " + new Date());
			//Resource r = eContainer;
			//HorizontalelasticcontrollerConnector res = (HorizontalelasticcontrollerConnector) this.eContainer();
			//res.start();
	      try {
			SchedulerContext schedulerContext = context.getScheduler().getContext();
			Entity entity = (Entity) schedulerContext.get("key");
			//System.out.println("entity " + entity);
			if(entity instanceof ManualConnector) {
				ManualConnector man = (ManualConnector) entity;
				man.occiCreate();
			}
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
	
}
