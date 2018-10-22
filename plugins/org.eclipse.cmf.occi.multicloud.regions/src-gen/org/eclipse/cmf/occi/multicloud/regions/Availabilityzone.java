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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availabilityzone</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneName <em>Zone Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneMessage <em>Zone Message</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getAvailabilityzone()
 * @model
 * @generated
 */
public interface Availabilityzone extends Resource {
	/**
	 * Returns the value of the '<em><b>Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Name</em>' attribute.
	 * @see #setZoneName(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getAvailabilityzone_ZoneName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/locations/ecore!Availabilityzone!zoneName'"
	 * @generated
	 */
	String getZoneName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneName <em>Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Name</em>' attribute.
	 * @see #getZoneName()
	 * @generated
	 */
	void setZoneName(String value);

	/**
	 * Returns the value of the '<em><b>Zone Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Message</em>' attribute.
	 * @see #setZoneMessage(String)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getAvailabilityzone_ZoneMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/locations/ecore!Availabilityzone!zoneMessage'"
	 * @generated
	 */
	String getZoneMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#getZoneMessage <em>Zone Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Message</em>' attribute.
	 * @see #getZoneMessage()
	 * @generated
	 */
	void setZoneMessage(String value);

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(boolean)
	 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage#getAvailabilityzone_Available()
	 * @model default="true" dataType="org.eclipse.cmf.occi.core.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/locations/ecore!Availabilityzone!available'"
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.regions.Availabilityzone#isAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setAvailable(boolean value);

} // Availabilityzone
