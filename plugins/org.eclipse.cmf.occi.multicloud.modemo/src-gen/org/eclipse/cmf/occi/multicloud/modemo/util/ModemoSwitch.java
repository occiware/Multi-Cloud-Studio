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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage
 * @generated
 */
public class ModemoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModemoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModemoSwitch() {
		if (modelPackage == null) {
			modelPackage = ModemoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModemoPackage.RECURRENCE_STEP: {
				RecurrenceStep recurrenceStep = (RecurrenceStep)theEObject;
				T result = caseRecurrenceStep(recurrenceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ARROF_REC_STEP: {
				ArrofRecStep arrofRecStep = (ArrofRecStep)theEObject;
				T result = caseArrofRecStep(arrofRecStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.HORIZONTALGROUP: {
				Horizontalgroup horizontalgroup = (Horizontalgroup)theEObject;
				T result = caseHorizontalgroup(horizontalgroup);
				if (result == null) result = caseResource(horizontalgroup);
				if (result == null) result = caseEntity(horizontalgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LOADBALANCER: {
				Loadbalancer loadbalancer = (Loadbalancer)theEObject;
				T result = caseLoadbalancer(loadbalancer);
				if (result == null) result = caseResource(loadbalancer);
				if (result == null) result = caseEntity(loadbalancer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ELASTICITYCONTROLLER: {
				Elasticitycontroller elasticitycontroller = (Elasticitycontroller)theEObject;
				T result = caseElasticitycontroller(elasticitycontroller);
				if (result == null) result = caseResource(elasticitycontroller);
				if (result == null) result = caseEntity(elasticitycontroller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.INSTANCEGROUPLINK: {
				Instancegrouplink instancegrouplink = (Instancegrouplink)theEObject;
				T result = caseInstancegrouplink(instancegrouplink);
				if (result == null) result = caseLink(instancegrouplink);
				if (result == null) result = caseEntity(instancegrouplink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LOADBALANCERLINK: {
				Loadbalancerlink loadbalancerlink = (Loadbalancerlink)theEObject;
				T result = caseLoadbalancerlink(loadbalancerlink);
				if (result == null) result = caseLink(loadbalancerlink);
				if (result == null) result = caseEntity(loadbalancerlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ELASTICLINK: {
				Elasticlink elasticlink = (Elasticlink)theEObject;
				T result = caseElasticlink(elasticlink);
				if (result == null) result = caseLink(elasticlink);
				if (result == null) result = caseEntity(elasticlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseLink(rule);
				if (result == null) result = caseEntity(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ACTIONTRIGGER: {
				Actiontrigger actiontrigger = (Actiontrigger)theEObject;
				T result = caseActiontrigger(actiontrigger);
				if (result == null) result = caseResource(actiontrigger);
				if (result == null) result = caseEntity(actiontrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseResource(step);
				if (result == null) result = caseEntity(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.STEPLINK: {
				Steplink steplink = (Steplink)theEObject;
				T result = caseSteplink(steplink);
				if (result == null) result = caseLink(steplink);
				if (result == null) result = caseEntity(steplink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = caseResource(provider);
				if (result == null) result = caseEntity(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.PROVIDERLINK: {
				Providerlink providerlink = (Providerlink)theEObject;
				T result = caseProviderlink(providerlink);
				if (result == null) result = caseLink(providerlink);
				if (result == null) result = caseEntity(providerlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.VMWAREPROVIDER: {
				Vmwareprovider vmwareprovider = (Vmwareprovider)theEObject;
				T result = caseVmwareprovider(vmwareprovider);
				if (result == null) result = caseProvider(vmwareprovider);
				if (result == null) result = caseResource(vmwareprovider);
				if (result == null) result = caseEntity(vmwareprovider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.OPENSTACKPROVIDER: {
				Openstackprovider openstackprovider = (Openstackprovider)theEObject;
				T result = caseOpenstackprovider(openstackprovider);
				if (result == null) result = caseProvider(openstackprovider);
				if (result == null) result = caseResource(openstackprovider);
				if (result == null) result = caseEntity(openstackprovider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.AMAZONPROVIDER: {
				Amazonprovider amazonprovider = (Amazonprovider)theEObject;
				T result = caseAmazonprovider(amazonprovider);
				if (result == null) result = caseProvider(amazonprovider);
				if (result == null) result = caseResource(amazonprovider);
				if (result == null) result = caseEntity(amazonprovider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.AZUREPROVIDER: {
				Azureprovider azureprovider = (Azureprovider)theEObject;
				T result = caseAzureprovider(azureprovider);
				if (result == null) result = caseProvider(azureprovider);
				if (result == null) result = caseResource(azureprovider);
				if (result == null) result = caseEntity(azureprovider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.PROVIDERINSTANCELINK: {
				Providerinstancelink providerinstancelink = (Providerinstancelink)theEObject;
				T result = caseProviderinstancelink(providerinstancelink);
				if (result == null) result = caseLink(providerinstancelink);
				if (result == null) result = caseEntity(providerinstancelink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.CREATION: {
				Creation creation = (Creation)theEObject;
				T result = caseCreation(creation);
				if (result == null) result = caseMixinBase(creation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.SCHEDULINGPOLICY: {
				Schedulingpolicy schedulingpolicy = (Schedulingpolicy)theEObject;
				T result = caseSchedulingpolicy(schedulingpolicy);
				if (result == null) result = caseMixinBase(schedulingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.UNIQUESCHEDULINGPOLICY: {
				Uniqueschedulingpolicy uniqueschedulingpolicy = (Uniqueschedulingpolicy)theEObject;
				T result = caseUniqueschedulingpolicy(uniqueschedulingpolicy);
				if (result == null) result = caseSchedulingpolicy(uniqueschedulingpolicy);
				if (result == null) result = caseMixinBase(uniqueschedulingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.RECURRINGSCHEDULINGPOLICY: {
				Recurringschedulingpolicy recurringschedulingpolicy = (Recurringschedulingpolicy)theEObject;
				T result = caseRecurringschedulingpolicy(recurringschedulingpolicy);
				if (result == null) result = caseSchedulingpolicy(recurringschedulingpolicy);
				if (result == null) result = caseMixinBase(recurringschedulingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.SCALINGPOLICY: {
				Scalingpolicy scalingpolicy = (Scalingpolicy)theEObject;
				T result = caseScalingpolicy(scalingpolicy);
				if (result == null) result = caseMixinBase(scalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.DYNAMICSCALINGPOLICY: {
				Dynamicscalingpolicy dynamicscalingpolicy = (Dynamicscalingpolicy)theEObject;
				T result = caseDynamicscalingpolicy(dynamicscalingpolicy);
				if (result == null) result = caseScalingpolicy(dynamicscalingpolicy);
				if (result == null) result = caseMixinBase(dynamicscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.DYNAMICADJUSTMENTSCALINGPOLICY: {
				Dynamicadjustmentscalingpolicy dynamicadjustmentscalingpolicy = (Dynamicadjustmentscalingpolicy)theEObject;
				T result = caseDynamicadjustmentscalingpolicy(dynamicadjustmentscalingpolicy);
				if (result == null) result = caseDynamicscalingpolicy(dynamicadjustmentscalingpolicy);
				if (result == null) result = caseScalingpolicy(dynamicadjustmentscalingpolicy);
				if (result == null) result = caseMixinBase(dynamicadjustmentscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.SIMPLEDYNAMICSCALINGPOLICY: {
				Simpledynamicscalingpolicy simpledynamicscalingpolicy = (Simpledynamicscalingpolicy)theEObject;
				T result = caseSimpledynamicscalingpolicy(simpledynamicscalingpolicy);
				if (result == null) result = caseDynamicscalingpolicy(simpledynamicscalingpolicy);
				if (result == null) result = caseScalingpolicy(simpledynamicscalingpolicy);
				if (result == null) result = caseMixinBase(simpledynamicscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.STEPDYNAMICSCALINGPOLICY: {
				Stepdynamicscalingpolicy stepdynamicscalingpolicy = (Stepdynamicscalingpolicy)theEObject;
				T result = caseStepdynamicscalingpolicy(stepdynamicscalingpolicy);
				if (result == null) result = caseDynamicscalingpolicy(stepdynamicscalingpolicy);
				if (result == null) result = caseScalingpolicy(stepdynamicscalingpolicy);
				if (result == null) result = caseMixinBase(stepdynamicscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.MANUALSCALINGPOLICY: {
				Manualscalingpolicy manualscalingpolicy = (Manualscalingpolicy)theEObject;
				T result = caseManualscalingpolicy(manualscalingpolicy);
				if (result == null) result = caseScalingpolicy(manualscalingpolicy);
				if (result == null) result = caseMixinBase(manualscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = caseMixinBase(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.CPUUTILISATION: {
				Cpuutilisation cpuutilisation = (Cpuutilisation)theEObject;
				T result = caseCpuutilisation(cpuutilisation);
				if (result == null) result = caseMetric(cpuutilisation);
				if (result == null) result = caseMixinBase(cpuutilisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.MEMORYUTILISATION: {
				Memoryutilisation memoryutilisation = (Memoryutilisation)theEObject;
				T result = caseMemoryutilisation(memoryutilisation);
				if (result == null) result = caseMetric(memoryutilisation);
				if (result == null) result = caseMixinBase(memoryutilisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ALLOCATIONPOLICY: {
				Allocationpolicy allocationpolicy = (Allocationpolicy)theEObject;
				T result = caseAllocationpolicy(allocationpolicy);
				if (result == null) result = caseMixinBase(allocationpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ROUNDROBIN: {
				Roundrobin roundrobin = (Roundrobin)theEObject;
				T result = caseRoundrobin(roundrobin);
				if (result == null) result = caseAllocationpolicy(roundrobin);
				if (result == null) result = caseMixinBase(roundrobin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.RESPONSETIME: {
				Responsetime responsetime = (Responsetime)theEObject;
				T result = caseResponsetime(responsetime);
				if (result == null) result = caseAllocationpolicy(responsetime);
				if (result == null) result = caseMixinBase(responsetime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.COST: {
				Cost cost = (Cost)theEObject;
				T result = caseCost(cost);
				if (result == null) result = caseAllocationpolicy(cost);
				if (result == null) result = caseMixinBase(cost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.SWAPPINGPOLICY: {
				Swappingpolicy swappingpolicy = (Swappingpolicy)theEObject;
				T result = caseSwappingpolicy(swappingpolicy);
				if (result == null) result = caseMixinBase(swappingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.SOURCEMIGRATIONPOLICY: {
				Sourcemigrationpolicy sourcemigrationpolicy = (Sourcemigrationpolicy)theEObject;
				T result = caseSourcemigrationpolicy(sourcemigrationpolicy);
				if (result == null) result = caseMixinBase(sourcemigrationpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LIVEMIGRATION: {
				Livemigration livemigration = (Livemigration)theEObject;
				T result = caseLivemigration(livemigration);
				if (result == null) result = caseMigrationpolicy(livemigration);
				if (result == null) result = caseMixinBase(livemigration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.NONLIVEMIGRATION: {
				Nonlivemigration nonlivemigration = (Nonlivemigration)theEObject;
				T result = caseNonlivemigration(nonlivemigration);
				if (result == null) result = caseMigrationpolicy(nonlivemigration);
				if (result == null) result = caseMixinBase(nonlivemigration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.MIGRATIONPOLICY: {
				Migrationpolicy migrationpolicy = (Migrationpolicy)theEObject;
				T result = caseMigrationpolicy(migrationpolicy);
				if (result == null) result = caseMixinBase(migrationpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.DYNAMICMIGRATIONPOLICY: {
				Dynamicmigrationpolicy dynamicmigrationpolicy = (Dynamicmigrationpolicy)theEObject;
				T result = caseDynamicmigrationpolicy(dynamicmigrationpolicy);
				if (result == null) result = caseSourcemigrationpolicy(dynamicmigrationpolicy);
				if (result == null) result = caseMixinBase(dynamicmigrationpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.MANUALMIGRATIONPOLICY: {
				Manualmigrationpolicy manualmigrationpolicy = (Manualmigrationpolicy)theEObject;
				T result = caseManualmigrationpolicy(manualmigrationpolicy);
				if (result == null) result = caseSourcemigrationpolicy(manualmigrationpolicy);
				if (result == null) result = caseMixinBase(manualmigrationpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LOADVOLUME: {
				Loadvolume loadvolume = (Loadvolume)theEObject;
				T result = caseLoadvolume(loadvolume);
				if (result == null) result = caseDynamicmigrationpolicy(loadvolume);
				if (result == null) result = caseSourcemigrationpolicy(loadvolume);
				if (result == null) result = caseMixinBase(loadvolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.POWER: {
				Power power = (Power)theEObject;
				T result = casePower(power);
				if (result == null) result = caseDynamicmigrationpolicy(power);
				if (result == null) result = caseSourcemigrationpolicy(power);
				if (result == null) result = caseMixinBase(power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.TARGETMIGRATIONPOLICY: {
				Targetmigrationpolicy targetmigrationpolicy = (Targetmigrationpolicy)theEObject;
				T result = caseTargetmigrationpolicy(targetmigrationpolicy);
				if (result == null) result = caseMixinBase(targetmigrationpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.AVAILABLERESOURCES: {
				Availableresources availableresources = (Availableresources)theEObject;
				T result = caseAvailableresources(availableresources);
				if (result == null) result = caseAllocationpolicy(availableresources);
				if (result == null) result = caseMixinBase(availableresources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.MANUALTARGETSELECTION: {
				Manualtargetselection manualtargetselection = (Manualtargetselection)theEObject;
				T result = caseManualtargetselection(manualtargetselection);
				if (result == null) result = caseTargetmigrationpolicy(manualtargetselection);
				if (result == null) result = caseMixinBase(manualtargetselection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.AVAILABLERESOURCESORLOAD: {
				Availableresourcesorload availableresourcesorload = (Availableresourcesorload)theEObject;
				T result = caseAvailableresourcesorload(availableresourcesorload);
				if (result == null) result = caseTargetmigrationpolicy(availableresourcesorload);
				if (result == null) result = caseMixinBase(availableresourcesorload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.TARGETRESPONSETIME: {
				Targetresponsetime targetresponsetime = (Targetresponsetime)theEObject;
				T result = caseTargetresponsetime(targetresponsetime);
				if (result == null) result = caseTargetmigrationpolicy(targetresponsetime);
				if (result == null) result = caseMixinBase(targetresponsetime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.RESPONSETIMEMETRIC: {
				Responsetimemetric responsetimemetric = (Responsetimemetric)theEObject;
				T result = caseResponsetimemetric(responsetimemetric);
				if (result == null) result = caseMetric(responsetimemetric);
				if (result == null) result = caseMixinBase(responsetimemetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LOADBALANCERPOLICY: {
				Loadbalancerpolicy loadbalancerpolicy = (Loadbalancerpolicy)theEObject;
				T result = caseLoadbalancerpolicy(loadbalancerpolicy);
				if (result == null) result = caseMixinBase(loadbalancerpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.ROUNDROBINALGO: {
				Roundrobinalgo roundrobinalgo = (Roundrobinalgo)theEObject;
				T result = caseRoundrobinalgo(roundrobinalgo);
				if (result == null) result = caseLoadbalancerpolicy(roundrobinalgo);
				if (result == null) result = caseMixinBase(roundrobinalgo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LEASTCONN: {
				Leastconn leastconn = (Leastconn)theEObject;
				T result = caseLeastconn(leastconn);
				if (result == null) result = caseLoadbalancerpolicy(leastconn);
				if (result == null) result = caseMixinBase(leastconn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LEASTTRAFFIC: {
				Leasttraffic leasttraffic = (Leasttraffic)theEObject;
				T result = caseLeasttraffic(leasttraffic);
				if (result == null) result = caseLoadbalancerpolicy(leasttraffic);
				if (result == null) result = caseMixinBase(leasttraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.WSTATICRR: {
				Wstaticrr wstaticrr = (Wstaticrr)theEObject;
				T result = caseWstaticrr(wstaticrr);
				if (result == null) result = caseLoadbalancerpolicy(wstaticrr);
				if (result == null) result = caseMixinBase(wstaticrr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseLoadbalancerpolicy(source);
				if (result == null) result = caseMixinBase(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.FIRST: {
				First first = (First)theEObject;
				T result = caseFirst(first);
				if (result == null) result = caseLoadbalancerpolicy(first);
				if (result == null) result = caseMixinBase(first);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModemoPackage.LEASTLATENCY: {
				Leastlatency leastlatency = (Leastlatency)theEObject;
				T result = caseLeastlatency(leastlatency);
				if (result == null) result = caseLoadbalancerpolicy(leastlatency);
				if (result == null) result = caseMixinBase(leastlatency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurrence Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurrence Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurrenceStep(RecurrenceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrof Rec Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrof Rec Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrofRecStep(ArrofRecStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontalgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontalgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalgroup(Horizontalgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadbalancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadbalancer(Loadbalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elasticitycontroller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elasticitycontroller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticitycontroller(Elasticitycontroller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instancegrouplink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancegrouplink(Instancegrouplink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadbalancerlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadbalancerlink(Loadbalancerlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elasticlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticlink(Elasticlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actiontrigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actiontrigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiontrigger(Actiontrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steplink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteplink(Steplink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Providerlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Providerlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderlink(Providerlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vmwareprovider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vmwareprovider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmwareprovider(Vmwareprovider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Openstackprovider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstackprovider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstackprovider(Openstackprovider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazonprovider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazonprovider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonprovider(Amazonprovider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Azureprovider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Azureprovider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAzureprovider(Azureprovider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Providerinstancelink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Providerinstancelink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderinstancelink(Providerinstancelink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreation(Creation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedulingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingpolicy(Schedulingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniqueschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniqueschedulingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueschedulingpolicy(Uniqueschedulingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurringschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurringschedulingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurringschedulingpolicy(Recurringschedulingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingpolicy(Scalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamicscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicscalingpolicy(Dynamicscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicadjustmentscalingpolicy(Dynamicadjustmentscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simpledynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simpledynamicscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpledynamicscalingpolicy(Simpledynamicscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stepdynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stepdynamicscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepdynamicscalingpolicy(Stepdynamicscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manualscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manualscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualscalingpolicy(Manualscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpuutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpuutilisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuutilisation(Cpuutilisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memoryutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memoryutilisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryutilisation(Memoryutilisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocationpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationpolicy(Allocationpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roundrobin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roundrobin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundrobin(Roundrobin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsetime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsetime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsetime(Responsetime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCost(Cost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swappingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swappingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwappingpolicy(Swappingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sourcemigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sourcemigrationpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourcemigrationpolicy(Sourcemigrationpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livemigration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livemigration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivemigration(Livemigration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonlivemigration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonlivemigration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonlivemigration(Nonlivemigration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migrationpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrationpolicy(Migrationpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamicmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamicmigrationpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicmigrationpolicy(Dynamicmigrationpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manualmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manualmigrationpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualmigrationpolicy(Manualmigrationpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadvolume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadvolume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadvolume(Loadvolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePower(Power object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Targetmigrationpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Targetmigrationpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetmigrationpolicy(Targetmigrationpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availableresources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availableresources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailableresources(Availableresources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manualtargetselection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manualtargetselection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualtargetselection(Manualtargetselection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availableresourcesorload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availableresourcesorload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailableresourcesorload(Availableresourcesorload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Targetresponsetime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Targetresponsetime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetresponsetime(Targetresponsetime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsetimemetric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsetimemetric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsetimemetric(Responsetimemetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadbalancerpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadbalancerpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadbalancerpolicy(Loadbalancerpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roundrobinalgo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roundrobinalgo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundrobinalgo(Roundrobinalgo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leastconn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leastconn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeastconn(Leastconn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leasttraffic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leasttraffic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeasttraffic(Leasttraffic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wstaticrr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wstaticrr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWstaticrr(Wstaticrr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirst(First object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leastlatency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leastlatency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeastlatency(Leastlatency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModemoSwitch
