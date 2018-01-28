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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;
import org.eclipse.cmf.occi.multicloud.regions.Region;
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
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.impl.RegionImpl#getRegionId <em>Region Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.regions.impl.RegionImpl#getRegionDescription <em>Region Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends ResourceImpl implements Region {
	/**
	 * The default value of the '{@link #getRegionId() <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionId()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRegionId() <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionId()
	 * @generated
	 * @ordered
	 */
	protected String regionId = REGION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRegionDescription() <em>Region Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRegionDescription() <em>Region Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionDescription()
	 * @generated
	 * @ordered
	 */
	protected String regionDescription = REGION_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegionsPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionId() {
		return regionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionId(String newRegionId) {
		String oldRegionId = regionId;
		regionId = newRegionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegionsPackage.REGION__REGION_ID, oldRegionId, regionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionDescription() {
		return regionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionDescription(String newRegionDescription) {
		String oldRegionDescription = regionDescription;
		regionDescription = newRegionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegionsPackage.REGION__REGION_DESCRIPTION, oldRegionDescription, regionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegionsPackage.REGION__REGION_ID:
				return getRegionId();
			case RegionsPackage.REGION__REGION_DESCRIPTION:
				return getRegionDescription();
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
			case RegionsPackage.REGION__REGION_ID:
				setRegionId((String)newValue);
				return;
			case RegionsPackage.REGION__REGION_DESCRIPTION:
				setRegionDescription((String)newValue);
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
			case RegionsPackage.REGION__REGION_ID:
				setRegionId(REGION_ID_EDEFAULT);
				return;
			case RegionsPackage.REGION__REGION_DESCRIPTION:
				setRegionDescription(REGION_DESCRIPTION_EDEFAULT);
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
			case RegionsPackage.REGION__REGION_ID:
				return REGION_ID_EDEFAULT == null ? regionId != null : !REGION_ID_EDEFAULT.equals(regionId);
			case RegionsPackage.REGION__REGION_DESCRIPTION:
				return REGION_DESCRIPTION_EDEFAULT == null ? regionDescription != null : !REGION_DESCRIPTION_EDEFAULT.equals(regionDescription);
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
		result.append(" (regionId: ");
		result.append(regionId);
		result.append(", regionDescription: ");
		result.append(regionDescription);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
