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
package org.eclipse.cmf.occi.multicloud.accounts.impl;

import org.eclipse.cmf.occi.multicloud.accounts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountsFactoryImpl extends EFactoryImpl implements AccountsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountsFactory init() {
		try {
			AccountsFactory theAccountsFactory = (AccountsFactory)EPackage.Registry.INSTANCE.getEFactory(AccountsPackage.eNS_URI);
			if (theAccountsFactory != null) {
				return theAccountsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccountsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AccountsPackage.CLOUDACCOUNT: return createCloudaccount();
			case AccountsPackage.CLOUDACCOUNTLINK: return createCloudaccountlink();
			case AccountsPackage.BASICCREDENTIAL: return createBasiccredential();
			case AccountsPackage.CERTIFICATECREDENTIAL: return createCertificatecredential();
			case AccountsPackage.KEYPAIRCREDENTIAL: return createKeypaircredential();
			case AccountsPackage.CLOUDCREDENTIAL: return createCloudcredential();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudaccount createCloudaccount() {
		CloudaccountImpl cloudaccount = new CloudaccountImpl();
		return cloudaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudaccountlink createCloudaccountlink() {
		CloudaccountlinkImpl cloudaccountlink = new CloudaccountlinkImpl();
		return cloudaccountlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basiccredential createBasiccredential() {
		BasiccredentialImpl basiccredential = new BasiccredentialImpl();
		return basiccredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificatecredential createCertificatecredential() {
		CertificatecredentialImpl certificatecredential = new CertificatecredentialImpl();
		return certificatecredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keypaircredential createKeypaircredential() {
		KeypaircredentialImpl keypaircredential = new KeypaircredentialImpl();
		return keypaircredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudcredential createCloudcredential() {
		CloudcredentialImpl cloudcredential = new CloudcredentialImpl();
		return cloudcredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsPackage getAccountsPackage() {
		return (AccountsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccountsPackage getPackage() {
		return AccountsPackage.eINSTANCE;
	}

} //AccountsFactoryImpl
