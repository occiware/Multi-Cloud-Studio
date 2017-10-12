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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Step;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl#getStepsLowerStepBound <em>Steps Lower Step Bound</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl#getStepsUpperStepBound <em>Steps Upper Step Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends ResourceImpl implements Step {
	/**
	 * The default value of the '{@link #getStepsLowerStepBound() <em>Steps Lower Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsLowerStepBound()
	 * @generated
	 * @ordered
	 */
	protected static final Float STEPS_LOWER_STEP_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepsLowerStepBound() <em>Steps Lower Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsLowerStepBound()
	 * @generated
	 * @ordered
	 */
	protected Float stepsLowerStepBound = STEPS_LOWER_STEP_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepsUpperStepBound() <em>Steps Upper Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsUpperStepBound()
	 * @generated
	 * @ordered
	 */
	protected static final Float STEPS_UPPER_STEP_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepsUpperStepBound() <em>Steps Upper Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsUpperStepBound()
	 * @generated
	 * @ordered
	 */
	protected Float stepsUpperStepBound = STEPS_UPPER_STEP_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getStepsLowerStepBound() {
		return stepsLowerStepBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepsLowerStepBound(Float newStepsLowerStepBound) {
		Float oldStepsLowerStepBound = stepsLowerStepBound;
		stepsLowerStepBound = newStepsLowerStepBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEP__STEPS_LOWER_STEP_BOUND, oldStepsLowerStepBound, stepsLowerStepBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getStepsUpperStepBound() {
		return stepsUpperStepBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepsUpperStepBound(Float newStepsUpperStepBound) {
		Float oldStepsUpperStepBound = stepsUpperStepBound;
		stepsUpperStepBound = newStepsUpperStepBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEP__STEPS_UPPER_STEP_BOUND, oldStepsUpperStepBound, stepsUpperStepBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.STEP__STEPS_LOWER_STEP_BOUND:
				return getStepsLowerStepBound();
			case HorizontalelasticityPackage.STEP__STEPS_UPPER_STEP_BOUND:
				return getStepsUpperStepBound();
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
			case HorizontalelasticityPackage.STEP__STEPS_LOWER_STEP_BOUND:
				setStepsLowerStepBound((Float)newValue);
				return;
			case HorizontalelasticityPackage.STEP__STEPS_UPPER_STEP_BOUND:
				setStepsUpperStepBound((Float)newValue);
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
			case HorizontalelasticityPackage.STEP__STEPS_LOWER_STEP_BOUND:
				setStepsLowerStepBound(STEPS_LOWER_STEP_BOUND_EDEFAULT);
				return;
			case HorizontalelasticityPackage.STEP__STEPS_UPPER_STEP_BOUND:
				setStepsUpperStepBound(STEPS_UPPER_STEP_BOUND_EDEFAULT);
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
			case HorizontalelasticityPackage.STEP__STEPS_LOWER_STEP_BOUND:
				return STEPS_LOWER_STEP_BOUND_EDEFAULT == null ? stepsLowerStepBound != null : !STEPS_LOWER_STEP_BOUND_EDEFAULT.equals(stepsLowerStepBound);
			case HorizontalelasticityPackage.STEP__STEPS_UPPER_STEP_BOUND:
				return STEPS_UPPER_STEP_BOUND_EDEFAULT == null ? stepsUpperStepBound != null : !STEPS_UPPER_STEP_BOUND_EDEFAULT.equals(stepsUpperStepBound);
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
		result.append(" (stepsLowerStepBound: ");
		result.append(stepsLowerStepBound);
		result.append(", stepsUpperStepBound: ");
		result.append(stepsUpperStepBound);
		result.append(')');
		return result.toString();
	}

} //StepImpl
