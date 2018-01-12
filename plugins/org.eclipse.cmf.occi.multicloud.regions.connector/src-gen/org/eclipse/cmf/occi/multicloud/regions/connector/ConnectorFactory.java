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
 * Generated at Fri Jan 12 16:58:05 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.regions/model/regions.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.regions.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: regions
 * - scheme: http://occiware.org/occi/infrastructure/locations#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.regions.impl.RegionsFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations#
	 * - term: region
	 * - title: General region to locate the resource and link geographicaly
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.regions.Region createRegion() {
		return new RegionConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations#
	 * - term: availabilityzone
	 * - title: This mixin is used to locate a resource or link in a datacenter part
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.regions.Availabilityzone createAvailabilityzone() {
		return new AvailabilityzoneConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations#
	 * - term: europe
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.regions.Europe createEurope() {
		return new EuropeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations#
	 * - term: northamerica
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.regions.Northamerica createNorthamerica() {
		return new NorthamericaConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations#
	 * - term: southamerica
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.regions.Southamerica createSouthamerica() {
		return new SouthamericaConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations#
	 * - term: asiapacific
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.regions.Asiapacific createAsiapacific() {
		return new AsiapacificConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations#
	 * - term: africa
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.regions.Africa createAfrica() {
		return new AfricaConnector();
	}

}
