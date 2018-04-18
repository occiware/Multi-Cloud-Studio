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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actiontrigger</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAction <em>Actiontrigger Action</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerActionType <em>Actiontrigger Action Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAmount <em>Actiontrigger Amount</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getActiontrigger()
 * @model
 * @generated
 */
public interface Actiontrigger extends Resource {
	/**
	 * Returns the value of the '<em><b>Actiontrigger Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.modemo.ActionOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actiontrigger Action</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionOperation
	 * @see #setActiontriggerAction(ActionOperation)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getActiontrigger_ActiontriggerAction()
	 * @model
	 * @generated
	 */
	ActionOperation getActiontriggerAction();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAction <em>Actiontrigger Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontrigger Action</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionOperation
	 * @see #getActiontriggerAction()
	 * @generated
	 */
	void setActiontriggerAction(ActionOperation value);

	/**
	 * Returns the value of the '<em><b>Actiontrigger Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.modemo.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actiontrigger Action Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionType
	 * @see #setActiontriggerActionType(ActionType)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getActiontrigger_ActiontriggerActionType()
	 * @model
	 * @generated
	 */
	ActionType getActiontriggerActionType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerActionType <em>Actiontrigger Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontrigger Action Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ActionType
	 * @see #getActiontriggerActionType()
	 * @generated
	 */
	void setActiontriggerActionType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Actiontrigger Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actiontrigger Amount</em>' attribute.
	 * @see #setActiontriggerAmount(Float)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getActiontrigger_ActiontriggerAmount()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Float"
	 * @generated
	 */
	Float getActiontriggerAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Actiontrigger#getActiontriggerAmount <em>Actiontrigger Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontrigger Amount</em>' attribute.
	 * @see #getActiontriggerAmount()
	 * @generated
	 */
	void setActiontriggerAmount(Float value);

} // Actiontrigger
