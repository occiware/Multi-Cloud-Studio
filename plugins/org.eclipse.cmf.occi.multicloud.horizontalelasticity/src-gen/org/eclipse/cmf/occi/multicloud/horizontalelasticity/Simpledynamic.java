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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simpledynamic</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicName <em>Simple Dynamic Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicCoolDuration <em>Simple Dynamic Cool Duration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getSimpledynamic()
 * @model
 * @generated
 */
public interface Simpledynamic extends Dynamic {
	/**
	 * Returns the value of the '<em><b>Simple Dynamic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Dynamic Name</em>' attribute.
	 * @see #setSimpleDynamicName(String)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getSimpledynamic_SimpleDynamicName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Simpledynamic!simpleDynamicName'"
	 * @generated
	 */
	String getSimpleDynamicName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicName <em>Simple Dynamic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Dynamic Name</em>' attribute.
	 * @see #getSimpleDynamicName()
	 * @generated
	 */
	void setSimpleDynamicName(String value);

	/**
	 * Returns the value of the '<em><b>Simple Dynamic Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Dynamic Cool Duration</em>' attribute.
	 * @see #setSimpleDynamicCoolDuration(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getSimpledynamic_SimpleDynamicCoolDuration()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Simpledynamic!simpleDynamicCoolDuration'"
	 * @generated
	 */
	Integer getSimpleDynamicCoolDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Simpledynamic#getSimpleDynamicCoolDuration <em>Simple Dynamic Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Dynamic Cool Duration</em>' attribute.
	 * @see #getSimpleDynamicCoolDuration()
	 * @generated
	 */
	void setSimpleDynamicCoolDuration(Integer value);

} // Simpledynamic
