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
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixPackage
 * @generated
 */
public interface ZabbixFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZabbixFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Zabbixcollector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zabbixcollector</em>'.
	 * @generated
	 */
	Zabbixcollector createZabbixcollector();

	/**
	 * Returns a new object of class '<em>Zabbixapiconnect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zabbixapiconnect</em>'.
	 * @generated
	 */
	Zabbixapiconnect createZabbixapiconnect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ZabbixPackage getZabbixPackage();

} //ZabbixFactory
