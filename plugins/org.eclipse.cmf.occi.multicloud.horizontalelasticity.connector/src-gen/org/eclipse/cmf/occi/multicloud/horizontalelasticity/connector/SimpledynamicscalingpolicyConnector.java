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

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.elasticocci.connector.MyRunnable;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: simpledynamicscalingpolicy
 * - title: 
 */
public class SimpledynamicscalingpolicyConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicscalingpolicyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SimpledynamicscalingpolicyConnector.class);
	private static volatile boolean bool=true;
	private static volatile boolean  verticalcontroller=true;

	// Start of user code Simpledynamicscalingpolicyconnector_constructor
	/**
	 * Constructs a simpledynamicscalingpolicy connector.
	 */
	SimpledynamicscalingpolicyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Simpledynamicscalingpolicy_Mixin_start_action
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
		bool = true;
		verticalcontroller = true;
		final Link linkObject = null;
		
		Resource res = (Resource) this.eContainer();
		ElasticitycontrollerImpl elasticity = (ElasticitycontrollerImpl) res;
		ElasticitycontrollerConnector ec = (ElasticitycontrollerConnector)elasticity;
		
		for (Link link : ec.getLinks()) {
			   //linkObject = link;
			   if (link != null && link.getTarget() instanceof Horizontalgroup) {
				   MyRunnable myRunnable = new MyRunnable() {
						public void run() {
							//////// main code //////
							while(bool) {
								startDynamic(ec);
								System.out.println("Wait  between loop  iterations to save CPU cycles");
								try {
									Thread.sleep(getDynamicscalingpolicyIterationWaitTime());
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
					};
					Thread thread = new Thread(myRunnable);
					thread.start();
			   }
			   
			   if (link != null && link.getTarget() instanceof Instancevmware) {
					MyRunnable myRunnable1 = new MyRunnable() {
						public void run() {
							while(verticalcontroller) {
								Compute vm = (Compute) link.getTarget();
								try {
									System.out.println("started");
									dynamicVertical(vm, ec);
									System.out.println("Wait  between loop  iterations to save CPU cycles");
									Thread.sleep(getDynamicscalingpolicyIterationWaitTime());
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
							}
						}
					};
					Thread thread1 = new Thread(myRunnable1);
					thread1.start();
				} 
			}	  

	}
	// End of user code
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
		System.out.println("\n stop is called now");
		bool = false;
		verticalcontroller = false;
		
	}
	// End of user code
	protected void startDynamic(ElasticitycontrollerConnector ec)
	{
		int removeRulesCount = 0;
		int removeRulesTrue = 0;
		ArrayList<Rule> actionList = new ArrayList<Rule>();
		int coolduration = this.getDynamicscalingpolicyCoolDuration();
		for (Link link : ec.getLinks()) {
			if (link instanceof Rule) {
				Rule myRule = (Rule) link;
				
				//String ruleMetric = myRule.getRuleMetric().getName();
				// get the rule metric mixin
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
				double metrcUsage  =  ec.getMetricUsage(ruleMetric, ruleperiod, consecutive);
				//double metrcUsage  =  getMetricUsage(ruleMetric, ruleperiod, consecutive);
				//double metrcUsage  = dp.getMetricUsage(ruleMetric, ruleperiod, consecutive);
				
				if (actionname.equals("add")) { // Rules that have add attributes in their actions
					if (ec.testRule(metrcUsage, ruleoperator, threshold)) {
						ec.action(actionname, actiontype, amount, coolduration);
					}
				}
				
				if (actionname.equals("remove")) { // Rules that have removes attributes in their actions
					removeRulesCount = removeRulesCount +1;
					if (ec.testRule(metrcUsage, ruleoperator, threshold)) {
						removeRulesTrue = removeRulesTrue + 1;
						actionList.add(myRule);
						//System.out.println(myRule);
						//System.out.println(action);
						//action(actionname, actiontype, amount, coolduration);
					}
				}
				
			}
		}
		
		if (removeRulesCount == removeRulesTrue && (removeRulesCount !=0 )) {  //all the rules that have remove rules are true
			Rule myRule  = actionList.get(actionList.size() - 1);
			Actiontrigger action = (Actiontrigger)myRule.getTarget();
			String actionname = action.getActiontriggerAction().getName();
			String actiontype = action.getActiontriggerActionType().getName();
			Float amount = action.getActiontriggerAmount();
			ec.action(actionname, actiontype, amount, coolduration);
		}		
	}
///////////////////////////// vertical /////////////////////////
	private void dynamicVertical(Compute vm, ElasticitycontrollerConnector ec) throws InterruptedException {
		int coolduration = this.getDynamicscalingpolicyCoolDuration();
		for (Link link : ec.getLinks()) {
			if (link instanceof Rule) {
				Rule myRule = (Rule) link;
				//String ruleMetric = myRule.getRuleMetric().getName();
				String ruleMetric = "";
				EList<MixinBase> mixinsBase =myRule.getParts();
				for (MixinBase mixin:mixinsBase) {
					System.out.println("mixin.getClass().getName() " + mixin.getClass().getName().substring(63).toLowerCase());
					ruleMetric = mixin.getClass().getName().substring(63).toLowerCase();
					System.out.print("mixin metric" + ruleMetric);
				}
				
				//int ruleperiod = myRule.getRulePeriod();
				//int consecutive = myRule.getRuleConsecutive();
				String ruleoperator = myRule.getRuleOperator().getName();
				float threshold = myRule.getRuleThreshold();	
				Actiontrigger action = (Actiontrigger)myRule.getTarget();
				String actionname = action.getActiontriggerAction().getName();
				//String actiontype = action.getActionType().getName();
				Float amount = action.getActiontriggerAmount();
				////double metrcUsage  =  getMetricUsage(ruleMetric, ruleperiod, consecutive);
				double metrcUsage   = ec.getMetricVertical( vm, ruleMetric);				
				if (ec.testRule(metrcUsage, ruleoperator, threshold)) {
					float size =  amount;
					ec.actionVertical(vm, size, ruleMetric, actionname, coolduration);
				}
			}
		}				
	}

}	
