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

import java.util.Date;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrofRecStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class RecurringscheduleImpl extends SchedulerImpl implements Recurringschedule {
	/**
	 * The cached value of the '{@link #getRecurringscheduleRecurrence() <em>Recurringschedule Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringscheduleRecurrence()
	 * @generated
	 * @ordered
	 */
	protected ArrofRecStep recurringscheduleRecurrence;

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
	public ArrofRecStep getRecurringscheduleRecurrence() {
		return recurringscheduleRecurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurringscheduleRecurrence(ArrofRecStep newRecurringscheduleRecurrence, NotificationChain msgs) {
		ArrofRecStep oldRecurringscheduleRecurrence = recurringscheduleRecurrence;
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
	public void setRecurringscheduleRecurrence(ArrofRecStep newRecurringscheduleRecurrence) {
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
				setRecurringscheduleRecurrence((ArrofRecStep)newValue);
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
				setRecurringscheduleRecurrence((ArrofRecStep)null);
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
