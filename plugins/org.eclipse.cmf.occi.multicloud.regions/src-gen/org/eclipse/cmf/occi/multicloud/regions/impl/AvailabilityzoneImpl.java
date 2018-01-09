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
package org.eclipse.cmf.occi.multicloud.regions.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.regions.Availabilityzone;
import org.eclipse.cmf.occi.multicloud.regions.RegionsPackage;
import org.eclipse.cmf.occi.multicloud.regions.RegionsTables;

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
 * An implementation of the model object '<em><b>Availabilityzone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl#getZoneName <em>Zone Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl#getZoneMessage <em>Zone Message</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.impl.AvailabilityzoneImpl#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityzoneImpl extends MixinBaseImpl implements Availabilityzone {
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
	 * The default value of the '{@link #getZoneMessage() <em>Zone Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneMessage() <em>Zone Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneMessage()
	 * @generated
	 * @ordered
	 */
	protected String zoneMessage = ZONE_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean available = AVAILABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityzoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegionsPackage.Literals.AVAILABILITYZONE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RegionsPackage.AVAILABILITYZONE__ZONE_NAME, oldZoneName, zoneName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZoneMessage() {
		return zoneMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneMessage(String newZoneMessage) {
		String oldZoneMessage = zoneMessage;
		zoneMessage = newZoneMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegionsPackage.AVAILABILITYZONE__ZONE_MESSAGE, oldZoneMessage, zoneMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailable(boolean newAvailable) {
		boolean oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegionsPackage.AVAILABILITYZONE__AVAILABLE, oldAvailable, available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegionsPackage.AVAILABILITYZONE__ZONE_NAME:
				return getZoneName();
			case RegionsPackage.AVAILABILITYZONE__ZONE_MESSAGE:
				return getZoneMessage();
			case RegionsPackage.AVAILABILITYZONE__AVAILABLE:
				return isAvailable();
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
			case RegionsPackage.AVAILABILITYZONE__ZONE_NAME:
				setZoneName((String)newValue);
				return;
			case RegionsPackage.AVAILABILITYZONE__ZONE_MESSAGE:
				setZoneMessage((String)newValue);
				return;
			case RegionsPackage.AVAILABILITYZONE__AVAILABLE:
				setAvailable((Boolean)newValue);
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
			case RegionsPackage.AVAILABILITYZONE__ZONE_NAME:
				setZoneName(ZONE_NAME_EDEFAULT);
				return;
			case RegionsPackage.AVAILABILITYZONE__ZONE_MESSAGE:
				setZoneMessage(ZONE_MESSAGE_EDEFAULT);
				return;
			case RegionsPackage.AVAILABILITYZONE__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
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
			case RegionsPackage.AVAILABILITYZONE__ZONE_NAME:
				return ZONE_NAME_EDEFAULT == null ? zoneName != null : !ZONE_NAME_EDEFAULT.equals(zoneName);
			case RegionsPackage.AVAILABILITYZONE__ZONE_MESSAGE:
				return ZONE_MESSAGE_EDEFAULT == null ? zoneMessage != null : !ZONE_MESSAGE_EDEFAULT.equals(zoneMessage);
			case RegionsPackage.AVAILABILITYZONE__AVAILABLE:
				return available != AVAILABLE_EDEFAULT;
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
		result.append(" (zoneName: ");
		result.append(zoneName);
		result.append(", zoneMessage: ");
		result.append(zoneMessage);
		result.append(", available: ");
		result.append(available);
		result.append(')');
		return result.toString();
	}

} //AvailabilityzoneImpl
