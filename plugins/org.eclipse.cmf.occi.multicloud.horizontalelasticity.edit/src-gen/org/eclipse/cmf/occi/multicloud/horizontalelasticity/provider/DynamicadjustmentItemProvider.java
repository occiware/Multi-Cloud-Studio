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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicadjustmentItemProvider extends DynamicItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicadjustmentItemProvider(AdapterFactory adapterFactory) {
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

			addDynamicAdjustmentNamePropertyDescriptor(object);
			addDynamicAdjustmentMetricPropertyDescriptor(object);
			addDynamicAdjustmentCoolDurationPropertyDescriptor(object);
			addDynamicAdjustmentDisableScaleInPropertyDescriptor(object);
			addDynamicAdjustmentTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dynamic Adjustment Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicAdjustmentNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustment_dynamicAdjustmentName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustment_dynamicAdjustmentName_feature", "_UI_Dynamicadjustment_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Adjustment Metric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicAdjustmentMetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustment_dynamicAdjustmentMetric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustment_dynamicAdjustmentMetric_feature", "_UI_Dynamicadjustment_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Adjustment Cool Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicAdjustmentCoolDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustment_dynamicAdjustmentCoolDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustment_dynamicAdjustmentCoolDuration_feature", "_UI_Dynamicadjustment_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Adjustment Disable Scale In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicAdjustmentDisableScaleInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustment_dynamicAdjustmentDisableScaleIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustment_dynamicAdjustmentDisableScaleIn_feature", "_UI_Dynamicadjustment_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Adjustment Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicAdjustmentTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustment_dynamicAdjustmentTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustment_dynamicAdjustmentTarget_feature", "_UI_Dynamicadjustment_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Dynamicadjustment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dynamicadjustment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dynamicadjustment)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Dynamicadjustment_type") :
			getString("_UI_Dynamicadjustment_type") + " " + label;
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

		switch (notification.getFeatureID(Dynamicadjustment.class)) {
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME:
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC:
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION:
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN:
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET:
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

}
