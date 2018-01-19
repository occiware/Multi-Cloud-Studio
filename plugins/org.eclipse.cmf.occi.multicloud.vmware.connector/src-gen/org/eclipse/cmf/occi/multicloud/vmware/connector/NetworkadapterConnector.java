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
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.NetworkHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VCenterClient;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VMHelper;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;
import org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.allocator.Allocator;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.allocator.AllocatorImpl;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.EntityUtils;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.EntityUtilsHeadless;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.MixinBaseUtils;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.MixinBaseUtilsHeadless;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.UIDialog;

import com.vmware.vim25.Description;
import com.vmware.vim25.GuestNicInfo;
import com.vmware.vim25.HostPortGroup;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/vmware# - term: networkadapter -
 * title: Network adapter interface
 */
public class NetworkadapterConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.NetworkadapterImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(NetworkadapterConnector.class);
	private static final String ATTR_NETWORK_INTERFACE_IP_ADDRESS = "occi.networkinterface.address";
	private String vmName = null;
	private String networkAdapterName = null;

	/**
	 * Host network name.
	 */
	private String networkName = null;

	private String oldNetworkAdapterName = null;

	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	private boolean nicExist = false;
	private boolean created = false;

	private String ipAddressPlainLocal = null;
	private boolean dhcpMode = false;
	private boolean wakeOnLan = true;
	private String macAddress = null;
	private String allocation = null;
	private NetworkInterfaceStatus adapterState = NetworkInterfaceStatus.INACTIVE;

	/**
	 * Main vmware client to manage this instance on provider.
	 */
	private VCenterClient vCenterClient = new VCenterClient(null, null, null);
	
	
	/**
	 * Managed object reference id. Unique reference for virtual machine.
	 */
	private String morId;

	// Start of user code Networkadapterconnector_constructor
	/**
	 * Constructs a networkadapter connector.
	 */
	NetworkadapterConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code

	//
	// OCCI CRUD callback operations.
	//

	// Start of user code NetworkadapterocciCreate
	/**
	 * Called when this Networkadapter instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		titleMessage = "Create network adapter : " + this.getTitle();
		if (UIDialog.isStandAlone()) {
			// Launch network create method.
			createNetworkNIC(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					createNetworkNIC(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	// Start of user code Networkadapter_occiRetrieve_method
	/**
	 * Called when this Networkadapter instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			retrieveNetworkNIC(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveNetworkNIC(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}

			updateNetworkInterfaceAttributes();

		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	// Start of user code Networkadapter_occiUpdate_method
	/**
	 * Called when this Networkadapter instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		titleMessage = "Update network adapter : " + this.getTitle();
		if (UIDialog.isStandAlone()) {
			updateNetworkNIC(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					updateNetworkNIC(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	// Start of user code NetworkadapterocciDelete_method
	/**
	 * Called when this Networkadapter instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		titleMessage = "Delete a network adapter : " + this.getTitle();
		if (UIDialog.isStandAlone()) {
			deleteNetworkNIC(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					deleteNetworkNIC(monitor);
				}
			};
			if (UIDialog.showConfirmDialog()) {
				UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			}

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	//
	// Networkadapter actions.
	//

	/**
	 * Connect a network adapter.
	 */
	public void up() {
		LOGGER.debug("Action up() called on " + this);
		titleMessage = "Down for this network adapter : " + this.getTitle();
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			upNetworkNIC(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					upNetworkNIC(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;

	}

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/network/action# - term: down -
	 * title:
	 */
	public void down() {
		LOGGER.debug("Action down() called on " + this);
		titleMessage = "Down for this network adapter : " + this.getTitle();
		if (UIDialog.isStandAlone()) {
			downNetworkNIC(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					downNetworkNIC(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;

	}

	/**
	 * Get the linked virtual machine object.
	 * 
	 * @return a virtual machine object, or null if none.
	 */
	public VirtualMachine getVirtualMachineFromLinks() {
		VirtualMachine vm = null;

		if (this.getSource() instanceof InstancevmwareConnector) {
			InstancevmwareConnector compute = (InstancevmwareConnector) this.getSource();

			if (compute != null) {
				// Get vm title and search in vcenter.
				// TODO : Add vmname in an attribute other than title.
				this.vmName = compute.getTitle();
				Folder rootFolder = vCenterClient.getServiceInstance().getRootFolder();
				vm = VMHelper.findVMForName(rootFolder, vmName);
			}
		}
		return vm;
	}

	/**
	 * Get the network designed for this vm.
	 * 
	 * @return a {@link VswitchConnector} object, null if none.
	 */
	private VswitchConnector getLinkedNetwork() {
		return (VswitchConnector) this.getTarget();
	}

	/**
	 * Get the port group name (port group name), or allocate an vswitch and port
	 * group if no network.
	 * 
	 * @param vm
	 * @param netConn
	 * @return
	 */
	public String getVMHostNetworkName(VirtualMachine vm, VswitchConnector netConn) {

		Network[] networks = null;
		try {
			networks = vm.getNetworks();
			if (networks == null) {
				// No network found. No value to retrieve.
				LOGGER.warn("No network found, no values to retrieve.");

				return networkName;
			}
			if (netConn == null) {
				// No network designed.
				// Search the first default interface.
				Folder rootFolder = vCenterClient.getServiceInstance().getRootFolder();
				HostSystem host = VMHelper.findHostSystemForVM(rootFolder, vmName);
				Allocator allocator = new AllocatorImpl(rootFolder);
				allocator.setHost(host);
				Network net = allocator.allocateNetwork();
				if (net != null) {
					networkName = net.getName();
				} else {
					LOGGER.error("The host " + host.getName() + " has no network.");
					return networkName;
				}

			} else {
				// A network interface is defined.
				if (netConn.getOcciNetworkLabel() == null || netConn.getOcciNetworkLabel().isEmpty()) {
					// No host network name is defined.
					networkName = null;
					return networkName;

				}

				for (Network network : networks) {
					if (network.getName().equals(netConn.getOcciNetworkLabel())) {
						networkName = network.getName();
						break;
					}
				}

			}

		} catch (RemoteException ex) {
			LOGGER.error("Cant get default network for vm : " + vmName);
		}
		return networkName;
	}

	/**
	 * get attribute value with his occi key, deserve when no property value set,
	 * with Mixin attribute as it is defined by Cloud designer.
	 * 
	 * @param key
	 * @return an attribute value, null if no one is found.
	 */
	public String getAttributeValueByOcciKey(String key) {
		String value = null;
		if (key == null) {
			return value;
		}

		List<AttributeState> attrs = this.getAttributes();
		for (AttributeState attr : attrs) {
			if (attr.getName().equals(key)) {
				value = attr.getValue();
				break;
			}
		}

		return value;

	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public String getNetworkAdapterName() {
		return networkAdapterName;
	}

	public void setNetworkAdapterName(String networkAdapterName) {
		this.networkAdapterName = networkAdapterName;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String hostNetworkName) {
		this.networkName = hostNetworkName;
	}

	/**
	 * Business code on creating a network interface adapter (nic).
	 * 
	 * @param monitor
	 */
	public void createNetworkNIC(IProgressMonitor monitor) {

		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}
		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			subMonitor.worked(10);
		}
		// 1 - Get vm connector link, if no vm ==> no create, vmName is set with
		// this method.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			globalMessage = "No virtual machine is linked on the network.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (monitor != null) {
			subMonitor.worked(20);
		}
		// 2 - Check if this network adapter already exist.
		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			globalMessage = "No network adapter name setted. Cant create the network.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (oldNetworkAdapterName == null) {
			oldNetworkAdapterName = networkAdapterName;
		}

		// 3 - if exist, network is not created.
		nicExist = NetworkHelper.isNICExist(networkAdapterName, vm);
		if (nicExist) {
			globalMessage = "This network adapter: " + networkAdapterName + " already exist for the virtual machine: "
					+ vmName;
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (monitor != null) {
			subMonitor.worked(30);
		}
		Folder rootFolder = vCenterClient.getServiceInstance().getRootFolder();
		HostSystem host = VMHelper.findHostSystemForVM(rootFolder, vmName);

		// Get the linked Network interface connector.
		VswitchConnector netConn = getLinkedNetwork();
		if (networkName == null && netConn != null) {
			networkName = netConn.getOcciNetworkLabel();
		} else {

			Allocator allocator = new AllocatorImpl(rootFolder);
			allocator.setHost(host);

			Network net = allocator.allocateNetwork();

			networkName = net.getName();
		}

		// 4 - if not exist, check attributes and create the network.
		// Check the hostNetworkName...
		if (networkName == null || !NetworkHelper.isHostNetworkExist(networkName, host)) {
			LOGGER.error("Host network name doesnt exist");
			if (networkName != null) {
				globalMessage = "No virtual switch to connect on : " + networkName;
			} else {
				globalMessage = "No virtual switch to connect from this network adapter.";
			}
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (monitor != null) {
			subMonitor.worked(40);
		}
		// TODO : Manual configuration network mode (mac address).
		// TODO : Customization with ipAddress and other cool things...
		VirtualDeviceConfigSpec nicSpec = NetworkHelper.createNicSpec(networkName, networkAdapterName,
				NetworkHelper.MODE_NETWORK_ADDRESS_GENERATED, null);
		VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
		VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
		vmConfigSpec.setDeviceChange(nicSpecArray);

		// Launch the reconfig task.
		if (monitor != null) {
			subMonitor.worked(60);
		}
		Task task;
		try {
			task = vm.reconfigVM_Task(vmConfigSpec);
			task.waitForTask();

		} catch (RemoteException ex) {
			globalMessage = "Error while creating a network adapter : " + networkAdapterName + " --< to vm : " + vmName
					+ " , \n error message: " + ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage, ex);
			vCenterClient.disconnect();
			return;

		} catch (InterruptedException e) {
			globalMessage = "Error while creating a network adapter : " + networkAdapterName + " --< to vm : " + vmName
					+ " , \n error message: " + e.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage, e);
			vCenterClient.disconnect();
			return;
		}

		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				globalMessage = "Error while creating a network adapter : " + networkAdapterName + " --< to vm : "
						+ vmName + " , \n error message: " + fault.detail + " \n " + fault.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage, fault);

			} else {
				created = true;
			}
		} catch (RemoteException e) {
			globalMessage = "Error while creating a network adapter : " + networkAdapterName + " --< to vm : " + vmName
					+ " , \n error message: " + e.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage, e);
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		// 5 - Reload network information, and update accordingly the object
		// (via occiRetrieve() method.)
		if (created) {
			LOGGER.info("Network adapter : " + networkAdapterName + " has been created.");
		} else {
			LOGGER.warn("Network adapter : " + networkAdapterName + " could'nt created, cause : \n " + globalMessage);
		}

		vCenterClient.disconnect();
	}

	/**
	 * Business code for retrieving a network adapter.
	 * 
	 * @param monitor
	 */
	public void retrieveNetworkNIC(IProgressMonitor monitor) {

		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);

		}
		ServiceInstance si = vCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();
		// Load virtual machine if any.
		// Note: vmName is set with this method.
		VirtualMachine vm = getVirtualMachineFromLinks();

		if (vm == null) {

			globalMessage = "The linked virtual machine doesnt exist on Vcenter, no network to retrieve.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			adapterState = NetworkInterfaceStatus.INACTIVE;
			// No vm adapter found so.
			vCenterClient.disconnect();
			return;
		}

		if (toMonitor) {
			subMonitor.worked(20);
		}
		// Get the linked Network connector target.
		VswitchConnector netConn = getLinkedNetwork();

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkName != null && networkName.isEmpty()) {
			networkName = null;
		}
		if (oldNetworkAdapterName == null) {
			oldNetworkAdapterName = networkAdapterName;
		}
		// Search the appropriate adapter if vm exist on vcenter.
		getVMHostNetworkName(vm, netConn);
		List<VirtualEthernetCard> vEths = null;
		VirtualEthernetCard vEthDevice = null;
		if (networkName != null) {
			// Search after network adapter name for the backing name :
			// hostNetworkName.
			// List of all virtual ethernet card on the vm.
			vEths = NetworkHelper.findNetDeviceForHostNetName(networkName, vm);
			if (vEths.isEmpty()) {
				globalMessage = "No network adapter found for this host network: " + networkName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				adapterState = NetworkInterfaceStatus.INACTIVE;
				vCenterClient.disconnect();
				return;
			}

		} else {
			globalMessage = "The vswitch port group name is not found on vcenter, no network to retrieve.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			adapterState = NetworkInterfaceStatus.INACTIVE;
			vCenterClient.disconnect();
			return;
		}
		String externalId = null;
		for (VirtualEthernetCard vEth : vEths) {
			externalId = vEth.getExternalId();
			if (networkAdapterName == null) {

				LOGGER.info("The network adapter is not set (title attribute), searching info on vcenter...");
				if (externalId != null) {
					networkAdapterName = externalId;
				} else {
					// Find the first on the list.
					networkAdapterName = vEth.getDeviceInfo().getLabel();
				}
				vEthDevice = vEth;
				break;
			} else {
				if (vEth.getDeviceInfo().getLabel().equals(networkAdapterName)) {
					vEthDevice = vEth;
					break;
				} else if (externalId != null) {
					if (externalId.equals(networkAdapterName)) {
						vEthDevice = vEth;
					}
				}

			}
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		// Set the informations...
		String[] ipAddressesLocal;

		if (VMHelper.isToolsInstalled(vm) && VMHelper.isToolsRunning(vm) && vEthDevice != null) {
			// Get guest information.
			GuestNicInfo[] guestNicInf = vm.getGuest().getNet();
			int i;
			int key = vEthDevice.getKey();
			if (guestNicInf != null) {
				for (GuestNicInfo nicInfo : guestNicInf) {
					ipAddressesLocal = nicInfo.getIpAddress();
					// TODO : How to get dhcp mode of a network adapter system ?
					// (without null value)
					// dhcpMode =
					// nicInfo.getIpConfig().getDhcp().getIpv4().isEnable();
					// nicInfo.getIpConfig().ipAddress[0].state;
					// TODO : State of the network adapter ??? (otherwise
					// connected / disconnected)
					// TODO : How to obtain gateway address ? the gateway

					macAddress = nicInfo.getMacAddress();

					int deviceConfigId = nicInfo.getDeviceConfigId();
					LOGGER.info("Network : " + nicInfo.getNetwork());
					LOGGER.info("Device Config Id : " + deviceConfigId);
					if (deviceConfigId == key) {
						// i = 0;
						for (String ipAddress : ipAddressesLocal) {
							ipAddressPlainLocal = ipAddress;
							break;
							// i++;
							//
							// if (i == ipAddressesLocal.length) {
							// ipAddressPlainLocal += ipAddress;
							// } else {
							// ipAddressPlainLocal += ipAddress + ";";
							// }
							//
						}
						break;
					}
				}
			}

		}

		// TODO : Gateway value, how to get this value ? not found on guest
		// object.

		// TODO : allocation value (dynamic or static).

		// if (dhcpMode) {
		// allocation = "dynamic";
		// } else {
		// allocation = "static";
		// }
		// Set the allocation.
		// AttributeState attrib =
		// this.getAttributeStateObject("occi.networkinterface.allocation");
		// if (attrib == null) {
		// // Create the attribute and set his value.
		//
		// attrib = createAttribute("occi.networkinterface.allocation",
		// allocation);
		// this.getAttributes().add(attrib);
		// } else {
		// attrib.setValue(allocation);
		// }

		// May be null if the device is not started...

		if (vEthDevice != null && vEthDevice.getConnectable() != null) {
			if (vEthDevice.getConnectable().connected) {
				adapterState = NetworkInterfaceStatus.ACTIVE;

			} else {
				adapterState = NetworkInterfaceStatus.INACTIVE;
			}

			// TODO : Wake on lan value
			// wakeOnLan = vEthDevice.getWakeOnLanEnabled();
		}

		if (toMonitor) {
			subMonitor.worked(100);
		}

		if (UIDialog.isStandAlone()) {
			updateNetworkInterfaceAttributes();
		}
		globalMessage = "The network adapter informations has been retrieved and are updated.";
		levelMessage = Level.INFO;

		vCenterClient.disconnect();

	}

	/**
	 * Business code for updating a network adapter.
	 * 
	 * @param monitor
	 */
	public void updateNetworkNIC(IProgressMonitor monitor) {

		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);

		}
		// TODO : Change ipAddress, change Mac address, dhcp active/inactive
		// etc.
		// Note: vmName is set with this method.
		VirtualMachine vm = getVirtualMachineFromLinks();

		if (vm == null) {

			globalMessage = "The linked virtual machine doesnt exist on Vcenter, no network to retrieve.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			adapterState = NetworkInterfaceStatus.INACTIVE;
			// No vm adapter found so.
			vCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		// Get the linked Network connector.
		VswitchConnector netConn = getLinkedNetwork();

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkName != null && networkName.isEmpty()) {
			networkName = null;
		}
		if (oldNetworkAdapterName == null) {
			oldNetworkAdapterName = networkAdapterName;
		}
		if (oldNetworkAdapterName != null && networkAdapterName != null
				&& !oldNetworkAdapterName.equals(networkAdapterName)) {
			// Change the label name of the adapter.
			VirtualEthernetCard vEthDevice = NetworkHelper.findVirtualEthernetCardForVM(oldNetworkAdapterName, vm);
			if (vEthDevice == null) {
				globalMessage = "no virtual device for this name: " + oldNetworkAdapterName
						+ " , cant update the network device: " + oldNetworkAdapterName + " on vm: " + vmName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				oldNetworkAdapterName = null;
				adapterState = NetworkInterfaceStatus.INACTIVE;
				vCenterClient.disconnect();
				return;
			}
			if (toMonitor) {
				subMonitor.worked(40);
			}
			vEthDevice.setExternalId(networkAdapterName);
			Description desc = vEthDevice.getDeviceInfo();
			desc.setLabel(networkAdapterName);
			vEthDevice.setDeviceInfo(desc);

			VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
			VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
			nicSpec.setOperation(VirtualDeviceConfigSpecOperation.edit);
			nicSpec.setDevice(vEthDevice);
			VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
			vmConfigSpec.setDeviceChange(nicSpecArray);
			// Launch the reconfig task.
			// Launch the task.
			Task task;
			try {
				task = vm.reconfigVM_Task(vmConfigSpec);
				task.waitForTask();

			} catch (RemoteException e) {
				globalMessage = "Error while updating a network adapter : " + networkAdapterName + " --< from vm : "
						+ vmName + " \n " + " Message: " + e.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			} catch (InterruptedException ex) {
				globalMessage = "Error while updating a network adapter : " + networkAdapterName + " --< from vm : "
						+ vmName + " \n " + " Message: " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}

			TaskInfo taskInfo;
			try {
				taskInfo = task.getTaskInfo();
				if (taskInfo.getState() != TaskInfoState.success) {
					MethodFault fault = taskInfo.getError().getFault();
					globalMessage = "Error while updating a network adapter : " + networkAdapterName + " --< from vm : "
							+ vmName + " \n " + " detail: " + fault.detail + " \n Message: " + fault.getMessage();
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					LOGGER.error("Fault message: " + fault.getMessage() + fault.getClass().getName());
				} else {
					LOGGER.info("The network : " + networkAdapterName + " is updated on virtual machine : " + vmName);
				}
			} catch (RemoteException e) {
				globalMessage = "Error while updating a network adapter : " + networkAdapterName + " --< from vm : "
						+ vmName + " \n " + " Message: " + e.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
			}

		} else {
			LOGGER.warn("No value changed, cant update.");
		}
		if (toMonitor) {
			subMonitor.worked(100);
		}
		vCenterClient.disconnect();
	}

	/**
	 * Business code for deleting a network nic.
	 * 
	 * @param monitor
	 */
	public void deleteNetworkNIC(IProgressMonitor monitor) {
		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);

		}
		// Load the virtual machine.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			globalMessage = "No virtual machine is linked on the network adapter.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}

		// Check if the network nic device exist.
		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			globalMessage = "No network adapter name setted. Cant delete the network adapter.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}

		boolean nicExist = NetworkHelper.isNICExist(networkAdapterName, vm);
		if (!nicExist) {
			globalMessage = "This network adapter: " + networkAdapterName + " doesnt exist for the virtual machine: "
					+ vmName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		// Remove this device.
		// Load the eth device.
		VirtualEthernetCard vEth = NetworkHelper.findVirtualEthernetCardForVM(networkAdapterName, vm);
		if (vEth == null) {
			globalMessage = "Cant retrieve virtual ethernet card: " + networkAdapterName
					+ " for deletion on virtual machine : " + vmName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
		VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
		nicSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
		nicSpec.setDevice(vEth);
		VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
		vmConfigSpec.setDeviceChange(nicSpecArray);

		if (toMonitor) {
			subMonitor.worked(60);
		}
		// Launch the task.
		Task task;
		try {
			task = vm.reconfigVM_Task(vmConfigSpec);
			task.waitForTask();

		} catch (RemoteException ex) {
			globalMessage = "Error while deleting a network adapter : " + networkAdapterName + " --< from vm : "
					+ vmName + " \n " + ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage, ex);
			vCenterClient.disconnect();
			return;
		} catch (InterruptedException e) {
			globalMessage = "Error while deleting a network adapter : " + networkAdapterName + " --< from vm : "
					+ vmName + " \n " + e.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage, e);
			vCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(80);
		}
		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				globalMessage = "Error while deleting a network adapter : " + networkAdapterName + " --< from vm : "
						+ vmName + " \n " + "detail: " + fault.detail + " \n Message: " + fault.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage, fault);
				LOGGER.error("Fault message: " + fault.getMessage() + fault.getClass().getName());
			} else {
				LOGGER.info("The network : " + networkAdapterName + " is removed from virtual machine : " + vmName);
			}
		} catch (RemoteException e) {
			globalMessage = "Error while deleting a network adapter : " + networkAdapterName + " --< from vm : "
					+ vmName + " \n " + e.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage, e);
		}
		if (toMonitor) {
			subMonitor.worked(100);
		}
		vCenterClient.disconnect();
	}

	/**
	 * Business code for action up.
	 * 
	 * @param monitor
	 */
	public void upNetworkNIC(IProgressMonitor monitor) {
		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);
		}

		// Load the virtual machine.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			globalMessage = "No virtual machine is linked on the network.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			globalMessage = "No network adapter name setted. Cant load the network adapter information.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}

		// Load the virtual ethernet card object from vm.
		VirtualEthernetCard vEth = NetworkHelper.findVirtualEthernetCardForVM(networkAdapterName, vm);
		if (vEth == null) {
			globalMessage = "Cant retrieve virtual ethernet card: " + networkAdapterName
					+ " for action up, on virtual machine : " + vmName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		// Load the connect info.
		VirtualDeviceConnectInfo connectInfo = vEth.getConnectable();
		if (connectInfo == null) {
			globalMessage = "No connection information is found for this network adapter : " + networkAdapterName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		boolean result = false;

		VswitchConnector netConn = getLinkedNetwork();
		if (toMonitor) {
			subMonitor.worked(40);
		}
		// Network State Machine.
		switch (getOcciNetworkinterfaceState().getValue()) {

		case NetworkInterfaceStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"up\")...");
			if (connectInfo.isConnected()) {
				// Disconnect and reconnect.
				result = NetworkHelper.down(vm, vEth);
				if (result) {
					adapterState = NetworkInterfaceStatus.INACTIVE;
					result = NetworkHelper.up(vm, vEth);
				}
			} else {
				result = NetworkHelper.up(vm, vEth);
			}
			break;

		case NetworkInterfaceStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"up\")...");
			if (!connectInfo.isConnected()) {
				result = NetworkHelper.up(vm, vEth);
			}
			break;

		case NetworkInterfaceStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"up\")...");
			if (!connectInfo.isConnected()) {
				result = NetworkHelper.up(vm, vEth);
			}
			break;

		default:
			if (!connectInfo.isConnected()) {
				result = NetworkHelper.up(vm, vEth);
			}
			break;
		}

		if (result) {
			LOGGER.info("The network adapter : " + networkAdapterName + " is connected.");
			adapterState = NetworkInterfaceStatus.ACTIVE;
			// if (netConn != null) {
			// netConn.setState(NetworkStatus.ACTIVE);
			// }
		} else {
			if (connectInfo.isConnected()) {
				LOGGER.info("The network adapter: " + networkAdapterName + " was already connected.");
				adapterState = NetworkInterfaceStatus.ACTIVE;
				// if (netConn != null) {
				// netConn.setState(NetworkStatus.ACTIVE);
				// }
			} else {
				globalMessage = "The network adapter is not connected, check your configuration.";
				levelMessage = Level.WARN;
				LOGGER.warn(globalMessage);
				adapterState = NetworkInterfaceStatus.INACTIVE;
			}
		}
		if (toMonitor) {
			subMonitor.worked(100);
		}
		vCenterClient.disconnect();

	}

	/**
	 * Business code for action down.
	 * 
	 * @param monitor
	 */
	public void downNetworkNIC(IProgressMonitor monitor) {
		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);
		}

		// Load the virtual machine.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			globalMessage = "No virtual machine is linked on the network adapter.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			globalMessage = "No network adapter name setted. Cant load the network information.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}

		// Load the virtual ethernet card object from vm.
		VirtualEthernetCard vEth = NetworkHelper.findVirtualEthernetCardForVM(networkAdapterName, vm);
		if (vEth == null) {
			globalMessage = "Cant retrieve virtual ethernet card: " + networkAdapterName
					+ " for action down, on virtual machine : " + vmName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		// Load the connect info.
		VirtualDeviceConnectInfo connectInfo = vEth.getConnectable();
		if (connectInfo == null) {
			globalMessage = "No connection information is found for this network : " + networkAdapterName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		boolean result = false;
		if (toMonitor) {
			subMonitor.worked(40);
		}
		VswitchConnector netConn = getLinkedNetwork();
		// Network State Machine.
		if (connectInfo.isConnected()) {
			result = NetworkHelper.down(vm, vEth);
			if (!result) {
				adapterState = NetworkInterfaceStatus.ACTIVE;

				// if (netConn != null) {
				// netConn.setState(NetworkStatus.ACTIVE);
				// }
			}
		}
		if (result) {
			adapterState = NetworkInterfaceStatus.INACTIVE;
		}
		if (toMonitor) {
			subMonitor.worked(100);
		}
		vCenterClient.disconnect();
	}

	public void updateNetworkInterfaceAttributes() {

		Ipnetworkinterface mixinIpNetworkInterface = getIpNetworkInterface();
		Map<String, String> attrsToCreate = new HashMap<>();
		Map<String, String> attrsToUpdate = new HashMap<>();
		List<String> attrsToDelete = new ArrayList<>();
		// TODO : wakeon lan : add attr to extension vmwarecrtp and update this code...

		// String wakeOnLanStr = wakeOnLan.toString();
		// AttributeState attr =
		// this.getAttributeStateObject("occi.networkinterface.wakeonlan");
		// if (attr == null) {
		// // Create the attribute and set his value.
		// attr = createAttribute("occi.networkinterface.wakeonlan",
		// wakeOnLanStr);
		// this.getAttributes().add(attr);
		// } else {
		// attr.setValue(wakeOnLanStr);
		// }

		if (mixinIpNetworkInterface != null && ipAddressPlainLocal != null && !ipAddressPlainLocal.isEmpty()) {
			mixinIpNetworkInterface.setOcciNetworkinterfaceAddress(ipAddressPlainLocal);
			if (this.getAttributeStateObjectFromMixinBase(mixinIpNetworkInterface,
					ATTR_NETWORK_INTERFACE_IP_ADDRESS) == null) {
				attrsToCreate.put(ATTR_NETWORK_INTERFACE_IP_ADDRESS, ipAddressPlainLocal);
			} else {
				attrsToUpdate.put(ATTR_NETWORK_INTERFACE_IP_ADDRESS, ipAddressPlainLocal);
			}
			if (UIDialog.isStandAlone()) {
				// Headless environment.
				MixinBaseUtilsHeadless.updateAttributes(mixinIpNetworkInterface, attrsToCreate, attrsToUpdate,
						attrsToDelete);

			} else {
				// Gui environment
				MixinBaseUtils.updateAttributes(mixinIpNetworkInterface, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
		} else if (ipAddressPlainLocal != null && !ipAddressPlainLocal.isEmpty()) {
			this.setOcciNetworkinterfaceStateMessage("ip address setup: " + ipAddressPlainLocal);
		} else {
			this.setOcciNetworkinterfaceStateMessage("No ip address setup.");
		}

		this.setTitle(networkAdapterName);
		this.setOcciNetworkinterfaceState(adapterState);
		// Mac address.
		if (macAddress != null && !macAddress.isEmpty()) {
			this.setOcciNetworkinterfaceMac(macAddress);
		}

	}

	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute doesnt exist, null value is
	 *         returned.
	 */
	public AttributeState getAttributeStateObjectFromMixinBase(MixinBase mixinB, final String key) {

		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : mixinB.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}

	/**
	 * Get the mixin based on ipnetworkinterface
	 * 
	 * @return an ipnetworkinterface mixin, null if none applied.
	 */
	private Ipnetworkinterface getIpNetworkInterface() {
		Ipnetworkinterface mixinIpNetworkInterface = null;
		List<MixinBase> mixinBase = this.getParts();
		for (MixinBase mixinB : mixinBase) {
			if (mixinB instanceof Ipnetworkinterface) {
				mixinIpNetworkInterface = (Ipnetworkinterface) mixinB;
				break;
			}
		}
		return mixinIpNetworkInterface;
	}

}
