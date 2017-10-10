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
 * A representation of the model object '<em><b>Hostgroup</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroup#getHostgroupIdentifier <em>Hostgroup Identifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getHostgroup()
 * @model
 * @generated
 */
public interface Hostgroup extends Resource {
	/**
	 * Returns the value of the '<em><b>Hostgroup Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hostgroup Identifier</em>' attribute.
	 * @see #setHostgroupIdentifier(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage#getHostgroup_HostgroupIdentifier()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore!Hostgroup!hostgroupIdentifier'"
	 * @generated
	 */
	Integer getHostgroupIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroup#getHostgroupIdentifier <em>Hostgroup Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostgroup Identifier</em>' attribute.
	 * @see #getHostgroupIdentifier()
	 * @generated
	 */
	void setHostgroupIdentifier(Integer value);

} // Hostgroup
