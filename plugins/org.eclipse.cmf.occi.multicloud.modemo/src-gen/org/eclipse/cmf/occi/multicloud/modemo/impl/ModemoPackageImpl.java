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
package org.eclipse.cmf.occi.multicloud.modemo.impl;

import java.util.Date;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;

import org.eclipse.cmf.occi.multicloud.modemo.ActionOperation;
import org.eclipse.cmf.occi.multicloud.modemo.ActionType;
import org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.modemo.Allocationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Array;
import org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep;
import org.eclipse.cmf.occi.multicloud.modemo.Availableresources;
import org.eclipse.cmf.occi.multicloud.modemo.Availalbleresourcesorload;
import org.eclipse.cmf.occi.multicloud.modemo.Cost;
import org.eclipse.cmf.occi.multicloud.modemo.Cpuutilisation;
import org.eclipse.cmf.occi.multicloud.modemo.Creation;
import org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Dynamicmigrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller;
import org.eclipse.cmf.occi.multicloud.modemo.Elasticlink;
import org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup;
import org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink;
import org.eclipse.cmf.occi.multicloud.modemo.Leastconn;
import org.eclipse.cmf.occi.multicloud.modemo.Livemigration;
import org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer;
import org.eclipse.cmf.occi.multicloud.modemo.Loadbalanceralgorithm;
import org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerlink;
import org.eclipse.cmf.occi.multicloud.modemo.Loadvolume;
import org.eclipse.cmf.occi.multicloud.modemo.Manualmigrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Manualtargetselection;
import org.eclipse.cmf.occi.multicloud.modemo.Memoryutilisation;
import org.eclipse.cmf.occi.multicloud.modemo.Metric;
import org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking;
import org.eclipse.cmf.occi.multicloud.modemo.Migrationtype;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoFactory;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage;
import org.eclipse.cmf.occi.multicloud.modemo.Networkcontention;
import org.eclipse.cmf.occi.multicloud.modemo.Nonlivemigration;
import org.eclipse.cmf.occi.multicloud.modemo.OperatorType;
import org.eclipse.cmf.occi.multicloud.modemo.Power;
import org.eclipse.cmf.occi.multicloud.modemo.Provider;
import org.eclipse.cmf.occi.multicloud.modemo.Provideramazon;
import org.eclipse.cmf.occi.multicloud.modemo.Providerazure;
import org.eclipse.cmf.occi.multicloud.modemo.Providerinstancelink;
import org.eclipse.cmf.occi.multicloud.modemo.Providerlink;
import org.eclipse.cmf.occi.multicloud.modemo.Provideropenstack;
import org.eclipse.cmf.occi.multicloud.modemo.Providervmware;
import org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep;
import org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Resourcewastage;
import org.eclipse.cmf.occi.multicloud.modemo.Responsetime;
import org.eclipse.cmf.occi.multicloud.modemo.Responsetimemetric;
import org.eclipse.cmf.occi.multicloud.modemo.Roundrobin;
import org.eclipse.cmf.occi.multicloud.modemo.Roundrobinalgo;
import org.eclipse.cmf.occi.multicloud.modemo.Rule;
import org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Simpledynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Sla;
import org.eclipse.cmf.occi.multicloud.modemo.Source;
import org.eclipse.cmf.occi.multicloud.modemo.Sourcemigrationpolicity;
import org.eclipse.cmf.occi.multicloud.modemo.Step;
import org.eclipse.cmf.occi.multicloud.modemo.Stepdynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Steplink;
import org.eclipse.cmf.occi.multicloud.modemo.Stickysessions;
import org.eclipse.cmf.occi.multicloud.modemo.Swappingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Targetmigrationpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Targetresponsetime;
import org.eclipse.cmf.occi.multicloud.modemo.TypeMetric;
import org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.Unit;
import org.eclipse.cmf.occi.multicloud.modemo.Wstaticrr;

import org.eclipse.cmf.occi.multicloud.modemo.util.ModemoValidator;

import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class ModemoPackageImpl extends EPackageImpl implements ModemoPackage {
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
	private EClass loadbalancerlinkEClass = null;

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
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providervmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provideropenstackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provideramazonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerazureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerinstancelinkEClass = null;

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
	private EClass schedulingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueschedulingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurringschedulingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicadjustmentscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpledynamicscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepdynamicscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuutilisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryutilisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundrobinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsetimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swappingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcemigrationpolicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livemigrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonlivemigrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicmigrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualmigrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadvolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcewastageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetmigrationpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availableresourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualtargetselectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availalbleresourcesorloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetresponsetimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsetimemetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkcontentionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadbalanceralgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundrobinalgoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leastconnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stickysessionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wstaticrrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModemoPackageImpl() {
		super(eNS_URI, ModemoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModemoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModemoPackage init() {
		if (isInited) return (ModemoPackage)EPackage.Registry.INSTANCE.getEPackage(ModemoPackage.eNS_URI);

		// Obtain or create and register package
		ModemoPackageImpl theModemoPackage = (ModemoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModemoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModemoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		VmwarePackage.eINSTANCE.eClass();
		AccountsPackage.eINSTANCE.eClass();
		Ec2Package.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModemoPackage.createPackageContents();

		// Initialize created meta-data
		theModemoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModemoPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModemoValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModemoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModemoPackage.eNS_URI, theModemoPackage);
		return theModemoPackage;
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
	public EAttribute getHorizontalgroup_HorizontalgroupName() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupGroupSize() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupMaximum() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupMinimum() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupTemplateName() {
		return (EAttribute)horizontalgroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalgroup_HorizontalgroupLoadBalancer() {
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
	public EAttribute getElasticitycontroller_ElasticitycontrollerMinimumLimit() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElasticitycontroller_ElasticitycontrollerMaximumLimit() {
		return (EAttribute)elasticitycontrollerEClass.getEStructuralFeatures().get(1);
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
	public EClass getLoadbalancerlink() {
		return loadbalancerlinkEClass;
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
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleOperator() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleThreshold() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RulePeriod() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleConsecutive() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getActiontrigger_ActiontriggerAction() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_ActiontriggerActionType() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiontrigger_ActiontriggerAmount() {
		return (EAttribute)actiontriggerEClass.getEStructuralFeatures().get(2);
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
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderlink() {
		return providerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidervmware() {
		return providervmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvideropenstack() {
		return provideropenstackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvideramazon() {
		return provideramazonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderazure() {
		return providerazureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderinstancelink() {
		return providerinstancelinkEClass;
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
	public EClass getSchedulingpolicy() {
		return schedulingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedulingpolicy__Start() {
		return schedulingpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSchedulingpolicy__Stop() {
		return schedulingpolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueschedulingpolicy() {
		return uniqueschedulingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate() {
		return (EAttribute)uniqueschedulingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate() {
		return (EAttribute)uniqueschedulingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurringschedulingpolicy() {
		return recurringschedulingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence() {
		return (EReference)recurringschedulingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate() {
		return (EAttribute)recurringschedulingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate() {
		return (EAttribute)recurringschedulingpolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurringschedulingpolicy_RecurringschedulingpolicyInterval() {
		return (EAttribute)recurringschedulingpolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingpolicy() {
		return scalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalingpolicy__Start() {
		return scalingpolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalingpolicy__Stop() {
		return scalingpolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicscalingpolicy() {
		return dynamicscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration() {
		return (EAttribute)dynamicscalingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime() {
		return (EAttribute)dynamicscalingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicadjustmentscalingpolicy() {
		return dynamicadjustmentscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric() {
		return (EAttribute)dynamicadjustmentscalingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn() {
		return (EAttribute)dynamicadjustmentscalingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget() {
		return (EAttribute)dynamicadjustmentscalingpolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpledynamicscalingpolicy() {
		return simpledynamicscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepdynamicscalingpolicy() {
		return stepdynamicscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualscalingpolicy() {
		return manualscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualscalingpolicy_ManualscalingpolicyDesiredSize() {
		return (EAttribute)manualscalingpolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualscalingpolicy_ManualscalingpolicyComputeUnit() {
		return (EAttribute)manualscalingpolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuutilisation() {
		return cpuutilisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryutilisation() {
		return memoryutilisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationpolicy() {
		return allocationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundrobin() {
		return roundrobinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsetime() {
		return responsetimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCost() {
		return costEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwappingpolicy() {
		return swappingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourcemigrationpolicity() {
		return sourcemigrationpolicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivemigration() {
		return livemigrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonlivemigration() {
		return nonlivemigrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrationtype() {
		return migrationtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicmigrationpolicy() {
		return dynamicmigrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualmigrationpolicy() {
		return manualmigrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSla() {
		return slaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadvolume() {
		return loadvolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPower() {
		return powerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcewastage() {
		return resourcewastageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetmigrationpolicy() {
		return targetmigrationpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailableresources() {
		return availableresourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualtargetselection() {
		return manualtargetselectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailalbleresourcesorload() {
		return availalbleresourcesorloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetresponsetime() {
		return targetresponsetimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsetimemetric() {
		return responsetimemetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkcontention() {
		return networkcontentionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadbalanceralgorithm() {
		return loadbalanceralgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalanceralgorithm__Apply() {
		return loadbalanceralgorithmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoadbalanceralgorithm__Remove() {
		return loadbalanceralgorithmEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundrobinalgo() {
		return roundrobinalgoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeastconn() {
		return leastconnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStickysessions() {
		return stickysessionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWstaticrr() {
		return wstaticrrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
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
	public ModemoFactory getModemoFactory() {
		return (ModemoFactory)getEFactoryInstance();
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
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME);
		createEAttribute(horizontalgroupEClass, HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER);

		loadbalancerEClass = createEClass(LOADBALANCER);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_NAME);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_INSTANCE_IP);
		createEAttribute(loadbalancerEClass, LOADBALANCER__LOADBALANCER_ADDRESS);
		createEOperation(loadbalancerEClass, LOADBALANCER___ADDBACKENDSERVER);
		createEOperation(loadbalancerEClass, LOADBALANCER___REMOVEBACKENDSERVER);

		elasticitycontrollerEClass = createEClass(ELASTICITYCONTROLLER);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT);
		createEAttribute(elasticitycontrollerEClass, ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT);

		instancegrouplinkEClass = createEClass(INSTANCEGROUPLINK);

		loadbalancerlinkEClass = createEClass(LOADBALANCERLINK);

		elasticlinkEClass = createEClass(ELASTICLINK);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__RULE_OPERATOR);
		createEAttribute(ruleEClass, RULE__RULE_THRESHOLD);
		createEAttribute(ruleEClass, RULE__RULE_PERIOD);
		createEAttribute(ruleEClass, RULE__RULE_CONSECUTIVE);

		actiontriggerEClass = createEClass(ACTIONTRIGGER);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTIONTRIGGER_ACTION);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE);
		createEAttribute(actiontriggerEClass, ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__STEP_LOWER_STEP_BOUND);
		createEAttribute(stepEClass, STEP__STEP_UPPER_STEP_BOUND);
		createEAttribute(stepEClass, STEP__STEP_SIZE);

		steplinkEClass = createEClass(STEPLINK);

		providerEClass = createEClass(PROVIDER);

		providerlinkEClass = createEClass(PROVIDERLINK);

		providervmwareEClass = createEClass(PROVIDERVMWARE);

		provideropenstackEClass = createEClass(PROVIDEROPENSTACK);

		provideramazonEClass = createEClass(PROVIDERAMAZON);

		providerazureEClass = createEClass(PROVIDERAZURE);

		providerinstancelinkEClass = createEClass(PROVIDERINSTANCELINK);

		creationEClass = createEClass(CREATION);
		createEAttribute(creationEClass, CREATION__OCCI_COMPUTE_CREATION_DATE);

		schedulingpolicyEClass = createEClass(SCHEDULINGPOLICY);
		createEOperation(schedulingpolicyEClass, SCHEDULINGPOLICY___START);
		createEOperation(schedulingpolicyEClass, SCHEDULINGPOLICY___STOP);

		uniqueschedulingpolicyEClass = createEClass(UNIQUESCHEDULINGPOLICY);
		createEAttribute(uniqueschedulingpolicyEClass, UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE);
		createEAttribute(uniqueschedulingpolicyEClass, UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE);

		recurringschedulingpolicyEClass = createEClass(RECURRINGSCHEDULINGPOLICY);
		createEReference(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE);
		createEAttribute(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE);
		createEAttribute(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE);
		createEAttribute(recurringschedulingpolicyEClass, RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL);

		scalingpolicyEClass = createEClass(SCALINGPOLICY);
		createEOperation(scalingpolicyEClass, SCALINGPOLICY___START);
		createEOperation(scalingpolicyEClass, SCALINGPOLICY___STOP);

		dynamicscalingpolicyEClass = createEClass(DYNAMICSCALINGPOLICY);
		createEAttribute(dynamicscalingpolicyEClass, DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION);
		createEAttribute(dynamicscalingpolicyEClass, DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME);

		dynamicadjustmentscalingpolicyEClass = createEClass(DYNAMICADJUSTMENTSCALINGPOLICY);
		createEAttribute(dynamicadjustmentscalingpolicyEClass, DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC);
		createEAttribute(dynamicadjustmentscalingpolicyEClass, DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN);
		createEAttribute(dynamicadjustmentscalingpolicyEClass, DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET);

		simpledynamicscalingpolicyEClass = createEClass(SIMPLEDYNAMICSCALINGPOLICY);

		stepdynamicscalingpolicyEClass = createEClass(STEPDYNAMICSCALINGPOLICY);

		manualscalingpolicyEClass = createEClass(MANUALSCALINGPOLICY);
		createEAttribute(manualscalingpolicyEClass, MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE);
		createEAttribute(manualscalingpolicyEClass, MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_COMPUTE_UNIT);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);

		cpuutilisationEClass = createEClass(CPUUTILISATION);

		memoryutilisationEClass = createEClass(MEMORYUTILISATION);

		allocationpolicyEClass = createEClass(ALLOCATIONPOLICY);

		roundrobinEClass = createEClass(ROUNDROBIN);

		responsetimeEClass = createEClass(RESPONSETIME);

		costEClass = createEClass(COST);

		swappingpolicyEClass = createEClass(SWAPPINGPOLICY);

		sourcemigrationpolicityEClass = createEClass(SOURCEMIGRATIONPOLICITY);

		livemigrationEClass = createEClass(LIVEMIGRATION);

		nonlivemigrationEClass = createEClass(NONLIVEMIGRATION);

		migrationtypeEClass = createEClass(MIGRATIONTYPE);

		dynamicmigrationpolicyEClass = createEClass(DYNAMICMIGRATIONPOLICY);

		manualmigrationpolicyEClass = createEClass(MANUALMIGRATIONPOLICY);

		slaEClass = createEClass(SLA);

		loadvolumeEClass = createEClass(LOADVOLUME);

		powerEClass = createEClass(POWER);

		resourcewastageEClass = createEClass(RESOURCEWASTAGE);

		targetmigrationpolicyEClass = createEClass(TARGETMIGRATIONPOLICY);

		availableresourcesEClass = createEClass(AVAILABLERESOURCES);

		manualtargetselectionEClass = createEClass(MANUALTARGETSELECTION);

		availalbleresourcesorloadEClass = createEClass(AVAILALBLERESOURCESORLOAD);

		targetresponsetimeEClass = createEClass(TARGETRESPONSETIME);

		responsetimemetricEClass = createEClass(RESPONSETIMEMETRIC);

		networkcontentionEClass = createEClass(NETWORKCONTENTION);

		loadbalanceralgorithmEClass = createEClass(LOADBALANCERALGORITHM);
		createEOperation(loadbalanceralgorithmEClass, LOADBALANCERALGORITHM___APPLY);
		createEOperation(loadbalanceralgorithmEClass, LOADBALANCERALGORITHM___REMOVE);

		roundrobinalgoEClass = createEClass(ROUNDROBINALGO);

		leastconnEClass = createEClass(LEASTCONN);

		stickysessionsEClass = createEClass(STICKYSESSIONS);

		wstaticrrEClass = createEClass(WSTATICRR);

		sourceEClass = createEClass(SOURCE);

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
		loadbalancerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		elasticlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		ruleEClass.getESuperTypes().add(theOCCIPackage.getLink());
		actiontriggerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		stepEClass.getESuperTypes().add(theOCCIPackage.getResource());
		steplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		providerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		providerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		providervmwareEClass.getESuperTypes().add(this.getProvider());
		provideropenstackEClass.getESuperTypes().add(this.getProvider());
		provideramazonEClass.getESuperTypes().add(this.getProvider());
		providerazureEClass.getESuperTypes().add(this.getProvider());
		providerinstancelinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		creationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		schedulingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		uniqueschedulingpolicyEClass.getESuperTypes().add(this.getSchedulingpolicy());
		uniqueschedulingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		recurringschedulingpolicyEClass.getESuperTypes().add(this.getSchedulingpolicy());
		recurringschedulingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		scalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dynamicscalingpolicyEClass.getESuperTypes().add(this.getScalingpolicy());
		dynamicscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dynamicadjustmentscalingpolicyEClass.getESuperTypes().add(this.getDynamicscalingpolicy());
		dynamicadjustmentscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		simpledynamicscalingpolicyEClass.getESuperTypes().add(this.getDynamicscalingpolicy());
		simpledynamicscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		stepdynamicscalingpolicyEClass.getESuperTypes().add(this.getDynamicscalingpolicy());
		stepdynamicscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		manualscalingpolicyEClass.getESuperTypes().add(this.getScalingpolicy());
		manualscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		metricEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cpuutilisationEClass.getESuperTypes().add(this.getMetric());
		cpuutilisationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		memoryutilisationEClass.getESuperTypes().add(this.getMetric());
		memoryutilisationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		allocationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		roundrobinEClass.getESuperTypes().add(this.getAllocationpolicy());
		roundrobinEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		responsetimeEClass.getESuperTypes().add(this.getAllocationpolicy());
		responsetimeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		costEClass.getESuperTypes().add(this.getAllocationpolicy());
		costEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		swappingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sourcemigrationpolicityEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		livemigrationEClass.getESuperTypes().add(this.getMigrationtype());
		livemigrationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		nonlivemigrationEClass.getESuperTypes().add(this.getMigrationtype());
		nonlivemigrationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		migrationtypeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dynamicmigrationpolicyEClass.getESuperTypes().add(this.getSourcemigrationpolicity());
		dynamicmigrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		manualmigrationpolicyEClass.getESuperTypes().add(this.getSourcemigrationpolicity());
		manualmigrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		slaEClass.getESuperTypes().add(this.getDynamicmigrationpolicy());
		slaEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		loadvolumeEClass.getESuperTypes().add(this.getDynamicmigrationpolicy());
		loadvolumeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		powerEClass.getESuperTypes().add(this.getDynamicmigrationpolicy());
		powerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		resourcewastageEClass.getESuperTypes().add(this.getDynamicmigrationpolicy());
		resourcewastageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		targetmigrationpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		availableresourcesEClass.getESuperTypes().add(this.getAllocationpolicy());
		availableresourcesEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		manualtargetselectionEClass.getESuperTypes().add(this.getTargetmigrationpolicy());
		manualtargetselectionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		availalbleresourcesorloadEClass.getESuperTypes().add(this.getTargetmigrationpolicy());
		availalbleresourcesorloadEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		targetresponsetimeEClass.getESuperTypes().add(this.getTargetmigrationpolicy());
		targetresponsetimeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		responsetimemetricEClass.getESuperTypes().add(this.getMetric());
		responsetimemetricEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		networkcontentionEClass.getESuperTypes().add(this.getDynamicmigrationpolicy());
		networkcontentionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		loadbalanceralgorithmEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		roundrobinalgoEClass.getESuperTypes().add(this.getLoadbalanceralgorithm());
		roundrobinalgoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		leastconnEClass.getESuperTypes().add(this.getLoadbalanceralgorithm());
		leastconnEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		stickysessionsEClass.getESuperTypes().add(this.getLoadbalanceralgorithm());
		stickysessionsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		wstaticrrEClass.getESuperTypes().add(this.getLoadbalanceralgorithm());
		wstaticrrEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sourceEClass.getESuperTypes().add(this.getLoadbalanceralgorithm());
		sourceEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(recurrenceStepEClass, RecurrenceStep.class, "RecurrenceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecurrenceStep_Unit(), this.getUnit(), "unit", null, 1, 1, RecurrenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecurrenceStep_Value(), this.getArray(), null, "value", null, 0, 1, RecurrenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_Values(), theOCCIPackage.getInteger(), "values", null, 0, -1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrofRecStepEClass, ArrofRecStep.class, "ArrofRecStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrofRecStep_ArrofrecstepValues(), this.getRecurrenceStep(), null, "arrofrecstepValues", null, 0, -1, ArrofRecStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalgroupEClass, Horizontalgroup.class, "Horizontalgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalgroup_HorizontalgroupName(), theOCCIPackage.getString(), "horizontalgroupName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupGroupSize(), theOCCIPackage.getInteger(), "horizontalgroupGroupSize", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupMaximum(), theOCCIPackage.getInteger(), "horizontalgroupMaximum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupMinimum(), theOCCIPackage.getInteger(), "horizontalgroupMinimum", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupTemplateName(), theOCCIPackage.getString(), "horizontalgroupTemplateName", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalgroup_HorizontalgroupLoadBalancer(), theOCCIPackage.getString(), "horizontalgroupLoadBalancer", null, 0, 1, Horizontalgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadbalancerEClass, Loadbalancer.class, "Loadbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadbalancer_LoadbalancerName(), theOCCIPackage.getString(), "loadbalancerName", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerInstanceIP(), theOCCIPackage.getString(), "loadbalancerInstanceIP", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadbalancer_LoadbalancerAddress(), theOCCIPackage.getString(), "loadbalancerAddress", null, 0, 1, Loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLoadbalancer__Addbackendserver(), null, "addbackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLoadbalancer__Removebackendserver(), null, "removebackendserver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elasticitycontrollerEClass, Elasticitycontroller.class, "Elasticitycontroller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElasticitycontroller_ElasticitycontrollerMinimumLimit(), theOCCIPackage.getInteger(), "ElasticitycontrollerMinimumLimit", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElasticitycontroller_ElasticitycontrollerMaximumLimit(), theOCCIPackage.getInteger(), "ElasticitycontrollerMaximumLimit", null, 0, 1, Elasticitycontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instancegrouplinkEClass, Instancegrouplink.class, "Instancegrouplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadbalancerlinkEClass, Loadbalancerlink.class, "Loadbalancerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elasticlinkEClass, Elasticlink.class, "Elasticlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_RuleOperator(), this.getOperatorType(), "ruleOperator", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RuleThreshold(), this.getFloat(), "ruleThreshold", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RulePeriod(), theOCCIPackage.getInteger(), "rulePeriod", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_RuleConsecutive(), theOCCIPackage.getInteger(), "ruleConsecutive", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actiontriggerEClass, Actiontrigger.class, "Actiontrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiontrigger_ActiontriggerAction(), this.getActionOperation(), "actiontriggerAction", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiontrigger_ActiontriggerActionType(), this.getActionType(), "actiontriggerActionType", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiontrigger_ActiontriggerAmount(), this.getFloat(), "actiontriggerAmount", null, 0, 1, Actiontrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_StepLowerStepBound(), this.getFloat(), "stepLowerStepBound", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepUpperStepBound(), this.getFloat(), "stepUpperStepBound", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepSize(), this.getFloat(), "stepSize", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(steplinkEClass, Steplink.class, "Steplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerlinkEClass, Providerlink.class, "Providerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providervmwareEClass, Providervmware.class, "Providervmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(provideropenstackEClass, Provideropenstack.class, "Provideropenstack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(provideramazonEClass, Provideramazon.class, "Provideramazon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerazureEClass, Providerazure.class, "Providerazure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerinstancelinkEClass, Providerinstancelink.class, "Providerinstancelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(creationEClass, Creation.class, "Creation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreation_OcciComputeCreationDate(), this.getDate(), "occiComputeCreationDate", null, 0, 1, Creation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingpolicyEClass, Schedulingpolicy.class, "Schedulingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSchedulingpolicy__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSchedulingpolicy__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uniqueschedulingpolicyEClass, Uniqueschedulingpolicy.class, "Uniqueschedulingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate(), this.getDate(), "uniqueschedulingpolicyStartDate", null, 0, 1, Uniqueschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate(), this.getDate(), "uniqueschedulingpolicyEndDate", null, 0, 1, Uniqueschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recurringschedulingpolicyEClass, Recurringschedulingpolicy.class, "Recurringschedulingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence(), this.getArrofRecStep(), null, "recurringschedulingpolicyRecurrence", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate(), this.getDate(), "recurringschedulingpolicyStartDate", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate(), this.getDate(), "recurringschedulingpolicyEndDate", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurringschedulingpolicy_RecurringschedulingpolicyInterval(), theOCCIPackage.getInteger(), "recurringschedulingpolicyInterval", null, 0, 1, Recurringschedulingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingpolicyEClass, Scalingpolicy.class, "Scalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getScalingpolicy__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getScalingpolicy__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dynamicscalingpolicyEClass, Dynamicscalingpolicy.class, "Dynamicscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration(), theOCCIPackage.getInteger(), "dynamicscalingpolicyCoolDuration", null, 0, 1, Dynamicscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime(), theOCCIPackage.getInteger(), "dynamicscalingpolicyIterationWaitTime", null, 0, 1, Dynamicscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicadjustmentscalingpolicyEClass, Dynamicadjustmentscalingpolicy.class, "Dynamicadjustmentscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric(), this.getMetricTargetTracking(), "dynamicadjustmentscalingpolicyMetric", null, 0, 1, Dynamicadjustmentscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn(), theOCCIPackage.getBoolean(), "dynamicadjustmentscalingpolicyDisableScaleIn", null, 0, 1, Dynamicadjustmentscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget(), this.getFloat(), "dynamicadjustmentscalingpolicyTarget", null, 0, 1, Dynamicadjustmentscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpledynamicscalingpolicyEClass, Simpledynamicscalingpolicy.class, "Simpledynamicscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepdynamicscalingpolicyEClass, Stepdynamicscalingpolicy.class, "Stepdynamicscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualscalingpolicyEClass, Manualscalingpolicy.class, "Manualscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManualscalingpolicy_ManualscalingpolicyDesiredSize(), this.getFloat(), "manualscalingpolicyDesiredSize", null, 0, 1, Manualscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManualscalingpolicy_ManualscalingpolicyComputeUnit(), theOCCIPackage.getString(), "manualscalingpolicyComputeUnit", null, 0, 1, Manualscalingpolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuutilisationEClass, Cpuutilisation.class, "Cpuutilisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryutilisationEClass, Memoryutilisation.class, "Memoryutilisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationpolicyEClass, Allocationpolicy.class, "Allocationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roundrobinEClass, Roundrobin.class, "Roundrobin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responsetimeEClass, Responsetime.class, "Responsetime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(costEClass, Cost.class, "Cost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swappingpolicyEClass, Swappingpolicy.class, "Swappingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourcemigrationpolicityEClass, Sourcemigrationpolicity.class, "Sourcemigrationpolicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livemigrationEClass, Livemigration.class, "Livemigration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonlivemigrationEClass, Nonlivemigration.class, "Nonlivemigration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(migrationtypeEClass, Migrationtype.class, "Migrationtype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicmigrationpolicyEClass, Dynamicmigrationpolicy.class, "Dynamicmigrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualmigrationpolicyEClass, Manualmigrationpolicy.class, "Manualmigrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slaEClass, Sla.class, "Sla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadvolumeEClass, Loadvolume.class, "Loadvolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourcewastageEClass, Resourcewastage.class, "Resourcewastage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetmigrationpolicyEClass, Targetmigrationpolicy.class, "Targetmigrationpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(availableresourcesEClass, Availableresources.class, "Availableresources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualtargetselectionEClass, Manualtargetselection.class, "Manualtargetselection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(availalbleresourcesorloadEClass, Availalbleresourcesorload.class, "Availalbleresourcesorload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetresponsetimeEClass, Targetresponsetime.class, "Targetresponsetime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responsetimemetricEClass, Responsetimemetric.class, "Responsetimemetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkcontentionEClass, Networkcontention.class, "Networkcontention", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadbalanceralgorithmEClass, Loadbalanceralgorithm.class, "Loadbalanceralgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLoadbalanceralgorithm__Apply(), null, "apply", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLoadbalanceralgorithm__Remove(), null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roundrobinalgoEClass, Roundrobinalgo.class, "Roundrobinalgo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leastconnEClass, Leastconn.class, "Leastconn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stickysessionsEClass, Stickysessions.class, "Stickysessions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wstaticrrEClass, Wstaticrr.class, "Wstaticrr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(typeMetricEEnum, TypeMetric.class, "TypeMetric");
		addEEnumLiteral(typeMetricEEnum, TypeMetric.CP_UTILISATION);
		addEEnumLiteral(typeMetricEEnum, TypeMetric.MEMORY_UTILISATION);

		initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
		addEEnumLiteral(operatorTypeEEnum, OperatorType.GREATER_THAN);
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
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_NETWORK_IN);
		addEEnumLiteral(metricTargetTrackingEEnum, MetricTargetTracking.AVERAGE_NETWORK_OUT);

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
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (loadbalancerlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (elasticlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (steplinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (providerlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (providerinstancelinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (creationEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (schedulingpolicyEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (scalingpolicyEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (metricEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (allocationpolicyEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (swappingpolicyEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (sourcemigrationpolicityEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (migrationtypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (targetmigrationpolicyEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (loadbalanceralgorithmEClass, 
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
			 "vmware", "http://occiware.org/occi/infrastructure/vmware/ecore",
			 "accounts", "http://occiware.org/occi/infrastructure/security/ecore",
			 "ec2", "http://occiware.org/occi/infrastructure/aws/ecore"
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
			 "sourceConstraint", "self.source.oclIsKindOf(modemo::Horizontalgroup)",
			 "targetConstraint", "self.target.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (loadbalancerlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(modemo::Horizontalgroup)",
			 "targetConstraint", "self.target.oclIsKindOf(modemo::Loadbalancer)"
		   });	
		addAnnotation
		  (elasticlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(modemo::Elasticitycontroller)",
			 "targetConstraint", "self.target.oclIsKindOf(modemo::Horizontalgroup) or self.target.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(modemo::Elasticitycontroller)",
			 "targetConstraint", "self.target.oclIsKindOf(modemo::Actiontrigger)"
		   });	
		addAnnotation
		  (steplinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(modemo::Elasticitycontroller)",
			 "targetConstraint", "self.target.oclIsKindOf(modemo::Step)"
		   });	
		addAnnotation
		  (providerlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(modemo::Horizontalgroup)",
			 "targetConstraint", "self.target.oclIsKindOf(modemo::Provider)"
		   });	
		addAnnotation
		  (providerinstancelinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(modemo::Provider)",
			 "targetConstraint", "self.target.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (creationEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (schedulingpolicyEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Elasticitycontroller)"
		   });	
		addAnnotation
		  (scalingpolicyEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Elasticitycontroller)"
		   });	
		addAnnotation
		  (metricEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Rule)"
		   });	
		addAnnotation
		  (allocationpolicyEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Horizontalgroup)"
		   });	
		addAnnotation
		  (swappingpolicyEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Elasticitycontroller)"
		   });	
		addAnnotation
		  (sourcemigrationpolicityEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Elasticitycontroller)"
		   });	
		addAnnotation
		  (migrationtypeEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Elasticitycontroller)"
		   });	
		addAnnotation
		  (targetmigrationpolicyEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Elasticitycontroller)"
		   });	
		addAnnotation
		  (loadbalanceralgorithmEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(modemo::Loadbalancer)"
		   });
	}

} //ModemoPackageImpl
