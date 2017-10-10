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
package org.eclipse.cmf.occi.multicloud.occimonitoring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage
 * @generated
 */
public interface OccimonitoringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OccimonitoringFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.occimonitoring.impl.OccimonitoringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Zabbixinstance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zabbixinstance</em>'.
	 * @generated
	 */
	Zabbixinstance createZabbixinstance();

	/**
	 * Returns a new object of class '<em>Hostgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostgroup</em>'.
	 * @generated
	 */
	Hostgroup createHostgroup();

	/**
	 * Returns a new object of class '<em>Zabbixtemplate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zabbixtemplate</em>'.
	 * @generated
	 */
	Zabbixtemplate createZabbixtemplate();

	/**
	 * Returns a new object of class '<em>Hostgroulink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostgroulink</em>'.
	 * @generated
	 */
	Hostgroulink createHostgroulink();

	/**
	 * Returns a new object of class '<em>Templatelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Templatelink</em>'.
	 * @generated
	 */
	Templatelink createTemplatelink();

	/**
	 * Returns a new object of class '<em>Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metrics</em>'.
	 * @generated
	 */
	Metrics createMetrics();

	/**
	 * Returns a new object of class '<em>Cpuusage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpuusage</em>'.
	 * @generated
	 */
	Cpuusage createCpuusage();

	/**
	 * Returns a new object of class '<em>Memoryusage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memoryusage</em>'.
	 * @generated
	 */
	Memoryusage createMemoryusage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OccimonitoringPackage getOccimonitoringPackage();

} //OccimonitoringFactory
