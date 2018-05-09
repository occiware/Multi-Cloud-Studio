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
 * Generated at Fri Jan 12 17:18:23 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.interoperability/model/interoperability.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.interoperability.connector;

/**
 * Connector EFactory for the OCCI extension: - name: interoperability - scheme:
 * http://occiware.org/occi/multicloud/specialfeatures#
 */
public class ConnectorFactory
		extends org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityFactoryImpl {
	/**
	 * EFactory method for OCCI kind: - scheme:
	 * http://occiware.org/occi/multicloud/specialfeatures# - term:
	 * filetransferoperations - title:
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations createFiletransferoperations() {
		return new FiletransferoperationsConnector();
	}

	/**
	 * EFactory method for OCCI kind: - scheme:
	 * http://occiware.org/occi/multicloud/specialfeatures# - term: httptransfer -
	 * title:
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer createHttptransfer() {
		return new HttptransferConnector();
	}

	/**
	 * EFactory method for OCCI kind: - scheme:
	 * http://occiware.org/occi/multicloud/specialfeatures# - term: sshtransfer -
	 * title:
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer createSshtransfer() {
		return new SshtransferConnector();
	}

}
