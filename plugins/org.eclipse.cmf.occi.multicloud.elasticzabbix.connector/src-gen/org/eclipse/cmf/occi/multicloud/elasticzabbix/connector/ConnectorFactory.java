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

/**
 * Connector EFactory for the OCCI extension:
 * - name: elasticzabbix
 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.ElasticzabbixFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
	 * - term: zabbixcollector
	 * - title: Zabbix collector for computes
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixcollector createZabbixcollector() {
		return new ZabbixcollectorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
	 * - term: zabbixsensor
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixsensor createZabbixsensor() {
		return new ZabbixsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
	 * - term: zabbixapiconnect
	 * - title: Zabbix connection to the request api
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect createZabbixapiconnect() {
		return new ZabbixapiconnectConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
	 * - term: cpu
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticzabbix.Cpu createCpu() {
		return new CpuConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
	 * - term: supervisorapiconnect
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect createSupervisorapiconnect() {
		return new SupervisorapiconnectConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticzabbix#
	 * - term: ram
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticzabbix.Ram createRam() {
		return new RamConnector();
	}

}
