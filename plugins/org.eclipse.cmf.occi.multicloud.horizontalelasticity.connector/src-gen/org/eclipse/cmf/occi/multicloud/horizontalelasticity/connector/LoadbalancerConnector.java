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
 * Generated at Wed Oct 04 16:03:06 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: loadbalancer
 * - title: 
 */
public class LoadbalancerConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.LoadbalancerImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(LoadbalancerConnector.class);

	// Start of user code Loadbalancerconnector_constructor
	/**
	 * Constructs a loadbalancer connector.
	 */
	LoadbalancerConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code LoadbalancerocciCreate
	/**
	 * Called when this Loadbalancer instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Loadbalancer_occiRetrieve_method
	/**
	 * Called when this Loadbalancer instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Loadbalancer_occiUpdate_method
	/**
	 * Called when this Loadbalancer instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code LoadbalancerocciDelete_method
	/**
	 * Called when this Loadbalancer instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Loadbalancer actions.
	//
	// Start of user code Loadbalancer_Kind_addBackendServer_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/loadbalancer/action#
     * - term: addbackendserver
     * - title: 
	 */
	@Override
	public void addbackendserver()
	{
		LOGGER.debug("Action addbackendserver() called on " + this);
		

		// TODO: Implement how to addbackendserver this loadbalancer.
		JSch jsch = new JSch();
	    Session session = null;
	    String privateKeyPath = "/Users/spirals/.ssh/id_rsa";
	    try {
	        jsch.addIdentity(privateKeyPath);        
	        session = jsch.getSession("root", getLoadbalancerAddress(), 22);
	        session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
	        java.util.Properties config = new java.util.Properties(); 
	        config.put("StrictHostKeyChecking", "no");
	        session.setConfig(config);
	    } catch (JSchException e) {
	        throw new RuntimeException("Failed to create Jsch Session object.", e);
	    }
	    Path path = Paths.get("/etc/haproxy/haproxy.cfg");
	    //Path path = Paths.get("/home/docker/haproxy.cfg");
	    //(this works ) sed -i  '/#insertrouteshere/a       server exp1 172.16.225.14:80 maxconn 1000 check port 80' /etc/haproxy/haproxy.cfg
	    //String command = "sudo sed -i '" + File.separator + "#insertrouteshere" + File.separator + "a     server exp1 "+ip+":80 maxconn 1000 check port 80' "+ path;
	    // again sudo with sed does not work in jsch with a normal user in Ubuntu, so, when you need to execute root commands
	    // enable root user and allow permitrootlogin in sshd. 
	    String command = "sed -i  '"+ File.separator + "#insertrouteshere" + File.separator + "a \\    server exp1 "+ getLoadbalancerInstanceIP() +":80 maxconn 1000 check port 80' " + path;
	    String cm2 = " service haproxy reload";
	    System.out.println(command);
	    //String c3 = "sed -i  '/two/a two again again' /home/TestYahya.cfg"; //work also
	    try {
			session.connect();
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("session connected.....");
	    
	    Channel channel;
	    Channel channel2;
		try {
			channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);
			((ChannelExec) channel).setPty(false);
			channel.connect();
			channel.disconnect();
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}
			
			channel2 = session.openChannel("exec");
			((ChannelExec) channel2).setCommand(cm2);
			((ChannelExec) channel2).setPty(false);
			channel2.connect();
			channel2.disconnect();
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    session.disconnect();
	    System.out.println("session disconnected.....");
		
	}
		// End of user code

	// Start of user code Loadbalancer_Kind_RemoveBackendServer_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/loadbalancer/action#
     * - term: removebackendserver
     * - title: 
	 */
	@Override
	public void removebackendserver()
	{
		LOGGER.debug("Action removebackendserver() called on " + this);

		// TODO: Implement how to removebackendserver this loadbalancer.
		JSch jsch = new JSch();
	    Session session = null;
	    String privateKeyPath = "/Users/spirals/.ssh/id_rsa";
	    try {
	        jsch.addIdentity(privateKeyPath);        
	        session = jsch.getSession("root", getLoadbalancerAddress(), 22);
	        session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
	        java.util.Properties config = new java.util.Properties(); 
	        config.put("StrictHostKeyChecking", "no");
	        session.setConfig(config);
	    } catch (JSchException e) {
	        throw new RuntimeException("Failed to create Jsch Session object.", e);
	    }
	    Path path = Paths.get("/etc/haproxy/haproxy.cfg");
	    String cmd1 = "sed -i " + File.separator + getLoadbalancerInstanceIP() + File.separator + "d " + path; 
	    String cmd2 = " service haproxy reload";
	    System.out.println(cmd1);
	    try {
			session.connect();
		} catch (JSchException e) {
			e.printStackTrace();
		}
	    System.out.println("session connected.....");
	    
	    Channel channel;
	    Channel channel2;
		try {
			channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(cmd1);
			((ChannelExec) channel).setPty(false);
			channel.connect();
			channel.disconnect();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			channel2 = session.openChannel("exec");
			((ChannelExec) channel2).setCommand(cmd2);
			((ChannelExec) channel2).setPty(false);
			channel2.connect();
			channel2.disconnect();
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    session.disconnect();
	    System.out.println("session disconnected.....");

	}
		// End of user code

}	
