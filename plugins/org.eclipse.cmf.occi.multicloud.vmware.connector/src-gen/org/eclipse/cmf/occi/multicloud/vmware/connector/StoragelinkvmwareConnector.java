/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 * Generated at Wed Jul 19 15:09:17 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.vmware/model/vmware.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.vmware.connector;

import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.StorageLinkStatus;
import org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread.UIDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.GuestDiskInfo;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.VirtualMachine;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.DatastoreHelper;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VCenterClient;
import org.ecplise.cmf.occi.multicloud.vmware.connector.driver.VMHelper;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/vmware# - term: storagelinkvmware -
 * title:
 */
public class StoragelinkvmwareConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.StoragelinkvmwareImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StoragelinkvmwareConnector.class);

	private String vmName;
	private StorageLinkStatus tmpStatus = this.getOcciStoragelinkState();
	private String mountPath = super.getOcciStoragelinkMountpoint();

	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	/**
	 * Main vmware client to manage this instance on provider.
	 */
	private VCenterClient vCenterClient = new VCenterClient(null, null, null);
	
	// Start of user code Storagelinkvmwareconnector_constructor
	/**
	 * Constructs a storagelinkvmware connector.
	 */
	StoragelinkvmwareConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	// End of user code

	//
	// OCCI CRUD callback operations.
	//

	// Start of user code StoragelinkvmwareocciCreate
	/**
	 * Called when this Storagelinkvmware instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
	}
	// End of user code

	// Start of user code Storagelinkvmware_occiRetrieve_method
	/**
	 * Called when this Storagelinkvmware instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		titleMessage = "Retrieve a system volume : " + getTitle();
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			retrieveStorageSystem(null);
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveStorageSystem(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}

			updateAttributesOnSystemStorage();

		}

		globalMessage = "";
		levelMessage = null;
	}
	// End of user code

	// Start of user code Storagelinkvmware_occiUpdate_method
	/**
	 * Called when this Storagelinkvmware instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
	}
	// End of user code

	// Start of user code StoragelinkvmwareocciDelete_method
	/**
	 * Called when this Storagelinkvmware instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
	}
	// End of user code

	//
	// Storagelinkvmware actions.
	//

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	/**
	 * Retrieve the mount path of a disk.
	 */
	private void retrieveStorageDiskPath() {
		VirtualMachine vm = null;
		if (!vCenterClient.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (vmName != null) {
			// Load the vm information.
			vm = VMHelper.loadVirtualMachine(vmName, vCenterClient.getServiceInstance().getRootFolder());
			if (vm != null && VMHelper.isToolsInstalled(vm) && VMHelper.isToolsRunning(vm)) {
				GuestDiskInfo[] guestDskInfos = vm.getGuest().getDisk();
				for (GuestDiskInfo guestDisk : guestDskInfos) {
					mountPath = guestDisk.getDiskPath();
					break;
				}
				// TODO : Search a better solution, no id defined to link between the system
				// disk AND the virtualDisks.
			}
		}
	}

	/**
	 * Update the attributes...
	 */
	public void updateAttributesOnSystemStorage() {
		if (tmpStatus != null) {
			setOcciStoragelinkState(tmpStatus);
		}
		if (mountPath != null) {
			setOcciStoragelinkMountpoint(mountPath);
		}

	}

	/**
	 * business code for retrieving a system volume.
	 * 
	 * @param monitor
	 */
	public void retrieveStorageSystem(IProgressMonitor monitor) {
		globalMessage = "";
		levelMessage = null;

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

		Folder rootFolder = vCenterClient.getServiceInstance().getRootFolder();
		// Find a datastore.
		Resource target = getTarget();
		if (target == null) {
			globalMessage = "No target storage link for this storage link";
			levelMessage = Level.ERROR;
			LOGGER.error("No target storage link for this storage link.");
			tmpStatus = StorageLinkStatus.ERROR;
			return;
		}
		String datastoreName = null;
		if (target instanceof StoragevmwareConnector) {
			StoragevmwareConnector conn = (StoragevmwareConnector) target;
			datastoreName = conn.getDatastoreName();
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}

		if (datastoreName == null) {
			globalMessage = "The datastore name is not setted, please apply mixin vmwarefolders on Storage entity, it is mandated for researching correct datastore. \n Cant retrieve datastore.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			tmpStatus = StorageLinkStatus.ERROR;
			return;
		}
		Datastore datastore = DatastoreHelper.findDatastoreForName(rootFolder, datastoreName);

		if (datastore == null) {
			globalMessage = "The datastore " + datastoreName + " doesnt exist. Check your configuration.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			tmpStatus = StorageLinkStatus.ERROR;
			return;
		}

		// Load the vm and get his represented ComputeConnector if any.
		// Research vm information if vm exist, get the compute source.
		Resource computeRes = getSource();

		if (computeRes != null && computeRes instanceof InstancevmwareConnector) {
			InstancevmwareConnector computeConn = (InstancevmwareConnector) getSource();
			vmName = computeConn.getTitle();
			// TODO : Check if the disk is effectively mounted.
			// Set state.
			if (computeConn.getOcciComputeState().equals(ComputeStatus.ACTIVE)) {
				tmpStatus = StorageLinkStatus.ACTIVE;
			} else {
				tmpStatus = StorageLinkStatus.INACTIVE;
			}

		} else {
			tmpStatus = StorageLinkStatus.INACTIVE;
		}
		if (toMonitor) {
			subMonitor.worked(50);
		}

		retrieveStorageDiskPath();
		if (toMonitor) {
			subMonitor.worked(70);
		}

		if (UIDialog.isStandAlone()) {
			updateAttributesOnSystemStorage();
		}
		if (toMonitor) {
			subMonitor.worked(100);
		}
		vCenterClient.disconnect();
	}
}
