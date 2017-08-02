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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.crtp.CrtpPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.cmf.occi.multicloud.vmware.Linux;
import org.eclipse.cmf.occi.multicloud.vmware.Macosx;
import org.eclipse.cmf.occi.multicloud.vmware.Networkadapter;
import org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware;
import org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data;
import org.eclipse.cmf.occi.multicloud.vmware.Storagelinkvmware;
import org.eclipse.cmf.occi.multicloud.vmware.Storagevmware;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareFactory;
import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;
import org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders;
import org.eclipse.cmf.occi.multicloud.vmware.Vswitch;
import org.eclipse.cmf.occi.multicloud.vmware.Windows;

import org.eclipse.cmf.occi.multicloud.vmware.util.VmwareValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwarePackageImpl extends EPackageImpl implements VmwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancevmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storagevmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storagelinkvmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vswitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkadapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linuxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macosxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmwarefoldersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass os_tpl_vmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssh_user_dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guestOsIdentifiersEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmwarePackageImpl() {
		super(eNS_URI, VmwareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VmwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VmwarePackage init() {
		if (isInited) return (VmwarePackage)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI);

		// Obtain or create and register package
		VmwarePackageImpl theVmwarePackage = (VmwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VmwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VmwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CrtpPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVmwarePackage.createPackageContents();

		// Initialize created meta-data
		theVmwarePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theVmwarePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return VmwareValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theVmwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmwarePackage.eNS_URI, theVmwarePackage);
		return theVmwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancevmware() {
		return instancevmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_Imagename() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_Markedastemplate() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_Gueststate() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_Guestosid() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_Vcpu() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_InstanceId() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_GuestIpv4Address() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevmware_GuestIpv6Address() {
		return (EAttribute)instancevmwareEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoragevmware() {
		return storagevmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoragelinkvmware() {
		return storagelinkvmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStoragelinkvmware__TargetConstraint__DiagnosticChain_Map() {
		return storagelinkvmwareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVswitch() {
		return vswitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVswitch_Nbport() {
		return (EAttribute)vswitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkadapter() {
		return networkadapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetworkadapter__TargetConstraint__DiagnosticChain_Map() {
		return networkadapterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindows() {
		return windowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWindows__AppliesConstraint__DiagnosticChain_Map() {
		return windowsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinux() {
		return linuxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinux__AppliesConstraint__DiagnosticChain_Map() {
		return linuxEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacosx() {
		return macosxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMacosx__AppliesConstraint__DiagnosticChain_Map() {
		return macosxEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVmwarefolders() {
		return vmwarefoldersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmwarefolders_Datacentername() {
		return (EAttribute)vmwarefoldersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmwarefolders_Datastorename() {
		return (EAttribute)vmwarefoldersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmwarefolders_Clustername() {
		return (EAttribute)vmwarefoldersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmwarefolders_Hostsystemname() {
		return (EAttribute)vmwarefoldersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmwarefolders_Inventorypath() {
		return (EAttribute)vmwarefoldersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVmwarefolders__AppliesConstraint__DiagnosticChain_Map() {
		return vmwarefoldersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOs_tpl_vmware() {
		return os_tpl_vmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOs_tpl_vmware_Datastoreisopath() {
		return (EAttribute)os_tpl_vmwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOs_tpl_vmware_Guestid() {
		return (EAttribute)os_tpl_vmwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOs_tpl_vmware__AppliesConstraint__DiagnosticChain_Map() {
		return os_tpl_vmwareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsh_user_data() {
		return ssh_user_dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsh_user_data_Password() {
		return (EAttribute)ssh_user_dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsh_user_data_OcciComputeUserdataFile() {
		return (EAttribute)ssh_user_dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsh_user_data_User() {
		return (EAttribute)ssh_user_dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSsh_user_data__AppliesConstraint__DiagnosticChain_Map() {
		return ssh_user_dataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuestOsIdentifiers() {
		return guestOsIdentifiersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareFactory getVmwareFactory() {
		return (VmwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		instancevmwareEClass = createEClass(INSTANCEVMWARE);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__IMAGENAME);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__MARKEDASTEMPLATE);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__GUESTSTATE);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__GUESTOSID);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__VCPU);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__INSTANCE_ID);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__GUEST_IPV4_ADDRESS);
		createEAttribute(instancevmwareEClass, INSTANCEVMWARE__GUEST_IPV6_ADDRESS);

		storagevmwareEClass = createEClass(STORAGEVMWARE);

		storagelinkvmwareEClass = createEClass(STORAGELINKVMWARE);
		createEOperation(storagelinkvmwareEClass, STORAGELINKVMWARE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		vswitchEClass = createEClass(VSWITCH);
		createEAttribute(vswitchEClass, VSWITCH__NBPORT);

		networkadapterEClass = createEClass(NETWORKADAPTER);
		createEOperation(networkadapterEClass, NETWORKADAPTER___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		windowsEClass = createEClass(WINDOWS);
		createEOperation(windowsEClass, WINDOWS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		linuxEClass = createEClass(LINUX);
		createEOperation(linuxEClass, LINUX___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		macosxEClass = createEClass(MACOSX);
		createEOperation(macosxEClass, MACOSX___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		vmwarefoldersEClass = createEClass(VMWAREFOLDERS);
		createEAttribute(vmwarefoldersEClass, VMWAREFOLDERS__DATACENTERNAME);
		createEAttribute(vmwarefoldersEClass, VMWAREFOLDERS__DATASTORENAME);
		createEAttribute(vmwarefoldersEClass, VMWAREFOLDERS__CLUSTERNAME);
		createEAttribute(vmwarefoldersEClass, VMWAREFOLDERS__HOSTSYSTEMNAME);
		createEAttribute(vmwarefoldersEClass, VMWAREFOLDERS__INVENTORYPATH);
		createEOperation(vmwarefoldersEClass, VMWAREFOLDERS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		os_tpl_vmwareEClass = createEClass(OS_TPL_VMWARE);
		createEAttribute(os_tpl_vmwareEClass, OS_TPL_VMWARE__DATASTOREISOPATH);
		createEAttribute(os_tpl_vmwareEClass, OS_TPL_VMWARE__GUESTID);
		createEOperation(os_tpl_vmwareEClass, OS_TPL_VMWARE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ssh_user_dataEClass = createEClass(SSH_USER_DATA);
		createEAttribute(ssh_user_dataEClass, SSH_USER_DATA__PASSWORD);
		createEAttribute(ssh_user_dataEClass, SSH_USER_DATA__OCCI_COMPUTE_USERDATA_FILE);
		createEAttribute(ssh_user_dataEClass, SSH_USER_DATA__USER);
		createEOperation(ssh_user_dataEClass, SSH_USER_DATA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create enums
		guestOsIdentifiersEEnum = createEEnum(GUEST_OS_IDENTIFIERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instancevmwareEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		storagevmwareEClass.getESuperTypes().add(theInfrastructurePackage.getStorage());
		storagelinkvmwareEClass.getESuperTypes().add(theInfrastructurePackage.getStoragelink());
		vswitchEClass.getESuperTypes().add(theInfrastructurePackage.getNetwork());
		networkadapterEClass.getESuperTypes().add(theInfrastructurePackage.getNetworkinterface());
		windowsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		windowsEClass.getESuperTypes().add(this.getOs_tpl_vmware());
		linuxEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		linuxEClass.getESuperTypes().add(this.getOs_tpl_vmware());
		macosxEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		macosxEClass.getESuperTypes().add(this.getOs_tpl_vmware());
		vmwarefoldersEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		os_tpl_vmwareEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		os_tpl_vmwareEClass.getESuperTypes().add(theInfrastructurePackage.getOs_tpl());
		ssh_user_dataEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ssh_user_dataEClass.getESuperTypes().add(theInfrastructurePackage.getUser_data());

		// Initialize classes, features, and operations; add parameters
		initEClass(instancevmwareEClass, Instancevmware.class, "Instancevmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstancevmware_Imagename(), theOCCIPackage.getString(), "imagename", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevmware_Markedastemplate(), theOCCIPackage.getString(), "markedastemplate", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevmware_Gueststate(), theOCCIPackage.getString(), "gueststate", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevmware_Guestosid(), theOCCIPackage.getString(), "guestosid", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevmware_Vcpu(), theOCCIPackage.getInteger(), "vcpu", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevmware_InstanceId(), theOCCIPackage.getString(), "instanceId", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevmware_GuestIpv4Address(), theOCCIPackage.getString(), "guestIpv4Address", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevmware_GuestIpv6Address(), theOCCIPackage.getString(), "guestIpv6Address", null, 0, 1, Instancevmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storagevmwareEClass, Storagevmware.class, "Storagevmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storagelinkvmwareEClass, Storagelinkvmware.class, "Storagelinkvmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getStoragelinkvmware__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vswitchEClass, Vswitch.class, "Vswitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVswitch_Nbport(), theOCCIPackage.getInteger(), "nbport", null, 0, 1, Vswitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkadapterEClass, Networkadapter.class, "Networkadapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNetworkadapter__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(windowsEClass, Windows.class, "Windows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getWindows__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linuxEClass, Linux.class, "Linux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLinux__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(macosxEClass, Macosx.class, "Macosx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMacosx__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmwarefoldersEClass, Vmwarefolders.class, "Vmwarefolders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVmwarefolders_Datacentername(), theOCCIPackage.getString(), "datacentername", null, 0, 1, Vmwarefolders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmwarefolders_Datastorename(), theOCCIPackage.getString(), "datastorename", null, 0, 1, Vmwarefolders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmwarefolders_Clustername(), theOCCIPackage.getString(), "clustername", null, 0, 1, Vmwarefolders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmwarefolders_Hostsystemname(), theOCCIPackage.getString(), "hostsystemname", null, 0, 1, Vmwarefolders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmwarefolders_Inventorypath(), theOCCIPackage.getString(), "inventorypath", null, 0, 1, Vmwarefolders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVmwarefolders__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(os_tpl_vmwareEClass, Os_tpl_vmware.class, "Os_tpl_vmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOs_tpl_vmware_Datastoreisopath(), theOCCIPackage.getString(), "datastoreisopath", null, 0, 1, Os_tpl_vmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOs_tpl_vmware_Guestid(), this.getGuestOsIdentifiers(), "guestid", null, 1, 1, Os_tpl_vmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOs_tpl_vmware__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ssh_user_dataEClass, Ssh_user_data.class, "Ssh_user_data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsh_user_data_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Ssh_user_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsh_user_data_OcciComputeUserdataFile(), theOCCIPackage.getString(), "occiComputeUserdataFile", null, 0, 1, Ssh_user_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsh_user_data_User(), theOCCIPackage.getString(), "user", null, 0, 1, Ssh_user_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSsh_user_data__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(guestOsIdentifiersEEnum, GuestOsIdentifiers.class, "GuestOsIdentifiers");
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DOS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN31_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN95_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN98_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_ME_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NT_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN2000_PRO_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN2000_SERV_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN2000_ADV_SERV_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_XP_HOME_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_XP_PRO_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_XP_PRO64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_WEB_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_STANDARD_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_ENTERPRISE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_DATACENTER_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_BUSINESS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_STANDARD64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_ENTERPRISE64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_LONGHORN_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_LONGHORN64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_DATACENTER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_VISTA_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_VISTA64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS7_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS7_SERVER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS8_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS8_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS8_SERVER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS9_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS9_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS9_SERVER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS_HYPER_VGUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FREEBSD_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FREEBSD64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.REDHAT_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL2_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL3_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL3_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL4_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL5_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL6_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL7_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.CENTOS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.CENTOS64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ORACLE_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ORACLE_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SUSE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SUSE64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES10_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES10_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES11_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES11_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES12_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES12_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NLD9_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OES_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SJDS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.MANDRAKE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.MANDRIVA_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.MANDRIVA64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.TURBO_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.TURBO_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.UBUNTU_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.UBUNTU64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN4_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN5_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN6_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN7_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN8_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN8_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX3_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX3_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX4_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX5_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPENSUSE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPENSUSE64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FEDORA_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FEDORA64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.COREOS64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER24X_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER26X_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER3X_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.GENERIC_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER24X_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER26X_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER3X_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS8_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS9_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS10_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS10_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS11_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OS2_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ECOM_STATION_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ECOM_STATION2_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NETWARE4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NETWARE5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NETWARE6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPEN_SERVER5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPEN_SERVER6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.UNIX_WARE7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN10_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN10_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN11_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN11_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN12_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN13_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN14_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.VMKERNEL_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.VMKERNEL5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.VMKERNEL6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_GUEST64);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (storagelinkvmwareEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (networkadapterEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (windowsEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (linuxEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (macosxEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (vmwarefoldersEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (os_tpl_vmwareEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (ssh_user_dataEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

} //VmwarePackageImpl
