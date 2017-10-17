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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniqueschedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl#getUniqueScheduleStartDate <em>Unique Schedule Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniquescheduleImpl#getUniqueScheduleEndDate <em>Unique Schedule End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniquescheduleImpl extends SchedulerImpl implements Uniqueschedule {
	/**
	 * The default value of the '{@link #getUniqueScheduleStartDate() <em>Unique Schedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueScheduleStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UNIQUE_SCHEDULE_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueScheduleStartDate() <em>Unique Schedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueScheduleStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date uniqueScheduleStartDate = UNIQUE_SCHEDULE_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueScheduleEndDate() <em>Unique Schedule End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueScheduleEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UNIQUE_SCHEDULE_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueScheduleEndDate() <em>Unique Schedule End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueScheduleEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date uniqueScheduleEndDate = UNIQUE_SCHEDULE_END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniquescheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.UNIQUESCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUniqueScheduleStartDate() {
		return uniqueScheduleStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueScheduleStartDate(Date newUniqueScheduleStartDate) {
		Date oldUniqueScheduleStartDate = uniqueScheduleStartDate;
		uniqueScheduleStartDate = newUniqueScheduleStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE, oldUniqueScheduleStartDate, uniqueScheduleStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUniqueScheduleEndDate() {
		return uniqueScheduleEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueScheduleEndDate(Date newUniqueScheduleEndDate) {
		Date oldUniqueScheduleEndDate = uniqueScheduleEndDate;
		uniqueScheduleEndDate = newUniqueScheduleEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE, oldUniqueScheduleEndDate, uniqueScheduleEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE:
				return getUniqueScheduleStartDate();
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE:
				return getUniqueScheduleEndDate();
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
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE:
				setUniqueScheduleStartDate((Date)newValue);
				return;
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE:
				setUniqueScheduleEndDate((Date)newValue);
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
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE:
				setUniqueScheduleStartDate(UNIQUE_SCHEDULE_START_DATE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE:
				setUniqueScheduleEndDate(UNIQUE_SCHEDULE_END_DATE_EDEFAULT);
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
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_START_DATE:
				return UNIQUE_SCHEDULE_START_DATE_EDEFAULT == null ? uniqueScheduleStartDate != null : !UNIQUE_SCHEDULE_START_DATE_EDEFAULT.equals(uniqueScheduleStartDate);
			case HorizontalelasticityPackage.UNIQUESCHEDULE__UNIQUE_SCHEDULE_END_DATE:
				return UNIQUE_SCHEDULE_END_DATE_EDEFAULT == null ? uniqueScheduleEndDate != null : !UNIQUE_SCHEDULE_END_DATE_EDEFAULT.equals(uniqueScheduleEndDate);
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
		result.append(" (UniqueScheduleStartDate: ");
		result.append(uniqueScheduleStartDate);
		result.append(", UniqueScheduleEndDate: ");
		result.append(uniqueScheduleEndDate);
		result.append(')');
		return result.toString();
	}

} //UniquescheduleImpl
