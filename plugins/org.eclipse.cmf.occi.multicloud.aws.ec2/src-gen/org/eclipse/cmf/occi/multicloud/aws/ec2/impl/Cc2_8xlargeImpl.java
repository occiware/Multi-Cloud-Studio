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

import org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cc2 8xlarge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cc2_8xlargeImpl#getOcciComputeMemory <em>Occi Compute Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cc2_8xlargeImpl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cc2_8xlargeImpl#getOcciComputeCores <em>Occi Compute Cores</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Cc2_8xlargeImpl#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Cc2_8xlargeImpl extends ComputeoptimizedImpl implements Cc2_8xlarge {
	/**
	 * The default value of the '{@link #getOcciComputeMemory() <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_COMPUTE_MEMORY_EDEFAULT = new Float(60.5F);

	/**
	 * The cached value of the '{@link #getOcciComputeMemory() <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeMemory()
	 * @generated
	 * @ordered
	 */
	protected Float occiComputeMemory = OCCI_COMPUTE_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = "c1.xlarge";

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected String instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeCores() <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_COMPUTE_CORES_EDEFAULT = new Integer(32);

	/**
	 * The cached value of the '{@link #getOcciComputeCores() <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeCores()
	 * @generated
	 * @ordered
	 */
	protected Integer occiComputeCores = OCCI_COMPUTE_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeEphemeralStorageSize() <em>Occi Compute Ephemeral Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeEphemeralStorageSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT = new Float(3360.0F);

	/**
	 * The cached value of the '{@link #getOcciComputeEphemeralStorageSize() <em>Occi Compute Ephemeral Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeEphemeralStorageSize()
	 * @generated
	 * @ordered
	 */
	protected Float occiComputeEphemeralStorageSize = OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cc2_8xlargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getCc2_8xlarge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getOcciComputeMemory() {
		return occiComputeMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeMemory(Float newOcciComputeMemory) {
		Float oldOcciComputeMemory = occiComputeMemory;
		occiComputeMemory = newOcciComputeMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_MEMORY, oldOcciComputeMemory, occiComputeMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(String newInstanceType) {
		String oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.CC2_8XLARGE__INSTANCE_TYPE, oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciComputeCores() {
		return occiComputeCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeCores(Integer newOcciComputeCores) {
		Integer oldOcciComputeCores = occiComputeCores;
		occiComputeCores = newOcciComputeCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_CORES, oldOcciComputeCores, occiComputeCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getOcciComputeEphemeralStorageSize() {
		return occiComputeEphemeralStorageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeEphemeralStorageSize(Float newOcciComputeEphemeralStorageSize) {
		Float oldOcciComputeEphemeralStorageSize = occiComputeEphemeralStorageSize;
		occiComputeEphemeralStorageSize = newOcciComputeEphemeralStorageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, oldOcciComputeEphemeralStorageSize, occiComputeEphemeralStorageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_MEMORY:
				return getOcciComputeMemory();
			case Ec2Package.CC2_8XLARGE__INSTANCE_TYPE:
				return getInstanceType();
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_CORES:
				return getOcciComputeCores();
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				return getOcciComputeEphemeralStorageSize();
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
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory((Float)newValue);
				return;
			case Ec2Package.CC2_8XLARGE__INSTANCE_TYPE:
				setInstanceType((String)newValue);
				return;
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_CORES:
				setOcciComputeCores((Integer)newValue);
				return;
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				setOcciComputeEphemeralStorageSize((Float)newValue);
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
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory(OCCI_COMPUTE_MEMORY_EDEFAULT);
				return;
			case Ec2Package.CC2_8XLARGE__INSTANCE_TYPE:
				setInstanceType(INSTANCE_TYPE_EDEFAULT);
				return;
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_CORES:
				setOcciComputeCores(OCCI_COMPUTE_CORES_EDEFAULT);
				return;
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				setOcciComputeEphemeralStorageSize(OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT);
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
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_MEMORY:
				return OCCI_COMPUTE_MEMORY_EDEFAULT == null ? occiComputeMemory != null : !OCCI_COMPUTE_MEMORY_EDEFAULT.equals(occiComputeMemory);
			case Ec2Package.CC2_8XLARGE__INSTANCE_TYPE:
				return INSTANCE_TYPE_EDEFAULT == null ? instanceType != null : !INSTANCE_TYPE_EDEFAULT.equals(instanceType);
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_CORES:
				return OCCI_COMPUTE_CORES_EDEFAULT == null ? occiComputeCores != null : !OCCI_COMPUTE_CORES_EDEFAULT.equals(occiComputeCores);
			case Ec2Package.CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				return OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT == null ? occiComputeEphemeralStorageSize != null : !OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT.equals(occiComputeEphemeralStorageSize);
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
		result.append(" (occiComputeMemory: ");
		result.append(occiComputeMemory);
		result.append(", instanceType: ");
		result.append(instanceType);
		result.append(", occiComputeCores: ");
		result.append(occiComputeCores);
		result.append(", occiComputeEphemeralStorageSize: ");
		result.append(occiComputeEphemeralStorageSize);
		result.append(')');
		return result.toString();
	}

} //Cc2_8xlargeImpl
