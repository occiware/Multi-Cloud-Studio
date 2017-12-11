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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.MetricTargetTracking;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamicadjustmentscalingpolicy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentscalingpolicyImpl#getDynamicadjustmentscalingpolicyMetric <em>Dynamicadjustmentscalingpolicy Metric</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentscalingpolicyImpl#isDynamicadjustmentscalingpolicyDisableScaleIn <em>Dynamicadjustmentscalingpolicy Disable Scale In</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.DynamicadjustmentscalingpolicyImpl#getDynamicadjustmentscalingpolicyTarget <em>Dynamicadjustmentscalingpolicy Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicadjustmentscalingpolicyImpl extends DynamicscalingpolicyImpl implements Dynamicadjustmentscalingpolicy {
	/**
	 * The default value of the '{@link #getDynamicadjustmentscalingpolicyMetric() <em>Dynamicadjustmentscalingpolicy Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicadjustmentscalingpolicyMetric()
	 * @generated
	 * @ordered
	 */
	protected static final MetricTargetTracking DYNAMICADJUSTMENTSCALINGPOLICY_METRIC_EDEFAULT = MetricTargetTracking.AVERAGE_CPU_UTILISATION;

	/**
	 * The cached value of the '{@link #getDynamicadjustmentscalingpolicyMetric() <em>Dynamicadjustmentscalingpolicy Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicadjustmentscalingpolicyMetric()
	 * @generated
	 * @ordered
	 */
	protected MetricTargetTracking dynamicadjustmentscalingpolicyMetric = DYNAMICADJUSTMENTSCALINGPOLICY_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isDynamicadjustmentscalingpolicyDisableScaleIn() <em>Dynamicadjustmentscalingpolicy Disable Scale In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicadjustmentscalingpolicyDisableScaleIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicadjustmentscalingpolicyDisableScaleIn() <em>Dynamicadjustmentscalingpolicy Disable Scale In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicadjustmentscalingpolicyDisableScaleIn()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicadjustmentscalingpolicyDisableScaleIn = DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicadjustmentscalingpolicyTarget() <em>Dynamicadjustmentscalingpolicy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicadjustmentscalingpolicyTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Float DYNAMICADJUSTMENTSCALINGPOLICY_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicadjustmentscalingpolicyTarget() <em>Dynamicadjustmentscalingpolicy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicadjustmentscalingpolicyTarget()
	 * @generated
	 * @ordered
	 */
	protected Float dynamicadjustmentscalingpolicyTarget = DYNAMICADJUSTMENTSCALINGPOLICY_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicadjustmentscalingpolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricTargetTracking getDynamicadjustmentscalingpolicyMetric() {
		return dynamicadjustmentscalingpolicyMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicadjustmentscalingpolicyMetric(MetricTargetTracking newDynamicadjustmentscalingpolicyMetric) {
		MetricTargetTracking oldDynamicadjustmentscalingpolicyMetric = dynamicadjustmentscalingpolicyMetric;
		dynamicadjustmentscalingpolicyMetric = newDynamicadjustmentscalingpolicyMetric == null ? DYNAMICADJUSTMENTSCALINGPOLICY_METRIC_EDEFAULT : newDynamicadjustmentscalingpolicyMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC, oldDynamicadjustmentscalingpolicyMetric, dynamicadjustmentscalingpolicyMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicadjustmentscalingpolicyDisableScaleIn() {
		return dynamicadjustmentscalingpolicyDisableScaleIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicadjustmentscalingpolicyDisableScaleIn(boolean newDynamicadjustmentscalingpolicyDisableScaleIn) {
		boolean oldDynamicadjustmentscalingpolicyDisableScaleIn = dynamicadjustmentscalingpolicyDisableScaleIn;
		dynamicadjustmentscalingpolicyDisableScaleIn = newDynamicadjustmentscalingpolicyDisableScaleIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN, oldDynamicadjustmentscalingpolicyDisableScaleIn, dynamicadjustmentscalingpolicyDisableScaleIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getDynamicadjustmentscalingpolicyTarget() {
		return dynamicadjustmentscalingpolicyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicadjustmentscalingpolicyTarget(Float newDynamicadjustmentscalingpolicyTarget) {
		Float oldDynamicadjustmentscalingpolicyTarget = dynamicadjustmentscalingpolicyTarget;
		dynamicadjustmentscalingpolicyTarget = newDynamicadjustmentscalingpolicyTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET, oldDynamicadjustmentscalingpolicyTarget, dynamicadjustmentscalingpolicyTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC:
				return getDynamicadjustmentscalingpolicyMetric();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN:
				return isDynamicadjustmentscalingpolicyDisableScaleIn();
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET:
				return getDynamicadjustmentscalingpolicyTarget();
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
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC:
				setDynamicadjustmentscalingpolicyMetric((MetricTargetTracking)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN:
				setDynamicadjustmentscalingpolicyDisableScaleIn((Boolean)newValue);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET:
				setDynamicadjustmentscalingpolicyTarget((Float)newValue);
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
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC:
				setDynamicadjustmentscalingpolicyMetric(DYNAMICADJUSTMENTSCALINGPOLICY_METRIC_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN:
				setDynamicadjustmentscalingpolicyDisableScaleIn(DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN_EDEFAULT);
				return;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET:
				setDynamicadjustmentscalingpolicyTarget(DYNAMICADJUSTMENTSCALINGPOLICY_TARGET_EDEFAULT);
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
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC:
				return dynamicadjustmentscalingpolicyMetric != DYNAMICADJUSTMENTSCALINGPOLICY_METRIC_EDEFAULT;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN:
				return dynamicadjustmentscalingpolicyDisableScaleIn != DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN_EDEFAULT;
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET:
				return DYNAMICADJUSTMENTSCALINGPOLICY_TARGET_EDEFAULT == null ? dynamicadjustmentscalingpolicyTarget != null : !DYNAMICADJUSTMENTSCALINGPOLICY_TARGET_EDEFAULT.equals(dynamicadjustmentscalingpolicyTarget);
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
		result.append(" (dynamicadjustmentscalingpolicyMetric: ");
		result.append(dynamicadjustmentscalingpolicyMetric);
		result.append(", dynamicadjustmentscalingpolicyDisableScaleIn: ");
		result.append(dynamicadjustmentscalingpolicyDisableScaleIn);
		result.append(", dynamicadjustmentscalingpolicyTarget: ");
		result.append(dynamicadjustmentscalingpolicyTarget);
		result.append(')');
		return result.toString();
	}

} //DynamicadjustmentscalingpolicyImpl
