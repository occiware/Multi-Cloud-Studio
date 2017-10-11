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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Linkbalancer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINKBALANCER__TARGET_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Grouplink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GROUPLINK__TARGET_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Rule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RULE__TARGET_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Creation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATION__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Steps'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STEPS__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Uniqueschedule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNIQUESCHEDULE__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Recurringschedule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECURRINGSCHEDULE__APPLIES_CONSTRAINT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

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
			case HorizontalelasticityPackage.ARRAYOF_RECURRENCE_STEP:
				return validateArrayofRecurrenceStep((ArrayofRecurrenceStep)value, diagnostics, context);
			case HorizontalelasticityPackage.HORIZONTALGROUP:
				return validateHorizontalgroup((Horizontalgroup)value, diagnostics, context);
			case HorizontalelasticityPackage.LOADBALANCER:
				return validateLoadbalancer((Loadbalancer)value, diagnostics, context);
			case HorizontalelasticityPackage.HORIZONTALELASTICCONTROLLER:
				return validateHorizontalelasticcontroller((Horizontalelasticcontroller)value, diagnostics, context);
			case HorizontalelasticityPackage.INSTANCEGROUPLINK:
				return validateInstancegrouplink((Instancegrouplink)value, diagnostics, context);
			case HorizontalelasticityPackage.LINKBALANCER:
				return validateLinkbalancer((Linkbalancer)value, diagnostics, context);
			case HorizontalelasticityPackage.GROUPLINK:
				return validateGrouplink((Grouplink)value, diagnostics, context);
			case HorizontalelasticityPackage.MANUAL:
				return validateManual((Manual)value, diagnostics, context);
			case HorizontalelasticityPackage.DYNAMIC:
				return validateDynamic((Dynamic)value, diagnostics, context);
			case HorizontalelasticityPackage.SIMPLEDYNAMIC:
				return validateSimpledynamic((Simpledynamic)value, diagnostics, context);
			case HorizontalelasticityPackage.STEPDYNAMIC:
				return validateStepdynamic((Stepdynamic)value, diagnostics, context);
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT:
				return validateDynamicadjustment((Dynamicadjustment)value, diagnostics, context);
			case HorizontalelasticityPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case HorizontalelasticityPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case HorizontalelasticityPackage.CREATION:
				return validateCreation((Creation)value, diagnostics, context);
			case HorizontalelasticityPackage.STEPS:
				return validateSteps((Steps)value, diagnostics, context);
			case HorizontalelasticityPackage.SCHEDULER:
				return validateScheduler((Scheduler)value, diagnostics, context);
			case HorizontalelasticityPackage.UNIQUESCHEDULE:
				return validateUniqueschedule((Uniqueschedule)value, diagnostics, context);
			case HorizontalelasticityPackage.RECURRINGSCHEDULE:
				return validateRecurringschedule((Recurringschedule)value, diagnostics, context);
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
	public boolean validateArrayofRecurrenceStep(ArrayofRecurrenceStep arrayofRecurrenceStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayofRecurrenceStep, diagnostics, context);
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
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(loadbalancer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalelasticcontroller(Horizontalelasticcontroller horizontalelasticcontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(horizontalelasticcontroller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(horizontalelasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(horizontalelasticcontroller, diagnostics, context);
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
	public boolean validateLinkbalancer(Linkbalancer linkbalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkbalancer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkbalancer_targetConstraint(linkbalancer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Linkbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkbalancer_targetConstraint(Linkbalancer linkbalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkbalancer.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrouplink(Grouplink grouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(grouplink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(grouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateGrouplink_targetConstraint(grouplink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Grouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrouplink_targetConstraint(Grouplink grouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return grouplink.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManual(Manual manual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(manual, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamic(Dynamic dynamic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(dynamic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpledynamic(Simpledynamic simpledynamic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpledynamic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(simpledynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(simpledynamic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepdynamic(Stepdynamic stepdynamic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stepdynamic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(stepdynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(stepdynamic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicadjustment(Dynamicadjustment dynamicadjustment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicadjustment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(dynamicadjustment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(dynamicadjustment, diagnostics, context);
		return result;
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
	public boolean validateSteps(Steps steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(steps, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(steps, diagnostics, context);
		if (result || diagnostics != null) result &= validateSteps_appliesConstraint(steps, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteps_appliesConstraint(Steps steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return steps.appliesConstraint(diagnostics, context);
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
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(action, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(action, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduler(Scheduler scheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueschedule(Uniqueschedule uniqueschedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(uniqueschedule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(uniqueschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateUniqueschedule_appliesConstraint(uniqueschedule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Uniqueschedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueschedule_appliesConstraint(Uniqueschedule uniqueschedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return uniqueschedule.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurringschedule(Recurringschedule recurringschedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recurringschedule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recurringschedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecurringschedule_appliesConstraint(recurringschedule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Recurringschedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurringschedule_appliesConstraint(Recurringschedule recurringschedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recurringschedule.appliesConstraint(diagnostics, context);
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
