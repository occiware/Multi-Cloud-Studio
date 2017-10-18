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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl#getStepLowerStepBound <em>Step Lower Step Bound</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl#getStepUpperStepBound <em>Step Upper Step Bound</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepImpl#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends ResourceImpl implements Step {
	/**
	 * The default value of the '{@link #getStepLowerStepBound() <em>Step Lower Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepLowerStepBound()
	 * @generated
	 * @ordered
	 */
	protected static final Float STEP_LOWER_STEP_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepLowerStepBound() <em>Step Lower Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepLowerStepBound()
	 * @generated
	 * @ordered
	 */
	protected Float stepLowerStepBound = STEP_LOWER_STEP_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepUpperStepBound() <em>Step Upper Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepUpperStepBound()
	 * @generated
	 * @ordered
	 */
	protected static final Float STEP_UPPER_STEP_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepUpperStepBound() <em>Step Upper Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepUpperStepBound()
	 * @generated
	 * @ordered
	 */
	protected Float stepUpperStepBound = STEP_UPPER_STEP_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STEP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected Integer stepSize = STEP_SIZE_EDEFAULT;

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
	public Float getStepLowerStepBound() {
		return stepLowerStepBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepLowerStepBound(Float newStepLowerStepBound) {
		Float oldStepLowerStepBound = stepLowerStepBound;
		stepLowerStepBound = newStepLowerStepBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEP__STEP_LOWER_STEP_BOUND, oldStepLowerStepBound, stepLowerStepBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getStepUpperStepBound() {
		return stepUpperStepBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepUpperStepBound(Float newStepUpperStepBound) {
		Float oldStepUpperStepBound = stepUpperStepBound;
		stepUpperStepBound = newStepUpperStepBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEP__STEP_UPPER_STEP_BOUND, oldStepUpperStepBound, stepUpperStepBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStepSize() {
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSize(Integer newStepSize) {
		Integer oldStepSize = stepSize;
		stepSize = newStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEP__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.STEP__STEP_LOWER_STEP_BOUND:
				return getStepLowerStepBound();
			case HorizontalelasticityPackage.STEP__STEP_UPPER_STEP_BOUND:
				return getStepUpperStepBound();
			case HorizontalelasticityPackage.STEP__STEP_SIZE:
				return getStepSize();
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
			case HorizontalelasticityPackage.STEP__STEP_LOWER_STEP_BOUND:
				setStepLowerStepBound((Float)newValue);
				return;
			case HorizontalelasticityPackage.STEP__STEP_UPPER_STEP_BOUND:
				setStepUpperStepBound((Float)newValue);
				return;
			case HorizontalelasticityPackage.STEP__STEP_SIZE:
				setStepSize((Integer)newValue);
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
			case HorizontalelasticityPackage.STEP__STEP_LOWER_STEP_BOUND:
				setStepLowerStepBound(STEP_LOWER_STEP_BOUND_EDEFAULT);
				return;
			case HorizontalelasticityPackage.STEP__STEP_UPPER_STEP_BOUND:
				setStepUpperStepBound(STEP_UPPER_STEP_BOUND_EDEFAULT);
				return;
			case HorizontalelasticityPackage.STEP__STEP_SIZE:
				setStepSize(STEP_SIZE_EDEFAULT);
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
			case HorizontalelasticityPackage.STEP__STEP_LOWER_STEP_BOUND:
				return STEP_LOWER_STEP_BOUND_EDEFAULT == null ? stepLowerStepBound != null : !STEP_LOWER_STEP_BOUND_EDEFAULT.equals(stepLowerStepBound);
			case HorizontalelasticityPackage.STEP__STEP_UPPER_STEP_BOUND:
				return STEP_UPPER_STEP_BOUND_EDEFAULT == null ? stepUpperStepBound != null : !STEP_UPPER_STEP_BOUND_EDEFAULT.equals(stepUpperStepBound);
			case HorizontalelasticityPackage.STEP__STEP_SIZE:
				return STEP_SIZE_EDEFAULT == null ? stepSize != null : !STEP_SIZE_EDEFAULT.equals(stepSize);
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
		result.append(" (stepLowerStepBound: ");
		result.append(stepLowerStepBound);
		result.append(", stepUpperStepBound: ");
		result.append(stepUpperStepBound);
		result.append(", stepSize: ");
		result.append(stepSize);
		result.append(')');
		return result.toString();
	}

} //StepImpl
