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
package org.eclipse.cmf.occi.multicloud.modemo.impl;

import org.eclipse.cmf.occi.multicloud.modemo.Dynamicscalingpolicy;
import org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamicscalingpolicy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicscalingpolicyImpl#getDynamicscalingpolicyCoolDuration <em>Dynamicscalingpolicy Cool Duration</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.DynamicscalingpolicyImpl#getDynamicscalingpolicyIterationWaitTime <em>Dynamicscalingpolicy Iteration Wait Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicscalingpolicyImpl extends ScalingpolicyImpl implements Dynamicscalingpolicy {
	/**
	 * The default value of the '{@link #getDynamicscalingpolicyCoolDuration() <em>Dynamicscalingpolicy Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicscalingpolicyCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DYNAMICSCALINGPOLICY_COOL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicscalingpolicyCoolDuration() <em>Dynamicscalingpolicy Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicscalingpolicyCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer dynamicscalingpolicyCoolDuration = DYNAMICSCALINGPOLICY_COOL_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicscalingpolicyIterationWaitTime() <em>Dynamicscalingpolicy Iteration Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicscalingpolicyIterationWaitTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicscalingpolicyIterationWaitTime() <em>Dynamicscalingpolicy Iteration Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicscalingpolicyIterationWaitTime()
	 * @generated
	 * @ordered
	 */
	protected Integer dynamicscalingpolicyIterationWaitTime = DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicscalingpolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModemoPackage.Literals.DYNAMICSCALINGPOLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDynamicscalingpolicyCoolDuration() {
		return dynamicscalingpolicyCoolDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicscalingpolicyCoolDuration(Integer newDynamicscalingpolicyCoolDuration) {
		Integer oldDynamicscalingpolicyCoolDuration = dynamicscalingpolicyCoolDuration;
		dynamicscalingpolicyCoolDuration = newDynamicscalingpolicyCoolDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION, oldDynamicscalingpolicyCoolDuration, dynamicscalingpolicyCoolDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDynamicscalingpolicyIterationWaitTime() {
		return dynamicscalingpolicyIterationWaitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicscalingpolicyIterationWaitTime(Integer newDynamicscalingpolicyIterationWaitTime) {
		Integer oldDynamicscalingpolicyIterationWaitTime = dynamicscalingpolicyIterationWaitTime;
		dynamicscalingpolicyIterationWaitTime = newDynamicscalingpolicyIterationWaitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME, oldDynamicscalingpolicyIterationWaitTime, dynamicscalingpolicyIterationWaitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION:
				return getDynamicscalingpolicyCoolDuration();
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME:
				return getDynamicscalingpolicyIterationWaitTime();
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
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION:
				setDynamicscalingpolicyCoolDuration((Integer)newValue);
				return;
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME:
				setDynamicscalingpolicyIterationWaitTime((Integer)newValue);
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
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION:
				setDynamicscalingpolicyCoolDuration(DYNAMICSCALINGPOLICY_COOL_DURATION_EDEFAULT);
				return;
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME:
				setDynamicscalingpolicyIterationWaitTime(DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME_EDEFAULT);
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
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION:
				return DYNAMICSCALINGPOLICY_COOL_DURATION_EDEFAULT == null ? dynamicscalingpolicyCoolDuration != null : !DYNAMICSCALINGPOLICY_COOL_DURATION_EDEFAULT.equals(dynamicscalingpolicyCoolDuration);
			case ModemoPackage.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME:
				return DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME_EDEFAULT == null ? dynamicscalingpolicyIterationWaitTime != null : !DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME_EDEFAULT.equals(dynamicscalingpolicyIterationWaitTime);
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
		result.append(" (dynamicscalingpolicyCoolDuration: ");
		result.append(dynamicscalingpolicyCoolDuration);
		result.append(", dynamicscalingpolicyIterationWaitTime: ");
		result.append(dynamicscalingpolicyIterationWaitTime);
		result.append(')');
		return result.toString();
	}

} //DynamicscalingpolicyImpl
