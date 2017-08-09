package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.Constants;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.ZabbixapiconnectConnector;
import org.occiware.tinom.model.Metric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CpuZabbixTinomMetric extends ZabbixMetric {
	
	private static Logger LOGGER = LoggerFactory.getLogger(CpuZabbixTinomMetric.class);
	public static final String METRIC_NAME = "CpuPercent";
	// public static final String CHANNEL_CPU_IDLE = "system.cpu.util[,idle]";
	// public static final String CHANNEL_CPU_AVG = "system.cpu.load";
	
	public CpuZabbixTinomMetric(String name) {
		super(name);
		// Define channels.
		setOutputNames(new String[] { Constants.CHANNEL_CPU_USED, Constants.CHANNEL_CPU_AVG });
	}

	/**
	 * Get Cpu utilization, loadavg from zabbix on channel.
	 */
	@Override
	public String get(String channelName) throws NoSuchFieldException {
		Double value = 0.0;
		String authToken = getAuthToken();
		if (channelName == null) {
			throw new NoSuchFieldException("No channel set on input for Cpu metric.");
		}
		if (!channelName.equals(Constants.CHANNEL_CPU_USED) && !channelName.equals(Constants.CHANNEL_CPU_AVG)) {
			LOGGER.error("unknown channel : " + channelName + " --> on cpu metric.");
			throw new NoSuchFieldException("unknown channel : " + channelName + " --> on cpu metric.");
		}
		
		if (authToken == null) {
			LOGGER.error("No zabbix authentication token on channel: " + channelName);
			return value.toString();
		}
		if (getHostId() == 0) {
			LOGGER.error("zabbix host id is not set on cpu metric.");
			return value.toString();
		}
		if (getZabbixApiMixin() != null) {
			// Get the value of the channel.
			switch (channelName) {
			case Constants.CHANNEL_CPU_USED:
				try {
					value = getZabbixApiMixin().cpuUtilization(getAuthToken(), getHostId());
				} catch (MonitorException ex) {
					throw new NoSuchFieldException(ex.getMessage());
				}
				break;
			case Constants.CHANNEL_CPU_AVG:
				try {
					value = getZabbixApiMixin().cpuLoad(authToken, getHostId());
				} catch (MonitorException ex) {
					throw new NoSuchFieldException(ex.getMessage());
				}
				break;
			}
		}
		return value.toString();
	}
	
}
