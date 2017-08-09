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
import cloudmonitoring.Ram;

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
 * An implementation of the model object '<em><b>Ram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.impl.RamImpl#getThresholdUsage <em>Threshold Usage</em>}</li>
 *   <li>{@link cloudmonitoring.impl.RamImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link cloudmonitoring.impl.RamImpl#getThresholdTemperature <em>Threshold Temperature</em>}</li>
 *   <li>{@link cloudmonitoring.impl.RamImpl#getFree <em>Free</em>}</li>
 *   <li>{@link cloudmonitoring.impl.RamImpl#getSwap <em>Swap</em>}</li>
 *   <li>{@link cloudmonitoring.impl.RamImpl#getRamUsed <em>Ram Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RamImpl extends MixinBaseImpl implements Ram {
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
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final Double FREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected Double free = FREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwap() <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap()
	 * @generated
	 * @ordered
	 */
	protected static final Double SWAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwap() <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap()
	 * @generated
	 * @ordered
	 */
	protected Double swap = SWAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamUsed() <em>Ram Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamUsed()
	 * @generated
	 * @ordered
	 */
	protected static final Double RAM_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamUsed() <em>Ram Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamUsed()
	 * @generated
	 * @ordered
	 */
	protected Double ramUsed = RAM_USED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudmonitoringPackage.Literals.RAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.RAM__THRESHOLD_USAGE, oldThresholdUsage, thresholdUsage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.RAM__TEMPERATURE, oldTemperature, temperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.RAM__THRESHOLD_TEMPERATURE, oldThresholdTemperature, thresholdTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFree() {
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree(Double newFree) {
		Double oldFree = free;
		free = newFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.RAM__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSwap() {
		return swap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwap(Double newSwap) {
		Double oldSwap = swap;
		swap = newSwap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.RAM__SWAP, oldSwap, swap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRamUsed() {
		return ramUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamUsed(Double newRamUsed) {
		Double oldRamUsed = ramUsed;
		ramUsed = newRamUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.RAM__RAM_USED, oldRamUsed, ramUsed));
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
		 *   let severity : Integer[1] = 'Ram::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(monitoring::Collector)
		 *       in
		 *         'Ram::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudmonitoringTables.STR_Ram_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudmonitoringTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_monitoring_c_c_Collector_0 = idResolver.getClass(CloudmonitoringTables.CLSSid_Collector, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_monitoring_c_c_Collector_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudmonitoringTables.STR_Ram_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudmonitoringTables.INT_0).booleanValue();
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
			case CloudmonitoringPackage.RAM__THRESHOLD_USAGE:
				return getThresholdUsage();
			case CloudmonitoringPackage.RAM__TEMPERATURE:
				return getTemperature();
			case CloudmonitoringPackage.RAM__THRESHOLD_TEMPERATURE:
				return getThresholdTemperature();
			case CloudmonitoringPackage.RAM__FREE:
				return getFree();
			case CloudmonitoringPackage.RAM__SWAP:
				return getSwap();
			case CloudmonitoringPackage.RAM__RAM_USED:
				return getRamUsed();
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
			case CloudmonitoringPackage.RAM__THRESHOLD_USAGE:
				setThresholdUsage((Double)newValue);
				return;
			case CloudmonitoringPackage.RAM__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case CloudmonitoringPackage.RAM__THRESHOLD_TEMPERATURE:
				setThresholdTemperature((Double)newValue);
				return;
			case CloudmonitoringPackage.RAM__FREE:
				setFree((Double)newValue);
				return;
			case CloudmonitoringPackage.RAM__SWAP:
				setSwap((Double)newValue);
				return;
			case CloudmonitoringPackage.RAM__RAM_USED:
				setRamUsed((Double)newValue);
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
			case CloudmonitoringPackage.RAM__THRESHOLD_USAGE:
				setThresholdUsage(THRESHOLD_USAGE_EDEFAULT);
				return;
			case CloudmonitoringPackage.RAM__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case CloudmonitoringPackage.RAM__THRESHOLD_TEMPERATURE:
				setThresholdTemperature(THRESHOLD_TEMPERATURE_EDEFAULT);
				return;
			case CloudmonitoringPackage.RAM__FREE:
				setFree(FREE_EDEFAULT);
				return;
			case CloudmonitoringPackage.RAM__SWAP:
				setSwap(SWAP_EDEFAULT);
				return;
			case CloudmonitoringPackage.RAM__RAM_USED:
				setRamUsed(RAM_USED_EDEFAULT);
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
			case CloudmonitoringPackage.RAM__THRESHOLD_USAGE:
				return THRESHOLD_USAGE_EDEFAULT == null ? thresholdUsage != null : !THRESHOLD_USAGE_EDEFAULT.equals(thresholdUsage);
			case CloudmonitoringPackage.RAM__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case CloudmonitoringPackage.RAM__THRESHOLD_TEMPERATURE:
				return THRESHOLD_TEMPERATURE_EDEFAULT == null ? thresholdTemperature != null : !THRESHOLD_TEMPERATURE_EDEFAULT.equals(thresholdTemperature);
			case CloudmonitoringPackage.RAM__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
			case CloudmonitoringPackage.RAM__SWAP:
				return SWAP_EDEFAULT == null ? swap != null : !SWAP_EDEFAULT.equals(swap);
			case CloudmonitoringPackage.RAM__RAM_USED:
				return RAM_USED_EDEFAULT == null ? ramUsed != null : !RAM_USED_EDEFAULT.equals(ramUsed);
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
				case CloudmonitoringPackage.RAM__THRESHOLD_USAGE: return CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE;
				case CloudmonitoringPackage.RAM__TEMPERATURE: return CloudmonitoringPackage.MAINMETRIC__TEMPERATURE;
				case CloudmonitoringPackage.RAM__THRESHOLD_TEMPERATURE: return CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE;
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
				case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE: return CloudmonitoringPackage.RAM__THRESHOLD_USAGE;
				case CloudmonitoringPackage.MAINMETRIC__TEMPERATURE: return CloudmonitoringPackage.RAM__TEMPERATURE;
				case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE: return CloudmonitoringPackage.RAM__THRESHOLD_TEMPERATURE;
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
				case CloudmonitoringPackage.MAINMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return CloudmonitoringPackage.RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case CloudmonitoringPackage.RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(", free: ");
		result.append(free);
		result.append(", swap: ");
		result.append(swap);
		result.append(", ramUsed: ");
		result.append(ramUsed);
		result.append(')');
		return result.toString();
	}

} //RamImpl
