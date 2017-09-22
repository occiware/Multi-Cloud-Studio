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
 * Generated at Thu Sep 21 17:11:14 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
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
	
	ArrayList<String> instanceList = new ArrayList<String>();
	
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
	 */
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
		
		
		Compute inst = ((Compute)((this.getLinks()).get(0).getTarget()));
		final ExecutorService service = Executors.newCachedThreadPool();
		MyRunnable myRunnable = new MyRunnable() {
			public void run() {
				try { 
					inst.occiCreate();
				} catch(Exception e) {
					e.printStackTrace();
				}
				}
		};
		///MyRunnable myRunnable = new MyRunnable() {
			///try {
				///inst.occiCreate();
		   /// }
		    ///catch (Exception e) {
		        ///e.printStackTrace();
		    ///}
		///};
		//myRunnable.run();
		
		for (int i=1; i <= getHorizontalGroupGroupSize(); i++) {
			String vmName = "node"+i;
			System.out.println(vmName);
			instanceList.add(vmName);
			inst.setTitle(vmName);
			service.submit(myRunnable);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Thread thread = new Thread(myRunnable);
			//thread.start();
		}
		service.shutdown();
		System.out.println("Oh, it works after thread");
		
					
		//Compute vm = ((Compute)((Horizontalgroup) this.getEntity()).getLinks().get(0).getTarget());
		//Compute inst = ((Compute)((this.getLinks()).get(0).getTarget()));
		//inst.setTitle("yehiaDeletestp");
		//inst.occiCreate();
		//Compute inst2 = ((Compute)(this.getLinks().get(1).getTarget()));
		//String name  = this.getLinks().get(0).getTarget().getTitle();
		//inst.occiCreate();		
		//System.out.println(name);
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
		//ArrayList<String> instanceList = new ArrayList<String>();
		Compute inst = ((Compute)((this.getLinks()).get(0).getTarget()));
		while (!instanceList.isEmpty()) {
			String vmName = instanceList.get(instanceList.size() - 1);
			inst.setTitle(vmName);
			inst.occiDelete();
			instanceList.remove(instanceList.size() - 1);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
	 */
	@Override
	public void create()
	{
		LOGGER.debug("Action create() called on " + this);

		// TODO: Implement how to create this horizontalgroup.
		Compute inst = ((Compute)((this.getLinks()).get(0).getTarget()));
		//for (int i =1;i<=2; i++) {
			String vmName = "node1";
		try {
				inst.setTitle(vmName);
				inst.occiRetrieve();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int x=0; x<=10; x++) {
				System.out.println("attribute name " + inst.getAttributes().get(x).getName() + " attribute value " + inst.getAttributes().get(x).getValue());
			}
		//}
		
		
		
	///	inst.occiRetrieve();
		
		///IRunnableWithProgress op = new IRunnableWithProgress() {
			///  @Override
		      ///public void run(IProgressMonitor monitor) throws  InvocationTargetException, InterruptedException {
		        //try {
		        	///String gueststate = "notrunning";
					//String gueststate = inst.getAttributes().get(4).getValue();
					///while (!gueststate.equals("running")) {
						//gueststate = inst.getAttributes().get(4).getValue();
						///String stateMessage = inst.getOcciComputeStateMessage();
						///System.out.println("The machine is creating " + stateMessage);
						///Thread.sleep(10000);
						//inst.occiRetrieve();
						///doEditing(inst);
		        ///}
		      ///}
		    ///};

		   /// UIDialog.executeActionThread(op, "test");
		    
		    
		//MyRunnable myRunnable2 = new MyRunnable() {
			//public void run() {
			//	///try {
			//
			//		//Thread.sleep(1000); // wait one second until the machine information is retrieved, 
			//	
			//	String gueststate = "notrunning";
			//	//String gueststate = inst.getAttributes().get(4).getValue();
			//	while (!gueststate.equals("running")) {
			//		//gueststate = inst.getAttributes().get(4).getValue();
			//		String stateMessage = inst.getOcciComputeStateMessage();
			//		System.out.println("The machine is creating " + stateMessage);
			//		try {
			//			Thread.sleep(10000);
			//		} catch (InterruptedException e) {
			//			// TODO Auto-generated catch block
			//			e.printStackTrace();
			//		}
			//		//inst.occiRetrieve();
			//		doEditing(inst);
					
			//	}
			//}};
			//Thread thread = new Thread(myRunnable2);
			//thread.start();
						
			
			
				///while (inst.getAttributes().get(8).getValue().isEmpty()) {
					///System.out.println("Waiting for the machine to reboot and to get its DHCP ip");
					///try {
						///Thread.sleep(20000);
					///} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						///e.printStackTrace();
					///}
					///inst.occiRetrieve();
				///}
				///System.out.println("the machine ip is " + inst.getAttributes().get(8).getValue());
				 ///} catch (Exception e) {
						// TODO Auto-generated catch block
						///e.printStackTrace();
				  ///}
				
				///}};
				
				///Thread thread = new Thread(myRunnable2);
				///thread.start();
	}
		// End of user code

}	
