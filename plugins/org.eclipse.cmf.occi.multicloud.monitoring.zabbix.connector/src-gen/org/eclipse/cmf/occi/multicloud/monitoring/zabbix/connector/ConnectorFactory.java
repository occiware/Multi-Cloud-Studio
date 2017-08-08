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
 * Generated at Tue Aug 08 09:04:10 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.monitoring.zabbix/model/zabbix.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: zabbix
 * - scheme: http://occiware.org/occi/multicloud/monitoring/zabbix#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring/zabbix#
	 * - term: zabbixcollector
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixcollector createZabbixcollector() {
		return new ZabbixcollectorConnector();
	}

}
