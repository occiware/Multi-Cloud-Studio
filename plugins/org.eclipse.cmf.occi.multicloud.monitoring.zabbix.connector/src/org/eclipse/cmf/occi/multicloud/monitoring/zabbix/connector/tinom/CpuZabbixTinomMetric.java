package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.ZabbixapiconnectConnector;
import org.occiware.tinom.model.Metric;

public class CpuZabbixTinomMetric extends Metric {
	
	private ZabbixapiconnectConnector zabbixApiConnect;
	
	public static final String METRIC_NAME = "CpuPercent";
	
	public CpuZabbixTinomMetric(String name) {
		super(name);
		
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		
		
		
		
		return null;
	}
	
}
