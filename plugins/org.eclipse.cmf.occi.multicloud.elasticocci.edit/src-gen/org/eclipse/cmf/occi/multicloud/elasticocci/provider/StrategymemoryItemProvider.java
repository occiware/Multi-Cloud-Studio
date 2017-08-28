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
import org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategymemoryItemProvider extends MixinBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategymemoryItemProvider(AdapterFactory adapterFactory) {
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
			addStrategyMemoryModePropertyDescriptor(object);
			addStrategyMemoryDirectionPropertyDescriptor(object);
			addStrategyMemoryStepMemDecreasePropertyDescriptor(object);
			addStrategyMemoryStepMemIncreasePropertyDescriptor(object);
			addStrategyMemoryUpperLimitPropertyDescriptor(object);
			addStrategyMemoryLowerLimitPropertyDescriptor(object);
			addStrategyMemoryDatePropertyDescriptor(object);
			addStrategyMemoryIncreaseRelationalOpPropertyDescriptor(object);
			addStrategyMemoryDecreaseRelationalOpPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Strategy Memory Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryMode_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryDirection_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Step Mem Decrease feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryStepMemDecreasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryStepMemDecrease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryStepMemDecrease_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Step Mem Increase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryStepMemIncreasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryStepMemIncrease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryStepMemIncrease_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Upper Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryUpperLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryUpperLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryUpperLimit_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Lower Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryLowerLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryLowerLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryLowerLimit_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryDate_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Increase Relational Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryIncreaseRelationalOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryIncreaseRelationalOp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryIncreaseRelationalOp_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy Memory Decrease Relational Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyMemoryDecreaseRelationalOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategymemory_StrategyMemoryDecreaseRelationalOp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategymemory_StrategyMemoryDecreaseRelationalOp_feature", "_UI_Strategymemory_type"),
				 ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Strategymemory.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Strategymemory"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((Strategymemory)object).getStrategyComputeUthreshold();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Strategymemory_type") :
			getString("_UI_Strategymemory_type") + " " + label;
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

		switch (notification.getFeatureID(Strategymemory.class)) {
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_MODE:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DATE:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP:
			case ElasticocciPackage.STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP:
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
