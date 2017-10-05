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
 * A representation of the model object '<em><b>Recurringschedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleRecurrence <em>Recurringschedule Recurrence</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getRecurringschedule()
 * @model
 * @generated
 */
public interface Recurringschedule extends MixinBase, Scheduler {
	/**
	 * Returns the value of the '<em><b>Recurringschedule Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurringschedule Recurrence</em>' containment reference.
	 * @see #setRecurringscheduleRecurrence(ArrayofRecurrenceStep)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getRecurringschedule_RecurringscheduleRecurrence()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Recurringschedule!RecurringscheduleRecurrence'"
	 * @generated
	 */
	ArrayofRecurrenceStep getRecurringscheduleRecurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Recurringschedule#getRecurringscheduleRecurrence <em>Recurringschedule Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurringschedule Recurrence</em>' containment reference.
	 * @see #getRecurringscheduleRecurrence()
	 * @generated
	 */
	void setRecurringscheduleRecurrence(ArrayofRecurrenceStep value);

} // Recurringschedule
