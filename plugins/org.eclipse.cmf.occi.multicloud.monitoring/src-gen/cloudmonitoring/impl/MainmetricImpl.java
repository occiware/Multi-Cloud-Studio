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
package cloudmonitoring.impl;

import cloudmonitoring.CloudmonitoringPackage;
import cloudmonitoring.CloudmonitoringTables;
import cloudmonitoring.Mainmetric;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mainmetric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.impl.MainmetricImpl#getThresholdUsage <em>Threshold Usage</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MainmetricImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MainmetricImpl#getThresholdTemperature <em>Threshold Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainmetricImpl extends MixinBaseImpl implements Mainmetric {
	/**
	 * The default value of the '{@link #getThresholdUsage() <em>Threshold Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Double THRESHOLD_USAGE_EDEFAULT = new Double(80.0);

	/**
	 * The cached value of the '{@link #getThresholdUsage() <em>Threshold Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdUsage()
	 * @generated
	 * @ordered
	 */
	protected Double thresholdUsage = THRESHOLD_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final Double TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected Double temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdTemperature() <em>Threshold Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final Double THRESHOLD_TEMPERATURE_EDEFAULT = new Double(80.0);

	/**
	 * The cached value of the '{@link #getThresholdTemperature() <em>Threshold Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdTemperature()
	 * @generated
	 * @ordered
	 */
	protected Double thresholdTemperature = THRESHOLD_TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainmetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudmonitoringPackage.Literals.MAINMETRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdUsage() {
		return thresholdUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdUsage(Double newThresholdUsage) {
		Double oldThresholdUsage = thresholdUsage;
		thresholdUsage = newThresholdUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE, oldThresholdUsage, thresholdUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(Double newTemperature) {
		Double oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAINMETRIC__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThresholdTemperature() {
		return thresholdTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdTemperature(Double newThresholdTemperature) {
		Double oldThresholdTemperature = thresholdTemperature;
		thresholdTemperature = newThresholdTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE, oldThresholdTemperature, thresholdTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Mainmetric::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(monitoring::Collector)
		 *       in
		 *         'Mainmetric::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudmonitoringTables.STR_Mainmetric_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudmonitoringTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_monitoring_c_c_Collector_0 = idResolver.getClass(CloudmonitoringTables.CLSSid_Collector, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_monitoring_c_c_Collector_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudmonitoringTables.STR_Mainmetric_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudmonitoringTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE:
				return getThresholdUsage();
			case CloudmonitoringPackage.MAINMETRIC__TEMPERATURE:
				return getTemperature();
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE:
				return getThresholdTemperature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE:
				setThresholdUsage((Double)newValue);
				return;
			case CloudmonitoringPackage.MAINMETRIC__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE:
				setThresholdTemperature((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE:
				setThresholdUsage(THRESHOLD_USAGE_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAINMETRIC__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE:
				setThresholdTemperature(THRESHOLD_TEMPERATURE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE:
				return THRESHOLD_USAGE_EDEFAULT == null ? thresholdUsage != null : !THRESHOLD_USAGE_EDEFAULT.equals(thresholdUsage);
			case CloudmonitoringPackage.MAINMETRIC__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE:
				return THRESHOLD_TEMPERATURE_EDEFAULT == null ? thresholdTemperature != null : !THRESHOLD_TEMPERATURE_EDEFAULT.equals(thresholdTemperature);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CloudmonitoringPackage.MAINMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (thresholdUsage: ");
		result.append(thresholdUsage);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", thresholdTemperature: ");
		result.append(thresholdTemperature);
		result.append(')');
		return result.toString();
	}

} //MainmetricImpl
