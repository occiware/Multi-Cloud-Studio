/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.ecplise.cmf.occi.multicloud.vmware.connector.driver;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class VMWareMain {

	
	public static void main(String[] args) {
		VCenterClient vCenterClient = null;
		if (args != null) {
			if (args.length > 2) {
				String login = args[0];
				String password = args[1];
				String url = args[2];
				vCenterClient = new VCenterClient(login, password, url);	
			}
		}
		try {		
			vCenterClient.connect();
			vCenterClient.disconnect();
		} catch (RemoteException ex) {
			System.out.println("Not connected, message: " + ex.getMessage());
			exit();
		} catch (MalformedURLException ex) {
			System.out.println("Not connected, message: " + ex.getMessage());
			exit();
		}
	}
	
	private static void exit() {
		Runtime.getRuntime().exit(1);
	}
	
	
	
	
	
}
