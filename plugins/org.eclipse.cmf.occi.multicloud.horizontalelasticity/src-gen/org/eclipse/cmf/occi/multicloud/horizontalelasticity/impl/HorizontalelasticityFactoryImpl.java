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
			case HorizontalelasticityPackage.HORIZONTALELASTICCONTROLLER: return createHorizontalelasticcontroller();
			case HorizontalelasticityPackage.INSTANCEGROUPLINK: return createInstancegrouplink();
			case HorizontalelasticityPackage.LINKBALANCER: return createLinkbalancer();
			case HorizontalelasticityPackage.GROUPLINK: return createGrouplink();
			case HorizontalelasticityPackage.MANUAL: return createManual();
			case HorizontalelasticityPackage.DYNAMIC: return createDynamic();
			case HorizontalelasticityPackage.SIMPLEDYNAMIC: return createSimpledynamic();
			case HorizontalelasticityPackage.STEPDYNAMIC: return createStepdynamic();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT: return createDynamicadjustment();
			case HorizontalelasticityPackage.RULE: return createRule();
			case HorizontalelasticityPackage.ACTION: return createAction();
			case HorizontalelasticityPackage.DYNAMICPOLICY: return createDynamicpolicy();
			case HorizontalelasticityPackage.STEP: return createStep();
			case HorizontalelasticityPackage.CREATION: return createCreation();
			case HorizontalelasticityPackage.SCHEDULER: return createScheduler();
			case HorizontalelasticityPackage.UNIQUESCHEDULE: return createUniqueschedule();
			case HorizontalelasticityPackage.RECURRINGSCHEDULE: return createRecurringschedule();
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
	public Horizontalelasticcontroller createHorizontalelasticcontroller() {
		HorizontalelasticcontrollerImpl horizontalelasticcontroller = new HorizontalelasticcontrollerImpl();
		return horizontalelasticcontroller;
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
	public Linkbalancer createLinkbalancer() {
		LinkbalancerImpl linkbalancer = new LinkbalancerImpl();
		return linkbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouplink createGrouplink() {
		GrouplinkImpl grouplink = new GrouplinkImpl();
		return grouplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manual createManual() {
		ManualImpl manual = new ManualImpl();
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic createDynamic() {
		DynamicImpl dynamic = new DynamicImpl();
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpledynamic createSimpledynamic() {
		SimpledynamicImpl simpledynamic = new SimpledynamicImpl();
		return simpledynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stepdynamic createStepdynamic() {
		StepdynamicImpl stepdynamic = new StepdynamicImpl();
		return stepdynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamicadjustment createDynamicadjustment() {
		DynamicadjustmentImpl dynamicadjustment = new DynamicadjustmentImpl();
		return dynamicadjustment;
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
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamicpolicy createDynamicpolicy() {
		DynamicpolicyImpl dynamicpolicy = new DynamicpolicyImpl();
		return dynamicpolicy;
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
	public Creation createCreation() {
		CreationImpl creation = new CreationImpl();
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createScheduler() {
		SchedulerImpl scheduler = new SchedulerImpl();
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uniqueschedule createUniqueschedule() {
		UniquescheduleImpl uniqueschedule = new UniquescheduleImpl();
		return uniqueschedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recurringschedule createRecurringschedule() {
		RecurringscheduleImpl recurringschedule = new RecurringscheduleImpl();
		return recurringschedule;
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
