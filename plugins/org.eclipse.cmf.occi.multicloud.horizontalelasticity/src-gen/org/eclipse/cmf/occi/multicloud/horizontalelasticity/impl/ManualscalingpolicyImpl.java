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
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manualscalingpolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manualscalingpolicy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualscalingpolicyImpl#getManualscalingpolicyDesiredSize <em>Manualscalingpolicy Desired Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManualscalingpolicyImpl extends ScalingpolicyImpl implements Manualscalingpolicy {
	/**
	 * The default value of the '{@link #getManualscalingpolicyDesiredSize() <em>Manualscalingpolicy Desired Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualscalingpolicyDesiredSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float MANUALSCALINGPOLICY_DESIRED_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManualscalingpolicyDesiredSize() <em>Manualscalingpolicy Desired Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualscalingpolicyDesiredSize()
	 * @generated
	 * @ordered
	 */
	protected Float manualscalingpolicyDesiredSize = MANUALSCALINGPOLICY_DESIRED_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualscalingpolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.MANUALSCALINGPOLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getManualscalingpolicyDesiredSize() {
		return manualscalingpolicyDesiredSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualscalingpolicyDesiredSize(Float newManualscalingpolicyDesiredSize) {
		Float oldManualscalingpolicyDesiredSize = manualscalingpolicyDesiredSize;
		manualscalingpolicyDesiredSize = newManualscalingpolicyDesiredSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE, oldManualscalingpolicyDesiredSize, manualscalingpolicyDesiredSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE:
				return getManualscalingpolicyDesiredSize();
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
			case HorizontalelasticityPackage.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE:
				setManualscalingpolicyDesiredSize((Float)newValue);
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
			case HorizontalelasticityPackage.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE:
				setManualscalingpolicyDesiredSize(MANUALSCALINGPOLICY_DESIRED_SIZE_EDEFAULT);
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
			case HorizontalelasticityPackage.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE:
				return MANUALSCALINGPOLICY_DESIRED_SIZE_EDEFAULT == null ? manualscalingpolicyDesiredSize != null : !MANUALSCALINGPOLICY_DESIRED_SIZE_EDEFAULT.equals(manualscalingpolicyDesiredSize);
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
		result.append(" (manualscalingpolicyDesiredSize: ");
		result.append(manualscalingpolicyDesiredSize);
		result.append(')');
		return result.toString();
	}

} //ManualscalingpolicyImpl
