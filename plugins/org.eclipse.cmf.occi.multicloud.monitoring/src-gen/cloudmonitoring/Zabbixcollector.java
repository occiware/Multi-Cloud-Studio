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
package cloudmonitoring;

import org.eclipse.cmf.occi.monitoring.Collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zabbixcollector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Collector from zabbix monitoring software using zabbix api
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.Zabbixcollector#getUsername <em>Username</em>}</li>
 *   <li>{@link cloudmonitoring.Zabbixcollector#getPassword <em>Password</em>}</li>
 *   <li>{@link cloudmonitoring.Zabbixcollector#getHttpApiAddress <em>Http Api Address</em>}</li>
 * </ul>
 *
 * @see cloudmonitoring.CloudmonitoringPackage#getZabbixcollector()
 * @model
 * @generated
 */
public interface Zabbixcollector extends Collector {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see cloudmonitoring.CloudmonitoringPackage#getZabbixcollector_Username()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Zabbixcollector!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Zabbixcollector#getUsername <em>Username</em>}' attribute.
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
	 * @see cloudmonitoring.CloudmonitoringPackage#getZabbixcollector_Password()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Zabbixcollector!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Zabbixcollector#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Http Api Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Http api address like : http://ipaddress/zabbix/api_jsonrpc.php
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Api Address</em>' attribute.
	 * @see #setHttpApiAddress(String)
	 * @see cloudmonitoring.CloudmonitoringPackage#getZabbixcollector_HttpApiAddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Zabbixcollector!httpApiAddress'"
	 * @generated
	 */
	String getHttpApiAddress();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Zabbixcollector#getHttpApiAddress <em>Http Api Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Api Address</em>' attribute.
	 * @see #getHttpApiAddress()
	 * @generated
	 */
	void setHttpApiAddress(String value);

} // Zabbixcollector
