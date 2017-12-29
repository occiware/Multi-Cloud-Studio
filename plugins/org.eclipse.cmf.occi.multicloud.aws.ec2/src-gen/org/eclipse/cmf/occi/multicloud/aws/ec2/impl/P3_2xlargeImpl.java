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

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P3 2xlarge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl#getOcciComputeMemory <em>Occi Compute Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl#getOcciComputeCores <em>Occi Compute Cores</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl#getGpus <em>Gpus</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl#getGpuMemory <em>Gpu Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.P3_2xlargeImpl#getGpuP2P <em>Gpu P2P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class P3_2xlargeImpl extends AcceleratedcomputingImpl implements P3_2xlarge {
	/**
	 * The default value of the '{@link #getOcciComputeMemory() <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_COMPUTE_MEMORY_EDEFAULT = new Float(61.0F);

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
	protected static final String INSTANCE_TYPE_EDEFAULT = "p3.2xlarge";

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
	protected static final Integer OCCI_COMPUTE_CORES_EDEFAULT = new Integer(8);

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
	 * The default value of the '{@link #getGpus() <em>Gpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GPUS_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getGpus() <em>Gpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpus()
	 * @generated
	 * @ordered
	 */
	protected Integer gpus = GPUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpuMemory() <em>Gpu Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Float GPU_MEMORY_EDEFAULT = new Float(16.0F);

	/**
	 * The cached value of the '{@link #getGpuMemory() <em>Gpu Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuMemory()
	 * @generated
	 * @ordered
	 */
	protected Float gpuMemory = GPU_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpuP2P() <em>Gpu P2P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuP2P()
	 * @generated
	 * @ordered
	 */
	protected static final String GPU_P2P_EDEFAULT = "None";

	/**
	 * The cached value of the '{@link #getGpuP2P() <em>Gpu P2P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuP2P()
	 * @generated
	 * @ordered
	 */
	protected String gpuP2P = GPU_P2P_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected P3_2xlargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getP3_2xlarge();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.P3_2XLARGE__OCCI_COMPUTE_MEMORY, oldOcciComputeMemory, occiComputeMemory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.P3_2XLARGE__INSTANCE_TYPE, oldInstanceType, instanceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.P3_2XLARGE__OCCI_COMPUTE_CORES, oldOcciComputeCores, occiComputeCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getGpus() {
		return gpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpus(Integer newGpus) {
		Integer oldGpus = gpus;
		gpus = newGpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.P3_2XLARGE__GPUS, oldGpus, gpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getGpuMemory() {
		return gpuMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpuMemory(Float newGpuMemory) {
		Float oldGpuMemory = gpuMemory;
		gpuMemory = newGpuMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.P3_2XLARGE__GPU_MEMORY, oldGpuMemory, gpuMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGpuP2P() {
		return gpuP2P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpuP2P(String newGpuP2P) {
		String oldGpuP2P = gpuP2P;
		gpuP2P = newGpuP2P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.P3_2XLARGE__GPU_P2P, oldGpuP2P, gpuP2P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_MEMORY:
				return getOcciComputeMemory();
			case Ec2Package.P3_2XLARGE__INSTANCE_TYPE:
				return getInstanceType();
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_CORES:
				return getOcciComputeCores();
			case Ec2Package.P3_2XLARGE__GPUS:
				return getGpus();
			case Ec2Package.P3_2XLARGE__GPU_MEMORY:
				return getGpuMemory();
			case Ec2Package.P3_2XLARGE__GPU_P2P:
				return getGpuP2P();
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
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory((Float)newValue);
				return;
			case Ec2Package.P3_2XLARGE__INSTANCE_TYPE:
				setInstanceType((String)newValue);
				return;
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_CORES:
				setOcciComputeCores((Integer)newValue);
				return;
			case Ec2Package.P3_2XLARGE__GPUS:
				setGpus((Integer)newValue);
				return;
			case Ec2Package.P3_2XLARGE__GPU_MEMORY:
				setGpuMemory((Float)newValue);
				return;
			case Ec2Package.P3_2XLARGE__GPU_P2P:
				setGpuP2P((String)newValue);
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
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory(OCCI_COMPUTE_MEMORY_EDEFAULT);
				return;
			case Ec2Package.P3_2XLARGE__INSTANCE_TYPE:
				setInstanceType(INSTANCE_TYPE_EDEFAULT);
				return;
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_CORES:
				setOcciComputeCores(OCCI_COMPUTE_CORES_EDEFAULT);
				return;
			case Ec2Package.P3_2XLARGE__GPUS:
				setGpus(GPUS_EDEFAULT);
				return;
			case Ec2Package.P3_2XLARGE__GPU_MEMORY:
				setGpuMemory(GPU_MEMORY_EDEFAULT);
				return;
			case Ec2Package.P3_2XLARGE__GPU_P2P:
				setGpuP2P(GPU_P2P_EDEFAULT);
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
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_MEMORY:
				return OCCI_COMPUTE_MEMORY_EDEFAULT == null ? occiComputeMemory != null : !OCCI_COMPUTE_MEMORY_EDEFAULT.equals(occiComputeMemory);
			case Ec2Package.P3_2XLARGE__INSTANCE_TYPE:
				return INSTANCE_TYPE_EDEFAULT == null ? instanceType != null : !INSTANCE_TYPE_EDEFAULT.equals(instanceType);
			case Ec2Package.P3_2XLARGE__OCCI_COMPUTE_CORES:
				return OCCI_COMPUTE_CORES_EDEFAULT == null ? occiComputeCores != null : !OCCI_COMPUTE_CORES_EDEFAULT.equals(occiComputeCores);
			case Ec2Package.P3_2XLARGE__GPUS:
				return GPUS_EDEFAULT == null ? gpus != null : !GPUS_EDEFAULT.equals(gpus);
			case Ec2Package.P3_2XLARGE__GPU_MEMORY:
				return GPU_MEMORY_EDEFAULT == null ? gpuMemory != null : !GPU_MEMORY_EDEFAULT.equals(gpuMemory);
			case Ec2Package.P3_2XLARGE__GPU_P2P:
				return GPU_P2P_EDEFAULT == null ? gpuP2P != null : !GPU_P2P_EDEFAULT.equals(gpuP2P);
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
		result.append(", gpus: ");
		result.append(gpus);
		result.append(", gpuMemory: ");
		result.append(gpuMemory);
		result.append(", gpuP2P: ");
		result.append(gpuP2P);
		result.append(')');
		return result.toString();
	}

} //P3_2xlargeImpl
