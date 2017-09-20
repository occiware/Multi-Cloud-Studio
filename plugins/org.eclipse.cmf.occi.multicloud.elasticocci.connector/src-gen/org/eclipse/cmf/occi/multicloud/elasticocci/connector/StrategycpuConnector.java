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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Shell;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VMHelper;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.elasticocci.Elasticcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.mo.VirtualMachine;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.Date;
//import java.text.ParseException;

//import java.lang.reflect.InvocationTargetException;


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
	private static volatile boolean bool=true;
	Timer timer = new Timer();
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
	private void manuel( String dir, Compute vm) {
//		Vertical vmconnector = new Vertical();
		int cpus = vm.getOcciComputeCores();
		switch (dir) {
        	case "up":	
//        		int cpus = vmconnector.getCPUs(vmname);
//         		Instancevmware vm = ((Instancevmware)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget());
//        		int cpus = vm.getVcpu();
//        		Compute vm = ((Compute)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget());
//        	int cpus = ((Instancevmware)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget()).getVcpu();
        		System.out.println("current vCPUs are: " + cpus);
        		cpus = cpus + getStrategyCPUStepCPUIncrease();
        		if (cpus <= getStrategyCPUUpperLimit()) {		
        			//Sting x = ((Elasticcontroller) this.eContainer()).getLinks().get(0).getTarget().getAttributes();
        			//String x = ((Elasticcontroller) this.eContainer()).getLinks().get(0).getTarget().getAttributes().get(i).getValue();
        			//String y = ((Elasticcontroller) this.eContainer()).getLinks().get(0).getTarget().getAttributes().get(i).getName();
         		//vm.setVcpu(cpus);
        			vm.setOcciComputeCores(cpus);
        			vm.occiUpdate();
        			vm.occiRetrieve();
//        		vmconnector.addCPU(vmname, cpus);   ///
        			System.out.println("you have increased your VCPUs by " + getStrategyCPUStepCPUIncrease());
        		} else {
        			System.out.println("You can't add more cpus to this VM, you have arrived the maximum limit");
        		}
            break;
            
        case "down":
        		//int cpus = vm.getOcciComputeCores();
        		cpus = cpus - getStrategyCPUStepCPUDecrease();
        		if (cpus >= getStrategyCPULowerLimit()) {
        			vm.setOcciComputeCores(cpus);
        			vm.occiUpdate();
        			vm.occiRetrieve();
        			//System.out.println("Sorry, you can't scale down in VMWare technology, please wait until we add more connectors in OCCIware such as KVM");
        		} else {
        			System.out.println("You can't add more cpus to this VM, you have arrived the minmum lower limit");
        		}
        		
            break;
        default: 
        		System.out.println("Enter correct direction, we have only up and down");
        break;
		}
		
	}
	
	public void doEditing(EObject element, int size) {
	    // Make sure your element is attached to a source, otherwise this will return null
	    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
	    domain.getCommandStack().execute(new RecordingCommand(domain) {

	        @Override
	        protected void doExecute() {
	            // Implement your write operations here,
	            // for example: set a new name
	            element.eSet(element.eClass().getEStructuralFeature("occiComputeCores"), size);
	        }
	    });
	}
	
	public void doEditing2(EObject element) {
	    // Make sure your element is attached to a source, otherwise this will return null
	    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
	    domain.getCommandStack().execute(new RecordingCommand(domain) {

	        @Override
	        protected void doExecute() {
	            // Implement your write operations here,
	            // for example: set a new name
	        		//int numCores;
	        		//int numCores = VMHelper.getNumSockets(element);
	        		//int numCores = resourceTpl.getCores();
	            element.eGet(element.eClass().getEStructuralFeature("occiComputeCores"));
	        }
	    });
	}
	
	private void scheduled(String dir, final Compute vm, Date date) {
		//final Vertical vmconnector = new Vertical();
		//String vmname = vm.getAttributes().get(1).getValue();
		int cpus = vm.getOcciComputeCores();
		int size;
		switch (dir) {
        case "up":
        	//final int cpus = vmconnector.getCPUs(vmname);
        	System.out.println("current vCPUs are: " + cpus);
        	size = cpus + getStrategyCPUStepCPUIncrease();
        	if (size <= getStrategyCPUUpperLimit()) {
        		//Scheduler st = new Scheduler();
        		this.timer = new Timer();
        		timer.schedule(new Scheduler() {
        				@Override
        				public void run() {
        					doEditing(vm,size);
        					try {
        						vm.occiUpdate();
        					} catch (Exception e) {
        						e.getMessage();
        					}
        					//vm.setOcciComputeCores(cpus);
        					//vm.occiUpdate();
                			//vm.occiRetrieve();
                			//vmconnector.addCPU(vmname, size); ///////////////////////////
        	        			System.out.println("you have increased your VCPUs by " + getStrategyCPUStepCPUIncrease());
       
        	        			//ProgressMonitorDialog dialog = new ProgressMonitorDialog(null);
        	        			//dialog.close();
        	        			
        				}
        		}, date);
        		
        	} else {
        		System.out.println("You can't add more cpus to this VM, you have arrived the maximum limit");
        	}
            break;
        case "down":
        	//final int cpus = vmconnector.getCPUs(vmname);
        	System.out.println("current vCPUs are: " + cpus);
        	size = cpus - getStrategyCPUStepCPUDecrease();
        	if (size >= getStrategyCPULowerLimit()) {
        		//Scheduler st = new Scheduler();
        		this.timer = new Timer();
        		timer.schedule(new Scheduler() {
        				@Override
        				public void run() {
        					doEditing(vm,size);
        					try {
        						vm.occiUpdate();
        					} catch (Exception e) {
        						e.getMessage();
        					}
        					try {
        						vm.occiRetrieve();
        					} catch (Exception e) {
        						e.getMessage();
        					}
        					//vm.setOcciComputeCores(size);
                			//vm.occiUpdate();
                			//vm.occiRetrieve();
                			//vmconnector.addCPU(vmname, size); ///////////////////////////
        	        			//System.out.println("you have decreased your VCPUs by " + getStrategyCPUStepCPUDecrease());
        				}
        		}, date);
        		
        	} else {
        		System.out.println("You can't add more cpus to this VM, you have arrived the minmum limit");
        	}
        	//System.out.println("Sorry, you can't scale down in VMWare technology, please wait until we add more conncetors in OCCIware such as KVM");
            break;
        default: 
        	System.out.println("Enter correct direction, we have only up and down");
        break;
		}
		
	}
	
	private void dynamic(Compute vm) throws InterruptedException {
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		String vmname = vm.getAttributes().get(1).getValue();
		int hostid = zabbix_obj.getHostByName(zabi, vmname);
		//System.out.print("hi, cpus used is " + cpuUsed);
		//Vertical vmconnector = new Vertical();
		
		while (bool) {
			Double cpuUsed = zabbix_obj.item_cpu_idle(zabi, hostid);
			System.out.println("cpu usage " + cpuUsed);
        		//int cpus = vmconnector.getCPUs(vmname);
			int cpus = vm.getOcciComputeCores();
        		System.out.println("current vCPUs are: " + cpus);
        		if (createPolicy(cpuUsed, getStrategyCPUIncreaseRelationalOp().getName(), getStrategyComputeUthreshold())) {
            		int size = cpus + getStrategyCPUStepCPUIncrease();
        			if (size <= getStrategyCPUUpperLimit()) {
        				//vmconnector.addCPU(vmname, size);
        				doEditing(vm,size);
    					System.out.println(vm.getOcciComputeCores());
    					try {
    						vm.occiUpdate();
    					} catch (Exception e) {
    						e.getMessage();
    					}
    					try {
    						vm.occiRetrieve();
    					} catch (Exception e) {
    						e.getMessage();
    					}
    					
    					//vm.setOcciComputeCores(size);
            			//vm.occiUpdate();
            			//vm.occiRetrieve();
        				System.out.println("you have increased your VCPUs by " + getStrategyCPUStepCPUIncrease());
                    System.out.println("wait scaling up before taking another decision");
                    Thread.sleep(getStrategyComputeBreathUp());
        			}
        			else {
        			System.out.println("You can't add more cpus to this VM, you have arrived the maximum limit");
        			}
        		}
        		if (createPolicy(cpuUsed, getStrategyCPUDecreaseRelationalOp().getName(), getStrategyComputeLthreshold())) {
        			int size = cpus - getStrategyCPUStepCPUIncrease();
        			if (size >= getStrategyCPULowerLimit()) {
        			//System.out.println("Sorry, you can't scale down in VMWare technology, please wait until we add more connectors in OCCIware such as KVM");
        			doEditing(vm,size);
				try {
					vm.occiUpdate();
				} catch (Exception e) {
					e.getMessage();
				}
				//try {
				//	vm.occiRetrieve();
				//} catch (Exception e) {
				//	e.getMessage();
				//}
				//doEditing2(vm);							
				Thread.sleep(getStrategyComputeBreathDown());
        			}
        			else {
            			System.out.println("You can't decrease  cpus of this VM, you have arrived the minmum limit");
            		}
        		}
        Thread.sleep(getStrategyComputePollTime());	
		}
		//bool = true;
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
		Compute vm = ((Compute)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget());
		String vmname = ((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget().getAttributes().get(1).getValue();
		switch (getStrategyCPUMode().getName()) {
		case "manual":
			manuel((getStrategyCPUDirection().getName()), vm);
			break;
			
		case "dynamic":	
			MyRunnable myRunnable = new MyRunnable() {
				public void run() {
					try {
						dynamic(vm);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			};
			Thread thread = new Thread(myRunnable);
			thread.start();
			bool = true;
			//try {
			//	dynamic(vmname);
			//} catch (InterruptedException e) {
			//	// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
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
    	    		scheduled((getStrategyCPUDirection().getName()), vm, date);
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
		if(this.timer != null) {
			this.timer.cancel();
		}
		
		bool = false;
		// TODO: Implement how to stop this strategycpu1.
	}
		// End of user code

}




