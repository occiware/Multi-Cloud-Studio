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
 * Generated at Fri Sep 22 14:58:42 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: horizontalelasticity
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.HorizontalelasticityFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: horizontalgroup
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalgroup createHorizontalgroup() {
		return new HorizontalgroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: loadbalancer
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Loadbalancer createLoadbalancer() {
		return new LoadbalancerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: horizontalelasticcontroller
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Horizontalelasticcontroller createHorizontalelasticcontroller() {
		return new HorizontalelasticcontrollerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: instancegrouplink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Instancegrouplink createInstancegrouplink() {
		return new InstancegrouplinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: linkbalancer
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Linkbalancer createLinkbalancer() {
		return new LinkbalancerConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: grouplink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Grouplink createGrouplink() {
		return new GrouplinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: creation
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation createCreation() {
		return new CreationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: strategy
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Strategy createStrategy() {
		return new StrategyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: manual
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Manual createManual() {
		return new ManualConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
	 * - term: dynamic
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic createDynamic() {
		return new DynamicConnector();
	}

}
