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
 * A representation of the model object '<em><b>Stepdynamic</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicName <em>Step Dynamic Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicCoolDuration <em>Step Dynamic Cool Duration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getStepdynamic()
 * @model
 * @generated
 */
public interface Stepdynamic extends Dynamicpolicy {
	/**
	 * Returns the value of the '<em><b>Step Dynamic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Dynamic Name</em>' attribute.
	 * @see #setStepDynamicName(String)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getStepdynamic_StepDynamicName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Stepdynamic!stepDynamicName'"
	 * @generated
	 */
	String getStepDynamicName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicName <em>Step Dynamic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Dynamic Name</em>' attribute.
	 * @see #getStepDynamicName()
	 * @generated
	 */
	void setStepDynamicName(String value);

	/**
	 * Returns the value of the '<em><b>Step Dynamic Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Dynamic Cool Duration</em>' attribute.
	 * @see #setStepDynamicCoolDuration(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getStepdynamic_StepDynamicCoolDuration()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Stepdynamic!stepDynamicCoolDuration'"
	 * @generated
	 */
	Integer getStepDynamicCoolDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Stepdynamic#getStepDynamicCoolDuration <em>Step Dynamic Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Dynamic Cool Duration</em>' attribute.
	 * @see #getStepDynamicCoolDuration()
	 * @generated
	 */
	void setStepDynamicCoolDuration(Integer value);

} // Stepdynamic
