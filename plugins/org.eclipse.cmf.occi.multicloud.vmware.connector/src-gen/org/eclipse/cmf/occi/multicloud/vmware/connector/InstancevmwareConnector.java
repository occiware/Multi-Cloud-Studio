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
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
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
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.crtp.Large;
import org.eclipse.cmf.occi.crtp.Medium;
import org.eclipse.cmf.occi.crtp.Mem_large;
import org.eclipse.cmf.occi.crtp.Mem_medium;
import org.eclipse.cmf.occi.crtp.Mem_small;
import org.eclipse.cmf.occi.crtp.Small;
import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.RestartMethod;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;
import org.eclipse.cmf.occi.infrastructure.StopMethod;
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.MountVMWareToolsDiskException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.allocator.AllocatorImpl;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.allocator.ResourceTPLContainer;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.MixinBaseUtils;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.MixinBaseUtilsHeadless;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.UIDialog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.ClusterHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.DatacenterHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.DatastoreHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.HostHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.NetworkHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VCenterClient;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VMHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineFileInfo;
import com.vmware.vim25.VirtualMachineGuestOsIdentifier;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import com.vmware.vim25.mo.ClusterComputeResource;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.ResourcePool;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/vmware# - term: instancevmware -
 * title:
 */
public class InstancevmwareConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(InstancevmwareConnector.class);

	public static final String ATTR_HOSTSYSTEM_NAME = "hostsystemname";
	public static final String ATTR_DATACENTER_NAME = "datacentername";
	public static final String ATTR_DATASTORE_NAME = "datastorename";
	public static final String ATTR_CLUSTER_NAME = "clustername";
	public static final String ATTR_VM_EPHEMERAL_DISK_SIZE_GB = "occi.compute.ephemeral_storage.size";
	public static final String ATTR_USER_DATA = "occi.compute.userdata";
	public static final String ATTR_USERNAME = "user";
	public static final String ATTR_PASSWORD = "password";
	public static final String ATTR_USER_DATA_FILE = "occi.compute.userdata.file";
	public static final String ATTR_VCPU_NUMBER = "vcpu";
	
	/**
	 * Path on inventory object. Format: /inria/tests/ (with slash on last character or without).
	 */
	public static final String ATTR_VM_INVENTORY_PATH = "inventorypath";
	
	/**
	 * Define VMWare specifications for this compute.
	 */
	protected VirtualMachineConfigSpec vmSpec = null;

	/**
	 * Managed object reference id. Unique reference for virtual machine.
	 */
	private String morId;
	
	private String vmOldName = null;

	/**
	 * VMware state of this instance.
	 */
	private String vmState = null;
	private boolean vmExist = false;
	
	private String datacenterName = null;
	private String datastoreName = null;
	private String clusterName = null;
	/**
	 * Represent the physical compute which be used for host this virtual
	 * machine.
	 */
	private String hostSystemName = null;

	/**
	 * VM Path in inventory objects. format: /inria/tests/
	 */
	private String inventoryPath = "";
	private String vmTemplateName = null;
	private String vcpusStr = "0";
	private Integer vcpus = 0;
	private Integer numCores;
	private Float memoryGB;
	private String architecture;
	private Float speed;
	private String hostname = null;
	private String vmGuestState = null;
	private String guestOsId = null;
	private String markedAsTemplate = null;
	// default to 15GB
	private Float ephemeralDiskSizeGB = 15.0f;
	
	private String userData;
	private String userDataFile;
	private String username;
	private String password;
	
	
	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	// Used to monitor the task in console mode. This will be used with message attribute state.
	private String messageProgress = null;

	private boolean toCreateOnStartOperation = false;

		
	/**
	 * First ipv4 address.
	 */
	private String ipv4Address = "";
	/**
	 * First ipv6 address.
	 */
	private String ipv6Address = "";

	// Start of user code Instancevmwareconnector_constructor
	/**
	 * Constructs a instancevmware connector.
	 */
	InstancevmwareConnector() {
		LOGGER.debug("Constructor called on " + this);
		System.out.println("InstancevmwareConnector constructor called ==> " + this);
	}
	// End of user code

	//
	// OCCI CRUD callback operations.
	//

	// Start of user code InstancevmwareocciCreate
	/**
	 * Called when this Instancevmware instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		titleMessage = "Create a virtual machine : " + getTitle();
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			createCompute(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					createCompute(monitor);
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

	// Start of user code Instancevmware_occiRetrieve_method
	/**
	 * Called when this Instancevmware instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		titleMessage = "Retrieve a virtual machine : " + getTitle();

		LOGGER.debug("occiRetrieve() called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");

			// Retrieve a compute without monitoring on the main thread.
			retrieveCompute(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveCompute(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if (!vmExist) {
				vmState = VMHelper.POWER_OFF;
			}
			updateAttributesOnCompute();
		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	// Start of user code Instancevmware_occiUpdate_method
	/**
	 * Called when this Instancevmware instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		titleMessage = "Update a virtual machine : " + getTitle();
		LOGGER.debug("occiUpdate() called on " + this);

		if (UIDialog.isStandAlone()) {
			// headless mode.
			updateCompute(null);

		} else {

			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					updateCompute(monitor);
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

		if (globalMessage != null && !globalMessage.isEmpty()) {
			UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
		}
		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	// Start of user code InstancevmwareocciDelete_method
	/**
	 * Called when this Instancevmware instance will be deleted.
	 */
	@Override
	public void occiDelete() {

		titleMessage = "Delete a virtual machine : " + getTitle();
		LOGGER.debug("occiDelete() called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			deleteCompute(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					deleteCompute(monitor);
				}
			};

			if (UIDialog.showConfirmDialog()) {
				UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			}

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}

		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	//
	// Instancevmware actions.
	//
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#start()
	 */
	@Override
	public void start() {
		titleMessage = "Power on a virtual machine : " + getTitle();
		LOGGER.debug("Action start() called on " + this);
		if (UIDialog.isStandAlone()) {
			startCompute(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					startCompute(monitor);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#stop(org.eclipse.cmf.
	 * occi.infrastructure.StopMethod)
	 */
	@Override
	public void stop(StopMethod method) {
		titleMessage = "Power off a virtual machine : " + getTitle();
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			stopCompute(null, method);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					stopCompute(monitor, method);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#restart(org.eclipse.cmf.
	 * occi.infrastructure.RestartMethod)
	 */
	@Override
	public void restart(RestartMethod method) {
		titleMessage = "Reboot a virtual machine : " + getTitle();
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			// Headless mode.
			restartCompute(null, method);
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					restartCompute(monitor, method);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#suspend(org.eclipse.cmf.
	 * occi.infrastructure.SuspendMethod)
	 */
	@Override
	public void suspend(SuspendMethod method) {
		titleMessage = "Suspend a virtual machine : " + getTitle();
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			// Headless mode.
			suspendCompute(null, method);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					suspendCompute(monitor, method);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#save(org.eclipse.cmf.
	 * occi.infrastructure.SaveMethod, java.lang.String)
	 */
	@Override
	public void save(SaveMethod method, String name) {
		titleMessage = "Save a virtual machine : " + getTitle();
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			// Headless mode.
			saveCompute(null, method, name);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					saveCompute(monitor, method, name);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
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
			LOGGER.debug("Mixin found : " + mixinB.getMixin().getTerm() + " --> class: " + mixinB.getClass().getName());
			
			if (mixinB instanceof VmwarefoldersConnector) {
				vmfolders = (VmwarefoldersConnector) mixinB;
				break;
			}
		}
		if (vmfolders == null) {
			// No vmfolders mixin
			LOGGER.debug("No mixin vmwarefolders has been applied");
		} else {
			LOGGER.debug("Mixin vmwarefolders has been applied to this instance.");
		}
		return vmfolders;
	}

	/**
	 * Get the mixin base instance "Ssh_user_dataConnector" for userdata to apply on
	 * instance.
	 * 
	 * @return
	 */
	public Ssh_user_dataConnector getMixinSshUserData() {
		List<MixinBase> mixinBase = this.getParts();
		Ssh_user_dataConnector userData = null;
		for (MixinBase mixinB : mixinBase) {
			if (mixinB instanceof Ssh_user_dataConnector) {
				userData = (Ssh_user_dataConnector) mixinB;
				break;
			}
		}
		return userData;
	}

	/**
	 * Get the mixin instance for instance class CRTP (depends on resource_tpl).
	 */
	private MixinBase getMixinInstanceClass() {
		List<MixinBase> mixinsBase = this.getParts();
		MixinBase instanceClass = null;
		for (MixinBase mixinB : mixinsBase) {
			if (mixinB instanceof Small || mixinB instanceof Medium || mixinB instanceof Large
					|| mixinB instanceof Mem_small || mixinB instanceof Mem_medium || mixinB instanceof Mem_large) {
				instanceClass = mixinB;
				break;
			}
		}
		return instanceClass;
	}

	/**
	 * Get the datacenter name.
	 * 
	 * @return may return null if no mixin vmwarefolders.
	 */
	public String getDatacenterName() {
		VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
		if (vmfolders != null) {
			datacenterName = vmfolders.getDatacentername();
		} 
		return this.datacenterName;
	}

	/**
	 * Set in mixin instance vmwarefolders the datacentername.
	 * 
	 * @return
	 */
	public void setDatacenterName(final String datacenterName) {
		this.datacenterName = datacenterName;
	}
	
	/**
	 * Get the datastore name.
	 * 
	 * @return
	 */
	public String getDatastoreName() {
		VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
		if (vmfolders != null) {
			return vmfolders.getDatastorename();
		}
		return this.datastoreName;
	}

	/**
	 * set the datastore name.
	 * 
	 * @return
	 */
	public void setDatastoreName(final String datastoreName) {
		this.datastoreName = datastoreName;
	}
	

	/**
	 * get cluster name.
	 * 
	 * @return
	 */
	public String getClusterName() {
		VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
		if (vmfolders != null) {
			return vmfolders.getClustername();
		}
		return this.clusterName;
	}

	/**
	 * Set the cluster name.
	 * 
	 * @return
	 */
	public void setClusterName(final String clusterName) {
		this.clusterName = clusterName;
	}

	public String getHostSystemName() {
		VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
		if (vmfolders != null) {
			return vmfolders.getHostsystemname();
		}
		return this.hostSystemName;
	}

	public void setHostSystemName(final String hostSystemName) {
		this.hostSystemName = hostSystemName;
	}

	public String getInventoryPath() {
		VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
		if (vmfolders != null) {
			return vmfolders.getInventorypath();
		}
		return this.inventoryPath;
	}

	/**
	 * Define the corresponding status from VMWare power state.
	 * 
	 * @param vmwarePowerState
	 * @return
	 */
	private ComputeStatus defineStatus(final String vmwarePowerState) {
		ComputeStatus status = this.getOcciComputeState();
		int power = 0;
		if (vmwarePowerState != null) {
			if (vmwarePowerState.equals(VMHelper.POWER_OFF)) {
				power = VMHelper.POWER_OFF_INT;
			} else if (vmwarePowerState.equals(VMHelper.POWER_ON)) {
				power = VMHelper.POWER_ON_INT;
			} else if (vmwarePowerState.equals(VMHelper.SUSPENDED)) {
				power = VMHelper.SUSPENDED_INT;
			}

			switch (power) {
			case VMHelper.POWER_ON_INT:
				status = ComputeStatus.ACTIVE;
				LOGGER.info("vm status is active.");

				break;
			case VMHelper.POWER_OFF_INT:
				status = ComputeStatus.INACTIVE;
				LOGGER.info("vm status is inactive");
				break;
			case VMHelper.SUSPENDED_INT:
				status = ComputeStatus.SUSPENDED;
				LOGGER.info("vm status is suspended.");

				break;
			default:
				status = ComputeStatus.ERROR;
				LOGGER.info("vm status error.");
			}
		}

		return status;

	}

	/**
	 * Get the linked storages.
	 * 
	 * @return a list of StoragelinkvmwareConnector or empty if none.
	 */
	private List<StoragelinkvmwareConnector> getLinkedStorages() {
		List<StoragelinkvmwareConnector> storages = new ArrayList<>();

		List<Link> links = this.getLinks();
		for (Link link : links) {
			if (link instanceof StoragelinkvmwareConnector) {
				StoragelinkvmwareConnector storage = (StoragelinkvmwareConnector) link;
				storages.add(storage);
			}
		}

		return storages;
	}

	/**
	 * Get the NetworkadapterConnector (network interfaces) from designer.
	 * 
	 * @return a list of interfaces or empty if none.
	 */
	private List<NetworkadapterConnector> getNetworkInterfaces() {
		List<NetworkadapterConnector> interfaces = new ArrayList<>();

		List<Link> links = this.getLinks();
		for (Link link : links) {
			if (link instanceof NetworkadapterConnector) {
				NetworkadapterConnector adapter = (NetworkadapterConnector) link;
				interfaces.add(adapter);
			}
		}

		return interfaces;
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

	/**
	 * Allocate vcpus et nb core per socket.
	 */
	private void assignVCpuToVMSpec() {
		
		vcpus = 0;
		vcpusStr = this.getAttributeValueByOcciKey(ATTR_VCPU_NUMBER);
		if (vcpusStr != null && !vcpusStr.trim().isEmpty()) {
			try {
				vcpus = Integer.valueOf(vcpusStr);
			} catch (NumberFormatException ex) {
				LOGGER.error("Vcpu is not a number, please set the attribute to an integer value.");
				vcpus = 1;
			}
		}
		if (vcpus == 0) {
			vcpus = getOcciComputeCores();
		}

		if (numCores < 2) {
			if (vcpus == 0) {
				vmSpec.setNumCPUs(1);
				vmSpec.setNumCoresPerSocket(1);
			} else {
				vmSpec.setNumCPUs(vcpus);
				vmSpec.setNumCoresPerSocket(vcpus);
			}

		} else {
			if (vcpus == 0) {
				vcpus = numCores;
			}
			vmSpec.setNumCPUs(vcpus);
			vmSpec.setNumCoresPerSocket(vcpus / numCores);
		}

	}
	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute doesnt exist, null value
	 *         is returned.
	 */
	public AttributeState getAttributeStateObject(final String key) {
		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : this.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}
	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute doesnt exist, null value
	 *         is returned.
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
	 * Get the first network where possible. (ex: eth0)
	 * 
	 * @param netInterfaceConn
	 * @return the first network connector (vSwitch),
	 */
	private VswitchConnector getFirstAdapterNetwork(List<NetworkadapterConnector> netInterfaceConn) {

		VswitchConnector netConn = null;

		for (NetworkadapterConnector netInt : netInterfaceConn) {
			String netSysInterface = netInt.getOcciNetworkinterfaceInterface(); // before getInterface().
			String netIntName = netInt.getTitle();
			if (netSysInterface != null) {
				if (netInt.getOcciNetworkinterfaceInterface().equals("eth0")) {
					netConn = (VswitchConnector) netInt.getTarget();
					break;
				}
				if (netIntName != null) {
					if (netIntName.contains("Adaptateur réseau 1") || netIntName.contains("Network adapter 1")) {
						Resource res = netInt.getTarget();
						if (res != null && res instanceof VswitchConnector) {
							netConn = (VswitchConnector) res;
							break;
						}
					}
				}
			}

		}
		if (netConn == null) {
			// Get only the first adapter found on list.
			for (NetworkadapterConnector netInt : netInterfaceConn) {
				Resource res = netInt.getTarget();
				if (res != null && res instanceof VswitchConnector) {
					netConn = (VswitchConnector) res;
					break;
				}
			}
		}

		return netConn;
	}

	public String getVmOldName() {
		return vmOldName;
	}

	public void setVmOldName(String vmOldName) {
		this.vmOldName = vmOldName;
	}

	public String getVmTemplateName() {
		return vmTemplateName;
	}

	public void setVmTemplateName(String vmTemplateName) {
		this.vmTemplateName = vmTemplateName;
	}

	public String getVcpusStr() {
		return vcpusStr;
	}

	public void setVcpusStr(String vcpusStr) {
		this.vcpusStr = vcpusStr;
	}

	public Integer getVcpus() {
		return vcpus;
	}

	public void setVcpus(Integer vcpus) {
		this.vcpus = vcpus;
	}

	/**
	 * Update this object attributes.
	 */
	public void updateAttributesOnCompute() {
		Map<String, String> attrsToCreate = new HashMap<>();
		Map<String, String> attrsToUpdate = new HashMap<>();
		List<String> attrsToDelete = new ArrayList<>();
		
		Ssh_user_dataConnector sshUserData = getMixinSshUserData();
		VmwarefoldersConnector vmwareFolders = getMixinVmwarefolders();
		MixinBase instanceClass = getMixinInstanceClass();
		
		boolean hasMixinFoldersData = vmwareFolders != null;
		
		// For disk ephemeral storage mandatory here to create a vm with a fixed
		// system storage, elsewhere the ephemeral will be 15.0GB.
		boolean hasMixinEphemeral = instanceClass != null;
		
		boolean hasMixinUserData = sshUserData != null;
		
		// Mixin base attribute States update.
		if (hasMixinFoldersData) {
			// ATTR_DATACENTER_NAME
			if (datacenterName != null) {
				if (this.getAttributeStateObjectFromMixinBase(vmwareFolders, ATTR_DATACENTER_NAME) == null) {
					attrsToCreate.put(ATTR_DATACENTER_NAME, datacenterName);
				} else {
					// update
					attrsToUpdate.put(ATTR_DATACENTER_NAME, datacenterName);
				}
				vmwareFolders.setDatacentername(datacenterName);
			}
			if (datastoreName != null) {
				// ATTR_DATASTORE_NAME
				if (this.getAttributeStateObjectFromMixinBase(vmwareFolders, ATTR_DATASTORE_NAME) == null) {
					attrsToCreate.put(ATTR_DATASTORE_NAME, datastoreName);
				} else {
					attrsToUpdate.put(ATTR_DATASTORE_NAME, datastoreName);
				}
				vmwareFolders.setDatastorename(datastoreName);
			}

			// ATTR_CLUSTER_NAME
			if (clusterName != null) {
				if (this.getAttributeStateObjectFromMixinBase(vmwareFolders, ATTR_CLUSTER_NAME) == null) {
					attrsToCreate.put(ATTR_CLUSTER_NAME, clusterName);
				} else {
					attrsToUpdate.put(ATTR_CLUSTER_NAME, clusterName);
				}
				vmwareFolders.setClustername(clusterName);
			}
			// ATTR_HOSTSYSTEM_NAME
			if (hostSystemName != null && hasMixinFoldersData) {
				if (this.getAttributeStateObjectFromMixinBase(vmwareFolders, ATTR_HOSTSYSTEM_NAME) == null) {
					attrsToCreate.put(ATTR_HOSTSYSTEM_NAME, hostSystemName);
				} else {
					attrsToUpdate.put(ATTR_HOSTSYSTEM_NAME, hostSystemName);
				}
				vmwareFolders.setHostsystemname(hostSystemName);
			}
		
			// Inventory path like /INRIA/tests/. This is the location folder where the vm has been created / moved etc.
			if (inventoryPath != null && !inventoryPath.trim().isEmpty() && hasMixinFoldersData) {
				if (this.getAttributeStateObjectFromMixinBase(vmwareFolders, ATTR_VM_INVENTORY_PATH) == null) {
					attrsToCreate.put(ATTR_VM_INVENTORY_PATH, inventoryPath);
				} else {
					attrsToUpdate.put(ATTR_VM_INVENTORY_PATH, inventoryPath);
				}
				vmwareFolders.setInventorypath(inventoryPath);
			}
			
			
			// Create or update AttributeStates.
			// Update the attributes via a transaction (or not if standalone).
			if (UIDialog.isStandAlone()) {
				// Headless environment.
				MixinBaseUtilsHeadless.updateAttributes(vmwareFolders, attrsToCreate, attrsToUpdate, attrsToDelete);
			} else {
				// Gui environment
				MixinBaseUtils.updateAttributes(vmwareFolders, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
			
			attrsToCreate.clear();
			attrsToUpdate.clear();
			attrsToDelete.clear();
		} // Endif has mixin vmwarefolders.
		
		if (hasMixinEphemeral) {
			if (this.getAttributeStateObjectFromMixinBase(instanceClass, ATTR_VM_EPHEMERAL_DISK_SIZE_GB) == null) {
				attrsToCreate.put(ATTR_VM_EPHEMERAL_DISK_SIZE_GB, "" + ephemeralDiskSizeGB);
			} else {
				attrsToUpdate.put(ATTR_VM_EPHEMERAL_DISK_SIZE_GB, "" + ephemeralDiskSizeGB);
			}
			
			// Update corresponding mixinbase.
			// Create or update AttributeStates.
			// Update the attributes via a transaction (or not if standalone).
			if (UIDialog.isStandAlone()) {
				// Headless environment.
				MixinBaseUtilsHeadless.updateAttributes(instanceClass, attrsToCreate, attrsToUpdate, attrsToDelete);
			} else {
				// Gui environment
				MixinBaseUtils.updateAttributes(instanceClass, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
			attrsToCreate.clear();
			attrsToUpdate.clear();
			attrsToDelete.clear();
		}
		
		if (markedAsTemplate == null) {
			markedAsTemplate = "false";
		}
		
		if (hasMixinUserData) {
			if (this.getAttributeStateObjectFromMixinBase(sshUserData, ATTR_USER_DATA) == null) {
				attrsToCreate.put(ATTR_USER_DATA, userData);
			} else {
				attrsToUpdate.put(ATTR_USER_DATA, userData);
			}
			if (username != null) {
				if (this.getAttributeStateObjectFromMixinBase(sshUserData, ATTR_USERNAME) == null) {
					attrsToCreate.put(ATTR_USERNAME, username);
				} else {
					attrsToUpdate.put(ATTR_USERNAME, username);
				}
			}
			if (password != null) {
				if (this.getAttributeStateObjectFromMixinBase(sshUserData, ATTR_PASSWORD) == null) {
					attrsToCreate.put(ATTR_PASSWORD, password);
				} else {
					attrsToUpdate.put(ATTR_PASSWORD, password);
				}
			}
			if (userDataFile != null) {
				if (this.getAttributeStateObjectFromMixinBase(sshUserData, ATTR_USER_DATA_FILE) == null) {
					attrsToCreate.put(ATTR_USER_DATA_FILE, userDataFile);
				} else {
					attrsToUpdate.put(ATTR_USER_DATA_FILE, userDataFile);
				}
			}
			
			// Update corresponding mixinbase.
			// Update the attributes via a transaction (or not if standalone).
			if (UIDialog.isStandAlone()) {
			// Headless environment.
				MixinBaseUtilsHeadless.updateAttributes(sshUserData, attrsToCreate, attrsToUpdate, attrsToDelete);
			} else {
				// Gui environment
				MixinBaseUtils.updateAttributes(sshUserData, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
			sshUserData.setUser(username);
			sshUserData.setPassword(password);
			sshUserData.setOcciComputeUserdata(userData);
			sshUserData.setOcciComputeUserdataFile(userDataFile);
		
			attrsToCreate.clear();
			attrsToUpdate.clear();
			attrsToDelete.clear();
		}
		
		if (architecture != null) {
			if (architecture.equals("x64")) {
				setOcciComputeArchitecture(Architecture.X64);
			} else {
				setOcciComputeArchitecture(Architecture.X86);
			}
		}
		
		if (numCores != null) {
			setOcciComputeCores(numCores);
		}
		if (memoryGB != null) {
			setOcciComputeMemory(memoryGB);
		}
		if (speed != null) {
			setOcciComputeSpeed(speed);
		}
		if (vmState != null) {
			setOcciComputeState(defineStatus(vmState));
		}
		if (hostname != null) {
			setOcciComputeHostname(hostname);
		}
		if (vcpus != 0) {
			this.setVcpu(vcpus);
		}
		if (vmGuestState != null) {
			this.setGueststate(vmGuestState);
		}
		if (vmTemplateName != null) {
			this.setImagename(vmTemplateName);
		}
		if (markedAsTemplate != null) {
			this.setMarkedastemplate(markedAsTemplate);
		}
		if (morId != null) {
			this.setInstanceId(morId);
		}
		if (guestOsId != null) {
			this.setGuestosid(guestOsId);
		}
		
		
		if (messageProgress != null) {
			setOcciComputeStateMessage(messageProgress);
		}
		
		
		
		
	}
	
	
	/**
	 * Get the storages resources without links and those have their title equals to
	 * this compute title. Used only when no storage linked and there's no main disk
	 * found when creating a new virtual machine.
	 * 
	 * @return
	 */
	public List<StoragevmwareConnector> getStorageNotLinked() {
		List<StoragevmwareConnector> stConnectors = new ArrayList<>();
		Configuration config = OcciHelper.getConfiguration(this);
		List<Resource> resources = config.getResources();

		for (Resource res : resources) {
			if (res instanceof StoragevmwareConnector && res.getLinks().isEmpty()
					&& res.getTitle().contains(this.getTitle())) {
				stConnectors.add((StoragevmwareConnector) res);
			}
		}
		return stConnectors;
	}

	/**
	 * Business code for creating a compute.
	 * 
	 * @param monitor
	 */
	public void createCompute(IProgressMonitor monitor) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();
		AllocatorImpl allocator = new AllocatorImpl(rootFolder);

		String vmName = getTitle();
		vmOldName = vmName;
		morId = instanceId;
		HostSystem host = null;
		ClusterComputeResource cluster = null;

		if (vmName == null) {
			// TODO : Set a new attribute vmname in instancevmwareConnector and remove
			// vmname management from title attribute.
			globalMessage = "Cant create a new virtual machine, the vm name is not set (check title attribute). ";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}

		// Check if this vm already exist if this is the case, we retrieve his value but
		// no other things to create.....
		if (VMHelper.isVMExistForName(rootFolder, vmName)) {
			globalMessage = "VM : " + vmName + " already exist. Cant create.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			return;
		}

		// Check if this vm already exist for instanceId.
		if (instanceId != null && VMHelper.findVMForMorId(rootFolder, instanceId) != null) {
			globalMessage = "VM : " + vmName + " already exist for instance id : " + instanceId + ". Cant create.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
		}

		// Get the list of linked network adapters, by this we get the network vSwitch
		// If none declared we allocate an available network,
		// If none we create the network.
		List<NetworkadapterConnector> netInterfaceConn = getNetworkInterfaces();

		// Same for storage we get the storage links.
		List<StoragelinkvmwareConnector> storageLinks = getLinkedStorages();

		if (imagename == null || vmTemplateName == null) {
			vmTemplateName = getAttributeValueByOcciKey("imagename");
		} else {
			if (vmTemplateName == null) {
				vmTemplateName = imagename;
			}
		}
		
		// Template or not ?
		boolean hasTemplate = (vmTemplateName != null && !vmTemplateName.trim().isEmpty());

		// Check if we create the virtual machine on start operation.

		if (!toCreateOnStartOperation && !hasTemplate) {
			// check if we have no networkinterface connected, if this is the case we check
			// if a network is in the configuration space.
			if (netInterfaceConn.isEmpty()) {
				// Check if network is on configuration object.
				Configuration config = OcciHelper.getConfiguration(this);
				if (config != null) {
					List<Resource> resources = config.getResources();
					for (Resource resource : resources) {
						if (resource instanceof VswitchConnector) {
							toCreateOnStartOperation = true;
							globalMessage = "Network detected on this configuration, for creating this vm, you must use start operation, no network adapter found for this vm.";
							levelMessage = Level.WARN;
							LOGGER.warn(globalMessage);
							return;
						}
					}
				}
			}
		} else {
			toCreateOnStartOperation = false;
		}
		// Set guestosid to null if its value is empty string.
		if (guestosid != null && guestosid.trim().isEmpty()) {
			guestOsId = null;
		} else {
			guestOsId = getGuestosid();
		}
		
		if (toMonitor) {
			subMonitor.worked(30);
		}

		// Datacenter part. first objects of the tree.
		Datacenter datacenter = DatacenterHelper.findDatacenterForName(rootFolder, getDatacenterName());
		if (datacenter == null) {
			// Allocate automaticly the datacenter.
			datacenter = allocator.allocateDatacenter();
			if (datacenter == null) {
				globalMessage = "Cant allocate a datacenter, cause : no available datacenter to allocate.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		} else {
			allocator.setDc(datacenter);
		}

		setDatacenterName(datacenter.getName());

		cluster = ClusterHelper.findClusterForName(datacenter, getClusterName());
		if (cluster == null) {
			// Assign a cluster that already exist, if none found, no
			// cluster.
			cluster = allocator.allocateCluster();
		}
		if (cluster == null) {
			globalMessage = "cant allocate a cluster --< No cluster available on datacenter : " + datacenter.getName();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		} else {
			setClusterName(cluster.getName());
		}
		
		// Detect the hostsystem for deploying this virtual machine on.
		try {
			host = HostHelper.findHostSystemForName(datacenter.getHostFolder(), getHostSystemName());
		} catch (RemoteException ex) {
			globalMessage = "Error while searching host folder. \n ";
			globalMessage += "Message: " + ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (host == null) {
			if (getHostSystemName() == null) {
				host = allocator.allocateHostSystem();
				if (host == null) {
					globalMessage = "cant allocate automatically an hostsystem, cause: there's no available host on the datacenter: "
							+ datacenter.getName();
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					VCenterClient.disconnect();
					return;
				}
			} else {
				// Error on allocating the hostsystem.
				globalMessage = "cant allocate the hostSystem: " + getHostSystemName()
						+ " --< cause: this doesnt exist on the datacenter: " + datacenter.getName();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		setHostSystemName(host.getName());

		// Image part, we load the vmtemplate object.
		VirtualMachine vmTemplate = null;
		if (hasTemplate) {
			try {
				vmTemplate = VMHelper.findVMForName(datacenter.getVmFolder(), vmTemplateName);
			} catch (RemoteException ex) {
				globalMessage = "Error while searching the vm template folder. \n ";
				globalMessage += "Message: " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}

		// Define guestOsId.
		if (hasTemplate && vmTemplate == null) {
			LOGGER.warn("No virtual machine template found for template: " + vmTemplateName);
			globalMessage = "The template " + vmTemplateName + " doesnt exist ! \n ";
			globalMessage += "Please define an existing template.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}

		if (!hasTemplate && guestOsId == null) {
			// Get the architecture to define the good default guestos.
			if (this.getOcciComputeArchitecture().equals("x86")) {
				LOGGER.warn("Guest OS Id is unknown, assign other 32 bits guest os by default.");
				// No VM template found, retrograde to guestOSId.
				// Get the corresponding value from api :
				guestOsId = VirtualMachineGuestOsIdentifier.otherGuest.toString();
			} else {
				LOGGER.warn("Guest OS Id is unknown, assign other 64 bits guest os by default.");
				guestOsId = VirtualMachineGuestOsIdentifier.otherGuest64.toString();
			}
		}
		
		if (hasTemplate) {
			// Get the guestOsId from template (not the attribute of this
			// compute).
			if (vmTemplate.getConfig().isTemplate()) {
				LOGGER.info("Template : " + vmTemplateName + " is used for building the virtual machine.");
				guestOsId = vmTemplate.getConfig().getGuestId();
			} else {
				LOGGER.warn("The virtual machine : " + vmTemplateName + " is not a template vm.");
				globalMessage = "The virtual machine : " + vmTemplateName + " is not a template vm. \n";
				globalMessage += "Please mark as a template this virtual machine or use another one. And retry after.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}

		// Check if guestOsId string is found on
		// VirtualMachineGuestOsIdentifier.
		if (VirtualMachineGuestOsIdentifier.valueOf(guestOsId) == null) {
			LOGGER.error("Guest OS Id : " + guestOsId + " not found !");
			globalMessage = "Valid values are : \n";
			int i = 0;
			for (VirtualMachineGuestOsIdentifier guestVal : VirtualMachineGuestOsIdentifier.values()) {
				globalMessage += guestVal.name() + ";";
				i++;
				if (i == 10) {
					globalMessage += "\n";
					i = 0;
				}
			}
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}

		// Get the devices storage.
		// The storage is based on a datastore, we must find the
		// corresponding datastore.

		Datastore datastore = null;
		// StoragelinkConnector stMain = getMainStorageLink();
		List<StoragelinkvmwareConnector> stLinks = getLinkedStorages(); // For additionnal disks.

		// Get the datastore vmware object.
		if (getDatastoreName() != null) {
			datastore = DatastoreHelper.findDatastoreForName(datacenter, getDatastoreName());
		}

		// Datastore automatic allocation if none found.
		// TODO : Define the datastore if there is one referenced on StorageConnector
		// and none on VMware compute.
		if (datastore == null) {
			// Allocate a datastore automaticly.
			datastore = allocator.allocateDatastore();
			if (datastore == null) {
				globalMessage = "cant allocate a datastore on datacenter: " + datacenter.getName()
						+ " --> there's no available datastore on the datacenter.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		setDatastoreName(datastore.getName());
		
		Folder vmFolder = null;
		inventoryPath = getInventoryPath();
		if (inventoryPath == null || inventoryPath.trim().isEmpty()) {
			inventoryPath = "";
			LOGGER.info("No inventory path found.");
		} else {
			LOGGER.info("inventory path for instance : " + vmName + " is : " + inventoryPath);
		}
		
		try {
			vmFolder = VMHelper.getInventoryFolderFromPath((Folder) datacenter.getVmFolder(), inventoryPath);
		} catch (RemoteException ex) {
			try {
				vmFolder = (Folder) datacenter.getVmFolder();
			} catch (RemoteException ey) { // fail silently.
			}
		}
		
		// User data get values part.
		Ssh_user_dataConnector sshUserData = getMixinSshUserData();
		if (sshUserData != null) {
			username = sshUserData.getUser();
			password = sshUserData.getPassword();
			userData = sshUserData.getOcciComputeUserdata();
			userDataFile = sshUserData.getOcciComputeUserdataFile();
		}
		
		// Get the first adapter (eth0 or name Network adapter 1 or
		// Adaptateur réseau 1).
		VswitchConnector firstConnector = getFirstAdapterNetwork(netInterfaceConn);
		if (toMonitor) {
			subMonitor.worked(50);
		}
		// Disk size in kiloBytes in VMware sdk.
		// Set the ephemeral disk size, if the add one crtp mixin is set.
		ResourceTPLContainer resourceTpl = null;
		MixinBase instanceClass = getMixinInstanceClass();
		ephemeralDiskSizeGB = 15.0f;
		if (instanceClass != null) {
			// A mixin OS TPL from CRTP is applied, override attribute cores and mem.
			resourceTpl = new ResourceTPLContainer(instanceClass);
		} else {
			resourceTpl = new ResourceTPLContainer(getOcciComputeCores(), getOcciComputeMemory(), ephemeralDiskSizeGB);
		}
		ephemeralDiskSizeGB = resourceTpl.getEphemeralDiskSizeGB();

		// Creation part.
		if (vmTemplate != null) {
			// We clone the vm.
			try {
				if (vmFolder == null) {
					vmFolder = (Folder) datacenter.getVmFolder();
				}

				ResourcePool rp = (ResourcePool) new InventoryNavigator(datacenter)
						.searchManagedEntities("ResourcePool")[0];
				VirtualMachineCloneSpec cloneSpec = new VirtualMachineCloneSpec();
				VirtualMachineRelocateSpec vmRelocate = new VirtualMachineRelocateSpec();
				vmRelocate.setHost(host.getMOR());
				vmRelocate.setPool(rp.getMOR());
				vmRelocate.setDatastore(datastore.getMOR());
				cloneSpec.setLocation(vmRelocate);
				cloneSpec.setTemplate(false);
				// After cloning, default behavior is power on the vm.
				if (getOcciComputeState() != null && getOcciComputeState().equals(ComputeStatus.ACTIVE)) {
					cloneSpec.setPowerOn(true);
				} else {
					cloneSpec.setPowerOn(false);
				}

				if (vmTemplate.getCurrentSnapShot() != null) {
					cloneSpec.snapshot = vmTemplate.getCurrentSnapShot().getMOR();
				}

				LOGGER.info(
						"Creating the Virtual Machine >> " + getTitle() + " << from template: " + vmTemplate.getName());

				vmSpec = new VirtualMachineConfigSpec();
				vmSpec.setName(vmName);

				if (summary != null && !summary.trim().isEmpty()) {
					vmSpec.setAnnotation(summary);
				} else {
					vmSpec.setAnnotation("Virtual Machine Annotation");
				}

				Long memSizeMB = resourceTpl.getMemoryMB();
				numCores = resourceTpl.getCores();
				boolean withCustomVmSpec = true;
				if (memSizeMB == 0L || numCores == 0) {
				   
					// No cores and memory, we dont use based vmSpec for cloning.
					withCustomVmSpec = false;
					
					// globalMessage = "You must set the memory size (in GB) and the number of cores or use CRTP resource templates instance class mixin.";
				   // levelMessage = Level.ERROR;
				//	LOGGER.error(globalMessage);
				//	VCenterClient.disconnect();
				}
				
				if (withCustomVmSpec) {
					vmSpec.setMemoryMB(memSizeMB);

					assignVCpuToVMSpec();

					vmSpec.setGuestId(guestOsId);
					// TODO : Add to model the cpuHot and memoryHot boolean to
					// instanceVmwareConnector resource.
					vmSpec.setCpuHotAddEnabled(true);
					// vmSpec.setCpuHotRemoveEnabled(true);
					vmSpec.setMemoryHotAddEnabled(true);

					// Create vm file info for vmx file.
					VirtualMachineFileInfo vmfi = new VirtualMachineFileInfo();
					vmfi.setVmPathName("[" + datastore.getName() + "]");
					vmSpec.setFiles(vmfi);

					cloneSpec.setConfig(vmSpec);
				}
				// TODO : Other Network and other storages allocation
				// ref on
				// designer when vm is created.
				com.vmware.vim25.mo.Task taskVm = vmTemplate.cloneVM_Task(vmFolder, vmName, cloneSpec);

				if (!UIDialog.isStandAlone()) {

					String result = taskVm.waitForTask();
					if (toMonitor) {
						subMonitor.worked(80);
					}
					if (result == com.vmware.vim25.mo.Task.SUCCESS) {
						globalMessage = "Virtual Machine successfully created from template : " + vmTemplate.getName();
						levelMessage = Level.INFO;
						LOGGER.info(globalMessage);

					} else {
						globalMessage = "VM couldn't be created ! vm name: " + vmName + " from template: "
								+ vmTemplate.getName();
						levelMessage = Level.ERROR;
						LOGGER.error(globalMessage);
					}
				} else {
					// in headless mode (console), we don't need to wait the task completion.
					// This is to user to poll the service it's done. This is a long long task, here
					// it made in 13 mins for 20 Go to clone.
					globalMessage = "The clone task is launched, vm name: " + vmName + " from template: "
							+ vmTemplate.getName();
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				}

			} catch (RemoteException | InterruptedException ex) {

				globalMessage = "VM was not created or has errors, please check your vcenter and your configuration \n "
						+ "Message: " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				if (ex.getMessage() == null) {
					ex.printStackTrace();
				}
				VCenterClient.disconnect();
				return;
			}
		} else {
			try {
				// No vm template defined, building a new vm from
				// scratch,
				// there
				// is no os system installed on..
				LOGGER.info("Creating the Virtual Machine from scratch : " + vmName);
				int cKey = 1000;

				String diskMode = null;
				// Get the disk mode.
				// mode: persistent|independent_persistent,
				// independent_nonpersistent
				LOGGER.warn("Default diskmode setted to persistent");
				diskMode = "persistent";

				// "occi.compute.ephemeral.diskmode", "persistent");
				// }

				Long diskSizeKB = resourceTpl.getEphemeralDiskSizeKB();
				if (diskSizeKB == 0L) {
					globalMessage = "The main disk size must be > 0 in GigaBytes";
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					VCenterClient.disconnect();
					return;
				}

				VirtualDeviceConfigSpec scsiSpec = VMHelper.createScsiSpec(cKey);

				String storageDatastoreName = datastore.getName();

				VirtualDeviceConfigSpec diskSpec = VMHelper.createDiskSpec(storageDatastoreName, cKey, diskSizeKB,
						diskMode);

				// Network part : VM Network.
				// We use predefined network interface (from host).

				// Get the virtual network interface name.
				String networkName = null;
				// Get The network adapter name.
				String nicName = null;
				if (netInterfaceConn == null || netInterfaceConn.isEmpty()) {
					// Searching an existing network device on host.
					LOGGER.info("No network defined, searching for a network on host : " + host.getName());
					if (host != null) {
						allocator.setDc(datacenter);
						allocator.setCluster(cluster);
						allocator.setHost(host);
					}
					Network network = allocator.allocateNetwork();
					if (network == null) {
						globalMessage = "No virtual networks is available for this virtual machine, please setup a new network in vcenter.";
						levelMessage = Level.ERROR;
						LOGGER.error(globalMessage);
						VCenterClient.disconnect();
						return;
					}

					networkName = network.getName();
					// createNetworksSpec(networkName,
					// netInterfaceConn);

				} else {
					// TODO : We could allocate any networks on any
					// adapter
					// interfaces..
					// Get the network name.
					for (NetworkadapterConnector netInt : netInterfaceConn) {
						networkName = ((VswitchConnector) netInt.getTarget()).getOcciNetworkLabel();
						nicName = netInt.getTitle();
						// createNetworksSpecs(networkName, netInt);
						break;
					}
				}

				// Get the virtual adapter network name.
				if (nicName == null) {
					// Default virtual network name.
					nicName = "Adaptateur réseau 1";
				}

				// TODO : Check VMWare tools, if no vmware tools, the
				// sdk
				// will not give the ipv4, nor ipv6 .
				// + upgrade automaticly VMWare Tools via VIJava.

				// Network configuration.
				// TODO : Manual configuration mode within mixin
				// ipAddress and
				// ipNetworkInterfaceAddress.

				VirtualDeviceConfigSpec nicSpec = NetworkHelper.createNicSpec(networkName, nicName,
						NetworkHelper.MODE_NETWORK_ADDRESS_GENERATED, null);

				// Define the vmSpec configuration object.
				vmSpec = new VirtualMachineConfigSpec();

				vmSpec.setName(vmName);
				if (summary != null && !summary.trim().isEmpty()) {
					vmSpec.setAnnotation(summary);
				} else {
					vmSpec.setAnnotation("Virtual Machine Annotation");
				}

				Long memSizeMB = resourceTpl.getMemoryMB();
				numCores = resourceTpl.getCores();
				if (memSizeMB == 0L || numCores == 0) {
					globalMessage = "You must set the memory size (in GB) and the number of cores, or use a predefined templates from CRTP extension mixin instance class";
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					VCenterClient.disconnect();
					return;
				}

				vmSpec.setMemoryMB(memSizeMB);

				// If attribute occi.compute.vcpu is setted, we
				// calculate the nb
				// cores per socket.
				assignVCpuToVMSpec();

				vmSpec.setGuestId(guestosid);
				vmSpec.setCpuHotAddEnabled(true);
				// vmSpec.setCpuHotRemoveEnabled(true);
				vmSpec.setMemoryHotAddEnabled(true);

				vmSpec.setDeviceChange(new VirtualDeviceConfigSpec[] { scsiSpec, diskSpec, nicSpec });
				// Create vm file info for vmx file.
				VirtualMachineFileInfo vmfi = new VirtualMachineFileInfo();
				vmfi.setVmPathName("[" + datastore.getName() + "]");
				vmSpec.setFiles(vmfi);

				ResourcePool rp = (ResourcePool) new InventoryNavigator(datacenter)
						.searchManagedEntities("ResourcePool")[0];

				if (vmFolder == null) {
					// Back to the main datacenter vm folder.
					vmFolder = datacenter.getVmFolder();
				}

				// Create effectively the vm on folder.
				com.vmware.vim25.mo.Task taskVm = vmFolder.createVM_Task(vmSpec, rp, host);
				// TODO : Monitoring task object in other thread. See :
				// http://benohead.com/vi-java-api-monitoring-task-completion/
				String result = taskVm.waitForTask();
				if (toMonitor) {
					subMonitor.worked(80);
				}
				if (result == com.vmware.vim25.mo.Task.SUCCESS) {
					globalMessage = "Virtual Machine successfully created !";
					levelMessage = Level.INFO;
					vmExist = true;
					// if state is active on create, power on the instance.
					if (getOcciComputeState() != null && getOcciComputeState().equals(ComputeStatus.ACTIVE)) {
						VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
						boolean poweredOn = VMHelper.powerOn(vm);
						morId = vm.getMOR().getVal();
						if (poweredOn) {
							globalMessage += " \n virtual machine is powered on.";
						}
					}
					LOGGER.info(globalMessage);

				} else {
					globalMessage = "VM couldn't be created, result: " + result;
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
				}

				// Create vm terminated

			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Cannot create the virtual machine : " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
				VCenterClient.disconnect();
				return;
			}

		} // endif vmTemplate exist.

		if (getOcciComputeState() != null && getOcciComputeState().equals(ComputeStatus.ACTIVE)) {
			VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
			ipv4Address = NetworkHelper.getIpv4Address(vm);
			ipv6Address = NetworkHelper.getIpv6Address(vm);
		}

		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();

		if (vmTemplate != null) {
			applyUserData(monitor, vmName);
		}

		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Business code for retrieving a compute.
	 * 
	 * @param monitor
	 */
	public void retrieveCompute(IProgressMonitor monitor) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vmExist = false;
			return;
		}
		// Retrieve all informations about this compute.
		String vmName = getTitle();
		if (vmOldName == null) {
			vmOldName = vmName;
		}
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();
		morId = getInstanceId();
		// Search for the vm object.
		VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmName);
		if (vm == null) {
			// Check if the name has changed...
			if (!vmOldName.equals(vmName)) {
				// The title attribute has changed from the last use
				// this may
				// cause to not find the vm on vcenter.
				vm = VMHelper.findVMForName(rootFolder, vmOldName);
				// if found we set the title on the old name.
				if (vm != null) {
					setTitle(vmOldName);
					vmName = vmOldName;
				} else {
					// Find vm by instanceId
					if (morId != null) {
						vm = VMHelper.findVMForMorId(rootFolder, morId);
					}
					if (vm == null) {
						// no vm exist with this name.
						globalMessage = "This virtual machine doesnt exist anymore.";
						levelMessage = Level.WARN;
						LOGGER.warn(globalMessage);
						VCenterClient.disconnect();
						vmExist = false;
						return;
					}
				}
			} else {
				if (morId != null && !morId.trim().isEmpty()) {
					vm = VMHelper.findVMForMorId(rootFolder, morId);
				}
				if (vm == null) {
					// no vm exist with this name.
					globalMessage = "This virtual machine doesnt exist anymore.";
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
					VCenterClient.disconnect();
					vmExist = false;
					return;
				}

			}
		}
		morId = vm.getMOR().getVal();
		if (imagename != null) {
			vmTemplateName = imagename;
		}
		vmName = vm.getName();
		if (toMonitor) {
			subMonitor.worked(30);
		}
		HostSystem host = VMHelper.findHostSystemForVM(rootFolder, vmName);
		if (host == null) {
			globalMessage = "No host found for this vm : " + vmName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			vmExist = false;
			return;
		} else {
			String oldHostSystemName = getHostSystemName();
			setHostSystemName(host.getName());
			if (oldHostSystemName != null && !oldHostSystemName.trim().isEmpty() && !oldHostSystemName.equals(host.getName())) {
				LOGGER.warn("The virtual machine has been moved on another host, from : " + oldHostSystemName
						+ " to host: " + host.getName());
			}
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		Datacenter dc = null;
		ClusterComputeResource cluster = null;
		Datastore ds = null;

		// Search for the cluster and datacenter info. (if any, it is
		// not
		// mandatory to have a cluster, so it is a simple information.
		ManagedEntity mEntity = host.getParent();
		while (mEntity != null) {

			if (mEntity instanceof Datacenter) {
				dc = (Datacenter) mEntity;
			}
			if (mEntity instanceof ClusterComputeResource) {
				cluster = (ClusterComputeResource) mEntity;
			}
			if (mEntity instanceof Datastore) {
				ds = (Datastore) mEntity;
			}
			mEntity = mEntity.getParent();
		}
		if (toMonitor) {
			subMonitor.worked(50);
		}
		if (dc == null) {
			LOGGER.warn("No datacenter found for this virtual machine: " + vm.getName());
		} else {
			if (datacenterName == null) {
				setDatacenterName(dc.getName());
			}
		}
		if (cluster == null) {
			LOGGER.warn("No cluster found for this virtual machine: " + vm.getName());
		} else {
			if (clusterName == null) {
				setClusterName(cluster.getName());
			}
		}
		if (ds == null) {
			// There is another way to find the dsname.
			try {
				Datastore[] dss = vm.getDatastores();
				if (dss != null && dss.length > 0) {
					ds = dss[0];
				}
				if (ds != null) {
					if (datastoreName == null) {
						setDatastoreName(ds.getName());
					}
				}

			} catch (RemoteException ex) {
				globalMessage = "Error while searching all datastores for this virtual machine: " + vm.getName()
						+ " \n ";
				globalMessage += "Message: " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				vmExist = false;
				return;
			}

		} else {
			if (datastoreName == null) {
				setDatastoreName(ds.getName());
			}
		}
		if (toMonitor) {
			subMonitor.worked(60);
		}
		messageProgress = null;
		if (vm.getConfig() == null) {
			// The instance may be in clone mode or other task that impact the vm
			// configurartion.
			LOGGER.warn(
					"VM configuration is not accessible, this may be caused by a task that updating the vm configuration.");
			// Get the progression task in %.
			TaskInfo taskInfo = VMHelper.getTaskInfo(vm);
			if (taskInfo != null) {

				TaskInfoState taskState = taskInfo.getState();
				if (taskState != null && taskState.equals(TaskInfoState.success)) {
					messageProgress = "100%";
				} else if (taskState != null && taskState.equals(TaskInfoState.queued)) {
					messageProgress = "0%";
				} else if (taskState != null && taskState.equals(TaskInfoState.running)) {
					messageProgress = taskInfo.getProgress() + "%";
				} else if (taskState != null && taskState.equals(TaskInfoState.error)) {
					messageProgress = "Error on task " + taskInfo.getName() + " on entity : "
							+ taskInfo.getEntityName();
					messageProgress += " \n message: " + taskInfo.getError().getLocalizedMessage();
				}
				
			} else {
				if (vmTemplateName != null) {
					// Check if a clone task is active.
					taskInfo = VMHelper.getTaskInfo(
							VMHelper.findVMForName(VCenterClient.getServiceInstance().getRootFolder(), vmTemplateName));
					if (taskInfo != null) {
						TaskInfoState taskState = taskInfo.getState();
						if (taskState != null && taskState.equals(TaskInfoState.success)) {
							messageProgress = "100%";
						} else if (taskState != null && taskState.equals(TaskInfoState.queued)) {
							messageProgress = "0%";
						} else if (taskState != null && taskState.equals(TaskInfoState.running)) {
							messageProgress = taskInfo.getProgress() + "%";
						} else if (taskState != null && taskState.equals(TaskInfoState.error)) {
							messageProgress = "Error on task " + taskInfo.getName() + " on entity : "
									+ taskInfo.getEntityName();
							messageProgress += " \n message: " + taskInfo.getError().getLocalizedMessage();
						}
					}
				}
			}

		} else {

			// Load the compute information from vCenter.
			numCores = VMHelper.getNumSockets(vm);
			vcpus = VMHelper.getNumCPU(vm);
			memoryGB = VMHelper.getMemoryGB(vm);
			architecture = VMHelper.getArchitecture(vm);
			speed = VMHelper.getCPUSpeed(vm);
			
			// Define the states of this vm.
			vmState = VMHelper.getPowerState(vm);
			hostname = VMHelper.getGuestHostname(vm);
			vmGuestState = VMHelper.getGuestState(vm);
			guestOsId = vm.getConfig().getGuestId();
			ephemeralDiskSizeGB = VMHelper.getEphemalDiskSize(vm);
			
			// Determine if this vm is marked as template also an image..
			if (vm.getConfig().isTemplate()) {
				markedAsTemplate = "true";
			} else {
				markedAsTemplate = "false";
			}
			inventoryPath = VMHelper.getVMFolderPath(vm);
			
		}
		morId = vm.getMOR().getVal();
		
		Ssh_user_dataConnector sshUserData = getMixinSshUserData();
		if (sshUserData != null) {
			username = sshUserData.getUser();
			password = sshUserData.getPassword();
			userData = sshUserData.getOcciComputeUserdata();
			userDataFile = sshUserData.getOcciComputeUserdataFile();
		}
		
		vmExist = true;
		if (toMonitor) {
			subMonitor.worked(80);
		}
		
		ipv4Address = NetworkHelper.getIpv4Address(vm);
		ipv6Address = NetworkHelper.getIpv6Address(vm);

		globalMessage = "The virtual machine informations has been retrieved and are updated.";
		levelMessage = Level.INFO;

		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
		
		if (UIDialog.isStandAlone()) {
			updateAttributesOnCompute();
		}
		
	}

	/**
	 * Business code for updating a compute.
	 * 
	 * @param monitor
	 */
	public void updateCompute(IProgressMonitor monitor) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		// Load the vm information.
		String vmName = getTitle();
		morId = getInstanceId();
		numCores = getOcciComputeCores();
		vcpus = getVcpu();
		markedAsTemplate = getMarkedastemplate();
		if (toMonitor) {
			subMonitor.worked(20);
		}
		if (vmName == null || vmName.isEmpty()) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (vmOldName == null) {
			vmOldName = vmName;
		}

		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (toMonitor) {
			subMonitor.worked(30);
		}

		// Check the other way with old vm name if set..
		if (vm == null) {

			// The title may has been changed.
			if (!vmOldName.equals(vmName)) {
				// The title have been changed.
				// We load the vm with the old one.
				vm = VMHelper.loadVirtualMachine(vmOldName);
				if (vm != null) {
					LOGGER.info("The virtual machine name has been changed to a new one, updating...");
					try {
						VMHelper.renameVM(vm, vmName);
						vm = VMHelper.loadVirtualMachine(vmName);
						if (toMonitor) {
							subMonitor.worked(40);
						}
						globalMessage = "The virtual machine : " + vmOldName + " has been renamed to : " + vmName;
						levelMessage = Level.INFO;
						LOGGER.info(globalMessage);
					} catch (RemoteException ex) {
						globalMessage = "Error while trying to rename a virtual machine, message: " + ex.getMessage();
						levelMessage = Level.ERROR;
						LOGGER.error(globalMessage);
						ex.printStackTrace();
					}
					vmOldName = vmName;
				}
			}

		}

		// Check first if instanceId is set if no vm found with the name.
		if (morId != null && vm == null) {
			vm = VMHelper.findVMForMorId(VCenterClient.getServiceInstance().getRootFolder(), morId);
		}

		if (vm == null) {
			globalMessage = "Unable to load vm informations : " + vmName + " for morId : " + morId;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}

		// Update config.
		try {

			if (vmSpec == null) {
				vmSpec = new VirtualMachineConfigSpec();
			}
			if (summary != null && !summary.trim().isEmpty()) {
				vmSpec.setAnnotation(summary);
			}

			// First check the compute attribute.
			MixinBase resourceTpl = getMixinInstanceClass();
			ResourceTPLContainer resTpl = null;
			if (resourceTpl != null) {
				resTpl = new ResourceTPLContainer(resourceTpl);
			} else {
				resTpl = new ResourceTPLContainer(getOcciComputeCores(), getOcciComputeMemory(), 0f);
			}
			
			assignVCpuToVMSpec();

			VMHelper.reconfigureVm(vm, vcpu, resTpl.getMem(), summary);
		} catch (RemoteException ex) {
			globalMessage = "Error while updating the virtual machine configuration : " + vmName + " \n message: "
					+ ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			ex.printStackTrace();
		}
		if (toMonitor) {
			subMonitor.worked(50);
		}

		// Reading template attribute for detecting if it may be updated
		// or not.
		if (markedAsTemplate == null && vm.getConfig() != null) {
			if (vm.getConfig().isTemplate()) {
				markedAsTemplate = "true";
			} else {
				markedAsTemplate = "false";
			}
		}
		if (toMonitor) {
			subMonitor.worked(60);
		}
		// Check if transform vm to vmTemplate.
		if (vm.getConfig() != null && !vm.getConfig().isTemplate() && "true".equals(markedAsTemplate)) {
			// Mark the vm as a template.
			try {
				if (VMHelper.markAsTemplate(vm)) {
					globalMessage += "The virtual machine " + vmName + " has been marked as template.";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				} else {
					globalMessage += "The virtual machine " + vmName + " is already marked as a template.";
					levelMessage = Level.WARN;
					LOGGER.info(globalMessage);
				}
			} catch (RemoteException ex) {
				globalMessage = "Error while marking the virtual machine as a template: " + vm.getName();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}
		if (toMonitor) {
			subMonitor.worked(70);
		}
		// Check if transform template to VM.
		if (vm.getConfig() != null && vm.getConfig().isTemplate() && "false".equals(markedAsTemplate)) {

			ServiceInstance si = VCenterClient.getServiceInstance();
			Folder rootFolder = si.getRootFolder();
			VmwarefoldersConnector vmfoldersMixin = getMixinVmwarefolders();
			Datacenter datacenter;
			ClusterComputeResource cluster;
			HostSystem host;
			ResourcePool pool;
			AllocatorImpl allocator = new AllocatorImpl(rootFolder);
			if (vmfoldersMixin != null) {
				// Load datacenter etc. from attributes.
				String hostSystemName = vmfoldersMixin.getHostsystemname();
				host = HostHelper.findHostSystemForName(rootFolder, hostSystemName);
				if (host == null) {
					LOGGER.warn("Host system doesnt exist anymore on your Vcenter : " + hostSystemName);
					datacenter = allocator.allocateDatacenter();
					cluster = allocator.allocateCluster();
					host = allocator.allocateHostSystem();
					LOGGER.warn("Allocating the virtual machine " + vm.getName() + " to this host: " + host.getName());
				}
			} else {
				datacenter = allocator.allocateDatacenter();
				cluster = allocator.allocateCluster();
				host = allocator.allocateHostSystem();
			}

			pool = allocator.allocateResourcePool();
			try {
				if (VMHelper.markAsVirtualMachine(vm, host, pool)) {
					globalMessage += "The template machine " + vmName + " has been marked as a virtual machine.";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				} else {
					globalMessage += "The template machine " + vmName + " is not a template but a virtual machine.";
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
				}

			} catch (RemoteException ex) {
				globalMessage = "Error while marking the machine template as a virtual machine : " + vm.getName();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}

		ipv4Address = NetworkHelper.getIpv4Address(vm);
		ipv6Address = NetworkHelper.getIpv6Address(vm);

		applyUserData(monitor, vmName);

		if (toMonitor) {
			subMonitor.worked(100);
		}
		// In the end we disconnect.
		VCenterClient.disconnect();

	}

	/**
	 * Business code to delete a compute.
	 * 
	 * @param monitor
	 */
	public void deleteCompute(IProgressMonitor monitor) {
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
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		String vmName = getTitle();
		if (vmName == null && (instanceId == null || instanceId.trim().isEmpty())) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);

		if (vm == null) {
			// Try with instance provider id.
			vm = VMHelper.findVMForMorId(VCenterClient.getServiceInstance().getRootFolder(), instanceId);
		}

		if (toMonitor) {
			subMonitor.worked(40);
		}

		if (vm == null) {
			globalMessage = "The virtual machine : " + vmName
					+ " doesnt exist or has been deleted by a previous operation.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}

		// Check if vm state is inactive, if vm is started, powered it off.
		vmState = VMHelper.getPowerState(vm);
		if (vmState.equals(VMHelper.POWER_ON)) {
			try {
				boolean result = VMHelper.powerOff(vm);
				if (!result) {
					throw new RemoteException("");
				}
			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Cant power off a virtual machine : " + vm.getName() + " \n ";
				globalMessage += "Cant delete a virtual machine, it must be stopped before.";

				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		VMHelper.destroyVM(vm);
		if (toMonitor) {
			subMonitor.worked(100);
		}
		// In the end we disconnect.
		VCenterClient.disconnect();
		globalMessage = "The virtual machine " + vmName + " has been fully removed from vcenter.";
		levelMessage = Level.INFO;
		LOGGER.info(globalMessage);
	}

	/**
	 * Business code for starting a compute.
	 * 
	 * @param monitor
	 */
	public void startCompute(IProgressMonitor monitor) {
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

		if (toCreateOnStartOperation) {
			LOGGER.info("Creating the virtual machine and start after.");
			this.createCompute(monitor);
			if (toMonitor) {
				subMonitor.worked(10);
			}
		}

		LOGGER.debug("Action start() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(30);
		}

		String vmName = getTitle();

		if (vmName == null && (instanceId == null || instanceId.trim().isEmpty())) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);

		if (vm == null) {
			// Try with instance provider id.
			vm = VMHelper.findVMForMorId(VCenterClient.getServiceInstance().getRootFolder(), instanceId);
		}

		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		vmState = VMHelper.getPowerState(vm);
		if (toMonitor) {
			subMonitor.worked(40);
		}
		if (vmState.equals(VMHelper.POWER_ON)) {
			globalMessage = "The virtual machine " + vmName + " is already started.";
			levelMessage = Level.INFO;
			LOGGER.info(globalMessage);

		} else {
			// in the other case we start the compute.
			try {
				if (VMHelper.powerOn(vm)) {
					globalMessage = "VM " + vmName + " switched On";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				} else {
					globalMessage = "VM " + vmName + " cannot be switched on";
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
				}

			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Error while starting a virtual machine : " + vmName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}
		if (toMonitor) {
			subMonitor.worked(80);
		}

		// Is vmware tools is installed ? if not mount the vmware guest
		// tools disk for installation.
		if (!VMHelper.isToolsInstalled(vm)) {
			if (vm != null) {
				try {
					VMHelper.mountGuestVmTools((Folder) vm.getParent(), getTitle());
				} catch (MountVMWareToolsDiskException ex) {
					globalMessage = ex.getMessage() + " on virtual machine : " + vmName;
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
				}
			}

		}
		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Business code for stopping a compute.
	 * 
	 * @param monitor
	 * @param method
	 */
	public void stopCompute(IProgressMonitor monitor, StopMethod method) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		String vmName = getTitle();
		if (vmName == null && (instanceId == null || instanceId.trim().isEmpty())) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);

		if (vm == null) {
			// Try with instance provider id.
			vm = VMHelper.findVMForMorId(VCenterClient.getServiceInstance().getRootFolder(), instanceId);
		}
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		vmState = VMHelper.getPowerState(vm);
		if (vmState.equals(VMHelper.POWER_OFF)) {
			globalMessage = "This virtual machine " + vmName + " is already stopped.";
			levelMessage = Level.WARN;
			LOGGER.info(globalMessage);
			if (toMonitor) {
				subMonitor.worked(70);
			}
		} else {
			// in the other case we start the compute.
			// if (graceful) shutdown guest os and poweroff.
			// if acpioff ??
			// if poweroff direct poweroff.
			try {
				boolean result = false;
				switch (method) {
				case GRACEFUL:
					result = VMHelper.graceFulPowerOff(vm);
					break;
				case POWEROFF:
					result = VMHelper.powerOff(vm);
					break;
				case ACPIOFF:
					result = VMHelper.powerOff(vm);
					break;
				}
				if (toMonitor) {
					subMonitor.worked(70);
				}
				if (result) {
					globalMessage = "VM " + vmName + " switched Off";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);

				} else {
					globalMessage = "VM " + vmName + " cannot be switched off";
					levelMessage = Level.INFO;
					LOGGER.warn(globalMessage);
				}

			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Error while stopping a virtual machine : " + vmName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}

		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Business code for restarting a compute.
	 * 
	 * @param monitor
	 * @param method
	 */
	public void restartCompute(IProgressMonitor monitor, final RestartMethod method) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		String vmName = getTitle();

		if (vmName == null && (instanceId == null || instanceId.trim().isEmpty())) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);

		if (vm == null) {
			// Try with instance provider id.
			vm = VMHelper.findVMForMorId(VCenterClient.getServiceInstance().getRootFolder(), instanceId);
		}

		if (toMonitor) {
			subMonitor.worked(30);
		}
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		String vmPowerState = VMHelper.getPowerState(vm);
		boolean result = false;
		try {
			if (vmPowerState.equals(VMHelper.POWER_OFF)) {
				// Direct starting the vm.
				result = VMHelper.powerOn(vm);

			} else {
				// in the other case we restart the compute.
				// if (graceful) shutdown guest os and poweron.
				// if cold hard reboot.
				// if warm soft reboot.
				switch (method) {
				case GRACEFUL:
					if (vmPowerState.equals(VMHelper.SUSPENDED)) {
						if (toMonitor) {
							subMonitor.worked(50);
						}
						VMHelper.powerOn(vm);
					}
					if (toMonitor) {
						subMonitor.worked(60);
					}
					VMHelper.graceFulPowerOff(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					result = VMHelper.powerOn(vm);
					break;
				case COLD:
					if (vmPowerState.equals(VMHelper.SUSPENDED)) {
						if (toMonitor) {
							subMonitor.worked(50);
						}
						VMHelper.powerOn(vm);
					}
					if (toMonitor) {
						subMonitor.worked(60);
					}
					VMHelper.powerOff(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					result = VMHelper.powerOn(vm);
					break;
				case WARM:
					if (vmPowerState.equals(VMHelper.SUSPENDED)) {
						if (toMonitor) {
							subMonitor.worked(50);
						}
						VMHelper.powerOn(vm);
					}
					if (toMonitor) {
						subMonitor.worked(60);
					}
					result = VMHelper.rebootGuest(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					break;
				}
			}

		} catch (RemoteException | InterruptedException ex) {
			globalMessage = "Error while rebooting the virtual machine " + vm.getName();
			levelMessage = Level.ERROR;
			LOGGER.warn(globalMessage);
			ex.printStackTrace();
		}
		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
		if (result) {
			globalMessage = "Restart virtual machine has succeed.";
			levelMessage = Level.INFO;
			LOGGER.info(globalMessage);
		} else {
			globalMessage = "Restart virtual machine has failed.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
		}
	}

	/**
	 * Business code for suspend a compute.
	 * 
	 * @param monitor
	 * @param method
	 */
	public void suspendCompute(IProgressMonitor monitor, final SuspendMethod method) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		String vmName = getTitle();

		if (vmName == null && (instanceId == null || instanceId.trim().isEmpty())) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);

		if (vm == null) {
			// Try with instance provider id.
			vm = VMHelper.findVMForMorId(VCenterClient.getServiceInstance().getRootFolder(), instanceId);
		}
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(30);
		}
		String vmPowerState = VMHelper.getPowerState(vm);
		try {
			boolean result = false;
			if (vmPowerState.equals(VMHelper.SUSPENDED)) {
				// already suspended.
				LOGGER.info("The virtual machine " + vmName + " is already suspended.");

			} else {
				// in the other case we restart the compute.
				// if hibernate .
				// if acpioff ??
				// if poweroff direct poweroff.
				switch (method) {
				case HIBERNATE:
					if (toMonitor) {
						subMonitor.worked(50);
					}
					result = VMHelper.hibernateVM(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					break;
				case SUSPEND:
					if (toMonitor) {
						subMonitor.worked(50);
					}
					result = VMHelper.suspendVM(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					break;
				}
			}

			if (result) {
				globalMessage = "Suspend virtual machine has succeed.";
				levelMessage = Level.INFO;
				LOGGER.info(globalMessage);
			} else {
				globalMessage = "Suspend virtual machine has failed.";
				levelMessage = Level.WARN;
				LOGGER.warn(globalMessage);
			}
		} catch (RemoteException | InterruptedException ex) {
			globalMessage = "Error while suspending a virtual machine : " + vmName;
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			ex.printStackTrace();
		}

		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Save a compute.
	 * 
	 * @param monitor
	 * @param method
	 * @param name
	 */
	public void saveCompute(IProgressMonitor monitor, final SaveMethod method, final String name) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		String vmName = getTitle();

		if (vmName == null && (instanceId == null || instanceId.trim().isEmpty())) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);

		if (vm == null) {
			// Try with instance provider id.
			vm = VMHelper.findVMForMorId(VCenterClient.getServiceInstance().getRootFolder(), instanceId);
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		try {
			if (VMHelper.markAsTemplate(vm)) {
				globalMessage = "The virtual machine " + vmName + " has been marked as template.";
				levelMessage = Level.INFO;
				LOGGER.info(globalMessage);
			} else {
				globalMessage = "The virtual machine " + vmName + " is already marked as a template.";
				levelMessage = Level.WARN;
				LOGGER.info(globalMessage);
			}

			setMarkedastemplate("true");

		} catch (RemoteException ex) {
			globalMessage = "Error while marking the virtual machine as a template: " + vm.getName();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			ex.printStackTrace();
		}
		if (toMonitor) {
			subMonitor.worked(80);
		}
		vm = VMHelper.loadVirtualMachine(vmName);
		// In the end we disconnect.
		VCenterClient.disconnect();

		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Apply user data on the instance.
	 * 
	 * @param monitor
	 * @param vmName
	 */
	private void applyUserData(IProgressMonitor monitor, String vmName) {
		Ssh_user_dataConnector userDataSshMixin = getMixinSshUserData();
		if (morId == null) {
			morId = getInstanceId();
		}
		if (userDataSshMixin != null) {
			userDataSshMixin.applyUserData(morId, vmName, monitor);
		}
	}

	public String getIpv4Address() {
		return ipv4Address;
	}

	public String getIpv6Address() {
		return ipv6Address;
	}

	public void setIpv4Address(String ipv4Address) {
		this.ipv4Address = ipv4Address;
	}

	public void setIpv6Address(String ipv6Address) {
		this.ipv6Address = ipv6Address;
	}

}
