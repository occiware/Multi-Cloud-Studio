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

import java.util.List;

import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.driver.ZabbixDriver;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.exception.MonitorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
 * - term: zabbixapiconnect
 * - title: Zabbix connection to the request api
 */
public class ZabbixapiconnectConnector extends org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ZabbixapiconnectImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixapiconnectConnector.class);

	private ZabbixDriver driver = null;
	
	
	// Start of user code Zabbixapiconnectconnector_constructor
	/**
	 * Constructs a zabbixapiconnect connector.
	 */
	ZabbixapiconnectConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	
	public ZabbixDriver buildZabbixDriver() {
		ZabbixDriver zabbixDriver = new ZabbixDriver(username, password, httpApiAddress, hostGroupName, templateName, port);
		this.driver = zabbixDriver;
		return zabbixDriver;	
	}
	
	public String getAuthToken() throws MonitorException {
		String token;
		if (driver == null) {
			buildZabbixDriver();
		}
		try {
			token = driver.getAuthToken();
		} catch (MonitorException ex) {
			LOGGER.error(ex.getMessage());
			throw ex;
		}	
		return token;
	}
	
	/**
	 * 
	 * @param authToken
	 * @param ip
	 * @param vmName
	 * @return
	 * @throws MonitorException
	 */
	public int getHostIdFromZabbix(final String authToken, final String ip, final String vmName) throws MonitorException {
		int hostId = 0;
		if (ip == null && vmName == null) {
			throw new MonitorException("No ipAddress and instanceName resource to monitor set.");
		}
		
		try {
			hostId = getHostIdFromIp(authToken, ip);	
			
			if (hostId == 0) {
				// Check with name.
				hostId = getHostIdFromName(authToken, vmName);
			}
		} catch (MonitorException ex) {
			LOGGER.error(ex.getMessage());
			throw ex;
		}
		
		return hostId;
		
		
	}
	
	/**
	 * 
	 * @param authToken
	 * @param ip
	 * @return
	 * @throws MonitorException
	 */
	public int getHostIdFromIp(final String authToken, final String ip) throws MonitorException {
		int hostId = 0;
		try {
			if (ip == null) {
				return 0;
			}
			hostId = driver.getHostByIp(authToken, ip);
		} catch (MonitorException ex) {
			LOGGER.error(ex.getMessage());
		}
		return hostId;
	}
	
	/**
	 * 
	 * @param authToken
	 * @param name
	 * @return
	 * @throws MonitorException
	 */
	public int getHostIdFromName(final String authToken, final String name) throws MonitorException {
		int hostId = 0;
		try {
			if (name == null) {
				return 0;
			}
			hostId = driver.getHostByName(authToken, name);
		} catch (MonitorException ex) {
			LOGGER.error(ex.getMessage());
		}
		return hostId;
	}
	
	
	/**
	 * 
	 * @param token
	 * @param name
	 * @param ip
	 * @throws MonitorException
	 */
	public void assignHostToHostGroupOnZabbix(final String token, final String ip, final String name) throws MonitorException {
		driver.assignHostToHostgroup(token, name, ip);
	}

	/**
	 * 
	 * @param authToken
	 * @param ip
	 * @throws MonitorException
	 */
	public void removeInstanceFromZabbix(String authToken , String ip) throws MonitorException {
		driver.deleteHost(authToken, ip);
	}
	
}	
