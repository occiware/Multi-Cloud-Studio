package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;
//package horizontalElasticity;


import java.util.Date;
import java.util.List;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
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
			List<MixinBase> mixinsBase =  (List<MixinBase>) schedulerContext.get("key");
			Entity entity = (Entity) schedulerContext.get("key2");
			int interval = (int) schedulerContext.get("key3"); 
			ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)entity;
			RecurringschedulingpolicyConnector rs = new RecurringschedulingpolicyConnector();
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ec);
			System.out.println("domain     " + domain);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				public void doExecute() {
					for (MixinBase mixinB : mixinsBase) {
						if(mixinB instanceof ManualscalingpolicyConnector) {
							ManualscalingpolicyConnector man = (ManualscalingpolicyConnector) mixinB;
							man.start();
							//man.occiCreate();
						}
						
						else if (mixinB instanceof Simpledynamicscalingpolicy) {
							Simpledynamicscalingpolicy man = (Simpledynamicscalingpolicy) mixinB;
							man.start();
							//// interval to wait before stopping
							try {
								Thread.sleep(interval);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							man.stop();
						}
						
						else if (mixinB instanceof Stepdynamicscalingpolicy) {
							Stepdynamicscalingpolicy man = (Stepdynamicscalingpolicy) mixinB;
							man.start();
						}
						
						else if (mixinB instanceof Dynamicadjustmentscalingpolicy) {
							Dynamicadjustmentscalingpolicy man = (Dynamicadjustmentscalingpolicy) mixinB;
							man.start();
							//// interval to wait before stopping
							try {
								Thread.sleep(interval);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							man.stop();
						}
						
					}
				}});
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}
		
}
