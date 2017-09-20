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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage
 * @generated
 */
public interface HorizontalelasticityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HorizontalelasticityFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Horizontalgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontalgroup</em>'.
	 * @generated
	 */
	Horizontalgroup createHorizontalgroup();

	/**
	 * Returns a new object of class '<em>Loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loadbalancer</em>'.
	 * @generated
	 */
	Loadbalancer createLoadbalancer();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Horizontalelasticcontoller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontalelasticcontoller</em>'.
	 * @generated
	 */
	Horizontalelasticcontoller createHorizontalelasticcontoller();

	/**
	 * Returns a new object of class '<em>Scalingstrategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalingstrategy</em>'.
	 * @generated
	 */
	Scalingstrategy createScalingstrategy();

	/**
	 * Returns a new object of class '<em>Manual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manual</em>'.
	 * @generated
	 */
	Manual createManual();

	/**
	 * Returns a new object of class '<em>Dynamic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic</em>'.
	 * @generated
	 */
	Dynamic createDynamic();

	/**
	 * Returns a new object of class '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancegrouplink</em>'.
	 * @generated
	 */
	Instancegrouplink createInstancegrouplink();

	/**
	 * Returns a new object of class '<em>Linkbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkbalancer</em>'.
	 * @generated
	 */
	Linkbalancer createLinkbalancer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HorizontalelasticityPackage getHorizontalelasticityPackage();

} //HorizontalelasticityFactory
