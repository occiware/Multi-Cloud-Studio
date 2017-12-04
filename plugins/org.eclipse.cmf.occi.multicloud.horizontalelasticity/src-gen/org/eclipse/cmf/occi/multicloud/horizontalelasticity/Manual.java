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
 * A representation of the model object '<em><b>Manual</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualDesiredSize <em>Manual Desired Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getManual()
 * @model
 * @generated
 */
public interface Manual extends Elasticitycontroller {
	/**
	 * Returns the value of the '<em><b>Manual Desired Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manual Desired Size</em>' attribute.
	 * @see #setManualDesiredSize(Float)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getManual_ManualDesiredSize()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Float"
	 * @generated
	 */
	Float getManualDesiredSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual#getManualDesiredSize <em>Manual Desired Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Desired Size</em>' attribute.
	 * @see #getManualDesiredSize()
	 * @generated
	 */
	void setManualDesiredSize(Float value);

} // Manual
