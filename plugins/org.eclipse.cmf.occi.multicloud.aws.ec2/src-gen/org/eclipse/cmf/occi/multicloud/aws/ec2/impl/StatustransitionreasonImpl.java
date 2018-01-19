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
package org.eclipse.cmf.occi.multicloud.aws.ec2.impl;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statustransitionreason</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.StatustransitionreasonImpl#getStateTransitionCode <em>State Transition Code</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.StatustransitionreasonImpl#getStateTransitionMessage <em>State Transition Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatustransitionreasonImpl extends MixinBaseImpl implements Statustransitionreason {
	/**
	 * The default value of the '{@link #getStateTransitionCode() <em>State Transition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_TRANSITION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateTransitionCode() <em>State Transition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionCode()
	 * @generated
	 * @ordered
	 */
	protected String stateTransitionCode = STATE_TRANSITION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateTransitionMessage() <em>State Transition Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_TRANSITION_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateTransitionMessage() <em>State Transition Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionMessage()
	 * @generated
	 * @ordered
	 */
	protected String stateTransitionMessage = STATE_TRANSITION_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatustransitionreasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getStatustransitionreason();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateTransitionCode() {
		return stateTransitionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTransitionCode(String newStateTransitionCode) {
		String oldStateTransitionCode = stateTransitionCode;
		stateTransitionCode = newStateTransitionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_CODE, oldStateTransitionCode, stateTransitionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateTransitionMessage() {
		return stateTransitionMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTransitionMessage(String newStateTransitionMessage) {
		String oldStateTransitionMessage = stateTransitionMessage;
		stateTransitionMessage = newStateTransitionMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE, oldStateTransitionMessage, stateTransitionMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_CODE:
				return getStateTransitionCode();
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE:
				return getStateTransitionMessage();
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
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_CODE:
				setStateTransitionCode((String)newValue);
				return;
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE:
				setStateTransitionMessage((String)newValue);
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
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_CODE:
				setStateTransitionCode(STATE_TRANSITION_CODE_EDEFAULT);
				return;
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE:
				setStateTransitionMessage(STATE_TRANSITION_MESSAGE_EDEFAULT);
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
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_CODE:
				return STATE_TRANSITION_CODE_EDEFAULT == null ? stateTransitionCode != null : !STATE_TRANSITION_CODE_EDEFAULT.equals(stateTransitionCode);
			case Ec2Package.STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE:
				return STATE_TRANSITION_MESSAGE_EDEFAULT == null ? stateTransitionMessage != null : !STATE_TRANSITION_MESSAGE_EDEFAULT.equals(stateTransitionMessage);
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
		result.append(" (stateTransitionCode: ");
		result.append(stateTransitionCode);
		result.append(", stateTransitionMessage: ");
		result.append(stateTransitionMessage);
		result.append(')');
		return result.toString();
	}

} //StatustransitionreasonImpl
