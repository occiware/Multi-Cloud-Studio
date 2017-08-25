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
package org.eclipse.cmf.occi.multicloud.elasticocci.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType;
import org.eclipse.cmf.occi.multicloud.elasticocci.Elasticcontroller;
import org.eclipse.cmf.occi.multicloud.elasticocci.Elasticlink;
import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciFactory;
import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage;
import org.eclipse.cmf.occi.multicloud.elasticocci.ModeType;
import org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategy;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory;

import org.eclipse.cmf.occi.multicloud.elasticocci.util.ElasticocciValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class ElasticocciPackageImpl extends EPackageImpl implements ElasticocciPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticcontrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategycomputeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategycpuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategymemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTypeEDataType = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElasticocciPackageImpl() {
		super(eNS_URI, ElasticocciFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElasticocciPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElasticocciPackage init() {
		if (isInited) return (ElasticocciPackage)EPackage.Registry.INSTANCE.getEPackage(ElasticocciPackage.eNS_URI);

		// Obtain or create and register package
		ElasticocciPackageImpl theElasticocciPackage = (ElasticocciPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElasticocciPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElasticocciPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theElasticocciPackage.createPackageContents();

		// Initialize created meta-data
		theElasticocciPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theElasticocciPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ElasticocciValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theElasticocciPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElasticocciPackage.eNS_URI, theElasticocciPackage);
		return theElasticocciPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElasticcontroller() {
		return elasticcontrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElasticlink() {
		return elasticlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElasticlink__TargetConstraint__DiagnosticChain_Map() {
		return elasticlinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategy__AppliesConstraint__DiagnosticChain_Map() {
		return strategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategycompute() {
		return strategycomputeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycompute_StrategyComputeUthreshold() {
		return (EAttribute)strategycomputeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycompute_StrategyComputeBreathDown() {
		return (EAttribute)strategycomputeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycompute_StrategyComputeBreathUp() {
		return (EAttribute)strategycomputeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycompute_StrategyComputePollTime() {
		return (EAttribute)strategycomputeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycompute_StrategyComputeLthreshold() {
		return (EAttribute)strategycomputeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategycpu() {
		return strategycpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUUpperLimit() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPULowerLimit() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUMode() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUDirection() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUStepCPUDecrease() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUStepCPUIncrease() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUDate() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUIncreaseRelationalOp() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategycpu_StrategyCPUDecreaseRelationalOp() {
		return (EAttribute)strategycpuEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategycpu__Start() {
		return strategycpuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategycpu__Stop() {
		return strategycpuEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategycpu__AppliesConstraint__DiagnosticChain_Map() {
		return strategycpuEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategymemory() {
		return strategymemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryMode() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryDirection() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryStepMemDecrease() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryStepMemIncrease() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryUpperLimit() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryLowerLimit() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryDate() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryIncreaseRelationalOp() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategymemory_StrategyMemoryDecreaseRelationalOp() {
		return (EAttribute)strategymemoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategymemory__Stop() {
		return strategymemoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategymemory__Start() {
		return strategymemoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategymemory__AppliesConstraint__DiagnosticChain_Map() {
		return strategymemoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeType() {
		return modeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalType() {
		return relationalTypeEEnum;
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
	public EDataType getDateType() {
		return dateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticocciFactory getElasticocciFactory() {
		return (ElasticocciFactory)getEFactoryInstance();
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
		elasticcontrollerEClass = createEClass(ELASTICCONTROLLER);

		elasticlinkEClass = createEClass(ELASTICLINK);
		createEOperation(elasticlinkEClass, ELASTICLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		strategyEClass = createEClass(STRATEGY);
		createEOperation(strategyEClass, STRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		strategycomputeEClass = createEClass(STRATEGYCOMPUTE);
		createEAttribute(strategycomputeEClass, STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD);
		createEAttribute(strategycomputeEClass, STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN);
		createEAttribute(strategycomputeEClass, STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP);
		createEAttribute(strategycomputeEClass, STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME);
		createEAttribute(strategycomputeEClass, STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD);

		strategycpuEClass = createEClass(STRATEGYCPU);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_MODE);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_DIRECTION);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_DATE);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP);
		createEAttribute(strategycpuEClass, STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP);
		createEOperation(strategycpuEClass, STRATEGYCPU___START);
		createEOperation(strategycpuEClass, STRATEGYCPU___STOP);
		createEOperation(strategycpuEClass, STRATEGYCPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		strategymemoryEClass = createEClass(STRATEGYMEMORY);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_MODE);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_DATE);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP);
		createEAttribute(strategymemoryEClass, STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP);
		createEOperation(strategymemoryEClass, STRATEGYMEMORY___STOP);
		createEOperation(strategymemoryEClass, STRATEGYMEMORY___START);
		createEOperation(strategymemoryEClass, STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create enums
		modeTypeEEnum = createEEnum(MODE_TYPE);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		relationalTypeEEnum = createEEnum(RELATIONAL_TYPE);

		// Create data types
		doubleEDataType = createEDataType(DOUBLE);
		dateTypeEDataType = createEDataType(DATE_TYPE);
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
		elasticcontrollerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		elasticlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		strategyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		strategycomputeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		strategycomputeEClass.getESuperTypes().add(this.getStrategy());
		strategycpuEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		strategycpuEClass.getESuperTypes().add(this.getStrategycompute());
		strategymemoryEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		strategymemoryEClass.getESuperTypes().add(this.getStrategycompute());

		// Initialize classes, features, and operations; add parameters
		initEClass(elasticcontrollerEClass, Elasticcontroller.class, "Elasticcontroller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elasticlinkEClass, Elasticlink.class, "Elasticlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getElasticlink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStrategy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strategycomputeEClass, Strategycompute.class, "Strategycompute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategycompute_StrategyComputeUthreshold(), theOCCIPackage.getInteger(), "StrategyComputeUthreshold", "90", 0, 1, Strategycompute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycompute_StrategyComputeBreathDown(), theOCCIPackage.getInteger(), "StrategyComputeBreathDown", "20000", 0, 1, Strategycompute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycompute_StrategyComputeBreathUp(), theOCCIPackage.getInteger(), "StrategyComputeBreathUp", "40000", 0, 1, Strategycompute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycompute_StrategyComputePollTime(), theOCCIPackage.getInteger(), "StrategyComputePollTime", "10000", 0, 1, Strategycompute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycompute_StrategyComputeLthreshold(), theOCCIPackage.getInteger(), "StrategyComputeLthreshold", "70", 0, 1, Strategycompute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategycpuEClass, Strategycpu.class, "Strategycpu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategycpu_StrategyCPUUpperLimit(), theOCCIPackage.getInteger(), "StrategyCPUUpperLimit", "7", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPULowerLimit(), theOCCIPackage.getInteger(), "StrategyCPULowerLimit", "1", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPUMode(), this.getModeType(), "StrategyCPUMode", "dynamic", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPUDirection(), this.getDirectionType(), "StrategyCPUDirection", "up", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPUStepCPUDecrease(), theOCCIPackage.getInteger(), "StrategyCPUStepCPUDecrease", "1", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPUStepCPUIncrease(), theOCCIPackage.getInteger(), "StrategyCPUStepCPUIncrease", "1", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPUDate(), this.getDateType(), "StrategyCPUDate", null, 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPUIncreaseRelationalOp(), this.getRelationalType(), "StrategyCPUIncreaseRelationalOp", "greaterThan", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategycpu_StrategyCPUDecreaseRelationalOp(), this.getRelationalType(), "StrategyCPUDecreaseRelationalOp", "lessThan", 0, 1, Strategycpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStrategycpu__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStrategycpu__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStrategycpu__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strategymemoryEClass, Strategymemory.class, "Strategymemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategymemory_StrategyMemoryMode(), this.getModeType(), "StrategyMemoryMode", "dynamic", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryDirection(), this.getDirectionType(), "StrategyMemoryDirection", "up", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryStepMemDecrease(), this.getDouble(), "StrategyMemoryStepMemDecrease", "0.25", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryStepMemIncrease(), this.getDouble(), "StrategyMemoryStepMemIncrease", "0.5", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryUpperLimit(), theOCCIPackage.getInteger(), "StrategyMemoryUpperLimit", "5", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryLowerLimit(), theOCCIPackage.getInteger(), "StrategyMemoryLowerLimit", "1", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryDate(), this.getDateType(), "StrategyMemoryDate", null, 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryIncreaseRelationalOp(), this.getRelationalType(), "StrategyMemoryIncreaseRelationalOp", "greaterThan", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategymemory_StrategyMemoryDecreaseRelationalOp(), this.getRelationalType(), "StrategyMemoryDecreaseRelationalOp", "lessThan", 0, 1, Strategymemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStrategymemory__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStrategymemory__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStrategymemory__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeTypeEEnum, ModeType.class, "ModeType");
		addEEnumLiteral(modeTypeEEnum, ModeType.MANUAL);
		addEEnumLiteral(modeTypeEEnum, ModeType.DYNAMIC);
		addEEnumLiteral(modeTypeEEnum, ModeType.SCHEDULED);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.UP);
		addEEnumLiteral(directionTypeEEnum, DirectionType.DOWN);

		initEEnum(relationalTypeEEnum, RelationalType.class, "RelationalType");
		addEEnumLiteral(relationalTypeEEnum, RelationalType.GREATER_THAN);
		addEEnumLiteral(relationalTypeEEnum, RelationalType.LESS_THAN);
		addEEnumLiteral(relationalTypeEEnum, RelationalType.GREATER_THANOR_EQUAL);
		addEEnumLiteral(relationalTypeEEnum, RelationalType.LESS_THANOR_EQUAL);

		// Initialize data types
		initEDataType(doubleEDataType, Double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTypeEDataType, String.class, "DateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (elasticlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (strategyEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (strategycpuEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (strategymemoryEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

} //ElasticocciPackageImpl
