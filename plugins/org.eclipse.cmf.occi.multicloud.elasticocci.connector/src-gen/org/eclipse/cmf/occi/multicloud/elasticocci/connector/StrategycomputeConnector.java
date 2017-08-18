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
 * Generated at Fri Aug 18 18:41:53 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.elasticocci/model/elasticocci.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.elasticocci.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.eclipse.cmf.occi.multicloud.elasticocci.Double; 
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/elasticocci#
 * - term: strategycompute
 * - title: 
 */
public class StrategycomputeConnector extends org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StrategycomputeConnector.class);

	// Start of user code Strategycomputeconnector_constructor
	/**
	 * Constructs a strategycompute connector.
	 */
	StrategycomputeConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Strategycompute_Kind_createPolicy_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/elasticocci/strategycompute/action#
     * - term: createpolicy
     * - title: 
	 */
	@Override
	public void createpolicy(final Double metricUtilization, final String op, final Integer threshold)
	{
		LOGGER.debug("Action createpolicy(" + "metricUtilization=" + metricUtilization + "op=" + op + "threshold=" + threshold + ") called on " + this);

		// TODO: Implement how to createpolicy this strategycompute.
	}
		// End of user code

}	
