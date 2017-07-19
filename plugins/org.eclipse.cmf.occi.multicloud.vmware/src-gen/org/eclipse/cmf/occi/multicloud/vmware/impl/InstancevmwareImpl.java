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

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancevmware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl#getImagename <em>Imagename</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl#getMarkedastemplate <em>Markedastemplate</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl#getGueststate <em>Gueststate</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl#getGuestosid <em>Guestosid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl#getVcpu <em>Vcpu</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl#getInstanceId <em>Instance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancevmwareImpl extends ComputeImpl implements Instancevmware {
	/**
	 * The default value of the '{@link #getImagename() <em>Imagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagename()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagename() <em>Imagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagename()
	 * @generated
	 * @ordered
	 */
	protected String imagename = IMAGENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkedastemplate() <em>Markedastemplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedastemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKEDASTEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkedastemplate() <em>Markedastemplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedastemplate()
	 * @generated
	 * @ordered
	 */
	protected String markedastemplate = MARKEDASTEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGueststate() <em>Gueststate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueststate()
	 * @generated
	 * @ordered
	 */
	protected static final String GUESTSTATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGueststate() <em>Gueststate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueststate()
	 * @generated
	 * @ordered
	 */
	protected String gueststate = GUESTSTATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestosid() <em>Guestosid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestosid()
	 * @generated
	 * @ordered
	 */
	protected static final String GUESTOSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestosid() <em>Guestosid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestosid()
	 * @generated
	 * @ordered
	 */
	protected String guestosid = GUESTOSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected static final String VCPU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected String vcpu = VCPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String instanceId = INSTANCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancevmwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.Literals.INSTANCEVMWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagename() {
		return imagename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagename(String newImagename) {
		String oldImagename = imagename;
		imagename = newImagename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.INSTANCEVMWARE__IMAGENAME, oldImagename, imagename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkedastemplate() {
		return markedastemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkedastemplate(String newMarkedastemplate) {
		String oldMarkedastemplate = markedastemplate;
		markedastemplate = newMarkedastemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.INSTANCEVMWARE__MARKEDASTEMPLATE, oldMarkedastemplate, markedastemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGueststate() {
		return gueststate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGueststate(String newGueststate) {
		String oldGueststate = gueststate;
		gueststate = newGueststate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.INSTANCEVMWARE__GUESTSTATE, oldGueststate, gueststate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestosid() {
		return guestosid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestosid(String newGuestosid) {
		String oldGuestosid = guestosid;
		guestosid = newGuestosid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.INSTANCEVMWARE__GUESTOSID, oldGuestosid, guestosid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVcpu() {
		return vcpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpu(String newVcpu) {
		String oldVcpu = vcpu;
		vcpu = newVcpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.INSTANCEVMWARE__VCPU, oldVcpu, vcpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceId() {
		return instanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceId(String newInstanceId) {
		String oldInstanceId = instanceId;
		instanceId = newInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.INSTANCEVMWARE__INSTANCE_ID, oldInstanceId, instanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.INSTANCEVMWARE__IMAGENAME:
				return getImagename();
			case VmwarePackage.INSTANCEVMWARE__MARKEDASTEMPLATE:
				return getMarkedastemplate();
			case VmwarePackage.INSTANCEVMWARE__GUESTSTATE:
				return getGueststate();
			case VmwarePackage.INSTANCEVMWARE__GUESTOSID:
				return getGuestosid();
			case VmwarePackage.INSTANCEVMWARE__VCPU:
				return getVcpu();
			case VmwarePackage.INSTANCEVMWARE__INSTANCE_ID:
				return getInstanceId();
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
			case VmwarePackage.INSTANCEVMWARE__IMAGENAME:
				setImagename((String)newValue);
				return;
			case VmwarePackage.INSTANCEVMWARE__MARKEDASTEMPLATE:
				setMarkedastemplate((String)newValue);
				return;
			case VmwarePackage.INSTANCEVMWARE__GUESTSTATE:
				setGueststate((String)newValue);
				return;
			case VmwarePackage.INSTANCEVMWARE__GUESTOSID:
				setGuestosid((String)newValue);
				return;
			case VmwarePackage.INSTANCEVMWARE__VCPU:
				setVcpu((String)newValue);
				return;
			case VmwarePackage.INSTANCEVMWARE__INSTANCE_ID:
				setInstanceId((String)newValue);
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
			case VmwarePackage.INSTANCEVMWARE__IMAGENAME:
				setImagename(IMAGENAME_EDEFAULT);
				return;
			case VmwarePackage.INSTANCEVMWARE__MARKEDASTEMPLATE:
				setMarkedastemplate(MARKEDASTEMPLATE_EDEFAULT);
				return;
			case VmwarePackage.INSTANCEVMWARE__GUESTSTATE:
				setGueststate(GUESTSTATE_EDEFAULT);
				return;
			case VmwarePackage.INSTANCEVMWARE__GUESTOSID:
				setGuestosid(GUESTOSID_EDEFAULT);
				return;
			case VmwarePackage.INSTANCEVMWARE__VCPU:
				setVcpu(VCPU_EDEFAULT);
				return;
			case VmwarePackage.INSTANCEVMWARE__INSTANCE_ID:
				setInstanceId(INSTANCE_ID_EDEFAULT);
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
			case VmwarePackage.INSTANCEVMWARE__IMAGENAME:
				return IMAGENAME_EDEFAULT == null ? imagename != null : !IMAGENAME_EDEFAULT.equals(imagename);
			case VmwarePackage.INSTANCEVMWARE__MARKEDASTEMPLATE:
				return MARKEDASTEMPLATE_EDEFAULT == null ? markedastemplate != null : !MARKEDASTEMPLATE_EDEFAULT.equals(markedastemplate);
			case VmwarePackage.INSTANCEVMWARE__GUESTSTATE:
				return GUESTSTATE_EDEFAULT == null ? gueststate != null : !GUESTSTATE_EDEFAULT.equals(gueststate);
			case VmwarePackage.INSTANCEVMWARE__GUESTOSID:
				return GUESTOSID_EDEFAULT == null ? guestosid != null : !GUESTOSID_EDEFAULT.equals(guestosid);
			case VmwarePackage.INSTANCEVMWARE__VCPU:
				return VCPU_EDEFAULT == null ? vcpu != null : !VCPU_EDEFAULT.equals(vcpu);
			case VmwarePackage.INSTANCEVMWARE__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceId != null : !INSTANCE_ID_EDEFAULT.equals(instanceId);
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
		result.append(" (imagename: ");
		result.append(imagename);
		result.append(", markedastemplate: ");
		result.append(markedastemplate);
		result.append(", gueststate: ");
		result.append(gueststate);
		result.append(", guestosid: ");
		result.append(guestosid);
		result.append(", vcpu: ");
		result.append(vcpu);
		result.append(", instanceId: ");
		result.append(instanceId);
		result.append(')');
		return result.toString();
	}

} //InstancevmwareImpl
