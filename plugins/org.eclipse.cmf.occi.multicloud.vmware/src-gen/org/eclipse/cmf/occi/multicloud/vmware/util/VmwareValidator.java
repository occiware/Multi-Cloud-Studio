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

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.infrastructure.util.InfrastructureValidator;

import org.eclipse.cmf.occi.multicloud.accounts.util.AccountsValidator;
import org.eclipse.cmf.occi.multicloud.vmware.*;

import org.eclipse.emf.common.util.Diagnostic;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Storagelinkvmware'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGELINKVMWARE__SOURCE_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Storagelinkvmware'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGELINKVMWARE__TARGET_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Networkadapter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKADAPTER__SOURCE_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Networkadapter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKADAPTER__TARGET_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Windows'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WINDOWS__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Linux'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINUX__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Macosx'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MACOSX__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Vmwarefolders'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VMWAREFOLDERS__APPLIES_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Os tpl vmware'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OS_TPL_VMWARE__APPLIES_CONSTRAINT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Ssh user data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SSH_USER_DATA__APPLIES_CONSTRAINT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Vcentercredential'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VCENTERCREDENTIAL__APPLIES_CONSTRAINT = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

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
	protected InfrastructureValidator infrastructureValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountsValidator accountsValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
		infrastructureValidator = InfrastructureValidator.INSTANCE;
		accountsValidator = AccountsValidator.INSTANCE;
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
			case VmwarePackage.INSTANCEVMWARE:
				return validateInstancevmware((Instancevmware)value, diagnostics, context);
			case VmwarePackage.STORAGEVMWARE:
				return validateStoragevmware((Storagevmware)value, diagnostics, context);
			case VmwarePackage.STORAGELINKVMWARE:
				return validateStoragelinkvmware((Storagelinkvmware)value, diagnostics, context);
			case VmwarePackage.VSWITCH:
				return validateVswitch((Vswitch)value, diagnostics, context);
			case VmwarePackage.NETWORKADAPTER:
				return validateNetworkadapter((Networkadapter)value, diagnostics, context);
			case VmwarePackage.VCENTERACCOUNT:
				return validateVcenteraccount((Vcenteraccount)value, diagnostics, context);
			case VmwarePackage.WINDOWS:
				return validateWindows((Windows)value, diagnostics, context);
			case VmwarePackage.LINUX:
				return validateLinux((Linux)value, diagnostics, context);
			case VmwarePackage.MACOSX:
				return validateMacosx((Macosx)value, diagnostics, context);
			case VmwarePackage.VMWAREFOLDERS:
				return validateVmwarefolders((Vmwarefolders)value, diagnostics, context);
			case VmwarePackage.OS_TPL_VMWARE:
				return validateOs_tpl_vmware((Os_tpl_vmware)value, diagnostics, context);
			case VmwarePackage.SSH_USER_DATA:
				return validateSsh_user_data((Ssh_user_data)value, diagnostics, context);
			case VmwarePackage.VCENTERCREDENTIAL:
				return validateVcentercredential((Vcentercredential)value, diagnostics, context);
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
	public boolean validateInstancevmware(Instancevmware instancevmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instancevmware, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(instancevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(instancevmware, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragevmware(Storagevmware storagevmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storagevmware, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(storagevmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(storagevmware, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragelinkvmware(Storagelinkvmware storagelinkvmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storagelinkvmware, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoragelinkvmware_targetConstraint(storagelinkvmware, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoragelinkvmware_sourceConstraint(storagelinkvmware, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Storagelinkvmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragelinkvmware_sourceConstraint(Storagelinkvmware storagelinkvmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storagelinkvmware.sourceConstraint(diagnostics, context);
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Storagelinkvmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragelinkvmware_targetConstraint(Storagelinkvmware storagelinkvmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storagelinkvmware.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVswitch(Vswitch vswitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vswitch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(vswitch, diagnostics, context);
		if (result || diagnostics != null) result &= infrastructureValidator.validateNetwork_UniqueVlan(vswitch, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkadapter(Networkadapter networkadapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkadapter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkadapter_targetConstraint(networkadapter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkadapter_sourceConstraint(networkadapter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Networkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkadapter_sourceConstraint(Networkadapter networkadapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkadapter.sourceConstraint(diagnostics, context);
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Networkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkadapter_targetConstraint(Networkadapter networkadapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkadapter.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVcenteraccount(Vcenteraccount vcenteraccount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vcenteraccount, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(vcenteraccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(vcenteraccount, diagnostics, context);
		return result;
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
	public boolean validateOs_tpl_vmware(Os_tpl_vmware os_tpl_vmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(os_tpl_vmware, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(os_tpl_vmware, diagnostics, context);
		if (result || diagnostics != null) result &= validateOs_tpl_vmware_appliesConstraint(os_tpl_vmware, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Os tpl vmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOs_tpl_vmware_appliesConstraint(Os_tpl_vmware os_tpl_vmware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return os_tpl_vmware.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSsh_user_data(Ssh_user_data ssh_user_data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ssh_user_data, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ssh_user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validateSsh_user_data_appliesConstraint(ssh_user_data, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Ssh user data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSsh_user_data_appliesConstraint(Ssh_user_data ssh_user_data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ssh_user_data.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVcentercredential(Vcentercredential vcentercredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vcentercredential, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vcentercredential, diagnostics, context);
		if (result || diagnostics != null) result &= validateVcentercredential_appliesConstraint(vcentercredential, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Vcentercredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVcentercredential_appliesConstraint(Vcentercredential vcentercredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vcentercredential.appliesConstraint(diagnostics, context);
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
