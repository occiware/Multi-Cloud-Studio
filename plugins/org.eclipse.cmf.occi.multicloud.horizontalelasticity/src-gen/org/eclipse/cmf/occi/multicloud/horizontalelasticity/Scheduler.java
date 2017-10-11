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
import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerStartDate <em>Scheduler Start Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerEndDate <em>Scheduler End Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Scheduler Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduler Start Date</em>' attribute.
	 * @see #setSchedulerStartDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getScheduler_SchedulerStartDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Date"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Scheduler!schedulerStartDate'"
	 * @generated
	 */
	Date getSchedulerStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerStartDate <em>Scheduler Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler Start Date</em>' attribute.
	 * @see #getSchedulerStartDate()
	 * @generated
	 */
	void setSchedulerStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Scheduler End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduler End Date</em>' attribute.
	 * @see #setSchedulerEndDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getScheduler_SchedulerEndDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Date"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Scheduler!schedulerEndDate'"
	 * @generated
	 */
	Date getSchedulerEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Scheduler#getSchedulerEndDate <em>Scheduler End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler End Date</em>' attribute.
	 * @see #getSchedulerEndDate()
	 * @generated
	 */
	void setSchedulerEndDate(Date value);

} // Scheduler
