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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore'"
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
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl <em>Availabilityzone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAvailabilityzone()
	 * @generated
	 */
	int AVAILABILITYZONE = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ZONE_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zone Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__ZONE_MESSAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE__AVAILABLE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Availabilityzone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Availabilityzone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITYZONE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl <em>Europe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getEurope()
	 * @generated
	 */
	int EUROPE = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE__MIXIN = REGION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE__ENTITY = REGION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE__ATTRIBUTES = REGION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Europe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE_FEATURE_COUNT = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Europe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUROPE_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.NorthamericaImpl <em>Northamerica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.NorthamericaImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getNorthamerica()
	 * @generated
	 */
	int NORTHAMERICA = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA__MIXIN = REGION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA__ENTITY = REGION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA__ATTRIBUTES = REGION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Northamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA_FEATURE_COUNT = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Northamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORTHAMERICA_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl <em>Southamerica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getSouthamerica()
	 * @generated
	 */
	int SOUTHAMERICA = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA__MIXIN = REGION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA__ENTITY = REGION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA__ATTRIBUTES = REGION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Southamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA_FEATURE_COUNT = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Southamerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTHAMERICA_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AsiapacificImpl <em>Asiapacific</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AsiapacificImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAsiapacific()
	 * @generated
	 */
	int ASIAPACIFIC = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC__MIXIN = REGION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC__ENTITY = REGION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC__ATTRIBUTES = REGION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Asiapacific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC_FEATURE_COUNT = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asiapacific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIAPACIFIC_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl <em>Africa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl
	 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAfrica()
	 * @generated
	 */
	int AFRICA = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA__MIXIN = REGION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA__ENTITY = REGION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA__ATTRIBUTES = REGION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Africa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA_FEATURE_COUNT = REGION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Africa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFRICA_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Europe <em>Europe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Europe</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Europe
	 * @generated
	 */
	EClass getEurope();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Southamerica <em>Southamerica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Southamerica</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Southamerica
	 * @generated
	 */
	EClass getSouthamerica();

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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.regions.Africa <em>Africa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Africa</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Africa
	 * @generated
	 */
	EClass getAfrica();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl <em>Europe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getEurope()
		 * @generated
		 */
		EClass EUROPE = eINSTANCE.getEurope();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl <em>Southamerica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.SouthamericaImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getSouthamerica()
		 * @generated
		 */
		EClass SOUTHAMERICA = eINSTANCE.getSouthamerica();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl <em>Africa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.AfricaImpl
		 * @see org.eclipse.cmf.occi.multicloud.regions.impl.RegionsPackageImpl#getAfrica()
		 * @generated
		 */
		EClass AFRICA = eINSTANCE.getAfrica();

	}

} //RegionsPackage
