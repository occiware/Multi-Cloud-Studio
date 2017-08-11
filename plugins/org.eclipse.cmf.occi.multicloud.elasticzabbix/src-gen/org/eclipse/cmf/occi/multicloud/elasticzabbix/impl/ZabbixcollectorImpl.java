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
package org.eclipse.cmf.occi.multicloud.elasticzabbix.impl;

import org.eclipse.cmf.occi.monitoring.impl.CollectorImpl;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zabbixcollector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixcollectorImpl#getInstanceIp <em>Instance Ip</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixcollectorImpl#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZabbixcollectorImpl extends CollectorImpl implements Zabbixcollector {
	/**
	 * The default value of the '{@link #getInstanceIp() <em>Instance Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceIp()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceIp() <em>Instance Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceIp()
	 * @generated
	 * @ordered
	 */
	protected String instanceIp = INSTANCE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZabbixcollectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElasticzabbixPackage.Literals.ZABBIXCOLLECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceIp() {
		return instanceIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceIp(String newInstanceIp) {
		String oldInstanceIp = instanceIp;
		instanceIp = newInstanceIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_IP, oldInstanceIp, instanceIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_NAME, oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_IP:
				return getInstanceIp();
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_NAME:
				return getInstanceName();
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
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_IP:
				setInstanceIp((String)newValue);
				return;
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_NAME:
				setInstanceName((String)newValue);
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
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_IP:
				setInstanceIp(INSTANCE_IP_EDEFAULT);
				return;
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
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
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_IP:
				return INSTANCE_IP_EDEFAULT == null ? instanceIp != null : !INSTANCE_IP_EDEFAULT.equals(instanceIp);
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
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
		result.append(" (instanceIp: ");
		result.append(instanceIp);
		result.append(", instanceName: ");
		result.append(instanceName);
		result.append(')');
		return result.toString();
	}

} //ZabbixcollectorImpl
