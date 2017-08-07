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

import cloudmonitoring.Cloudsensor;
import cloudmonitoring.Cpu;
import cloudmonitoring.Disk;
import cloudmonitoring.Diskio;
import cloudmonitoring.Emfpublisher;
import cloudmonitoring.Inputoutput;
import cloudmonitoring.Mailpublisher;
import cloudmonitoring.Mainmetric;
import cloudmonitoring.Networkio;
import cloudmonitoring.Publishercontrol;
import cloudmonitoring.Ram;
import cloudmonitoring.Sensorcontrol;
import cloudmonitoring.Supervisorapiconnect;
import cloudmonitoring.Systemoutpublisher;
import cloudmonitoring.impl.CloudmonitoringFactoryImpl;

/**
 * Connector EFactory for the OCCI extension:
 * - name: cloudmonitoring
 * - scheme: http://occiware.org/occi/multicloud/monitoring#
 */
public class ConnectorFactory extends CloudmonitoringFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: cloudsensor
	 * - title: 
	 */
	@Override
	public Cloudsensor createCloudsensor() {
		return new CloudsensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: cpu
	 * - title: 
	 */
	@Override
	public Cpu createCpu() {
		return new CpuConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: diskio
	 * - title: 
	 */
	@Override
	public Diskio createDiskio() {
		return new DiskioConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: ram
	 * - title: 
	 */
	@Override
	public Ram createRam() {
		return new RamConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: networkio
	 * - title: 
	 */
	@Override
	public Networkio createNetworkio() {
		return new NetworkioConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: inputoutput
	 * - title: 
	 */
	@Override
	public Inputoutput createInputoutput() {
		return new InputoutputConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: sensorcontrol
	 * - title: 
	 */
	@Override
	public Sensorcontrol createSensorcontrol() {
		return new SensorcontrolConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: emfpublisher
	 * - title: 
	 */
	@Override
	public Emfpublisher createEmfpublisher() {
		return new EmfpublisherConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: systemoutpublisher
	 * - title: System out publisher (console etc)
	 */
	@Override
	public Systemoutpublisher createSystemoutpublisher() {
		return new SystemoutpublisherConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: publishercontrol
	 * - title: 
	 */
	@Override
	public Publishercontrol createPublishercontrol() {
		return new PublishercontrolConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: disk
	 * - title: 
	 */
	@Override
	public Disk createDisk() {
		return new DiskConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: mailpublisher
	 * - title: A mailing publisher to post alerts
	 */
	@Override
	public Mailpublisher createMailpublisher() {
		return new MailpublisherConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: mainmetric
	 * - title: 
	 */
	@Override
	public Mainmetric createMainmetric() {
		return new MainmetricConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/monitoring#
	 * - term: supervisorapiconnect
	 * - title: 
	 */
	@Override
	public Supervisorapiconnect createSupervisorapiconnect() {
		return new SupervisorapiconnectConnector();
	}

}
