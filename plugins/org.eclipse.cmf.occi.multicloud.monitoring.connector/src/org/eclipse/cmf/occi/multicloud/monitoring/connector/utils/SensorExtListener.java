package org.eclipse.cmf.occi.multicloud.monitoring.connector.utils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.CloudsensorConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class observe the activateMonitoring value and attach listener for
 * metrics automatically.
 * 
 * @author Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
public class SensorExtListener {
	private static Logger LOGGER = LoggerFactory.getLogger(SensorExtListener.class);
	
	public void AddListener(CloudsensorConnector cloudSensorConn) {
		LOGGER.debug(
				"In add listener to sensor method : " + cloudSensorConn.getTitle() + " --> " + cloudSensorConn.getId());

		// Make a reference copy
		// sensor = (SensorextConnector) EcoreUtil.copy(sensorExtConn);

		// ADD listener to Class to manage start and stop monitoring...
		cloudSensorConn.eAdapters().add(new EContentAdapter() {

			@Override
			public void notifyChanged(Notification notification) {
				// super.notifyChanged(notification);
				CloudsensorConnector deletedSensor = null;
				CloudsensorConnector newSensor = null;

				// Case of deleting a sensor.
				if (notification.getEventType() == Notification.REMOVE
						&& notification.getNotifier() instanceof CloudsensorConnector) {
					deletedSensor = (CloudsensorConnector) notification.getNotifier();
					// Notify the deleted element in the model
					LOGGER.info("Delete model sensor element with ID: {}", deletedSensor.getId());
					// Stop the monitoring.
					LOGGER.info("Stopping the monitoring for this sensor : " + deletedSensor.getId());
					deletedSensor.stopMonitoring();
				}
				// Updating attributes.
				if (notification.getEventType() == Notification.SET
						&& notification.getNotifier() instanceof CloudsensorConnector) {
					String featureClassName = notification.getFeature().getClass().getName();
					if (notification.getFeature() instanceof EAttribute) {
						EAttribute eAttr = (EAttribute) notification.getFeature();
						String attrName = eAttr.getName();

						// To manage specific attribute changed and events about
						// them..

					}
					LOGGER.debug("Set notification send : " + featureClassName);
				}

				/*if (notification.getNotifier() instanceof SensorextConnector) {
					newSensor = (SensorextConnector) notification.getNotifier();
				}*/
			}
		});

	}
	
}
