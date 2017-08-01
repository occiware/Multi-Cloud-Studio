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
package cloudmonitoring.util;

import cloudmonitoring.*;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.monitoring.util.MonitoringValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cloudmonitoring.CloudmonitoringPackage
 * @generated
 */
public class CloudmonitoringValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CloudmonitoringValidator INSTANCE = new CloudmonitoringValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cloudmonitoring";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Cpu'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Diskio'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISKIO__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Ram'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RAM__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Networkio'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKIO__APPLIES_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Inputoutput'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUTOUTPUT__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Sensorcontrol'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SENSORCONTROL__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Emfpublisher'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMFPUBLISHER__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Systemoutpublisher'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEMOUTPUBLISHER__APPLIES_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Publishercontrol'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PUBLISHERCONTROL__APPLIES_CONSTRAINT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Disk'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISK__APPLIES_CONSTRAINT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Mailpublisher'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAILPUBLISHER__APPLIES_CONSTRAINT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Mainmetric'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAINMETRIC__APPLIES_CONSTRAINT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

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
	public CloudmonitoringValidator() {
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
	  return CloudmonitoringPackage.eINSTANCE;
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
			case CloudmonitoringPackage.SSHCOLLECTOR:
				return validateSshcollector((Sshcollector)value, diagnostics, context);
			case CloudmonitoringPackage.ZABBIXCOLLECTOR:
				return validateZabbixcollector((Zabbixcollector)value, diagnostics, context);
			case CloudmonitoringPackage.CPU:
				return validateCpu((Cpu)value, diagnostics, context);
			case CloudmonitoringPackage.DISKIO:
				return validateDiskio((Diskio)value, diagnostics, context);
			case CloudmonitoringPackage.RAM:
				return validateRam((Ram)value, diagnostics, context);
			case CloudmonitoringPackage.NETWORKIO:
				return validateNetworkio((Networkio)value, diagnostics, context);
			case CloudmonitoringPackage.INPUTOUTPUT:
				return validateInputoutput((Inputoutput)value, diagnostics, context);
			case CloudmonitoringPackage.SENSORCONTROL:
				return validateSensorcontrol((Sensorcontrol)value, diagnostics, context);
			case CloudmonitoringPackage.EMFPUBLISHER:
				return validateEmfpublisher((Emfpublisher)value, diagnostics, context);
			case CloudmonitoringPackage.SYSTEMOUTPUBLISHER:
				return validateSystemoutpublisher((Systemoutpublisher)value, diagnostics, context);
			case CloudmonitoringPackage.PUBLISHERCONTROL:
				return validatePublishercontrol((Publishercontrol)value, diagnostics, context);
			case CloudmonitoringPackage.DISK:
				return validateDisk((Disk)value, diagnostics, context);
			case CloudmonitoringPackage.MAILPUBLISHER:
				return validateMailpublisher((Mailpublisher)value, diagnostics, context);
			case CloudmonitoringPackage.MAINMETRIC:
				return validateMainmetric((Mainmetric)value, diagnostics, context);
			case CloudmonitoringPackage.IO_UNIT:
				return validateIOUnit((IOUnit)value, diagnostics, context);
			case CloudmonitoringPackage.MONITOR_STATE:
				return validateMonitorState((MonitorState)value, diagnostics, context);
			case CloudmonitoringPackage.PERCENT:
				return validatePercent((Double)value, diagnostics, context);
			case CloudmonitoringPackage.AVERAGE:
				return validateAverage((Double)value, diagnostics, context);
			case CloudmonitoringPackage.PER_SEC:
				return validatePerSec((Double)value, diagnostics, context);
			case CloudmonitoringPackage.TEMPERATURE:
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
	public boolean validateSshcollector(Sshcollector sshcollector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sshcollector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(sshcollector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(sshcollector, diagnostics, context);
		return result;
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
	public boolean validateDiskio(Diskio diskio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diskio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diskio, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiskio_appliesConstraint(diskio, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Diskio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiskio_appliesConstraint(Diskio diskio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diskio.appliesConstraint(diagnostics, context);
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
	public boolean validateNetworkio(Networkio networkio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkio, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkio_appliesConstraint(networkio, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Networkio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkio_appliesConstraint(Networkio networkio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkio.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputoutput(Inputoutput inputoutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputoutput, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputoutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputoutput_appliesConstraint(inputoutput, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Inputoutput</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputoutput_appliesConstraint(Inputoutput inputoutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inputoutput.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorcontrol(Sensorcontrol sensorcontrol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensorcontrol, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensorcontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validateSensorcontrol_appliesConstraint(sensorcontrol, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Sensorcontrol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorcontrol_appliesConstraint(Sensorcontrol sensorcontrol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sensorcontrol.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfpublisher(Emfpublisher emfpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emfpublisher, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emfpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmfpublisher_appliesConstraint(emfpublisher, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Emfpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfpublisher_appliesConstraint(Emfpublisher emfpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emfpublisher.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemoutpublisher(Systemoutpublisher systemoutpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemoutpublisher, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemoutpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemoutpublisher_appliesConstraint(systemoutpublisher, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Systemoutpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemoutpublisher_appliesConstraint(Systemoutpublisher systemoutpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemoutpublisher.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublishercontrol(Publishercontrol publishercontrol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(publishercontrol, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(publishercontrol, diagnostics, context);
		if (result || diagnostics != null) result &= validatePublishercontrol_appliesConstraint(publishercontrol, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Publishercontrol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublishercontrol_appliesConstraint(Publishercontrol publishercontrol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return publishercontrol.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisk(Disk disk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disk, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisk_appliesConstraint(disk, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisk_appliesConstraint(Disk disk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return disk.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMailpublisher(Mailpublisher mailpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mailpublisher, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mailpublisher, diagnostics, context);
		if (result || diagnostics != null) result &= validateMailpublisher_appliesConstraint(mailpublisher, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Mailpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMailpublisher_appliesConstraint(Mailpublisher mailpublisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mailpublisher.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainmetric(Mainmetric mainmetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mainmetric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mainmetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMainmetric_appliesConstraint(mainmetric, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Mainmetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainmetric_appliesConstraint(Mainmetric mainmetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mainmetric.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIOUnit(IOUnit ioUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitorState(MonitorState monitorState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateAverage(Double average, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //CloudmonitoringValidator
