package org.eclipse.cmf.occi.multicloud.monitoring.connector.tinom;

import org.occiware.tinom.model.Publisher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloudmonitoring.Emfpublisher;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.EmfpublisherConnector;

public class EMFTinomPublisher extends Publisher {
	
	public EMFTinomPublisher(String name) {
		super(name);
	}

	public EMFTinomPublisher(String name, Emfpublisher emfPublisher) {
		super(name);
		this.emfPublisher = emfPublisher;
		// domain = TransactionUtil.getEditingDomain(sensorExt.eResource().getResourceSet());
		LOGGER.debug("Publisher EMF constructor called.");
	}
	
	private static Logger LOGGER = LoggerFactory.getLogger(EMFTinomPublisher.class);
	
	private Emfpublisher emfPublisher;

	@Override
	public void run() {
		// TODO : check if this publisher is necessary.
		
	}
	
	
	
}
