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
package org.eclipse.cmf.occi.multicloud.elasticocci.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.provider.MixinBaseItemProvider;

import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage;
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategycpuItemProvider extends MixinBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategycpuItemProvider(AdapterFactory adapterFactory) {
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

			addStrategyComputeUthresholdPropertyDescriptor(object);
			addStrategyComputeBreathDownPropertyDescriptor(object);
			addStrategyComputeBreathUpPropertyDescriptor(object);
			addStrategyComputePollTimePropertyDescriptor(object);
			addStrategyComputeLthresholdPropertyDescriptor(object);
			addStrategyCPUUpperLimitPropertyDescriptor(object);
			addStrategyCPULowerLimitPropertyDescriptor(object);
			addStrategyCPUModePropertyDescriptor(object);
			addStrategyCPUDirectionPropertyDescriptor(object);
			addStrategyCPUStepCPUDecreasePropertyDescriptor(object);
			addStrategyCPUStepCPUIncreasePropertyDescriptor(object);
			addStrategyCPUDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Strategy Compute Uthreshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyComputeUthresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycompute_StrategyComputeUthreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycompute_StrategyComputeUthreshold_feature", "_UI_Strategycompute_type"),
				 ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Compute Breath Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyComputeBreathDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycompute_StrategyComputeBreathDown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycompute_StrategyComputeBreathDown_feature", "_UI_Strategycompute_type"),
				 ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Compute Breath Up feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyComputeBreathUpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycompute_StrategyComputeBreathUp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycompute_StrategyComputeBreathUp_feature", "_UI_Strategycompute_type"),
				 ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Compute Poll Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyComputePollTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycompute_StrategyComputePollTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycompute_StrategyComputePollTime_feature", "_UI_Strategycompute_type"),
				 ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Compute Lthreshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyComputeLthresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycompute_StrategyComputeLthreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycompute_StrategyComputeLthreshold_feature", "_UI_Strategycompute_type"),
				 ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy CPU Upper Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyCPUUpperLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycpu_StrategyCPUUpperLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycpu_StrategyCPUUpperLimit_feature", "_UI_Strategycpu_type"),
				 ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy CPU Lower Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyCPULowerLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycpu_StrategyCPULowerLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycpu_StrategyCPULowerLimit_feature", "_UI_Strategycpu_type"),
				 ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy CPU Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyCPUModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycpu_StrategyCPUMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycpu_StrategyCPUMode_feature", "_UI_Strategycpu_type"),
				 ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy CPU Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyCPUDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycpu_StrategyCPUDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycpu_StrategyCPUDirection_feature", "_UI_Strategycpu_type"),
				 ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy CPU Step CPU Decrease feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyCPUStepCPUDecreasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycpu_StrategyCPUStepCPUDecrease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycpu_StrategyCPUStepCPUDecrease_feature", "_UI_Strategycpu_type"),
				 ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy CPU Step CPU Increase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyCPUStepCPUIncreasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycpu_StrategyCPUStepCPUIncrease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycpu_StrategyCPUStepCPUIncrease_feature", "_UI_Strategycpu_type"),
				 ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy CPU Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyCPUDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategycpu_StrategyCPUDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategycpu_StrategyCPUDate_feature", "_UI_Strategycpu_type"),
				 ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Strategycpu.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Strategycpu"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((Strategycpu)object).getStrategyComputeUthreshold();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Strategycpu_type") :
			getString("_UI_Strategycpu_type") + " " + label;
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

		switch (notification.getFeatureID(Strategycpu.class)) {
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_MODE:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DIRECTION:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE:
			case ElasticocciPackage.STRATEGYCPU__STRATEGY_CPU_DATE:
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
		return ElasticocciEditPlugin.INSTANCE;
	}

}
