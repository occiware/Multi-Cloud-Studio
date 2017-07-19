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
package org.eclipse.cmf.occi.multicloud.vmware;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwareFactory
 * @model kind="package"
 * @generated
 */
public interface VmwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vmware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/infrastructure/vmware/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vmware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmwarePackage eINSTANCE = org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl <em>Windows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getWindows()
	 * @generated
	 */
	int WINDOWS = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Guestid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__GUESTID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__DATASTOREISOPATH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Windows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Windows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl <em>Vmaddon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVmaddon()
	 * @generated
	 */
	int VMADDON = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Imagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__IMAGENAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__VCPU = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gueststate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__GUESTSTATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guestosid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__GUESTOSID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Markedastemplate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON__MARKEDASTEMPLATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vmaddon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vmaddon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMADDON_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmimageImpl <em>Vmimage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmimageImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVmimage()
	 * @generated
	 */
	int VMIMAGE = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIMAGE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIMAGE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIMAGE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Imagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIMAGE__IMAGENAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vmimage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIMAGE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIMAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vmimage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMIMAGE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl <em>Linux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getLinux()
	 * @generated
	 */
	int LINUX = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Guestid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__GUESTID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__DATASTOREISOPATH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.MacosxImpl <em>Macosx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.MacosxImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getMacosx()
	 * @generated
	 */
	int MACOSX = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Guestid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__GUESTID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__DATASTOREISOPATH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Macosx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Macosx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl <em>Vmwarefolders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVmwarefolders()
	 * @generated
	 */
	int VMWAREFOLDERS = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Datacentername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__DATACENTERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datastorename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__DATASTORENAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clustername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__CLUSTERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hostsystemname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__HOSTSYSTEMNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventorypath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS__INVENTORYPATH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vmwarefolders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vmwarefolders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchinfosImpl <em>Vswitchinfos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchinfosImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVswitchinfos()
	 * @generated
	 */
	int VSWITCHINFOS = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCHINFOS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCHINFOS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCHINFOS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Nbport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCHINFOS__NBPORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vswitchinfos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCHINFOS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCHINFOS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vswitchinfos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCHINFOS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.CredentialImpl <em>Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.CredentialImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getCredential()
	 * @generated
	 */
	int CREDENTIAL = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__USER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__PASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Userdata File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__OCCI_COMPUTE_USERDATA_FILE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers <em>Guest Os Identifiers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getGuestOsIdentifiers()
	 * @generated
	 */
	int GUEST_OS_IDENTIFIERS = 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Windows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Windows
	 * @generated
	 */
	EClass getWindows();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Windows#getGuestid <em>Guestid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guestid</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Windows#getGuestid()
	 * @see #getWindows()
	 * @generated
	 */
	EAttribute getWindows_Guestid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Windows#getDatastoreisopath <em>Datastoreisopath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastoreisopath</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Windows#getDatastoreisopath()
	 * @see #getWindows()
	 * @generated
	 */
	EAttribute getWindows_Datastoreisopath();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Windows#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Windows#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWindows__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon <em>Vmaddon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vmaddon</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmaddon
	 * @generated
	 */
	EClass getVmaddon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getVcpu <em>Vcpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpu</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getVcpu()
	 * @see #getVmaddon()
	 * @generated
	 */
	EAttribute getVmaddon_Vcpu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGueststate <em>Gueststate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gueststate</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGueststate()
	 * @see #getVmaddon()
	 * @generated
	 */
	EAttribute getVmaddon_Gueststate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGuestosid <em>Guestosid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guestosid</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGuestosid()
	 * @see #getVmaddon()
	 * @generated
	 */
	EAttribute getVmaddon_Guestosid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getMarkedastemplate <em>Markedastemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Markedastemplate</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getMarkedastemplate()
	 * @see #getVmaddon()
	 * @generated
	 */
	EAttribute getVmaddon_Markedastemplate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVmaddon__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmimage <em>Vmimage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vmimage</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmimage
	 * @generated
	 */
	EClass getVmimage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmimage#getImagename <em>Imagename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imagename</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmimage#getImagename()
	 * @see #getVmimage()
	 * @generated
	 */
	EAttribute getVmimage_Imagename();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmimage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmimage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVmimage__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Linux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Linux
	 * @generated
	 */
	EClass getLinux();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Linux#getGuestid <em>Guestid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guestid</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Linux#getGuestid()
	 * @see #getLinux()
	 * @generated
	 */
	EAttribute getLinux_Guestid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Linux#getDatastoreisopath <em>Datastoreisopath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastoreisopath</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Linux#getDatastoreisopath()
	 * @see #getLinux()
	 * @generated
	 */
	EAttribute getLinux_Datastoreisopath();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Linux#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Linux#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLinux__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx <em>Macosx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macosx</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Macosx
	 * @generated
	 */
	EClass getMacosx();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx#getGuestid <em>Guestid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guestid</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Macosx#getGuestid()
	 * @see #getMacosx()
	 * @generated
	 */
	EAttribute getMacosx_Guestid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx#getDatastoreisopath <em>Datastoreisopath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastoreisopath</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Macosx#getDatastoreisopath()
	 * @see #getMacosx()
	 * @generated
	 */
	EAttribute getMacosx_Datastoreisopath();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Macosx#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMacosx__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders <em>Vmwarefolders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vmwarefolders</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders
	 * @generated
	 */
	EClass getVmwarefolders();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatacentername <em>Datacentername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacentername</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatacentername()
	 * @see #getVmwarefolders()
	 * @generated
	 */
	EAttribute getVmwarefolders_Datacentername();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatastorename <em>Datastorename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastorename</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatastorename()
	 * @see #getVmwarefolders()
	 * @generated
	 */
	EAttribute getVmwarefolders_Datastorename();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getClustername <em>Clustername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clustername</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getClustername()
	 * @see #getVmwarefolders()
	 * @generated
	 */
	EAttribute getVmwarefolders_Clustername();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getHostsystemname <em>Hostsystemname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostsystemname</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getHostsystemname()
	 * @see #getVmwarefolders()
	 * @generated
	 */
	EAttribute getVmwarefolders_Hostsystemname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getInventorypath <em>Inventorypath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventorypath</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getInventorypath()
	 * @see #getVmwarefolders()
	 * @generated
	 */
	EAttribute getVmwarefolders_Inventorypath();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVmwarefolders__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Vswitchinfos <em>Vswitchinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vswitchinfos</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vswitchinfos
	 * @generated
	 */
	EClass getVswitchinfos();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vswitchinfos#getNbport <em>Nbport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbport</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vswitchinfos#getNbport()
	 * @see #getVswitchinfos()
	 * @generated
	 */
	EAttribute getVswitchinfos_Nbport();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vswitchinfos#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vswitchinfos#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVswitchinfos__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Credential
	 * @generated
	 */
	EClass getCredential();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Credential#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Credential#getUser()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_User();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Credential#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Credential#getPassword()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Credential#getOcciComputeUserdataFile <em>Occi Compute Userdata File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Userdata File</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Credential#getOcciComputeUserdataFile()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_OcciComputeUserdataFile();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.vmware.Credential#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Credential#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCredential__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers <em>Guest Os Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guest Os Identifiers</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
	 * @generated
	 */
	EEnum getGuestOsIdentifiers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmwareFactory getVmwareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl <em>Windows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getWindows()
		 * @generated
		 */
		EClass WINDOWS = eINSTANCE.getWindows();

		/**
		 * The meta object literal for the '<em><b>Guestid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS__GUESTID = eINSTANCE.getWindows_Guestid();

		/**
		 * The meta object literal for the '<em><b>Datastoreisopath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS__DATASTOREISOPATH = eINSTANCE.getWindows_Datastoreisopath();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WINDOWS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWindows__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl <em>Vmaddon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVmaddon()
		 * @generated
		 */
		EClass VMADDON = eINSTANCE.getVmaddon();

		/**
		 * The meta object literal for the '<em><b>Vcpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMADDON__VCPU = eINSTANCE.getVmaddon_Vcpu();

		/**
		 * The meta object literal for the '<em><b>Gueststate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMADDON__GUESTSTATE = eINSTANCE.getVmaddon_Gueststate();

		/**
		 * The meta object literal for the '<em><b>Guestosid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMADDON__GUESTOSID = eINSTANCE.getVmaddon_Guestosid();

		/**
		 * The meta object literal for the '<em><b>Markedastemplate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMADDON__MARKEDASTEMPLATE = eINSTANCE.getVmaddon_Markedastemplate();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VMADDON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVmaddon__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmimageImpl <em>Vmimage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmimageImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVmimage()
		 * @generated
		 */
		EClass VMIMAGE = eINSTANCE.getVmimage();

		/**
		 * The meta object literal for the '<em><b>Imagename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMIMAGE__IMAGENAME = eINSTANCE.getVmimage_Imagename();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VMIMAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVmimage__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl <em>Linux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getLinux()
		 * @generated
		 */
		EClass LINUX = eINSTANCE.getLinux();

		/**
		 * The meta object literal for the '<em><b>Guestid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX__GUESTID = eINSTANCE.getLinux_Guestid();

		/**
		 * The meta object literal for the '<em><b>Datastoreisopath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX__DATASTOREISOPATH = eINSTANCE.getLinux_Datastoreisopath();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINUX___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLinux__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.MacosxImpl <em>Macosx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.MacosxImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getMacosx()
		 * @generated
		 */
		EClass MACOSX = eINSTANCE.getMacosx();

		/**
		 * The meta object literal for the '<em><b>Guestid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACOSX__GUESTID = eINSTANCE.getMacosx_Guestid();

		/**
		 * The meta object literal for the '<em><b>Datastoreisopath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACOSX__DATASTOREISOPATH = eINSTANCE.getMacosx_Datastoreisopath();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MACOSX___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMacosx__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl <em>Vmwarefolders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVmwarefolders()
		 * @generated
		 */
		EClass VMWAREFOLDERS = eINSTANCE.getVmwarefolders();

		/**
		 * The meta object literal for the '<em><b>Datacentername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMWAREFOLDERS__DATACENTERNAME = eINSTANCE.getVmwarefolders_Datacentername();

		/**
		 * The meta object literal for the '<em><b>Datastorename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMWAREFOLDERS__DATASTORENAME = eINSTANCE.getVmwarefolders_Datastorename();

		/**
		 * The meta object literal for the '<em><b>Clustername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMWAREFOLDERS__CLUSTERNAME = eINSTANCE.getVmwarefolders_Clustername();

		/**
		 * The meta object literal for the '<em><b>Hostsystemname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMWAREFOLDERS__HOSTSYSTEMNAME = eINSTANCE.getVmwarefolders_Hostsystemname();

		/**
		 * The meta object literal for the '<em><b>Inventorypath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMWAREFOLDERS__INVENTORYPATH = eINSTANCE.getVmwarefolders_Inventorypath();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VMWAREFOLDERS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVmwarefolders__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchinfosImpl <em>Vswitchinfos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchinfosImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVswitchinfos()
		 * @generated
		 */
		EClass VSWITCHINFOS = eINSTANCE.getVswitchinfos();

		/**
		 * The meta object literal for the '<em><b>Nbport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSWITCHINFOS__NBPORT = eINSTANCE.getVswitchinfos_Nbport();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VSWITCHINFOS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVswitchinfos__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.CredentialImpl <em>Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.CredentialImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getCredential()
		 * @generated
		 */
		EClass CREDENTIAL = eINSTANCE.getCredential();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__USER = eINSTANCE.getCredential_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__PASSWORD = eINSTANCE.getCredential_Password();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Userdata File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__OCCI_COMPUTE_USERDATA_FILE = eINSTANCE.getCredential_OcciComputeUserdataFile();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREDENTIAL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCredential__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers <em>Guest Os Identifiers</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getGuestOsIdentifiers()
		 * @generated
		 */
		EEnum GUEST_OS_IDENTIFIERS = eINSTANCE.getGuestOsIdentifiers();

	}

} //VmwarePackage
