package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;
//package horizontalElasticity;


import java.util.Date;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamicscalingpolicy;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
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
			RecurringschedulingpolicyConnector rs = new RecurringschedulingpolicyConnector();
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(entity);
			System.out.println("domain     " + domain);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				public void doExecute() {
					if(entity instanceof ManualscalingpolicyConnector) {
						ManualscalingpolicyConnector man = (ManualscalingpolicyConnector) entity;
						man.start();
						//man.occiCreate();
					}
					
					else if (entity instanceof Simpledynamicscalingpolicy) {
						Simpledynamicscalingpolicy man = (Simpledynamicscalingpolicy) entity;
						man.start();
						//// interval to wait before stopping
						try {
							Thread.sleep(120000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						man.stop();
					}
					
					else if (entity instanceof Stepdynamicscalingpolicy) {
						Stepdynamicscalingpolicy man = (Stepdynamicscalingpolicy) entity;
						man.start();
					}
					
					else if (entity instanceof Dynamicadjustmentscalingpolicy) {
						Dynamicadjustmentscalingpolicy man = (Dynamicadjustmentscalingpolicy) entity;
						man.start();
						//// interval to wait before stopping
						try {
							Thread.sleep(120000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						man.stop();
					}
					
				}});
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}
		
}
