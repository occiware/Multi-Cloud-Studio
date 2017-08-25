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

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType;
import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage;
import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables;
import org.eclipse.cmf.occi.multicloud.elasticocci.ModeType;
import org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategy;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu;

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
 * An implementation of the model object '<em><b>Strategycpu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyComputeUthreshold <em>Strategy Compute Uthreshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyComputeBreathDown <em>Strategy Compute Breath Down</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyComputeBreathUp <em>Strategy Compute Breath Up</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyComputePollTime <em>Strategy Compute Poll Time</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl#getStrategyComputeLthreshold <em>Strategy Compute Lthreshold</em>}</li>
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
public class StrategycpuImpl extends MixinBaseImpl implements Strategycpu {
	/**
	 * The default value of the '{@link #getStrategyComputeUthreshold() <em>Strategy Compute Uthreshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeUthreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT = new Integer(90);

	/**
	 * The cached value of the '{@link #getStrategyComputeUthreshold() <em>Strategy Compute Uthreshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeUthreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyComputeUthreshold = STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyComputeBreathDown() <em>Strategy Compute Breath Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeBreathDown()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT = new Integer(20000);

	/**
	 * The cached value of the '{@link #getStrategyComputeBreathDown() <em>Strategy Compute Breath Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeBreathDown()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyComputeBreathDown = STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyComputeBreathUp() <em>Strategy Compute Breath Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeBreathUp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_COMPUTE_BREATH_UP_EDEFAULT = new Integer(40000);

	/**
	 * The cached value of the '{@link #getStrategyComputeBreathUp() <em>Strategy Compute Breath Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeBreathUp()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyComputeBreathUp = STRATEGY_COMPUTE_BREATH_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyComputePollTime() <em>Strategy Compute Poll Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputePollTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_COMPUTE_POLL_TIME_EDEFAULT = new Integer(10000);

	/**
	 * The cached value of the '{@link #getStrategyComputePollTime() <em>Strategy Compute Poll Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputePollTime()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyComputePollTime = STRATEGY_COMPUTE_POLL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyComputeLthreshold() <em>Strategy Compute Lthreshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeLthreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT = new Integer(70);

	/**
	 * The cached value of the '{@link #getStrategyComputeLthreshold() <em>Strategy Compute Lthreshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeLthreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer strategyComputeLthreshold = STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT;

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
	protected static final ModeType STRATEGY_CPU_MODE_EDEFAULT = ModeType.DYNAMIC;

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
	public Integer getStrategyComputeUthreshold() {
		return strategyComputeUthreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyComputeUthreshold(Integer newStrategyComputeUthreshold) {
		Integer oldStrategyComputeUthreshold = strategyComputeUthreshold;
		strategyComputeUthreshold = newStrategyComputeUthreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD, oldStrategyComputeUthreshold, strategyComputeUthreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyComputeBreathDown() {
		return strategyComputeBreathDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyComputeBreathDown(Integer newStrategyComputeBreathDown) {
		Integer oldStrategyComputeBreathDown = strategyComputeBreathDown;
		strategyComputeBreathDown = newStrategyComputeBreathDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN, oldStrategyComputeBreathDown, strategyComputeBreathDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyComputeBreathUp() {
		return strategyComputeBreathUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyComputeBreathUp(Integer newStrategyComputeBreathUp) {
		Integer oldStrategyComputeBreathUp = strategyComputeBreathUp;
		strategyComputeBreathUp = newStrategyComputeBreathUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP, oldStrategyComputeBreathUp, strategyComputeBreathUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyComputePollTime() {
		return strategyComputePollTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyComputePollTime(Integer newStrategyComputePollTime) {
		Integer oldStrategyComputePollTime = strategyComputePollTime;
		strategyComputePollTime = newStrategyComputePollTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME, oldStrategyComputePollTime, strategyComputePollTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrategyComputeLthreshold() {
		return strategyComputeLthreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategyComputeLthreshold(Integer newStrategyComputeLthreshold) {
		Integer oldStrategyComputeLthreshold = strategyComputeLthreshold;
		strategyComputeLthreshold = newStrategyComputeLthreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD, oldStrategyComputeLthreshold, strategyComputeLthreshold));
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
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!stop()
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
		 *   let severity : Integer[1] = 'Strategycpu::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Elasticcontroller)
		 *       in
		 *         'Strategycpu::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ElasticocciTables.STR_Strategycpu_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ElasticocciTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_elasticocci_c_c_Elasticcontroller_0 = idResolver.getClass(ElasticocciTables.CLSSid_Elasticcontroller, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_elasticocci_c_c_Elasticcontroller_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ElasticocciTables.STR_Strategycpu_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ElasticocciTables.INT_0).booleanValue();
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
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD:
				return getStrategyComputeUthreshold();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN:
				return getStrategyComputeBreathDown();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP:
				return getStrategyComputeBreathUp();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME:
				return getStrategyComputePollTime();
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD:
				return getStrategyComputeLthreshold();
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
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD:
				setStrategyComputeUthreshold((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN:
				setStrategyComputeBreathDown((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP:
				setStrategyComputeBreathUp((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME:
				setStrategyComputePollTime((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD:
				setStrategyComputeLthreshold((Integer)newValue);
				return;
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
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD:
				setStrategyComputeUthreshold(STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN:
				setStrategyComputeBreathDown(STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP:
				setStrategyComputeBreathUp(STRATEGY_COMPUTE_BREATH_UP_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME:
				setStrategyComputePollTime(STRATEGY_COMPUTE_POLL_TIME_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD:
				setStrategyComputeLthreshold(STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT);
				return;
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
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD:
				return STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT == null ? strategyComputeUthreshold != null : !STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT.equals(strategyComputeUthreshold);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN:
				return STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT == null ? strategyComputeBreathDown != null : !STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT.equals(strategyComputeBreathDown);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP:
				return STRATEGY_COMPUTE_BREATH_UP_EDEFAULT == null ? strategyComputeBreathUp != null : !STRATEGY_COMPUTE_BREATH_UP_EDEFAULT.equals(strategyComputeBreathUp);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME:
				return STRATEGY_COMPUTE_POLL_TIME_EDEFAULT == null ? strategyComputePollTime != null : !STRATEGY_COMPUTE_POLL_TIME_EDEFAULT.equals(strategyComputePollTime);
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD:
				return STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT == null ? strategyComputeLthreshold != null : !STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT.equals(strategyComputeLthreshold);
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Strategy.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Strategycompute.class) {
			switch (derivedFeatureID) {
				case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD;
				case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN;
				case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP;
				case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME;
				case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Strategy.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Strategycompute.class) {
			switch (baseFeatureID) {
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD: return ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN: return ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP: return ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME: return ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD: return ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				default: return -1;
			}
		}
		if (baseClass == Strategycompute.class) {
			switch (baseOperationID) {
				default: return -1;
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
		result.append(" (StrategyComputeUthreshold: ");
		result.append(strategyComputeUthreshold);
		result.append(", StrategyComputeBreathDown: ");
		result.append(strategyComputeBreathDown);
		result.append(", StrategyComputeBreathUp: ");
		result.append(strategyComputeBreathUp);
		result.append(", StrategyComputePollTime: ");
		result.append(strategyComputePollTime);
		result.append(", StrategyComputeLthreshold: ");
		result.append(strategyComputeLthreshold);
		result.append(", StrategyCPUUpperLimit: ");
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
