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
package org.eclipse.cmf.occi.multicloud.elasticzabbix.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables;

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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.CpuImpl#getLoadAvg <em>Load Avg</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.CpuImpl#getCpuUsed <em>Cpu Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpuImpl extends MixinBaseImpl implements Cpu {
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
	 * The default value of the '{@link #getCpuUsed() <em>Cpu Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuUsed()
	 * @generated
	 * @ordered
	 */
	protected static final Double CPU_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuUsed() <em>Cpu Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuUsed()
	 * @generated
	 * @ordered
	 */
	protected Double cpuUsed = CPU_USED_EDEFAULT;

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
		return ElasticzabbixPackage.Literals.CPU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticzabbixPackage.CPU__LOAD_AVG, oldLoadAvg, loadAvg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCpuUsed() {
		return cpuUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuUsed(Double newCpuUsed) {
		Double oldCpuUsed = cpuUsed;
		cpuUsed = newCpuUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticzabbixPackage.CPU__CPU_USED, oldCpuUsed, cpuUsed));
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
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ElasticzabbixTables.STR_Cpu_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ElasticzabbixTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_monitoring_c_c_Collector = idResolver.getClass(ElasticzabbixTables.CLSSid_Collector, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_monitoring_c_c_Collector).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ElasticzabbixTables.STR_Cpu_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ElasticzabbixTables.INT_0).booleanValue();
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
			case ElasticzabbixPackage.CPU__LOAD_AVG:
				return getLoadAvg();
			case ElasticzabbixPackage.CPU__CPU_USED:
				return getCpuUsed();
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
			case ElasticzabbixPackage.CPU__LOAD_AVG:
				setLoadAvg((Double)newValue);
				return;
			case ElasticzabbixPackage.CPU__CPU_USED:
				setCpuUsed((Double)newValue);
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
			case ElasticzabbixPackage.CPU__LOAD_AVG:
				setLoadAvg(LOAD_AVG_EDEFAULT);
				return;
			case ElasticzabbixPackage.CPU__CPU_USED:
				setCpuUsed(CPU_USED_EDEFAULT);
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
			case ElasticzabbixPackage.CPU__LOAD_AVG:
				return LOAD_AVG_EDEFAULT == null ? loadAvg != null : !LOAD_AVG_EDEFAULT.equals(loadAvg);
			case ElasticzabbixPackage.CPU__CPU_USED:
				return CPU_USED_EDEFAULT == null ? cpuUsed != null : !CPU_USED_EDEFAULT.equals(cpuUsed);
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
			case ElasticzabbixPackage.CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (loadAvg: ");
		result.append(loadAvg);
		result.append(", cpuUsed: ");
		result.append(cpuUsed);
		result.append(')');
		return result.toString();
	}

} //CpuImpl
