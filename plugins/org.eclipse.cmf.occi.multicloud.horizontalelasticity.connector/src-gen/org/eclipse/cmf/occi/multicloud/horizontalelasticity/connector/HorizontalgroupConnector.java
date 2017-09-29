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
import org.eclipse.cmf.occi.core.Entity;
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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
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
	
	public void doEditing(EObject element) {
	    // Make sure your element is attached to a source, otherwise this will return null
	    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
	    domain.getCommandStack().execute(new RecordingCommand(domain) {

	        @Override
	        protected void doExecute() {
	            // Implement your write operations here,
	            // for example: set a new name
	            //element.eSet(element.eClass().getEStructuralFeature("occiComputeCores"), size);
	            //element.eSet(element.eClass().getEStructuralFeature("title"), value);
	            //((Compute)element).setOcciComputeCores(size);
	        	    //((Compute)element).eGet(element.eClass().eContainingFeature());
	          	//element.eGet("occiRetrieve());
	            //((Compute)element).occiRetrieve();
	        		//((Compute)element).occiCreate();
	        		//(Compute)element).occiCreate();
	        		
	        }
	    });
	}

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
			createConfigtemp(2);
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
		initializGroupSize(); // this is just to check the groupSize if it's bigger or smaller than the maximum and minimum size of the group
		
		int  oldGroupSize = 0;
		ArrayList<String> linksIds = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancevmware) {
				oldGroupSize = oldGroupSize+1;
				linksIds.add(link.getId());
			}
		}
		System.out.println("the old group size is  " + oldGroupSize );	
		
		if (getHorizontalGroupGroupSize() > oldGroupSize) {
			final int  oldGroupSize1 = oldGroupSize;
			System.out.println("The group will be increased by " + (getHorizontalGroupGroupSize() - oldGroupSize));
			MyRunnable myRunnable = new MyRunnable() {
				public void run() {
					try {
						createConfigtemp(oldGroupSize1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			};
			Thread thread = new Thread(myRunnable);
			thread.start();
			//try {
			//	createConfigtemp(oldGroupSize);
			//} catch (InterruptedException e) {
			//	// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
			
        } else if (getHorizontalGroupGroupSize() < oldGroupSize) {
        		int instancestodelete = (oldGroupSize - getHorizontalGroupGroupSize());
        		System.out.println("The group will be decreased by " + instancestodelete);
        		updateDecrease(instancestodelete);

        } else {
        		System.out.println("there is no change in the group size" );
        		for (Link link : this.getLinks()) {
        			if(link.getTarget() instanceof Instancevmware) {
        				Instancevmware inst = (Instancevmware)link.getTarget();
        				System.out.println(inst);
        			}
                }
        	}
        
        	
        		 
		
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
		try {
			ArrayList<String>  ips = getStatAndIP();
			for(int n=0;n<ips.size();n++) {
				String ip = ips.get(n);
				System.out.println(ip);
				//delete the ips from loadBlancer
				Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  
				lb.setLoadbalancerInstanceIP(ip);
				lb.removebackendserver();
				System.out.println("Instance with " + ip + " is deregistered from the LoadBalancer" );
				//delete the vms from the monitoring system
				ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
				String zabi = zabbix_obj.connect();
				zabbix_obj.host_delete(zabi, ip);
				System.out.println("Instance with " + ip + " is deregistered from the MonitoringSystem" );
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// delete the instances
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancevmware) {
				Instancevmware inst = (Instancevmware)link.getTarget();
				System.out.println("instance " + inst.getAttributes().get(1).getValue() + " is deleted from Vcenter");
				inst.occiDelete();
			}
		}
		
		// delete the links and configurations

		// top do
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
						System.out.println("The machine is creating:  " + stateMessage + "  the machine state is: " + gueststate);
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
	
	private  void createConfigtemp(int oldGroupSize) throws InterruptedException  {
		//int oldGroupSize = 2;
		ArrayList<String> linksIds = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancevmware) {
				//oldGroupSize = oldGroupSize+1;
				linksIds.add(link.getId());
				
			}
		}
		
		for (String p : linksIds)
		    System.out.println("existed instances : " + p );
		
		
		for (int i=oldGroupSize+1; i <= getHorizontalGroupGroupSize(); i++) {
			Configuration config = (Configuration)this.eContainer();
			Instancegrouplink igl = HorizontalelasticityFactory.eINSTANCE.createInstancegrouplink();
			Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
			config.getResources().add(vm);
			igl.setSource(this);
			igl.setTarget(vm);
			System.out.println(igl);
			System.out.println(vm);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
		ArrayList<String> linksIds2 = new ArrayList<String>();
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancevmware) {
				//oldGroupSize = oldGroupSize+1;
				linksIds2.add(link.getId());
				
			}
		}
		
		for (String p : linksIds2)
		    System.out.println("hi : " + p );
		
		int index = oldGroupSize+1;
		String vmname = "node"+ index;
		TransactionalEditingDomain domain; 
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Instancevmware) {
				if(!linksIds.contains(link.getId())) { // try to deploy in the new created configuratio
					System.out.println("will be deployed in the confiugration " + link.getId());
					Instancevmware inst = (Instancevmware)link.getTarget();
					System.out.println(" instance name " +  vmname);
					inst.setTitle(vmname);
					//doEditing1(inst, vmname);
					inst.setOcciComputeState(ComputeStatus.ACTIVE);
					//doEditing3(inst);
					inst.setImagename("templatelast");
					//doEditing2(inst, "template");
					domain = TransactionUtil.getEditingDomain(inst);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
					   public void doExecute() {
						   ((Compute)inst).occiCreate();
					   }
					});
					
					index++;
					//service.submit(myRunnable);
					try {
						Thread.sleep(5000); // wait 5 seconds to allows threads to be created
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
		}
		//service.shutdown();
		System.out.println("hi, the system will wait until the tasks are finsined");
//		try {
		//Thread.sleep(300000);
//			service.awaitTermination(420, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("finsh, finsih finnnnnnnnnnnnsh");	
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Instancevmware) {
				if(!linksIds.contains(link.getId())) {
					System.out.println("link fonnddddddd " + link.getId());
					Instancevmware inst = (Instancevmware)link.getTarget();
					inst.occiRetrieve();
					Thread.sleep(20000);
									
					while (inst.getAttributes().get(8).getValue().isEmpty()) { 
						String stateMessage = inst.getOcciComputeStateMessage();
						String gueststate = inst.getAttributes().get(4).getValue();
						if (!gueststate.equals("running")) {
							System.out.println("The machine is creating:  " + stateMessage + "   the machine state is:  " + gueststate);
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
					Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  //register the ips in loadBlancer
					lb.setLoadbalancerInstanceIP(inst.getAttributes().get(8).getValue());
					lb.addbackendserver();
					//register the vms in the monitoring system
					ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
					String zabi = zabbix_obj.connect();
			        String hostgroup = "Scalair scaling group";
					zabbix_obj.host_create(zabi, inst.getAttributes().get(1).getValue(), inst.getAttributes().get(8).getValue(), 10050, hostgroup, "Scalair Template OS Linux");
				}
				
			}
			
		}
			
	//return linksIds;
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
					inst.setImagename("templatelast");
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
	private void updateDecrease(int instanceNum) {
		//int instanceNum = 1;
		int i = 1;
		for (Link link : this.getLinks()) {
			if((link.getTarget() instanceof Instancevmware) && i <=instanceNum) {
				Instancevmware inst = (Instancevmware)link.getTarget();
				Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  
				lb.removebackendserver();
				System.out.println("Instance with " + inst.getAttributes().get(8).getValue() + " is deregistered from the LoadBalancer" );
				//delete the vms from the monitoring system
				ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
				String zabi = zabbix_obj.connect();
				zabbix_obj.host_delete(zabi, inst.getAttributes().get(8).getValue());
				System.out.println("Instance with " + inst.getAttributes().get(8).getValue() + " is deregistered from the MonitoringSystem" );
				inst.occiDelete();
				i++;
			}
		}
			
		}

	private void initializGroupSize() {
		if (getHorizontalGroupGroupSize() > getHorizontalGroupMaximum()) {
			System.out.println("The group size is bigger than the maximum limit of the group, the group size is set to the maximum group size" );
			setHorizontalGroupGroupSize(getHorizontalGroupMaximum());
        } else if (getHorizontalGroupGroupSize() < getHorizontalGroupMinimum()) {
        		System.out.println("The group size is smaller than the minimum limit of the group, the group size is set to the minimum group size" );

        } else {
        	System.out.println("it is ok, the groupSize is in the correct range" );
        }
        
	}
		// End of user code

}	
