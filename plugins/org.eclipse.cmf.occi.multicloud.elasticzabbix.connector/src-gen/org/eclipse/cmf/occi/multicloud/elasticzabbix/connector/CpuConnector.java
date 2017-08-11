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

import org.eclipse.cmf.occi.core.AttributeState;
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
 * - term: cpu
 * - title: 
 */
public class CpuConnector extends org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.CpuImpl implements IZabbixDriver {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CpuConnector.class);

	private ZabbixDriver driver; 
	
	// Start of user code Cpuconnector_constructor
	/**
	 * Constructs a cpu connector.
	 */
	CpuConnector() {
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
		return this.driver;
	}

	@Override
	public void getMetrics(String token, int hostId) {
		// Loadavg metric and cpuused metric.
		Double cpuUtilization;
		Double loadAvg;
		try { 
			cpuUtilization = driver.cpuUtilization(token, hostId);
			loadAvg = driver.cpuLoad(token, hostId);
			
			// Update attributes on this mixin base.
			updateAttributes(cpuUtilization, loadAvg);
			
		} catch (MonitorException ex) {
			LOGGER.error(ex.getMessage());
		}
		
		
	}
	
	/**
	 * Update attributes on this MixinBase model.
	 * @param cpuUtilization
	 * @param loadAvg
	 */
	private void updateAttributes(Double cpuUtilization, Double loadAvg) {
		Map<String, String> attrsToCreate = new HashMap<>();
		Map<String, String> attrsToUpdate = new HashMap<>();
		List<String> attrsToDelete = new ArrayList<>();
		
		if (MixinBaseUtils.getAttributeStateObject(this, "cpuUsed") == null) {
			attrsToCreate.put("cpuUsed", cpuUtilization.toString());
		} else {
			attrsToUpdate.put("cpuUsed", cpuUtilization.toString());
		}
		this.setCpuUsed(cpuUtilization);
		
		if (MixinBaseUtils.getAttributeStateObject(this, "loadAvg") == null) {
			attrsToCreate.put("loadAvg", loadAvg.toString());
		} else {
			attrsToUpdate.put("loadAvg", loadAvg.toString());
		}
		this.setLoadAvg(loadAvg);
		
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
