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
package org.eclipse.cmf.occi.multicloud.modemo;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' infrastructure='http://schemas.ogf.org/occi/infrastructure/ecore' vmware='http://occiware.org/occi/infrastructure/vmware/ecore' accounts='http://occiware.org/occi/infrastructure/security/ecore' ec2='http://occiware.org/occi/infrastructure/aws/ecore'"
 * @generated
 */
public interface ModemoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modemo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.cmf.occi.multicloud.modemo/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modemo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModemoPackage eINSTANCE = org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RecurrenceStepImpl <em>Recurrence Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RecurrenceStepImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRecurrenceStep()
	 * @generated
	 */
	int RECURRENCE_STEP = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_STEP__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_STEP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Recurrence Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Recurrence Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRENCE_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ArrayImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ArrofRecStepImpl <em>Arrof Rec Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ArrofRecStepImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getArrofRecStep()
	 * @generated
	 */
	int ARROF_REC_STEP = 2;

	/**
	 * The feature id for the '<em><b>Arrofrecstep Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROF_REC_STEP__ARROFRECSTEP_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Arrof Rec Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROF_REC_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arrof Rec Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROF_REC_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.HorizontalgroupImpl <em>Horizontalgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.HorizontalgroupImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getHorizontalgroup()
	 * @generated
	 */
	int HORIZONTALGROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Horizontalgroup Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTALGROUP_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontalgroup Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontalgroup Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontalgroup Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Horizontalgroup Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Horizontalgroup Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Horizontalgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Horizontalgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerImpl <em>Loadbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadbalancer()
	 * @generated
	 */
	int LOADBALANCER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Loadbalancer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__LOADBALANCER_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loadbalancer Instance IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__LOADBALANCER_INSTANCE_IP = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loadbalancer Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__LOADBALANCER_ADDRESS = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Addbackendserver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER___ADDBACKENDSERVER = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Removebackendserver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER___REMOVEBACKENDSERVER = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticitycontrollerImpl <em>Elasticitycontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticitycontrollerImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getElasticitycontroller()
	 * @generated
	 */
	int ELASTICITYCONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Elasticitycontroller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elasticitycontroller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elasticitycontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Elasticitycontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.InstancegrouplinkImpl <em>Instancegrouplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.InstancegrouplinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getInstancegrouplink()
	 * @generated
	 */
	int INSTANCEGROUPLINK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Instancegrouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Instancegrouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerlinkImpl <em>Loadbalancerlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerlinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadbalancerlink()
	 * @generated
	 */
	int LOADBALANCERLINK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Loadbalancerlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Loadbalancerlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticlinkImpl <em>Elasticlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticlinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getElasticlink()
	 * @generated
	 */
	int ELASTICLINK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Elasticlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Elasticlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Rule Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_OPERATOR = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_THRESHOLD = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PERIOD = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule Consecutive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_CONSECUTIVE = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ActiontriggerImpl <em>Actiontrigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ActiontriggerImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getActiontrigger()
	 * @generated
	 */
	int ACTIONTRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Actiontrigger Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__ACTIONTRIGGER_ACTION = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actiontrigger Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actiontrigger Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actiontrigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Actiontrigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.StepImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Step Lower Step Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_LOWER_STEP_BOUND = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Upper Step Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_UPPER_STEP_BOUND = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_SIZE = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SteplinkImpl <em>Steplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SteplinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSteplink()
	 * @generated
	 */
	int STEPLINK = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Steplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Steplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderlinkImpl <em>Providerlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderlinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProviderlink()
	 * @generated
	 */
	int PROVIDERLINK = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Providerlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Providerlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProvidervmwareImpl <em>Providervmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProvidervmwareImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvidervmware()
	 * @generated
	 */
	int PROVIDERVMWARE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__ID = PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__TITLE = PROVIDER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__KIND = PROVIDER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__LOCATION = PROVIDER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__ATTRIBUTES = PROVIDER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__MIXINS = PROVIDER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__PARTS = PROVIDER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__SUMMARY = PROVIDER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__LINKS = PROVIDER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE__RLINKS = PROVIDER__RLINKS;

	/**
	 * The number of structural features of the '<em>Providervmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE___OCCI_CREATE = PROVIDER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE___OCCI_RETRIEVE = PROVIDER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE___OCCI_UPDATE = PROVIDER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE___OCCI_DELETE = PROVIDER___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Providervmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERVMWARE_OPERATION_COUNT = PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideropenstackImpl <em>Provideropenstack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideropenstackImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvideropenstack()
	 * @generated
	 */
	int PROVIDEROPENSTACK = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__ID = PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__TITLE = PROVIDER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__KIND = PROVIDER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__LOCATION = PROVIDER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__ATTRIBUTES = PROVIDER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__MIXINS = PROVIDER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__PARTS = PROVIDER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__SUMMARY = PROVIDER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__LINKS = PROVIDER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK__RLINKS = PROVIDER__RLINKS;

	/**
	 * The number of structural features of the '<em>Provideropenstack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK___OCCI_CREATE = PROVIDER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK___OCCI_RETRIEVE = PROVIDER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK___OCCI_UPDATE = PROVIDER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK___OCCI_DELETE = PROVIDER___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Provideropenstack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDEROPENSTACK_OPERATION_COUNT = PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideramazonImpl <em>Provideramazon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideramazonImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvideramazon()
	 * @generated
	 */
	int PROVIDERAMAZON = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__ID = PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__TITLE = PROVIDER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__KIND = PROVIDER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__LOCATION = PROVIDER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__ATTRIBUTES = PROVIDER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__MIXINS = PROVIDER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__PARTS = PROVIDER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__SUMMARY = PROVIDER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__LINKS = PROVIDER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON__RLINKS = PROVIDER__RLINKS;

	/**
	 * The number of structural features of the '<em>Provideramazon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON___OCCI_CREATE = PROVIDER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON___OCCI_RETRIEVE = PROVIDER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON___OCCI_UPDATE = PROVIDER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON___OCCI_DELETE = PROVIDER___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Provideramazon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAMAZON_OPERATION_COUNT = PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderazureImpl <em>Providerazure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderazureImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProviderazure()
	 * @generated
	 */
	int PROVIDERAZURE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__ID = PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__TITLE = PROVIDER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__KIND = PROVIDER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__LOCATION = PROVIDER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__ATTRIBUTES = PROVIDER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__MIXINS = PROVIDER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__PARTS = PROVIDER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__SUMMARY = PROVIDER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__LINKS = PROVIDER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE__RLINKS = PROVIDER__RLINKS;

	/**
	 * The number of structural features of the '<em>Providerazure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE___OCCI_CREATE = PROVIDER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE___OCCI_RETRIEVE = PROVIDER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE___OCCI_UPDATE = PROVIDER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE___OCCI_DELETE = PROVIDER___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Providerazure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERAZURE_OPERATION_COUNT = PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderinstancelinkImpl <em>Providerinstancelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderinstancelinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProviderinstancelink()
	 * @generated
	 */
	int PROVIDERINSTANCELINK = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Providerinstancelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Providerinstancelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDERINSTANCELINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.CreationImpl <em>Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.CreationImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getCreation()
	 * @generated
	 */
	int CREATION = 20;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__OCCI_COMPUTE_CREATION_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SchedulingpolicyImpl <em>Schedulingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SchedulingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSchedulingpolicy()
	 * @generated
	 */
	int SCHEDULINGPOLICY = 21;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Schedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY___START = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.UniqueschedulingpolicyImpl <em>Uniqueschedulingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.UniqueschedulingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getUniqueschedulingpolicy()
	 * @generated
	 */
	int UNIQUESCHEDULINGPOLICY = 22;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY__MIXIN = SCHEDULINGPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY__ENTITY = SCHEDULINGPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY__ATTRIBUTES = SCHEDULINGPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Uniqueschedulingpolicy Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE = SCHEDULINGPOLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uniqueschedulingpolicy End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE = SCHEDULINGPOLICY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uniqueschedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY_FEATURE_COUNT = SCHEDULINGPOLICY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY___START = SCHEDULINGPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY___STOP = SCHEDULINGPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Uniqueschedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY_OPERATION_COUNT = SCHEDULINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RecurringschedulingpolicyImpl <em>Recurringschedulingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RecurringschedulingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRecurringschedulingpolicy()
	 * @generated
	 */
	int RECURRINGSCHEDULINGPOLICY = 23;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY__MIXIN = SCHEDULINGPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY__ENTITY = SCHEDULINGPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY__ATTRIBUTES = SCHEDULINGPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Recurringschedulingpolicy Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE = SCHEDULINGPOLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recurringschedulingpolicy Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE = SCHEDULINGPOLICY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recurringschedulingpolicy End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE = SCHEDULINGPOLICY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recurringschedulingpolicy Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL = SCHEDULINGPOLICY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Recurringschedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY_FEATURE_COUNT = SCHEDULINGPOLICY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY___START = SCHEDULINGPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY___STOP = SCHEDULINGPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Recurringschedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY_OPERATION_COUNT = SCHEDULINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ScalingpolicyImpl <em>Scalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ScalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getScalingpolicy()
	 * @generated
	 */
	int SCALINGPOLICY = 24;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Scalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY___START = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicscalingpolicyImpl <em>Dynamicscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDynamicscalingpolicy()
	 * @generated
	 */
	int DYNAMICSCALINGPOLICY = 25;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY__MIXIN = SCALINGPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY__ENTITY = SCALINGPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY__ATTRIBUTES = SCALINGPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION = SCALINGPOLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME = SCALINGPOLICY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY_FEATURE_COUNT = SCALINGPOLICY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY___START = SCALINGPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY___STOP = SCALINGPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Dynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY_OPERATION_COUNT = SCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicadjustmentscalingpolicyImpl <em>Dynamicadjustmentscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicadjustmentscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY = 26;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__MIXIN = DYNAMICSCALINGPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__ENTITY = DYNAMICSCALINGPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__ATTRIBUTES = DYNAMICSCALINGPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION = DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME = DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME;

	/**
	 * The feature id for the '<em><b>Dynamicadjustmentscalingpolicy Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC = DYNAMICSCALINGPOLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamicadjustmentscalingpolicy Disable Scale In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN = DYNAMICSCALINGPOLICY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamicadjustmentscalingpolicy Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET = DYNAMICSCALINGPOLICY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamicadjustmentscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY_FEATURE_COUNT = DYNAMICSCALINGPOLICY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY___START = DYNAMICSCALINGPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY___STOP = DYNAMICSCALINGPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Dynamicadjustmentscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY_OPERATION_COUNT = DYNAMICSCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SimpledynamicscalingpolicyImpl <em>Simpledynamicscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SimpledynamicscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSimpledynamicscalingpolicy()
	 * @generated
	 */
	int SIMPLEDYNAMICSCALINGPOLICY = 27;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY__MIXIN = DYNAMICSCALINGPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY__ENTITY = DYNAMICSCALINGPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY__ATTRIBUTES = DYNAMICSCALINGPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION = DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME = DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME;

	/**
	 * The number of structural features of the '<em>Simpledynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY_FEATURE_COUNT = DYNAMICSCALINGPOLICY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY___START = DYNAMICSCALINGPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY___STOP = DYNAMICSCALINGPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Simpledynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY_OPERATION_COUNT = DYNAMICSCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.StepdynamicscalingpolicyImpl <em>Stepdynamicscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.StepdynamicscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getStepdynamicscalingpolicy()
	 * @generated
	 */
	int STEPDYNAMICSCALINGPOLICY = 28;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY__MIXIN = DYNAMICSCALINGPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY__ENTITY = DYNAMICSCALINGPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY__ATTRIBUTES = DYNAMICSCALINGPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION = DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Dynamicscalingpolicy Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME = DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME;

	/**
	 * The number of structural features of the '<em>Stepdynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY_FEATURE_COUNT = DYNAMICSCALINGPOLICY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY___START = DYNAMICSCALINGPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY___STOP = DYNAMICSCALINGPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Stepdynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY_OPERATION_COUNT = DYNAMICSCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ManualscalingpolicyImpl <em>Manualscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ManualscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getManualscalingpolicy()
	 * @generated
	 */
	int MANUALSCALINGPOLICY = 29;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY__MIXIN = SCALINGPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY__ENTITY = SCALINGPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY__ATTRIBUTES = SCALINGPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Manualscalingpolicy Desired Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE = SCALINGPOLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manualscalingpolicy Compute Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_COMPUTE_UNIT = SCALINGPOLICY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manualscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY_FEATURE_COUNT = SCALINGPOLICY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY___START = SCALINGPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY___STOP = SCALINGPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Manualscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY_OPERATION_COUNT = SCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.MetricImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 30;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.CpuutilisationImpl <em>Cpuutilisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.CpuutilisationImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getCpuutilisation()
	 * @generated
	 */
	int CPUUTILISATION = 31;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION__MIXIN = METRIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION__ENTITY = METRIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION__ATTRIBUTES = METRIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION__NAME = METRIC__NAME;

	/**
	 * The number of structural features of the '<em>Cpuutilisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION_FEATURE_COUNT = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cpuutilisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.MemoryutilisationImpl <em>Memoryutilisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.MemoryutilisationImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMemoryutilisation()
	 * @generated
	 */
	int MEMORYUTILISATION = 32;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION__MIXIN = METRIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION__ENTITY = METRIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION__ATTRIBUTES = METRIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION__NAME = METRIC__NAME;

	/**
	 * The number of structural features of the '<em>Memoryutilisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION_FEATURE_COUNT = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Memoryutilisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.AllocationpolicyImpl <em>Allocationpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.AllocationpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getAllocationpolicy()
	 * @generated
	 */
	int ALLOCATIONPOLICY = 33;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONPOLICY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONPOLICY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONPOLICY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Allocationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONPOLICY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allocationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATIONPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinImpl <em>Roundrobin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRoundrobin()
	 * @generated
	 */
	int ROUNDROBIN = 34;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBIN__MIXIN = ALLOCATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBIN__ENTITY = ALLOCATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBIN__ATTRIBUTES = ALLOCATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Roundrobin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBIN_FEATURE_COUNT = ALLOCATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Roundrobin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBIN_OPERATION_COUNT = ALLOCATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimeImpl <em>Responsetime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimeImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getResponsetime()
	 * @generated
	 */
	int RESPONSETIME = 35;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIME__MIXIN = ALLOCATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIME__ENTITY = ALLOCATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIME__ATTRIBUTES = ALLOCATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Responsetime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIME_FEATURE_COUNT = ALLOCATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsetime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIME_OPERATION_COUNT = ALLOCATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.CostImpl <em>Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.CostImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getCost()
	 * @generated
	 */
	int COST = 36;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__MIXIN = ALLOCATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__ENTITY = ALLOCATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__ATTRIBUTES = ALLOCATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_FEATURE_COUNT = ALLOCATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_OPERATION_COUNT = ALLOCATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SwappingpolicyImpl <em>Swappingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SwappingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSwappingpolicy()
	 * @generated
	 */
	int SWAPPINGPOLICY = 37;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAPPINGPOLICY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAPPINGPOLICY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAPPINGPOLICY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Swappingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAPPINGPOLICY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Swappingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAPPINGPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SourcemigrationpolicityImpl <em>Sourcemigrationpolicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SourcemigrationpolicityImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSourcemigrationpolicity()
	 * @generated
	 */
	int SOURCEMIGRATIONPOLICITY = 38;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCEMIGRATIONPOLICITY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCEMIGRATIONPOLICITY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCEMIGRATIONPOLICITY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Sourcemigrationpolicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCEMIGRATIONPOLICITY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sourcemigrationpolicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCEMIGRATIONPOLICITY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.MigrationtypeImpl <em>Migrationtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.MigrationtypeImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMigrationtype()
	 * @generated
	 */
	int MIGRATIONTYPE = 41;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATIONTYPE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATIONTYPE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATIONTYPE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Migrationtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATIONTYPE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Migrationtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATIONTYPE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LivemigrationImpl <em>Livemigration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LivemigrationImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLivemigration()
	 * @generated
	 */
	int LIVEMIGRATION = 39;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVEMIGRATION__MIXIN = MIGRATIONTYPE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVEMIGRATION__ENTITY = MIGRATIONTYPE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVEMIGRATION__ATTRIBUTES = MIGRATIONTYPE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Livemigration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVEMIGRATION_FEATURE_COUNT = MIGRATIONTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Livemigration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVEMIGRATION_OPERATION_COUNT = MIGRATIONTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.NonlivemigrationImpl <em>Nonlivemigration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.NonlivemigrationImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getNonlivemigration()
	 * @generated
	 */
	int NONLIVEMIGRATION = 40;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONLIVEMIGRATION__MIXIN = MIGRATIONTYPE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONLIVEMIGRATION__ENTITY = MIGRATIONTYPE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONLIVEMIGRATION__ATTRIBUTES = MIGRATIONTYPE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Nonlivemigration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONLIVEMIGRATION_FEATURE_COUNT = MIGRATIONTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nonlivemigration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONLIVEMIGRATION_OPERATION_COUNT = MIGRATIONTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicmigrationpolicyImpl <em>Dynamicmigrationpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicmigrationpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDynamicmigrationpolicy()
	 * @generated
	 */
	int DYNAMICMIGRATIONPOLICY = 42;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICMIGRATIONPOLICY__MIXIN = SOURCEMIGRATIONPOLICITY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICMIGRATIONPOLICY__ENTITY = SOURCEMIGRATIONPOLICITY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICMIGRATIONPOLICY__ATTRIBUTES = SOURCEMIGRATIONPOLICITY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Dynamicmigrationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICMIGRATIONPOLICY_FEATURE_COUNT = SOURCEMIGRATIONPOLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamicmigrationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICMIGRATIONPOLICY_OPERATION_COUNT = SOURCEMIGRATIONPOLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ManualmigrationpolicyImpl <em>Manualmigrationpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ManualmigrationpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getManualmigrationpolicy()
	 * @generated
	 */
	int MANUALMIGRATIONPOLICY = 43;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALMIGRATIONPOLICY__MIXIN = SOURCEMIGRATIONPOLICITY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALMIGRATIONPOLICY__ENTITY = SOURCEMIGRATIONPOLICITY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALMIGRATIONPOLICY__ATTRIBUTES = SOURCEMIGRATIONPOLICITY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Manualmigrationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALMIGRATIONPOLICY_FEATURE_COUNT = SOURCEMIGRATIONPOLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manualmigrationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALMIGRATIONPOLICY_OPERATION_COUNT = SOURCEMIGRATIONPOLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SlaImpl <em>Sla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SlaImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSla()
	 * @generated
	 */
	int SLA = 44;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__MIXIN = DYNAMICMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__ENTITY = DYNAMICMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__ATTRIBUTES = DYNAMICMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Sla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_FEATURE_COUNT = DYNAMICMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_OPERATION_COUNT = DYNAMICMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadvolumeImpl <em>Loadvolume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadvolumeImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadvolume()
	 * @generated
	 */
	int LOADVOLUME = 45;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADVOLUME__MIXIN = DYNAMICMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADVOLUME__ENTITY = DYNAMICMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADVOLUME__ATTRIBUTES = DYNAMICMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Loadvolume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADVOLUME_FEATURE_COUNT = DYNAMICMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loadvolume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADVOLUME_OPERATION_COUNT = DYNAMICMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.PowerImpl <em>Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.PowerImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getPower()
	 * @generated
	 */
	int POWER = 46;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__MIXIN = DYNAMICMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ENTITY = DYNAMICMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ATTRIBUTES = DYNAMICMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FEATURE_COUNT = DYNAMICMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_OPERATION_COUNT = DYNAMICMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ResourcewastageImpl <em>Resourcewastage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ResourcewastageImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getResourcewastage()
	 * @generated
	 */
	int RESOURCEWASTAGE = 47;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEWASTAGE__MIXIN = DYNAMICMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEWASTAGE__ENTITY = DYNAMICMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEWASTAGE__ATTRIBUTES = DYNAMICMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Resourcewastage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEWASTAGE_FEATURE_COUNT = DYNAMICMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resourcewastage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEWASTAGE_OPERATION_COUNT = DYNAMICMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.TargetmigrationpolicyImpl <em>Targetmigrationpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.TargetmigrationpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getTargetmigrationpolicy()
	 * @generated
	 */
	int TARGETMIGRATIONPOLICY = 48;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETMIGRATIONPOLICY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETMIGRATIONPOLICY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETMIGRATIONPOLICY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Targetmigrationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETMIGRATIONPOLICY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Targetmigrationpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETMIGRATIONPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.AvailableresourcesImpl <em>Availableresources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.AvailableresourcesImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getAvailableresources()
	 * @generated
	 */
	int AVAILABLERESOURCES = 49;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLERESOURCES__MIXIN = ALLOCATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLERESOURCES__ENTITY = ALLOCATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLERESOURCES__ATTRIBUTES = ALLOCATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Availableresources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLERESOURCES_FEATURE_COUNT = ALLOCATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Availableresources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLERESOURCES_OPERATION_COUNT = ALLOCATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ManualtargetselectionImpl <em>Manualtargetselection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ManualtargetselectionImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getManualtargetselection()
	 * @generated
	 */
	int MANUALTARGETSELECTION = 50;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALTARGETSELECTION__MIXIN = TARGETMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALTARGETSELECTION__ENTITY = TARGETMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALTARGETSELECTION__ATTRIBUTES = TARGETMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Manualtargetselection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALTARGETSELECTION_FEATURE_COUNT = TARGETMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manualtargetselection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALTARGETSELECTION_OPERATION_COUNT = TARGETMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.AvailalbleresourcesorloadImpl <em>Availalbleresourcesorload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.AvailalbleresourcesorloadImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getAvailalbleresourcesorload()
	 * @generated
	 */
	int AVAILALBLERESOURCESORLOAD = 51;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILALBLERESOURCESORLOAD__MIXIN = TARGETMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILALBLERESOURCESORLOAD__ENTITY = TARGETMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILALBLERESOURCESORLOAD__ATTRIBUTES = TARGETMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Availalbleresourcesorload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILALBLERESOURCESORLOAD_FEATURE_COUNT = TARGETMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Availalbleresourcesorload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILALBLERESOURCESORLOAD_OPERATION_COUNT = TARGETMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.TargetresponsetimeImpl <em>Targetresponsetime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.TargetresponsetimeImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getTargetresponsetime()
	 * @generated
	 */
	int TARGETRESPONSETIME = 52;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETRESPONSETIME__MIXIN = TARGETMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETRESPONSETIME__ENTITY = TARGETMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETRESPONSETIME__ATTRIBUTES = TARGETMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Targetresponsetime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETRESPONSETIME_FEATURE_COUNT = TARGETMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Targetresponsetime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETRESPONSETIME_OPERATION_COUNT = TARGETMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimemetricImpl <em>Responsetimemetric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimemetricImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getResponsetimemetric()
	 * @generated
	 */
	int RESPONSETIMEMETRIC = 53;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIMEMETRIC__MIXIN = METRIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIMEMETRIC__ENTITY = METRIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIMEMETRIC__ATTRIBUTES = METRIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIMEMETRIC__NAME = METRIC__NAME;

	/**
	 * The number of structural features of the '<em>Responsetimemetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIMEMETRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsetimemetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSETIMEMETRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.NetworkcontentionImpl <em>Networkcontention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.NetworkcontentionImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getNetworkcontention()
	 * @generated
	 */
	int NETWORKCONTENTION = 54;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKCONTENTION__MIXIN = DYNAMICMIGRATIONPOLICY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKCONTENTION__ENTITY = DYNAMICMIGRATIONPOLICY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKCONTENTION__ATTRIBUTES = DYNAMICMIGRATIONPOLICY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Networkcontention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKCONTENTION_FEATURE_COUNT = DYNAMICMIGRATIONPOLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Networkcontention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKCONTENTION_OPERATION_COUNT = DYNAMICMIGRATIONPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalanceralgorithmImpl <em>Loadbalanceralgorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalanceralgorithmImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadbalanceralgorithm()
	 * @generated
	 */
	int LOADBALANCERALGORITHM = 55;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERALGORITHM__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERALGORITHM__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERALGORITHM__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Loadbalanceralgorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERALGORITHM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERALGORITHM___APPLY = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERALGORITHM___REMOVE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loadbalanceralgorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERALGORITHM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinalgoImpl <em>Roundrobinalgo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinalgoImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRoundrobinalgo()
	 * @generated
	 */
	int ROUNDROBINALGO = 56;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBINALGO__MIXIN = LOADBALANCERALGORITHM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBINALGO__ENTITY = LOADBALANCERALGORITHM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBINALGO__ATTRIBUTES = LOADBALANCERALGORITHM__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Roundrobinalgo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBINALGO_FEATURE_COUNT = LOADBALANCERALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBINALGO___APPLY = LOADBALANCERALGORITHM___APPLY;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBINALGO___REMOVE = LOADBALANCERALGORITHM___REMOVE;

	/**
	 * The number of operations of the '<em>Roundrobinalgo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDROBINALGO_OPERATION_COUNT = LOADBALANCERALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LeastconnImpl <em>Leastconn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LeastconnImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLeastconn()
	 * @generated
	 */
	int LEASTCONN = 57;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASTCONN__MIXIN = LOADBALANCERALGORITHM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASTCONN__ENTITY = LOADBALANCERALGORITHM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASTCONN__ATTRIBUTES = LOADBALANCERALGORITHM__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Leastconn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASTCONN_FEATURE_COUNT = LOADBALANCERALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASTCONN___APPLY = LOADBALANCERALGORITHM___APPLY;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASTCONN___REMOVE = LOADBALANCERALGORITHM___REMOVE;

	/**
	 * The number of operations of the '<em>Leastconn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASTCONN_OPERATION_COUNT = LOADBALANCERALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.StickysessionsImpl <em>Stickysessions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.StickysessionsImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getStickysessions()
	 * @generated
	 */
	int STICKYSESSIONS = 58;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKYSESSIONS__MIXIN = LOADBALANCERALGORITHM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKYSESSIONS__ENTITY = LOADBALANCERALGORITHM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKYSESSIONS__ATTRIBUTES = LOADBALANCERALGORITHM__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Stickysessions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKYSESSIONS_FEATURE_COUNT = LOADBALANCERALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKYSESSIONS___APPLY = LOADBALANCERALGORITHM___APPLY;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKYSESSIONS___REMOVE = LOADBALANCERALGORITHM___REMOVE;

	/**
	 * The number of operations of the '<em>Stickysessions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKYSESSIONS_OPERATION_COUNT = LOADBALANCERALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.WstaticrrImpl <em>Wstaticrr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.WstaticrrImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getWstaticrr()
	 * @generated
	 */
	int WSTATICRR = 59;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTATICRR__MIXIN = LOADBALANCERALGORITHM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTATICRR__ENTITY = LOADBALANCERALGORITHM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTATICRR__ATTRIBUTES = LOADBALANCERALGORITHM__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Wstaticrr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTATICRR_FEATURE_COUNT = LOADBALANCERALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTATICRR___APPLY = LOADBALANCERALGORITHM___APPLY;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTATICRR___REMOVE = LOADBALANCERALGORITHM___REMOVE;

	/**
	 * The number of operations of the '<em>Wstaticrr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTATICRR_OPERATION_COUNT = LOADBALANCERALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SourceImpl
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 60;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__MIXIN = LOADBALANCERALGORITHM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ENTITY = LOADBALANCERALGORITHM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ATTRIBUTES = LOADBALANCERALGORITHM__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = LOADBALANCERALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___APPLY = LOADBALANCERALGORITHM___APPLY;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___REMOVE = LOADBALANCERALGORITHM___REMOVE;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = LOADBALANCERALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.TypeMetric <em>Type Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.TypeMetric
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getTypeMetric()
	 * @generated
	 */
	int TYPE_METRIC = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.OperatorType
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.ActionOperation <em>Action Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionOperation
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getActionOperation()
	 * @generated
	 */
	int ACTION_OPERATION = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionType
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking <em>Metric Target Tracking</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMetricTargetTracking()
	 * @generated
	 */
	int METRIC_TARGET_TRACKING = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Unit
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 66;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 67;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 68;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep <em>Recurrence Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurrence Step</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep
	 * @generated
	 */
	EClass getRecurrenceStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep#getUnit()
	 * @see #getRecurrenceStep()
	 * @generated
	 */
	EAttribute getRecurrenceStep_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep#getValue()
	 * @see #getRecurrenceStep()
	 * @generated
	 */
	EReference getRecurrenceStep_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.multicloud.modemo.Array#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Array#getValues()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep <em>Arrof Rec Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrof Rec Step</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep
	 * @generated
	 */
	EClass getArrofRecStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep#getArrofrecstepValues <em>Arrofrecstep Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrofrecstep Values</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep#getArrofrecstepValues()
	 * @see #getArrofRecStep()
	 * @generated
	 */
	EReference getArrofRecStep_ArrofrecstepValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup <em>Horizontalgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontalgroup</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup
	 * @generated
	 */
	EClass getHorizontalgroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupName <em>Horizontalgroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupName()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupGroupSize <em>Horizontalgroup Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupGroupSize()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupGroupSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMaximum <em>Horizontalgroup Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Maximum</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMaximum()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMinimum <em>Horizontalgroup Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Minimum</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupMinimum()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupTemplateName <em>Horizontalgroup Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Template Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupTemplateName()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupTemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupLoadBalancer <em>Horizontalgroup Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Load Balancer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup#getHorizontalgroupLoadBalancer()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupLoadBalancer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer <em>Loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadbalancer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer
	 * @generated
	 */
	EClass getLoadbalancer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerName <em>Loadbalancer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loadbalancer Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerName()
	 * @see #getLoadbalancer()
	 * @generated
	 */
	EAttribute getLoadbalancer_LoadbalancerName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerInstanceIP <em>Loadbalancer Instance IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loadbalancer Instance IP</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerInstanceIP()
	 * @see #getLoadbalancer()
	 * @generated
	 */
	EAttribute getLoadbalancer_LoadbalancerInstanceIP();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerAddress <em>Loadbalancer Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loadbalancer Address</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerAddress()
	 * @see #getLoadbalancer()
	 * @generated
	 */
	EAttribute getLoadbalancer_LoadbalancerAddress();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#addbackendserver() <em>Addbackendserver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Addbackendserver</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#addbackendserver()
	 * @generated
	 */
	EOperation getLoadbalancer__Addbackendserver();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#removebackendserver() <em>Removebackendserver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Removebackendserver</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#removebackendserver()
	 * @generated
	 */
	EOperation getLoadbalancer__Removebackendserver();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller <em>Elasticitycontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elasticitycontroller</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller
	 * @generated
	 */
	EClass getElasticitycontroller();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMinimumLimit <em>Elasticitycontroller Minimum Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticitycontroller Minimum Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMinimumLimit()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticitycontrollerMinimumLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMaximumLimit <em>Elasticitycontroller Maximum Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticitycontroller Maximum Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller#getElasticitycontrollerMaximumLimit()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticitycontrollerMaximumLimit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink <em>Instancegrouplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancegrouplink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink
	 * @generated
	 */
	EClass getInstancegrouplink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerlink <em>Loadbalancerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadbalancerlink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerlink
	 * @generated
	 */
	EClass getLoadbalancerlink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticlink <em>Elasticlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elasticlink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Elasticlink
	 * @generated
	 */
	EClass getElasticlink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleOperator <em>Rule Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Operator</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleOperator()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleThreshold <em>Rule Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Threshold</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleThreshold()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRulePeriod <em>Rule Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Period</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Rule#getRulePeriod()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RulePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleConsecutive <em>Rule Consecutive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Consecutive</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleConsecutive()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleConsecutive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger <em>Actiontrigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actiontrigger</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger
	 * @generated
	 */
	EClass getActiontrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAction <em>Actiontrigger Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actiontrigger Action</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAction()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_ActiontriggerAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerActionType <em>Actiontrigger Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actiontrigger Action Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerActionType()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_ActiontriggerActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAmount <em>Actiontrigger Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actiontrigger Amount</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAmount()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_ActiontriggerAmount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Step#getStepLowerStepBound <em>Step Lower Step Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Lower Step Bound</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Step#getStepLowerStepBound()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepLowerStepBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Step#getStepUpperStepBound <em>Step Upper Step Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Upper Step Bound</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Step#getStepUpperStepBound()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepUpperStepBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Step#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Step#getStepSize()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Steplink <em>Steplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steplink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Steplink
	 * @generated
	 */
	EClass getSteplink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Providerlink <em>Providerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Providerlink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Providerlink
	 * @generated
	 */
	EClass getProviderlink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Providervmware <em>Providervmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Providervmware</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Providervmware
	 * @generated
	 */
	EClass getProvidervmware();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Provideropenstack <em>Provideropenstack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provideropenstack</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Provideropenstack
	 * @generated
	 */
	EClass getProvideropenstack();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Provideramazon <em>Provideramazon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provideramazon</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Provideramazon
	 * @generated
	 */
	EClass getProvideramazon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Providerazure <em>Providerazure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Providerazure</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Providerazure
	 * @generated
	 */
	EClass getProviderazure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Providerinstancelink <em>Providerinstancelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Providerinstancelink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Providerinstancelink
	 * @generated
	 */
	EClass getProviderinstancelink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Creation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Creation
	 * @generated
	 */
	EClass getCreation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Creation#getOcciComputeCreationDate <em>Occi Compute Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Creation Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Creation#getOcciComputeCreationDate()
	 * @see #getCreation()
	 * @generated
	 */
	EAttribute getCreation_OcciComputeCreationDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy <em>Schedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedulingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy
	 * @generated
	 */
	EClass getSchedulingpolicy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy#start()
	 * @generated
	 */
	EOperation getSchedulingpolicy__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy#stop()
	 * @generated
	 */
	EOperation getSchedulingpolicy__Stop();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy <em>Uniqueschedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniqueschedulingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy
	 * @generated
	 */
	EClass getUniqueschedulingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyStartDate <em>Uniqueschedulingpolicy Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueschedulingpolicy Start Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyStartDate()
	 * @see #getUniqueschedulingpolicy()
	 * @generated
	 */
	EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyEndDate <em>Uniqueschedulingpolicy End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueschedulingpolicy End Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyEndDate()
	 * @see #getUniqueschedulingpolicy()
	 * @generated
	 */
	EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy <em>Recurringschedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurringschedulingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy
	 * @generated
	 */
	EClass getRecurringschedulingpolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyRecurrence <em>Recurringschedulingpolicy Recurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recurringschedulingpolicy Recurrence</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyRecurrence()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EReference getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyStartDate <em>Recurringschedulingpolicy Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedulingpolicy Start Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyStartDate()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyEndDate <em>Recurringschedulingpolicy End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedulingpolicy End Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyEndDate()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyInterval <em>Recurringschedulingpolicy Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedulingpolicy Interval</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyInterval()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyInterval();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy <em>Scalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy
	 * @generated
	 */
	EClass getScalingpolicy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy#start()
	 * @generated
	 */
	EOperation getScalingpolicy__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy#stop()
	 * @generated
	 */
	EOperation getScalingpolicy__Stop();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy <em>Dynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamicscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy
	 * @generated
	 */
	EClass getDynamicscalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy#getDynamicscalingpolicyCoolDuration <em>Dynamicscalingpolicy Cool Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicscalingpolicy Cool Duration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy#getDynamicscalingpolicyCoolDuration()
	 * @see #getDynamicscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy#getDynamicscalingpolicyIterationWaitTime <em>Dynamicscalingpolicy Iteration Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicscalingpolicy Iteration Wait Time</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy#getDynamicscalingpolicyIterationWaitTime()
	 * @see #getDynamicscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy <em>Dynamicadjustmentscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy
	 * @generated
	 */
	EClass getDynamicadjustmentscalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyMetric <em>Dynamicadjustmentscalingpolicy Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicadjustmentscalingpolicy Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyMetric()
	 * @see #getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#isDynamicadjustmentscalingpolicyDisableScaleIn <em>Dynamicadjustmentscalingpolicy Disable Scale In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicadjustmentscalingpolicy Disable Scale In</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#isDynamicadjustmentscalingpolicyDisableScaleIn()
	 * @see #getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyTarget <em>Dynamicadjustmentscalingpolicy Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicadjustmentscalingpolicy Target</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyTarget()
	 * @see #getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Simpledynamicscalingpolicy <em>Simpledynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simpledynamicscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Simpledynamicscalingpolicy
	 * @generated
	 */
	EClass getSimpledynamicscalingpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Stepdynamicscalingpolicy <em>Stepdynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stepdynamicscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Stepdynamicscalingpolicy
	 * @generated
	 */
	EClass getStepdynamicscalingpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy <em>Manualscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manualscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy
	 * @generated
	 */
	EClass getManualscalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyDesiredSize <em>Manualscalingpolicy Desired Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manualscalingpolicy Desired Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyDesiredSize()
	 * @see #getManualscalingpolicy()
	 * @generated
	 */
	EAttribute getManualscalingpolicy_ManualscalingpolicyDesiredSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyComputeUnit <em>Manualscalingpolicy Compute Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manualscalingpolicy Compute Unit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyComputeUnit()
	 * @see #getManualscalingpolicy()
	 * @generated
	 */
	EAttribute getManualscalingpolicy_ManualscalingpolicyComputeUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.modemo.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Cpuutilisation <em>Cpuutilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpuutilisation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Cpuutilisation
	 * @generated
	 */
	EClass getCpuutilisation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Memoryutilisation <em>Memoryutilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memoryutilisation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Memoryutilisation
	 * @generated
	 */
	EClass getMemoryutilisation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Allocationpolicy <em>Allocationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocationpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Allocationpolicy
	 * @generated
	 */
	EClass getAllocationpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Roundrobin <em>Roundrobin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roundrobin</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Roundrobin
	 * @generated
	 */
	EClass getRoundrobin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Responsetime <em>Responsetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsetime</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Responsetime
	 * @generated
	 */
	EClass getResponsetime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Cost
	 * @generated
	 */
	EClass getCost();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Swappingpolicy <em>Swappingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swappingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Swappingpolicy
	 * @generated
	 */
	EClass getSwappingpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Sourcemigrationpolicity <em>Sourcemigrationpolicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sourcemigrationpolicity</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Sourcemigrationpolicity
	 * @generated
	 */
	EClass getSourcemigrationpolicity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Livemigration <em>Livemigration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livemigration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Livemigration
	 * @generated
	 */
	EClass getLivemigration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Nonlivemigration <em>Nonlivemigration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nonlivemigration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Nonlivemigration
	 * @generated
	 */
	EClass getNonlivemigration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Migrationtype <em>Migrationtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migrationtype</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Migrationtype
	 * @generated
	 */
	EClass getMigrationtype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicmigrationpolicy <em>Dynamicmigrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamicmigrationpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicmigrationpolicy
	 * @generated
	 */
	EClass getDynamicmigrationpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualmigrationpolicy <em>Manualmigrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manualmigrationpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualmigrationpolicy
	 * @generated
	 */
	EClass getManualmigrationpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Sla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sla</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Sla
	 * @generated
	 */
	EClass getSla();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadvolume <em>Loadvolume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadvolume</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadvolume
	 * @generated
	 */
	EClass getLoadvolume();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Power <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Power
	 * @generated
	 */
	EClass getPower();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Resourcewastage <em>Resourcewastage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resourcewastage</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Resourcewastage
	 * @generated
	 */
	EClass getResourcewastage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Targetmigrationpolicy <em>Targetmigrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targetmigrationpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Targetmigrationpolicy
	 * @generated
	 */
	EClass getTargetmigrationpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Availableresources <em>Availableresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availableresources</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Availableresources
	 * @generated
	 */
	EClass getAvailableresources();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualtargetselection <em>Manualtargetselection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manualtargetselection</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualtargetselection
	 * @generated
	 */
	EClass getManualtargetselection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Availalbleresourcesorload <em>Availalbleresourcesorload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availalbleresourcesorload</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Availalbleresourcesorload
	 * @generated
	 */
	EClass getAvailalbleresourcesorload();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Targetresponsetime <em>Targetresponsetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targetresponsetime</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Targetresponsetime
	 * @generated
	 */
	EClass getTargetresponsetime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Responsetimemetric <em>Responsetimemetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsetimemetric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Responsetimemetric
	 * @generated
	 */
	EClass getResponsetimemetric();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Networkcontention <em>Networkcontention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networkcontention</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Networkcontention
	 * @generated
	 */
	EClass getNetworkcontention();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalanceralgorithm <em>Loadbalanceralgorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadbalanceralgorithm</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalanceralgorithm
	 * @generated
	 */
	EClass getLoadbalanceralgorithm();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalanceralgorithm#apply() <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalanceralgorithm#apply()
	 * @generated
	 */
	EOperation getLoadbalanceralgorithm__Apply();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalanceralgorithm#remove() <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalanceralgorithm#remove()
	 * @generated
	 */
	EOperation getLoadbalanceralgorithm__Remove();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Roundrobinalgo <em>Roundrobinalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roundrobinalgo</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Roundrobinalgo
	 * @generated
	 */
	EClass getRoundrobinalgo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Leastconn <em>Leastconn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leastconn</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Leastconn
	 * @generated
	 */
	EClass getLeastconn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Stickysessions <em>Stickysessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stickysessions</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Stickysessions
	 * @generated
	 */
	EClass getStickysessions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Wstaticrr <em>Wstaticrr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wstaticrr</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Wstaticrr
	 * @generated
	 */
	EClass getWstaticrr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.modemo.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.modemo.TypeMetric <em>Type Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.TypeMetric
	 * @generated
	 */
	EEnum getTypeMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.modemo.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.modemo.ActionOperation <em>Action Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Operation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionOperation
	 * @generated
	 */
	EEnum getActionOperation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.modemo.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking <em>Metric Target Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Target Tracking</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking
	 * @generated
	 */
	EEnum getMetricTargetTracking();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.modemo.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModemoFactory getModemoFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RecurrenceStepImpl <em>Recurrence Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RecurrenceStepImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRecurrenceStep()
		 * @generated
		 */
		EClass RECURRENCE_STEP = eINSTANCE.getRecurrenceStep();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRENCE_STEP__UNIT = eINSTANCE.getRecurrenceStep_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURRENCE_STEP__VALUE = eINSTANCE.getRecurrenceStep_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ArrayImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__VALUES = eINSTANCE.getArray_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ArrofRecStepImpl <em>Arrof Rec Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ArrofRecStepImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getArrofRecStep()
		 * @generated
		 */
		EClass ARROF_REC_STEP = eINSTANCE.getArrofRecStep();

		/**
		 * The meta object literal for the '<em><b>Arrofrecstep Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROF_REC_STEP__ARROFRECSTEP_VALUES = eINSTANCE.getArrofRecStep_ArrofrecstepValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.HorizontalgroupImpl <em>Horizontalgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.HorizontalgroupImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getHorizontalgroup()
		 * @generated
		 */
		EClass HORIZONTALGROUP = eINSTANCE.getHorizontalgroup();

		/**
		 * The meta object literal for the '<em><b>Horizontalgroup Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTALGROUP_NAME = eINSTANCE.getHorizontalgroup_HorizontalgroupName();

		/**
		 * The meta object literal for the '<em><b>Horizontalgroup Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE = eINSTANCE.getHorizontalgroup_HorizontalgroupGroupSize();

		/**
		 * The meta object literal for the '<em><b>Horizontalgroup Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM = eINSTANCE.getHorizontalgroup_HorizontalgroupMaximum();

		/**
		 * The meta object literal for the '<em><b>Horizontalgroup Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM = eINSTANCE.getHorizontalgroup_HorizontalgroupMinimum();

		/**
		 * The meta object literal for the '<em><b>Horizontalgroup Template Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME = eINSTANCE.getHorizontalgroup_HorizontalgroupTemplateName();

		/**
		 * The meta object literal for the '<em><b>Horizontalgroup Load Balancer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER = eINSTANCE.getHorizontalgroup_HorizontalgroupLoadBalancer();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerImpl <em>Loadbalancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadbalancer()
		 * @generated
		 */
		EClass LOADBALANCER = eINSTANCE.getLoadbalancer();

		/**
		 * The meta object literal for the '<em><b>Loadbalancer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADBALANCER__LOADBALANCER_NAME = eINSTANCE.getLoadbalancer_LoadbalancerName();

		/**
		 * The meta object literal for the '<em><b>Loadbalancer Instance IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADBALANCER__LOADBALANCER_INSTANCE_IP = eINSTANCE.getLoadbalancer_LoadbalancerInstanceIP();

		/**
		 * The meta object literal for the '<em><b>Loadbalancer Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADBALANCER__LOADBALANCER_ADDRESS = eINSTANCE.getLoadbalancer_LoadbalancerAddress();

		/**
		 * The meta object literal for the '<em><b>Addbackendserver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOADBALANCER___ADDBACKENDSERVER = eINSTANCE.getLoadbalancer__Addbackendserver();

		/**
		 * The meta object literal for the '<em><b>Removebackendserver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOADBALANCER___REMOVEBACKENDSERVER = eINSTANCE.getLoadbalancer__Removebackendserver();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticitycontrollerImpl <em>Elasticitycontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticitycontrollerImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getElasticitycontroller()
		 * @generated
		 */
		EClass ELASTICITYCONTROLLER = eINSTANCE.getElasticitycontroller();

		/**
		 * The meta object literal for the '<em><b>Elasticitycontroller Minimum Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT = eINSTANCE.getElasticitycontroller_ElasticitycontrollerMinimumLimit();

		/**
		 * The meta object literal for the '<em><b>Elasticitycontroller Maximum Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT = eINSTANCE.getElasticitycontroller_ElasticitycontrollerMaximumLimit();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.InstancegrouplinkImpl <em>Instancegrouplink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.InstancegrouplinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getInstancegrouplink()
		 * @generated
		 */
		EClass INSTANCEGROUPLINK = eINSTANCE.getInstancegrouplink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerlinkImpl <em>Loadbalancerlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalancerlinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadbalancerlink()
		 * @generated
		 */
		EClass LOADBALANCERLINK = eINSTANCE.getLoadbalancerlink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticlinkImpl <em>Elasticlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ElasticlinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getElasticlink()
		 * @generated
		 */
		EClass ELASTICLINK = eINSTANCE.getElasticlink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Rule Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE_OPERATOR = eINSTANCE.getRule_RuleOperator();

		/**
		 * The meta object literal for the '<em><b>Rule Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE_THRESHOLD = eINSTANCE.getRule_RuleThreshold();

		/**
		 * The meta object literal for the '<em><b>Rule Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE_PERIOD = eINSTANCE.getRule_RulePeriod();

		/**
		 * The meta object literal for the '<em><b>Rule Consecutive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE_CONSECUTIVE = eINSTANCE.getRule_RuleConsecutive();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ActiontriggerImpl <em>Actiontrigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ActiontriggerImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getActiontrigger()
		 * @generated
		 */
		EClass ACTIONTRIGGER = eINSTANCE.getActiontrigger();

		/**
		 * The meta object literal for the '<em><b>Actiontrigger Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONTRIGGER__ACTIONTRIGGER_ACTION = eINSTANCE.getActiontrigger_ActiontriggerAction();

		/**
		 * The meta object literal for the '<em><b>Actiontrigger Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE = eINSTANCE.getActiontrigger_ActiontriggerActionType();

		/**
		 * The meta object literal for the '<em><b>Actiontrigger Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT = eINSTANCE.getActiontrigger_ActiontriggerAmount();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.StepImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Step Lower Step Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP_LOWER_STEP_BOUND = eINSTANCE.getStep_StepLowerStepBound();

		/**
		 * The meta object literal for the '<em><b>Step Upper Step Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP_UPPER_STEP_BOUND = eINSTANCE.getStep_StepUpperStepBound();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP_SIZE = eINSTANCE.getStep_StepSize();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SteplinkImpl <em>Steplink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SteplinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSteplink()
		 * @generated
		 */
		EClass STEPLINK = eINSTANCE.getSteplink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderlinkImpl <em>Providerlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderlinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProviderlink()
		 * @generated
		 */
		EClass PROVIDERLINK = eINSTANCE.getProviderlink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProvidervmwareImpl <em>Providervmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProvidervmwareImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvidervmware()
		 * @generated
		 */
		EClass PROVIDERVMWARE = eINSTANCE.getProvidervmware();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideropenstackImpl <em>Provideropenstack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideropenstackImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvideropenstack()
		 * @generated
		 */
		EClass PROVIDEROPENSTACK = eINSTANCE.getProvideropenstack();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideramazonImpl <em>Provideramazon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProvideramazonImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProvideramazon()
		 * @generated
		 */
		EClass PROVIDERAMAZON = eINSTANCE.getProvideramazon();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderazureImpl <em>Providerazure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderazureImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProviderazure()
		 * @generated
		 */
		EClass PROVIDERAZURE = eINSTANCE.getProviderazure();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderinstancelinkImpl <em>Providerinstancelink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ProviderinstancelinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getProviderinstancelink()
		 * @generated
		 */
		EClass PROVIDERINSTANCELINK = eINSTANCE.getProviderinstancelink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.CreationImpl <em>Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.CreationImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getCreation()
		 * @generated
		 */
		EClass CREATION = eINSTANCE.getCreation();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION__OCCI_COMPUTE_CREATION_DATE = eINSTANCE.getCreation_OcciComputeCreationDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SchedulingpolicyImpl <em>Schedulingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SchedulingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSchedulingpolicy()
		 * @generated
		 */
		EClass SCHEDULINGPOLICY = eINSTANCE.getSchedulingpolicy();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULINGPOLICY___START = eINSTANCE.getSchedulingpolicy__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULINGPOLICY___STOP = eINSTANCE.getSchedulingpolicy__Stop();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.UniqueschedulingpolicyImpl <em>Uniqueschedulingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.UniqueschedulingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getUniqueschedulingpolicy()
		 * @generated
		 */
		EClass UNIQUESCHEDULINGPOLICY = eINSTANCE.getUniqueschedulingpolicy();

		/**
		 * The meta object literal for the '<em><b>Uniqueschedulingpolicy Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE = eINSTANCE.getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate();

		/**
		 * The meta object literal for the '<em><b>Uniqueschedulingpolicy End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE = eINSTANCE.getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RecurringschedulingpolicyImpl <em>Recurringschedulingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RecurringschedulingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRecurringschedulingpolicy()
		 * @generated
		 */
		EClass RECURRINGSCHEDULINGPOLICY = eINSTANCE.getRecurringschedulingpolicy();

		/**
		 * The meta object literal for the '<em><b>Recurringschedulingpolicy Recurrence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE = eINSTANCE.getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence();

		/**
		 * The meta object literal for the '<em><b>Recurringschedulingpolicy Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE = eINSTANCE.getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate();

		/**
		 * The meta object literal for the '<em><b>Recurringschedulingpolicy End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE = eINSTANCE.getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate();

		/**
		 * The meta object literal for the '<em><b>Recurringschedulingpolicy Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL = eINSTANCE.getRecurringschedulingpolicy_RecurringschedulingpolicyInterval();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ScalingpolicyImpl <em>Scalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ScalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getScalingpolicy()
		 * @generated
		 */
		EClass SCALINGPOLICY = eINSTANCE.getScalingpolicy();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCALINGPOLICY___START = eINSTANCE.getScalingpolicy__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCALINGPOLICY___STOP = eINSTANCE.getScalingpolicy__Stop();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicscalingpolicyImpl <em>Dynamicscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDynamicscalingpolicy()
		 * @generated
		 */
		EClass DYNAMICSCALINGPOLICY = eINSTANCE.getDynamicscalingpolicy();

		/**
		 * The meta object literal for the '<em><b>Dynamicscalingpolicy Cool Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION = eINSTANCE.getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration();

		/**
		 * The meta object literal for the '<em><b>Dynamicscalingpolicy Iteration Wait Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME = eINSTANCE.getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicadjustmentscalingpolicyImpl <em>Dynamicadjustmentscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicadjustmentscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDynamicadjustmentscalingpolicy()
		 * @generated
		 */
		EClass DYNAMICADJUSTMENTSCALINGPOLICY = eINSTANCE.getDynamicadjustmentscalingpolicy();

		/**
		 * The meta object literal for the '<em><b>Dynamicadjustmentscalingpolicy Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC = eINSTANCE.getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric();

		/**
		 * The meta object literal for the '<em><b>Dynamicadjustmentscalingpolicy Disable Scale In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN = eINSTANCE.getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn();

		/**
		 * The meta object literal for the '<em><b>Dynamicadjustmentscalingpolicy Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET = eINSTANCE.getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SimpledynamicscalingpolicyImpl <em>Simpledynamicscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SimpledynamicscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSimpledynamicscalingpolicy()
		 * @generated
		 */
		EClass SIMPLEDYNAMICSCALINGPOLICY = eINSTANCE.getSimpledynamicscalingpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.StepdynamicscalingpolicyImpl <em>Stepdynamicscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.StepdynamicscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getStepdynamicscalingpolicy()
		 * @generated
		 */
		EClass STEPDYNAMICSCALINGPOLICY = eINSTANCE.getStepdynamicscalingpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ManualscalingpolicyImpl <em>Manualscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ManualscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getManualscalingpolicy()
		 * @generated
		 */
		EClass MANUALSCALINGPOLICY = eINSTANCE.getManualscalingpolicy();

		/**
		 * The meta object literal for the '<em><b>Manualscalingpolicy Desired Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE = eINSTANCE.getManualscalingpolicy_ManualscalingpolicyDesiredSize();

		/**
		 * The meta object literal for the '<em><b>Manualscalingpolicy Compute Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_COMPUTE_UNIT = eINSTANCE.getManualscalingpolicy_ManualscalingpolicyComputeUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.MetricImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.CpuutilisationImpl <em>Cpuutilisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.CpuutilisationImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getCpuutilisation()
		 * @generated
		 */
		EClass CPUUTILISATION = eINSTANCE.getCpuutilisation();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.MemoryutilisationImpl <em>Memoryutilisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.MemoryutilisationImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMemoryutilisation()
		 * @generated
		 */
		EClass MEMORYUTILISATION = eINSTANCE.getMemoryutilisation();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.AllocationpolicyImpl <em>Allocationpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.AllocationpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getAllocationpolicy()
		 * @generated
		 */
		EClass ALLOCATIONPOLICY = eINSTANCE.getAllocationpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinImpl <em>Roundrobin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRoundrobin()
		 * @generated
		 */
		EClass ROUNDROBIN = eINSTANCE.getRoundrobin();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimeImpl <em>Responsetime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimeImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getResponsetime()
		 * @generated
		 */
		EClass RESPONSETIME = eINSTANCE.getResponsetime();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.CostImpl <em>Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.CostImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getCost()
		 * @generated
		 */
		EClass COST = eINSTANCE.getCost();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SwappingpolicyImpl <em>Swappingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SwappingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSwappingpolicy()
		 * @generated
		 */
		EClass SWAPPINGPOLICY = eINSTANCE.getSwappingpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SourcemigrationpolicityImpl <em>Sourcemigrationpolicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SourcemigrationpolicityImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSourcemigrationpolicity()
		 * @generated
		 */
		EClass SOURCEMIGRATIONPOLICITY = eINSTANCE.getSourcemigrationpolicity();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LivemigrationImpl <em>Livemigration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LivemigrationImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLivemigration()
		 * @generated
		 */
		EClass LIVEMIGRATION = eINSTANCE.getLivemigration();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.NonlivemigrationImpl <em>Nonlivemigration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.NonlivemigrationImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getNonlivemigration()
		 * @generated
		 */
		EClass NONLIVEMIGRATION = eINSTANCE.getNonlivemigration();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.MigrationtypeImpl <em>Migrationtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.MigrationtypeImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMigrationtype()
		 * @generated
		 */
		EClass MIGRATIONTYPE = eINSTANCE.getMigrationtype();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicmigrationpolicyImpl <em>Dynamicmigrationpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicmigrationpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDynamicmigrationpolicy()
		 * @generated
		 */
		EClass DYNAMICMIGRATIONPOLICY = eINSTANCE.getDynamicmigrationpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ManualmigrationpolicyImpl <em>Manualmigrationpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ManualmigrationpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getManualmigrationpolicy()
		 * @generated
		 */
		EClass MANUALMIGRATIONPOLICY = eINSTANCE.getManualmigrationpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SlaImpl <em>Sla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SlaImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSla()
		 * @generated
		 */
		EClass SLA = eINSTANCE.getSla();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadvolumeImpl <em>Loadvolume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadvolumeImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadvolume()
		 * @generated
		 */
		EClass LOADVOLUME = eINSTANCE.getLoadvolume();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.PowerImpl <em>Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.PowerImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getPower()
		 * @generated
		 */
		EClass POWER = eINSTANCE.getPower();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ResourcewastageImpl <em>Resourcewastage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ResourcewastageImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getResourcewastage()
		 * @generated
		 */
		EClass RESOURCEWASTAGE = eINSTANCE.getResourcewastage();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.TargetmigrationpolicyImpl <em>Targetmigrationpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.TargetmigrationpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getTargetmigrationpolicy()
		 * @generated
		 */
		EClass TARGETMIGRATIONPOLICY = eINSTANCE.getTargetmigrationpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.AvailableresourcesImpl <em>Availableresources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.AvailableresourcesImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getAvailableresources()
		 * @generated
		 */
		EClass AVAILABLERESOURCES = eINSTANCE.getAvailableresources();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ManualtargetselectionImpl <em>Manualtargetselection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ManualtargetselectionImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getManualtargetselection()
		 * @generated
		 */
		EClass MANUALTARGETSELECTION = eINSTANCE.getManualtargetselection();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.AvailalbleresourcesorloadImpl <em>Availalbleresourcesorload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.AvailalbleresourcesorloadImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getAvailalbleresourcesorload()
		 * @generated
		 */
		EClass AVAILALBLERESOURCESORLOAD = eINSTANCE.getAvailalbleresourcesorload();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.TargetresponsetimeImpl <em>Targetresponsetime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.TargetresponsetimeImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getTargetresponsetime()
		 * @generated
		 */
		EClass TARGETRESPONSETIME = eINSTANCE.getTargetresponsetime();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimemetricImpl <em>Responsetimemetric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ResponsetimemetricImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getResponsetimemetric()
		 * @generated
		 */
		EClass RESPONSETIMEMETRIC = eINSTANCE.getResponsetimemetric();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.NetworkcontentionImpl <em>Networkcontention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.NetworkcontentionImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getNetworkcontention()
		 * @generated
		 */
		EClass NETWORKCONTENTION = eINSTANCE.getNetworkcontention();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalanceralgorithmImpl <em>Loadbalanceralgorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LoadbalanceralgorithmImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLoadbalanceralgorithm()
		 * @generated
		 */
		EClass LOADBALANCERALGORITHM = eINSTANCE.getLoadbalanceralgorithm();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOADBALANCERALGORITHM___APPLY = eINSTANCE.getLoadbalanceralgorithm__Apply();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOADBALANCERALGORITHM___REMOVE = eINSTANCE.getLoadbalanceralgorithm__Remove();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinalgoImpl <em>Roundrobinalgo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.RoundrobinalgoImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getRoundrobinalgo()
		 * @generated
		 */
		EClass ROUNDROBINALGO = eINSTANCE.getRoundrobinalgo();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.LeastconnImpl <em>Leastconn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.LeastconnImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getLeastconn()
		 * @generated
		 */
		EClass LEASTCONN = eINSTANCE.getLeastconn();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.StickysessionsImpl <em>Stickysessions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.StickysessionsImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getStickysessions()
		 * @generated
		 */
		EClass STICKYSESSIONS = eINSTANCE.getStickysessions();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.WstaticrrImpl <em>Wstaticrr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.WstaticrrImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getWstaticrr()
		 * @generated
		 */
		EClass WSTATICRR = eINSTANCE.getWstaticrr();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.SourceImpl
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.TypeMetric <em>Type Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.TypeMetric
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getTypeMetric()
		 * @generated
		 */
		EEnum TYPE_METRIC = eINSTANCE.getTypeMetric();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.OperatorType
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.ActionOperation <em>Action Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionOperation
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getActionOperation()
		 * @generated
		 */
		EEnum ACTION_OPERATION = eINSTANCE.getActionOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionType
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking <em>Metric Target Tracking</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getMetricTargetTracking()
		 * @generated
		 */
		EEnum METRIC_TARGET_TRACKING = eINSTANCE.getMetricTargetTracking();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.modemo.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.modemo.Unit
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //ModemoPackage
