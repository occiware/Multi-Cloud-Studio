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
package org.eclipse.cmf.occi.multicloud.elasticocci;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategymemory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryMode <em>Strategy Memory Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDirection <em>Strategy Memory Direction</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemDecrease <em>Strategy Memory Step Mem Decrease</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemIncrease <em>Strategy Memory Step Mem Increase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryUpperLimit <em>Strategy Memory Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryLowerLimit <em>Strategy Memory Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDate <em>Strategy Memory Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryIncreaseRelationalOp <em>Strategy Memory Increase Relational Op</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDecreaseRelationalOp <em>Strategy Memory Decrease Relational Op</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Strategymemory extends MixinBase, Strategycompute {
	/**
	 * Returns the value of the '<em><b>Strategy Memory Mode</b></em>' attribute.
	 * The default value is <code>"dynamic"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.ModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #setStrategyMemoryMode(ModeType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryMode()
	 * @model default="dynamic"
	 * @generated
	 */
	ModeType getStrategyMemoryMode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryMode <em>Strategy Memory Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #getStrategyMemoryMode()
	 * @generated
	 */
	void setStrategyMemoryMode(ModeType value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Direction</b></em>' attribute.
	 * The default value is <code>"up"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #setStrategyMemoryDirection(DirectionType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryDirection()
	 * @model default="up"
	 * @generated
	 */
	DirectionType getStrategyMemoryDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDirection <em>Strategy Memory Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #getStrategyMemoryDirection()
	 * @generated
	 */
	void setStrategyMemoryDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Step Mem Decrease</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Step Mem Decrease</em>' attribute.
	 * @see #setStrategyMemoryStepMemDecrease(Double)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryStepMemDecrease()
	 * @model default="0.25" dataType="org.eclipse.cmf.occi.multicloud.elasticocci.Double"
	 * @generated
	 */
	Double getStrategyMemoryStepMemDecrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemDecrease <em>Strategy Memory Step Mem Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Step Mem Decrease</em>' attribute.
	 * @see #getStrategyMemoryStepMemDecrease()
	 * @generated
	 */
	void setStrategyMemoryStepMemDecrease(Double value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Step Mem Increase</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Step Mem Increase</em>' attribute.
	 * @see #setStrategyMemoryStepMemIncrease(Double)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryStepMemIncrease()
	 * @model default="0.5" dataType="org.eclipse.cmf.occi.multicloud.elasticocci.Double"
	 * @generated
	 */
	Double getStrategyMemoryStepMemIncrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemIncrease <em>Strategy Memory Step Mem Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Step Mem Increase</em>' attribute.
	 * @see #getStrategyMemoryStepMemIncrease()
	 * @generated
	 */
	void setStrategyMemoryStepMemIncrease(Double value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Upper Limit</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Upper Limit</em>' attribute.
	 * @see #setStrategyMemoryUpperLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryUpperLimit()
	 * @model default="5" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyMemoryUpperLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryUpperLimit <em>Strategy Memory Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Upper Limit</em>' attribute.
	 * @see #getStrategyMemoryUpperLimit()
	 * @generated
	 */
	void setStrategyMemoryUpperLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Lower Limit</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Lower Limit</em>' attribute.
	 * @see #setStrategyMemoryLowerLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryLowerLimit()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyMemoryLowerLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryLowerLimit <em>Strategy Memory Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Lower Limit</em>' attribute.
	 * @see #getStrategyMemoryLowerLimit()
	 * @generated
	 */
	void setStrategyMemoryLowerLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Date</em>' attribute.
	 * @see #setStrategyMemoryDate(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.elasticocci.DateType"
	 * @generated
	 */
	String getStrategyMemoryDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDate <em>Strategy Memory Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Date</em>' attribute.
	 * @see #getStrategyMemoryDate()
	 * @generated
	 */
	void setStrategyMemoryDate(String value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Increase Relational Op</b></em>' attribute.
	 * The default value is <code>"greaterThan"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Increase Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #setStrategyMemoryIncreaseRelationalOp(RelationalType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryIncreaseRelationalOp()
	 * @model default="greaterThan"
	 * @generated
	 */
	RelationalType getStrategyMemoryIncreaseRelationalOp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryIncreaseRelationalOp <em>Strategy Memory Increase Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Increase Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #getStrategyMemoryIncreaseRelationalOp()
	 * @generated
	 */
	void setStrategyMemoryIncreaseRelationalOp(RelationalType value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Decrease Relational Op</b></em>' attribute.
	 * The default value is <code>"lessThan"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Decrease Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #setStrategyMemoryDecreaseRelationalOp(RelationalType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryDecreaseRelationalOp()
	 * @model default="lessThan"
	 * @generated
	 */
	RelationalType getStrategyMemoryDecreaseRelationalOp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDecreaseRelationalOp <em>Strategy Memory Decrease Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Decrease Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #getStrategyMemoryDecreaseRelationalOp()
	 * @generated
	 */
	void setStrategyMemoryDecreaseRelationalOp(RelationalType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.entity.oclIsKindOf(elasticocci::Elasticcontroller)'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Strategymemory
