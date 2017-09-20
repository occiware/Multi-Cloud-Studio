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

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl <em>Horizontalgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getHorizontalgroup()
	 * @generated
	 */
	int HORIZONTALGROUP = 0;

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
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___DELETE = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___EDIT = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP___CREATE = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Horizontalgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALGROUP_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl <em>Loadbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getLoadbalancer()
	 * @generated
	 */
	int LOADBALANCER = 1;

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
	 * The number of structural features of the '<em>Loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

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
	 * The number of operations of the '<em>Loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstanceImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontollerImpl <em>Horizontalelasticcontoller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontollerImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getHorizontalelasticcontoller()
	 * @generated
	 */
	int HORIZONTALELASTICCONTOLLER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The number of structural features of the '<em>Horizontalelasticcontoller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Horizontalelasticcontoller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTALELASTICCONTOLLER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingstrategyImpl <em>Scalingstrategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingstrategyImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getScalingstrategy()
	 * @generated
	 */
	int SCALINGSTRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__ID = HORIZONTALELASTICCONTOLLER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__TITLE = HORIZONTALELASTICCONTOLLER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__KIND = HORIZONTALELASTICCONTOLLER__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__LOCATION = HORIZONTALELASTICCONTOLLER__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__ATTRIBUTES = HORIZONTALELASTICCONTOLLER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__MIXINS = HORIZONTALELASTICCONTOLLER__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__PARTS = HORIZONTALELASTICCONTOLLER__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__SUMMARY = HORIZONTALELASTICCONTOLLER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__LINKS = HORIZONTALELASTICCONTOLLER__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY__RLINKS = HORIZONTALELASTICCONTOLLER__RLINKS;

	/**
	 * The number of structural features of the '<em>Scalingstrategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY_FEATURE_COUNT = HORIZONTALELASTICCONTOLLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY___OCCI_CREATE = HORIZONTALELASTICCONTOLLER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY___OCCI_RETRIEVE = HORIZONTALELASTICCONTOLLER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY___OCCI_UPDATE = HORIZONTALELASTICCONTOLLER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY___OCCI_DELETE = HORIZONTALELASTICCONTOLLER___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Scalingstrategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALINGSTRATEGY_OPERATION_COUNT = HORIZONTALELASTICCONTOLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ID = SCALINGSTRATEGY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__TITLE = SCALINGSTRATEGY__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__KIND = SCALINGSTRATEGY__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__LOCATION = SCALINGSTRATEGY__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ATTRIBUTES = SCALINGSTRATEGY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MIXINS = SCALINGSTRATEGY__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__PARTS = SCALINGSTRATEGY__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__SUMMARY = SCALINGSTRATEGY__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__LINKS = SCALINGSTRATEGY__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__RLINKS = SCALINGSTRATEGY__RLINKS;

	/**
	 * The feature id for the '<em><b>Manual Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__MANUAL_GROUP_SIZE = SCALINGSTRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = SCALINGSTRATEGY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_CREATE = SCALINGSTRATEGY___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_RETRIEVE = SCALINGSTRATEGY___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_UPDATE = SCALINGSTRATEGY___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___OCCI_DELETE = SCALINGSTRATEGY___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL___START = SCALINGSTRATEGY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = SCALINGSTRATEGY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl <em>Dynamic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getDynamic()
	 * @generated
	 */
	int DYNAMIC = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ID = SCALINGSTRATEGY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__TITLE = SCALINGSTRATEGY__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__KIND = SCALINGSTRATEGY__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LOCATION = SCALINGSTRATEGY__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__ATTRIBUTES = SCALINGSTRATEGY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__MIXINS = SCALINGSTRATEGY__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__PARTS = SCALINGSTRATEGY__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__SUMMARY = SCALINGSTRATEGY__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__LINKS = SCALINGSTRATEGY__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC__RLINKS = SCALINGSTRATEGY__RLINKS;

	/**
	 * The number of structural features of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FEATURE_COUNT = SCALINGSTRATEGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_CREATE = SCALINGSTRATEGY___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_RETRIEVE = SCALINGSTRATEGY___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_UPDATE = SCALINGSTRATEGY___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC___OCCI_DELETE = SCALINGSTRATEGY___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_OPERATION_COUNT = SCALINGSTRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstancegrouplinkImpl <em>Instancegrouplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstancegrouplinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getInstancegrouplink()
	 * @generated
	 */
	int INSTANCEGROUPLINK = 7;

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
	int LINKBALANCER = 8;

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#delete()
	 * @generated
	 */
	EOperation getHorizontalgroup__Delete();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#edit() <em>Edit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#edit()
	 * @generated
	 */
	EOperation getHorizontalgroup__Edit();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalelasticcontoller <em>Horizontalelasticcontoller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontalelasticcontoller</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalelasticcontoller
	 * @generated
	 */
	EClass getHorizontalelasticcontoller();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingstrategy <em>Scalingstrategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalingstrategy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingstrategy
	 * @generated
	 */
	EClass getScalingstrategy();

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
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#start()
	 * @generated
	 */
	EOperation getManual__Start();

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
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HORIZONTALGROUP___DELETE = eINSTANCE.getHorizontalgroup__Delete();

		/**
		 * The meta object literal for the '<em><b>Edit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HORIZONTALGROUP___EDIT = eINSTANCE.getHorizontalgroup__Edit();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.InstanceImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontollerImpl <em>Horizontalelasticcontoller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticcontollerImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getHorizontalelasticcontoller()
		 * @generated
		 */
		EClass HORIZONTALELASTICCONTOLLER = eINSTANCE.getHorizontalelasticcontoller();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingstrategyImpl <em>Scalingstrategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ScalingstrategyImpl
		 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityPackageImpl#getScalingstrategy()
		 * @generated
		 */
		EClass SCALINGSTRATEGY = eINSTANCE.getScalingstrategy();

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
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANUAL___START = eINSTANCE.getManual__Start();

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

	}

} //HorizontalelasticityPackage
