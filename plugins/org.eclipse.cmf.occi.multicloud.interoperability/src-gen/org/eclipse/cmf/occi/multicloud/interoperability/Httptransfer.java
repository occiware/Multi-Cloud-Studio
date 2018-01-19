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
 * A representation of the model object '<em><b>Httptransfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getTargetUrl <em>Target Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpMode <em>Http Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpPort <em>Http Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getHttptransfer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(interoperability::Filetransferoperations)'"
 * @generated
 */
public interface Httptransfer extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getHttptransfer_Username()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getUsername <em>Username</em>}' attribute.
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
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getHttptransfer_Password()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Source Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Url</em>' attribute.
	 * @see #setSourceUrl(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getHttptransfer_SourceUrl()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSourceUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getSourceUrl <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Url</em>' attribute.
	 * @see #getSourceUrl()
	 * @generated
	 */
	void setSourceUrl(String value);

	/**
	 * Returns the value of the '<em><b>Target Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Url</em>' attribute.
	 * @see #setTargetUrl(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getHttptransfer_TargetUrl()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getTargetUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getTargetUrl <em>Target Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Url</em>' attribute.
	 * @see #getTargetUrl()
	 * @generated
	 */
	void setTargetUrl(String value);

	/**
	 * Returns the value of the '<em><b>Http Mode</b></em>' attribute.
	 * The default value is <code>"https"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.interoperability.HttpMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.HttpMode
	 * @see #setHttpMode(HttpMode)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getHttptransfer_HttpMode()
	 * @model default="https"
	 * @generated
	 */
	HttpMode getHttpMode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpMode <em>Http Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.HttpMode
	 * @see #getHttpMode()
	 * @generated
	 */
	void setHttpMode(HttpMode value);

	/**
	 * Returns the value of the '<em><b>Http Port</b></em>' attribute.
	 * The default value is <code>"443"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Port</em>' attribute.
	 * @see #setHttpPort(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getHttptransfer_HttpPort()
	 * @model default="443" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getHttpPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpPort <em>Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Port</em>' attribute.
	 * @see #getHttpPort()
	 * @generated
	 */
	void setHttpPort(Integer value);

} // Httptransfer
