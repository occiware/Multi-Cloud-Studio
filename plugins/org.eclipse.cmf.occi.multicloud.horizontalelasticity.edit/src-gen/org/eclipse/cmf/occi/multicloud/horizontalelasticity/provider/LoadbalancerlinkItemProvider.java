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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.core.provider.LinkItemProvider;

import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityFactory;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancerlink;

import org.eclipse.cmf.occi.multicloud.vmware.VmwareFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancerlink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadbalancerlinkItemProvider extends LinkItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadbalancerlinkItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns Loadbalancerlink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Loadbalancerlink"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Loadbalancerlink)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Loadbalancerlink_type") :
			getString("_UI_Loadbalancerlink_type") + " " + label;
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
				 HorizontalelasticityFactory.eINSTANCE.createCreation()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createSchedulingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createUniqueschedulingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createRecurringschedulingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createScalingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createDynamicscalingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createDynamicadjustmentscalingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createSimpledynamicscalingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createStepdynamicscalingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createManualscalingpolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createMetric()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createCpuutilisation()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 HorizontalelasticityFactory.eINSTANCE.createMemoryutilisation()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createIpnetwork()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createIpnetworkinterface()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createOs_tpl()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createResource_tpl()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createSsh_key()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createUser_data()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 VmwareFactory.eINSTANCE.createWindows()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 VmwareFactory.eINSTANCE.createLinux()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 VmwareFactory.eINSTANCE.createMacosx()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 VmwareFactory.eINSTANCE.createVmwarefolders()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 VmwareFactory.eINSTANCE.createOs_tpl_vmware()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 VmwareFactory.eINSTANCE.createSsh_user_data()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HorizontalelasticityEditPlugin.INSTANCE;
	}

}
