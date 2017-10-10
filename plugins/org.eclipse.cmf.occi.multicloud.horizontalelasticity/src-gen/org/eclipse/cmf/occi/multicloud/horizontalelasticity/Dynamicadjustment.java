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
 * A representation of the model object '<em><b>Dynamicadjustment</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentName <em>Dynamic Adjustment Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentMetric <em>Dynamic Adjustment Metric</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentCoolDuration <em>Dynamic Adjustment Cool Duration</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#isDynamicAdjustmentDisableScaleIn <em>Dynamic Adjustment Disable Scale In</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentTarget <em>Dynamic Adjustment Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicadjustment()
 * @model
 * @generated
 */
public interface Dynamicadjustment extends Dynamic {
	/**
	 * Returns the value of the '<em><b>Dynamic Adjustment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Adjustment Name</em>' attribute.
	 * @see #setDynamicAdjustmentName(String)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicadjustment_DynamicAdjustmentName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamicadjustment!dynamicAdjustmentName'"
	 * @generated
	 */
	String getDynamicAdjustmentName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentName <em>Dynamic Adjustment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Adjustment Name</em>' attribute.
	 * @see #getDynamicAdjustmentName()
	 * @generated
	 */
	void setDynamicAdjustmentName(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Adjustment Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Adjustment Metric</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking
	 * @see #setDynamicAdjustmentMetric(MetricTargetTracking)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicadjustment_DynamicAdjustmentMetric()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamicadjustment!dynamicAdjustmentMetric'"
	 * @generated
	 */
	MetricTargetTracking getDynamicAdjustmentMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentMetric <em>Dynamic Adjustment Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Adjustment Metric</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking
	 * @see #getDynamicAdjustmentMetric()
	 * @generated
	 */
	void setDynamicAdjustmentMetric(MetricTargetTracking value);

	/**
	 * Returns the value of the '<em><b>Dynamic Adjustment Cool Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Adjustment Cool Duration</em>' attribute.
	 * @see #setDynamicAdjustmentCoolDuration(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicadjustment_DynamicAdjustmentCoolDuration()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamicadjustment!dynamicAdjustmentCoolDuration'"
	 * @generated
	 */
	Integer getDynamicAdjustmentCoolDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentCoolDuration <em>Dynamic Adjustment Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Adjustment Cool Duration</em>' attribute.
	 * @see #getDynamicAdjustmentCoolDuration()
	 * @generated
	 */
	void setDynamicAdjustmentCoolDuration(Integer value);

	/**
	 * Returns the value of the '<em><b>Dynamic Adjustment Disable Scale In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Adjustment Disable Scale In</em>' attribute.
	 * @see #setDynamicAdjustmentDisableScaleIn(boolean)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicadjustment_DynamicAdjustmentDisableScaleIn()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamicadjustment!dynamicAdjustmentDisableScaleIn'"
	 * @generated
	 */
	boolean isDynamicAdjustmentDisableScaleIn();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#isDynamicAdjustmentDisableScaleIn <em>Dynamic Adjustment Disable Scale In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Adjustment Disable Scale In</em>' attribute.
	 * @see #isDynamicAdjustmentDisableScaleIn()
	 * @generated
	 */
	void setDynamicAdjustmentDisableScaleIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Dynamic Adjustment Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Adjustment Target</em>' attribute.
	 * @see #setDynamicAdjustmentTarget(Float)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamicadjustment_DynamicAdjustmentTarget()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Float"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamicadjustment!dynamicAdjustmentTarget'"
	 * @generated
	 */
	Float getDynamicAdjustmentTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment#getDynamicAdjustmentTarget <em>Dynamic Adjustment Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Adjustment Target</em>' attribute.
	 * @see #getDynamicAdjustmentTarget()
	 * @generated
	 */
	void setDynamicAdjustmentTarget(Float value);

} // Dynamicadjustment
