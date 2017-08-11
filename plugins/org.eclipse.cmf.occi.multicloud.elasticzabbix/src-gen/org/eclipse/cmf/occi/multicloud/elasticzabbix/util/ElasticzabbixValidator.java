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
package org.eclipse.cmf.occi.multicloud.elasticzabbix.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.monitoring.util.MonitoringValidator;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage
 * @generated
 */
public class ElasticzabbixValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ElasticzabbixValidator INSTANCE = new ElasticzabbixValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.elasticzabbix";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Zabbixapiconnect'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZABBIXAPICONNECT__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Cpu'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Supervisorapiconnect'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPERVISORAPICONNECT__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Ram'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RAM__APPLIES_CONSTRAINT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringValidator monitoringValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticzabbixValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
		monitoringValidator = MonitoringValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ElasticzabbixPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ElasticzabbixPackage.ZABBIXCOLLECTOR:
				return validateZabbixcollector((Zabbixcollector)value, diagnostics, context);
			case ElasticzabbixPackage.ZABBIXSENSOR:
				return validateZabbixsensor((Zabbixsensor)value, diagnostics, context);
			case ElasticzabbixPackage.ZABBIXAPICONNECT:
				return validateZabbixapiconnect((Zabbixapiconnect)value, diagnostics, context);
			case ElasticzabbixPackage.CPU:
				return validateCpu((Cpu)value, diagnostics, context);
			case ElasticzabbixPackage.SUPERVISORAPICONNECT:
				return validateSupervisorapiconnect((Supervisorapiconnect)value, diagnostics, context);
			case ElasticzabbixPackage.RAM:
				return validateRam((Ram)value, diagnostics, context);
			case ElasticzabbixPackage.PERCENT:
				return validatePercent((Double)value, diagnostics, context);
			case ElasticzabbixPackage.PER_SEC:
				return validatePerSec((Double)value, diagnostics, context);
			case ElasticzabbixPackage.AVERAGE:
				return validateAverage((Double)value, diagnostics, context);
			case ElasticzabbixPackage.TEMPERATURE:
				return validateTemperature((Double)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZabbixcollector(Zabbixcollector zabbixcollector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zabbixcollector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(zabbixcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(zabbixcollector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZabbixsensor(Zabbixsensor zabbixsensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zabbixsensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(zabbixsensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(zabbixsensor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZabbixapiconnect(Zabbixapiconnect zabbixapiconnect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zabbixapiconnect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zabbixapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validateZabbixapiconnect_appliesConstraint(zabbixapiconnect, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Zabbixapiconnect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZabbixapiconnect_appliesConstraint(Zabbixapiconnect zabbixapiconnect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return zabbixapiconnect.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpu(Cpu cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cpu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validateCpu_appliesConstraint(cpu, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Cpu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpu_appliesConstraint(Cpu cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpu.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupervisorapiconnect(Supervisorapiconnect supervisorapiconnect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supervisorapiconnect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supervisorapiconnect, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupervisorapiconnect_appliesConstraint(supervisorapiconnect, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Supervisorapiconnect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupervisorapiconnect_appliesConstraint(Supervisorapiconnect supervisorapiconnect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supervisorapiconnect.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRam(Ram ram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ram, diagnostics, context);
		if (result || diagnostics != null) result &= validateRam_appliesConstraint(ram, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Ram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRam_appliesConstraint(Ram ram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ram.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent(Double percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerSec(Double perSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAverage(Double average, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemperature(Double temperature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ElasticzabbixValidator
