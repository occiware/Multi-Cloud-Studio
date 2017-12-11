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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Elasticitycontroller;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elasticitycontroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl#getElasticitycontrollerMinimumLimit <em>Elasticitycontroller Minimum Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl#getElasticitycontrollerMaximumLimit <em>Elasticitycontroller Maximum Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl#getElasticitycontrollerCoolDuration <em>Elasticitycontroller Cool Duration</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl#getElasticityControllerIterationWaitTime <em>Elasticity Controller Iteration Wait Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElasticitycontrollerImpl extends ResourceImpl implements Elasticitycontroller {
	/**
	 * The default value of the '{@link #getElasticitycontrollerMinimumLimit() <em>Elasticitycontroller Minimum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMinimumLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElasticitycontrollerMinimumLimit() <em>Elasticitycontroller Minimum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMinimumLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer elasticitycontrollerMinimumLimit = ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticitycontrollerMaximumLimit() <em>Elasticitycontroller Maximum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMaximumLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElasticitycontrollerMaximumLimit() <em>Elasticitycontroller Maximum Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerMaximumLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer elasticitycontrollerMaximumLimit = ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticitycontrollerCoolDuration() <em>Elasticitycontroller Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELASTICITYCONTROLLER_COOL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElasticitycontrollerCoolDuration() <em>Elasticitycontroller Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticitycontrollerCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer elasticitycontrollerCoolDuration = ELASTICITYCONTROLLER_COOL_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticityControllerIterationWaitTime() <em>Elasticity Controller Iteration Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticityControllerIterationWaitTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElasticityControllerIterationWaitTime() <em>Elasticity Controller Iteration Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticityControllerIterationWaitTime()
	 * @generated
	 * @ordered
	 */
	protected Integer elasticityControllerIterationWaitTime = ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElasticitycontrollerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.ELASTICITYCONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getElasticitycontrollerMinimumLimit() {
		return elasticitycontrollerMinimumLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticitycontrollerMinimumLimit(Integer newElasticitycontrollerMinimumLimit) {
		Integer oldElasticitycontrollerMinimumLimit = elasticitycontrollerMinimumLimit;
		elasticitycontrollerMinimumLimit = newElasticitycontrollerMinimumLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT, oldElasticitycontrollerMinimumLimit, elasticitycontrollerMinimumLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getElasticitycontrollerMaximumLimit() {
		return elasticitycontrollerMaximumLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticitycontrollerMaximumLimit(Integer newElasticitycontrollerMaximumLimit) {
		Integer oldElasticitycontrollerMaximumLimit = elasticitycontrollerMaximumLimit;
		elasticitycontrollerMaximumLimit = newElasticitycontrollerMaximumLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT, oldElasticitycontrollerMaximumLimit, elasticitycontrollerMaximumLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getElasticitycontrollerCoolDuration() {
		return elasticitycontrollerCoolDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticitycontrollerCoolDuration(Integer newElasticitycontrollerCoolDuration) {
		Integer oldElasticitycontrollerCoolDuration = elasticitycontrollerCoolDuration;
		elasticitycontrollerCoolDuration = newElasticitycontrollerCoolDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION, oldElasticitycontrollerCoolDuration, elasticitycontrollerCoolDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getElasticityControllerIterationWaitTime() {
		return elasticityControllerIterationWaitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticityControllerIterationWaitTime(Integer newElasticityControllerIterationWaitTime) {
		Integer oldElasticityControllerIterationWaitTime = elasticityControllerIterationWaitTime;
		elasticityControllerIterationWaitTime = newElasticityControllerIterationWaitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME, oldElasticityControllerIterationWaitTime, elasticityControllerIterationWaitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				return getElasticitycontrollerMinimumLimit();
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				return getElasticitycontrollerMaximumLimit();
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION:
				return getElasticitycontrollerCoolDuration();
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME:
				return getElasticityControllerIterationWaitTime();
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
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				setElasticitycontrollerMinimumLimit((Integer)newValue);
				return;
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				setElasticitycontrollerMaximumLimit((Integer)newValue);
				return;
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION:
				setElasticitycontrollerCoolDuration((Integer)newValue);
				return;
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME:
				setElasticityControllerIterationWaitTime((Integer)newValue);
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
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				setElasticitycontrollerMinimumLimit(ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT);
				return;
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				setElasticitycontrollerMaximumLimit(ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT);
				return;
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION:
				setElasticitycontrollerCoolDuration(ELASTICITYCONTROLLER_COOL_DURATION_EDEFAULT);
				return;
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME:
				setElasticityControllerIterationWaitTime(ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME_EDEFAULT);
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
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT:
				return ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT == null ? elasticitycontrollerMinimumLimit != null : !ELASTICITYCONTROLLER_MINIMUM_LIMIT_EDEFAULT.equals(elasticitycontrollerMinimumLimit);
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT:
				return ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT == null ? elasticitycontrollerMaximumLimit != null : !ELASTICITYCONTROLLER_MAXIMUM_LIMIT_EDEFAULT.equals(elasticitycontrollerMaximumLimit);
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION:
				return ELASTICITYCONTROLLER_COOL_DURATION_EDEFAULT == null ? elasticitycontrollerCoolDuration != null : !ELASTICITYCONTROLLER_COOL_DURATION_EDEFAULT.equals(elasticitycontrollerCoolDuration);
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME:
				return ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME_EDEFAULT == null ? elasticityControllerIterationWaitTime != null : !ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME_EDEFAULT.equals(elasticityControllerIterationWaitTime);
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
		result.append(" (ElasticitycontrollerMinimumLimit: ");
		result.append(elasticitycontrollerMinimumLimit);
		result.append(", ElasticitycontrollerMaximumLimit: ");
		result.append(elasticitycontrollerMaximumLimit);
		result.append(", ElasticitycontrollerCoolDuration: ");
		result.append(elasticitycontrollerCoolDuration);
		result.append(", ElasticityControllerIterationWaitTime: ");
		result.append(elasticityControllerIterationWaitTime);
		result.append(')');
		return result.toString();
	}

} //ElasticitycontrollerImpl
