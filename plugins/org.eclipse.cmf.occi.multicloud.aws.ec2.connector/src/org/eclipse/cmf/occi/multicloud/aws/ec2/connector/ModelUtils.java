/**
 * Copyright (c) 2018 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.eclipse.cmf.occi.multicloud.aws.ec2.connector;

import java.util.List;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccountlink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsAccountModelException;
import org.eclipse.cmf.occi.multicloud.regions.Regionlink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import awsregions.Awsregion;

public class ModelUtils {

	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(AwsaccountConnector.class);
	
	/**
	 * For resource satellite, it uses the same client.
	 * 
	 * @return
	 */
	public static AwsEC2Client getClientInstance(Entity entity) throws AwsAccountModelException {
		// Get client from AwsAccountConnector.
		AwsaccountConnector awsAccount = null;
		Resource res = null;
		if (entity instanceof Link) {
			res = ((Link)entity).getSource();
		} else {
			res = (Resource) entity;
		}
		int cpt = 0;
		while (awsAccount == null && res != null) {
			List<Link> links = res.getRlinks();
			awsAccount = findAccount(links);
			if (awsAccount == null) {
				// Search on the first link.
				if (links == null || links.isEmpty()) {
					break;
				}
				if (!links.isEmpty()) {
					res = links.get(0).getSource();
				}
			}
			cpt++;
			if (cpt > 500) {
				break;
			}
		}
		
		Awsregion region = null;
		if (awsAccount != null) {
			// Search for the region resource.
			List<Link> links = res.getRlinks();
			for (Link link : links) {
				if (link instanceof Regionlink) {
					region = (Awsregion) ((Regionlink) link).getSource();
					break;
				}
			}
		}
		
		if (awsAccount == null) {
			LOGGER.error("Cant find awsaccount model. Please check your configuration.");
			throw new AwsAccountModelException("Cant find awsaccount model. Please check your configuration.");
		}
		if (region != null) {
			// Update client with new region.
			String regionId = region.getRegionId();
			String newRegionId = null;
				// Check if a region mixin is set on region object, if this is the case, this override the regionId attribute of the resource Awsregion.
			if (!region.getParts().isEmpty()) {
				for (MixinBase mixinB : region.getParts()) {
					Mixin mixinRegion = mixinB.getMixin();
					List<Attribute> attrs = mixinRegion.getAttributes();
					// List<AttributeState> attrStates = mixinB.getAttributes();
					
					for (Attribute attr : attrs) {
						if (attr.getName().equals("regionId")) {
							// Get the regionId value.
							// TODO : Manage region mixin for description etc..
							// Get only default value.
							newRegionId = attr.getDefault();
							break;
						}
					}
					
				}
			}
			if (regionId != null && newRegionId != null && !regionId.equals(newRegionId)) {
				System.out.println("Change region from : " + regionId + " -->" + newRegionId);
				awsAccount.setRegionId(newRegionId);
			} else if (regionId != null && newRegionId == null) {
				System.out.println("Region set : " + regionId);
				awsAccount.setRegionId(regionId);
			} else if (regionId == null && newRegionId != null) {
				System.out.println("Set region with account : " + awsAccount.getTitle() + " --> " + newRegionId);
				awsAccount.setRegionId(newRegionId);
			} else {
				System.err.println("Warning : No region is set");
				throw new AwsAccountModelException("Warning: no region is set on model, please check your configuration, you must add Awsregion and at least set a regionId attribute.");
			}
			
			
			
		}
		return awsAccount.getEc2Client();
	}
	
	/**
	 * 
	 * @param links
	 * @return
	 */
	private static AwsaccountConnector findAccount(List<Link> links) {
		AwsaccountConnector awsAccount = null;
		Cloudaccountlink cloudAcclink = null;
		for (Link link : links) {
			if (link instanceof Cloudaccountlink) {
				cloudAcclink = (Cloudaccountlink) link;
				break;
			}
		}
		if (cloudAcclink != null) {
			awsAccount = (AwsaccountConnector) cloudAcclink.getSource(); 
		}
		return awsAccount;
	}
	
	
}
