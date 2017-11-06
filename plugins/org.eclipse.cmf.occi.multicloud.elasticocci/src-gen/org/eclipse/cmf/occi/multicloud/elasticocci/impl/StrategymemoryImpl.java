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
package org.eclipse.cmf.occi.multicloud.elasticocci.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType;
import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage;
import org.eclipse.cmf.occi.multicloud.elasticocci.ModeType;
import org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategy;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory;

import org.eclipse.cmf.occi.multicloud.elasticocci.util.ElasticocciValidator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategymemory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryMode <em>Strategy Memory Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryDirection <em>Strategy Memory Direction</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryStepMemDecrease <em>Strategy Memory Step Mem Decrease</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryStepMemIncrease <em>Strategy Memory Step Mem Increase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryUpperLimit <em>Strategy Memory Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryLowerLimit <em>Strategy Memory Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryDate <em>Strategy Memory Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryIncreaseRelationalOp <em>Strategy Memory Increase Relational Op</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryDecreaseRelationalOp <em>Strategy Memory Decrease Relational Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategymemoryImpl extends StrategycomputeImpl implements Strategymemory {
	/**
	 * The default value of the '{@link #getStrategyMemoryMode() <em>Strategy Memory Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeType STRATEGY_MEMORY_MODE_EDEFAULT = ModeType.DYNAMIC;

	/**
	 * The cached value of the '{@link #getStrategyMemoryMode() <em>Strategy Memory Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryMode()
	 * @generated
	 * @ordered
	 */
	protected ModeType strategyMemoryMode = STRATEGY_MEMORY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryDirection() <em>Strategy Memory Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType STRATEGY_MEMORY_DIRECTION_EDEFAULT = DirectionType.UP;

	/**
	 * The cached value of the '{@link #getStrategyMemoryDirection() <em>Strategy Memory Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType strategyMemoryDirection = STRATEGY_MEMORY_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryStepMemDecrease() <em>Strategy Memory Step Mem Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryStepMemDecrease()
	 * @generated
	 * @ordered
	 */
	protected static final Double STRATEGY_MEMORY_STEP_MEM_DECREASE_EDEFAULT = new Double(0.25);

	/**
	 * The cached value of the '{@link #getStrategyMemoryStepMemDecrease() <em>Strategy Memory Step Mem Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryStepMemDecrease()
	 * @generated
	 * @ordered
	 */
	protected Double strategyMemoryStepMemDecrease = STRATEGY_MEMORY_STEP_MEM_DECREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryStepMemIncrease() <em>Strategy Memory Step Mem Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryStepMemIncrease()
	 * @generated
	 * @ordered
	 */
	protected static final Double STRATEGY_MEMORY_STEP_MEM_INCREASE_EDEFAULT = new Double(0.5);

	/**
	 * The cached value of the '{@link #getStrategyMemoryStepMemIncrease() <em>Strategy Memory Step Mem Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryStepMemIncrease()
	 * @generated
	 * @ordered
	 */
	protected Double strategyMemoryStepMemIncrease = STRATEGY_MEMORY_STEP_MEM_INCREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryUpperLimit() <em>Strategy Memory Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_MEMORY_UPPER_LIMIT_EDEFAULT = new Integer(5);

	/**
	 * The cached value of the '{@link #getStrategyMemoryUpperLimit() <em>Strategy Memory Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyMemoryUpperLimit = STRATEGY_MEMORY_UPPER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryLowerLimit() <em>Strategy Memory Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_MEMORY_LOWER_LIMIT_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getStrategyMemoryLowerLimit() <em>Strategy Memory Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyMemoryLowerLimit = STRATEGY_MEMORY_LOWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryDate() <em>Strategy Memory Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryDate()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_MEMORY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategyMemoryDate() <em>Strategy Memory Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryDate()
	 * @generated
	 * @ordered
	 */
	protected String strategyMemoryDate = STRATEGY_MEMORY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryIncreaseRelationalOp() <em>Strategy Memory Increase Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryIncreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalType STRATEGY_MEMORY_INCREASE_RELATIONAL_OP_EDEFAULT = RelationalType.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getStrategyMemoryIncreaseRelationalOp() <em>Strategy Memory Increase Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryIncreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected RelationalType strategyMemoryIncreaseRelationalOp = STRATEGY_MEMORY_INCREASE_RELATIONAL_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyMemoryDecreaseRelationalOp() <em>Strategy Memory Decrease Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryDecreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalType STRATEGY_MEMORY_DECREASE_RELATIONAL_OP_EDEFAULT = RelationalType.LESS_THAN;

	/**
	 * The cached value of the '{@link #getStrategyMemoryDecreaseRelationalOp() <em>Strategy Memory Decrease Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryDecreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected RelationalType strategyMemoryDecreaseRelationalOp = STRATEGY_MEMORY_DECREASE_RELATIONAL_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategymemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElasticocciPackage.Literals.STRATEGYMEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType getStrategyMemoryMode() {
		return strategyMemoryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryMode(ModeType newStrategyMemoryMode) {
		ModeType oldStrategyMemoryMode = strategyMemoryMode;
		strategyMemoryMode = newStrategyMemoryMode == null ? STRATEGY_MEMORY_MODE_EDEFAULT : newStrategyMemoryMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_MODE, oldStrategyMemoryMode, strategyMemoryMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getStrategyMemoryDirection() {
		return strategyMemoryDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryDirection(DirectionType newStrategyMemoryDirection) {
		DirectionType oldStrategyMemoryDirection = strategyMemoryDirection;
		strategyMemoryDirection = newStrategyMemoryDirection == null ? STRATEGY_MEMORY_DIRECTION_EDEFAULT : newStrategyMemoryDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION, oldStrategyMemoryDirection, strategyMemoryDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStrategyMemoryStepMemDecrease() {
		return strategyMemoryStepMemDecrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryStepMemDecrease(Double newStrategyMemoryStepMemDecrease) {
		Double oldStrategyMemoryStepMemDecrease = strategyMemoryStepMemDecrease;
		strategyMemoryStepMemDecrease = newStrategyMemoryStepMemDecrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE, oldStrategyMemoryStepMemDecrease, strategyMemoryStepMemDecrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStrategyMemoryStepMemIncrease() {
		return strategyMemoryStepMemIncrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryStepMemIncrease(Double newStrategyMemoryStepMemIncrease) {
		Double oldStrategyMemoryStepMemIncrease = strategyMemoryStepMemIncrease;
		strategyMemoryStepMemIncrease = newStrategyMemoryStepMemIncrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE, oldStrategyMemoryStepMemIncrease, strategyMemoryStepMemIncrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyMemoryUpperLimit() {
		return strategyMemoryUpperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryUpperLimit(Integer newStrategyMemoryUpperLimit) {
		Integer oldStrategyMemoryUpperLimit = strategyMemoryUpperLimit;
		strategyMemoryUpperLimit = newStrategyMemoryUpperLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT, oldStrategyMemoryUpperLimit, strategyMemoryUpperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyMemoryLowerLimit() {
		return strategyMemoryLowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryLowerLimit(Integer newStrategyMemoryLowerLimit) {
		Integer oldStrategyMemoryLowerLimit = strategyMemoryLowerLimit;
		strategyMemoryLowerLimit = newStrategyMemoryLowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT, oldStrategyMemoryLowerLimit, strategyMemoryLowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrategyMemoryDate() {
		return strategyMemoryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryDate(String newStrategyMemoryDate) {
		String oldStrategyMemoryDate = strategyMemoryDate;
		strategyMemoryDate = newStrategyMemoryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DATE, oldStrategyMemoryDate, strategyMemoryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalType getStrategyMemoryIncreaseRelationalOp() {
		return strategyMemoryIncreaseRelationalOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryIncreaseRelationalOp(RelationalType newStrategyMemoryIncreaseRelationalOp) {
		RelationalType oldStrategyMemoryIncreaseRelationalOp = strategyMemoryIncreaseRelationalOp;
		strategyMemoryIncreaseRelationalOp = newStrategyMemoryIncreaseRelationalOp == null ? STRATEGY_MEMORY_INCREASE_RELATIONAL_OP_EDEFAULT : newStrategyMemoryIncreaseRelationalOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP, oldStrategyMemoryIncreaseRelationalOp, strategyMemoryIncreaseRelationalOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalType getStrategyMemoryDecreaseRelationalOp() {
		return strategyMemoryDecreaseRelationalOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyMemoryDecreaseRelationalOp(RelationalType newStrategyMemoryDecreaseRelationalOp) {
		RelationalType oldStrategyMemoryDecreaseRelationalOp = strategyMemoryDecreaseRelationalOp;
		strategyMemoryDecreaseRelationalOp = newStrategyMemoryDecreaseRelationalOp == null ? STRATEGY_MEMORY_DECREASE_RELATIONAL_OP_EDEFAULT : newStrategyMemoryDecreaseRelationalOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP, oldStrategyMemoryDecreaseRelationalOp, strategyMemoryDecreaseRelationalOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached validation expression for the '{@link #appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.entity.oclIsKindOf(elasticocci::Elasticcontroller)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			ElasticocciValidator.validate
				(ElasticocciPackage.Literals.STRATEGYMEMORY,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 ElasticocciPackage.Literals.STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP,
				 APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 ElasticocciValidator.DIAGNOSTIC_SOURCE,
				 ElasticocciValidator.STRATEGYMEMORY__APPLIES_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_MODE:
				return getStrategyMemoryMode();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION:
				return getStrategyMemoryDirection();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE:
				return getStrategyMemoryStepMemDecrease();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE:
				return getStrategyMemoryStepMemIncrease();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT:
				return getStrategyMemoryUpperLimit();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT:
				return getStrategyMemoryLowerLimit();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DATE:
				return getStrategyMemoryDate();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP:
				return getStrategyMemoryIncreaseRelationalOp();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP:
				return getStrategyMemoryDecreaseRelationalOp();
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_MODE:
				setStrategyMemoryMode((ModeType)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION:
				setStrategyMemoryDirection((DirectionType)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE:
				setStrategyMemoryStepMemDecrease((Double)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE:
				setStrategyMemoryStepMemIncrease((Double)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT:
				setStrategyMemoryUpperLimit((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT:
				setStrategyMemoryLowerLimit((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DATE:
				setStrategyMemoryDate((String)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP:
				setStrategyMemoryIncreaseRelationalOp((RelationalType)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP:
				setStrategyMemoryDecreaseRelationalOp((RelationalType)newValue);
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_MODE:
				setStrategyMemoryMode(STRATEGY_MEMORY_MODE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION:
				setStrategyMemoryDirection(STRATEGY_MEMORY_DIRECTION_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE:
				setStrategyMemoryStepMemDecrease(STRATEGY_MEMORY_STEP_MEM_DECREASE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE:
				setStrategyMemoryStepMemIncrease(STRATEGY_MEMORY_STEP_MEM_INCREASE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT:
				setStrategyMemoryUpperLimit(STRATEGY_MEMORY_UPPER_LIMIT_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT:
				setStrategyMemoryLowerLimit(STRATEGY_MEMORY_LOWER_LIMIT_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DATE:
				setStrategyMemoryDate(STRATEGY_MEMORY_DATE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP:
				setStrategyMemoryIncreaseRelationalOp(STRATEGY_MEMORY_INCREASE_RELATIONAL_OP_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP:
				setStrategyMemoryDecreaseRelationalOp(STRATEGY_MEMORY_DECREASE_RELATIONAL_OP_EDEFAULT);
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_MODE:
				return strategyMemoryMode != STRATEGY_MEMORY_MODE_EDEFAULT;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION:
				return strategyMemoryDirection != STRATEGY_MEMORY_DIRECTION_EDEFAULT;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE:
				return STRATEGY_MEMORY_STEP_MEM_DECREASE_EDEFAULT == null ? strategyMemoryStepMemDecrease != null : !STRATEGY_MEMORY_STEP_MEM_DECREASE_EDEFAULT.equals(strategyMemoryStepMemDecrease);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE:
				return STRATEGY_MEMORY_STEP_MEM_INCREASE_EDEFAULT == null ? strategyMemoryStepMemIncrease != null : !STRATEGY_MEMORY_STEP_MEM_INCREASE_EDEFAULT.equals(strategyMemoryStepMemIncrease);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT:
				return STRATEGY_MEMORY_UPPER_LIMIT_EDEFAULT == null ? strategyMemoryUpperLimit != null : !STRATEGY_MEMORY_UPPER_LIMIT_EDEFAULT.equals(strategyMemoryUpperLimit);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT:
				return STRATEGY_MEMORY_LOWER_LIMIT_EDEFAULT == null ? strategyMemoryLowerLimit != null : !STRATEGY_MEMORY_LOWER_LIMIT_EDEFAULT.equals(strategyMemoryLowerLimit);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DATE:
				return STRATEGY_MEMORY_DATE_EDEFAULT == null ? strategyMemoryDate != null : !STRATEGY_MEMORY_DATE_EDEFAULT.equals(strategyMemoryDate);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP:
				return strategyMemoryIncreaseRelationalOp != STRATEGY_MEMORY_INCREASE_RELATIONAL_OP_EDEFAULT;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP:
				return strategyMemoryDecreaseRelationalOp != STRATEGY_MEMORY_DECREASE_RELATIONAL_OP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Strategy.class) {
			switch (baseOperationID) {
				case ElasticocciPackage.STRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return ElasticocciPackage.STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case ElasticocciPackage.STRATEGYMEMORY___STOP:
				stop();
				return null;
			case ElasticocciPackage.STRATEGYMEMORY___START:
				start();
				return null;
			case ElasticocciPackage.STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (StrategyMemoryMode: ");
		result.append(strategyMemoryMode);
		result.append(", StrategyMemoryDirection: ");
		result.append(strategyMemoryDirection);
		result.append(", StrategyMemoryStepMemDecrease: ");
		result.append(strategyMemoryStepMemDecrease);
		result.append(", StrategyMemoryStepMemIncrease: ");
		result.append(strategyMemoryStepMemIncrease);
		result.append(", StrategyMemoryUpperLimit: ");
		result.append(strategyMemoryUpperLimit);
		result.append(", StrategyMemoryLowerLimit: ");
		result.append(strategyMemoryLowerLimit);
		result.append(", StrategyMemoryDate: ");
		result.append(strategyMemoryDate);
		result.append(", StrategyMemoryIncreaseRelationalOp: ");
		result.append(strategyMemoryIncreaseRelationalOp);
		result.append(", StrategyMemoryDecreaseRelationalOp: ");
		result.append(strategyMemoryDecreaseRelationalOp);
		result.append(')');
		return result.toString();
	}

} //StrategymemoryImpl
