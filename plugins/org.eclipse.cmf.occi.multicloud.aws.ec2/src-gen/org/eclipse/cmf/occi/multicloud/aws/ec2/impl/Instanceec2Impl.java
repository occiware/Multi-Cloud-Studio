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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2;
import org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanceec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getZoneName <em>Zone Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getAwsInstanceStatus <em>Aws Instance Status</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getLaunchTime <em>Launch Time</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getAmiLaunchIndex <em>Ami Launch Index</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#isEbsOptimizedIO <em>Ebs Optimized IO</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#isEnaSupport <em>Ena Support</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getHypervisor <em>Hypervisor</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getInstanceLifeCycle <em>Instance Life Cycle</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getKernelId <em>Kernel Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getKeyPairName <em>Key Pair Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getMonitoringState <em>Monitoring State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getPrivateDNSName <em>Private DNS Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getPrivateIpV4Address <em>Private Ip V4 Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getPublicDNSName <em>Public DNS Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getPublicIpv4Address <em>Public Ipv4 Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getRamDiskId <em>Ram Disk Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getSriovNetSupport <em>Sriov Net Support</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl#getVirtualizationType <em>Virtualization Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Instanceec2Impl extends ComputeImpl implements Instanceec2 {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = "t2.nano";

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
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected String imageId = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwsInstanceStatus() <em>Aws Instance Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsInstanceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AWSInstanceState AWS_INSTANCE_STATUS_EDEFAULT = AWSInstanceState.NOTEXIST;

	/**
	 * The cached value of the '{@link #getAwsInstanceStatus() <em>Aws Instance Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsInstanceStatus()
	 * @generated
	 * @ordered
	 */
	protected AWSInstanceState awsInstanceStatus = AWS_INSTANCE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaunchTime() <em>Launch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchTime()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaunchTime() <em>Launch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchTime()
	 * @generated
	 * @ordered
	 */
	protected String launchTime = LAUNCH_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmiLaunchIndex() <em>Ami Launch Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmiLaunchIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AMI_LAUNCH_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmiLaunchIndex() <em>Ami Launch Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmiLaunchIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer amiLaunchIndex = AMI_LAUNCH_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isEbsOptimizedIO() <em>Ebs Optimized IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEbsOptimizedIO()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EBS_OPTIMIZED_IO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEbsOptimizedIO() <em>Ebs Optimized IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEbsOptimizedIO()
	 * @generated
	 * @ordered
	 */
	protected boolean ebsOptimizedIO = EBS_OPTIMIZED_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnaSupport() <em>Ena Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnaSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENA_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnaSupport() <em>Ena Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnaSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean enaSupport = ENA_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected static final HypervisorType HYPERVISOR_EDEFAULT = HypervisorType.OVM;

	/**
	 * The cached value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected HypervisorType hypervisor = HYPERVISOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceLifeCycle() <em>Instance Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected static final InstanceLifeCycleType INSTANCE_LIFE_CYCLE_EDEFAULT = InstanceLifeCycleType.SCHEDULED;

	/**
	 * The cached value of the '{@link #getInstanceLifeCycle() <em>Instance Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected InstanceLifeCycleType instanceLifeCycle = INSTANCE_LIFE_CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKernelId() <em>Kernel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelId()
	 * @generated
	 * @ordered
	 */
	protected static final String KERNEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernelId() <em>Kernel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelId()
	 * @generated
	 * @ordered
	 */
	protected String kernelId = KERNEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyPairName() <em>Key Pair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPairName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_PAIR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyPairName() <em>Key Pair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPairName()
	 * @generated
	 * @ordered
	 */
	protected String keyPairName = KEY_PAIR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoringState() <em>Monitoring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringState()
	 * @generated
	 * @ordered
	 */
	protected static final MonitoringState MONITORING_STATE_EDEFAULT = MonitoringState.DISABLED;

	/**
	 * The cached value of the '{@link #getMonitoringState() <em>Monitoring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringState()
	 * @generated
	 * @ordered
	 */
	protected MonitoringState monitoringState = MONITORING_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected String platform = PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateDNSName() <em>Private DNS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateDNSName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_DNS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateDNSName() <em>Private DNS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateDNSName()
	 * @generated
	 * @ordered
	 */
	protected String privateDNSName = PRIVATE_DNS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateIpV4Address() <em>Private Ip V4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIpV4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_V4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateIpV4Address() <em>Private Ip V4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIpV4Address()
	 * @generated
	 * @ordered
	 */
	protected String privateIpV4Address = PRIVATE_IP_V4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicDNSName() <em>Public DNS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicDNSName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_DNS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicDNSName() <em>Public DNS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicDNSName()
	 * @generated
	 * @ordered
	 */
	protected String publicDNSName = PUBLIC_DNS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicIpv4Address() <em>Public Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIpv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_IPV4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicIpv4Address() <em>Public Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIpv4Address()
	 * @generated
	 * @ordered
	 */
	protected String publicIpv4Address = PUBLIC_IPV4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamDiskId() <em>Ram Disk Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamDiskId()
	 * @generated
	 * @ordered
	 */
	protected static final String RAM_DISK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamDiskId() <em>Ram Disk Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamDiskId()
	 * @generated
	 * @ordered
	 */
	protected String ramDiskId = RAM_DISK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSriovNetSupport() <em>Sriov Net Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSriovNetSupport()
	 * @generated
	 * @ordered
	 */
	protected static final String SRIOV_NET_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSriovNetSupport() <em>Sriov Net Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSriovNetSupport()
	 * @generated
	 * @ordered
	 */
	protected String sriovNetSupport = SRIOV_NET_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualizationType() <em>Virtualization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualizationType()
	 * @generated
	 * @ordered
	 */
	protected static final VirtualizationType VIRTUALIZATION_TYPE_EDEFAULT = VirtualizationType.HVM;

	/**
	 * The cached value of the '{@link #getVirtualizationType() <em>Virtualization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualizationType()
	 * @generated
	 * @ordered
	 */
	protected VirtualizationType virtualizationType = VIRTUALIZATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instanceec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getInstanceec2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__INSTANCE_ID, oldInstanceId, instanceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__INSTANCE_TYPE, oldInstanceType, instanceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__ZONE_NAME, oldZoneName, zoneName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageId(String newImageId) {
		String oldImageId = imageId;
		imageId = newImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__IMAGE_ID, oldImageId, imageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSInstanceState getAwsInstanceStatus() {
		return awsInstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsInstanceStatus(AWSInstanceState newAwsInstanceStatus) {
		AWSInstanceState oldAwsInstanceStatus = awsInstanceStatus;
		awsInstanceStatus = newAwsInstanceStatus == null ? AWS_INSTANCE_STATUS_EDEFAULT : newAwsInstanceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__AWS_INSTANCE_STATUS, oldAwsInstanceStatus, awsInstanceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLaunchTime() {
		return launchTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchTime(String newLaunchTime) {
		String oldLaunchTime = launchTime;
		launchTime = newLaunchTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__LAUNCH_TIME, oldLaunchTime, launchTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAmiLaunchIndex() {
		return amiLaunchIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmiLaunchIndex(Integer newAmiLaunchIndex) {
		Integer oldAmiLaunchIndex = amiLaunchIndex;
		amiLaunchIndex = newAmiLaunchIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__AMI_LAUNCH_INDEX, oldAmiLaunchIndex, amiLaunchIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEbsOptimizedIO() {
		return ebsOptimizedIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEbsOptimizedIO(boolean newEbsOptimizedIO) {
		boolean oldEbsOptimizedIO = ebsOptimizedIO;
		ebsOptimizedIO = newEbsOptimizedIO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__EBS_OPTIMIZED_IO, oldEbsOptimizedIO, ebsOptimizedIO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnaSupport() {
		return enaSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnaSupport(boolean newEnaSupport) {
		boolean oldEnaSupport = enaSupport;
		enaSupport = newEnaSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__ENA_SUPPORT, oldEnaSupport, enaSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorType getHypervisor() {
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor(HypervisorType newHypervisor) {
		HypervisorType oldHypervisor = hypervisor;
		hypervisor = newHypervisor == null ? HYPERVISOR_EDEFAULT : newHypervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__HYPERVISOR, oldHypervisor, hypervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceLifeCycleType getInstanceLifeCycle() {
		return instanceLifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceLifeCycle(InstanceLifeCycleType newInstanceLifeCycle) {
		InstanceLifeCycleType oldInstanceLifeCycle = instanceLifeCycle;
		instanceLifeCycle = newInstanceLifeCycle == null ? INSTANCE_LIFE_CYCLE_EDEFAULT : newInstanceLifeCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__INSTANCE_LIFE_CYCLE, oldInstanceLifeCycle, instanceLifeCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKernelId() {
		return kernelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKernelId(String newKernelId) {
		String oldKernelId = kernelId;
		kernelId = newKernelId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__KERNEL_ID, oldKernelId, kernelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyPairName() {
		return keyPairName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyPairName(String newKeyPairName) {
		String oldKeyPairName = keyPairName;
		keyPairName = newKeyPairName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__KEY_PAIR_NAME, oldKeyPairName, keyPairName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringState getMonitoringState() {
		return monitoringState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringState(MonitoringState newMonitoringState) {
		MonitoringState oldMonitoringState = monitoringState;
		monitoringState = newMonitoringState == null ? MONITORING_STATE_EDEFAULT : newMonitoringState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__MONITORING_STATE, oldMonitoringState, monitoringState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(String newPlatform) {
		String oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateDNSName() {
		return privateDNSName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateDNSName(String newPrivateDNSName) {
		String oldPrivateDNSName = privateDNSName;
		privateDNSName = newPrivateDNSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__PRIVATE_DNS_NAME, oldPrivateDNSName, privateDNSName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateIpV4Address() {
		return privateIpV4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateIpV4Address(String newPrivateIpV4Address) {
		String oldPrivateIpV4Address = privateIpV4Address;
		privateIpV4Address = newPrivateIpV4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__PRIVATE_IP_V4_ADDRESS, oldPrivateIpV4Address, privateIpV4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicDNSName() {
		return publicDNSName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicDNSName(String newPublicDNSName) {
		String oldPublicDNSName = publicDNSName;
		publicDNSName = newPublicDNSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__PUBLIC_DNS_NAME, oldPublicDNSName, publicDNSName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicIpv4Address() {
		return publicIpv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicIpv4Address(String newPublicIpv4Address) {
		String oldPublicIpv4Address = publicIpv4Address;
		publicIpv4Address = newPublicIpv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__PUBLIC_IPV4_ADDRESS, oldPublicIpv4Address, publicIpv4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamDiskId() {
		return ramDiskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamDiskId(String newRamDiskId) {
		String oldRamDiskId = ramDiskId;
		ramDiskId = newRamDiskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__RAM_DISK_ID, oldRamDiskId, ramDiskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSriovNetSupport() {
		return sriovNetSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSriovNetSupport(String newSriovNetSupport) {
		String oldSriovNetSupport = sriovNetSupport;
		sriovNetSupport = newSriovNetSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__SRIOV_NET_SUPPORT, oldSriovNetSupport, sriovNetSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualizationType getVirtualizationType() {
		return virtualizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualizationType(VirtualizationType newVirtualizationType) {
		VirtualizationType oldVirtualizationType = virtualizationType;
		virtualizationType = newVirtualizationType == null ? VIRTUALIZATION_TYPE_EDEFAULT : newVirtualizationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEEC2__VIRTUALIZATION_TYPE, oldVirtualizationType, virtualizationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void terminate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.INSTANCEEC2__NAME:
				return getName();
			case Ec2Package.INSTANCEEC2__INSTANCE_ID:
				return getInstanceId();
			case Ec2Package.INSTANCEEC2__INSTANCE_TYPE:
				return getInstanceType();
			case Ec2Package.INSTANCEEC2__ZONE_NAME:
				return getZoneName();
			case Ec2Package.INSTANCEEC2__IMAGE_ID:
				return getImageId();
			case Ec2Package.INSTANCEEC2__AWS_INSTANCE_STATUS:
				return getAwsInstanceStatus();
			case Ec2Package.INSTANCEEC2__LAUNCH_TIME:
				return getLaunchTime();
			case Ec2Package.INSTANCEEC2__AMI_LAUNCH_INDEX:
				return getAmiLaunchIndex();
			case Ec2Package.INSTANCEEC2__EBS_OPTIMIZED_IO:
				return isEbsOptimizedIO();
			case Ec2Package.INSTANCEEC2__ENA_SUPPORT:
				return isEnaSupport();
			case Ec2Package.INSTANCEEC2__HYPERVISOR:
				return getHypervisor();
			case Ec2Package.INSTANCEEC2__INSTANCE_LIFE_CYCLE:
				return getInstanceLifeCycle();
			case Ec2Package.INSTANCEEC2__KERNEL_ID:
				return getKernelId();
			case Ec2Package.INSTANCEEC2__KEY_PAIR_NAME:
				return getKeyPairName();
			case Ec2Package.INSTANCEEC2__MONITORING_STATE:
				return getMonitoringState();
			case Ec2Package.INSTANCEEC2__PLATFORM:
				return getPlatform();
			case Ec2Package.INSTANCEEC2__PRIVATE_DNS_NAME:
				return getPrivateDNSName();
			case Ec2Package.INSTANCEEC2__PRIVATE_IP_V4_ADDRESS:
				return getPrivateIpV4Address();
			case Ec2Package.INSTANCEEC2__PUBLIC_DNS_NAME:
				return getPublicDNSName();
			case Ec2Package.INSTANCEEC2__PUBLIC_IPV4_ADDRESS:
				return getPublicIpv4Address();
			case Ec2Package.INSTANCEEC2__RAM_DISK_ID:
				return getRamDiskId();
			case Ec2Package.INSTANCEEC2__SRIOV_NET_SUPPORT:
				return getSriovNetSupport();
			case Ec2Package.INSTANCEEC2__VIRTUALIZATION_TYPE:
				return getVirtualizationType();
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
			case Ec2Package.INSTANCEEC2__NAME:
				setName((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__INSTANCE_ID:
				setInstanceId((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__INSTANCE_TYPE:
				setInstanceType((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__ZONE_NAME:
				setZoneName((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__IMAGE_ID:
				setImageId((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__AWS_INSTANCE_STATUS:
				setAwsInstanceStatus((AWSInstanceState)newValue);
				return;
			case Ec2Package.INSTANCEEC2__LAUNCH_TIME:
				setLaunchTime((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__AMI_LAUNCH_INDEX:
				setAmiLaunchIndex((Integer)newValue);
				return;
			case Ec2Package.INSTANCEEC2__EBS_OPTIMIZED_IO:
				setEbsOptimizedIO((Boolean)newValue);
				return;
			case Ec2Package.INSTANCEEC2__ENA_SUPPORT:
				setEnaSupport((Boolean)newValue);
				return;
			case Ec2Package.INSTANCEEC2__HYPERVISOR:
				setHypervisor((HypervisorType)newValue);
				return;
			case Ec2Package.INSTANCEEC2__INSTANCE_LIFE_CYCLE:
				setInstanceLifeCycle((InstanceLifeCycleType)newValue);
				return;
			case Ec2Package.INSTANCEEC2__KERNEL_ID:
				setKernelId((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__KEY_PAIR_NAME:
				setKeyPairName((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__MONITORING_STATE:
				setMonitoringState((MonitoringState)newValue);
				return;
			case Ec2Package.INSTANCEEC2__PLATFORM:
				setPlatform((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__PRIVATE_DNS_NAME:
				setPrivateDNSName((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__PRIVATE_IP_V4_ADDRESS:
				setPrivateIpV4Address((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__PUBLIC_DNS_NAME:
				setPublicDNSName((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__PUBLIC_IPV4_ADDRESS:
				setPublicIpv4Address((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__RAM_DISK_ID:
				setRamDiskId((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__SRIOV_NET_SUPPORT:
				setSriovNetSupport((String)newValue);
				return;
			case Ec2Package.INSTANCEEC2__VIRTUALIZATION_TYPE:
				setVirtualizationType((VirtualizationType)newValue);
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
			case Ec2Package.INSTANCEEC2__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__INSTANCE_ID:
				setInstanceId(INSTANCE_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__INSTANCE_TYPE:
				setInstanceType(INSTANCE_TYPE_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__ZONE_NAME:
				setZoneName(ZONE_NAME_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__IMAGE_ID:
				setImageId(IMAGE_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__AWS_INSTANCE_STATUS:
				setAwsInstanceStatus(AWS_INSTANCE_STATUS_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__LAUNCH_TIME:
				setLaunchTime(LAUNCH_TIME_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__AMI_LAUNCH_INDEX:
				setAmiLaunchIndex(AMI_LAUNCH_INDEX_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__EBS_OPTIMIZED_IO:
				setEbsOptimizedIO(EBS_OPTIMIZED_IO_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__ENA_SUPPORT:
				setEnaSupport(ENA_SUPPORT_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__HYPERVISOR:
				setHypervisor(HYPERVISOR_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__INSTANCE_LIFE_CYCLE:
				setInstanceLifeCycle(INSTANCE_LIFE_CYCLE_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__KERNEL_ID:
				setKernelId(KERNEL_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__KEY_PAIR_NAME:
				setKeyPairName(KEY_PAIR_NAME_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__MONITORING_STATE:
				setMonitoringState(MONITORING_STATE_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__PRIVATE_DNS_NAME:
				setPrivateDNSName(PRIVATE_DNS_NAME_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__PRIVATE_IP_V4_ADDRESS:
				setPrivateIpV4Address(PRIVATE_IP_V4_ADDRESS_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__PUBLIC_DNS_NAME:
				setPublicDNSName(PUBLIC_DNS_NAME_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__PUBLIC_IPV4_ADDRESS:
				setPublicIpv4Address(PUBLIC_IPV4_ADDRESS_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__RAM_DISK_ID:
				setRamDiskId(RAM_DISK_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__SRIOV_NET_SUPPORT:
				setSriovNetSupport(SRIOV_NET_SUPPORT_EDEFAULT);
				return;
			case Ec2Package.INSTANCEEC2__VIRTUALIZATION_TYPE:
				setVirtualizationType(VIRTUALIZATION_TYPE_EDEFAULT);
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
			case Ec2Package.INSTANCEEC2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ec2Package.INSTANCEEC2__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceId != null : !INSTANCE_ID_EDEFAULT.equals(instanceId);
			case Ec2Package.INSTANCEEC2__INSTANCE_TYPE:
				return INSTANCE_TYPE_EDEFAULT == null ? instanceType != null : !INSTANCE_TYPE_EDEFAULT.equals(instanceType);
			case Ec2Package.INSTANCEEC2__ZONE_NAME:
				return ZONE_NAME_EDEFAULT == null ? zoneName != null : !ZONE_NAME_EDEFAULT.equals(zoneName);
			case Ec2Package.INSTANCEEC2__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
			case Ec2Package.INSTANCEEC2__AWS_INSTANCE_STATUS:
				return awsInstanceStatus != AWS_INSTANCE_STATUS_EDEFAULT;
			case Ec2Package.INSTANCEEC2__LAUNCH_TIME:
				return LAUNCH_TIME_EDEFAULT == null ? launchTime != null : !LAUNCH_TIME_EDEFAULT.equals(launchTime);
			case Ec2Package.INSTANCEEC2__AMI_LAUNCH_INDEX:
				return AMI_LAUNCH_INDEX_EDEFAULT == null ? amiLaunchIndex != null : !AMI_LAUNCH_INDEX_EDEFAULT.equals(amiLaunchIndex);
			case Ec2Package.INSTANCEEC2__EBS_OPTIMIZED_IO:
				return ebsOptimizedIO != EBS_OPTIMIZED_IO_EDEFAULT;
			case Ec2Package.INSTANCEEC2__ENA_SUPPORT:
				return enaSupport != ENA_SUPPORT_EDEFAULT;
			case Ec2Package.INSTANCEEC2__HYPERVISOR:
				return hypervisor != HYPERVISOR_EDEFAULT;
			case Ec2Package.INSTANCEEC2__INSTANCE_LIFE_CYCLE:
				return instanceLifeCycle != INSTANCE_LIFE_CYCLE_EDEFAULT;
			case Ec2Package.INSTANCEEC2__KERNEL_ID:
				return KERNEL_ID_EDEFAULT == null ? kernelId != null : !KERNEL_ID_EDEFAULT.equals(kernelId);
			case Ec2Package.INSTANCEEC2__KEY_PAIR_NAME:
				return KEY_PAIR_NAME_EDEFAULT == null ? keyPairName != null : !KEY_PAIR_NAME_EDEFAULT.equals(keyPairName);
			case Ec2Package.INSTANCEEC2__MONITORING_STATE:
				return monitoringState != MONITORING_STATE_EDEFAULT;
			case Ec2Package.INSTANCEEC2__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case Ec2Package.INSTANCEEC2__PRIVATE_DNS_NAME:
				return PRIVATE_DNS_NAME_EDEFAULT == null ? privateDNSName != null : !PRIVATE_DNS_NAME_EDEFAULT.equals(privateDNSName);
			case Ec2Package.INSTANCEEC2__PRIVATE_IP_V4_ADDRESS:
				return PRIVATE_IP_V4_ADDRESS_EDEFAULT == null ? privateIpV4Address != null : !PRIVATE_IP_V4_ADDRESS_EDEFAULT.equals(privateIpV4Address);
			case Ec2Package.INSTANCEEC2__PUBLIC_DNS_NAME:
				return PUBLIC_DNS_NAME_EDEFAULT == null ? publicDNSName != null : !PUBLIC_DNS_NAME_EDEFAULT.equals(publicDNSName);
			case Ec2Package.INSTANCEEC2__PUBLIC_IPV4_ADDRESS:
				return PUBLIC_IPV4_ADDRESS_EDEFAULT == null ? publicIpv4Address != null : !PUBLIC_IPV4_ADDRESS_EDEFAULT.equals(publicIpv4Address);
			case Ec2Package.INSTANCEEC2__RAM_DISK_ID:
				return RAM_DISK_ID_EDEFAULT == null ? ramDiskId != null : !RAM_DISK_ID_EDEFAULT.equals(ramDiskId);
			case Ec2Package.INSTANCEEC2__SRIOV_NET_SUPPORT:
				return SRIOV_NET_SUPPORT_EDEFAULT == null ? sriovNetSupport != null : !SRIOV_NET_SUPPORT_EDEFAULT.equals(sriovNetSupport);
			case Ec2Package.INSTANCEEC2__VIRTUALIZATION_TYPE:
				return virtualizationType != VIRTUALIZATION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Ec2Package.INSTANCEEC2___TERMINATE:
				terminate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", instanceId: ");
		result.append(instanceId);
		result.append(", instanceType: ");
		result.append(instanceType);
		result.append(", zoneName: ");
		result.append(zoneName);
		result.append(", imageId: ");
		result.append(imageId);
		result.append(", awsInstanceStatus: ");
		result.append(awsInstanceStatus);
		result.append(", launchTime: ");
		result.append(launchTime);
		result.append(", amiLaunchIndex: ");
		result.append(amiLaunchIndex);
		result.append(", ebsOptimizedIO: ");
		result.append(ebsOptimizedIO);
		result.append(", enaSupport: ");
		result.append(enaSupport);
		result.append(", hypervisor: ");
		result.append(hypervisor);
		result.append(", instanceLifeCycle: ");
		result.append(instanceLifeCycle);
		result.append(", kernelId: ");
		result.append(kernelId);
		result.append(", keyPairName: ");
		result.append(keyPairName);
		result.append(", monitoringState: ");
		result.append(monitoringState);
		result.append(", platform: ");
		result.append(platform);
		result.append(", privateDNSName: ");
		result.append(privateDNSName);
		result.append(", privateIpV4Address: ");
		result.append(privateIpV4Address);
		result.append(", publicDNSName: ");
		result.append(publicDNSName);
		result.append(", publicIpv4Address: ");
		result.append(publicIpv4Address);
		result.append(", ramDiskId: ");
		result.append(ramDiskId);
		result.append(", sriovNetSupport: ");
		result.append(sriovNetSupport);
		result.append(", virtualizationType: ");
		result.append(virtualizationType);
		result.append(')');
		return result.toString();
	}

} //Instanceec2Impl
