/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.multicloud.vmware/model/vmware.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.vmware/model/vmware.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.vmware;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * VmwareTables provides the dispatch tables for the vmware for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class VmwareTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(VmwarePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/infrastructure/vmware/ecore", null, org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Credential = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Credential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Linux = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Linux", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Macosx = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Macosx", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Network = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Network", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networkinterface = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Networkinterface", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storage = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Storage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storagelink = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Storagelink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vmaddon = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vmaddon", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vmimage = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vmimage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vmwarefolders = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vmwarefolders", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vswitchinfos = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vswitchinfos", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Windows = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Windows", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_GuestOsIdentifiers = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getEnumerationId("GuestOsIdentifiers");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Credential_c_c_appliesConstraint = "Credential::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Linux_c_c_appliesConstraint = "Linux::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Macosx_c_c_appliesConstraint = "Macosx::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Vmaddon_c_c_appliesConstraint = "Vmaddon::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Vmimage_c_c_appliesConstraint = "Vmimage::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Vmwarefolders_c_c_appliesConstraint = "Vmwarefolders::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Vswitchinfos_c_c_appliesConstraint = "Vswitchinfos::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Windows_c_c_appliesConstraint = "Windows::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			VmwareTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Credential = new EcoreExecutorType(VmwarePackage.Literals.CREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _GuestOsIdentifiers = new EcoreExecutorEnumeration(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Linux = new EcoreExecutorType(VmwarePackage.Literals.LINUX, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Macosx = new EcoreExecutorType(VmwarePackage.Literals.MACOSX, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vmaddon = new EcoreExecutorType(VmwarePackage.Literals.VMADDON, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vmimage = new EcoreExecutorType(VmwarePackage.Literals.VMIMAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vmwarefolders = new EcoreExecutorType(VmwarePackage.Literals.VMWAREFOLDERS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vswitchinfos = new EcoreExecutorType(VmwarePackage.Literals.VSWITCHINFOS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Windows = new EcoreExecutorType(VmwarePackage.Literals.WINDOWS, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Credential,
			_GuestOsIdentifiers,
			_Linux,
			_Macosx,
			_Vmaddon,
			_Vmimage,
			_Vmwarefolders,
			_Vswitchinfos,
			_Windows
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Credential__Credential = new ExecutorFragment(Types._Credential, VmwareTables.Types._Credential);
		private static final /*@NonNull*/ ExecutorFragment _Credential__MixinBase = new ExecutorFragment(Types._Credential, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Credential__OclAny = new ExecutorFragment(Types._Credential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Credential__OclElement = new ExecutorFragment(Types._Credential, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__GuestOsIdentifiers = new ExecutorFragment(Types._GuestOsIdentifiers, VmwareTables.Types._GuestOsIdentifiers);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclAny = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclElement = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclEnumeration = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclType = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Linux__Linux = new ExecutorFragment(Types._Linux, VmwareTables.Types._Linux);
		private static final /*@NonNull*/ ExecutorFragment _Linux__MixinBase = new ExecutorFragment(Types._Linux, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Linux__OclAny = new ExecutorFragment(Types._Linux, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Linux__OclElement = new ExecutorFragment(Types._Linux, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Linux__Os_tpl = new ExecutorFragment(Types._Linux, InfrastructureTables.Types._Os_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Macosx__Macosx = new ExecutorFragment(Types._Macosx, VmwareTables.Types._Macosx);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__MixinBase = new ExecutorFragment(Types._Macosx, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__OclAny = new ExecutorFragment(Types._Macosx, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__OclElement = new ExecutorFragment(Types._Macosx, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__Os_tpl = new ExecutorFragment(Types._Macosx, InfrastructureTables.Types._Os_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Vmaddon__MixinBase = new ExecutorFragment(Types._Vmaddon, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Vmaddon__OclAny = new ExecutorFragment(Types._Vmaddon, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vmaddon__OclElement = new ExecutorFragment(Types._Vmaddon, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vmaddon__Vmaddon = new ExecutorFragment(Types._Vmaddon, VmwareTables.Types._Vmaddon);
		private static final /*@NonNull*/ ExecutorFragment _Vmaddon__Vmimage = new ExecutorFragment(Types._Vmaddon, VmwareTables.Types._Vmimage);

		private static final /*@NonNull*/ ExecutorFragment _Vmimage__MixinBase = new ExecutorFragment(Types._Vmimage, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Vmimage__OclAny = new ExecutorFragment(Types._Vmimage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vmimage__OclElement = new ExecutorFragment(Types._Vmimage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vmimage__Vmimage = new ExecutorFragment(Types._Vmimage, VmwareTables.Types._Vmimage);

		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__MixinBase = new ExecutorFragment(Types._Vmwarefolders, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__OclAny = new ExecutorFragment(Types._Vmwarefolders, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__OclElement = new ExecutorFragment(Types._Vmwarefolders, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__Vmwarefolders = new ExecutorFragment(Types._Vmwarefolders, VmwareTables.Types._Vmwarefolders);

		private static final /*@NonNull*/ ExecutorFragment _Vswitchinfos__MixinBase = new ExecutorFragment(Types._Vswitchinfos, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Vswitchinfos__OclAny = new ExecutorFragment(Types._Vswitchinfos, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vswitchinfos__OclElement = new ExecutorFragment(Types._Vswitchinfos, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vswitchinfos__Vswitchinfos = new ExecutorFragment(Types._Vswitchinfos, VmwareTables.Types._Vswitchinfos);

		private static final /*@NonNull*/ ExecutorFragment _Windows__MixinBase = new ExecutorFragment(Types._Windows, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Windows__OclAny = new ExecutorFragment(Types._Windows, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Windows__OclElement = new ExecutorFragment(Types._Windows, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Windows__Os_tpl = new ExecutorFragment(Types._Windows, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Windows__Windows = new ExecutorFragment(Types._Windows, VmwareTables.Types._Windows);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Credential__occiComputeUserdataFile = new EcoreExecutorProperty(VmwarePackage.Literals.CREDENTIAL__OCCI_COMPUTE_USERDATA_FILE, Types._Credential, 0);
		public static final /*@NonNull*/ ExecutorProperty _Credential__password = new EcoreExecutorProperty(VmwarePackage.Literals.CREDENTIAL__PASSWORD, Types._Credential, 1);
		public static final /*@NonNull*/ ExecutorProperty _Credential__user = new EcoreExecutorProperty(VmwarePackage.Literals.CREDENTIAL__USER, Types._Credential, 2);

		public static final /*@NonNull*/ ExecutorProperty _Linux__datastoreisopath = new EcoreExecutorProperty(VmwarePackage.Literals.LINUX__DATASTOREISOPATH, Types._Linux, 0);
		public static final /*@NonNull*/ ExecutorProperty _Linux__guestid = new EcoreExecutorProperty(VmwarePackage.Literals.LINUX__GUESTID, Types._Linux, 1);

		public static final /*@NonNull*/ ExecutorProperty _Macosx__datastoreisopath = new EcoreExecutorProperty(VmwarePackage.Literals.MACOSX__DATASTOREISOPATH, Types._Macosx, 0);
		public static final /*@NonNull*/ ExecutorProperty _Macosx__guestid = new EcoreExecutorProperty(VmwarePackage.Literals.MACOSX__GUESTID, Types._Macosx, 1);

		public static final /*@NonNull*/ ExecutorProperty _Vmaddon__guestosid = new EcoreExecutorProperty(VmwarePackage.Literals.VMADDON__GUESTOSID, Types._Vmaddon, 0);
		public static final /*@NonNull*/ ExecutorProperty _Vmaddon__gueststate = new EcoreExecutorProperty(VmwarePackage.Literals.VMADDON__GUESTSTATE, Types._Vmaddon, 1);
		public static final /*@NonNull*/ ExecutorProperty _Vmaddon__markedastemplate = new EcoreExecutorProperty(VmwarePackage.Literals.VMADDON__MARKEDASTEMPLATE, Types._Vmaddon, 2);
		public static final /*@NonNull*/ ExecutorProperty _Vmaddon__vcpu = new EcoreExecutorProperty(VmwarePackage.Literals.VMADDON__VCPU, Types._Vmaddon, 3);

		public static final /*@NonNull*/ ExecutorProperty _Vmimage__imagename = new EcoreExecutorProperty(VmwarePackage.Literals.VMIMAGE__IMAGENAME, Types._Vmimage, 0);

		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__clustername = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__CLUSTERNAME, Types._Vmwarefolders, 0);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__datacentername = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__DATACENTERNAME, Types._Vmwarefolders, 1);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__datastorename = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__DATASTORENAME, Types._Vmwarefolders, 2);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__hostsystemname = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__HOSTSYSTEMNAME, Types._Vmwarefolders, 3);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__inventorypath = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__INVENTORYPATH, Types._Vmwarefolders, 4);

		public static final /*@NonNull*/ ExecutorProperty _Vswitchinfos__nbport = new EcoreExecutorProperty(VmwarePackage.Literals.VSWITCHINFOS__NBPORT, Types._Vswitchinfos, 0);

		public static final /*@NonNull*/ ExecutorProperty _Windows__datastoreisopath = new EcoreExecutorProperty(VmwarePackage.Literals.WINDOWS__DATASTOREISOPATH, Types._Windows, 0);
		public static final /*@NonNull*/ ExecutorProperty _Windows__guestid = new EcoreExecutorProperty(VmwarePackage.Literals.WINDOWS__GUESTID, Types._Windows, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Credential =
		{
			Fragments._Credential__OclAny /* 0 */,
			Fragments._Credential__OclElement /* 1 */,
			Fragments._Credential__MixinBase /* 2 */,
			Fragments._Credential__Credential /* 3 */
		};
		private static final int /*@NonNull*/ [] __Credential = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GuestOsIdentifiers =
		{
			Fragments._GuestOsIdentifiers__OclAny /* 0 */,
			Fragments._GuestOsIdentifiers__OclElement /* 1 */,
			Fragments._GuestOsIdentifiers__OclType /* 2 */,
			Fragments._GuestOsIdentifiers__OclEnumeration /* 3 */,
			Fragments._GuestOsIdentifiers__GuestOsIdentifiers /* 4 */
		};
		private static final int /*@NonNull*/ [] __GuestOsIdentifiers = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Linux =
		{
			Fragments._Linux__OclAny /* 0 */,
			Fragments._Linux__OclElement /* 1 */,
			Fragments._Linux__MixinBase /* 2 */,
			Fragments._Linux__Os_tpl /* 3 */,
			Fragments._Linux__Linux /* 4 */
		};
		private static final int /*@NonNull*/ [] __Linux = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Macosx =
		{
			Fragments._Macosx__OclAny /* 0 */,
			Fragments._Macosx__OclElement /* 1 */,
			Fragments._Macosx__MixinBase /* 2 */,
			Fragments._Macosx__Os_tpl /* 3 */,
			Fragments._Macosx__Macosx /* 4 */
		};
		private static final int /*@NonNull*/ [] __Macosx = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vmaddon =
		{
			Fragments._Vmaddon__OclAny /* 0 */,
			Fragments._Vmaddon__OclElement /* 1 */,
			Fragments._Vmaddon__MixinBase /* 2 */,
			Fragments._Vmaddon__Vmimage /* 3 */,
			Fragments._Vmaddon__Vmaddon /* 4 */
		};
		private static final int /*@NonNull*/ [] __Vmaddon = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vmimage =
		{
			Fragments._Vmimage__OclAny /* 0 */,
			Fragments._Vmimage__OclElement /* 1 */,
			Fragments._Vmimage__MixinBase /* 2 */,
			Fragments._Vmimage__Vmimage /* 3 */
		};
		private static final int /*@NonNull*/ [] __Vmimage = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vmwarefolders =
		{
			Fragments._Vmwarefolders__OclAny /* 0 */,
			Fragments._Vmwarefolders__OclElement /* 1 */,
			Fragments._Vmwarefolders__MixinBase /* 2 */,
			Fragments._Vmwarefolders__Vmwarefolders /* 3 */
		};
		private static final int /*@NonNull*/ [] __Vmwarefolders = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vswitchinfos =
		{
			Fragments._Vswitchinfos__OclAny /* 0 */,
			Fragments._Vswitchinfos__OclElement /* 1 */,
			Fragments._Vswitchinfos__MixinBase /* 2 */,
			Fragments._Vswitchinfos__Vswitchinfos /* 3 */
		};
		private static final int /*@NonNull*/ [] __Vswitchinfos = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Windows =
		{
			Fragments._Windows__OclAny /* 0 */,
			Fragments._Windows__OclElement /* 1 */,
			Fragments._Windows__MixinBase /* 2 */,
			Fragments._Windows__Os_tpl /* 3 */,
			Fragments._Windows__Windows /* 4 */
		};
		private static final int /*@NonNull*/ [] __Windows = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Credential.initFragments(_Credential, __Credential);
			Types._GuestOsIdentifiers.initFragments(_GuestOsIdentifiers, __GuestOsIdentifiers);
			Types._Linux.initFragments(_Linux, __Linux);
			Types._Macosx.initFragments(_Macosx, __Macosx);
			Types._Vmaddon.initFragments(_Vmaddon, __Vmaddon);
			Types._Vmimage.initFragments(_Vmimage, __Vmimage);
			Types._Vmwarefolders.initFragments(_Vmwarefolders, __Vmwarefolders);
			Types._Vswitchinfos.initFragments(_Vswitchinfos, __Vswitchinfos);
			Types._Windows.initFragments(_Windows, __Windows);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credential__Credential = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credential__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credential__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credential__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GuestOsIdentifiers__GuestOsIdentifiers = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GuestOsIdentifiers__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GuestOsIdentifiers__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GuestOsIdentifiers__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GuestOsIdentifiers__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linux__Linux = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linux__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linux__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linux__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linux__Os_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Macosx__Macosx = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Macosx__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Macosx__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Macosx__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Macosx__Os_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmaddon__Vmaddon = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmaddon__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmaddon__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmaddon__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmaddon__Vmimage = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmimage__Vmimage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmimage__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmimage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmimage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwarefolders__Vmwarefolders = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwarefolders__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwarefolders__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vmwarefolders__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitchinfos__Vswitchinfos = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitchinfos__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitchinfos__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitchinfos__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Windows__Windows = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Windows__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Windows__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Windows__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Windows__Os_tpl = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Credential__Credential.initOperations(_Credential__Credential);
			Fragments._Credential__MixinBase.initOperations(_Credential__MixinBase);
			Fragments._Credential__OclAny.initOperations(_Credential__OclAny);
			Fragments._Credential__OclElement.initOperations(_Credential__OclElement);

			Fragments._GuestOsIdentifiers__GuestOsIdentifiers.initOperations(_GuestOsIdentifiers__GuestOsIdentifiers);
			Fragments._GuestOsIdentifiers__OclAny.initOperations(_GuestOsIdentifiers__OclAny);
			Fragments._GuestOsIdentifiers__OclElement.initOperations(_GuestOsIdentifiers__OclElement);
			Fragments._GuestOsIdentifiers__OclEnumeration.initOperations(_GuestOsIdentifiers__OclEnumeration);
			Fragments._GuestOsIdentifiers__OclType.initOperations(_GuestOsIdentifiers__OclType);

			Fragments._Linux__Linux.initOperations(_Linux__Linux);
			Fragments._Linux__MixinBase.initOperations(_Linux__MixinBase);
			Fragments._Linux__OclAny.initOperations(_Linux__OclAny);
			Fragments._Linux__OclElement.initOperations(_Linux__OclElement);
			Fragments._Linux__Os_tpl.initOperations(_Linux__Os_tpl);

			Fragments._Macosx__Macosx.initOperations(_Macosx__Macosx);
			Fragments._Macosx__MixinBase.initOperations(_Macosx__MixinBase);
			Fragments._Macosx__OclAny.initOperations(_Macosx__OclAny);
			Fragments._Macosx__OclElement.initOperations(_Macosx__OclElement);
			Fragments._Macosx__Os_tpl.initOperations(_Macosx__Os_tpl);

			Fragments._Vmaddon__MixinBase.initOperations(_Vmaddon__MixinBase);
			Fragments._Vmaddon__OclAny.initOperations(_Vmaddon__OclAny);
			Fragments._Vmaddon__OclElement.initOperations(_Vmaddon__OclElement);
			Fragments._Vmaddon__Vmaddon.initOperations(_Vmaddon__Vmaddon);
			Fragments._Vmaddon__Vmimage.initOperations(_Vmaddon__Vmimage);

			Fragments._Vmimage__MixinBase.initOperations(_Vmimage__MixinBase);
			Fragments._Vmimage__OclAny.initOperations(_Vmimage__OclAny);
			Fragments._Vmimage__OclElement.initOperations(_Vmimage__OclElement);
			Fragments._Vmimage__Vmimage.initOperations(_Vmimage__Vmimage);

			Fragments._Vmwarefolders__MixinBase.initOperations(_Vmwarefolders__MixinBase);
			Fragments._Vmwarefolders__OclAny.initOperations(_Vmwarefolders__OclAny);
			Fragments._Vmwarefolders__OclElement.initOperations(_Vmwarefolders__OclElement);
			Fragments._Vmwarefolders__Vmwarefolders.initOperations(_Vmwarefolders__Vmwarefolders);

			Fragments._Vswitchinfos__MixinBase.initOperations(_Vswitchinfos__MixinBase);
			Fragments._Vswitchinfos__OclAny.initOperations(_Vswitchinfos__OclAny);
			Fragments._Vswitchinfos__OclElement.initOperations(_Vswitchinfos__OclElement);
			Fragments._Vswitchinfos__Vswitchinfos.initOperations(_Vswitchinfos__Vswitchinfos);

			Fragments._Windows__MixinBase.initOperations(_Windows__MixinBase);
			Fragments._Windows__OclAny.initOperations(_Windows__OclAny);
			Fragments._Windows__OclElement.initOperations(_Windows__OclElement);
			Fragments._Windows__Os_tpl.initOperations(_Windows__Os_tpl);
			Fragments._Windows__Windows.initOperations(_Windows__Windows);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Credential = {
			VmwareTables.Properties._Credential__occiComputeUserdataFile,
			VmwareTables.Properties._Credential__password,
			VmwareTables.Properties._Credential__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GuestOsIdentifiers = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Linux = {
			VmwareTables.Properties._Linux__datastoreisopath,
			VmwareTables.Properties._Linux__guestid
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Macosx = {
			VmwareTables.Properties._Macosx__datastoreisopath,
			VmwareTables.Properties._Macosx__guestid
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vmaddon = {
			VmwareTables.Properties._Vmaddon__guestosid,
			VmwareTables.Properties._Vmaddon__gueststate,
			VmwareTables.Properties._Vmimage__imagename,
			VmwareTables.Properties._Vmaddon__markedastemplate,
			VmwareTables.Properties._Vmaddon__vcpu
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vmimage = {
			VmwareTables.Properties._Vmimage__imagename
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vmwarefolders = {
			VmwareTables.Properties._Vmwarefolders__clustername,
			VmwareTables.Properties._Vmwarefolders__datacentername,
			VmwareTables.Properties._Vmwarefolders__datastorename,
			VmwareTables.Properties._Vmwarefolders__hostsystemname,
			VmwareTables.Properties._Vmwarefolders__inventorypath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vswitchinfos = {
			VmwareTables.Properties._Vswitchinfos__nbport
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Windows = {
			VmwareTables.Properties._Windows__datastoreisopath,
			VmwareTables.Properties._Windows__guestid
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Credential__Credential.initProperties(_Credential);
			Fragments._GuestOsIdentifiers__GuestOsIdentifiers.initProperties(_GuestOsIdentifiers);
			Fragments._Linux__Linux.initProperties(_Linux);
			Fragments._Macosx__Macosx.initProperties(_Macosx);
			Fragments._Vmaddon__Vmaddon.initProperties(_Vmaddon);
			Fragments._Vmimage__Vmimage.initProperties(_Vmimage);
			Fragments._Vmwarefolders__Vmwarefolders.initProperties(_Vmwarefolders);
			Fragments._Vswitchinfos__Vswitchinfos.initProperties(_Vswitchinfos);
			Fragments._Windows__Windows.initProperties(_Windows);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__dosGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("dosGuest"), Types._GuestOsIdentifiers, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__win31Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("win31Guest"), Types._GuestOsIdentifiers, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__win95Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("win95Guest"), Types._GuestOsIdentifiers, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__win98Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("win98Guest"), Types._GuestOsIdentifiers, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winMeGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winMeGuest"), Types._GuestOsIdentifiers, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNTGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNTGuest"), Types._GuestOsIdentifiers, 5);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__win2000ProGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("win2000ProGuest"), Types._GuestOsIdentifiers, 6);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__win2000ServGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("win2000ServGuest"), Types._GuestOsIdentifiers, 7);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__win2000AdvServGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("win2000AdvServGuest"), Types._GuestOsIdentifiers, 8);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winXPHomeGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winXPHomeGuest"), Types._GuestOsIdentifiers, 9);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winXPProGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winXPProGuest"), Types._GuestOsIdentifiers, 10);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winXPPro64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winXPPro64Guest"), Types._GuestOsIdentifiers, 11);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetWebGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetWebGuest"), Types._GuestOsIdentifiers, 12);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetStandardGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetStandardGuest"), Types._GuestOsIdentifiers, 13);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetEnterpriseGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetEnterpriseGuest"), Types._GuestOsIdentifiers, 14);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetDatacenterGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetDatacenterGuest"), Types._GuestOsIdentifiers, 15);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetBusinessGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetBusinessGuest"), Types._GuestOsIdentifiers, 16);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetStandard64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetStandard64Guest"), Types._GuestOsIdentifiers, 17);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetEnterprise64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetEnterprise64Guest"), Types._GuestOsIdentifiers, 18);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winLonghornGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winLonghornGuest"), Types._GuestOsIdentifiers, 19);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winLonghorn64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winLonghorn64Guest"), Types._GuestOsIdentifiers, 20);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winNetDatacenter64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winNetDatacenter64Guest"), Types._GuestOsIdentifiers, 21);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winVistaGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winVistaGuest"), Types._GuestOsIdentifiers, 22);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__winVista64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("winVista64Guest"), Types._GuestOsIdentifiers, 23);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows7Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows7Guest"), Types._GuestOsIdentifiers, 24);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows7_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows7_64Guest"), Types._GuestOsIdentifiers, 25);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows7Server64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows7Server64Guest"), Types._GuestOsIdentifiers, 26);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows8Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows8Guest"), Types._GuestOsIdentifiers, 27);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows8_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows8_64Guest"), Types._GuestOsIdentifiers, 28);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows8Server64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows8Server64Guest"), Types._GuestOsIdentifiers, 29);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows9Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows9Guest"), Types._GuestOsIdentifiers, 30);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows9_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows9_64Guest"), Types._GuestOsIdentifiers, 31);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windows9Server64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windows9Server64Guest"), Types._GuestOsIdentifiers, 32);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__windowsHyperVGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("windowsHyperVGuest"), Types._GuestOsIdentifiers, 33);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__freebsdGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("freebsdGuest"), Types._GuestOsIdentifiers, 34);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__freebsd64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("freebsd64Guest"), Types._GuestOsIdentifiers, 35);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__redhatGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("redhatGuest"), Types._GuestOsIdentifiers, 36);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel2Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel2Guest"), Types._GuestOsIdentifiers, 37);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel3Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel3Guest"), Types._GuestOsIdentifiers, 38);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel3_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel3_64Guest"), Types._GuestOsIdentifiers, 39);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel4Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel4Guest"), Types._GuestOsIdentifiers, 40);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel4_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel4_64Guest"), Types._GuestOsIdentifiers, 41);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel5Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel5Guest"), Types._GuestOsIdentifiers, 42);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel5_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel5_64Guest"), Types._GuestOsIdentifiers, 43);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel6Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel6Guest"), Types._GuestOsIdentifiers, 44);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel6_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel6_64Guest"), Types._GuestOsIdentifiers, 45);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel7Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel7Guest"), Types._GuestOsIdentifiers, 46);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__rhel7_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("rhel7_64Guest"), Types._GuestOsIdentifiers, 47);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__centosGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("centosGuest"), Types._GuestOsIdentifiers, 48);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__centos64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("centos64Guest"), Types._GuestOsIdentifiers, 49);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__oracleLinuxGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("oracleLinuxGuest"), Types._GuestOsIdentifiers, 50);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__oracleLinux64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("oracleLinux64Guest"), Types._GuestOsIdentifiers, 51);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__suseGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("suseGuest"), Types._GuestOsIdentifiers, 52);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__suse64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("suse64Guest"), Types._GuestOsIdentifiers, 53);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__slesGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("slesGuest"), Types._GuestOsIdentifiers, 54);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sles64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sles64Guest"), Types._GuestOsIdentifiers, 55);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sles10Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sles10Guest"), Types._GuestOsIdentifiers, 56);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sles10_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sles10_64Guest"), Types._GuestOsIdentifiers, 57);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sles11Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sles11Guest"), Types._GuestOsIdentifiers, 58);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sles11_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sles11_64Guest"), Types._GuestOsIdentifiers, 59);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sles12Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sles12Guest"), Types._GuestOsIdentifiers, 60);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sles12_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sles12_64Guest"), Types._GuestOsIdentifiers, 61);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__nld9Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("nld9Guest"), Types._GuestOsIdentifiers, 62);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__oesGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("oesGuest"), Types._GuestOsIdentifiers, 63);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__sjdsGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("sjdsGuest"), Types._GuestOsIdentifiers, 64);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__mandrakeGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("mandrakeGuest"), Types._GuestOsIdentifiers, 65);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__mandrivaGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("mandrivaGuest"), Types._GuestOsIdentifiers, 66);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__mandriva64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("mandriva64Guest"), Types._GuestOsIdentifiers, 67);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__turboLinuxGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("turboLinuxGuest"), Types._GuestOsIdentifiers, 68);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__turboLinux64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("turboLinux64Guest"), Types._GuestOsIdentifiers, 69);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__ubuntuGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("ubuntuGuest"), Types._GuestOsIdentifiers, 70);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__ubuntu64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("ubuntu64Guest"), Types._GuestOsIdentifiers, 71);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian4Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian4Guest"), Types._GuestOsIdentifiers, 72);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian4_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian4_64Guest"), Types._GuestOsIdentifiers, 73);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian5Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian5Guest"), Types._GuestOsIdentifiers, 74);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian5_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian5_64Guest"), Types._GuestOsIdentifiers, 75);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian6Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian6Guest"), Types._GuestOsIdentifiers, 76);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian6_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian6_64Guest"), Types._GuestOsIdentifiers, 77);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian7Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian7Guest"), Types._GuestOsIdentifiers, 78);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian7_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian7_64Guest"), Types._GuestOsIdentifiers, 79);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian8Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian8Guest"), Types._GuestOsIdentifiers, 80);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__debian8_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("debian8_64Guest"), Types._GuestOsIdentifiers, 81);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__asianux3Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("asianux3Guest"), Types._GuestOsIdentifiers, 82);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__asianux3_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("asianux3_64Guest"), Types._GuestOsIdentifiers, 83);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__asianux4Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("asianux4Guest"), Types._GuestOsIdentifiers, 84);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__asianux4_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("asianux4_64Guest"), Types._GuestOsIdentifiers, 85);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__asianux5_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("asianux5_64Guest"), Types._GuestOsIdentifiers, 86);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__opensuseGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("opensuseGuest"), Types._GuestOsIdentifiers, 87);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__opensuse64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("opensuse64Guest"), Types._GuestOsIdentifiers, 88);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__fedoraGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("fedoraGuest"), Types._GuestOsIdentifiers, 89);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__fedora64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("fedora64Guest"), Types._GuestOsIdentifiers, 90);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__coreos64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("coreos64Guest"), Types._GuestOsIdentifiers, 91);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__other24xLinuxGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("other24xLinuxGuest"), Types._GuestOsIdentifiers, 92);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__other26xLinuxGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("other26xLinuxGuest"), Types._GuestOsIdentifiers, 93);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__otherLinuxGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("otherLinuxGuest"), Types._GuestOsIdentifiers, 94);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__other3xLinuxGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("other3xLinuxGuest"), Types._GuestOsIdentifiers, 95);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__genericLinuxGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("genericLinuxGuest"), Types._GuestOsIdentifiers, 96);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__other24xLinux64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("other24xLinux64Guest"), Types._GuestOsIdentifiers, 97);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__other26xLinux64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("other26xLinux64Guest"), Types._GuestOsIdentifiers, 98);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__other3xLinux64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("other3xLinux64Guest"), Types._GuestOsIdentifiers, 99);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__otherLinux64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("otherLinux64Guest"), Types._GuestOsIdentifiers, 100);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__solaris6Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("solaris6Guest"), Types._GuestOsIdentifiers, 101);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__solaris7Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("solaris7Guest"), Types._GuestOsIdentifiers, 102);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__solaris8Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("solaris8Guest"), Types._GuestOsIdentifiers, 103);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__solaris9Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("solaris9Guest"), Types._GuestOsIdentifiers, 104);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__solaris10Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("solaris10Guest"), Types._GuestOsIdentifiers, 105);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__solaris10_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("solaris10_64Guest"), Types._GuestOsIdentifiers, 106);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__solaris11_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("solaris11_64Guest"), Types._GuestOsIdentifiers, 107);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__os2Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("os2Guest"), Types._GuestOsIdentifiers, 108);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__eComStationGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("eComStationGuest"), Types._GuestOsIdentifiers, 109);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__eComStation2Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("eComStation2Guest"), Types._GuestOsIdentifiers, 110);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__netware4Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("netware4Guest"), Types._GuestOsIdentifiers, 111);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__netware5Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("netware5Guest"), Types._GuestOsIdentifiers, 112);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__netware6Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("netware6Guest"), Types._GuestOsIdentifiers, 113);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__openServer5Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("openServer5Guest"), Types._GuestOsIdentifiers, 114);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__openServer6Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("openServer6Guest"), Types._GuestOsIdentifiers, 115);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__unixWare7Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("unixWare7Guest"), Types._GuestOsIdentifiers, 116);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwinGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwinGuest"), Types._GuestOsIdentifiers, 117);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin64Guest"), Types._GuestOsIdentifiers, 118);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin10Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin10Guest"), Types._GuestOsIdentifiers, 119);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin10_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin10_64Guest"), Types._GuestOsIdentifiers, 120);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin11Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin11Guest"), Types._GuestOsIdentifiers, 121);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin11_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin11_64Guest"), Types._GuestOsIdentifiers, 122);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin12_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin12_64Guest"), Types._GuestOsIdentifiers, 123);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin13_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin13_64Guest"), Types._GuestOsIdentifiers, 124);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__darwin14_64Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("darwin14_64Guest"), Types._GuestOsIdentifiers, 125);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__vmkernelGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("vmkernelGuest"), Types._GuestOsIdentifiers, 126);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__vmkernel5Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("vmkernel5Guest"), Types._GuestOsIdentifiers, 127);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__vmkernel6Guest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("vmkernel6Guest"), Types._GuestOsIdentifiers, 128);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__otherGuest = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("otherGuest"), Types._GuestOsIdentifiers, 129);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _GuestOsIdentifiers__otherGuest64 = new EcoreExecutorEnumerationLiteral(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS.getEEnumLiteral("otherGuest64"), Types._GuestOsIdentifiers, 130);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _GuestOsIdentifiers = {
			_GuestOsIdentifiers__dosGuest,
			_GuestOsIdentifiers__win31Guest,
			_GuestOsIdentifiers__win95Guest,
			_GuestOsIdentifiers__win98Guest,
			_GuestOsIdentifiers__winMeGuest,
			_GuestOsIdentifiers__winNTGuest,
			_GuestOsIdentifiers__win2000ProGuest,
			_GuestOsIdentifiers__win2000ServGuest,
			_GuestOsIdentifiers__win2000AdvServGuest,
			_GuestOsIdentifiers__winXPHomeGuest,
			_GuestOsIdentifiers__winXPProGuest,
			_GuestOsIdentifiers__winXPPro64Guest,
			_GuestOsIdentifiers__winNetWebGuest,
			_GuestOsIdentifiers__winNetStandardGuest,
			_GuestOsIdentifiers__winNetEnterpriseGuest,
			_GuestOsIdentifiers__winNetDatacenterGuest,
			_GuestOsIdentifiers__winNetBusinessGuest,
			_GuestOsIdentifiers__winNetStandard64Guest,
			_GuestOsIdentifiers__winNetEnterprise64Guest,
			_GuestOsIdentifiers__winLonghornGuest,
			_GuestOsIdentifiers__winLonghorn64Guest,
			_GuestOsIdentifiers__winNetDatacenter64Guest,
			_GuestOsIdentifiers__winVistaGuest,
			_GuestOsIdentifiers__winVista64Guest,
			_GuestOsIdentifiers__windows7Guest,
			_GuestOsIdentifiers__windows7_64Guest,
			_GuestOsIdentifiers__windows7Server64Guest,
			_GuestOsIdentifiers__windows8Guest,
			_GuestOsIdentifiers__windows8_64Guest,
			_GuestOsIdentifiers__windows8Server64Guest,
			_GuestOsIdentifiers__windows9Guest,
			_GuestOsIdentifiers__windows9_64Guest,
			_GuestOsIdentifiers__windows9Server64Guest,
			_GuestOsIdentifiers__windowsHyperVGuest,
			_GuestOsIdentifiers__freebsdGuest,
			_GuestOsIdentifiers__freebsd64Guest,
			_GuestOsIdentifiers__redhatGuest,
			_GuestOsIdentifiers__rhel2Guest,
			_GuestOsIdentifiers__rhel3Guest,
			_GuestOsIdentifiers__rhel3_64Guest,
			_GuestOsIdentifiers__rhel4Guest,
			_GuestOsIdentifiers__rhel4_64Guest,
			_GuestOsIdentifiers__rhel5Guest,
			_GuestOsIdentifiers__rhel5_64Guest,
			_GuestOsIdentifiers__rhel6Guest,
			_GuestOsIdentifiers__rhel6_64Guest,
			_GuestOsIdentifiers__rhel7Guest,
			_GuestOsIdentifiers__rhel7_64Guest,
			_GuestOsIdentifiers__centosGuest,
			_GuestOsIdentifiers__centos64Guest,
			_GuestOsIdentifiers__oracleLinuxGuest,
			_GuestOsIdentifiers__oracleLinux64Guest,
			_GuestOsIdentifiers__suseGuest,
			_GuestOsIdentifiers__suse64Guest,
			_GuestOsIdentifiers__slesGuest,
			_GuestOsIdentifiers__sles64Guest,
			_GuestOsIdentifiers__sles10Guest,
			_GuestOsIdentifiers__sles10_64Guest,
			_GuestOsIdentifiers__sles11Guest,
			_GuestOsIdentifiers__sles11_64Guest,
			_GuestOsIdentifiers__sles12Guest,
			_GuestOsIdentifiers__sles12_64Guest,
			_GuestOsIdentifiers__nld9Guest,
			_GuestOsIdentifiers__oesGuest,
			_GuestOsIdentifiers__sjdsGuest,
			_GuestOsIdentifiers__mandrakeGuest,
			_GuestOsIdentifiers__mandrivaGuest,
			_GuestOsIdentifiers__mandriva64Guest,
			_GuestOsIdentifiers__turboLinuxGuest,
			_GuestOsIdentifiers__turboLinux64Guest,
			_GuestOsIdentifiers__ubuntuGuest,
			_GuestOsIdentifiers__ubuntu64Guest,
			_GuestOsIdentifiers__debian4Guest,
			_GuestOsIdentifiers__debian4_64Guest,
			_GuestOsIdentifiers__debian5Guest,
			_GuestOsIdentifiers__debian5_64Guest,
			_GuestOsIdentifiers__debian6Guest,
			_GuestOsIdentifiers__debian6_64Guest,
			_GuestOsIdentifiers__debian7Guest,
			_GuestOsIdentifiers__debian7_64Guest,
			_GuestOsIdentifiers__debian8Guest,
			_GuestOsIdentifiers__debian8_64Guest,
			_GuestOsIdentifiers__asianux3Guest,
			_GuestOsIdentifiers__asianux3_64Guest,
			_GuestOsIdentifiers__asianux4Guest,
			_GuestOsIdentifiers__asianux4_64Guest,
			_GuestOsIdentifiers__asianux5_64Guest,
			_GuestOsIdentifiers__opensuseGuest,
			_GuestOsIdentifiers__opensuse64Guest,
			_GuestOsIdentifiers__fedoraGuest,
			_GuestOsIdentifiers__fedora64Guest,
			_GuestOsIdentifiers__coreos64Guest,
			_GuestOsIdentifiers__other24xLinuxGuest,
			_GuestOsIdentifiers__other26xLinuxGuest,
			_GuestOsIdentifiers__otherLinuxGuest,
			_GuestOsIdentifiers__other3xLinuxGuest,
			_GuestOsIdentifiers__genericLinuxGuest,
			_GuestOsIdentifiers__other24xLinux64Guest,
			_GuestOsIdentifiers__other26xLinux64Guest,
			_GuestOsIdentifiers__other3xLinux64Guest,
			_GuestOsIdentifiers__otherLinux64Guest,
			_GuestOsIdentifiers__solaris6Guest,
			_GuestOsIdentifiers__solaris7Guest,
			_GuestOsIdentifiers__solaris8Guest,
			_GuestOsIdentifiers__solaris9Guest,
			_GuestOsIdentifiers__solaris10Guest,
			_GuestOsIdentifiers__solaris10_64Guest,
			_GuestOsIdentifiers__solaris11_64Guest,
			_GuestOsIdentifiers__os2Guest,
			_GuestOsIdentifiers__eComStationGuest,
			_GuestOsIdentifiers__eComStation2Guest,
			_GuestOsIdentifiers__netware4Guest,
			_GuestOsIdentifiers__netware5Guest,
			_GuestOsIdentifiers__netware6Guest,
			_GuestOsIdentifiers__openServer5Guest,
			_GuestOsIdentifiers__openServer6Guest,
			_GuestOsIdentifiers__unixWare7Guest,
			_GuestOsIdentifiers__darwinGuest,
			_GuestOsIdentifiers__darwin64Guest,
			_GuestOsIdentifiers__darwin10Guest,
			_GuestOsIdentifiers__darwin10_64Guest,
			_GuestOsIdentifiers__darwin11Guest,
			_GuestOsIdentifiers__darwin11_64Guest,
			_GuestOsIdentifiers__darwin12_64Guest,
			_GuestOsIdentifiers__darwin13_64Guest,
			_GuestOsIdentifiers__darwin14_64Guest,
			_GuestOsIdentifiers__vmkernelGuest,
			_GuestOsIdentifiers__vmkernel5Guest,
			_GuestOsIdentifiers__vmkernel6Guest,
			_GuestOsIdentifiers__otherGuest,
			_GuestOsIdentifiers__otherGuest64
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._GuestOsIdentifiers.initLiterals(_GuestOsIdentifiers);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of VmwareTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
