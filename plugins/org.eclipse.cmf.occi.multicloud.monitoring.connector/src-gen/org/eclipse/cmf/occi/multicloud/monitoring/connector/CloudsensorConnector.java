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
 * Generated at Mon Aug 07 10:24:06 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.monitoring/model/cloudmonitoring.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.monitoring.connector;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.tinom.EMFTinomPublisher;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.tinom.SystemOutTinomPublisher;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.SensorExtListener;
import org.eclipse.emf.common.util.EList;
import org.occiware.tinom.model.Aggregator;
import org.occiware.tinom.model.Collector;
import org.occiware.tinom.model.OutputInterface;
import org.occiware.tinom.model.Publisher;
import org.occiware.tinom.model.Sensor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloudmonitoring.Emfpublisher;
import cloudmonitoring.MonitorState;
import cloudmonitoring.Sensorcontrol;
import cloudmonitoring.Systemoutpublisher;
import cloudmonitoring.impl.CloudsensorImpl;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/multicloud/monitoring# - term: cloudsensor - title:
 */
public class CloudsensorConnector extends CloudsensorImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CloudsensorConnector.class);

	private Sensor tinomSensor;
	private List<Collector> tinomCollectors = new ArrayList<>();
	private List<Publisher> tinomPublishers = new ArrayList<>();

	private boolean sensorStarted = false;

	/**
	 * To manage the observer (when the object has changed).
	 */
	private boolean monitoringListener = false;

	// Start of user code Cloudsensorconnector_constructor
	/**
	 * Constructs a cloudsensor connector.
	 */
	CloudsensorConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code CloudsensorocciCreate
	/**
	 * Called when this Cloudsensor instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		// For each linked collectors start sensor monitoring.
		// Be warned : if no linked collectors found, this must do nothing and
		// alert user.
		addMonitoringListener();
		buildTinomObjects();
		startMonitoring();
	}
	// End of user code

	// Start of user code Cloudsensor_occiRetrieve_method
	/**
	 * Called when this Cloudsensor instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
	}
	// End of user code

	// Start of user code Cloudsensor_occiUpdate_method
	/**
	 * Called when this Cloudsensor instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code CloudsensorocciDelete_method
	/**
	 * Called when this Cloudsensor instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		stopMonitoring();
	}
	// End of user code

	//
	// Cloudsensor actions.
	//
	// Start of user code CloudsensorstartMonitoring_method
	/**
	 * Start the monitoring. This method initialize and start the monitoring
	 * process.
	 */
	public void startMonitoring() {

		if (!sensorStarted) {
			LOGGER.info("Starting the monitoring.");
			if (tinomSensor == null) {
				buildTinomObjects();
				if (tinomSensor == null) {
					LOGGER.error("An unexpected error has thrown, please see the application logs.");
					sensorStarted = false;
					return;
				}
			}
			tinomSensor.start();
			sensorStarted = true;

		} else {
			LOGGER.info("Sensor already started.");
			tinomSensor.stop();
			for (Collector collector : tinomCollectors) {
				collector.stop();
			}
			setMonitoringState(MonitorState.OFF);
			tinomSensor.start();
			sensorStarted = true;
		}

		// Start all linked collectors only if sensor is started.
		if (sensorStarted) {
			String collectorName = null;
			for (OutputInterface collector : tinomCollectors) {
				collectorName = collector.getName();
				if (collector instanceof Aggregator) {
					// TODO : start period Managed by publisher...
				}
				if (collector instanceof Collector) {
					Collector tinomCollector = (Collector) collector;
					// if (tinomCollector instanceof SshTinomCollector) {
					// Specific for ssh script, the ssh thread (from script launch) set values from
					// his thread one second period callback.
					// tinomCollector.run();
					// } else {
					tinomCollector.start();
					// }
				}
				/*
				 * String[] outputNames = collector.getOutputNames(); if (outputNames != null &&
				 * outputNames.length > 0) { for (String name : outputNames) {
				 * LOGGER.debug(name); }
				 * 
				 * } String[] collectorInputChannels = tinomSensor.getInputNames(); if
				 * (collectorInputChannels != null && collectorInputChannels.length > 0) { for
				 * (String name : collectorInputChannels) { LOGGER.debug(name); }
				 * 
				 * }
				 */
			}
			try {
				LOGGER.debug("Collector name : " + collectorName);
				String result = tinomSensor.get(collectorName);
				LOGGER.debug("value available on a channel : " + collectorName + " ===> " + result);
			} catch (NoSuchFieldException e) {
			}
			// The monitoring is started.
			// Update mixin SensorControl attribute state accordingly if applied.
			setMonitoringState(MonitorState.ON);
		}
	}
	// End of user code

	// Start of user code CloudsensorsetMonitoringState_method
	/**
	 * Update monitoring state.
	 * 
	 * @param state
	 */
	private void setMonitoringState(MonitorState state) {
		Sensorcontrol sensorControl = getMixinSensorControl();
		if (sensorControl != null) {
			sensorControl.setMonitorState(state);
		}
	}
	// End of user code

	// Start of user code CloudsensorstopMonitoring_method
	public void stopMonitoring() {
		LOGGER.info("Stopping the monitoring for this sensor : " + this.getTitle());
		Sensorcontrol sensorControlMixin = getMixinSensorControl();
		boolean hasMixinSensorControl = sensorControlMixin != null;

		if (tinomSensor == null) {
			LOGGER.info("Sensor is already stopped.");
			return;
		}

		if (!sensorStarted && hasMixinSensorControl && MonitorState.OFF.equals(sensorControlMixin.getMonitorState())) {
			LOGGER.info("Sensor is already stopped.");
			return;
		}

		if (!sensorStarted && hasMixinSensorControl && MonitorState.ON.equals(sensorControlMixin.getMonitorState())) {
			LOGGER.warn("incoherent state, use state on mixin sensor control by default : monitoring on");
			sensorStarted = true;
		}
		if (sensorStarted && hasMixinSensorControl && MonitorState.OFF.equals(sensorControlMixin.getMonitorState())) {
			LOGGER.warn("incoherent state, use state on mixin sensor control by default : monitoring off");
			sensorStarted = false;
		}

		if (hasMixinSensorControl && sensorStarted && tinomSensor != null) {
			LOGGER.info("Stop monitoring sensor and all collectors and publishers.");
			tinomSensor.stop();
			for (Collector collector : tinomCollectors) {
				collector.stop();
			}
			tinomSensor = null;
			tinomCollectors.clear();
			tinomPublishers.clear();
			setMonitoringState(MonitorState.OFF);

		} else {
			LOGGER.warn("The sensor state is off, dont need to stop monitoring sensor.");
		}
	}
	// End of user code

	/**
	 * Build tinom objects from scratch...
	 */
	private void buildTinomObjects() {
		LOGGER.debug("Build TINOM objects");
		if (tinomSensor != null) {
			stopMonitoring();
		}

		// id of this sensor, the title may be not unique.
		tinomSensor = new Sensor(this.getId(), this.getOcciSensorPeriod());

		// Get the collectors instances and get their corresponding TINOM
		// collectors.
		EList<Link> links = this.getLinks();
		ITinomCollector collectorLink;

		tinomCollectors = new ArrayList<>();

		for (Link link : links) {
			if (link instanceof ITinomCollector) {
				collectorLink = (ITinomCollector) link;
				try {
					Collector tinomCollector = collectorLink.buildTinomCollector();
					if (tinomCollector != null) {
						tinomCollectors.add(tinomCollector);
						tinomSensor.withCollector(tinomCollector);
					}
				} catch (MonitorException ex) {
					LOGGER.error("Error while creating the collector : " + ex.getMessage() + link.getId());
				}
			}
		}

		if (tinomCollectors.isEmpty()) {
			LOGGER.warn("No linked collectors, cant start monitoring sensor...");
			tinomSensor = null;
			return;
		}

		// Publishers part.
		tinomPublishers = new ArrayList<>();
		Emfpublisher emfpublisher = getEMFPublisherMixin();
		Systemoutpublisher sysoutPublisher = getSystemOutMixin();

		boolean hasEmfPublisher = emfpublisher != null;
		boolean hasSysOutPublisher = sysoutPublisher != null;

		if (!hasEmfPublisher && !hasSysOutPublisher) {
			// No publisher is set.
			LOGGER.warn(
					"No publisher is set. Please add at least one publisher mixin. Default to sensor mixin system out console publisher.");
			hasSysOutPublisher = true;
		}

		if (hasEmfPublisher) {
			// The metrics attributes will be updated by publisher.
			EmfpublisherConnector emfpublisherConnector = (EmfpublisherConnector) emfpublisher;
			EMFTinomPublisher emfTinom = emfpublisherConnector.buildTinomPublisher();
			// EMFTinomPublisher emfTinom = new EMFTinomPublisher("emf" + this.getId(),
			// this);
			LOGGER.info("Build sensor with publisher : EMFTinomPublisher");
			tinomPublishers.add(emfTinom);
		}
		if (hasSysOutPublisher) {
			SystemOutTinomPublisher outPublisher;
			if (sysoutPublisher != null) {
				outPublisher = ((SystemoutpublisherConnector) sysoutPublisher).buildTinomPublisher();
			} else {
				outPublisher = new SystemOutTinomPublisher("console" + this.getId());
			}
			LOGGER.info("Building sensor with publisher : SystemOutTinomPublisher");
			tinomPublishers.add(outPublisher);
		}

		for (Publisher publisher : tinomPublishers) {
			tinomSensor.withPublisher(publisher);
		}
		LOGGER.debug("TINOM objects are built !!!");

		// TODO : Aggregator objects..
	}

	/**
	 * Add a listener to manage events on this sensor object.
	 */
	private void addMonitoringListener() {
		if (!monitoringListener) {
			// Add the listener...
			SensorExtListener sensorExtListener = new SensorExtListener();
			sensorExtListener.AddListener(this);
			monitoringListener = true; // dont need to add more than this listener.
		}
	}

	// Start of user code CloudsensorgetMixinSensorControl_method
	/**
	 * Get the mixin base instance "SensorControl".
	 * 
	 * @return
	 */
	public Sensorcontrol getMixinSensorControl() {
		List<MixinBase> mixinBase = this.getParts();
		Sensorcontrol sensorControl = null;
		for (MixinBase mixinB : mixinBase) {
			if (mixinB instanceof Sensorcontrol) {
				sensorControl = (Sensorcontrol) mixinB;
				break;
			}
		}
		return sensorControl;
	}
	// End of user code

	// getEMFPublisherMixin
	// getSystemOutMixin
	/**
	 * Get the mixin base instance "Emfpublisher".
	 * 
	 * @return
	 */
	public Emfpublisher getEMFPublisherMixin() {
		List<MixinBase> mixinBase = this.getParts();
		Emfpublisher emfpublisher = null;
		for (MixinBase mixinB : mixinBase) {
			if (mixinB instanceof Emfpublisher) {
				emfpublisher = (Emfpublisher) mixinB;
				break;
			}
		}
		return emfpublisher;
	}

	/**
	 * Get the mixin base instance "Emfpublisher".
	 * 
	 * @return
	 */
	public Systemoutpublisher getSystemOutMixin() {
		List<MixinBase> mixinBase = this.getParts();
		Systemoutpublisher sysoutPublisher = null;
		for (MixinBase mixinB : mixinBase) {
			if (mixinB instanceof Systemoutpublisher) {
				sysoutPublisher = (Systemoutpublisher) mixinB;
				break;
			}
		}
		return sysoutPublisher;
	}

}
