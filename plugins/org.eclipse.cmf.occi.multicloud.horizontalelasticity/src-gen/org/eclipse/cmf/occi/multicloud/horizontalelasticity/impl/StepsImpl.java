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

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Steps;

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
 * An implementation of the model object '<em><b>Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepsImpl#getStepsLowerStepBound <em>Steps Lower Step Bound</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.StepsImpl#getStepsUpperStepBound <em>Steps Upper Step Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepsImpl extends MixinBaseImpl implements Steps {
	/**
	 * The default value of the '{@link #getStepsLowerStepBound() <em>Steps Lower Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsLowerStepBound()
	 * @generated
	 * @ordered
	 */
	protected static final Float STEPS_LOWER_STEP_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepsLowerStepBound() <em>Steps Lower Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsLowerStepBound()
	 * @generated
	 * @ordered
	 */
	protected Float stepsLowerStepBound = STEPS_LOWER_STEP_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepsUpperStepBound() <em>Steps Upper Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsUpperStepBound()
	 * @generated
	 * @ordered
	 */
	protected static final Float STEPS_UPPER_STEP_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepsUpperStepBound() <em>Steps Upper Step Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepsUpperStepBound()
	 * @generated
	 * @ordered
	 */
	protected Float stepsUpperStepBound = STEPS_UPPER_STEP_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.STEPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getStepsLowerStepBound() {
		return stepsLowerStepBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepsLowerStepBound(Float newStepsLowerStepBound) {
		Float oldStepsLowerStepBound = stepsLowerStepBound;
		stepsLowerStepBound = newStepsLowerStepBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEPS__STEPS_LOWER_STEP_BOUND, oldStepsLowerStepBound, stepsLowerStepBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getStepsUpperStepBound() {
		return stepsUpperStepBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepsUpperStepBound(Float newStepsUpperStepBound) {
		Float oldStepsUpperStepBound = stepsUpperStepBound;
		stepsUpperStepBound = newStepsUpperStepBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.STEPS__STEPS_UPPER_STEP_BOUND, oldStepsUpperStepBound, stepsUpperStepBound));
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
		 *   let severity : Integer[1] = 'Steps::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Stepdynamic)
		 *       in
		 *         'Steps::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, HorizontalelasticityTables.STR_Steps_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, HorizontalelasticityTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Stepdynamic = idResolver.getClass(HorizontalelasticityTables.CLSSid_Stepdynamic, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_horizontalelasticity_c_c_Stepdynamic).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, HorizontalelasticityTables.STR_Steps_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, HorizontalelasticityTables.INT_0).booleanValue();
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
			case HorizontalelasticityPackage.STEPS__STEPS_LOWER_STEP_BOUND:
				return getStepsLowerStepBound();
			case HorizontalelasticityPackage.STEPS__STEPS_UPPER_STEP_BOUND:
				return getStepsUpperStepBound();
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
			case HorizontalelasticityPackage.STEPS__STEPS_LOWER_STEP_BOUND:
				setStepsLowerStepBound((Float)newValue);
				return;
			case HorizontalelasticityPackage.STEPS__STEPS_UPPER_STEP_BOUND:
				setStepsUpperStepBound((Float)newValue);
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
			case HorizontalelasticityPackage.STEPS__STEPS_LOWER_STEP_BOUND:
				setStepsLowerStepBound(STEPS_LOWER_STEP_BOUND_EDEFAULT);
				return;
			case HorizontalelasticityPackage.STEPS__STEPS_UPPER_STEP_BOUND:
				setStepsUpperStepBound(STEPS_UPPER_STEP_BOUND_EDEFAULT);
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
			case HorizontalelasticityPackage.STEPS__STEPS_LOWER_STEP_BOUND:
				return STEPS_LOWER_STEP_BOUND_EDEFAULT == null ? stepsLowerStepBound != null : !STEPS_LOWER_STEP_BOUND_EDEFAULT.equals(stepsLowerStepBound);
			case HorizontalelasticityPackage.STEPS__STEPS_UPPER_STEP_BOUND:
				return STEPS_UPPER_STEP_BOUND_EDEFAULT == null ? stepsUpperStepBound != null : !STEPS_UPPER_STEP_BOUND_EDEFAULT.equals(stepsUpperStepBound);
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
			case HorizontalelasticityPackage.STEPS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (stepsLowerStepBound: ");
		result.append(stepsLowerStepBound);
		result.append(", stepsUpperStepBound: ");
		result.append(stepsUpperStepBound);
		result.append(')');
		return result.toString();
	}

} //StepsImpl
