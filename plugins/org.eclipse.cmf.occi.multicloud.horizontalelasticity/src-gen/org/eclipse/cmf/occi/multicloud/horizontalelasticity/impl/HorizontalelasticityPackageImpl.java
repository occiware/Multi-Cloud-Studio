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

import java.util.Date;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Array;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Computelink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Grouplink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityFactory;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkloadbalancer;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steplink;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Unit;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.util.HorizontalelasticityValidator;

import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
	private EClass recurrenceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrofRecStepEClass = null;

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
	private EClass elasticitycontrollerEClass = null;

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
	private EClass linkloadbalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grouplinkEClass = null;

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
	private EClass simpledynamicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepdynamicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicadjustmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actiontriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass steplinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniquescheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurringscheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricTargetTrackingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

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
		VmwarePackage.eINSTANCE.eClass();
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
	public EClass getRecurrenceStep() {
		return recurrenceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurrenceStep_Unit() {
		return (EAttribute)recurrenceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurrenceStep_Value() {
		return (EReference)recurrenceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Values() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrofRecStep() {
		return arrofRecStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrofRecStep_ArrofrecstepValues() {
		return (EReference)arrofRecStepEClass.getEStructuralFeatures().get(0);
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
	public EClass getElasticitycontroller() {
		return elasticitycontrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElasticitycontroller_ElasticityControllerMinimumLimit() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElasticitycontroller_ElasticityControllerMaximumLimit() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElasticitycontroller_ElasticityControllerCoolDuration() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElasticitycontroller_ElasticityControllerIterationWaitTime() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElasticitycontroller__Start() {
		return elasticitycontrollerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElasticitycontroller__Stop() {
		return elasticitycontrollerEClass.getEOperations().get(1);
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
	public EClass getLinkloadbalancer() {
		return linkloadbalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrouplink() {
		return grouplinkEClass;
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
	public EAttribute getManual_ManualDesiredSize() {
		return (EAttribute)manualEClass.getEStructuralFeatures().get(0);
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
	public EClass getSimpledynamic() {
		return simpledynamicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepdynamic() {
		return stepdynamicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicadjustment() {
		return dynamicadjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustment_DynamicAdjustmentMetric() {
		return (EAttribute)dynamicadjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustment_DynamicAdjustmentDisableScaleIn() {
		return (EAttribute)dynamicadjustmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustment_DynamicAdjustmentTarget() {
		return (EAttribute)dynamicadjustmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleMetric() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleOperator() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleThreshold() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RulePeriod() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleConsecutive() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiontrigger() {
		return actiontriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_Action() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_ActionType() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_Amount() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicpolicy() {
		return dynamicpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepLowerStepBound() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepUpperStepBound() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepSize() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSteplink() {
		return steplinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputelink() {
		return computelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreation() {
		return creationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreation_OcciComputeCreationDate() {
		return (EAttribute)creationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduler__Start() {
		return schedulerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduler__Stop() {
		return schedulerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueschedule() {
		return uniquescheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueschedule_UniqueScheduleStartDate() {
		return (EAttribute)uniquescheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueschedule_UniqueScheduleEndDate() {
		return (EAttribute)uniquescheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurringschedule() {
		return recurringscheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurringschedule_RecurringscheduleRecurrence() {
		return (EReference)recurringscheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedule_RecurringscheduleStartDate() {
		return (EAttribute)recurringscheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedule_RecurringscheduleEndDate() {
		return (EAttribute)recurringscheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedule_Interval() {
		return (EAttribute)recurringscheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeMetric() {
		return typeMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorType() {
		return operatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionOperation() {
		return actionOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricTargetTracking() {
		return metricTargetTrackingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnit() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
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
		recurrenceStepEClass = createEClass(RECURRENCE_STEP);
		createEAttribute(recurrenceStepEClass, RECURRENCE_STEP__UNIT);
		createEReference(recurrenceStepEClass, RECURRENCE_STEP__VALUE);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__VALUES);

		arrofRecStepEClass = createEClass(ARROF_REC_STEP);
		createEReference(arrofRecStepEClass, ARROF_REC_STEP__ARROFRECSTEP_VALUES);

		horizontalgroupEClass = createEClass(HORIZONTALGROUP);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER);

		loadbalancerEClass = createEClass(LOADBALANCER);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_NAME);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_INSTANCE_IP);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_ADDRESS);
		createEOperation(loadbalancerEClass, LOADBALANCER___ADDBACKENDSERVER);
		createEOperation(loadbalancerEClass, LOADBALANCER___REMOVEBACKENDSERVER);

		elasticitycontrollerEClass = createEClass(ELASTICITYCONTROLLER);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MINIMUM_LIMIT);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_MAXIMUM_LIMIT);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_COOL_DURATION);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME);
		createEOperation(elasticitycontrollerEClass, ELASTICITYCONTROLLER___START);
		createEOperation(elasticitycontrollerEClass, ELASTICITYCONTROLLER___STOP);

		instancegrouplinkEClass = createEClass(INSTANCEGROUPLINK);

		linkloadbalancerEClass = createEClass(LINKLOADBALANCER);

		grouplinkEClass = createEClass(GROUPLINK);

		manualEClass = createEClass(MANUAL);
		createEAttribute(manualEClass, MANUAL__MANUAL_DESIRED_SIZE);

		dynamicEClass = createEClass(DYNAMIC);

		simpledynamicEClass = createEClass(SIMPLEDYNAMIC);

		stepdynamicEClass = createEClass(STEPDYNAMIC);

		dynamicadjustmentEClass = createEClass(DYNAMICADJUSTMENT);
		createEAttribute(dynamicadjustmentEClass, DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC);
		createEAttribute(dynamicadjustmentEClass, DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN);
		createEAttribute(dynamicadjustmentEClass, DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__RULE_METRIC);
		createEAttribute(ruleEClass, RULE__RULE_OPERATOR);
		createEAttribute(ruleEClass, RULE__RULE_THRESHOLD);
		createEAttribute(ruleEClass, RULE__RULE_PERIOD);
		createEAttribute(ruleEClass, RULE__RULE_CONSECUTIVE);

		actiontriggerEClass = createEClass(ACTIONTRIGGER);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTION);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTION_TYPE);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__AMOUNT);

		dynamicpolicyEClass = createEClass(DYNAMICPOLICY);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__STEP_LOWER_STEP_BOUND);
		createEAttribute(stepEClass, STEP__STEP_UPPER_STEP_BOUND);
		createEAttribute(stepEClass, STEP__STEP_SIZE);

		steplinkEClass = createEClass(STEPLINK);

		computelinkEClass = createEClass(COMPUTELINK);

		creationEClass = createEClass(CREATION);
		createEAttribute(creationEClass, CREATION__OCCI_COMPUTE_CREATION_DATE);

		schedulerEClass = createEClass(SCHEDULER);
		createEOperation(schedulerEClass, SCHEDULER___START);
		createEOperation(schedulerEClass, SCHEDULER___STOP);

		uniquescheduleEClass = createEClass(UNIQUESCHEDULE);
		createEAttribute(uniquescheduleEClass, UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE);
		createEAttribute(uniquescheduleEClass, UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE);

		recurringscheduleEClass = createEClass(RECURRINGSCHEDULE);
		createEReference(recurringscheduleEClass, RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE);
		createEAttribute(recurringscheduleEClass, RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE);
		createEAttribute(recurringscheduleEClass, RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE);
		createEAttribute(recurringscheduleEClass, RECURRINGSCHEDULE__INTERVAL);

		// Create enums
		typeMetricEEnum = createEEnum(TYPE_METRIC);
		operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
		actionOperationEEnum = createEEnum(ACTION_OPERATION);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		metricTargetTrackingEEnum = createEEnum(METRIC_TARGET_TRACKING);
		unitEEnum = createEEnum(UNIT);

		// Create data types
		floatEDataType = createEDataType(FLOAT);
		dateEDataType = createEDataType(DATE);
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
		horizontalgroupEClass.getESuperTypes().add(theOCCIPackage.getResource());
		loadbalancerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		elasticitycontrollerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		instancegrouplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		linkloadbalancerEClass.getESuperTypes().add(theOCCIPackage.getLink());
		grouplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		manualEClass.getESuperTypes().add(this.getElasticitycontroller());
		dynamicEClass.getESuperTypes().add(this.getElasticitycontroller());
		simpledynamicEClass.getESuperTypes().add(this.getDynamicpolicy());
		stepdynamicEClass.getESuperTypes().add(this.getDynamicpolicy());
		dynamicadjustmentEClass.getESuperTypes().add(this.getDynamic());
		ruleEClass.getESuperTypes().add(theOCCIPackage.getLink());
		actiontriggerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		dynamicpolicyEClass.getESuperTypes().add(this.getDynamic());
		stepEClass.getESuperTypes().add(theOCCIPackage.getResource());
		steplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		computelinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		creationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		schedulerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		uniquescheduleEClass.getESuperTypes().add(this.getScheduler());
		uniquescheduleEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		recurringscheduleEClass.getESuperTypes().add(this.getScheduler());
		recurringscheduleEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(recurrenceStepEClass, RecurrenceStep.class, "RecurrenceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecurrenceStep_Unit(), this.getUnit(), "unit", null, 1, 1, RecurrenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecurrenceStep_Value(), this.getArray(), null, "value", null, 0, 1, RecurrenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_Values(), theOCCIPackage.getInteger(), "values", null, 0, -1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrofRecStepEClass, ArrofRecStep.class, "ArrofRecStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrofRecStep_ArrofrecstepValues(), this.getRecurrenceStep(), null, "arrofrecstepValues", null, 0, -1, ArrofRecStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalgroupEClass, Horizontalgroup.class, "Horizontalgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalgroup_HorizontalGroupName(), theOCCIPackage.getString(), "horizontalGroupName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupGroupSize(), theOCCIPackage.getInteger(), "horizontalGroupGroupSize", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupMaximum(), theOCCIPackage.getInteger(), "horizontalGroupMaximum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupMinimum(), theOCCIPackage.getInteger(), "horizontalGroupMinimum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupTemplateName(), theOCCIPackage.getString(), "horizontalGroupTemplateName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalGroupLoadBalancer(), theOCCIPackage.getString(), "horizontalGroupLoadBalancer", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadbalancerEClass, Loadbalancer.class, "Loadbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadbalancer_LoadbalancerName(), theOCCIPackage.getString(), "loadbalancerName", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerInstanceIP(), theOCCIPackage.getString(), "loadbalancerInstanceIP", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerAddress(), theOCCIPackage.getString(), "loadbalancerAddress", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLoadbalancer__Addbackendserver(), null, "addbackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLoadbalancer__Removebackendserver(), null, "removebackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elasticitycontrollerEClass, Elasticitycontroller.class, "Elasticitycontroller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElasticitycontroller_ElasticityControllerMinimumLimit(), theOCCIPackage.getInteger(), "ElasticityControllerMinimumLimit", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticitycontroller_ElasticityControllerMaximumLimit(), theOCCIPackage.getInteger(), "ElasticityControllerMaximumLimit", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticitycontroller_ElasticityControllerCoolDuration(), theOCCIPackage.getInteger(), "ElasticityControllerCoolDuration", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticitycontroller_ElasticityControllerIterationWaitTime(), theOCCIPackage.getInteger(), "ElasticityControllerIterationWaitTime", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElasticitycontroller__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElasticitycontroller__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(instancegrouplinkEClass, Instancegrouplink.class, "Instancegrouplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkloadbalancerEClass, Linkloadbalancer.class, "Linkloadbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grouplinkEClass, Grouplink.class, "Grouplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManual_ManualDesiredSize(), this.getFloat(), "manualDesiredSize", null, 0, 1, Manual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicEClass, org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic.class, "Dynamic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpledynamicEClass, Simpledynamic.class, "Simpledynamic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepdynamicEClass, Stepdynamic.class, "Stepdynamic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicadjustmentEClass, Dynamicadjustment.class, "Dynamicadjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicadjustment_DynamicAdjustmentMetric(), this.getMetricTargetTracking(), "dynamicAdjustmentMetric", null, 0, 1, Dynamicadjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicadjustment_DynamicAdjustmentDisableScaleIn(), theOCCIPackage.getBoolean(), "dynamicAdjustmentDisableScaleIn", null, 0, 1, Dynamicadjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicadjustment_DynamicAdjustmentTarget(), this.getFloat(), "dynamicAdjustmentTarget", null, 0, 1, Dynamicadjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_RuleMetric(), this.getTypeMetric(), "ruleMetric", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RuleOperator(), this.getOperatorType(), "ruleOperator", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RuleThreshold(), this.getFloat(), "ruleThreshold", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RulePeriod(), theOCCIPackage.getInteger(), "rulePeriod", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RuleConsecutive(), theOCCIPackage.getInteger(), "ruleConsecutive", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actiontriggerEClass, Actiontrigger.class, "Actiontrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiontrigger_Action(), this.getActionOperation(), "action", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiontrigger_ActionType(), this.getActionType(), "actionType", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiontrigger_Amount(), this.getFloat(), "amount", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicpolicyEClass, Dynamicpolicy.class, "Dynamicpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_StepLowerStepBound(), this.getFloat(), "stepLowerStepBound", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepUpperStepBound(), this.getFloat(), "stepUpperStepBound", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepSize(), this.getFloat(), "stepSize", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(steplinkEClass, Steplink.class, "Steplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computelinkEClass, Computelink.class, "Computelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(creationEClass, Creation.class, "Creation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreation_OcciComputeCreationDate(), this.getDate(), "occiComputeCreationDate", null, 0, 1, Creation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getScheduler__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScheduler__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uniquescheduleEClass, Uniqueschedule.class, "Uniqueschedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueschedule_UniqueScheduleStartDate(), this.getDate(), "UniqueScheduleStartDate", null, 0, 1, Uniqueschedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniqueschedule_UniqueScheduleEndDate(), this.getDate(), "UniqueScheduleEndDate", null, 0, 1, Uniqueschedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recurringscheduleEClass, Recurringschedule.class, "Recurringschedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecurringschedule_RecurringscheduleRecurrence(), this.getArrofRecStep(), null, "RecurringscheduleRecurrence", null, 0, 1, Recurringschedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedule_RecurringscheduleStartDate(), this.getDate(), "RecurringscheduleStartDate", null, 0, 1, Recurringschedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedule_RecurringscheduleEndDate(), this.getDate(), "RecurringscheduleEndDate", null, 0, 1, Recurringschedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedule_Interval(), theOCCIPackage.getInteger(), "interval", null, 0, 1, Recurringschedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeMetricEEnum, TypeMetric.class, "TypeMetric");
		addEEnumLiteral(typeMetricEEnum, TypeMetric.CP_UTILISATION);
		addEEnumLiteral(typeMetricEEnum, TypeMetric.MEMORY_UTILISATION);

		initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
		addEEnumLiteral(operatorTypeEEnum, OperatorType.GRATER_THAN);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.GREATER_THAN_OR_EQUAL_TO);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LESS_THAN);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.LESS_THANOR_EQUAL_TO);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.EQUAL_TO);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.NOT_EQUAL_TO);

		initEEnum(actionOperationEEnum, ActionOperation.class, "ActionOperation");
		addEEnumLiteral(actionOperationEEnum, ActionOperation.ADD);
		addEEnumLiteral(actionOperationEEnum, ActionOperation.REMOVE);
		addEEnumLiteral(actionOperationEEnum, ActionOperation.SET_TO);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.INSTANCE_COUNT);
		addEEnumLiteral(actionTypeEEnum, ActionType.PERCENT);

		initEEnum(metricTargetTrackingEEnum, MetricTargetTracking.class, "MetricTargetTracking");
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_CPU_UTILISATION);
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.LB_REQUEST_COUNTPER_TARGET);
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_NETWORKIN);
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_NETWORKOUT);

		initEEnum(unitEEnum, Unit.class, "Unit");
		addEEnumLiteral(unitEEnum, Unit.MINUTE);
		addEEnumLiteral(unitEEnum, Unit.HOUR);
		addEEnumLiteral(unitEEnum, Unit.DAY_OF_WEEK);
		addEEnumLiteral(unitEEnum, Unit.DAY_OF_MONTH);
		addEEnumLiteral(unitEEnum, Unit.MONTH);

		// Initialize data types
		initEDataType(floatEDataType, Float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (instancegrouplinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (linkloadbalancerEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (grouplinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (steplinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (computelinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetConstraint"
		   });	
		addAnnotation
		  (creationEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (schedulerEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "occi", "http://schemas.ogf.org/occi/core/ecore",
			 "infrastructure", "http://schemas.ogf.org/occi/infrastructure/ecore",
			 "vmware", "http://occiware.org/occi/infrastructure/vmware/ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (instancegrouplinkEClass, 
		   source, 
		   new String[] {
			 "targetConstraint", "self.target.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (linkloadbalancerEClass, 
		   source, 
		   new String[] {
			 "targetConstraint", "self.target.oclIsKindOf(horizontalelasticity::Loadbalancer)"
		   });	
		addAnnotation
		  (grouplinkEClass, 
		   source, 
		   new String[] {
			 "targetConstraint", "self.target.oclIsKindOf(horizontalelasticity::Horizontalgroup)"
		   });	
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "targetConstraint", "self.target.oclIsKindOf(horizontalelasticity::Actiontrigger)"
		   });	
		addAnnotation
		  (steplinkEClass, 
		   source, 
		   new String[] {
			 "targetConstraint", "self.target.oclIsKindOf(horizontalelasticity::Step)"
		   });	
		addAnnotation
		  (computelinkEClass, 
		   source, 
		   new String[] {
			 "targetConstraint", "self.target.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (creationEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (schedulerEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(horizontalelasticity::Elasticitycontroller)"
		   });
	}

} //HorizontalelasticityPackageImpl
