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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loadbalancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl#getLoadbalancerName <em>Loadbalancer Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl#getLoadbalancerInstanceIP <em>Loadbalancer Instance IP</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl#getLoadbalancerAddress <em>Loadbalancer Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadbalancerImpl extends ResourceImpl implements Loadbalancer {
	/**
	 * The default value of the '{@link #getLoadbalancerName() <em>Loadbalancer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancerName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOADBALANCER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadbalancerName() <em>Loadbalancer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancerName()
	 * @generated
	 * @ordered
	 */
	protected String loadbalancerName = LOADBALANCER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadbalancerInstanceIP() <em>Loadbalancer Instance IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancerInstanceIP()
	 * @generated
	 * @ordered
	 */
	protected static final String LOADBALANCER_INSTANCE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadbalancerInstanceIP() <em>Loadbalancer Instance IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancerInstanceIP()
	 * @generated
	 * @ordered
	 */
	protected String loadbalancerInstanceIP = LOADBALANCER_INSTANCE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadbalancerAddress() <em>Loadbalancer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancerAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LOADBALANCER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadbalancerAddress() <em>Loadbalancer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancerAddress()
	 * @generated
	 * @ordered
	 */
	protected String loadbalancerAddress = LOADBALANCER_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadbalancerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.LOADBALANCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoadbalancerName() {
		return loadbalancerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadbalancerName(String newLoadbalancerName) {
		String oldLoadbalancerName = loadbalancerName;
		loadbalancerName = newLoadbalancerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_NAME, oldLoadbalancerName, loadbalancerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoadbalancerInstanceIP() {
		return loadbalancerInstanceIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadbalancerInstanceIP(String newLoadbalancerInstanceIP) {
		String oldLoadbalancerInstanceIP = loadbalancerInstanceIP;
		loadbalancerInstanceIP = newLoadbalancerInstanceIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_INSTANCE_IP, oldLoadbalancerInstanceIP, loadbalancerInstanceIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoadbalancerAddress() {
		return loadbalancerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadbalancerAddress(String newLoadbalancerAddress) {
		String oldLoadbalancerAddress = loadbalancerAddress;
		loadbalancerAddress = newLoadbalancerAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_ADDRESS, oldLoadbalancerAddress, loadbalancerAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addbackendserver() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Loadbalancer!addbackendserver()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removebackendserver() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Loadbalancer!removebackendserver()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_NAME:
				return getLoadbalancerName();
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_INSTANCE_IP:
				return getLoadbalancerInstanceIP();
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_ADDRESS:
				return getLoadbalancerAddress();
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
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_NAME:
				setLoadbalancerName((String)newValue);
				return;
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_INSTANCE_IP:
				setLoadbalancerInstanceIP((String)newValue);
				return;
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_ADDRESS:
				setLoadbalancerAddress((String)newValue);
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
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_NAME:
				setLoadbalancerName(LOADBALANCER_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_INSTANCE_IP:
				setLoadbalancerInstanceIP(LOADBALANCER_INSTANCE_IP_EDEFAULT);
				return;
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_ADDRESS:
				setLoadbalancerAddress(LOADBALANCER_ADDRESS_EDEFAULT);
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
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_NAME:
				return LOADBALANCER_NAME_EDEFAULT == null ? loadbalancerName != null : !LOADBALANCER_NAME_EDEFAULT.equals(loadbalancerName);
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_INSTANCE_IP:
				return LOADBALANCER_INSTANCE_IP_EDEFAULT == null ? loadbalancerInstanceIP != null : !LOADBALANCER_INSTANCE_IP_EDEFAULT.equals(loadbalancerInstanceIP);
			case HorizontalelasticityPackage.LOADBALANCER__LOADBALANCER_ADDRESS:
				return LOADBALANCER_ADDRESS_EDEFAULT == null ? loadbalancerAddress != null : !LOADBALANCER_ADDRESS_EDEFAULT.equals(loadbalancerAddress);
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
			case HorizontalelasticityPackage.LOADBALANCER___ADDBACKENDSERVER:
				addbackendserver();
				return null;
			case HorizontalelasticityPackage.LOADBALANCER___REMOVEBACKENDSERVER:
				removebackendserver();
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
		result.append(" (LoadbalancerName: ");
		result.append(loadbalancerName);
		result.append(", LoadbalancerInstanceIP: ");
		result.append(loadbalancerInstanceIP);
		result.append(", LoadbalancerAddress: ");
		result.append(loadbalancerAddress);
		result.append(')');
		return result.toString();
	}

} //LoadbalancerImpl
