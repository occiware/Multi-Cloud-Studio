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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler;

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
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl#getSchedulerStartDate <em>Scheduler Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SchedulerImpl#getSchedulerEndDate <em>Scheduler End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerImpl extends MixinBaseImpl implements Scheduler {
	/**
	 * The default value of the '{@link #getSchedulerStartDate() <em>Scheduler Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULER_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedulerStartDate() <em>Scheduler Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date schedulerStartDate = SCHEDULER_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulerEndDate() <em>Scheduler End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULER_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedulerEndDate() <em>Scheduler End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date schedulerEndDate = SCHEDULER_END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSchedulerStartDate() {
		return schedulerStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulerStartDate(Date newSchedulerStartDate) {
		Date oldSchedulerStartDate = schedulerStartDate;
		schedulerStartDate = newSchedulerStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.SCHEDULER__SCHEDULER_START_DATE, oldSchedulerStartDate, schedulerStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSchedulerEndDate() {
		return schedulerEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulerEndDate(Date newSchedulerEndDate) {
		Date oldSchedulerEndDate = schedulerEndDate;
		schedulerEndDate = newSchedulerEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.SCHEDULER__SCHEDULER_END_DATE, oldSchedulerEndDate, schedulerEndDate));
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
		 *   let severity : Integer[1] = 'Scheduler::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[?] = self.entity.oclIsKindOf(Simpledynamic) or
		 *         self.entity.oclIsKindOf(Stepdynamic) or
		 *         self.entity.oclIsKindOf(Dynamicadjustment)
		 *       in
		 *         'Scheduler::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, HorizontalelasticityTables.STR_Scheduler_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, HorizontalelasticityTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Simpledynamic_0 = idResolver.getClass(HorizontalelasticityTables.CLSSid_Simpledynamic, null);
			final /*@NonInvalid*/ Entity entity_1 = this.getEntity();
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_1, TYP_horizontalelasticity_c_c_Simpledynamic_0).booleanValue();
			/*@NonInvalid*/ boolean or;
			if (oclIsKindOf) {
				or = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Stepdynamic_0 = idResolver.getClass(HorizontalelasticityTables.CLSSid_Stepdynamic, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_1, TYP_horizontalelasticity_c_c_Stepdynamic_0).booleanValue();
				or = oclIsKindOf_0;
			}
			/*@NonInvalid*/ boolean result;
			if (or) {
				result = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Dynamicadjustment = idResolver.getClass(HorizontalelasticityTables.CLSSid_Dynamicadjustment, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_1 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_1, TYP_horizontalelasticity_c_c_Dynamicadjustment).booleanValue();
				result = oclIsKindOf_1;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, HorizontalelasticityTables.STR_Scheduler_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, HorizontalelasticityTables.INT_0).booleanValue();
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
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_START_DATE:
				return getSchedulerStartDate();
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_END_DATE:
				return getSchedulerEndDate();
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
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_START_DATE:
				setSchedulerStartDate((Date)newValue);
				return;
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_END_DATE:
				setSchedulerEndDate((Date)newValue);
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
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_START_DATE:
				setSchedulerStartDate(SCHEDULER_START_DATE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_END_DATE:
				setSchedulerEndDate(SCHEDULER_END_DATE_EDEFAULT);
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
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_START_DATE:
				return SCHEDULER_START_DATE_EDEFAULT == null ? schedulerStartDate != null : !SCHEDULER_START_DATE_EDEFAULT.equals(schedulerStartDate);
			case HorizontalelasticityPackage.SCHEDULER__SCHEDULER_END_DATE:
				return SCHEDULER_END_DATE_EDEFAULT == null ? schedulerEndDate != null : !SCHEDULER_END_DATE_EDEFAULT.equals(schedulerEndDate);
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
			case HorizontalelasticityPackage.SCHEDULER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (schedulerStartDate: ");
		result.append(schedulerStartDate);
		result.append(", schedulerEndDate: ");
		result.append(schedulerEndDate);
		result.append(')');
		return result.toString();
	}

} //SchedulerImpl
