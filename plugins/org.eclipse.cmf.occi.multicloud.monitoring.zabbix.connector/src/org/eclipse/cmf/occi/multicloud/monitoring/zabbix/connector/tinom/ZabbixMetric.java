package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.ZabbixapiconnectConnector;
import org.occiware.tinom.model.Metric;

public abstract class ZabbixMetric extends Metric {

	private ZabbixapiconnectConnector zabbixApiMixin = null;
	
	private String authToken = null;
	
	/**
	 * Zabbix hostId value, set if the host is referenced on zabbix.
	 */
	private int hostId;
	
	public ZabbixMetric(String name) {
		super(name);
	}

	@Override
	public abstract String get(String channelName) throws NoSuchFieldException;

	public ZabbixapiconnectConnector getZabbixApiMixin() {
		return zabbixApiMixin;
	}

	public void setZabbixApiMixin(ZabbixapiconnectConnector zabbixApiMixin) {
		this.zabbixApiMixin = zabbixApiMixin;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public int getHostId() {
		return hostId;
	}

	public void setHostId(int hostId) {
		this.hostId = hostId;
	}
	
	
	
	
	
}
