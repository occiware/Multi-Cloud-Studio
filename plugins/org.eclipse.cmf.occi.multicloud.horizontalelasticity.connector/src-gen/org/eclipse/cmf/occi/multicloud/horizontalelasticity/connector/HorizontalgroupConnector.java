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
 * Generated at Fri Sep 22 14:58:42 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityFactory;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstancegrouplinkImpl;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareFactory;
import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.transaction.RecordingCommand;
//import org.eclipse.emf.transaction.TransactionalEditingDomain;
//import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.corba.se.impl.orbutil.closure.Future;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: horizontalgroup
 * - title: 
 */
public class HorizontalgroupConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HorizontalgroupConnector.class);

	// Start of user code Horizontalgroupconnector_constructor
	/**
	 * Constructs a horizontalgroup connector.
	 */
	HorizontalgroupConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code HorizontalgroupocciCreate
	/**
	 * Called when this Horizontalgroup instance is completely created.
	 * 
	 */
	
//	public void doEditing(EObject element, String value) {
//	    // Make sure your element is attached to a source, otherwise this will return null
//	    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
//	    domain.getCommandStack().execute(new RecordingCommand(domain) {
//
//	        @Override
//	        protected void doExecute() {
//	            // Implement your write operations here,
//	            // for example: set a new name
//	            //element.eSet(element.eClass().getEStructuralFeature("occiComputeCores"), size);
//	            element.eSet(element.eClass().getEStructuralFeature("title"), value);
//	            //((Compute)element).setOcciComputeCores(size);
//	        	    //((Compute)element).eGet(element.eClass().eContainingFeature());
//	          	//element.eGet("occiRetrieve());
//	            //((Compute)element).occiRetrieve();
//	        }
//	    });
//	}
	
//	public void doEditingAtrribute(EObject element, String attribute, String value) {
//	    // Make sure your element is attached to a source, otherwise this will return null
//	    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
//	    domain.getCommandStack().execute(new RecordingCommand(domain) {
//
//	        @Override
//	        protected void doExecute() {
//	            // Implement your write operations here,
//	            // for example: set a new name
//	            element.eSet(element.eClass().getEStructuralFeature(attribute), value);
//	            //((Compute)element).setOcciComputeCores(size);
//	            //((Compute)element).occiRetrieve();
//	        }
//	    });
//	}
	
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		if (getHorizontalGroupGroupSize() > getHorizontalGroupMaximum()) {
			setHorizontalGroupGroupSize(getHorizontalGroupMaximum());
		}
		
		if (getHorizontalGroupGroupSize() < getHorizontalGroupMinimum()) {
			setHorizontalGroupGroupSize(getHorizontalGroupMinimum());
		}
						
		//ArrayList<Instancevmware> array = new ArrayList<Instancevmware>();
		//for (Link link : this.getLinks()) {
		//	if(link.getTarget() instanceof Instancevmware) {
		//		array.add((Instancevmware)link.getTarget());
		//	}
		//}
		//System.out.println(array);
		//createLinksAndConfig();
		//System.out.print("wait wait wati");
		createVMs();	
		//try {
		//	getStatAndIP();
		//} catch (InterruptedException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		;
		try {
			ArrayList<String>  ips = getStatAndIP();
			int index =1;
			for(int n=0;n<ips.size();n++) {// register the machines at the Loadbalancer and the Monitoring system.
				//length is the property of array, size of arraylist  
				//System.out.println(arr.get(n));
				String ip = ips.get(n);
				System.out.println(ip);
				
				Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  //register the ips in loadBlancer
				lb.setLoadbalancerInstanceIP(ip);
				lb.addbackendserver();
				
				String vm_name = "node" + index;                            // //register the vms in the monitoring system
				ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
				String zabi = zabbix_obj.connect();
		        String hostgroup = "Scalair scaling group";
				zabbix_obj.host_create(zabi, vm_name, ip, 10050, hostgroup, "Scalair Template OS Linux");
				index++;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// End of user code

	// Start of user code Horizontalgroup_occiRetrieve_method
	/**
	 * Called when this Horizontalgroup instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		try {
			getStatAndIP();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Horizontalgroup_occiUpdate_method
	/**
	 * Called when this Horizontalgroup instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code HorizontalgroupocciDelete_method
	/**
	 * Called when this Horizontalgroup instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Horizontalgroup actions.
	//
	// Start of user code Horizontalgroup_Kind_create_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalgroup/action#
     * - term: create
     * - title: 
	 * @throws InterruptedException 
	 * @throws Exception 
	 */
	
	
	
	public ArrayList<String> getStatAndIP() throws InterruptedException  { // return the ips for the created VMs
		ArrayList<String> ipList = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancevmware) {
				Instancevmware inst = (Instancevmware)link.getTarget();
				inst.occiRetrieve();
				Thread.sleep(20000);				
				while (inst.getAttributes().get(8).getValue().isEmpty()) { 
					String stateMessage = inst.getOcciComputeStateMessage();
					String gueststate = inst.getAttributes().get(4).getValue();
					if (!gueststate.equals("running")) {
						System.out.println("The machine is creating  " + stateMessage + "the machine state is " + gueststate);
					} else {
						System.out.println("Waiting for the machine to reboot and to get its DHCP ip");
					}
					try {
						inst.occiRetrieve();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Thread.sleep(20000);
				}
 				
				System.out.println("node  " +inst.getAttributes().get(1).getValue() + " ip  " +  inst.getAttributes().get(8).getValue());
				ipList.add(inst.getAttributes().get(8).getValue());
			}
		}
	return ipList;		
	}
	
	private void createLinksAndConfig() {
		for (int i=1; i <= getHorizontalGroupGroupSize(); i++) {
			Configuration config = (Configuration)this.eContainer();
			Instancegrouplink igl = HorizontalelasticityFactory.eINSTANCE.createInstancegrouplink();
			Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
			config.getResources().add(vm);
			igl.setSource(this);
			igl.setTarget(vm);
			System.out.println(igl);
			System.out.println(vm);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void createVMs() {
		final ExecutorService service = Executors.newCachedThreadPool();
		Collection<Future> futures = new LinkedList<Future>();
		
		int i=1;
		for (Link link : this.getLinks()) {
				if(link.getTarget() instanceof Instancevmware) {
					String vmName = "node"+i;
					Instancevmware inst = (Instancevmware)link.getTarget();
					//doEditing(inst, vmName);
					inst.setTitle(vmName);
					inst.setOcciComputeState(ComputeStatus.ACTIVE);
					//doEditing2(inst, "template");
					inst.setImagename("template");
					MyRunnable myRunnable = new MyRunnable() {
						public void run() {
							try { 
								inst.occiCreate();
							} catch(Exception e) {
								e.printStackTrace();
							}
							}
					};
					service.submit(myRunnable);
					try {
						Thread.sleep(5000); // wait 5 seconds to allows threads to be created
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
				}
			}

		service.shutdown();
		//System.out.println("hi, the system will wait until the tasks are finsined");
		try {
			//Thread.sleep(10000);
			service.awaitTermination(660, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finsh, finsih finnnnnnnnnnnnsh");
		
	}
	@Override
	public void create()
	{
		createLinksAndConfig();
		
		//if ((this.getLinks() instanceof Instancevmware)) {
		//	System.out.println("the links are laready created");
		//		
		//} else {
		//	createLinksAndConfig();
		//}
		LOGGER.debug("Action create() called on " + this);
		// TODO: Implement how to create this horizontalgroup.
		
	//	int index = 1;
	//	for (Link link : this.getLinks()) {
	//		if(link.getTarget() instanceof Instancevmware) {
	//			String vmName = "node"+index;
	//			Instancevmware inst = (Instancevmware)link.getTarget();
	//			inst.occiRetrieve();
	//			try {
	//					Thread.sleep(10000);
	//				} catch (InterruptedException e) {
	//					// TODO Auto-generated catch block
	//					e.printStackTrace();
	//				}
	//			String stateMessage = inst.getOcciComputeStateMessage();
	//			System.out.println("The machine is creating " + stateMessage + "The machine name  " +inst.getTitle() + "machine state " +inst.getAttributes().get(3).getValue());
	//			for (int n=1; n <=8; n++) {
	//				System.out.println("name " + inst.getAttributes().get(n).getName() + " value " + inst.getAttributes().get(n).getValue());
	//			}
				//System.out.println();
				//inst.setTitle(vmName);
				
				//MyRunnable myRunnable2 = new MyRunnable() {
				//	public void run() {
				//		String gueststate = inst.getAttributes().get(4).getValue();
				//		while (!gueststate.equals("running")) {
				//			gueststate = inst.getAttributes().get(4).getValue();
				//			String stateMessage = inst.getOcciComputeStateMessage();
				//			System.out.println("The machine is creating " + stateMessage);
				//			System.out.println("The machine is  " +inst.getAttributes().get(1).getValue());
				//			try {
				//				Thread.sleep(10000);
				//			} catch (InterruptedException e) {
				//				// TODO Auto-generated catch block
				//				e.printStackTrace();
				//			}
				//			doEditing(inst);
				//			//inst.occiRetrieve();
				//		}
				//		
				//	}
				//};
				//Thread thread = new Thread(myRunnable2);
				//thread.start();
				
			
		
	}
		// End of user code

}	
