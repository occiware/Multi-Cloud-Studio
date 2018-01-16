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
package org.eclipse.cmf.occi.multicloud.aws.ec2;

import org.eclipse.cmf.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instanceec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getZoneName <em>Zone Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAwsInstanceStatus <em>Aws Instance Status</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getLaunchTime <em>Launch Time</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAmiLaunchIndex <em>Ami Launch Index</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEbsOptimizedIO <em>Ebs Optimized IO</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEnaSupport <em>Ena Support</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getHypervisor <em>Hypervisor</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceLifeCycle <em>Instance Life Cycle</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKernelId <em>Kernel Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKeyPairName <em>Key Pair Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getMonitoringState <em>Monitoring State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateDNSName <em>Private DNS Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateIpV4Address <em>Private Ip V4 Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicDNSName <em>Public DNS Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicIpv4Address <em>Public Ipv4 Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getRamDiskId <em>Ram Disk Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getSriovNetSupport <em>Sriov Net Support</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getVirtualizationType <em>Virtualization Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2()
 * @model
 * @generated
 */
public interface Instanceec2 extends Compute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of this instance, this is represented by a tag on provider aws.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AWS instance id (i-xxxxxx)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Id</em>' attribute.
	 * @see #setInstanceId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_InstanceId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getInstanceId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceId <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Id</em>' attribute.
	 * @see #getInstanceId()
	 * @generated
	 */
	void setInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * The default value is <code>"t2.nano"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_InstanceType()
	 * @model default="t2.nano" dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The datacenter part. The number and mapping of Availability Zones per region may vary between AWS accounts
	 * If null, the provider will choose the best to fit with this instance.
	 * Zone : a, b, c, d, e
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Name</em>' attribute.
	 * @see #setZoneName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_ZoneName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getZoneName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getZoneName <em>Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Name</em>' attribute.
	 * @see #getZoneName()
	 * @generated
	 */
	void setZoneName(String value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID of the AMI used to launch the instance.
	 * Image provider Id, like ami-1a962263 for example. 
	 * It may be your own private ami or a market place ami.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_ImageId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Aws Instance Status</b></em>' attribute.
	 * The default value is <code>"notexist"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Instance Status</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState
	 * @see #setAwsInstanceStatus(AWSInstanceState)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_AwsInstanceStatus()
	 * @model default="notexist"
	 * @generated
	 */
	AWSInstanceState getAwsInstanceStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAwsInstanceStatus <em>Aws Instance Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Instance Status</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState
	 * @see #getAwsInstanceStatus()
	 * @generated
	 */
	void setAwsInstanceStatus(AWSInstanceState value);

	/**
	 * Returns the value of the '<em><b>Launch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the instance was launched.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launch Time</em>' attribute.
	 * @see #setLaunchTime(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_LaunchTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getLaunchTime();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getLaunchTime <em>Launch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Time</em>' attribute.
	 * @see #getLaunchTime()
	 * @generated
	 */
	void setLaunchTime(String value);

	/**
	 * Returns the value of the '<em><b>Ami Launch Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AMI launch index, which can be used to find this instance in the launch group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ami Launch Index</em>' attribute.
	 * @see #setAmiLaunchIndex(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_AmiLaunchIndex()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getAmiLaunchIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getAmiLaunchIndex <em>Ami Launch Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ami Launch Index</em>' attribute.
	 * @see #getAmiLaunchIndex()
	 * @generated
	 */
	void setAmiLaunchIndex(Integer value);

	/**
	 * Returns the value of the '<em><b>Ebs Optimized IO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the instance is optimized for Amazon EBS I/O.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ebs Optimized IO</em>' attribute.
	 * @see #setEbsOptimizedIO(boolean)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_EbsOptimizedIO()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean"
	 * @generated
	 */
	boolean isEbsOptimizedIO();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEbsOptimizedIO <em>Ebs Optimized IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ebs Optimized IO</em>' attribute.
	 * @see #isEbsOptimizedIO()
	 * @generated
	 */
	void setEbsOptimizedIO(boolean value);

	/**
	 * Returns the value of the '<em><b>Ena Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether enhanced networking with ENA is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ena Support</em>' attribute.
	 * @see #setEnaSupport(boolean)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_EnaSupport()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean"
	 * @generated
	 */
	boolean isEnaSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#isEnaSupport <em>Ena Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ena Support</em>' attribute.
	 * @see #isEnaSupport()
	 * @generated
	 */
	void setEnaSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Hypervisor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypervisor type of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hypervisor</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType
	 * @see #setHypervisor(HypervisorType)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_Hypervisor()
	 * @model
	 * @generated
	 */
	HypervisorType getHypervisor();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getHypervisor <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType
	 * @see #getHypervisor()
	 * @generated
	 */
	void setHypervisor(HypervisorType value);

	/**
	 * Returns the value of the '<em><b>Instance Life Cycle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this is a Spot Instance or a Scheduled Instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Life Cycle</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType
	 * @see #setInstanceLifeCycle(InstanceLifeCycleType)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_InstanceLifeCycle()
	 * @model
	 * @generated
	 */
	InstanceLifeCycleType getInstanceLifeCycle();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getInstanceLifeCycle <em>Instance Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Life Cycle</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType
	 * @see #getInstanceLifeCycle()
	 * @generated
	 */
	void setInstanceLifeCycle(InstanceLifeCycleType value);

	/**
	 * Returns the value of the '<em><b>Kernel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kernel associated with this instance, if applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kernel Id</em>' attribute.
	 * @see #setKernelId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_KernelId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getKernelId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKernelId <em>Kernel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Id</em>' attribute.
	 * @see #getKernelId()
	 * @generated
	 */
	void setKernelId(String value);

	/**
	 * Returns the value of the '<em><b>Key Pair Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the key pair, if this instance was launched with an associated key pair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Pair Name</em>' attribute.
	 * @see #setKeyPairName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_KeyPairName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getKeyPairName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getKeyPairName <em>Key Pair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Pair Name</em>' attribute.
	 * @see #getKeyPairName()
	 * @generated
	 */
	void setKeyPairName(String value);

	/**
	 * Returns the value of the '<em><b>Monitoring State</b></em>' attribute.
	 * The default value is <code>"disabled"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitoring State</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState
	 * @see #setMonitoringState(MonitoringState)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_MonitoringState()
	 * @model default="disabled"
	 * @generated
	 */
	MonitoringState getMonitoringState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getMonitoringState <em>Monitoring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring State</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState
	 * @see #getMonitoringState()
	 * @generated
	 */
	void setMonitoringState(MonitoringState value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is Windows for Windows instances; otherwise blank.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_Platform()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Private DNS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (IPv4 only) The private DNS hostname name assigned to the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private DNS Name</em>' attribute.
	 * @see #setPrivateDNSName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_PrivateDNSName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPrivateDNSName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateDNSName <em>Private DNS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private DNS Name</em>' attribute.
	 * @see #getPrivateDNSName()
	 * @generated
	 */
	void setPrivateDNSName(String value);

	/**
	 * Returns the value of the '<em><b>Private Ip V4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Ip V4 Address</em>' attribute.
	 * @see #setPrivateIpV4Address(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_PrivateIpV4Address()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPrivateIpV4Address();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPrivateIpV4Address <em>Private Ip V4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Ip V4 Address</em>' attribute.
	 * @see #getPrivateIpV4Address()
	 * @generated
	 */
	void setPrivateIpV4Address(String value);

	/**
	 * Returns the value of the '<em><b>Public DNS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (IPv4 only) The public DNS name assigned to the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public DNS Name</em>' attribute.
	 * @see #setPublicDNSName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_PublicDNSName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPublicDNSName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicDNSName <em>Public DNS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public DNS Name</em>' attribute.
	 * @see #getPublicDNSName()
	 * @generated
	 */
	void setPublicDNSName(String value);

	/**
	 * Returns the value of the '<em><b>Public Ipv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Ipv4 Address</em>' attribute.
	 * @see #setPublicIpv4Address(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_PublicIpv4Address()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPublicIpv4Address();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getPublicIpv4Address <em>Public Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Ipv4 Address</em>' attribute.
	 * @see #getPublicIpv4Address()
	 * @generated
	 */
	void setPublicIpv4Address(String value);

	/**
	 * Returns the value of the '<em><b>Ram Disk Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RAM disk associated with this instance, if applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram Disk Id</em>' attribute.
	 * @see #setRamDiskId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_RamDiskId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRamDiskId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getRamDiskId <em>Ram Disk Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Disk Id</em>' attribute.
	 * @see #getRamDiskId()
	 * @generated
	 */
	void setRamDiskId(String value);

	/**
	 * Returns the value of the '<em><b>Sriov Net Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sriov Net Support</em>' attribute.
	 * @see #setSriovNetSupport(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_SriovNetSupport()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSriovNetSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getSriovNetSupport <em>Sriov Net Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sriov Net Support</em>' attribute.
	 * @see #getSriovNetSupport()
	 * @generated
	 */
	void setSriovNetSupport(String value);

	/**
	 * Returns the value of the '<em><b>Virtualization Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The virtualization type of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtualization Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType
	 * @see #setVirtualizationType(VirtualizationType)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstanceec2_VirtualizationType()
	 * @model
	 * @generated
	 */
	VirtualizationType getVirtualizationType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2#getVirtualizationType <em>Virtualization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtualization Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType
	 * @see #getVirtualizationType()
	 * @generated
	 */
	void setVirtualizationType(VirtualizationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Terminate - delete the instance on provider
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void terminate();

} // Instanceec2
