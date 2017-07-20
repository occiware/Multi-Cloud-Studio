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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.eclipse.cmf.occi.multicloud.vmware.Networkadapter;
import org.eclipse.cmf.occi.multicloud.vmware.connector.InstancevmwareConnector;
import org.eclipse.cmf.occi.multicloud.vmware.connector.NetworkadapterConnector;
import org.eclipse.cmf.occi.multicloud.vmware.connector.StoragelinkvmwareConnector;
import org.eclipse.cmf.occi.multicloud.vmware.connector.StoragevmwareConnector;
import org.eclipse.cmf.occi.multicloud.vmware.connector.VswitchConnector;

// TODO : To update with mixin base accordingly with meta model v2.

/**
 * This class discover all resources around a {@link ComputeConnector}.
 * @author Christophe Gourdin
 *
 */
public class DiscoverCompute {

	private InstancevmwareConnector compute;
	
	public DiscoverCompute(InstancevmwareConnector compute) {
		this.compute = compute;
	}
	
	public void discoverCompute() {
		// The following part is for discovery resources feature on
		// Configuration object. This will be implemented in near
		// future.

		// Get the related entity and update or create them if not
		// declared on
		// designer.

		// Storage part.
		// List<StoragelinkConnector> storageLinks =
		// this.getLinkedStorages();
		// // Get the storages from vm and check if there are designed,
		// if yes,
		// // update entity, if not designed, entity for storage are
		// created and
		// // updated..
		// Map<String, VirtualDisk> disks =
		// VolumeHelper.getVirtualDiskForVM(vm);
		//
		// for (Map.Entry<String, VirtualDisk> entry : disks.entrySet())
		// {
		// // format: [datastoreName] filename.vmdk
		// String diskName = entry.getKey();
		// String tmp = diskName.replace(".vmdk", "");
		// String tampon[] = tmp.split("]");
		// String datastoreStorage = tampon[0].substring(1);
		//
		// tampon = tampon[1].split("/");
		// diskName = tampon[tampon.length - 1];
		//
		// VirtualDisk disk = entry.getValue();
		// storageLinks = this.getLinkedStorages();
		// // Check if the disk is on designer..
		// StorageConnector storageConnector =
		// getStorageConnectorInLinks(diskName, storageLinks);
		// StoragelinkConnector storageLinkConnector;
		// if (storageLinks.isEmpty() || storageConnector == null) {
		// // Create the resource entity and the link.
		// LOGGER.info("Creating a new StorageConnector...");
		// storageConnector = createStorageConnector(diskName);
		// storageConnector.setDatastoreName(datastoreStorage);
		// // Create the link
		// storageLinkConnector =
		// createStorageLinkConnector(storageConnector);
		//
		// } else {
		//
		// // Get the corresponding link.
		// storageLinkConnector = getStorageLink(diskName,
		// storageLinks);
		// storageConnector.setDatastoreName(datastoreStorage);
		// // storageConnector.setSummary(datastoreStorage);
		//
		// // If the link doesnt exit create it.
		// if (storageLinkConnector == null) {
		// storageLinkConnector =
		// createStorageLinkConnector(storageConnector);
		// }
		//
		// }
		//
		// if (storageLinkConnector != null) {
		// // Retrieve link value this will update the storageConnector
		// // object before (in target).
		// storageLinkConnector.setVmName(vmName);
		// storageLinkConnector.occiRetrieve();
		//
		// }
		//
		// } // end for each entry disk.
		//
		// // if (this.getState().equals(ComputeStatus.ACTIVE)) {
		// // Networks (switch, port group and nic) part.
		// List<NetworkinterfaceConnector> networkLinks =
		// this.getNetworkInterfaces();
		// // Must disconnect here, the number of vcenter max query may
		// be
		// achieve
		// // and the risk is to fail query.
		// VCenterClient.disconnect();
		// VCenterClient.checkConnection();
		// List<VirtualEthernetCard> vEths =
		// NetworkHelper.getNetworkAdaptersForVM(vmName);
		//
		// for (VirtualEthernetCard vEth : vEths) {
		// String networkName = vEth.getDeviceInfo().getSummary();
		// String nicName = vEth.getDeviceInfo().getLabel();
		// LOGGER.info("Network name: " + networkName);
		// LOGGER.info("network Adapter name: " + nicName);
		// networkLinks = this.getNetworkInterfaces();
		// // Check if the virtual switch (+ port group) is on designer.
		// // Note
		// // that it use one port group for one switch.
		// NetworkConnector networkConn =
		// getNetworkConnectorInLinks(networkName, networkLinks);
		// NetworkinterfaceConnector netIntConn;
		//
		// if (networkLinks.isEmpty() || networkConn == null) {
		// // Create the ressource entity and the linked interface
		// // adapter.
		// networkConn = createNetworkConnector(networkName);
		//
		// // Create the link
		// netIntConn = createNetworkInterfaceConnector(nicName,
		// networkConn);
		// } else {
		// // Get the corresponding link.
		// netIntConn = getNetworkInterface(nicName, networkLinks);
		// if (netIntConn == null) {
		// netIntConn = createNetworkInterfaceConnector(nicName,
		// networkConn);
		// }
		// }
		// if (netIntConn != null) {
		// netIntConn.occiRetrieve();
		// }
		//
		// } // End for each virtual network devices.
		// }
	}
	
	
	
	/**
	 * Get the StoragevmwareConnector from a diskname and a list of storage links.
	 * 
	 * @param diskName
	 * @param storageLinks
	 * @return {@link StorageConnector} object.
	 */
	private StoragevmwareConnector getStorageConnectorInLinks(final String diskName,
			List<StoragelinkvmwareConnector> storageLinks) {
		StoragevmwareConnector result = null;
		for (StoragelinkvmwareConnector storageLink : storageLinks) {
			Resource target = storageLink.getTarget();
			if (target != null && target instanceof StoragevmwareConnector) {
				// Check if title is the disk name.
				String title = target.getTitle();
				if (title.equals(diskName)) {
					result = (StoragevmwareConnector) target;
					break;
				}
			}
		}

		return result;

	}
	
	/**
	 * Get a StoragelinkvmwareConnector from a list of storage link connector.
	 * 
	 * @param name
	 * @param stLinks
	 * @return a {@link StoragelinkConnector} object, null if not found.
	 */
	private StoragelinkvmwareConnector getStorageLink(String name, List<StoragelinkvmwareConnector> stLinks) {

		StoragelinkvmwareConnector storageLink = null;
		for (StoragelinkvmwareConnector conn : stLinks) {
			if (conn.getTitle().equals(name)) {
				storageLink = conn;
				break;
			}
		}
		return storageLink;
	}

	/**
	 * Create entity storageLinkConnector with link set.
	 * 
	 * @param storageConnector
	 * @return a new {@link StoragelinkConnector} object with link on source and
	 *         target set.
	 */
	private StoragelinkvmwareConnector createStorageLinkConnector(StoragevmwareConnector storageConnector) {

		Configuration config = OcciHelper.getConfiguration(compute);
		StoragelinkvmwareConnector stLink = null;

		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("infrastructure")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stLinkKind = OcciHelper.getKindByTerm(currentExt, "storagelink");
			Entity entity = OcciHelper.createEntity(stLinkKind);
			stLink = (StoragelinkvmwareConnector) entity;
			stLink.setTitle(storageConnector.getTitle()); // It is temporary
															// that, occi
															// retrieve will
															// retrieve the
															// volumeName from
															// the operating
															// system.
			stLink.setSource(compute);
			stLink.setTarget(storageConnector);

		}

		return stLink;
	}

	/**
	 * Create a storage entity without link.
	 * 
	 * @param diskName
	 * @return a new {@link StoragevmwareConnector} entity.
	 */
	private StoragevmwareConnector createStorageConnector(String diskName) {
		Configuration config = OcciHelper.getConfiguration(compute);
		StoragevmwareConnector conn = null;
		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("vmware")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stKind = OcciHelper.getKindByTerm(currentExt, "storagevmware");
			Entity entity = OcciHelper.createEntity(stKind);
			conn = (StoragevmwareConnector) entity;
			conn.setTitle(diskName); // It is temporary that, occi retrieve will
										// retrieve the volumeName from the
										// operating system.
			conn.getAttributes();
			config.getResources().add(conn);
		}
		return conn;
	}

	/**
	 * Get a vswitch from linked network interfaces and a network label.
	 * 
	 * @param networkName
	 * @param networkLinks
	 * @return a {@link VswitchConnector} entity object.
	 */
	private VswitchConnector getNetworkConnectorInLinks(final String networkName,
			List<NetworkadapterConnector> networkLinks) {
		VswitchConnector netConn = null;
		for (NetworkadapterConnector networkInt : networkLinks) {
			Resource target = networkInt.getTarget();
			if (target != null && target instanceof VswitchConnector) {
				// Check if title is the network label name.
				VswitchConnector conn = (VswitchConnector) target;
				String label = conn.getOcciNetworkLabel(); // before getLabel().
				if (label != null && label.equals(networkName)) {
					netConn = conn;
					break;
				}
			}
		}

		return netConn;

	}

	/**
	 * Create a new {@link VswitchConnector} entity with title set to
	 * networkName, without links.
	 * 
	 * @param networkName
	 * @return a new {@link VswitchConnector}
	 */
	private VswitchConnector createNetworkConnector(final String networkName) {
		Configuration config = OcciHelper.getConfiguration(compute);
		VswitchConnector conn = null;
		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("vmware")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stKind = OcciHelper.getKindByTerm(currentExt, "vswitch");
			Entity entity = OcciHelper.createEntity(stKind);
			conn = (VswitchConnector) entity;
			conn.setOcciNetworkLabel(networkName);
			// Add mixin ipnetwork
			EList<Mixin> mixins = currentExt.getMixins();
			Mixin ipnetworkMixin = null;
			for (Mixin mixin : mixins) {
				if (mixin.getTerm().equalsIgnoreCase("ipnetwork")) {
					ipnetworkMixin = mixin;
					break;
				}
			}
			if (ipnetworkMixin != null) {
				conn.getMixins().add(ipnetworkMixin);
			}

			config.getResources().add(conn);
		}
		return conn;

	}

	/**
	 * Create a new {@link NetworkadapterConnector} with links set from this
	 * compute to the networkConnector in parameter.
	 * 
	 * @param nicName
	 * @param networkConn
	 * @return a {@link NetworkadapterConnector} with links set.
	 */
	private NetworkadapterConnector createNetworkInterfaceConnector(final String nicName,
			VswitchConnector networkConn) {
		Configuration config = OcciHelper.getConfiguration(compute);

		NetworkadapterConnector netIntConn = null;

		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("vmware")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stLinkKind = OcciHelper.getKindByTerm(currentExt, "networkadapter");
			Entity entity = OcciHelper.createEntity(stLinkKind);
			netIntConn = (NetworkadapterConnector) entity;
			netIntConn.setTitle(nicName);
			netIntConn.setSource(compute);
			netIntConn.setTarget(networkConn);
			EList<Mixin> mixins = currentExt.getMixins();
			Mixin ipnetworkMixin = null;
			for (Mixin mixin : mixins) {
				if (mixin.getTerm().equalsIgnoreCase("ipnetworkinterface")) {
					ipnetworkMixin = mixin;
					break;
				}
			}
			if (ipnetworkMixin != null) {
				netIntConn.getMixins().add(ipnetworkMixin);
			}

		}
		return netIntConn;
	}

	/**
	 * Get the network adapter (network interface) connector from a list of network interfaces and
	 * a network adapter name.
	 * 
	 * @param nicName
	 * @param networkLinks
	 * @return a {@link NetworkadapterConnector}
	 */
	private NetworkadapterConnector getNetworkInterface(final String nicName,
			List<NetworkadapterConnector> networkLinks) {
		NetworkadapterConnector networkIntConn = null;
		for (NetworkadapterConnector conn : networkLinks) {
			if (conn.getTitle().equals(nicName)) {
				networkIntConn = conn;
				break;
			}
		}
		return networkIntConn;
	}
	
	
}
