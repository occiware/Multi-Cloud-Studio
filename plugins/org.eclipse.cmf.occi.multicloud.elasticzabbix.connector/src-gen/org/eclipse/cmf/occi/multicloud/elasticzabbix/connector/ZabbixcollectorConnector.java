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
import java.util.List;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.monitoring.Metric;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.driver.IZabbixDriver;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.driver.ZabbixDriver;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.exception.MonitorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
 * - term: zabbixcollector
 * - title: Zabbix collector for computes
 */
public class ZabbixcollectorConnector extends org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixcollectorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixcollectorConnector.class);

	// Start of user code Zabbixcollectorconnector_constructor
	/**
	 * Constructs a zabbixcollector connector.
	 */
	ZabbixcollectorConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ZabbixcollectorocciCreate
	/**
	 * Called when this Zabbixcollector instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		ZabbixapiconnectConnector zabbixConnectMixin = getZabbixApiConnectMixin();
		if (zabbixConnectMixin == null) {
			LOGGER.error("You must use the ZabbixApiConnect mixin to use this connector.");
			return;
		}
		ZabbixDriver zabbixDriver = zabbixConnectMixin.buildZabbixDriver();
		List<MixinBase> mixins = getMetricMixins();
		for (MixinBase mixin : mixins) {
			if (mixin instanceof IZabbixDriver) {
				((IZabbixDriver) mixin).setZabbixDriver(zabbixDriver);
			}
		}
		
		// Allocate the instance on zabbix if the instance doesnt exist on zabbix, simply check if there is a hostId on zabbix for the hostgroup.
		getHostId();
	}
	// End of user code

	// Start of user code Zabbixcollector_occiRetrieve_method
	/**
	 * Called when this Zabbixcollector instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		
		// Get the hostId and update metrics on demand.
		int hostId = getHostId();
		if (hostId == 0) {
			LOGGER.warn("Instance doesnt exit on zabbix server.");
		} else {
			// Retrieve metrics defined as mixin from the zabbix server.
			List<MixinBase> metrics = getMetricMixins();
			ZabbixapiconnectConnector zabbixApi = getZabbixApiConnectMixin();
			if (zabbixApi == null) {
				LOGGER.warn("Cant retrieve collector informations, there is no zabbixApi mixin set.");
				return;
			}
			try {
				String token = zabbixApi.getAuthToken();
				for (MixinBase metric : metrics) {
					if (metric instanceof IZabbixDriver) {
						// This will get the corresponding metrics on zabbix server and update attributes on corresponding mixins.
						((IZabbixDriver) metric).getMetrics(token, hostId);
					}
				}
			} catch (MonitorException ex) {
				LOGGER.error(ex.getMessage());
			}
		}
		
	}
	// End of user code

	// Start of user code Zabbixcollector_occiUpdate_method
	/**
	 * Called when this Zabbixcollector instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Build a new driver to assume that fields on connect mixins are updated.
		ZabbixapiconnectConnector zabbixConnectMixin = getZabbixApiConnectMixin();
		if (zabbixConnectMixin == null) {
			LOGGER.error("You must use the ZabbixApiConnect mixin to use this connector.");
			return;
		}
		ZabbixDriver zabbixDriver = zabbixConnectMixin.buildZabbixDriver();
		List<MixinBase> mixins = getMetricMixins();
		for (MixinBase mixin : mixins) {
			if (mixin instanceof IZabbixDriver) {
				((IZabbixDriver) mixin).setZabbixDriver(zabbixDriver);
			}
		}
		
		// Allocate the instance on zabbix if the instance doesnt exist on zabbix, simply check if there is a hostId on zabbix for the hostgroup.
		int hostId = getHostId();
		
	}
	// End of user code

	// Start of user code ZabbixcollectorocciDelete_method
	/**
	 * Called when this Zabbixcollector instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		
		ZabbixapiconnectConnector zabbixApiMixin = getZabbixApiConnectMixin();
		if (zabbixApiMixin == null) {
			LOGGER.error("Cannot remove instance from zabbix ==> no mixin to connect on zabbix server.");
			return;
		}
		int hostId = getHostId();
		if (hostId == 0) {
			LOGGER.warn("Instance : " + instanceName + " is already removed.");
		} else {
			try {
				String authToken = zabbixApiMixin.getAuthToken();
				zabbixApiMixin.removeInstanceFromZabbix(authToken, instanceIp);
			} catch (MonitorException ex) {
				LOGGER.error("Cant remove from zabbix, instance : " + instanceName + " --> " + ex.getMessage());
				return;
			}
			LOGGER.info("Instance : " + instanceName + " is removed from zabbix server !");
		}
		
	
	}
	// End of user code
	
	
	
	//
	// Zabbixcollector actions.
	//
	
	/**
	 * Get the MixinBase instance "ZabbixapiconnectConnector".
	 * 
	 * @return
	 */
	public ZabbixapiconnectConnector getZabbixApiConnectMixin() {
		List<MixinBase> mixinBase = this.getParts();
		ZabbixapiconnectConnector apiConnector = null;
		for (MixinBase mixinB : mixinBase) {
			if (mixinB instanceof ZabbixapiconnectConnector) {
				apiConnector = (ZabbixapiconnectConnector) mixinB;
				break;
			}
		}
		return apiConnector;
	}

	/**
	 * Get all Metric mixinbase.
	 * 
	 * @return
	 */
	private List<MixinBase> getMetricMixins() {
		List<MixinBase> mixins = this.getParts();
		List<MixinBase> result = new ArrayList<>();
		for (MixinBase mixinB : mixins) {
			if (mixinB instanceof Metric) {
				result.add(mixinB);
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @return
	 */
	private int getHostId() {
		int hostId = 0;
		ZabbixapiconnectConnector zabbixConnectMixin = getZabbixApiConnectMixin();
		if (zabbixConnectMixin == null) {
			return 0;
		}
		try {
			String authToken = zabbixConnectMixin.getAuthToken();
			hostId = zabbixConnectMixin.getHostIdFromZabbix(authToken, this.instanceIp, this.instanceName);
			if (hostId == 0) {
				// Assign the instance to hostgroup on zabbix server.
				zabbixConnectMixin.assignHostToHostGroupOnZabbix(authToken, this.instanceIp, this.instanceName);
			}
		} catch (MonitorException ex) {
			LOGGER.error("Zabbix error when assigning resource to zabbix server: " + ex.getMessage());
		}
		return hostId;
	}
	
}	
