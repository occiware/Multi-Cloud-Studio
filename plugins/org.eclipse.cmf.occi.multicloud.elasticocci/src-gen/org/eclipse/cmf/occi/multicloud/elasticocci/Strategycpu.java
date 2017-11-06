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
 * A representation of the model object '<em><b>Strategycpu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUUpperLimit <em>Strategy CPU Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPULowerLimit <em>Strategy CPU Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUMode <em>Strategy CPU Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDirection <em>Strategy CPU Direction</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUDecrease <em>Strategy CPU Step CPU Decrease</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUIncrease <em>Strategy CPU Step CPU Increase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDate <em>Strategy CPU Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUIncreaseRelationalOp <em>Strategy CPU Increase Relational Op</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDecreaseRelationalOp <em>Strategy CPU Decrease Relational Op</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Strategycpu extends Strategycompute, MixinBase {
	/**
	 * Returns the value of the '<em><b>Strategy CPU Upper Limit</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Upper Limit</em>' attribute.
	 * @see #setStrategyCPUUpperLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUUpperLimit()
	 * @model default="7" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyCPUUpperLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUUpperLimit <em>Strategy CPU Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Upper Limit</em>' attribute.
	 * @see #getStrategyCPUUpperLimit()
	 * @generated
	 */
	void setStrategyCPUUpperLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Lower Limit</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Lower Limit</em>' attribute.
	 * @see #setStrategyCPULowerLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPULowerLimit()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyCPULowerLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPULowerLimit <em>Strategy CPU Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Lower Limit</em>' attribute.
	 * @see #getStrategyCPULowerLimit()
	 * @generated
	 */
	void setStrategyCPULowerLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Mode</b></em>' attribute.
	 * The default value is <code>"scheduled"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.ModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #setStrategyCPUMode(ModeType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUMode()
	 * @model default="scheduled"
	 * @generated
	 */
	ModeType getStrategyCPUMode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUMode <em>Strategy CPU Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #getStrategyCPUMode()
	 * @generated
	 */
	void setStrategyCPUMode(ModeType value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Direction</b></em>' attribute.
	 * The default value is <code>"up"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #setStrategyCPUDirection(DirectionType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUDirection()
	 * @model default="up"
	 * @generated
	 */
	DirectionType getStrategyCPUDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDirection <em>Strategy CPU Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #getStrategyCPUDirection()
	 * @generated
	 */
	void setStrategyCPUDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Step CPU Decrease</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Step CPU Decrease</em>' attribute.
	 * @see #setStrategyCPUStepCPUDecrease(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUStepCPUDecrease()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyCPUStepCPUDecrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUDecrease <em>Strategy CPU Step CPU Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Step CPU Decrease</em>' attribute.
	 * @see #getStrategyCPUStepCPUDecrease()
	 * @generated
	 */
	void setStrategyCPUStepCPUDecrease(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Step CPU Increase</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Step CPU Increase</em>' attribute.
	 * @see #setStrategyCPUStepCPUIncrease(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUStepCPUIncrease()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyCPUStepCPUIncrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUIncrease <em>Strategy CPU Step CPU Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Step CPU Increase</em>' attribute.
	 * @see #getStrategyCPUStepCPUIncrease()
	 * @generated
	 */
	void setStrategyCPUStepCPUIncrease(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Date</em>' attribute.
	 * @see #setStrategyCPUDate(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.elasticocci.DateType"
	 * @generated
	 */
	String getStrategyCPUDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDate <em>Strategy CPU Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Date</em>' attribute.
	 * @see #getStrategyCPUDate()
	 * @generated
	 */
	void setStrategyCPUDate(String value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Increase Relational Op</b></em>' attribute.
	 * The default value is <code>"greaterThan"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Increase Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #setStrategyCPUIncreaseRelationalOp(RelationalType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUIncreaseRelationalOp()
	 * @model default="greaterThan"
	 * @generated
	 */
	RelationalType getStrategyCPUIncreaseRelationalOp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUIncreaseRelationalOp <em>Strategy CPU Increase Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Increase Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #getStrategyCPUIncreaseRelationalOp()
	 * @generated
	 */
	void setStrategyCPUIncreaseRelationalOp(RelationalType value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Decrease Relational Op</b></em>' attribute.
	 * The default value is <code>"lessThan"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Decrease Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #setStrategyCPUDecreaseRelationalOp(RelationalType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUDecreaseRelationalOp()
	 * @model default="lessThan"
	 * @generated
	 */
	RelationalType getStrategyCPUDecreaseRelationalOp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDecreaseRelationalOp <em>Strategy CPU Decrease Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Decrease Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #getStrategyCPUDecreaseRelationalOp()
	 * @generated
	 */
	void setStrategyCPUDecreaseRelationalOp(RelationalType value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.entity.oclIsKindOf(elasticocci::Elasticcontroller)'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Strategycpu
