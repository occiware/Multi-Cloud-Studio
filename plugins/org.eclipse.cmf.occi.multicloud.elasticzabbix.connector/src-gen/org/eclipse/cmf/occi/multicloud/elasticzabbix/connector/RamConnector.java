/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Fri Aug 11 13:27:17 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.elasticzabbix/model/elasticzabbix.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.elasticzabbix.connector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.driver.IZabbixDriver;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.driver.ZabbixDriver;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.exception.MonitorException;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.utils.MixinBaseUtils;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.utils.MixinBaseUtilsHeadless;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.utils.UIDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
 * - term: ram
 * - title: 
 */
public class RamConnector extends org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.RamImpl implements IZabbixDriver
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(RamConnector.class);

	private ZabbixDriver driver;
	
	// Start of user code Ramconnector_constructor
	/**
	 * Constructs a ram connector.
	 */
	RamConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	@Override
	public void setZabbixDriver(ZabbixDriver driver) {
		this.driver = driver;
	}

	@Override
	public ZabbixDriver getZabbixDriver() {
		return driver;
	}
	@Override
	public void getMetrics(String token, int hostId) {
		// Loadavg metric and cpuused metric.
		Double ramFree;
		Double ramUtilization;
		Double ramSwap;
		try { 
			int ramTotal = driver.totalMemory(token, hostId);
			if (ramTotal == 0) {
				LOGGER.error("Cannot calculate used ram, total ram = 0 !");
				return;
			}
			int ramFreeInt = driver.availableMemory(token, hostId);
			// Calculate % free.
			ramUtilization = Double.parseDouble("" +((ramTotal - ramFreeInt) / ramTotal)*100);
			ramFree = Double.parseDouble(""+ ((ramFreeInt / ramTotal)*100));
			ramSwap = 0.0; // TODO : ram on swap disk.
			
			// Update attributes on this mixin base.
			updateAttributes(ramFree, ramSwap, ramUtilization);
					
		} catch (MonitorException ex) {
			LOGGER.error(ex.getMessage());
		}
		
	}

	/**
	 * Update attributes on this MixinBase model.
	 * @param cpuUtilization
	 * @param loadAvg
	 */
	private void updateAttributes(Double ramFree, Double ramSwap, Double ramUtilization) {
		Map<String, String> attrsToCreate = new HashMap<>();
		Map<String, String> attrsToUpdate = new HashMap<>();
		List<String> attrsToDelete = new ArrayList<>();
		
		if (MixinBaseUtils.getAttributeStateObject(this, "ramUsed") == null) {
			attrsToCreate.put("ramUsed", ramUtilization.toString());
		} else {
			attrsToUpdate.put("ramUsed", ramUtilization.toString());
		}
		this.setRamUsed(ramUtilization);
		
		if (MixinBaseUtils.getAttributeStateObject(this, "free") == null) {
			attrsToCreate.put("free", ramFree.toString());
		} else {
			attrsToUpdate.put("free", ramFree.toString());
		}
		this.setFree(ramFree);
		
		if (MixinBaseUtils.getAttributeStateObject(this, "swap") == null) {
			attrsToCreate.put("swap", ramSwap.toString());
		} else {
			attrsToUpdate.put("swap", ramSwap.toString());
		}
		this.setSwap(ramSwap);
		
		
		// Update mixin attribs.
		if (UIDialog.isStandAlone()) {
			// Headless environment.
			MixinBaseUtilsHeadless.updateAttributes(this, attrsToCreate, attrsToUpdate, attrsToDelete);
		} else {
			// Gui environment
			MixinBaseUtils.updateAttributes(this, attrsToCreate, attrsToUpdate, attrsToDelete);
		}
	}

	
	
}	
