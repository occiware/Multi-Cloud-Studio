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
package org.eclipse.cmf.occi.multicloud.accounts.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.accounts.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage
 * @generated
 */
public class AccountsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AccountsValidator INSTANCE = new AccountsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.accounts";

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
	public AccountsValidator() {
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
	  return AccountsPackage.eINSTANCE;
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
			case AccountsPackage.CLOUDACCOUNT:
				return validateCloudaccount((Cloudaccount)value, diagnostics, context);
			case AccountsPackage.CLOUDACCOUNTLINK:
				return validateCloudaccountlink((Cloudaccountlink)value, diagnostics, context);
			case AccountsPackage.BASICCREDENTIAL:
				return validateBasiccredential((Basiccredential)value, diagnostics, context);
			case AccountsPackage.CERTIFICATECREDENTIAL:
				return validateCertificatecredential((Certificatecredential)value, diagnostics, context);
			case AccountsPackage.KEYPAIRCREDENTIAL:
				return validateKeypaircredential((Keypaircredential)value, diagnostics, context);
			case AccountsPackage.CLOUDCREDENTIAL:
				return validateCloudcredential((Cloudcredential)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudaccount(Cloudaccount cloudaccount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudaccount, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(cloudaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(cloudaccount, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudaccountlink(Cloudaccountlink cloudaccountlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudaccountlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(cloudaccountlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudaccountlink_sourceConstraint(cloudaccountlink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Cloudaccountlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOUDACCOUNTLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(accounts::Cloudaccount)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Cloudaccountlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudaccountlink_sourceConstraint(Cloudaccountlink cloudaccountlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AccountsPackage.Literals.CLOUDACCOUNTLINK,
				 cloudaccountlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 CLOUDACCOUNTLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasiccredential(Basiccredential basiccredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basiccredential, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basiccredential, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasiccredential_appliesConstraint(basiccredential, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Basiccredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASICCREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(accounts::Cloudaccount)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Basiccredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasiccredential_appliesConstraint(Basiccredential basiccredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AccountsPackage.Literals.BASICCREDENTIAL,
				 basiccredential,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 BASICCREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificatecredential(Certificatecredential certificatecredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(certificatecredential, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(certificatecredential, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificatecredential_appliesConstraint(certificatecredential, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Certificatecredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CERTIFICATECREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(accounts::Cloudaccount)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Certificatecredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificatecredential_appliesConstraint(Certificatecredential certificatecredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AccountsPackage.Literals.CERTIFICATECREDENTIAL,
				 certificatecredential,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 CERTIFICATECREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeypaircredential(Keypaircredential keypaircredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(keypaircredential, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(keypaircredential, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeypaircredential_appliesConstraint(keypaircredential, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Keypaircredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYPAIRCREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(accounts::Cloudaccount)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Keypaircredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeypaircredential_appliesConstraint(Keypaircredential keypaircredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AccountsPackage.Literals.KEYPAIRCREDENTIAL,
				 keypaircredential,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 KEYPAIRCREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudcredential(Cloudcredential cloudcredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudcredential, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudcredential, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudcredential_appliesConstraint(cloudcredential, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Cloudcredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOUDCREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(accounts::Cloudaccount)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Cloudcredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudcredential_appliesConstraint(Cloudcredential cloudcredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AccountsPackage.Literals.CLOUDCREDENTIAL,
				 cloudcredential,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 CLOUDCREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //AccountsValidator
