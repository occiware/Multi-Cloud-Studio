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
 * Generated at Mon Dec 04 11:58:56 CET 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import java.util.ArrayList;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: stepdynamic
 * - title: 
 */
public class StepdynamicConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl
{
	/**
	 * Initialize the logger.
	 */
	private static volatile boolean controller=true;
	private static Logger LOGGER = LoggerFactory.getLogger(StepdynamicConnector.class);

	// Start of user code Stepdynamicconnector_constructor
	/**
	 * Constructs a stepdynamic connector.
	 */
	StepdynamicConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code StepdynamicocciCreate
	/**
	 * Called when this Stepdynamic instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Stepdynamic_occiRetrieve_method
	/**
	 * Called when this Stepdynamic instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Stepdynamic_occiUpdate_method
	/**
	 * Called when this Stepdynamic instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code StepdynamicocciDelete_method
	/**
	 * Called when this Stepdynamic instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Stepdynamic actions.
	//

	// Start of user code Stepdynamic_Kind_stop_action
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

		controller = false;
	}
	// End of user code
	// Start of user code Stepdynamic_Kind_start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/horizontalelasticcontroller/action#
     * - term: start
     * - title: 
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);
		MyRunnable myRunnable = new MyRunnable() {
			public void run() {
				startstepdynamic();
			}
		};
		Thread thread = new Thread(myRunnable);
		thread.start();	
	}
	// End of user code
	protected void startstepdynamic() {
		Rule myRule = null;
		ArrayList<Step> arrlistofsteps= new ArrayList<Step>();
		for (Link link : this.getLinks()) {
			if (link instanceof Rule) {
				myRule = (Rule) link;
			}
			if (link instanceof Steplink) {
				Step sp = (Step) link.getTarget();
				arrlistofsteps.add(sp);
			}
		}
		controller = true;
		while (controller) {
			if (myRule != null) {
				DynamicpolicyConnector dp = new DynamicpolicyConnector();
				String ruleMetric = myRule.getRuleMetric().getName();
				int ruleperiod = myRule.getRulePeriod();
				int consecutive = myRule.getRuleConsecutive();
				
				String ruleoperator = myRule.getRuleOperator().getName();
				float threshold = myRule.getRuleThreshold();	
					
				Actiontrigger action = (Actiontrigger)myRule.getTarget();
				String actionname = action.getAction().getName();
				String actiontype = action.getActionType().getName();
				Float amount = action.getAmount();
				int coolduration = this.getElasticityControllerCoolDuration();
				
				////////////////////here call the action according to Rule and steps///////////////
				double metrcUsage  = dp.getMetricUsage(ruleMetric, ruleperiod, consecutive); // get the metric utilization on an interval of (period) for a consecutive of (consecutive),
				/////////////// test the rule ///////////////////////////////////////
				if (testRule(metrcUsage, ruleoperator, threshold)) {
					////////////////////here call the action according to Rule and steps///////////////
					if (arrlistofsteps.isEmpty()) {
						System.out.println("execute without steps");
						action(actionname, actiontype, amount, coolduration);
					}
					else {
						System.out.println("execute  steps");
						for (Step element: arrlistofsteps) {
							float lower = element.getStepLowerStepBound() + threshold ;
							float upper = element.getStepUpperStepBound() + threshold;
							if (metrcUsage >=lower && metrcUsage <= upper) {
								Float size1 = element.getStepSize();
								action(actionname, actiontype, size1, coolduration);
							}
							System.out.print(50 + element.getStepLowerStepBound());
						}
					}		
				}
			} else {
				System.out.println("there is o rule associated");
			}	
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
	}
	
	public void action( String action, String actionType, float amount, int coolduration)
	{
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this);
		//DynamicConnector dc = new DynamicConnector();
		Horizontalgroup hg =  getHorzontalgroup();
		int numberofinstances;
		int currentInstance = hg.getHorizontalGroupGroupSize();
		if (action.equals("add")) {
			System.out.println("You are going to add more resources");
			if(actionType.equals("instanceCount")) {
				System.out.println("You are going to add more resources according to " + actionType);
				numberofinstances = (int) amount;
				System.out.println(" nubmer of instances to ba added " + numberofinstances);
				System.out.println(" The group size will become  " + (numberofinstances + currentInstance));
				//hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
				//hg.occiUpdate();
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
						hg.occiUpdate();
					}});
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to add more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				//hg.setHorizontalGroupGroupSize(currentInstance + numberofinstances);
				//hg.occiUpdate();
				System.out.println("\n the number of inatances will be " + (currentInstance + numberofinstances));
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
						hg.occiUpdate();
					}});
			}
			
		}
		
		else if(action.equals("remove")) {
			System.out.println("You are going to delete Resources");
			if(actionType.equals("instanceCount")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				numberofinstances = (int) amount;
				System.out.println("You are going to remove " + amount + " instance");
				System.out.println(" The group size will become  " + ( currentInstance - numberofinstances));
				//hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
				//hg.occiUpdate();
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
						hg.occiUpdate();
					}});
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
				System.out.println("\n the number of instances or groupsize will be:" + (currentInstance - numberofinstances));
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
						hg.occiUpdate();
					}});
			}
		}
		System.out.print("wait, cool duration");
		try {
			Thread.sleep(coolduration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Horizontalgroup getHorzontalgroup()
	{
		LOGGER.debug("Action start() called on " + this);
		Horizontalgroup hg = null;
		for (Link link : this.getLinks()) {
			if (link.getTarget() instanceof Horizontalgroup) { // && linkedGroup instanceof Horizontalgroup) {
				   hg = (Horizontalgroup) link.getTarget();
				   System.out.println(hg);
				}  
		}
		if (hg ==null) {
			System.out.println("Can't find the horizontalgroup");
		}
		return hg;
	}
	
	public boolean testRule ( double metricUtilization, String op, float threshold) {
		boolean testoutput = false;
		if (op.equals("GraterThan")){
			if  (metricUtilization > threshold){
				testoutput =  true;	
			}
		} else if (op.equals("GreaterThanorEqualto")){
			if  (metricUtilization >= threshold){
				testoutput =  true;
			}
		} else if (op.equals("LessThan")){
			if  (metricUtilization < threshold){
				testoutput =  true;
			}
		} else if (op.equals("LessThanorEqualto")){
			if  (metricUtilization <= threshold){
				testoutput =  true;
			}
		} else if (op.equals("Equalto")){
			if  (metricUtilization == threshold){
				testoutput =  true;
			}
		} else if (op.equals("NotEqualto")){
			if  (metricUtilization != threshold){
				testoutput =  true;
			}
		}			
		
	return testoutput;	
	}	


}	
