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

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZabbixFactoryImpl extends EFactoryImpl implements ZabbixFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZabbixFactory init() {
		try {
			ZabbixFactory theZabbixFactory = (ZabbixFactory)EPackage.Registry.INSTANCE.getEFactory(ZabbixPackage.eNS_URI);
			if (theZabbixFactory != null) {
				return theZabbixFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZabbixFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZabbixFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ZabbixPackage.ZABBIXCOLLECTOR: return createZabbixcollector();
			case ZabbixPackage.ZABBIXAPICONNECT: return createZabbixapiconnect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zabbixcollector createZabbixcollector() {
		ZabbixcollectorImpl zabbixcollector = new ZabbixcollectorImpl();
		return zabbixcollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zabbixapiconnect createZabbixapiconnect() {
		ZabbixapiconnectImpl zabbixapiconnect = new ZabbixapiconnectImpl();
		return zabbixapiconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZabbixPackage getZabbixPackage() {
		return (ZabbixPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZabbixPackage getPackage() {
		return ZabbixPackage.eINSTANCE;
	}

} //ZabbixFactoryImpl
