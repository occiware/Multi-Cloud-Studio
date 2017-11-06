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
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu;

import org.eclipse.cmf.occi.multicloud.elasticocci.util.ElasticocciValidator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategycpu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUUpperLimit <em>Strategy CPU Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPULowerLimit <em>Strategy CPU Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUMode <em>Strategy CPU Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUDirection <em>Strategy CPU Direction</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUStepCPUDecrease <em>Strategy CPU Step CPU Decrease</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUStepCPUIncrease <em>Strategy CPU Step CPU Increase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUDate <em>Strategy CPU Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUIncreaseRelationalOp <em>Strategy CPU Increase Relational Op</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyCPUDecreaseRelationalOp <em>Strategy CPU Decrease Relational Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategycpuImpl extends StrategycomputeImpl implements Strategycpu {
	/**
	 * The default value of the '{@link #getStrategyCPUUpperLimit() <em>Strategy CPU Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_CPU_UPPER_LIMIT_EDEFAULT = new Integer(7);

	/**
	 * The cached value of the '{@link #getStrategyCPUUpperLimit() <em>Strategy CPU Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyCPUUpperLimit = STRATEGY_CPU_UPPER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPULowerLimit() <em>Strategy CPU Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPULowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_CPU_LOWER_LIMIT_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getStrategyCPULowerLimit() <em>Strategy CPU Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPULowerLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyCPULowerLimit = STRATEGY_CPU_LOWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPUMode() <em>Strategy CPU Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeType STRATEGY_CPU_MODE_EDEFAULT = ModeType.SCHEDULED;

	/**
	 * The cached value of the '{@link #getStrategyCPUMode() <em>Strategy CPU Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUMode()
	 * @generated
	 * @ordered
	 */
	protected ModeType strategyCPUMode = STRATEGY_CPU_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPUDirection() <em>Strategy CPU Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType STRATEGY_CPU_DIRECTION_EDEFAULT = DirectionType.UP;

	/**
	 * The cached value of the '{@link #getStrategyCPUDirection() <em>Strategy CPU Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType strategyCPUDirection = STRATEGY_CPU_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPUStepCPUDecrease() <em>Strategy CPU Step CPU Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUStepCPUDecrease()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_CPU_STEP_CPU_DECREASE_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getStrategyCPUStepCPUDecrease() <em>Strategy CPU Step CPU Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUStepCPUDecrease()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyCPUStepCPUDecrease = STRATEGY_CPU_STEP_CPU_DECREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPUStepCPUIncrease() <em>Strategy CPU Step CPU Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUStepCPUIncrease()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_CPU_STEP_CPU_INCREASE_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getStrategyCPUStepCPUIncrease() <em>Strategy CPU Step CPU Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUStepCPUIncrease()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyCPUStepCPUIncrease = STRATEGY_CPU_STEP_CPU_INCREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPUDate() <em>Strategy CPU Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUDate()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_CPU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategyCPUDate() <em>Strategy CPU Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUDate()
	 * @generated
	 * @ordered
	 */
	protected String strategyCPUDate = STRATEGY_CPU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPUIncreaseRelationalOp() <em>Strategy CPU Increase Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUIncreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalType STRATEGY_CPU_INCREASE_RELATIONAL_OP_EDEFAULT = RelationalType.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getStrategyCPUIncreaseRelationalOp() <em>Strategy CPU Increase Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUIncreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected RelationalType strategyCPUIncreaseRelationalOp = STRATEGY_CPU_INCREASE_RELATIONAL_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyCPUDecreaseRelationalOp() <em>Strategy CPU Decrease Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUDecreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalType STRATEGY_CPU_DECREASE_RELATIONAL_OP_EDEFAULT = RelationalType.LESS_THAN;

	/**
	 * The cached value of the '{@link #getStrategyCPUDecreaseRelationalOp() <em>Strategy CPU Decrease Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCPUDecreaseRelationalOp()
	 * @generated
	 * @ordered
	 */
	protected RelationalType strategyCPUDecreaseRelationalOp = STRATEGY_CPU_DECREASE_RELATIONAL_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategycpuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElasticocciPackage.Literals.STRATEGYCPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyCPUUpperLimit() {
		return strategyCPUUpperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUUpperLimit(Integer newStrategyCPUUpperLimit) {
		Integer oldStrategyCPUUpperLimit = strategyCPUUpperLimit;
		strategyCPUUpperLimit = newStrategyCPUUpperLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT, oldStrategyCPUUpperLimit, strategyCPUUpperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyCPULowerLimit() {
		return strategyCPULowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPULowerLimit(Integer newStrategyCPULowerLimit) {
		Integer oldStrategyCPULowerLimit = strategyCPULowerLimit;
		strategyCPULowerLimit = newStrategyCPULowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT, oldStrategyCPULowerLimit, strategyCPULowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType getStrategyCPUMode() {
		return strategyCPUMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUMode(ModeType newStrategyCPUMode) {
		ModeType oldStrategyCPUMode = strategyCPUMode;
		strategyCPUMode = newStrategyCPUMode == null ? STRATEGY_CPU_MODE_EDEFAULT : newStrategyCPUMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_MODE, oldStrategyCPUMode, strategyCPUMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getStrategyCPUDirection() {
		return strategyCPUDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUDirection(DirectionType newStrategyCPUDirection) {
		DirectionType oldStrategyCPUDirection = strategyCPUDirection;
		strategyCPUDirection = newStrategyCPUDirection == null ? STRATEGY_CPU_DIRECTION_EDEFAULT : newStrategyCPUDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DIRECTION, oldStrategyCPUDirection, strategyCPUDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyCPUStepCPUDecrease() {
		return strategyCPUStepCPUDecrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUStepCPUDecrease(Integer newStrategyCPUStepCPUDecrease) {
		Integer oldStrategyCPUStepCPUDecrease = strategyCPUStepCPUDecrease;
		strategyCPUStepCPUDecrease = newStrategyCPUStepCPUDecrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE, oldStrategyCPUStepCPUDecrease, strategyCPUStepCPUDecrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyCPUStepCPUIncrease() {
		return strategyCPUStepCPUIncrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUStepCPUIncrease(Integer newStrategyCPUStepCPUIncrease) {
		Integer oldStrategyCPUStepCPUIncrease = strategyCPUStepCPUIncrease;
		strategyCPUStepCPUIncrease = newStrategyCPUStepCPUIncrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE, oldStrategyCPUStepCPUIncrease, strategyCPUStepCPUIncrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrategyCPUDate() {
		return strategyCPUDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUDate(String newStrategyCPUDate) {
		String oldStrategyCPUDate = strategyCPUDate;
		strategyCPUDate = newStrategyCPUDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DATE, oldStrategyCPUDate, strategyCPUDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalType getStrategyCPUIncreaseRelationalOp() {
		return strategyCPUIncreaseRelationalOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUIncreaseRelationalOp(RelationalType newStrategyCPUIncreaseRelationalOp) {
		RelationalType oldStrategyCPUIncreaseRelationalOp = strategyCPUIncreaseRelationalOp;
		strategyCPUIncreaseRelationalOp = newStrategyCPUIncreaseRelationalOp == null ? STRATEGY_CPU_INCREASE_RELATIONAL_OP_EDEFAULT : newStrategyCPUIncreaseRelationalOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP, oldStrategyCPUIncreaseRelationalOp, strategyCPUIncreaseRelationalOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalType getStrategyCPUDecreaseRelationalOp() {
		return strategyCPUDecreaseRelationalOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyCPUDecreaseRelationalOp(RelationalType newStrategyCPUDecreaseRelationalOp) {
		RelationalType oldStrategyCPUDecreaseRelationalOp = strategyCPUDecreaseRelationalOp;
		strategyCPUDecreaseRelationalOp = newStrategyCPUDecreaseRelationalOp == null ? STRATEGY_CPU_DECREASE_RELATIONAL_OP_EDEFAULT : newStrategyCPUDecreaseRelationalOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP, oldStrategyCPUDecreaseRelationalOp, strategyCPUDecreaseRelationalOp));
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
				(ElasticocciPackage.Literals.STRATEGYCPU,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 ElasticocciPackage.Literals.STRATEGYCPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP,
				 APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 ElasticocciValidator.DIAGNOSTIC_SOURCE,
				 ElasticocciValidator.STRATEGYCPU__APPLIES_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT:
				return getStrategyCPUUpperLimit();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT:
				return getStrategyCPULowerLimit();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_MODE:
				return getStrategyCPUMode();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DIRECTION:
				return getStrategyCPUDirection();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE:
				return getStrategyCPUStepCPUDecrease();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE:
				return getStrategyCPUStepCPUIncrease();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DATE:
				return getStrategyCPUDate();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP:
				return getStrategyCPUIncreaseRelationalOp();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP:
				return getStrategyCPUDecreaseRelationalOp();
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
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT:
				setStrategyCPUUpperLimit((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT:
				setStrategyCPULowerLimit((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_MODE:
				setStrategyCPUMode((ModeType)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DIRECTION:
				setStrategyCPUDirection((DirectionType)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE:
				setStrategyCPUStepCPUDecrease((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE:
				setStrategyCPUStepCPUIncrease((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DATE:
				setStrategyCPUDate((String)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP:
				setStrategyCPUIncreaseRelationalOp((RelationalType)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP:
				setStrategyCPUDecreaseRelationalOp((RelationalType)newValue);
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
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT:
				setStrategyCPUUpperLimit(STRATEGY_CPU_UPPER_LIMIT_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT:
				setStrategyCPULowerLimit(STRATEGY_CPU_LOWER_LIMIT_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_MODE:
				setStrategyCPUMode(STRATEGY_CPU_MODE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DIRECTION:
				setStrategyCPUDirection(STRATEGY_CPU_DIRECTION_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE:
				setStrategyCPUStepCPUDecrease(STRATEGY_CPU_STEP_CPU_DECREASE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE:
				setStrategyCPUStepCPUIncrease(STRATEGY_CPU_STEP_CPU_INCREASE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DATE:
				setStrategyCPUDate(STRATEGY_CPU_DATE_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP:
				setStrategyCPUIncreaseRelationalOp(STRATEGY_CPU_INCREASE_RELATIONAL_OP_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP:
				setStrategyCPUDecreaseRelationalOp(STRATEGY_CPU_DECREASE_RELATIONAL_OP_EDEFAULT);
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
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT:
				return STRATEGY_CPU_UPPER_LIMIT_EDEFAULT == null ? strategyCPUUpperLimit != null : !STRATEGY_CPU_UPPER_LIMIT_EDEFAULT.equals(strategyCPUUpperLimit);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT:
				return STRATEGY_CPU_LOWER_LIMIT_EDEFAULT == null ? strategyCPULowerLimit != null : !STRATEGY_CPU_LOWER_LIMIT_EDEFAULT.equals(strategyCPULowerLimit);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_MODE:
				return strategyCPUMode != STRATEGY_CPU_MODE_EDEFAULT;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DIRECTION:
				return strategyCPUDirection != STRATEGY_CPU_DIRECTION_EDEFAULT;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE:
				return STRATEGY_CPU_STEP_CPU_DECREASE_EDEFAULT == null ? strategyCPUStepCPUDecrease != null : !STRATEGY_CPU_STEP_CPU_DECREASE_EDEFAULT.equals(strategyCPUStepCPUDecrease);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE:
				return STRATEGY_CPU_STEP_CPU_INCREASE_EDEFAULT == null ? strategyCPUStepCPUIncrease != null : !STRATEGY_CPU_STEP_CPU_INCREASE_EDEFAULT.equals(strategyCPUStepCPUIncrease);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DATE:
				return STRATEGY_CPU_DATE_EDEFAULT == null ? strategyCPUDate != null : !STRATEGY_CPU_DATE_EDEFAULT.equals(strategyCPUDate);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP:
				return strategyCPUIncreaseRelationalOp != STRATEGY_CPU_INCREASE_RELATIONAL_OP_EDEFAULT;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP:
				return strategyCPUDecreaseRelationalOp != STRATEGY_CPU_DECREASE_RELATIONAL_OP_EDEFAULT;
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
				case ElasticocciPackage.STRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return ElasticocciPackage.STRATEGYCPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case ElasticocciPackage.STRATEGYCPU___START:
				start();
				return null;
			case ElasticocciPackage.STRATEGYCPU___STOP:
				stop();
				return null;
			case ElasticocciPackage.STRATEGYCPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (StrategyCPUUpperLimit: ");
		result.append(strategyCPUUpperLimit);
		result.append(", StrategyCPULowerLimit: ");
		result.append(strategyCPULowerLimit);
		result.append(", StrategyCPUMode: ");
		result.append(strategyCPUMode);
		result.append(", StrategyCPUDirection: ");
		result.append(strategyCPUDirection);
		result.append(", StrategyCPUStepCPUDecrease: ");
		result.append(strategyCPUStepCPUDecrease);
		result.append(", StrategyCPUStepCPUIncrease: ");
		result.append(strategyCPUStepCPUIncrease);
		result.append(", StrategyCPUDate: ");
		result.append(strategyCPUDate);
		result.append(", StrategyCPUIncreaseRelationalOp: ");
		result.append(strategyCPUIncreaseRelationalOp);
		result.append(", StrategyCPUDecreaseRelationalOp: ");
		result.append(strategyCPUDecreaseRelationalOp);
		result.append(')');
		return result.toString();
	}

} //StrategycpuImpl
