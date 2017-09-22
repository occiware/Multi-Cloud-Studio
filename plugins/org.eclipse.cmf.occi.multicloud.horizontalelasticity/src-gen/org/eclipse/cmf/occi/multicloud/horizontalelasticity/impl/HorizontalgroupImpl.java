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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalGroupName <em>Horizontal Group Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalGroupGroupSize <em>Horizontal Group Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalGroupMaximum <em>Horizontal Group Maximum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalGroupMinimum <em>Horizontal Group Minimum</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalGroupTemplateName <em>Horizontal Group Template Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalgroupImpl#getHorizontalGroupLoadBalancer <em>Horizontal Group Load Balancer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HorizontalgroupImpl extends ResourceImpl implements Horizontalgroup {
	/**
	 * The default value of the '{@link #getHorizontalGroupName() <em>Horizontal Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTAL_GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalGroupName() <em>Horizontal Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupName()
	 * @generated
	 * @ordered
	 */
	protected String horizontalGroupName = HORIZONTAL_GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalGroupGroupSize() <em>Horizontal Group Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupGroupSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_GROUP_GROUP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalGroupGroupSize() <em>Horizontal Group Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupGroupSize()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalGroupGroupSize = HORIZONTAL_GROUP_GROUP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalGroupMaximum() <em>Horizontal Group Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_GROUP_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalGroupMaximum() <em>Horizontal Group Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupMaximum()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalGroupMaximum = HORIZONTAL_GROUP_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalGroupMinimum() <em>Horizontal Group Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_GROUP_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalGroupMinimum() <em>Horizontal Group Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupMinimum()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalGroupMinimum = HORIZONTAL_GROUP_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalGroupTemplateName() <em>Horizontal Group Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTAL_GROUP_TEMPLATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalGroupTemplateName() <em>Horizontal Group Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String horizontalGroupTemplateName = HORIZONTAL_GROUP_TEMPLATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalGroupLoadBalancer() <em>Horizontal Group Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTAL_GROUP_LOAD_BALANCER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalGroupLoadBalancer() <em>Horizontal Group Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalGroupLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected String horizontalGroupLoadBalancer = HORIZONTAL_GROUP_LOAD_BALANCER_EDEFAULT;

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
	public String getHorizontalGroupName() {
		return horizontalGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalGroupName(String newHorizontalGroupName) {
		String oldHorizontalGroupName = horizontalGroupName;
		horizontalGroupName = newHorizontalGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_NAME, oldHorizontalGroupName, horizontalGroupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalGroupGroupSize() {
		return horizontalGroupGroupSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalGroupGroupSize(Integer newHorizontalGroupGroupSize) {
		Integer oldHorizontalGroupGroupSize = horizontalGroupGroupSize;
		horizontalGroupGroupSize = newHorizontalGroupGroupSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE, oldHorizontalGroupGroupSize, horizontalGroupGroupSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalGroupMaximum() {
		return horizontalGroupMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalGroupMaximum(Integer newHorizontalGroupMaximum) {
		Integer oldHorizontalGroupMaximum = horizontalGroupMaximum;
		horizontalGroupMaximum = newHorizontalGroupMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM, oldHorizontalGroupMaximum, horizontalGroupMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalGroupMinimum() {
		return horizontalGroupMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalGroupMinimum(Integer newHorizontalGroupMinimum) {
		Integer oldHorizontalGroupMinimum = horizontalGroupMinimum;
		horizontalGroupMinimum = newHorizontalGroupMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM, oldHorizontalGroupMinimum, horizontalGroupMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizontalGroupTemplateName() {
		return horizontalGroupTemplateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalGroupTemplateName(String newHorizontalGroupTemplateName) {
		String oldHorizontalGroupTemplateName = horizontalGroupTemplateName;
		horizontalGroupTemplateName = newHorizontalGroupTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME, oldHorizontalGroupTemplateName, horizontalGroupTemplateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizontalGroupLoadBalancer() {
		return horizontalGroupLoadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalGroupLoadBalancer(String newHorizontalGroupLoadBalancer) {
		String oldHorizontalGroupLoadBalancer = horizontalGroupLoadBalancer;
		horizontalGroupLoadBalancer = newHorizontalGroupLoadBalancer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER, oldHorizontalGroupLoadBalancer, horizontalGroupLoadBalancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Horizontalgroup!create()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_NAME:
				return getHorizontalGroupName();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE:
				return getHorizontalGroupGroupSize();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM:
				return getHorizontalGroupMaximum();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM:
				return getHorizontalGroupMinimum();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME:
				return getHorizontalGroupTemplateName();
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER:
				return getHorizontalGroupLoadBalancer();
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
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_NAME:
				setHorizontalGroupName((String)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE:
				setHorizontalGroupGroupSize((Integer)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM:
				setHorizontalGroupMaximum((Integer)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM:
				setHorizontalGroupMinimum((Integer)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME:
				setHorizontalGroupTemplateName((String)newValue);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER:
				setHorizontalGroupLoadBalancer((String)newValue);
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
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_NAME:
				setHorizontalGroupName(HORIZONTAL_GROUP_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE:
				setHorizontalGroupGroupSize(HORIZONTAL_GROUP_GROUP_SIZE_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM:
				setHorizontalGroupMaximum(HORIZONTAL_GROUP_MAXIMUM_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM:
				setHorizontalGroupMinimum(HORIZONTAL_GROUP_MINIMUM_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME:
				setHorizontalGroupTemplateName(HORIZONTAL_GROUP_TEMPLATE_NAME_EDEFAULT);
				return;
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER:
				setHorizontalGroupLoadBalancer(HORIZONTAL_GROUP_LOAD_BALANCER_EDEFAULT);
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
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_NAME:
				return HORIZONTAL_GROUP_NAME_EDEFAULT == null ? horizontalGroupName != null : !HORIZONTAL_GROUP_NAME_EDEFAULT.equals(horizontalGroupName);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE:
				return HORIZONTAL_GROUP_GROUP_SIZE_EDEFAULT == null ? horizontalGroupGroupSize != null : !HORIZONTAL_GROUP_GROUP_SIZE_EDEFAULT.equals(horizontalGroupGroupSize);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM:
				return HORIZONTAL_GROUP_MAXIMUM_EDEFAULT == null ? horizontalGroupMaximum != null : !HORIZONTAL_GROUP_MAXIMUM_EDEFAULT.equals(horizontalGroupMaximum);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM:
				return HORIZONTAL_GROUP_MINIMUM_EDEFAULT == null ? horizontalGroupMinimum != null : !HORIZONTAL_GROUP_MINIMUM_EDEFAULT.equals(horizontalGroupMinimum);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME:
				return HORIZONTAL_GROUP_TEMPLATE_NAME_EDEFAULT == null ? horizontalGroupTemplateName != null : !HORIZONTAL_GROUP_TEMPLATE_NAME_EDEFAULT.equals(horizontalGroupTemplateName);
			case HorizontalelasticityPackage.HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER:
				return HORIZONTAL_GROUP_LOAD_BALANCER_EDEFAULT == null ? horizontalGroupLoadBalancer != null : !HORIZONTAL_GROUP_LOAD_BALANCER_EDEFAULT.equals(horizontalGroupLoadBalancer);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HorizontalelasticityPackage.HORIZONTALGROUP___CREATE:
				create();
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
		result.append(" (HorizontalGroupName: ");
		result.append(horizontalGroupName);
		result.append(", HorizontalGroupGroupSize: ");
		result.append(horizontalGroupGroupSize);
		result.append(", HorizontalGroupMaximum: ");
		result.append(horizontalGroupMaximum);
		result.append(", HorizontalGroupMinimum: ");
		result.append(horizontalGroupMinimum);
		result.append(", HorizontalGroupTemplateName: ");
		result.append(horizontalGroupTemplateName);
		result.append(", HorizontalGroupLoadBalancer: ");
		result.append(horizontalGroupLoadBalancer);
		result.append(')');
		return result.toString();
	}

} //HorizontalgroupImpl
