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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl;

import java.util.Date;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HorizontalelasticityFactoryImpl extends EFactoryImpl implements HorizontalelasticityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalelasticityFactory init() {
		try {
			HorizontalelasticityFactory theHorizontalelasticityFactory = (HorizontalelasticityFactory)EPackage.Registry.INSTANCE.getEFactory(HorizontalelasticityPackage.eNS_URI);
			if (theHorizontalelasticityFactory != null) {
				return theHorizontalelasticityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HorizontalelasticityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HorizontalelasticityPackage.RECURRENCE_STEP: return createRecurrenceStep();
			case HorizontalelasticityPackage.ARRAY: return createArray();
			case HorizontalelasticityPackage.ARROF_REC_STEP: return createArrofRecStep();
			case HorizontalelasticityPackage.HORIZONTALGROUP: return createHorizontalgroup();
			case HorizontalelasticityPackage.LOADBALANCER: return createLoadbalancer();
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER: return createElasticitycontroller();
			case HorizontalelasticityPackage.INSTANCEGROUPLINK: return createInstancegrouplink();
			case HorizontalelasticityPackage.LOADBALANCERLINK: return createLoadbalancerlink();
			case HorizontalelasticityPackage.ELASTICLINK: return createElasticlink();
			case HorizontalelasticityPackage.RULE: return createRule();
			case HorizontalelasticityPackage.ACTIONTRIGGER: return createActiontrigger();
			case HorizontalelasticityPackage.STEP: return createStep();
			case HorizontalelasticityPackage.STEPLINK: return createSteplink();
			case HorizontalelasticityPackage.CREATION: return createCreation();
			case HorizontalelasticityPackage.SCHEDULINGPOLICY: return createSchedulingpolicy();
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY: return createUniqueschedulingpolicy();
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY: return createRecurringschedulingpolicy();
			case HorizontalelasticityPackage.SCALINGPOLICY: return createScalingpolicy();
			case HorizontalelasticityPackage.DYNAMICSCALINGPOLICY: return createDynamicscalingpolicy();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY: return createDynamicadjustmentscalingpolicy();
			case HorizontalelasticityPackage.SIMPLEDYNAMICSCALINGPOLICY: return createSimpledynamicscalingpolicy();
			case HorizontalelasticityPackage.STEPDYNAMICSCALINGPOLICY: return createStepdynamicscalingpolicy();
			case HorizontalelasticityPackage.MANUALSCALINGPOLICY: return createManualscalingpolicy();
			case HorizontalelasticityPackage.METRIC: return createMetric();
			case HorizontalelasticityPackage.CPUUTILISATION: return createCpuutilisation();
			case HorizontalelasticityPackage.MEMORYUTILISATION: return createMemoryutilisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HorizontalelasticityPackage.TYPE_METRIC:
				return createTypeMetricFromString(eDataType, initialValue);
			case HorizontalelasticityPackage.OPERATOR_TYPE:
				return createOperatorTypeFromString(eDataType, initialValue);
			case HorizontalelasticityPackage.ACTION_OPERATION:
				return createActionOperationFromString(eDataType, initialValue);
			case HorizontalelasticityPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case HorizontalelasticityPackage.METRIC_TARGET_TRACKING:
				return createMetricTargetTrackingFromString(eDataType, initialValue);
			case HorizontalelasticityPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case HorizontalelasticityPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case HorizontalelasticityPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HorizontalelasticityPackage.TYPE_METRIC:
				return convertTypeMetricToString(eDataType, instanceValue);
			case HorizontalelasticityPackage.OPERATOR_TYPE:
				return convertOperatorTypeToString(eDataType, instanceValue);
			case HorizontalelasticityPackage.ACTION_OPERATION:
				return convertActionOperationToString(eDataType, instanceValue);
			case HorizontalelasticityPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case HorizontalelasticityPackage.METRIC_TARGET_TRACKING:
				return convertMetricTargetTrackingToString(eDataType, instanceValue);
			case HorizontalelasticityPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case HorizontalelasticityPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case HorizontalelasticityPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceStep createRecurrenceStep() {
		RecurrenceStepImpl recurrenceStep = new RecurrenceStepImpl();
		return recurrenceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrofRecStep createArrofRecStep() {
		ArrofRecStepImpl arrofRecStep = new ArrofRecStepImpl();
		return arrofRecStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Horizontalgroup createHorizontalgroup() {
		HorizontalgroupImpl horizontalgroup = new HorizontalgroupImpl();
		return horizontalgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadbalancer createLoadbalancer() {
		LoadbalancerImpl loadbalancer = new LoadbalancerImpl();
		return loadbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elasticitycontroller createElasticitycontroller() {
		ElasticitycontrollerImpl elasticitycontroller = new ElasticitycontrollerImpl();
		return elasticitycontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instancegrouplink createInstancegrouplink() {
		InstancegrouplinkImpl instancegrouplink = new InstancegrouplinkImpl();
		return instancegrouplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadbalancerlink createLoadbalancerlink() {
		LoadbalancerlinkImpl loadbalancerlink = new LoadbalancerlinkImpl();
		return loadbalancerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elasticlink createElasticlink() {
		ElasticlinkImpl elasticlink = new ElasticlinkImpl();
		return elasticlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actiontrigger createActiontrigger() {
		ActiontriggerImpl actiontrigger = new ActiontriggerImpl();
		return actiontrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steplink createSteplink() {
		SteplinkImpl steplink = new SteplinkImpl();
		return steplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creation createCreation() {
		CreationImpl creation = new CreationImpl();
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedulingpolicy createSchedulingpolicy() {
		SchedulingpolicyImpl schedulingpolicy = new SchedulingpolicyImpl();
		return schedulingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uniqueschedulingpolicy createUniqueschedulingpolicy() {
		UniqueschedulingpolicyImpl uniqueschedulingpolicy = new UniqueschedulingpolicyImpl();
		return uniqueschedulingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recurringschedulingpolicy createRecurringschedulingpolicy() {
		RecurringschedulingpolicyImpl recurringschedulingpolicy = new RecurringschedulingpolicyImpl();
		return recurringschedulingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalingpolicy createScalingpolicy() {
		ScalingpolicyImpl scalingpolicy = new ScalingpolicyImpl();
		return scalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamicscalingpolicy createDynamicscalingpolicy() {
		DynamicscalingpolicyImpl dynamicscalingpolicy = new DynamicscalingpolicyImpl();
		return dynamicscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamicadjustmentscalingpolicy createDynamicadjustmentscalingpolicy() {
		DynamicadjustmentscalingpolicyImpl dynamicadjustmentscalingpolicy = new DynamicadjustmentscalingpolicyImpl();
		return dynamicadjustmentscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpledynamicscalingpolicy createSimpledynamicscalingpolicy() {
		SimpledynamicscalingpolicyImpl simpledynamicscalingpolicy = new SimpledynamicscalingpolicyImpl();
		return simpledynamicscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stepdynamicscalingpolicy createStepdynamicscalingpolicy() {
		StepdynamicscalingpolicyImpl stepdynamicscalingpolicy = new StepdynamicscalingpolicyImpl();
		return stepdynamicscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manualscalingpolicy createManualscalingpolicy() {
		ManualscalingpolicyImpl manualscalingpolicy = new ManualscalingpolicyImpl();
		return manualscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpuutilisation createCpuutilisation() {
		CpuutilisationImpl cpuutilisation = new CpuutilisationImpl();
		return cpuutilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memoryutilisation createMemoryutilisation() {
		MemoryutilisationImpl memoryutilisation = new MemoryutilisationImpl();
		return memoryutilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMetric createTypeMetricFromString(EDataType eDataType, String initialValue) {
		TypeMetric result = TypeMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue) {
		OperatorType result = OperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionOperation createActionOperationFromString(EDataType eDataType, String initialValue) {
		ActionOperation result = ActionOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricTargetTracking createMetricTargetTrackingFromString(EDataType eDataType, String initialValue) {
		MetricTargetTracking result = MetricTargetTracking.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricTargetTrackingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue) {
		Unit result = Unit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityPackage getHorizontalelasticityPackage() {
		return (HorizontalelasticityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HorizontalelasticityPackage getPackage() {
		return HorizontalelasticityPackage.eINSTANCE;
	}

} //HorizontalelasticityFactoryImpl
