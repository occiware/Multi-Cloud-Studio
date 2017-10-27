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

import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.OperatorType;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Rule;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.TypeMetric;

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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl#getRuleMetric <em>Rule Metric</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl#getRuleThreshold <em>Rule Threshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl#getRulePeriod <em>Rule Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl#getRuleConsecutive <em>Rule Consecutive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends LinkImpl implements Rule {
	/**
	 * The default value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName()
	 * @generated
	 * @ordered
	 */
	protected String ruleName = RULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleMetric() <em>Rule Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleMetric()
	 * @generated
	 * @ordered
	 */
	protected static final TypeMetric RULE_METRIC_EDEFAULT = TypeMetric.CP_UTILISATION;

	/**
	 * The cached value of the '{@link #getRuleMetric() <em>Rule Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleMetric()
	 * @generated
	 * @ordered
	 */
	protected TypeMetric ruleMetric = RULE_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleOperator() <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOperator()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorType RULE_OPERATOR_EDEFAULT = OperatorType.GRATER_THAN;

	/**
	 * The cached value of the '{@link #getRuleOperator() <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOperator()
	 * @generated
	 * @ordered
	 */
	protected OperatorType ruleOperator = RULE_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleThreshold() <em>Rule Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Float RULE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleThreshold() <em>Rule Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleThreshold()
	 * @generated
	 * @ordered
	 */
	protected Float ruleThreshold = RULE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRulePeriod() <em>Rule Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RULE_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRulePeriod() <em>Rule Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePeriod()
	 * @generated
	 * @ordered
	 */
	protected Integer rulePeriod = RULE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleConsecutive() <em>Rule Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleConsecutive()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RULE_CONSECUTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleConsecutive() <em>Rule Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleConsecutive()
	 * @generated
	 * @ordered
	 */
	protected Integer ruleConsecutive = RULE_CONSECUTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleName(String newRuleName) {
		String oldRuleName = ruleName;
		ruleName = newRuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RULE__RULE_NAME, oldRuleName, ruleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMetric getRuleMetric() {
		return ruleMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleMetric(TypeMetric newRuleMetric) {
		TypeMetric oldRuleMetric = ruleMetric;
		ruleMetric = newRuleMetric == null ? RULE_METRIC_EDEFAULT : newRuleMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RULE__RULE_METRIC, oldRuleMetric, ruleMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType getRuleOperator() {
		return ruleOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleOperator(OperatorType newRuleOperator) {
		OperatorType oldRuleOperator = ruleOperator;
		ruleOperator = newRuleOperator == null ? RULE_OPERATOR_EDEFAULT : newRuleOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RULE__RULE_OPERATOR, oldRuleOperator, ruleOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getRuleThreshold() {
		return ruleThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleThreshold(Float newRuleThreshold) {
		Float oldRuleThreshold = ruleThreshold;
		ruleThreshold = newRuleThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RULE__RULE_THRESHOLD, oldRuleThreshold, ruleThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRulePeriod() {
		return rulePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulePeriod(Integer newRulePeriod) {
		Integer oldRulePeriod = rulePeriod;
		rulePeriod = newRulePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RULE__RULE_PERIOD, oldRulePeriod, rulePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRuleConsecutive() {
		return ruleConsecutive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleConsecutive(Integer newRuleConsecutive) {
		Integer oldRuleConsecutive = ruleConsecutive;
		ruleConsecutive = newRuleConsecutive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.RULE__RULE_CONSECUTIVE, oldRuleConsecutive, ruleConsecutive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean targetConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv targetConstraint:
		 *   let severity : Integer[1] = 'Rule::targetConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.target.oclIsKindOf(Actiontrigger)
		 *       in
		 *         'Rule::targetConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, HorizontalelasticityTables.STR_Rule_c_c_targetConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, HorizontalelasticityTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_horizontalelasticity_c_c_Actiontrigger = idResolver.getClass(HorizontalelasticityTables.CLSSid_Actiontrigger, null);
			final /*@NonInvalid*/ Resource target = this.getTarget();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, target, TYP_horizontalelasticity_c_c_Actiontrigger).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, HorizontalelasticityTables.STR_Rule_c_c_targetConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, HorizontalelasticityTables.INT_0).booleanValue();
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
			case HorizontalelasticityPackage.RULE__RULE_NAME:
				return getRuleName();
			case HorizontalelasticityPackage.RULE__RULE_METRIC:
				return getRuleMetric();
			case HorizontalelasticityPackage.RULE__RULE_OPERATOR:
				return getRuleOperator();
			case HorizontalelasticityPackage.RULE__RULE_THRESHOLD:
				return getRuleThreshold();
			case HorizontalelasticityPackage.RULE__RULE_PERIOD:
				return getRulePeriod();
			case HorizontalelasticityPackage.RULE__RULE_CONSECUTIVE:
				return getRuleConsecutive();
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
			case HorizontalelasticityPackage.RULE__RULE_NAME:
				setRuleName((String)newValue);
				return;
			case HorizontalelasticityPackage.RULE__RULE_METRIC:
				setRuleMetric((TypeMetric)newValue);
				return;
			case HorizontalelasticityPackage.RULE__RULE_OPERATOR:
				setRuleOperator((OperatorType)newValue);
				return;
			case HorizontalelasticityPackage.RULE__RULE_THRESHOLD:
				setRuleThreshold((Float)newValue);
				return;
			case HorizontalelasticityPackage.RULE__RULE_PERIOD:
				setRulePeriod((Integer)newValue);
				return;
			case HorizontalelasticityPackage.RULE__RULE_CONSECUTIVE:
				setRuleConsecutive((Integer)newValue);
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
			case HorizontalelasticityPackage.RULE__RULE_NAME:
				setRuleName(RULE_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RULE__RULE_METRIC:
				setRuleMetric(RULE_METRIC_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RULE__RULE_OPERATOR:
				setRuleOperator(RULE_OPERATOR_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RULE__RULE_THRESHOLD:
				setRuleThreshold(RULE_THRESHOLD_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RULE__RULE_PERIOD:
				setRulePeriod(RULE_PERIOD_EDEFAULT);
				return;
			case HorizontalelasticityPackage.RULE__RULE_CONSECUTIVE:
				setRuleConsecutive(RULE_CONSECUTIVE_EDEFAULT);
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
			case HorizontalelasticityPackage.RULE__RULE_NAME:
				return RULE_NAME_EDEFAULT == null ? ruleName != null : !RULE_NAME_EDEFAULT.equals(ruleName);
			case HorizontalelasticityPackage.RULE__RULE_METRIC:
				return ruleMetric != RULE_METRIC_EDEFAULT;
			case HorizontalelasticityPackage.RULE__RULE_OPERATOR:
				return ruleOperator != RULE_OPERATOR_EDEFAULT;
			case HorizontalelasticityPackage.RULE__RULE_THRESHOLD:
				return RULE_THRESHOLD_EDEFAULT == null ? ruleThreshold != null : !RULE_THRESHOLD_EDEFAULT.equals(ruleThreshold);
			case HorizontalelasticityPackage.RULE__RULE_PERIOD:
				return RULE_PERIOD_EDEFAULT == null ? rulePeriod != null : !RULE_PERIOD_EDEFAULT.equals(rulePeriod);
			case HorizontalelasticityPackage.RULE__RULE_CONSECUTIVE:
				return RULE_CONSECUTIVE_EDEFAULT == null ? ruleConsecutive != null : !RULE_CONSECUTIVE_EDEFAULT.equals(ruleConsecutive);
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
			case HorizontalelasticityPackage.RULE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return targetConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (ruleName: ");
		result.append(ruleName);
		result.append(", ruleMetric: ");
		result.append(ruleMetric);
		result.append(", ruleOperator: ");
		result.append(ruleOperator);
		result.append(", ruleThreshold: ");
		result.append(ruleThreshold);
		result.append(", rulePeriod: ");
		result.append(rulePeriod);
		result.append(", ruleConsecutive: ");
		result.append(ruleConsecutive);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
