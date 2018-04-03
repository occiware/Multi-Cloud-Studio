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
package org.eclipse.cmf.occi.multicloud.vmware;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.infrastructure.User_data;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssh user data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getOcciComputeUserdataFile <em>Occi Compute Userdata File</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getSsh_user_data()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(vmware::Instancevmware)'"
 * @generated
 */
public interface Ssh_user_data extends User_data, MixinBase {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getSsh_user_data_Password()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Userdata File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Userdata File</em>' attribute.
	 * @see #setOcciComputeUserdataFile(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getSsh_user_data_OcciComputeUserdataFile()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getOcciComputeUserdataFile();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getOcciComputeUserdataFile <em>Occi Compute Userdata File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Userdata File</em>' attribute.
	 * @see #getOcciComputeUserdataFile()
	 * @generated
	 */
	void setOcciComputeUserdataFile(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getSsh_user_data_User()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // Ssh_user_data
