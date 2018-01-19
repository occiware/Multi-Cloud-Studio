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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
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
		if (getHorizontalgroupGroupSize() > getHorizontalgroupMaximum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMaximum());
		}
		
		if (getHorizontalgroupGroupSize() < getHorizontalgroupMinimum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMinimum());
		}
		
		int vmIndex1=1;
		final ExecutorService service = Executors.newCachedThreadPool();
		///final ExecutorService service = Executors.newSingleThreadExecutor();
		////Set<Runnable> runnables = new HashSet<Runnable>();
		for (int i=1; i <= getHorizontalgroupGroupSize(); ++i) {
			int vmIndex = vmIndex1;
			MyRunnable myRunnable = new MyRunnable() {
				public void run() {
					try {
						createGroup(vmIndex);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			///service.execute(myRunnable);
			service.submit(myRunnable);
			//service.invokeAll(myRunnable);
			try {
				Thread.sleep(5000); // wait 5 seconds to allows threads to be created
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			vmIndex1++;	
		}
	////	for (int i=1; i <= getHorizontalgroupGroupSize(); ++i) {
	////		int vmIndex = vmIndex1;
	////		MyRunnable myRunnable = new MyRunnable() {
	////				public void run() {
	////					try {
	////						createGroup(vmIndex);
	////					} catch (InterruptedException e) {
	////						e.printStackTrace();
	////					}
	////				}
	////			};
	////			Thread thread = new Thread(myRunnable);
	////			thread.start();
	////		vmIndex1++;	
	////		try {
	////			thread.sleep(1000);
	////		} catch (InterruptedException e) {
	////			// TODO Auto-generated catch block
	////			e.printStackTrace();
	////		}
	////	}
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
		//for (int i=1; i <= getHorizontalgroupGroupSize(); ++i) {
		//	createLinksAndConfig();
		//	try {
		//		Thread.sleep(1000);
		//	} catch (InterruptedException e) {
		//		// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	}
		//}
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
		for (Link link1 : this.getLinks()) {
			++i;
			System.out.println("out of the loop" + i);
			if(link1.getTarget() instanceof Instancevmware) {
				try {
					System.out.println("vmware link found" + i);
					Instancevmware instance = (Instancevmware)link1.getTarget();
					// Remove from model.
					Configuration config = OcciHelper.getConfiguration(instance);					
					org.eclipse.cmf.occi.core.Resource src = link1.getSource();
					org.eclipse.cmf.occi.core.Resource target = link1.getTarget();
										
					System.out.println("the link is removed");
					config.getResources().remove(instance);
					System.out.println("the instance configuration is removed");
					if (src != null) {
					//	src.getLinks().remove(link1);
					src.getLinks().clear();
					} else {
						System.out.println("Warning, the link : " + link1.getKind().getName() + " has no source !");
					}
					if (target != null) {
						//target.getLinks().remove(link1);
						target.getLinks().clear();
						//Iterator it = src.getLinks().iterator();
						//while (it.hasNext()) {
						//	it.remove();
						//}
					} else {
						System.out.println("Warning, the link : " + link1.getKind().getName() + " has no target !");
					}
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
					//vmname = "node"+ index;
					vmname = "flask"+ index;
					System.out.println("will be deployed in the confiugration " + link.getId());
					Instancevmware inst = (Instancevmware)link.getTarget();
					System.out.println(" instance name " +  vmname);
					final String vmname1 = vmname;
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							inst.setTitle(vmname1);
							inst.setOcciComputeState(ComputeStatus.ACTIVE);
							//inst.setImagename("elasticoccidemo"); //templatelast
							inst.setImagename("flasktemplate");
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
	
	private void updateDecrease(int instanceNum) {
		//int instanceNum = 1;
		ArrayList<Link>  arrayLinks = null;
		//int i = 1;
		for (Link link : this.getLinks()) {
			if(link.getTarget() instanceof Instancevmware) { //if((link.getTarget() instanceof Instancevmware) && i <=instanceNum) 
				arrayLinks.add(link);
			}
		}
		
		for (int i = 0; i>= instanceNum; ++i) {
			Link link1 = arrayLinks.get(arrayLinks.size() - 1);
			deleteInstance(link1);
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

/////////////////////////////// new organization ////////////// occicreate 
	private Link createConfig() {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		Link link = null;
		Link link1 = null;
		Configuration config = (Configuration)this.eContainer();
		Instancegrouplink igl = HorizontalelasticityFactory.eINSTANCE.createInstancegrouplink();
		Instancevmware vm = VmwareFactory.eINSTANCE.createInstancevmware();
		Horizontalgroup hg = this;
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				config.getResources().add(vm);
				igl.setSource(hg);
				igl.setTarget(vm);
			}});
		
		//igl.setSource(this);
		//igl.setTarget(vm);
		//System.out.println(igl);
		//System.out.println(vm);
		link1 = igl;
		if (link1 !=null) {
			System.out.println(link1);
			System.out.println(vm);
			link = link1;
		}
		return link;
	}
	
	private String getIP(Link link) throws InterruptedException  { 
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		String ipp = "";
		String ip = "";
		Instancevmware inst = (Instancevmware)link.getTarget();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				Instancevmware inst = (Instancevmware)link.getTarget();
				inst.occiRetrieve();
			}});
		//inst.occiRetrieve();
		Thread.sleep(20000);
		while (inst.getAttributes().get(8).getValue().isEmpty()) { 
			String stateMessage = inst.getOcciComputeStateMessage();
			String gueststate = inst.getAttributes().get(4).getValue();
			if (!gueststate.equals("running")) {
				System.out.println("The machine is creating:  " + stateMessage + "  the machine state is: " + gueststate);
			} else {
				System.out.println("Waiting for the machine to reboot and to get its DHCP ip");
			}
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					Instancevmware inst = (Instancevmware)link.getTarget();
					try {
						inst.occiRetrieve();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}});
			Thread.sleep(20000);
		}
		ipp = inst.getAttributes().get(8).getValue();
		if (!ipp.isEmpty()) {
			ip =ipp;
			System.out.println("node  " +inst.getAttributes().get(1).getValue() + " ip  " +  inst.getAttributes().get(8).getValue());
		} else {
			System.out.print("ip not found");
		}
		
		return ip;
	}
	
	private void registerinLBandMonitoring(String ip, String vmname) {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		Loadbalancer lb = null;
		for(Link link: this.getLinks()) {
			if((link.getTarget() instanceof Loadbalancer) &&  link.getTarget() !=null) {
				lb = (Loadbalancer) link.getTarget();
			}
		}
		final Loadbalancer LB  = lb;
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				LB.setLoadbalancerInstanceIP(ip);
			}});
		//lb.setLoadbalancerInstanceIP(ip);
		LB.addbackendserver();
		
		//register the vms in the monitoring system
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		String hostgroup = "Scalair scaling group";
		zabbix_obj.host_create(zabi, vmname, ip, 10050, hostgroup, "Scalair Template OS Linux");
	}
	
	private void createGroup(int vmIndex) throws InterruptedException {
		
		//create config
		Link link = createConfig();
		Thread.sleep(10000);
			
		//create vm
		//String vmName = "node"+vmIndex;
		String vmName = "flask"+vmIndex;
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
		Instancevmware inst = (Instancevmware)link.getTarget();
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				inst.setTitle(vmName);
				inst.setOcciComputeState(ComputeStatus.ACTIVE);
				//inst.setImagename("elasticoccidemo");
				inst.setImagename("flasktemplate");
			}});
		//String vmName = "node"+vmIndex;
		//Instancevmware inst = (Instancevmware)link.getTarget();
		//inst.setTitle(vmName);
		//inst.setOcciComputeState(ComputeStatus.ACTIVE);
		//inst.setImagename("elasticoccidemo");
		inst.occiCreate();
		//vmIndex++;
			
		// get ip
		String ip = "";
		try {
			ip = getIP(link);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		// register
		registerinLBandMonitoring(ip, vmName); 
		
	}
	
	private void createGroup1111() throws InterruptedException {
		if (getHorizontalgroupGroupSize() > getHorizontalgroupMaximum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMaximum());
		}
		
		if (getHorizontalgroupGroupSize() < getHorizontalgroupMinimum()) {
			setHorizontalgroupGroupSize(getHorizontalgroupMinimum());
		}
		
		int vmIndex=1;
		for (int i=1; i <= getHorizontalgroupGroupSize(); ++i) {
			//create config
			
			Link link = createConfig();
			Thread.sleep(5000);
			
			//create vm
			String vmName = "node"+vmIndex;
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);	
			Instancevmware inst = (Instancevmware)link.getTarget();
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					inst.setTitle(vmName);
					inst.setOcciComputeState(ComputeStatus.ACTIVE);
					///inst.setImagename("elasticoccidemo");
					inst.setImagename("flasktemplate");
				}});
			//String vmName = "node"+vmIndex;
			//Instancevmware inst = (Instancevmware)link.getTarget();
			//inst.setTitle(vmName);
			//inst.setOcciComputeState(ComputeStatus.ACTIVE);
			//inst.setImagename("elasticoccidemo");
			inst.occiCreate();
			vmIndex++;
			
			// get ip
			String ip = "";
			try {
				ip = getIP(link);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// register
			registerinLBandMonitoring(ip, vmName); 
		}
	}
}	


