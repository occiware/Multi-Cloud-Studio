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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamicadjustmentscalingpolicy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicadjustmentscalingpolicyItemProvider extends DynamicscalingpolicyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicadjustmentscalingpolicyItemProvider(AdapterFactory adapterFactory) {
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

			addDynamicadjustmentscalingpolicyMetricPropertyDescriptor(object);
			addDynamicadjustmentscalingpolicyDisableScaleInPropertyDescriptor(object);
			addDynamicadjustmentscalingpolicyTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dynamicadjustmentscalingpolicy Metric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicadjustmentscalingpolicyMetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustmentscalingpolicy_dynamicadjustmentscalingpolicyMetric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustmentscalingpolicy_dynamicadjustmentscalingpolicyMetric_feature", "_UI_Dynamicadjustmentscalingpolicy_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamicadjustmentscalingpolicy Disable Scale In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicadjustmentscalingpolicyDisableScaleInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustmentscalingpolicy_dynamicadjustmentscalingpolicyDisableScaleIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustmentscalingpolicy_dynamicadjustmentscalingpolicyDisableScaleIn_feature", "_UI_Dynamicadjustmentscalingpolicy_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamicadjustmentscalingpolicy Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicadjustmentscalingpolicyTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dynamicadjustmentscalingpolicy_dynamicadjustmentscalingpolicyTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dynamicadjustmentscalingpolicy_dynamicadjustmentscalingpolicyTarget_feature", "_UI_Dynamicadjustmentscalingpolicy_type"),
				 HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Dynamicadjustmentscalingpolicy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dynamicadjustmentscalingpolicy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((Dynamicadjustmentscalingpolicy)object).getDynamicscalingpolicyCoolDuration();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Dynamicadjustmentscalingpolicy_type") :
			getString("_UI_Dynamicadjustmentscalingpolicy_type") + " " + label;
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

		switch (notification.getFeatureID(Dynamicadjustmentscalingpolicy.class)) {
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC:
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN:
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET:
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
