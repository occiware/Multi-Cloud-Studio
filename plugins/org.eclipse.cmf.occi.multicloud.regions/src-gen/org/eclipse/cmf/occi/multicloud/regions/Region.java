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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.Region#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionName <em>Region Name</em>}</li>
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
	 * The region provider identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Id</em>' attribute.
	 * @see #setRegionId(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getRegion_RegionId()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/locations/ecore!Region!regionId'"
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
	 * The region description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Description</em>' attribute.
	 * @see #setRegionDescription(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getRegion_RegionDescription()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/locations/ecore!Region!regionDescription'"
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

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getRegion_Endpoint()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/locations/ecore!Region!endpoint'"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Region Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The region friendly human name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Name</em>' attribute.
	 * @see #setRegionName(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getRegion_RegionName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/locations/ecore!Region!regionName'"
	 * @generated
	 */
	String getRegionName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.regions.Region#getRegionName <em>Region Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Name</em>' attribute.
	 * @see #getRegionName()
	 * @generated
	 */
	void setRegionName(String value);

} // Region
