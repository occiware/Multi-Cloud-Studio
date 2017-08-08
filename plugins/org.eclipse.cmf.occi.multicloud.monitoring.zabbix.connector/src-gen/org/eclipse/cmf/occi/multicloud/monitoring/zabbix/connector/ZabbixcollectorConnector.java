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
 * Generated at Tue Aug 08 09:43:36 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.monitoring.zabbix/model/zabbix.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;
import org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.cmf.occi.monitoring.Metric;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.CpuConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.DiskConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.DiskioConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.ITinomCollector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.NetworkioConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.RamConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom.CpuZabbixTinomMetric;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom.DiskIoZabbixTinomMetric;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom.DiskZabbixTinomMetric;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom.NetworkIoZabbixTinomMetric;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom.RamZabbixTinomMetric;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector.tinom.ZabbixTinomCollector;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.emf.common.util.EList;
import org.occiware.tinom.model.Collector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloudmonitoring.Systemoutpublisher;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/multicloud/monitoring/zabbix# - term:
 * zabbixcollector - title:
 */
public class ZabbixcollectorConnector extends org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixcollectorImpl
		implements ITinomCollector {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixcollectorConnector.class);

	private ZabbixTinomCollector zabbixTinomCollector;

	// Start of user code Zabbixcollectorconnector_constructor
	/**
	 * Constructs a zabbixcollector connector.
	 */
	ZabbixcollectorConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code

	//
	// OCCI CRUD callback operations.
	//

	// Start of user code ZabbixcollectorocciCreate
	/**
	 * Called when this Zabbixcollector instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		// Start or restart the timon collector.
		if (zabbixTinomCollector != null) {
			zabbixTinomCollector.stop();
			zabbixTinomCollector.setPeriod(this.getOcciCollectorPeriod());
			zabbixTinomCollector.start();
		}
	}
	// End of user code

	// Start of user code Zabbixcollector_occiRetrieve_method
	/**
	 * Called when this Zabbixcollector instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO : Invoke zabbix tinom collector to retrieve all metrics and update
		// attributes on them.
	}
	// End of user code

	// Start of user code Zabbixcollector_occiUpdate_method
	/**
	 * Called when this Zabbixcollector instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO : Update on api address, username and password change following mixin
		// Zabbixapiconnector attributes.
	}
	// End of user code

	// Start of user code ZabbixcollectorocciDelete_method
	/**
	 * Called when this Zabbixcollector instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		if (zabbixTinomCollector != null) {
			zabbixTinomCollector.stop();
		}
	}
	// End of user code
	//
	// Specific TINOM part.
	//

	// Start of user code ZabbixcollectorbuildTinomCollector_method
	@Override
	public Collector buildTinomCollector() throws MonitorException {
		// Check the collector type has changed.
		if (zabbixTinomCollector == null) {
			zabbixTinomCollector = buildCollectorWithValues(
					new ZabbixTinomCollector(id, this.getOcciCollectorPeriod()));
		}
		return zabbixTinomCollector;
	}
	// End of user code
	
	/**
	 * Retrieve values from linked resources target and build collector
	 * consequently.
	 * 
	 * @param collector
	 * @return
	 */
	private ZabbixTinomCollector buildCollectorWithValues(ZabbixTinomCollector collector) throws MonitorException {
		// Retrieve the linked compute.
		Resource res = this.getTarget();
		Compute compute = null;
		if (res != null && res instanceof Compute) {
			compute = (Compute) res;
			if (compute.getOcciComputeState().equals(ComputeStatus.ACTIVE)) {
				// Retrieve ip address.
				String computeIpAddress = null;

				// Detect if this is a vmware compute, if this is the cas an attribute exist
				// with guest tools activation (or setted manually).
				if (compute instanceof Instancevmware) {
					computeIpAddress = ((Instancevmware) compute).getGuestIpv4Address();
					
				} else {

					// find the connected network interface and get ipAdress value.
					Networkinterface networkInt = null;
					EList<Link> links = compute.getLinks();

					if (links == null || links.isEmpty()) {
						throw new MonitorException(
								"Cant retrieve ipAddress of the compute, there is no NetworkInterface defined in the scope of this compute : "
										+ compute);
					}
					for (Link link : links) {
						if (link instanceof Networkinterface) {
							networkInt = (Networkinterface) link;
							if (networkInt.getOcciNetworkinterfaceState().equals(NetworkInterfaceStatus.ACTIVE)) {
								
								// Search on mixin ipNetworkInterface.
								EList<MixinBase> mixinBases = networkInt.getParts();
								for (MixinBase mixinBase : mixinBases) {
									if (mixinBase instanceof Ipnetworkinterface) {
										computeIpAddress = ((Ipnetworkinterface) mixinBase).getOcciNetworkinterfaceAddress();
										break;
									}
								}
							}
						}
						if (computeIpAddress != null) {
							break;
						}
					}
				}
				if (computeIpAddress == null || computeIpAddress.trim().isEmpty()) {
					throw new MonitorException(
							"Cant retrieve ipAddress of the compute, there is no IpAddress attribute defined on NetworkInterface in the scope of this compute : "
									+ compute);
				}

				ZabbixapiconnectConnector zabbixApiConnectMixin = getZabbixApiConnectMixin();
				
				if (computeIpAddress == null || computeIpAddress.trim().isEmpty()) {
					throw new MonitorException("Ip address is not retrieved on compute, please check your compute configuration model.");
				}
				if (zabbixApiConnectMixin == null) {
					throw new MonitorException("You must apply the mixin ZabbixApiConnect to use zabbix collector !");
				}
				
				collector.setComputeToMonitorIpAddress(computeIpAddress);
				collector.setZabbixApiMixin(zabbixApiConnectMixin);
				
				// Build tinom metrics object belonging to applied metric mixins.
				List<MixinBase> metricMixins = getMetricMixins(); 
				if (metricMixins.isEmpty()) {
					throw new MonitorException("You must apply at least one mixin metric to use this collector.");
				}
				
				for (MixinBase mixinBase : metricMixins) {
					if (mixinBase instanceof CpuConnector) {
						CpuConnector cpuConnector = (CpuConnector)mixinBase;
						org.occiware.tinom.model.Metric cpuTinomMetric = new CpuZabbixTinomMetric(CpuZabbixTinomMetric.METRIC_NAME); 
						cpuConnector.setCpuTinomMetric(cpuTinomMetric);
						collector.withMetric(cpuTinomMetric);
					}
					if (mixinBase instanceof RamConnector) {
						RamConnector ramConnector = (RamConnector)mixinBase;
						org.occiware.tinom.model.Metric ramTinomMetric = new RamZabbixTinomMetric(RamZabbixTinomMetric.METRIC_NAME);
						ramConnector.setRamTinomMetric(ramTinomMetric);
						collector.withMetric(ramTinomMetric);
					}
					if (mixinBase instanceof DiskConnector) {
						DiskConnector diskConnector = (DiskConnector)mixinBase;
						org.occiware.tinom.model.Metric diskTinomMetric = new DiskZabbixTinomMetric(DiskZabbixTinomMetric.METRIC_NAME);
						diskConnector.setDiskTinomMetric(diskTinomMetric);
						collector.withMetric(diskTinomMetric);
					}
					if (mixinBase instanceof DiskioConnector) {
						DiskioConnector diskIoConnector = (DiskioConnector)mixinBase;
						org.occiware.tinom.model.Metric diskIoTinomMetric = new DiskIoZabbixTinomMetric(DiskIoZabbixTinomMetric.METRIC_NAME);
						diskIoConnector.setDiskIoTinomMetric(diskIoTinomMetric);
						collector.withMetric(diskIoTinomMetric);
					}
					if (mixinBase instanceof NetworkioConnector) {
						NetworkioConnector networkIoConnector = (NetworkioConnector)mixinBase;
						org.occiware.tinom.model.Metric networkIoTinomMetric = new NetworkIoZabbixTinomMetric(NetworkIoZabbixTinomMetric.METRIC_NAME);
						networkIoConnector.setNetworkIoTinomMetric(networkIoTinomMetric);
						collector.withMetric(networkIoTinomMetric);
					}
					
				}
				
				/*if (collector.getMetrics() == null || collector.getMetrics().isEmpty()) {
					LOGGER.warn("No metrics assigned to this collector : " + this.getId()
							+ " --> Default to cpu, ram and loadavg metrics value.");
					collector.withMetric(new CPUPercentMetric(CollectorType.MIXIN_METRIC_CPU_PERCENT));
					collector.withMetric(new RAMPercentMetric(CollectorType.MIXIN_METRIC_RAM_PERCENT));
					collector.withMetric(new LoadAverageMetric(CollectorType.MIXIN_METRIC_LOAD_AVG));
					collector.withMetric(new LoadAverageMetric(CollectorType.MIXIN_METRIC_DISK_USED));
				}*/

				if (occiCollectorPeriod == 0) {
					// Minimal period is 0 but for Tinom the period -1 is one shot.
					occiCollectorPeriod = -1;
				}
			}
		} else {
			// TODO : If link is on network or storage. Build collector consequently.
			if (res != null) {
				LOGGER.warn("Collector not implemented for storage and network link, this will be on future release..");
				throw new MonitorException("Collector not implemented for storage and network link, this will be on future release..");
			} else {
				LOGGER.error("No linked compute to monitor");
				throw new MonitorException("No linked compute to monitor");
			}
		}
		return collector;
	}

	
	
	@Override
	public String[] getMetricsChannelToPublish() {
		
		
		// TODO Auto-generated method stub
		return null;
	}

	//
	// Zabbixcollector actions.
	//
	
	/**
	 * Get the MixinBase instance "ZabbixapiconnectConnector".
	 * 
	 * @return
	 */
	public ZabbixapiconnectConnector getZabbixApiConnectMixin() {
		List<MixinBase> mixinBase = this.getParts();
		ZabbixapiconnectConnector apiConnector = null;
		for (MixinBase mixinB : mixinBase) {
			if (mixinB instanceof ZabbixapiconnectConnector) {
				apiConnector = (ZabbixapiconnectConnector) mixinB;
				break;
			}
		}
		return apiConnector;
	}
	
	/**
	 * Get all Metric mixinbase.
	 * @return
	 */
	private List<MixinBase> getMetricMixins() {
		List<MixinBase> mixins = this.getParts();
		List<MixinBase> result = new ArrayList<>();
		for (MixinBase mixinB : mixins) {
			if (mixinB instanceof Metric) {
				result.add(mixinB);
			}
		}
		return result;
	}
	
	
	
}
