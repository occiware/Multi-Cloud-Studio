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

import org.eclipse.cmf.occi.core.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleThreshold <em>Rule Threshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRulePeriod <em>Rule Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleConsecutive <em>Rule Consecutive</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sourceConstraint targetConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sourceConstraint='self.source.oclIsKindOf(modemo::Elasticitycontroller)' targetConstraint='self.target.oclIsKindOf(modemo::Actiontrigger)'"
 * @generated
 */
public interface Rule extends Link {
	/**
	 * Returns the value of the '<em><b>Rule Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.modemo.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Operator</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.OperatorType
	 * @see #setRuleOperator(OperatorType)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RuleOperator()
	 * @model
	 * @generated
	 */
	OperatorType getRuleOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleOperator <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Operator</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.OperatorType
	 * @see #getRuleOperator()
	 * @generated
	 */
	void setRuleOperator(OperatorType value);

	/**
	 * Returns the value of the '<em><b>Rule Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Threshold</em>' attribute.
	 * @see #setRuleThreshold(Float)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RuleThreshold()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Float"
	 * @generated
	 */
	Float getRuleThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleThreshold <em>Rule Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Threshold</em>' attribute.
	 * @see #getRuleThreshold()
	 * @generated
	 */
	void setRuleThreshold(Float value);

	/**
	 * Returns the value of the '<em><b>Rule Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Period</em>' attribute.
	 * @see #setRulePeriod(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RulePeriod()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getRulePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRulePeriod <em>Rule Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Period</em>' attribute.
	 * @see #getRulePeriod()
	 * @generated
	 */
	void setRulePeriod(Integer value);

	/**
	 * Returns the value of the '<em><b>Rule Consecutive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Consecutive</em>' attribute.
	 * @see #setRuleConsecutive(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RuleConsecutive()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getRuleConsecutive();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleConsecutive <em>Rule Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Consecutive</em>' attribute.
	 * @see #getRuleConsecutive()
	 * @generated
	 */
	void setRuleConsecutive(Integer value);

} // Rule
