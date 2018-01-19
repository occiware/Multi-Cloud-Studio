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
 * Generated at Wed Jul 19 15:09:17 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.vmware/model/vmware.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.vmware.connector;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.HostHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.NetworkHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VCenterClient;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.infrastructure.NetworkStatus;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.VirtualSwitchNotFoundException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.EntityUtils;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.EntityUtilsHeadless;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.UIDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.Description;
import com.vmware.vim25.GuestNicInfo;
import com.vmware.vim25.HostPortGroup;
import com.vmware.vim25.HostVirtualSwitch;
import com.vmware.vim25.MethodFault;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import com.vmware.vim25.VirtualEthernetCard;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/vmware# - term: vswitch - title:
 */
public class VswitchConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.VswitchImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(VswitchConnector.class);

	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	private Integer nbPortTmp = 0;
	private String vSwitchName = null;
	private String portGroupName = null;
	private int vlanId = 0;

	/**
	 * Main vmware client to manage this instance on provider.
	 */
	private VCenterClient vCenterClient = new VCenterClient(null, null, null);
	
	/**
	 * Represent the physical compute which be used for this standard switch.
	 */
	private String hostSystemName = null;

	// Start of user code Vswitchconnector_constructor
	/**
	 * Constructs a vswitch connector.
	 */
	VswitchConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code VswitchocciCreate
	/**
	 * Called when this Vswitch instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);

		titleMessage = "Reference a vswitch and retrieve it : " + getTitle();

		// IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {
		//
		// @Override
		// public void run(IProgressMonitor monitor) throws InvocationTargetException,
		// InterruptedException {
		// LOGGER.debug("occiCreate() called on " + this);
		// if (!VCenterClient.checkConnection()) {
		// // Must return true if connection is established.
		// return;
		// }
		// ServiceInstance si = VCenterClient.getServiceInstance();
		// Folder rootFolder = si.getRootFolder();
		//
		// String vSwitchName = getTitle();
		// String networkName = getLabel();
		//
		// if (vSwitchName == null) {
		// // No name ==> no vswitch.
		// globalMessage = "The vswitch name is not setted, please check your
		// configuration (attribute title).";
		// levelMessage = Level.INFO;
		// LOGGER.warn(globalMessage);
		// VCenterClient.disconnect();
		// return;
		// }
		// Allocator allocator = new AllocatorImpl(rootFolder);
		//
		// // Create a new vSwitch and add his network name.
		//
		// // 1 : Check if this vSwitch exist.
		//
		// // Get the attribute value for occi.network.vmware.hostsystemname.
		// hostSystemName = getAttributeValueByOcciKey(ATTR_HOSTSYSTEM_NAME);
		// if (hostSystemName == null) {
		// // Get the host system if set on computes link via network adapters
		// // and set it.
		// findAndSetHostSystemNameFromLinkedVMs();
		// }
		// if (hostSystemName == null) {
		// // Auto allocation.
		// LOGGER.info("Auto allocating a host system");
		// allocator.allocateDatacenter();
		// allocator.allocateCluster();
		// allocator.allocateHostSystem();
		// }
		//
		// if (hostSystemName == null) {
		// LOGGER.error(
		// "Cant create the vswitch and port group, no host system defined, please set
		// the attribute occi.network.vmware.hostsystemname");
		// VCenterClient.disconnect();
		// return;
		// }
		// // Load the hostsystem object.
		//
		// HostSystem host = HostHelper.findHostSystemForName(rootFolder,
		// getHostSystemName());
		// if (host == null) {
		// LOGGER.error("The host system : " + hostSystemName + " doesnt exist on
		// vCenter with your ids.");
		// VCenterClient.disconnect();
		// return;
		// }
		// HostVirtualSwitch hostVswitch = null;
		// try {
		// hostVswitch = NetworkHelper.findVSwitch(host, vSwitchName);
		// } catch (VirtualSwitchNotFoundException ex) {
		// // no op.
		// }
		// if (hostVswitch == null) {
		// nbPortStr = getAttributeValueByOcciKey(ATTR_VSWITCH_NBPORT);
		// if (nbPortStr == null || nbPortStr.isEmpty()) {
		// nbPortStr = "8";
		// }
		// int nbPort = 8;
		// try {
		// nbPort = Integer.valueOf(nbPortStr);
		// } catch (NumberFormatException ex) {
		// LOGGER.error("bad value for " + ATTR_VSWITCH_NBPORT);
		// LOGGER.error("Cant create the vswitch.");
		// VCenterClient.disconnect();
		// return;
		// }
		//
		// // Get the ip Addresses in cidr notation.
		// SubnetUtils subnetUtil = new
		// SubnetUtils(getAttributeValueByOcciKey("occi.network.address"));
		// String netmask = subnetUtil.getInfo().getNetmask();
		// String ipAddress = subnetUtil.getInfo().getAddress();
		// // String networkAddress = subnetUtil.getInfo().getNetworkAddress();
		// String vmKernelIpAddress;
		// boolean dhcpMode = (getAttributeValueByOcciKey("occi.network.allocation") !=
		// null &&
		// getAttributeValueByOcciKey("occi.network.allocation").equals("dynamic"));
		//
		// // Create the vswitch (without set macAddress, null value)..
		// try {
		// NetworkHelper.createVSwitch(vSwitchName, networkName, nbPort, getVlan(),
		// host, null, ipAddress, netmask, dhcpMode);
		// } catch (RemoteException ex) {
		// // TODO : Message global.
		// }
		// } else {
		// LOGGER.warn("Cant create the vswitch : " + vSwitchName + " for the host : " +
		// hostSystemName + " , cause it already exist.");
		// VCenterClient.disconnect();
		// return;
		// }
		//
		// // 2 : check if created.
		// try {
		// hostVswitch = NetworkHelper.findVSwitch(host, vSwitchName);
		// } catch (VirtualSwitchNotFoundException ex) {
		// LOGGER.warn("The vswitch is not created, please check your configuration.");
		// }
		//
		// VCenterClient.disconnect();
		//
		// }
		// };
		//
		// UIDialog.executeActionThread(runnableWithProgress, titleMessage);
		//
		// if (globalMessage != null && !globalMessage.isEmpty()) {
		// UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
		// }
		// // retrieve resource informations when no errors has been launched.
		// if (levelMessage != null && !Level.ERROR.equals(levelMessage)) {
		// occiRetrieve();
		// }
		// globalMessage = "";
		// levelMessage = null;
		//
		occiRetrieve();
	}
	// End of user code

	// Start of user code Vswitch_occiRetrieve_method
	/**
	 * Called when this Vswitch instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		titleMessage = "Retrieve a vswitch : " + getTitle();
		LOGGER.debug("occiRetrieve() called on " + this);
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			// Retrieve a compute without monitoring.
			retrieveNetwork(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveNetwork(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}

			updateAttributesOnNetwork();

		}

		globalMessage = "";
		levelMessage = null;

		if (vCenterClient.isConnected()) {
			vCenterClient.disconnect();
		}
	}
	// End of user code

	// Start of user code Vswitch_occiUpdate_method
	/**
	 * Called when this Vswitch instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		titleMessage = "Update a vswitch : " + getTitle();
		LOGGER.debug("occiUpdate() called on " + this);

		// if (!VCenterClient.checkConnection()) {
		// // Must return true if connection is established.
		// return;
		// }
		//
		//
		//
		// VCenterClient.disconnect();
	}
	// End of user code

	// Start of user code VswitchocciDelete_method
	/**
	 * Called when this Vswitch instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		titleMessage = "Delete a vswitch: " + getTitle();
		LOGGER.debug("occiDelete() called on " + this);

		// if (!VCenterClient.checkConnection()) {
		// // Must return true if connection is established.
		// return;
		// }
		//
		// // TODO : Remove vSwitch network and detach his linked adapters device
		// // from network.
		//
		// VCenterClient.disconnect();
	}
	// End of user code

	//
	// Vswitch actions.
	//
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl#up()
	 */
	@Override
	public void up() {
		titleMessage = "Enable a vswitch : " + getTitle();
		LOGGER.debug("Action up() called on " + this);

		// if (!VCenterClient.checkConnection()) {
		// // Must return true if connection is established.
		// return;
		// }
		//
		// // Activate vswitch.
		//
		// VCenterClient.disconnect();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl#down()
	 */
	@Override
	public void down() {
		titleMessage = "Disable a vwitch : " + getTitle();
		LOGGER.debug("Action down() called on " + this);
		// if (!VCenterClient.checkConnection()) {
		// // Must return true if connection is established.
		// return;
		// }
		//
		// // TODO : Disconnect all network interfaces.
		//
		// VCenterClient.disconnect();
	}

	/**
	 * Search on the linked virtual machine if any the host system name.
	 * 
	 * @return
	 */
	private void findAndSetHostSystemNameFromLinkedVMs() {

		Configuration conf = OcciHelper.getConfiguration(this);

		List<Resource> resources = conf.getResources();
		InstancevmwareConnector compute = null;
		Resource target;
		boolean found;
		for (Resource res : resources) {
			found = false;
			if (res instanceof InstancevmwareConnector) {
				// Check if this compute is linked to this vswitch by his
				// adapters.
				EList<Link> links = res.getLinks();
				for (Link link : links) {
					if (link instanceof NetworkadapterConnector) {
						// Check if this network interface is linked to this
						// vswitch.
						target = link.getTarget();
						if (target != null && this.equals(target)) {
							// We found a compute linked to this network
							// vswitch.
							compute = (InstancevmwareConnector) res;
							found = true;
							break;
						}
					}
				}
				if (found) {
					break;
				}

			}
		}
		if (compute != null) {
			// Get the host system name.
			// to be sure to get the host system name, we refresh this object
			// before.
			compute.occiRetrieve();

			if (compute.getHostSystemName() != null) {
				this.setHostSystemName(compute.getHostSystemName());
			}

		}

	}

	public String getHostSystemName() {
		return hostSystemName;
	}

	public void setHostSystemName(String hostSystemName) {
		this.hostSystemName = hostSystemName;
	}

	/**
	 * Update this object attributes.
	 */
	public void updateAttributesOnNetwork() {

		// Get vmfolders mixin.
		VmwarefoldersConnector vmFolders = getMixinVmwarefolders();

		this.setNbport(nbPortTmp);

		if (vmFolders != null && hostSystemName != null && hostSystemName.isEmpty()) {
			vmFolders.setHostsystemname(hostSystemName);
		}

		if (vSwitchName != null && !vSwitchName.isEmpty()) {
			// TODO : add the vswitch name to a new attribute other than title.
			this.setTitle(vSwitchName);
			this.setOcciNetworkState(NetworkStatus.ACTIVE);
		}

		this.setOcciNetworkVlan(vlanId);
		if (portGroupName != null && !portGroupName.isEmpty()) {
			this.setOcciNetworkLabel(portGroupName);
		}

	}

	/**
	 * Retrieve a vswitch from network label (port group) and others infos.
	 * 
	 * @param monitor
	 *            must be null if we are in console mode
	 */
	public void retrieveNetwork(IProgressMonitor monitor) {
		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			return;
		}

		ServiceInstance si = vCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();
		// Search a host that contain this portgroup.
		String networkLabelName = getOcciNetworkLabel();
		if (networkLabelName == null || networkLabelName.isEmpty()) {
			globalMessage = "No label for this network, please set the attribute label.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}

		HostSystem host = HostHelper.findHostForPortGroup(rootFolder, networkLabelName);
		if (host == null) {
			globalMessage = "No host found for this port group : " + networkLabelName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		HostPortGroup portGroup = NetworkHelper.findPortGroup(host, networkLabelName);
		if (portGroup == null) {
			globalMessage = "No portGroup found cant retrieve vswitch informations.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}

		// Find now the network.
		vSwitchName = portGroup.getSpec().getVswitchName();
		vlanId = portGroup.getSpec().getVlanId();
		portGroupName = networkLabelName;
		hostSystemName = host.getName();
		try {
			HostVirtualSwitch hostVswitch = NetworkHelper.findVSwitch(host, vSwitchName);
			nbPortTmp = hostVswitch.getNumPorts();
		} catch (VirtualSwitchNotFoundException ex) {
			globalMessage = "The vswitch : " + vSwitchName + " is not found, please check your configuration.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			return;
		}

		// TODO : How to check that vswitch / port group is active ?
		// Set the network state.
		if (UIDialog.isStandAlone()) {
			updateAttributesOnNetwork();
		}
	}

	/**
	 * Get the mixin base instance "vmwarefolders".
	 * 
	 * @return
	 */
	public VmwarefoldersConnector getMixinVmwarefolders() {
		List<MixinBase> mixinsBase = this.getParts();
		VmwarefoldersConnector vmfolders = null;
		for (MixinBase mixinB : mixinsBase) {
			if (mixinB instanceof VmwarefoldersConnector) {
				vmfolders = (VmwarefoldersConnector) mixinB;
				break;
			}
		}
		return vmfolders;
	}

}
