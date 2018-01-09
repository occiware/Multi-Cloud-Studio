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
package org.eclipse.cmf.occi.multicloud.aws.ec2;

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
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' regions='http://occiware.org/occi/infrastructure/locations/ecore' accounts='http://occiware.org/occi/infrastructure/security/ecore' infrastructure='http://schemas.ogf.org/occi/infrastructure/ecore' awsregions='http://occiware.org/occi/infrastructure/locations/aws/ecore'"
 * @generated
 */
public interface Ec2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ec2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/infrastructure/aws/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ec2Package eINSTANCE = org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl <em>Instanceec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getInstanceec2()
	 * @generated
	 */
	int INSTANCEEC2 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__INSTANCE_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__INSTANCE_TYPE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__REGION_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__ZONE_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__IMAGE_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aws Instance Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__AWS_INSTANCE_STATUS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Launch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__LAUNCH_TIME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ami Launch Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__AMI_LAUNCH_INDEX = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ebs Optimized IO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__EBS_OPTIMIZED_IO = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ena Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__ENA_SUPPORT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__HYPERVISOR = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Instance Life Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__INSTANCE_LIFE_CYCLE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Kernel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__KERNEL_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Key Pair Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__KEY_PAIR_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Monitoring State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__MONITORING_STATE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__PLATFORM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Private DNS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__PRIVATE_DNS_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Private Ip V4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__PRIVATE_IP_V4_ADDRESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Public DNS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__PUBLIC_DNS_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Public Ipv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__PUBLIC_IPV4_ADDRESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Ram Disk Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__RAM_DISK_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Sriov Net Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__SRIOV_NET_SUPPORT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Virtualization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2__VIRTUALIZATION_TYPE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Instanceec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 24;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___TERMINATE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___START = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instanceec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEEC2_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.AwsaccountImpl <em>Awsaccount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.AwsaccountImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getAwsaccount()
	 * @generated
	 */
	int AWSACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__ID = AccountsPackage.CLOUDACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__TITLE = AccountsPackage.CLOUDACCOUNT__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__KIND = AccountsPackage.CLOUDACCOUNT__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__LOCATION = AccountsPackage.CLOUDACCOUNT__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__ATTRIBUTES = AccountsPackage.CLOUDACCOUNT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__MIXINS = AccountsPackage.CLOUDACCOUNT__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__PARTS = AccountsPackage.CLOUDACCOUNT__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__SUMMARY = AccountsPackage.CLOUDACCOUNT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__LINKS = AccountsPackage.CLOUDACCOUNT__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT__RLINKS = AccountsPackage.CLOUDACCOUNT__RLINKS;

	/**
	 * The number of structural features of the '<em>Awsaccount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT_FEATURE_COUNT = AccountsPackage.CLOUDACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT___OCCI_CREATE = AccountsPackage.CLOUDACCOUNT___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT___OCCI_RETRIEVE = AccountsPackage.CLOUDACCOUNT___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT___OCCI_UPDATE = AccountsPackage.CLOUDACCOUNT___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT___OCCI_DELETE = AccountsPackage.CLOUDACCOUNT___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Awsaccount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSACCOUNT_OPERATION_COUNT = AccountsPackage.CLOUDACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.AwscredentialImpl <em>Awscredential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.AwscredentialImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getAwscredential()
	 * @generated
	 */
	int AWSCREDENTIAL = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL__MIXIN = AccountsPackage.CLOUDCREDENTIAL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL__ENTITY = AccountsPackage.CLOUDCREDENTIAL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL__ATTRIBUTES = AccountsPackage.CLOUDCREDENTIAL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL__ACCESS_KEY = AccountsPackage.CLOUDCREDENTIAL__ACCESS_KEY;

	/**
	 * The feature id for the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL__SECRET_KEY = AccountsPackage.CLOUDCREDENTIAL__SECRET_KEY;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL__URL = AccountsPackage.CLOUDCREDENTIAL__URL;

	/**
	 * The number of structural features of the '<em>Awscredential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL_FEATURE_COUNT = AccountsPackage.CLOUDCREDENTIAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Awscredential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWSCREDENTIAL_OPERATION_COUNT = AccountsPackage.CLOUDCREDENTIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.GeneralpurposeImpl <em>Generalpurpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.GeneralpurposeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getGeneralpurpose()
	 * @generated
	 */
	int GENERALPURPOSE = 66;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALPURPOSE__MIXIN = InfrastructurePackage.RESOURCE_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALPURPOSE__ENTITY = InfrastructurePackage.RESOURCE_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALPURPOSE__ATTRIBUTES = InfrastructurePackage.RESOURCE_TPL__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Generalpurpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALPURPOSE_FEATURE_COUNT = InfrastructurePackage.RESOURCE_TPL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generalpurpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALPURPOSE_OPERATION_COUNT = InfrastructurePackage.RESOURCE_TPL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_nanoImpl <em>T2 nano</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_nanoImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT2_nano()
	 * @generated
	 */
	int T2_NANO = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T2 nano</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T2 nano</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_NANO_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_microImpl <em>T2 micro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_microImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT2_micro()
	 * @generated
	 */
	int T2_MICRO = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T2 micro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T2 micro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MICRO_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_smallImpl <em>T2 small</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_smallImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT2_small()
	 * @generated
	 */
	int T2_SMALL = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T2 small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T2 small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_SMALL_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_mediumImpl <em>T2 medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_mediumImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT2_medium()
	 * @generated
	 */
	int T2_MEDIUM = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T2 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T2 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_MEDIUM_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_largeImpl <em>T2 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT2_large()
	 * @generated
	 */
	int T2_LARGE = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T2 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T2 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_LARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_xlargeImpl <em>T2 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT2_xlarge()
	 * @generated
	 */
	int T2_XLARGE = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_2xlargeImpl <em>T2 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T2_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT2_2xlarge()
	 * @generated
	 */
	int T2_2XLARGE = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2_2XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_largeImpl <em>M5 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM5_large()
	 * @generated
	 */
	int M5_LARGE = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M5 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M5 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_LARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_xlargeImpl <em>M5 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM5_xlarge()
	 * @generated
	 */
	int M5_XLARGE = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M5 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M5 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_2xlargeImpl <em>M5 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM5_2xlarge()
	 * @generated
	 */
	int M5_2XLARGE = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M5 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M5 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_2XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_4xlargeImpl <em>M5 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM5_4xlarge()
	 * @generated
	 */
	int M5_4XLARGE = 13;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M5 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M5 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_4XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_12xlargeImpl <em>M5 12xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_12xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM5_12xlarge()
	 * @generated
	 */
	int M5_12XLARGE = 14;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M5 12xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M5 12xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_12XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_24xlargeImpl <em>M5 24xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M5_24xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM5_24xlarge()
	 * @generated
	 */
	int M5_24XLARGE = 15;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M5 24xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M5 24xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M5_24XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_largeImpl <em>M4 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM4_large()
	 * @generated
	 */
	int M4_LARGE = 16;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M4 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M4 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_LARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_xlargeImpl <em>M4 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM4_xlarge()
	 * @generated
	 */
	int M4_XLARGE = 17;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M4 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M4 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_2xlargeImpl <em>M4 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM4_2xlarge()
	 * @generated
	 */
	int M4_2XLARGE = 18;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M4 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M4 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_2XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_10xlargeImpl <em>M4 10xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_10xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM4_10xlarge()
	 * @generated
	 */
	int M4_10XLARGE = 19;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M4 10xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M4 10xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_10XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_16xlargeImpl <em>M4 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M4_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM4_16xlarge()
	 * @generated
	 */
	int M4_16XLARGE = 20;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M4 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M4 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M4_16XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_mediumImpl <em>M3 medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_mediumImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM3_medium()
	 * @generated
	 */
	int M3_MEDIUM = 21;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M3 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M3 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_MEDIUM_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_largeImpl <em>M3 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM3_large()
	 * @generated
	 */
	int M3_LARGE = 22;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_LARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_xlargeImpl <em>M3 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM3_xlarge()
	 * @generated
	 */
	int M3_XLARGE = 23;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_2xlargeImpl <em>M3 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M3_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM3_2xlarge()
	 * @generated
	 */
	int M3_2XLARGE = 24;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M3_2XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.ComputeoptimizedImpl <em>Computeoptimized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.ComputeoptimizedImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getComputeoptimized()
	 * @generated
	 */
	int COMPUTEOPTIMIZED = 67;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTEOPTIMIZED__MIXIN = InfrastructurePackage.RESOURCE_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTEOPTIMIZED__ENTITY = InfrastructurePackage.RESOURCE_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTEOPTIMIZED__ATTRIBUTES = InfrastructurePackage.RESOURCE_TPL__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Computeoptimized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTEOPTIMIZED_FEATURE_COUNT = InfrastructurePackage.RESOURCE_TPL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computeoptimized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTEOPTIMIZED_OPERATION_COUNT = InfrastructurePackage.RESOURCE_TPL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_largeImpl <em>C5 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC5_large()
	 * @generated
	 */
	int C5_LARGE = 25;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C5 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C5 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_LARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_xlargeImpl <em>C5 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC5_xlarge()
	 * @generated
	 */
	int C5_XLARGE = 26;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C5 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C5 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_2xlargeImpl <em>C5 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC5_2xlarge()
	 * @generated
	 */
	int C5_2XLARGE = 27;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C5 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C5 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_2XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_4xlargeImpl <em>C5 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC5_4xlarge()
	 * @generated
	 */
	int C5_4XLARGE = 28;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C5 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C5 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_4XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_9xlargeImpl <em>C5 9xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_9xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC5_9xlarge()
	 * @generated
	 */
	int C5_9XLARGE = 29;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C5 9xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C5 9xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_9XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_18xlargeImpl <em>C5 18xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C5_18xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC5_18xlarge()
	 * @generated
	 */
	int C5_18XLARGE = 30;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C5 18xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C5 18xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C5_18XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_largeImpl <em>C4 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC4_large()
	 * @generated
	 */
	int C4_LARGE = 31;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C4 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C4 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_LARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_xlargeImpl <em>C4 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC4_xlarge()
	 * @generated
	 */
	int C4_XLARGE = 32;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C4 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C4 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_2xlargeImpl <em>C4 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC4_2xlarge()
	 * @generated
	 */
	int C4_2XLARGE = 33;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C4 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C4 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_2XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_4xlargeImpl <em>C4 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC4_4xlarge()
	 * @generated
	 */
	int C4_4XLARGE = 34;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C4 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C4 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_4XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_8xlargeImpl <em>C4 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C4_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC4_8xlarge()
	 * @generated
	 */
	int C4_8XLARGE = 35;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>C4 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>C4 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_8XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_largeImpl <em>C3 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC3_large()
	 * @generated
	 */
	int C3_LARGE = 36;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_LARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_xlargeImpl <em>C3 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC3_xlarge()
	 * @generated
	 */
	int C3_XLARGE = 37;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_2xlargeImpl <em>C3 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC3_2xlarge()
	 * @generated
	 */
	int C3_2XLARGE = 38;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_2XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_4xlargeImpl <em>C3 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC3_4xlarge()
	 * @generated
	 */
	int C3_4XLARGE = 39;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_4XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_8xlargeImpl <em>C3 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C3_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC3_8xlarge()
	 * @generated
	 */
	int C3_8XLARGE = 40;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C3_8XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.MemoryoptimizedImpl <em>Memoryoptimized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.MemoryoptimizedImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getMemoryoptimized()
	 * @generated
	 */
	int MEMORYOPTIMIZED = 68;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYOPTIMIZED__MIXIN = InfrastructurePackage.RESOURCE_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYOPTIMIZED__ENTITY = InfrastructurePackage.RESOURCE_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYOPTIMIZED__ATTRIBUTES = InfrastructurePackage.RESOURCE_TPL__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Memoryoptimized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYOPTIMIZED_FEATURE_COUNT = InfrastructurePackage.RESOURCE_TPL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Memoryoptimized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYOPTIMIZED_OPERATION_COUNT = InfrastructurePackage.RESOURCE_TPL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_xlargeImpl <em>X1e xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1e_xlarge()
	 * @generated
	 */
	int X1E_XLARGE = 41;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1e xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1e xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_2xlargeImpl <em>X1e 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1e_2xlarge()
	 * @generated
	 */
	int X1E_2XLARGE = 42;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1e 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1e 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_2XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_4xlargeImpl <em>X1e 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1e_4xlarge()
	 * @generated
	 */
	int X1E_4XLARGE = 43;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1e 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1e 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_4XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_8xlargeImpl <em>X1e 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1e_8xlarge()
	 * @generated
	 */
	int X1E_8XLARGE = 44;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1e 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1e 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_8XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_16xlargeImpl <em>X1e 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1e_16xlarge()
	 * @generated
	 */
	int X1E_16XLARGE = 45;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1e 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1e 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_16XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_32xlargeImpl <em>X1e 32xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1e_32xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1e_32xlarge()
	 * @generated
	 */
	int X1E_32XLARGE = 46;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1e 32xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1e 32xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1E_32XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1_16xlargeImpl <em>X1 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1_16xlarge()
	 * @generated
	 */
	int X1_16XLARGE = 47;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_16XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1_32xlargeImpl <em>X1 32xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.X1_32xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getX1_32xlarge()
	 * @generated
	 */
	int X1_32XLARGE = 48;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>X1 32xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>X1 32xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X1_32XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_largeImpl <em>R4 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR4_large()
	 * @generated
	 */
	int R4_LARGE = 49;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>R4 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>R4 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_LARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_xlargeImpl <em>R4 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR4_xlarge()
	 * @generated
	 */
	int R4_XLARGE = 50;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>R4 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>R4 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_2xlargeImpl <em>R4 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR4_2xlarge()
	 * @generated
	 */
	int R4_2XLARGE = 51;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>R4 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>R4 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_2XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_4xlargeImpl <em>R4 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR4_4xlarge()
	 * @generated
	 */
	int R4_4XLARGE = 52;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>R4 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>R4 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_4XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_8xlargeImpl <em>R4 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR4_8xlarge()
	 * @generated
	 */
	int R4_8XLARGE = 53;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>R4 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>R4 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_8XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_16xlargeImpl <em>R4 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R4_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR4_16xlarge()
	 * @generated
	 */
	int R4_16XLARGE = 54;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>R4 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>R4 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R4_16XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_largeImpl <em>R3 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR3_large()
	 * @generated
	 */
	int R3_LARGE = 55;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>R3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>R3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_LARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_xlargeImpl <em>R3 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR3_xlarge()
	 * @generated
	 */
	int R3_XLARGE = 56;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>R3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>R3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_2xlargeImpl <em>R3 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR3_2xlarge()
	 * @generated
	 */
	int R3_2XLARGE = 57;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>R3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>R3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_2XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_4xlargeImpl <em>R3 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR3_4xlarge()
	 * @generated
	 */
	int R3_4XLARGE = 58;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>R3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>R3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_4XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_8xlargeImpl <em>R3 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.R3_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getR3_8xlarge()
	 * @generated
	 */
	int R3_8XLARGE = 59;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>R3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>R3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R3_8XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.AcceleratedcomputingImpl <em>Acceleratedcomputing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.AcceleratedcomputingImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getAcceleratedcomputing()
	 * @generated
	 */
	int ACCELERATEDCOMPUTING = 69;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATEDCOMPUTING__MIXIN = InfrastructurePackage.RESOURCE_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATEDCOMPUTING__ENTITY = InfrastructurePackage.RESOURCE_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATEDCOMPUTING__ATTRIBUTES = InfrastructurePackage.RESOURCE_TPL__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Acceleratedcomputing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATEDCOMPUTING_FEATURE_COUNT = InfrastructurePackage.RESOURCE_TPL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Acceleratedcomputing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATEDCOMPUTING_OPERATION_COUNT = InfrastructurePackage.RESOURCE_TPL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl <em>P3 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getP3_2xlarge()
	 * @generated
	 */
	int P3_2XLARGE = 60;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gpu P2P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE__GPU_P2P = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>P3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>P3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_2XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_8xlargeImpl <em>P3 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getP3_8xlarge()
	 * @generated
	 */
	int P3_8XLARGE = 61;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gpu P2P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE__GPU_P2P = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>P3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>P3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_8XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_16xlargeImpl <em>P3 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getP3_16xlarge()
	 * @generated
	 */
	int P3_16XLARGE = 62;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gpu P2P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE__GPU_P2P = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>P3 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>P3 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P3_16XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P2_xlargeImpl <em>P2 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P2_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getP2_xlarge()
	 * @generated
	 */
	int P2_XLARGE = 63;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gpu P2P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE__GPU_P2P = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>P2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>P2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P2_8xlargeImpl <em>P2 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P2_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getP2_8xlarge()
	 * @generated
	 */
	int P2_8XLARGE = 64;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gpu P2P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE__GPU_P2P = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>P2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>P2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_8XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P2_16xlargeImpl <em>P2 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P2_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getP2_16xlarge()
	 * @generated
	 */
	int P2_16XLARGE = 65;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gpu P2P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE__GPU_P2P = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>P2 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>P2 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2_16XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.StorageoptimizedImpl <em>Storageoptimized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.StorageoptimizedImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getStorageoptimized()
	 * @generated
	 */
	int STORAGEOPTIMIZED = 70;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEOPTIMIZED__MIXIN = InfrastructurePackage.RESOURCE_TPL__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEOPTIMIZED__ENTITY = InfrastructurePackage.RESOURCE_TPL__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEOPTIMIZED__ATTRIBUTES = InfrastructurePackage.RESOURCE_TPL__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Storageoptimized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEOPTIMIZED_FEATURE_COUNT = InfrastructurePackage.RESOURCE_TPL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storageoptimized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGEOPTIMIZED_OPERATION_COUNT = InfrastructurePackage.RESOURCE_TPL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G3_4xlargeImpl <em>G3 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G3_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getG3_4xlarge()
	 * @generated
	 */
	int G3_4XLARGE = 71;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>G3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>G3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_4XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G3_8xlargeImpl <em>G3 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G3_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getG3_8xlarge()
	 * @generated
	 */
	int G3_8XLARGE = 72;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>G3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>G3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_8XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G3_16xlargeImpl <em>G3 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G3_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getG3_16xlarge()
	 * @generated
	 */
	int G3_16XLARGE = 73;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__GPUS = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gpu Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE__GPU_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>G3 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>G3 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_16XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.F1_2xlargeImpl <em>F1 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.F1_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getF1_2xlarge()
	 * @generated
	 */
	int F1_2XLARGE = 74;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fpga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__FPGA = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>F1 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>F1 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_2XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.F1_16xlargeImpl <em>F1 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.F1_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getF1_16xlarge()
	 * @generated
	 */
	int F1_16XLARGE = 75;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fpga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__FPGA = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>F1 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>F1 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int F1_16XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_2xlargeImpl <em>H1 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getH1_2xlarge()
	 * @generated
	 */
	int H1_2XLARGE = 76;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H1 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>H1 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_2XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_4xlargeImpl <em>H1 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getH1_4xlarge()
	 * @generated
	 */
	int H1_4XLARGE = 77;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H1 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>H1 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_4XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_8xlargeImpl <em>H1 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getH1_8xlarge()
	 * @generated
	 */
	int H1_8XLARGE = 78;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H1 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>H1 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_8XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_16xlargeImpl <em>H1 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.H1_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getH1_16xlarge()
	 * @generated
	 */
	int H1_16XLARGE = 79;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H1 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>H1 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_16XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_largeImpl <em>I3 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI3_large()
	 * @generated
	 */
	int I3_LARGE = 80;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I3 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_LARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_xlargeImpl <em>I3 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI3_xlarge()
	 * @generated
	 */
	int I3_XLARGE = 81;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I3 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_2xlargeImpl <em>I3 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI3_2xlarge()
	 * @generated
	 */
	int I3_2XLARGE = 82;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I3 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_2XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_4xlargeImpl <em>I3 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI3_4xlarge()
	 * @generated
	 */
	int I3_4XLARGE = 83;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I3 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_4XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_8xlargeImpl <em>I3 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI3_8xlarge()
	 * @generated
	 */
	int I3_8XLARGE = 84;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I3 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_8XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_16xlargeImpl <em>I3 16xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_16xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI3_16xlarge()
	 * @generated
	 */
	int I3_16XLARGE = 85;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I3 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I3 16xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_16XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_metalImpl <em>I3 metal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I3_metalImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI3_metal()
	 * @generated
	 */
	int I3_METAL = 86;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I3 metal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I3 metal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I3_METAL_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_xlargeImpl <em>D2 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getD2_xlarge()
	 * @generated
	 */
	int D2_XLARGE = 87;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>D2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>D2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_2xlargeImpl <em>D2 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getD2_2xlarge()
	 * @generated
	 */
	int D2_2XLARGE = 88;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>D2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>D2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_2XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_4xlargeImpl <em>D2 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getD2_4xlarge()
	 * @generated
	 */
	int D2_4XLARGE = 89;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>D2 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>D2 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_4XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_8xlargeImpl <em>D2 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.D2_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getD2_8xlarge()
	 * @generated
	 */
	int D2_8XLARGE = 90;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>D2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>D2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D2_8XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_smallImpl <em>M1 small</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_smallImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM1_small()
	 * @generated
	 */
	int M1_SMALL = 91;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M1 small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M1 small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_SMALL_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T1_microImpl <em>T1 micro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.T1_microImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getT1_micro()
	 * @generated
	 */
	int T1_MICRO = 92;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>T1 micro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>T1 micro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T1_MICRO_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_mediumImpl <em>M1 medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_mediumImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM1_medium()
	 * @generated
	 */
	int M1_MEDIUM = 93;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M1 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M1 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_MEDIUM_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_largeImpl <em>M1 large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_largeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM1_large()
	 * @generated
	 */
	int M1_LARGE = 94;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M1 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M1 large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_LARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_xlargeImpl <em>M1 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M1_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM1_xlarge()
	 * @generated
	 */
	int M1_XLARGE = 95;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE__MIXIN = GENERALPURPOSE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE__ENTITY = GENERALPURPOSE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE__ATTRIBUTES = GENERALPURPOSE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE__OCCI_COMPUTE_MEMORY = GENERALPURPOSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE__INSTANCE_TYPE = GENERALPURPOSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE__OCCI_COMPUTE_CORES = GENERALPURPOSE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = GENERALPURPOSE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M1 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE_FEATURE_COUNT = GENERALPURPOSE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M1 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M1_XLARGE_OPERATION_COUNT = GENERALPURPOSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C1_mediumImpl <em>C1 medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C1_mediumImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC1_medium()
	 * @generated
	 */
	int C1_MEDIUM = 96;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C1 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C1 medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_MEDIUM_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C1_xlargeImpl <em>C1 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.C1_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getC1_xlarge()
	 * @generated
	 */
	int C1_XLARGE = 97;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>C1 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>C1 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cc2_8xlargeImpl <em>Cc2 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cc2_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getCc2_8xlarge()
	 * @generated
	 */
	int CC2_8XLARGE = 98;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE__MIXIN = COMPUTEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE__ENTITY = COMPUTEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE__ATTRIBUTES = COMPUTEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE__OCCI_COMPUTE_MEMORY = COMPUTEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE__INSTANCE_TYPE = COMPUTEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE__OCCI_COMPUTE_CORES = COMPUTEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = COMPUTEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cc2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE_FEATURE_COUNT = COMPUTEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cc2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CC2_8XLARGE_OPERATION_COUNT = COMPUTEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G2_2xlargeImpl <em>G2 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G2_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getG2_2xlarge()
	 * @generated
	 */
	int G2_2XLARGE = 99;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>G2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>G2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_2XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G2_8xlargeImpl <em>G2 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.G2_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getG2_8xlarge()
	 * @generated
	 */
	int G2_8XLARGE = 100;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>G2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>G2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G2_8XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cg1_4xlargeImpl <em>Cg1 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cg1_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getCg1_4xlarge()
	 * @generated
	 */
	int CG1_4XLARGE = 101;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE__MIXIN = ACCELERATEDCOMPUTING__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE__ENTITY = ACCELERATEDCOMPUTING__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE__ATTRIBUTES = ACCELERATEDCOMPUTING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE__OCCI_COMPUTE_MEMORY = ACCELERATEDCOMPUTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE__INSTANCE_TYPE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE__OCCI_COMPUTE_CORES = ACCELERATEDCOMPUTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = ACCELERATEDCOMPUTING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cg1 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE_FEATURE_COUNT = ACCELERATEDCOMPUTING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cg1 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CG1_4XLARGE_OPERATION_COUNT = ACCELERATEDCOMPUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M2_xlargeImpl <em>M2 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M2_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM2_xlarge()
	 * @generated
	 */
	int M2_XLARGE = 102;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M2_2xlargeImpl <em>M2 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M2_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM2_2xlarge()
	 * @generated
	 */
	int M2_2XLARGE = 103;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_2XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M2_4xlargeImpl <em>M2 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.M2_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getM2_4xlarge()
	 * @generated
	 */
	int M2_4XLARGE = 104;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M2 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M2 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M2_4XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cr1_8xlargeImpl <em>Cr1 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cr1_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getCr1_8xlarge()
	 * @generated
	 */
	int CR1_8XLARGE = 105;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE__MIXIN = MEMORYOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE__ENTITY = MEMORYOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE__ATTRIBUTES = MEMORYOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE__OCCI_COMPUTE_MEMORY = MEMORYOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE__INSTANCE_TYPE = MEMORYOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE__OCCI_COMPUTE_CORES = MEMORYOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = MEMORYOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cr1 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE_FEATURE_COUNT = MEMORYOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cr1 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR1_8XLARGE_OPERATION_COUNT = MEMORYOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_xlargeImpl <em>I2 xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI2_xlarge()
	 * @generated
	 */
	int I2_XLARGE = 106;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I2 xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_2xlargeImpl <em>I2 2xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_2xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI2_2xlarge()
	 * @generated
	 */
	int I2_2XLARGE = 107;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I2 2xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_2XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_4xlargeImpl <em>I2 4xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_4xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI2_4xlarge()
	 * @generated
	 */
	int I2_4XLARGE = 108;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I2 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I2 4xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_4XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_8xlargeImpl <em>I2 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.I2_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getI2_8xlarge()
	 * @generated
	 */
	int I2_8XLARGE = 109;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>I2 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2_8XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Hs1_8xlargeImpl <em>Hs1 8xlarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Hs1_8xlargeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getHs1_8xlarge()
	 * @generated
	 */
	int HS1_8XLARGE = 110;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE__MIXIN = STORAGEOPTIMIZED__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE__ENTITY = STORAGEOPTIMIZED__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE__ATTRIBUTES = STORAGEOPTIMIZED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE__OCCI_COMPUTE_MEMORY = STORAGEOPTIMIZED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE__INSTANCE_TYPE = STORAGEOPTIMIZED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE__OCCI_COMPUTE_CORES = STORAGEOPTIMIZED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = STORAGEOPTIMIZED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hs1 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE_FEATURE_COUNT = STORAGEOPTIMIZED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hs1 8xlarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS1_8XLARGE_OPERATION_COUNT = STORAGEOPTIMIZED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl <em>Placementgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getPlacementgroup()
	 * @generated
	 */
	int PLACEMENTGROUP = 111;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__GROUP_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__AFFINITY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__HOST_ID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spread Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__SPREAD_DOMAIN = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tenancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__TENANCY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP__ZONE_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Placementgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Placementgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTGROUP_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.RootdevicevolumeImpl <em>Rootdevicevolume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.RootdevicevolumeImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getRootdevicevolume()
	 * @generated
	 */
	int ROOTDEVICEVOLUME = 112;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTDEVICEVOLUME__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTDEVICEVOLUME__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTDEVICEVOLUME__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTDEVICEVOLUME__ROOT_DEVICE_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rootdevicevolume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTDEVICEVOLUME_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rootdevicevolume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOTDEVICEVOLUME_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.StatustransitionreasonImpl <em>Statustransitionreason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.StatustransitionreasonImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getStatustransitionreason()
	 * @generated
	 */
	int STATUSTRANSITIONREASON = 113;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSTRANSITIONREASON__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSTRANSITIONREASON__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSTRANSITIONREASON__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>State Transition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSTRANSITIONREASON__STATE_TRANSITION_CODE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Transition Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statustransitionreason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSTRANSITIONREASON_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statustransitionreason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSTRANSITIONREASON_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.TagsImpl <em>Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.TagsImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getTags()
	 * @generated
	 */
	int TAGS = 114;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl <em>Instancevpcinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getInstancevpcinfo()
	 * @generated
	 */
	int INSTANCEVPCINFO = 115;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO__VPC_ID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subnet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO__SUBNET_ID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Dest Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO__SOURCE_DEST_CHECK = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instancevpcinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instancevpcinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEVPCINFO_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState <em>AWS Instance State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getAWSInstanceState()
	 * @generated
	 */
	int AWS_INSTANCE_STATE = 116;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType <em>Hypervisor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getHypervisorType()
	 * @generated
	 */
	int HYPERVISOR_TYPE = 117;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType <em>Instance Life Cycle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getInstanceLifeCycleType()
	 * @generated
	 */
	int INSTANCE_LIFE_CYCLE_TYPE = 118;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState <em>Monitoring State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getMonitoringState()
	 * @generated
	 */
	int MONITORING_STATE = 119;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType <em>Virtualization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2PackageImpl#getVirtualizationType()
	 * @generated
	 */
	int VIRTUALIZATION_TYPE = 120;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2 <em>Instanceec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instanceec2</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2
	 * @generated
	 */
	EClass getInstanceec2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getName()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceId <em>Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceId()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_InstanceId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceType()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getRegionId()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getZoneName <em>Zone Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getZoneName()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_ZoneName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getImageId()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAwsInstanceStatus <em>Aws Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aws Instance Status</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAwsInstanceStatus()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_AwsInstanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getLaunchTime <em>Launch Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch Time</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getLaunchTime()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_LaunchTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAmiLaunchIndex <em>Ami Launch Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ami Launch Index</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAmiLaunchIndex()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_AmiLaunchIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEbsOptimizedIO <em>Ebs Optimized IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ebs Optimized IO</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEbsOptimizedIO()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_EbsOptimizedIO();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEnaSupport <em>Ena Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ena Support</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEnaSupport()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_EnaSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getHypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getHypervisor()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_Hypervisor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceLifeCycle <em>Instance Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Life Cycle</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceLifeCycle()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_InstanceLifeCycle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKernelId <em>Kernel Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKernelId()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_KernelId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKeyPairName <em>Key Pair Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Pair Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKeyPairName()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_KeyPairName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getMonitoringState <em>Monitoring State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring State</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getMonitoringState()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_MonitoringState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPlatform()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_Platform();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateDNSName <em>Private DNS Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private DNS Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateDNSName()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_PrivateDNSName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateIpV4Address <em>Private Ip V4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Ip V4 Address</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateIpV4Address()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_PrivateIpV4Address();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicDNSName <em>Public DNS Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public DNS Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicDNSName()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_PublicDNSName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicIpv4Address <em>Public Ipv4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Ipv4 Address</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicIpv4Address()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_PublicIpv4Address();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getRamDiskId <em>Ram Disk Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Disk Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getRamDiskId()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_RamDiskId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isSriovNetSupport <em>Sriov Net Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sriov Net Support</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isSriovNetSupport()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_SriovNetSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getVirtualizationType <em>Virtualization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtualization Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getVirtualizationType()
	 * @see #getInstanceec2()
	 * @generated
	 */
	EAttribute getInstanceec2_VirtualizationType();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#terminate()
	 * @generated
	 */
	EOperation getInstanceec2__Terminate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#restart(org.eclipse.cmf.occi.infrastructure.RestartMethod) <em>Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#restart(org.eclipse.cmf.occi.infrastructure.RestartMethod)
	 * @generated
	 */
	EOperation getInstanceec2__Restart__RestartMethod();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#start()
	 * @generated
	 */
	EOperation getInstanceec2__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#stop(org.eclipse.cmf.occi.infrastructure.StopMethod) <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#stop(org.eclipse.cmf.occi.infrastructure.StopMethod)
	 * @generated
	 */
	EOperation getInstanceec2__Stop__StopMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount <em>Awsaccount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Awsaccount</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount
	 * @generated
	 */
	EClass getAwsaccount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Awscredential <em>Awscredential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Awscredential</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Awscredential
	 * @generated
	 */
	EClass getAwscredential();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano <em>T2 nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2 nano</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano
	 * @generated
	 */
	EClass getT2_nano();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano#getOcciComputeMemory()
	 * @see #getT2_nano()
	 * @generated
	 */
	EAttribute getT2_nano_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano#getOcciComputeCores()
	 * @see #getT2_nano()
	 * @generated
	 */
	EAttribute getT2_nano_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano#getInstanceType()
	 * @see #getT2_nano()
	 * @generated
	 */
	EAttribute getT2_nano_InstanceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro <em>T2 micro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2 micro</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro
	 * @generated
	 */
	EClass getT2_micro();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro#getOcciComputeMemory()
	 * @see #getT2_micro()
	 * @generated
	 */
	EAttribute getT2_micro_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro#getOcciComputeCores()
	 * @see #getT2_micro()
	 * @generated
	 */
	EAttribute getT2_micro_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro#getInstanceType()
	 * @see #getT2_micro()
	 * @generated
	 */
	EAttribute getT2_micro_InstanceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small <em>T2 small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2 small</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small
	 * @generated
	 */
	EClass getT2_small();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small#getOcciComputeMemory()
	 * @see #getT2_small()
	 * @generated
	 */
	EAttribute getT2_small_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small#getInstanceType()
	 * @see #getT2_small()
	 * @generated
	 */
	EAttribute getT2_small_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small#getOcciComputeCores()
	 * @see #getT2_small()
	 * @generated
	 */
	EAttribute getT2_small_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium <em>T2 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2 medium</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium
	 * @generated
	 */
	EClass getT2_medium();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium#getOcciComputeMemory()
	 * @see #getT2_medium()
	 * @generated
	 */
	EAttribute getT2_medium_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium#getInstanceType()
	 * @see #getT2_medium()
	 * @generated
	 */
	EAttribute getT2_medium_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium#getOcciComputeCores()
	 * @see #getT2_medium()
	 * @generated
	 */
	EAttribute getT2_medium_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large <em>T2 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large
	 * @generated
	 */
	EClass getT2_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large#getOcciComputeMemory()
	 * @see #getT2_large()
	 * @generated
	 */
	EAttribute getT2_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large#getInstanceType()
	 * @see #getT2_large()
	 * @generated
	 */
	EAttribute getT2_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large#getOcciComputeCores()
	 * @see #getT2_large()
	 * @generated
	 */
	EAttribute getT2_large_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge <em>T2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge
	 * @generated
	 */
	EClass getT2_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge#getOcciComputeMemory()
	 * @see #getT2_xlarge()
	 * @generated
	 */
	EAttribute getT2_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge#getInstanceType()
	 * @see #getT2_xlarge()
	 * @generated
	 */
	EAttribute getT2_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge#getOcciComputeCores()
	 * @see #getT2_xlarge()
	 * @generated
	 */
	EAttribute getT2_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge <em>T2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge
	 * @generated
	 */
	EClass getT2_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge#getOcciComputeMemory()
	 * @see #getT2_2xlarge()
	 * @generated
	 */
	EAttribute getT2_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge#getInstanceType()
	 * @see #getT2_2xlarge()
	 * @generated
	 */
	EAttribute getT2_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge#getOcciComputeCores()
	 * @see #getT2_2xlarge()
	 * @generated
	 */
	EAttribute getT2_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large <em>M5 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M5 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large
	 * @generated
	 */
	EClass getM5_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeMemory()
	 * @see #getM5_large()
	 * @generated
	 */
	EAttribute getM5_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getInstanceType()
	 * @see #getM5_large()
	 * @generated
	 */
	EAttribute getM5_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeCores()
	 * @see #getM5_large()
	 * @generated
	 */
	EAttribute getM5_large_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge <em>M5 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M5 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge
	 * @generated
	 */
	EClass getM5_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge#getOcciComputeMemory()
	 * @see #getM5_xlarge()
	 * @generated
	 */
	EAttribute getM5_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge#getInstanceType()
	 * @see #getM5_xlarge()
	 * @generated
	 */
	EAttribute getM5_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge#getOcciComputeCores()
	 * @see #getM5_xlarge()
	 * @generated
	 */
	EAttribute getM5_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge <em>M5 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M5 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge
	 * @generated
	 */
	EClass getM5_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge#getOcciComputeMemory()
	 * @see #getM5_2xlarge()
	 * @generated
	 */
	EAttribute getM5_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge#getInstanceType()
	 * @see #getM5_2xlarge()
	 * @generated
	 */
	EAttribute getM5_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge#getOcciComputeCores()
	 * @see #getM5_2xlarge()
	 * @generated
	 */
	EAttribute getM5_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge <em>M5 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M5 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge
	 * @generated
	 */
	EClass getM5_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge#getOcciComputeMemory()
	 * @see #getM5_4xlarge()
	 * @generated
	 */
	EAttribute getM5_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge#getInstanceType()
	 * @see #getM5_4xlarge()
	 * @generated
	 */
	EAttribute getM5_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge#getOcciComputeCores()
	 * @see #getM5_4xlarge()
	 * @generated
	 */
	EAttribute getM5_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge <em>M5 12xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M5 12xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge
	 * @generated
	 */
	EClass getM5_12xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge#getOcciComputeMemory()
	 * @see #getM5_12xlarge()
	 * @generated
	 */
	EAttribute getM5_12xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge#getInstanceType()
	 * @see #getM5_12xlarge()
	 * @generated
	 */
	EAttribute getM5_12xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge#getOcciComputeCores()
	 * @see #getM5_12xlarge()
	 * @generated
	 */
	EAttribute getM5_12xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge <em>M5 24xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M5 24xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge
	 * @generated
	 */
	EClass getM5_24xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge#getOcciComputeMemory()
	 * @see #getM5_24xlarge()
	 * @generated
	 */
	EAttribute getM5_24xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge#getInstanceType()
	 * @see #getM5_24xlarge()
	 * @generated
	 */
	EAttribute getM5_24xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge#getOcciComputeCores()
	 * @see #getM5_24xlarge()
	 * @generated
	 */
	EAttribute getM5_24xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large <em>M4 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M4 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large
	 * @generated
	 */
	EClass getM4_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large#getOcciComputeMemory()
	 * @see #getM4_large()
	 * @generated
	 */
	EAttribute getM4_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large#getInstanceType()
	 * @see #getM4_large()
	 * @generated
	 */
	EAttribute getM4_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large#getOcciComputeCores()
	 * @see #getM4_large()
	 * @generated
	 */
	EAttribute getM4_large_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge <em>M4 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M4 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge
	 * @generated
	 */
	EClass getM4_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge#getOcciComputeMemory()
	 * @see #getM4_xlarge()
	 * @generated
	 */
	EAttribute getM4_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge#getInstanceType()
	 * @see #getM4_xlarge()
	 * @generated
	 */
	EAttribute getM4_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge#getOcciComputeCores()
	 * @see #getM4_xlarge()
	 * @generated
	 */
	EAttribute getM4_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge <em>M4 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M4 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge
	 * @generated
	 */
	EClass getM4_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge#getOcciComputeMemory()
	 * @see #getM4_2xlarge()
	 * @generated
	 */
	EAttribute getM4_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge#getInstanceType()
	 * @see #getM4_2xlarge()
	 * @generated
	 */
	EAttribute getM4_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge#getOcciComputeCores()
	 * @see #getM4_2xlarge()
	 * @generated
	 */
	EAttribute getM4_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge <em>M4 10xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M4 10xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge
	 * @generated
	 */
	EClass getM4_10xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge#getOcciComputeMemory()
	 * @see #getM4_10xlarge()
	 * @generated
	 */
	EAttribute getM4_10xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge#getInstanceType()
	 * @see #getM4_10xlarge()
	 * @generated
	 */
	EAttribute getM4_10xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge#getOcciComputeCores()
	 * @see #getM4_10xlarge()
	 * @generated
	 */
	EAttribute getM4_10xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge <em>M4 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M4 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge
	 * @generated
	 */
	EClass getM4_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge#getOcciComputeMemory()
	 * @see #getM4_16xlarge()
	 * @generated
	 */
	EAttribute getM4_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge#getInstanceType()
	 * @see #getM4_16xlarge()
	 * @generated
	 */
	EAttribute getM4_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge#getOcciComputeCores()
	 * @see #getM4_16xlarge()
	 * @generated
	 */
	EAttribute getM4_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium <em>M3 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M3 medium</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium
	 * @generated
	 */
	EClass getM3_medium();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getOcciComputeMemory()
	 * @see #getM3_medium()
	 * @generated
	 */
	EAttribute getM3_medium_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getInstanceType()
	 * @see #getM3_medium()
	 * @generated
	 */
	EAttribute getM3_medium_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getOcciComputeCores()
	 * @see #getM3_medium()
	 * @generated
	 */
	EAttribute getM3_medium_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium#getOcciComputeEphemeralStorageSize()
	 * @see #getM3_medium()
	 * @generated
	 */
	EAttribute getM3_medium_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large <em>M3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M3 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large
	 * @generated
	 */
	EClass getM3_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getOcciComputeMemory()
	 * @see #getM3_large()
	 * @generated
	 */
	EAttribute getM3_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getInstanceType()
	 * @see #getM3_large()
	 * @generated
	 */
	EAttribute getM3_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getOcciComputeCores()
	 * @see #getM3_large()
	 * @generated
	 */
	EAttribute getM3_large_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large#getOcciComputeEphemeralStorageSize()
	 * @see #getM3_large()
	 * @generated
	 */
	EAttribute getM3_large_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge <em>M3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M3 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge
	 * @generated
	 */
	EClass getM3_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getOcciComputeMemory()
	 * @see #getM3_xlarge()
	 * @generated
	 */
	EAttribute getM3_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getInstanceType()
	 * @see #getM3_xlarge()
	 * @generated
	 */
	EAttribute getM3_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getOcciComputeCores()
	 * @see #getM3_xlarge()
	 * @generated
	 */
	EAttribute getM3_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getM3_xlarge()
	 * @generated
	 */
	EAttribute getM3_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge <em>M3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M3 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge
	 * @generated
	 */
	EClass getM3_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getOcciComputeMemory()
	 * @see #getM3_2xlarge()
	 * @generated
	 */
	EAttribute getM3_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getInstanceType()
	 * @see #getM3_2xlarge()
	 * @generated
	 */
	EAttribute getM3_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getOcciComputeCores()
	 * @see #getM3_2xlarge()
	 * @generated
	 */
	EAttribute getM3_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getM3_2xlarge()
	 * @generated
	 */
	EAttribute getM3_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large <em>C5 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C5 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large
	 * @generated
	 */
	EClass getC5_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large#getOcciComputeMemory()
	 * @see #getC5_large()
	 * @generated
	 */
	EAttribute getC5_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large#getInstanceType()
	 * @see #getC5_large()
	 * @generated
	 */
	EAttribute getC5_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large#getOcciComputeCores()
	 * @see #getC5_large()
	 * @generated
	 */
	EAttribute getC5_large_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge <em>C5 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C5 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge
	 * @generated
	 */
	EClass getC5_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge#getOcciComputeMemory()
	 * @see #getC5_xlarge()
	 * @generated
	 */
	EAttribute getC5_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge#getInstanceType()
	 * @see #getC5_xlarge()
	 * @generated
	 */
	EAttribute getC5_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge#getOcciComputeCores()
	 * @see #getC5_xlarge()
	 * @generated
	 */
	EAttribute getC5_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge <em>C5 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C5 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge
	 * @generated
	 */
	EClass getC5_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge#getOcciComputeMemory()
	 * @see #getC5_2xlarge()
	 * @generated
	 */
	EAttribute getC5_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge#getInstanceType()
	 * @see #getC5_2xlarge()
	 * @generated
	 */
	EAttribute getC5_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge#getOcciComputeCores()
	 * @see #getC5_2xlarge()
	 * @generated
	 */
	EAttribute getC5_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge <em>C5 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C5 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge
	 * @generated
	 */
	EClass getC5_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge#getOcciComputeMemory()
	 * @see #getC5_4xlarge()
	 * @generated
	 */
	EAttribute getC5_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge#getInstanceType()
	 * @see #getC5_4xlarge()
	 * @generated
	 */
	EAttribute getC5_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge#getOcciComputeCores()
	 * @see #getC5_4xlarge()
	 * @generated
	 */
	EAttribute getC5_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge <em>C5 9xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C5 9xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge
	 * @generated
	 */
	EClass getC5_9xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge#getOcciComputeMemory()
	 * @see #getC5_9xlarge()
	 * @generated
	 */
	EAttribute getC5_9xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge#getInstanceType()
	 * @see #getC5_9xlarge()
	 * @generated
	 */
	EAttribute getC5_9xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge#getOcciComputeCores()
	 * @see #getC5_9xlarge()
	 * @generated
	 */
	EAttribute getC5_9xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge <em>C5 18xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C5 18xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge
	 * @generated
	 */
	EClass getC5_18xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge#getOcciComputeMemory()
	 * @see #getC5_18xlarge()
	 * @generated
	 */
	EAttribute getC5_18xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge#getInstanceType()
	 * @see #getC5_18xlarge()
	 * @generated
	 */
	EAttribute getC5_18xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge#getOcciComputeCores()
	 * @see #getC5_18xlarge()
	 * @generated
	 */
	EAttribute getC5_18xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large <em>C4 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C4 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large
	 * @generated
	 */
	EClass getC4_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large#getOcciComputeMemory()
	 * @see #getC4_large()
	 * @generated
	 */
	EAttribute getC4_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large#getInstanceType()
	 * @see #getC4_large()
	 * @generated
	 */
	EAttribute getC4_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large#getOcciComputeCores()
	 * @see #getC4_large()
	 * @generated
	 */
	EAttribute getC4_large_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge <em>C4 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C4 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge
	 * @generated
	 */
	EClass getC4_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge#getOcciComputeMemory()
	 * @see #getC4_xlarge()
	 * @generated
	 */
	EAttribute getC4_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge#getInstanceType()
	 * @see #getC4_xlarge()
	 * @generated
	 */
	EAttribute getC4_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge#getOcciComputeCores()
	 * @see #getC4_xlarge()
	 * @generated
	 */
	EAttribute getC4_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge <em>C4 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C4 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge
	 * @generated
	 */
	EClass getC4_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge#getOcciComputeMemory()
	 * @see #getC4_2xlarge()
	 * @generated
	 */
	EAttribute getC4_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge#getInstanceType()
	 * @see #getC4_2xlarge()
	 * @generated
	 */
	EAttribute getC4_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge#getOcciComputeCores()
	 * @see #getC4_2xlarge()
	 * @generated
	 */
	EAttribute getC4_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge <em>C4 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C4 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge
	 * @generated
	 */
	EClass getC4_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge#getOcciComputeMemory()
	 * @see #getC4_4xlarge()
	 * @generated
	 */
	EAttribute getC4_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge#getInstanceType()
	 * @see #getC4_4xlarge()
	 * @generated
	 */
	EAttribute getC4_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge#getOcciComputeCores()
	 * @see #getC4_4xlarge()
	 * @generated
	 */
	EAttribute getC4_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge <em>C4 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C4 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge
	 * @generated
	 */
	EClass getC4_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge#getOcciComputeMemory()
	 * @see #getC4_8xlarge()
	 * @generated
	 */
	EAttribute getC4_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge#getInstanceType()
	 * @see #getC4_8xlarge()
	 * @generated
	 */
	EAttribute getC4_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge#getOcciComputeCores()
	 * @see #getC4_8xlarge()
	 * @generated
	 */
	EAttribute getC4_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large <em>C3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C3 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large
	 * @generated
	 */
	EClass getC3_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getOcciComputeMemory()
	 * @see #getC3_large()
	 * @generated
	 */
	EAttribute getC3_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getInstanceType()
	 * @see #getC3_large()
	 * @generated
	 */
	EAttribute getC3_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getOcciComputeCores()
	 * @see #getC3_large()
	 * @generated
	 */
	EAttribute getC3_large_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large#getOcciComputeEphemeralStorageSize()
	 * @see #getC3_large()
	 * @generated
	 */
	EAttribute getC3_large_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge <em>C3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C3 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge
	 * @generated
	 */
	EClass getC3_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getOcciComputeMemory()
	 * @see #getC3_xlarge()
	 * @generated
	 */
	EAttribute getC3_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getInstanceType()
	 * @see #getC3_xlarge()
	 * @generated
	 */
	EAttribute getC3_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getOcciComputeCores()
	 * @see #getC3_xlarge()
	 * @generated
	 */
	EAttribute getC3_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getC3_xlarge()
	 * @generated
	 */
	EAttribute getC3_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge <em>C3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C3 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge
	 * @generated
	 */
	EClass getC3_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getOcciComputeMemory()
	 * @see #getC3_2xlarge()
	 * @generated
	 */
	EAttribute getC3_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getInstanceType()
	 * @see #getC3_2xlarge()
	 * @generated
	 */
	EAttribute getC3_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getOcciComputeCores()
	 * @see #getC3_2xlarge()
	 * @generated
	 */
	EAttribute getC3_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getC3_2xlarge()
	 * @generated
	 */
	EAttribute getC3_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge <em>C3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C3 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge
	 * @generated
	 */
	EClass getC3_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getOcciComputeMemory()
	 * @see #getC3_4xlarge()
	 * @generated
	 */
	EAttribute getC3_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getInstanceType()
	 * @see #getC3_4xlarge()
	 * @generated
	 */
	EAttribute getC3_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getOcciComputeCores()
	 * @see #getC3_4xlarge()
	 * @generated
	 */
	EAttribute getC3_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getC3_4xlarge()
	 * @generated
	 */
	EAttribute getC3_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge <em>C3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C3 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge
	 * @generated
	 */
	EClass getC3_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getOcciComputeMemory()
	 * @see #getC3_8xlarge()
	 * @generated
	 */
	EAttribute getC3_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getInstanceType()
	 * @see #getC3_8xlarge()
	 * @generated
	 */
	EAttribute getC3_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getOcciComputeCores()
	 * @see #getC3_8xlarge()
	 * @generated
	 */
	EAttribute getC3_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getC3_8xlarge()
	 * @generated
	 */
	EAttribute getC3_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge <em>X1e xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1e xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge
	 * @generated
	 */
	EClass getX1e_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getOcciComputeMemory()
	 * @see #getX1e_xlarge()
	 * @generated
	 */
	EAttribute getX1e_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getInstanceType()
	 * @see #getX1e_xlarge()
	 * @generated
	 */
	EAttribute getX1e_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getOcciComputeCores()
	 * @see #getX1e_xlarge()
	 * @generated
	 */
	EAttribute getX1e_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1e_xlarge()
	 * @generated
	 */
	EAttribute getX1e_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge <em>X1e 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1e 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge
	 * @generated
	 */
	EClass getX1e_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getOcciComputeMemory()
	 * @see #getX1e_2xlarge()
	 * @generated
	 */
	EAttribute getX1e_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getInstanceType()
	 * @see #getX1e_2xlarge()
	 * @generated
	 */
	EAttribute getX1e_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getOcciComputeCores()
	 * @see #getX1e_2xlarge()
	 * @generated
	 */
	EAttribute getX1e_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1e_2xlarge()
	 * @generated
	 */
	EAttribute getX1e_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge <em>X1e 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1e 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge
	 * @generated
	 */
	EClass getX1e_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getOcciComputeMemory()
	 * @see #getX1e_4xlarge()
	 * @generated
	 */
	EAttribute getX1e_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getInstanceType()
	 * @see #getX1e_4xlarge()
	 * @generated
	 */
	EAttribute getX1e_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getOcciComputeCores()
	 * @see #getX1e_4xlarge()
	 * @generated
	 */
	EAttribute getX1e_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1e_4xlarge()
	 * @generated
	 */
	EAttribute getX1e_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge <em>X1e 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1e 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge
	 * @generated
	 */
	EClass getX1e_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getOcciComputeMemory()
	 * @see #getX1e_8xlarge()
	 * @generated
	 */
	EAttribute getX1e_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getInstanceType()
	 * @see #getX1e_8xlarge()
	 * @generated
	 */
	EAttribute getX1e_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getOcciComputeCores()
	 * @see #getX1e_8xlarge()
	 * @generated
	 */
	EAttribute getX1e_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1e_8xlarge()
	 * @generated
	 */
	EAttribute getX1e_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge <em>X1e 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1e 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge
	 * @generated
	 */
	EClass getX1e_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getOcciComputeMemory()
	 * @see #getX1e_16xlarge()
	 * @generated
	 */
	EAttribute getX1e_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getInstanceType()
	 * @see #getX1e_16xlarge()
	 * @generated
	 */
	EAttribute getX1e_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getOcciComputeCores()
	 * @see #getX1e_16xlarge()
	 * @generated
	 */
	EAttribute getX1e_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1e_16xlarge()
	 * @generated
	 */
	EAttribute getX1e_16xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge <em>X1e 32xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1e 32xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge
	 * @generated
	 */
	EClass getX1e_32xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getOcciComputeMemory()
	 * @see #getX1e_32xlarge()
	 * @generated
	 */
	EAttribute getX1e_32xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getInstanceType()
	 * @see #getX1e_32xlarge()
	 * @generated
	 */
	EAttribute getX1e_32xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getOcciComputeCores()
	 * @see #getX1e_32xlarge()
	 * @generated
	 */
	EAttribute getX1e_32xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1e_32xlarge()
	 * @generated
	 */
	EAttribute getX1e_32xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge <em>X1 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge
	 * @generated
	 */
	EClass getX1_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getOcciComputeMemory()
	 * @see #getX1_16xlarge()
	 * @generated
	 */
	EAttribute getX1_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getInstanceType()
	 * @see #getX1_16xlarge()
	 * @generated
	 */
	EAttribute getX1_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getOcciComputeCores()
	 * @see #getX1_16xlarge()
	 * @generated
	 */
	EAttribute getX1_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1_16xlarge()
	 * @generated
	 */
	EAttribute getX1_16xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge <em>X1 32xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X1 32xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge
	 * @generated
	 */
	EClass getX1_32xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getOcciComputeMemory()
	 * @see #getX1_32xlarge()
	 * @generated
	 */
	EAttribute getX1_32xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getInstanceType()
	 * @see #getX1_32xlarge()
	 * @generated
	 */
	EAttribute getX1_32xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getOcciComputeCores()
	 * @see #getX1_32xlarge()
	 * @generated
	 */
	EAttribute getX1_32xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getX1_32xlarge()
	 * @generated
	 */
	EAttribute getX1_32xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large <em>R4 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R4 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large
	 * @generated
	 */
	EClass getR4_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large#getOcciComputeMemory()
	 * @see #getR4_large()
	 * @generated
	 */
	EAttribute getR4_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large#getInstanceType()
	 * @see #getR4_large()
	 * @generated
	 */
	EAttribute getR4_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large#getOcciComputeCores()
	 * @see #getR4_large()
	 * @generated
	 */
	EAttribute getR4_large_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge <em>R4 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R4 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge
	 * @generated
	 */
	EClass getR4_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge#getOcciComputeMemory()
	 * @see #getR4_xlarge()
	 * @generated
	 */
	EAttribute getR4_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge#getInstanceType()
	 * @see #getR4_xlarge()
	 * @generated
	 */
	EAttribute getR4_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge#getOcciComputeCores()
	 * @see #getR4_xlarge()
	 * @generated
	 */
	EAttribute getR4_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge <em>R4 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R4 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge
	 * @generated
	 */
	EClass getR4_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge#getOcciComputeMemory()
	 * @see #getR4_2xlarge()
	 * @generated
	 */
	EAttribute getR4_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge#getInstanceType()
	 * @see #getR4_2xlarge()
	 * @generated
	 */
	EAttribute getR4_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge#getOcciComputeCores()
	 * @see #getR4_2xlarge()
	 * @generated
	 */
	EAttribute getR4_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge <em>R4 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R4 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge
	 * @generated
	 */
	EClass getR4_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge#getOcciComputeMemory()
	 * @see #getR4_4xlarge()
	 * @generated
	 */
	EAttribute getR4_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge#getInstanceType()
	 * @see #getR4_4xlarge()
	 * @generated
	 */
	EAttribute getR4_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge#getOcciComputeCores()
	 * @see #getR4_4xlarge()
	 * @generated
	 */
	EAttribute getR4_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge <em>R4 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R4 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge
	 * @generated
	 */
	EClass getR4_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge#getOcciComputeMemory()
	 * @see #getR4_8xlarge()
	 * @generated
	 */
	EAttribute getR4_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge#getInstanceType()
	 * @see #getR4_8xlarge()
	 * @generated
	 */
	EAttribute getR4_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge#getOcciComputeCores()
	 * @see #getR4_8xlarge()
	 * @generated
	 */
	EAttribute getR4_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge <em>R4 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R4 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge
	 * @generated
	 */
	EClass getR4_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge#getOcciComputeMemory()
	 * @see #getR4_16xlarge()
	 * @generated
	 */
	EAttribute getR4_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge#getInstanceType()
	 * @see #getR4_16xlarge()
	 * @generated
	 */
	EAttribute getR4_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge#getOcciComputeCores()
	 * @see #getR4_16xlarge()
	 * @generated
	 */
	EAttribute getR4_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large <em>R3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R3 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large
	 * @generated
	 */
	EClass getR3_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getOcciComputeMemory()
	 * @see #getR3_large()
	 * @generated
	 */
	EAttribute getR3_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getInstanceType()
	 * @see #getR3_large()
	 * @generated
	 */
	EAttribute getR3_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getOcciComputeCores()
	 * @see #getR3_large()
	 * @generated
	 */
	EAttribute getR3_large_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large#getOcciComputeEphemeralStorageSize()
	 * @see #getR3_large()
	 * @generated
	 */
	EAttribute getR3_large_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge <em>R3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R3 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge
	 * @generated
	 */
	EClass getR3_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getOcciComputeMemory()
	 * @see #getR3_xlarge()
	 * @generated
	 */
	EAttribute getR3_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getInstanceType()
	 * @see #getR3_xlarge()
	 * @generated
	 */
	EAttribute getR3_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getOcciComputeCores()
	 * @see #getR3_xlarge()
	 * @generated
	 */
	EAttribute getR3_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getR3_xlarge()
	 * @generated
	 */
	EAttribute getR3_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge <em>R3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R3 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge
	 * @generated
	 */
	EClass getR3_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getOcciComputeMemory()
	 * @see #getR3_2xlarge()
	 * @generated
	 */
	EAttribute getR3_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getInstanceType()
	 * @see #getR3_2xlarge()
	 * @generated
	 */
	EAttribute getR3_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getOcciComputeCores()
	 * @see #getR3_2xlarge()
	 * @generated
	 */
	EAttribute getR3_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getR3_2xlarge()
	 * @generated
	 */
	EAttribute getR3_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge <em>R3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R3 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge
	 * @generated
	 */
	EClass getR3_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getOcciComputeMemory()
	 * @see #getR3_4xlarge()
	 * @generated
	 */
	EAttribute getR3_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getInstanceType()
	 * @see #getR3_4xlarge()
	 * @generated
	 */
	EAttribute getR3_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getOcciComputeCores()
	 * @see #getR3_4xlarge()
	 * @generated
	 */
	EAttribute getR3_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getR3_4xlarge()
	 * @generated
	 */
	EAttribute getR3_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge <em>R3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R3 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge
	 * @generated
	 */
	EClass getR3_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getOcciComputeMemory()
	 * @see #getR3_8xlarge()
	 * @generated
	 */
	EAttribute getR3_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getInstanceType()
	 * @see #getR3_8xlarge()
	 * @generated
	 */
	EAttribute getR3_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getOcciComputeCores()
	 * @see #getR3_8xlarge()
	 * @generated
	 */
	EAttribute getR3_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getR3_8xlarge()
	 * @generated
	 */
	EAttribute getR3_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge <em>P3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P3 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge
	 * @generated
	 */
	EClass getP3_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getOcciComputeMemory()
	 * @see #getP3_2xlarge()
	 * @generated
	 */
	EAttribute getP3_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getInstanceType()
	 * @see #getP3_2xlarge()
	 * @generated
	 */
	EAttribute getP3_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getOcciComputeCores()
	 * @see #getP3_2xlarge()
	 * @generated
	 */
	EAttribute getP3_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getGpus()
	 * @see #getP3_2xlarge()
	 * @generated
	 */
	EAttribute getP3_2xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getGpuMemory()
	 * @see #getP3_2xlarge()
	 * @generated
	 */
	EAttribute getP3_2xlarge_GpuMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getGpuP2P <em>Gpu P2P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu P2P</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge#getGpuP2P()
	 * @see #getP3_2xlarge()
	 * @generated
	 */
	EAttribute getP3_2xlarge_GpuP2P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge <em>P3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P3 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge
	 * @generated
	 */
	EClass getP3_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getOcciComputeMemory()
	 * @see #getP3_8xlarge()
	 * @generated
	 */
	EAttribute getP3_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getInstanceType()
	 * @see #getP3_8xlarge()
	 * @generated
	 */
	EAttribute getP3_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getOcciComputeCores()
	 * @see #getP3_8xlarge()
	 * @generated
	 */
	EAttribute getP3_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getGpus()
	 * @see #getP3_8xlarge()
	 * @generated
	 */
	EAttribute getP3_8xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getGpuMemory()
	 * @see #getP3_8xlarge()
	 * @generated
	 */
	EAttribute getP3_8xlarge_GpuMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getGpuP2P <em>Gpu P2P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu P2P</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge#getGpuP2P()
	 * @see #getP3_8xlarge()
	 * @generated
	 */
	EAttribute getP3_8xlarge_GpuP2P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge <em>P3 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P3 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge
	 * @generated
	 */
	EClass getP3_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getOcciComputeMemory()
	 * @see #getP3_16xlarge()
	 * @generated
	 */
	EAttribute getP3_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getInstanceType()
	 * @see #getP3_16xlarge()
	 * @generated
	 */
	EAttribute getP3_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getOcciComputeCores()
	 * @see #getP3_16xlarge()
	 * @generated
	 */
	EAttribute getP3_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getGpus()
	 * @see #getP3_16xlarge()
	 * @generated
	 */
	EAttribute getP3_16xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getGpuMemory()
	 * @see #getP3_16xlarge()
	 * @generated
	 */
	EAttribute getP3_16xlarge_GpuMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getGpuP2P <em>Gpu P2P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu P2P</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge#getGpuP2P()
	 * @see #getP3_16xlarge()
	 * @generated
	 */
	EAttribute getP3_16xlarge_GpuP2P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge <em>P2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P2 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge
	 * @generated
	 */
	EClass getP2_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getOcciComputeMemory()
	 * @see #getP2_xlarge()
	 * @generated
	 */
	EAttribute getP2_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getInstanceType()
	 * @see #getP2_xlarge()
	 * @generated
	 */
	EAttribute getP2_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getOcciComputeCores()
	 * @see #getP2_xlarge()
	 * @generated
	 */
	EAttribute getP2_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getGpus()
	 * @see #getP2_xlarge()
	 * @generated
	 */
	EAttribute getP2_xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getGpuMemory()
	 * @see #getP2_xlarge()
	 * @generated
	 */
	EAttribute getP2_xlarge_GpuMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getGpuP2P <em>Gpu P2P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu P2P</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge#getGpuP2P()
	 * @see #getP2_xlarge()
	 * @generated
	 */
	EAttribute getP2_xlarge_GpuP2P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge <em>P2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P2 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge
	 * @generated
	 */
	EClass getP2_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getOcciComputeMemory()
	 * @see #getP2_8xlarge()
	 * @generated
	 */
	EAttribute getP2_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getInstanceType()
	 * @see #getP2_8xlarge()
	 * @generated
	 */
	EAttribute getP2_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getOcciComputeCores()
	 * @see #getP2_8xlarge()
	 * @generated
	 */
	EAttribute getP2_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getGpus()
	 * @see #getP2_8xlarge()
	 * @generated
	 */
	EAttribute getP2_8xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getGpuMemory()
	 * @see #getP2_8xlarge()
	 * @generated
	 */
	EAttribute getP2_8xlarge_GpuMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getGpuP2P <em>Gpu P2P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu P2P</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge#getGpuP2P()
	 * @see #getP2_8xlarge()
	 * @generated
	 */
	EAttribute getP2_8xlarge_GpuP2P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge <em>P2 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P2 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge
	 * @generated
	 */
	EClass getP2_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getOcciComputeMemory()
	 * @see #getP2_16xlarge()
	 * @generated
	 */
	EAttribute getP2_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getInstanceType()
	 * @see #getP2_16xlarge()
	 * @generated
	 */
	EAttribute getP2_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getOcciComputeCores()
	 * @see #getP2_16xlarge()
	 * @generated
	 */
	EAttribute getP2_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getGpus()
	 * @see #getP2_16xlarge()
	 * @generated
	 */
	EAttribute getP2_16xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getGpuMemory()
	 * @see #getP2_16xlarge()
	 * @generated
	 */
	EAttribute getP2_16xlarge_GpuMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getGpuP2P <em>Gpu P2P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu P2P</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge#getGpuP2P()
	 * @see #getP2_16xlarge()
	 * @generated
	 */
	EAttribute getP2_16xlarge_GpuP2P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Generalpurpose <em>Generalpurpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalpurpose</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Generalpurpose
	 * @generated
	 */
	EClass getGeneralpurpose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Computeoptimized <em>Computeoptimized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computeoptimized</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Computeoptimized
	 * @generated
	 */
	EClass getComputeoptimized();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Memoryoptimized <em>Memoryoptimized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memoryoptimized</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Memoryoptimized
	 * @generated
	 */
	EClass getMemoryoptimized();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Acceleratedcomputing <em>Acceleratedcomputing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceleratedcomputing</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Acceleratedcomputing
	 * @generated
	 */
	EClass getAcceleratedcomputing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Storageoptimized <em>Storageoptimized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storageoptimized</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Storageoptimized
	 * @generated
	 */
	EClass getStorageoptimized();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge <em>G3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge
	 * @generated
	 */
	EClass getG3_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getOcciComputeMemory()
	 * @see #getG3_4xlarge()
	 * @generated
	 */
	EAttribute getG3_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getInstanceType()
	 * @see #getG3_4xlarge()
	 * @generated
	 */
	EAttribute getG3_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getOcciComputeCores()
	 * @see #getG3_4xlarge()
	 * @generated
	 */
	EAttribute getG3_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getGpus()
	 * @see #getG3_4xlarge()
	 * @generated
	 */
	EAttribute getG3_4xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge#getGpuMemory()
	 * @see #getG3_4xlarge()
	 * @generated
	 */
	EAttribute getG3_4xlarge_GpuMemory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge <em>G3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge
	 * @generated
	 */
	EClass getG3_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getOcciComputeMemory()
	 * @see #getG3_8xlarge()
	 * @generated
	 */
	EAttribute getG3_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getInstanceType()
	 * @see #getG3_8xlarge()
	 * @generated
	 */
	EAttribute getG3_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getOcciComputeCores()
	 * @see #getG3_8xlarge()
	 * @generated
	 */
	EAttribute getG3_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getGpus()
	 * @see #getG3_8xlarge()
	 * @generated
	 */
	EAttribute getG3_8xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge#getGpuMemory()
	 * @see #getG3_8xlarge()
	 * @generated
	 */
	EAttribute getG3_8xlarge_GpuMemory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge <em>G3 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge
	 * @generated
	 */
	EClass getG3_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeMemory()
	 * @see #getG3_16xlarge()
	 * @generated
	 */
	EAttribute getG3_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getInstanceType()
	 * @see #getG3_16xlarge()
	 * @generated
	 */
	EAttribute getG3_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeCores()
	 * @see #getG3_16xlarge()
	 * @generated
	 */
	EAttribute getG3_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpus</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpus()
	 * @see #getG3_16xlarge()
	 * @generated
	 */
	EAttribute getG3_16xlarge_Gpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpuMemory <em>Gpu Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpuMemory()
	 * @see #getG3_16xlarge()
	 * @generated
	 */
	EAttribute getG3_16xlarge_GpuMemory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge <em>F1 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>F1 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge
	 * @generated
	 */
	EClass getF1_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getOcciComputeMemory()
	 * @see #getF1_2xlarge()
	 * @generated
	 */
	EAttribute getF1_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getInstanceType()
	 * @see #getF1_2xlarge()
	 * @generated
	 */
	EAttribute getF1_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getOcciComputeCores()
	 * @see #getF1_2xlarge()
	 * @generated
	 */
	EAttribute getF1_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getFpga <em>Fpga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpga</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getFpga()
	 * @see #getF1_2xlarge()
	 * @generated
	 */
	EAttribute getF1_2xlarge_Fpga();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getF1_2xlarge()
	 * @generated
	 */
	EAttribute getF1_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge <em>F1 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>F1 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge
	 * @generated
	 */
	EClass getF1_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getOcciComputeMemory()
	 * @see #getF1_16xlarge()
	 * @generated
	 */
	EAttribute getF1_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getInstanceType()
	 * @see #getF1_16xlarge()
	 * @generated
	 */
	EAttribute getF1_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getOcciComputeCores()
	 * @see #getF1_16xlarge()
	 * @generated
	 */
	EAttribute getF1_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getFpga <em>Fpga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpga</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getFpga()
	 * @see #getF1_16xlarge()
	 * @generated
	 */
	EAttribute getF1_16xlarge_Fpga();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getF1_16xlarge()
	 * @generated
	 */
	EAttribute getF1_16xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge <em>H1 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge
	 * @generated
	 */
	EClass getH1_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getOcciComputeMemory()
	 * @see #getH1_2xlarge()
	 * @generated
	 */
	EAttribute getH1_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getInstanceType()
	 * @see #getH1_2xlarge()
	 * @generated
	 */
	EAttribute getH1_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getOcciComputeCores()
	 * @see #getH1_2xlarge()
	 * @generated
	 */
	EAttribute getH1_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getH1_2xlarge()
	 * @generated
	 */
	EAttribute getH1_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge <em>H1 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge
	 * @generated
	 */
	EClass getH1_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getOcciComputeMemory()
	 * @see #getH1_4xlarge()
	 * @generated
	 */
	EAttribute getH1_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getInstanceType()
	 * @see #getH1_4xlarge()
	 * @generated
	 */
	EAttribute getH1_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getOcciComputeCores()
	 * @see #getH1_4xlarge()
	 * @generated
	 */
	EAttribute getH1_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getH1_4xlarge()
	 * @generated
	 */
	EAttribute getH1_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge <em>H1 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge
	 * @generated
	 */
	EClass getH1_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getOcciComputeMemory()
	 * @see #getH1_8xlarge()
	 * @generated
	 */
	EAttribute getH1_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getInstanceType()
	 * @see #getH1_8xlarge()
	 * @generated
	 */
	EAttribute getH1_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getOcciComputeCores()
	 * @see #getH1_8xlarge()
	 * @generated
	 */
	EAttribute getH1_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getH1_8xlarge()
	 * @generated
	 */
	EAttribute getH1_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge <em>H1 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge
	 * @generated
	 */
	EClass getH1_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getOcciComputeMemory()
	 * @see #getH1_16xlarge()
	 * @generated
	 */
	EAttribute getH1_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getInstanceType()
	 * @see #getH1_16xlarge()
	 * @generated
	 */
	EAttribute getH1_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getOcciComputeCores()
	 * @see #getH1_16xlarge()
	 * @generated
	 */
	EAttribute getH1_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getH1_16xlarge()
	 * @generated
	 */
	EAttribute getH1_16xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large <em>I3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I3 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large
	 * @generated
	 */
	EClass getI3_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getOcciComputeMemory()
	 * @see #getI3_large()
	 * @generated
	 */
	EAttribute getI3_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getInstanceType()
	 * @see #getI3_large()
	 * @generated
	 */
	EAttribute getI3_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getOcciComputeCores()
	 * @see #getI3_large()
	 * @generated
	 */
	EAttribute getI3_large_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large#getOcciComputeEphemeralStorageSize()
	 * @see #getI3_large()
	 * @generated
	 */
	EAttribute getI3_large_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge <em>I3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I3 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge
	 * @generated
	 */
	EClass getI3_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getOcciComputeMemory()
	 * @see #getI3_xlarge()
	 * @generated
	 */
	EAttribute getI3_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getInstanceType()
	 * @see #getI3_xlarge()
	 * @generated
	 */
	EAttribute getI3_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getOcciComputeCores()
	 * @see #getI3_xlarge()
	 * @generated
	 */
	EAttribute getI3_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI3_xlarge()
	 * @generated
	 */
	EAttribute getI3_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge <em>I3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I3 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge
	 * @generated
	 */
	EClass getI3_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getOcciComputeMemory()
	 * @see #getI3_2xlarge()
	 * @generated
	 */
	EAttribute getI3_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getInstanceType()
	 * @see #getI3_2xlarge()
	 * @generated
	 */
	EAttribute getI3_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getOcciComputeCores()
	 * @see #getI3_2xlarge()
	 * @generated
	 */
	EAttribute getI3_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI3_2xlarge()
	 * @generated
	 */
	EAttribute getI3_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge <em>I3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I3 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge
	 * @generated
	 */
	EClass getI3_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getOcciComputeMemory()
	 * @see #getI3_4xlarge()
	 * @generated
	 */
	EAttribute getI3_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getInstanceType()
	 * @see #getI3_4xlarge()
	 * @generated
	 */
	EAttribute getI3_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getOcciComputeCores()
	 * @see #getI3_4xlarge()
	 * @generated
	 */
	EAttribute getI3_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI3_4xlarge()
	 * @generated
	 */
	EAttribute getI3_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge <em>I3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I3 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge
	 * @generated
	 */
	EClass getI3_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getOcciComputeMemory()
	 * @see #getI3_8xlarge()
	 * @generated
	 */
	EAttribute getI3_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getInstanceType()
	 * @see #getI3_8xlarge()
	 * @generated
	 */
	EAttribute getI3_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getOcciComputeCores()
	 * @see #getI3_8xlarge()
	 * @generated
	 */
	EAttribute getI3_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI3_8xlarge()
	 * @generated
	 */
	EAttribute getI3_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge <em>I3 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I3 16xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge
	 * @generated
	 */
	EClass getI3_16xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getOcciComputeMemory()
	 * @see #getI3_16xlarge()
	 * @generated
	 */
	EAttribute getI3_16xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getInstanceType()
	 * @see #getI3_16xlarge()
	 * @generated
	 */
	EAttribute getI3_16xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getOcciComputeCores()
	 * @see #getI3_16xlarge()
	 * @generated
	 */
	EAttribute getI3_16xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI3_16xlarge()
	 * @generated
	 */
	EAttribute getI3_16xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal <em>I3 metal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I3 metal</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal
	 * @generated
	 */
	EClass getI3_metal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getOcciComputeMemory()
	 * @see #getI3_metal()
	 * @generated
	 */
	EAttribute getI3_metal_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getInstanceType()
	 * @see #getI3_metal()
	 * @generated
	 */
	EAttribute getI3_metal_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getOcciComputeCores()
	 * @see #getI3_metal()
	 * @generated
	 */
	EAttribute getI3_metal_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal#getOcciComputeEphemeralStorageSize()
	 * @see #getI3_metal()
	 * @generated
	 */
	EAttribute getI3_metal_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge <em>D2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D2 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge
	 * @generated
	 */
	EClass getD2_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getOcciComputeMemory()
	 * @see #getD2_xlarge()
	 * @generated
	 */
	EAttribute getD2_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getInstanceType()
	 * @see #getD2_xlarge()
	 * @generated
	 */
	EAttribute getD2_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getOcciComputeCores()
	 * @see #getD2_xlarge()
	 * @generated
	 */
	EAttribute getD2_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getD2_xlarge()
	 * @generated
	 */
	EAttribute getD2_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge <em>D2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D2 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge
	 * @generated
	 */
	EClass getD2_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getOcciComputeMemory()
	 * @see #getD2_2xlarge()
	 * @generated
	 */
	EAttribute getD2_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getInstanceType()
	 * @see #getD2_2xlarge()
	 * @generated
	 */
	EAttribute getD2_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getOcciComputeCores()
	 * @see #getD2_2xlarge()
	 * @generated
	 */
	EAttribute getD2_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getD2_2xlarge()
	 * @generated
	 */
	EAttribute getD2_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge <em>D2 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D2 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge
	 * @generated
	 */
	EClass getD2_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getOcciComputeMemory()
	 * @see #getD2_4xlarge()
	 * @generated
	 */
	EAttribute getD2_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getInstanceType()
	 * @see #getD2_4xlarge()
	 * @generated
	 */
	EAttribute getD2_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getOcciComputeCores()
	 * @see #getD2_4xlarge()
	 * @generated
	 */
	EAttribute getD2_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getD2_4xlarge()
	 * @generated
	 */
	EAttribute getD2_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge <em>D2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D2 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge
	 * @generated
	 */
	EClass getD2_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getOcciComputeMemory()
	 * @see #getD2_8xlarge()
	 * @generated
	 */
	EAttribute getD2_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getInstanceType()
	 * @see #getD2_8xlarge()
	 * @generated
	 */
	EAttribute getD2_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getOcciComputeCores()
	 * @see #getD2_8xlarge()
	 * @generated
	 */
	EAttribute getD2_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getD2_8xlarge()
	 * @generated
	 */
	EAttribute getD2_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small <em>M1 small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M1 small</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small
	 * @generated
	 */
	EClass getM1_small();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getOcciComputeMemory()
	 * @see #getM1_small()
	 * @generated
	 */
	EAttribute getM1_small_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getInstanceType()
	 * @see #getM1_small()
	 * @generated
	 */
	EAttribute getM1_small_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getOcciComputeCores()
	 * @see #getM1_small()
	 * @generated
	 */
	EAttribute getM1_small_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small#getOcciComputeEphemeralStorageSize()
	 * @see #getM1_small()
	 * @generated
	 */
	EAttribute getM1_small_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro <em>T1 micro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T1 micro</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro
	 * @generated
	 */
	EClass getT1_micro();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro#getOcciComputeMemory()
	 * @see #getT1_micro()
	 * @generated
	 */
	EAttribute getT1_micro_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro#getInstanceType()
	 * @see #getT1_micro()
	 * @generated
	 */
	EAttribute getT1_micro_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro#getOcciComputeCores()
	 * @see #getT1_micro()
	 * @generated
	 */
	EAttribute getT1_micro_OcciComputeCores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium <em>M1 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M1 medium</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium
	 * @generated
	 */
	EClass getM1_medium();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getOcciComputeMemory()
	 * @see #getM1_medium()
	 * @generated
	 */
	EAttribute getM1_medium_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getInstanceType()
	 * @see #getM1_medium()
	 * @generated
	 */
	EAttribute getM1_medium_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getOcciComputeCores()
	 * @see #getM1_medium()
	 * @generated
	 */
	EAttribute getM1_medium_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium#getOcciComputeEphemeralStorageSize()
	 * @see #getM1_medium()
	 * @generated
	 */
	EAttribute getM1_medium_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large <em>M1 large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M1 large</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large
	 * @generated
	 */
	EClass getM1_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getOcciComputeMemory()
	 * @see #getM1_large()
	 * @generated
	 */
	EAttribute getM1_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getInstanceType()
	 * @see #getM1_large()
	 * @generated
	 */
	EAttribute getM1_large_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getOcciComputeCores()
	 * @see #getM1_large()
	 * @generated
	 */
	EAttribute getM1_large_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large#getOcciComputeEphemeralStorageSize()
	 * @see #getM1_large()
	 * @generated
	 */
	EAttribute getM1_large_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge <em>M1 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M1 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge
	 * @generated
	 */
	EClass getM1_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getOcciComputeMemory()
	 * @see #getM1_xlarge()
	 * @generated
	 */
	EAttribute getM1_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getInstanceType()
	 * @see #getM1_xlarge()
	 * @generated
	 */
	EAttribute getM1_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getOcciComputeCores()
	 * @see #getM1_xlarge()
	 * @generated
	 */
	EAttribute getM1_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getM1_xlarge()
	 * @generated
	 */
	EAttribute getM1_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium <em>C1 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C1 medium</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium
	 * @generated
	 */
	EClass getC1_medium();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getOcciComputeMemory()
	 * @see #getC1_medium()
	 * @generated
	 */
	EAttribute getC1_medium_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getInstanceType()
	 * @see #getC1_medium()
	 * @generated
	 */
	EAttribute getC1_medium_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getOcciComputeCores()
	 * @see #getC1_medium()
	 * @generated
	 */
	EAttribute getC1_medium_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium#getOcciComputeEphemeralStorageSize()
	 * @see #getC1_medium()
	 * @generated
	 */
	EAttribute getC1_medium_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge <em>C1 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C1 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge
	 * @generated
	 */
	EClass getC1_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getOcciComputeMemory()
	 * @see #getC1_xlarge()
	 * @generated
	 */
	EAttribute getC1_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getInstanceType()
	 * @see #getC1_xlarge()
	 * @generated
	 */
	EAttribute getC1_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getOcciComputeCores()
	 * @see #getC1_xlarge()
	 * @generated
	 */
	EAttribute getC1_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getC1_xlarge()
	 * @generated
	 */
	EAttribute getC1_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge <em>Cc2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cc2 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge
	 * @generated
	 */
	EClass getCc2_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getOcciComputeMemory()
	 * @see #getCc2_8xlarge()
	 * @generated
	 */
	EAttribute getCc2_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getInstanceType()
	 * @see #getCc2_8xlarge()
	 * @generated
	 */
	EAttribute getCc2_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getOcciComputeCores()
	 * @see #getCc2_8xlarge()
	 * @generated
	 */
	EAttribute getCc2_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getCc2_8xlarge()
	 * @generated
	 */
	EAttribute getCc2_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge <em>G2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G2 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge
	 * @generated
	 */
	EClass getG2_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getOcciComputeMemory()
	 * @see #getG2_2xlarge()
	 * @generated
	 */
	EAttribute getG2_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getInstanceType()
	 * @see #getG2_2xlarge()
	 * @generated
	 */
	EAttribute getG2_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getOcciComputeCores()
	 * @see #getG2_2xlarge()
	 * @generated
	 */
	EAttribute getG2_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getG2_2xlarge()
	 * @generated
	 */
	EAttribute getG2_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge <em>G2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G2 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge
	 * @generated
	 */
	EClass getG2_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getOcciComputeMemory()
	 * @see #getG2_8xlarge()
	 * @generated
	 */
	EAttribute getG2_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getInstanceType()
	 * @see #getG2_8xlarge()
	 * @generated
	 */
	EAttribute getG2_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getOcciComputeCores()
	 * @see #getG2_8xlarge()
	 * @generated
	 */
	EAttribute getG2_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getG2_8xlarge()
	 * @generated
	 */
	EAttribute getG2_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge <em>Cg1 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cg1 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge
	 * @generated
	 */
	EClass getCg1_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getOcciComputeMemory()
	 * @see #getCg1_4xlarge()
	 * @generated
	 */
	EAttribute getCg1_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getInstanceType()
	 * @see #getCg1_4xlarge()
	 * @generated
	 */
	EAttribute getCg1_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getOcciComputeCores()
	 * @see #getCg1_4xlarge()
	 * @generated
	 */
	EAttribute getCg1_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getCg1_4xlarge()
	 * @generated
	 */
	EAttribute getCg1_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge <em>M2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M2 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge
	 * @generated
	 */
	EClass getM2_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getOcciComputeMemory()
	 * @see #getM2_xlarge()
	 * @generated
	 */
	EAttribute getM2_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getInstanceType()
	 * @see #getM2_xlarge()
	 * @generated
	 */
	EAttribute getM2_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getOcciComputeCores()
	 * @see #getM2_xlarge()
	 * @generated
	 */
	EAttribute getM2_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getM2_xlarge()
	 * @generated
	 */
	EAttribute getM2_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge <em>M2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M2 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge
	 * @generated
	 */
	EClass getM2_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getOcciComputeMemory()
	 * @see #getM2_2xlarge()
	 * @generated
	 */
	EAttribute getM2_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getInstanceType()
	 * @see #getM2_2xlarge()
	 * @generated
	 */
	EAttribute getM2_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getOcciComputeCores()
	 * @see #getM2_2xlarge()
	 * @generated
	 */
	EAttribute getM2_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getM2_2xlarge()
	 * @generated
	 */
	EAttribute getM2_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge <em>M2 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M2 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge
	 * @generated
	 */
	EClass getM2_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getOcciComputeMemory()
	 * @see #getM2_4xlarge()
	 * @generated
	 */
	EAttribute getM2_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getInstanceType()
	 * @see #getM2_4xlarge()
	 * @generated
	 */
	EAttribute getM2_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getOcciComputeCores()
	 * @see #getM2_4xlarge()
	 * @generated
	 */
	EAttribute getM2_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getM2_4xlarge()
	 * @generated
	 */
	EAttribute getM2_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge <em>Cr1 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cr1 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge
	 * @generated
	 */
	EClass getCr1_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getOcciComputeMemory()
	 * @see #getCr1_8xlarge()
	 * @generated
	 */
	EAttribute getCr1_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getInstanceType()
	 * @see #getCr1_8xlarge()
	 * @generated
	 */
	EAttribute getCr1_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getOcciComputeCores()
	 * @see #getCr1_8xlarge()
	 * @generated
	 */
	EAttribute getCr1_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getCr1_8xlarge()
	 * @generated
	 */
	EAttribute getCr1_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge <em>I2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2 xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge
	 * @generated
	 */
	EClass getI2_xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getOcciComputeMemory()
	 * @see #getI2_xlarge()
	 * @generated
	 */
	EAttribute getI2_xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getInstanceType()
	 * @see #getI2_xlarge()
	 * @generated
	 */
	EAttribute getI2_xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getOcciComputeCores()
	 * @see #getI2_xlarge()
	 * @generated
	 */
	EAttribute getI2_xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI2_xlarge()
	 * @generated
	 */
	EAttribute getI2_xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge <em>I2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2 2xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge
	 * @generated
	 */
	EClass getI2_2xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getOcciComputeMemory()
	 * @see #getI2_2xlarge()
	 * @generated
	 */
	EAttribute getI2_2xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getInstanceType()
	 * @see #getI2_2xlarge()
	 * @generated
	 */
	EAttribute getI2_2xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getOcciComputeCores()
	 * @see #getI2_2xlarge()
	 * @generated
	 */
	EAttribute getI2_2xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI2_2xlarge()
	 * @generated
	 */
	EAttribute getI2_2xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge <em>I2 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2 4xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge
	 * @generated
	 */
	EClass getI2_4xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getOcciComputeMemory()
	 * @see #getI2_4xlarge()
	 * @generated
	 */
	EAttribute getI2_4xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getInstanceType()
	 * @see #getI2_4xlarge()
	 * @generated
	 */
	EAttribute getI2_4xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getOcciComputeCores()
	 * @see #getI2_4xlarge()
	 * @generated
	 */
	EAttribute getI2_4xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI2_4xlarge()
	 * @generated
	 */
	EAttribute getI2_4xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge <em>I2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge
	 * @generated
	 */
	EClass getI2_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getOcciComputeMemory()
	 * @see #getI2_8xlarge()
	 * @generated
	 */
	EAttribute getI2_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getInstanceType()
	 * @see #getI2_8xlarge()
	 * @generated
	 */
	EAttribute getI2_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getOcciComputeCores()
	 * @see #getI2_8xlarge()
	 * @generated
	 */
	EAttribute getI2_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getI2_8xlarge()
	 * @generated
	 */
	EAttribute getI2_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge <em>Hs1 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hs1 8xlarge</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge
	 * @generated
	 */
	EClass getHs1_8xlarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getOcciComputeMemory()
	 * @see #getHs1_8xlarge()
	 * @generated
	 */
	EAttribute getHs1_8xlarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getInstanceType()
	 * @see #getHs1_8xlarge()
	 * @generated
	 */
	EAttribute getHs1_8xlarge_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getOcciComputeCores()
	 * @see #getHs1_8xlarge()
	 * @generated
	 */
	EAttribute getHs1_8xlarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge#getOcciComputeEphemeralStorageSize()
	 * @see #getHs1_8xlarge()
	 * @generated
	 */
	EAttribute getHs1_8xlarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup <em>Placementgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placementgroup</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup
	 * @generated
	 */
	EClass getPlacementgroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getGroupName()
	 * @see #getPlacementgroup()
	 * @generated
	 */
	EAttribute getPlacementgroup_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getAffinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affinity</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getAffinity()
	 * @see #getPlacementgroup()
	 * @generated
	 */
	EAttribute getPlacementgroup_Affinity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getHostId <em>Host Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getHostId()
	 * @see #getPlacementgroup()
	 * @generated
	 */
	EAttribute getPlacementgroup_HostId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getSpreadDomain <em>Spread Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Domain</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getSpreadDomain()
	 * @see #getPlacementgroup()
	 * @generated
	 */
	EAttribute getPlacementgroup_SpreadDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getTenancy <em>Tenancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenancy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getTenancy()
	 * @see #getPlacementgroup()
	 * @generated
	 */
	EAttribute getPlacementgroup_Tenancy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getZoneName <em>Zone Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getZoneName()
	 * @see #getPlacementgroup()
	 * @generated
	 */
	EAttribute getPlacementgroup_ZoneName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume <em>Rootdevicevolume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rootdevicevolume</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume
	 * @generated
	 */
	EClass getRootdevicevolume();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceName <em>Root Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Device Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceName()
	 * @see #getRootdevicevolume()
	 * @generated
	 */
	EAttribute getRootdevicevolume_RootDeviceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceType <em>Root Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Device Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceType()
	 * @see #getRootdevicevolume()
	 * @generated
	 */
	EAttribute getRootdevicevolume_RootDeviceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason <em>Statustransitionreason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statustransitionreason</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason
	 * @generated
	 */
	EClass getStatustransitionreason();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionCode <em>State Transition Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Transition Code</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionCode()
	 * @see #getStatustransitionreason()
	 * @generated
	 */
	EAttribute getStatustransitionreason_StateTransitionCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionMessage <em>State Transition Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Transition Message</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionMessage()
	 * @see #getStatustransitionreason()
	 * @generated
	 */
	EAttribute getStatustransitionreason_StateTransitionMessage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Tags
	 * @generated
	 */
	EClass getTags();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo <em>Instancevpcinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancevpcinfo</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo
	 * @generated
	 */
	EClass getInstancevpcinfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getVpcId <em>Vpc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getVpcId()
	 * @see #getInstancevpcinfo()
	 * @generated
	 */
	EAttribute getInstancevpcinfo_VpcId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getSubnetId <em>Subnet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getSubnetId()
	 * @see #getInstancevpcinfo()
	 * @generated
	 */
	EAttribute getInstancevpcinfo_SubnetId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#isSourceDestCheck <em>Source Dest Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Dest Check</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#isSourceDestCheck()
	 * @see #getInstancevpcinfo()
	 * @generated
	 */
	EAttribute getInstancevpcinfo_SourceDestCheck();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState <em>AWS Instance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AWS Instance State</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState
	 * @generated
	 */
	EEnum getAWSInstanceState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType <em>Hypervisor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hypervisor Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType
	 * @generated
	 */
	EEnum getHypervisorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType <em>Instance Life Cycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Life Cycle Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType
	 * @generated
	 */
	EEnum getInstanceLifeCycleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState <em>Monitoring State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitoring State</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState
	 * @generated
	 */
	EEnum getMonitoringState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType <em>Virtualization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Virtualization Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType
	 * @generated
	 */
	EEnum getVirtualizationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ec2Factory getEc2Factory();

} //Ec2Package
