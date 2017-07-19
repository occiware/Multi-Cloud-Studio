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
package org.eclipse.cmf.occi.multicloud.vmware.util;

import java.util.Map;

import org.eclipse.cmf.occi.infrastructure.util.InfrastructureValidator;

import org.eclipse.cmf.occi.multicloud.vmware.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage
 * @generated
 */
public class VmwareValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VmwareValidator INSTANCE = new VmwareValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.vmware";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Windows'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WINDOWS__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Vmaddon'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VMADDON__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Vmimage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VMIMAGE__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Linux'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINUX__APPLIES_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Macosx'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MACOSX__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Vmwarefolders'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VMWAREFOLDERS__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Vswitchinfos'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VSWITCHINFOS__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Credential'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREDENTIAL__APPLIES_CONSTRAINT = 8;

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
	protected InfrastructureValidator infrastructureValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareValidator() {
		super();
		infrastructureValidator = InfrastructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return VmwarePackage.eINSTANCE;
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
			case VmwarePackage.WINDOWS:
				return validateWindows((Windows)value, diagnostics, context);
			case VmwarePackage.VMADDON:
				return validateVmaddon((Vmaddon)value, diagnostics, context);
			case VmwarePackage.VMIMAGE:
				return validateVmimage((Vmimage)value, diagnostics, context);
			case VmwarePackage.LINUX:
				return validateLinux((Linux)value, diagnostics, context);
			case VmwarePackage.MACOSX:
				return validateMacosx((Macosx)value, diagnostics, context);
			case VmwarePackage.VMWAREFOLDERS:
				return validateVmwarefolders((Vmwarefolders)value, diagnostics, context);
			case VmwarePackage.VSWITCHINFOS:
				return validateVswitchinfos((Vswitchinfos)value, diagnostics, context);
			case VmwarePackage.CREDENTIAL:
				return validateCredential((Credential)value, diagnostics, context);
			case VmwarePackage.GUEST_OS_IDENTIFIERS:
				return validateGuestOsIdentifiers((GuestOsIdentifiers)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindows(Windows windows, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(windows, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(windows, diagnostics, context);
		if (result || diagnostics != null) result &= validateWindows_appliesConstraint(windows, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Windows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindows_appliesConstraint(Windows windows, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return windows.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmaddon(Vmaddon vmaddon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vmaddon, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vmaddon, diagnostics, context);
		if (result || diagnostics != null) result &= validateVmaddon_appliesConstraint(vmaddon, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Vmaddon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmaddon_appliesConstraint(Vmaddon vmaddon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vmaddon.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmimage(Vmimage vmimage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vmimage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vmimage, diagnostics, context);
		if (result || diagnostics != null) result &= validateVmimage_appliesConstraint(vmimage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Vmimage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmimage_appliesConstraint(Vmimage vmimage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vmimage.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinux(Linux linux, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linux, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linux, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinux_appliesConstraint(linux, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Linux</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinux_appliesConstraint(Linux linux, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linux.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacosx(Macosx macosx, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(macosx, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(macosx, diagnostics, context);
		if (result || diagnostics != null) result &= validateMacosx_appliesConstraint(macosx, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Macosx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacosx_appliesConstraint(Macosx macosx, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return macosx.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmwarefolders(Vmwarefolders vmwarefolders, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vmwarefolders, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vmwarefolders, diagnostics, context);
		if (result || diagnostics != null) result &= validateVmwarefolders_appliesConstraint(vmwarefolders, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Vmwarefolders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmwarefolders_appliesConstraint(Vmwarefolders vmwarefolders, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vmwarefolders.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVswitchinfos(Vswitchinfos vswitchinfos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vswitchinfos, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vswitchinfos, diagnostics, context);
		if (result || diagnostics != null) result &= validateVswitchinfos_appliesConstraint(vswitchinfos, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Vswitchinfos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVswitchinfos_appliesConstraint(Vswitchinfos vswitchinfos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vswitchinfos.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredential(Credential credential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(credential, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(credential, diagnostics, context);
		if (result || diagnostics != null) result &= validateCredential_appliesConstraint(credential, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredential_appliesConstraint(Credential credential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return credential.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuestOsIdentifiers(GuestOsIdentifiers guestOsIdentifiers, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //VmwareValidator
