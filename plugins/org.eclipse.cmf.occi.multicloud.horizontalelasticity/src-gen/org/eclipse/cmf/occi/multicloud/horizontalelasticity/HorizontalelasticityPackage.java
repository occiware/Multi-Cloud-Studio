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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayofRecurrenceStepImpl <em>Arrayof Recurrence Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayofRecurrenceStepImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getArrayofRecurrenceStep()
	 * @generated
	 */
	int ARRAYOF_RECURRENCE_STEP = 2;

	/**
	 * The feature id for the '<em><b>Arrayofrecurrencestep Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Arrayof Recurrence Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYOF_RECURRENCE_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arrayof Recurrence Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYOF_RECURRENCE_STEP_OPERATION_COUNT = 0;

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
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___CREATE = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontalgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontrollerImpl <em>Horizontalelasticcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontrollerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getHorizontalelasticcontroller()
	 * @generated
	 */
	int HORIZONTALELASTICCONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The number of structural features of the '<em>Horizontalelasticcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Horizontalelasticcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTROLLER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkbalancerImpl <em>Linkbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkbalancerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLinkbalancer()
	 * @generated
	 */
	int LINKBALANCER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Linkbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linkbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKBALANCER_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

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
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

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
	int MANUAL__ID = HORIZONTALELASTICCONTROLLER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__TITLE = HORIZONTALELASTICCONTROLLER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__KIND = HORIZONTALELASTICCONTROLLER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__LOCATION = HORIZONTALELASTICCONTROLLER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ATTRIBUTES = HORIZONTALELASTICCONTROLLER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MIXINS = HORIZONTALELASTICCONTROLLER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__PARTS = HORIZONTALELASTICCONTROLLER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__SUMMARY = HORIZONTALELASTICCONTROLLER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__LINKS = HORIZONTALELASTICCONTROLLER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__RLINKS = HORIZONTALELASTICCONTROLLER__RLINKS;

	/**
	 * The feature id for the '<em><b>Manual Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MANUAL_GROUP_SIZE = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manual Max Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MANUAL_MAX_GROUP_SIZE = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manual Min Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MANUAL_MIN_GROUP_SIZE = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_CREATE = HORIZONTALELASTICCONTROLLER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_RETRIEVE = HORIZONTALELASTICCONTROLLER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_UPDATE = HORIZONTALELASTICCONTROLLER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_DELETE = HORIZONTALELASTICCONTROLLER___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___START = HORIZONTALELASTICCONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___STOP = HORIZONTALELASTICCONTROLLER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = HORIZONTALELASTICCONTROLLER_OPERATION_COUNT + 2;

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
	int DYNAMIC__ID = HORIZONTALELASTICCONTROLLER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__TITLE = HORIZONTALELASTICCONTROLLER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__KIND = HORIZONTALELASTICCONTROLLER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LOCATION = HORIZONTALELASTICCONTROLLER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ATTRIBUTES = HORIZONTALELASTICCONTROLLER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__MIXINS = HORIZONTALELASTICCONTROLLER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__PARTS = HORIZONTALELASTICCONTROLLER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__SUMMARY = HORIZONTALELASTICCONTROLLER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LINKS = HORIZONTALELASTICCONTROLLER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__RLINKS = HORIZONTALELASTICCONTROLLER__RLINKS;

	/**
	 * The feature id for the '<em><b>Dynamic Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__DYNAMIC_GROUP_SIZE = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Max Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__DYNAMIC_MAX_GROUP_SIZE = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamic Min Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__DYNAMIC_MIN_GROUP_SIZE = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FEATURE_COUNT = HORIZONTALELASTICCONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_CREATE = HORIZONTALELASTICCONTROLLER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_RETRIEVE = HORIZONTALELASTICCONTROLLER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_UPDATE = HORIZONTALELASTICCONTROLLER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_DELETE = HORIZONTALELASTICCONTROLLER___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___START = HORIZONTALELASTICCONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___STOP = HORIZONTALELASTICCONTROLLER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OPERATION_COUNT = HORIZONTALELASTICCONTROLLER_OPERATION_COUNT + 2;

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
	int SIMPLEDYNAMIC__ID = DYNAMIC__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__TITLE = DYNAMIC__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__KIND = DYNAMIC__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__LOCATION = DYNAMIC__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__ATTRIBUTES = DYNAMIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__MIXINS = DYNAMIC__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__PARTS = DYNAMIC__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__SUMMARY = DYNAMIC__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__LINKS = DYNAMIC__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__RLINKS = DYNAMIC__RLINKS;

	/**
	 * The feature id for the '<em><b>Dynamic Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__DYNAMIC_GROUP_SIZE = DYNAMIC__DYNAMIC_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Dynamic Max Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__DYNAMIC_MAX_GROUP_SIZE = DYNAMIC__DYNAMIC_MAX_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Dynamic Min Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__DYNAMIC_MIN_GROUP_SIZE = DYNAMIC__DYNAMIC_MIN_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Simple Dynamic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME = DYNAMIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Dynamic Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION = DYNAMIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simpledynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC_FEATURE_COUNT = DYNAMIC_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_CREATE = DYNAMIC___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_RETRIEVE = DYNAMIC___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_UPDATE = DYNAMIC___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___OCCI_DELETE = DYNAMIC___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___START = DYNAMIC___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC___STOP = DYNAMIC___STOP;

	/**
	 * The number of operations of the '<em>Simpledynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEDYNAMIC_OPERATION_COUNT = DYNAMIC_OPERATION_COUNT + 0;

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
	int STEPDYNAMIC__ID = DYNAMIC__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__TITLE = DYNAMIC__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__KIND = DYNAMIC__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__LOCATION = DYNAMIC__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__ATTRIBUTES = DYNAMIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__MIXINS = DYNAMIC__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__PARTS = DYNAMIC__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__SUMMARY = DYNAMIC__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__LINKS = DYNAMIC__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__RLINKS = DYNAMIC__RLINKS;

	/**
	 * The feature id for the '<em><b>Dynamic Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__DYNAMIC_GROUP_SIZE = DYNAMIC__DYNAMIC_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Dynamic Max Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__DYNAMIC_MAX_GROUP_SIZE = DYNAMIC__DYNAMIC_MAX_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Dynamic Min Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__DYNAMIC_MIN_GROUP_SIZE = DYNAMIC__DYNAMIC_MIN_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Step Dynamic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__STEP_DYNAMIC_NAME = DYNAMIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Dynamic Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION = DYNAMIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stepdynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC_FEATURE_COUNT = DYNAMIC_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_CREATE = DYNAMIC___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_RETRIEVE = DYNAMIC___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_UPDATE = DYNAMIC___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___OCCI_DELETE = DYNAMIC___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___START = DYNAMIC___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC___STOP = DYNAMIC___STOP;

	/**
	 * The number of operations of the '<em>Stepdynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPDYNAMIC_OPERATION_COUNT = DYNAMIC_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Dynamic Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_GROUP_SIZE = DYNAMIC__DYNAMIC_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Dynamic Max Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_MAX_GROUP_SIZE = DYNAMIC__DYNAMIC_MAX_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Dynamic Min Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_MIN_GROUP_SIZE = DYNAMIC__DYNAMIC_MIN_GROUP_SIZE;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME = DYNAMIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC = DYNAMIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION = DYNAMIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Disable Scale In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN = DYNAMIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dynamic Adjustment Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET = DYNAMIC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dynamicadjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICADJUSTMENT_FEATURE_COUNT = DYNAMIC_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl <em>Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getCreation()
	 * @generated
	 */
	int CREATION = 14;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepsImpl <em>Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepsImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 15;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Steps Lower Step Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__STEPS_LOWER_STEP_BOUND = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps Upper Step Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__STEPS_UPPER_STEP_BOUND = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 16;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_METRIC = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_OPERATOR = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_THRESHOLD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rule Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PERIOD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rule Consecutive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_CONSECUTIVE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActionImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 17;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Action Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_ACTION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_ACTION_TYPE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_AMOUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 18;

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
	 * The feature id for the '<em><b>Scheduler Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULER_START_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduler End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULER_END_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl <em>Uniqueschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUniqueschedule()
	 * @generated
	 */
	int UNIQUESCHEDULE = 19;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Scheduler Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__SCHEDULER_START_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduler End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE__SCHEDULER_END_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uniqueschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uniqueschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUESCHEDULE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl <em>Recurringschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getRecurringschedule()
	 * @generated
	 */
	int RECURRINGSCHEDULE = 20;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Scheduler Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__SCHEDULER_START_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduler End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__SCHEDULER_END_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recurringschedule Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Recurringschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recurringschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURRINGSCHEDULE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric <em>Type Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getTypeMetric()
	 * @generated
	 */
	int TYPE_METRIC = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation <em>Action Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionOperation()
	 * @generated
	 */
	int ACTION_OPERATION = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking <em>Metric Target Tracking</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getMetricTargetTracking()
	 * @generated
	 */
	int METRIC_TARGET_TRACKING = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 26;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 27;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 28;


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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrayofRecurrenceStep <em>Arrayof Recurrence Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrayof Recurrence Step</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrayofRecurrenceStep
	 * @generated
	 */
	EClass getArrayofRecurrenceStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrayofRecurrenceStep#getArrayofrecurrencestepValues <em>Arrayofrecurrencestep Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrayofrecurrencestep Values</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrayofRecurrenceStep#getArrayofrecurrencestepValues()
	 * @see #getArrayofRecurrenceStep()
	 * @generated
	 */
	EReference getArrayofRecurrenceStep_ArrayofrecurrencestepValues();

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#create()
	 * @generated
	 */
	EOperation getHorizontalgroup__Create();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalelasticcontroller <em>Horizontalelasticcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontalelasticcontroller</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalelasticcontroller
	 * @generated
	 */
	EClass getHorizontalelasticcontroller();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkbalancer <em>Linkbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkbalancer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkbalancer
	 * @generated
	 */
	EClass getLinkbalancer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkbalancer#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkbalancer#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLinkbalancer__TargetConstraint__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Grouplink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Grouplink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGrouplink__TargetConstraint__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualGroupSize <em>Manual Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualGroupSize()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_ManualGroupSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualMaxGroupSize <em>Manual Max Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Max Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualMaxGroupSize()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_ManualMaxGroupSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualMinGroupSize <em>Manual Min Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Min Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualMinGroupSize()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_ManualMinGroupSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#start()
	 * @generated
	 */
	EOperation getManual__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#stop()
	 * @generated
	 */
	EOperation getManual__Stop();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicGroupSize <em>Dynamic Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicGroupSize()
	 * @see #getDynamic()
	 * @generated
	 */
	EAttribute getDynamic_DynamicGroupSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMaxGroupSize <em>Dynamic Max Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Max Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMaxGroupSize()
	 * @see #getDynamic()
	 * @generated
	 */
	EAttribute getDynamic_DynamicMaxGroupSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMinGroupSize <em>Dynamic Min Group Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Min Group Size</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMinGroupSize()
	 * @see #getDynamic()
	 * @generated
	 */
	EAttribute getDynamic_DynamicMinGroupSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#start()
	 * @generated
	 */
	EOperation getDynamic__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#stop()
	 * @generated
	 */
	EOperation getDynamic__Stop();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicName <em>Simple Dynamic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Dynamic Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicName()
	 * @see #getSimpledynamic()
	 * @generated
	 */
	EAttribute getSimpledynamic_SimpleDynamicName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicCoolDuration <em>Simple Dynamic Cool Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Dynamic Cool Duration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicCoolDuration()
	 * @see #getSimpledynamic()
	 * @generated
	 */
	EAttribute getSimpledynamic_SimpleDynamicCoolDuration();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicName <em>Step Dynamic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Dynamic Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicName()
	 * @see #getStepdynamic()
	 * @generated
	 */
	EAttribute getStepdynamic_StepDynamicName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicCoolDuration <em>Step Dynamic Cool Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Dynamic Cool Duration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicCoolDuration()
	 * @see #getStepdynamic()
	 * @generated
	 */
	EAttribute getStepdynamic_StepDynamicCoolDuration();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentName <em>Dynamic Adjustment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Adjustment Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentName()
	 * @see #getDynamicadjustment()
	 * @generated
	 */
	EAttribute getDynamicadjustment_DynamicAdjustmentName();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentCoolDuration <em>Dynamic Adjustment Cool Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Adjustment Cool Duration</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentCoolDuration()
	 * @see #getDynamicadjustment()
	 * @generated
	 */
	EAttribute getDynamicadjustment_DynamicAdjustmentCoolDuration();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steps</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps
	 * @generated
	 */
	EClass getSteps();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps#getStepsLowerStepBound <em>Steps Lower Step Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steps Lower Step Bound</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps#getStepsLowerStepBound()
	 * @see #getSteps()
	 * @generated
	 */
	EAttribute getSteps_StepsLowerStepBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps#getStepsUpperStepBound <em>Steps Upper Step Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steps Upper Step Bound</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps#getStepsUpperStepBound()
	 * @see #getSteps()
	 * @generated
	 */
	EAttribute getSteps_StepsUpperStepBound();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSteps__AppliesConstraint__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#getRuleName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleName();

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRule__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionAction <em>Action Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Action</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionAction()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionActionType <em>Action Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Action Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionActionType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionAmount <em>Action Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Amount</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionAmount()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionAmount();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAction__AppliesConstraint__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerStartDate <em>Scheduler Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler Start Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerStartDate()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_SchedulerStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerEndDate <em>Scheduler End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler End Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerEndDate()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_SchedulerEndDate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getScheduler__AppliesConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayofRecurrenceStepImpl <em>Arrayof Recurrence Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayofRecurrenceStepImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getArrayofRecurrenceStep()
		 * @generated
		 */
		EClass ARRAYOF_RECURRENCE_STEP = eINSTANCE.getArrayofRecurrenceStep();

		/**
		 * The meta object literal for the '<em><b>Arrayofrecurrencestep Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES = eINSTANCE.getArrayofRecurrenceStep_ArrayofrecurrencestepValues();

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
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HORIZONTALGROUP___CREATE = eINSTANCE.getHorizontalgroup__Create();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontrollerImpl <em>Horizontalelasticcontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontrollerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getHorizontalelasticcontroller()
		 * @generated
		 */
		EClass HORIZONTALELASTICCONTROLLER = eINSTANCE.getHorizontalelasticcontroller();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkbalancerImpl <em>Linkbalancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LinkbalancerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLinkbalancer()
		 * @generated
		 */
		EClass LINKBALANCER = eINSTANCE.getLinkbalancer();

		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINKBALANCER___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLinkbalancer__TargetConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GROUPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGrouplink__TargetConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Manual Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__MANUAL_GROUP_SIZE = eINSTANCE.getManual_ManualGroupSize();

		/**
		 * The meta object literal for the '<em><b>Manual Max Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__MANUAL_MAX_GROUP_SIZE = eINSTANCE.getManual_ManualMaxGroupSize();

		/**
		 * The meta object literal for the '<em><b>Manual Min Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__MANUAL_MIN_GROUP_SIZE = eINSTANCE.getManual_ManualMinGroupSize();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANUAL___START = eINSTANCE.getManual__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANUAL___STOP = eINSTANCE.getManual__Stop();

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
		 * The meta object literal for the '<em><b>Dynamic Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC__DYNAMIC_GROUP_SIZE = eINSTANCE.getDynamic_DynamicGroupSize();

		/**
		 * The meta object literal for the '<em><b>Dynamic Max Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC__DYNAMIC_MAX_GROUP_SIZE = eINSTANCE.getDynamic_DynamicMaxGroupSize();

		/**
		 * The meta object literal for the '<em><b>Dynamic Min Group Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC__DYNAMIC_MIN_GROUP_SIZE = eINSTANCE.getDynamic_DynamicMinGroupSize();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DYNAMIC___START = eINSTANCE.getDynamic__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DYNAMIC___STOP = eINSTANCE.getDynamic__Stop();

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
		 * The meta object literal for the '<em><b>Simple Dynamic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME = eINSTANCE.getSimpledynamic_SimpleDynamicName();

		/**
		 * The meta object literal for the '<em><b>Simple Dynamic Cool Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION = eINSTANCE.getSimpledynamic_SimpleDynamicCoolDuration();

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
		 * The meta object literal for the '<em><b>Step Dynamic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPDYNAMIC__STEP_DYNAMIC_NAME = eINSTANCE.getStepdynamic_StepDynamicName();

		/**
		 * The meta object literal for the '<em><b>Step Dynamic Cool Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION = eINSTANCE.getStepdynamic_StepDynamicCoolDuration();

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
		 * The meta object literal for the '<em><b>Dynamic Adjustment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME = eINSTANCE.getDynamicadjustment_DynamicAdjustmentName();

		/**
		 * The meta object literal for the '<em><b>Dynamic Adjustment Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC = eINSTANCE.getDynamicadjustment_DynamicAdjustmentMetric();

		/**
		 * The meta object literal for the '<em><b>Dynamic Adjustment Cool Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION = eINSTANCE.getDynamicadjustment_DynamicAdjustmentCoolDuration();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepsImpl <em>Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepsImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getSteps()
		 * @generated
		 */
		EClass STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em><b>Steps Lower Step Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPS__STEPS_LOWER_STEP_BOUND = eINSTANCE.getSteps_StepsLowerStepBound();

		/**
		 * The meta object literal for the '<em><b>Steps Upper Step Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEPS__STEPS_UPPER_STEP_BOUND = eINSTANCE.getSteps_StepsUpperStepBound();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STEPS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSteps__AppliesConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE_NAME = eINSTANCE.getRule_RuleName();

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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRule__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActionImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_ACTION = eINSTANCE.getAction_ActionAction();

		/**
		 * The meta object literal for the '<em><b>Action Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_ACTION_TYPE = eINSTANCE.getAction_ActionActionType();

		/**
		 * The meta object literal for the '<em><b>Action Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_AMOUNT = eINSTANCE.getAction_ActionAmount();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAction__AppliesConstraint__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Scheduler Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__SCHEDULER_START_DATE = eINSTANCE.getScheduler_SchedulerStartDate();

		/**
		 * The meta object literal for the '<em><b>Scheduler End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__SCHEDULER_END_DATE = eINSTANCE.getScheduler_SchedulerEndDate();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getScheduler__AppliesConstraint__DiagnosticChain_Map();

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
