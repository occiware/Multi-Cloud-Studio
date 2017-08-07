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

import cloudmonitoring.CloudmonitoringPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixFactory;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixPackage;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixcollector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZabbixPackageImpl extends EPackageImpl implements ZabbixPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zabbixcollectorEClass = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ZabbixPackageImpl() {
		super(eNS_URI, ZabbixFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ZabbixPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ZabbixPackage init() {
		if (isInited) return (ZabbixPackage)EPackage.Registry.INSTANCE.getEPackage(ZabbixPackage.eNS_URI);

		// Obtain or create and register package
		ZabbixPackageImpl theZabbixPackage = (ZabbixPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ZabbixPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ZabbixPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MonitoringPackage.eINSTANCE.eClass();
		CloudmonitoringPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theZabbixPackage.createPackageContents();

		// Initialize created meta-data
		theZabbixPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theZabbixPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ZabbixPackage.eNS_URI, theZabbixPackage);
		return theZabbixPackage;
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
	public ZabbixFactory getZabbixFactory() {
		return (ZabbixFactory)getEFactoryInstance();
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		zabbixcollectorEClass.getESuperTypes().add(theMonitoringPackage.getCollector());

		// Initialize classes, features, and operations; add parameters
		initEClass(zabbixcollectorEClass, Zabbixcollector.class, "Zabbixcollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
	}

} //ZabbixPackageImpl
