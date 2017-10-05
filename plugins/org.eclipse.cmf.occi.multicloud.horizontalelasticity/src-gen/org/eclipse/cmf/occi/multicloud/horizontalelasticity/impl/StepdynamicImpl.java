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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stepdynamic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl#getStepDynamicName <em>Step Dynamic Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepdynamicImpl#getStepDynamicCoolDuration <em>Step Dynamic Cool Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepdynamicImpl extends DynamicImpl implements Stepdynamic {
	/**
	 * The default value of the '{@link #getStepDynamicName() <em>Step Dynamic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDynamicName()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_DYNAMIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepDynamicName() <em>Step Dynamic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDynamicName()
	 * @generated
	 * @ordered
	 */
	protected String stepDynamicName = STEP_DYNAMIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepDynamicCoolDuration() <em>Step Dynamic Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDynamicCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STEP_DYNAMIC_COOL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepDynamicCoolDuration() <em>Step Dynamic Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDynamicCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer stepDynamicCoolDuration = STEP_DYNAMIC_COOL_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepdynamicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.STEPDYNAMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStepDynamicName() {
		return stepDynamicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepDynamicName(String newStepDynamicName) {
		String oldStepDynamicName = stepDynamicName;
		stepDynamicName = newStepDynamicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_NAME, oldStepDynamicName, stepDynamicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStepDynamicCoolDuration() {
		return stepDynamicCoolDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepDynamicCoolDuration(Integer newStepDynamicCoolDuration) {
		Integer oldStepDynamicCoolDuration = stepDynamicCoolDuration;
		stepDynamicCoolDuration = newStepDynamicCoolDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION, oldStepDynamicCoolDuration, stepDynamicCoolDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_NAME:
				return getStepDynamicName();
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION:
				return getStepDynamicCoolDuration();
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
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_NAME:
				setStepDynamicName((String)newValue);
				return;
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION:
				setStepDynamicCoolDuration((Integer)newValue);
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
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_NAME:
				setStepDynamicName(STEP_DYNAMIC_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION:
				setStepDynamicCoolDuration(STEP_DYNAMIC_COOL_DURATION_EDEFAULT);
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
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_NAME:
				return STEP_DYNAMIC_NAME_EDEFAULT == null ? stepDynamicName != null : !STEP_DYNAMIC_NAME_EDEFAULT.equals(stepDynamicName);
			case HorizontalelasticityPackage.STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION:
				return STEP_DYNAMIC_COOL_DURATION_EDEFAULT == null ? stepDynamicCoolDuration != null : !STEP_DYNAMIC_COOL_DURATION_EDEFAULT.equals(stepDynamicCoolDuration);
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
		result.append(" (stepDynamicName: ");
		result.append(stepDynamicName);
		result.append(", stepDynamicCoolDuration: ");
		result.append(stepDynamicCoolDuration);
		result.append(')');
		return result.toString();
	}

} //StepdynamicImpl
