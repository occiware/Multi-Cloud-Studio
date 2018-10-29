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
package org.eclipse.cmf.occi.multicloud.modemo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage
 * @generated
 */
public interface ModemoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModemoFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.modemo.impl.ModemoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Recurrence Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurrence Step</em>'.
	 * @generated
	 */
	RecurrenceStep createRecurrenceStep();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	Array createArray();

	/**
	 * Returns a new object of class '<em>Arrof Rec Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrof Rec Step</em>'.
	 * @generated
	 */
	ArrofRecStep createArrofRecStep();

	/**
	 * Returns a new object of class '<em>Horizontalgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontalgroup</em>'.
	 * @generated
	 */
	Horizontalgroup createHorizontalgroup();

	/**
	 * Returns a new object of class '<em>Loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loadbalancer</em>'.
	 * @generated
	 */
	Loadbalancer createLoadbalancer();

	/**
	 * Returns a new object of class '<em>Elasticitycontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elasticitycontroller</em>'.
	 * @generated
	 */
	Elasticitycontroller createElasticitycontroller();

	/**
	 * Returns a new object of class '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancegrouplink</em>'.
	 * @generated
	 */
	Instancegrouplink createInstancegrouplink();

	/**
	 * Returns a new object of class '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loadbalancerlink</em>'.
	 * @generated
	 */
	Loadbalancerlink createLoadbalancerlink();

	/**
	 * Returns a new object of class '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elasticlink</em>'.
	 * @generated
	 */
	Elasticlink createElasticlink();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Actiontrigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actiontrigger</em>'.
	 * @generated
	 */
	Actiontrigger createActiontrigger();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steplink</em>'.
	 * @generated
	 */
	Steplink createSteplink();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Providerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Providerlink</em>'.
	 * @generated
	 */
	Providerlink createProviderlink();

	/**
	 * Returns a new object of class '<em>Vmwareprovider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vmwareprovider</em>'.
	 * @generated
	 */
	Vmwareprovider createVmwareprovider();

	/**
	 * Returns a new object of class '<em>Openstackprovider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Openstackprovider</em>'.
	 * @generated
	 */
	Openstackprovider createOpenstackprovider();

	/**
	 * Returns a new object of class '<em>Amazonprovider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amazonprovider</em>'.
	 * @generated
	 */
	Amazonprovider createAmazonprovider();

	/**
	 * Returns a new object of class '<em>Azureprovider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Azureprovider</em>'.
	 * @generated
	 */
	Azureprovider createAzureprovider();

	/**
	 * Returns a new object of class '<em>Providerinstancelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Providerinstancelink</em>'.
	 * @generated
	 */
	Providerinstancelink createProviderinstancelink();

	/**
	 * Returns a new object of class '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation</em>'.
	 * @generated
	 */
	Creation createCreation();

	/**
	 * Returns a new object of class '<em>Schedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedulingpolicy</em>'.
	 * @generated
	 */
	Schedulingpolicy createSchedulingpolicy();

	/**
	 * Returns a new object of class '<em>Uniqueschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniqueschedulingpolicy</em>'.
	 * @generated
	 */
	Uniqueschedulingpolicy createUniqueschedulingpolicy();

	/**
	 * Returns a new object of class '<em>Recurringschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurringschedulingpolicy</em>'.
	 * @generated
	 */
	Recurringschedulingpolicy createRecurringschedulingpolicy();

	/**
	 * Returns a new object of class '<em>Scalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalingpolicy</em>'.
	 * @generated
	 */
	Scalingpolicy createScalingpolicy();

	/**
	 * Returns a new object of class '<em>Dynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamicscalingpolicy</em>'.
	 * @generated
	 */
	Dynamicscalingpolicy createDynamicscalingpolicy();

	/**
	 * Returns a new object of class '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * @generated
	 */
	Dynamicadjustmentscalingpolicy createDynamicadjustmentscalingpolicy();

	/**
	 * Returns a new object of class '<em>Simpledynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simpledynamicscalingpolicy</em>'.
	 * @generated
	 */
	Simpledynamicscalingpolicy createSimpledynamicscalingpolicy();

	/**
	 * Returns a new object of class '<em>Stepdynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stepdynamicscalingpolicy</em>'.
	 * @generated
	 */
	Stepdynamicscalingpolicy createStepdynamicscalingpolicy();

	/**
	 * Returns a new object of class '<em>Manualscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manualscalingpolicy</em>'.
	 * @generated
	 */
	Manualscalingpolicy createManualscalingpolicy();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Cpuutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpuutilisation</em>'.
	 * @generated
	 */
	Cpuutilisation createCpuutilisation();

	/**
	 * Returns a new object of class '<em>Memoryutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memoryutilisation</em>'.
	 * @generated
	 */
	Memoryutilisation createMemoryutilisation();

	/**
	 * Returns a new object of class '<em>Allocationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocationpolicy</em>'.
	 * @generated
	 */
	Allocationpolicy createAllocationpolicy();

	/**
	 * Returns a new object of class '<em>Roundrobin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roundrobin</em>'.
	 * @generated
	 */
	Roundrobin createRoundrobin();

	/**
	 * Returns a new object of class '<em>Responsetime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsetime</em>'.
	 * @generated
	 */
	Responsetime createResponsetime();

	/**
	 * Returns a new object of class '<em>Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost</em>'.
	 * @generated
	 */
	Cost createCost();

	/**
	 * Returns a new object of class '<em>Swappingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swappingpolicy</em>'.
	 * @generated
	 */
	Swappingpolicy createSwappingpolicy();

	/**
	 * Returns a new object of class '<em>Sourcemigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sourcemigrationpolicy</em>'.
	 * @generated
	 */
	Sourcemigrationpolicy createSourcemigrationpolicy();

	/**
	 * Returns a new object of class '<em>Livemigration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livemigration</em>'.
	 * @generated
	 */
	Livemigration createLivemigration();

	/**
	 * Returns a new object of class '<em>Nonlivemigration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nonlivemigration</em>'.
	 * @generated
	 */
	Nonlivemigration createNonlivemigration();

	/**
	 * Returns a new object of class '<em>Migrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migrationpolicy</em>'.
	 * @generated
	 */
	Migrationpolicy createMigrationpolicy();

	/**
	 * Returns a new object of class '<em>Dynamicmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamicmigrationpolicy</em>'.
	 * @generated
	 */
	Dynamicmigrationpolicy createDynamicmigrationpolicy();

	/**
	 * Returns a new object of class '<em>Manualmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manualmigrationpolicy</em>'.
	 * @generated
	 */
	Manualmigrationpolicy createManualmigrationpolicy();

	/**
	 * Returns a new object of class '<em>Loadvolume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loadvolume</em>'.
	 * @generated
	 */
	Loadvolume createLoadvolume();

	/**
	 * Returns a new object of class '<em>Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power</em>'.
	 * @generated
	 */
	Power createPower();

	/**
	 * Returns a new object of class '<em>Targetmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Targetmigrationpolicy</em>'.
	 * @generated
	 */
	Targetmigrationpolicy createTargetmigrationpolicy();

	/**
	 * Returns a new object of class '<em>Availableresources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availableresources</em>'.
	 * @generated
	 */
	Availableresources createAvailableresources();

	/**
	 * Returns a new object of class '<em>Manualtargetselection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manualtargetselection</em>'.
	 * @generated
	 */
	Manualtargetselection createManualtargetselection();

	/**
	 * Returns a new object of class '<em>Availableresourcesorload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availableresourcesorload</em>'.
	 * @generated
	 */
	Availableresourcesorload createAvailableresourcesorload();

	/**
	 * Returns a new object of class '<em>Targetresponsetime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Targetresponsetime</em>'.
	 * @generated
	 */
	Targetresponsetime createTargetresponsetime();

	/**
	 * Returns a new object of class '<em>Responsetimemetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsetimemetric</em>'.
	 * @generated
	 */
	Responsetimemetric createResponsetimemetric();

	/**
	 * Returns a new object of class '<em>Loadbalancerpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loadbalancerpolicy</em>'.
	 * @generated
	 */
	Loadbalancerpolicy createLoadbalancerpolicy();

	/**
	 * Returns a new object of class '<em>Roundrobinalgo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roundrobinalgo</em>'.
	 * @generated
	 */
	Roundrobinalgo createRoundrobinalgo();

	/**
	 * Returns a new object of class '<em>Leastconn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leastconn</em>'.
	 * @generated
	 */
	Leastconn createLeastconn();

	/**
	 * Returns a new object of class '<em>Leasttraffic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leasttraffic</em>'.
	 * @generated
	 */
	Leasttraffic createLeasttraffic();

	/**
	 * Returns a new object of class '<em>Wstaticrr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wstaticrr</em>'.
	 * @generated
	 */
	Wstaticrr createWstaticrr();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns a new object of class '<em>First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First</em>'.
	 * @generated
	 */
	First createFirst();

	/**
	 * Returns a new object of class '<em>Leastlatency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leastlatency</em>'.
	 * @generated
	 */
	Leastlatency createLeastlatency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModemoPackage getModemoPackage();

} //ModemoFactory
