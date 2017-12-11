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
 * Generated at Fri Dec 08 17:51:34 CET 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityFactory;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



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
	
	public void doEditing(int value) {
		System.out.println("titi " + this);
		Horizontalgroup hg = this;
		HorizontalgroupConnector hgc = this;
	    // Make sure your element is attached to a source, otherwise this will return null
		Resource res = this.eResource();
		ResourceSet rs = this.eResource().getResourceSet();
		//System.out.println("1-titi " + this.eResource());
		//System.out.println("2-titi " + this.eResource().getResourceSet());
		//TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(hg);
		//TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain((ResourceSet) hgc);
		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
		//if(domain == null){
		//domain =
		//TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
		//}
	    //System.out.println("tata " + domain);
	    domain.getCommandStack().execute(new RecordingCommand(domain) {
	        @Override
	        protected void doExecute() {
	            // Implement your write operations here,
	            // for example: set a new name
	        		//((Horizontalgroup)element).setHorizontalGroupGroupSize(value);
	   ///     		System.out.println("element " +hgc);
	    ///    		System.out.println("getfeature " +hgc.eClass().getEStructuralFeature("horizontalGroupGroupSize"));
	        		hg.eSet(hg.eClass().getEStructuralFeature("horizontalGroupGroupSize"), value);
	            //((Compute)element).setOcciComputeCores(size);
	            //((Compute)element).occiRetrieve();
	        }
	    });
	}
	
	public void doEditing22(int value) {
		final Horizontalgroup hg = this;
		//final Machine machine = this;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                TransactionalEditingDomain ted = 
                	TransactionUtil.getEditingDomain(hg);
                ted.getCommandStack().execute(new RecordingCommand(ted) 
                	{
                 @Override
                 protected void doExecute() {
                	 hg.setHorizontalgroupGroupSize(value);
                	 //hg.eSet(hg.eClass().getEStructuralFeature("horizontalGroupGroupSize"), value);
                }
                });
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		if (getHorizontalgroupGroupSize() > getHorizontalgroupMaximum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMaximum());
		}
		
		if (getHorizontalgroupGroupSize() < getHorizontalgroupMinimum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMinimum());
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
		LOGGER.debug("occiRetrieve() called on " + this);
		createLinksAndConfig();
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
		
		final int olldGroupSize = oldGroupSize;
		if (getHorizontalgroupGroupSize() > oldGroupSize) {
			//final int  oldGroupSize1 = oldGroupSize;
			System.out.println("The group will be increased by " + (getHorizontalgroupGroupSize() - oldGroupSize));
			ArrayList<String> LlinksIds = new ArrayList<String>();
			for (Link link : this.getLinks()) {
				if(link.getTarget() instanceof Instancevmware) {
					//oldGroupSize = oldGroupSize+1;
					LlinksIds.add(link.getId());
					
				}
			}
			
			for (String p : LlinksIds)
			    System.out.println("existed instances : " + p );
			final int Gsize = oldGroupSize;
			//SimpledynamicConnector sd = new SimpledynamicConnector();
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					createInstanceandLinkConfig(Gsize);
					
				}});
			//createInstanceandLinkConfig(oldGroupSize);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			MyRunnable myRunnable = new MyRunnable() {
				public void run() {
					try {
						createConfigtemp(olldGroupSize, LlinksIds);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			Thread thread = new Thread(myRunnable);
			thread.start();
			
        } else if (getHorizontalgroupGroupSize() < oldGroupSize) {
        		int instancestodelete = (oldGroupSize - getHorizontalgroupGroupSize());
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
		int i=0;
		int y =0;
		for (Link link1 : this.getLinks()) {
			++i;
			System.out.println("out of the loop" + i);
			if(link1.getTarget() instanceof Instancevmware) {
				++y;
				try {
					System.out.println("vmware link found" + i);
					Instancevmware instance = (Instancevmware)link1.getTarget();
					// Remove from model.
					Configuration config = OcciHelper.getConfiguration(instance);
					
					org.eclipse.cmf.occi.core.Resource src = link1.getSource();
					org.eclipse.cmf.occi.core.Resource target = link1.getTarget();
					
					if (src != null) {
						src.getLinks().remove(link1);
					} else {
						System.out.println("Warning, the link : " + link1.getKind().getName() + " has no source !");
					}
					if (target != null) {
						target.getLinks().remove(link1);
					} else {
						System.out.println("Warning, the link : " + link1.getKind().getName() + " has no target !");
					}
					System.out.println("the link is removed");
					config.getResources().remove(instance);
					System.out.println("the instance configuration is removed");
				} catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				System.out.println("sleep between loop iterations");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	protected void deleteInstance(Link link1) {
		Instancevmware instance = (Instancevmware)link1.getTarget();
		// get the ip of the instance
		String ip = instance.getAttributes().get(8).getValue(); 
		// get LB
		Loadbalancer lb = null;
		for (Link link : this.getLinks()) {	
			if(link.getTarget() instanceof Loadbalancer) {
				lb = (Loadbalancer)link.getTarget();
				break;
			}
		}
		//delete the ips from loadBlancer
		lb.setLoadbalancerInstanceIP(ip);
		lb.removebackendserver();
		System.out.println("Instance with " + ip + " is deregistered from the LoadBalancer" );
		
		//delete the vms from the monitoring system
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		zabbix_obj.host_delete(zabi, ip);
		System.out.println("Instance with " + ip + " is deregistered from the MonitoringSystem" );
		
		instance.occiDelete();
		System.out.println("instance " + instance.getAttributes().get(1).getValue() + " is deleted from Vcenter");
	
		// Remove from model.
		Configuration config = OcciHelper.getConfiguration(instance);
		
		org.eclipse.cmf.occi.core.Resource src = link1.getSource();
		org.eclipse.cmf.occi.core.Resource target = link1.getTarget();
		
		if (src != null) {
			src.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no source !");
		}
		if (target != null) {
			target.getLinks().remove(link1);
		} else {
			System.out.println("Warning, the link : " + link1.getKind().getName() + " has no target !");
		}
		System.out.println("the link is removed");
		config.getResources().remove(instance);
		System.out.println("the instance configuration is removed");
	}
	
	
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
		for (int i=1; i <= getHorizontalgroupGroupSize(); i++) {
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
	
	private  void createConfigtemp(int oldGroupSize, ArrayList<String> LlinksIds) throws InterruptedException  {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		//int oldGroupSize = 2;
// this is for demo
		//		ArrayList<String> linksIds = new ArrayList<String>();
//		for (Link link : this.getLinks()) {
//			if(link.getTarget() instanceof Instancevmware) {
//				//oldGroupSize = oldGroupSize+1;
//				linksIds.add(link.getId());
//				
//			}
//		}
//		
//		for (String p : linksIds)
//		    System.out.println("existed instances : " + p );
//		
//		
//		for (int i=oldGroupSize+1; i <= getHorizontalGroupGroupSize(); i++) {
//			Configuration config = (Configuration)this.eContainer();
//			Instancegrouplink igl = HorizontalelasticityFactory.eINSTANCE.createInstancegrouplink();
//			Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
//			config.getResources().add(vm);
//			Horizontalgroup hgg = this;
//			igl.setSource(this);
//			igl.setTarget(vm);
//			System.out.println(igl);
//			System.out.println(vm);
//			
//			
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			i++;
//		}
		
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
		String vmname ;
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Instancevmware) {
				if(!LlinksIds.contains(link.getId())) { // try to deploy in the new created configuratio
					vmname = "node"+ index;
					System.out.println("will be deployed in the confiugration " + link.getId());
					Instancevmware inst = (Instancevmware)link.getTarget();
					System.out.println(" instance name " +  vmname);
					final String vmname1 = vmname;
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.setTitle(vmname1);
							inst.setOcciComputeState(ComputeStatus.ACTIVE);
							inst.setImagename("elasticoccidemo"); //templatelast
						}});
					System.out.print("instance  " + inst);
					inst.occiCreate();
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
		System.out.println("finsh, finsih finnnnnnnnnnnnsh");	
		for (Link link : this.getLinks()) { 
			if(link.getTarget() instanceof Instancevmware) {
				if(!LlinksIds.contains(link.getId())) {
					System.out.println("link fonnddddddd " + link.getId());
					Instancevmware inst = (Instancevmware)link.getTarget();
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.occiRetrieve();
						}});
					Thread.sleep(20000);
									
					while (inst.getAttributes().get(8).getValue().isEmpty()) { 
						String stateMessage = inst.getOcciComputeStateMessage();
						String gueststate = inst.getAttributes().get(4).getValue();
						if (!gueststate.equals("running")) {
							System.out.println("The machine is creating:  " + stateMessage + "   the machine state is:  " + gueststate);
						} else {
							System.out.println("Waiting for the machine to reboot and to get its DHCP ip");
						}
						domain.getCommandStack().execute(new RecordingCommand(domain) {
							@Override
							protected void doExecute() {
								inst.occiRetrieve();
							}});
						Thread.sleep(20000);
					}
					Loadbalancer lb = (Loadbalancer) this.getLinks().get(0).getTarget();  //register the ips in loadBlancer
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							lb.setLoadbalancerInstanceIP(inst.getAttributes().get(8).getValue());
						}});
					//lb.setLoadbalancerInstanceIP(inst.getAttributes().get(8).getValue());
					lb.addbackendserver();
					//register the vms in the monitoring system
					ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
					String zabi = zabbix_obj.connect();
			        String hostgroup = "Scalair scaling group";
					zabbix_obj.host_create(zabi, inst.getAttributes().get(1).getValue(), inst.getAttributes().get(8).getValue(), 10050, hostgroup, "Scalair Template OS Linux");
				}
				
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
					inst.setImagename("elasticoccidemo");
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
		if (getHorizontalgroupGroupSize() > getHorizontalgroupMaximum()) {
			System.out.println("The group size is bigger than the maximum limit of the group, the group size is set to the maximum group size" );
			setHorizontalgroupGroupSize(getHorizontalgroupMaximum());
        } else if (getHorizontalgroupGroupSize() < getHorizontalgroupMinimum()) {
        		System.out.println("The group size is smaller than the minimum limit of the group, the group size is set to the minimum group size" );

        } else {
        	System.out.println("it is ok, the groupSize is in the correct range" );
        }
        
	}
	
	protected void createInstanceandLinkConfig(int oldGroupSize) {
		for (int i=oldGroupSize+1; i <= getHorizontalgroupGroupSize(); i++) {
			Configuration config = (Configuration)this.eContainer();
			Instancegrouplink igl = HorizontalelasticityFactory.eINSTANCE.createInstancegrouplink();
			Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
			config.getResources().add(vm);
			igl.setSource(this);
			igl.setTarget(vm);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(" i= " + 1);	
		}
	}
	// End of user code

	//
	// Horizontalgroup actions.
	//

		


}	
