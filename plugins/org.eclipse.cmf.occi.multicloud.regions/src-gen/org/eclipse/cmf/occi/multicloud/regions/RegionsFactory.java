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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage
 * @generated
 */
public interface RegionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegionsFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.regions.impl.RegionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Regionlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regionlink</em>'.
	 * @generated
	 */
	Regionlink createRegionlink();

	/**
	 * Returns a new object of class '<em>Availabilityzone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availabilityzone</em>'.
	 * @generated
	 */
	Availabilityzone createAvailabilityzone();

	/**
	 * Returns a new object of class '<em>Availabilityzonelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availabilityzonelink</em>'.
	 * @generated
	 */
	Availabilityzonelink createAvailabilityzonelink();

	/**
	 * Returns a new object of class '<em>Europe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Europe</em>'.
	 * @generated
	 */
	Europe createEurope();

	/**
	 * Returns a new object of class '<em>Northamerica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Northamerica</em>'.
	 * @generated
	 */
	Northamerica createNorthamerica();

	/**
	 * Returns a new object of class '<em>Southamerica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Southamerica</em>'.
	 * @generated
	 */
	Southamerica createSouthamerica();

	/**
	 * Returns a new object of class '<em>Asiapacific</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asiapacific</em>'.
	 * @generated
	 */
	Asiapacific createAsiapacific();

	/**
	 * Returns a new object of class '<em>Africa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Africa</em>'.
	 * @generated
	 */
	Africa createAfrica();

	/**
	 * Returns a new object of class '<em>China</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>China</em>'.
	 * @generated
	 */
	China createChina();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RegionsPackage getRegionsPackage();

} //RegionsFactory
