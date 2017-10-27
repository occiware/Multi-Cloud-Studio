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

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: horizontalelasticcontroller
 * - title: 
 */
public class HorizontalelasticcontrollerConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontrollerImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HorizontalelasticcontrollerConnector.class);

	// Start of user code Horizontalelasticcontrollerconnector_constructor
	/**
	 * Constructs a horizontalelasticcontroller connector.
	 */
	HorizontalelasticcontrollerConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code HorizontalelasticcontrollerocciCreate
	/**
	 * Called when this Horizontalelasticcontroller instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		Horizontalgroup hg = (Horizontalgroup) this.getLinks().get(0).getTarget();
		hg.setHorizontalGroupGroupSize(2);
		//hg.occiUpdate();
	}
	// End of user code

	// Start of user code Horizontalelasticcontroller_occiRetrieve_method
	/**
	 * Called when this Horizontalelasticcontroller instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
		Horizontalgroup hg = (Horizontalgroup) this.getLinks().get(0).getTarget();
		while (true) {
			double CPUGroupUsage =  CPUGroupUsage();
			if (CPUGroupUsage > 50) {
				int cuurentSize = hg.getHorizontalGroupGroupSize();
				int newSize = cuurentSize +1;
				System.out.println("The size of the group wimm be increased from " + cuurentSize + "  to  " +  newSize);
				hg.setHorizontalGroupGroupSize(newSize);
				hg.occiUpdate();
				System.out.println("wait 2 minutes after the scaling decsision");
				
				try {
					Thread.sleep(120000); // wait 7 minutes after scaling action
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			///////////////////////////////////
			if ((CPUGroupUsage < 20) && isthereMoreThanOneInstance( )) {
				int cuurentSize = hg.getHorizontalGroupGroupSize();
				int newSize = cuurentSize - 1;
				System.out.println("The size of the group wimm be decreased from " + cuurentSize + "  to  " +  newSize);
				hg.setHorizontalGroupGroupSize(newSize);
				hg.occiUpdate();
				System.out.println("wait 2 minutes after the scaling decsision");
				try {
					Thread.sleep(120000); // wait 2 minutes after scaling action
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			System.out.println("Wait a little time to avoid cpu cycle consummation");
			try {
				Thread.sleep(20000); // wait 2 minutes after scaling action
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}
		
	}
	// End of user code

	// Start of user code Horizontalelasticcontroller_occiUpdate_method
	/**
	 * Called when this Horizontalelasticcontroller instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code HorizontalelasticcontrollerocciDelete_method
	/**
	 * Called when this Horizontalelasticcontroller instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	
	private double CPUGroupUsage() {
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
					
					String instanceIp = inst.getAttributes().get(8).getValue();
					System.out.println("trying to connect to zabbix");
					String zabi = zabbix_obj.connect();
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
	
	private boolean isthereMoreThanOneInstance( ) {
		boolean test = false;
		Horizontalgroup hg = (Horizontalgroup) this.getLinks().get(0).getTarget();
		int noOfLinks = 0;
		int noOfComputeInstances = 0;
		for(Link link : hg.getLinks()) {
			noOfLinks++;
		}
		
		for(int i =0; i< noOfLinks; ++i) {
			if(hg.getLinks().get(i).getTarget() instanceof Instancevmware) {
				noOfComputeInstances = noOfComputeInstances+1;
			}	
		}
		
		if (noOfComputeInstances > 1) {
			test = true;
		}
		
		return test;
	}
	// End of user code

	//
	// Horizontalelasticcontroller actions.
	//

	// Start of user code Horizontalelasticcontroller_Kind_stop_action
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

		// TODO: Implement how to stop this horizontalelasticcontroller.
	}
		// End of user code
	// Start of user code Horizontalelasticcontroller_Kind_start_action
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

		// TODO: Implement how to start this horizontalelasticcontroller.
	}
		// End of user code
		


}	
