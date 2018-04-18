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

import org.eclipse.cmf.occi.multicloud.modemo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModemoFactoryImpl extends EFactoryImpl implements ModemoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModemoFactory init() {
		try {
			ModemoFactory theModemoFactory = (ModemoFactory)EPackage.Registry.INSTANCE.getEFactory(ModemoPackage.eNS_URI);
			if (theModemoFactory != null) {
				return theModemoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModemoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModemoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModemoPackage.RECURRENCE_STEP: return createRecurrenceStep();
			case ModemoPackage.ARRAY: return createArray();
			case ModemoPackage.ARROF_REC_STEP: return createArrofRecStep();
			case ModemoPackage.HORIZONTALGROUP: return createHorizontalgroup();
			case ModemoPackage.LOADBALANCER: return createLoadbalancer();
			case ModemoPackage.ELASTICITYCONTROLLER: return createElasticitycontroller();
			case ModemoPackage.INSTANCEGROUPLINK: return createInstancegrouplink();
			case ModemoPackage.LOADBALANCERLINK: return createLoadbalancerlink();
			case ModemoPackage.ELASTICLINK: return createElasticlink();
			case ModemoPackage.RULE: return createRule();
			case ModemoPackage.ACTIONTRIGGER: return createActiontrigger();
			case ModemoPackage.STEP: return createStep();
			case ModemoPackage.STEPLINK: return createSteplink();
			case ModemoPackage.PROVIDER: return createProvider();
			case ModemoPackage.PROVIDERLINK: return createProviderlink();
			case ModemoPackage.PROVIDERVMWARE: return createProvidervmware();
			case ModemoPackage.PROVIDEROPENSTACK: return createProvideropenstack();
			case ModemoPackage.PROVIDERAMAZON: return createProvideramazon();
			case ModemoPackage.PROVIDERAZURE: return createProviderazure();
			case ModemoPackage.PROVIDERINSTANCELINK: return createProviderinstancelink();
			case ModemoPackage.CREATION: return createCreation();
			case ModemoPackage.SCHEDULINGPOLICY: return createSchedulingpolicy();
			case ModemoPackage.UNIQUESCHEDULINGPOLICY: return createUniqueschedulingpolicy();
			case ModemoPackage.RECURRINGSCHEDULINGPOLICY: return createRecurringschedulingpolicy();
			case ModemoPackage.SCALINGPOLICY: return createScalingpolicy();
			case ModemoPackage.DYNAMICSCALINGPOLICY: return createDynamicscalingpolicy();
			case ModemoPackage.DYNAMICADJUSTMENTSCALINGPOLICY: return createDynamicadjustmentscalingpolicy();
			case ModemoPackage.SIMPLEDYNAMICSCALINGPOLICY: return createSimpledynamicscalingpolicy();
			case ModemoPackage.STEPDYNAMICSCALINGPOLICY: return createStepdynamicscalingpolicy();
			case ModemoPackage.MANUALSCALINGPOLICY: return createManualscalingpolicy();
			case ModemoPackage.METRIC: return createMetric();
			case ModemoPackage.CPUUTILISATION: return createCpuutilisation();
			case ModemoPackage.MEMORYUTILISATION: return createMemoryutilisation();
			case ModemoPackage.ALLOCATIONPOLICY: return createAllocationpolicy();
			case ModemoPackage.ROUNDROBIN: return createRoundrobin();
			case ModemoPackage.RESPONSETIME: return createResponsetime();
			case ModemoPackage.COST: return createCost();
			case ModemoPackage.SWAPPINGPOLICY: return createSwappingpolicy();
			case ModemoPackage.SOURCEMIGRATIONPOLICITY: return createSourcemigrationpolicity();
			case ModemoPackage.LIVEMIGRATION: return createLivemigration();
			case ModemoPackage.NONLIVEMIGRATION: return createNonlivemigration();
			case ModemoPackage.MIGRATIONTYPE: return createMigrationtype();
			case ModemoPackage.DYNAMICMIGRATIONPOLICY: return createDynamicmigrationpolicy();
			case ModemoPackage.MANUALMIGRATIONPOLICY: return createManualmigrationpolicy();
			case ModemoPackage.SLA: return createSla();
			case ModemoPackage.LOADVOLUME: return createLoadvolume();
			case ModemoPackage.POWER: return createPower();
			case ModemoPackage.RESOURCEWASTAGE: return createResourcewastage();
			case ModemoPackage.TARGETMIGRATIONPOLICY: return createTargetmigrationpolicy();
			case ModemoPackage.AVAILABLERESOURCES: return createAvailableresources();
			case ModemoPackage.MANUALTARGETSELECTION: return createManualtargetselection();
			case ModemoPackage.AVAILALBLERESOURCESORLOAD: return createAvailalbleresourcesorload();
			case ModemoPackage.TARGETRESPONSETIME: return createTargetresponsetime();
			case ModemoPackage.RESPONSETIMEMETRIC: return createResponsetimemetric();
			case ModemoPackage.NETWORKCONTENTION: return createNetworkcontention();
			case ModemoPackage.LOADBALANCERALGORITHM: return createLoadbalanceralgorithm();
			case ModemoPackage.ROUNDROBINALGO: return createRoundrobinalgo();
			case ModemoPackage.LEASTCONN: return createLeastconn();
			case ModemoPackage.STICKYSESSIONS: return createStickysessions();
			case ModemoPackage.WSTATICRR: return createWstaticrr();
			case ModemoPackage.SOURCE: return createSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModemoPackage.TYPE_METRIC:
				return createTypeMetricFromString(eDataType, initialValue);
			case ModemoPackage.OPERATOR_TYPE:
				return createOperatorTypeFromString(eDataType, initialValue);
			case ModemoPackage.ACTION_OPERATION:
				return createActionOperationFromString(eDataType, initialValue);
			case ModemoPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case ModemoPackage.METRIC_TARGET_TRACKING:
				return createMetricTargetTrackingFromString(eDataType, initialValue);
			case ModemoPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case ModemoPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case ModemoPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModemoPackage.TYPE_METRIC:
				return convertTypeMetricToString(eDataType, instanceValue);
			case ModemoPackage.OPERATOR_TYPE:
				return convertOperatorTypeToString(eDataType, instanceValue);
			case ModemoPackage.ACTION_OPERATION:
				return convertActionOperationToString(eDataType, instanceValue);
			case ModemoPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case ModemoPackage.METRIC_TARGET_TRACKING:
				return convertMetricTargetTrackingToString(eDataType, instanceValue);
			case ModemoPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case ModemoPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case ModemoPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceStep createRecurrenceStep() {
		RecurrenceStepImpl recurrenceStep = new RecurrenceStepImpl();
		return recurrenceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrofRecStep createArrofRecStep() {
		ArrofRecStepImpl arrofRecStep = new ArrofRecStepImpl();
		return arrofRecStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Horizontalgroup createHorizontalgroup() {
		HorizontalgroupImpl horizontalgroup = new HorizontalgroupImpl();
		return horizontalgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadbalancer createLoadbalancer() {
		LoadbalancerImpl loadbalancer = new LoadbalancerImpl();
		return loadbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elasticitycontroller createElasticitycontroller() {
		ElasticitycontrollerImpl elasticitycontroller = new ElasticitycontrollerImpl();
		return elasticitycontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instancegrouplink createInstancegrouplink() {
		InstancegrouplinkImpl instancegrouplink = new InstancegrouplinkImpl();
		return instancegrouplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadbalancerlink createLoadbalancerlink() {
		LoadbalancerlinkImpl loadbalancerlink = new LoadbalancerlinkImpl();
		return loadbalancerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elasticlink createElasticlink() {
		ElasticlinkImpl elasticlink = new ElasticlinkImpl();
		return elasticlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actiontrigger createActiontrigger() {
		ActiontriggerImpl actiontrigger = new ActiontriggerImpl();
		return actiontrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steplink createSteplink() {
		SteplinkImpl steplink = new SteplinkImpl();
		return steplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Providerlink createProviderlink() {
		ProviderlinkImpl providerlink = new ProviderlinkImpl();
		return providerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Providervmware createProvidervmware() {
		ProvidervmwareImpl providervmware = new ProvidervmwareImpl();
		return providervmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provideropenstack createProvideropenstack() {
		ProvideropenstackImpl provideropenstack = new ProvideropenstackImpl();
		return provideropenstack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provideramazon createProvideramazon() {
		ProvideramazonImpl provideramazon = new ProvideramazonImpl();
		return provideramazon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Providerazure createProviderazure() {
		ProviderazureImpl providerazure = new ProviderazureImpl();
		return providerazure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Providerinstancelink createProviderinstancelink() {
		ProviderinstancelinkImpl providerinstancelink = new ProviderinstancelinkImpl();
		return providerinstancelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creation createCreation() {
		CreationImpl creation = new CreationImpl();
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedulingpolicy createSchedulingpolicy() {
		SchedulingpolicyImpl schedulingpolicy = new SchedulingpolicyImpl();
		return schedulingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uniqueschedulingpolicy createUniqueschedulingpolicy() {
		UniqueschedulingpolicyImpl uniqueschedulingpolicy = new UniqueschedulingpolicyImpl();
		return uniqueschedulingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recurringschedulingpolicy createRecurringschedulingpolicy() {
		RecurringschedulingpolicyImpl recurringschedulingpolicy = new RecurringschedulingpolicyImpl();
		return recurringschedulingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalingpolicy createScalingpolicy() {
		ScalingpolicyImpl scalingpolicy = new ScalingpolicyImpl();
		return scalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamicscalingpolicy createDynamicscalingpolicy() {
		DynamicscalingpolicyImpl dynamicscalingpolicy = new DynamicscalingpolicyImpl();
		return dynamicscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamicadjustmentscalingpolicy createDynamicadjustmentscalingpolicy() {
		DynamicadjustmentscalingpolicyImpl dynamicadjustmentscalingpolicy = new DynamicadjustmentscalingpolicyImpl();
		return dynamicadjustmentscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpledynamicscalingpolicy createSimpledynamicscalingpolicy() {
		SimpledynamicscalingpolicyImpl simpledynamicscalingpolicy = new SimpledynamicscalingpolicyImpl();
		return simpledynamicscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stepdynamicscalingpolicy createStepdynamicscalingpolicy() {
		StepdynamicscalingpolicyImpl stepdynamicscalingpolicy = new StepdynamicscalingpolicyImpl();
		return stepdynamicscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manualscalingpolicy createManualscalingpolicy() {
		ManualscalingpolicyImpl manualscalingpolicy = new ManualscalingpolicyImpl();
		return manualscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpuutilisation createCpuutilisation() {
		CpuutilisationImpl cpuutilisation = new CpuutilisationImpl();
		return cpuutilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memoryutilisation createMemoryutilisation() {
		MemoryutilisationImpl memoryutilisation = new MemoryutilisationImpl();
		return memoryutilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocationpolicy createAllocationpolicy() {
		AllocationpolicyImpl allocationpolicy = new AllocationpolicyImpl();
		return allocationpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roundrobin createRoundrobin() {
		RoundrobinImpl roundrobin = new RoundrobinImpl();
		return roundrobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsetime createResponsetime() {
		ResponsetimeImpl responsetime = new ResponsetimeImpl();
		return responsetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cost createCost() {
		CostImpl cost = new CostImpl();
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swappingpolicy createSwappingpolicy() {
		SwappingpolicyImpl swappingpolicy = new SwappingpolicyImpl();
		return swappingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sourcemigrationpolicity createSourcemigrationpolicity() {
		SourcemigrationpolicityImpl sourcemigrationpolicity = new SourcemigrationpolicityImpl();
		return sourcemigrationpolicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livemigration createLivemigration() {
		LivemigrationImpl livemigration = new LivemigrationImpl();
		return livemigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nonlivemigration createNonlivemigration() {
		NonlivemigrationImpl nonlivemigration = new NonlivemigrationImpl();
		return nonlivemigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migrationtype createMigrationtype() {
		MigrationtypeImpl migrationtype = new MigrationtypeImpl();
		return migrationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamicmigrationpolicy createDynamicmigrationpolicy() {
		DynamicmigrationpolicyImpl dynamicmigrationpolicy = new DynamicmigrationpolicyImpl();
		return dynamicmigrationpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manualmigrationpolicy createManualmigrationpolicy() {
		ManualmigrationpolicyImpl manualmigrationpolicy = new ManualmigrationpolicyImpl();
		return manualmigrationpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sla createSla() {
		SlaImpl sla = new SlaImpl();
		return sla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadvolume createLoadvolume() {
		LoadvolumeImpl loadvolume = new LoadvolumeImpl();
		return loadvolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Power createPower() {
		PowerImpl power = new PowerImpl();
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcewastage createResourcewastage() {
		ResourcewastageImpl resourcewastage = new ResourcewastageImpl();
		return resourcewastage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Targetmigrationpolicy createTargetmigrationpolicy() {
		TargetmigrationpolicyImpl targetmigrationpolicy = new TargetmigrationpolicyImpl();
		return targetmigrationpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availableresources createAvailableresources() {
		AvailableresourcesImpl availableresources = new AvailableresourcesImpl();
		return availableresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manualtargetselection createManualtargetselection() {
		ManualtargetselectionImpl manualtargetselection = new ManualtargetselectionImpl();
		return manualtargetselection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availalbleresourcesorload createAvailalbleresourcesorload() {
		AvailalbleresourcesorloadImpl availalbleresourcesorload = new AvailalbleresourcesorloadImpl();
		return availalbleresourcesorload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Targetresponsetime createTargetresponsetime() {
		TargetresponsetimeImpl targetresponsetime = new TargetresponsetimeImpl();
		return targetresponsetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsetimemetric createResponsetimemetric() {
		ResponsetimemetricImpl responsetimemetric = new ResponsetimemetricImpl();
		return responsetimemetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networkcontention createNetworkcontention() {
		NetworkcontentionImpl networkcontention = new NetworkcontentionImpl();
		return networkcontention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadbalanceralgorithm createLoadbalanceralgorithm() {
		LoadbalanceralgorithmImpl loadbalanceralgorithm = new LoadbalanceralgorithmImpl();
		return loadbalanceralgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roundrobinalgo createRoundrobinalgo() {
		RoundrobinalgoImpl roundrobinalgo = new RoundrobinalgoImpl();
		return roundrobinalgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leastconn createLeastconn() {
		LeastconnImpl leastconn = new LeastconnImpl();
		return leastconn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stickysessions createStickysessions() {
		StickysessionsImpl stickysessions = new StickysessionsImpl();
		return stickysessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wstaticrr createWstaticrr() {
		WstaticrrImpl wstaticrr = new WstaticrrImpl();
		return wstaticrr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMetric createTypeMetricFromString(EDataType eDataType, String initialValue) {
		TypeMetric result = TypeMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue) {
		OperatorType result = OperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionOperation createActionOperationFromString(EDataType eDataType, String initialValue) {
		ActionOperation result = ActionOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricTargetTracking createMetricTargetTrackingFromString(EDataType eDataType, String initialValue) {
		MetricTargetTracking result = MetricTargetTracking.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricTargetTrackingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue) {
		Unit result = Unit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModemoPackage getModemoPackage() {
		return (ModemoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModemoPackage getPackage() {
		return ModemoPackage.eINSTANCE;
	}

} //ModemoFactoryImpl
