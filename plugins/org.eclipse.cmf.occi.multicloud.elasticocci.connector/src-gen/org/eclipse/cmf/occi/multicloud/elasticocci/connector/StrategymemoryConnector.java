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

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.elasticocci.Elasticcontroller;
import org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticcontrollerImpl;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Cpuusage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Memoryusage;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
 * - term: strategymemory
 * - title: 
 */
public class StrategymemoryConnector extends org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StrategymemoryConnector.class);

	// Start of user code Strategymemoryconnector_constructor
	/**
	 * Constructs a strategymemory connector.
	 */
	StrategymemoryConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Strategymemory_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/elasticocci/strategymemory/action#
     * - term: stop
     * - title: 
	 */
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
	
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this strategymemory.
	}
		// End of user code

	// Start of user code Strategymemory_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/elasticocci/strategymemory/action#
     * - term: start
     * - title: 
	 */
	private void manuel( String dir, Compute vm) {
//		Vertical vmconnector = new Vertical();
		float memSize = vm.getOcciComputeMemory();
		switch (dir) {
        	case "up":	
        		System.out.println("current Memory is : " + memSize);
        		memSize = (float) (memSize + getStrategyMemoryStepMemIncrease());
        		if (memSize <= getStrategyMemoryUpperLimit()) {		
        			vm.setOcciComputeMemory(memSize);
        			vm.occiUpdate();
        			vm.occiRetrieve();
        			System.out.println("you have increased your Memory size by " + getStrategyMemoryStepMemIncrease());
        		} else {
        			System.out.println("You can't add more cpus to this VM, you have arrived the maximum limit");
        		}
            break;
            
        case "down":
        	memSize = (float) (memSize - getStrategyMemoryStepMemIncrease());
        		if (memSize >= getStrategyMemoryUpperLimit()) {
        			vm.setOcciComputeMemory(memSize);
        			vm.occiUpdate();
        			vm.occiRetrieve();
        			System.out.println("Sorry, you can't scale down in VMWare technology, please wait until we add more conncetors in OCCIware such as KVM");
        		} else {
        			System.out.println("You can't add more cpus to this VM, you have arrived the minmum lower limit");
        		}
        		
            break;
        default: 
        		System.out.println("Enter correct direction, we have only up and down");
        break;
		}
		
	}
	
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// TODO: Implement how to start this strategymemory.
		Compute vm = ((Compute)((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget());
		String vmname = ((Elasticcontroller) this.getEntity()).getLinks().get(0).getTarget().getAttributes().get(1).getValue();
		switch (getStrategyMemoryMode().getName()) {
		case "manual":
			manuel((getStrategyMemoryDirection().getName()), vm);
			break;
		}
	}
	
	protected double mmemUsage()
	{
		double memUsage = 0.0;
		Resource res = (Resource) this.eContainer();
		ElasticcontrollerImpl cpucontroller = (ElasticcontrollerImpl) res;
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		
		for (Link link:cpucontroller.getLinks()) {
			if (link.getTarget() instanceof Zabbixinstance) {
				if (link.getTarget() != null) {
					Zabbixinstance zabbix = (Zabbixinstance) link.getTarget();
					Memoryusage memUsageMetric = (Memoryusage) zabbix.getParts().get(1);
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							memUsageMetric.getmetric();
						}});
					///System.out.println("cpu usage ..........." + cpuUsageMetric.getCpuUsageCpuUsage());
					memUsage = memUsageMetric.getMemoryUsageMemUsage();

				}
			}
		}
		return memUsage;
	}
	
		// End of user code

}	
