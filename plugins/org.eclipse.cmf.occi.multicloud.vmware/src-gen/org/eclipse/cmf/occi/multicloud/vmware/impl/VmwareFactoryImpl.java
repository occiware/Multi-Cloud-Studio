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
package org.eclipse.cmf.occi.multicloud.vmware.impl;

import org.eclipse.cmf.occi.multicloud.vmware.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwareFactoryImpl extends EFactoryImpl implements VmwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmwareFactory init() {
		try {
			VmwareFactory theVmwareFactory = (VmwareFactory)EPackage.Registry.INSTANCE.getEFactory(VmwarePackage.eNS_URI);
			if (theVmwareFactory != null) {
				return theVmwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VmwarePackage.INSTANCEVMWARE: return createInstancevmware();
			case VmwarePackage.STORAGEVMWARE: return createStoragevmware();
			case VmwarePackage.STORAGELINKVMWARE: return createStoragelinkvmware();
			case VmwarePackage.VSWITCH: return createVswitch();
			case VmwarePackage.NETWORKADAPTER: return createNetworkadapter();
			case VmwarePackage.WINDOWS: return createWindows();
			case VmwarePackage.LINUX: return createLinux();
			case VmwarePackage.MACOSX: return createMacosx();
			case VmwarePackage.VMWAREFOLDERS: return createVmwarefolders();
			case VmwarePackage.OS_TPL_VMWARE: return createOs_tpl_vmware();
			case VmwarePackage.SSH_USER_DATA: return createSsh_user_data();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VmwarePackage.GUEST_OS_IDENTIFIERS:
				return createGuestOsIdentifiersFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VmwarePackage.GUEST_OS_IDENTIFIERS:
				return convertGuestOsIdentifiersToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instancevmware createInstancevmware() {
		InstancevmwareImpl instancevmware = new InstancevmwareImpl();
		return instancevmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storagevmware createStoragevmware() {
		StoragevmwareImpl storagevmware = new StoragevmwareImpl();
		return storagevmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storagelinkvmware createStoragelinkvmware() {
		StoragelinkvmwareImpl storagelinkvmware = new StoragelinkvmwareImpl();
		return storagelinkvmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vswitch createVswitch() {
		VswitchImpl vswitch = new VswitchImpl();
		return vswitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networkadapter createNetworkadapter() {
		NetworkadapterImpl networkadapter = new NetworkadapterImpl();
		return networkadapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Windows createWindows() {
		WindowsImpl windows = new WindowsImpl();
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linux createLinux() {
		LinuxImpl linux = new LinuxImpl();
		return linux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macosx createMacosx() {
		MacosxImpl macosx = new MacosxImpl();
		return macosx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vmwarefolders createVmwarefolders() {
		VmwarefoldersImpl vmwarefolders = new VmwarefoldersImpl();
		return vmwarefolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Os_tpl_vmware createOs_tpl_vmware() {
		Os_tpl_vmwareImpl os_tpl_vmware = new Os_tpl_vmwareImpl();
		return os_tpl_vmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ssh_user_data createSsh_user_data() {
		Ssh_user_dataImpl ssh_user_data = new Ssh_user_dataImpl();
		return ssh_user_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestOsIdentifiers createGuestOsIdentifiersFromString(EDataType eDataType, String initialValue) {
		GuestOsIdentifiers result = GuestOsIdentifiers.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuestOsIdentifiersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwarePackage getVmwarePackage() {
		return (VmwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmwarePackage getPackage() {
		return VmwarePackage.eINSTANCE;
	}

} //VmwareFactoryImpl
