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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontalgroup</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupName <em>Horizontal Group Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupGroupSize <em>Horizontal Group Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMaximum <em>Horizontal Group Maximum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMinimum <em>Horizontal Group Minimum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupTemplateName <em>Horizontal Group Template Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupLoadBalancer <em>Horizontal Group Load Balancer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getHorizontalgroup()
 * @model
 * @generated
 */
public interface Horizontalgroup extends Resource {
	/**
	 * Returns the value of the '<em><b>Horizontal Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Group Name</em>' attribute.
	 * @see #setHorizontalGroupName(String)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getHorizontalgroup_HorizontalGroupName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getHorizontalGroupName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupName <em>Horizontal Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Group Name</em>' attribute.
	 * @see #getHorizontalGroupName()
	 * @generated
	 */
	void setHorizontalGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Horizontal Group Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Group Group Size</em>' attribute.
	 * @see #setHorizontalGroupGroupSize(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getHorizontalgroup_HorizontalGroupGroupSize()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getHorizontalGroupGroupSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupGroupSize <em>Horizontal Group Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Group Group Size</em>' attribute.
	 * @see #getHorizontalGroupGroupSize()
	 * @generated
	 */
	void setHorizontalGroupGroupSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Horizontal Group Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Group Maximum</em>' attribute.
	 * @see #setHorizontalGroupMaximum(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getHorizontalgroup_HorizontalGroupMaximum()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getHorizontalGroupMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMaximum <em>Horizontal Group Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Group Maximum</em>' attribute.
	 * @see #getHorizontalGroupMaximum()
	 * @generated
	 */
	void setHorizontalGroupMaximum(Integer value);

	/**
	 * Returns the value of the '<em><b>Horizontal Group Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Group Minimum</em>' attribute.
	 * @see #setHorizontalGroupMinimum(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getHorizontalgroup_HorizontalGroupMinimum()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getHorizontalGroupMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupMinimum <em>Horizontal Group Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Group Minimum</em>' attribute.
	 * @see #getHorizontalGroupMinimum()
	 * @generated
	 */
	void setHorizontalGroupMinimum(Integer value);

	/**
	 * Returns the value of the '<em><b>Horizontal Group Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Group Template Name</em>' attribute.
	 * @see #setHorizontalGroupTemplateName(String)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getHorizontalgroup_HorizontalGroupTemplateName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getHorizontalGroupTemplateName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupTemplateName <em>Horizontal Group Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Group Template Name</em>' attribute.
	 * @see #getHorizontalGroupTemplateName()
	 * @generated
	 */
	void setHorizontalGroupTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Horizontal Group Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Group Load Balancer</em>' attribute.
	 * @see #setHorizontalGroupLoadBalancer(String)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getHorizontalgroup_HorizontalGroupLoadBalancer()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getHorizontalGroupLoadBalancer();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup#getHorizontalGroupLoadBalancer <em>Horizontal Group Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Group Load Balancer</em>' attribute.
	 * @see #getHorizontalGroupLoadBalancer()
	 * @generated
	 */
	void setHorizontalGroupLoadBalancer(String value);

} // Horizontalgroup
