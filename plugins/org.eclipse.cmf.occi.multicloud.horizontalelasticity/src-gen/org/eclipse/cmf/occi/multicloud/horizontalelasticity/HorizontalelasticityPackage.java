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
	 * The feature id for the '<em><b>Elasticitycontroller Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

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
	 * The number of operations of the '<em>Elasticitycontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICITYCONTROLLER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instancegrouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEGROUPLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerlinkImpl <em>Loadbalancerlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerlinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLoadbalancerlink()
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
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loadbalancerlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCERLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticlinkImpl <em>Elasticlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticlinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getElasticlink()
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
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elasticlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRule()
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
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl <em>Actiontrigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActiontrigger()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getStep()
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SteplinkImpl <em>Steplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SteplinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSteplink()
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
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Steplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl <em>Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getCreation()
	 * @generated
	 */
	int CREATION = 13;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulingpolicyImpl <em>Schedulingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSchedulingpolicy()
	 * @generated
	 */
	int SCHEDULINGPOLICY = 14;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULINGPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniqueschedulingpolicyImpl <em>Uniqueschedulingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniqueschedulingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUniqueschedulingpolicy()
	 * @generated
	 */
	int UNIQUESCHEDULINGPOLICY = 15;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = SCHEDULINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Uniqueschedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULINGPOLICY_OPERATION_COUNT = SCHEDULINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl <em>Recurringschedulingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRecurringschedulingpolicy()
	 * @generated
	 */
	int RECURRINGSCHEDULINGPOLICY = 16;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = SCHEDULINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Recurringschedulingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULINGPOLICY_OPERATION_COUNT = SCHEDULINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingpolicyImpl <em>Scalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getScalingpolicy()
	 * @generated
	 */
	int SCALINGPOLICY = 17;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGPOLICY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicscalingpolicyImpl <em>Dynamicscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicscalingpolicy()
	 * @generated
	 */
	int DYNAMICSCALINGPOLICY = 18;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = SCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Dynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICSCALINGPOLICY_OPERATION_COUNT = SCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentscalingpolicyImpl <em>Dynamicadjustmentscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY = 19;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = DYNAMICSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Dynamicadjustmentscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENTSCALINGPOLICY_OPERATION_COUNT = DYNAMICSCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicscalingpolicyImpl <em>Simpledynamicscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSimpledynamicscalingpolicy()
	 * @generated
	 */
	int SIMPLEDYNAMICSCALINGPOLICY = 20;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = DYNAMICSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Simpledynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMICSCALINGPOLICY_OPERATION_COUNT = DYNAMICSCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicscalingpolicyImpl <em>Stepdynamicscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getStepdynamicscalingpolicy()
	 * @generated
	 */
	int STEPDYNAMICSCALINGPOLICY = 21;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = DYNAMICSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stepdynamicscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMICSCALINGPOLICY_OPERATION_COUNT = DYNAMICSCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualscalingpolicyImpl <em>Manualscalingpolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualscalingpolicyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getManualscalingpolicy()
	 * @generated
	 */
	int MANUALSCALINGPOLICY = 22;

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
	 * The number of structural features of the '<em>Manualscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY_FEATURE_COUNT = SCALINGPOLICY_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = SCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Manualscalingpolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUALSCALINGPOLICY_OPERATION_COUNT = SCALINGPOLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MetricImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 23;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CpuutilisationImpl <em>Cpuutilisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CpuutilisationImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getCpuutilisation()
	 * @generated
	 */
	int CPUUTILISATION = 24;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = METRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Cpuutilisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPUUTILISATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MemoryutilisationImpl <em>Memoryutilisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MemoryutilisationImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMemoryutilisation()
	 * @generated
	 */
	int MEMORYUTILISATION = 25;

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
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = METRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Memoryutilisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORYUTILISATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric <em>Type Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getTypeMetric()
	 * @generated
	 */
	int TYPE_METRIC = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation <em>Action Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionOperation()
	 * @generated
	 */
	int ACTION_OPERATION = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking <em>Metric Target Tracking</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMetricTargetTracking()
	 * @generated
	 */
	int METRIC_TARGET_TRACKING = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 31;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 32;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 33;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupName <em>Horizontalgroup Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupName()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupGroupSize <em>Horizontalgroup Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupGroupSize()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupGroupSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupMaximum <em>Horizontalgroup Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Maximum</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupMaximum()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupMinimum <em>Horizontalgroup Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Minimum</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupMinimum()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupTemplateName <em>Horizontalgroup Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Template Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupTemplateName()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupTemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupLoadBalancer <em>Horizontalgroup Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontalgroup Load Balancer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalgroupLoadBalancer()
	 * @see #getHorizontalgroup()
	 * @generated
	 */
	EAttribute getHorizontalgroup_HorizontalgroupLoadBalancer();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticitycontrollerMinimumLimit <em>Elasticitycontroller Minimum Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticitycontroller Minimum Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticitycontrollerMinimumLimit()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticitycontrollerMinimumLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticitycontrollerMaximumLimit <em>Elasticitycontroller Maximum Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticitycontroller Maximum Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticitycontrollerMaximumLimit()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticitycontrollerMaximumLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticitycontrollerCoolDuration <em>Elasticitycontroller Cool Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elasticitycontroller Cool Duration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller#getElasticitycontrollerCoolDuration()
	 * @see #getElasticitycontroller()
	 * @generated
	 */
	EAttribute getElasticitycontroller_ElasticitycontrollerCoolDuration();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink <em>Instancegrouplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancegrouplink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink
	 * @generated
	 */
	EClass getInstancegrouplink();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInstancegrouplink__TargetConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancerlink <em>Loadbalancerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadbalancerlink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancerlink
	 * @generated
	 */
	EClass getLoadbalancerlink();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancerlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancerlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLoadbalancerlink__TargetConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticlink <em>Elasticlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elasticlink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticlink
	 * @generated
	 */
	EClass getElasticlink();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElasticlink__TargetConstraint__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRule__TargetConstraint__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAction <em>Actiontrigger Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actiontrigger Action</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAction()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_ActiontriggerAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerActionType <em>Actiontrigger Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actiontrigger Action Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerActionType()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_ActiontriggerActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAmount <em>Actiontrigger Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actiontrigger Amount</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAmount()
	 * @see #getActiontrigger()
	 * @generated
	 */
	EAttribute getActiontrigger_ActiontriggerAmount();

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSteplink__TargetConstraint__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCreation__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy <em>Schedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedulingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy
	 * @generated
	 */
	EClass getSchedulingpolicy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy#start()
	 * @generated
	 */
	EOperation getSchedulingpolicy__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy#stop()
	 * @generated
	 */
	EOperation getSchedulingpolicy__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Schedulingpolicy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSchedulingpolicy__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy <em>Uniqueschedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniqueschedulingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy
	 * @generated
	 */
	EClass getUniqueschedulingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy#getUniqueschedulingpolicyStartDate <em>Uniqueschedulingpolicy Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueschedulingpolicy Start Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy#getUniqueschedulingpolicyStartDate()
	 * @see #getUniqueschedulingpolicy()
	 * @generated
	 */
	EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy#getUniqueschedulingpolicyEndDate <em>Uniqueschedulingpolicy End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueschedulingpolicy End Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy#getUniqueschedulingpolicyEndDate()
	 * @see #getUniqueschedulingpolicy()
	 * @generated
	 */
	EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy <em>Recurringschedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurringschedulingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy
	 * @generated
	 */
	EClass getRecurringschedulingpolicy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyRecurrence <em>Recurringschedulingpolicy Recurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recurringschedulingpolicy Recurrence</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyRecurrence()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EReference getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyStartDate <em>Recurringschedulingpolicy Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedulingpolicy Start Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyStartDate()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyEndDate <em>Recurringschedulingpolicy End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedulingpolicy End Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyEndDate()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyInterval <em>Recurringschedulingpolicy Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurringschedulingpolicy Interval</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy#getRecurringschedulingpolicyInterval()
	 * @see #getRecurringschedulingpolicy()
	 * @generated
	 */
	EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyInterval();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy <em>Scalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy
	 * @generated
	 */
	EClass getScalingpolicy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy#start()
	 * @generated
	 */
	EOperation getScalingpolicy__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy#stop()
	 * @generated
	 */
	EOperation getScalingpolicy__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingpolicy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getScalingpolicy__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy <em>Dynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamicscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy
	 * @generated
	 */
	EClass getDynamicscalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyCoolDuration <em>Dynamicscalingpolicy Cool Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicscalingpolicy Cool Duration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyCoolDuration()
	 * @see #getDynamicscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyIterationWaitTime <em>Dynamicscalingpolicy Iteration Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicscalingpolicy Iteration Wait Time</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyIterationWaitTime()
	 * @see #getDynamicscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy <em>Dynamicadjustmentscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy
	 * @generated
	 */
	EClass getDynamicadjustmentscalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyMetric <em>Dynamicadjustmentscalingpolicy Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicadjustmentscalingpolicy Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyMetric()
	 * @see #getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy#isDynamicadjustmentscalingpolicyDisableScaleIn <em>Dynamicadjustmentscalingpolicy Disable Scale In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicadjustmentscalingpolicy Disable Scale In</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy#isDynamicadjustmentscalingpolicyDisableScaleIn()
	 * @see #getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyTarget <em>Dynamicadjustmentscalingpolicy Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamicadjustmentscalingpolicy Target</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyTarget()
	 * @see #getDynamicadjustmentscalingpolicy()
	 * @generated
	 */
	EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamicscalingpolicy <em>Simpledynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simpledynamicscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamicscalingpolicy
	 * @generated
	 */
	EClass getSimpledynamicscalingpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamicscalingpolicy <em>Stepdynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stepdynamicscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamicscalingpolicy
	 * @generated
	 */
	EClass getStepdynamicscalingpolicy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manualscalingpolicy <em>Manualscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manualscalingpolicy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manualscalingpolicy
	 * @generated
	 */
	EClass getManualscalingpolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manualscalingpolicy#getManualscalingpolicyDesiredSize <em>Manualscalingpolicy Desired Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manualscalingpolicy Desired Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manualscalingpolicy#getManualscalingpolicyDesiredSize()
	 * @see #getManualscalingpolicy()
	 * @generated
	 */
	EAttribute getManualscalingpolicy_ManualscalingpolicyDesiredSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Metric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Metric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMetric__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Cpuutilisation <em>Cpuutilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpuutilisation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Cpuutilisation
	 * @generated
	 */
	EClass getCpuutilisation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Memoryutilisation <em>Memoryutilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memoryutilisation</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Memoryutilisation
	 * @generated
	 */
	EClass getMemoryutilisation();

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
		 * The meta object literal for the '<em><b>Elasticitycontroller Cool Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION = eINSTANCE.getElasticitycontroller_ElasticitycontrollerCoolDuration();

		/**
		 * The meta object literal for the '<em><b>Elasticity Controller Iteration Wait Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME = eINSTANCE.getElasticitycontroller_ElasticityControllerIterationWaitTime();

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
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSTANCEGROUPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInstancegrouplink__TargetConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerlinkImpl <em>Loadbalancerlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerlinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLoadbalancerlink()
		 * @generated
		 */
		EClass LOADBALANCERLINK = eINSTANCE.getLoadbalancerlink();

		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOADBALANCERLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLoadbalancerlink__TargetConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticlinkImpl <em>Elasticlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticlinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getElasticlink()
		 * @generated
		 */
		EClass ELASTICLINK = eINSTANCE.getElasticlink();

		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELASTICLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getElasticlink__TargetConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRule__TargetConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STEPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSteplink__TargetConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCreation__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulingpolicyImpl <em>Schedulingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSchedulingpolicy()
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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSchedulingpolicy__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniqueschedulingpolicyImpl <em>Uniqueschedulingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniqueschedulingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUniqueschedulingpolicy()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl <em>Recurringschedulingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRecurringschedulingpolicy()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingpolicyImpl <em>Scalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getScalingpolicy()
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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCALINGPOLICY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getScalingpolicy__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicscalingpolicyImpl <em>Dynamicscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicscalingpolicy()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentscalingpolicyImpl <em>Dynamicadjustmentscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamicadjustmentscalingpolicy()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicscalingpolicyImpl <em>Simpledynamicscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSimpledynamicscalingpolicy()
		 * @generated
		 */
		EClass SIMPLEDYNAMICSCALINGPOLICY = eINSTANCE.getSimpledynamicscalingpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicscalingpolicyImpl <em>Stepdynamicscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getStepdynamicscalingpolicy()
		 * @generated
		 */
		EClass STEPDYNAMICSCALINGPOLICY = eINSTANCE.getStepdynamicscalingpolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualscalingpolicyImpl <em>Manualscalingpolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualscalingpolicyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getManualscalingpolicy()
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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MetricImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMetric()
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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMetric__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CpuutilisationImpl <em>Cpuutilisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CpuutilisationImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getCpuutilisation()
		 * @generated
		 */
		EClass CPUUTILISATION = eINSTANCE.getCpuutilisation();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MemoryutilisationImpl <em>Memoryutilisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.MemoryutilisationImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMemoryutilisation()
		 * @generated
		 */
		EClass MEMORYUTILISATION = eINSTANCE.getMemoryutilisation();

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
