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
	 * Returns a new object of class '<em>Recurrence Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurrence Step</em>'.
	 * @generated
	 */
	RecurrenceStep createRecurrenceStep();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	Array createArray();

	/**
	 * Returns a new object of class '<em>Arrayof Recurrence Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrayof Recurrence Step</em>'.
	 * @generated
	 */
	ArrayofRecurrenceStep createArrayofRecurrenceStep();

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
	 * Returns a new object of class '<em>Horizontalelasticcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontalelasticcontroller</em>'.
	 * @generated
	 */
	Horizontalelasticcontroller createHorizontalelasticcontroller();

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
	 * Returns a new object of class '<em>Grouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouplink</em>'.
	 * @generated
	 */
	Grouplink createGrouplink();

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
	 * Returns a new object of class '<em>Simpledynamic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simpledynamic</em>'.
	 * @generated
	 */
	Simpledynamic createSimpledynamic();

	/**
	 * Returns a new object of class '<em>Stepdynamic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stepdynamic</em>'.
	 * @generated
	 */
	Stepdynamic createStepdynamic();

	/**
	 * Returns a new object of class '<em>Dynamicadjustment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamicadjustment</em>'.
	 * @generated
	 */
	Dynamicadjustment createDynamicadjustment();

	/**
	 * Returns a new object of class '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation</em>'.
	 * @generated
	 */
	Creation createCreation();

	/**
	 * Returns a new object of class '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steps</em>'.
	 * @generated
	 */
	Steps createSteps();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduler</em>'.
	 * @generated
	 */
	Scheduler createScheduler();

	/**
	 * Returns a new object of class '<em>Uniqueschedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniqueschedule</em>'.
	 * @generated
	 */
	Uniqueschedule createUniqueschedule();

	/**
	 * Returns a new object of class '<em>Recurringschedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurringschedule</em>'.
	 * @generated
	 */
	Recurringschedule createRecurringschedule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HorizontalelasticityPackage getHorizontalelasticityPackage();

} //HorizontalelasticityFactory
