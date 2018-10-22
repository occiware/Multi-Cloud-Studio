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
package org.eclipse.cmf.occi.multicloud.regions;

import org.eclipse.cmf.occi.core.OCCIPackage;

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
 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsFactory
 * @model kind="package"
 * @generated
 */
public interface RegionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "regions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/infrastructure/locations/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "regions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegionsPackage eINSTANCE = org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REGION_ID = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REGION_DESCRIPTION = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ENDPOINT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REGION_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.RegionlinkImpl <em>Regionlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionlinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getRegionlink()
	 * @generated
	 */
	int REGIONLINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Regionlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Source Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regionlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl <em>Availabilityzone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAvailabilityzone()
	 * @generated
	 */
	int AVAILABILITYZONE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ZONE_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zone Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ZONE_MESSAGE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__AVAILABLE = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Availabilityzone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Availabilityzone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzonelinkImpl <em>Availabilityzonelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzonelinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAvailabilityzonelink()
	 * @generated
	 */
	int AVAILABILITYZONELINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Availabilityzonelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Source Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Availabilityzonelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONELINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl <em>Europe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getEurope()
	 * @generated
	 */
	int EUROPE = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Europe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Europe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.NorthamericaImpl <em>Northamerica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.NorthamericaImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getNorthamerica()
	 * @generated
	 */
	int NORTHAMERICA = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Northamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Northamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl <em>Southamerica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getSouthamerica()
	 * @generated
	 */
	int SOUTHAMERICA = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Southamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Southamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AsiapacificImpl <em>Asiapacific</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AsiapacificImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAsiapacific()
	 * @generated
	 */
	int ASIAPACIFIC = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Asiapacific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asiapacific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl <em>Africa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAfrica()
	 * @generated
	 */
	int AFRICA = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Africa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Africa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.ChinaImpl <em>China</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.ChinaImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getChina()
	 * @generated
	 */
	int CHINA = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHINA__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHINA__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHINA__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>China</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHINA_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHINA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>China</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHINA_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Region#getRegionId()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionDescription <em>Region Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Description</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Region#getRegionDescription()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_RegionDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Region#getEndpoint()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Region#getRegionName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_RegionName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Regionlink <em>Regionlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regionlink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Regionlink
	 * @generated
	 */
	EClass getRegionlink();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.Regionlink#sourceConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Regionlink#sourceConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRegionlink__SourceConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone <em>Availabilityzone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availabilityzone</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Availabilityzone
	 * @generated
	 */
	EClass getAvailabilityzone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneName <em>Zone Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneName()
	 * @see #getAvailabilityzone()
	 * @generated
	 */
	EAttribute getAvailabilityzone_ZoneName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneMessage <em>Zone Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Message</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneMessage()
	 * @see #getAvailabilityzone()
	 * @generated
	 */
	EAttribute getAvailabilityzone_ZoneMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#isAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#isAvailable()
	 * @see #getAvailabilityzone()
	 * @generated
	 */
	EAttribute getAvailabilityzone_Available();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzonelink <em>Availabilityzonelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availabilityzonelink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Availabilityzonelink
	 * @generated
	 */
	EClass getAvailabilityzonelink();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzonelink#sourceConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Availabilityzonelink#sourceConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAvailabilityzonelink__SourceConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Europe <em>Europe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Europe</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Europe
	 * @generated
	 */
	EClass getEurope();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.Europe#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Europe#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEurope__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Northamerica <em>Northamerica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Northamerica</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Northamerica
	 * @generated
	 */
	EClass getNorthamerica();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.Northamerica#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Northamerica#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNorthamerica__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Southamerica <em>Southamerica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Southamerica</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Southamerica
	 * @generated
	 */
	EClass getSouthamerica();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.Southamerica#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Southamerica#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSouthamerica__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Asiapacific <em>Asiapacific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asiapacific</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Asiapacific
	 * @generated
	 */
	EClass getAsiapacific();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.Asiapacific#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Asiapacific#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsiapacific__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Africa <em>Africa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Africa</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Africa
	 * @generated
	 */
	EClass getAfrica();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.Africa#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Africa#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAfrica__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.China <em>China</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>China</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.China
	 * @generated
	 */
	EClass getChina();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.regions.China#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.regions.China#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getChina__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegionsFactory getRegionsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__REGION_ID = eINSTANCE.getRegion_RegionId();

		/**
		 * The meta object literal for the '<em><b>Region Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__REGION_DESCRIPTION = eINSTANCE.getRegion_RegionDescription();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__ENDPOINT = eINSTANCE.getRegion_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__REGION_NAME = eINSTANCE.getRegion_RegionName();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.RegionlinkImpl <em>Regionlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionlinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getRegionlink()
		 * @generated
		 */
		EClass REGIONLINK = eINSTANCE.getRegionlink();

		/**
		 * The meta object literal for the '<em><b>Source Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGIONLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRegionlink__SourceConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl <em>Availabilityzone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAvailabilityzone()
		 * @generated
		 */
		EClass AVAILABILITYZONE = eINSTANCE.getAvailabilityzone();

		/**
		 * The meta object literal for the '<em><b>Zone Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITYZONE__ZONE_NAME = eINSTANCE.getAvailabilityzone_ZoneName();

		/**
		 * The meta object literal for the '<em><b>Zone Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITYZONE__ZONE_MESSAGE = eINSTANCE.getAvailabilityzone_ZoneMessage();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITYZONE__AVAILABLE = eINSTANCE.getAvailabilityzone_Available();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzonelinkImpl <em>Availabilityzonelink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzonelinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAvailabilityzonelink()
		 * @generated
		 */
		EClass AVAILABILITYZONELINK = eINSTANCE.getAvailabilityzonelink();

		/**
		 * The meta object literal for the '<em><b>Source Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVAILABILITYZONELINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAvailabilityzonelink__SourceConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl <em>Europe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getEurope()
		 * @generated
		 */
		EClass EUROPE = eINSTANCE.getEurope();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EUROPE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEurope__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.NorthamericaImpl <em>Northamerica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.NorthamericaImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getNorthamerica()
		 * @generated
		 */
		EClass NORTHAMERICA = eINSTANCE.getNorthamerica();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NORTHAMERICA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNorthamerica__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl <em>Southamerica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getSouthamerica()
		 * @generated
		 */
		EClass SOUTHAMERICA = eINSTANCE.getSouthamerica();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUTHAMERICA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSouthamerica__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AsiapacificImpl <em>Asiapacific</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AsiapacificImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAsiapacific()
		 * @generated
		 */
		EClass ASIAPACIFIC = eINSTANCE.getAsiapacific();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIAPACIFIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAsiapacific__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl <em>Africa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAfrica()
		 * @generated
		 */
		EClass AFRICA = eINSTANCE.getAfrica();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AFRICA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAfrica__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.ChinaImpl <em>China</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.ChinaImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getChina()
		 * @generated
		 */
		EClass CHINA = eINSTANCE.getChina();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHINA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getChina__AppliesConstraint__DiagnosticChain_Map();

	}

} //RegionsPackage
