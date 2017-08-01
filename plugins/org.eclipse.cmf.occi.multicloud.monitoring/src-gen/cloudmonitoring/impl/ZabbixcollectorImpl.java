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
package cloudmonitoring.impl;

import cloudmonitoring.CloudmonitoringPackage;
import cloudmonitoring.Zabbixcollector;

import org.eclipse.cmf.occi.monitoring.impl.CollectorImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zabbixcollector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.impl.ZabbixcollectorImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link cloudmonitoring.impl.ZabbixcollectorImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link cloudmonitoring.impl.ZabbixcollectorImpl#getHttpApiAddress <em>Http Api Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZabbixcollectorImpl extends CollectorImpl implements Zabbixcollector {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpApiAddress() <em>Http Api Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpApiAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_API_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpApiAddress() <em>Http Api Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpApiAddress()
	 * @generated
	 * @ordered
	 */
	protected String httpApiAddress = HTTP_API_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZabbixcollectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudmonitoringPackage.Literals.ZABBIXCOLLECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.ZABBIXCOLLECTOR__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.ZABBIXCOLLECTOR__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpApiAddress() {
		return httpApiAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpApiAddress(String newHttpApiAddress) {
		String oldHttpApiAddress = httpApiAddress;
		httpApiAddress = newHttpApiAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.ZABBIXCOLLECTOR__HTTP_API_ADDRESS, oldHttpApiAddress, httpApiAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__USERNAME:
				return getUsername();
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__PASSWORD:
				return getPassword();
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__HTTP_API_ADDRESS:
				return getHttpApiAddress();
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
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__USERNAME:
				setUsername((String)newValue);
				return;
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__PASSWORD:
				setPassword((String)newValue);
				return;
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__HTTP_API_ADDRESS:
				setHttpApiAddress((String)newValue);
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
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__HTTP_API_ADDRESS:
				setHttpApiAddress(HTTP_API_ADDRESS_EDEFAULT);
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
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CloudmonitoringPackage.ZABBIXCOLLECTOR__HTTP_API_ADDRESS:
				return HTTP_API_ADDRESS_EDEFAULT == null ? httpApiAddress != null : !HTTP_API_ADDRESS_EDEFAULT.equals(httpApiAddress);
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", httpApiAddress: ");
		result.append(httpApiAddress);
		result.append(')');
		return result.toString();
	}

} //ZabbixcollectorImpl
