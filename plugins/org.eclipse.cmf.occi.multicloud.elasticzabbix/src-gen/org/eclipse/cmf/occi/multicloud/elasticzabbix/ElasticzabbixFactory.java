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
package org.eclipse.cmf.occi.multicloud.elasticzabbix;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage
 * @generated
 */
public interface ElasticzabbixFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElasticzabbixFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Zabbixcollector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zabbixcollector</em>'.
	 * @generated
	 */
	Zabbixcollector createZabbixcollector();

	/**
	 * Returns a new object of class '<em>Zabbixsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zabbixsensor</em>'.
	 * @generated
	 */
	Zabbixsensor createZabbixsensor();

	/**
	 * Returns a new object of class '<em>Zabbixapiconnect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zabbixapiconnect</em>'.
	 * @generated
	 */
	Zabbixapiconnect createZabbixapiconnect();

	/**
	 * Returns a new object of class '<em>Cpu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpu</em>'.
	 * @generated
	 */
	Cpu createCpu();

	/**
	 * Returns a new object of class '<em>Supervisorapiconnect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supervisorapiconnect</em>'.
	 * @generated
	 */
	Supervisorapiconnect createSupervisorapiconnect();

	/**
	 * Returns a new object of class '<em>Ram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ram</em>'.
	 * @generated
	 */
	Ram createRam();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ElasticzabbixPackage getElasticzabbixPackage();

} //ElasticzabbixFactory