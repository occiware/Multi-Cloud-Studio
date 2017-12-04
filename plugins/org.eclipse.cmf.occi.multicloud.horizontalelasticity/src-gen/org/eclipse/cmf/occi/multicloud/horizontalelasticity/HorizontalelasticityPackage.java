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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity;

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
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' infrastructure='http://schemas.ogf.org/occi/infrastructure/ecore' vmware='http://occiware.org/occi/infrastructure/vmware/ecore'"
 * @generated
 */
public interface HorizontalelasticityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "horizontalelasticity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "horizontalelasticity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HorizontalelasticityPackage eINSTANCE = org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurrenceStepImpl <em>Recurrence Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurrenceStepImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRecurrenceStep()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getArray()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrofRecStepImpl <em>Arrof Rec Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrofRecStepImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getArrofRecStep()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl <em>Horizontalgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getHorizontalgroup()
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
	 * The feature id for the '<em><b>Horizontal Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTAL_GROUP_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontal Group Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal Group Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal Group Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Horizontal Group Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Horizontal Group Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl <em>Loadbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLoadbalancer()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl <em>Elasticitycontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getElasticitycontroller()
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
	 * The feature id for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_COOL_DURATION = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Elasticitycontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

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
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER___START = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER___STOP = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elasticitycontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstancegrouplinkImpl <em>Instancegrouplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstancegrouplinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getInstancegrouplink()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkloadbalancerImpl <em>Linkloadbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkloadbalancerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLinkloadbalancer()
	 * @generated
	 */
	int LINKLOADBALANCER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Linkloadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Linkloadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKLOADBALANCER_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.GrouplinkImpl <em>Grouplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.GrouplinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getGrouplink()
	 * @generated
	 */
	int GROUPLINK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Grouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Grouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ID = ELASTICITYCONTROLLER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__TITLE = ELASTICITYCONTROLLER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__KIND = ELASTICITYCONTROLLER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__LOCATION = ELASTICITYCONTROLLER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ATTRIBUTES = ELASTICITYCONTROLLER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MIXINS = ELASTICITYCONTROLLER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__PARTS = ELASTICITYCONTROLLER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__SUMMARY = ELASTICITYCONTROLLER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__LINKS = ELASTICITYCONTROLLER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__RLINKS = ELASTICITYCONTROLLER__RLINKS;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MINIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ELASTICITY_CONTROLLER_COOL_DURATION = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME;

	/**
	 * The feature id for the '<em><b>Manual Desired Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MANUAL_DESIRED_SIZE = ELASTICITYCONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = ELASTICITYCONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_CREATE = ELASTICITYCONTROLLER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_RETRIEVE = ELASTICITYCONTROLLER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_UPDATE = ELASTICITYCONTROLLER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_DELETE = ELASTICITYCONTROLLER___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___START = ELASTICITYCONTROLLER___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___STOP = ELASTICITYCONTROLLER___STOP;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = ELASTICITYCONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl <em>Dynamic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamic()
	 * @generated
	 */
	int DYNAMIC = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ID = ELASTICITYCONTROLLER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__TITLE = ELASTICITYCONTROLLER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__KIND = ELASTICITYCONTROLLER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LOCATION = ELASTICITYCONTROLLER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ATTRIBUTES = ELASTICITYCONTROLLER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__MIXINS = ELASTICITYCONTROLLER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__PARTS = ELASTICITYCONTROLLER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__SUMMARY = ELASTICITYCONTROLLER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LINKS = ELASTICITYCONTROLLER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__RLINKS = ELASTICITYCONTROLLER__RLINKS;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MINIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ELASTICITY_CONTROLLER_COOL_DURATION = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME;

	/**
	 * The number of structural features of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FEATURE_COUNT = ELASTICITYCONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_CREATE = ELASTICITYCONTROLLER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_RETRIEVE = ELASTICITYCONTROLLER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_UPDATE = ELASTICITYCONTROLLER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_DELETE = ELASTICITYCONTROLLER___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___START = ELASTICITYCONTROLLER___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___STOP = ELASTICITYCONTROLLER___STOP;

	/**
	 * The number of operations of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OPERATION_COUNT = ELASTICITYCONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicpolicyImpl <em>Dynamicpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicpolicy()
	 * @generated
	 */
	int DYNAMICPOLICY = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__ID = DYNAMIC__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__TITLE = DYNAMIC__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__KIND = DYNAMIC__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__LOCATION = DYNAMIC__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__ATTRIBUTES = DYNAMIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__MIXINS = DYNAMIC__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__PARTS = DYNAMIC__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__SUMMARY = DYNAMIC__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__LINKS = DYNAMIC__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__RLINKS = DYNAMIC__RLINKS;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = DYNAMIC__ELASTICITY_CONTROLLER_MINIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = DYNAMIC__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__ELASTICITY_CONTROLLER_COOL_DURATION = DYNAMIC__ELASTICITY_CONTROLLER_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = DYNAMIC__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME;

	/**
	 * The number of structural features of the '<em>Dynamicpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY_FEATURE_COUNT = DYNAMIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY___OCCI_CREATE = DYNAMIC___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY___OCCI_RETRIEVE = DYNAMIC___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY___OCCI_UPDATE = DYNAMIC___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY___OCCI_DELETE = DYNAMIC___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY___START = DYNAMIC___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY___STOP = DYNAMIC___STOP;

	/**
	 * The number of operations of the '<em>Dynamicpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICPOLICY_OPERATION_COUNT = DYNAMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl <em>Simpledynamic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSimpledynamic()
	 * @generated
	 */
	int SIMPLEDYNAMIC = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__ID = DYNAMICPOLICY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__TITLE = DYNAMICPOLICY__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__KIND = DYNAMICPOLICY__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__LOCATION = DYNAMICPOLICY__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__ATTRIBUTES = DYNAMICPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__MIXINS = DYNAMICPOLICY__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__PARTS = DYNAMICPOLICY__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__SUMMARY = DYNAMICPOLICY__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__LINKS = DYNAMICPOLICY__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__RLINKS = DYNAMICPOLICY__RLINKS;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = DYNAMICPOLICY__ELASTICITY_CONTROLLER_MINIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = DYNAMICPOLICY__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__ELASTICITY_CONTROLLER_COOL_DURATION = DYNAMICPOLICY__ELASTICITY_CONTROLLER_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = DYNAMICPOLICY__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME;

	/**
	 * The number of structural features of the '<em>Simpledynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC_FEATURE_COUNT = DYNAMICPOLICY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_CREATE = DYNAMICPOLICY___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_RETRIEVE = DYNAMICPOLICY___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_UPDATE = DYNAMICPOLICY___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_DELETE = DYNAMICPOLICY___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___START = DYNAMICPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___STOP = DYNAMICPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Simpledynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC_OPERATION_COUNT = DYNAMICPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl <em>Stepdynamic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getStepdynamic()
	 * @generated
	 */
	int STEPDYNAMIC = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__ID = DYNAMICPOLICY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__TITLE = DYNAMICPOLICY__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__KIND = DYNAMICPOLICY__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__LOCATION = DYNAMICPOLICY__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__ATTRIBUTES = DYNAMICPOLICY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__MIXINS = DYNAMICPOLICY__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__PARTS = DYNAMICPOLICY__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__SUMMARY = DYNAMICPOLICY__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__LINKS = DYNAMICPOLICY__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__RLINKS = DYNAMICPOLICY__RLINKS;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = DYNAMICPOLICY__ELASTICITY_CONTROLLER_MINIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = DYNAMICPOLICY__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__ELASTICITY_CONTROLLER_COOL_DURATION = DYNAMICPOLICY__ELASTICITY_CONTROLLER_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = DYNAMICPOLICY__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME;

	/**
	 * The number of structural features of the '<em>Stepdynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC_FEATURE_COUNT = DYNAMICPOLICY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_CREATE = DYNAMICPOLICY___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_RETRIEVE = DYNAMICPOLICY___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_UPDATE = DYNAMICPOLICY___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_DELETE = DYNAMICPOLICY___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___START = DYNAMICPOLICY___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___STOP = DYNAMICPOLICY___STOP;

	/**
	 * The number of operations of the '<em>Stepdynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC_OPERATION_COUNT = DYNAMICPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl <em>Dynamicadjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicadjustment()
	 * @generated
	 */
	int DYNAMICADJUSTMENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__ID = DYNAMIC__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__TITLE = DYNAMIC__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__KIND = DYNAMIC__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__LOCATION = DYNAMIC__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__ATTRIBUTES = DYNAMIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__MIXINS = DYNAMIC__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__PARTS = DYNAMIC__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__SUMMARY = DYNAMIC__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__LINKS = DYNAMIC__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__RLINKS = DYNAMIC__RLINKS;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = DYNAMIC__ELASTICITY_CONTROLLER_MINIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = DYNAMIC__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__ELASTICITY_CONTROLLER_COOL_DURATION = DYNAMIC__ELASTICITY_CONTROLLER_COOL_DURATION;

	/**
	 * The feature id for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = DYNAMIC__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC = DYNAMIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Disable Scale In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN = DYNAMIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET = DYNAMIC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamicadjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT_FEATURE_COUNT = DYNAMIC_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT___OCCI_CREATE = DYNAMIC___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT___OCCI_RETRIEVE = DYNAMIC___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT___OCCI_UPDATE = DYNAMIC___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT___OCCI_DELETE = DYNAMIC___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT___START = DYNAMIC___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT___STOP = DYNAMIC___STOP;

	/**
	 * The number of operations of the '<em>Dynamicadjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT_OPERATION_COUNT = DYNAMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 14;

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
	 * The feature id for the '<em><b>Rule Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_METRIC = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_OPERATOR = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_THRESHOLD = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PERIOD = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rule Consecutive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_CONSECUTIVE = OCCIPackage.LINK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl <em>Actiontrigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActiontrigger()
	 * @generated
	 */
	int ACTIONTRIGGER = 15;

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
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__ACTION = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__ACTION_TYPE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONTRIGGER__AMOUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 17;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SteplinkImpl <em>Steplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SteplinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSteplink()
	 * @generated
	 */
	int STEPLINK = 18;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ComputelinkImpl <em>Computelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ComputelinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getComputelink()
	 * @generated
	 */
	int COMPUTELINK = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Computelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Computelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTELINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl <em>Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getCreation()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 21;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___START = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl <em>Uniqueschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUniqueschedule()
	 * @generated
	 */
	int UNIQUESCHEDULE = 22;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__MIXIN = SCHEDULER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__ENTITY = SCHEDULER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__ATTRIBUTES = SCHEDULER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Unique Schedule Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE = SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique Schedule End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE = SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uniqueschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE_FEATURE_COUNT = SCHEDULER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE___START = SCHEDULER___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE___STOP = SCHEDULER___STOP;

	/**
	 * The number of operations of the '<em>Uniqueschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE_OPERATION_COUNT = SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl <em>Recurringschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRecurringschedule()
	 * @generated
	 */
	int RECURRINGSCHEDULE = 23;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__MIXIN = SCHEDULER__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__ENTITY = SCHEDULER__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__ATTRIBUTES = SCHEDULER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Recurringschedule Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE = SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recurringschedule Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE = SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recurringschedule End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE = SCHEDULER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__INTERVAL = SCHEDULER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Recurringschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE_FEATURE_COUNT = SCHEDULER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE___START = SCHEDULER___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE___STOP = SCHEDULER___STOP;

	/**
	 * The number of operations of the '<em>Recurringschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE_OPERATION_COUNT = SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric <em>Type Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getTypeMetric()
	 * @generated
	 */
	int TYPE_METRIC = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation <em>Action Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionOperation()
	 * @generated
	 */
	int ACTION_OPERATION = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking <em>Metric Target Tracking</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMetricTargetTracking()
	 * @generated
	 */
	int METRIC_TARGET_TRACKING = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 29;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 30;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 31;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep <em>Recurrence Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurrence Step</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep
	 * @generated
	 */
	EClass getRecurrenceStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep#getUnit()
	 * @see #getRecurrenceStep()
	 * @generated
	 */
	EAttribute getRecurrenceStep_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep#getValue()
	 * @see #getRecurrenceStep()
	 * @generated
	 */
	EReference getRecurrenceStep_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Array#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Array#getValues()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep <em>Arrof Rec Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrof Rec Step</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep
	 * @generated
	 */
	EClass getArrofRecStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep#getArrofrecstepValues <em>Arrofrecstep Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrofrecstep Values</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep#getArrofrecstepValues()
	 * @see #getArrofRecStep()
	 * @generated
	 */
	EReference getArrofRecStep_ArrofrecstepValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup <em>Horizontalgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontalgroup</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup
	 * @generated
	 */
	EClass getHorizontalgroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupName <em>Horizontal Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Group Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupName()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalGroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupGroupSize <em>Horizontal Group Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Group Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupGroupSize()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalGroupGroupSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMaximum <em>Horizontal Group Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Group Maximum</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMaximum()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalGroupMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMinimum <em>Horizontal Group Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Group Minimum</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMinimum()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalGroupMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupTemplateName <em>Horizontal Group Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Group Template Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupTemplateName()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalGroupTemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupLoadBalancer <em>Horizontal Group Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Group Load Balancer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupLoadBalancer()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalGroupLoadBalancer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer <em>Loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadbalancer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer
	 * @generated
	 */
	EClass getLoadbalancer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#getLoadbalancerName <em>Loadbalancer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loadbalancer Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#getLoadbalancerName()
	 * @see #getLoadbalancer()
	 * @generated
	 */
	EAttribute getLoadbalancer_LoadbalancerName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#getLoadbalancerInstanceIP <em>Loadbalancer Instance IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loadbalancer Instance IP</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#getLoadbalancerInstanceIP()
	 * @see #getLoadbalancer()
	 * @generated
	 */
	EAttribute getLoadbalancer_LoadbalancerInstanceIP();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#getLoadbalancerAddress <em>Loadbalancer Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loadbalancer Address</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#getLoadbalancerAddress()
	 * @see #getLoadbalancer()
	 * @generated
	 */
	EAttribute getLoadbalancer_LoadbalancerAddress();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#addbackendserver() <em>Addbackendserver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Addbackendserver</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#addbackendserver()
	 * @generated
	 */
	EOperation getLoadbalancer__Addbackendserver();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#removebackendserver() <em>Removebackendserver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Removebackendserver</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer#removebackendserver()
	 * @generated
	 */
	EOperation getLoadbalancer__Removebackendserver();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller <em>Elasticitycontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elasticitycontroller</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller
	 * @generated
	 */
	EClass getElasticitycontroller();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerMinimumLimit <em>Elasticity Controller Minimum Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticity Controller Minimum Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerMinimumLimit()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticityControllerMinimumLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerMaximumLimit <em>Elasticity Controller Maximum Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticity Controller Maximum Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerMaximumLimit()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticityControllerMaximumLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerCoolDuration <em>Elasticity Controller Cool Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticity Controller Cool Duration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerCoolDuration()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticityControllerCoolDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerIterationWaitTime <em>Elasticity Controller Iteration Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticity Controller Iteration Wait Time</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticityControllerIterationWaitTime()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticityControllerIterationWaitTime();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#start()
	 * @generated
	 */
	EOperation getElasticitycontroller__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#stop()
	 * @generated
	 */
	EOperation getElasticitycontroller__Stop();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink <em>Instancegrouplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancegrouplink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink
	 * @generated
	 */
	EClass getInstancegrouplink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkloadbalancer <em>Linkloadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkloadbalancer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkloadbalancer
	 * @generated
	 */
	EClass getLinkloadbalancer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Grouplink <em>Grouplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouplink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Grouplink
	 * @generated
	 */
	EClass getGrouplink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualDesiredSize <em>Manual Desired Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Desired Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualDesiredSize()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_ManualDesiredSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic
	 * @generated
	 */
	EClass getDynamic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic <em>Simpledynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simpledynamic</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic
	 * @generated
	 */
	EClass getSimpledynamic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic <em>Stepdynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stepdynamic</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic
	 * @generated
	 */
	EClass getStepdynamic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment <em>Dynamicadjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamicadjustment</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment
	 * @generated
	 */
	EClass getDynamicadjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentMetric <em>Dynamic Adjustment Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Adjustment Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentMetric()
	 * @see #getDynamicadjustment()
	 * @generated
	 */
	EAttribute getDynamicadjustment_DynamicAdjustmentMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#isDynamicAdjustmentDisableScaleIn <em>Dynamic Adjustment Disable Scale In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Adjustment Disable Scale In</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#isDynamicAdjustmentDisableScaleIn()
	 * @see #getDynamicadjustment()
	 * @generated
	 */
	EAttribute getDynamicadjustment_DynamicAdjustmentDisableScaleIn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentTarget <em>Dynamic Adjustment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Adjustment Target</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentTarget()
	 * @see #getDynamicadjustment()
	 * @generated
	 */
	EAttribute getDynamicadjustment_DynamicAdjustmentTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleMetric <em>Rule Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleMetric()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleOperator <em>Rule Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Operator</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleOperator()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleThreshold <em>Rule Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Threshold</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleThreshold()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRulePeriod <em>Rule Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Period</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRulePeriod()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RulePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleConsecutive <em>Rule Consecutive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Consecutive</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleConsecutive()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleConsecutive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger <em>Actiontrigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actiontrigger</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger
	 * @generated
	 */
	EClass getActiontrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getAction()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActionType()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_ActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getAmount()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_Amount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicpolicy <em>Dynamicpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamicpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicpolicy
	 * @generated
	 */
	EClass getDynamicpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step#getStepLowerStepBound <em>Step Lower Step Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Lower Step Bound</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step#getStepLowerStepBound()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepLowerStepBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step#getStepUpperStepBound <em>Step Upper Step Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Upper Step Bound</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step#getStepUpperStepBound()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepUpperStepBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step#getStepSize()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink <em>Steplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steplink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink
	 * @generated
	 */
	EClass getSteplink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Computelink <em>Computelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computelink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Computelink
	 * @generated
	 */
	EClass getComputelink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation
	 * @generated
	 */
	EClass getCreation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation#getOcciComputeCreationDate <em>Occi Compute Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Creation Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation#getOcciComputeCreationDate()
	 * @see #getCreation()
	 * @generated
	 */
	EAttribute getCreation_OcciComputeCreationDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#start()
	 * @generated
	 */
	EOperation getScheduler__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#stop()
	 * @generated
	 */
	EOperation getScheduler__Stop();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule <em>Uniqueschedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniqueschedule</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule
	 * @generated
	 */
	EClass getUniqueschedule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleStartDate <em>Unique Schedule Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Schedule Start Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleStartDate()
	 * @see #getUniqueschedule()
	 * @generated
	 */
	EAttribute getUniqueschedule_UniqueScheduleStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleEndDate <em>Unique Schedule End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Schedule End Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleEndDate()
	 * @see #getUniqueschedule()
	 * @generated
	 */
	EAttribute getUniqueschedule_UniqueScheduleEndDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule <em>Recurringschedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurringschedule</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule
	 * @generated
	 */
	EClass getRecurringschedule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleRecurrence <em>Recurringschedule Recurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recurringschedule Recurrence</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleRecurrence()
	 * @see #getRecurringschedule()
	 * @generated
	 */
	EReference getRecurringschedule_RecurringscheduleRecurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleStartDate <em>Recurringschedule Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedule Start Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleStartDate()
	 * @see #getRecurringschedule()
	 * @generated
	 */
	EAttribute getRecurringschedule_RecurringscheduleStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleEndDate <em>Recurringschedule End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedule End Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleEndDate()
	 * @see #getRecurringschedule()
	 * @generated
	 */
	EAttribute getRecurringschedule_RecurringscheduleEndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getInterval()
	 * @see #getRecurringschedule()
	 * @generated
	 */
	EAttribute getRecurringschedule_Interval();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric <em>Type Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric
	 * @generated
	 */
	EEnum getTypeMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation <em>Action Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Operation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @generated
	 */
	EEnum getActionOperation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking <em>Metric Target Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Target Tracking</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking
	 * @generated
	 */
	EEnum getMetricTargetTracking();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit
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
	HorizontalelasticityFactory getHorizontalelasticityFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurrenceStepImpl <em>Recurrence Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurrenceStepImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRecurrenceStep()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getArray()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrofRecStepImpl <em>Arrof Rec Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrofRecStepImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getArrofRecStep()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl <em>Horizontalgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getHorizontalgroup()
		 * @generated
		 */
		EClass HORIZONTALGROUP = eINSTANCE.getHorizontalgroup();

		/**
		 * The meta object literal for the '<em><b>Horizontal Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTAL_GROUP_NAME = eINSTANCE.getHorizontalgroup_HorizontalGroupName();

		/**
		 * The meta object literal for the '<em><b>Horizontal Group Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE = eINSTANCE.getHorizontalgroup_HorizontalGroupGroupSize();

		/**
		 * The meta object literal for the '<em><b>Horizontal Group Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM = eINSTANCE.getHorizontalgroup_HorizontalGroupMaximum();

		/**
		 * The meta object literal for the '<em><b>Horizontal Group Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM = eINSTANCE.getHorizontalgroup_HorizontalGroupMinimum();

		/**
		 * The meta object literal for the '<em><b>Horizontal Group Template Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME = eINSTANCE.getHorizontalgroup_HorizontalGroupTemplateName();

		/**
		 * The meta object literal for the '<em><b>Horizontal Group Load Balancer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER = eINSTANCE.getHorizontalgroup_HorizontalGroupLoadBalancer();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl <em>Loadbalancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLoadbalancer()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl <em>Elasticitycontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getElasticitycontroller()
		 * @generated
		 */
		EClass ELASTICITYCONTROLLER = eINSTANCE.getElasticitycontroller();

		/**
		 * The meta object literal for the '<em><b>Elasticity Controller Minimum Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MINIMUM_LIMIT = eINSTANCE.getElasticitycontroller_ElasticityControllerMinimumLimit();

		/**
		 * The meta object literal for the '<em><b>Elasticity Controller Maximum Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT = eINSTANCE.getElasticitycontroller_ElasticityControllerMaximumLimit();

		/**
		 * The meta object literal for the '<em><b>Elasticity Controller Cool Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_COOL_DURATION = eINSTANCE.getElasticitycontroller_ElasticityControllerCoolDuration();

		/**
		 * The meta object literal for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = eINSTANCE.getElasticitycontroller_ElasticityControllerIterationWaitTime();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELASTICITYCONTROLLER___START = eINSTANCE.getElasticitycontroller__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELASTICITYCONTROLLER___STOP = eINSTANCE.getElasticitycontroller__Stop();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstancegrouplinkImpl <em>Instancegrouplink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstancegrouplinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getInstancegrouplink()
		 * @generated
		 */
		EClass INSTANCEGROUPLINK = eINSTANCE.getInstancegrouplink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkloadbalancerImpl <em>Linkloadbalancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkloadbalancerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLinkloadbalancer()
		 * @generated
		 */
		EClass LINKLOADBALANCER = eINSTANCE.getLinkloadbalancer();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.GrouplinkImpl <em>Grouplink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.GrouplinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getGrouplink()
		 * @generated
		 */
		EClass GROUPLINK = eINSTANCE.getGrouplink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '<em><b>Manual Desired Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__MANUAL_DESIRED_SIZE = eINSTANCE.getManual_ManualDesiredSize();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl <em>Dynamic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamic()
		 * @generated
		 */
		EClass DYNAMIC = eINSTANCE.getDynamic();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl <em>Simpledynamic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSimpledynamic()
		 * @generated
		 */
		EClass SIMPLEDYNAMIC = eINSTANCE.getSimpledynamic();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl <em>Stepdynamic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getStepdynamic()
		 * @generated
		 */
		EClass STEPDYNAMIC = eINSTANCE.getStepdynamic();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl <em>Dynamicadjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicadjustment()
		 * @generated
		 */
		EClass DYNAMICADJUSTMENT = eINSTANCE.getDynamicadjustment();

		/**
		 * The meta object literal for the '<em><b>Dynamic Adjustment Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC = eINSTANCE.getDynamicadjustment_DynamicAdjustmentMetric();

		/**
		 * The meta object literal for the '<em><b>Dynamic Adjustment Disable Scale In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN = eINSTANCE.getDynamicadjustment_DynamicAdjustmentDisableScaleIn();

		/**
		 * The meta object literal for the '<em><b>Dynamic Adjustment Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET = eINSTANCE.getDynamicadjustment_DynamicAdjustmentTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Rule Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE_METRIC = eINSTANCE.getRule_RuleMetric();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl <em>Actiontrigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActiontrigger()
		 * @generated
		 */
		EClass ACTIONTRIGGER = eINSTANCE.getActiontrigger();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONTRIGGER__ACTION = eINSTANCE.getActiontrigger_Action();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONTRIGGER__ACTION_TYPE = eINSTANCE.getActiontrigger_ActionType();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONTRIGGER__AMOUNT = eINSTANCE.getActiontrigger_Amount();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicpolicyImpl <em>Dynamicpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicpolicy()
		 * @generated
		 */
		EClass DYNAMICPOLICY = eINSTANCE.getDynamicpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getStep()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SteplinkImpl <em>Steplink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SteplinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSteplink()
		 * @generated
		 */
		EClass STEPLINK = eINSTANCE.getSteplink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ComputelinkImpl <em>Computelink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ComputelinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getComputelink()
		 * @generated
		 */
		EClass COMPUTELINK = eINSTANCE.getComputelink();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl <em>Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getCreation()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULER___START = eINSTANCE.getScheduler__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULER___STOP = eINSTANCE.getScheduler__Stop();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl <em>Uniqueschedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUniqueschedule()
		 * @generated
		 */
		EClass UNIQUESCHEDULE = eINSTANCE.getUniqueschedule();

		/**
		 * The meta object literal for the '<em><b>Unique Schedule Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE = eINSTANCE.getUniqueschedule_UniqueScheduleStartDate();

		/**
		 * The meta object literal for the '<em><b>Unique Schedule End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE = eINSTANCE.getUniqueschedule_UniqueScheduleEndDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl <em>Recurringschedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRecurringschedule()
		 * @generated
		 */
		EClass RECURRINGSCHEDULE = eINSTANCE.getRecurringschedule();

		/**
		 * The meta object literal for the '<em><b>Recurringschedule Recurrence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE = eINSTANCE.getRecurringschedule_RecurringscheduleRecurrence();

		/**
		 * The meta object literal for the '<em><b>Recurringschedule Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE = eINSTANCE.getRecurringschedule_RecurringscheduleStartDate();

		/**
		 * The meta object literal for the '<em><b>Recurringschedule End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE = eINSTANCE.getRecurringschedule_RecurringscheduleEndDate();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURRINGSCHEDULE__INTERVAL = eINSTANCE.getRecurringschedule_Interval();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric <em>Type Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getTypeMetric()
		 * @generated
		 */
		EEnum TYPE_METRIC = eINSTANCE.getTypeMetric();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation <em>Action Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionOperation()
		 * @generated
		 */
		EEnum ACTION_OPERATION = eINSTANCE.getActionOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking <em>Metric Target Tracking</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMetricTargetTracking()
		 * @generated
		 */
		EEnum METRIC_TARGET_TRACKING = eINSTANCE.getMetricTargetTracking();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //HorizontalelasticityPackage
