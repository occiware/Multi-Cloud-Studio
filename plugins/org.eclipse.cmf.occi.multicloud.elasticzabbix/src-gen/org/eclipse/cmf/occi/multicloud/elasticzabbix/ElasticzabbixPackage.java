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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixFactory
 * @model kind="package"
 * @generated
 */
public interface ElasticzabbixPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elasticzabbix";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/multicloud/elasticzabbix/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elasticzabbix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElasticzabbixPackage eINSTANCE = org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixcollectorImpl <em>Zabbixcollector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixcollectorImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getZabbixcollector()
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
	 * The feature id for the '<em><b>Instance Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__INSTANCE_IP = MonitoringPackage.COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR__INSTANCE_NAME = MonitoringPackage.COLLECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Zabbixcollector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXCOLLECTOR_FEATURE_COUNT = MonitoringPackage.COLLECTOR_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixsensorImpl <em>Zabbixsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixsensorImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getZabbixsensor()
	 * @generated
	 */
	int ZABBIXSENSOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__ID = MonitoringPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__TITLE = MonitoringPackage.SENSOR__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__KIND = MonitoringPackage.SENSOR__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__LOCATION = MonitoringPackage.SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__ATTRIBUTES = MonitoringPackage.SENSOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__MIXINS = MonitoringPackage.SENSOR__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__PARTS = MonitoringPackage.SENSOR__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__SUMMARY = MonitoringPackage.SENSOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__LINKS = MonitoringPackage.SENSOR__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__RLINKS = MonitoringPackage.SENSOR__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__OCCI_SENSOR_TIMEBASE = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timestart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__OCCI_SENSOR_TIMESTART = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timestop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__OCCI_SENSOR_TIMESTOP = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP;

	/**
	 * The feature id for the '<em><b>Occi Sensor Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__OCCI_SENSOR_PERIOD = MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD;

	/**
	 * The feature id for the '<em><b>Occi Sensor Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__OCCI_SENSOR_GRANULARITY = MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY;

	/**
	 * The feature id for the '<em><b>Occi Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR__OCCI_SENSOR_ACCURACY = MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY;

	/**
	 * The number of structural features of the '<em>Zabbixsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR_FEATURE_COUNT = MonitoringPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR___OCCI_CREATE = MonitoringPackage.SENSOR___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR___OCCI_RETRIEVE = MonitoringPackage.SENSOR___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR___OCCI_UPDATE = MonitoringPackage.SENSOR___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR___OCCI_DELETE = MonitoringPackage.SENSOR___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Zabbixsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXSENSOR_OPERATION_COUNT = MonitoringPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixapiconnectImpl <em>Zabbixapiconnect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixapiconnectImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getZabbixapiconnect()
	 * @generated
	 */
	int ZABBIXAPICONNECT = 2;

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
	int ZABBIXAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Zabbixapiconnect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZABBIXAPICONNECT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.CpuImpl <em>Cpu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.CpuImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getCpu()
	 * @generated
	 */
	int CPU = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Load Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__LOAD_AVG = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cpu Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__CPU_USED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.SupervisorapiconnectImpl <em>Supervisorapiconnect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.SupervisorapiconnectImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getSupervisorapiconnect()
	 * @generated
	 */
	int SUPERVISORAPICONNECT = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT__USERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT__PASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Http Api Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT__HTTP_API_ADDRESS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Supervisorapiconnect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supervisorapiconnect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISORAPICONNECT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.RamImpl <em>Ram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.RamImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getRam()
	 * @generated
	 */
	int RAM = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__FREE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__SWAP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ram Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__RAM_USED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>Percent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getPercent()
	 * @generated
	 */
	int PERCENT = 6;

	/**
	 * The meta object id for the '<em>Per Sec</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getPerSec()
	 * @generated
	 */
	int PER_SEC = 7;

	/**
	 * The meta object id for the '<em>Average</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getAverage()
	 * @generated
	 */
	int AVERAGE = 8;

	/**
	 * The meta object id for the '<em>Temperature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector <em>Zabbixcollector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zabbixcollector</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector
	 * @generated
	 */
	EClass getZabbixcollector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceIp <em>Instance Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Ip</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceIp()
	 * @see #getZabbixcollector()
	 * @generated
	 */
	EAttribute getZabbixcollector_InstanceIp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceName()
	 * @see #getZabbixcollector()
	 * @generated
	 */
	EAttribute getZabbixcollector_InstanceName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixsensor <em>Zabbixsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zabbixsensor</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixsensor
	 * @generated
	 */
	EClass getZabbixsensor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect <em>Zabbixapiconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zabbixapiconnect</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect
	 * @generated
	 */
	EClass getZabbixapiconnect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getTemplateName()
	 * @see #getZabbixapiconnect()
	 * @generated
	 */
	EAttribute getZabbixapiconnect_TemplateName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getHostGroupName <em>Host Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Group Name</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getHostGroupName()
	 * @see #getZabbixapiconnect()
	 * @generated
	 */
	EAttribute getZabbixapiconnect_HostGroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getPort()
	 * @see #getZabbixapiconnect()
	 * @generated
	 */
	EAttribute getZabbixapiconnect_Port();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getZabbixapiconnect__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu
	 * @generated
	 */
	EClass getCpu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu#getLoadAvg <em>Load Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Avg</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu#getLoadAvg()
	 * @see #getCpu()
	 * @generated
	 */
	EAttribute getCpu_LoadAvg();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu#getCpuUsed <em>Cpu Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Used</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu#getCpuUsed()
	 * @see #getCpu()
	 * @generated
	 */
	EAttribute getCpu_CpuUsed();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCpu__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect <em>Supervisorapiconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supervisorapiconnect</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect
	 * @generated
	 */
	EClass getSupervisorapiconnect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#getUsername()
	 * @see #getSupervisorapiconnect()
	 * @generated
	 */
	EAttribute getSupervisorapiconnect_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#getPassword()
	 * @see #getSupervisorapiconnect()
	 * @generated
	 */
	EAttribute getSupervisorapiconnect_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#getHttpApiAddress <em>Http Api Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Api Address</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#getHttpApiAddress()
	 * @see #getSupervisorapiconnect()
	 * @generated
	 */
	EAttribute getSupervisorapiconnect_HttpApiAddress();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSupervisorapiconnect__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ram</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram
	 * @generated
	 */
	EClass getRam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#getFree()
	 * @see #getRam()
	 * @generated
	 */
	EAttribute getRam_Free();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#getSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#getSwap()
	 * @see #getRam()
	 * @generated
	 */
	EAttribute getRam_Swap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#getRamUsed <em>Ram Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Used</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#getRamUsed()
	 * @see #getRam()
	 * @generated
	 */
	EAttribute getRam_RamUsed();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRam__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percent</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="MinInclusive='0.0'"
	 * @generated
	 */
	EDataType getPercent();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Per Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Per Sec</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="MinInclusive='0.0'"
	 * @generated
	 */
	EDataType getPerSec();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Average</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="MinInclusive='0.0' MinExclusive=''"
	 * @generated
	 */
	EDataType getAverage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temperature</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getTemperature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElasticzabbixFactory getElasticzabbixFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixcollectorImpl <em>Zabbixcollector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixcollectorImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getZabbixcollector()
		 * @generated
		 */
		EClass ZABBIXCOLLECTOR = eINSTANCE.getZabbixcollector();

		/**
		 * The meta object literal for the '<em><b>Instance Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZABBIXCOLLECTOR__INSTANCE_IP = eINSTANCE.getZabbixcollector_InstanceIp();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZABBIXCOLLECTOR__INSTANCE_NAME = eINSTANCE.getZabbixcollector_InstanceName();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixsensorImpl <em>Zabbixsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixsensorImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getZabbixsensor()
		 * @generated
		 */
		EClass ZABBIXSENSOR = eINSTANCE.getZabbixsensor();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixapiconnectImpl <em>Zabbixapiconnect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixapiconnectImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getZabbixapiconnect()
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

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.CpuImpl <em>Cpu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.CpuImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getCpu()
		 * @generated
		 */
		EClass CPU = eINSTANCE.getCpu();

		/**
		 * The meta object literal for the '<em><b>Load Avg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__LOAD_AVG = eINSTANCE.getCpu_LoadAvg();

		/**
		 * The meta object literal for the '<em><b>Cpu Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__CPU_USED = eINSTANCE.getCpu_CpuUsed();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCpu__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.SupervisorapiconnectImpl <em>Supervisorapiconnect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.SupervisorapiconnectImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getSupervisorapiconnect()
		 * @generated
		 */
		EClass SUPERVISORAPICONNECT = eINSTANCE.getSupervisorapiconnect();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPERVISORAPICONNECT__USERNAME = eINSTANCE.getSupervisorapiconnect_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPERVISORAPICONNECT__PASSWORD = eINSTANCE.getSupervisorapiconnect_Password();

		/**
		 * The meta object literal for the '<em><b>Http Api Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPERVISORAPICONNECT__HTTP_API_ADDRESS = eINSTANCE.getSupervisorapiconnect_HttpApiAddress();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPERVISORAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSupervisorapiconnect__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.RamImpl <em>Ram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.RamImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getRam()
		 * @generated
		 */
		EClass RAM = eINSTANCE.getRam();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM__FREE = eINSTANCE.getRam_Free();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM__SWAP = eINSTANCE.getRam_Swap();

		/**
		 * The meta object literal for the '<em><b>Ram Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAM__RAM_USED = eINSTANCE.getRam_RamUsed();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRam__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em>Percent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getPercent()
		 * @generated
		 */
		EDataType PERCENT = eINSTANCE.getPercent();

		/**
		 * The meta object literal for the '<em>Per Sec</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getPerSec()
		 * @generated
		 */
		EDataType PER_SEC = eINSTANCE.getPerSec();

		/**
		 * The meta object literal for the '<em>Average</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getAverage()
		 * @generated
		 */
		EDataType AVERAGE = eINSTANCE.getAverage();

		/**
		 * The meta object literal for the '<em>Temperature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixPackageImpl#getTemperature()
		 * @generated
		 */
		EDataType TEMPERATURE = eINSTANCE.getTemperature();

	}

} //ElasticzabbixPackage
