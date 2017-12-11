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

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamicscalingpolicy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyCoolDuration <em>Dynamicscalingpolicy Cool Duration</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyIterationWaitTime <em>Dynamicscalingpolicy Iteration Wait Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicscalingpolicy()
 * @model
 * @generated
 */
public interface Dynamicscalingpolicy extends Scalingpolicy, MixinBase {
	/**
	 * Returns the value of the '<em><b>Dynamicscalingpolicy Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamicscalingpolicy Cool Duration</em>' attribute.
	 * @see #setDynamicscalingpolicyCoolDuration(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicscalingpolicy_DynamicscalingpolicyCoolDuration()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamicscalingpolicy!dynamicscalingpolicyCoolDuration'"
	 * @generated
	 */
	Integer getDynamicscalingpolicyCoolDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyCoolDuration <em>Dynamicscalingpolicy Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamicscalingpolicy Cool Duration</em>' attribute.
	 * @see #getDynamicscalingpolicyCoolDuration()
	 * @generated
	 */
	void setDynamicscalingpolicyCoolDuration(Integer value);

	/**
	 * Returns the value of the '<em><b>Dynamicscalingpolicy Iteration Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamicscalingpolicy Iteration Wait Time</em>' attribute.
	 * @see #setDynamicscalingpolicyIterationWaitTime(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicscalingpolicy_DynamicscalingpolicyIterationWaitTime()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamicscalingpolicy!dynamicscalingpolicyIterationWaitTime'"
	 * @generated
	 */
	Integer getDynamicscalingpolicyIterationWaitTime();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicscalingpolicy#getDynamicscalingpolicyIterationWaitTime <em>Dynamicscalingpolicy Iteration Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamicscalingpolicy Iteration Wait Time</em>' attribute.
	 * @see #getDynamicscalingpolicyIterationWaitTime()
	 * @generated
	 */
	void setDynamicscalingpolicyIterationWaitTime(Integer value);

} // Dynamicscalingpolicy
