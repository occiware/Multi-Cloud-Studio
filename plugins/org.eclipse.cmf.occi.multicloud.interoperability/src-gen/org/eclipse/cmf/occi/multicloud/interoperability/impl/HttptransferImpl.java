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
package org.eclipse.cmf.occi.multicloud.interoperability.impl;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.interoperability.HttpMode;
import org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer;
import org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Httptransfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl#getTargetUrl <em>Target Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl#getHttpMode <em>Http Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl#getHttpPort <em>Http Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttptransferImpl extends MixinBaseImpl implements Httptransfer {
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
	 * The default value of the '{@link #getSourceUrl() <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceUrl() <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected String sourceUrl = SOURCE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetUrl() <em>Target Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetUrl() <em>Target Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUrl()
	 * @generated
	 * @ordered
	 */
	protected String targetUrl = TARGET_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpMode() <em>Http Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMode()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMode HTTP_MODE_EDEFAULT = HttpMode.HTTPS;

	/**
	 * The cached value of the '{@link #getHttpMode() <em>Http Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMode()
	 * @generated
	 * @ordered
	 */
	protected HttpMode httpMode = HTTP_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpPort() <em>Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HTTP_PORT_EDEFAULT = new Integer(443);

	/**
	 * The cached value of the '{@link #getHttpPort() <em>Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpPort()
	 * @generated
	 * @ordered
	 */
	protected Integer httpPort = HTTP_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttptransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteroperabilityPackage.Literals.HTTPTRANSFER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.HTTPTRANSFER__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.HTTPTRANSFER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUrl(String newSourceUrl) {
		String oldSourceUrl = sourceUrl;
		sourceUrl = newSourceUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.HTTPTRANSFER__SOURCE_URL, oldSourceUrl, sourceUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetUrl() {
		return targetUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUrl(String newTargetUrl) {
		String oldTargetUrl = targetUrl;
		targetUrl = newTargetUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.HTTPTRANSFER__TARGET_URL, oldTargetUrl, targetUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMode getHttpMode() {
		return httpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpMode(HttpMode newHttpMode) {
		HttpMode oldHttpMode = httpMode;
		httpMode = newHttpMode == null ? HTTP_MODE_EDEFAULT : newHttpMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.HTTPTRANSFER__HTTP_MODE, oldHttpMode, httpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHttpPort() {
		return httpPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpPort(Integer newHttpPort) {
		Integer oldHttpPort = httpPort;
		httpPort = newHttpPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.HTTPTRANSFER__HTTP_PORT, oldHttpPort, httpPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteroperabilityPackage.HTTPTRANSFER__USERNAME:
				return getUsername();
			case InteroperabilityPackage.HTTPTRANSFER__PASSWORD:
				return getPassword();
			case InteroperabilityPackage.HTTPTRANSFER__SOURCE_URL:
				return getSourceUrl();
			case InteroperabilityPackage.HTTPTRANSFER__TARGET_URL:
				return getTargetUrl();
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_MODE:
				return getHttpMode();
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_PORT:
				return getHttpPort();
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
			case InteroperabilityPackage.HTTPTRANSFER__USERNAME:
				setUsername((String)newValue);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__PASSWORD:
				setPassword((String)newValue);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__SOURCE_URL:
				setSourceUrl((String)newValue);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__TARGET_URL:
				setTargetUrl((String)newValue);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_MODE:
				setHttpMode((HttpMode)newValue);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_PORT:
				setHttpPort((Integer)newValue);
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
			case InteroperabilityPackage.HTTPTRANSFER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__SOURCE_URL:
				setSourceUrl(SOURCE_URL_EDEFAULT);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__TARGET_URL:
				setTargetUrl(TARGET_URL_EDEFAULT);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_MODE:
				setHttpMode(HTTP_MODE_EDEFAULT);
				return;
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_PORT:
				setHttpPort(HTTP_PORT_EDEFAULT);
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
			case InteroperabilityPackage.HTTPTRANSFER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case InteroperabilityPackage.HTTPTRANSFER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case InteroperabilityPackage.HTTPTRANSFER__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? sourceUrl != null : !SOURCE_URL_EDEFAULT.equals(sourceUrl);
			case InteroperabilityPackage.HTTPTRANSFER__TARGET_URL:
				return TARGET_URL_EDEFAULT == null ? targetUrl != null : !TARGET_URL_EDEFAULT.equals(targetUrl);
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_MODE:
				return httpMode != HTTP_MODE_EDEFAULT;
			case InteroperabilityPackage.HTTPTRANSFER__HTTP_PORT:
				return HTTP_PORT_EDEFAULT == null ? httpPort != null : !HTTP_PORT_EDEFAULT.equals(httpPort);
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
		result.append(", sourceUrl: ");
		result.append(sourceUrl);
		result.append(", targetUrl: ");
		result.append(targetUrl);
		result.append(", httpMode: ");
		result.append(httpMode);
		result.append(", httpPort: ");
		result.append(httpPort);
		result.append(')');
		return result.toString();
	}

} //HttptransferImpl
