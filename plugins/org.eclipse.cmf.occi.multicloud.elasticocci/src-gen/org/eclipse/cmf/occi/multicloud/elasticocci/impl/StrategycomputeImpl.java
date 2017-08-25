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

import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage;
import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategy;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute;

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
 * An implementation of the model object '<em><b>Strategycompute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl#getStrategyComputeUthreshold <em>Strategy Compute Uthreshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl#getStrategyComputeBreathDown <em>Strategy Compute Breath Down</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl#getStrategyComputeBreathUp <em>Strategy Compute Breath Up</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl#getStrategyComputePollTime <em>Strategy Compute Poll Time</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl#getStrategyComputeLthreshold <em>Strategy Compute Lthreshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategycomputeImpl extends MixinBaseImpl implements Strategycompute {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategycomputeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElasticocciPackage.Literals.STRATEGYCOMPUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD, oldStrategyComputeUthreshold, strategyComputeUthreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN, oldStrategyComputeBreathDown, strategyComputeBreathDown));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP, oldStrategyComputeBreathUp, strategyComputeBreathUp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME, oldStrategyComputePollTime, strategyComputePollTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD, oldStrategyComputeLthreshold, strategyComputeLthreshold));
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
		 *   let severity : Integer[1] = 'Strategy::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Elasticcontroller)
		 *       in
		 *         'Strategy::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ElasticocciTables.STR_Strategy_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ElasticocciTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_elasticocci_c_c_Elasticcontroller = idResolver.getClass(ElasticocciTables.CLSSid_Elasticcontroller, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_elasticocci_c_c_Elasticcontroller).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ElasticocciTables.STR_Strategy_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ElasticocciTables.INT_0).booleanValue();
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
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD:
				return getStrategyComputeUthreshold();
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN:
				return getStrategyComputeBreathDown();
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP:
				return getStrategyComputeBreathUp();
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME:
				return getStrategyComputePollTime();
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD:
				return getStrategyComputeLthreshold();
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
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD:
				setStrategyComputeUthreshold((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN:
				setStrategyComputeBreathDown((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP:
				setStrategyComputeBreathUp((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME:
				setStrategyComputePollTime((Integer)newValue);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD:
				setStrategyComputeLthreshold((Integer)newValue);
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
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD:
				setStrategyComputeUthreshold(STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN:
				setStrategyComputeBreathDown(STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP:
				setStrategyComputeBreathUp(STRATEGY_COMPUTE_BREATH_UP_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME:
				setStrategyComputePollTime(STRATEGY_COMPUTE_POLL_TIME_EDEFAULT);
				return;
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD:
				setStrategyComputeLthreshold(STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT);
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
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD:
				return STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT == null ? strategyComputeUthreshold != null : !STRATEGY_COMPUTE_UTHRESHOLD_EDEFAULT.equals(strategyComputeUthreshold);
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN:
				return STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT == null ? strategyComputeBreathDown != null : !STRATEGY_COMPUTE_BREATH_DOWN_EDEFAULT.equals(strategyComputeBreathDown);
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP:
				return STRATEGY_COMPUTE_BREATH_UP_EDEFAULT == null ? strategyComputeBreathUp != null : !STRATEGY_COMPUTE_BREATH_UP_EDEFAULT.equals(strategyComputeBreathUp);
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME:
				return STRATEGY_COMPUTE_POLL_TIME_EDEFAULT == null ? strategyComputePollTime != null : !STRATEGY_COMPUTE_POLL_TIME_EDEFAULT.equals(strategyComputePollTime);
			case ElasticocciPackage.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD:
				return STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT == null ? strategyComputeLthreshold != null : !STRATEGY_COMPUTE_LTHRESHOLD_EDEFAULT.equals(strategyComputeLthreshold);
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
				case ElasticocciPackage.STRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return ElasticocciPackage.STRATEGYCOMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case ElasticocciPackage.STRATEGYCOMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(')');
		return result.toString();
	}

} //StrategycomputeImpl
