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
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl;

import org.eclipse.cmf.occi.monitoring.impl.SensorImpl;

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixPackage;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixsensor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zabbixsensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ZabbixsensorImpl extends SensorImpl implements Zabbixsensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZabbixsensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZabbixPackage.Literals.ZABBIXSENSOR;
	}

} //ZabbixsensorImpl
