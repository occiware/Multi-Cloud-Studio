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
package org.eclipse.cmf.occi.multicloud.modemo;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loadbalancer</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerName <em>Loadbalancer Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerInstanceIP <em>Loadbalancer Instance IP</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerAddress <em>Loadbalancer Address</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getLoadbalancer()
 * @model
 * @generated
 */
public interface Loadbalancer extends Resource {
	/**
	 * Returns the value of the '<em><b>Loadbalancer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loadbalancer Name</em>' attribute.
	 * @see #setLoadbalancerName(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getLoadbalancer_LoadbalancerName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getLoadbalancerName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerName <em>Loadbalancer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadbalancer Name</em>' attribute.
	 * @see #getLoadbalancerName()
	 * @generated
	 */
	void setLoadbalancerName(String value);

	/**
	 * Returns the value of the '<em><b>Loadbalancer Instance IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loadbalancer Instance IP</em>' attribute.
	 * @see #setLoadbalancerInstanceIP(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getLoadbalancer_LoadbalancerInstanceIP()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getLoadbalancerInstanceIP();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerInstanceIP <em>Loadbalancer Instance IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadbalancer Instance IP</em>' attribute.
	 * @see #getLoadbalancerInstanceIP()
	 * @generated
	 */
	void setLoadbalancerInstanceIP(String value);

	/**
	 * Returns the value of the '<em><b>Loadbalancer Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loadbalancer Address</em>' attribute.
	 * @see #setLoadbalancerAddress(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getLoadbalancer_LoadbalancerAddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getLoadbalancerAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Loadbalancer#getLoadbalancerAddress <em>Loadbalancer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadbalancer Address</em>' attribute.
	 * @see #getLoadbalancerAddress()
	 * @generated
	 */
	void setLoadbalancerAddress(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void addbackendserver();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void removebackendserver();

} // Loadbalancer
