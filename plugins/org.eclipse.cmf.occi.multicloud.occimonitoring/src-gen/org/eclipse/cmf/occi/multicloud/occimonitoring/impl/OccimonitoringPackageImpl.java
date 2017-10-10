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
package org.eclipse.cmf.occi.multicloud.occimonitoring.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.multicloud.occimonitoring.Cpuusage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroulink;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroup;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Memoryusage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Metrics;
import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringFactory;
import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Templatelink;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate;

import org.eclipse.cmf.occi.multicloud.occimonitoring.util.OccimonitoringValidator;

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
public class OccimonitoringPackageImpl extends EPackageImpl implements OccimonitoringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zabbixinstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zabbixtemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostgroulinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templatelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuusageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryusageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OccimonitoringPackageImpl() {
		super(eNS_URI, OccimonitoringFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OccimonitoringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OccimonitoringPackage init() {
		if (isInited) return (OccimonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(OccimonitoringPackage.eNS_URI);

		// Obtain or create and register package
		OccimonitoringPackageImpl theOccimonitoringPackage = (OccimonitoringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OccimonitoringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OccimonitoringPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOccimonitoringPackage.createPackageContents();

		// Initialize created meta-data
		theOccimonitoringPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOccimonitoringPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OccimonitoringValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOccimonitoringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OccimonitoringPackage.eNS_URI, theOccimonitoringPackage);
		return theOccimonitoringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZabbixinstance() {
		return zabbixinstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixinstance_ZabbixinstancePort() {
		return (EAttribute)zabbixinstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixinstance_ZabbixinstanceIdentifier() {
		return (EAttribute)zabbixinstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixinstance_ZabbixinstanceIp() {
		return (EAttribute)zabbixinstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostgroup() {
		return hostgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostgroup_HostgroupIdentifier() {
		return (EAttribute)hostgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZabbixtemplate() {
		return zabbixtemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixtemplate_ZabbixtemplateIdentifier() {
		return (EAttribute)zabbixtemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixtemplate_ZabbixtemplateHostgid() {
		return (EAttribute)zabbixtemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixtemplate_ZabbixtemplateHostsids() {
		return (EAttribute)zabbixtemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostgroulink() {
		return hostgroulinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostgroulink__TargetConstraint__DiagnosticChain_Map() {
		return hostgroulinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplatelink() {
		return templatelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplatelink__TargetConstraint__DiagnosticChain_Map() {
		return templatelinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetrics() {
		return metricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetrics__AppliesConstraint__DiagnosticChain_Map() {
		return metricsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuusage() {
		return cpuusageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpuusage_CpuUsageCpuUsage() {
		return (EAttribute)cpuusageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpuusage__Getmetric() {
		return cpuusageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpuusage__AppliesConstraint__DiagnosticChain_Map() {
		return cpuusageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryusage() {
		return memoryusageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryusage_MemoryUsageMemUsage() {
		return (EAttribute)memoryusageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemoryusage__Getmetric() {
		return memoryusageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemoryusage__AppliesConstraint__DiagnosticChain_Map() {
		return memoryusageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccimonitoringFactory getOccimonitoringFactory() {
		return (OccimonitoringFactory)getEFactoryInstance();
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
		zabbixinstanceEClass = createEClass(ZABBIXINSTANCE);
		createEAttribute(zabbixinstanceEClass, ZABBIXINSTANCE__ZABBIXINSTANCE_PORT);
		createEAttribute(zabbixinstanceEClass, ZABBIXINSTANCE__ZABBIXINSTANCE_IDENTIFIER);
		createEAttribute(zabbixinstanceEClass, ZABBIXINSTANCE__ZABBIXINSTANCE_IP);

		hostgroupEClass = createEClass(HOSTGROUP);
		createEAttribute(hostgroupEClass, HOSTGROUP__HOSTGROUP_IDENTIFIER);

		zabbixtemplateEClass = createEClass(ZABBIXTEMPLATE);
		createEAttribute(zabbixtemplateEClass, ZABBIXTEMPLATE__ZABBIXTEMPLATE_IDENTIFIER);
		createEAttribute(zabbixtemplateEClass, ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTGID);
		createEAttribute(zabbixtemplateEClass, ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTSIDS);

		hostgroulinkEClass = createEClass(HOSTGROULINK);
		createEOperation(hostgroulinkEClass, HOSTGROULINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		templatelinkEClass = createEClass(TEMPLATELINK);
		createEOperation(templatelinkEClass, TEMPLATELINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		metricsEClass = createEClass(METRICS);
		createEOperation(metricsEClass, METRICS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		cpuusageEClass = createEClass(CPUUSAGE);
		createEAttribute(cpuusageEClass, CPUUSAGE__CPU_USAGE_CPU_USAGE);
		createEOperation(cpuusageEClass, CPUUSAGE___GETMETRIC);
		createEOperation(cpuusageEClass, CPUUSAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		memoryusageEClass = createEClass(MEMORYUSAGE);
		createEAttribute(memoryusageEClass, MEMORYUSAGE__MEMORY_USAGE_MEM_USAGE);
		createEOperation(memoryusageEClass, MEMORYUSAGE___GETMETRIC);
		createEOperation(memoryusageEClass, MEMORYUSAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create data types
		doubleEDataType = createEDataType(DOUBLE);
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
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		zabbixinstanceEClass.getESuperTypes().add(theOCCIPackage.getResource());
		hostgroupEClass.getESuperTypes().add(theOCCIPackage.getResource());
		zabbixtemplateEClass.getESuperTypes().add(theOCCIPackage.getResource());
		hostgroulinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		templatelinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		metricsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cpuusageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cpuusageEClass.getESuperTypes().add(this.getMetrics());
		memoryusageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		memoryusageEClass.getESuperTypes().add(this.getMetrics());

		// Initialize classes, features, and operations; add parameters
		initEClass(zabbixinstanceEClass, Zabbixinstance.class, "Zabbixinstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZabbixinstance_ZabbixinstancePort(), theOCCIPackage.getInteger(), "zabbixinstancePort", null, 0, 1, Zabbixinstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixinstance_ZabbixinstanceIdentifier(), theOCCIPackage.getInteger(), "zabbixinstanceIdentifier", null, 0, 1, Zabbixinstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixinstance_ZabbixinstanceIp(), theOCCIPackage.getString(), "zabbixinstanceIp", null, 0, 1, Zabbixinstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostgroupEClass, Hostgroup.class, "Hostgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostgroup_HostgroupIdentifier(), theOCCIPackage.getInteger(), "hostgroupIdentifier", null, 0, 1, Hostgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zabbixtemplateEClass, Zabbixtemplate.class, "Zabbixtemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZabbixtemplate_ZabbixtemplateIdentifier(), theOCCIPackage.getInteger(), "zabbixtemplateIdentifier", null, 0, 1, Zabbixtemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixtemplate_ZabbixtemplateHostgid(), theOCCIPackage.getInteger(), "zabbixtemplateHostgid", null, 0, 1, Zabbixtemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixtemplate_ZabbixtemplateHostsids(), theOCCIPackage.getInteger(), "zabbixtemplateHostsids", null, 0, 1, Zabbixtemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostgroulinkEClass, Hostgroulink.class, "Hostgroulink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHostgroulink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(templatelinkEClass, Templatelink.class, "Templatelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTemplatelink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(metricsEClass, Metrics.class, "Metrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMetrics__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cpuusageEClass, Cpuusage.class, "Cpuusage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpuusage_CpuUsageCpuUsage(), this.getDouble(), "cpuUsageCpuUsage", null, 0, 1, Cpuusage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCpuusage__Getmetric(), null, "getmetric", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCpuusage__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(memoryusageEClass, Memoryusage.class, "Memoryusage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryusage_MemoryUsageMemUsage(), this.getDouble(), "memoryUsageMemUsage", null, 0, 1, Memoryusage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMemoryusage__Getmetric(), null, "getmetric", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemoryusage__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(doubleEDataType, Double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
		  (hostgroulinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (templatelinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (metricsEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (cpuusageEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (memoryusageEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

} //OccimonitoringPackageImpl
