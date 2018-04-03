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

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' infrastructure='http://schemas.ogf.org/occi/infrastructure/ecore' accounts='http://occiware.org/occi/infrastructure/security/ecore'"
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl <em>Instancevmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getInstancevmware()
	 * @generated
	 */
	int INSTANCEVMWARE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Imagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__IMAGENAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markedastemplate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__MARKEDASTEMPLATE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gueststate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__GUESTSTATE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guestosid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__GUESTOSID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__VCPU = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__INSTANCE_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Guest Ipv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__GUEST_IPV4_ADDRESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guest Ipv6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE__GUEST_IPV6_ADDRESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Instancevmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Instancevmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVMWARE_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.StoragevmwareImpl <em>Storagevmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.StoragevmwareImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getStoragevmware()
	 * @generated
	 */
	int STORAGEVMWARE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__LOCATION = InfrastructurePackage.STORAGE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__PARTS = InfrastructurePackage.STORAGE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__RLINKS = InfrastructurePackage.STORAGE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__OCCI_STORAGE_SIZE = InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Occi Storage State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__OCCI_STORAGE_STATE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE__OCCI_STORAGE_STATE_MESSAGE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Storagevmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Storagevmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEVMWARE_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.StoragelinkvmwareImpl <em>Storagelinkvmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.StoragelinkvmwareImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getStoragelinkvmware()
	 * @generated
	 */
	int STORAGELINKVMWARE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__ID = InfrastructurePackage.STORAGELINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__TITLE = InfrastructurePackage.STORAGELINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__KIND = InfrastructurePackage.STORAGELINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__LOCATION = InfrastructurePackage.STORAGELINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__ATTRIBUTES = InfrastructurePackage.STORAGELINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__MIXINS = InfrastructurePackage.STORAGELINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__PARTS = InfrastructurePackage.STORAGELINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__SOURCE = InfrastructurePackage.STORAGELINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__TARGET = InfrastructurePackage.STORAGELINK__TARGET;

	/**
	 * The feature id for the '<em><b>Occi Storagelink Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__OCCI_STORAGELINK_DEVICEID = InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_DEVICEID;

	/**
	 * The feature id for the '<em><b>Occi Storagelink Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__OCCI_STORAGELINK_MOUNTPOINT = InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT;

	/**
	 * The feature id for the '<em><b>Occi Storagelink State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__OCCI_STORAGELINK_STATE = InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE;

	/**
	 * The feature id for the '<em><b>Occi Storagelink State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE__OCCI_STORAGELINK_STATE_MESSAGE = InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Storagelinkvmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE_FEATURE_COUNT = InfrastructurePackage.STORAGELINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE___OCCI_CREATE = InfrastructurePackage.STORAGELINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE___OCCI_RETRIEVE = InfrastructurePackage.STORAGELINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE___OCCI_UPDATE = InfrastructurePackage.STORAGELINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE___OCCI_DELETE = InfrastructurePackage.STORAGELINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Storagelinkvmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINKVMWARE_OPERATION_COUNT = InfrastructurePackage.STORAGELINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchImpl <em>Vswitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVswitch()
	 * @generated
	 */
	int VSWITCH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__ID = InfrastructurePackage.NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__TITLE = InfrastructurePackage.NETWORK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__KIND = InfrastructurePackage.NETWORK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__LOCATION = InfrastructurePackage.NETWORK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__ATTRIBUTES = InfrastructurePackage.NETWORK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__MIXINS = InfrastructurePackage.NETWORK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__PARTS = InfrastructurePackage.NETWORK__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__SUMMARY = InfrastructurePackage.NETWORK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__LINKS = InfrastructurePackage.NETWORK__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__RLINKS = InfrastructurePackage.NETWORK__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Network Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__OCCI_NETWORK_VLAN = InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN;

	/**
	 * The feature id for the '<em><b>Occi Network Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__OCCI_NETWORK_LABEL = InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL;

	/**
	 * The feature id for the '<em><b>Occi Network State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__OCCI_NETWORK_STATE = InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE;

	/**
	 * The feature id for the '<em><b>Occi Network State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__OCCI_NETWORK_STATE_MESSAGE = InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Nbport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__NBPORT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vswitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH_FEATURE_COUNT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_CREATE = InfrastructurePackage.NETWORK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_RETRIEVE = InfrastructurePackage.NETWORK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_UPDATE = InfrastructurePackage.NETWORK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_DELETE = InfrastructurePackage.NETWORK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___UP = InfrastructurePackage.NETWORK___UP;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___DOWN = InfrastructurePackage.NETWORK___DOWN;

	/**
	 * The number of operations of the '<em>Vswitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH_OPERATION_COUNT = InfrastructurePackage.NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.NetworkadapterImpl <em>Networkadapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.NetworkadapterImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getNetworkadapter()
	 * @generated
	 */
	int NETWORKADAPTER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__ID = InfrastructurePackage.NETWORKINTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__TITLE = InfrastructurePackage.NETWORKINTERFACE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__KIND = InfrastructurePackage.NETWORKINTERFACE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__LOCATION = InfrastructurePackage.NETWORKINTERFACE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__ATTRIBUTES = InfrastructurePackage.NETWORKINTERFACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__MIXINS = InfrastructurePackage.NETWORKINTERFACE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__PARTS = InfrastructurePackage.NETWORKINTERFACE__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__SOURCE = InfrastructurePackage.NETWORKINTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__TARGET = InfrastructurePackage.NETWORKINTERFACE__TARGET;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__OCCI_NETWORKINTERFACE_INTERFACE = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__OCCI_NETWORKINTERFACE_MAC = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__OCCI_NETWORKINTERFACE_STATE = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER__OCCI_NETWORKINTERFACE_STATE_MESSAGE = InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Networkadapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER_FEATURE_COUNT = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER___OCCI_CREATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER___OCCI_RETRIEVE = InfrastructurePackage.NETWORKINTERFACE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER___OCCI_UPDATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER___OCCI_DELETE = InfrastructurePackage.NETWORKINTERFACE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Networkadapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKADAPTER_OPERATION_COUNT = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VcenteraccountImpl <em>Vcenteraccount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VcenteraccountImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVcenteraccount()
	 * @generated
	 */
	int VCENTERACCOUNT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__ID = AccountsPackage.CLOUDACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__TITLE = AccountsPackage.CLOUDACCOUNT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__KIND = AccountsPackage.CLOUDACCOUNT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__LOCATION = AccountsPackage.CLOUDACCOUNT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__ATTRIBUTES = AccountsPackage.CLOUDACCOUNT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__MIXINS = AccountsPackage.CLOUDACCOUNT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__PARTS = AccountsPackage.CLOUDACCOUNT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__SUMMARY = AccountsPackage.CLOUDACCOUNT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__LINKS = AccountsPackage.CLOUDACCOUNT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT__RLINKS = AccountsPackage.CLOUDACCOUNT__RLINKS;

	/**
	 * The number of structural features of the '<em>Vcenteraccount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT_FEATURE_COUNT = AccountsPackage.CLOUDACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT___OCCI_CREATE = AccountsPackage.CLOUDACCOUNT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT___OCCI_RETRIEVE = AccountsPackage.CLOUDACCOUNT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT___OCCI_UPDATE = AccountsPackage.CLOUDACCOUNT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT___OCCI_DELETE = AccountsPackage.CLOUDACCOUNT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Vcenteraccount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERACCOUNT_OPERATION_COUNT = AccountsPackage.CLOUDACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl <em>Windows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getWindows()
	 * @generated
	 */
	int WINDOWS = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl <em>Linux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getLinux()
	 * @generated
	 */
	int LINUX = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.MacosxImpl <em>Macosx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.MacosxImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getMacosx()
	 * @generated
	 */
	int MACOSX = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl <em>Vmwarefolders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVmwarefolders()
	 * @generated
	 */
	int VMWAREFOLDERS = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.Os_tpl_vmwareImpl <em>Os tpl vmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.Os_tpl_vmwareImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getOs_tpl_vmware()
	 * @generated
	 */
	int OS_TPL_VMWARE = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_VMWARE__MIXIN = InfrastructurePackage.OS_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_VMWARE__ENTITY = InfrastructurePackage.OS_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_VMWARE__ATTRIBUTES = InfrastructurePackage.OS_TPL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_VMWARE__DATASTOREISOPATH = InfrastructurePackage.OS_TPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guestid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_VMWARE__GUESTID = InfrastructurePackage.OS_TPL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os tpl vmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_VMWARE_FEATURE_COUNT = InfrastructurePackage.OS_TPL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Os tpl vmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_VMWARE_OPERATION_COUNT = InfrastructurePackage.OS_TPL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__MIXIN = OS_TPL_VMWARE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__ENTITY = OS_TPL_VMWARE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__ATTRIBUTES = OS_TPL_VMWARE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__DATASTOREISOPATH = OS_TPL_VMWARE__DATASTOREISOPATH;

	/**
	 * The feature id for the '<em><b>Guestid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__GUESTID = OS_TPL_VMWARE__GUESTID;

	/**
	 * The number of structural features of the '<em>Windows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_FEATURE_COUNT = OS_TPL_VMWARE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Windows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OPERATION_COUNT = OS_TPL_VMWARE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__MIXIN = OS_TPL_VMWARE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__ENTITY = OS_TPL_VMWARE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__ATTRIBUTES = OS_TPL_VMWARE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__DATASTOREISOPATH = OS_TPL_VMWARE__DATASTOREISOPATH;

	/**
	 * The feature id for the '<em><b>Guestid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__GUESTID = OS_TPL_VMWARE__GUESTID;

	/**
	 * The number of structural features of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_FEATURE_COUNT = OS_TPL_VMWARE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERATION_COUNT = OS_TPL_VMWARE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__MIXIN = OS_TPL_VMWARE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__ENTITY = OS_TPL_VMWARE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__ATTRIBUTES = OS_TPL_VMWARE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__DATASTOREISOPATH = OS_TPL_VMWARE__DATASTOREISOPATH;

	/**
	 * The feature id for the '<em><b>Guestid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX__GUESTID = OS_TPL_VMWARE__GUESTID;

	/**
	 * The number of structural features of the '<em>Macosx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX_FEATURE_COUNT = OS_TPL_VMWARE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Macosx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACOSX_OPERATION_COUNT = OS_TPL_VMWARE_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Vmwarefolders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMWAREFOLDERS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.Ssh_user_dataImpl <em>Ssh user data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.Ssh_user_dataImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getSsh_user_data()
	 * @generated
	 */
	int SSH_USER_DATA = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA__MIXIN = InfrastructurePackage.USER_DATA__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA__ENTITY = InfrastructurePackage.USER_DATA__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA__ATTRIBUTES = InfrastructurePackage.USER_DATA__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Userdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA__OCCI_COMPUTE_USERDATA = InfrastructurePackage.USER_DATA__OCCI_COMPUTE_USERDATA;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA__PASSWORD = InfrastructurePackage.USER_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Userdata File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA__OCCI_COMPUTE_USERDATA_FILE = InfrastructurePackage.USER_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA__USER = InfrastructurePackage.USER_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ssh user data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA_FEATURE_COUNT = InfrastructurePackage.USER_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ssh user data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_USER_DATA_OPERATION_COUNT = InfrastructurePackage.USER_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VcentercredentialImpl <em>Vcentercredential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VcentercredentialImpl
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVcentercredential()
	 * @generated
	 */
	int VCENTERCREDENTIAL = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL__MIXIN = AccountsPackage.BASICCREDENTIAL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL__ENTITY = AccountsPackage.BASICCREDENTIAL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL__ATTRIBUTES = AccountsPackage.BASICCREDENTIAL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL__USERNAME = AccountsPackage.BASICCREDENTIAL__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL__PASSWORD = AccountsPackage.BASICCREDENTIAL__PASSWORD;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL__URL = AccountsPackage.BASICCREDENTIAL__URL;

	/**
	 * The number of structural features of the '<em>Vcentercredential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL_FEATURE_COUNT = AccountsPackage.BASICCREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Updatepassword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL___UPDATEPASSWORD = AccountsPackage.BASICCREDENTIAL___UPDATEPASSWORD;

	/**
	 * The number of operations of the '<em>Vcentercredential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCREDENTIAL_OPERATION_COUNT = AccountsPackage.BASICCREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers <em>Guest Os Identifiers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
	 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getGuestOsIdentifiers()
	 * @generated
	 */
	int GUEST_OS_IDENTIFIERS = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware <em>Instancevmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancevmware</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware
	 * @generated
	 */
	EClass getInstancevmware();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getImagename <em>Imagename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imagename</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getImagename()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_Imagename();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getMarkedastemplate <em>Markedastemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Markedastemplate</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getMarkedastemplate()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_Markedastemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGueststate <em>Gueststate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gueststate</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGueststate()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_Gueststate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestosid <em>Guestosid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guestosid</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestosid()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_Guestosid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getVcpu <em>Vcpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpu</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getVcpu()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_Vcpu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getInstanceId <em>Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getInstanceId()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_InstanceId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestIpv4Address <em>Guest Ipv4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Ipv4 Address</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestIpv4Address()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_GuestIpv4Address();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestIpv6Address <em>Guest Ipv6 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Ipv6 Address</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestIpv6Address()
	 * @see #getInstancevmware()
	 * @generated
	 */
	EAttribute getInstancevmware_GuestIpv6Address();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Storagevmware <em>Storagevmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storagevmware</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Storagevmware
	 * @generated
	 */
	EClass getStoragevmware();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Storagelinkvmware <em>Storagelinkvmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storagelinkvmware</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Storagelinkvmware
	 * @generated
	 */
	EClass getStoragelinkvmware();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Vswitch <em>Vswitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vswitch</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vswitch
	 * @generated
	 */
	EClass getVswitch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Vswitch#getNbport <em>Nbport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbport</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vswitch#getNbport()
	 * @see #getVswitch()
	 * @generated
	 */
	EAttribute getVswitch_Nbport();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Networkadapter <em>Networkadapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networkadapter</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Networkadapter
	 * @generated
	 */
	EClass getNetworkadapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Vcenteraccount <em>Vcenteraccount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vcenteraccount</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vcenteraccount
	 * @generated
	 */
	EClass getVcenteraccount();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Linux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Linux
	 * @generated
	 */
	EClass getLinux();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware <em>Os tpl vmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os tpl vmware</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware
	 * @generated
	 */
	EClass getOs_tpl_vmware();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getDatastoreisopath <em>Datastoreisopath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastoreisopath</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getDatastoreisopath()
	 * @see #getOs_tpl_vmware()
	 * @generated
	 */
	EAttribute getOs_tpl_vmware_Datastoreisopath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getGuestid <em>Guestid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guestid</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getGuestid()
	 * @see #getOs_tpl_vmware()
	 * @generated
	 */
	EAttribute getOs_tpl_vmware_Guestid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data <em>Ssh user data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssh user data</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data
	 * @generated
	 */
	EClass getSsh_user_data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getPassword()
	 * @see #getSsh_user_data()
	 * @generated
	 */
	EAttribute getSsh_user_data_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getOcciComputeUserdataFile <em>Occi Compute Userdata File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Userdata File</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getOcciComputeUserdataFile()
	 * @see #getSsh_user_data()
	 * @generated
	 */
	EAttribute getSsh_user_data_OcciComputeUserdataFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getUser()
	 * @see #getSsh_user_data()
	 * @generated
	 */
	EAttribute getSsh_user_data_User();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.vmware.Vcentercredential <em>Vcentercredential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vcentercredential</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.Vcentercredential
	 * @generated
	 */
	EClass getVcentercredential();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl <em>Instancevmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getInstancevmware()
		 * @generated
		 */
		EClass INSTANCEVMWARE = eINSTANCE.getInstancevmware();

		/**
		 * The meta object literal for the '<em><b>Imagename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__IMAGENAME = eINSTANCE.getInstancevmware_Imagename();

		/**
		 * The meta object literal for the '<em><b>Markedastemplate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__MARKEDASTEMPLATE = eINSTANCE.getInstancevmware_Markedastemplate();

		/**
		 * The meta object literal for the '<em><b>Gueststate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__GUESTSTATE = eINSTANCE.getInstancevmware_Gueststate();

		/**
		 * The meta object literal for the '<em><b>Guestosid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__GUESTOSID = eINSTANCE.getInstancevmware_Guestosid();

		/**
		 * The meta object literal for the '<em><b>Vcpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__VCPU = eINSTANCE.getInstancevmware_Vcpu();

		/**
		 * The meta object literal for the '<em><b>Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__INSTANCE_ID = eINSTANCE.getInstancevmware_InstanceId();

		/**
		 * The meta object literal for the '<em><b>Guest Ipv4 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__GUEST_IPV4_ADDRESS = eINSTANCE.getInstancevmware_GuestIpv4Address();

		/**
		 * The meta object literal for the '<em><b>Guest Ipv6 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCEVMWARE__GUEST_IPV6_ADDRESS = eINSTANCE.getInstancevmware_GuestIpv6Address();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.StoragevmwareImpl <em>Storagevmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.StoragevmwareImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getStoragevmware()
		 * @generated
		 */
		EClass STORAGEVMWARE = eINSTANCE.getStoragevmware();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.StoragelinkvmwareImpl <em>Storagelinkvmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.StoragelinkvmwareImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getStoragelinkvmware()
		 * @generated
		 */
		EClass STORAGELINKVMWARE = eINSTANCE.getStoragelinkvmware();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchImpl <em>Vswitch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVswitch()
		 * @generated
		 */
		EClass VSWITCH = eINSTANCE.getVswitch();

		/**
		 * The meta object literal for the '<em><b>Nbport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSWITCH__NBPORT = eINSTANCE.getVswitch_Nbport();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.NetworkadapterImpl <em>Networkadapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.NetworkadapterImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getNetworkadapter()
		 * @generated
		 */
		EClass NETWORKADAPTER = eINSTANCE.getNetworkadapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VcenteraccountImpl <em>Vcenteraccount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VcenteraccountImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVcenteraccount()
		 * @generated
		 */
		EClass VCENTERACCOUNT = eINSTANCE.getVcenteraccount();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl <em>Linux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.LinuxImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getLinux()
		 * @generated
		 */
		EClass LINUX = eINSTANCE.getLinux();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.Os_tpl_vmwareImpl <em>Os tpl vmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.Os_tpl_vmwareImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getOs_tpl_vmware()
		 * @generated
		 */
		EClass OS_TPL_VMWARE = eINSTANCE.getOs_tpl_vmware();

		/**
		 * The meta object literal for the '<em><b>Datastoreisopath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TPL_VMWARE__DATASTOREISOPATH = eINSTANCE.getOs_tpl_vmware_Datastoreisopath();

		/**
		 * The meta object literal for the '<em><b>Guestid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TPL_VMWARE__GUESTID = eINSTANCE.getOs_tpl_vmware_Guestid();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.Ssh_user_dataImpl <em>Ssh user data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.Ssh_user_dataImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getSsh_user_data()
		 * @generated
		 */
		EClass SSH_USER_DATA = eINSTANCE.getSsh_user_data();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSH_USER_DATA__PASSWORD = eINSTANCE.getSsh_user_data_Password();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Userdata File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSH_USER_DATA__OCCI_COMPUTE_USERDATA_FILE = eINSTANCE.getSsh_user_data_OcciComputeUserdataFile();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSH_USER_DATA__USER = eINSTANCE.getSsh_user_data_User();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VcentercredentialImpl <em>Vcentercredential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VcentercredentialImpl
		 * @see org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarePackageImpl#getVcentercredential()
		 * @generated
		 */
		EClass VCENTERCREDENTIAL = eINSTANCE.getVcentercredential();

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
