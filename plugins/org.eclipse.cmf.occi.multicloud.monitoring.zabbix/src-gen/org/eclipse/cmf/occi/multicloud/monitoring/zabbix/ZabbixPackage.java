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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl <em>Zabbixapiconnect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixPackageImpl#getZabbixapiconnect()
	 * @generated
	 */
	int ZABBIXAPICONNECT = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__USERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__PASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Http Api Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__HTTP_API_ADDRESS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__TEMPLATE_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__HOST_GROUP_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT__PORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Zabbixapiconnect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zabbixapiconnect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;


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
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect <em>Zabbixapiconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zabbixapiconnect</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect
	 * @generated
	 */
	EClass getZabbixapiconnect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#getTemplateName()
	 * @see #getZabbixapiconnect()
	 * @generated
	 */
	EAttribute getZabbixapiconnect_TemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#getHostGroupName <em>Host Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Group Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#getHostGroupName()
	 * @see #getZabbixapiconnect()
	 * @generated
	 */
	EAttribute getZabbixapiconnect_HostGroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#getPort()
	 * @see #getZabbixapiconnect()
	 * @generated
	 */
	EAttribute getZabbixapiconnect_Port();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getZabbixapiconnect__AppliesConstraint__DiagnosticChain_Map();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl <em>Zabbixapiconnect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl
		 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixPackageImpl#getZabbixapiconnect()
		 * @generated
		 */
		EClass ZABBIXAPICONNECT = eINSTANCE.getZabbixapiconnect();

		/**
		 * The meta object literal for the '<em><b>Template Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZABBIXAPICONNECT__TEMPLATE_NAME = eINSTANCE.getZabbixapiconnect_TemplateName();

		/**
		 * The meta object literal for the '<em><b>Host Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZABBIXAPICONNECT__HOST_GROUP_NAME = eINSTANCE.getZabbixapiconnect_HostGroupName();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZABBIXAPICONNECT__PORT = eINSTANCE.getZabbixapiconnect_Port();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZABBIXAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getZabbixapiconnect__AppliesConstraint__DiagnosticChain_Map();

	}

} //ZabbixPackage
