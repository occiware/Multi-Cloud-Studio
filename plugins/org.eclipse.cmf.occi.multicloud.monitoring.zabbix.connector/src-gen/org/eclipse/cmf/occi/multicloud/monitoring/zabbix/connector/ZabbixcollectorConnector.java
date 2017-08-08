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
 * Generated at Tue Aug 08 09:43:36 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.monitoring.zabbix/model/zabbix.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.ITinomCollector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.occiware.tinom.model.Collector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/monitoring/zabbix#
 * - term: zabbixcollector
 * - title: 
 */
public class ZabbixcollectorConnector extends org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixcollectorImpl implements ITinomCollector
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixcollectorConnector.class);

	// Start of user code Zabbixcollectorconnector_constructor
	/**
	 * Constructs a zabbixcollector connector.
	 */
	ZabbixcollectorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
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
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Zabbixcollector_occiRetrieve_method
	/**
	 * Called when this Zabbixcollector instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
		
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
		// TODO: Implement this callback or remove this method.
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
		// TODO: Implement this callback or remove this method.
	}
	// End of user code
	@Override
	public Collector buildTinomCollector() throws MonitorException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String[] getMetricsChannelToPublish() {
		// TODO Auto-generated method stub
		return null;
	}

	//
	// Zabbixcollector actions.
	//
}	
