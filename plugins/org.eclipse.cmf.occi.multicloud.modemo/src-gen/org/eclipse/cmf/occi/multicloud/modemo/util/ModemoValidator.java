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
package org.eclipse.cmf.occi.multicloud.modemo.util;

import java.util.Date;
import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.modemo.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage
 * @generated
 */
public class ModemoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModemoValidator INSTANCE = new ModemoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.modemo";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	public ModemoValidator() {
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
	  return ModemoPackage.eINSTANCE;
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
			case ModemoPackage.RECURRENCE_STEP:
				return validateRecurrenceStep((RecurrenceStep)value, diagnostics, context);
			case ModemoPackage.ARRAY:
				return validateArray((Array)value, diagnostics, context);
			case ModemoPackage.ARROF_REC_STEP:
				return validateArrofRecStep((ArrofRecStep)value, diagnostics, context);
			case ModemoPackage.HORIZONTALGROUP:
				return validateHorizontalgroup((Horizontalgroup)value, diagnostics, context);
			case ModemoPackage.LOADBALANCER:
				return validateLoadbalancer((Loadbalancer)value, diagnostics, context);
			case ModemoPackage.ELASTICITYCONTROLLER:
				return validateElasticitycontroller((Elasticitycontroller)value, diagnostics, context);
			case ModemoPackage.INSTANCEGROUPLINK:
				return validateInstancegrouplink((Instancegrouplink)value, diagnostics, context);
			case ModemoPackage.LOADBALANCERLINK:
				return validateLoadbalancerlink((Loadbalancerlink)value, diagnostics, context);
			case ModemoPackage.ELASTICLINK:
				return validateElasticlink((Elasticlink)value, diagnostics, context);
			case ModemoPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case ModemoPackage.ACTIONTRIGGER:
				return validateActiontrigger((Actiontrigger)value, diagnostics, context);
			case ModemoPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case ModemoPackage.STEPLINK:
				return validateSteplink((Steplink)value, diagnostics, context);
			case ModemoPackage.PROVIDER:
				return validateProvider((Provider)value, diagnostics, context);
			case ModemoPackage.PROVIDERLINK:
				return validateProviderlink((Providerlink)value, diagnostics, context);
			case ModemoPackage.PROVIDERVMWARE:
				return validateProvidervmware((Providervmware)value, diagnostics, context);
			case ModemoPackage.PROVIDEROPENSTACK:
				return validateProvideropenstack((Provideropenstack)value, diagnostics, context);
			case ModemoPackage.PROVIDERAMAZON:
				return validateProvideramazon((Provideramazon)value, diagnostics, context);
			case ModemoPackage.PROVIDERAZURE:
				return validateProviderazure((Providerazure)value, diagnostics, context);
			case ModemoPackage.PROVIDERINSTANCELINK:
				return validateProviderinstancelink((Providerinstancelink)value, diagnostics, context);
			case ModemoPackage.CREATION:
				return validateCreation((Creation)value, diagnostics, context);
			case ModemoPackage.SCHEDULINGPOLICY:
				return validateSchedulingpolicy((Schedulingpolicy)value, diagnostics, context);
			case ModemoPackage.UNIQUESCHEDULINGPOLICY:
				return validateUniqueschedulingpolicy((Uniqueschedulingpolicy)value, diagnostics, context);
			case ModemoPackage.RECURRINGSCHEDULINGPOLICY:
				return validateRecurringschedulingpolicy((Recurringschedulingpolicy)value, diagnostics, context);
			case ModemoPackage.SCALINGPOLICY:
				return validateScalingpolicy((Scalingpolicy)value, diagnostics, context);
			case ModemoPackage.DYNAMICSCALINGPOLICY:
				return validateDynamicscalingpolicy((Dynamicscalingpolicy)value, diagnostics, context);
			case ModemoPackage.DYNAMICADJUSTMENTSCALINGPOLICY:
				return validateDynamicadjustmentscalingpolicy((Dynamicadjustmentscalingpolicy)value, diagnostics, context);
			case ModemoPackage.SIMPLEDYNAMICSCALINGPOLICY:
				return validateSimpledynamicscalingpolicy((Simpledynamicscalingpolicy)value, diagnostics, context);
			case ModemoPackage.STEPDYNAMICSCALINGPOLICY:
				return validateStepdynamicscalingpolicy((Stepdynamicscalingpolicy)value, diagnostics, context);
			case ModemoPackage.MANUALSCALINGPOLICY:
				return validateManualscalingpolicy((Manualscalingpolicy)value, diagnostics, context);
			case ModemoPackage.METRIC:
				return validateMetric((Metric)value, diagnostics, context);
			case ModemoPackage.CPUUTILISATION:
				return validateCpuutilisation((Cpuutilisation)value, diagnostics, context);
			case ModemoPackage.MEMORYUTILISATION:
				return validateMemoryutilisation((Memoryutilisation)value, diagnostics, context);
			case ModemoPackage.ALLOCATIONPOLICY:
				return validateAllocationpolicy((Allocationpolicy)value, diagnostics, context);
			case ModemoPackage.ROUNDROBIN:
				return validateRoundrobin((Roundrobin)value, diagnostics, context);
			case ModemoPackage.RESPONSETIME:
				return validateResponsetime((Responsetime)value, diagnostics, context);
			case ModemoPackage.COST:
				return validateCost((Cost)value, diagnostics, context);
			case ModemoPackage.SWAPPINGPOLICY:
				return validateSwappingpolicy((Swappingpolicy)value, diagnostics, context);
			case ModemoPackage.SOURCEMIGRATIONPOLICITY:
				return validateSourcemigrationpolicity((Sourcemigrationpolicity)value, diagnostics, context);
			case ModemoPackage.LIVEMIGRATION:
				return validateLivemigration((Livemigration)value, diagnostics, context);
			case ModemoPackage.NONLIVEMIGRATION:
				return validateNonlivemigration((Nonlivemigration)value, diagnostics, context);
			case ModemoPackage.MIGRATIONTYPE:
				return validateMigrationtype((Migrationtype)value, diagnostics, context);
			case ModemoPackage.DYNAMICMIGRATIONPOLICY:
				return validateDynamicmigrationpolicy((Dynamicmigrationpolicy)value, diagnostics, context);
			case ModemoPackage.MANUALMIGRATIONPOLICY:
				return validateManualmigrationpolicy((Manualmigrationpolicy)value, diagnostics, context);
			case ModemoPackage.SLA:
				return validateSla((Sla)value, diagnostics, context);
			case ModemoPackage.LOADVOLUME:
				return validateLoadvolume((Loadvolume)value, diagnostics, context);
			case ModemoPackage.POWER:
				return validatePower((Power)value, diagnostics, context);
			case ModemoPackage.RESOURCEWASTAGE:
				return validateResourcewastage((Resourcewastage)value, diagnostics, context);
			case ModemoPackage.TARGETMIGRATIONPOLICY:
				return validateTargetmigrationpolicy((Targetmigrationpolicy)value, diagnostics, context);
			case ModemoPackage.AVAILABLERESOURCES:
				return validateAvailableresources((Availableresources)value, diagnostics, context);
			case ModemoPackage.MANUALTARGETSELECTION:
				return validateManualtargetselection((Manualtargetselection)value, diagnostics, context);
			case ModemoPackage.AVAILALBLERESOURCESORLOAD:
				return validateAvailalbleresourcesorload((Availalbleresourcesorload)value, diagnostics, context);
			case ModemoPackage.TARGETRESPONSETIME:
				return validateTargetresponsetime((Targetresponsetime)value, diagnostics, context);
			case ModemoPackage.RESPONSETIMEMETRIC:
				return validateResponsetimemetric((Responsetimemetric)value, diagnostics, context);
			case ModemoPackage.NETWORKCONTENTION:
				return validateNetworkcontention((Networkcontention)value, diagnostics, context);
			case ModemoPackage.LOADBALANCERALGORITHM:
				return validateLoadbalanceralgorithm((Loadbalanceralgorithm)value, diagnostics, context);
			case ModemoPackage.ROUNDROBINALGO:
				return validateRoundrobinalgo((Roundrobinalgo)value, diagnostics, context);
			case ModemoPackage.LEASTCONN:
				return validateLeastconn((Leastconn)value, diagnostics, context);
			case ModemoPackage.STICKYSESSIONS:
				return validateStickysessions((Stickysessions)value, diagnostics, context);
			case ModemoPackage.WSTATICRR:
				return validateWstaticrr((Wstaticrr)value, diagnostics, context);
			case ModemoPackage.SOURCE:
				return validateSource((Source)value, diagnostics, context);
			case ModemoPackage.TYPE_METRIC:
				return validateTypeMetric((TypeMetric)value, diagnostics, context);
			case ModemoPackage.OPERATOR_TYPE:
				return validateOperatorType((OperatorType)value, diagnostics, context);
			case ModemoPackage.ACTION_OPERATION:
				return validateActionOperation((ActionOperation)value, diagnostics, context);
			case ModemoPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case ModemoPackage.METRIC_TARGET_TRACKING:
				return validateMetricTargetTracking((MetricTargetTracking)value, diagnostics, context);
			case ModemoPackage.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case ModemoPackage.FLOAT:
				return validateFloat((Float)value, diagnostics, context);
			case ModemoPackage.DATE:
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
		if (result || diagnostics != null) result &= validateInstancegrouplink_sourceConstraint(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstancegrouplink_targetConstraint(instancegrouplink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCEGROUPLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(modemo::Horizontalgroup)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancegrouplink_sourceConstraint(Instancegrouplink instancegrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.INSTANCEGROUPLINK,
				 instancegrouplink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 INSTANCEGROUPLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCEGROUPLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(infrastructure::Compute)";

	/**
	 * Validates the targetConstraint constraint of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancegrouplink_targetConstraint(Instancegrouplink instancegrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.INSTANCEGROUPLINK,
				 instancegrouplink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 INSTANCEGROUPLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateLoadbalancerlink_sourceConstraint(loadbalancerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalancerlink_targetConstraint(loadbalancerlink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOADBALANCERLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(modemo::Horizontalgroup)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalancerlink_sourceConstraint(Loadbalancerlink loadbalancerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.LOADBALANCERLINK,
				 loadbalancerlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 LOADBALANCERLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOADBALANCERLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(modemo::Loadbalancer)";

	/**
	 * Validates the targetConstraint constraint of '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalancerlink_targetConstraint(Loadbalancerlink loadbalancerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.LOADBALANCERLINK,
				 loadbalancerlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 LOADBALANCERLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateElasticlink_sourceConstraint(elasticlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateElasticlink_targetConstraint(elasticlink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELASTICLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElasticlink_sourceConstraint(Elasticlink elasticlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.ELASTICLINK,
				 elasticlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 ELASTICLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELASTICLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(modemo::Horizontalgroup) or self.target.oclIsKindOf(infrastructure::Compute)";

	/**
	 * Validates the targetConstraint constraint of '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElasticlink_targetConstraint(Elasticlink elasticlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.ELASTICLINK,
				 elasticlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 ELASTICLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateRule_sourceConstraint(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validateRule_targetConstraint(rule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RULE__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule_sourceConstraint(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.RULE,
				 rule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 RULE__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RULE__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(modemo::Actiontrigger)";

	/**
	 * Validates the targetConstraint constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule_targetConstraint(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.RULE,
				 rule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 RULE__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateSteplink_sourceConstraint(steplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateSteplink_targetConstraint(steplink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEPLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteplink_sourceConstraint(Steplink steplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.STEPLINK,
				 steplink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 STEPLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEPLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(modemo::Step)";

	/**
	 * Validates the targetConstraint constraint of '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteplink_targetConstraint(Steplink steplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.STEPLINK,
				 steplink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 STEPLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(provider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(provider, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(provider, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(provider, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderlink(Providerlink providerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providerlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateProviderlink_sourceConstraint(providerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateProviderlink_targetConstraint(providerlink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Providerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDERLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(modemo::Horizontalgroup)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Providerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderlink_sourceConstraint(Providerlink providerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.PROVIDERLINK,
				 providerlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 PROVIDERLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Providerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDERLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(modemo::Provider)";

	/**
	 * Validates the targetConstraint constraint of '<em>Providerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderlink_targetConstraint(Providerlink providerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.PROVIDERLINK,
				 providerlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 PROVIDERLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidervmware(Providervmware providervmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providervmware, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(providervmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(providervmware, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvideropenstack(Provideropenstack provideropenstack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(provideropenstack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(provideropenstack, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(provideropenstack, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvideramazon(Provideramazon provideramazon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(provideramazon, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(provideramazon, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(provideramazon, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderazure(Providerazure providerazure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providerazure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(providerazure, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(providerazure, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderinstancelink(Providerinstancelink providerinstancelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providerinstancelink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validateProviderinstancelink_sourceConstraint(providerinstancelink, diagnostics, context);
		if (result || diagnostics != null) result &= validateProviderinstancelink_targetConstraint(providerinstancelink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Providerinstancelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDERINSTANCELINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(modemo::Provider)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Providerinstancelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderinstancelink_sourceConstraint(Providerinstancelink providerinstancelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.PROVIDERINSTANCELINK,
				 providerinstancelink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 PROVIDERINSTANCELINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Providerinstancelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDERINSTANCELINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(infrastructure::Compute)";

	/**
	 * Validates the targetConstraint constraint of '<em>Providerinstancelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderinstancelink_targetConstraint(Providerinstancelink providerinstancelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.PROVIDERINSTANCELINK,
				 providerinstancelink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 PROVIDERINSTANCELINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	 * The cached validation expression for the appliesConstraint constraint of '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATION__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(infrastructure::Compute)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreation_appliesConstraint(Creation creation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.CREATION,
				 creation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 CREATION__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	 * The cached validation expression for the appliesConstraint constraint of '<em>Schedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCHEDULINGPOLICY__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Schedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingpolicy_appliesConstraint(Schedulingpolicy schedulingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.SCHEDULINGPOLICY,
				 schedulingpolicy,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 SCHEDULINGPOLICY__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	 * The cached validation expression for the appliesConstraint constraint of '<em>Scalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCALINGPOLICY__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Scalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingpolicy_appliesConstraint(Scalingpolicy scalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.SCALINGPOLICY,
				 scalingpolicy,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 SCALINGPOLICY__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	 * The cached validation expression for the appliesConstraint constraint of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METRIC__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Rule)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric_appliesConstraint(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.METRIC,
				 metric,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 METRIC__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateAllocationpolicy(Allocationpolicy allocationpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocationpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationpolicy_appliesConstraint(allocationpolicy, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Allocationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATIONPOLICY__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Horizontalgroup)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Allocationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationpolicy_appliesConstraint(Allocationpolicy allocationpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.ALLOCATIONPOLICY,
				 allocationpolicy,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 ALLOCATIONPOLICY__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoundrobin(Roundrobin roundrobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roundrobin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roundrobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationpolicy_appliesConstraint(roundrobin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsetime(Responsetime responsetime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsetime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationpolicy_appliesConstraint(responsetime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCost(Cost cost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cost, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cost, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationpolicy_appliesConstraint(cost, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwappingpolicy(Swappingpolicy swappingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(swappingpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(swappingpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateSwappingpolicy_appliesConstraint(swappingpolicy, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Swappingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SWAPPINGPOLICY__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Swappingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwappingpolicy_appliesConstraint(Swappingpolicy swappingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.SWAPPINGPOLICY,
				 swappingpolicy,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 SWAPPINGPOLICY__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourcemigrationpolicity(Sourcemigrationpolicity sourcemigrationpolicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourcemigrationpolicity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourcemigrationpolicity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(sourcemigrationpolicity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Sourcemigrationpolicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SOURCEMIGRATIONPOLICITY__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Sourcemigrationpolicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourcemigrationpolicity_appliesConstraint(Sourcemigrationpolicity sourcemigrationpolicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.SOURCEMIGRATIONPOLICITY,
				 sourcemigrationpolicity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 SOURCEMIGRATIONPOLICITY__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLivemigration(Livemigration livemigration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(livemigration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(livemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validateMigrationtype_appliesConstraint(livemigration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonlivemigration(Nonlivemigration nonlivemigration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nonlivemigration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nonlivemigration, diagnostics, context);
		if (result || diagnostics != null) result &= validateMigrationtype_appliesConstraint(nonlivemigration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMigrationtype(Migrationtype migrationtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(migrationtype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(migrationtype, diagnostics, context);
		if (result || diagnostics != null) result &= validateMigrationtype_appliesConstraint(migrationtype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Migrationtype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MIGRATIONTYPE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Migrationtype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMigrationtype_appliesConstraint(Migrationtype migrationtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.MIGRATIONTYPE,
				 migrationtype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 MIGRATIONTYPE__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicmigrationpolicy(Dynamicmigrationpolicy dynamicmigrationpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicmigrationpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(dynamicmigrationpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualmigrationpolicy(Manualmigrationpolicy manualmigrationpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manualmigrationpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manualmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(manualmigrationpolicy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSla(Sla sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sla, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(sla, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadvolume(Loadvolume loadvolume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadvolume, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadvolume, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(loadvolume, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePower(Power power, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(power, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(power, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(power, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(power, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(power, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(power, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(power, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(power, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(power, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(power, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcewastage(Resourcewastage resourcewastage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourcewastage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourcewastage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(resourcewastage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetmigrationpolicy(Targetmigrationpolicy targetmigrationpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(targetmigrationpolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(targetmigrationpolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateTargetmigrationpolicy_appliesConstraint(targetmigrationpolicy, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Targetmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TARGETMIGRATIONPOLICY__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Elasticitycontroller)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Targetmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetmigrationpolicy_appliesConstraint(Targetmigrationpolicy targetmigrationpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.TARGETMIGRATIONPOLICY,
				 targetmigrationpolicy,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 TARGETMIGRATIONPOLICY__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailableresources(Availableresources availableresources, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(availableresources, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(availableresources, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationpolicy_appliesConstraint(availableresources, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualtargetselection(Manualtargetselection manualtargetselection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manualtargetselection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manualtargetselection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTargetmigrationpolicy_appliesConstraint(manualtargetselection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailalbleresourcesorload(Availalbleresourcesorload availalbleresourcesorload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(availalbleresourcesorload, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(availalbleresourcesorload, diagnostics, context);
		if (result || diagnostics != null) result &= validateTargetmigrationpolicy_appliesConstraint(availalbleresourcesorload, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetresponsetime(Targetresponsetime targetresponsetime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(targetresponsetime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(targetresponsetime, diagnostics, context);
		if (result || diagnostics != null) result &= validateTargetmigrationpolicy_appliesConstraint(targetresponsetime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsetimemetric(Responsetimemetric responsetimemetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsetimemetric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responsetimemetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_appliesConstraint(responsetimemetric, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkcontention(Networkcontention networkcontention, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkcontention, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkcontention, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourcemigrationpolicity_appliesConstraint(networkcontention, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalanceralgorithm(Loadbalanceralgorithm loadbalanceralgorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadbalanceralgorithm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadbalanceralgorithm, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalanceralgorithm_appliesConstraint(loadbalanceralgorithm, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Loadbalanceralgorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOADBALANCERALGORITHM__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(modemo::Loadbalancer)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Loadbalanceralgorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalanceralgorithm_appliesConstraint(Loadbalanceralgorithm loadbalanceralgorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModemoPackage.Literals.LOADBALANCERALGORITHM,
				 loadbalanceralgorithm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 LOADBALANCERALGORITHM__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoundrobinalgo(Roundrobinalgo roundrobinalgo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roundrobinalgo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roundrobinalgo, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalanceralgorithm_appliesConstraint(roundrobinalgo, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeastconn(Leastconn leastconn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(leastconn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(leastconn, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalanceralgorithm_appliesConstraint(leastconn, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStickysessions(Stickysessions stickysessions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stickysessions, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stickysessions, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalanceralgorithm_appliesConstraint(stickysessions, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWstaticrr(Wstaticrr wstaticrr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wstaticrr, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wstaticrr, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalanceralgorithm_appliesConstraint(wstaticrr, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource(Source source, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(source, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(source, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(source, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadbalanceralgorithm_appliesConstraint(source, diagnostics, context);
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

} //ModemoValidator
