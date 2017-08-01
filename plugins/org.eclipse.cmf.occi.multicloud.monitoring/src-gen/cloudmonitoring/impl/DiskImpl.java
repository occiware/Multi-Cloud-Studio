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
import cloudmonitoring.Disk;
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
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.impl.DiskImpl#getThresholdUsage <em>Threshold Usage</em>}</li>
 *   <li>{@link cloudmonitoring.impl.DiskImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link cloudmonitoring.impl.DiskImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link cloudmonitoring.impl.DiskImpl#getThresholdTemperature <em>Threshold Temperature</em>}</li>
 *   <li>{@link cloudmonitoring.impl.DiskImpl#getSwap <em>Swap</em>}</li>
 *   <li>{@link cloudmonitoring.impl.DiskImpl#getFree <em>Free</em>}</li>
 *   <li>{@link cloudmonitoring.impl.DiskImpl#getVolumeName <em>Volume Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskImpl extends MixinBaseImpl implements Disk {
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
	 * The default value of the '{@link #getVolumeName() <em>Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeName()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumeName() <em>Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeName()
	 * @generated
	 * @ordered
	 */
	protected String volumeName = VOLUME_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudmonitoringPackage.Literals.DISK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.DISK__THRESHOLD_USAGE, oldThresholdUsage, thresholdUsage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.DISK__UTILIZATION, oldUtilization, utilization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.DISK__TEMPERATURE, oldTemperature, temperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.DISK__THRESHOLD_TEMPERATURE, oldThresholdTemperature, thresholdTemperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.DISK__SWAP, oldSwap, swap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.DISK__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolumeName() {
		return volumeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeName(String newVolumeName) {
		String oldVolumeName = volumeName;
		volumeName = newVolumeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.DISK__VOLUME_NAME, oldVolumeName, volumeName));
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
		 *   let severity : Integer[1] = 'Disk::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(monitoring::Collector)
		 *       in
		 *         'Disk::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudmonitoringTables.STR_Disk_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudmonitoringTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_monitoring_c_c_Collector_0 = idResolver.getClass(CloudmonitoringTables.CLSSid_Collector, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_monitoring_c_c_Collector_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudmonitoringTables.STR_Disk_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudmonitoringTables.INT_0).booleanValue();
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
			case CloudmonitoringPackage.DISK__THRESHOLD_USAGE:
				return getThresholdUsage();
			case CloudmonitoringPackage.DISK__UTILIZATION:
				return getUtilization();
			case CloudmonitoringPackage.DISK__TEMPERATURE:
				return getTemperature();
			case CloudmonitoringPackage.DISK__THRESHOLD_TEMPERATURE:
				return getThresholdTemperature();
			case CloudmonitoringPackage.DISK__SWAP:
				return getSwap();
			case CloudmonitoringPackage.DISK__FREE:
				return getFree();
			case CloudmonitoringPackage.DISK__VOLUME_NAME:
				return getVolumeName();
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
			case CloudmonitoringPackage.DISK__THRESHOLD_USAGE:
				setThresholdUsage((Double)newValue);
				return;
			case CloudmonitoringPackage.DISK__UTILIZATION:
				setUtilization((Double)newValue);
				return;
			case CloudmonitoringPackage.DISK__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case CloudmonitoringPackage.DISK__THRESHOLD_TEMPERATURE:
				setThresholdTemperature((Double)newValue);
				return;
			case CloudmonitoringPackage.DISK__SWAP:
				setSwap((Double)newValue);
				return;
			case CloudmonitoringPackage.DISK__FREE:
				setFree((Double)newValue);
				return;
			case CloudmonitoringPackage.DISK__VOLUME_NAME:
				setVolumeName((String)newValue);
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
			case CloudmonitoringPackage.DISK__THRESHOLD_USAGE:
				setThresholdUsage(THRESHOLD_USAGE_EDEFAULT);
				return;
			case CloudmonitoringPackage.DISK__UTILIZATION:
				setUtilization(UTILIZATION_EDEFAULT);
				return;
			case CloudmonitoringPackage.DISK__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case CloudmonitoringPackage.DISK__THRESHOLD_TEMPERATURE:
				setThresholdTemperature(THRESHOLD_TEMPERATURE_EDEFAULT);
				return;
			case CloudmonitoringPackage.DISK__SWAP:
				setSwap(SWAP_EDEFAULT);
				return;
			case CloudmonitoringPackage.DISK__FREE:
				setFree(FREE_EDEFAULT);
				return;
			case CloudmonitoringPackage.DISK__VOLUME_NAME:
				setVolumeName(VOLUME_NAME_EDEFAULT);
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
			case CloudmonitoringPackage.DISK__THRESHOLD_USAGE:
				return THRESHOLD_USAGE_EDEFAULT == null ? thresholdUsage != null : !THRESHOLD_USAGE_EDEFAULT.equals(thresholdUsage);
			case CloudmonitoringPackage.DISK__UTILIZATION:
				return UTILIZATION_EDEFAULT == null ? utilization != null : !UTILIZATION_EDEFAULT.equals(utilization);
			case CloudmonitoringPackage.DISK__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case CloudmonitoringPackage.DISK__THRESHOLD_TEMPERATURE:
				return THRESHOLD_TEMPERATURE_EDEFAULT == null ? thresholdTemperature != null : !THRESHOLD_TEMPERATURE_EDEFAULT.equals(thresholdTemperature);
			case CloudmonitoringPackage.DISK__SWAP:
				return SWAP_EDEFAULT == null ? swap != null : !SWAP_EDEFAULT.equals(swap);
			case CloudmonitoringPackage.DISK__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
			case CloudmonitoringPackage.DISK__VOLUME_NAME:
				return VOLUME_NAME_EDEFAULT == null ? volumeName != null : !VOLUME_NAME_EDEFAULT.equals(volumeName);
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
				case CloudmonitoringPackage.DISK__THRESHOLD_USAGE: return CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE;
				case CloudmonitoringPackage.DISK__UTILIZATION: return CloudmonitoringPackage.MAINMETRIC__UTILIZATION;
				case CloudmonitoringPackage.DISK__TEMPERATURE: return CloudmonitoringPackage.MAINMETRIC__TEMPERATURE;
				case CloudmonitoringPackage.DISK__THRESHOLD_TEMPERATURE: return CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE;
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
				case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_USAGE: return CloudmonitoringPackage.DISK__THRESHOLD_USAGE;
				case CloudmonitoringPackage.MAINMETRIC__UTILIZATION: return CloudmonitoringPackage.DISK__UTILIZATION;
				case CloudmonitoringPackage.MAINMETRIC__TEMPERATURE: return CloudmonitoringPackage.DISK__TEMPERATURE;
				case CloudmonitoringPackage.MAINMETRIC__THRESHOLD_TEMPERATURE: return CloudmonitoringPackage.DISK__THRESHOLD_TEMPERATURE;
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
				case CloudmonitoringPackage.MAINMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return CloudmonitoringPackage.DISK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case CloudmonitoringPackage.DISK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(", swap: ");
		result.append(swap);
		result.append(", free: ");
		result.append(free);
		result.append(", volumeName: ");
		result.append(volumeName);
		result.append(')');
		return result.toString();
	}

} //DiskImpl
