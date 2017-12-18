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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.infrastructure.StorageStatus;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.AttachDiskException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.CreateDiskException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.DatacenterNotFoundException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.DatastoreNotFoundException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.DeleteDiskException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.DetachDiskException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.DiskNotFoundException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.LoadVolumeException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.RenameDiskException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.ResizeDiskException;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.allocator.AllocatorImpl;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.UIDialog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.DatacenterHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.DatastoreHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VCenterClient;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VMHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VolumeHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/vmware# - term: storagevmware -
 * title:
 */
public class StoragevmwareConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.StoragevmwareImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StoragevmwareConnector.class);

	/**
	 * Datastore name, referenced on creation or on retrieve method.
	 */
	private String datastoreName = null;
	private String datacenterName = null;
	private Datastore datastore = null;
	private Datacenter datacenter = null;
	private String vmName = null;
	private String volumeName = null;

	private String oldDiskName = null;
	private Float oldDiskSize = null;

	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	/**
	 * Main vmware client to manage this instance on provider.
	 */
	private VCenterClient vCenterClient = new VCenterClient(null, null, null);
	
	// Start of user code Storagevmwareconnector_constructor
	/**
	 * Constructs a storagevmware connector.
	 */
	StoragevmwareConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code

	//
	// OCCI CRUD callback operations.
	//

	// Start of user code StoragevmwareocciCreate
	/**
	 * Called when this Storagevmware instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		titleMessage = "Create a virtual disk : " + getTitle();
		if (UIDialog.isStandAlone()) {
			createStorage(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					createStorage(monitor);
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

	// Start of user code Storagevmware_occiRetrieve_method
	/**
	 * Called when this Storagevmware instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		titleMessage = "Retrieve a virtual disk : " + getTitle();
		LOGGER.debug("occiRetrieve() called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			retrieveStorage(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveStorage(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}

			updateAttributesOnStorage();

		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	// Start of user code Storagevmware_occiUpdate_method
	/**
	 * Called when this Storagevmware instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		titleMessage = "Update a virtual disk : " + getTitle();
		LOGGER.debug("occiUpdate() called on " + this);

		if (UIDialog.isStandAlone()) {
			updateStorage(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					updateStorage(monitor);
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

	// Start of user code StoragevmwareocciDelete_method
	/**
	 * Called when this Storagevmware instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		titleMessage = "Delete a virtual disk : " + getTitle();
		LOGGER.debug("occiDelete() called on " + this);

		if (UIDialog.isStandAlone()) {
			deleteStorage(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					deleteStorage(monitor);
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
	// Storagevmware actions.
	//

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.cmf.occi.infrastructure.impl.StorageImpl#online()
	 */
	@Override
	public void online() {
		titleMessage = "Virtual disk : " + getTitle() + " , action: online";
		LOGGER.debug("Action online() called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			attachStorage(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					attachStorage(monitor);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.cmf.occi.infrastructure.impl.StorageImpl#offline()
	 */
	@Override
	public void offline() {
		titleMessage = "Virtual disk : " + getTitle() + " , action: offline";
		LOGGER.debug("Action offline() called on " + this);
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			detachStorage(null);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					detachStorage(monitor);
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

	// Getters and setters and private methods.

	/**
	 * Usage with Mixin in future.
	 * 
	 * @return
	 */
	public String getDatacenterName() {
		if (datacenterName == null) {
			VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
			if (vmfolders != null) {
				datacenterName = vmfolders.getDatacentername();
			}
		}
		return datacenterName;
	}

	/**
	 * Usage with Mixin in future.
	 * 
	 * @return
	 */
	public void setDatacenterName(String datacenterName) {
		this.datacenterName = datacenterName;
		VmwarefoldersConnector vmFolders = getMixinVmwarefolders();
		if (vmFolders != null) {
			vmFolders.setDatacentername(datacenterName);
		}
	}

	/**
	 * Usage with mixin in future.
	 * 
	 * @return
	 */
	public String getDatastoreName() {
		if (datastoreName == null) {
			// Get the attribute from mixin vmwarefolders.
			VmwarefoldersConnector vmfolders = getMixinVmwarefolders();
			if (vmfolders != null) {
				datastoreName = vmfolders.getDatastorename();
			}
		}
		return datastoreName;
	}

	/**
	 * Set the datastoreName on entity scope and mixin model scope.
	 * 
	 * @return
	 */
	public void setDatastoreName(String datastoreName) {
		this.datastoreName = datastoreName;
		VmwarefoldersConnector vmFolders = getMixinVmwarefolders();
		if (vmFolders != null) {
			vmFolders.setDatastorename(datastoreName);
		}
	}

	/**
	 * Return a list of linked instance (computes) connector.
	 * 
	 * @return a list of ComputeConnector or empty if no linked instance.
	 */
	private List<InstancevmwareConnector> getLinkedComputes() {

		List<InstancevmwareConnector> computes = new ArrayList<InstancevmwareConnector>();

		// As the links are not bidirectional, we search on configuration object
		// the entities connected to this storage.

		Configuration config = OcciHelper.getConfiguration(this);
		List<Resource> resources = config.getResources();
		List<Link> resLinks;
		for (Resource resource : resources) {
			if (resource instanceof InstancevmwareConnector) {
				resLinks = resource.getLinks();
				for (Link link : resLinks) {
					Resource target = link.getTarget();
					if (target != null && target instanceof StoragevmwareConnector) {
						StoragevmwareConnector storage = (StoragevmwareConnector) target;
						if (storage.equals(this)) {
							// Linked to this object.
							InstancevmwareConnector compute = (InstancevmwareConnector) resource;
							computes.add(compute);
						}
					}
				}
			}
		}
		return computes;
	}

	/**
	 * Load from referenced objects, the datacenter information and datastore.
	 */
	private void loadDatastoreAndDatacenter() throws DatastoreNotFoundException, DatacenterNotFoundException {

		Folder rootFolder = vCenterClient.getServiceInstance().getRootFolder();

		// Search for linked computes.

		List<InstancevmwareConnector> computes = getLinkedComputes();
		VmwarefoldersConnector vmFolders = getMixinVmwarefolders();
		if (vmFolders != null) {
			String datacenterTmp = vmFolders.getDatacentername();
			String datastoreTmp = vmFolders.getDatastorename();
			// get and set datastorename and datacentername.
			if (datacenterTmp != null && !datacenterTmp.trim().isEmpty()) {
				datacenterName = datacenterTmp;
			}
			if (datastoreTmp != null && !datastoreTmp.trim().isEmpty()) {
				datastoreName = datastoreTmp;
			}
		}

		// Load the datastore.
		if (datastoreName != null) {
			datastore = DatastoreHelper.findDatastoreForName(rootFolder, datastoreName);
			if (datastore == null) {
				throw new DatastoreNotFoundException(
						"Cant locate a datastore, cause: datastore is referenced but not found on vcenter, name of the datastore: "
								+ datastoreName);
			}
		} else {
			// search on computes the virtual disk that represent this storage,
			// and get the corresponding datastore.
			for (InstancevmwareConnector compute : computes) {
				// Load the vm.
				String vmNameTmp = compute.getTitle();
				VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmNameTmp);
				Map<String, VirtualDisk> vdisks = VolumeHelper.getVirtualDiskForVM(vm);
				VirtualDisk vdiskOut = null;
				if (vdisks != null && !vdisks.isEmpty()) {
					// search the virtualdisk corresponding ref.
					for (Map.Entry<String, VirtualDisk> entry : vdisks.entrySet()) {
						String diskName = entry.getKey();
						String tmp = diskName.replace(".vmdk", "");
						String tampon[] = tmp.split("]");
						datastoreName = tampon[0].substring(1);

						tampon = tampon[1].split("/");
						diskName = tampon[tampon.length - 1];
						if (diskName.equals(this.getTitle())) {
							vdiskOut = entry.getValue();
							break;
						}
					}

				}
				if (datastoreName != null) {
					// add the attribute to persist value in addition.
					this.setDatastoreName(datastoreName);
				}
				if (vmName == null) {
					vmName = compute.getTitle();
				}
			}

		}
		if (datacenterName != null) {
			datacenter = DatacenterHelper.findDatacenterForName(rootFolder, datacenterName);
		}
		if (datacenter == null) {
			// Another solution is to get datacenter object from datastore.
			datacenter = DatacenterHelper.findDatacenterFromDatastore(rootFolder, datastoreName);
		}

		if (datacenter == null && datastoreName != null) {

			throw new DatacenterNotFoundException(
					"Cannot retrieve datacenter, cause: datacenter not found for the datastore: "
							+ datastore.getName());

		} else if (datacenter == null && datastoreName == null) {

			throw new DatacenterNotFoundException(
					"Cannot retrieve datacenter, cause: no datastore defined for this virtual disk : "
							+ this.getTitle());

		} else {

			this.setDatacenterName(datacenter.getName());

		}
		if (vmName == null) {
			for (InstancevmwareConnector compute : computes) {
				vmName = compute.getTitle();
				break;
			}
		}

	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public void updateAttributesOnStorage() {

		if (volumeName != null && !volumeName.equals(getTitle())) {
			setTitle(volumeName);
		}

		if (getOcciStorageSize() == null || getOcciStorageSize() <= 0.0f) {
			setOcciStorageState(StorageStatus.ERROR);
			setOcciStorageStateMessage("Volume size is required");
		} else {
			try {
				if (VolumeHelper.isAttached(volumeName)) {
					setOcciStorageState(StorageStatus.ONLINE);
				} else {
					setOcciStorageState(StorageStatus.OFFLINE);
				}
			} catch (DiskNotFoundException ex) {
				setOcciStorageState(StorageStatus.ERROR);
				setOcciStorageStateMessage(ex.getMessage());
			}
		}
	}

	/**
	 * Business code for creating a storage.
	 * 
	 * @param monitor
	 */
	public void createStorage(IProgressMonitor monitor) {
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
		ServiceInstance si = vCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();

		AllocatorImpl allocator = new AllocatorImpl(rootFolder);

		List<InstancevmwareConnector> computes = getLinkedComputes();

		if (computes.isEmpty()) {
			LOGGER.warn("the volume is not linked to a compute.");
		} else {
			// Search for a datastore name on attribute.
			setDatastoreName(getDatastoreName());
		}
		if (monitor != null) {
			subMonitor.worked(20);
		}
		Float size = getOcciStorageSize();
		volumeName = getTitle();

		oldDiskSize = size;
		oldDiskName = volumeName;

		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			// Allocate the datacenter and datastore when necessary.
			if (datastore == null) {
				datastore = allocator.allocateDatastore();
				if (datastore != null) {
					LOGGER.info("Assigning datastore: " + datastore.getName());
					setDatastoreName(datastore.getName());
				}
			}
			if (datastore != null && datacenter == null && vmName == null) {
				datacenter = DatacenterHelper.findDatacenterFromDatastore(rootFolder, datastore.getName());
				setDatacenterName(datacenter.getName());
				setDatastoreName(datastore.getName());
			}
			if (datastore == null) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
		}

		if (monitor != null) {
			subMonitor.worked(40);
		}
		// Load the volume information. If the volume doesn't exist, the
		// volume object will have default value.

		try {
			VolumeHelper.loadVolumeInformation(datastoreName, volumeName, datacenterName, vmName, vCenterClient);
			if (monitor != null) {
				subMonitor.worked(60);
			}
		} catch (LoadVolumeException ex) {
		}
		// Check if the volume already exist in the vcenter.
		if (VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName, vCenterClient)) {
			// The volume already exist.
			globalMessage = "Virtual disk : " + volumeName + " already exist in datacenter.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		if (monitor != null) {
			subMonitor.worked(70);
		}
		// set the attributes on volume object.
		if (getOcciStorageSize() == 0.0f) {
			globalMessage = "The disk size is not setted, please set this attributes in GB float value.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vCenterClient.disconnect();
			return;
		}
		VolumeHelper.setSize(volumeName, getOcciStorageSize());
		// Create a new disk with or with or without vm information.
		try {
			if (monitor != null) {
				subMonitor.worked(80);
			}
			VolumeHelper.createVolume(datacenterName, datastoreName, volumeName, getOcciStorageSize(), vCenterClient);
			if (monitor != null) {
				subMonitor.worked(100);
			}
			if (vmName == null) {
				globalMessage = "The virtual disk : " + volumeName + " is created ";
			} else {
				globalMessage = "The virtual disk : " + volumeName + " is created and attached to virtual machine : "
						+ vmName;
			}
			levelMessage = Level.INFO;
			LOGGER.info(globalMessage);

		} catch (LoadVolumeException | CreateDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}

		// In all case invoke a disconnect from vcenter.
		vCenterClient.disconnect();
	}

	/**
	 * Business code for retrieving storage informations.
	 * 
	 * @param monitor
	 */
	public void retrieveStorage(IProgressMonitor monitor) {
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
		volumeName = getTitle();
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (oldDiskSize == null) {
			oldDiskSize = getOcciStorageSize();
		}
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(20);
		}

		// Check if disk name has changed.
		if (!oldDiskName.equals(volumeName)) {
			// Volume name has changed.
			if (VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName, vCenterClient)) {
				// All ok.
				oldDiskName = volumeName;
				LOGGER.info("The disk " + oldDiskName + " name has changed to : " + volumeName);

			} else if (VolumeHelper.isExistVolumeForName(datastoreName, oldDiskName, datacenterName, vmName, vCenterClient)) {
				volumeName = oldDiskName;
			}
		} else {
			// Load the volume object.
			try {
				VolumeHelper.loadVolumeInformation(datastoreName, volumeName, datacenterName, vmName, vCenterClient);
			} catch (LoadVolumeException ex) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(40);
		}
		// Update disk information on screen.
		try {
			if (!VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName, vCenterClient)) {
				globalMessage = "Cant find the disk on vcenter, there's no disk with the name : " + volumeName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
			setOcciStorageSize(VolumeHelper.getSize(volumeName));

		} catch (DiskNotFoundException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		if (UIDialog.isStandAlone()) {
			updateAttributesOnStorage();
		}

		// In all case invoke a disconnect from vcenter.
		vCenterClient.disconnect();
	}

	/**
	 * Update a storage.
	 * 
	 * @param monitor
	 */
	public void updateStorage(IProgressMonitor monitor) {
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
		volumeName = getTitle();

		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
		}

		if (monitor != null) {
			subMonitor.worked(40);
		}
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (oldDiskSize == null) {
			oldDiskSize = getOcciStorageSize();
		}

		// Resizing.
		if (oldDiskSize != getOcciStorageSize()) {
			VolumeHelper.setSize(volumeName, getOcciStorageSize());
			try {
				VolumeHelper.resizeDisk(volumeName, getOcciStorageSize());
				globalMessage = "Resize disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
			} catch (DiskNotFoundException | ResizeDiskException ex) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
			}
		}
		if (monitor != null) {
			subMonitor.worked(60);
		}
		// Renaming. (include vmdk file rename).
		if (!oldDiskName.equals(volumeName)) {
			// Try to rename the disk (and the vmdk file).
			try {
				VolumeHelper.renameDisk(oldDiskName, volumeName);
				oldDiskName = volumeName;
				globalMessage += " \n rename disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
			} catch (DiskNotFoundException | RenameDiskException ex) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
			}
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		// In all case invoke a disconnect from vcenter.
		vCenterClient.disconnect();
	}

	/**
	 * Delete a storage.
	 * 
	 * @param monitor
	 */
	public void deleteStorage(IProgressMonitor monitor) {
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
		volumeName = getTitle();
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (monitor != null) {
			subMonitor.worked(20);
		}
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(60);
		}
		try {
			VolumeHelper.destroyDisk(volumeName, datacenterName, datastoreName, vmName, vCenterClient);
			globalMessage = "Delete disk operation success";
			levelMessage = Level.INFO;
			LOGGER.error(globalMessage);
		} catch (DetachDiskException | LoadVolumeException | DeleteDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		// In all case invoke a disconnect from vcenter.
		vCenterClient.disconnect();
	}

	/**
	 * Business code for attach a disk to a virtual machine. (online)
	 * 
	 * @param monitor
	 */
	public void attachStorage(IProgressMonitor monitor) {
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
		volumeName = getTitle();
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(40);
		}
		try {
			// Storage State Machine.
			switch (getOcciStorageState().getValue()) {

			case StorageStatus.ONLINE_VALUE:
				LOGGER.debug("Fire transition(state=online, action=\"online\")...");

				VolumeHelper.detachDisk(volumeName);
				if (monitor != null) {
					subMonitor.worked(60);
				}
				VolumeHelper.attachDisk(volumeName, vmName);
				globalMessage = "attach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;

			case StorageStatus.OFFLINE_VALUE:
				LOGGER.debug("Fire transition(state=offline, action=\"online\")...");
				VolumeHelper.attachDisk(volumeName, vmName);
				globalMessage = "attach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;

			case StorageStatus.ERROR_VALUE:
				LOGGER.debug("Fire transition(state=error, action=\"online\")...");
				VolumeHelper.detachDisk(volumeName);
				if (monitor != null) {
					subMonitor.worked(60);
				}
				VolumeHelper.attachDisk(volumeName, vmName);
				globalMessage = "attach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;

			default:
				globalMessage = "Unknown disk state";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				break;
			}
			if (monitor != null) {
				subMonitor.worked(100);
			}
		} catch (AttachDiskException | DetachDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		// In all case invoke a disconnect from vcenter.
		vCenterClient.disconnect();
	}

	/**
	 * Detach a storage from a virtual machine.
	 * 
	 * @param monitor
	 */
	public void detachStorage(IProgressMonitor monitor) {
		volumeName = getTitle();
		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
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
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				vCenterClient.disconnect();
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(40);
		}
		try {
			switch (getOcciStorageState().getValue()) {

			case StorageStatus.ONLINE_VALUE:
				LOGGER.debug("Fire transition(state=online, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				globalMessage = "detach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;
			case StorageStatus.OFFLINE_VALUE:
				LOGGER.debug("Fire transition(state=offline, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				globalMessage = "detach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;
			case StorageStatus.ERROR_VALUE:
				LOGGER.debug("Fire transition(state=error, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				globalMessage = "detach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;

			default:
				globalMessage = "Unknown disk state";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				break;
			}

		} catch (DetachDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		// In all case invoke a disconnect from vcenter.
		vCenterClient.disconnect();
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
