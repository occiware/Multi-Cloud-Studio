package org.eclipse.cmf.occi.multicloud.monitoring.connector.tinom;

import org.occiware.tinom.extensions.utils.PrintStreamPublisher;

public class SystemOutTinomPublisher extends PrintStreamPublisher {
	public SystemOutTinomPublisher(String name) {
		super(name, System.out);
	}

	@Override
	public void run() {
		String inputNames[] = getInputNames();

		for (String inputName : inputNames) {
			try {
				doPublish(inputName, get(inputName));
			} catch (NoSuchFieldException e) {
				doPublish(inputName, e);
			}
		}

	}

	public void stop() {
		// Release publisher.
		// LOGGER.debug("Stop specific publisher call.");
	}
}
