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
 * A representation of the model object '<em><b>Dynamicadjustmentscalingpolicy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyMetric <em>Dynamicadjustmentscalingpolicy Metric</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#isDynamicadjustmentscalingpolicyDisableScaleIn <em>Dynamicadjustmentscalingpolicy Disable Scale In</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyTarget <em>Dynamicadjustmentscalingpolicy Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getDynamicadjustmentscalingpolicy()
 * @model
 * @generated
 */
public interface Dynamicadjustmentscalingpolicy extends Dynamicscalingpolicy, MixinBase {
	/**
	 * Returns the value of the '<em><b>Dynamicadjustmentscalingpolicy Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamicadjustmentscalingpolicy Metric</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking
	 * @see #setDynamicadjustmentscalingpolicyMetric(MetricTargetTracking)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyMetric()
	 * @model
	 * @generated
	 */
	MetricTargetTracking getDynamicadjustmentscalingpolicyMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyMetric <em>Dynamicadjustmentscalingpolicy Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamicadjustmentscalingpolicy Metric</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.MetricTargetTracking
	 * @see #getDynamicadjustmentscalingpolicyMetric()
	 * @generated
	 */
	void setDynamicadjustmentscalingpolicyMetric(MetricTargetTracking value);

	/**
	 * Returns the value of the '<em><b>Dynamicadjustmentscalingpolicy Disable Scale In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamicadjustmentscalingpolicy Disable Scale In</em>' attribute.
	 * @see #setDynamicadjustmentscalingpolicyDisableScaleIn(boolean)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyDisableScaleIn()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean"
	 * @generated
	 */
	boolean isDynamicadjustmentscalingpolicyDisableScaleIn();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#isDynamicadjustmentscalingpolicyDisableScaleIn <em>Dynamicadjustmentscalingpolicy Disable Scale In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamicadjustmentscalingpolicy Disable Scale In</em>' attribute.
	 * @see #isDynamicadjustmentscalingpolicyDisableScaleIn()
	 * @generated
	 */
	void setDynamicadjustmentscalingpolicyDisableScaleIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Dynamicadjustmentscalingpolicy Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamicadjustmentscalingpolicy Target</em>' attribute.
	 * @see #setDynamicadjustmentscalingpolicyTarget(Float)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getDynamicadjustmentscalingpolicy_DynamicadjustmentscalingpolicyTarget()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Float"
	 * @generated
	 */
	Float getDynamicadjustmentscalingpolicyTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Dynamicadjustmentscalingpolicy#getDynamicadjustmentscalingpolicyTarget <em>Dynamicadjustmentscalingpolicy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamicadjustmentscalingpolicy Target</em>' attribute.
	 * @see #getDynamicadjustmentscalingpolicyTarget()
	 * @generated
	 */
	void setDynamicadjustmentscalingpolicyTarget(Float value);

} // Dynamicadjustmentscalingpolicy
