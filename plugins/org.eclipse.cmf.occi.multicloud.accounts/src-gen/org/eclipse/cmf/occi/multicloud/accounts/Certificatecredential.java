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
 * A representation of the model object '<em><b>Certificatecredential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential#getPublicCertificateContent <em>Public Certificate Content</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential#getPrivateCertifcateName <em>Private Certifcate Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#getCertificatecredential()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(accounts::Cloudaccount)'"
 * @generated
 */
public interface Certificatecredential extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Public Certificate Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Certificate Content</em>' attribute.
	 * @see #setPublicCertificateContent(String)
	 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#getCertificatecredential_PublicCertificateContent()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPublicCertificateContent();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential#getPublicCertificateContent <em>Public Certificate Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Certificate Content</em>' attribute.
	 * @see #getPublicCertificateContent()
	 * @generated
	 */
	void setPublicCertificateContent(String value);

	/**
	 * Returns the value of the '<em><b>Private Certifcate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Certifcate Name</em>' attribute.
	 * @see #setPrivateCertifcateName(String)
	 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#getCertificatecredential_PrivateCertifcateName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPrivateCertifcateName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential#getPrivateCertifcateName <em>Private Certifcate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Certifcate Name</em>' attribute.
	 * @see #getPrivateCertifcateName()
	 * @generated
	 */
	void setPrivateCertifcateName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void generate();

} // Certificatecredential
