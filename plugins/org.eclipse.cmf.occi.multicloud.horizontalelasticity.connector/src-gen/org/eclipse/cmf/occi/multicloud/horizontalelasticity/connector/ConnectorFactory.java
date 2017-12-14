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

/**
 * Connector EFactory for the OCCI extension:
 * - name: horizontalelasticity
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: horizontalgroup
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup createHorizontalgroup() {
		return new HorizontalgroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: loadbalancer
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer createLoadbalancer() {
		return new LoadbalancerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: elasticitycontroller
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller createElasticitycontroller() {
		return new ElasticitycontrollerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: instancegrouplink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink createInstancegrouplink() {
		return new InstancegrouplinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: loadbalancerlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancerlink createLoadbalancerlink() {
		return new LoadbalancerlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: elasticlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticlink createElasticlink() {
		return new ElasticlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: rule
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule createRule() {
		return new RuleConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: actiontrigger
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger createActiontrigger() {
		return new ActiontriggerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: step
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step createStep() {
		return new StepConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: steplink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink createSteplink() {
		return new SteplinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: creation
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation createCreation() {
		return new CreationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: schedulingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy createSchedulingpolicy() {
		return new SchedulingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: uniqueschedulingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy createUniqueschedulingpolicy() {
		return new UniqueschedulingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: recurringschedulingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy createRecurringschedulingpolicy() {
		return new RecurringschedulingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: scalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy createScalingpolicy() {
		return new ScalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: dynamicscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy createDynamicscalingpolicy() {
		return new DynamicscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: dynamicadjustmentscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy createDynamicadjustmentscalingpolicy() {
		return new DynamicadjustmentscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: simpledynamicscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamicscalingpolicy createSimpledynamicscalingpolicy() {
		return new SimpledynamicscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: stepdynamicscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamicscalingpolicy createStepdynamicscalingpolicy() {
		return new StepdynamicscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: manualscalingpolicy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manualscalingpolicy createManualscalingpolicy() {
		return new ManualscalingpolicyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: metric
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Metric createMetric() {
		return new MetricConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: cpuutilisation
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Cpuutilisation createCpuutilisation() {
		return new CpuutilisationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: memoryutilisation
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Memoryutilisation createMemoryutilisation() {
		return new MemoryutilisationConnector();
	}

}
