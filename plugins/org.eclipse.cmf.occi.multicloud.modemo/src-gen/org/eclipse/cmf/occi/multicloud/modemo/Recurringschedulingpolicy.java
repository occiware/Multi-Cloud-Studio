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
 * A representation of the model object '<em><b>Recurringschedulingpolicy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyRecurrence <em>Recurringschedulingpolicy Recurrence</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyStartDate <em>Recurringschedulingpolicy Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyEndDate <em>Recurringschedulingpolicy End Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyInterval <em>Recurringschedulingpolicy Interval</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRecurringschedulingpolicy()
 * @model
 * @generated
 */
public interface Recurringschedulingpolicy extends Schedulingpolicy, MixinBase {
	/**
	 * Returns the value of the '<em><b>Recurringschedulingpolicy Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurringschedulingpolicy Recurrence</em>' containment reference.
	 * @see #setRecurringschedulingpolicyRecurrence(ArrofRecStep)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRecurringschedulingpolicy_RecurringschedulingpolicyRecurrence()
	 * @model containment="true"
	 * @generated
	 */
	ArrofRecStep getRecurringschedulingpolicyRecurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyRecurrence <em>Recurringschedulingpolicy Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurringschedulingpolicy Recurrence</em>' containment reference.
	 * @see #getRecurringschedulingpolicyRecurrence()
	 * @generated
	 */
	void setRecurringschedulingpolicyRecurrence(ArrofRecStep value);

	/**
	 * Returns the value of the '<em><b>Recurringschedulingpolicy Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurringschedulingpolicy Start Date</em>' attribute.
	 * @see #setRecurringschedulingpolicyStartDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRecurringschedulingpolicy_RecurringschedulingpolicyStartDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Date"
	 * @generated
	 */
	Date getRecurringschedulingpolicyStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyStartDate <em>Recurringschedulingpolicy Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurringschedulingpolicy Start Date</em>' attribute.
	 * @see #getRecurringschedulingpolicyStartDate()
	 * @generated
	 */
	void setRecurringschedulingpolicyStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Recurringschedulingpolicy End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurringschedulingpolicy End Date</em>' attribute.
	 * @see #setRecurringschedulingpolicyEndDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRecurringschedulingpolicy_RecurringschedulingpolicyEndDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Date"
	 * @generated
	 */
	Date getRecurringschedulingpolicyEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyEndDate <em>Recurringschedulingpolicy End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurringschedulingpolicy End Date</em>' attribute.
	 * @see #getRecurringschedulingpolicyEndDate()
	 * @generated
	 */
	void setRecurringschedulingpolicyEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Recurringschedulingpolicy Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurringschedulingpolicy Interval</em>' attribute.
	 * @see #setRecurringschedulingpolicyInterval(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRecurringschedulingpolicy_RecurringschedulingpolicyInterval()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getRecurringschedulingpolicyInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Recurringschedulingpolicy#getRecurringschedulingpolicyInterval <em>Recurringschedulingpolicy Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurringschedulingpolicy Interval</em>' attribute.
	 * @see #getRecurringschedulingpolicyInterval()
	 * @generated
	 */
	void setRecurringschedulingpolicyInterval(Integer value);

} // Recurringschedulingpolicy
