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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontalgroup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalgroupName <em>Horizontalgroup Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalgroupGroupSize <em>Horizontalgroup Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalgroupMaximum <em>Horizontalgroup Maximum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalgroupMinimum <em>Horizontalgroup Minimum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalgroupTemplateName <em>Horizontalgroup Template Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalgroupLoadBalancer <em>Horizontalgroup Load Balancer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HorizontalgroupImpl extends ResourceImpl implements Horizontalgroup {
	/**
	 * The default value of the '{@link #getHorizontalgroupName() <em>Horizontalgroup Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTALGROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalgroupName() <em>Horizontalgroup Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupName()
	 * @generated
	 * @ordered
	 */
	protected String horizontalgroupName = HORIZONTALGROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalgroupGroupSize() <em>Horizontalgroup Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTALGROUP_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalgroupGroupSize() <em>Horizontalgroup Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupGroupSize()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalgroupGroupSize = HORIZONTALGROUP_GROUP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalgroupMaximum() <em>Horizontalgroup Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTALGROUP_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalgroupMaximum() <em>Horizontalgroup Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupMaximum()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalgroupMaximum = HORIZONTALGROUP_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalgroupMinimum() <em>Horizontalgroup Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTALGROUP_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalgroupMinimum() <em>Horizontalgroup Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupMinimum()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalgroupMinimum = HORIZONTALGROUP_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalgroupTemplateName() <em>Horizontalgroup Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTALGROUP_TEMPLATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalgroupTemplateName() <em>Horizontalgroup Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String horizontalgroupTemplateName = HORIZONTALGROUP_TEMPLATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalgroupLoadBalancer() <em>Horizontalgroup Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTALGROUP_LOAD_BALANCER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalgroupLoadBalancer() <em>Horizontalgroup Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalgroupLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected String horizontalgroupLoadBalancer = HORIZONTALGROUP_LOAD_BALANCER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalgroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.HORIZONTALGROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizontalgroupName() {
		return horizontalgroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalgroupName(String newHorizontalgroupName) {
		String oldHorizontalgroupName = horizontalgroupName;
		horizontalgroupName = newHorizontalgroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_NAME, oldHorizontalgroupName, horizontalgroupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalgroupGroupSize() {
		return horizontalgroupGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalgroupGroupSize(Integer newHorizontalgroupGroupSize) {
		Integer oldHorizontalgroupGroupSize = horizontalgroupGroupSize;
		horizontalgroupGroupSize = newHorizontalgroupGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE, oldHorizontalgroupGroupSize, horizontalgroupGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalgroupMaximum() {
		return horizontalgroupMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalgroupMaximum(Integer newHorizontalgroupMaximum) {
		Integer oldHorizontalgroupMaximum = horizontalgroupMaximum;
		horizontalgroupMaximum = newHorizontalgroupMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM, oldHorizontalgroupMaximum, horizontalgroupMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalgroupMinimum() {
		return horizontalgroupMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalgroupMinimum(Integer newHorizontalgroupMinimum) {
		Integer oldHorizontalgroupMinimum = horizontalgroupMinimum;
		horizontalgroupMinimum = newHorizontalgroupMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM, oldHorizontalgroupMinimum, horizontalgroupMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizontalgroupTemplateName() {
		return horizontalgroupTemplateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalgroupTemplateName(String newHorizontalgroupTemplateName) {
		String oldHorizontalgroupTemplateName = horizontalgroupTemplateName;
		horizontalgroupTemplateName = newHorizontalgroupTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME, oldHorizontalgroupTemplateName, horizontalgroupTemplateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizontalgroupLoadBalancer() {
		return horizontalgroupLoadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalgroupLoadBalancer(String newHorizontalgroupLoadBalancer) {
		String oldHorizontalgroupLoadBalancer = horizontalgroupLoadBalancer;
		horizontalgroupLoadBalancer = newHorizontalgroupLoadBalancer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER, oldHorizontalgroupLoadBalancer, horizontalgroupLoadBalancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_NAME:
				return getHorizontalgroupName();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE:
				return getHorizontalgroupGroupSize();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM:
				return getHorizontalgroupMaximum();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM:
				return getHorizontalgroupMinimum();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME:
				return getHorizontalgroupTemplateName();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER:
				return getHorizontalgroupLoadBalancer();
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
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_NAME:
				setHorizontalgroupName((String)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE:
				setHorizontalgroupGroupSize((Integer)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM:
				setHorizontalgroupMaximum((Integer)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM:
				setHorizontalgroupMinimum((Integer)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME:
				setHorizontalgroupTemplateName((String)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER:
				setHorizontalgroupLoadBalancer((String)newValue);
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
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_NAME:
				setHorizontalgroupName(HORIZONTALGROUP_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE:
				setHorizontalgroupGroupSize(HORIZONTALGROUP_GROUP_SIZE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM:
				setHorizontalgroupMaximum(HORIZONTALGROUP_MAXIMUM_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM:
				setHorizontalgroupMinimum(HORIZONTALGROUP_MINIMUM_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME:
				setHorizontalgroupTemplateName(HORIZONTALGROUP_TEMPLATE_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER:
				setHorizontalgroupLoadBalancer(HORIZONTALGROUP_LOAD_BALANCER_EDEFAULT);
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
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_NAME:
				return HORIZONTALGROUP_NAME_EDEFAULT == null ? horizontalgroupName != null : !HORIZONTALGROUP_NAME_EDEFAULT.equals(horizontalgroupName);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE:
				return HORIZONTALGROUP_GROUP_SIZE_EDEFAULT == null ? horizontalgroupGroupSize != null : !HORIZONTALGROUP_GROUP_SIZE_EDEFAULT.equals(horizontalgroupGroupSize);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM:
				return HORIZONTALGROUP_MAXIMUM_EDEFAULT == null ? horizontalgroupMaximum != null : !HORIZONTALGROUP_MAXIMUM_EDEFAULT.equals(horizontalgroupMaximum);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM:
				return HORIZONTALGROUP_MINIMUM_EDEFAULT == null ? horizontalgroupMinimum != null : !HORIZONTALGROUP_MINIMUM_EDEFAULT.equals(horizontalgroupMinimum);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME:
				return HORIZONTALGROUP_TEMPLATE_NAME_EDEFAULT == null ? horizontalgroupTemplateName != null : !HORIZONTALGROUP_TEMPLATE_NAME_EDEFAULT.equals(horizontalgroupTemplateName);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER:
				return HORIZONTALGROUP_LOAD_BALANCER_EDEFAULT == null ? horizontalgroupLoadBalancer != null : !HORIZONTALGROUP_LOAD_BALANCER_EDEFAULT.equals(horizontalgroupLoadBalancer);
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
		result.append(" (horizontalgroupName: ");
		result.append(horizontalgroupName);
		result.append(", horizontalgroupGroupSize: ");
		result.append(horizontalgroupGroupSize);
		result.append(", horizontalgroupMaximum: ");
		result.append(horizontalgroupMaximum);
		result.append(", horizontalgroupMinimum: ");
		result.append(horizontalgroupMinimum);
		result.append(", horizontalgroupTemplateName: ");
		result.append(horizontalgroupTemplateName);
		result.append(", horizontalgroupLoadBalancer: ");
		result.append(horizontalgroupLoadBalancer);
		result.append(')');
		return result.toString();
	}

} //HorizontalgroupImpl
