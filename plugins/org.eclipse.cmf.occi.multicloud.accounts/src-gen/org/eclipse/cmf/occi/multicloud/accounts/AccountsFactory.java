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
package org.eclipse.cmf.occi.multicloud.accounts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage
 * @generated
 */
public interface AccountsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountsFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.accounts.impl.AccountsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloudaccount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudaccount</em>'.
	 * @generated
	 */
	Cloudaccount createCloudaccount();

	/**
	 * Returns a new object of class '<em>Cloudaccountlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudaccountlink</em>'.
	 * @generated
	 */
	Cloudaccountlink createCloudaccountlink();

	/**
	 * Returns a new object of class '<em>Basiccredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basiccredential</em>'.
	 * @generated
	 */
	Basiccredential createBasiccredential();

	/**
	 * Returns a new object of class '<em>Certificatecredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificatecredential</em>'.
	 * @generated
	 */
	Certificatecredential createCertificatecredential();

	/**
	 * Returns a new object of class '<em>Keypaircredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keypaircredential</em>'.
	 * @generated
	 */
	Keypaircredential createKeypaircredential();

	/**
	 * Returns a new object of class '<em>Cloudcredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudcredential</em>'.
	 * @generated
	 */
	Cloudcredential createCloudcredential();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccountsPackage getAccountsPackage();

} //AccountsFactory
