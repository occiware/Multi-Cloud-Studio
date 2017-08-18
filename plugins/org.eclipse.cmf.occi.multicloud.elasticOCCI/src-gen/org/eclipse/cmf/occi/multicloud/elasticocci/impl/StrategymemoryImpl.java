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
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategy;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory;

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
 * An implementation of the model object '<em><b>Strategymemory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyComputeUthreshold <em>Strategy Compute Uthreshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyComputeBreathDown <em>Strategy Compute Breath Down</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyComputeBreathUp <em>Strategy Compute Breath Up</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyComputePollTime <em>Strategy Compute Poll Time</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyComputeLthreshold <em>Strategy Compute Lthreshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryMode <em>Strategy Memory Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryDirection <em>Strategy Memory Direction</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryStepMemDecrease <em>Strategy Memory Step Mem Decrease</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryStepMemIncrease <em>Strategy Memory Step Mem Increase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryUpperLimit <em>Strategy Memory Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyMemoryLowerLimit <em>Strategy Memory Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl#getStrategyCPUDate <em>Strategy CPU Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategymemoryImpl extends MixinBaseImpl implements Strategymemory {
	/**
	 * The default value of the '{@link #getStrategyComputeUthreshold() <em>Strategy Compute Uthreshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyComputeUthreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT = null;

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
	protected static final Integer STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT = null;

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
	protected static final Integer STRATEGY_COMPUTE_BREATH_UP_EDEFAULT = null;

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
	protected static final Integer STRATEGY_COMPUTE_POLL_TIME_EDEFAULT = null;

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
	protected static final Integer STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT = null;

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
	 * The default value of the '{@link #getStrategyMemoryMode() <em>Strategy Memory Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyMemoryMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeType STRATEGY_MEMORY_MODE_EDEFAULT = ModeType.MANUAL;

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
	protected static final Double STRATEGY_MEMORY_STEP_MEM_DECREASE_EDEFAULT = null;

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
	protected static final Double STRATEGY_MEMORY_STEP_MEM_INCREASE_EDEFAULT = null;

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
	protected static final Integer STRATEGY_MEMORY_UPPER_LIMIT_EDEFAULT = null;

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
	protected static final Integer STRATEGY_MEMORY_LOWER_LIMIT_EDEFAULT = null;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD, oldStrategyComputeUthreshold, strategyComputeUthreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN, oldStrategyComputeBreathDown, strategyComputeBreathDown));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP, oldStrategyComputeBreathUp, strategyComputeBreathUp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME, oldStrategyComputePollTime, strategyComputePollTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD, oldStrategyComputeLthreshold, strategyComputeLthreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYMEMORY__STRATEGY_CPU_DATE, oldStrategyCPUDate, strategyCPUDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategymemory!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategymemory!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createpolicy(final Double metricUtilization, final String op, final Integer threshold) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategycompute!createpolicy(http://occiware.org/occi/multicloud/elasticOCCI/ecore!Double,String,Integer)
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
		 *     severity : Integer[1] = 'Strategymemory::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Elasticcontroller)
		 *       in
		 *         'Strategymemory::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ElasticocciTables.STR_Strategymemory_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ElasticocciTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_elasticocci_c_c_Elasticcontroller_0 = idResolver.getClass(ElasticocciTables.CLSSid_Elasticcontroller, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_elasticocci_c_c_Elasticcontroller_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ElasticocciTables.STR_Strategymemory_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ElasticocciTables.INT_0).booleanValue();
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD:
				return getStrategyComputeUthreshold();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN:
				return getStrategyComputeBreathDown();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP:
				return getStrategyComputeBreathUp();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME:
				return getStrategyComputePollTime();
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD:
				return getStrategyComputeLthreshold();
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_CPU_DATE:
				return getStrategyCPUDate();
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD:
				setStrategyComputeUthreshold((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN:
				setStrategyComputeBreathDown((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP:
				setStrategyComputeBreathUp((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME:
				setStrategyComputePollTime((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD:
				setStrategyComputeLthreshold((Integer)newValue);
				return;
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_CPU_DATE:
				setStrategyCPUDate((String)newValue);
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD:
				setStrategyComputeUthreshold(STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN:
				setStrategyComputeBreathDown(STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP:
				setStrategyComputeBreathUp(STRATEGY_COMPUTE_BREATH_UP_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME:
				setStrategyComputePollTime(STRATEGY_COMPUTE_POLL_TIME_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD:
				setStrategyComputeLthreshold(STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT);
				return;
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_CPU_DATE:
				setStrategyCPUDate(STRATEGY_CPU_DATE_EDEFAULT);
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD:
				return STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT == null ? strategyComputeUthreshold != null : !STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT.equals(strategyComputeUthreshold);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN:
				return STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT == null ? strategyComputeBreathDown != null : !STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT.equals(strategyComputeBreathDown);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP:
				return STRATEGY_COMPUTE_BREATH_UP_EDEFAULT == null ? strategyComputeBreathUp != null : !STRATEGY_COMPUTE_BREATH_UP_EDEFAULT.equals(strategyComputeBreathUp);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME:
				return STRATEGY_COMPUTE_POLL_TIME_EDEFAULT == null ? strategyComputePollTime != null : !STRATEGY_COMPUTE_POLL_TIME_EDEFAULT.equals(strategyComputePollTime);
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD:
				return STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT == null ? strategyComputeLthreshold != null : !STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT.equals(strategyComputeLthreshold);
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
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_CPU_DATE:
				return STRATEGY_CPU_DATE_EDEFAULT == null ? strategyCPUDate != null : !STRATEGY_CPU_DATE_EDEFAULT.equals(strategyCPUDate);
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
				case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD;
				case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN;
				case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP;
				case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME;
				case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD: return ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD;
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
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD: return ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN: return ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP: return ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME: return ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME;
				case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD: return ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD;
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
				case ElasticocciPackage.STRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return ElasticocciPackage.STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == Strategycompute.class) {
			switch (baseOperationID) {
				case ElasticocciPackage.STRATEGYCOMPUTE___CREATEPOLICY__DOUBLE_STRING_INTEGER: return ElasticocciPackage.STRATEGYMEMORY___CREATEPOLICY__DOUBLE_STRING_INTEGER;
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
			case ElasticocciPackage.STRATEGYMEMORY___STOP:
				stop();
				return null;
			case ElasticocciPackage.STRATEGYMEMORY___START:
				start();
				return null;
			case ElasticocciPackage.STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ElasticocciPackage.STRATEGYMEMORY___CREATEPOLICY__DOUBLE_STRING_INTEGER:
				createpolicy((Double)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
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
		result.append(", StrategyMemoryMode: ");
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
		result.append(", StrategyCPUDate: ");
		result.append(strategyCPUDate);
		result.append(')');
		return result.toString();
	}

} //StrategymemoryImpl
