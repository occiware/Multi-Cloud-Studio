package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;
//package horizontalElasticity;


import java.util.Date;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector.RecurringscheduleConnector;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic;
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
	@Override
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
			RecurringscheduleConnector rs = new RecurringscheduleConnector();
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(entity);
			System.out.println("domain     " + domain);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				public void doExecute() {
					if(entity instanceof ManualConnector) {
						ManualConnector man = (ManualConnector) entity;
						//man.start();
						man.occiCreate();
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
					
				}});
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}
		
}
