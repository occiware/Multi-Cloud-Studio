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
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedulingpolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurringschedulingpolicy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl#getRecurringschedulingpolicyRecurrence <em>Recurringschedulingpolicy Recurrence</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl#getRecurringschedulingpolicyStartDate <em>Recurringschedulingpolicy Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl#getRecurringschedulingpolicyEndDate <em>Recurringschedulingpolicy End Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RecurringschedulingpolicyImpl#getRecurringschedulingpolicyInterval <em>Recurringschedulingpolicy Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecurringschedulingpolicyImpl extends SchedulingpolicyImpl implements Recurringschedulingpolicy {
	/**
	 * The cached value of the '{@link #getRecurringschedulingpolicyRecurrence() <em>Recurringschedulingpolicy Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringschedulingpolicyRecurrence()
	 * @generated
	 * @ordered
	 */
	protected ArrofRecStep recurringschedulingpolicyRecurrence;

	/**
	 * The default value of the '{@link #getRecurringschedulingpolicyStartDate() <em>Recurringschedulingpolicy Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringschedulingpolicyStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECURRINGSCHEDULINGPOLICY_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurringschedulingpolicyStartDate() <em>Recurringschedulingpolicy Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringschedulingpolicyStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date recurringschedulingpolicyStartDate = RECURRINGSCHEDULINGPOLICY_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurringschedulingpolicyEndDate() <em>Recurringschedulingpolicy End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringschedulingpolicyEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECURRINGSCHEDULINGPOLICY_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurringschedulingpolicyEndDate() <em>Recurringschedulingpolicy End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringschedulingpolicyEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date recurringschedulingpolicyEndDate = RECURRINGSCHEDULINGPOLICY_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurringschedulingpolicyInterval() <em>Recurringschedulingpolicy Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringschedulingpolicyInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECURRINGSCHEDULINGPOLICY_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurringschedulingpolicyInterval() <em>Recurringschedulingpolicy Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringschedulingpolicyInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer recurringschedulingpolicyInterval = RECURRINGSCHEDULINGPOLICY_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurringschedulingpolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.RECURRINGSCHEDULINGPOLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrofRecStep getRecurringschedulingpolicyRecurrence() {
		return recurringschedulingpolicyRecurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurringschedulingpolicyRecurrence(ArrofRecStep newRecurringschedulingpolicyRecurrence, NotificationChain msgs) {
		ArrofRecStep oldRecurringschedulingpolicyRecurrence = recurringschedulingpolicyRecurrence;
		recurringschedulingpolicyRecurrence = newRecurringschedulingpolicyRecurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE, oldRecurringschedulingpolicyRecurrence, newRecurringschedulingpolicyRecurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringschedulingpolicyRecurrence(ArrofRecStep newRecurringschedulingpolicyRecurrence) {
		if (newRecurringschedulingpolicyRecurrence != recurringschedulingpolicyRecurrence) {
			NotificationChain msgs = null;
			if (recurringschedulingpolicyRecurrence != null)
				msgs = ((InternalEObject)recurringschedulingpolicyRecurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE, null, msgs);
			if (newRecurringschedulingpolicyRecurrence != null)
				msgs = ((InternalEObject)newRecurringschedulingpolicyRecurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE, null, msgs);
			msgs = basicSetRecurringschedulingpolicyRecurrence(newRecurringschedulingpolicyRecurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE, newRecurringschedulingpolicyRecurrence, newRecurringschedulingpolicyRecurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRecurringschedulingpolicyStartDate() {
		return recurringschedulingpolicyStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringschedulingpolicyStartDate(Date newRecurringschedulingpolicyStartDate) {
		Date oldRecurringschedulingpolicyStartDate = recurringschedulingpolicyStartDate;
		recurringschedulingpolicyStartDate = newRecurringschedulingpolicyStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE, oldRecurringschedulingpolicyStartDate, recurringschedulingpolicyStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRecurringschedulingpolicyEndDate() {
		return recurringschedulingpolicyEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringschedulingpolicyEndDate(Date newRecurringschedulingpolicyEndDate) {
		Date oldRecurringschedulingpolicyEndDate = recurringschedulingpolicyEndDate;
		recurringschedulingpolicyEndDate = newRecurringschedulingpolicyEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE, oldRecurringschedulingpolicyEndDate, recurringschedulingpolicyEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRecurringschedulingpolicyInterval() {
		return recurringschedulingpolicyInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringschedulingpolicyInterval(Integer newRecurringschedulingpolicyInterval) {
		Integer oldRecurringschedulingpolicyInterval = recurringschedulingpolicyInterval;
		recurringschedulingpolicyInterval = newRecurringschedulingpolicyInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL, oldRecurringschedulingpolicyInterval, recurringschedulingpolicyInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE:
				return basicSetRecurringschedulingpolicyRecurrence(null, msgs);
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE:
				return getRecurringschedulingpolicyRecurrence();
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE:
				return getRecurringschedulingpolicyStartDate();
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE:
				return getRecurringschedulingpolicyEndDate();
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL:
				return getRecurringschedulingpolicyInterval();
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE:
				setRecurringschedulingpolicyRecurrence((ArrofRecStep)newValue);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE:
				setRecurringschedulingpolicyStartDate((Date)newValue);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE:
				setRecurringschedulingpolicyEndDate((Date)newValue);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL:
				setRecurringschedulingpolicyInterval((Integer)newValue);
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE:
				setRecurringschedulingpolicyRecurrence((ArrofRecStep)null);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE:
				setRecurringschedulingpolicyStartDate(RECURRINGSCHEDULINGPOLICY_START_DATE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE:
				setRecurringschedulingpolicyEndDate(RECURRINGSCHEDULINGPOLICY_END_DATE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL:
				setRecurringschedulingpolicyInterval(RECURRINGSCHEDULINGPOLICY_INTERVAL_EDEFAULT);
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
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE:
				return recurringschedulingpolicyRecurrence != null;
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE:
				return RECURRINGSCHEDULINGPOLICY_START_DATE_EDEFAULT == null ? recurringschedulingpolicyStartDate != null : !RECURRINGSCHEDULINGPOLICY_START_DATE_EDEFAULT.equals(recurringschedulingpolicyStartDate);
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE:
				return RECURRINGSCHEDULINGPOLICY_END_DATE_EDEFAULT == null ? recurringschedulingpolicyEndDate != null : !RECURRINGSCHEDULINGPOLICY_END_DATE_EDEFAULT.equals(recurringschedulingpolicyEndDate);
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL:
				return RECURRINGSCHEDULINGPOLICY_INTERVAL_EDEFAULT == null ? recurringschedulingpolicyInterval != null : !RECURRINGSCHEDULINGPOLICY_INTERVAL_EDEFAULT.equals(recurringschedulingpolicyInterval);
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
		result.append(" (recurringschedulingpolicyStartDate: ");
		result.append(recurringschedulingpolicyStartDate);
		result.append(", recurringschedulingpolicyEndDate: ");
		result.append(recurringschedulingpolicyEndDate);
		result.append(", recurringschedulingpolicyInterval: ");
		result.append(recurringschedulingpolicyInterval);
		result.append(')');
		return result.toString();
	}

} //RecurringschedulingpolicyImpl
