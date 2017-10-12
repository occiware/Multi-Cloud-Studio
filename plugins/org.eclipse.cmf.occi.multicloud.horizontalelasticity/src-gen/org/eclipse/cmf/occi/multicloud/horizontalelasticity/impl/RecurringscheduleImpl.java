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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrayofRecurrenceStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 * An implementation of the model object '<em><b>Recurringschedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl#getRecurringscheduleRecurrence <em>Recurringschedule Recurrence</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl#getRecurringscheduleStartDate <em>Recurringschedule Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringscheduleImpl#getRecurringscheduleEndDate <em>Recurringschedule End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecurringscheduleImpl extends MixinBaseImpl implements Recurringschedule {
	/**
	 * The cached value of the '{@link #getRecurringscheduleRecurrence() <em>Recurringschedule Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringscheduleRecurrence()
	 * @generated
	 * @ordered
	 */
	protected ArrayofRecurrenceStep recurringscheduleRecurrence;

	/**
	 * The default value of the '{@link #getRecurringscheduleStartDate() <em>Recurringschedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringscheduleStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECURRINGSCHEDULE_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurringscheduleStartDate() <em>Recurringschedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringscheduleStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date recurringscheduleStartDate = RECURRINGSCHEDULE_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurringscheduleEndDate() <em>Recurringschedule End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringscheduleEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECURRINGSCHEDULE_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurringscheduleEndDate() <em>Recurringschedule End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringscheduleEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date recurringscheduleEndDate = RECURRINGSCHEDULE_END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurringscheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.RECURRINGSCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayofRecurrenceStep getRecurringscheduleRecurrence() {
		return recurringscheduleRecurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurringscheduleRecurrence(ArrayofRecurrenceStep newRecurringscheduleRecurrence, NotificationChain msgs) {
		ArrayofRecurrenceStep oldRecurringscheduleRecurrence = recurringscheduleRecurrence;
		recurringscheduleRecurrence = newRecurringscheduleRecurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE, oldRecurringscheduleRecurrence, newRecurringscheduleRecurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringscheduleRecurrence(ArrayofRecurrenceStep newRecurringscheduleRecurrence) {
		if (newRecurringscheduleRecurrence != recurringscheduleRecurrence) {
			NotificationChain msgs = null;
			if (recurringscheduleRecurrence != null)
				msgs = ((InternalEObject)recurringscheduleRecurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE, null, msgs);
			if (newRecurringscheduleRecurrence != null)
				msgs = ((InternalEObject)newRecurringscheduleRecurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE, null, msgs);
			msgs = basicSetRecurringscheduleRecurrence(newRecurringscheduleRecurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE, newRecurringscheduleRecurrence, newRecurringscheduleRecurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRecurringscheduleStartDate() {
		return recurringscheduleStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringscheduleStartDate(Date newRecurringscheduleStartDate) {
		Date oldRecurringscheduleStartDate = recurringscheduleStartDate;
		recurringscheduleStartDate = newRecurringscheduleStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE, oldRecurringscheduleStartDate, recurringscheduleStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRecurringscheduleEndDate() {
		return recurringscheduleEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringscheduleEndDate(Date newRecurringscheduleEndDate) {
		Date oldRecurringscheduleEndDate = recurringscheduleEndDate;
		recurringscheduleEndDate = newRecurringscheduleEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE, oldRecurringscheduleEndDate, recurringscheduleEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Recurringschedule!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Recurringschedule!stop()
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
		 *         result : occi::Boolean[?] = self.entity.oclIsKindOf(Manual) or
		 *         self.entity.oclIsKindOf(Simpledynamic) or
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
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Manual = idResolver.getClass(HorizontalelasticityTables.CLSSid_Manual, null);
			final /*@NonInvalid*/ Entity entity_2 = this.getEntity();
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_2, TYP_horizontalelasticity_c_c_Manual).booleanValue();
			/*@NonInvalid*/ boolean or;
			if (oclIsKindOf) {
				or = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Simpledynamic = idResolver.getClass(HorizontalelasticityTables.CLSSid_Simpledynamic, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_2, TYP_horizontalelasticity_c_c_Simpledynamic).booleanValue();
				or = oclIsKindOf_0;
			}
			/*@NonInvalid*/ boolean or_0;
			if (or) {
				or_0 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Stepdynamic = idResolver.getClass(HorizontalelasticityTables.CLSSid_Stepdynamic, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_1 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_2, TYP_horizontalelasticity_c_c_Stepdynamic).booleanValue();
				or_0 = oclIsKindOf_1;
			}
			/*@NonInvalid*/ boolean result;
			if (or_0) {
				result = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Dynamicadjustment = idResolver.getClass(HorizontalelasticityTables.CLSSid_Dynamicadjustment, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_2 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_2, TYP_horizontalelasticity_c_c_Dynamicadjustment).booleanValue();
				result = oclIsKindOf_2;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE:
				return basicSetRecurringscheduleRecurrence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE:
				return getRecurringscheduleRecurrence();
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE:
				return getRecurringscheduleStartDate();
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE:
				return getRecurringscheduleEndDate();
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE:
				setRecurringscheduleRecurrence((ArrayofRecurrenceStep)newValue);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE:
				setRecurringscheduleStartDate((Date)newValue);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE:
				setRecurringscheduleEndDate((Date)newValue);
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE:
				setRecurringscheduleRecurrence((ArrayofRecurrenceStep)null);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE:
				setRecurringscheduleStartDate(RECURRINGSCHEDULE_START_DATE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE:
				setRecurringscheduleEndDate(RECURRINGSCHEDULE_END_DATE_EDEFAULT);
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE:
				return recurringscheduleRecurrence != null;
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_START_DATE:
				return RECURRINGSCHEDULE_START_DATE_EDEFAULT == null ? recurringscheduleStartDate != null : !RECURRINGSCHEDULE_START_DATE_EDEFAULT.equals(recurringscheduleStartDate);
			case HorizontalelasticityPackage.RECURRINGSCHEDULE__RECURRINGSCHEDULE_END_DATE:
				return RECURRINGSCHEDULE_END_DATE_EDEFAULT == null ? recurringscheduleEndDate != null : !RECURRINGSCHEDULE_END_DATE_EDEFAULT.equals(recurringscheduleEndDate);
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
		if (baseClass == Scheduler.class) {
			switch (baseOperationID) {
				case HorizontalelasticityPackage.SCHEDULER___START: return HorizontalelasticityPackage.RECURRINGSCHEDULE___START;
				case HorizontalelasticityPackage.SCHEDULER___STOP: return HorizontalelasticityPackage.RECURRINGSCHEDULE___STOP;
				case HorizontalelasticityPackage.SCHEDULER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1: return HorizontalelasticityPackage.RECURRINGSCHEDULE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1;
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULE___START:
				start();
				return null;
			case HorizontalelasticityPackage.RECURRINGSCHEDULE___STOP:
				stop();
				return null;
			case HorizontalelasticityPackage.RECURRINGSCHEDULE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP_1:
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
		result.append(" (RecurringscheduleStartDate: ");
		result.append(recurringscheduleStartDate);
		result.append(", RecurringscheduleEndDate: ");
		result.append(recurringscheduleEndDate);
		result.append(')');
		return result.toString();
	}

} //RecurringscheduleImpl
