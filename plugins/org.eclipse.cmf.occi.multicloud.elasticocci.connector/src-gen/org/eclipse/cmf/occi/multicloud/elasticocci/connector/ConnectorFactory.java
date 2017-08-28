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
 * Generated at Wed Aug 23 15:21:16 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.elasticocci/model/elasticocci.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.elasticocci.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: elasticocci
 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
	 * - term: elasticcontroller
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticocci.Elasticcontroller createElasticcontroller() {
		return new ElasticcontrollerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
	 * - term: elasticlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticocci.Elasticlink createElasticlink() {
		return new ElasticlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
	 * - term: strategy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticocci.Strategy createStrategy() {
		return new StrategyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
	 * - term: strategycompute
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute createStrategycompute() {
		return new StrategycomputeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
	 * - term: strategycpu
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu createStrategycpu() {
		return new StrategycpuConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
	 * - term: strategymemory
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory createStrategymemory() {
		return new StrategymemoryConnector();
	}

}
