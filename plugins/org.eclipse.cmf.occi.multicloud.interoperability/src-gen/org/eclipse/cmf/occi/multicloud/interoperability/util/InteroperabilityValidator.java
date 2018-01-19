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
package org.eclipse.cmf.occi.multicloud.interoperability.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.interoperability.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage
 * @generated
 */
public class InteroperabilityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InteroperabilityValidator INSTANCE = new InteroperabilityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.interoperability";

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
	public InteroperabilityValidator() {
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
	  return InteroperabilityPackage.eINSTANCE;
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
			case InteroperabilityPackage.FILETRANSFEROPERATIONS:
				return validateFiletransferoperations((Filetransferoperations)value, diagnostics, context);
			case InteroperabilityPackage.HTTPTRANSFER:
				return validateHttptransfer((Httptransfer)value, diagnostics, context);
			case InteroperabilityPackage.SSHTRANSFER:
				return validateSshtransfer((Sshtransfer)value, diagnostics, context);
			case InteroperabilityPackage.TRANSFER_TYPE:
				return validateTransferType((TransferType)value, diagnostics, context);
			case InteroperabilityPackage.HTTP_MODE:
				return validateHttpMode((HttpMode)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiletransferoperations(Filetransferoperations filetransferoperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(filetransferoperations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validateFiletransferoperations_sourceConstraint(filetransferoperations, diagnostics, context);
		if (result || diagnostics != null) result &= validateFiletransferoperations_targetConstraint(filetransferoperations, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Filetransferoperations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILETRANSFEROPERATIONS__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(infrastructure::Compute)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Filetransferoperations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiletransferoperations_sourceConstraint(Filetransferoperations filetransferoperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteroperabilityPackage.Literals.FILETRANSFEROPERATIONS,
				 filetransferoperations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 FILETRANSFEROPERATIONS__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Filetransferoperations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILETRANSFEROPERATIONS__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(infrastructure::Compute)";

	/**
	 * Validates the targetConstraint constraint of '<em>Filetransferoperations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiletransferoperations_targetConstraint(Filetransferoperations filetransferoperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteroperabilityPackage.Literals.FILETRANSFEROPERATIONS,
				 filetransferoperations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 FILETRANSFEROPERATIONS__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttptransfer(Httptransfer httptransfer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(httptransfer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(httptransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHttptransfer_appliesConstraint(httptransfer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Httptransfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPTRANSFER__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(interoperability::Filetransferoperations)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Httptransfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttptransfer_appliesConstraint(Httptransfer httptransfer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteroperabilityPackage.Literals.HTTPTRANSFER,
				 httptransfer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 HTTPTRANSFER__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSshtransfer(Sshtransfer sshtransfer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sshtransfer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sshtransfer, diagnostics, context);
		if (result || diagnostics != null) result &= validateSshtransfer_appliesConstraint(sshtransfer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Sshtransfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SSHTRANSFER__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(interoperability::Filetransferoperations)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Sshtransfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSshtransfer_appliesConstraint(Sshtransfer sshtransfer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteroperabilityPackage.Literals.SSHTRANSFER,
				 sshtransfer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 SSHTRANSFER__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferType(TransferType transferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpMode(HttpMode httpMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //InteroperabilityValidator
