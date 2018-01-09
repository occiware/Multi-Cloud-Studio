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
package org.eclipse.cmf.occi.multicloud.aws.ec2.provider;


import awsregions.AwsregionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.provider.ComputeItemProvider;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsFactory;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Factory;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2;

import org.eclipse.cmf.occi.multicloud.regions.RegionsFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Instanceec2ItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instanceec2ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addInstanceIdPropertyDescriptor(object);
			addInstanceTypePropertyDescriptor(object);
			addRegionIdPropertyDescriptor(object);
			addZoneNamePropertyDescriptor(object);
			addImageIdPropertyDescriptor(object);
			addAwsInstanceStatusPropertyDescriptor(object);
			addLaunchTimePropertyDescriptor(object);
			addAmiLaunchIndexPropertyDescriptor(object);
			addEbsOptimizedIOPropertyDescriptor(object);
			addEnaSupportPropertyDescriptor(object);
			addHypervisorPropertyDescriptor(object);
			addInstanceLifeCyclePropertyDescriptor(object);
			addKernelIdPropertyDescriptor(object);
			addKeyPairNamePropertyDescriptor(object);
			addMonitoringStatePropertyDescriptor(object);
			addPlatformPropertyDescriptor(object);
			addPrivateDNSNamePropertyDescriptor(object);
			addPrivateIpV4AddressPropertyDescriptor(object);
			addPublicDNSNamePropertyDescriptor(object);
			addPublicIpv4AddressPropertyDescriptor(object);
			addRamDiskIdPropertyDescriptor(object);
			addSriovNetSupportPropertyDescriptor(object);
			addVirtualizationTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_name_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_instanceId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_instanceId_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_InstanceId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_instanceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_instanceType_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_InstanceType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Region Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_regionId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_regionId_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_RegionId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zone Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZoneNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_zoneName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_zoneName_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_ZoneName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_imageId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_imageId_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_ImageId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aws Instance Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwsInstanceStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_awsInstanceStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_awsInstanceStatus_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_AwsInstanceStatus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Launch Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLaunchTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_launchTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_launchTime_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_LaunchTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ami Launch Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmiLaunchIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_amiLaunchIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_amiLaunchIndex_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_AmiLaunchIndex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ebs Optimized IO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEbsOptimizedIOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_ebsOptimizedIO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_ebsOptimizedIO_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_EbsOptimizedIO(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ena Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnaSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_enaSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_enaSupport_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_EnaSupport(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hypervisor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHypervisorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_hypervisor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_hypervisor_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_Hypervisor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Life Cycle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceLifeCyclePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_instanceLifeCycle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_instanceLifeCycle_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_InstanceLifeCycle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kernel Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKernelIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_kernelId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_kernelId_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_KernelId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Pair Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPairNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_keyPairName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_keyPairName_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_KeyPairName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitoring State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_monitoringState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_monitoringState_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_MonitoringState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Platform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_platform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_platform_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_Platform(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private DNS Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateDNSNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_privateDNSName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_privateDNSName_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_PrivateDNSName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private Ip V4 Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivateIpV4AddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_privateIpV4Address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_privateIpV4Address_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_PrivateIpV4Address(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Public DNS Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicDNSNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_publicDNSName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_publicDNSName_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_PublicDNSName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Public Ipv4 Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicIpv4AddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_publicIpv4Address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_publicIpv4Address_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_PublicIpv4Address(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ram Disk Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRamDiskIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_ramDiskId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_ramDiskId_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_RamDiskId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sriov Net Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSriovNetSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_sriovNetSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_sriovNetSupport_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_SriovNetSupport(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Virtualization Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualizationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instanceec2_virtualizationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instanceec2_virtualizationType_feature", "_UI_Instanceec2_type"),
				 Ec2Package.eINSTANCE.getInstanceec2_VirtualizationType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Instanceec2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Instanceec2"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Instanceec2)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Instanceec2_type") :
			getString("_UI_Instanceec2_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Instanceec2.class)) {
			case Ec2Package.INSTANCEEC2__NAME:
			case Ec2Package.INSTANCEEC2__INSTANCE_ID:
			case Ec2Package.INSTANCEEC2__INSTANCE_TYPE:
			case Ec2Package.INSTANCEEC2__REGION_ID:
			case Ec2Package.INSTANCEEC2__ZONE_NAME:
			case Ec2Package.INSTANCEEC2__IMAGE_ID:
			case Ec2Package.INSTANCEEC2__AWS_INSTANCE_STATUS:
			case Ec2Package.INSTANCEEC2__LAUNCH_TIME:
			case Ec2Package.INSTANCEEC2__AMI_LAUNCH_INDEX:
			case Ec2Package.INSTANCEEC2__EBS_OPTIMIZED_IO:
			case Ec2Package.INSTANCEEC2__ENA_SUPPORT:
			case Ec2Package.INSTANCEEC2__HYPERVISOR:
			case Ec2Package.INSTANCEEC2__INSTANCE_LIFE_CYCLE:
			case Ec2Package.INSTANCEEC2__KERNEL_ID:
			case Ec2Package.INSTANCEEC2__KEY_PAIR_NAME:
			case Ec2Package.INSTANCEEC2__MONITORING_STATE:
			case Ec2Package.INSTANCEEC2__PLATFORM:
			case Ec2Package.INSTANCEEC2__PRIVATE_DNS_NAME:
			case Ec2Package.INSTANCEEC2__PRIVATE_IP_V4_ADDRESS:
			case Ec2Package.INSTANCEEC2__PUBLIC_DNS_NAME:
			case Ec2Package.INSTANCEEC2__PUBLIC_IPV4_ADDRESS:
			case Ec2Package.INSTANCEEC2__RAM_DISK_ID:
			case Ec2Package.INSTANCEEC2__SRIOV_NET_SUPPORT:
			case Ec2Package.INSTANCEEC2__VIRTUALIZATION_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createAwscredential()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createGeneralpurpose()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT2_nano()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT2_micro()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT2_small()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT2_medium()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT2_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT2_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT2_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM5_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM5_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM5_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM5_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM5_12xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM5_24xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM4_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM4_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM4_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM4_10xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM4_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM3_medium()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM3_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM3_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM3_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createComputeoptimized()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC5_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC5_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC5_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC5_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC5_9xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC5_18xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC4_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC4_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC4_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC4_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC4_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC3_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC3_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC3_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC3_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC3_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createMemoryoptimized()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1e_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1e_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1e_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1e_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1e_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1e_32xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createX1_32xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR4_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR4_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR4_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR4_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR4_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR4_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR3_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR3_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR3_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR3_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createR3_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createAcceleratedcomputing()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createP3_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createP3_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createP3_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createP2_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createP2_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createP2_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createStorageoptimized()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createG3_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createG3_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createG3_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createF1_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createF1_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createH1_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createH1_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createH1_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createH1_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI3_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI3_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI3_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI3_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI3_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI3_16xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI3_metal()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createD2_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createD2_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createD2_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createD2_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM1_small()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createT1_micro()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM1_medium()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM1_large()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM1_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC1_medium()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createC1_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createCc2_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createG2_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createG2_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createCg1_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM2_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM2_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createM2_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createCr1_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI2_xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI2_2xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI2_4xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createI2_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createHs1_8xlarge()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createPlacementgroup()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createRootdevicevolume()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createStatustransitionreason()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createTags()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 Ec2Factory.eINSTANCE.createInstancevpcinfo()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 RegionsFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 RegionsFactory.eINSTANCE.createAvailabilityzone()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 RegionsFactory.eINSTANCE.createEurope()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 RegionsFactory.eINSTANCE.createNorthamerica()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 RegionsFactory.eINSTANCE.createSouthamerica()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 RegionsFactory.eINSTANCE.createAsiapacific()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 RegionsFactory.eINSTANCE.createAfrica()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AccountsFactory.eINSTANCE.createBasiccredential()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AccountsFactory.eINSTANCE.createCertificatecredential()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AccountsFactory.eINSTANCE.createKeypaircredential()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AccountsFactory.eINSTANCE.createCloudcredential()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createUs_east_2()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createUs_east_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createEu_west_3()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createUs_west_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createEu_west_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createAp_south_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createSa_east_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createUs_west_2()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createEu_west_2()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createAp_southeast_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createCa_central_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createAp_northeast_2()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createAp_south_east2()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createEu_central_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 AwsregionsFactory.eINSTANCE.createAp_northeast_1()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 AccountsFactory.eINSTANCE.createCloudaccountlink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Ec2EditPlugin.INSTANCE;
	}

}
