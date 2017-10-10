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
package org.eclipse.cmf.occi.multicloud.occimonitoring.impl;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroup;
import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostgroup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.HostgroupImpl#getHostgroupIdentifier <em>Hostgroup Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostgroupImpl extends ResourceImpl implements Hostgroup {
	/**
	 * The default value of the '{@link #getHostgroupIdentifier() <em>Hostgroup Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostgroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOSTGROUP_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostgroupIdentifier() <em>Hostgroup Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostgroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Integer hostgroupIdentifier = HOSTGROUP_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostgroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OccimonitoringPackage.Literals.HOSTGROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHostgroupIdentifier() {
		return hostgroupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostgroupIdentifier(Integer newHostgroupIdentifier) {
		Integer oldHostgroupIdentifier = hostgroupIdentifier;
		hostgroupIdentifier = newHostgroupIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.HOSTGROUP__HOSTGROUP_IDENTIFIER, oldHostgroupIdentifier, hostgroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OccimonitoringPackage.HOSTGROUP__HOSTGROUP_IDENTIFIER:
				return getHostgroupIdentifier();
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
			case OccimonitoringPackage.HOSTGROUP__HOSTGROUP_IDENTIFIER:
				setHostgroupIdentifier((Integer)newValue);
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
			case OccimonitoringPackage.HOSTGROUP__HOSTGROUP_IDENTIFIER:
				setHostgroupIdentifier(HOSTGROUP_IDENTIFIER_EDEFAULT);
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
			case OccimonitoringPackage.HOSTGROUP__HOSTGROUP_IDENTIFIER:
				return HOSTGROUP_IDENTIFIER_EDEFAULT == null ? hostgroupIdentifier != null : !HOSTGROUP_IDENTIFIER_EDEFAULT.equals(hostgroupIdentifier);
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
		result.append(" (hostgroupIdentifier: ");
		result.append(hostgroupIdentifier);
		result.append(')');
		return result.toString();
	}

} //HostgroupImpl
