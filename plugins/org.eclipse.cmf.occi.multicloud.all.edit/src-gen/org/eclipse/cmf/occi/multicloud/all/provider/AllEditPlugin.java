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
package org.eclipse.cmf.occi.multicloud.all.provider;

import awsaccounts.provider.AwsaccountsEditPlugin;
import awsregions.provider.AwsregionsEditPlugin;

import identity.provider.IdentityEditPlugin;
import org.eclipse.cmf.occi.core.provider.OCCIEditPlugin;

import org.eclipse.cmf.occi.crtp.provider.CrtpEditPlugin;

import org.eclipse.cmf.occi.infrastructure.provider.InfrastructureEditPlugin;

import org.eclipse.cmf.occi.monitoring.provider.MonitoringEditPlugin;

import org.eclipse.cmf.occi.multicloud.accounts.provider.AccountsEditPlugin;

import org.eclipse.cmf.occi.multicloud.aws.ec2.provider.Ec2EditPlugin;

import org.eclipse.cmf.occi.multicloud.interoperability.provider.InteroperabilityEditPlugin;

import org.eclipse.cmf.occi.multicloud.regions.provider.RegionsEditPlugin;

import org.eclipse.cmf.occi.multicloud.vmware.provider.VmwareEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import oscore.provider.OscoreEditPlugin;

/**
 * This is the central singleton for the All edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class AllEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AllEditPlugin INSTANCE = new AllEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllEditPlugin() {
		super
		  (new ResourceLocator [] {
		     InfrastructureEditPlugin.INSTANCE,
		     MonitoringEditPlugin.INSTANCE,
		     AccountsEditPlugin.INSTANCE,
		     RegionsEditPlugin.INSTANCE,
		     AwsaccountsEditPlugin.INSTANCE,
		     AwsregionsEditPlugin.INSTANCE,
		     Ec2EditPlugin.INSTANCE,
		     VmwareEditPlugin.INSTANCE,
		     InteroperabilityEditPlugin.INSTANCE,
		     OscoreEditPlugin.INSTANCE,
		     IdentityEditPlugin.INSTANCE,
		     OCCIEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
