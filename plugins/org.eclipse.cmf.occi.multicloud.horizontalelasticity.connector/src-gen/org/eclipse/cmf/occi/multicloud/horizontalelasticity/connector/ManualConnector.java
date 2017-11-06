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
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: manual
 * - title: 
 */
public class ManualConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ManualConnector.class);

	// Start of user code Manualconnector_constructor
	/**
	 * Constructs a manual connector.
	 */
	ManualConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}

	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ManualocciCreate
	/**
	 * Called when this Manual instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		System.out.print("hope it works");
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Manual_occiRetrieve_method
	/**
	 * Called when this Manual instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Manual_occiUpdate_method
	/**
	 * Called when this Manual instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ManualocciDelete_method
	/**
	 * Called when this Manual instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
		System.out.println(this.getKind().getParent());
	}
	// End of user code

	//
	// Manual actions.
	//

	// Start of user code Manual_Kind_stop_action
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

		// TODO: Implement how to stop this manual.
	}
	// End of user code
	// Start of user code Manual_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalelasticcontroller/action#
     * - term: start
     * - title: 
	 */
	public void doEditing(EObject element, int value) {
		//final Machine machine = this;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                TransactionalEditingDomain ted = 
                	TransactionUtil.getEditingDomain(element);
                ted.getCommandStack().execute(new RecordingCommand(ted) 
                	{
                 @Override
                 protected void doExecute() {
                	 element.eSet(element.eClass().getEStructuralFeature("horizontalGroupGroupSize"), value);
                }
                });
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
	public void doEditing44(EObject element, int value) {
		System.out.println("titi " + element);
	    // Make sure your element is attached to a source, otherwise this will return null
	    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
		///TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain((ResourceSet) element);
	    System.out.println("tata " + domain);
	    domain.getCommandStack().execute(new RecordingCommand(domain) {

	        @Override
	        protected void doExecute() {
	            // Implement your write operations here,
	            // for example: set a new name
	        		//((Horizontalgroup)element).setHorizontalGroupGroupSize(value);
	        		System.out.println("element " +element);
	        		System.out.println("getfeature " +element.eClass().getEStructuralFeature("horizontalGroupGroupSize"));
	            element.eSet(element.eClass().getEStructuralFeature("horizontalGroupGroupSize"), value);
	            //((Compute)element).setOcciComputeCores(size);
	            //((Compute)element).occiRetrieve();
	        }
	    });
	}
	
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		System.out.println("your are in the correct start");
		Horizontalgroup hg = null;
		Link linkedGroup = null;
		
		for (Link link : this.getLinks()) {
		   linkedGroup = link;
		}
		if (linkedGroup != null) {
		   hg = (Horizontalgroup) linkedGroup.getTarget();
		   //System.out.println("hg "+ hg);
		   //System.out.println("getManualGroupSize() "+getManualGroupSize());
		   if ((getManualGroupSize() != 0) && (getManualGroupSize() != null)) {
			   System.out.println("toto");
			  // doEditing(hg, getManualGroupSize());
			  // ((HorizontalgroupConnector) hg).doEditing22(getManualGroupSize());
				hg.setHorizontalGroupGroupSize(getManualGroupSize());
			}		   
		   if ((getManualMaxGroupSize() != 0) && (getManualMaxGroupSize() != null)) {
				hg.setHorizontalGroupMaximum(getManualMaxGroupSize());
			}
	   
			if ((getManualMinGroupSize() != 0) && (getManualMinGroupSize() != null)) {
				hg.setHorizontalGroupMinimum(getManualMinGroupSize());
			}
			
			//hg.occiUpdate();

		} else {
			System.out.println("Cant find the horizontalgroup");
		  }
	}
	// End of user code
}	
