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
package org.eclipse.cmf.occi.multicloud.occimonitoring.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.occimonitoring.Memoryusage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Metrics;
import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables;

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
 * An implementation of the model object '<em><b>Memoryusage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.MemoryusageImpl#getMemoryUsageMemUsage <em>Memory Usage Mem Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryusageImpl extends MixinBaseImpl implements Memoryusage {
	/**
	 * The default value of the '{@link #getMemoryUsageMemUsage() <em>Memory Usage Mem Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsageMemUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Double MEMORY_USAGE_MEM_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryUsageMemUsage() <em>Memory Usage Mem Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsageMemUsage()
	 * @generated
	 * @ordered
	 */
	protected Double memoryUsageMemUsage = MEMORY_USAGE_MEM_USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryusageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OccimonitoringPackage.Literals.MEMORYUSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMemoryUsageMemUsage() {
		return memoryUsageMemUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryUsageMemUsage(Double newMemoryUsageMemUsage) {
		Double oldMemoryUsageMemUsage = memoryUsageMemUsage;
		memoryUsageMemUsage = newMemoryUsageMemUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.MEMORYUSAGE__MEMORY_USAGE_MEM_USAGE, oldMemoryUsageMemUsage, memoryUsageMemUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getmetric() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Memoryusage!getmetric()
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
		 *   let severity : Integer[1] = 'Memoryusage::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Zabbixinstance)
		 *       in
		 *         'Memoryusage::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OccimonitoringTables.STR_Memoryusage_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OccimonitoringTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occimonitoring_c_c_Zabbixinstance_0 = idResolver.getClass(OccimonitoringTables.CLSSid_Zabbixinstance, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_occimonitoring_c_c_Zabbixinstance_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OccimonitoringTables.STR_Memoryusage_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OccimonitoringTables.INT_0).booleanValue();
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
			case OccimonitoringPackage.MEMORYUSAGE__MEMORY_USAGE_MEM_USAGE:
				return getMemoryUsageMemUsage();
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
			case OccimonitoringPackage.MEMORYUSAGE__MEMORY_USAGE_MEM_USAGE:
				setMemoryUsageMemUsage((Double)newValue);
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
			case OccimonitoringPackage.MEMORYUSAGE__MEMORY_USAGE_MEM_USAGE:
				setMemoryUsageMemUsage(MEMORY_USAGE_MEM_USAGE_EDEFAULT);
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
			case OccimonitoringPackage.MEMORYUSAGE__MEMORY_USAGE_MEM_USAGE:
				return MEMORY_USAGE_MEM_USAGE_EDEFAULT == null ? memoryUsageMemUsage != null : !MEMORY_USAGE_MEM_USAGE_EDEFAULT.equals(memoryUsageMemUsage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Metrics.class) {
			switch (baseOperationID) {
				case OccimonitoringPackage.METRICS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return OccimonitoringPackage.MEMORYUSAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case OccimonitoringPackage.MEMORYUSAGE___GETMETRIC:
				getmetric();
				return null;
			case OccimonitoringPackage.MEMORYUSAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (memoryUsageMemUsage: ");
		result.append(memoryUsageMemUsage);
		result.append(')');
		return result.toString();
	}

} //MemoryusageImpl
