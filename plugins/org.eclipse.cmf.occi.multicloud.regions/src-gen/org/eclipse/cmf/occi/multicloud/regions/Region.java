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
package org.eclipse.cmf.occi.multicloud.regions;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionId <em>Region Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionDescription <em>Region Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends Resource {

	/**
	 * Returns the value of the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Id</em>' attribute.
	 * @see #setRegionId(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getRegion_RegionId()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getRegionId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionId <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Id</em>' attribute.
	 * @see #getRegionId()
	 * @generated
	 */
	void setRegionId(String value);

	/**
	 * Returns the value of the '<em><b>Region Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Description</em>' attribute.
	 * @see #setRegionDescription(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getRegion_RegionDescription()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRegionDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionDescription <em>Region Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Description</em>' attribute.
	 * @see #getRegionDescription()
	 * @generated
	 */
	void setRegionDescription(String value);

} // Region
