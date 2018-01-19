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
 * Generated at Fri Jan 12 17:15:05 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.accounts/model/accounts.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.accounts.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: accounts
 * - scheme: http://occiware.org/occi/infrastructure/security#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.accounts.impl.AccountsFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/security#
	 * - term: cloudaccount
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount createCloudaccount() {
		return new CloudaccountConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/security#
	 * - term: cloudaccountlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.accounts.Cloudaccountlink createCloudaccountlink() {
		return new CloudaccountlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/security#
	 * - term: basiccredential
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.accounts.Basiccredential createBasiccredential() {
		return new BasiccredentialConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/security#
	 * - term: certificatecredential
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential createCertificatecredential() {
		return new CertificatecredentialConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/security#
	 * - term: keypaircredential
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.accounts.Keypaircredential createKeypaircredential() {
		return new KeypaircredentialConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/security#
	 * - term: cloudcredential
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential createCloudcredential() {
		return new CloudcredentialConnector();
	}

}
