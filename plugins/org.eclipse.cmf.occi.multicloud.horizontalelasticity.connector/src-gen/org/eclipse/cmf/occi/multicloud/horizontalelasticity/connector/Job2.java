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


public class Job2 implements Job{ 
	//public static final String object = "value";
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
	      try {
			SchedulerContext schedulerContext = context.getScheduler().getContext();
			//Entity entity = (Entity) schedulerContext.get("key");
			List<MixinBase> mixinsBase =  (List<MixinBase>) schedulerContext.get("key");
			Entity entity = (Entity) schedulerContext.get("key2");
			RecurringschedulingpolicyConnector rs = new RecurringschedulingpolicyConnector();
			
			///////////////////////////////////////////////////////////////////////////////
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(entity);
			System.out.println("domain     " + domain);
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				public void doExecute() {
					//if(entity instanceof ManualConnector) {
					//	ManualConnector man = (ManualConnector) entity;
					//	man.start();
					//	//man.occiCreate();
					//}
					for (MixinBase mixinB : mixinsBase) {
						 if (mixinB instanceof ManualscalingpolicyConnector) {
								ManualscalingpolicyConnector man = (ManualscalingpolicyConnector) mixinB;
								man.start();
							}
							
							else if (mixinB instanceof Simpledynamicscalingpolicy) {
								SimpledynamicscalingpolicyConnector man = (SimpledynamicscalingpolicyConnector) mixinB;
								man.start();
							}
							
							else if (mixinB instanceof Stepdynamicscalingpolicy) {
								StepdynamicscalingpolicyConnector man = (StepdynamicscalingpolicyConnector) mixinB;
								man.start();
							}
							
							else if (mixinB instanceof Dynamicadjustmentscalingpolicy) {
								DynamicadjustmentscalingpolicyConnector man = (DynamicadjustmentscalingpolicyConnector) mixinB;
								man.start();
							}
					 }
					
					//if (entity instanceof Simpledynamicscalingpolicy) {
					//	SimpledynamicscalingpolicyConnector man = (SimpledynamicscalingpolicyConnector) entity;
					//	man.stop();
					//}
					//
					//else if (entity instanceof Stepdynamicscalingpolicy) {
					//	StepdynamicscalingpolicyConnector man = (StepdynamicscalingpolicyConnector) entity;
					//	man.stop();
					//}
					
					//else if (entity instanceof Dynamicadjustmentscalingpolicy) {
					//	DynamicadjustmentscalingpolicyConnector man = (DynamicadjustmentscalingpolicyConnector) entity;
					//	man.stop();
					//}
					
				}});
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}
		
}
