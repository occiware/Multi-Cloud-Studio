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

import java.util.Date;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniqueschedulingpolicy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyStartDate <em>Uniqueschedulingpolicy Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyEndDate <em>Uniqueschedulingpolicy End Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getUniqueschedulingpolicy()
 * @model
 * @generated
 */
public interface Uniqueschedulingpolicy extends Schedulingpolicy, MixinBase {
	/**
	 * Returns the value of the '<em><b>Uniqueschedulingpolicy Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uniqueschedulingpolicy Start Date</em>' attribute.
	 * @see #setUniqueschedulingpolicyStartDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getUniqueschedulingpolicy_UniqueschedulingpolicyStartDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Date"
	 * @generated
	 */
	Date getUniqueschedulingpolicyStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyStartDate <em>Uniqueschedulingpolicy Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniqueschedulingpolicy Start Date</em>' attribute.
	 * @see #getUniqueschedulingpolicyStartDate()
	 * @generated
	 */
	void setUniqueschedulingpolicyStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Uniqueschedulingpolicy End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uniqueschedulingpolicy End Date</em>' attribute.
	 * @see #setUniqueschedulingpolicyEndDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getUniqueschedulingpolicy_UniqueschedulingpolicyEndDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Date"
	 * @generated
	 */
	Date getUniqueschedulingpolicyEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Uniqueschedulingpolicy#getUniqueschedulingpolicyEndDate <em>Uniqueschedulingpolicy End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniqueschedulingpolicy End Date</em>' attribute.
	 * @see #getUniqueschedulingpolicyEndDate()
	 * @generated
	 */
	void setUniqueschedulingpolicyEndDate(Date value);

} // Uniqueschedulingpolicy
