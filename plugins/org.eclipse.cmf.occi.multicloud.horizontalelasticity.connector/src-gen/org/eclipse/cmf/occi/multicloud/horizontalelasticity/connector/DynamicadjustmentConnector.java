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

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: dynamicadjustment
 * - title: 
 */
public class DynamicadjustmentConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl
{
	/**
	 * Initialize the logger.
	 */
	private static volatile boolean bool=true;
	private static Logger LOGGER = LoggerFactory.getLogger(DynamicadjustmentConnector.class);

	// Start of user code Dynamicadjustmentconnector_constructor
	/**
	 * Constructs a dynamicadjustment connector.
	 */
	DynamicadjustmentConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code DynamicadjustmentocciCreate
	/**
	 * Called when this Dynamicadjustment instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		System.out.print("this is just test");
		//DynamicConnector dynamic = new DynamicConnector();
		//Dynamic dyc = new Dynamic();
		CPUGroupUsage();
	}
	// End of user code

	// Start of user code Dynamicadjustment_occiRetrieve_method
	/**
	 * Called when this Dynamicadjustment instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Dynamicadjustment_occiUpdate_method
	/**
	 * Called when this Dynamicadjustment instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code DynamicadjustmentocciDelete_method
	/**
	 * Called when this Dynamicadjustment instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Dynamicadjustment actions.
	//

	// Start of user code Dynamicadjustment_Kind_stop_action
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

		bool = false;
	}
	// End of user code
	// Start of user code Dynamicadjustment_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalelasticcontroller/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		bool = true;
		///final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		MyRunnable myRunnable = new MyRunnable() {
			public void run() {
				while(bool) {
					///domain.getCommandStack().execute(new RecordingCommand(domain) {
						///@Override
						///protected void doExecute() {
							startdynamicadjustment();
						///}});
					
					System.out.println("Wait betwwen loop cycles to avoid consuming CPU cycles");	
					try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}
		};
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
	
	protected void startdynamicadjustment() {
		DynamicpolicyConnector dp = new DynamicpolicyConnector();
		//while(bool) {
			String  targetMetric = this.getDynamicAdjustmentMetric().getName();
			double metrcUsage  = dp.getMetricUsage(targetMetric, 0, 0);
			
			Horizontalgroup hg = getHorzontalgroup();
			int groupSize = hg.getHorizontalGroupGroupSize();
			float decreaseIndicator = ((this.dynamicAdjustmentTarget/groupSize) - 5);  // B = (((count-1)*Tcpu)/count) - alpha // you have not to violate the threshold (Tcpu)
			
			if (metrcUsage >= this.dynamicAdjustmentTarget) {
				action( "add", "instanceCount", 1, this.getElasticityControllerCoolDuration());
			}
			
			if(metrcUsage < decreaseIndicator) {
				action( "remove", "instanceCount", 1, this.getElasticityControllerCoolDuration());
			}	
		//}
	}
	
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
	
	public void action( String action, String actionType, float amount, int coolduration)
	{
		//DynamicConnector dc = new DynamicConnector();
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		Horizontalgroup hg =  getHorzontalgroup();
		int  numberofinstances;
		int currentInstance = hg.getHorizontalGroupGroupSize();
		if (action.equals("add")) {
			System.out.println("You are going to add more resources");
			if(actionType.equals("instanceCount")) {
				System.out.println("You are going to add more resources according to " + actionType);
				numberofinstances = (int) amount;
				System.out.println(" nubmer of instances to be added " + numberofinstances);
				System.out.println(" The group size will become  " + (numberofinstances + currentInstance));
				///int newGroupSize = numberofinstances + currentInstance;
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
						hg.occiUpdate();
					}});
				
				///hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
				///hg.occiUpdate();
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to add more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				//hg.setHorizontalGroupGroupSize(currentInstance + numberofinstances);
				//hg.occiUpdate();
				System.out.println("\n the number of inatances will be " + (currentInstance + numberofinstances));
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
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
				System.out.println(" The group size will become  " + ( currentInstance - numberofinstances));
				//hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
				//hg.occiUpdate();
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
						hg.occiUpdate();
					}});
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
				System.out.println("\n the number of instances or groupsize will be:" + (currentInstance - numberofinstances));
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
						hg.occiUpdate();
					}});
			}
		}
		System.out.print("wait, cool duration");
		try {
			Thread.sleep(coolduration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
	// End of user code
		


}	
