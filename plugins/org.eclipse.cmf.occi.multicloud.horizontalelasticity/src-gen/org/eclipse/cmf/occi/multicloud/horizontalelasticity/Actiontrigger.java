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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAction <em>Actiontrigger Action</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerActionType <em>Actiontrigger Action Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAmount <em>Actiontrigger Amount</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getActiontrigger()
 * @model
 * @generated
 */
public interface Actiontrigger extends Resource {
	/**
	 * Returns the value of the '<em><b>Actiontrigger Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actiontrigger Action</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @see #setActiontriggerAction(ActionOperation)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getActiontrigger_ActiontriggerAction()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Actiontrigger!actiontriggerAction'"
	 * @generated
	 */
	ActionOperation getActiontriggerAction();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAction <em>Actiontrigger Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontrigger Action</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation
	 * @see #getActiontriggerAction()
	 * @generated
	 */
	void setActiontriggerAction(ActionOperation value);

	/**
	 * Returns the value of the '<em><b>Actiontrigger Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actiontrigger Action Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
	 * @see #setActiontriggerActionType(ActionType)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getActiontrigger_ActiontriggerActionType()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Actiontrigger!actiontriggerActionType'"
	 * @generated
	 */
	ActionType getActiontriggerActionType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerActionType <em>Actiontrigger Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontrigger Action Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType
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
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getActiontrigger_ActiontriggerAmount()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.horizontalelasticity.Float"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Actiontrigger!actiontriggerAmount'"
	 * @generated
	 */
	Float getActiontriggerAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger#getActiontriggerAmount <em>Actiontrigger Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontrigger Amount</em>' attribute.
	 * @see #getActiontriggerAmount()
	 * @generated
	 */
	void setActiontriggerAmount(Float value);

} // Actiontrigger
