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
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: dynamic
 * - title: 
 */
public class DynamicConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(DynamicConnector.class);

	// Start of user code Dynamicconnector_constructor
	/**
	 * Constructs a dynamic connector.
	 */
	DynamicConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code DynamicocciCreate
	/**
	 * Called when this Dynamic instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		Horizontalgroup hg = (Horizontalgroup) this.getLinks().get(0).getTarget();
		System.out.println("HG -------" + hg);
		CPUGroupUsage();
	}
	// End of user code

	// Start of user code Dynamic_occiRetrieve_method
	/**
	 * Called when this Dynamic instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Dynamic_occiUpdate_method
	/**
	 * Called when this Dynamic instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code DynamicocciDelete_method
	/**
	 * Called when this Dynamic instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Dynamic actions.
	//

	// Start of user code Dynamic_Kind_stop_action
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

		// TODO: Implement how to stop this dynamic.
	}
	// End of user code
	// Start of user code Dynamic_Kind_start_action
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

		// TODO: Implement how to start this dynamic.
	}
	
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
		double metrcUsage = 60.0;
		if (metricName.equals("CPUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
			CPUGroupUsage();
		} 
		else if(metricName.equals("MemoryUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		else if(metricName.equals("AverageCpuUtilisation")) {
			System.out.println("\n Now, we found the accumulated " + metricName + " the metci usage ");
		}
		
		return metrcUsage;
		
	}
	
	// End of user code
		


}	
