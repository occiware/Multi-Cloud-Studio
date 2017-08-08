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
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.util;

import cloudmonitoring.util.CloudmonitoringValidator;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixPackage
 * @generated
 */
public class ZabbixValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ZabbixValidator INSTANCE = new ZabbixValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.monitoring.zabbix";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Zabbixapiconnect'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZABBIXAPICONNECT__APPLIES_CONSTRAINT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
	protected CloudmonitoringValidator cloudmonitoringValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZabbixValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
		cloudmonitoringValidator = CloudmonitoringValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ZabbixPackage.eINSTANCE;
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
			case ZabbixPackage.ZABBIXCOLLECTOR:
				return validateZabbixcollector((Zabbixcollector)value, diagnostics, context);
			case ZabbixPackage.ZABBIXAPICONNECT:
				return validateZabbixapiconnect((Zabbixapiconnect)value, diagnostics, context);
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

} //ZabbixValidator
