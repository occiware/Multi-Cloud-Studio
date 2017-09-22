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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalelasticcontoller;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityFactory;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instance;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkbalancer;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scalingstrategy;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.util.HorizontalelasticityValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class HorizontalelasticityPackageImpl extends EPackageImpl implements HorizontalelasticityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadbalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalelasticcontollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingstrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancegrouplinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkbalancerEClass = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HorizontalelasticityPackageImpl() {
		super(eNS_URI, HorizontalelasticityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HorizontalelasticityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HorizontalelasticityPackage init() {
		if (isInited) return (HorizontalelasticityPackage)EPackage.Registry.INSTANCE.getEPackage(HorizontalelasticityPackage.eNS_URI);

		// Obtain or create and register package
		HorizontalelasticityPackageImpl theHorizontalelasticityPackage = (HorizontalelasticityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HorizontalelasticityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HorizontalelasticityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHorizontalelasticityPackage.createPackageContents();

		// Initialize created meta-data
		theHorizontalelasticityPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHorizontalelasticityPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HorizontalelasticityValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHorizontalelasticityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HorizontalelasticityPackage.eNS_URI, theHorizontalelasticityPackage);
		return theHorizontalelasticityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalgroup() {
		return horizontalgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalGroupName() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalGroupGroupSize() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalGroupMaximum() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalGroupMinimum() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalGroupTemplateName() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalGroupLoadBalancer() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHorizontalgroup__Create() {
		return horizontalgroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadbalancer() {
		return loadbalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadbalancer_LoadbalancerName() {
		return (EAttribute)loadbalancerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadbalancer_LoadbalancerInstanceIP() {
		return (EAttribute)loadbalancerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadbalancer_LoadbalancerAddress() {
		return (EAttribute)loadbalancerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancer__Addbackendserver() {
		return loadbalancerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalancer__Removebackendserver() {
		return loadbalancerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalelasticcontoller() {
		return horizontalelasticcontollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingstrategy() {
		return scalingstrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManual() {
		return manualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManual_ManualGroupSize() {
		return (EAttribute)manualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManual__Start() {
		return manualEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamic() {
		return dynamicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancegrouplink() {
		return instancegrouplinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstancegrouplink__TargetConstraint__DiagnosticChain_Map() {
		return instancegrouplinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkbalancer() {
		return linkbalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkbalancer__TargetConstraint__DiagnosticChain_Map() {
		return linkbalancerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityFactory getHorizontalelasticityFactory() {
		return (HorizontalelasticityFactory)getEFactoryInstance();
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
		horizontalgroupEClass = createEClass(HORIZONTALGROUP);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER);
		createEOperation(horizontalgroupEClass, HORIZONTALGROUP___CREATE);

		loadbalancerEClass = createEClass(LOADBALANCER);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_NAME);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_INSTANCE_IP);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_ADDRESS);
		createEOperation(loadbalancerEClass, LOADBALANCER___ADDBACKENDSERVER);
		createEOperation(loadbalancerEClass, LOADBALANCER___REMOVEBACKENDSERVER);

		instanceEClass = createEClass(INSTANCE);

		horizontalelasticcontollerEClass = createEClass(HORIZONTALELASTICCONTOLLER);

		scalingstrategyEClass = createEClass(SCALINGSTRATEGY);

		manualEClass = createEClass(MANUAL);
		createEAttribute(manualEClass, MANUAL__MANUAL_GROUP_SIZE);
		createEOperation(manualEClass, MANUAL___START);

		dynamicEClass = createEClass(DYNAMIC);

		instancegrouplinkEClass = createEClass(INSTANCEGROUPLINK);
		createEOperation(instancegrouplinkEClass, INSTANCEGROUPLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		linkbalancerEClass = createEClass(LINKBALANCER);
		createEOperation(linkbalancerEClass, LINKBALANCER___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
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
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		horizontalgroupEClass.getESuperTypes().add(theOCCIPackage.getResource());
		loadbalancerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		instanceEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		horizontalelasticcontollerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		scalingstrategyEClass.getESuperTypes().add(this.getHorizontalelasticcontoller());
		manualEClass.getESuperTypes().add(this.getScalingstrategy());
		dynamicEClass.getESuperTypes().add(this.getScalingstrategy());
		instancegrouplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		linkbalancerEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(horizontalgroupEClass, Horizontalgroup.class, "Horizontalgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalgroup_HorizontalGroupName(), theOCCIPackage.getString(), "HorizontalGroupName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupGroupSize(), theOCCIPackage.getInteger(), "HorizontalGroupGroupSize", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupMaximum(), theOCCIPackage.getInteger(), "HorizontalGroupMaximum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupMinimum(), theOCCIPackage.getInteger(), "HorizontalGroupMinimum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupTemplateName(), theOCCIPackage.getString(), "HorizontalGroupTemplateName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupLoadBalancer(), theOCCIPackage.getString(), "HorizontalGroupLoadBalancer", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHorizontalgroup__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loadbalancerEClass, Loadbalancer.class, "Loadbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadbalancer_LoadbalancerName(), theOCCIPackage.getString(), "LoadbalancerName", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerInstanceIP(), theOCCIPackage.getString(), "LoadbalancerInstanceIP", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerAddress(), theOCCIPackage.getString(), "LoadbalancerAddress", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLoadbalancer__Addbackendserver(), null, "addbackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLoadbalancer__Removebackendserver(), null, "removebackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(horizontalelasticcontollerEClass, Horizontalelasticcontoller.class, "Horizontalelasticcontoller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalingstrategyEClass, Scalingstrategy.class, "Scalingstrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManual_ManualGroupSize(), theOCCIPackage.getInteger(), "ManualGroupSize", null, 0, 1, Manual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getManual__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dynamicEClass, org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic.class, "Dynamic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instancegrouplinkEClass, Instancegrouplink.class, "Instancegrouplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getInstancegrouplink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkbalancerEClass, Linkbalancer.class, "Linkbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLinkbalancer__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (instancegrouplinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (linkbalancerEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });
	}

} //HorizontalelasticityPackageImpl
