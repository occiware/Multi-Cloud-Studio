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
package org.eclipse.cmf.occi.multicloud.occimonitoring.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.occimonitoring.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage
 * @generated
 */
public class OccimonitoringValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OccimonitoringValidator INSTANCE = new OccimonitoringValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.occimonitoring";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Metrics'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METRICS__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Cpuusage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPUUSAGE__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Memoryusage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMORYUSAGE__APPLIES_CONSTRAINT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccimonitoringValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OccimonitoringPackage.eINSTANCE;
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
			case OccimonitoringPackage.ZABBIXINSTANCE:
				return validateZabbixinstance((Zabbixinstance)value, diagnostics, context);
			case OccimonitoringPackage.HOSTGROUP:
				return validateHostgroup((Hostgroup)value, diagnostics, context);
			case OccimonitoringPackage.ZABBIXTEMPLATE:
				return validateZabbixtemplate((Zabbixtemplate)value, diagnostics, context);
			case OccimonitoringPackage.METRICS:
				return validateMetrics((Metrics)value, diagnostics, context);
			case OccimonitoringPackage.CPUUSAGE:
				return validateCpuusage((Cpuusage)value, diagnostics, context);
			case OccimonitoringPackage.MEMORYUSAGE:
				return validateMemoryusage((Memoryusage)value, diagnostics, context);
			case OccimonitoringPackage.DOUBLE:
				return validateDouble((Double)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZabbixinstance(Zabbixinstance zabbixinstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zabbixinstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(zabbixinstance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(zabbixinstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostgroup(Hostgroup hostgroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hostgroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(hostgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(hostgroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZabbixtemplate(Zabbixtemplate zabbixtemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zabbixtemplate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(zabbixtemplate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(zabbixtemplate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetrics(Metrics metrics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(metrics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(metrics, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetrics_appliesConstraint(metrics, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetrics_appliesConstraint(Metrics metrics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return metrics.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuusage(Cpuusage cpuusage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cpuusage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cpuusage, diagnostics, context);
		if (result || diagnostics != null) result &= validateCpuusage_appliesConstraint(cpuusage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Cpuusage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuusage_appliesConstraint(Cpuusage cpuusage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpuusage.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryusage(Memoryusage memoryusage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memoryusage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memoryusage, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryusage_appliesConstraint(memoryusage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Memoryusage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryusage_appliesConstraint(Memoryusage memoryusage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return memoryusage.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //OccimonitoringValidator
