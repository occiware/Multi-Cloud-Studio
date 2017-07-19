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
 * Generated at Wed Jul 19 10:52:32 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.vmware/model/vmware.occie by org.eclipse.cmf.occi.core.gen.connector
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
	 * - term: vmaddon
	 * - title: Addon attributes for virtual machine (vcpu, gueststate etc.)
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Vmaddon createVmaddon() {
		return new VmaddonConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: vmimage
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Vmimage createVmimage() {
		return new VmimageConnector();
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
	 * - term: vswitchinfos
	 * - title: Givei informations about a vswitch
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Vswitchinfos createVswitchinfos() {
		return new VswitchinfosConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/vmware#
	 * - term: credential
	 * - title: Credential users information to access to ssh and userdata features
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.vmware.Credential createCredential() {
		return new CredentialConnector();
	}

}
