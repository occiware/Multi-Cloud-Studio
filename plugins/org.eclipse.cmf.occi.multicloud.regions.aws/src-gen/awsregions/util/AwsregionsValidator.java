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
package awsregions.util;

import awsregions.*;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.regions.util.RegionsValidator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see awsregions.AwsregionsPackage
 * @generated
 */
public class AwsregionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AwsregionsValidator INSTANCE = new AwsregionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "awsregions";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionsValidator regionsValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsregionsValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
		regionsValidator = RegionsValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AwsregionsPackage.eINSTANCE;
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
			case AwsregionsPackage.AWSREGION:
				return validateAwsregion((Awsregion)value, diagnostics, context);
			case AwsregionsPackage.US_EAST_2:
				return validateUs_east_2((Us_east_2)value, diagnostics, context);
			case AwsregionsPackage.US_EAST_1:
				return validateUs_east_1((Us_east_1)value, diagnostics, context);
			case AwsregionsPackage.EU_WEST_3:
				return validateEu_west_3((Eu_west_3)value, diagnostics, context);
			case AwsregionsPackage.US_WEST_1:
				return validateUs_west_1((Us_west_1)value, diagnostics, context);
			case AwsregionsPackage.EU_WEST_1:
				return validateEu_west_1((Eu_west_1)value, diagnostics, context);
			case AwsregionsPackage.AP_SOUTH_1:
				return validateAp_south_1((Ap_south_1)value, diagnostics, context);
			case AwsregionsPackage.SA_EAST_1:
				return validateSa_east_1((Sa_east_1)value, diagnostics, context);
			case AwsregionsPackage.US_WEST_2:
				return validateUs_west_2((Us_west_2)value, diagnostics, context);
			case AwsregionsPackage.EU_WEST_2:
				return validateEu_west_2((Eu_west_2)value, diagnostics, context);
			case AwsregionsPackage.AP_SOUTHEAST_1:
				return validateAp_southeast_1((Ap_southeast_1)value, diagnostics, context);
			case AwsregionsPackage.CA_CENTRAL_1:
				return validateCa_central_1((Ca_central_1)value, diagnostics, context);
			case AwsregionsPackage.AP_NORTHEAST_2:
				return validateAp_northeast_2((Ap_northeast_2)value, diagnostics, context);
			case AwsregionsPackage.AP_SOUTH_EAST2:
				return validateAp_south_east2((Ap_south_east2)value, diagnostics, context);
			case AwsregionsPackage.EU_CENTRAL_1:
				return validateEu_central_1((Eu_central_1)value, diagnostics, context);
			case AwsregionsPackage.AP_NORTHEAST_1:
				return validateAp_northeast_1((Ap_northeast_1)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAwsregion(Awsregion awsregion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(awsregion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(awsregion, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(awsregion, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_east_2(Us_east_2 us_east_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(us_east_2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(us_east_2, diagnostics, context);
		if (result || diagnostics != null) result &= validateUs_east_2_appliesConstraint(us_east_2, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Us east 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String US_EAST_2__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Us east 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_east_2_appliesConstraint(Us_east_2 us_east_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(us_east_2, context) },
						 new Object[] { us_east_2 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateNorthamerica_appliesConstraint(us_east_2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_east_1(Us_east_1 us_east_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(us_east_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(us_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateUs_east_1_appliesConstraint(us_east_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Us east 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String US_EAST_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Us east 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_east_1_appliesConstraint(Us_east_1 us_east_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(us_east_1, context) },
						 new Object[] { us_east_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateNorthamerica_appliesConstraint(us_east_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_west_3(Eu_west_3 eu_west_3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eu_west_3, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eu_west_3, diagnostics, context);
		if (result || diagnostics != null) result &= validateEu_west_3_appliesConstraint(eu_west_3, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Eu west 3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EU_WEST_3__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Eu west 3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_west_3_appliesConstraint(Eu_west_3 eu_west_3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(eu_west_3, context) },
						 new Object[] { eu_west_3 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateEurope_appliesConstraint(eu_west_3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_west_1(Us_west_1 us_west_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(us_west_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(us_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateUs_west_1_appliesConstraint(us_west_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Us west 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String US_WEST_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Us west 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_west_1_appliesConstraint(Us_west_1 us_west_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(us_west_1, context) },
						 new Object[] { us_west_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateNorthamerica_appliesConstraint(us_west_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_west_1(Eu_west_1 eu_west_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eu_west_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eu_west_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateEu_west_1_appliesConstraint(eu_west_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Eu west 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EU_WEST_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Eu west 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_west_1_appliesConstraint(Eu_west_1 eu_west_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(eu_west_1, context) },
						 new Object[] { eu_west_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateEurope_appliesConstraint(eu_west_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_south_1(Ap_south_1 ap_south_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ap_south_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ap_south_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateAp_south_1_appliesConstraint(ap_south_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Ap south 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AP_SOUTH_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Ap south 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_south_1_appliesConstraint(Ap_south_1 ap_south_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(ap_south_1, context) },
						 new Object[] { ap_south_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateAsiapacific_appliesConstraint(ap_south_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSa_east_1(Sa_east_1 sa_east_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sa_east_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sa_east_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateSa_east_1_appliesConstraint(sa_east_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Sa east 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SA_EAST_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Sa east 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSa_east_1_appliesConstraint(Sa_east_1 sa_east_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(sa_east_1, context) },
						 new Object[] { sa_east_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateSouthamerica_appliesConstraint(sa_east_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_west_2(Us_west_2 us_west_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(us_west_2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(us_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validateUs_west_2_appliesConstraint(us_west_2, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Us west 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String US_WEST_2__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Us west 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUs_west_2_appliesConstraint(Us_west_2 us_west_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(us_west_2, context) },
						 new Object[] { us_west_2 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateNorthamerica_appliesConstraint(us_west_2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_west_2(Eu_west_2 eu_west_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eu_west_2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eu_west_2, diagnostics, context);
		if (result || diagnostics != null) result &= validateEu_west_2_appliesConstraint(eu_west_2, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Eu west 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EU_WEST_2__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Eu west 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_west_2_appliesConstraint(Eu_west_2 eu_west_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(eu_west_2, context) },
						 new Object[] { eu_west_2 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateEurope_appliesConstraint(eu_west_2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_southeast_1(Ap_southeast_1 ap_southeast_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ap_southeast_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ap_southeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateAp_southeast_1_appliesConstraint(ap_southeast_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Ap southeast 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AP_SOUTHEAST_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Ap southeast 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_southeast_1_appliesConstraint(Ap_southeast_1 ap_southeast_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(ap_southeast_1, context) },
						 new Object[] { ap_southeast_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateAsiapacific_appliesConstraint(ap_southeast_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCa_central_1(Ca_central_1 ca_central_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ca_central_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ca_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateCa_central_1_appliesConstraint(ca_central_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Ca central 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CA_CENTRAL_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Ca central 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCa_central_1_appliesConstraint(Ca_central_1 ca_central_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(ca_central_1, context) },
						 new Object[] { ca_central_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateNorthamerica_appliesConstraint(ca_central_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_northeast_2(Ap_northeast_2 ap_northeast_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ap_northeast_2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ap_northeast_2, diagnostics, context);
		if (result || diagnostics != null) result &= validateAp_northeast_2_appliesConstraint(ap_northeast_2, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Ap northeast 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AP_NORTHEAST_2__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Ap northeast 2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_northeast_2_appliesConstraint(Ap_northeast_2 ap_northeast_2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(ap_northeast_2, context) },
						 new Object[] { ap_northeast_2 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateAsiapacific_appliesConstraint(ap_northeast_2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_south_east2(Ap_south_east2 ap_south_east2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ap_south_east2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ap_south_east2, diagnostics, context);
		if (result || diagnostics != null) result &= validateAp_south_east2_appliesConstraint(ap_south_east2, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Ap south east2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AP_SOUTH_EAST2__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Ap south east2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_south_east2_appliesConstraint(Ap_south_east2 ap_south_east2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(ap_south_east2, context) },
						 new Object[] { ap_south_east2 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateAsiapacific_appliesConstraint(ap_south_east2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_central_1(Eu_central_1 eu_central_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eu_central_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eu_central_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateEu_central_1_appliesConstraint(eu_central_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Eu central 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EU_CENTRAL_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Eu central 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEu_central_1_appliesConstraint(Eu_central_1 eu_central_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(eu_central_1, context) },
						 new Object[] { eu_central_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateEurope_appliesConstraint(eu_central_1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_northeast_1(Ap_northeast_1 ap_northeast_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ap_northeast_1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ap_northeast_1, diagnostics, context);
		if (result || diagnostics != null) result &= validateAp_northeast_1_appliesConstraint(ap_northeast_1, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Ap northeast 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AP_NORTHEAST_1__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(awsregions::Awsregion)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Ap northeast 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAp_northeast_1_appliesConstraint(Ap_northeast_1 ap_northeast_1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(ap_northeast_1, context) },
						 new Object[] { ap_northeast_1 },
						 context));
			}
			return false;
		}
		return regionsValidator.validateAsiapacific_appliesConstraint(ap_northeast_1, diagnostics, context);
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

} //AwsregionsValidator
