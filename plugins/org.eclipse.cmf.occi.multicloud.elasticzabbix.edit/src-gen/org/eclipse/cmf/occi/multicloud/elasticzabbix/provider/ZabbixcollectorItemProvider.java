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
package org.eclipse.cmf.occi.multicloud.elasticzabbix.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.provider.CollectorItemProvider;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixFactory;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZabbixcollectorItemProvider extends CollectorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZabbixcollectorItemProvider(AdapterFactory adapterFactory) {
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

			addInstanceIpPropertyDescriptor(object);
			addInstanceNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Zabbixcollector_instanceIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Zabbixcollector_instanceIp_feature", "_UI_Zabbixcollector_type"),
				 ElasticzabbixPackage.Literals.ZABBIXCOLLECTOR__INSTANCE_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Zabbixcollector_instanceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Zabbixcollector_instanceName_feature", "_UI_Zabbixcollector_type"),
				 ElasticzabbixPackage.Literals.ZABBIXCOLLECTOR__INSTANCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Zabbixcollector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Zabbixcollector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Zabbixcollector)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Zabbixcollector_type") :
			getString("_UI_Zabbixcollector_type") + " " + label;
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

		switch (notification.getFeatureID(Zabbixcollector.class)) {
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_IP:
			case ElasticzabbixPackage.ZABBIXCOLLECTOR__INSTANCE_NAME:
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
				 ElasticzabbixFactory.eINSTANCE.createZabbixapiconnect()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 ElasticzabbixFactory.eINSTANCE.createCpu()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 ElasticzabbixFactory.eINSTANCE.createSupervisorapiconnect()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 ElasticzabbixFactory.eINSTANCE.createRam()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ElasticzabbixEditPlugin.INSTANCE;
	}

}
