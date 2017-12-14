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

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: stepdynamicscalingpolicy
 * - title: 
 */
public class StepdynamicscalingpolicyConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicscalingpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StepdynamicscalingpolicyConnector.class);
	private static volatile boolean controller=true;
	// Start of user code Stepdynamicscalingpolicyconnector_constructor
	/**
	 * Constructs a stepdynamicscalingpolicy connector.
	 */
	StepdynamicscalingpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Stepdynamicscalingpolicy_Mixin_start_action
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
		Resource res = (Resource) this.eContainer();
		ElasticitycontrollerImpl elasticity = (ElasticitycontrollerImpl) res;
		ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)elasticity;
		
		for (Link link: ec.getLinks()) {
			MyRunnable myRunnable = new MyRunnable() {
				public void run() { 
					if (link != null && link.getTarget() instanceof Horizontalgroup) {
						startstepdynamic(ec);
					}
					if (link != null && link.getTarget() instanceof Instancevmware) {
						Compute vm = (Compute) link.getTarget();
						try {
							dynamicVertical(vm, ec);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};
			Thread thread = new Thread(myRunnable);
			thread.start();	
		}
	}
	// End of user code
	// Start of user code Stepdynamicscalingpolicy_Mixin_stop_action
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
		controller = false;
		System.out.println("stop is called");
	}
	// End of user code
	/////////// horizontal ////////////////////////
	protected void startstepdynamic(ElasticitycontrollerConnector ec) {
		Rule myRule = null;
		ArrayList<Step> arrlistofsteps= new ArrayList<Step>();
		for (Link link : ec.getLinks()) {
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
				//String ruleMetric = myRule.getRuleMetric().getName();
				String ruleMetric = "";
				EList<MixinBase> mixinsBase =myRule.getParts();
				for (MixinBase mixin:mixinsBase) {
					//System.out.println("mixin.getClass().getName() " + mixin.getClass().getName().substring(63).toLowerCase());
					ruleMetric = mixin.getClass().getName().substring(63).toLowerCase();
					System.out.print("mixin metric   " + ruleMetric );
				}
				
				int ruleperiod = myRule.getRulePeriod();
				int consecutive = myRule.getRuleConsecutive();
				
				String ruleoperator = myRule.getRuleOperator().getName();
				float threshold = myRule.getRuleThreshold();	
					
				Actiontrigger action = (Actiontrigger)myRule.getTarget();
				String actionname = action.getActiontriggerAction().getName();
				String actiontype = action.getActiontriggerActionType().getName();
				Float amount = action.getActiontriggerAmount();
				int coolduration = this.getDynamicscalingpolicyCoolDuration();
				
				////////////////////here call the action according to Rule and steps///////////////
				//double metrcUsage  = dp.getMetricUsage(ruleMetric, ruleperiod, consecutive); // get the metric utilization on an interval of (period) for a consecutive of (consecutive),
				double metrcUsage  =  ec.getMetricUsage(ruleMetric, ruleperiod, consecutive);
				/////////////// test the rule ///////////////////////////////////////
				if (ec.testRule(metrcUsage, ruleoperator, threshold)) {
					////////////////////here call the action according to Rule and steps///////////////
					if (arrlistofsteps.isEmpty()) {
						System.out.println("execute without steps");
						ec.action(actionname, actiontype, amount, coolduration);
					}
					else {
						System.out.println("execute  steps");
						for (Step element: arrlistofsteps) {
							float lower = element.getStepLowerStepBound() + threshold ;
							float upper = element.getStepUpperStepBound() + threshold;
							if (metrcUsage >=lower && metrcUsage <= upper) {
								float size1 = element.getStepSize();
								ec.action(actionname, actiontype, size1, coolduration);
							}
							System.out.print(50 + element.getStepLowerStepBound());
						}
					}		
				}
			} else {
				System.out.println("there is o rule associated");
			}	
		try {
			System.out.println("Wait  between loop  iterations to save CPU cycles");
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
	}

	////////////////   vertical ////////////////////	
	protected void dynamicVertical(Compute vm, ElasticitycontrollerConnector ec) throws InterruptedException {
		Rule myRule = null;
		ArrayList<Step> arrlistofsteps= new ArrayList<Step>();
		for (Link link : ec.getLinks()) {
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
				//String ruleMetric = myRule.getRuleMetric().getName();
				int coolduration = this.getDynamicscalingpolicyCoolDuration();  ///
				
				String ruleMetric = "";
				EList<MixinBase> mixinsBase =myRule.getParts();
				for (MixinBase mixin:mixinsBase) {
					//System.out.println("mixin.getClass().getName() " + mixin.getClass().getName().substring(63).toLowerCase());
					ruleMetric = mixin.getClass().getName().substring(63).toLowerCase();
					System.out.print("mixin metric   " + ruleMetric );
				}
					
				int ruleperiod = myRule.getRulePeriod();
				int consecutive = myRule.getRuleConsecutive();
				
				String ruleoperator = myRule.getRuleOperator().getName();
				float threshold = myRule.getRuleThreshold();	
					
				Actiontrigger action = (Actiontrigger)myRule.getTarget();
				String actionname = action.getActiontriggerAction().getName();
				String actiontype = action.getActiontriggerActionType().getName();
				Float amount = action.getActiontriggerAmount();				
				////////////////////here call the action according to Rule and steps///////////////
				////double metrcUsage  = dp.getMetricUsage(ruleMetric, ruleperiod, consecutive); // get the metric utilization on an interval of (period) for a consecutive of (consecutive),
				double metrcUsage   = ec.getMetricVertical( vm,  ruleMetric);
				/////////////// test the rule ///////////////////////////////////////
				if (ec.testRule(metrcUsage, ruleoperator, threshold)) {
					////////////////////here call the action according to Rule and steps////////
					if (arrlistofsteps.isEmpty()) {
						System.out.println("execute without steps");
						ec.actionVertical(vm, amount, ruleMetric, actionname, coolduration);
					}
					else {
						System.out.println("execute  steps");
						for (Step element: arrlistofsteps) {
							float lower = element.getStepLowerStepBound() + threshold ;
							float upper = element.getStepUpperStepBound() + threshold;
							if (metrcUsage >=lower && metrcUsage <= upper) {
								float size1 = element.getStepSize();
								ec.actionVertical(vm, size1, ruleMetric, actionname, coolduration);
							}
						}
					}		
				}
			} else {
				System.out.println("there is o rule associated");
			}	
		try {
			System.out.println("Wait  between loop  iterations to save CPU cycles");
			Thread.sleep(this.getDynamicscalingpolicyIterationWaitTime());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		}
		
	}


}	
