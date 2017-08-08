package org.eclipse.cmf.occi.multicloud.monitoring.connector;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.occiware.tinom.model.Collector;

/**
 * This interface is for use with collectors, all collectors must implements this to build tinomCollectors.
 * @author Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
public interface ITinomCollector {
	public Collector buildTinomCollector() throws MonitorException;
	public String[] getMetricsChannelToPublish();
}
