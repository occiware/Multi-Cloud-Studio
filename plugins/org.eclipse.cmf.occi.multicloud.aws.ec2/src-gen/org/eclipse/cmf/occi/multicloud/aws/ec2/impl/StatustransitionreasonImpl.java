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

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

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
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let
		 *     severity : Integer[1] = 'Statustransitionreason::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Instanceec2)
		 *       in
		 *         'Statustransitionreason::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Ec2Tables.STR_Statustransitionreason_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Ec2Tables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ec2_c_c_Instanceec2_0 = idResolver.getClass(Ec2Tables.CLSSid_Instanceec2, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_ec2_c_c_Instanceec2_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Ec2Tables.STR_Statustransitionreason_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Ec2Tables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Ec2Package.STATUSTRANSITIONREASON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
