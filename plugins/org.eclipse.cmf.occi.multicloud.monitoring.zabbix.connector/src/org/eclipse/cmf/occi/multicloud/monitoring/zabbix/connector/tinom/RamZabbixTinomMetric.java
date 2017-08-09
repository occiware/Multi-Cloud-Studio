package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.Constants;

public class RamZabbixTinomMetric extends ZabbixMetric {
	
	public static final String METRIC_NAME = "RamPercent";
	
	public RamZabbixTinomMetric(String name) {
		super(name);
		// Define channels.
		setOutputNames(new String[] { Constants.CHANNEL_CPU_USED, Constants.CHANNEL_CPU_AVG });
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		
		return null;
	}

}
