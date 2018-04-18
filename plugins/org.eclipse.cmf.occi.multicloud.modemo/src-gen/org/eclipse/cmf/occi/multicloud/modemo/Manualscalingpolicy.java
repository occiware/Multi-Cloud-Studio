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
package org.eclipse.cmf.occi.multicloud.modemo;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manualscalingpolicy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyDesiredSize <em>Manualscalingpolicy Desired Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyComputeUnit <em>Manualscalingpolicy Compute Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getManualscalingpolicy()
 * @model
 * @generated
 */
public interface Manualscalingpolicy extends Scalingpolicy, MixinBase {
	/**
	 * Returns the value of the '<em><b>Manualscalingpolicy Desired Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manualscalingpolicy Desired Size</em>' attribute.
	 * @see #setManualscalingpolicyDesiredSize(Float)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getManualscalingpolicy_ManualscalingpolicyDesiredSize()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Float"
	 * @generated
	 */
	Float getManualscalingpolicyDesiredSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyDesiredSize <em>Manualscalingpolicy Desired Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manualscalingpolicy Desired Size</em>' attribute.
	 * @see #getManualscalingpolicyDesiredSize()
	 * @generated
	 */
	void setManualscalingpolicyDesiredSize(Float value);

	/**
	 * Returns the value of the '<em><b>Manualscalingpolicy Compute Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manualscalingpolicy Compute Unit</em>' attribute.
	 * @see #setManualscalingpolicyComputeUnit(String)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getManualscalingpolicy_ManualscalingpolicyComputeUnit()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getManualscalingpolicyComputeUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Manualscalingpolicy#getManualscalingpolicyComputeUnit <em>Manualscalingpolicy Compute Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manualscalingpolicy Compute Unit</em>' attribute.
	 * @see #getManualscalingpolicyComputeUnit()
	 * @generated
	 */
	void setManualscalingpolicyComputeUnit(String value);

} // Manualscalingpolicy
