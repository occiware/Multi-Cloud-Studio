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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamicadjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl#getDynamicAdjustmentName <em>Dynamic Adjustment Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl#getDynamicAdjustmentMetric <em>Dynamic Adjustment Metric</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl#getDynamicAdjustmentCoolDuration <em>Dynamic Adjustment Cool Duration</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl#isDynamicAdjustmentDisableScaleIn <em>Dynamic Adjustment Disable Scale In</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentImpl#getDynamicAdjustmentTarget <em>Dynamic Adjustment Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicadjustmentImpl extends DynamicImpl implements Dynamicadjustment {
	/**
	 * The default value of the '{@link #getDynamicAdjustmentName() <em>Dynamic Adjustment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_ADJUSTMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicAdjustmentName() <em>Dynamic Adjustment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentName()
	 * @generated
	 * @ordered
	 */
	protected String dynamicAdjustmentName = DYNAMIC_ADJUSTMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicAdjustmentMetric() <em>Dynamic Adjustment Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentMetric()
	 * @generated
	 * @ordered
	 */
	protected static final MetricTargetTracking DYNAMIC_ADJUSTMENT_METRIC_EDEFAULT = MetricTargetTracking.AVERAGE_CPU_UTILISATION;

	/**
	 * The cached value of the '{@link #getDynamicAdjustmentMetric() <em>Dynamic Adjustment Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentMetric()
	 * @generated
	 * @ordered
	 */
	protected MetricTargetTracking dynamicAdjustmentMetric = DYNAMIC_ADJUSTMENT_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicAdjustmentCoolDuration() <em>Dynamic Adjustment Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DYNAMIC_ADJUSTMENT_COOL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicAdjustmentCoolDuration() <em>Dynamic Adjustment Cool Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentCoolDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer dynamicAdjustmentCoolDuration = DYNAMIC_ADJUSTMENT_COOL_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDynamicAdjustmentDisableScaleIn() <em>Dynamic Adjustment Disable Scale In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicAdjustmentDisableScaleIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicAdjustmentDisableScaleIn() <em>Dynamic Adjustment Disable Scale In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicAdjustmentDisableScaleIn()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicAdjustmentDisableScaleIn = DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicAdjustmentTarget() <em>Dynamic Adjustment Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Float DYNAMIC_ADJUSTMENT_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicAdjustmentTarget() <em>Dynamic Adjustment Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicAdjustmentTarget()
	 * @generated
	 * @ordered
	 */
	protected Float dynamicAdjustmentTarget = DYNAMIC_ADJUSTMENT_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicadjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDynamicAdjustmentName() {
		return dynamicAdjustmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicAdjustmentName(String newDynamicAdjustmentName) {
		String oldDynamicAdjustmentName = dynamicAdjustmentName;
		dynamicAdjustmentName = newDynamicAdjustmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME, oldDynamicAdjustmentName, dynamicAdjustmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricTargetTracking getDynamicAdjustmentMetric() {
		return dynamicAdjustmentMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicAdjustmentMetric(MetricTargetTracking newDynamicAdjustmentMetric) {
		MetricTargetTracking oldDynamicAdjustmentMetric = dynamicAdjustmentMetric;
		dynamicAdjustmentMetric = newDynamicAdjustmentMetric == null ? DYNAMIC_ADJUSTMENT_METRIC_EDEFAULT : newDynamicAdjustmentMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC, oldDynamicAdjustmentMetric, dynamicAdjustmentMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDynamicAdjustmentCoolDuration() {
		return dynamicAdjustmentCoolDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicAdjustmentCoolDuration(Integer newDynamicAdjustmentCoolDuration) {
		Integer oldDynamicAdjustmentCoolDuration = dynamicAdjustmentCoolDuration;
		dynamicAdjustmentCoolDuration = newDynamicAdjustmentCoolDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION, oldDynamicAdjustmentCoolDuration, dynamicAdjustmentCoolDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicAdjustmentDisableScaleIn() {
		return dynamicAdjustmentDisableScaleIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicAdjustmentDisableScaleIn(boolean newDynamicAdjustmentDisableScaleIn) {
		boolean oldDynamicAdjustmentDisableScaleIn = dynamicAdjustmentDisableScaleIn;
		dynamicAdjustmentDisableScaleIn = newDynamicAdjustmentDisableScaleIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN, oldDynamicAdjustmentDisableScaleIn, dynamicAdjustmentDisableScaleIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getDynamicAdjustmentTarget() {
		return dynamicAdjustmentTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicAdjustmentTarget(Float newDynamicAdjustmentTarget) {
		Float oldDynamicAdjustmentTarget = dynamicAdjustmentTarget;
		dynamicAdjustmentTarget = newDynamicAdjustmentTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET, oldDynamicAdjustmentTarget, dynamicAdjustmentTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME:
				return getDynamicAdjustmentName();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC:
				return getDynamicAdjustmentMetric();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION:
				return getDynamicAdjustmentCoolDuration();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN:
				return isDynamicAdjustmentDisableScaleIn();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET:
				return getDynamicAdjustmentTarget();
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
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME:
				setDynamicAdjustmentName((String)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC:
				setDynamicAdjustmentMetric((MetricTargetTracking)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION:
				setDynamicAdjustmentCoolDuration((Integer)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN:
				setDynamicAdjustmentDisableScaleIn((Boolean)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET:
				setDynamicAdjustmentTarget((Float)newValue);
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
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME:
				setDynamicAdjustmentName(DYNAMIC_ADJUSTMENT_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC:
				setDynamicAdjustmentMetric(DYNAMIC_ADJUSTMENT_METRIC_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION:
				setDynamicAdjustmentCoolDuration(DYNAMIC_ADJUSTMENT_COOL_DURATION_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN:
				setDynamicAdjustmentDisableScaleIn(DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET:
				setDynamicAdjustmentTarget(DYNAMIC_ADJUSTMENT_TARGET_EDEFAULT);
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
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME:
				return DYNAMIC_ADJUSTMENT_NAME_EDEFAULT == null ? dynamicAdjustmentName != null : !DYNAMIC_ADJUSTMENT_NAME_EDEFAULT.equals(dynamicAdjustmentName);
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC:
				return dynamicAdjustmentMetric != DYNAMIC_ADJUSTMENT_METRIC_EDEFAULT;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION:
				return DYNAMIC_ADJUSTMENT_COOL_DURATION_EDEFAULT == null ? dynamicAdjustmentCoolDuration != null : !DYNAMIC_ADJUSTMENT_COOL_DURATION_EDEFAULT.equals(dynamicAdjustmentCoolDuration);
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN:
				return dynamicAdjustmentDisableScaleIn != DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN_EDEFAULT;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET:
				return DYNAMIC_ADJUSTMENT_TARGET_EDEFAULT == null ? dynamicAdjustmentTarget != null : !DYNAMIC_ADJUSTMENT_TARGET_EDEFAULT.equals(dynamicAdjustmentTarget);
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
		result.append(" (dynamicAdjustmentName: ");
		result.append(dynamicAdjustmentName);
		result.append(", dynamicAdjustmentMetric: ");
		result.append(dynamicAdjustmentMetric);
		result.append(", dynamicAdjustmentCoolDuration: ");
		result.append(dynamicAdjustmentCoolDuration);
		result.append(", dynamicAdjustmentDisableScaleIn: ");
		result.append(dynamicAdjustmentDisableScaleIn);
		result.append(", dynamicAdjustmentTarget: ");
		result.append(dynamicAdjustmentTarget);
		result.append(')');
		return result.toString();
	}

} //DynamicadjustmentImpl
