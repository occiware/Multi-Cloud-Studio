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
package org.eclipse.cmf.occi.multicloud.vmware.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareTables;
import org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders;

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
 * An implementation of the model object '<em><b>Vmwarefolders</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl#getDatacentername <em>Datacentername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl#getDatastorename <em>Datastorename</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl#getClustername <em>Clustername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl#getHostsystemname <em>Hostsystemname</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmwarefoldersImpl#getInventorypath <em>Inventorypath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VmwarefoldersImpl extends MixinBaseImpl implements Vmwarefolders {
	/**
	 * The default value of the '{@link #getDatacentername() <em>Datacentername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacentername()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatacentername() <em>Datacentername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacentername()
	 * @generated
	 * @ordered
	 */
	protected String datacentername = DATACENTERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatastorename() <em>Datastorename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastorename()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASTORENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatastorename() <em>Datastorename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastorename()
	 * @generated
	 * @ordered
	 */
	protected String datastorename = DATASTORENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClustername() <em>Clustername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClustername()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClustername() <em>Clustername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClustername()
	 * @generated
	 * @ordered
	 */
	protected String clustername = CLUSTERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostsystemname() <em>Hostsystemname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostsystemname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTSYSTEMNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostsystemname() <em>Hostsystemname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostsystemname()
	 * @generated
	 * @ordered
	 */
	protected String hostsystemname = HOSTSYSTEMNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInventorypath() <em>Inventorypath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventorypath()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORYPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventorypath() <em>Inventorypath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventorypath()
	 * @generated
	 * @ordered
	 */
	protected String inventorypath = INVENTORYPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmwarefoldersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.Literals.VMWAREFOLDERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacentername() {
		return datacentername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacentername(String newDatacentername) {
		String oldDatacentername = datacentername;
		datacentername = newDatacentername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMWAREFOLDERS__DATACENTERNAME, oldDatacentername, datacentername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatastorename() {
		return datastorename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatastorename(String newDatastorename) {
		String oldDatastorename = datastorename;
		datastorename = newDatastorename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMWAREFOLDERS__DATASTORENAME, oldDatastorename, datastorename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClustername() {
		return clustername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClustername(String newClustername) {
		String oldClustername = clustername;
		clustername = newClustername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMWAREFOLDERS__CLUSTERNAME, oldClustername, clustername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostsystemname() {
		return hostsystemname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostsystemname(String newHostsystemname) {
		String oldHostsystemname = hostsystemname;
		hostsystemname = newHostsystemname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMWAREFOLDERS__HOSTSYSTEMNAME, oldHostsystemname, hostsystemname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInventorypath() {
		return inventorypath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventorypath(String newInventorypath) {
		String oldInventorypath = inventorypath;
		inventorypath = newInventorypath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMWAREFOLDERS__INVENTORYPATH, oldInventorypath, inventorypath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.VMWAREFOLDERS__DATACENTERNAME:
				return getDatacentername();
			case VmwarePackage.VMWAREFOLDERS__DATASTORENAME:
				return getDatastorename();
			case VmwarePackage.VMWAREFOLDERS__CLUSTERNAME:
				return getClustername();
			case VmwarePackage.VMWAREFOLDERS__HOSTSYSTEMNAME:
				return getHostsystemname();
			case VmwarePackage.VMWAREFOLDERS__INVENTORYPATH:
				return getInventorypath();
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
			case VmwarePackage.VMWAREFOLDERS__DATACENTERNAME:
				setDatacentername((String)newValue);
				return;
			case VmwarePackage.VMWAREFOLDERS__DATASTORENAME:
				setDatastorename((String)newValue);
				return;
			case VmwarePackage.VMWAREFOLDERS__CLUSTERNAME:
				setClustername((String)newValue);
				return;
			case VmwarePackage.VMWAREFOLDERS__HOSTSYSTEMNAME:
				setHostsystemname((String)newValue);
				return;
			case VmwarePackage.VMWAREFOLDERS__INVENTORYPATH:
				setInventorypath((String)newValue);
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
			case VmwarePackage.VMWAREFOLDERS__DATACENTERNAME:
				setDatacentername(DATACENTERNAME_EDEFAULT);
				return;
			case VmwarePackage.VMWAREFOLDERS__DATASTORENAME:
				setDatastorename(DATASTORENAME_EDEFAULT);
				return;
			case VmwarePackage.VMWAREFOLDERS__CLUSTERNAME:
				setClustername(CLUSTERNAME_EDEFAULT);
				return;
			case VmwarePackage.VMWAREFOLDERS__HOSTSYSTEMNAME:
				setHostsystemname(HOSTSYSTEMNAME_EDEFAULT);
				return;
			case VmwarePackage.VMWAREFOLDERS__INVENTORYPATH:
				setInventorypath(INVENTORYPATH_EDEFAULT);
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
			case VmwarePackage.VMWAREFOLDERS__DATACENTERNAME:
				return DATACENTERNAME_EDEFAULT == null ? datacentername != null : !DATACENTERNAME_EDEFAULT.equals(datacentername);
			case VmwarePackage.VMWAREFOLDERS__DATASTORENAME:
				return DATASTORENAME_EDEFAULT == null ? datastorename != null : !DATASTORENAME_EDEFAULT.equals(datastorename);
			case VmwarePackage.VMWAREFOLDERS__CLUSTERNAME:
				return CLUSTERNAME_EDEFAULT == null ? clustername != null : !CLUSTERNAME_EDEFAULT.equals(clustername);
			case VmwarePackage.VMWAREFOLDERS__HOSTSYSTEMNAME:
				return HOSTSYSTEMNAME_EDEFAULT == null ? hostsystemname != null : !HOSTSYSTEMNAME_EDEFAULT.equals(hostsystemname);
			case VmwarePackage.VMWAREFOLDERS__INVENTORYPATH:
				return INVENTORYPATH_EDEFAULT == null ? inventorypath != null : !INVENTORYPATH_EDEFAULT.equals(inventorypath);
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
		result.append(" (datacentername: ");
		result.append(datacentername);
		result.append(", datastorename: ");
		result.append(datastorename);
		result.append(", clustername: ");
		result.append(clustername);
		result.append(", hostsystemname: ");
		result.append(hostsystemname);
		result.append(", inventorypath: ");
		result.append(inventorypath);
		result.append(')');
		return result.toString();
	}

} //VmwarefoldersImpl
