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
package org.eclipse.cmf.occi.multicloud.occimonitoring;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zabbixinstance</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance#getZabbixinstancePort <em>Zabbixinstance Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance#getZabbixinstanceIdentifier <em>Zabbixinstance Identifier</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance#getZabbixinstanceIp <em>Zabbixinstance Ip</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixinstance()
 * @model
 * @generated
 */
public interface Zabbixinstance extends Resource {
	/**
	 * Returns the value of the '<em><b>Zabbixinstance Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zabbixinstance Port</em>' attribute.
	 * @see #setZabbixinstancePort(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixinstance_ZabbixinstancePort()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Zabbixinstance!zabbixinstancePort'"
	 * @generated
	 */
	Integer getZabbixinstancePort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance#getZabbixinstancePort <em>Zabbixinstance Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zabbixinstance Port</em>' attribute.
	 * @see #getZabbixinstancePort()
	 * @generated
	 */
	void setZabbixinstancePort(Integer value);

	/**
	 * Returns the value of the '<em><b>Zabbixinstance Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zabbixinstance Identifier</em>' attribute.
	 * @see #setZabbixinstanceIdentifier(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixinstance_ZabbixinstanceIdentifier()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Zabbixinstance!zabbixinstanceIdentifier'"
	 * @generated
	 */
	Integer getZabbixinstanceIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance#getZabbixinstanceIdentifier <em>Zabbixinstance Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zabbixinstance Identifier</em>' attribute.
	 * @see #getZabbixinstanceIdentifier()
	 * @generated
	 */
	void setZabbixinstanceIdentifier(Integer value);

	/**
	 * Returns the value of the '<em><b>Zabbixinstance Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zabbixinstance Ip</em>' attribute.
	 * @see #setZabbixinstanceIp(String)
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixinstance_ZabbixinstanceIp()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Zabbixinstance!zabbixinstanceIp'"
	 * @generated
	 */
	String getZabbixinstanceIp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance#getZabbixinstanceIp <em>Zabbixinstance Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zabbixinstance Ip</em>' attribute.
	 * @see #getZabbixinstanceIp()
	 * @generated
	 */
	void setZabbixinstanceIp(String value);

} // Zabbixinstance
