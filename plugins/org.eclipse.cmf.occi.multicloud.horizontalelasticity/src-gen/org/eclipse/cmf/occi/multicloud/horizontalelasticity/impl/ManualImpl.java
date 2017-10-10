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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl#getManualGroupSize <em>Manual Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl#getManualMaxGroupSize <em>Manual Max Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ManualImpl#getManualMinGroupSize <em>Manual Min Group Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManualImpl extends HorizontalelasticcontrollerImpl implements Manual {
	/**
	 * The default value of the '{@link #getManualGroupSize() <em>Manual Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUAL_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManualGroupSize() <em>Manual Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualGroupSize()
	 * @generated
	 * @ordered
	 */
	protected String manualGroupSize = MANUAL_GROUP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getManualMaxGroupSize() <em>Manual Max Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualMaxGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUAL_MAX_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManualMaxGroupSize() <em>Manual Max Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualMaxGroupSize()
	 * @generated
	 * @ordered
	 */
	protected String manualMaxGroupSize = MANUAL_MAX_GROUP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getManualMinGroupSize() <em>Manual Min Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualMinGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUAL_MIN_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManualMinGroupSize() <em>Manual Min Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualMinGroupSize()
	 * @generated
	 * @ordered
	 */
	protected String manualMinGroupSize = MANUAL_MIN_GROUP_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.MANUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManualGroupSize() {
		return manualGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualGroupSize(String newManualGroupSize) {
		String oldManualGroupSize = manualGroupSize;
		manualGroupSize = newManualGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.MANUAL__MANUAL_GROUP_SIZE, oldManualGroupSize, manualGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManualMaxGroupSize() {
		return manualMaxGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualMaxGroupSize(String newManualMaxGroupSize) {
		String oldManualMaxGroupSize = manualMaxGroupSize;
		manualMaxGroupSize = newManualMaxGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.MANUAL__MANUAL_MAX_GROUP_SIZE, oldManualMaxGroupSize, manualMaxGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManualMinGroupSize() {
		return manualMinGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualMinGroupSize(String newManualMinGroupSize) {
		String oldManualMinGroupSize = manualMinGroupSize;
		manualMinGroupSize = newManualMinGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.MANUAL__MANUAL_MIN_GROUP_SIZE, oldManualMinGroupSize, manualMinGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Manual!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Manual!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.MANUAL__MANUAL_GROUP_SIZE:
				return getManualGroupSize();
			case HorizontalelasticityPackage.MANUAL__MANUAL_MAX_GROUP_SIZE:
				return getManualMaxGroupSize();
			case HorizontalelasticityPackage.MANUAL__MANUAL_MIN_GROUP_SIZE:
				return getManualMinGroupSize();
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
			case HorizontalelasticityPackage.MANUAL__MANUAL_GROUP_SIZE:
				setManualGroupSize((String)newValue);
				return;
			case HorizontalelasticityPackage.MANUAL__MANUAL_MAX_GROUP_SIZE:
				setManualMaxGroupSize((String)newValue);
				return;
			case HorizontalelasticityPackage.MANUAL__MANUAL_MIN_GROUP_SIZE:
				setManualMinGroupSize((String)newValue);
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
			case HorizontalelasticityPackage.MANUAL__MANUAL_GROUP_SIZE:
				setManualGroupSize(MANUAL_GROUP_SIZE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.MANUAL__MANUAL_MAX_GROUP_SIZE:
				setManualMaxGroupSize(MANUAL_MAX_GROUP_SIZE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.MANUAL__MANUAL_MIN_GROUP_SIZE:
				setManualMinGroupSize(MANUAL_MIN_GROUP_SIZE_EDEFAULT);
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
			case HorizontalelasticityPackage.MANUAL__MANUAL_GROUP_SIZE:
				return MANUAL_GROUP_SIZE_EDEFAULT == null ? manualGroupSize != null : !MANUAL_GROUP_SIZE_EDEFAULT.equals(manualGroupSize);
			case HorizontalelasticityPackage.MANUAL__MANUAL_MAX_GROUP_SIZE:
				return MANUAL_MAX_GROUP_SIZE_EDEFAULT == null ? manualMaxGroupSize != null : !MANUAL_MAX_GROUP_SIZE_EDEFAULT.equals(manualMaxGroupSize);
			case HorizontalelasticityPackage.MANUAL__MANUAL_MIN_GROUP_SIZE:
				return MANUAL_MIN_GROUP_SIZE_EDEFAULT == null ? manualMinGroupSize != null : !MANUAL_MIN_GROUP_SIZE_EDEFAULT.equals(manualMinGroupSize);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HorizontalelasticityPackage.MANUAL___START:
				start();
				return null;
			case HorizontalelasticityPackage.MANUAL___STOP:
				stop();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (manualGroupSize: ");
		result.append(manualGroupSize);
		result.append(", manualMaxGroupSize: ");
		result.append(manualMaxGroupSize);
		result.append(", manualMinGroupSize: ");
		result.append(manualMinGroupSize);
		result.append(')');
		return result.toString();
	}

} //ManualImpl
