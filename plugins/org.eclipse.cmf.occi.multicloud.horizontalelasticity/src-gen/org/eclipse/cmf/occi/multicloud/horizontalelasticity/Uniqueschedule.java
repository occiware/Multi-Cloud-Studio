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

import java.util.Date;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniqueschedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleStartDate <em>Unique Schedule Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleEndDate <em>Unique Schedule End Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getUniqueschedule()
 * @model
 * @generated
 */
public interface Uniqueschedule extends Scheduler, MixinBase {
	/**
	 * Returns the value of the '<em><b>Unique Schedule Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Schedule Start Date</em>' attribute.
	 * @see #setUniqueScheduleStartDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getUniqueschedule_UniqueScheduleStartDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Date"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Uniqueschedule!UniqueScheduleStartDate'"
	 * @generated
	 */
	Date getUniqueScheduleStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleStartDate <em>Unique Schedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Schedule Start Date</em>' attribute.
	 * @see #getUniqueScheduleStartDate()
	 * @generated
	 */
	void setUniqueScheduleStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Unique Schedule End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Schedule End Date</em>' attribute.
	 * @see #setUniqueScheduleEndDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getUniqueschedule_UniqueScheduleEndDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Date"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Uniqueschedule!UniqueScheduleEndDate'"
	 * @generated
	 */
	Date getUniqueScheduleEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Uniqueschedule#getUniqueScheduleEndDate <em>Unique Schedule End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Schedule End Date</em>' attribute.
	 * @see #getUniqueScheduleEndDate()
	 * @generated
	 */
	void setUniqueScheduleEndDate(Date value);

} // Uniqueschedule
