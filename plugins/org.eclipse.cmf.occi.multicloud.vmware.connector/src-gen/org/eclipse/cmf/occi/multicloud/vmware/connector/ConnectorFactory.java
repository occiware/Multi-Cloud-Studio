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

/**
 * Connector EFactory for the OCCI extension:
 * - name: vmware
 * - scheme: http://occiware.org/occi/infrastructure/vmware#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.vmware.impl.VmwareFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: instancevmware
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Instancevmware createInstancevmware() {
		return new InstancevmwareConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: storagevmware
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Storagevmware createStoragevmware() {
		return new StoragevmwareConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: storagelinkvmware
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Storagelinkvmware createStoragelinkvmware() {
		return new StoragelinkvmwareConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: vswitch
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Vswitch createVswitch() {
		return new VswitchConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: networkadapter
	 * - title: Network adapter interface
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Networkadapter createNetworkadapter() {
		return new NetworkadapterConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: windows
	 * - title: Mixin os_tpl for Windows system
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Windows createWindows() {
		return new WindowsConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: linux
	 * - title: Mixin os_tpl for linux systems
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Linux createLinux() {
		return new LinuxConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: macosx
	 * - title: Mixin os_tpl for mac os x systems
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Macosx createMacosx() {
		return new MacosxConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: vmwarefolders
	 * - title: This mixin add global attributes like datacentername, clustername, hostsystem name etc.
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders createVmwarefolders() {
		return new VmwarefoldersConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: os_tpl_vmware
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware createOs_tpl_vmware() {
		return new Os_tpl_vmwareConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: ssh_user_data
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Ssh_user_data createSsh_user_data() {
		return new Ssh_user_dataConnector();
	}
	
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: vcenteraccount
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Vcenteraccount createVcenteraccount() {
		return new VcenteraccountConnector();
	}
	
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: vcentercredential
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Vcentercredential createVcentercredential() {
		return new VcentercredentialConnector();
	}

}
