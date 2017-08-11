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
package org.eclipse.cmf.occi.multicloud.elasticzabbix;

import org.eclipse.cmf.occi.monitoring.Collector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zabbixcollector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zabbix collector for computes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceIp <em>Instance Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#getZabbixcollector()
 * @model
 * @generated
 */
public interface Zabbixcollector extends Collector {
	/**
	 * Returns the value of the '<em><b>Instance Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Ip</em>' attribute.
	 * @see #setInstanceIp(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#getZabbixcollector_InstanceIp()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticzabbix/ecore!Zabbixcollector!instanceIp'"
	 * @generated
	 */
	String getInstanceIp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceIp <em>Instance Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Ip</em>' attribute.
	 * @see #getInstanceIp()
	 * @generated
	 */
	void setInstanceIp(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#getZabbixcollector_InstanceName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticzabbix/ecore!Zabbixcollector!instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

} // Zabbixcollector
