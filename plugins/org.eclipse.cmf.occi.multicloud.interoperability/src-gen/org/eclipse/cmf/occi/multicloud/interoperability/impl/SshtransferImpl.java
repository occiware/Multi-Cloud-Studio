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

import org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage;
import org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sshtransfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getSshPublicKey <em>Ssh Public Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getSshPrivateKeyPath <em>Ssh Private Key Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SshtransferImpl extends MixinBaseImpl implements Sshtransfer {
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
	 * The default value of the '{@link #getSshPublicKey() <em>Ssh Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshPublicKey() <em>Ssh Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String sshPublicKey = SSH_PUBLIC_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshPrivateKeyPath() <em>Ssh Private Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPrivateKeyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_PRIVATE_KEY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshPrivateKeyPath() <em>Ssh Private Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshPrivateKeyPath()
	 * @generated
	 * @ordered
	 */
	protected String sshPrivateKeyPath = SSH_PRIVATE_KEY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SshtransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteroperabilityPackage.Literals.SSHTRANSFER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshPublicKey() {
		return sshPublicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshPublicKey(String newSshPublicKey) {
		String oldSshPublicKey = sshPublicKey;
		sshPublicKey = newSshPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__SSH_PUBLIC_KEY, oldSshPublicKey, sshPublicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshPrivateKeyPath() {
		return sshPrivateKeyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshPrivateKeyPath(String newSshPrivateKeyPath) {
		String oldSshPrivateKeyPath = sshPrivateKeyPath;
		sshPrivateKeyPath = newSshPrivateKeyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__SSH_PRIVATE_KEY_PATH, oldSshPrivateKeyPath, sshPrivateKeyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteroperabilityPackage.SSHTRANSFER__USERNAME:
				return getUsername();
			case InteroperabilityPackage.SSHTRANSFER__PASSWORD:
				return getPassword();
			case InteroperabilityPackage.SSHTRANSFER__SSH_PUBLIC_KEY:
				return getSshPublicKey();
			case InteroperabilityPackage.SSHTRANSFER__SSH_PRIVATE_KEY_PATH:
				return getSshPrivateKeyPath();
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
			case InteroperabilityPackage.SSHTRANSFER__USERNAME:
				setUsername((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__PASSWORD:
				setPassword((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SSH_PUBLIC_KEY:
				setSshPublicKey((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SSH_PRIVATE_KEY_PATH:
				setSshPrivateKeyPath((String)newValue);
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
			case InteroperabilityPackage.SSHTRANSFER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SSH_PUBLIC_KEY:
				setSshPublicKey(SSH_PUBLIC_KEY_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SSH_PRIVATE_KEY_PATH:
				setSshPrivateKeyPath(SSH_PRIVATE_KEY_PATH_EDEFAULT);
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
			case InteroperabilityPackage.SSHTRANSFER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case InteroperabilityPackage.SSHTRANSFER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case InteroperabilityPackage.SSHTRANSFER__SSH_PUBLIC_KEY:
				return SSH_PUBLIC_KEY_EDEFAULT == null ? sshPublicKey != null : !SSH_PUBLIC_KEY_EDEFAULT.equals(sshPublicKey);
			case InteroperabilityPackage.SSHTRANSFER__SSH_PRIVATE_KEY_PATH:
				return SSH_PRIVATE_KEY_PATH_EDEFAULT == null ? sshPrivateKeyPath != null : !SSH_PRIVATE_KEY_PATH_EDEFAULT.equals(sshPrivateKeyPath);
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
		result.append(", sshPublicKey: ");
		result.append(sshPublicKey);
		result.append(", sshPrivateKeyPath: ");
		result.append(sshPrivateKeyPath);
		result.append(')');
		return result.toString();
	}

} //SshtransferImpl
