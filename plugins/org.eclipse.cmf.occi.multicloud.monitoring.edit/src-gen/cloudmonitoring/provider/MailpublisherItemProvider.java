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
package cloudmonitoring.provider;


import cloudmonitoring.CloudmonitoringPackage;
import cloudmonitoring.Mailpublisher;
import cloudmonitoring.MonitorState;

import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.provider.MixinBaseItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cloudmonitoring.Mailpublisher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MailpublisherItemProvider extends MixinBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailpublisherItemProvider(AdapterFactory adapterFactory) {
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

			addPublisherStatePropertyDescriptor(object);
			addMailAddressPropertyDescriptor(object);
			addPostOnCpuAlertPropertyDescriptor(object);
			addPostOnRamAlertPropertyDescriptor(object);
			addPostOnNetworkIOAlertPropertyDescriptor(object);
			addPostOnDiskIOAlertPropertyDescriptor(object);
			addNbEmailPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Publisher State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublisherStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Publishercontrol_publisherState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Publishercontrol_publisherState_feature", "_UI_Publishercontrol_type"),
				 CloudmonitoringPackage.Literals.PUBLISHERCONTROL__PUBLISHER_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mail Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMailAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mailpublisher_mailAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mailpublisher_mailAddress_feature", "_UI_Mailpublisher_type"),
				 CloudmonitoringPackage.Literals.MAILPUBLISHER__MAIL_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post On Cpu Alert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostOnCpuAlertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mailpublisher_postOnCpuAlert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mailpublisher_postOnCpuAlert_feature", "_UI_Mailpublisher_type"),
				 CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_CPU_ALERT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post On Ram Alert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostOnRamAlertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mailpublisher_postOnRamAlert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mailpublisher_postOnRamAlert_feature", "_UI_Mailpublisher_type"),
				 CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_RAM_ALERT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post On Network IO Alert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostOnNetworkIOAlertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mailpublisher_postOnNetworkIOAlert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mailpublisher_postOnNetworkIOAlert_feature", "_UI_Mailpublisher_type"),
				 CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post On Disk IO Alert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostOnDiskIOAlertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mailpublisher_postOnDiskIOAlert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mailpublisher_postOnDiskIOAlert_feature", "_UI_Mailpublisher_type"),
				 CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_DISK_IO_ALERT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mailpublisher_nbEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mailpublisher_nbEmail_feature", "_UI_Mailpublisher_type"),
				 CloudmonitoringPackage.Literals.MAILPUBLISHER__NB_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Mailpublisher.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mailpublisher"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		MonitorState labelValue = ((Mailpublisher)object).getPublisherState();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Mailpublisher_type") :
			getString("_UI_Mailpublisher_type") + " " + label;
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

		switch (notification.getFeatureID(Mailpublisher.class)) {
			case CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE:
			case CloudmonitoringPackage.MAILPUBLISHER__MAIL_ADDRESS:
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_CPU_ALERT:
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_RAM_ALERT:
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT:
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_DISK_IO_ALERT:
			case CloudmonitoringPackage.MAILPUBLISHER__NB_EMAIL:
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CloudmonitoringEditPlugin.INSTANCE;
	}

}
