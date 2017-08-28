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
 * Generated at Wed Aug 23 15:21:16 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.elasticocci/model/elasticocci.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.elasticocci.connector;

import org.eclipse.cmf.occi.multicloud.elasticocci.ModeType;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.elasticocci.Elasticcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.Date;

import java.text.ParseException;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
 * - term: strategycpu
 * - title: 
 */
public class StrategycpuConnector extends org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StrategycpuConnector.class);

	// Start of user code Strategycpuconnector_constructor
	/**
	 * Constructs a strategycpu connector.
	 */
	//test commit1
	StrategycpuConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	
	public boolean createPolicy ( double metricUtilization, String op, int threshold) {
		boolean testoutput = false;
		if (op.equals("greaterThan")){
			if  (metricUtilization > threshold){
				testoutput =  true;	
			}
		} else if (op.equals("greaterThanorEqual")){
			if  (metricUtilization >= threshold){
				testoutput =  true;
			}
		} else if (op.equals("lessThan")){
			if  (metricUtilization < threshold){
				testoutput =  true;
			}
		} else if (op.equals("lessThanorEqual")){
			if  (metricUtilization <= threshold){
				testoutput =  true;
			}
		}			
		
	return testoutput;	
	}
	private void manuel( String dir, String vmname) {
//		Vertical vmconnector = new Vertical();
		switch (dir) {
        	case "up":
        		
//        		int cpus = vmconnector.getCPUs(vmname);
//         		Instancevmware vm = ((Instancevmware)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget());
//        		int cpus = vm.getVcpu();
        		Compute vm = ((Compute)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget());
        		int cpus = vm.getOcciComputeCores();
//        		int cpus = ((Instancevmware)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget()).getVcpu();
        		System.out.println("current vCPUs are: " + cpus);
        		cpus = cpus + getStrategyCPUStepCPUIncrease();
        		if (cpus <= getStrategyCPUUpperLimit()) {
        			//int i = 0;
        			//while(i < 13 ) {		
        			//Sting x = ((Elasticcontroller) this.eContainer()).getLinks().get(0).getTarget().getAttributes();
        			//String x = ((Elasticcontroller) this.eContainer()).getLinks().get(0).getTarget().getAttributes().get(i).getValue();
        			//String y = ((Elasticcontroller) this.eContainer()).getLinks().get(0).getTarget().getAttributes().get(i).getName();
        			//System.out.println("\nthis is the returned value " + x);
        			//System.out.println("\nthis is the returned name " + y);
        			//System.out.println("\n " + i);
        			//i++;
        			//}
//        			vm.setVcpu(cpus);
        			vm.setOcciComputeCores(cpus);
        			vm.occiUpdate();
        			vm.occiRetrieve();
//        			vmconnector.addCPU(vmname, cpus);   ///
        			System.out.println("you have increased your VCPUs by " + getStrategyCPUStepCPUIncrease());
        		} else {
        			System.out.println("You can't add more cpus to this VM, you have arrived the maximum limit");
        		}
            break;
        case "down":
        		System.out.println("Sorry, you can't scale down in VMWare technology, please wait until we add more conncetors in OCCIware such as KVM");
            break;
        default: 
        		System.out.println("Enter correct direction, we have only up and down");
        break;
		}
		
	}
	
	private void scheduled(String dir, final String vmname, Date date) {
		final Vertical vmconnector = new Vertical();
		switch (dir) {
        case "up":
        	final int cpus = vmconnector.getCPUs(vmname);
        	System.out.println("current vCPUs are: " + cpus);
        	final int size = cpus + getStrategyCPUStepCPUIncrease();
        	if (cpus <= getStrategyCPUUpperLimit()) {
        		Timer timer = new Timer();
        		//Scheduler st = new Scheduler();
        		timer.schedule(new Scheduler() {
        				@Override
        				public void run() {
        				//vmconnector.addCPU(vmname, size); ///////////////////////////
        	        		System.out.println("you have increased your VCPUs by " + getStrategyCPUStepCPUIncrease());
        				}
        		}, date);
        	} else {
        		System.out.println("You can't add more cpus to this VM, you have arrived the maximum limit");
        	}
            break;
        case "down":
        	System.out.println("Sorry, you can't scale down in VMWare technology, please wait until we add more conncetors in OCCIware such as KVM");
            break;
        default: 
        	System.out.println("Enter correct direction, we have only up and down");
        break;
		}
		
	}
	
	private void dynamic(String vmname) throws InterruptedException {
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		int hostid = zabbix_obj.getHostByName(zabi, vmname);
		//System.out.print("hi, cpus used is " + cpuUsed);
		Vertical vmconnector = new Vertical();
		
		while (true) {
			Double cpuUsed = zabbix_obj.item_cpu_idle(zabi, hostid);
        		int cpus = vmconnector.getCPUs(vmname);
        		System.out.println("current vCPUs are: " + cpus);
        		int size = cpus + getStrategyCPUStepCPUIncrease();
        		if (cpus <= getStrategyCPUUpperLimit()) {
        			if (createPolicy(cpuUsed, getStrategyCPUIncreaseRelationalOp().getName(), getStrategyComputeUthreshold())) {
        				vmconnector.addCPU(vmname, size);
        				System.out.println("you have increased your VCPUs by " + getStrategyCPUStepCPUIncrease());
                    System.out.println("wait scaling up before taking another decision");
                    Thread.sleep(getStrategyComputeBreathUp());
        			}
        		} else {
        			System.out.println("You can't add more cpus to this VM, you have arrived the maximum limit");
        		}
        		if ((createPolicy(cpuUsed, getStrategyCPUDecreaseRelationalOp().getName(), getStrategyComputeLthreshold())) && (cpus > getStrategyCPULowerLimit())) {
        			System.out.println("Sorry, you can't scale down in VMWare technology, please wait until we add more conncetors in OCCIware such as KVM");
        			Thread.sleep(getStrategyComputeBreathDown());
        		}
        Thread.sleep(getStrategyComputePollTime());	
		}
	}
	// End of user code
	// Start of user code Strategycpu_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/elasticocci/strategycpu/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		//System.out.println(getStrategyComputeUthreshold());
		
		String vmname = ((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget().getAttributes().get(1).getValue();
		switch (getStrategyCPUMode().getName()) {
		case "manual":
			manuel((getStrategyCPUDirection().getName()), vmname);
			break;
			
		case "dynamic":
			try {
				dynamic(vmname);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case "scheduled":
			//System.out.println(m1);
			//Direction sch = Direction.up;
    	    		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	    		//Date date = dateFormatter.parse("2017-08-16 16:40:20");
			Date date = null;
			try {
				date = dateFormatter.parse(getStrategyCPUDate());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    		scheduled((getStrategyCPUDirection().getName()), "vertical", date);
			break;
		}

		// TODO: Implement how to start this strategycpu.
	}
		// End of user code

	// Start of user code Strategycpu_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/elasticocci/strategycpu/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this strategycpu.
	}
		// End of user code

}	
