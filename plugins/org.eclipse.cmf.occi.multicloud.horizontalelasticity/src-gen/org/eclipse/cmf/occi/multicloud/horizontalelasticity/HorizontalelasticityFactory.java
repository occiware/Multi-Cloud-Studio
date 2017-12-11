/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage
 * @generated
 */
public interface HorizontalelasticityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HorizontalelasticityFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Recurrence Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurrence Step</em>'.
	 * @generated
	 */
	RecurrenceStep createRecurrenceStep();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	Array createArray();

	/**
	 * Returns a new object of class '<em>Arrof Rec Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrof Rec Step</em>'.
	 * @generated
	 */
	ArrofRecStep createArrofRecStep();

	/**
	 * Returns a new object of class '<em>Horizontalgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontalgroup</em>'.
	 * @generated
	 */
	Horizontalgroup createHorizontalgroup();

	/**
	 * Returns a new object of class '<em>Loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loadbalancer</em>'.
	 * @generated
	 */
	Loadbalancer createLoadbalancer();

	/**
	 * Returns a new object of class '<em>Elasticitycontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elasticitycontroller</em>'.
	 * @generated
	 */
	Elasticitycontroller createElasticitycontroller();

	/**
	 * Returns a new object of class '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancegrouplink</em>'.
	 * @generated
	 */
	Instancegrouplink createInstancegrouplink();

	/**
	 * Returns a new object of class '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loadbalancerlink</em>'.
	 * @generated
	 */
	Loadbalancerlink createLoadbalancerlink();

	/**
	 * Returns a new object of class '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elasticlink</em>'.
	 * @generated
	 */
	Elasticlink createElasticlink();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Actiontrigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actiontrigger</em>'.
	 * @generated
	 */
	Actiontrigger createActiontrigger();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steplink</em>'.
	 * @generated
	 */
	Steplink createSteplink();

	/**
	 * Returns a new object of class '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation</em>'.
	 * @generated
	 */
	Creation createCreation();

	/**
	 * Returns a new object of class '<em>Schedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedulingpolicy</em>'.
	 * @generated
	 */
	Schedulingpolicy createSchedulingpolicy();

	/**
	 * Returns a new object of class '<em>Uniqueschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniqueschedulingpolicy</em>'.
	 * @generated
	 */
	Uniqueschedulingpolicy createUniqueschedulingpolicy();

	/**
	 * Returns a new object of class '<em>Recurringschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurringschedulingpolicy</em>'.
	 * @generated
	 */
	Recurringschedulingpolicy createRecurringschedulingpolicy();

	/**
	 * Returns a new object of class '<em>Scalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalingpolicy</em>'.
	 * @generated
	 */
	Scalingpolicy createScalingpolicy();

	/**
	 * Returns a new object of class '<em>Dynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamicscalingpolicy</em>'.
	 * @generated
	 */
	Dynamicscalingpolicy createDynamicscalingpolicy();

	/**
	 * Returns a new object of class '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * @generated
	 */
	Dynamicadjustmentscalingpolicy createDynamicadjustmentscalingpolicy();

	/**
	 * Returns a new object of class '<em>Simpledynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simpledynamicscalingpolicy</em>'.
	 * @generated
	 */
	Simpledynamicscalingpolicy createSimpledynamicscalingpolicy();

	/**
	 * Returns a new object of class '<em>Stepdynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stepdynamicscalingpolicy</em>'.
	 * @generated
	 */
	Stepdynamicscalingpolicy createStepdynamicscalingpolicy();

	/**
	 * Returns a new object of class '<em>Manualscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manualscalingpolicy</em>'.
	 * @generated
	 */
	Manualscalingpolicy createManualscalingpolicy();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Cpuutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpuutilisation</em>'.
	 * @generated
	 */
	Cpuutilisation createCpuutilisation();

	/**
	 * Returns a new object of class '<em>Memoryutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memoryutilisation</em>'.
	 * @generated
	 */
	Memoryutilisation createMemoryutilisation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HorizontalelasticityPackage getHorizontalelasticityPackage();

} //HorizontalelasticityFactory
