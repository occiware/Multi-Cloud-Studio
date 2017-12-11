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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.util;

import java.util.Date;
import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage
 * @generated
 */
public class HorizontalelasticityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HorizontalelasticityValidator INSTANCE = new HorizontalelasticityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.horizontalelasticity";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Instancegrouplink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCEGROUPLINK__TARGET_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Loadbalancerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOADBALANCERLINK__TARGET_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Elasticlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELASTICLINK__TARGET_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Rule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RULE__TARGET_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Steplink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STEPLINK__TARGET_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Creation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATION__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Schedulingpolicy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHEDULINGPOLICY__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Scalingpolicy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCALINGPOLICY__APPLIES_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Metric'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METRIC__APPLIES_CONSTRAINT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HorizontalelasticityPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case HorizontalelasticityPackage.RECURRENCE_STEP:
				return validateRecurrenceStep((RecurrenceStep)value, diagnostics, context);
			case HorizontalelasticityPackage.ARRAY:
				return validateArray((Array)value, diagnostics, context);
			case HorizontalelasticityPackage.ARROF_REC_STEP:
				return validateArrofRecStep((ArrofRecStep)value, diagnostics, context);
			case HorizontalelasticityPackage.HORIZONTALGROUP:
				return validateHorizontalgroup((Horizontalgroup)value, diagnostics, context);
			case HorizontalelasticityPackage.LOADBALANCER:
				return validateLoadbalancer((Loadbalancer)value, diagnostics, context);
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER:
				return validateElasticitycontroller((Elasticitycontroller)value, diagnostics, context);
			case HorizontalelasticityPackage.INSTANCEGROUPLINK:
				return validateInstancegrouplink((Instancegrouplink)value, diagnostics, context);
			case HorizontalelasticityPackage.LOADBALANCERLINK:
				return validateLoadbalancerlink((Loadbalancerlink)value, diagnostics, context);
			case HorizontalelasticityPackage.ELASTICLINK:
				return validateElasticlink((Elasticlink)value, diagnostics, context);
			case HorizontalelasticityPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case HorizontalelasticityPackage.ACTIONTRIGGER:
				return validateActiontrigger((Actiontrigger)value, diagnostics, context);
			case HorizontalelasticityPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case HorizontalelasticityPackage.STEPLINK:
				return validateSteplink((Steplink)value, diagnostics, context);
			case HorizontalelasticityPackage.CREATION:
				return validateCreation((Creation)value, diagnostics, context);
			case HorizontalelasticityPackage.SCHEDULINGPOLICY:
				return validateSchedulingpolicy((Schedulingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY:
				return validateUniqueschedulingpolicy((Uniqueschedulingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY:
				return validateRecurringschedulingpolicy((Recurringschedulingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.SCALINGPOLICY:
				return validateScalingpolicy((Scalingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.DYNAMICSCALINGPOLICY:
				return validateDynamicscalingpolicy((Dynamicscalingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY:
				return validateDynamicadjustmentscalingpolicy((Dynamicadjustmentscalingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.SIMPLEDYNAMICSCALINGPOLICY:
				return validateSimpledynamicscalingpolicy((Simpledynamicscalingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.STEPDYNAMICSCALINGPOLICY:
				return validateStepdynamicscalingpolicy((Stepdynamicscalingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.MANUALSCALINGPOLICY:
				return validateManualscalingpolicy((Manualscalingpolicy)value, diagnostics, context);
			case HorizontalelasticityPackage.METRIC:
				return validateMetric((Metric)value, diagnostics, context);
			case HorizontalelasticityPackage.CPUUTILISATION:
				return validateCpuutilisation((Cpuutilisation)value, diagnostics, context);
			case HorizontalelasticityPackage.MEMORYUTILISATION:
				return validateMemoryutilisation((Memoryutilisation)value, diagnostics, context);
			case HorizontalelasticityPackage.TYPE_METRIC:
				return validateTypeMetric((TypeMetric)value, diagnostics, context);
			case HorizontalelasticityPackage.OPERATOR_TYPE:
				return validateOperatorType((OperatorType)value, diagnostics, context);
			case HorizontalelasticityPackage.ACTION_OPERATION:
				return validateActionOperation((ActionOperation)value, diagnostics, context);
			case HorizontalelasticityPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case HorizontalelasticityPackage.METRIC_TARGET_TRACKING:
				return validateMetricTargetTracking((MetricTargetTracking)value, diagnostics, context);
			case HorizontalelasticityPackage.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case HorizontalelasticityPackage.FLOAT:
				return validateFloat((Float)value, diagnostics, context);
			case HorizontalelasticityPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurrenceStep(RecurrenceStep recurrenceStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recurrenceStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArray(Array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(array, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrofRecStep(ArrofRecStep arrofRecStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrofRecStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalgroup(Horizontalgroup horizontalgroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(horizontalgroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(horizontalgroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalancer(Loadbalancer loadbalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadbalancer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(loadbalancer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElasticitycontroller(Elasticitycontroller elasticitycontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elasticitycontroller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(elasticitycontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(elasticitycontroller, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancegrouplink(Instancegrouplink instancegrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instancegrouplink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstancegrouplink_targetConstraint(instancegrouplink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancegrouplink_targetConstraint(Instancegrouplink instancegrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instancegrouplink.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalancerlink(Loadbalancerlink loadbalancerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadbalancerlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalancerlink_targetConstraint(loadbalancerlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalancerlink_targetConstraint(Loadbalancerlink loadbalancerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return loadbalancerlink.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElasticlink(Elasticlink elasticlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elasticlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateElasticlink_targetConstraint(elasticlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElasticlink_targetConstraint(Elasticlink elasticlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return elasticlink.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(rule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(rule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(rule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(rule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateRule_targetConstraint(rule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule_targetConstraint(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rule.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiontrigger(Actiontrigger actiontrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actiontrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(actiontrigger, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(actiontrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(step, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(step, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(step, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(step, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteplink(Steplink steplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(steplink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateSteplink_targetConstraint(steplink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteplink_targetConstraint(Steplink steplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return steplink.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreation(Creation creation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(creation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(creation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreation_appliesConstraint(creation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreation_appliesConstraint(Creation creation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return creation.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingpolicy(Schedulingpolicy schedulingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedulingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchedulingpolicy_appliesConstraint(schedulingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Schedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingpolicy_appliesConstraint(Schedulingpolicy schedulingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return schedulingpolicy.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueschedulingpolicy(Uniqueschedulingpolicy uniqueschedulingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(uniqueschedulingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(uniqueschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchedulingpolicy_appliesConstraint(uniqueschedulingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurringschedulingpolicy(Recurringschedulingpolicy recurringschedulingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recurringschedulingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recurringschedulingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchedulingpolicy_appliesConstraint(recurringschedulingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingpolicy(Scalingpolicy scalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scalingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingpolicy_appliesConstraint(scalingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Scalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingpolicy_appliesConstraint(Scalingpolicy scalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scalingpolicy.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicscalingpolicy(Dynamicscalingpolicy dynamicscalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicscalingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingpolicy_appliesConstraint(dynamicscalingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicadjustmentscalingpolicy(Dynamicadjustmentscalingpolicy dynamicadjustmentscalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicadjustmentscalingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicadjustmentscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingpolicy_appliesConstraint(dynamicadjustmentscalingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpledynamicscalingpolicy(Simpledynamicscalingpolicy simpledynamicscalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpledynamicscalingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpledynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingpolicy_appliesConstraint(simpledynamicscalingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepdynamicscalingpolicy(Stepdynamicscalingpolicy stepdynamicscalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stepdynamicscalingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stepdynamicscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingpolicy_appliesConstraint(stepdynamicscalingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualscalingpolicy(Manualscalingpolicy manualscalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manualscalingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manualscalingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingpolicy_appliesConstraint(manualscalingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(metric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_appliesConstraint(metric, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric_appliesConstraint(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return metric.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuutilisation(Cpuutilisation cpuutilisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cpuutilisation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cpuutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_appliesConstraint(cpuutilisation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryutilisation(Memoryutilisation memoryutilisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memoryutilisation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memoryutilisation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_appliesConstraint(memoryutilisation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeMetric(TypeMetric typeMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatorType(OperatorType operatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionOperation(ActionOperation actionOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricTargetTracking(MetricTargetTracking metricTargetTracking, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HorizontalelasticityValidator
