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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionOperation;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ActionType;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Actiontrigger;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actiontrigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl#getActiontriggerAction <em>Actiontrigger Action</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl#getActiontriggerActionType <em>Actiontrigger Action Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ActiontriggerImpl#getActiontriggerAmount <em>Actiontrigger Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiontriggerImpl extends ResourceImpl implements Actiontrigger {
	/**
	 * The default value of the '{@link #getActiontriggerAction() <em>Actiontrigger Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiontriggerAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionOperation ACTIONTRIGGER_ACTION_EDEFAULT = ActionOperation.ADD;

	/**
	 * The cached value of the '{@link #getActiontriggerAction() <em>Actiontrigger Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiontriggerAction()
	 * @generated
	 * @ordered
	 */
	protected ActionOperation actiontriggerAction = ACTIONTRIGGER_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiontriggerActionType() <em>Actiontrigger Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiontriggerActionType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTIONTRIGGER_ACTION_TYPE_EDEFAULT = ActionType.INSTANCE_COUNT;

	/**
	 * The cached value of the '{@link #getActiontriggerActionType() <em>Actiontrigger Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiontriggerActionType()
	 * @generated
	 * @ordered
	 */
	protected ActionType actiontriggerActionType = ACTIONTRIGGER_ACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiontriggerAmount() <em>Actiontrigger Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiontriggerAmount()
	 * @generated
	 * @ordered
	 */
	protected static final Float ACTIONTRIGGER_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiontriggerAmount() <em>Actiontrigger Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiontriggerAmount()
	 * @generated
	 * @ordered
	 */
	protected Float actiontriggerAmount = ACTIONTRIGGER_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiontriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.ACTIONTRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionOperation getActiontriggerAction() {
		return actiontriggerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiontriggerAction(ActionOperation newActiontriggerAction) {
		ActionOperation oldActiontriggerAction = actiontriggerAction;
		actiontriggerAction = newActiontriggerAction == null ? ACTIONTRIGGER_ACTION_EDEFAULT : newActiontriggerAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION, oldActiontriggerAction, actiontriggerAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getActiontriggerActionType() {
		return actiontriggerActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiontriggerActionType(ActionType newActiontriggerActionType) {
		ActionType oldActiontriggerActionType = actiontriggerActionType;
		actiontriggerActionType = newActiontriggerActionType == null ? ACTIONTRIGGER_ACTION_TYPE_EDEFAULT : newActiontriggerActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE, oldActiontriggerActionType, actiontriggerActionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getActiontriggerAmount() {
		return actiontriggerAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiontriggerAmount(Float newActiontriggerAmount) {
		Float oldActiontriggerAmount = actiontriggerAmount;
		actiontriggerAmount = newActiontriggerAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT, oldActiontriggerAmount, actiontriggerAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION:
				return getActiontriggerAction();
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE:
				return getActiontriggerActionType();
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT:
				return getActiontriggerAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION:
				setActiontriggerAction((ActionOperation)newValue);
				return;
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE:
				setActiontriggerActionType((ActionType)newValue);
				return;
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT:
				setActiontriggerAmount((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION:
				setActiontriggerAction(ACTIONTRIGGER_ACTION_EDEFAULT);
				return;
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE:
				setActiontriggerActionType(ACTIONTRIGGER_ACTION_TYPE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT:
				setActiontriggerAmount(ACTIONTRIGGER_AMOUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION:
				return actiontriggerAction != ACTIONTRIGGER_ACTION_EDEFAULT;
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE:
				return actiontriggerActionType != ACTIONTRIGGER_ACTION_TYPE_EDEFAULT;
			case HorizontalelasticityPackage.ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT:
				return ACTIONTRIGGER_AMOUNT_EDEFAULT == null ? actiontriggerAmount != null : !ACTIONTRIGGER_AMOUNT_EDEFAULT.equals(actiontriggerAmount);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (actiontriggerAction: ");
		result.append(actiontriggerAction);
		result.append(", actiontriggerActionType: ");
		result.append(actiontriggerActionType);
		result.append(", actiontriggerAmount: ");
		result.append(actiontriggerAmount);
		result.append(')');
		return result.toString();
	}

} //ActiontriggerImpl
