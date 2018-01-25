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

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: manualscalingpolicy
 * - title: 
 */
public class ManualscalingpolicyConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualscalingpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ManualscalingpolicyConnector.class);

	// Start of user code Manualscalingpolicyconnector_constructor
	/**
	 * Constructs a manualscalingpolicy connector.
	 */
	ManualscalingpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Manualscalingpolicy_Mixin_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/policy/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		System.out.println("your are in the correct start");
		Horizontalgroup hg = null;
		Compute vm = null;
		Resource res = (Resource) this.eContainer();
		ElasticitycontrollerImpl elasticity = (ElasticitycontrollerImpl) res;
		ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)elasticity;
		
		for (Link link : ec.getLinks()) {
			if (link != null && link.getTarget() instanceof Horizontalgroup) {
				hg = (Horizontalgroup) link.getTarget();
				break;
			}
			else if (link != null && link.getTarget() instanceof Instancevmware) {
				 vm = (Compute)link.getTarget();
				break;
			}
		}
		
		if (hg !=null) {
			if ((getManualscalingpolicyDesiredSize() != 0) && (getManualscalingpolicyDesiredSize() != null)) {
				// doEditing(hg, getManualGroupSize());
				// ((HorizontalgroupConnector) hg).doEditing22(getManualGroupSize());
				float manualDesiredSize = getManualscalingpolicyDesiredSize();
				hg.setHorizontalgroupGroupSize((int)manualDesiredSize);
			}		   
			if ((ec.getElasticitycontrollerMaximumLimit() != 0) && (ec.getElasticitycontrollerMaximumLimit() != null)) {
					hg.setHorizontalgroupMaximum((int)ec.getElasticitycontrollerMaximumLimit());
					System.out.println(" Max size from elasticity controller" +(int)ec.getElasticitycontrollerMaximumLimit());
			}
		   
			if ((ec.getElasticitycontrollerMinimumLimit() != 0) && (ec.getElasticitycontrollerMinimumLimit() != null)) {
					hg.setHorizontalgroupMinimum((int)ec.getElasticitycontrollerMinimumLimit());
			}
			//Horizontalgroup hgg =hg;
			//final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
			//domain.getCommandStack().execute(new RecordingCommand(domain) {
			//	@Override
			//	protected void doExecute() {
			//		hgg.occiUpdate();
			//	}});
			hg.occiUpdate();
			
		} else if (vm!=null) {
			String computeUnit = this.getManualscalingpolicyComputeUnit();
			System.out.println("Comput unite " + computeUnit);
			manual(computeUnit, vm, ec); 
		} else {
			System.out.println("there is no link to any resource");
		}
		

	}
	// End of user code
	// Start of user code Manualscalingpolicy_Mixin_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/policy/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this manualscalingpolicy.
	}
	// End of user code
	private void manual( String computeUnit, Compute vm, ElasticitycontrollerConnector ec) {
		int cpus = vm.getOcciComputeCores();
		switch (computeUnit) {
        	case "cpu":	
        		System.out.println("current vCPUs are: " + cpus);
        		if (getManualscalingpolicyDesiredSize() <= ec.getElasticitycontrollerMaximumLimit() && getManualscalingpolicyDesiredSize() >= ec.getElasticitycontrollerMinimumLimit()) {
        			float cpuNum =  getManualscalingpolicyDesiredSize();
        			vm.setOcciComputeCores((int)cpuNum);
        			vm.occiUpdate();
        			vm.occiRetrieve();
        			System.out.println("the number of vcores becomes: " + vm.getOcciComputeCores());
        		} else {
        			System.out.println("can't go beyond the limits");
        		}
            break;
        		
        	case "memory":
        		float memSize = vm.getOcciComputeMemory();
        		System.out.println("current Memory is : " + memSize);
        		if (getManualscalingpolicyDesiredSize() <= ec.getElasticitycontrollerMaximumLimit() && getManualscalingpolicyDesiredSize() >= ec.getElasticitycontrollerMinimumLimit()) {	
        			vm.setOcciComputeMemory(getManualscalingpolicyDesiredSize());
        			vm.occiUpdate();
        			vm.occiRetrieve();
        			System.out.println("the Memory size becomes " + vm.getOcciComputeMemory() + "GB");
        		} else {
        			System.out.println("can't go beyond the limits");
        		}
            break;
        default: 
        		System.out.println("Enter correct cmpoute unit");
        break;
		}
		
	}	


}	
