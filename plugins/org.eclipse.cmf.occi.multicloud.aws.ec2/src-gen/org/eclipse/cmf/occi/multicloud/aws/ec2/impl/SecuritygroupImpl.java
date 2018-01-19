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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Securitygroup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.SecuritygroupImpl#getSecurityGroupName <em>Security Group Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.SecuritygroupImpl#getSecurityGroupDescription <em>Security Group Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.SecuritygroupImpl#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.SecuritygroupImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuritygroupImpl extends ResourceImpl implements Securitygroup {
	/**
	 * The default value of the '{@link #getSecurityGroupName() <em>Security Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupName() <em>Security Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupName()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupName = SECURITY_GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroupDescription() <em>Security Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupDescription() <em>Security Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupDescription()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupDescription = SECURITY_GROUP_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getSecurityGroupId() <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupId() <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupId = SECURITY_GROUP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritygroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getSecuritygroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroupName() {
		return securityGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroupName(String newSecurityGroupName) {
		String oldSecurityGroupName = securityGroupName;
		securityGroupName = newSecurityGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SECURITYGROUP__SECURITY_GROUP_NAME, oldSecurityGroupName, securityGroupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroupDescription() {
		return securityGroupDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroupDescription(String newSecurityGroupDescription) {
		String oldSecurityGroupDescription = securityGroupDescription;
		securityGroupDescription = newSecurityGroupDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SECURITYGROUP__SECURITY_GROUP_DESCRIPTION, oldSecurityGroupDescription, securityGroupDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SECURITYGROUP__VPC_ID, oldVpcId, vpcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroupId() {
		return securityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroupId(String newSecurityGroupId) {
		String oldSecurityGroupId = securityGroupId;
		securityGroupId = newSecurityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.SECURITYGROUP__SECURITY_GROUP_ID, oldSecurityGroupId, securityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_NAME:
				return getSecurityGroupName();
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_DESCRIPTION:
				return getSecurityGroupDescription();
			case Ec2Package.SECURITYGROUP__VPC_ID:
				return getVpcId();
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_ID:
				return getSecurityGroupId();
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
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_NAME:
				setSecurityGroupName((String)newValue);
				return;
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_DESCRIPTION:
				setSecurityGroupDescription((String)newValue);
				return;
			case Ec2Package.SECURITYGROUP__VPC_ID:
				setVpcId((String)newValue);
				return;
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_ID:
				setSecurityGroupId((String)newValue);
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
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_NAME:
				setSecurityGroupName(SECURITY_GROUP_NAME_EDEFAULT);
				return;
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_DESCRIPTION:
				setSecurityGroupDescription(SECURITY_GROUP_DESCRIPTION_EDEFAULT);
				return;
			case Ec2Package.SECURITYGROUP__VPC_ID:
				setVpcId(VPC_ID_EDEFAULT);
				return;
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_ID:
				setSecurityGroupId(SECURITY_GROUP_ID_EDEFAULT);
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
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_NAME:
				return SECURITY_GROUP_NAME_EDEFAULT == null ? securityGroupName != null : !SECURITY_GROUP_NAME_EDEFAULT.equals(securityGroupName);
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_DESCRIPTION:
				return SECURITY_GROUP_DESCRIPTION_EDEFAULT == null ? securityGroupDescription != null : !SECURITY_GROUP_DESCRIPTION_EDEFAULT.equals(securityGroupDescription);
			case Ec2Package.SECURITYGROUP__VPC_ID:
				return VPC_ID_EDEFAULT == null ? vpcId != null : !VPC_ID_EDEFAULT.equals(vpcId);
			case Ec2Package.SECURITYGROUP__SECURITY_GROUP_ID:
				return SECURITY_GROUP_ID_EDEFAULT == null ? securityGroupId != null : !SECURITY_GROUP_ID_EDEFAULT.equals(securityGroupId);
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
		result.append(" (securityGroupName: ");
		result.append(securityGroupName);
		result.append(", securityGroupDescription: ");
		result.append(securityGroupDescription);
		result.append(", vpcId: ");
		result.append(vpcId);
		result.append(", securityGroupId: ");
		result.append(securityGroupId);
		result.append(')');
		return result.toString();
	}

} //SecuritygroupImpl
