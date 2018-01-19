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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keypair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.KeypairImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.KeypairImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.KeypairImpl#getFingerPrint <em>Finger Print</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.KeypairImpl#getEncodedPublicKey <em>Encoded Public Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeypairImpl extends ResourceImpl implements Keypair {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFingerPrint() <em>Finger Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerPrint()
	 * @generated
	 * @ordered
	 */
	protected static final String FINGER_PRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFingerPrint() <em>Finger Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerPrint()
	 * @generated
	 * @ordered
	 */
	protected String fingerPrint = FINGER_PRINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodedPublicKey() <em>Encoded Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODED_PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodedPublicKey() <em>Encoded Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String encodedPublicKey = ENCODED_PUBLIC_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeypairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getKeypair();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.KEYPAIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.KEYPAIR__PRIVATE_KEY, oldPrivateKey, privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFingerPrint() {
		return fingerPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFingerPrint(String newFingerPrint) {
		String oldFingerPrint = fingerPrint;
		fingerPrint = newFingerPrint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.KEYPAIR__FINGER_PRINT, oldFingerPrint, fingerPrint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncodedPublicKey() {
		return encodedPublicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodedPublicKey(String newEncodedPublicKey) {
		String oldEncodedPublicKey = encodedPublicKey;
		encodedPublicKey = newEncodedPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.KEYPAIR__ENCODED_PUBLIC_KEY, oldEncodedPublicKey, encodedPublicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void importkeypair() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.KEYPAIR__NAME:
				return getName();
			case Ec2Package.KEYPAIR__PRIVATE_KEY:
				return getPrivateKey();
			case Ec2Package.KEYPAIR__FINGER_PRINT:
				return getFingerPrint();
			case Ec2Package.KEYPAIR__ENCODED_PUBLIC_KEY:
				return getEncodedPublicKey();
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
			case Ec2Package.KEYPAIR__NAME:
				setName((String)newValue);
				return;
			case Ec2Package.KEYPAIR__PRIVATE_KEY:
				setPrivateKey((String)newValue);
				return;
			case Ec2Package.KEYPAIR__FINGER_PRINT:
				setFingerPrint((String)newValue);
				return;
			case Ec2Package.KEYPAIR__ENCODED_PUBLIC_KEY:
				setEncodedPublicKey((String)newValue);
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
			case Ec2Package.KEYPAIR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ec2Package.KEYPAIR__PRIVATE_KEY:
				setPrivateKey(PRIVATE_KEY_EDEFAULT);
				return;
			case Ec2Package.KEYPAIR__FINGER_PRINT:
				setFingerPrint(FINGER_PRINT_EDEFAULT);
				return;
			case Ec2Package.KEYPAIR__ENCODED_PUBLIC_KEY:
				setEncodedPublicKey(ENCODED_PUBLIC_KEY_EDEFAULT);
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
			case Ec2Package.KEYPAIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ec2Package.KEYPAIR__PRIVATE_KEY:
				return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
			case Ec2Package.KEYPAIR__FINGER_PRINT:
				return FINGER_PRINT_EDEFAULT == null ? fingerPrint != null : !FINGER_PRINT_EDEFAULT.equals(fingerPrint);
			case Ec2Package.KEYPAIR__ENCODED_PUBLIC_KEY:
				return ENCODED_PUBLIC_KEY_EDEFAULT == null ? encodedPublicKey != null : !ENCODED_PUBLIC_KEY_EDEFAULT.equals(encodedPublicKey);
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
			case Ec2Package.KEYPAIR___IMPORTKEYPAIR:
				importkeypair();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", privateKey: ");
		result.append(privateKey);
		result.append(", fingerPrint: ");
		result.append(fingerPrint);
		result.append(", encodedPublicKey: ");
		result.append(encodedPublicKey);
		result.append(')');
		return result.toString();
	}

} //KeypairImpl
