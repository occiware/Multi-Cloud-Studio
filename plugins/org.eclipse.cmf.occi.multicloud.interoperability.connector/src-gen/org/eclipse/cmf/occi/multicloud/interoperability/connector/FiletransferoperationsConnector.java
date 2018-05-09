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

import java.io.File;
import java.util.Optional;

import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.occiware.driver.ssh.SshClient;
import org.occiware.driver.ssh.SshException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/multicloud/specialfeatures# - term:
 * filetransferoperations - title:
 */
public class FiletransferoperationsConnector
		extends org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(FiletransferoperationsConnector.class);

	// Start of user code Filetransferoperationsconnector_constructor
	/**
	 * Constructs a filetransferoperations connector.
	 */
	FiletransferoperationsConnector() {
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code FiletransferoperationsocciCreate
	/**
	 * Called when this Filetransferoperations instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Filetransferoperations_occiRetrieve_method
	/**
	 * Called when this Filetransferoperations instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		// TODO : Check connection
		LOGGER.debug("occiRetrieve() called on " + this);
	}
	// End of user code

	// Start of user code Filetransferoperations_occiUpdate_method
	/**
	 * Called when this Filetransferoperations instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code FiletransferoperationsocciDelete_method
	/**
	 * Called when this Filetransferoperations instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Filetransferoperations actions.
	//

	// Start of user code Filetransferoperations_Kind_copy_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/multicloud/specialfeatures/datatransferoperations/action#
	 * - term: copy - title:
	 */
	@Override
	public void copy() {
		LOGGER.debug("Action copy() called on " + this);
		Resource source = this.getSource();
		Resource target = this.getTarget();
		if ((!(source instanceof Compute)) || !(target instanceof Compute)) {
			LOGGER.error("source or target useable (not a compute) for copy action");
			return;
		}
		if (source == null || target == null) {
			// TODO : Throw an exception.
			LOGGER.error("No source or target useable for copy action");
			return;
		} else {
			// Retrieve all infos before proceeding.
			source.occiRetrieve();
			target.occiRetrieve();
		}
		Compute sourceCompute = (Compute)source;
		Compute targetCompute = (Compute)target;
		// TODO : Check compute state here => must be activated and running.
		
		
		String srcName = null;
		Instancevmware sourceInstanceVMware = null;
		Instanceec2 sourceInstanceEC2 = null;
		String ipSource = null;
		String ipTarget = null;

		String targetName = null;
		Instancevmware targetInstanceVMware = null;
		Instanceec2 targetInstanceEC2 = null;
		
		if (source instanceof Instancevmware) {
			sourceInstanceVMware = (Instancevmware) source;
			srcName = sourceInstanceVMware.getTitle();
			ipSource = sourceInstanceVMware.getGuestIpv4Address();
		}
		if (source instanceof Instanceec2) {
			sourceInstanceEC2 = (Instanceec2) source;
			srcName = sourceInstanceEC2.getName();
			ipSource = sourceInstanceEC2.getPublicIpv4Address();
		}
		if (target instanceof Instancevmware) {
			targetInstanceVMware = (Instancevmware) target;
			targetName = targetInstanceVMware.getTitle();
			ipTarget = targetInstanceVMware.getGuestIpv4Address();
		}
		if (target instanceof Instanceec2) {
			targetInstanceEC2 = (Instanceec2) target;
			targetName = targetInstanceEC2.getName();
			ipTarget = targetInstanceEC2.getPublicIpv4Address();
		}

		if (ipSource == null || ipTarget == null) {
			System.err.println("Cant launch the copy between the source and the target !");
			return; // TODO : throw a connect exception.
		}
		

		System.out.println("Copying image files from : " + srcName + " to " + targetName);

		if (OcciHelper.getMixinBase(getParts(), SshtransferConnector.class).isPresent()) {

			Optional<SshtransferConnector> optSshTransferMixin = OcciHelper.getMixinBase(getParts(),
					SshtransferConnector.class);
			SshtransferConnector sshTransferMixin = optSshTransferMixin.get();

			// Connect to source.
			String knownHosts = System.getProperty("user.home") + File.separator + ".ssh" + File.separator
					+ "known_hosts";

			if (sshTransferMixin.getSshport() == null || sshTransferMixin.getSshport() == 0) {
				sshTransferMixin.setSshport(22);
			}

			// TODO : if keypair is set use keypair connection instead password.
			SshClient sshClient = new SshClient(sshTransferMixin.getSrcusername(), sshTransferMixin.getSrcpassword(),
					null, knownHosts, ipSource, sshTransferMixin.getSshport());
			sshClient.setTimeout(5000); // TODO : Add attribute sshTimeout on the specification model.

			if (sshTransferMixin.getTargetprivatekeypath() == null
					|| sshTransferMixin.getTargetprivatekeypath().isEmpty()) {
				// TODO : throw an exception...
				LOGGER.error("No target private key is set for copy on storage : " + targetName);
				return;
			}
			if (sshTransferMixin.getTargetusername() == null || sshTransferMixin.getTargetusername().isEmpty()) {
				// TODO : throw an exception...
				LOGGER.error("No target username is set for copy on storage : " + targetName);
				return;
			}

			// Launch scp command to target
			try {
				sshClient.connect();
				boolean connected = sshClient.isConnected();
				if (!connected) {
					LOGGER.error("Not connected to server : " + ipSource);
					return;
				}
				// ex:
				// scp -p -r -i /home/occiware/ec2keys/demo.pem /home/occiware/images/*.*
				// bitnami@ec2-52-213-8-211.eu-west-1.compute.amazonaws.com:/home/bitnami/stack/apps/coppermine/htdocs/albums/download/

				// ex: "touch /tmp/userdata.txt | echo \"test one write in file.\" >
				// /tmp/userdata.txt"
				String command = "scp -o StrictHostKeyChecking=no -p -r -i " + sshTransferMixin.getTargetprivatekeypath() + " "
						+ this.getPathLocationSource() + " " + sshTransferMixin.getTargetusername() + "@" + ipTarget
						+ ":" + this.getPathLocationTarget(); // TODO: hostkeycheck ==> YES for production ! workaround : add host target to known_hosts with keypair connection.
				
				// System.out.println("Command to execute : " + command);

				String result = sshClient.execute(command);
				if (result != null && !result.isEmpty()) {
					System.out.println("ssh remote command result : " + result);
				}
				// Close all resources.
				sshClient.disconnect();
			} catch (SshException ex) {
				LOGGER.error("Exception thrown when executing one command : " + ex.getMessage());
				try {
					sshClient.disconnect();
				} catch (Exception e) {
					e.printStackTrace();
				}
				ex.printStackTrace();
			}
		}

	}

	// End of user code
	// Start of user code Filetransferoperations_Kind_cancel_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/multicloud/specialfeatures/filetransferoperations/action#
	 * - term: cancel - title:
	 */
	@Override
	public void cancel() {
		LOGGER.debug("Action cancel() called on " + this);

		// TODO: Implement how to cancel this filetransferoperations.
	}

	// End of user code
	// Start of user code Filetransferoperations_Kind_encryptAndCopy_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/multicloud/specialfeatures/filetransferoperations/action#
	 * - term: encryptandcopy - title:
	 */
	@Override
	public void encryptandcopy() {
		LOGGER.debug("Action encryptandcopy() called on " + this);

		// TODO: Implement how to encryptandcopy this filetransferoperations.
	}
	// End of user code

}
