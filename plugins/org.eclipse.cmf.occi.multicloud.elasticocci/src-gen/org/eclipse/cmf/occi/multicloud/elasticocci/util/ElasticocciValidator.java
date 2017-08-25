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
package org.eclipse.cmf.occi.multicloud.elasticocci.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.elasticocci.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage
 * @generated
 */
public class ElasticocciValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ElasticocciValidator INSTANCE = new ElasticocciValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.elasticocci";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Elasticlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELASTICLINK__TARGET_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Strategy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRATEGY__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Strategycpu'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRATEGYCPU__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Strategymemory'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRATEGYMEMORY__APPLIES_CONSTRAINT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

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
	public ElasticocciValidator() {
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
	  return ElasticocciPackage.eINSTANCE;
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
			case ElasticocciPackage.ELASTICCONTROLLER:
				return validateElasticcontroller((Elasticcontroller)value, diagnostics, context);
			case ElasticocciPackage.ELASTICLINK:
				return validateElasticlink((Elasticlink)value, diagnostics, context);
			case ElasticocciPackage.STRATEGY:
				return validateStrategy((Strategy)value, diagnostics, context);
			case ElasticocciPackage.STRATEGYCOMPUTE:
				return validateStrategycompute((Strategycompute)value, diagnostics, context);
			case ElasticocciPackage.STRATEGYCPU:
				return validateStrategycpu((Strategycpu)value, diagnostics, context);
			case ElasticocciPackage.STRATEGYMEMORY:
				return validateStrategymemory((Strategymemory)value, diagnostics, context);
			case ElasticocciPackage.MODE_TYPE:
				return validateModeType((ModeType)value, diagnostics, context);
			case ElasticocciPackage.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			case ElasticocciPackage.RELATIONAL_TYPE:
				return validateRelationalType((RelationalType)value, diagnostics, context);
			case ElasticocciPackage.DOUBLE:
				return validateDouble((Double)value, diagnostics, context);
			case ElasticocciPackage.DATE_TYPE:
				return validateDateType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElasticcontroller(Elasticcontroller elasticcontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elasticcontroller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(elasticcontroller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(elasticcontroller, diagnostics, context);
		return result;
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
	public boolean validateStrategy(Strategy strategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strategy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strategy, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrategy_appliesConstraint(strategy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategy_appliesConstraint(Strategy strategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strategy.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategycompute(Strategycompute strategycompute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strategycompute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strategycompute, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrategy_appliesConstraint(strategycompute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategycpu(Strategycpu strategycpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strategycpu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strategycpu, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrategycpu_appliesConstraint(strategycpu, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Strategycpu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategycpu_appliesConstraint(Strategycpu strategycpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strategycpu.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategymemory(Strategymemory strategymemory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strategymemory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strategymemory, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrategymemory_appliesConstraint(strategymemory, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Strategymemory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategymemory_appliesConstraint(Strategymemory strategymemory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strategymemory.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeType(ModeType modeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalType(RelationalType relationalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(String dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ElasticocciValidator
