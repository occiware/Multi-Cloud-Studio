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

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

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
 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixFactory
 * @model kind="package"
 * @generated
 */
public interface ZabbixPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "zabbix";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/multicloud/monitoring/zabbix/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zabbix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZabbixPackage eINSTANCE = org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixcollectorImpl <em>Zabbixcollector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixcollectorImpl
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixPackageImpl#getZabbixcollector()
	 * @generated
	 */
	int ZABBIXCOLLECTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__ID = MonitoringPackage.COLLECTOR__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__TITLE = MonitoringPackage.COLLECTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__KIND = MonitoringPackage.COLLECTOR__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__LOCATION = MonitoringPackage.COLLECTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__ATTRIBUTES = MonitoringPackage.COLLECTOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__MIXINS = MonitoringPackage.COLLECTOR__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__PARTS = MonitoringPackage.COLLECTOR__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__SOURCE = MonitoringPackage.COLLECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__TARGET = MonitoringPackage.COLLECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Occi Collector Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__OCCI_COLLECTOR_PERIOD = MonitoringPackage.COLLECTOR__OCCI_COLLECTOR_PERIOD;

	/**
	 * The feature id for the '<em><b>Occi Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__OCCI_SENSOR_ACCURACY = MonitoringPackage.COLLECTOR__OCCI_SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Occi Sensor Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__OCCI_SENSOR_GRANULARITY = MonitoringPackage.COLLECTOR__OCCI_SENSOR_GRANULARITY;

	/**
	 * The number of structural features of the '<em>Zabbixcollector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR_FEATURE_COUNT = MonitoringPackage.COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR___OCCI_CREATE = MonitoringPackage.COLLECTOR___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR___OCCI_RETRIEVE = MonitoringPackage.COLLECTOR___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR___OCCI_UPDATE = MonitoringPackage.COLLECTOR___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR___OCCI_DELETE = MonitoringPackage.COLLECTOR___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Zabbixcollector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR_OPERATION_COUNT = MonitoringPackage.COLLECTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixcollector <em>Zabbixcollector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zabbixcollector</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixcollector
	 * @generated
	 */
	EClass getZabbixcollector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ZabbixFactory getZabbixFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixcollectorImpl <em>Zabbixcollector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixcollectorImpl
		 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixPackageImpl#getZabbixcollector()
		 * @generated
		 */
		EClass ZABBIXCOLLECTOR = eINSTANCE.getZabbixcollector();

	}

} //ZabbixPackage
