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
package org.eclipse.cmf.occi.multicloud.aws.ec2;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keypair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getFingerPrint <em>Finger Print</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getEncodedPublicKey <em>Encoded Public Key</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getKeypair()
 * @model
 * @generated
 */
public interface Keypair extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getKeypair_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warning, this must be used only after creating a keypair. If privateKey is found, update this attribute to null or other values than the original.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getKeypair_PrivateKey()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

	/**
	 * Returns the value of the '<em><b>Finger Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finger Print</em>' attribute.
	 * @see #setFingerPrint(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getKeypair_FingerPrint()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getFingerPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getFingerPrint <em>Finger Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finger Print</em>' attribute.
	 * @see #getFingerPrint()
	 * @generated
	 */
	void setFingerPrint(String value);

	/**
	 * Returns the value of the '<em><b>Encoded Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Public key to import for use with action method importKeypair() only, format is base64 encoded and DER
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoded Public Key</em>' attribute.
	 * @see #setEncodedPublicKey(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getKeypair_EncodedPublicKey()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getEncodedPublicKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair#getEncodedPublicKey <em>Encoded Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoded Public Key</em>' attribute.
	 * @see #getEncodedPublicKey()
	 * @generated
	 */
	void setEncodedPublicKey(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void importkeypair();

} // Keypair
