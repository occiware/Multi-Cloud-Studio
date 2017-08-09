package org.eclipse.cmf.occi.multicloud.monitoring.connector.tinom;

import org.occiware.tinom.extensions.sample.jmx.CpuMetric;
import org.occiware.tinom.model.Publisher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloudmonitoring.Emfpublisher;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.CpuConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.EmfpublisherConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.Constants;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

public class EMFTinomPublisher extends Publisher {
	
	
	private TransactionalEditingDomain domain;
	
	
	public EMFTinomPublisher(String name) {
		super(name);
	}

	public EMFTinomPublisher(String name, Emfpublisher emfPublisher) {
		super(name);
		this.emfPublisher = emfPublisher;
		domain = TransactionUtil.getEditingDomain(emfPublisher.eResource().getResourceSet());
		LOGGER.debug("Publisher EMF constructor called.");
	}
	
	private static Logger LOGGER = LoggerFactory.getLogger(EMFTinomPublisher.class);
	
	private Emfpublisher emfPublisher;

	@Override
	public void run() {
		LOGGER.debug("Publisher EMF run method call");
		
		// Render on entity attributes and mixinBase directly.
		String inputNames[] = getInputNames();
		Double cpuUtilization = 0.0d;
		Double ramUtilization = 0.0d;
		Double loadAvg = 0.0d;
		Double tmp;
		
		for (String inputName : inputNames) {
			
			LOGGER.debug("Channel key : " + inputName);
			try {
				String value = get(inputName);
				LOGGER.debug("Value from get method from EMFTinomPublisher : " + value);
				// Update corresponding on emf objects.
				if (value != null) {
					if (inputName.endsWith(Constants.CHANNEL_CPU_USED)) {
						LOGGER.debug("Metric type : " + Constants.CHANNEL_CPU_USED);
						try {
							cpuUtilization = Double.parseDouble(value);
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to Double: " + value
									+ " ==> " + ex.getMessage());
						}
						continue;
					}
					if (inputName.endsWith(Constants.CHANNEL_CPU_AVG)) {
						LOGGER.debug("Metric type : " + Constants.CHANNEL_CPU_AVG);
						try {
							loadAvg = Double.parseDouble(value);
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to Double : " + value + " ==> "
									+ ex.getMessage());
						}
						continue;
					}
					if (inputName.endsWith(Constants.CHANNEL_RAM)) {
						LOGGER.debug("Metric type : " + CollectorType.MIXIN_METRIC_RAM_PERCENT);
						try {
							tmp = Float.parseFloat(value);
							ram = tmp.intValue();
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to float or to integer : " + value
									+ " ==> " + ex.getMessage());
						}
					}
					
					
				} else {
					System.err.println("The value of " + inputName + " is null !!!");
				}
				
				
			} catch (NoSuchFieldException ex) {
				LOGGER.error("Field not found error : " + ex.getMessage());
			}
		}
		
		
		
	}
	
	
	
}
