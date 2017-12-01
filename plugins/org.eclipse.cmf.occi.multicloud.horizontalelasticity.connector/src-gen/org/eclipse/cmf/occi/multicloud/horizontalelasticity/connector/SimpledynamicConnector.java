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
 * Generated at Wed Oct 18 15:58:47 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import java.util.ArrayList;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: simpledynamic
 * - title: 
 */
public class SimpledynamicConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl
{
	/**
	 * Initialize the logger.
	 */
	private static volatile boolean bool=true;
	private static Logger LOGGER = LoggerFactory.getLogger(SimpledynamicConnector.class);

	// Start of user code Simpledynamicconnector_constructor
	/**
	 * Constructs a simpledynamic connector.
	 */
	SimpledynamicConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code SimpledynamicocciCreate
	/**
	 * Called when this Simpledynamic instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		System.out.print("you are in simple dynamic");
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Simpledynamic_occiRetrieve_method
	/**
	 * Called when this Simpledynamic instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Simpledynamic_occiUpdate_method
	/**
	 * Called when this Simpledynamic instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code SimpledynamicocciDelete_method
	/**
	 * Called when this Simpledynamic instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Simpledynamic actions.
	//

	// Start of user code Simpledynamic_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalelasticcontroller/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);
		System.out.println("\n stop is called now");
		bool = false;
		// TODO: Implement how to stop this simpledynamic.
	}
	// End of user code
	// Start of user code Simpledynamic_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalelasticcontroller/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		bool = true;
		MyRunnable myRunnable = new MyRunnable() {
			public void run() {
				//////// main code //////
				while(bool) {
					startDynamic();
					System.out.println("Wait 20 second between loop to save CPU cycles");
					try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//////// end of run //////
			}
		};
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
	
	///////////////////////////dynamic start/////////
	public void startDynamic()
	{
		//Horizontalgroup hg = null;
		int removeRulesCount = 0;
		int removeRulesTrue = 0;
		ArrayList<Rule> actionList = new ArrayList<Rule>();
		int coolduration = this.getSimpleDynamicCoolDuration();
		for (Link link : this.getLinks()) {
			if (link instanceof Rule) {
				Rule myRule = (Rule) link;
				
				DynamicpolicyConnector dp = new DynamicpolicyConnector();
				String ruleMetric = myRule.getRuleMetric().getName();
				int ruleperiod = myRule.getRulePeriod();
				int consecutive = myRule.getRuleConsecutive();
				String ruleoperator = myRule.getRuleOperator().getName();
				float threshold = myRule.getRuleThreshold();	
				
				Actiontrigger action = (Actiontrigger)myRule.getTarget();
				String actionname = action.getAction().getName();
				String actiontype = action.getActionType().getName();
				Float amount = action.getAmount();
				double metrcUsage  =  getMetricUsage(ruleMetric, ruleperiod, consecutive);
				//double metrcUsage  = dp.getMetricUsage(ruleMetric, ruleperiod, consecutive);
				
				if (actionname.equals("add")) { // Rules that have add attributes in their actions
					if (testRule(metrcUsage, ruleoperator, threshold)) {
						action(actionname, actiontype, amount, coolduration);
					}
				}
				
				if (actionname.equals("remove")) { // Rules that have removes attributes in their actions
					removeRulesCount = removeRulesCount +1;
					if (testRule(metrcUsage, ruleoperator, threshold)) {
						removeRulesTrue = removeRulesTrue + 1;
						actionList.add(myRule);
						//System.out.println(myRule);
						//System.out.println(action);
						//action(actionname, actiontype, amount, coolduration);
					}
				}
				
			}
		}
		
		if (removeRulesCount == removeRulesTrue && (removeRulesCount !=0 )) {  //all the rules that have remove rules are true
			Rule myRule  = actionList.get(actionList.size() - 1);
			Actiontrigger action = (Actiontrigger)myRule.getTarget();
			String actionname = action.getAction().getName();
			String actiontype = action.getActionType().getName();
			Float amount = action.getAmount();
			action(actionname, actiontype, amount, coolduration);
		}		
	}
	/////////////////////// action /////////////
	public void action( String action, String actionType, float amount, int coolduration)
	{
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		//DynamicConnector dc = new DynamicConnector();
		Horizontalgroup hg =  getHorzontalgroup();
		int numberofinstances = 0;
		int currentInstance = hg.getHorizontalGroupGroupSize();
		final int newGroupSize;
		if (action.equals("add")) {
			System.out.println("You are going to add more resources");
			if(actionType.equals("instanceCount")) {
				System.out.println("You are going to add more resources according to " + actionType);
				numberofinstances = (int) amount;
				System.out.println(" nubmer of instances to ba added " + numberofinstances);
				System.out.println(" The group size will become  " + (numberofinstances + currentInstance));
				newGroupSize = numberofinstances + currentInstance;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(newGroupSize);
						//hg.occiUpdate();
					}});
				hg.occiUpdate();
				try {
					//Thread.sleep(300000);
					Thread.sleep(120000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
				
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to add more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				System.out.println("\n the number of inatances will be " + (currentInstance + numberofinstances));
				newGroupSize = currentInstance + numberofinstances;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(newGroupSize);
						hg.occiUpdate();
						
					}});
				//hg.setHorizontalGroupGroupSize(currentInstance + numberofinstances);
				
			}
			
		}
		
		else if(action.equals("remove")) {
			System.out.println("You are going to delete Resources");
			if(actionType.equals("instanceCount")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				numberofinstances = (int) amount;
				System.out.println("You are going to remove " + amount + " instance");
				System.out.println(" The group size will become  " + (currentInstance  - numberofinstances));
				//hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
				newGroupSize = currentInstance  - numberofinstances;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(newGroupSize);
						hg.occiUpdate();
					}});
				
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
				System.out.println("\n the number of instances or groupsize will be:" + (currentInstance - numberofinstances));
				newGroupSize = currentInstance - numberofinstances;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(newGroupSize);
						hg.occiUpdate();
					}});
				
			}
		}
		System.out.print("\n wait, cool duration");
		try {
			Thread.sleep(coolduration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//////////////////////////
	public Horizontalgroup getHorzontalgroup()
	{
		LOGGER.debug("Action start() called on " + this);
		Horizontalgroup hg = null;
		for (Link link : this.getLinks()) {
			if (link.getTarget() instanceof Horizontalgroup) { // && linkedGroup instanceof Horizontalgroup) {
				   hg = (Horizontalgroup) link.getTarget();
				   System.out.println(hg);
				}  
		}
		if (hg ==null) {
			System.out.println("Can't find the horizontalgroup");
		}
		return hg;
	}
	
	public boolean testRule ( double metricUtilization, String op, float threshold) {
		boolean testoutput = false;
		if (op.equals("GraterThan")){
			if  (metricUtilization > threshold){
				testoutput =  true;	
			}
		} else if (op.equals("GreaterThanorEqualto")){
			if  (metricUtilization >= threshold){
				testoutput =  true;
			}
		} else if (op.equals("LessThan")){
			if  (metricUtilization < threshold){
				testoutput =  true;
			}
		} else if (op.equals("LessThanorEqualto")){
			if  (metricUtilization <= threshold){
				testoutput =  true;
			}
		} else if (op.equals("Equalto")){
			if  (metricUtilization == threshold){
				testoutput =  true;
			}
		} else if (op.equals("NotEqualto")){
			if  (metricUtilization != threshold){
				testoutput =  true;
			}
		}			
		
	return testoutput;	
	}
	// End of user code
		
	/////////////////////////////////////// cpu usage ////////////////////////////////////
	protected double CPUGroupUsage() {
		double cpuGroupUsage = 0.0;
		int instanceCount = 0;
		double cputotal = 0.0;
		
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		Horizontalgroup hg = (Horizontalgroup) this.getLinks().get(0).getTarget();
		//ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		int noOfLinks = 0;
		for(Link link : hg.getLinks()) {
			noOfLinks++;
		}
		System.out.println("number of links" +  noOfLinks);
		
		for(int i =0; i< noOfLinks; ++i) {
			if(hg.getLinks().get(i).getTarget() instanceof Instancevmware) {
				//System.out.println(hg.getLinks().get(i));
				//System.out.println(hg.getLinks().get(i).getTarget().getTitle());
				Instancevmware inst = (Instancevmware) hg.getLinks().get(i).getTarget();
				if (!(inst.getAttributes().get(8).getValue().isEmpty())) {
					//System.out.println(inst);
					//System.out.println(hg.getLinks().get(i).getTarget().getTitle());
					String instanceIp = inst.getGuestIpv4Address();
					//String instanceIp = inst.getAttributes().get(8).getValue();
					System.out.println("trying to connect to zabbix");
					System.out.println("instance ip " + instanceIp);
					String zabi = zabbix_obj.connect();
					System.out.println("zabbi authentification " +  zabi);
					
					int hostid = zabbix_obj.get_host_by_ip(zabi, instanceIp);
					//String vmname = vm.getAttributes().get(1).getValue();
					//int hostid = zabbix_obj.getHostByName(zabi, vmname);
					Double cpuUsed = zabbix_obj.item_cpu_idle(zabi, hostid);
					//System.out.println("cpu used :" + cpuUsed);
					cputotal = cputotal + cpuUsed;
					instanceCount = instanceCount +1;
				}
			}
		}
		
		System.out.println("number of instances in the group " + instanceCount);
		if (instanceCount ==0) {
			System.out.println("no instances in the group");
		} else {
			cpuGroupUsage = cputotal/instanceCount;
		}
		System.out.println("cpu average usage for the group is " + cpuGroupUsage);
		return cpuGroupUsage;
	}
	
	
	public double getMetricUsage(String metricName, int period, int consecutive)
	{
		double metrcUsage = 0.0; // = 60.0;
		if (metricName.equals("CPUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
			metrcUsage = CPUGroupUsage();
		} 
		else if(metricName.equals("MemoryUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		else if(metricName.equals("AverageCpuUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		
		return metrcUsage;
		
	}
	
	
}	
