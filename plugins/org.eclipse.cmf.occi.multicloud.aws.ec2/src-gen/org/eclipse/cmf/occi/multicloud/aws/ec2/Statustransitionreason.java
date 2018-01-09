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
package org.eclipse.cmf.occi.multicloud.aws.ec2;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statustransitionreason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionCode <em>State Transition Code</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionMessage <em>State Transition Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getStatustransitionreason()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(ec2::Instanceec2)'"
 * @generated
 */
public interface Statustransitionreason extends MixinBase {
	/**
	 * Returns the value of the '<em><b>State Transition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Transition Code</em>' attribute.
	 * @see #setStateTransitionCode(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getStatustransitionreason_StateTransitionCode()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getStateTransitionCode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionCode <em>State Transition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transition Code</em>' attribute.
	 * @see #getStateTransitionCode()
	 * @generated
	 */
	void setStateTransitionCode(String value);

	/**
	 * Returns the value of the '<em><b>State Transition Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Transition Message</em>' attribute.
	 * @see #setStateTransitionMessage(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getStatustransitionreason_StateTransitionMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getStateTransitionMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason#getStateTransitionMessage <em>State Transition Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transition Message</em>' attribute.
	 * @see #getStateTransitionMessage()
	 * @generated
	 */
	void setStateTransitionMessage(String value);

} // Statustransitionreason
