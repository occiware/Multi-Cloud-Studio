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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl#getDynamicGroupSize <em>Dynamic Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl#getDynamicMaxGroupSize <em>Dynamic Max Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicImpl#getDynamicMinGroupSize <em>Dynamic Min Group Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicImpl extends HorizontalelasticcontrollerImpl implements org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic {
	/**
	 * The default value of the '{@link #getDynamicGroupSize() <em>Dynamic Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DYNAMIC_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicGroupSize() <em>Dynamic Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicGroupSize()
	 * @generated
	 * @ordered
	 */
	protected Integer dynamicGroupSize = DYNAMIC_GROUP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicMaxGroupSize() <em>Dynamic Max Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicMaxGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DYNAMIC_MAX_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicMaxGroupSize() <em>Dynamic Max Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicMaxGroupSize()
	 * @generated
	 * @ordered
	 */
	protected Integer dynamicMaxGroupSize = DYNAMIC_MAX_GROUP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicMinGroupSize() <em>Dynamic Min Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicMinGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DYNAMIC_MIN_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicMinGroupSize() <em>Dynamic Min Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicMinGroupSize()
	 * @generated
	 * @ordered
	 */
	protected Integer dynamicMinGroupSize = DYNAMIC_MIN_GROUP_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.DYNAMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDynamicGroupSize() {
		return dynamicGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicGroupSize(Integer newDynamicGroupSize) {
		Integer oldDynamicGroupSize = dynamicGroupSize;
		dynamicGroupSize = newDynamicGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMIC__DYNAMIC_GROUP_SIZE, oldDynamicGroupSize, dynamicGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDynamicMaxGroupSize() {
		return dynamicMaxGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicMaxGroupSize(Integer newDynamicMaxGroupSize) {
		Integer oldDynamicMaxGroupSize = dynamicMaxGroupSize;
		dynamicMaxGroupSize = newDynamicMaxGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MAX_GROUP_SIZE, oldDynamicMaxGroupSize, dynamicMaxGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDynamicMinGroupSize() {
		return dynamicMinGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicMinGroupSize(Integer newDynamicMinGroupSize) {
		Integer oldDynamicMinGroupSize = dynamicMinGroupSize;
		dynamicMinGroupSize = newDynamicMinGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MIN_GROUP_SIZE, oldDynamicMinGroupSize, dynamicMinGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamic!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamic!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_GROUP_SIZE:
				return getDynamicGroupSize();
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MAX_GROUP_SIZE:
				return getDynamicMaxGroupSize();
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MIN_GROUP_SIZE:
				return getDynamicMinGroupSize();
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
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_GROUP_SIZE:
				setDynamicGroupSize((Integer)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MAX_GROUP_SIZE:
				setDynamicMaxGroupSize((Integer)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MIN_GROUP_SIZE:
				setDynamicMinGroupSize((Integer)newValue);
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
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_GROUP_SIZE:
				setDynamicGroupSize(DYNAMIC_GROUP_SIZE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MAX_GROUP_SIZE:
				setDynamicMaxGroupSize(DYNAMIC_MAX_GROUP_SIZE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MIN_GROUP_SIZE:
				setDynamicMinGroupSize(DYNAMIC_MIN_GROUP_SIZE_EDEFAULT);
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
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_GROUP_SIZE:
				return DYNAMIC_GROUP_SIZE_EDEFAULT == null ? dynamicGroupSize != null : !DYNAMIC_GROUP_SIZE_EDEFAULT.equals(dynamicGroupSize);
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MAX_GROUP_SIZE:
				return DYNAMIC_MAX_GROUP_SIZE_EDEFAULT == null ? dynamicMaxGroupSize != null : !DYNAMIC_MAX_GROUP_SIZE_EDEFAULT.equals(dynamicMaxGroupSize);
			case HorizontalelasticityPackage.DYNAMIC__DYNAMIC_MIN_GROUP_SIZE:
				return DYNAMIC_MIN_GROUP_SIZE_EDEFAULT == null ? dynamicMinGroupSize != null : !DYNAMIC_MIN_GROUP_SIZE_EDEFAULT.equals(dynamicMinGroupSize);
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
			case HorizontalelasticityPackage.DYNAMIC___START:
				start();
				return null;
			case HorizontalelasticityPackage.DYNAMIC___STOP:
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
		result.append(" (dynamicGroupSize: ");
		result.append(dynamicGroupSize);
		result.append(", dynamicMaxGroupSize: ");
		result.append(dynamicMaxGroupSize);
		result.append(", dynamicMinGroupSize: ");
		result.append(dynamicMinGroupSize);
		result.append(')');
		return result.toString();
	}

} //DynamicImpl
