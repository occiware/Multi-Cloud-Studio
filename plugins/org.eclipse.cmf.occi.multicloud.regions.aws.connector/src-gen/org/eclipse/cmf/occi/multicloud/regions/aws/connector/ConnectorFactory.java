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
 * Generated at Thu Jan 25 17:57:19 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.regions.aws/model/awsregions.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.regions.aws.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: awsregions
 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
 */
public class ConnectorFactory extends awsregions.impl.AwsregionsFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: awsregion
	 * - title: 
	 */
	@Override
	public awsregions.Awsregion createAwsregion() {
		return new AwsregionConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: us_east_2
	 * - title: 
	 */
	@Override
	public awsregions.Us_east_2 createUs_east_2() {
		return new Us_east_2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: us_east_1
	 * - title: 
	 */
	@Override
	public awsregions.Us_east_1 createUs_east_1() {
		return new Us_east_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: eu_west_3
	 * - title: 
	 */
	@Override
	public awsregions.Eu_west_3 createEu_west_3() {
		return new Eu_west_3Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: us_west_1
	 * - title: 
	 */
	@Override
	public awsregions.Us_west_1 createUs_west_1() {
		return new Us_west_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: eu_west_1
	 * - title: 
	 */
	@Override
	public awsregions.Eu_west_1 createEu_west_1() {
		return new Eu_west_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: ap_south_1
	 * - title: 
	 */
	@Override
	public awsregions.Ap_south_1 createAp_south_1() {
		return new Ap_south_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: sa_east_1
	 * - title: 
	 */
	@Override
	public awsregions.Sa_east_1 createSa_east_1() {
		return new Sa_east_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: us_west_2
	 * - title: 
	 */
	@Override
	public awsregions.Us_west_2 createUs_west_2() {
		return new Us_west_2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: eu_west_2
	 * - title: 
	 */
	@Override
	public awsregions.Eu_west_2 createEu_west_2() {
		return new Eu_west_2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: ap_southeast_1
	 * - title: 
	 */
	@Override
	public awsregions.Ap_southeast_1 createAp_southeast_1() {
		return new Ap_southeast_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: ca_central_1
	 * - title: 
	 */
	@Override
	public awsregions.Ca_central_1 createCa_central_1() {
		return new Ca_central_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: ap_northeast_2
	 * - title: 
	 */
	@Override
	public awsregions.Ap_northeast_2 createAp_northeast_2() {
		return new Ap_northeast_2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: ap_south_east2
	 * - title: 
	 */
	@Override
	public awsregions.Ap_south_east2 createAp_south_east2() {
		return new Ap_south_east2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: eu_central_1
	 * - title: 
	 */
	@Override
	public awsregions.Eu_central_1 createEu_central_1() {
		return new Eu_central_1Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/locations/aws#
	 * - term: ap_northeast_1
	 * - title: 
	 */
	@Override
	public awsregions.Ap_northeast_1 createAp_northeast_1() {
		return new Ap_northeast_1Connector();
	}

}
