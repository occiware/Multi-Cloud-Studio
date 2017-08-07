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
package cloudmonitoring;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see cloudmonitoring.CloudmonitoringFactory
 * @model kind="package"
 * @generated
 */
public interface CloudmonitoringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloudmonitoring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/multicloud/monitoring/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloudmonitoring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudmonitoringPackage eINSTANCE = cloudmonitoring.impl.CloudmonitoringPackageImpl.init();

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.CloudsensorImpl <em>Cloudsensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.CloudsensorImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getCloudsensor()
	 * @generated
	 */
	int CLOUDSENSOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__ID = MonitoringPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__TITLE = MonitoringPackage.SENSOR__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__KIND = MonitoringPackage.SENSOR__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__LOCATION = MonitoringPackage.SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__ATTRIBUTES = MonitoringPackage.SENSOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__MIXINS = MonitoringPackage.SENSOR__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__PARTS = MonitoringPackage.SENSOR__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__SUMMARY = MonitoringPackage.SENSOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__LINKS = MonitoringPackage.SENSOR__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__RLINKS = MonitoringPackage.SENSOR__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__OCCI_SENSOR_TIMEBASE = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timestart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__OCCI_SENSOR_TIMESTART = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART;

	/**
	 * The feature id for the '<em><b>Occi Sensor Timestop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__OCCI_SENSOR_TIMESTOP = MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP;

	/**
	 * The feature id for the '<em><b>Occi Sensor Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__OCCI_SENSOR_PERIOD = MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD;

	/**
	 * The feature id for the '<em><b>Occi Sensor Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__OCCI_SENSOR_GRANULARITY = MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY;

	/**
	 * The feature id for the '<em><b>Occi Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR__OCCI_SENSOR_ACCURACY = MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY;

	/**
	 * The number of structural features of the '<em>Cloudsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR_FEATURE_COUNT = MonitoringPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR___OCCI_CREATE = MonitoringPackage.SENSOR___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR___OCCI_RETRIEVE = MonitoringPackage.SENSOR___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR___OCCI_UPDATE = MonitoringPackage.SENSOR___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR___OCCI_DELETE = MonitoringPackage.SENSOR___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Cloudsensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDSENSOR_OPERATION_COUNT = MonitoringPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.CpuImpl <em>Cpu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.CpuImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getCpu()
	 * @generated
	 */
	int CPU = 1;

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
	 * The feature id for the '<em><b>Threshold Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__THRESHOLD_USAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__UTILIZATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threshold Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__THRESHOLD_TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Load Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__LOAD_AVG = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.DiskioImpl <em>Diskio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.DiskioImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getDiskio()
	 * @generated
	 */
	int DISKIO = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO__UNIT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disk Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO__DISK_WRITE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO__DISK_READ = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diskio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diskio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISKIO_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.RamImpl <em>Ram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.RamImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getRam()
	 * @generated
	 */
	int RAM = 3;

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
	 * The feature id for the '<em><b>Threshold Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__THRESHOLD_USAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__UTILIZATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threshold Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__THRESHOLD_TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__FREE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM__SWAP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.NetworkioImpl <em>Networkio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.NetworkioImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getNetworkio()
	 * @generated
	 */
	int NETWORKIO = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO__UNIT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO__NETWORK_IN = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO__NETWORK_OUT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Networkio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Networkio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKIO_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.InputoutputImpl <em>Inputoutput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.InputoutputImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getInputoutput()
	 * @generated
	 */
	int INPUTOUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTOUTPUT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTOUTPUT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTOUTPUT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTOUTPUT__UNIT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inputoutput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTOUTPUT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTOUTPUT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inputoutput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTOUTPUT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.SensorcontrolImpl <em>Sensorcontrol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.SensorcontrolImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getSensorcontrol()
	 * @generated
	 */
	int SENSORCONTROL = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Monitor State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL__MONITOR_STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensorcontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Startmonitoring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL___STARTMONITORING = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stopmonitoring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL___STOPMONITORING = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensorcontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORCONTROL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.EmfpublisherImpl <em>Emfpublisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.EmfpublisherImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getEmfpublisher()
	 * @generated
	 */
	int EMFPUBLISHER = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Publisher State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER__PUBLISHER_STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emfpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER___ENABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER___DISABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Emfpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFPUBLISHER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.SystemoutpublisherImpl <em>Systemoutpublisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.SystemoutpublisherImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getSystemoutpublisher()
	 * @generated
	 */
	int SYSTEMOUTPUBLISHER = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Publisher State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER__PUBLISHER_STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Systemoutpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER___ENABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER___DISABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Systemoutpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOUTPUBLISHER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.PublishercontrolImpl <em>Publishercontrol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.PublishercontrolImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getPublishercontrol()
	 * @generated
	 */
	int PUBLISHERCONTROL = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Publisher State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL__PUBLISHER_STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Publishercontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL___ENABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL___DISABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Publishercontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERCONTROL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.DiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.DiskImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getDisk()
	 * @generated
	 */
	int DISK = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Threshold Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__THRESHOLD_USAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__UTILIZATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threshold Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__THRESHOLD_TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__SWAP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__FREE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__VOLUME_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.MailpublisherImpl <em>Mailpublisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.MailpublisherImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getMailpublisher()
	 * @generated
	 */
	int MAILPUBLISHER = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Publisher State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__PUBLISHER_STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__MAIL_ADDRESS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post On Cpu Alert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__POST_ON_CPU_ALERT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post On Ram Alert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__POST_ON_RAM_ALERT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Post On Network IO Alert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Post On Disk IO Alert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__POST_ON_DISK_IO_ALERT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER__NB_EMAIL = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Mailpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER___ENABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER___DISABLE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mailpublisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILPUBLISHER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.MainmetricImpl <em>Mainmetric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.MainmetricImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getMainmetric()
	 * @generated
	 */
	int MAINMETRIC = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Threshold Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC__THRESHOLD_USAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC__UTILIZATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC__TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threshold Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC__THRESHOLD_TEMPERATURE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mainmetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mainmetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINMETRIC_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cloudmonitoring.impl.SupervisorapiconnectImpl <em>Supervisorapiconnect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.impl.SupervisorapiconnectImpl
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getSupervisorapiconnect()
	 * @generated
	 */
	int SUPERVISORAPICONNECT = 13;

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
	 * The meta object id for the '{@link cloudmonitoring.IOUnit <em>IO Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.IOUnit
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getIOUnit()
	 * @generated
	 */
	int IO_UNIT = 14;

	/**
	 * The meta object id for the '{@link cloudmonitoring.MonitorState <em>Monitor State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudmonitoring.MonitorState
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getMonitorState()
	 * @generated
	 */
	int MONITOR_STATE = 15;

	/**
	 * The meta object id for the '<em>Percent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getPercent()
	 * @generated
	 */
	int PERCENT = 16;

	/**
	 * The meta object id for the '<em>Average</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getAverage()
	 * @generated
	 */
	int AVERAGE = 17;

	/**
	 * The meta object id for the '<em>Per Sec</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getPerSec()
	 * @generated
	 */
	int PER_SEC = 18;

	/**
	 * The meta object id for the '<em>Temperature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 19;


	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Cloudsensor <em>Cloudsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudsensor</em>'.
	 * @see cloudmonitoring.Cloudsensor
	 * @generated
	 */
	EClass getCloudsensor();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Cpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu</em>'.
	 * @see cloudmonitoring.Cpu
	 * @generated
	 */
	EClass getCpu();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Cpu#getLoadAvg <em>Load Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Avg</em>'.
	 * @see cloudmonitoring.Cpu#getLoadAvg()
	 * @see #getCpu()
	 * @generated
	 */
	EAttribute getCpu_LoadAvg();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Cpu#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Cpu#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCpu__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Diskio <em>Diskio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diskio</em>'.
	 * @see cloudmonitoring.Diskio
	 * @generated
	 */
	EClass getDiskio();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Diskio#getDiskWrite <em>Disk Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Write</em>'.
	 * @see cloudmonitoring.Diskio#getDiskWrite()
	 * @see #getDiskio()
	 * @generated
	 */
	EAttribute getDiskio_DiskWrite();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Diskio#getDiskRead <em>Disk Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Read</em>'.
	 * @see cloudmonitoring.Diskio#getDiskRead()
	 * @see #getDiskio()
	 * @generated
	 */
	EAttribute getDiskio_DiskRead();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Diskio#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Diskio#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDiskio__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Ram <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ram</em>'.
	 * @see cloudmonitoring.Ram
	 * @generated
	 */
	EClass getRam();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Ram#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see cloudmonitoring.Ram#getFree()
	 * @see #getRam()
	 * @generated
	 */
	EAttribute getRam_Free();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Ram#getSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap</em>'.
	 * @see cloudmonitoring.Ram#getSwap()
	 * @see #getRam()
	 * @generated
	 */
	EAttribute getRam_Swap();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Ram#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Ram#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRam__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Networkio <em>Networkio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networkio</em>'.
	 * @see cloudmonitoring.Networkio
	 * @generated
	 */
	EClass getNetworkio();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Networkio#getNetworkIn <em>Network In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network In</em>'.
	 * @see cloudmonitoring.Networkio#getNetworkIn()
	 * @see #getNetworkio()
	 * @generated
	 */
	EAttribute getNetworkio_NetworkIn();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Networkio#getNetworkOut <em>Network Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Out</em>'.
	 * @see cloudmonitoring.Networkio#getNetworkOut()
	 * @see #getNetworkio()
	 * @generated
	 */
	EAttribute getNetworkio_NetworkOut();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Networkio#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Networkio#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNetworkio__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Inputoutput <em>Inputoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputoutput</em>'.
	 * @see cloudmonitoring.Inputoutput
	 * @generated
	 */
	EClass getInputoutput();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Inputoutput#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see cloudmonitoring.Inputoutput#getUnit()
	 * @see #getInputoutput()
	 * @generated
	 */
	EAttribute getInputoutput_Unit();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Inputoutput#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Inputoutput#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInputoutput__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Sensorcontrol <em>Sensorcontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensorcontrol</em>'.
	 * @see cloudmonitoring.Sensorcontrol
	 * @generated
	 */
	EClass getSensorcontrol();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Sensorcontrol#getMonitorState <em>Monitor State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor State</em>'.
	 * @see cloudmonitoring.Sensorcontrol#getMonitorState()
	 * @see #getSensorcontrol()
	 * @generated
	 */
	EAttribute getSensorcontrol_MonitorState();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Sensorcontrol#startmonitoring() <em>Startmonitoring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Startmonitoring</em>' operation.
	 * @see cloudmonitoring.Sensorcontrol#startmonitoring()
	 * @generated
	 */
	EOperation getSensorcontrol__Startmonitoring();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Sensorcontrol#stopmonitoring() <em>Stopmonitoring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stopmonitoring</em>' operation.
	 * @see cloudmonitoring.Sensorcontrol#stopmonitoring()
	 * @generated
	 */
	EOperation getSensorcontrol__Stopmonitoring();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Sensorcontrol#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Sensorcontrol#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSensorcontrol__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Emfpublisher <em>Emfpublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emfpublisher</em>'.
	 * @see cloudmonitoring.Emfpublisher
	 * @generated
	 */
	EClass getEmfpublisher();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Emfpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Emfpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmfpublisher__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Systemoutpublisher <em>Systemoutpublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemoutpublisher</em>'.
	 * @see cloudmonitoring.Systemoutpublisher
	 * @generated
	 */
	EClass getSystemoutpublisher();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Systemoutpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Systemoutpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSystemoutpublisher__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Publishercontrol <em>Publishercontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publishercontrol</em>'.
	 * @see cloudmonitoring.Publishercontrol
	 * @generated
	 */
	EClass getPublishercontrol();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Publishercontrol#getPublisherState <em>Publisher State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher State</em>'.
	 * @see cloudmonitoring.Publishercontrol#getPublisherState()
	 * @see #getPublishercontrol()
	 * @generated
	 */
	EAttribute getPublishercontrol_PublisherState();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Publishercontrol#enable() <em>Enable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable</em>' operation.
	 * @see cloudmonitoring.Publishercontrol#enable()
	 * @generated
	 */
	EOperation getPublishercontrol__Enable();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Publishercontrol#disable() <em>Disable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disable</em>' operation.
	 * @see cloudmonitoring.Publishercontrol#disable()
	 * @generated
	 */
	EOperation getPublishercontrol__Disable();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Publishercontrol#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Publishercontrol#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPublishercontrol__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see cloudmonitoring.Disk
	 * @generated
	 */
	EClass getDisk();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Disk#getSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap</em>'.
	 * @see cloudmonitoring.Disk#getSwap()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Swap();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Disk#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see cloudmonitoring.Disk#getFree()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Free();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Disk#getVolumeName <em>Volume Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Name</em>'.
	 * @see cloudmonitoring.Disk#getVolumeName()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_VolumeName();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Disk#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Disk#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDisk__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Mailpublisher <em>Mailpublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailpublisher</em>'.
	 * @see cloudmonitoring.Mailpublisher
	 * @generated
	 */
	EClass getMailpublisher();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mailpublisher#getMailAddress <em>Mail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail Address</em>'.
	 * @see cloudmonitoring.Mailpublisher#getMailAddress()
	 * @see #getMailpublisher()
	 * @generated
	 */
	EAttribute getMailpublisher_MailAddress();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mailpublisher#isPostOnCpuAlert <em>Post On Cpu Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post On Cpu Alert</em>'.
	 * @see cloudmonitoring.Mailpublisher#isPostOnCpuAlert()
	 * @see #getMailpublisher()
	 * @generated
	 */
	EAttribute getMailpublisher_PostOnCpuAlert();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mailpublisher#isPostOnRamAlert <em>Post On Ram Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post On Ram Alert</em>'.
	 * @see cloudmonitoring.Mailpublisher#isPostOnRamAlert()
	 * @see #getMailpublisher()
	 * @generated
	 */
	EAttribute getMailpublisher_PostOnRamAlert();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mailpublisher#isPostOnNetworkIOAlert <em>Post On Network IO Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post On Network IO Alert</em>'.
	 * @see cloudmonitoring.Mailpublisher#isPostOnNetworkIOAlert()
	 * @see #getMailpublisher()
	 * @generated
	 */
	EAttribute getMailpublisher_PostOnNetworkIOAlert();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mailpublisher#isPostOnDiskIOAlert <em>Post On Disk IO Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post On Disk IO Alert</em>'.
	 * @see cloudmonitoring.Mailpublisher#isPostOnDiskIOAlert()
	 * @see #getMailpublisher()
	 * @generated
	 */
	EAttribute getMailpublisher_PostOnDiskIOAlert();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mailpublisher#getNbEmail <em>Nb Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Email</em>'.
	 * @see cloudmonitoring.Mailpublisher#getNbEmail()
	 * @see #getMailpublisher()
	 * @generated
	 */
	EAttribute getMailpublisher_NbEmail();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Mailpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Mailpublisher#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMailpublisher__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Mainmetric <em>Mainmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainmetric</em>'.
	 * @see cloudmonitoring.Mainmetric
	 * @generated
	 */
	EClass getMainmetric();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mainmetric#getThresholdUsage <em>Threshold Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold Usage</em>'.
	 * @see cloudmonitoring.Mainmetric#getThresholdUsage()
	 * @see #getMainmetric()
	 * @generated
	 */
	EAttribute getMainmetric_ThresholdUsage();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mainmetric#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see cloudmonitoring.Mainmetric#getUtilization()
	 * @see #getMainmetric()
	 * @generated
	 */
	EAttribute getMainmetric_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mainmetric#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see cloudmonitoring.Mainmetric#getTemperature()
	 * @see #getMainmetric()
	 * @generated
	 */
	EAttribute getMainmetric_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Mainmetric#getThresholdTemperature <em>Threshold Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold Temperature</em>'.
	 * @see cloudmonitoring.Mainmetric#getThresholdTemperature()
	 * @see #getMainmetric()
	 * @generated
	 */
	EAttribute getMainmetric_ThresholdTemperature();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Mainmetric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Mainmetric#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMainmetric__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cloudmonitoring.Supervisorapiconnect <em>Supervisorapiconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supervisorapiconnect</em>'.
	 * @see cloudmonitoring.Supervisorapiconnect
	 * @generated
	 */
	EClass getSupervisorapiconnect();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Supervisorapiconnect#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see cloudmonitoring.Supervisorapiconnect#getUsername()
	 * @see #getSupervisorapiconnect()
	 * @generated
	 */
	EAttribute getSupervisorapiconnect_Username();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Supervisorapiconnect#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see cloudmonitoring.Supervisorapiconnect#getPassword()
	 * @see #getSupervisorapiconnect()
	 * @generated
	 */
	EAttribute getSupervisorapiconnect_Password();

	/**
	 * Returns the meta object for the attribute '{@link cloudmonitoring.Supervisorapiconnect#getHttpApiAddress <em>Http Api Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Api Address</em>'.
	 * @see cloudmonitoring.Supervisorapiconnect#getHttpApiAddress()
	 * @see #getSupervisorapiconnect()
	 * @generated
	 */
	EAttribute getSupervisorapiconnect_HttpApiAddress();

	/**
	 * Returns the meta object for the '{@link cloudmonitoring.Supervisorapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see cloudmonitoring.Supervisorapiconnect#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSupervisorapiconnect__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link cloudmonitoring.IOUnit <em>IO Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Unit</em>'.
	 * @see cloudmonitoring.IOUnit
	 * @generated
	 */
	EEnum getIOUnit();

	/**
	 * Returns the meta object for enum '{@link cloudmonitoring.MonitorState <em>Monitor State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitor State</em>'.
	 * @see cloudmonitoring.MonitorState
	 * @generated
	 */
	EEnum getMonitorState();

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
	CloudmonitoringFactory getCloudmonitoringFactory();

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
		 * The meta object literal for the '{@link cloudmonitoring.impl.CloudsensorImpl <em>Cloudsensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.CloudsensorImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getCloudsensor()
		 * @generated
		 */
		EClass CLOUDSENSOR = eINSTANCE.getCloudsensor();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.CpuImpl <em>Cpu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.CpuImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getCpu()
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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCpu__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.DiskioImpl <em>Diskio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.DiskioImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getDiskio()
		 * @generated
		 */
		EClass DISKIO = eINSTANCE.getDiskio();

		/**
		 * The meta object literal for the '<em><b>Disk Write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISKIO__DISK_WRITE = eINSTANCE.getDiskio_DiskWrite();

		/**
		 * The meta object literal for the '<em><b>Disk Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISKIO__DISK_READ = eINSTANCE.getDiskio_DiskRead();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISKIO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDiskio__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.RamImpl <em>Ram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.RamImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getRam()
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
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRam__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.NetworkioImpl <em>Networkio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.NetworkioImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getNetworkio()
		 * @generated
		 */
		EClass NETWORKIO = eINSTANCE.getNetworkio();

		/**
		 * The meta object literal for the '<em><b>Network In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKIO__NETWORK_IN = eINSTANCE.getNetworkio_NetworkIn();

		/**
		 * The meta object literal for the '<em><b>Network Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKIO__NETWORK_OUT = eINSTANCE.getNetworkio_NetworkOut();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORKIO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNetworkio__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.InputoutputImpl <em>Inputoutput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.InputoutputImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getInputoutput()
		 * @generated
		 */
		EClass INPUTOUTPUT = eINSTANCE.getInputoutput();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUTOUTPUT__UNIT = eINSTANCE.getInputoutput_Unit();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUTOUTPUT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInputoutput__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.SensorcontrolImpl <em>Sensorcontrol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.SensorcontrolImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getSensorcontrol()
		 * @generated
		 */
		EClass SENSORCONTROL = eINSTANCE.getSensorcontrol();

		/**
		 * The meta object literal for the '<em><b>Monitor State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSORCONTROL__MONITOR_STATE = eINSTANCE.getSensorcontrol_MonitorState();

		/**
		 * The meta object literal for the '<em><b>Startmonitoring</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSORCONTROL___STARTMONITORING = eINSTANCE.getSensorcontrol__Startmonitoring();

		/**
		 * The meta object literal for the '<em><b>Stopmonitoring</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSORCONTROL___STOPMONITORING = eINSTANCE.getSensorcontrol__Stopmonitoring();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSORCONTROL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSensorcontrol__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.EmfpublisherImpl <em>Emfpublisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.EmfpublisherImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getEmfpublisher()
		 * @generated
		 */
		EClass EMFPUBLISHER = eINSTANCE.getEmfpublisher();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMFPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmfpublisher__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.SystemoutpublisherImpl <em>Systemoutpublisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.SystemoutpublisherImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getSystemoutpublisher()
		 * @generated
		 */
		EClass SYSTEMOUTPUBLISHER = eINSTANCE.getSystemoutpublisher();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEMOUTPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSystemoutpublisher__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.PublishercontrolImpl <em>Publishercontrol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.PublishercontrolImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getPublishercontrol()
		 * @generated
		 */
		EClass PUBLISHERCONTROL = eINSTANCE.getPublishercontrol();

		/**
		 * The meta object literal for the '<em><b>Publisher State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHERCONTROL__PUBLISHER_STATE = eINSTANCE.getPublishercontrol_PublisherState();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLISHERCONTROL___ENABLE = eINSTANCE.getPublishercontrol__Enable();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLISHERCONTROL___DISABLE = eINSTANCE.getPublishercontrol__Disable();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLISHERCONTROL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPublishercontrol__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.DiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.DiskImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getDisk()
		 * @generated
		 */
		EClass DISK = eINSTANCE.getDisk();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__SWAP = eINSTANCE.getDisk_Swap();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__FREE = eINSTANCE.getDisk_Free();

		/**
		 * The meta object literal for the '<em><b>Volume Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__VOLUME_NAME = eINSTANCE.getDisk_VolumeName();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDisk__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.MailpublisherImpl <em>Mailpublisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.MailpublisherImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getMailpublisher()
		 * @generated
		 */
		EClass MAILPUBLISHER = eINSTANCE.getMailpublisher();

		/**
		 * The meta object literal for the '<em><b>Mail Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILPUBLISHER__MAIL_ADDRESS = eINSTANCE.getMailpublisher_MailAddress();

		/**
		 * The meta object literal for the '<em><b>Post On Cpu Alert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILPUBLISHER__POST_ON_CPU_ALERT = eINSTANCE.getMailpublisher_PostOnCpuAlert();

		/**
		 * The meta object literal for the '<em><b>Post On Ram Alert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILPUBLISHER__POST_ON_RAM_ALERT = eINSTANCE.getMailpublisher_PostOnRamAlert();

		/**
		 * The meta object literal for the '<em><b>Post On Network IO Alert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT = eINSTANCE.getMailpublisher_PostOnNetworkIOAlert();

		/**
		 * The meta object literal for the '<em><b>Post On Disk IO Alert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILPUBLISHER__POST_ON_DISK_IO_ALERT = eINSTANCE.getMailpublisher_PostOnDiskIOAlert();

		/**
		 * The meta object literal for the '<em><b>Nb Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILPUBLISHER__NB_EMAIL = eINSTANCE.getMailpublisher_NbEmail();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAILPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMailpublisher__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.MainmetricImpl <em>Mainmetric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.MainmetricImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getMainmetric()
		 * @generated
		 */
		EClass MAINMETRIC = eINSTANCE.getMainmetric();

		/**
		 * The meta object literal for the '<em><b>Threshold Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINMETRIC__THRESHOLD_USAGE = eINSTANCE.getMainmetric_ThresholdUsage();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINMETRIC__UTILIZATION = eINSTANCE.getMainmetric_Utilization();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINMETRIC__TEMPERATURE = eINSTANCE.getMainmetric_Temperature();

		/**
		 * The meta object literal for the '<em><b>Threshold Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINMETRIC__THRESHOLD_TEMPERATURE = eINSTANCE.getMainmetric_ThresholdTemperature();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMainmetric__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.impl.SupervisorapiconnectImpl <em>Supervisorapiconnect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.impl.SupervisorapiconnectImpl
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getSupervisorapiconnect()
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
		 * The meta object literal for the '{@link cloudmonitoring.IOUnit <em>IO Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.IOUnit
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getIOUnit()
		 * @generated
		 */
		EEnum IO_UNIT = eINSTANCE.getIOUnit();

		/**
		 * The meta object literal for the '{@link cloudmonitoring.MonitorState <em>Monitor State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudmonitoring.MonitorState
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getMonitorState()
		 * @generated
		 */
		EEnum MONITOR_STATE = eINSTANCE.getMonitorState();

		/**
		 * The meta object literal for the '<em>Percent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getPercent()
		 * @generated
		 */
		EDataType PERCENT = eINSTANCE.getPercent();

		/**
		 * The meta object literal for the '<em>Average</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getAverage()
		 * @generated
		 */
		EDataType AVERAGE = eINSTANCE.getAverage();

		/**
		 * The meta object literal for the '<em>Per Sec</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getPerSec()
		 * @generated
		 */
		EDataType PER_SEC = eINSTANCE.getPerSec();

		/**
		 * The meta object literal for the '<em>Temperature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see cloudmonitoring.impl.CloudmonitoringPackageImpl#getTemperature()
		 * @generated
		 */
		EDataType TEMPERATURE = eINSTANCE.getTemperature();

	}

} //CloudmonitoringPackage
