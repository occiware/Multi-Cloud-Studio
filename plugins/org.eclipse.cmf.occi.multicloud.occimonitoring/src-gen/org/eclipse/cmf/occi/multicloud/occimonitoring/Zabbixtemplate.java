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
 * A representation of the model object '<em><b>Zabbixtemplate</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate#getZabbixtemplateIdentifier <em>Zabbixtemplate Identifier</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate#getZabbixtemplateHostgid <em>Zabbixtemplate Hostgid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate#getZabbixtemplateHostsids <em>Zabbixtemplate Hostsids</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixtemplate()
 * @model
 * @generated
 */
public interface Zabbixtemplate extends Resource {
	/**
	 * Returns the value of the '<em><b>Zabbixtemplate Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zabbixtemplate Identifier</em>' attribute.
	 * @see #setZabbixtemplateIdentifier(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixtemplate_ZabbixtemplateIdentifier()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Zabbixtemplate!zabbixtemplateIdentifier'"
	 * @generated
	 */
	Integer getZabbixtemplateIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate#getZabbixtemplateIdentifier <em>Zabbixtemplate Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zabbixtemplate Identifier</em>' attribute.
	 * @see #getZabbixtemplateIdentifier()
	 * @generated
	 */
	void setZabbixtemplateIdentifier(Integer value);

	/**
	 * Returns the value of the '<em><b>Zabbixtemplate Hostgid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zabbixtemplate Hostgid</em>' attribute.
	 * @see #setZabbixtemplateHostgid(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixtemplate_ZabbixtemplateHostgid()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Zabbixtemplate!zabbixtemplateHostgid'"
	 * @generated
	 */
	Integer getZabbixtemplateHostgid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate#getZabbixtemplateHostgid <em>Zabbixtemplate Hostgid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zabbixtemplate Hostgid</em>' attribute.
	 * @see #getZabbixtemplateHostgid()
	 * @generated
	 */
	void setZabbixtemplateHostgid(Integer value);

	/**
	 * Returns the value of the '<em><b>Zabbixtemplate Hostsids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zabbixtemplate Hostsids</em>' attribute.
	 * @see #setZabbixtemplateHostsids(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getZabbixtemplate_ZabbixtemplateHostsids()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Zabbixtemplate!zabbixtemplateHostsids'"
	 * @generated
	 */
	Integer getZabbixtemplateHostsids();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate#getZabbixtemplateHostsids <em>Zabbixtemplate Hostsids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zabbixtemplate Hostsids</em>' attribute.
	 * @see #getZabbixtemplateHostsids()
	 * @generated
	 */
	void setZabbixtemplateHostsids(Integer value);

} // Zabbixtemplate
