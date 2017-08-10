package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom;

import java.util.List;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.ZabbixapiconnectConnector;
import org.occiware.tinom.model.Collector;
import org.occiware.tinom.model.Metric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZabbixTinomCollector extends Collector {
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixTinomCollector.class);

	private ZabbixapiconnectConnector zabbixApiMixin = null;
	private String authToken = null;
	private String computeToMonitorIpAddress = null;
	private String vmname = null;
	private int zabbixHostId = 0;

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
			this.stop();
			return;
		}

		// Realize a connection to zabbix, set the authToken field and make request on
		// metrics level.
		try {
			authToken = zabbixApiMixin.getAuthToken();
		} catch (MonitorException ex) {
			LOGGER.error(ex.getMessage());
			this.stop();
			LOGGER.warn("Due to an error on getting authentication token, the collector Zabbix is stopped.");
			return;
		}
		// Get the hostid.
		if (zabbixHostId == 0) {
			try {
				zabbixHostId = zabbixApiMixin.getHostByIp(authToken, computeToMonitorIpAddress);
			} catch (MonitorException ex) {
				LOGGER.error("Host for ip : " + computeToMonitorIpAddress
						+ " doesnt exist for the ip address on zabbix, message:" + ex.getMessage());
				this.stop();
				return;
			}
			// Search on vmname if not found with ip, zabbix will return 0 for hostid not found.
			if (zabbixHostId == 0) {
				try {	
					zabbixHostId = zabbixApiMixin.getHostByName(authToken, vmname);
				} catch (MonitorException ex) {
					LOGGER.error("Host for vmname : " + vmname
							+ " doesnt exist for the vmname on zabbix, message:" + ex.getMessage());
					this.stop();
					return;
				}
			}
			
			if (zabbixHostId == 0) {
				// add the instance to zabbix monitoring system.
				LOGGER.info("Add instance: " + vmname + " to zabbix server : " + zabbixApiMixin.getHttpApiAddress());
				String hostGroupName = zabbixApiMixin.getHostGroupName();
				String templateName = zabbixApiMixin.getTemplateName();
				int port = zabbixApiMixin.getPort();
				try {
					zabbixApiMixin.assignHostToHostgroup(authToken, vmname, computeToMonitorIpAddress, port, hostGroupName, templateName);
					zabbixHostId = zabbixApiMixin.getHostByIp(authToken, computeToMonitorIpAddress);
					if (zabbixHostId == 0) {
						zabbixHostId = zabbixApiMixin.getHostByName(authToken, vmname);
						if (zabbixHostId == 0) {
							throw new MonitorException("Instance : " + vmname + " has not been added to zabbix monitoring server : " + zabbixApiMixin.getHttpApiAddress());
						}
					}
					LOGGER.info("Instance : " + vmname + " has been added to hostgroup : " + hostGroupName + " with template: " + templateName + " on zabbix server: " + zabbixApiMixin.getHttpApiAddress());
				} catch (MonitorException ex) {
					LOGGER.error("Error while assigning instance to zabbix monitoring system : " + ex.getMessage());
					this.stop();
					return;
				}
			}
		}
		
		// Assign token to referenced metrics...
		List<Metric> metrics = this.getMetrics();
		for (Metric metric : metrics) {
			if (metric instanceof ZabbixMetric) {
				((ZabbixMetric) metric).setAuthToken(authToken);
				((ZabbixMetric) metric).setZabbixApiMixin(zabbixApiMixin);
				((ZabbixMetric) metric).setHostId(zabbixHostId);
			}
		}
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

	public int getZabbixHostId() {
		return zabbixHostId;
	}

	public void setZabbixHostId(int zabbixHostId) {
		this.zabbixHostId = zabbixHostId;
	}

	public String getVmname() {
		return vmname;
	}

	public void setVmname(String vmname) {
		this.vmname = vmname;
	}
	
	

}
