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


public class Job2 implements Job{ 
	//public static final String object = "value";
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
	      try {
			SchedulerContext schedulerContext = context.getScheduler().getContext();
			Entity entity = (Entity) schedulerContext.get("key");
			RecurringscheduleConnector rs = new RecurringscheduleConnector();
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
					
					if (entity instanceof Simpledynamic) {
						SimpledynamicConnector man = (SimpledynamicConnector) entity;
						man.stop();
					}
					
					else if (entity instanceof Stepdynamic) {
						StepdynamicConnector man = (StepdynamicConnector) entity;
						man.stop();
					}
					
					else if (entity instanceof Dynamicadjustment) {
						DynamicadjustmentConnector man = (DynamicadjustmentConnector) entity;
						man.stop();
					}
					
				}});
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}
		
}
