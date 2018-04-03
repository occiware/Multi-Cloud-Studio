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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloudcredential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential#getAccessKey <em>Access Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#getCloudcredential()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(accounts::Cloudaccount)'"
 * @generated
 */
public interface Cloudcredential extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Key</em>' attribute.
	 * @see #setAccessKey(String)
	 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#getCloudcredential_AccessKey()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getAccessKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential#getAccessKey <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Key</em>' attribute.
	 * @see #getAccessKey()
	 * @generated
	 */
	void setAccessKey(String value);

	/**
	 * Returns the value of the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secret Key</em>' attribute.
	 * @see #setSecretKey(String)
	 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#getCloudcredential_SecretKey()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSecretKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential#getSecretKey <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key</em>' attribute.
	 * @see #getSecretKey()
	 * @generated
	 */
	void setSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#getCloudcredential_Url()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // Cloudcredential
