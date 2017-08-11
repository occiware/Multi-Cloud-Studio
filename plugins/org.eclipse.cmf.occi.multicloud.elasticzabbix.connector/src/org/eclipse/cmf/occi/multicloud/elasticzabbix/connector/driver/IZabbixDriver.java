package org.eclipse.cmf.occi.multicloud.elasticzabbix.connector.driver;

/**
 * Used only for concrete class that need to use a zabbix driver.
 * @author cgourdin
 *
 */
public interface IZabbixDriver {
	
	public void setZabbixDriver(final ZabbixDriver driver);
	public ZabbixDriver getZabbixDriver();
	public void getMetrics(String token, int hostId);
	
}
