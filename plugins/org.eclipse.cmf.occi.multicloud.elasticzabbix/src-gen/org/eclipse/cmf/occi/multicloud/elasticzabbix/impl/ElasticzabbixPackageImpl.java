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
package org.eclipse.cmf.occi.multicloud.elasticzabbix.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixFactory;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixsensor;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.util.ElasticzabbixValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticzabbixPackageImpl extends EPackageImpl implements ElasticzabbixPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zabbixcollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zabbixsensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zabbixapiconnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supervisorapiconnectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType perSecEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType averageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType temperatureEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElasticzabbixPackageImpl() {
		super(eNS_URI, ElasticzabbixFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ElasticzabbixPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElasticzabbixPackage init() {
		if (isInited) return (ElasticzabbixPackage)EPackage.Registry.INSTANCE.getEPackage(ElasticzabbixPackage.eNS_URI);

		// Obtain or create and register package
		ElasticzabbixPackageImpl theElasticzabbixPackage = (ElasticzabbixPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElasticzabbixPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElasticzabbixPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MonitoringPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theElasticzabbixPackage.createPackageContents();

		// Initialize created meta-data
		theElasticzabbixPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theElasticzabbixPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ElasticzabbixValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theElasticzabbixPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElasticzabbixPackage.eNS_URI, theElasticzabbixPackage);
		return theElasticzabbixPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZabbixcollector() {
		return zabbixcollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixcollector_InstanceIp() {
		return (EAttribute)zabbixcollectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixcollector_InstanceName() {
		return (EAttribute)zabbixcollectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZabbixsensor() {
		return zabbixsensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZabbixapiconnect() {
		return zabbixapiconnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixapiconnect_TemplateName() {
		return (EAttribute)zabbixapiconnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixapiconnect_HostGroupName() {
		return (EAttribute)zabbixapiconnectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixapiconnect_Port() {
		return (EAttribute)zabbixapiconnectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZabbixapiconnect__AppliesConstraint__DiagnosticChain_Map() {
		return zabbixapiconnectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpu() {
		return cpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpu_LoadAvg() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpu_CpuUsed() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpu__AppliesConstraint__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupervisorapiconnect() {
		return supervisorapiconnectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisorapiconnect_Username() {
		return (EAttribute)supervisorapiconnectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisorapiconnect_Password() {
		return (EAttribute)supervisorapiconnectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisorapiconnect_HttpApiAddress() {
		return (EAttribute)supervisorapiconnectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSupervisorapiconnect__AppliesConstraint__DiagnosticChain_Map() {
		return supervisorapiconnectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRam() {
		return ramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRam_Free() {
		return (EAttribute)ramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRam_Swap() {
		return (EAttribute)ramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRam_RamUsed() {
		return (EAttribute)ramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRam__AppliesConstraint__DiagnosticChain_Map() {
		return ramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercent() {
		return percentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPerSec() {
		return perSecEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAverage() {
		return averageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTemperature() {
		return temperatureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticzabbixFactory getElasticzabbixFactory() {
		return (ElasticzabbixFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		zabbixcollectorEClass = createEClass(ZABBIXCOLLECTOR);
		createEAttribute(zabbixcollectorEClass, ZABBIXCOLLECTOR__INSTANCE_IP);
		createEAttribute(zabbixcollectorEClass, ZABBIXCOLLECTOR__INSTANCE_NAME);

		zabbixsensorEClass = createEClass(ZABBIXSENSOR);

		zabbixapiconnectEClass = createEClass(ZABBIXAPICONNECT);
		createEAttribute(zabbixapiconnectEClass, ZABBIXAPICONNECT__TEMPLATE_NAME);
		createEAttribute(zabbixapiconnectEClass, ZABBIXAPICONNECT__HOST_GROUP_NAME);
		createEAttribute(zabbixapiconnectEClass, ZABBIXAPICONNECT__PORT);
		createEOperation(zabbixapiconnectEClass, ZABBIXAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		cpuEClass = createEClass(CPU);
		createEAttribute(cpuEClass, CPU__LOAD_AVG);
		createEAttribute(cpuEClass, CPU__CPU_USED);
		createEOperation(cpuEClass, CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		supervisorapiconnectEClass = createEClass(SUPERVISORAPICONNECT);
		createEAttribute(supervisorapiconnectEClass, SUPERVISORAPICONNECT__USERNAME);
		createEAttribute(supervisorapiconnectEClass, SUPERVISORAPICONNECT__PASSWORD);
		createEAttribute(supervisorapiconnectEClass, SUPERVISORAPICONNECT__HTTP_API_ADDRESS);
		createEOperation(supervisorapiconnectEClass, SUPERVISORAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ramEClass = createEClass(RAM);
		createEAttribute(ramEClass, RAM__FREE);
		createEAttribute(ramEClass, RAM__SWAP);
		createEAttribute(ramEClass, RAM__RAM_USED);
		createEOperation(ramEClass, RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create data types
		percentEDataType = createEDataType(PERCENT);
		perSecEDataType = createEDataType(PER_SEC);
		averageEDataType = createEDataType(AVERAGE);
		temperatureEDataType = createEDataType(TEMPERATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MonitoringPackage theMonitoringPackage = (MonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(MonitoringPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		zabbixcollectorEClass.getESuperTypes().add(theMonitoringPackage.getCollector());
		zabbixsensorEClass.getESuperTypes().add(theMonitoringPackage.getSensor());
		zabbixapiconnectEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		zabbixapiconnectEClass.getESuperTypes().add(this.getSupervisorapiconnect());
		cpuEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cpuEClass.getESuperTypes().add(theMonitoringPackage.getMetric());
		supervisorapiconnectEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ramEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ramEClass.getESuperTypes().add(theMonitoringPackage.getMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(zabbixcollectorEClass, Zabbixcollector.class, "Zabbixcollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZabbixcollector_InstanceIp(), theOCCIPackage.getString(), "instanceIp", null, 0, 1, Zabbixcollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixcollector_InstanceName(), theOCCIPackage.getString(), "instanceName", null, 0, 1, Zabbixcollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zabbixsensorEClass, Zabbixsensor.class, "Zabbixsensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zabbixapiconnectEClass, Zabbixapiconnect.class, "Zabbixapiconnect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZabbixapiconnect_TemplateName(), theOCCIPackage.getString(), "templateName", null, 0, 1, Zabbixapiconnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixapiconnect_HostGroupName(), theOCCIPackage.getString(), "hostGroupName", null, 0, 1, Zabbixapiconnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixapiconnect_Port(), theOCCIPackage.getInteger(), "port", null, 0, 1, Zabbixapiconnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getZabbixapiconnect__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cpuEClass, Cpu.class, "Cpu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpu_LoadAvg(), this.getPercent(), "loadAvg", null, 0, 1, Cpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpu_CpuUsed(), this.getPercent(), "cpuUsed", null, 0, 1, Cpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCpu__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(supervisorapiconnectEClass, Supervisorapiconnect.class, "Supervisorapiconnect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupervisorapiconnect_Username(), theOCCIPackage.getString(), "username", null, 0, 1, Supervisorapiconnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisorapiconnect_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Supervisorapiconnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisorapiconnect_HttpApiAddress(), theOCCIPackage.getString(), "httpApiAddress", null, 0, 1, Supervisorapiconnect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSupervisorapiconnect__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ramEClass, Ram.class, "Ram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRam_Free(), this.getPercent(), "free", null, 0, 1, Ram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRam_Swap(), this.getPercent(), "swap", null, 0, 1, Ram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRam_RamUsed(), this.getPercent(), "ramUsed", null, 0, 1, Ram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRam__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(percentEDataType, Double.class, "Percent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(perSecEDataType, Double.class, "PerSec", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(averageEDataType, Double.class, "Average", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(temperatureEDataType, Double.class, "Temperature", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (zabbixapiconnectEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (cpuEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (supervisorapiconnectEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (ramEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (percentEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0.0"
		   });	
		addAnnotation
		  (perSecEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0.0"
		   });	
		addAnnotation
		  (averageEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0.0",
			 "MinExclusive", ""
		   });
	}

} //ElasticzabbixPackageImpl
