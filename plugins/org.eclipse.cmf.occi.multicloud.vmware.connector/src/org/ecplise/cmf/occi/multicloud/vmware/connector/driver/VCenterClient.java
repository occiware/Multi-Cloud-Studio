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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Properties;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.multicloud.vmware.Vcentercredential;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.MixinBaseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.mo.ServiceInstance;

/**
 * Credentials of a VCenter.
 * 
 * @author Christophe Gourdin - Inria
 *
 */
public class VCenterClient {

	private String url = null;
	private String login = null;
	private String password = null;
	private static Logger LOGGER = LoggerFactory.getLogger(VCenterClient.class);
	private ServiceInstance serviceInstance = null;

	
	
	/**
	 * @param login
	 * @param password
	 * @param url
	 */
	public VCenterClient(String login, String password, String url) {
		this.login = login;
		this.password = password;
		this.url = url;
	}

	/**
	 * Read credentials from property file object.
	 * 
	 * @throws IOException
	 */
	public void loadFromPropertyFile() throws IOException {
		if (url == null) {
			Properties prop = new Properties();

			// String credentialFile = "/resources/credential.properties";
			// String homePath = System.getProperty("user.home") +
			// FileSystems.getDefault().getSeparator();
			String homePath = System.getProperty("user.home") + File.separator;
			InputStream in = new FileInputStream(homePath + "vmware-credential.properties");

			prop.load(in);
			if (in != null) {
				try {
					in.close();

				} catch (IOException ex) {
					// no op.
				}
			}
			if (prop.containsKey("vcenter.url")) {
				LOGGER.info("Setting vcenter credential...");
				this.login = prop.getProperty("vcenter.login");
				this.password = prop.getProperty("vcenter.password");
				this.url = prop.getProperty("vcenter.url");
			
			} else {
				throw new FileNotFoundException("credential property file not found !");
			}
		}
	}
	
	/**
	 * Read login, password and url from a vcenter credential mixin.
	 * @param vcenterCred
	 */
	public void loadFromCredentialMixin(Vcentercredential vcenterCred) {
		this.login = vcenterCred.getUsername();
		this.password = vcenterCred.getPassword();
		this.url = vcenterCred.getUrl();
	}
	

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Connect to vcenter and ready to go for action with ServiceInstance object.
	 * 
	 * @param url
	 * @param login
	 * @param password
	 * @return
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public ServiceInstance initServiceInstance(final String url, final String login, final String password)
			throws RemoteException, MalformedURLException {
		serviceInstance = new ServiceInstance(new URL(url), login, password, true);
		// TODO: add a parameter for certificate support -->
		// false on last parameter.
		return serviceInstance;
	}

	public ServiceInstance getServiceInstance() {
		return serviceInstance;
	}

	/**
	 * Initialize a connection to a vCenter server, if set, logout and connect.
	 * 
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public void connect() throws RemoteException, MalformedURLException {
		if (serviceInstance == null && login != null) {
			initServiceInstance(url, login, password);
		} else {
			if (serviceInstance.getAboutInfo().getApiVersion() == null) {
				// Reconnect...
				LOGGER.info("Reconnect to vcenter in progress...");
				serviceInstance.getServerConnection().logout();
				if (login != null) {
					initServiceInstance(url, login, password);
				}
			}
		}
	}

	/**
	 * Disconnect from this vCenter server.
	 * 
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public void disconnect() {

		if (serviceInstance != null && login != null) {
			LOGGER.info("Logging out from vcenter in progress...");
			serviceInstance.getServerConnection().logout();
			serviceInstance = null;
			LOGGER.info("Disconnected from vcenter.");
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean isConnected() {
		boolean result = false;
		if (serviceInstance != null && serviceInstance.getAboutInfo().getApiVersion() != null) {
			if (serviceInstance.getSessionManager().getCurrentSession() != null) {
				result = true;
			}
		}
		return result;
	}

	/**
	 * if vcenter client connection is not set, this method will connect to vcenter.
	 */
	public boolean checkConnection(Entity entity) {
		
		if (!isConnected()) {
			LOGGER.info("Not connected, connection in progress, checking model...");
			
			try {
				// Read vCenter credential mixin if any, if none this will load login/pass from a property file.
				Vcentercredential credMixin = MixinBaseUtils.getVcenterCredMixin(entity);
				if (credMixin == null) {
					System.out.println("vCenter credential mixin is not set, reading credentials from property file !");
					
					loadFromPropertyFile();
				} else {
					System.out.println("vCenter credential mixin is set on this compute !");
					loadFromCredentialMixin(credMixin);
				}
				connect();
				LOGGER.info("Connected to vcenter.");
				return true;
			} catch (IOException ex) {
				ex.printStackTrace();
				return false;
			}
		} else {
			LOGGER.info("Connected to vcenter.");
			return true;
		}

	}

}
