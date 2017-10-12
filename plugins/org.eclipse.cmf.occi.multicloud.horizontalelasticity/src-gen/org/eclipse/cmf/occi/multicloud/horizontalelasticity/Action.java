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
 * A representation of the model object '<em><b>Action</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionType <em>Action Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Resource {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @see #setAction(ActionOperation)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getAction_Action()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Action!action'"
	 * @generated
	 */
	ActionOperation getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionOperation value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
	 * @see #setActionType(ActionType)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getAction_ActionType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Action!actionType'"
	 * @generated
	 */
	ActionType getActionType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(Float)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getAction_Amount()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Float"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Action!amount'"
	 * @generated
	 */
	Float getAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Action#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Float value);

} // Action