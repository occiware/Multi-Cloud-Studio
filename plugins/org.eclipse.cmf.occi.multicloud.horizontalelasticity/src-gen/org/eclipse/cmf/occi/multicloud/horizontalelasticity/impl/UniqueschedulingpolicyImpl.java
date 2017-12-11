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
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedulingpolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniqueschedulingpolicy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniqueschedulingpolicyImpl#getUniqueschedulingpolicyStartDate <em>Uniqueschedulingpolicy Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.UniqueschedulingpolicyImpl#getUniqueschedulingpolicyEndDate <em>Uniqueschedulingpolicy End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniqueschedulingpolicyImpl extends SchedulingpolicyImpl implements Uniqueschedulingpolicy {
	/**
	 * The default value of the '{@link #getUniqueschedulingpolicyStartDate() <em>Uniqueschedulingpolicy Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueschedulingpolicyStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UNIQUESCHEDULINGPOLICY_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueschedulingpolicyStartDate() <em>Uniqueschedulingpolicy Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueschedulingpolicyStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date uniqueschedulingpolicyStartDate = UNIQUESCHEDULINGPOLICY_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueschedulingpolicyEndDate() <em>Uniqueschedulingpolicy End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueschedulingpolicyEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UNIQUESCHEDULINGPOLICY_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueschedulingpolicyEndDate() <em>Uniqueschedulingpolicy End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueschedulingpolicyEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date uniqueschedulingpolicyEndDate = UNIQUESCHEDULINGPOLICY_END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueschedulingpolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.UNIQUESCHEDULINGPOLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUniqueschedulingpolicyStartDate() {
		return uniqueschedulingpolicyStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueschedulingpolicyStartDate(Date newUniqueschedulingpolicyStartDate) {
		Date oldUniqueschedulingpolicyStartDate = uniqueschedulingpolicyStartDate;
		uniqueschedulingpolicyStartDate = newUniqueschedulingpolicyStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE, oldUniqueschedulingpolicyStartDate, uniqueschedulingpolicyStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUniqueschedulingpolicyEndDate() {
		return uniqueschedulingpolicyEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueschedulingpolicyEndDate(Date newUniqueschedulingpolicyEndDate) {
		Date oldUniqueschedulingpolicyEndDate = uniqueschedulingpolicyEndDate;
		uniqueschedulingpolicyEndDate = newUniqueschedulingpolicyEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE, oldUniqueschedulingpolicyEndDate, uniqueschedulingpolicyEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE:
				return getUniqueschedulingpolicyStartDate();
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE:
				return getUniqueschedulingpolicyEndDate();
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
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE:
				setUniqueschedulingpolicyStartDate((Date)newValue);
				return;
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE:
				setUniqueschedulingpolicyEndDate((Date)newValue);
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
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE:
				setUniqueschedulingpolicyStartDate(UNIQUESCHEDULINGPOLICY_START_DATE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE:
				setUniqueschedulingpolicyEndDate(UNIQUESCHEDULINGPOLICY_END_DATE_EDEFAULT);
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
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE:
				return UNIQUESCHEDULINGPOLICY_START_DATE_EDEFAULT == null ? uniqueschedulingpolicyStartDate != null : !UNIQUESCHEDULINGPOLICY_START_DATE_EDEFAULT.equals(uniqueschedulingpolicyStartDate);
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE:
				return UNIQUESCHEDULINGPOLICY_END_DATE_EDEFAULT == null ? uniqueschedulingpolicyEndDate != null : !UNIQUESCHEDULINGPOLICY_END_DATE_EDEFAULT.equals(uniqueschedulingpolicyEndDate);
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
		result.append(" (uniqueschedulingpolicyStartDate: ");
		result.append(uniqueschedulingpolicyStartDate);
		result.append(", uniqueschedulingpolicyEndDate: ");
		result.append(uniqueschedulingpolicyEndDate);
		result.append(')');
		return result.toString();
	}

} //UniqueschedulingpolicyImpl
