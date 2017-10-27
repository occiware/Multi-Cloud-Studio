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

import java.util.ArrayList;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: simpledynamic
 * - title: 
 */
public class SimpledynamicConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SimpledynamicConnector.class);

	// Start of user code Simpledynamicconnector_constructor
	/**
	 * Constructs a simpledynamic connector.
	 */
	SimpledynamicConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code SimpledynamicocciCreate
	/**
	 * Called when this Simpledynamic instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Simpledynamic_occiRetrieve_method
	/**
	 * Called when this Simpledynamic instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Simpledynamic_occiUpdate_method
	/**
	 * Called when this Simpledynamic instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code SimpledynamicocciDelete_method
	/**
	 * Called when this Simpledynamic instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Simpledynamic actions.
	//

	// Start of user code Simpledynamic_Kind_stop_action
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

		// TODO: Implement how to stop this simpledynamic.
	}
	// End of user code
	// Start of user code Simpledynamic_Kind_start_action
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
		
		//Horizontalgroup hg = null;
		int removeRulesCount = 0;
		int removeRulesTrue = 0;
		ArrayList<Rule> actionList = new ArrayList<Rule>();
		int coolduration = this.getSimpleDynamicCoolDuration();
		for (Link link : this.getLinks()) {
			if (link instanceof Rule) {
				Rule myRule = (Rule) link;
				
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
				
				double metrcUsage  = dp.getMetricUsage(ruleMetric, ruleperiod, consecutive);
				
				if (actionname.equals("add")) { // Rules that have add attributes in their actions
					if (testRule(metrcUsage, ruleoperator, threshold)) {
						action(actionname, actiontype, amount, coolduration);
					}
				}
				
				if (actionname.equals("remove")) { // Rules that have removes attributes in their actions
					removeRulesCount = removeRulesCount +1;
					if (testRule(metrcUsage, ruleoperator, threshold)) {
						removeRulesTrue = removeRulesTrue + 1;
						actionList.add(myRule);
						//System.out.println(myRule);
						//System.out.println(action);
						//action(actionname, actiontype, amount, coolduration);
					}
				}
				
			}
		}
		
		if (removeRulesCount == removeRulesTrue) {  //all the rules that have remove rules are true
			Rule myRule  = actionList.get(actionList.size() - 1);
			Actiontrigger action = (Actiontrigger)myRule.getTarget();
			String actionname = action.getAction().getName();
			String actiontype = action.getActionType().getName();
			Float amount = action.getAmount();
			action(actionname, actiontype, amount, coolduration);
		}

		// TODO: Implement how to start this simpledynamic.
	}
	
	/////////////////////// action /////////////
	public void action( String action, String actionType, float amount, int coolduration)
	{
		//DynamicConnector dc = new DynamicConnector();
		Horizontalgroup hg =  getHorzontalgroup();
		int numberofinstances = 0;
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
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to add more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				//hg.setHorizontalGroupGroupSize(currentInstance + numberofinstances);
				//hg.occiUpdate();
				System.out.println("\n the number of inatances will be " + (currentInstance + numberofinstances));
			}
			
		}
		
		else if(action.equals("remove")) {
			System.out.println("You are going to delete Resources");
			if(actionType.equals("instanceCount")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				numberofinstances = (int) amount;
				System.out.println("You are going to remove " + amount + " instance");
				System.out.println(" The group size will become  " + (currentInstance  - numberofinstances));
				//hg.setHorizontalGroupGroupSize(numberofinstances + currentInstance);
				//hg.occiUpdate();
			} else if(actionType.equals("percent")) {
				System.out.println("You are going to remove more resources according to " + actionType);
				System.out.print("\n current instance are :" + currentInstance);
				numberofinstances = (int) (currentInstance * (amount/100));
				hg.setHorizontalGroupGroupSize(currentInstance - numberofinstances);
				System.out.println("\n the number of instances or groupsize will be:" + (currentInstance - numberofinstances));
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
	
	//////////////////////////
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
	// End of user code
		


}	
