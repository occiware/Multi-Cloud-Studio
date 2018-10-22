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
package org.eclipse.cmf.occi.multicloud.regions.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;
import org.eclipse.cmf.occi.multicloud.regions.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage
 * @generated
 */
public class RegionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RegionsValidator INSTANCE = new RegionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.regions";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Regionlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGIONLINK__SOURCE_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Availabilityzonelink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AVAILABILITYZONELINK__SOURCE_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Europe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EUROPE__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Northamerica'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NORTHAMERICA__APPLIES_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Southamerica'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOUTHAMERICA__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Asiapacific'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIAPACIFIC__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Africa'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AFRICA__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'China'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHINA__APPLIES_CONSTRAINT = 8;

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
	public RegionsValidator() {
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
	  return RegionsPackage.eINSTANCE;
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
			case RegionsPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case RegionsPackage.REGIONLINK:
				return validateRegionlink((Regionlink)value, diagnostics, context);
			case RegionsPackage.AVAILABILITYZONE:
				return validateAvailabilityzone((Availabilityzone)value, diagnostics, context);
			case RegionsPackage.AVAILABILITYZONELINK:
				return validateAvailabilityzonelink((Availabilityzonelink)value, diagnostics, context);
			case RegionsPackage.EUROPE:
				return validateEurope((Europe)value, diagnostics, context);
			case RegionsPackage.NORTHAMERICA:
				return validateNorthamerica((Northamerica)value, diagnostics, context);
			case RegionsPackage.SOUTHAMERICA:
				return validateSouthamerica((Southamerica)value, diagnostics, context);
			case RegionsPackage.ASIAPACIFIC:
				return validateAsiapacific((Asiapacific)value, diagnostics, context);
			case RegionsPackage.AFRICA:
				return validateAfrica((Africa)value, diagnostics, context);
			case RegionsPackage.CHINA:
				return validateChina((China)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(region, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(region, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(region, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(region, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionlink(Regionlink regionlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(regionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionlink_sourceConstraint(regionlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Regionlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionlink_sourceConstraint(Regionlink regionlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return regionlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityzone(Availabilityzone availabilityzone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(availabilityzone, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(availabilityzone, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(availabilityzone, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityzonelink(Availabilityzonelink availabilityzonelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(availabilityzonelink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(availabilityzonelink, diagnostics, context);
		if (result || diagnostics != null) result &= validateAvailabilityzonelink_sourceConstraint(availabilityzonelink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Availabilityzonelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityzonelink_sourceConstraint(Availabilityzonelink availabilityzonelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return availabilityzonelink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEurope(Europe europe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(europe, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(europe, diagnostics, context);
		if (result || diagnostics != null) result &= validateEurope_appliesConstraint(europe, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Europe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEurope_appliesConstraint(Europe europe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return europe.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNorthamerica(Northamerica northamerica, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(northamerica, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(northamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validateNorthamerica_appliesConstraint(northamerica, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Northamerica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNorthamerica_appliesConstraint(Northamerica northamerica, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return northamerica.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSouthamerica(Southamerica southamerica, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(southamerica, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(southamerica, diagnostics, context);
		if (result || diagnostics != null) result &= validateSouthamerica_appliesConstraint(southamerica, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Southamerica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSouthamerica_appliesConstraint(Southamerica southamerica, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return southamerica.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsiapacific(Asiapacific asiapacific, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(asiapacific, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(asiapacific, diagnostics, context);
		if (result || diagnostics != null) result &= validateAsiapacific_appliesConstraint(asiapacific, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Asiapacific</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsiapacific_appliesConstraint(Asiapacific asiapacific, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return asiapacific.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfrica(Africa africa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(africa, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(africa, diagnostics, context);
		if (result || diagnostics != null) result &= validateAfrica_appliesConstraint(africa, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Africa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfrica_appliesConstraint(Africa africa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return africa.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChina(China china, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(china, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(china, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(china, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(china, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(china, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(china, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(china, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(china, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(china, diagnostics, context);
		if (result || diagnostics != null) result &= validateChina_appliesConstraint(china, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>China</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChina_appliesConstraint(China china, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return china.appliesConstraint(diagnostics, context);
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

} //RegionsValidator
