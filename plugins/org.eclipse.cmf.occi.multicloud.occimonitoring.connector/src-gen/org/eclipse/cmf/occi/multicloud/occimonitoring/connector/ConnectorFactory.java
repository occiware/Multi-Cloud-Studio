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
 * Generated at Tue Oct 03 17:45:32 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.occimonitoring/model/occimonitoring.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.occimonitoring.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: occimonitoring
 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.occimonitoring.impl.OccimonitoringFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: zabbixinstance
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixinstance createZabbixinstance() {
		return new ZabbixinstanceConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: hostgroup
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroup createHostgroup() {
		return new HostgroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: zabbixtemplate
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate createZabbixtemplate() {
		return new ZabbixtemplateConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: hostgroulink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroulink createHostgroulink() {
		return new HostgroulinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: templatelink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Templatelink createTemplatelink() {
		return new TemplatelinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: metrics
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Metrics createMetrics() {
		return new MetricsConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: cpuusage
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Cpuusage createCpuusage() {
		return new CpuusageConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
	 * - term: memoryusage
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.occimonitoring.Memoryusage createMemoryusage() {
		return new MemoryusageConnector();
	}

}
