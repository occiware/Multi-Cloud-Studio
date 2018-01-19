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

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: elasticitycontroller
 * - title: 
 */
public class ElasticitycontrollerConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ElasticitycontrollerConnector.class);

	// Start of user code Elasticitycontrollerconnector_constructor
	/**
	 * Constructs a elasticitycontroller connector.
	 */
	ElasticitycontrollerConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ElasticitycontrollerocciCreate
	/**
	 * Called when this Elasticitycontroller instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Elasticitycontroller_occiRetrieve_method
	/**
	 * Called when this Elasticitycontroller instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Elasticitycontroller_occiUpdate_method
	/**
	 * Called when this Elasticitycontroller instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ElasticitycontrollerocciDelete_method
	/**
	 * Called when this Elasticitycontroller instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Elasticitycontroller actions.
	//
//////////////////////// horizontal ////////////////////////////////////////
	
	protected double getMetricUsage(String metricName, int period, int consecutive)
	{
		double metrcUsage = 0.0; // = 60.0;
		if (metricName.equals("cpuutilisationconnector")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
			metrcUsage = CPUGroupUsage();
		} 
		else if(metricName.equals("memoryutilisationconnector")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		else if(metricName.equals("AverageCpuUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		
		return metrcUsage;	
	}
	
	protected double CPUGroupUsage() {
		double cpuGroupUsage = 0.0;
		int instanceCount = 0;
		double cputotal = 0.0;
		
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		//Horizontalgroup hg = (Horizontalgroup) this.getLinks().get(0).getTarget();
		Horizontalgroup hg = this.getHorzontalgroup();
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

	protected Horizontalgroup getHorzontalgroup()
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

	protected boolean testRule ( double metricUtilization, String op, float threshold) {
		boolean testoutput = false;
		if (op.equals("GraterThan")){
			if  (metricUtilization > threshold){
				testoutput =  true;	
			}
		} else if (op.equals("GreaterThanOrEqualTo")){
			if  (metricUtilization >= threshold){
				testoutput =  true;
			}
		} else if (op.equals("LessThan")){
			if  (metricUtilization < threshold){
				testoutput =  true;
			}
		} else if (op.equals("LessThanOrEqualTo")){
			if  (metricUtilization <= threshold){
				testoutput =  true;
			}
		} else if (op.equals("EqualTo")){
			if  (metricUtilization == threshold){
				testoutput =  true;
			}
		} else if (op.equals("NotEqualTo")){
			if  (metricUtilization != threshold){
				testoutput =  true;
			}
		}			
		
	return testoutput;	
	}
/////// action horizontal ///////////
	protected void action( String action, String actionType, float amount, int coolduration)
	{
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		//DynamicConnector dc = new DynamicConnector();
		Horizontalgroup hg =  getHorzontalgroup();
		int numberofinstances = 0;
		int currentInstance = hg.getHorizontalgroupGroupSize();
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
						hg.setHorizontalgroupGroupSize(newGroupSize);
						//hg.occiUpdate();   // in step dynamic
					}});
				hg.occiUpdate();  //in simple dybnmaic
			///	try {
			///		//Thread.sleep(300000);
			///		Thread.sleep(120000);
			///	} catch (InterruptedException e) {
			///		// TODO Auto-generated catch block
			///		e.printStackTrace();
			///	}
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
						hg.setHorizontalgroupGroupSize(newGroupSize);
						hg.occiUpdate();
					}});				
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
						hg.setHorizontalgroupGroupSize(newGroupSize);
						hg.occiUpdate();
					}});
				
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				hg.setHorizontalgroupGroupSize(currentInstance - numberofinstances);
				System.out.println("\n the number of instances or groupsize will be:" + (currentInstance - numberofinstances));
				newGroupSize = currentInstance - numberofinstances;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalgroupGroupSize(newGroupSize);
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
	
	////////////////////////////// vertical Methods /////////////////////////////////////
	protected Double getMetricVertical(Compute vm, String ruleMetric) {
		Double metricUsage = 0.0;
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		String vmname = vm.getAttributes().get(1).getValue();
		int hostid = zabbix_obj.getHostByName(zabi, vmname);
		if (ruleMetric.equals("cpuutilisationconnector")) {
			metricUsage = zabbix_obj.item_cpu_idle(zabi, hostid);
			System.out.println("\ncpu usage " + metricUsage);
		}
		if (ruleMetric.equals("memoryutilisationconnector")) {
			Double memavail = zabbix_obj.availableMemory(zabi, hostid);
			Float currentMEM = vm.getOcciComputeMemory();
			metricUsage = ((currentMEM - memavail)/currentMEM)*100; //memory used % = ((total - mem avail) / total)*100
			System.out.println("\nMemory used " + metricUsage);
		}
		return metricUsage;
	}
	
	protected void actionVertical(Compute vm, float increment, String ruleMetric, String actionname, int coolduration) throws InterruptedException {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		//int coolduration = this.getElasticityControllerCoolDuration();
		switch (ruleMetric) {
		case "cpuutilisationconnector":
			int cpus = vm.getOcciComputeCores();
			System.out.println("current vCPUs are: " + cpus);
			if (actionname.equals("add")) { 
				int currentCPUs = vm.getOcciComputeCores();
				int newCPUs = currentCPUs + (int)increment;
				if (newCPUs <= this.getElasticitycontrollerMaximumLimit()) {
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							vm.setOcciComputeCores(newCPUs);
							vm.occiUpdate();
							vm.occiRetrieve();
						}});
					System.out.println("the number of vCPUs becomes  " + vm.getOcciComputeCores());
	                System.out.println("wait scaling up before taking another decision");
	                Thread.sleep(coolduration);
				} else {System.out.println("Cann't execeeded the upper limit");}    
			}
			if (actionname.equals("remove")) { 
				int currentCPUs = vm.getOcciComputeCores();
				int newCPUs = currentCPUs - (int)increment;
				if (newCPUs >= this.getElasticitycontrollerMinimumLimit()) {
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							vm.setOcciComputeCores(newCPUs);
							vm.occiUpdate();
							vm.occiRetrieve();
						}});
					System.out.println("the number of vCPUs becomes  " + vm.getOcciComputeCores());
	                System.out.println("wait scaling up before taking another decision");
	                Thread.sleep(coolduration);
				} else {System.out.println("Cann't go beyond the minimum limit");};
			}
			
			break;
			
		case "memoryutilisationconnector":
			System.out.println("current Memory is : " + vm.getOcciComputeMemory());
			if (actionname.equals("add")) { 
				float currenmemSize = vm.getOcciComputeMemory();
				float newmemSize = currenmemSize + increment;
				if (newmemSize <= this.getElasticitycontrollerMaximumLimit()) {
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							vm.setOcciComputeMemory(newmemSize);
							vm.occiUpdate();
							vm.occiRetrieve();
						}});
					System.out.println("the memory size becomes  " + vm.getOcciComputeMemory() + "GB");
	                System.out.println("wait scaling up before taking another decision");
	                Thread.sleep(coolduration);
				} else {System.out.println("Cann't exceed the maximum limit");};
			}
				
				
			if (actionname.equals("remove")) { 
				float currenmemSize = vm.getOcciComputeMemory();
				float newmemSize = currenmemSize - increment;
				
				if (newmemSize >= this.getElasticitycontrollerMaximumLimit()) {
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							vm.setOcciComputeMemory(newmemSize);
							vm.occiUpdate();
							vm.occiRetrieve();
						}});
					System.out.println("the memory size becomes  " + vm.getOcciComputeMemory() + "GB");
	                System.out.println("wait scaling up before taking another decision");
	                Thread.sleep(coolduration);
				} else {System.out.println("Cann't go beyond the minimum limit");}
			}
			break;
		}

	}

	
}	





