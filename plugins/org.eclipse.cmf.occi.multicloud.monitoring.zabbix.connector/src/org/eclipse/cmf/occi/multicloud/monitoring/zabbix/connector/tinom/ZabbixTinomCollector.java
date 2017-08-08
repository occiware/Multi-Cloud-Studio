package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.ZabbixapiconnectConnector;
import org.occiware.tinom.model.Collector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ZabbixTinomCollector extends Collector {
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixTinomCollector.class);
	
	private ZabbixapiconnectConnector zabbixApiMixin = null;
	private String authToken;
	private String computeToMonitorIpAddress;
	
	public ZabbixTinomCollector(String name) {
		super(name);
		LOGGER.info("Constructor zabbix tinom collector called (by name).");
	}
	
	public ZabbixTinomCollector(String name, int period) {
		super(name, period);
		LOGGER.info("Constructor with name AND period called. : " + name + " --> " + period);
	}
	
	@Override
	public void run() {
		// Note: Default implementation (Collector) does nothing.
		
		if (zabbixApiMixin == null) {
			LOGGER.warn("No mixin connect api set, returning with no collected values.");
			return;
		}
		
		// Realize a connection to zabbix, set the authToken field and make request on metrics level.
		// TODO !!!
		
		// Launch metric collection.
		this.getMetrics();
		
		
	}

	public ZabbixapiconnectConnector getZabbixApiMixin() {
		return zabbixApiMixin;
	}

	public void setZabbixApiMixin(ZabbixapiconnectConnector zabbixApiMixin) {
		this.zabbixApiMixin = zabbixApiMixin;
	}

	public String getComputeToMonitorIpAddress() {
		return computeToMonitorIpAddress;
	}

	public void setComputeToMonitorIpAddress(String computeToMonitorIpAddress) {
		this.computeToMonitorIpAddress = computeToMonitorIpAddress;
	}
	
	
	
}
