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
import cloudmonitoring.Cpu;
import cloudmonitoring.Mainmetric;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.monitoring.Metric;

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
 * An implementation of the model object '<em><b>Cpu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.impl.CpuImpl#getThresholdUsage <em>Threshold Usage</em>}</li>
 *   <li>{@link cloudmonitoring.impl.CpuImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link cloudmonitoring.impl.CpuImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link cloudmonitoring.impl.CpuImpl#getThresholdTemperature <em>Threshold Temperature</em>}</li>
 *   <li>{@link cloudmonitoring.impl.CpuImpl#getLoadAvg <em>Load Avg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpuImpl extends MixinBaseImpl implements Cpu {
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
	 * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final Double UTILIZATION_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected Double utilization = UTILIZATION_EDEFAULT;

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
	 * The default value of the '{@link #getLoadAvg() <em>Load Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadAvg()
	 * @generated
	 * @ordered
	 */
	protected static final Double LOAD_AVG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadAvg() <em>Load Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadAvg()
	 * @generated
	 * @ordered
	 */
	protected Double loadAvg = LOAD_AVG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudmonitoringPackage.Literals.CPU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.CPU__THRESHOLD_USAGE, oldThresholdUsage, thresholdUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(Double newUtilization) {
		Double oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.CPU__UTILIZATION, oldUtilization, utilization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.CPU__TEMPERATURE, oldTemperature, temperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.CPU__THRESHOLD_TEMPERATURE, oldThresholdTemperature, thresholdTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLoadAvg() {
		return loadAvg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadAvg(Double newLoadAvg) {
		Double oldLoadAvg = loadAvg;
		loadAvg = newLoadAvg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.CPU__LOAD_AVG, oldLoadAvg, loadAvg));
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
		 *   let severity : Integer[1] = 'Cpu::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(monitoring::Collector)
		 *       in
		 *         'Cpu::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudmonitoringTables.STR_Cpu_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudmonitoringTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_monitoring_c_c_Collector = idResolver.getClass(CloudmonitoringTables.CLSSid_Collector, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_monitoring_c_c_Collector).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudmonitoringTables.STR_Cpu_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudmonitoringTables.INT_0).booleanValue();
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
			case CloudmonitoringPackage.CPU__THRESHOLD_USAGE:
				return getThresholdUsage();
			case CloudmonitoringPackage.CPU__UTILIZATION:
				return getUtilization();
			case CloudmonitoringPackage.CPU__TEMPERATURE:
				return getTemperature();
			case CloudmonitoringPackage.CPU__THRESHOLD_TEMPERATURE:
				return getThresholdTemperature();
			case CloudmonitoringPackage.CPU__LOAD_AVG:
				return getLoadAvg();
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
			case CloudmonitoringPackage.CPU__THRESHOLD_USAGE:
				setThresholdUsage((Double)newValue);
				return;
			case CloudmonitoringPackage.CPU__UTILIZATION:
				setUtilization((Double)newValue);
				return;
			case CloudmonitoringPackage.CPU__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case CloudmonitoringPackage.CPU__THRESHOLD_TEMPERATURE:
				setThresholdTemperature((Double)newValue);
				return;
			case CloudmonitoringPackage.CPU__LOAD_AVG:
				setLoadAvg((Double)newValue);
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
			case CloudmonitoringPackage.CPU__THRESHOLD_USAGE:
				setThresholdUsage(THRESHOLD_USAGE_EDEFAULT);
				return;
			case CloudmonitoringPackage.CPU__UTILIZATION:
				setUtilization(UTILIZATION_EDEFAULT);
				return;
			case CloudmonitoringPackage.CPU__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case CloudmonitoringPackage.CPU__THRESHOLD_TEMPERATURE:
				setThresholdTemperature(THRESHOLD_TEMPERATURE_EDEFAULT);
				return;
			case CloudmonitoringPackage.CPU__LOAD_AVG:
				setLoadAvg(LOAD_AVG_EDEFAULT);
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
			case CloudmonitoringPackage.CPU__THRESHOLD_USAGE:
				return THRESHOLD_USAGE_EDEFAULT == null ? thresholdUsage != null : !THRESHOLD_USAGE_EDEFAULT.equals(thresholdUsage);
			case CloudmonitoringPackage.CPU__UTILIZATION:
				return UTILIZATION_EDEFAULT == null ? utilization != null : !UTILIZATION_EDEFAULT.equals(utilization);
			case CloudmonitoringPackage.CPU__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case CloudmonitoringPackage.CPU__THRESHOLD_TEMPERATURE:
				return THRESHOLD_TEMPERATURE_EDEFAULT == null ? thresholdTemperature != null : !THRESHOLD_TEMPERATURE_EDEFAULT.equals(thresholdTemperature);
			case CloudmonitoringPackage.CPU__LOAD_AVG:
				return LOAD_AVG_EDEFAULT == null ? loadAvg != null : !LOAD_AVG_EDEFAULT.equals(loadAvg);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Metric.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Mainmetric.class) {
			switch (derivedFeatureID) {
				case CloudmonitoringPackage.CPU__THRESHOLD_USAGE: return CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE;
				case CloudmonitoringPackage.CPU__UTILIZATION: return CloudmonitoringPackage.MAINMETRIC__UTILIZATION;
				case CloudmonitoringPackage.CPU__TEMPERATURE: return CloudmonitoringPackage.MAINMETRIC__TEMPERATURE;
				case CloudmonitoringPackage.CPU__THRESHOLD_TEMPERATURE: return CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Metric.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Mainmetric.class) {
			switch (baseFeatureID) {
				case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE: return CloudmonitoringPackage.CPU__THRESHOLD_USAGE;
				case CloudmonitoringPackage.MAINMETRIC__UTILIZATION: return CloudmonitoringPackage.CPU__UTILIZATION;
				case CloudmonitoringPackage.MAINMETRIC__TEMPERATURE: return CloudmonitoringPackage.CPU__TEMPERATURE;
				case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE: return CloudmonitoringPackage.CPU__THRESHOLD_TEMPERATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Metric.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Mainmetric.class) {
			switch (baseOperationID) {
				case CloudmonitoringPackage.MAINMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return CloudmonitoringPackage.CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case CloudmonitoringPackage.CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(", utilization: ");
		result.append(utilization);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", thresholdTemperature: ");
		result.append(thresholdTemperature);
		result.append(", loadAvg: ");
		result.append(loadAvg);
		result.append(')');
		return result.toString();
	}

} //CpuImpl
