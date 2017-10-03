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

import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zabbixtemplate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixtemplateImpl#getZabbixtemplateIdentifier <em>Zabbixtemplate Identifier</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixtemplateImpl#getZabbixtemplateHostgid <em>Zabbixtemplate Hostgid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixtemplateImpl#getZabbixtemplateHostsids <em>Zabbixtemplate Hostsids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZabbixtemplateImpl extends ResourceImpl implements Zabbixtemplate {
	/**
	 * The default value of the '{@link #getZabbixtemplateIdentifier() <em>Zabbixtemplate Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixtemplateIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZABBIXTEMPLATE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZabbixtemplateIdentifier() <em>Zabbixtemplate Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixtemplateIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Integer zabbixtemplateIdentifier = ZABBIXTEMPLATE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getZabbixtemplateHostgid() <em>Zabbixtemplate Hostgid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixtemplateHostgid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZABBIXTEMPLATE_HOSTGID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZabbixtemplateHostgid() <em>Zabbixtemplate Hostgid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixtemplateHostgid()
	 * @generated
	 * @ordered
	 */
	protected Integer zabbixtemplateHostgid = ZABBIXTEMPLATE_HOSTGID_EDEFAULT;

	/**
	 * The default value of the '{@link #getZabbixtemplateHostsids() <em>Zabbixtemplate Hostsids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixtemplateHostsids()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZABBIXTEMPLATE_HOSTSIDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZabbixtemplateHostsids() <em>Zabbixtemplate Hostsids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZabbixtemplateHostsids()
	 * @generated
	 * @ordered
	 */
	protected Integer zabbixtemplateHostsids = ZABBIXTEMPLATE_HOSTSIDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZabbixtemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OccimonitoringPackage.Literals.ZABBIXTEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getZabbixtemplateIdentifier() {
		return zabbixtemplateIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZabbixtemplateIdentifier(Integer newZabbixtemplateIdentifier) {
		Integer oldZabbixtemplateIdentifier = zabbixtemplateIdentifier;
		zabbixtemplateIdentifier = newZabbixtemplateIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_IDENTIFIER, oldZabbixtemplateIdentifier, zabbixtemplateIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getZabbixtemplateHostgid() {
		return zabbixtemplateHostgid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZabbixtemplateHostgid(Integer newZabbixtemplateHostgid) {
		Integer oldZabbixtemplateHostgid = zabbixtemplateHostgid;
		zabbixtemplateHostgid = newZabbixtemplateHostgid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTGID, oldZabbixtemplateHostgid, zabbixtemplateHostgid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getZabbixtemplateHostsids() {
		return zabbixtemplateHostsids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZabbixtemplateHostsids(Integer newZabbixtemplateHostsids) {
		Integer oldZabbixtemplateHostsids = zabbixtemplateHostsids;
		zabbixtemplateHostsids = newZabbixtemplateHostsids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTSIDS, oldZabbixtemplateHostsids, zabbixtemplateHostsids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_IDENTIFIER:
				return getZabbixtemplateIdentifier();
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTGID:
				return getZabbixtemplateHostgid();
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTSIDS:
				return getZabbixtemplateHostsids();
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
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_IDENTIFIER:
				setZabbixtemplateIdentifier((Integer)newValue);
				return;
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTGID:
				setZabbixtemplateHostgid((Integer)newValue);
				return;
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTSIDS:
				setZabbixtemplateHostsids((Integer)newValue);
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
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_IDENTIFIER:
				setZabbixtemplateIdentifier(ZABBIXTEMPLATE_IDENTIFIER_EDEFAULT);
				return;
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTGID:
				setZabbixtemplateHostgid(ZABBIXTEMPLATE_HOSTGID_EDEFAULT);
				return;
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTSIDS:
				setZabbixtemplateHostsids(ZABBIXTEMPLATE_HOSTSIDS_EDEFAULT);
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
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_IDENTIFIER:
				return ZABBIXTEMPLATE_IDENTIFIER_EDEFAULT == null ? zabbixtemplateIdentifier != null : !ZABBIXTEMPLATE_IDENTIFIER_EDEFAULT.equals(zabbixtemplateIdentifier);
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTGID:
				return ZABBIXTEMPLATE_HOSTGID_EDEFAULT == null ? zabbixtemplateHostgid != null : !ZABBIXTEMPLATE_HOSTGID_EDEFAULT.equals(zabbixtemplateHostgid);
			case OccimonitoringPackage.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTSIDS:
				return ZABBIXTEMPLATE_HOSTSIDS_EDEFAULT == null ? zabbixtemplateHostsids != null : !ZABBIXTEMPLATE_HOSTSIDS_EDEFAULT.equals(zabbixtemplateHostsids);
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
		result.append(" (zabbixtemplateIdentifier: ");
		result.append(zabbixtemplateIdentifier);
		result.append(", zabbixtemplateHostgid: ");
		result.append(zabbixtemplateHostgid);
		result.append(", zabbixtemplateHostsids: ");
		result.append(zabbixtemplateHostsids);
		result.append(')');
		return result.toString();
	}

} //ZabbixtemplateImpl
