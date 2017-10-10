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
package org.eclipse.cmf.occi.multicloud.occimonitoring.impl;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zabbixinstance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixinstanceImpl#getZabbixinstancePort <em>Zabbixinstance Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixinstanceImpl#getZabbixinstanceIdentifier <em>Zabbixinstance Identifier</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixinstanceImpl#getZabbixinstanceIp <em>Zabbixinstance Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZabbixinstanceImpl extends ResourceImpl implements Zabbixinstance {
	/**
	 * The default value of the '{@link #getZabbixinstancePort() <em>Zabbixinstance Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixinstancePort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZABBIXINSTANCE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZabbixinstancePort() <em>Zabbixinstance Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixinstancePort()
	 * @generated
	 * @ordered
	 */
	protected Integer zabbixinstancePort = ZABBIXINSTANCE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getZabbixinstanceIdentifier() <em>Zabbixinstance Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixinstanceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZABBIXINSTANCE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZabbixinstanceIdentifier() <em>Zabbixinstance Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixinstanceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Integer zabbixinstanceIdentifier = ZABBIXINSTANCE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getZabbixinstanceIp() <em>Zabbixinstance Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixinstanceIp()
	 * @generated
	 * @ordered
	 */
	protected static final String ZABBIXINSTANCE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZabbixinstanceIp() <em>Zabbixinstance Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixinstanceIp()
	 * @generated
	 * @ordered
	 */
	protected String zabbixinstanceIp = ZABBIXINSTANCE_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZabbixinstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OccimonitoringPackage.Literals.ZABBIXINSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getZabbixinstancePort() {
		return zabbixinstancePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZabbixinstancePort(Integer newZabbixinstancePort) {
		Integer oldZabbixinstancePort = zabbixinstancePort;
		zabbixinstancePort = newZabbixinstancePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_PORT, oldZabbixinstancePort, zabbixinstancePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getZabbixinstanceIdentifier() {
		return zabbixinstanceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZabbixinstanceIdentifier(Integer newZabbixinstanceIdentifier) {
		Integer oldZabbixinstanceIdentifier = zabbixinstanceIdentifier;
		zabbixinstanceIdentifier = newZabbixinstanceIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IDENTIFIER, oldZabbixinstanceIdentifier, zabbixinstanceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZabbixinstanceIp() {
		return zabbixinstanceIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZabbixinstanceIp(String newZabbixinstanceIp) {
		String oldZabbixinstanceIp = zabbixinstanceIp;
		zabbixinstanceIp = newZabbixinstanceIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IP, oldZabbixinstanceIp, zabbixinstanceIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_PORT:
				return getZabbixinstancePort();
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IDENTIFIER:
				return getZabbixinstanceIdentifier();
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IP:
				return getZabbixinstanceIp();
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
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_PORT:
				setZabbixinstancePort((Integer)newValue);
				return;
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IDENTIFIER:
				setZabbixinstanceIdentifier((Integer)newValue);
				return;
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IP:
				setZabbixinstanceIp((String)newValue);
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
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_PORT:
				setZabbixinstancePort(ZABBIXINSTANCE_PORT_EDEFAULT);
				return;
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IDENTIFIER:
				setZabbixinstanceIdentifier(ZABBIXINSTANCE_IDENTIFIER_EDEFAULT);
				return;
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IP:
				setZabbixinstanceIp(ZABBIXINSTANCE_IP_EDEFAULT);
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
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_PORT:
				return ZABBIXINSTANCE_PORT_EDEFAULT == null ? zabbixinstancePort != null : !ZABBIXINSTANCE_PORT_EDEFAULT.equals(zabbixinstancePort);
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IDENTIFIER:
				return ZABBIXINSTANCE_IDENTIFIER_EDEFAULT == null ? zabbixinstanceIdentifier != null : !ZABBIXINSTANCE_IDENTIFIER_EDEFAULT.equals(zabbixinstanceIdentifier);
			case OccimonitoringPackage.ZABBIXINSTANCE__ZABBIXINSTANCE_IP:
				return ZABBIXINSTANCE_IP_EDEFAULT == null ? zabbixinstanceIp != null : !ZABBIXINSTANCE_IP_EDEFAULT.equals(zabbixinstanceIp);
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
		result.append(" (zabbixinstancePort: ");
		result.append(zabbixinstancePort);
		result.append(", zabbixinstanceIdentifier: ");
		result.append(zabbixinstanceIdentifier);
		result.append(", zabbixinstanceIp: ");
		result.append(zabbixinstanceIp);
		result.append(')');
		return result.toString();
	}

} //ZabbixinstanceImpl
