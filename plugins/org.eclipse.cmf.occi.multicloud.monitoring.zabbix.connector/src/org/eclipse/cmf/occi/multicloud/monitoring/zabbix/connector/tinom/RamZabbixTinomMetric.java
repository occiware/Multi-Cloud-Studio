package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.Constants;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.ZabbixapiconnectConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RamZabbixTinomMetric extends ZabbixMetric {
	
	public static final String METRIC_NAME = "RamPercent";
	private static Logger LOGGER = LoggerFactory.getLogger(RamZabbixTinomMetric.class);
	
	public RamZabbixTinomMetric(String name) {
		super(name);
		// Define channels.
		setOutputNames(new String[] { Constants.CHANNEL_RAM_USED, Constants.CHANNEL_RAM_FREE, Constants.CHANNEL_RAM_SWAP });
	}

	
	@Override
	public String get(String channelName) throws NoSuchFieldException {
		Double value = 0.0;
		String authToken = getAuthToken();
		if (channelName == null) {
			throw new NoSuchFieldException("No channel set on input for Cpu metric.");
		}
		if (!channelName.equals(Constants.CHANNEL_RAM_USED) && !channelName.equals(Constants.CHANNEL_RAM_FREE) && !channelName.equals(Constants.CHANNEL_RAM_SWAP)) {
			LOGGER.error("unknown channel : " + channelName + " --> on ram metric.");
			throw new NoSuchFieldException("unknown channel : " + channelName + " --> on ram metric.");
		}
		
		if (authToken == null) {
			LOGGER.error("No zabbix authentication token on channel: " + channelName);
			return value.toString();
		}
		if (getHostId() == 0) {
			LOGGER.error("zabbix host id is not set on ram metric.");
			return value.toString();
		}
		if (getZabbixApiMixin() != null) {
			// Get the value of the channel.
			switch (channelName) {
			case Constants.CHANNEL_RAM_FREE:
				try {
					int avail = getZabbixApiMixin().availableMemory(authToken, getHostId());
					int total = getZabbixApiMixin().totalMemory(authToken, getHostId());
					if (total != 0) {
						value = new Double(((avail/total) * 100));
					}
					
				} catch (MonitorException | NumberFormatException ex) {
					throw new NoSuchFieldException(ex.getMessage());
				}
				break;
			case Constants.CHANNEL_RAM_USED:
				try {
					int total = getZabbixApiMixin().totalMemory(authToken, getHostId());
					int available = getZabbixApiMixin().availableMemory(authToken, getHostId());
					int usedRam = total - available;
					if (total != 0) {
						value = new Double(((usedRam/total)*100));
					}
					
				} catch (MonitorException ex) {
					throw new NoSuchFieldException(ex.getMessage());
				}
				break;
			
			case Constants.CHANNEL_RAM_SWAP:
				// TODO : Create swap ram channel.
				break;
			}
			
		}
		return value.toString();
	}

}
