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
package org.eclipse.cmf.occi.multicloud.interoperability;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sshtransfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshPublicKey <em>Ssh Public Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshPrivateKeyPath <em>Ssh Private Key Path</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(interoperability::Filetransferoperations)'"
 * @generated
 */
public interface Sshtransfer extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Username()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Password()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Public Key</em>' attribute.
	 * @see #setSshPublicKey(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_SshPublicKey()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSshPublicKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshPublicKey <em>Ssh Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Public Key</em>' attribute.
	 * @see #getSshPublicKey()
	 * @generated
	 */
	void setSshPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Private Key Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Private Key Path</em>' attribute.
	 * @see #setSshPrivateKeyPath(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_SshPrivateKeyPath()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSshPrivateKeyPath();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshPrivateKeyPath <em>Ssh Private Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Private Key Path</em>' attribute.
	 * @see #getSshPrivateKeyPath()
	 * @generated
	 */
	void setSshPrivateKeyPath(String value);

} // Sshtransfer
