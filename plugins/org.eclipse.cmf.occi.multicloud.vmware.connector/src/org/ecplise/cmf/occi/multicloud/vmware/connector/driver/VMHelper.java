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

import java.rmi.RemoteException;

import org.eclipse.cmf.occi.multicloud.vmware.connector.driver.exceptions.MountVMWareToolsDiskException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim25.VirtualHardware;
import com.vmware.vim25.VirtualLsiLogicController;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualMachineQuickStats;
import com.vmware.vim25.VirtualMachineToolsStatus;
import com.vmware.vim25.VirtualSCSISharing;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ResourcePool;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Helper for Virtual Machine operations.
 * 
 * @author Christophe Gourdin - Inria
 *
 */
public class VMHelper {

	private static Logger LOGGER = LoggerFactory.getLogger(VMHelper.class);

	/**
	 * The virtual machine is currently powered off.
	 */
	public static final String POWER_OFF = "poweredOff";
	/**
	 * The virtual machine is currently powered on.
	 */
	public static final String POWER_ON = "poweredOn";

	public static final int POWER_ON_INT = 1;
	public static final int POWER_OFF_INT = 0;

	/**
	 * The virtual machine is currently suspended.
	 */
	public static final String SUSPENDED = "suspended";
	public static final int SUSPENDED_INT = 2;

	public static final String VIRTUAL_MACHINE = "VirtualMachine";

	/**
	 * Search for a VirtualMachine on tree folder for a name.
	 * 
	 * @param folder
	 * @param name
	 * @return a VirtualMachine object, null if not found.
	 */
	public static VirtualMachine findVMForName(final Folder folder, final String name) {
		VirtualMachine vm = null;

		try {
			vm = (VirtualMachine) new InventoryNavigator(folder).searchManagedEntity(VIRTUAL_MACHINE, name);

		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a virtual machine : " + name + " --> " + ex.getMessage());
		}

		return vm;
	}

	/**
	 * Find a virtual machine for a managed object reference id.
	 * 
	 * @param folder
	 *            (rootFolder etc.)
	 * @param morId
	 * @return a VirtualMachine object, null, if none.
	 */
	public static VirtualMachine findVMForMorId(final Folder folder, final String morId) {

		VirtualMachine vm = null;

		try {
			ManagedEntity[] entities = new InventoryNavigator(folder).searchManagedEntities("VirtualMachine");
			if (entities != null && entities.length > 0) {
				for (ManagedEntity entity : entities) {
					if (entity.getMOR().getVal().equals(morId)) {
						vm = (VirtualMachine) entity;
						break;
					}
				}
			}

		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a virtual machine by managed entity id : " + morId + " --> "
					+ ex.getMessage());
		}

		return vm;
	}

	/**
	 * Search a VM for name and folder.
	 * 
	 * @param folder
	 *            (may be a root folder)
	 * @param name
	 * @return true if the VM exist else false.
	 */
	public static boolean isVMExistForName(final Folder folder, final String name) {

		boolean isVmExist = false;

		VirtualMachine vm = findVMForName(folder, name);
		if (vm != null) {
			isVmExist = true;
		}

		return isVmExist;
	}

	/**
	 * Build a Scsi Device for a new Virtual Machine
	 * 
	 * @param cKey
	 * @return A new Scsi Device
	 */
	public static VirtualDeviceConfigSpec createScsiSpec(int cKey) {
		VirtualDeviceConfigSpec scsiSpec = new VirtualDeviceConfigSpec();
		scsiSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
		VirtualLsiLogicController scsiCtrl = new VirtualLsiLogicController();
		scsiCtrl.setKey(cKey);
		scsiCtrl.setBusNumber(0);
		scsiCtrl.setSharedBus(VirtualSCSISharing.noSharing);
		scsiSpec.setDevice(scsiCtrl);
		return scsiSpec;
	}

	/**
	 * For use only if you want to create a vm with an existing disk (vmdk file).
	 * 
	 * @param filename
	 * @param cKey
	 * @param diskMode
	 * @return
	 */
	public static VirtualDeviceConfigSpec createExistingDiskSpec(String filename, int cKey, String diskMode) {
		VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
		diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
		// Do not set diskspec.fileoperation !!!!
		VirtualDisk vd = new VirtualDisk();
		// Value is ignored but necessary for the process.
		vd.setCapacityInKB(-1);
		vd.setKey(0);
		vd.setUnitNumber(1);
		vd.setControllerKey(cKey);
		VirtualDiskFlatVer2BackingInfo dskFileBacking = new VirtualDiskFlatVer2BackingInfo();
		dskFileBacking.setFileName(filename);
		dskFileBacking.setDiskMode(diskMode);
		vd.setBacking(dskFileBacking);
		diskSpec.setDevice(vd);
		return diskSpec;
	}

	/**
	 * Build a vmDisk Device for a new Virtual Machine
	 * 
	 * @param dsName
	 *            DatastoreName
	 * @param cKey
	 * @param diskSizeKB
	 *            Size of disk in KB
	 * @param diskMode
	 *            Disk Mode: persistent, independent_persistent and
	 *            independent_nonpersistent
	 * @return A new Disk Device
	 */
	public static VirtualDeviceConfigSpec createDiskSpec(String dsName, int cKey, long diskSizeKB, String diskMode) {
		VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
		diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
		diskSpec.setFileOperation(VirtualDeviceConfigSpecFileOperation.create);

		VirtualDisk vd = new VirtualDisk();
		vd.setCapacityInKB(diskSizeKB);
		diskSpec.setDevice(vd);
		vd.setKey(0);
		vd.setUnitNumber(0);
		vd.setControllerKey(cKey);

		VirtualDiskFlatVer2BackingInfo diskfileBacking = new VirtualDiskFlatVer2BackingInfo();
		String fileName = "[" + dsName + "]";
		diskfileBacking.setFileName(fileName);
		diskfileBacking.setDiskMode(diskMode);
		diskfileBacking.setThinProvisioned(true);

		vd.setBacking(diskfileBacking);

		return diskSpec;
	}

	/**
	 * Set or unset the hotReconfig option. (to reconfig a vm cpu and memory, hot
	 * mode)
	 * 
	 * @param folder
	 *            (folder to search vm)
	 * @param name
	 *            (name of the vm)
	 * @param hotReconfig,
	 *            if true, hotReconfig is enabled, else disabled.
	 */
	public static void hotReconfigEnable(final Folder folder, String name, boolean hotReconfig) {
		// Search the vm.
		VirtualMachine vm = VMHelper.findVMForName(folder, name);
		Task task = null;
		VirtualMachineConfigSpec changeSpec = new VirtualMachineConfigSpec();
		changeSpec.setCpuHotAddEnabled(true);
		changeSpec.setMemoryHotAddEnabled(true);
		boolean retVal = false;
		if (vm != null && (!vm.getConfig().getCpuHotAddEnabled() || !vm.getConfig().getMemoryHotAddEnabled())) {
			try {
				task = vm.powerOffVM_Task();
			} catch (RemoteException ex) {
				LOGGER.error("Unable to enable/disable hot reconfiguration of this virtual machine : " + vm.getName());
				LOGGER.error("Cause : " + ex.getMessage());
				return;
			}
			if (task != null) {
				try {
					retVal = task.waitForTask().equals(Task.SUCCESS);
					if (retVal) {
						LOGGER.info("VM " + vm.getName() + " powered off");
					} else {
						LOGGER.info("VM cant poweroff");
						LOGGER.error("Unable to enable/disable hot reconfiguration of this virtual machine : "
								+ vm.getName());
						return;
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (RuntimeFault e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (retVal && !vm.getRuntime().getPowerState().equals(VirtualMachinePowerState.poweredOff)) {
				// this vm is poweredoff.
				if (task != null) {
					try {
						retVal = task.waitForTask().equals(Task.SUCCESS);
						if (retVal) {
							LOGGER.info(
									"VM " + name + " configuration updated - HotAdd plugin enabled for CPU and Memory");
						} else {
							LOGGER.info("VM " + name + " cannot be reconfigured");
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (RuntimeFault e) {
						e.printStackTrace();
					} catch (RemoteException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}

	/**
	 * Mount guest vmware tools, it's important to make it accessible directly to
	 * client.
	 * 
	 * @param folder
	 * @param name
	 * @throws MountVMWareToolsDiskException
	 */
	public static void mountGuestVmTools(final Folder folder, final String name) throws MountVMWareToolsDiskException {
		VirtualMachine vm = VMHelper.findVMForName(folder, name);
		try {
			vm.mountToolsInstaller();
		} catch (RemoteException ex) {
			LOGGER.info("Unable to mount VMWare tools installer !");
			throw new MountVMWareToolsDiskException("Unable to mount VMWare tools installer !", ex.getCause());
		}

	}

	/**
	 * Find an hostSystem for a vm, if there is hostSystemName information, and
	 * compare with the hosted vmName for each vms of each host.
	 * 
	 * @param vmName
	 * @return a hostSystem name, may return null if not found.
	 */
	public static String findHostSystemNameForVM(final Folder rootFolder, final String vmName) {
		String hostSystemName = null;
		try {

			boolean found = false;
			HostSystem hostSystem = null;
			ManagedEntity[] hostsystems = new InventoryNavigator(rootFolder).searchManagedEntities("HostSystem");
			for (ManagedEntity hostsystem : hostsystems) {
				HostSystem host = (HostSystem) hostsystem;

				VirtualMachine[] vms = host.getVms();

				for (VirtualMachine vm : vms) {
					if (vm.getName().equals(vmName)) {
						hostSystem = host;
						found = true;
						break;
					}
				}

				if (found)
					break;
			}
			hostSystemName = hostSystem.getName();

		} catch (RemoteException ex) {
			LOGGER.error("cant find the hostname of this virtual machine : " + vmName);
		}

		return hostSystemName;
	}

	/**
	 * Find an hostSystem Object for a vm, if there is hostSystem information, and
	 * compare with the hosted vmName for each vms of each host.
	 * 
	 * @param vmName
	 * @return a hostSystem, may return null if not found.
	 */
	public static HostSystem findHostSystemForVM(final Folder rootFolder, final String vmName) {
		HostSystem hostSystem = null;
		try {

			boolean found = false;

			ManagedEntity[] hostsystems = new InventoryNavigator(rootFolder).searchManagedEntities("HostSystem");
			for (ManagedEntity hostsystem : hostsystems) {
				HostSystem host = (HostSystem) hostsystem;

				VirtualMachine[] vms = host.getVms();

				for (VirtualMachine vm : vms) {
					if (vm.getName().equals(vmName)) {
						hostSystem = host;
						found = true;
						break;
					}
				}

				if (found)
					break;
			}

		} catch (RemoteException ex) {
			LOGGER.error("cant find the hostname of this virtual machine : " + vmName);
		}

		return hostSystem;
	}

	/**
	 * Get the number of virtual sockets.
	 * 
	 * @param vm
	 * @return an Integer that represents the number of cores.
	 */
	public static Integer getNumSockets(final VirtualMachine vm) {
		Integer nbSockets = 0;
		if (vm != null) {
			VirtualHardware hw = vm.getConfig().getHardware();
			nbSockets = hw.getNumCPU() / hw.getNumCoresPerSocket();
		}
		return nbSockets;
	}

	public static Integer getNumCPU(final VirtualMachine vm) {
		Integer nbCpu = 0;
		if (vm != null) {
			VirtualHardware hw = vm.getConfig().getHardware();
			nbCpu = hw.getNumCPU();
		}
		return nbCpu;
	}

	/**
	 * Get the number of core per socket.
	 * 
	 * @param vm
	 * @return an Integer.
	 */
	public static Integer getNumCorePerSocket(final VirtualMachine vm) {
		Integer coresPerSocket = 0;
		if (vm != null) {
			VirtualHardware hw = vm.getConfig().getHardware();
			coresPerSocket = hw.getNumCoresPerSocket();
		}
		return coresPerSocket;

	}

	/**
	 * Get the memory size in GigaBytes.
	 * 
	 * @param vm
	 * @return a Float
	 */
	public static Float getMemoryGB(final VirtualMachine vm) {
		Float memoryGB = 0.0f;
		if (vm != null) {
			VirtualHardware hw = vm.getConfig().getHardware();
			Integer memMB = hw.getMemoryMB();
			Float memMBFT = memMB.floatValue();
			memoryGB = memMBFT / 1024;
		}

		return memoryGB;
	}

	/**
	 * Get the overall disk size in GB for ephemeral disk (system disk).
	 * 
	 * @param vm
	 * @return 0 if none, size in GB.
	 */
	public static Float getEphemalDiskSize(final VirtualMachine vm) {
		Float diskSizeGB = 0.0f;
		if (vm != null) {
			VirtualDevice devices[] = vm.getConfig().getHardware().getDevice();
			int unitNumber;
			if (devices != null && devices.length > 0) {
				for (VirtualDevice device : devices) {
					if (device instanceof VirtualDisk) {
						VirtualDisk disk = (VirtualDisk) device;
						unitNumber = disk.getUnitNumber();
						if (unitNumber == 0) {
							// This is the main disk storage !
							// Get the value of its size.
							Long dskSizeKB = disk.getCapacityInKB();
							diskSizeGB = dskSizeKB.floatValue() / (1024 * 1024);
							break;
						}
					}
				}
			}
		}

		return diskSizeGB;
	}

	/**
	 * Get the architecture (occi format) x86 (32 bits) or x64 (64 bits).
	 * 
	 * @param vm
	 * @return a String
	 */
	public static String getArchitecture(final VirtualMachine vm) {
		String architecture = "x86";
		if (vm != null) {
			String guestFullName = vm.getConfig().getGuestFullName();
			if (guestFullName != null && guestFullName.contains("64")) {
				architecture = "x64";
			} // elsewere this is not defined by vmware.

		}

		return architecture;
	}

	/**
	 * Get the cpu speed in Ghz.
	 * 
	 * @param vm
	 * @return a Float, the cpu speed current demand by the vm, there is no value on
	 *         exact cpu speed at this time through the VMWare api.
	 */
	public static Float getCPUSpeed(final VirtualMachine vm) {
		Float cpuSpeed = 0.0f;
		if (vm != null) {
			VirtualMachineQuickStats qstats = vm.getSummary().getQuickStats();
			// In MHz.
			Integer cpuSpeedDemand = qstats.getOverallCpuDemand();
			// In Ghz.
			cpuSpeed = cpuSpeedDemand.floatValue() / 1000;
		}

		return cpuSpeed;
	}

	/**
	 * Get the state of this compute (VMWare format). poweredOff The virtual machine
	 * is currently powered off. poweredOn The virtual machine is currently powered
	 * on. suspended The virtual machine is currently suspended.
	 * 
	 * @param vm
	 * @return a String
	 */
	public static String getPowerState(final VirtualMachine vm) {
		// Get the current state of this vm.
		String state = null;
		if (vm != null) {
			state = vm.getSummary().getRuntime().getPowerState().name();
		}
		return state;
	}

	/**
	 * Operation mode of guest operating system, via guestInfo. "running" - Guest is
	 * running normally. "shuttingdown" - Guest has a pending shutdown command.
	 * "resetting" - Guest has a pending reset command. "standby" - Guest has a
	 * pending standby command. "notrunning" - Guest is not running. "unknown" -
	 * Guest information is not available.
	 * 
	 * @param vm
	 * @return
	 */
	public static String getGuestState(final VirtualMachine vm) {
		String state = null;
		if (vm != null) {
			state = vm.getGuest().getGuestState();
		}
		return state;
	}

	/**
	 * Get the guest hostname if known.
	 * 
	 * @param vm
	 * @return if the guest hostname is not known, this may return null.
	 */
	public static String getGuestHostname(final VirtualMachine vm) {
		String hostname = null;
		if (vm != null && isToolsInstalled(vm) && isToolsRunning(vm)) {
			hostname = vm.getGuest().getHostName();
		}
		return hostname;
	}

	/**
	 * Check if hot add pluging is enabled for CPU
	 *
	 * @param vmname
	 * @return
	 * @throws InvalidProperty
	 * @throws RuntimeFault
	 * @throws RemoteException
	 */
	public Boolean getHotAddCPU(final VirtualMachine vm) throws RemoteException {
		return vm.getConfig().getCpuHotAddEnabled();
	}

	/**
	 * Check if hot add plugin is enabled for Memory
	 *
	 * @param vm
	 * @return
	 * @throws InvalidProperty
	 * @throws RuntimeFault
	 * @throws RemoteException
	 */
	public Boolean getHotAddMemory(final VirtualMachine vm) throws RemoteException {
		return vm.getConfig().getMemoryHotAddEnabled();
	}

	/**
	 * Enable Hot Add plugin - need Stop and Start task
	 *
	 * @param vm
	 * @throws InvalidProperty
	 * @throws RuntimeFault
	 * @throws RemoteException
	 */
	public static void enableVmHotAddPlugin(final VirtualMachine vm) throws RemoteException {
		VirtualMachineConfigSpec changeSpec = new VirtualMachineConfigSpec();
		Task task = null;
		boolean retVal = false;
		String vmName = vm.getName();

		String lastPowerState = getPowerState(vm);

		if (!vm.getConfig().getCpuHotAddEnabled() || !vm.getConfig().getMemoryHotAddEnabled()) {
			task = vm.powerOffVM_Task();
			if (task != null) {
				try {
					retVal = task.waitForTask().equals(Task.SUCCESS);
					if (retVal) {
						LOGGER.info("VM " + vmName + " switched off");
					} else {
						LOGGER.info("VM " + vmName + "cannot powerOff");
						return;

					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				LOGGER.warn("Cannot stop Virtual Machine " + vmName);
			}

			if (retVal && getPowerState(vm).equals(POWER_OFF)) {
				changeSpec.setCpuHotAddEnabled(true);
				changeSpec.setMemoryHotAddEnabled(true);

				task = vm.reconfigVM_Task(changeSpec);

				if (task != null) {
					try {
						retVal = task.waitForTask().equals(Task.SUCCESS);
						if (retVal) {
							LOGGER.info("VM " + vmName
									+ " configuration updated - HotAdd plugin enabled for CPU and Memory");
						} else {
							LOGGER.info("VM " + vmName + " cannot be reconfigured");
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				// We powerOn if this is the last state.
				if (lastPowerState.equals(POWER_ON) && vm.getGuest().getGuestState().equals(POWER_OFF)) {
					task = vm.powerOnVM_Task(null);
					if (task != null) {
						try {
							retVal = task.waitForTask().equals(Task.SUCCESS);
							if (retVal) {
								LOGGER.info("VM " + vmName + " switched on");

							} else {
								LOGGER.warn("VM " + vmName + " cannot be switched on");
							}
							return;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						LOGGER.info("Cannot start Virtual Machine: " + vmName);
					}
				}

			} else {
				LOGGER.info("Something go wrong, cant reconfigure the virtual machine : " + vmName);
			}
		}
		LOGGER.info("HotAdd plugin already enabled");
	}

	/**
	 * upgrade vm hardware to a new version.
	 * @param vm
	 * @param version
	 * @throws RemoteException
	 */
	public static void upgradeVM(final VirtualMachine vm, final String version) throws RemoteException {
		Task task = null;
		boolean retVal = false;
		String vmName = vm.getName();
		String lastPowerState = getPowerState(vm);
		task = vm.powerOffVM_Task();
		if (task != null) {
			try {
				retVal = task.waitForTask().equals(Task.SUCCESS);
				if (retVal) {
					LOGGER.info("VM " + vmName + " switched off");
				} else {
					LOGGER.info("VM " + vmName + "cannot powerOff");
					return;

				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			LOGGER.warn("Cannot stop Virtual Machine " + vmName);
		}

		if (retVal && getPowerState(vm).equals(POWER_OFF)) {
			// Effectively upgrade vm to a new version (hardware).
			task = vm.upgradeVM_Task(version);

			if (task != null) {
				try {
					retVal = task.waitForTask().equals(Task.SUCCESS);
					if (retVal) {
						LOGGER.info("VM " + vmName + " configuration updated - new version : " + version);
					} else {
						LOGGER.error("VM " + vmName + " cannot be reconfigured, task has failed !");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			// We powerOn if this is the last state.
			if (lastPowerState.equals(POWER_ON) && vm.getGuest().getGuestState().equals(POWER_OFF)) {
				task = vm.powerOnVM_Task(null);
				if (task != null) {
					try {
						retVal = task.waitForTask().equals(Task.SUCCESS);
						if (retVal) {
							LOGGER.info("VM " + vmName + " switched on");

						} else {
							LOGGER.warn("VM " + vmName + " cannot be switched on");
						}
						return;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					LOGGER.info("Cannot start Virtual Machine: " + vmName);
				}
			}

		} else {
			LOGGER.info("Something go wrong, cant reconfigure the virtual machine : " + vmName);
		}
	}

	/**
	 * Change configuration for a VM - Hot or cold.
	 *
	 * @param vm
	 * @param vCPU
	 *            (optional may be null)
	 * @param vRamSizeGB
	 *            (optional may be null) in GigaBytes
	 * @param summary
	 *            annotation on vm.
	 * @return
	 * @throws InvalidProperty
	 * @throws RuntimeFault
	 * @throws RemoteException
	 */
	public static void reconfigureVm(final VirtualMachine vm, final Integer vCPU, final Float vRamSizeGB,
			String summary) throws RemoteException {

		if (vm == null) {
			LOGGER.warn("The virtual machine object doesnt exist for hot/cold reconfiguration");
			return;
		}
		boolean execReconf = false;
		VirtualMachineConfigSpec changeSpec = new VirtualMachineConfigSpec();
		String vmName = vm.getName();
		String currentPowerState = getPowerState(vm);

		if (currentPowerState.equals(SUSPENDED)) {
			LOGGER.warn("Cannot reconfigure virtual machine, the virtual machine is in suspended state.");
			return;
		}

		LOGGER.info("Reconfiguration of the virtual machine : " + vmName + " --> state: " + currentPowerState);

		Task task = null;
		boolean retVal = false;

		Long memoryMB = null;

		if (summary != null) {
			execReconf = true;
			changeSpec.setAnnotation(summary);
		}
		int oldVCPU = getNumCPU(vm);
		int currentNbCorePerSocket = getNumCorePerSocket(vm);
		LOGGER.info("Current number of vcpu : " + oldVCPU);
		LOGGER.info("NumCoresPerSocket " + currentNbCorePerSocket);

		// CPU part, to add or remove a cpu, the current VCPU must be different
		// from the value VCPU TO set !
		if (vCPU != null && vCPU > 0 && vCPU != oldVCPU) {

			int approximateNumVSockets = (int) ((vCPU + currentNbCorePerSocket - 1) / currentNbCorePerSocket);
			LOGGER.info("Approximate NumVSockets " + approximateNumVSockets);

			// Hot cpu reconfig case.
			if (currentPowerState.equals(POWER_ON)) {

				if ((vm.getConfig().getCpuHotAddEnabled() && vCPU > oldVCPU)
						|| (vm.getConfig().getCpuHotRemoveEnabled() && vCPU < oldVCPU)) {
					changeSpec.setNumCPUs(approximateNumVSockets * currentNbCorePerSocket);
					LOGGER.info("Hot reconfiguration --> VM : " + vmName + " , changing cpu from " + oldVCPU + " to "
							+ vCPU.intValue());
					execReconf = true;
				}

			}

			// Cold cpu reconfig case.
			if (currentPowerState.equals(POWER_OFF)) {
				changeSpec.setNumCPUs(1);
				changeSpec.setNumCoresPerSocket(1);
				task = vm.reconfigVM_Task(changeSpec);
				if (task != null) {
					try {
						retVal = task.waitForTask().equals(Task.SUCCESS);
						if (retVal) {
							LOGGER.info("Cold reconfiguration --> VM " + vmName + " change cpu from " + oldVCPU
									+ " to 1, OK");
							changeSpec.setNumCPUs(vCPU);
							changeSpec.setCpuHotAddEnabled(true);
							changeSpec.setCpuHotRemoveEnabled(true);
							changeSpec.setMemoryHotAddEnabled(true);
							LOGGER.info("Cold reconfiguration --> VM " + vmName + " change cpu from 1 " + "to " + vCPU);
							execReconf = true;
						} else {
							LOGGER.info("Cant reconfigure virtual machine.");
							return;
						}
					} catch (InterruptedException ex) {
						LOGGER.error("Cant reconfigure virtual machine.");
						return;
					}

				}

			}

		}

		Float ramInit = getMemoryGB(vm);
		// Be warned, the ram size is explained in GB not in MB. VMWare explain
		// the ram in MegaBytes.
		if (vRamSizeGB != null && vRamSizeGB > 0.0 && vRamSizeGB != ramInit) {
			LOGGER.info("VM " + vmName + " change memory from " + ramInit + " to " + vRamSizeGB);
			Float memoryMBfl = vRamSizeGB * 1024;
			memoryMB = memoryMBfl.longValue();

			if (ramInit > vRamSizeGB) {
				LOGGER.info("VM : " + vmName
						+ " Cannot reconfigure memory, the reconfiguration memory must be superior to the current virtual machine memory.");
				return;
			}
			if (currentPowerState.equals(POWER_ON)) {

				if (vm.getConfig().getMemoryHotAddEnabled()) {
					changeSpec.setMemoryMB(memoryMB);
					LOGGER.info("VM " + vmName + " change memory from " + ramInit + "GB to " + vRamSizeGB + "GB");
					execReconf = true;
				}
			}

			if (currentPowerState.equals(POWER_OFF)) {
				changeSpec.setMemoryMB(memoryMB);
				changeSpec.setMemoryHotAddEnabled(true);
				execReconf = true;
			}
		}

		// Exec reconf part.
		if (execReconf) {
			task = vm.reconfigVM_Task(changeSpec);
			if (task != null) {
				try {
					retVal = task.waitForTask().equals(Task.SUCCESS);
					if (retVal) {
						LOGGER.info("VM " + vmName + " configuration updated ");
					} else {
						LOGGER.warn("VM " + vmName + " cannot be reconfigured");
					}
				} catch (InterruptedException ex) {
					ex.printStackTrace();
					LOGGER.error(
							"VM " + vmName + " cannot be reconfigured, the reconfiguration task has been interrupted.");
				}
			}
		}
	}

	/**
	 * Check if vmware tools are installed on virtual machine.
	 * 
	 * @param vm
	 * @return true if installed.
	 */
	public static boolean isToolsInstalled(final VirtualMachine vm) {
		boolean result = false;
		VirtualMachineToolsStatus toolsStatus = vm.getGuest().getToolsStatus();
		if (!toolsStatus.equals(VirtualMachineToolsStatus.toolsNotInstalled)) {
			result = true;
		}
		return result;
	}

	/**
	 * Check if vmware tools are running on virtual machine.
	 * 
	 * @param vm
	 * @return
	 */
	public static boolean isToolsRunning(final VirtualMachine vm) {
		boolean result = false;
		VirtualMachineToolsStatus toolsStatus = vm.getGuest().getToolsStatus();
		if (!toolsStatus.equals(VirtualMachineToolsStatus.toolsNotRunning)) {
			result = true;
		}

		return result;

	}

	/**
	 * Power on a virtual machine.
	 * 
	 * @param vm
	 */
	public static boolean powerOn(VirtualMachine vm) throws RemoteException, InterruptedException {
		Task task = null;
		boolean retVal = false;
		String vmName = vm.getName();

		task = vm.powerOnVM_Task(null);
		if (task != null) {
			retVal = task.waitForTask().equals(Task.SUCCESS);
		} else {
			LOGGER.warn("Cannot start Virtual Machine : " + vmName);
		}
		return retVal;

	}

	/**
	 * Graceful power off a virtual machine. (shutdown guest os before poweroff).
	 * 
	 * @param vm
	 */
	public static boolean graceFulPowerOff(VirtualMachine vm) throws RemoteException, InterruptedException {
		String vmName = vm.getName();
		boolean result = false;
		if (isToolsInstalled(vm) && isToolsRunning(vm)) {
			vm.shutdownGuest();
			result = true;
			LOGGER.info("OS of the VM " + vmName + " will be stopped");
		} else {
			LOGGER.info("OS of the VM " + vmName + " cannot be stopped, do you have installed the vmware tools ?");
			result = powerOff(vm);

		}
		return result;
	}

	/**
	 * Power off a virtual machine.
	 * 
	 * @param vm
	 */
	public static boolean powerOff(VirtualMachine vm) throws RemoteException, InterruptedException {
		Task task = null;
		boolean retVal = false;
		String vmName = vm.getName();

		task = vm.powerOffVM_Task();

		if (task != null) {
			retVal = task.waitForTask().equals(Task.SUCCESS);
		} else {
			LOGGER.warn("Cannot stop Virtual Machine : " + vmName);
		}
		return retVal;
	}

	/**
	 * Reboot guest os. Use by restart method Warm.
	 * 
	 * @param vm
	 */
	public static boolean rebootGuest(VirtualMachine vm) throws RemoteException {
		boolean result = false;
		if (isToolsInstalled(vm) && isToolsRunning(vm)) {
			vm.rebootGuest();
			result = true;
		} else {
			LOGGER.error("There is no vmware tools installed and/or running, cant reboot the guest system.");
			LOGGER.warn("please install vmware tools to use this operation.");
		}
		return result;
	}

	/**
	 * Suspend a virtual machine (pause).
	 * 
	 * @param vm
	 */
	public static boolean suspendVM(VirtualMachine vm) throws RemoteException, InterruptedException {
		Task task = null;
		boolean retVal = false;
		String vmName = vm.getName();

		task = vm.suspendVM_Task();

		if (task != null) {
			try {
				retVal = task.waitForTask().equals(Task.SUCCESS);
				if (retVal) {
					LOGGER.info("VM " + vmName + " suspended");
				} else {
					LOGGER.info("VM " + vmName + " cannot be suspended");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			LOGGER.warn("Cannot suspend Virtual Machine : " + vmName);
		}
		return retVal;

	}

	/**
	 * Hibernate a virtual machine (standby mode).
	 * 
	 * @param vm
	 */
	public static boolean hibernateVM(VirtualMachine vm) throws RemoteException, InterruptedException {
		boolean result = false;
		if (isToolsInstalled(vm) && isToolsRunning(vm)) {
			vm.standbyGuest();
			result = true;
		} else {
			LOGGER.error("There is no vmware tools installed and/or running, cant standby the guest system.");
			LOGGER.warn("please install vmware tools to use this operation.");
		}
		return result;

	}

	/**
	 * Load a vm object from vcenter with his name.
	 * 
	 * @param vmName
	 * @param rootFolder
	 * @return a virtual machine object loaded from vcenter and rootFolder.
	 */
	public static VirtualMachine loadVirtualMachine(final String vmName, Folder rootFolder) {
		// Load vm information to check if the vm is already started.
		if (vmName == null) {
			LOGGER.error("The title must be set, as it is used as the VM name (unique).");
			return null;
		}
		VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmName);
		if (vm == null) {
			LOGGER.warn("The virtual machine " + vmName + " doesn't exist anymore.");
			return null;
		}
		return vm;
	}

	/**
	 * Destroy a virtual machine on vcenter.
	 * 
	 * @param vm
	 */
	public static void destroyVM(final VirtualMachine vm) {

		Task taskDelete = null;
		String vmName = vm.getName();
		boolean result;
		// Delete the vm if this virtual machine exist on vcenter.

		// Launch delete task.
		LOGGER.info("Destroying vm : " + vmName);
		try {
			taskDelete = vm.destroy_Task();
			if (taskDelete != null) {
				try {
					result = taskDelete.waitForTask().equals(Task.SUCCESS);
					if (result) {
						LOGGER.info("The virtual machine :  " + vmName + " has been destroyed.");
					} else {
						LOGGER.warn("The virtual machine : " + vmName + " cannot be destroyed.");
					}
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			} else {
				LOGGER.warn("The virtual machine has not been destroyed, cant launch the destroy task !");
			}
		} catch (RemoteException ex) {
			LOGGER.error("Error while trying to destroy a virtual machine.");
			ex.printStackTrace();
		}
	}

	/**
	 * Rename a vm on vcenter.
	 * 
	 * @param vmOldName
	 * @param vmNewName
	 */
	public static void renameVM(VirtualMachine vm, final String vmNewName) throws RemoteException {
		Task taskRename = null;
		String vmName = vm.getName();
		boolean result;
		// Delete the vm if this virtual machine exist on vcenter.

		// Launch delete task.
		LOGGER.info("renaming vm : " + vmName + " to : " + vmNewName);
		taskRename = vm.rename_Task(vmNewName);
		if (taskRename != null) {
			try {
				result = taskRename.waitForTask().equals(Task.SUCCESS);
				if (result) {
					LOGGER.info("The virtual machine :  " + vmName + " has been renamed to " + vmNewName);
				} else {
					LOGGER.warn("The virtual machine : " + vmName + " cannot be renamed.");
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		} else {
			LOGGER.warn("The virtual machine has not been renamed, cant launch the rename task !");
		}
	}

	/**
	 * Mark a vm as a template.
	 * 
	 * @param vm
	 */
	public static boolean markAsTemplate(VirtualMachine vm) throws RemoteException {
		boolean result = false;
		if (vm.getConfig().isTemplate()) {
			return result;
		}
		vm.markAsTemplate();
		result = true;
		return result;
	}

	/**
	 * Mark a template as a virtual machine.
	 * 
	 * @param vmTemplate
	 * @param host
	 * @param pool
	 */
	public static boolean markAsVirtualMachine(VirtualMachine vmTemplate, HostSystem host, ResourcePool pool)
			throws RemoteException {
		boolean result = false;
		if (!vmTemplate.getConfig().isTemplate()) {
			return result;
		}
		vmTemplate.markAsVirtualMachine(pool, host);
		result = true;
		return result;
	}

	/**
	 * Get the TaskInfo object from task in progress on vm.
	 * 
	 * @param vm
	 * @return
	 */
	public static TaskInfo getTaskInfo(VirtualMachine vm) {
		TaskInfo taskInfo = null;
		// ServiceInstance si = VCenterClient.getServiceInstance();
		String vmName = vm.getName();
		try {
			Task[] tasks = vm.getRecentTasks();

			TaskInfo taskInfTmp;
			TaskInfoState taskInfoState;
			if (tasks != null && tasks.length > 0) {
				for (Task task : tasks) {
					taskInfTmp = task.getTaskInfo();
					taskInfoState = taskInfTmp.getState();
					if (taskInfTmp != null && taskInfoState != null
							&& (taskInfoState.equals(TaskInfoState.running)
									|| taskInfoState.equals(TaskInfoState.success)
									|| taskInfoState.equals(TaskInfoState.queued))) {
						taskInfo = taskInfTmp;
						break;
					}

				}
			}
		} catch (RemoteException ex) {
			LOGGER.error("Cant retrieve informations about tasks for this virtual machine : " + vmName);
		}

		return taskInfo;
	}

	/**
	 * From inventory path, load the Folder object and return it, if path doesn't
	 * exist, the folder and subfolders are created.
	 * 
	 * @param dataCenterVmFolder
	 * @param inventoryPath
	 *            (format: /myfolder/subfolder1/subfolder2/ etc.
	 * @return
	 */
	public static Folder getInventoryFolderFromPath(Folder dataCenterVmFolder, final String inventoryPath) {
		Folder folder = findOrCreateFolderFromPath(dataCenterVmFolder, inventoryPath);

		if (folder == null) {
			LOGGER.error("Folder cannot be created or retrieved.");
		} else {
			LOGGER.info("Folder on path : " + inventoryPath + " found !");
		}
		return folder;
	}

	/**
	 * Find a folder from a path like : /inria/test/experience1/ Note : This method
	 * create the missing folders if any on the path.
	 *
	 * @param folderPath
	 * @return A folder if exist, null if none.
	 */
	public static Folder findOrCreateFolderFromPath(Folder origin, String folderPath) {
		Folder folder = null;
		if (folderPath == null || folderPath.trim().isEmpty()) {
			return folder;
		}
		if (origin == null) {
			return folder;
		}

		if (folderPath.startsWith("/")) {
			folderPath = folderPath.substring(1);
		}
		if (folderPath.endsWith("/")) {
			folderPath = folderPath.substring(0, folderPath.length() - 1);
		}

		String[] foldersName = folderPath.split("/");
		if (foldersName != null && foldersName.length > 0) {
			String name = foldersName[0];
			try {

				if (name == null || name.isEmpty()) {
					return null;
				}
				// Search the first folder name.
				Folder myFolder = (Folder) new InventoryNavigator(origin).searchManagedEntity("Folder", name);
				if (myFolder == null) {
					System.out.println("Folder : " + name + " not found !!");
					// Create it if name is not empty.
					if (!name.isEmpty()) {
						myFolder = origin.createFolder(name);
					}
				}

				// Call recursively until the full path is ok.
				int i = 0;
				String tmpFolderPath = "";
				for (String tmpName : foldersName) {
					if (i > 0 && tmpName != null && !tmpName.trim().isEmpty()) {
						tmpFolderPath += tmpName + "/";
					}
					i++;
				}
				if (!tmpFolderPath.isEmpty()) {
					myFolder = findOrCreateFolderFromPath(myFolder, tmpFolderPath);
					if (myFolder != null) {
						return myFolder;
					}
				} else {
					// End of check tree, return here the last value found.
					return myFolder;
				}

			} catch (RemoteException ex) {
				LOGGER.error("Cant retrieve informations about folder : " + folderPath);
			}

		}

		if (folder == null) {
			LOGGER.warn("Folder on path : " + folderPath + " not found.");
		}

		return folder;
	}

	/**
	 * Find a vm folder path like /INRIA/test/
	 *
	 * @param vm
	 *            a virtual machine object.
	 * @return a folder path from vmFolder like /INRIA/test/, may return null if
	 *         errors.
	 */
	public static String getVMFolderPath(VirtualMachine vm) {
		String folderPath = "";
		if (vm == null) {
			return null;
		}

		// Folder vmFolder = dc.getVmFolder();
		boolean folderVmFound = false;
		// Get the parent.
		ManagedEntity entityParent = vm.getParent();
		Folder folder;
		if (entityParent instanceof Folder) {
			folder = (Folder) entityParent;
			if (folder.getParent() instanceof Datacenter) {
				return "/";
			} else {
				folderPath = "/" + folder.getName() + "/";
			}
		}

		while (!folderVmFound && entityParent != null) {

			entityParent = entityParent.getParent();

			if (entityParent.getParent() instanceof Datacenter) {
				folderVmFound = true;

			} else if (entityParent instanceof Folder) {
				folderPath = "/" + entityParent.getName() + folderPath;
			}

		}

		LOGGER.debug("VM Folder path:---> " + folderPath);

		return folderPath;
	}

}
