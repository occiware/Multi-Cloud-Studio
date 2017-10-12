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
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simpledynamic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl#getSimpleDynamicName <em>Simple Dynamic Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.SimpledynamicImpl#getSimpleDynamicCoolDuration <em>Simple Dynamic Cool Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpledynamicImpl extends DynamicpolicyImpl implements Simpledynamic {
	/**
	 * The default value of the '{@link #getSimpleDynamicName() <em>Simple Dynamic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDynamicName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_DYNAMIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleDynamicName() <em>Simple Dynamic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDynamicName()
	 * @generated
	 * @ordered
	 */
	protected String simpleDynamicName = SIMPLE_DYNAMIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimpleDynamicCoolDuration() <em>Simple Dynamic Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDynamicCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIMPLE_DYNAMIC_COOL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleDynamicCoolDuration() <em>Simple Dynamic Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDynamicCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer simpleDynamicCoolDuration = SIMPLE_DYNAMIC_COOL_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpledynamicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.SIMPLEDYNAMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleDynamicName() {
		return simpleDynamicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleDynamicName(String newSimpleDynamicName) {
		String oldSimpleDynamicName = simpleDynamicName;
		simpleDynamicName = newSimpleDynamicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME, oldSimpleDynamicName, simpleDynamicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSimpleDynamicCoolDuration() {
		return simpleDynamicCoolDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleDynamicCoolDuration(Integer newSimpleDynamicCoolDuration) {
		Integer oldSimpleDynamicCoolDuration = simpleDynamicCoolDuration;
		simpleDynamicCoolDuration = newSimpleDynamicCoolDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION, oldSimpleDynamicCoolDuration, simpleDynamicCoolDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME:
				return getSimpleDynamicName();
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION:
				return getSimpleDynamicCoolDuration();
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
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME:
				setSimpleDynamicName((String)newValue);
				return;
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION:
				setSimpleDynamicCoolDuration((Integer)newValue);
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
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME:
				setSimpleDynamicName(SIMPLE_DYNAMIC_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION:
				setSimpleDynamicCoolDuration(SIMPLE_DYNAMIC_COOL_DURATION_EDEFAULT);
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
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME:
				return SIMPLE_DYNAMIC_NAME_EDEFAULT == null ? simpleDynamicName != null : !SIMPLE_DYNAMIC_NAME_EDEFAULT.equals(simpleDynamicName);
			case HorizontalelasticityPackage.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION:
				return SIMPLE_DYNAMIC_COOL_DURATION_EDEFAULT == null ? simpleDynamicCoolDuration != null : !SIMPLE_DYNAMIC_COOL_DURATION_EDEFAULT.equals(simpleDynamicCoolDuration);
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
		result.append(" (simpleDynamicName: ");
		result.append(simpleDynamicName);
		result.append(", simpleDynamicCoolDuration: ");
		result.append(simpleDynamicCoolDuration);
		result.append(')');
		return result.toString();
	}

} //SimpledynamicImpl
