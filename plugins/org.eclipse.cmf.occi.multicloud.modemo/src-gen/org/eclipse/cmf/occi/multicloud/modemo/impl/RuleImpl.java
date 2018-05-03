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
package org.eclipse.cmf.occi.multicloud.modemo.impl;

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage;
import org.eclipse.cmf.occi.multicloud.modemo.OperatorType;
import org.eclipse.cmf.occi.multicloud.modemo.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRuleThreshold <em>Rule Threshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRulePeriod <em>Rule Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.impl.RuleImpl#getRuleConsecutive <em>Rule Consecutive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends LinkImpl implements Rule {
	/**
	 * The default value of the '{@link #getRuleOperator() <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOperator()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorType RULE_OPERATOR_EDEFAULT = OperatorType.GREATER_THAN;

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
		return ModemoPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_OPERATOR, oldRuleOperator, ruleOperator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_THRESHOLD, oldRuleThreshold, ruleThreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_PERIOD, oldRulePeriod, rulePeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModemoPackage.RULE__RULE_CONSECUTIVE, oldRuleConsecutive, ruleConsecutive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModemoPackage.RULE__RULE_OPERATOR:
				return getRuleOperator();
			case ModemoPackage.RULE__RULE_THRESHOLD:
				return getRuleThreshold();
			case ModemoPackage.RULE__RULE_PERIOD:
				return getRulePeriod();
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
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
			case ModemoPackage.RULE__RULE_OPERATOR:
				setRuleOperator((OperatorType)newValue);
				return;
			case ModemoPackage.RULE__RULE_THRESHOLD:
				setRuleThreshold((Float)newValue);
				return;
			case ModemoPackage.RULE__RULE_PERIOD:
				setRulePeriod((Integer)newValue);
				return;
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
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
			case ModemoPackage.RULE__RULE_OPERATOR:
				setRuleOperator(RULE_OPERATOR_EDEFAULT);
				return;
			case ModemoPackage.RULE__RULE_THRESHOLD:
				setRuleThreshold(RULE_THRESHOLD_EDEFAULT);
				return;
			case ModemoPackage.RULE__RULE_PERIOD:
				setRulePeriod(RULE_PERIOD_EDEFAULT);
				return;
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
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
			case ModemoPackage.RULE__RULE_OPERATOR:
				return ruleOperator != RULE_OPERATOR_EDEFAULT;
			case ModemoPackage.RULE__RULE_THRESHOLD:
				return RULE_THRESHOLD_EDEFAULT == null ? ruleThreshold != null : !RULE_THRESHOLD_EDEFAULT.equals(ruleThreshold);
			case ModemoPackage.RULE__RULE_PERIOD:
				return RULE_PERIOD_EDEFAULT == null ? rulePeriod != null : !RULE_PERIOD_EDEFAULT.equals(rulePeriod);
			case ModemoPackage.RULE__RULE_CONSECUTIVE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ruleOperator: ");
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
