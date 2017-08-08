package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import org.occiware.tinom.model.Metric;

public class RamZabbixTinomMetric extends Metric {
	
	public static final String METRIC_NAME = "CpuPercent";
	
	public RamZabbixTinomMetric(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		// TODO Auto-generated method stub
		return null;
	}

}
