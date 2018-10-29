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
package org.eclipse.cmf.occi.multicloud.modemo.util;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.multicloud.modemo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage
 * @generated
 */
public class ModemoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModemoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModemoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModemoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModemoSwitch<Adapter> modelSwitch =
		new ModemoSwitch<Adapter>() {
			@Override
			public Adapter caseRecurrenceStep(RecurrenceStep object) {
				return createRecurrenceStepAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseArrofRecStep(ArrofRecStep object) {
				return createArrofRecStepAdapter();
			}
			@Override
			public Adapter caseHorizontalgroup(Horizontalgroup object) {
				return createHorizontalgroupAdapter();
			}
			@Override
			public Adapter caseLoadbalancer(Loadbalancer object) {
				return createLoadbalancerAdapter();
			}
			@Override
			public Adapter caseElasticitycontroller(Elasticitycontroller object) {
				return createElasticitycontrollerAdapter();
			}
			@Override
			public Adapter caseInstancegrouplink(Instancegrouplink object) {
				return createInstancegrouplinkAdapter();
			}
			@Override
			public Adapter caseLoadbalancerlink(Loadbalancerlink object) {
				return createLoadbalancerlinkAdapter();
			}
			@Override
			public Adapter caseElasticlink(Elasticlink object) {
				return createElasticlinkAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseActiontrigger(Actiontrigger object) {
				return createActiontriggerAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseSteplink(Steplink object) {
				return createSteplinkAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseProviderlink(Providerlink object) {
				return createProviderlinkAdapter();
			}
			@Override
			public Adapter caseVmwareprovider(Vmwareprovider object) {
				return createVmwareproviderAdapter();
			}
			@Override
			public Adapter caseOpenstackprovider(Openstackprovider object) {
				return createOpenstackproviderAdapter();
			}
			@Override
			public Adapter caseAmazonprovider(Amazonprovider object) {
				return createAmazonproviderAdapter();
			}
			@Override
			public Adapter caseAzureprovider(Azureprovider object) {
				return createAzureproviderAdapter();
			}
			@Override
			public Adapter caseProviderinstancelink(Providerinstancelink object) {
				return createProviderinstancelinkAdapter();
			}
			@Override
			public Adapter caseCreation(Creation object) {
				return createCreationAdapter();
			}
			@Override
			public Adapter caseSchedulingpolicy(Schedulingpolicy object) {
				return createSchedulingpolicyAdapter();
			}
			@Override
			public Adapter caseUniqueschedulingpolicy(Uniqueschedulingpolicy object) {
				return createUniqueschedulingpolicyAdapter();
			}
			@Override
			public Adapter caseRecurringschedulingpolicy(Recurringschedulingpolicy object) {
				return createRecurringschedulingpolicyAdapter();
			}
			@Override
			public Adapter caseScalingpolicy(Scalingpolicy object) {
				return createScalingpolicyAdapter();
			}
			@Override
			public Adapter caseDynamicscalingpolicy(Dynamicscalingpolicy object) {
				return createDynamicscalingpolicyAdapter();
			}
			@Override
			public Adapter caseDynamicadjustmentscalingpolicy(Dynamicadjustmentscalingpolicy object) {
				return createDynamicadjustmentscalingpolicyAdapter();
			}
			@Override
			public Adapter caseSimpledynamicscalingpolicy(Simpledynamicscalingpolicy object) {
				return createSimpledynamicscalingpolicyAdapter();
			}
			@Override
			public Adapter caseStepdynamicscalingpolicy(Stepdynamicscalingpolicy object) {
				return createStepdynamicscalingpolicyAdapter();
			}
			@Override
			public Adapter caseManualscalingpolicy(Manualscalingpolicy object) {
				return createManualscalingpolicyAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseCpuutilisation(Cpuutilisation object) {
				return createCpuutilisationAdapter();
			}
			@Override
			public Adapter caseMemoryutilisation(Memoryutilisation object) {
				return createMemoryutilisationAdapter();
			}
			@Override
			public Adapter caseAllocationpolicy(Allocationpolicy object) {
				return createAllocationpolicyAdapter();
			}
			@Override
			public Adapter caseRoundrobin(Roundrobin object) {
				return createRoundrobinAdapter();
			}
			@Override
			public Adapter caseResponsetime(Responsetime object) {
				return createResponsetimeAdapter();
			}
			@Override
			public Adapter caseCost(Cost object) {
				return createCostAdapter();
			}
			@Override
			public Adapter caseSwappingpolicy(Swappingpolicy object) {
				return createSwappingpolicyAdapter();
			}
			@Override
			public Adapter caseSourcemigrationpolicy(Sourcemigrationpolicy object) {
				return createSourcemigrationpolicyAdapter();
			}
			@Override
			public Adapter caseLivemigration(Livemigration object) {
				return createLivemigrationAdapter();
			}
			@Override
			public Adapter caseNonlivemigration(Nonlivemigration object) {
				return createNonlivemigrationAdapter();
			}
			@Override
			public Adapter caseMigrationpolicy(Migrationpolicy object) {
				return createMigrationpolicyAdapter();
			}
			@Override
			public Adapter caseDynamicmigrationpolicy(Dynamicmigrationpolicy object) {
				return createDynamicmigrationpolicyAdapter();
			}
			@Override
			public Adapter caseManualmigrationpolicy(Manualmigrationpolicy object) {
				return createManualmigrationpolicyAdapter();
			}
			@Override
			public Adapter caseLoadvolume(Loadvolume object) {
				return createLoadvolumeAdapter();
			}
			@Override
			public Adapter casePower(Power object) {
				return createPowerAdapter();
			}
			@Override
			public Adapter caseTargetmigrationpolicy(Targetmigrationpolicy object) {
				return createTargetmigrationpolicyAdapter();
			}
			@Override
			public Adapter caseAvailableresources(Availableresources object) {
				return createAvailableresourcesAdapter();
			}
			@Override
			public Adapter caseManualtargetselection(Manualtargetselection object) {
				return createManualtargetselectionAdapter();
			}
			@Override
			public Adapter caseAvailableresourcesorload(Availableresourcesorload object) {
				return createAvailableresourcesorloadAdapter();
			}
			@Override
			public Adapter caseTargetresponsetime(Targetresponsetime object) {
				return createTargetresponsetimeAdapter();
			}
			@Override
			public Adapter caseResponsetimemetric(Responsetimemetric object) {
				return createResponsetimemetricAdapter();
			}
			@Override
			public Adapter caseLoadbalancerpolicy(Loadbalancerpolicy object) {
				return createLoadbalancerpolicyAdapter();
			}
			@Override
			public Adapter caseRoundrobinalgo(Roundrobinalgo object) {
				return createRoundrobinalgoAdapter();
			}
			@Override
			public Adapter caseLeastconn(Leastconn object) {
				return createLeastconnAdapter();
			}
			@Override
			public Adapter caseLeasttraffic(Leasttraffic object) {
				return createLeasttrafficAdapter();
			}
			@Override
			public Adapter caseWstaticrr(Wstaticrr object) {
				return createWstaticrrAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseFirst(First object) {
				return createFirstAdapter();
			}
			@Override
			public Adapter caseLeastlatency(Leastlatency object) {
				return createLeastlatencyAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep <em>Recurrence Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.RecurrenceStep
	 * @generated
	 */
	public Adapter createRecurrenceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep <em>Arrof Rec Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ArrofRecStep
	 * @generated
	 */
	public Adapter createArrofRecStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup <em>Horizontalgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Horizontalgroup
	 * @generated
	 */
	public Adapter createHorizontalgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer <em>Loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer
	 * @generated
	 */
	public Adapter createLoadbalancerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller <em>Elasticitycontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Elasticitycontroller
	 * @generated
	 */
	public Adapter createElasticitycontrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink <em>Instancegrouplink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Instancegrouplink
	 * @generated
	 */
	public Adapter createInstancegrouplinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerlink <em>Loadbalancerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerlink
	 * @generated
	 */
	public Adapter createLoadbalancerlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Elasticlink <em>Elasticlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Elasticlink
	 * @generated
	 */
	public Adapter createElasticlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger <em>Actiontrigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger
	 * @generated
	 */
	public Adapter createActiontriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Steplink <em>Steplink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Steplink
	 * @generated
	 */
	public Adapter createSteplinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Providerlink <em>Providerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Providerlink
	 * @generated
	 */
	public Adapter createProviderlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Vmwareprovider <em>Vmwareprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Vmwareprovider
	 * @generated
	 */
	public Adapter createVmwareproviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Openstackprovider <em>Openstackprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Openstackprovider
	 * @generated
	 */
	public Adapter createOpenstackproviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Amazonprovider <em>Amazonprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Amazonprovider
	 * @generated
	 */
	public Adapter createAmazonproviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Azureprovider <em>Azureprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Azureprovider
	 * @generated
	 */
	public Adapter createAzureproviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Providerinstancelink <em>Providerinstancelink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Providerinstancelink
	 * @generated
	 */
	public Adapter createProviderinstancelinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Creation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Creation
	 * @generated
	 */
	public Adapter createCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy <em>Schedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Schedulingpolicy
	 * @generated
	 */
	public Adapter createSchedulingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy <em>Uniqueschedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy
	 * @generated
	 */
	public Adapter createUniqueschedulingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy <em>Recurringschedulingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy
	 * @generated
	 */
	public Adapter createRecurringschedulingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy <em>Scalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Scalingpolicy
	 * @generated
	 */
	public Adapter createScalingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy <em>Dynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy
	 * @generated
	 */
	public Adapter createDynamicscalingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy <em>Dynamicadjustmentscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy
	 * @generated
	 */
	public Adapter createDynamicadjustmentscalingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Simpledynamicscalingpolicy <em>Simpledynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Simpledynamicscalingpolicy
	 * @generated
	 */
	public Adapter createSimpledynamicscalingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Stepdynamicscalingpolicy <em>Stepdynamicscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Stepdynamicscalingpolicy
	 * @generated
	 */
	public Adapter createStepdynamicscalingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy <em>Manualscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy
	 * @generated
	 */
	public Adapter createManualscalingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Cpuutilisation <em>Cpuutilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Cpuutilisation
	 * @generated
	 */
	public Adapter createCpuutilisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Memoryutilisation <em>Memoryutilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Memoryutilisation
	 * @generated
	 */
	public Adapter createMemoryutilisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Allocationpolicy <em>Allocationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Allocationpolicy
	 * @generated
	 */
	public Adapter createAllocationpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Roundrobin <em>Roundrobin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Roundrobin
	 * @generated
	 */
	public Adapter createRoundrobinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Responsetime <em>Responsetime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Responsetime
	 * @generated
	 */
	public Adapter createResponsetimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Cost
	 * @generated
	 */
	public Adapter createCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Swappingpolicy <em>Swappingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Swappingpolicy
	 * @generated
	 */
	public Adapter createSwappingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Sourcemigrationpolicy <em>Sourcemigrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Sourcemigrationpolicy
	 * @generated
	 */
	public Adapter createSourcemigrationpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Livemigration <em>Livemigration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Livemigration
	 * @generated
	 */
	public Adapter createLivemigrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Nonlivemigration <em>Nonlivemigration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Nonlivemigration
	 * @generated
	 */
	public Adapter createNonlivemigrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Migrationpolicy <em>Migrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Migrationpolicy
	 * @generated
	 */
	public Adapter createMigrationpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicmigrationpolicy <em>Dynamicmigrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Dynamicmigrationpolicy
	 * @generated
	 */
	public Adapter createDynamicmigrationpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualmigrationpolicy <em>Manualmigrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualmigrationpolicy
	 * @generated
	 */
	public Adapter createManualmigrationpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadvolume <em>Loadvolume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadvolume
	 * @generated
	 */
	public Adapter createLoadvolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Power <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Power
	 * @generated
	 */
	public Adapter createPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Targetmigrationpolicy <em>Targetmigrationpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Targetmigrationpolicy
	 * @generated
	 */
	public Adapter createTargetmigrationpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Availableresources <em>Availableresources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Availableresources
	 * @generated
	 */
	public Adapter createAvailableresourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualtargetselection <em>Manualtargetselection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Manualtargetselection
	 * @generated
	 */
	public Adapter createManualtargetselectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Availableresourcesorload <em>Availableresourcesorload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Availableresourcesorload
	 * @generated
	 */
	public Adapter createAvailableresourcesorloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Targetresponsetime <em>Targetresponsetime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Targetresponsetime
	 * @generated
	 */
	public Adapter createTargetresponsetimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Responsetimemetric <em>Responsetimemetric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Responsetimemetric
	 * @generated
	 */
	public Adapter createResponsetimemetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerpolicy <em>Loadbalancerpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Loadbalancerpolicy
	 * @generated
	 */
	public Adapter createLoadbalancerpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Roundrobinalgo <em>Roundrobinalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Roundrobinalgo
	 * @generated
	 */
	public Adapter createRoundrobinalgoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Leastconn <em>Leastconn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Leastconn
	 * @generated
	 */
	public Adapter createLeastconnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Leasttraffic <em>Leasttraffic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Leasttraffic
	 * @generated
	 */
	public Adapter createLeasttrafficAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Wstaticrr <em>Wstaticrr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Wstaticrr
	 * @generated
	 */
	public Adapter createWstaticrrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.First <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.First
	 * @generated
	 */
	public Adapter createFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.modemo.Leastlatency <em>Leastlatency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.Leastlatency
	 * @generated
	 */
	public Adapter createLeastlatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	public Adapter createMixinBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModemoAdapterFactory
