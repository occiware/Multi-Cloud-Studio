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
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancevpcinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl#getSubnetId <em>Subnet Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl#isSourceDestCheck <em>Source Dest Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancevpcinfoImpl extends MixinBaseImpl implements Instancevpcinfo {
	/**
	 * The default value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected String vpcId = VPC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected String subnetId = SUBNET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceDestCheck() <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceDestCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_DEST_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceDestCheck() <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceDestCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceDestCheck = SOURCE_DEST_CHECK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancevpcinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getInstancevpcinfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpcId() {
		return vpcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpcId(String newVpcId) {
		String oldVpcId = vpcId;
		vpcId = newVpcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEVPCINFO__VPC_ID, oldVpcId, vpcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetId() {
		return subnetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetId(String newSubnetId) {
		String oldSubnetId = subnetId;
		subnetId = newSubnetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEVPCINFO__SUBNET_ID, oldSubnetId, subnetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceDestCheck() {
		return sourceDestCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDestCheck(boolean newSourceDestCheck) {
		boolean oldSourceDestCheck = sourceDestCheck;
		sourceDestCheck = newSourceDestCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK, oldSourceDestCheck, sourceDestCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				return getVpcId();
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				return getSubnetId();
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				return isSourceDestCheck();
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
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				setVpcId((String)newValue);
				return;
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				setSubnetId((String)newValue);
				return;
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				setSourceDestCheck((Boolean)newValue);
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
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				setVpcId(VPC_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				setSubnetId(SUBNET_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				setSourceDestCheck(SOURCE_DEST_CHECK_EDEFAULT);
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
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				return VPC_ID_EDEFAULT == null ? vpcId != null : !VPC_ID_EDEFAULT.equals(vpcId);
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				return SUBNET_ID_EDEFAULT == null ? subnetId != null : !SUBNET_ID_EDEFAULT.equals(subnetId);
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				return sourceDestCheck != SOURCE_DEST_CHECK_EDEFAULT;
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
		result.append(" (vpcId: ");
		result.append(vpcId);
		result.append(", subnetId: ");
		result.append(subnetId);
		result.append(", sourceDestCheck: ");
		result.append(sourceDestCheck);
		result.append(')');
		return result.toString();
	}

} //InstancevpcinfoImpl
