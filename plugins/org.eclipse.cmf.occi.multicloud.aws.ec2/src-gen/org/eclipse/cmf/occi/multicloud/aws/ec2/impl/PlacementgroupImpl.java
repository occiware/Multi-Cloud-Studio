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
package org.eclipse.cmf.occi.multicloud.aws.ec2.impl;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placementgroup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl#getHostId <em>Host Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl#getSpreadDomain <em>Spread Domain</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl#getTenancy <em>Tenancy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.PlacementgroupImpl#getZoneName <em>Zone Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlacementgroupImpl extends MixinBaseImpl implements Placementgroup {
	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAffinity() <em>Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFINITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAffinity() <em>Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected String affinity = AFFINITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostId() <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostId()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostId() <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostId()
	 * @generated
	 * @ordered
	 */
	protected String hostId = HOST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadDomain() <em>Spread Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String SPREAD_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpreadDomain() <em>Spread Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadDomain()
	 * @generated
	 * @ordered
	 */
	protected String spreadDomain = SPREAD_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenancy() <em>Tenancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenancy()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenancy() <em>Tenancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenancy()
	 * @generated
	 * @ordered
	 */
	protected String tenancy = TENANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoneName() <em>Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneName()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneName() <em>Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneName()
	 * @generated
	 * @ordered
	 */
	protected String zoneName = ZONE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementgroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getPlacementgroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PLACEMENTGROUP__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAffinity() {
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinity(String newAffinity) {
		String oldAffinity = affinity;
		affinity = newAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PLACEMENTGROUP__AFFINITY, oldAffinity, affinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostId() {
		return hostId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostId(String newHostId) {
		String oldHostId = hostId;
		hostId = newHostId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PLACEMENTGROUP__HOST_ID, oldHostId, hostId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpreadDomain() {
		return spreadDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadDomain(String newSpreadDomain) {
		String oldSpreadDomain = spreadDomain;
		spreadDomain = newSpreadDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PLACEMENTGROUP__SPREAD_DOMAIN, oldSpreadDomain, spreadDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenancy() {
		return tenancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenancy(String newTenancy) {
		String oldTenancy = tenancy;
		tenancy = newTenancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PLACEMENTGROUP__TENANCY, oldTenancy, tenancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZoneName() {
		return zoneName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneName(String newZoneName) {
		String oldZoneName = zoneName;
		zoneName = newZoneName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.PLACEMENTGROUP__ZONE_NAME, oldZoneName, zoneName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.PLACEMENTGROUP__GROUP_NAME:
				return getGroupName();
			case Ec2Package.PLACEMENTGROUP__AFFINITY:
				return getAffinity();
			case Ec2Package.PLACEMENTGROUP__HOST_ID:
				return getHostId();
			case Ec2Package.PLACEMENTGROUP__SPREAD_DOMAIN:
				return getSpreadDomain();
			case Ec2Package.PLACEMENTGROUP__TENANCY:
				return getTenancy();
			case Ec2Package.PLACEMENTGROUP__ZONE_NAME:
				return getZoneName();
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
			case Ec2Package.PLACEMENTGROUP__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case Ec2Package.PLACEMENTGROUP__AFFINITY:
				setAffinity((String)newValue);
				return;
			case Ec2Package.PLACEMENTGROUP__HOST_ID:
				setHostId((String)newValue);
				return;
			case Ec2Package.PLACEMENTGROUP__SPREAD_DOMAIN:
				setSpreadDomain((String)newValue);
				return;
			case Ec2Package.PLACEMENTGROUP__TENANCY:
				setTenancy((String)newValue);
				return;
			case Ec2Package.PLACEMENTGROUP__ZONE_NAME:
				setZoneName((String)newValue);
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
			case Ec2Package.PLACEMENTGROUP__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case Ec2Package.PLACEMENTGROUP__AFFINITY:
				setAffinity(AFFINITY_EDEFAULT);
				return;
			case Ec2Package.PLACEMENTGROUP__HOST_ID:
				setHostId(HOST_ID_EDEFAULT);
				return;
			case Ec2Package.PLACEMENTGROUP__SPREAD_DOMAIN:
				setSpreadDomain(SPREAD_DOMAIN_EDEFAULT);
				return;
			case Ec2Package.PLACEMENTGROUP__TENANCY:
				setTenancy(TENANCY_EDEFAULT);
				return;
			case Ec2Package.PLACEMENTGROUP__ZONE_NAME:
				setZoneName(ZONE_NAME_EDEFAULT);
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
			case Ec2Package.PLACEMENTGROUP__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case Ec2Package.PLACEMENTGROUP__AFFINITY:
				return AFFINITY_EDEFAULT == null ? affinity != null : !AFFINITY_EDEFAULT.equals(affinity);
			case Ec2Package.PLACEMENTGROUP__HOST_ID:
				return HOST_ID_EDEFAULT == null ? hostId != null : !HOST_ID_EDEFAULT.equals(hostId);
			case Ec2Package.PLACEMENTGROUP__SPREAD_DOMAIN:
				return SPREAD_DOMAIN_EDEFAULT == null ? spreadDomain != null : !SPREAD_DOMAIN_EDEFAULT.equals(spreadDomain);
			case Ec2Package.PLACEMENTGROUP__TENANCY:
				return TENANCY_EDEFAULT == null ? tenancy != null : !TENANCY_EDEFAULT.equals(tenancy);
			case Ec2Package.PLACEMENTGROUP__ZONE_NAME:
				return ZONE_NAME_EDEFAULT == null ? zoneName != null : !ZONE_NAME_EDEFAULT.equals(zoneName);
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
		result.append(" (groupName: ");
		result.append(groupName);
		result.append(", affinity: ");
		result.append(affinity);
		result.append(", hostId: ");
		result.append(hostId);
		result.append(", spreadDomain: ");
		result.append(spreadDomain);
		result.append(", tenancy: ");
		result.append(tenancy);
		result.append(", zoneName: ");
		result.append(zoneName);
		result.append(')');
		return result.toString();
	}

} //PlacementgroupImpl
