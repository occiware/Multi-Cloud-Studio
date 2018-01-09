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
package org.eclipse.cmf.occi.multicloud.aws.ec2.impl;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rootdevicevolume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.RootdevicevolumeImpl#getRootDeviceName <em>Root Device Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.RootdevicevolumeImpl#getRootDeviceType <em>Root Device Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootdevicevolumeImpl extends MixinBaseImpl implements Rootdevicevolume {
	/**
	 * The default value of the '{@link #getRootDeviceName() <em>Root Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootDeviceName() <em>Root Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String rootDeviceName = ROOT_DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootDeviceType() <em>Root Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_DEVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootDeviceType() <em>Root Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDeviceType()
	 * @generated
	 * @ordered
	 */
	protected String rootDeviceType = ROOT_DEVICE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootdevicevolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getRootdevicevolume();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootDeviceName() {
		return rootDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootDeviceName(String newRootDeviceName) {
		String oldRootDeviceName = rootDeviceName;
		rootDeviceName = newRootDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_NAME, oldRootDeviceName, rootDeviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootDeviceType() {
		return rootDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootDeviceType(String newRootDeviceType) {
		String oldRootDeviceType = rootDeviceType;
		rootDeviceType = newRootDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE, oldRootDeviceType, rootDeviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_NAME:
				return getRootDeviceName();
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE:
				return getRootDeviceType();
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
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_NAME:
				setRootDeviceName((String)newValue);
				return;
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE:
				setRootDeviceType((String)newValue);
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
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_NAME:
				setRootDeviceName(ROOT_DEVICE_NAME_EDEFAULT);
				return;
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE:
				setRootDeviceType(ROOT_DEVICE_TYPE_EDEFAULT);
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
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_NAME:
				return ROOT_DEVICE_NAME_EDEFAULT == null ? rootDeviceName != null : !ROOT_DEVICE_NAME_EDEFAULT.equals(rootDeviceName);
			case Ec2Package.ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE:
				return ROOT_DEVICE_TYPE_EDEFAULT == null ? rootDeviceType != null : !ROOT_DEVICE_TYPE_EDEFAULT.equals(rootDeviceType);
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
		result.append(" (rootDeviceName: ");
		result.append(rootDeviceName);
		result.append(", rootDeviceType: ");
		result.append(rootDeviceType);
		result.append(')');
		return result.toString();
	}

} //RootdevicevolumeImpl
