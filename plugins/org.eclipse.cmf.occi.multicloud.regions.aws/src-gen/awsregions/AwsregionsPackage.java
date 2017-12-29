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
package awsregions;

import org.eclipse.cmf.occi.multicloud.regions.RegionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see awsregions.AwsregionsFactory
 * @model kind="package"
 * @generated
 */
public interface AwsregionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "awsregions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/infrastructure/locations/aws/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "awsregions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AwsregionsPackage eINSTANCE = awsregions.impl.AwsregionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link awsregions.impl.Us_east_2Impl <em>Us east 2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Us_east_2Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getUs_east_2()
	 * @generated
	 */
	int US_EAST_2 = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2__MIXIN = RegionsPackage.NORTHAMERICA__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2__ENTITY = RegionsPackage.NORTHAMERICA__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2__ATTRIBUTES = RegionsPackage.NORTHAMERICA__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2__REGION_NAME = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2__COUNTRY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2__REGION_ID = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2__CITY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Us east 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2_FEATURE_COUNT = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Us east 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_2_OPERATION_COUNT = RegionsPackage.NORTHAMERICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Us_east_1Impl <em>Us east 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Us_east_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getUs_east_1()
	 * @generated
	 */
	int US_EAST_1 = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1__MIXIN = RegionsPackage.NORTHAMERICA__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1__ENTITY = RegionsPackage.NORTHAMERICA__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1__ATTRIBUTES = RegionsPackage.NORTHAMERICA__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1__REGION_NAME = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1__COUNTRY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1__REGION_ID = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1__CITY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Us east 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1_FEATURE_COUNT = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Us east 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_EAST_1_OPERATION_COUNT = RegionsPackage.NORTHAMERICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Eu_west_3Impl <em>Eu west 3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Eu_west_3Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getEu_west_3()
	 * @generated
	 */
	int EU_WEST_3 = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3__MIXIN = RegionsPackage.EUROPE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3__ENTITY = RegionsPackage.EUROPE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3__ATTRIBUTES = RegionsPackage.EUROPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3__REGION_NAME = RegionsPackage.EUROPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3__COUNTRY = RegionsPackage.EUROPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3__REGION_ID = RegionsPackage.EUROPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3__CITY = RegionsPackage.EUROPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eu west 3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3_FEATURE_COUNT = RegionsPackage.EUROPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Eu west 3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_3_OPERATION_COUNT = RegionsPackage.EUROPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Us_west_1Impl <em>Us west 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Us_west_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getUs_west_1()
	 * @generated
	 */
	int US_WEST_1 = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1__MIXIN = RegionsPackage.NORTHAMERICA__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1__ENTITY = RegionsPackage.NORTHAMERICA__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1__ATTRIBUTES = RegionsPackage.NORTHAMERICA__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1__REGION_NAME = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1__COUNTRY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1__REGION_ID = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1__CITY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Us west 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1_FEATURE_COUNT = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Us west 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_1_OPERATION_COUNT = RegionsPackage.NORTHAMERICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Eu_west_1Impl <em>Eu west 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Eu_west_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getEu_west_1()
	 * @generated
	 */
	int EU_WEST_1 = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1__MIXIN = RegionsPackage.EUROPE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1__ENTITY = RegionsPackage.EUROPE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1__ATTRIBUTES = RegionsPackage.EUROPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1__REGION_NAME = RegionsPackage.EUROPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1__COUNTRY = RegionsPackage.EUROPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1__REGION_ID = RegionsPackage.EUROPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1__CITY = RegionsPackage.EUROPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eu west 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1_FEATURE_COUNT = RegionsPackage.EUROPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Eu west 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_1_OPERATION_COUNT = RegionsPackage.EUROPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Ap_south_1Impl <em>Ap south 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Ap_south_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getAp_south_1()
	 * @generated
	 */
	int AP_SOUTH_1 = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1__MIXIN = RegionsPackage.ASIAPACIFIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1__ENTITY = RegionsPackage.ASIAPACIFIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1__ATTRIBUTES = RegionsPackage.ASIAPACIFIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1__COUNTRY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1__REGION_NAME = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1__REGION_ID = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1__CITY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ap south 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1_FEATURE_COUNT = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ap south 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_1_OPERATION_COUNT = RegionsPackage.ASIAPACIFIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Sa_east_1Impl <em>Sa east 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Sa_east_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getSa_east_1()
	 * @generated
	 */
	int SA_EAST_1 = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1__MIXIN = RegionsPackage.EUROPE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1__ENTITY = RegionsPackage.EUROPE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1__ATTRIBUTES = RegionsPackage.EUROPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1__COUNTRY = RegionsPackage.EUROPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1__REGION_NAME = RegionsPackage.EUROPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1__REGION_ID = RegionsPackage.EUROPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1__CITY = RegionsPackage.EUROPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sa east 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1_FEATURE_COUNT = RegionsPackage.EUROPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sa east 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_EAST_1_OPERATION_COUNT = RegionsPackage.EUROPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Us_west_2Impl <em>Us west 2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Us_west_2Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getUs_west_2()
	 * @generated
	 */
	int US_WEST_2 = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2__MIXIN = RegionsPackage.NORTHAMERICA__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2__ENTITY = RegionsPackage.NORTHAMERICA__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2__ATTRIBUTES = RegionsPackage.NORTHAMERICA__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2__REGION_NAME = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2__COUNTRY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2__REGION_ID = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2__CITY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Us west 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2_FEATURE_COUNT = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Us west 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_WEST_2_OPERATION_COUNT = RegionsPackage.NORTHAMERICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Eu_west_2Impl <em>Eu west 2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Eu_west_2Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getEu_west_2()
	 * @generated
	 */
	int EU_WEST_2 = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2__MIXIN = RegionsPackage.EUROPE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2__ENTITY = RegionsPackage.EUROPE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2__ATTRIBUTES = RegionsPackage.EUROPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2__REGION_NAME = RegionsPackage.EUROPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2__COUNTRY = RegionsPackage.EUROPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2__REGION_ID = RegionsPackage.EUROPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2__CITY = RegionsPackage.EUROPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eu west 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2_FEATURE_COUNT = RegionsPackage.EUROPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Eu west 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_WEST_2_OPERATION_COUNT = RegionsPackage.EUROPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Ap_southeast_1Impl <em>Ap southeast 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Ap_southeast_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getAp_southeast_1()
	 * @generated
	 */
	int AP_SOUTHEAST_1 = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1__MIXIN = RegionsPackage.ASIAPACIFIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1__ENTITY = RegionsPackage.ASIAPACIFIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1__ATTRIBUTES = RegionsPackage.ASIAPACIFIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1__COUNTRY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1__REGION_NAME = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1__REGION_ID = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1__CITY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ap southeast 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1_FEATURE_COUNT = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ap southeast 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTHEAST_1_OPERATION_COUNT = RegionsPackage.ASIAPACIFIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Ca_central_1Impl <em>Ca central 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Ca_central_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getCa_central_1()
	 * @generated
	 */
	int CA_CENTRAL_1 = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1__MIXIN = RegionsPackage.NORTHAMERICA__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1__ENTITY = RegionsPackage.NORTHAMERICA__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1__ATTRIBUTES = RegionsPackage.NORTHAMERICA__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1__REGION_NAME = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1__COUNTRY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1__REGION_ID = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1__CITY = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ca central 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1_FEATURE_COUNT = RegionsPackage.NORTHAMERICA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ca central 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_CENTRAL_1_OPERATION_COUNT = RegionsPackage.NORTHAMERICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Ap_northeast_2Impl <em>Ap northeast 2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Ap_northeast_2Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getAp_northeast_2()
	 * @generated
	 */
	int AP_NORTHEAST_2 = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2__MIXIN = RegionsPackage.ASIAPACIFIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2__ENTITY = RegionsPackage.ASIAPACIFIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2__ATTRIBUTES = RegionsPackage.ASIAPACIFIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2__COUNTRY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2__REGION_NAME = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2__REGION_ID = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2__CITY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ap northeast 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2_FEATURE_COUNT = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ap northeast 2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_2_OPERATION_COUNT = RegionsPackage.ASIAPACIFIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Ap_south_east2Impl <em>Ap south east2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Ap_south_east2Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getAp_south_east2()
	 * @generated
	 */
	int AP_SOUTH_EAST2 = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2__MIXIN = RegionsPackage.ASIAPACIFIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2__ENTITY = RegionsPackage.ASIAPACIFIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2__ATTRIBUTES = RegionsPackage.ASIAPACIFIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2__COUNTRY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2__REGION_NAME = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2__REGION_ID = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2__CITY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ap south east2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2_FEATURE_COUNT = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ap south east2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_SOUTH_EAST2_OPERATION_COUNT = RegionsPackage.ASIAPACIFIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Eu_central_1Impl <em>Eu central 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Eu_central_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getEu_central_1()
	 * @generated
	 */
	int EU_CENTRAL_1 = 13;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1__MIXIN = RegionsPackage.EUROPE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1__ENTITY = RegionsPackage.EUROPE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1__ATTRIBUTES = RegionsPackage.EUROPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1__COUNTRY = RegionsPackage.EUROPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1__REGION_ID = RegionsPackage.EUROPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1__CITY = RegionsPackage.EUROPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1__REGION_NAME = RegionsPackage.EUROPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eu central 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1_FEATURE_COUNT = RegionsPackage.EUROPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Eu central 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EU_CENTRAL_1_OPERATION_COUNT = RegionsPackage.EUROPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awsregions.impl.Ap_northeast_1Impl <em>Ap northeast 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awsregions.impl.Ap_northeast_1Impl
	 * @see awsregions.impl.AwsregionsPackageImpl#getAp_northeast_1()
	 * @generated
	 */
	int AP_NORTHEAST_1 = 14;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1__MIXIN = RegionsPackage.ASIAPACIFIC__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1__ENTITY = RegionsPackage.ASIAPACIFIC__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1__ATTRIBUTES = RegionsPackage.ASIAPACIFIC__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1__COUNTRY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1__REGION_NAME = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1__REGION_ID = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1__CITY = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ap northeast 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1_FEATURE_COUNT = RegionsPackage.ASIAPACIFIC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ap northeast 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_NORTHEAST_1_OPERATION_COUNT = RegionsPackage.ASIAPACIFIC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link awsregions.Us_east_2 <em>Us east 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Us east 2</em>'.
	 * @see awsregions.Us_east_2
	 * @generated
	 */
	EClass getUs_east_2();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_2#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Us_east_2#getRegionName()
	 * @see #getUs_east_2()
	 * @generated
	 */
	EAttribute getUs_east_2_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_2#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Us_east_2#getCountry()
	 * @see #getUs_east_2()
	 * @generated
	 */
	EAttribute getUs_east_2_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_2#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Us_east_2#getRegionId()
	 * @see #getUs_east_2()
	 * @generated
	 */
	EAttribute getUs_east_2_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_2#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Us_east_2#getCity()
	 * @see #getUs_east_2()
	 * @generated
	 */
	EAttribute getUs_east_2_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Us_east_1 <em>Us east 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Us east 1</em>'.
	 * @see awsregions.Us_east_1
	 * @generated
	 */
	EClass getUs_east_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Us_east_1#getRegionName()
	 * @see #getUs_east_1()
	 * @generated
	 */
	EAttribute getUs_east_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Us_east_1#getCountry()
	 * @see #getUs_east_1()
	 * @generated
	 */
	EAttribute getUs_east_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Us_east_1#getRegionId()
	 * @see #getUs_east_1()
	 * @generated
	 */
	EAttribute getUs_east_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_east_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Us_east_1#getCity()
	 * @see #getUs_east_1()
	 * @generated
	 */
	EAttribute getUs_east_1_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Eu_west_3 <em>Eu west 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eu west 3</em>'.
	 * @see awsregions.Eu_west_3
	 * @generated
	 */
	EClass getEu_west_3();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_3#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Eu_west_3#getRegionName()
	 * @see #getEu_west_3()
	 * @generated
	 */
	EAttribute getEu_west_3_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_3#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Eu_west_3#getCountry()
	 * @see #getEu_west_3()
	 * @generated
	 */
	EAttribute getEu_west_3_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_3#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Eu_west_3#getRegionId()
	 * @see #getEu_west_3()
	 * @generated
	 */
	EAttribute getEu_west_3_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_3#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Eu_west_3#getCity()
	 * @see #getEu_west_3()
	 * @generated
	 */
	EAttribute getEu_west_3_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Us_west_1 <em>Us west 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Us west 1</em>'.
	 * @see awsregions.Us_west_1
	 * @generated
	 */
	EClass getUs_west_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Us_west_1#getRegionName()
	 * @see #getUs_west_1()
	 * @generated
	 */
	EAttribute getUs_west_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Us_west_1#getCountry()
	 * @see #getUs_west_1()
	 * @generated
	 */
	EAttribute getUs_west_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Us_west_1#getRegionId()
	 * @see #getUs_west_1()
	 * @generated
	 */
	EAttribute getUs_west_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Us_west_1#getCity()
	 * @see #getUs_west_1()
	 * @generated
	 */
	EAttribute getUs_west_1_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Eu_west_1 <em>Eu west 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eu west 1</em>'.
	 * @see awsregions.Eu_west_1
	 * @generated
	 */
	EClass getEu_west_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Eu_west_1#getRegionName()
	 * @see #getEu_west_1()
	 * @generated
	 */
	EAttribute getEu_west_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Eu_west_1#getCountry()
	 * @see #getEu_west_1()
	 * @generated
	 */
	EAttribute getEu_west_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Eu_west_1#getRegionId()
	 * @see #getEu_west_1()
	 * @generated
	 */
	EAttribute getEu_west_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Eu_west_1#getCity()
	 * @see #getEu_west_1()
	 * @generated
	 */
	EAttribute getEu_west_1_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Ap_south_1 <em>Ap south 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ap south 1</em>'.
	 * @see awsregions.Ap_south_1
	 * @generated
	 */
	EClass getAp_south_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Ap_south_1#getCountry()
	 * @see #getAp_south_1()
	 * @generated
	 */
	EAttribute getAp_south_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Ap_south_1#getRegionName()
	 * @see #getAp_south_1()
	 * @generated
	 */
	EAttribute getAp_south_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Ap_south_1#getRegionId()
	 * @see #getAp_south_1()
	 * @generated
	 */
	EAttribute getAp_south_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Ap_south_1#getCity()
	 * @see #getAp_south_1()
	 * @generated
	 */
	EAttribute getAp_south_1_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Sa_east_1 <em>Sa east 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sa east 1</em>'.
	 * @see awsregions.Sa_east_1
	 * @generated
	 */
	EClass getSa_east_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Sa_east_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Sa_east_1#getCountry()
	 * @see #getSa_east_1()
	 * @generated
	 */
	EAttribute getSa_east_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Sa_east_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Sa_east_1#getRegionName()
	 * @see #getSa_east_1()
	 * @generated
	 */
	EAttribute getSa_east_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Sa_east_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Sa_east_1#getRegionId()
	 * @see #getSa_east_1()
	 * @generated
	 */
	EAttribute getSa_east_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Sa_east_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Sa_east_1#getCity()
	 * @see #getSa_east_1()
	 * @generated
	 */
	EAttribute getSa_east_1_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Us_west_2 <em>Us west 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Us west 2</em>'.
	 * @see awsregions.Us_west_2
	 * @generated
	 */
	EClass getUs_west_2();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_2#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Us_west_2#getRegionName()
	 * @see #getUs_west_2()
	 * @generated
	 */
	EAttribute getUs_west_2_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_2#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Us_west_2#getCountry()
	 * @see #getUs_west_2()
	 * @generated
	 */
	EAttribute getUs_west_2_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_2#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Us_west_2#getRegionId()
	 * @see #getUs_west_2()
	 * @generated
	 */
	EAttribute getUs_west_2_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Us_west_2#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Us_west_2#getCity()
	 * @see #getUs_west_2()
	 * @generated
	 */
	EAttribute getUs_west_2_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Eu_west_2 <em>Eu west 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eu west 2</em>'.
	 * @see awsregions.Eu_west_2
	 * @generated
	 */
	EClass getEu_west_2();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_2#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Eu_west_2#getRegionName()
	 * @see #getEu_west_2()
	 * @generated
	 */
	EAttribute getEu_west_2_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_2#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Eu_west_2#getCountry()
	 * @see #getEu_west_2()
	 * @generated
	 */
	EAttribute getEu_west_2_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_2#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Eu_west_2#getRegionId()
	 * @see #getEu_west_2()
	 * @generated
	 */
	EAttribute getEu_west_2_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_west_2#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Eu_west_2#getCity()
	 * @see #getEu_west_2()
	 * @generated
	 */
	EAttribute getEu_west_2_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Ap_southeast_1 <em>Ap southeast 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ap southeast 1</em>'.
	 * @see awsregions.Ap_southeast_1
	 * @generated
	 */
	EClass getAp_southeast_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_southeast_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Ap_southeast_1#getCountry()
	 * @see #getAp_southeast_1()
	 * @generated
	 */
	EAttribute getAp_southeast_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_southeast_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Ap_southeast_1#getRegionName()
	 * @see #getAp_southeast_1()
	 * @generated
	 */
	EAttribute getAp_southeast_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_southeast_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Ap_southeast_1#getRegionId()
	 * @see #getAp_southeast_1()
	 * @generated
	 */
	EAttribute getAp_southeast_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_southeast_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Ap_southeast_1#getCity()
	 * @see #getAp_southeast_1()
	 * @generated
	 */
	EAttribute getAp_southeast_1_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Ca_central_1 <em>Ca central 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ca central 1</em>'.
	 * @see awsregions.Ca_central_1
	 * @generated
	 */
	EClass getCa_central_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ca_central_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Ca_central_1#getRegionName()
	 * @see #getCa_central_1()
	 * @generated
	 */
	EAttribute getCa_central_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ca_central_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Ca_central_1#getCountry()
	 * @see #getCa_central_1()
	 * @generated
	 */
	EAttribute getCa_central_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ca_central_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Ca_central_1#getRegionId()
	 * @see #getCa_central_1()
	 * @generated
	 */
	EAttribute getCa_central_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ca_central_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Ca_central_1#getCity()
	 * @see #getCa_central_1()
	 * @generated
	 */
	EAttribute getCa_central_1_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Ap_northeast_2 <em>Ap northeast 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ap northeast 2</em>'.
	 * @see awsregions.Ap_northeast_2
	 * @generated
	 */
	EClass getAp_northeast_2();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_2#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Ap_northeast_2#getCountry()
	 * @see #getAp_northeast_2()
	 * @generated
	 */
	EAttribute getAp_northeast_2_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_2#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Ap_northeast_2#getRegionName()
	 * @see #getAp_northeast_2()
	 * @generated
	 */
	EAttribute getAp_northeast_2_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_2#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Ap_northeast_2#getRegionId()
	 * @see #getAp_northeast_2()
	 * @generated
	 */
	EAttribute getAp_northeast_2_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_2#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Ap_northeast_2#getCity()
	 * @see #getAp_northeast_2()
	 * @generated
	 */
	EAttribute getAp_northeast_2_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Ap_south_east2 <em>Ap south east2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ap south east2</em>'.
	 * @see awsregions.Ap_south_east2
	 * @generated
	 */
	EClass getAp_south_east2();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_east2#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Ap_south_east2#getCountry()
	 * @see #getAp_south_east2()
	 * @generated
	 */
	EAttribute getAp_south_east2_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_east2#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Ap_south_east2#getRegionName()
	 * @see #getAp_south_east2()
	 * @generated
	 */
	EAttribute getAp_south_east2_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_east2#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Ap_south_east2#getRegionId()
	 * @see #getAp_south_east2()
	 * @generated
	 */
	EAttribute getAp_south_east2_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_south_east2#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Ap_south_east2#getCity()
	 * @see #getAp_south_east2()
	 * @generated
	 */
	EAttribute getAp_south_east2_City();

	/**
	 * Returns the meta object for class '{@link awsregions.Eu_central_1 <em>Eu central 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eu central 1</em>'.
	 * @see awsregions.Eu_central_1
	 * @generated
	 */
	EClass getEu_central_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_central_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Eu_central_1#getCountry()
	 * @see #getEu_central_1()
	 * @generated
	 */
	EAttribute getEu_central_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_central_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Eu_central_1#getRegionId()
	 * @see #getEu_central_1()
	 * @generated
	 */
	EAttribute getEu_central_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_central_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Eu_central_1#getCity()
	 * @see #getEu_central_1()
	 * @generated
	 */
	EAttribute getEu_central_1_City();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Eu_central_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Eu_central_1#getRegionName()
	 * @see #getEu_central_1()
	 * @generated
	 */
	EAttribute getEu_central_1_RegionName();

	/**
	 * Returns the meta object for class '{@link awsregions.Ap_northeast_1 <em>Ap northeast 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ap northeast 1</em>'.
	 * @see awsregions.Ap_northeast_1
	 * @generated
	 */
	EClass getAp_northeast_1();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_1#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see awsregions.Ap_northeast_1#getCountry()
	 * @see #getAp_northeast_1()
	 * @generated
	 */
	EAttribute getAp_northeast_1_Country();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_1#getRegionName <em>Region Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Name</em>'.
	 * @see awsregions.Ap_northeast_1#getRegionName()
	 * @see #getAp_northeast_1()
	 * @generated
	 */
	EAttribute getAp_northeast_1_RegionName();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_1#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see awsregions.Ap_northeast_1#getRegionId()
	 * @see #getAp_northeast_1()
	 * @generated
	 */
	EAttribute getAp_northeast_1_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link awsregions.Ap_northeast_1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see awsregions.Ap_northeast_1#getCity()
	 * @see #getAp_northeast_1()
	 * @generated
	 */
	EAttribute getAp_northeast_1_City();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AwsregionsFactory getAwsregionsFactory();

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
		 * The meta object literal for the '{@link awsregions.impl.Us_east_2Impl <em>Us east 2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Us_east_2Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getUs_east_2()
		 * @generated
		 */
		EClass US_EAST_2 = eINSTANCE.getUs_east_2();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_2__REGION_NAME = eINSTANCE.getUs_east_2_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_2__COUNTRY = eINSTANCE.getUs_east_2_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_2__REGION_ID = eINSTANCE.getUs_east_2_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_2__CITY = eINSTANCE.getUs_east_2_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Us_east_1Impl <em>Us east 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Us_east_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getUs_east_1()
		 * @generated
		 */
		EClass US_EAST_1 = eINSTANCE.getUs_east_1();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_1__REGION_NAME = eINSTANCE.getUs_east_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_1__COUNTRY = eINSTANCE.getUs_east_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_1__REGION_ID = eINSTANCE.getUs_east_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_EAST_1__CITY = eINSTANCE.getUs_east_1_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Eu_west_3Impl <em>Eu west 3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Eu_west_3Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getEu_west_3()
		 * @generated
		 */
		EClass EU_WEST_3 = eINSTANCE.getEu_west_3();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_3__REGION_NAME = eINSTANCE.getEu_west_3_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_3__COUNTRY = eINSTANCE.getEu_west_3_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_3__REGION_ID = eINSTANCE.getEu_west_3_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_3__CITY = eINSTANCE.getEu_west_3_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Us_west_1Impl <em>Us west 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Us_west_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getUs_west_1()
		 * @generated
		 */
		EClass US_WEST_1 = eINSTANCE.getUs_west_1();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_1__REGION_NAME = eINSTANCE.getUs_west_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_1__COUNTRY = eINSTANCE.getUs_west_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_1__REGION_ID = eINSTANCE.getUs_west_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_1__CITY = eINSTANCE.getUs_west_1_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Eu_west_1Impl <em>Eu west 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Eu_west_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getEu_west_1()
		 * @generated
		 */
		EClass EU_WEST_1 = eINSTANCE.getEu_west_1();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_1__REGION_NAME = eINSTANCE.getEu_west_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_1__COUNTRY = eINSTANCE.getEu_west_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_1__REGION_ID = eINSTANCE.getEu_west_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_1__CITY = eINSTANCE.getEu_west_1_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Ap_south_1Impl <em>Ap south 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Ap_south_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getAp_south_1()
		 * @generated
		 */
		EClass AP_SOUTH_1 = eINSTANCE.getAp_south_1();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_1__COUNTRY = eINSTANCE.getAp_south_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_1__REGION_NAME = eINSTANCE.getAp_south_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_1__REGION_ID = eINSTANCE.getAp_south_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_1__CITY = eINSTANCE.getAp_south_1_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Sa_east_1Impl <em>Sa east 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Sa_east_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getSa_east_1()
		 * @generated
		 */
		EClass SA_EAST_1 = eINSTANCE.getSa_east_1();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SA_EAST_1__COUNTRY = eINSTANCE.getSa_east_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SA_EAST_1__REGION_NAME = eINSTANCE.getSa_east_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SA_EAST_1__REGION_ID = eINSTANCE.getSa_east_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SA_EAST_1__CITY = eINSTANCE.getSa_east_1_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Us_west_2Impl <em>Us west 2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Us_west_2Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getUs_west_2()
		 * @generated
		 */
		EClass US_WEST_2 = eINSTANCE.getUs_west_2();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_2__REGION_NAME = eINSTANCE.getUs_west_2_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_2__COUNTRY = eINSTANCE.getUs_west_2_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_2__REGION_ID = eINSTANCE.getUs_west_2_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_WEST_2__CITY = eINSTANCE.getUs_west_2_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Eu_west_2Impl <em>Eu west 2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Eu_west_2Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getEu_west_2()
		 * @generated
		 */
		EClass EU_WEST_2 = eINSTANCE.getEu_west_2();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_2__REGION_NAME = eINSTANCE.getEu_west_2_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_2__COUNTRY = eINSTANCE.getEu_west_2_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_2__REGION_ID = eINSTANCE.getEu_west_2_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_WEST_2__CITY = eINSTANCE.getEu_west_2_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Ap_southeast_1Impl <em>Ap southeast 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Ap_southeast_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getAp_southeast_1()
		 * @generated
		 */
		EClass AP_SOUTHEAST_1 = eINSTANCE.getAp_southeast_1();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTHEAST_1__COUNTRY = eINSTANCE.getAp_southeast_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTHEAST_1__REGION_NAME = eINSTANCE.getAp_southeast_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTHEAST_1__REGION_ID = eINSTANCE.getAp_southeast_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTHEAST_1__CITY = eINSTANCE.getAp_southeast_1_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Ca_central_1Impl <em>Ca central 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Ca_central_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getCa_central_1()
		 * @generated
		 */
		EClass CA_CENTRAL_1 = eINSTANCE.getCa_central_1();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CA_CENTRAL_1__REGION_NAME = eINSTANCE.getCa_central_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CA_CENTRAL_1__COUNTRY = eINSTANCE.getCa_central_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CA_CENTRAL_1__REGION_ID = eINSTANCE.getCa_central_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CA_CENTRAL_1__CITY = eINSTANCE.getCa_central_1_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Ap_northeast_2Impl <em>Ap northeast 2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Ap_northeast_2Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getAp_northeast_2()
		 * @generated
		 */
		EClass AP_NORTHEAST_2 = eINSTANCE.getAp_northeast_2();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_2__COUNTRY = eINSTANCE.getAp_northeast_2_Country();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_2__REGION_NAME = eINSTANCE.getAp_northeast_2_RegionName();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_2__REGION_ID = eINSTANCE.getAp_northeast_2_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_2__CITY = eINSTANCE.getAp_northeast_2_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Ap_south_east2Impl <em>Ap south east2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Ap_south_east2Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getAp_south_east2()
		 * @generated
		 */
		EClass AP_SOUTH_EAST2 = eINSTANCE.getAp_south_east2();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_EAST2__COUNTRY = eINSTANCE.getAp_south_east2_Country();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_EAST2__REGION_NAME = eINSTANCE.getAp_south_east2_RegionName();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_EAST2__REGION_ID = eINSTANCE.getAp_south_east2_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_SOUTH_EAST2__CITY = eINSTANCE.getAp_south_east2_City();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Eu_central_1Impl <em>Eu central 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Eu_central_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getEu_central_1()
		 * @generated
		 */
		EClass EU_CENTRAL_1 = eINSTANCE.getEu_central_1();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_CENTRAL_1__COUNTRY = eINSTANCE.getEu_central_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_CENTRAL_1__REGION_ID = eINSTANCE.getEu_central_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_CENTRAL_1__CITY = eINSTANCE.getEu_central_1_City();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EU_CENTRAL_1__REGION_NAME = eINSTANCE.getEu_central_1_RegionName();

		/**
		 * The meta object literal for the '{@link awsregions.impl.Ap_northeast_1Impl <em>Ap northeast 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awsregions.impl.Ap_northeast_1Impl
		 * @see awsregions.impl.AwsregionsPackageImpl#getAp_northeast_1()
		 * @generated
		 */
		EClass AP_NORTHEAST_1 = eINSTANCE.getAp_northeast_1();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_1__COUNTRY = eINSTANCE.getAp_northeast_1_Country();

		/**
		 * The meta object literal for the '<em><b>Region Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_1__REGION_NAME = eINSTANCE.getAp_northeast_1_RegionName();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_1__REGION_ID = eINSTANCE.getAp_northeast_1_RegionId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_NORTHEAST_1__CITY = eINSTANCE.getAp_northeast_1_City();

	}

} //AwsregionsPackage
