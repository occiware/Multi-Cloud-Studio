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

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.CpuConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.EmfpublisherConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.RamConnector;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.Constants;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.MixinBaseUtils;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.MixinBaseUtilsHeadless;
import org.eclipse.cmf.occi.multicloud.monitoring.connector.utils.UIDialog;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

public class EMFTinomPublisher extends Publisher {
	
	
	private TransactionalEditingDomain domain;
	
	private CpuConnector mixinCpuMetric;
	private RamConnector mixinRamMetric;
	
	
	public EMFTinomPublisher(String name) {
		super(name);
	}

	public EMFTinomPublisher(String name, CpuConnector mixinCpuMetric, RamConnector mixinRamMetric) {
		super(name);
		this.mixinCpuMetric = mixinCpuMetric;
		this.mixinRamMetric = mixinRamMetric;
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
		Double ramAvail = 0.0d;
		Double loadAvg = 0.0d;
		
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
					if (inputName.endsWith(Constants.CHANNEL_RAM_FREE)) {
						LOGGER.debug("Metric type : " + Constants.CHANNEL_RAM_FREE);
						try {
							ramAvail = Double.parseDouble(value);
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to Double : " + value
									+ " ==> " + ex.getMessage());
						}
						continue;
					}
					if (inputName.endsWith(Constants.CHANNEL_RAM_USED)) {
						LOGGER.debug("Metric type : " + Constants.CHANNEL_RAM_USED);
						try {
							ramUtilization = Double.parseDouble(value);
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to Double : " + value
									+ " ==> " + ex.getMessage());
						}
						continue;
					}
					
				} else {
					System.err.println("The value of " + inputName + " is null !!!");
				}
			} catch (NoSuchFieldException ex) {
				LOGGER.error("Field not found error : " + ex.getMessage());
			}
		}
		modifyResourceSet(cpuUtilization, loadAvg, ramUtilization, ramAvail);
		
	}
	
	/**
	 * Update metrics attribute on a compute with mixin monitorcurrent and mixin
	 * credential.
	 * 
	 * @param cpuUtilization
	 * @param loadAvg
	 * @param ramUtilization
	 * @param ramAvail
	 */
	public synchronized void modifyResourceSet(Double cpuUtilization, Double loadAvg, Double ramUtilization, Double ramAvail) {
		Map<String, String> attrsToCreate = new HashMap<>();
		Map<String, String> attrsToUpdate = new HashMap<>();
		List<String> attrsToDelete = new ArrayList<>();
		
		if (mixinCpuMetric != null) {
			if (this.getAttributeStateObjectFromMixinBase(mixinCpuMetric, "cpuused") == null) {
				attrsToCreate.put("cpuused", cpuUtilization.toString());
			} else {
				attrsToUpdate.put("cpuused", cpuUtilization.toString());
			}
			mixinCpuMetric.setCpuUsed(cpuUtilization);
			if (this.getAttributeStateObjectFromMixinBase(mixinCpuMetric, "loadavg") == null) {
				attrsToCreate.put("loadavg", loadAvg.toString());
			} else {
				attrsToUpdate.put("loadavg", loadAvg.toString());
			}
			mixinCpuMetric.setLoadAvg(loadAvg);
			
			// Update mixin attribs.
			if (UIDialog.isStandAlone()) {
				// Headless environment.
				MixinBaseUtilsHeadless.updateAttributes(mixinCpuMetric, attrsToCreate, attrsToUpdate, attrsToDelete);
			} else {
				// Gui environment
				MixinBaseUtilsHeadless.updateAttributes(mixinCpuMetric, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
		}
		
		if (mixinRamMetric != null) {
			attrsToCreate.clear();
			attrsToDelete.clear();
			attrsToUpdate.clear();
			if (this.getAttributeStateObjectFromMixinBase(mixinRamMetric, "ramused") == null) {
				attrsToCreate.put("ramused", ramUtilization.toString());
			} else {
				attrsToUpdate.put("ramused", ramUtilization.toString());
			}
			mixinRamMetric.setRamUsed(ramUtilization);
			if (this.getAttributeStateObjectFromMixinBase(mixinRamMetric, "free") == null) {
				attrsToCreate.put("free", loadAvg.toString());
			} else {
				attrsToUpdate.put("free", loadAvg.toString());
			}
			mixinRamMetric.setFree(ramAvail);
			
			// Update mixin attribs.
			if (UIDialog.isStandAlone()) {
				// Headless environment.
				MixinBaseUtilsHeadless.updateAttributes(mixinRamMetric, attrsToCreate, attrsToUpdate, attrsToDelete);
			} else {
				// Gui environment
				MixinBaseUtilsHeadless.updateAttributes(mixinRamMetric, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
		}
	}

	public void stop() {
		LOGGER.debug("Stop publisher call.");
		// Other things to stop if necessary.
	}
	
	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute doesnt exist, null value
	 *         is returned.
	 */
	private AttributeState getAttributeStateObjectFromMixinBase(MixinBase mixinB, final String key) {
		
		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : mixinB.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}
	
	
}
