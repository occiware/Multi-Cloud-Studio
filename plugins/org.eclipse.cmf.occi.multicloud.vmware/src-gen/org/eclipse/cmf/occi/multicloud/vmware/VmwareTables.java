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
import org.eclipse.cmf.occi.multicloud.accounts.AccountsTables;
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
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instancevmware = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Instancevmware", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Linux = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Linux", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Macosx = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Macosx", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networkadapter = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Networkadapter", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Os_tpl_vmware = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Os_tpl_vmware", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ssh_user_data = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Ssh_user_data", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storagelinkvmware = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Storagelinkvmware", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storagevmware = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Storagevmware", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vcenteraccount = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vcenteraccount", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vcentercredential = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vcentercredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vmwarefolders = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vmwarefolders", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vswitch = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Vswitch", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Windows = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getClassId("Windows", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_GuestOsIdentifiers = org.eclipse.cmf.occi.multicloud.vmware.VmwareTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_vmware_s_ecore.getEnumerationId("GuestOsIdentifiers");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Linux_c_c_appliesConstraint = "Linux::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Macosx_c_c_appliesConstraint = "Macosx::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Networkadapter_c_c_sourceConstraint = "Networkadapter::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Networkadapter_c_c_targetConstraint = "Networkadapter::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Os_tpl_vmware_c_c_appliesConstraint = "Os_tpl_vmware::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Ssh_user_data_c_c_appliesConstraint = "Ssh_user_data::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Storagelinkvmware_c_c_sourceConstraint = "Storagelinkvmware::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Storagelinkvmware_c_c_targetConstraint = "Storagelinkvmware::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Vcentercredential_c_c_appliesConstraint = "Vcentercredential::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Vmwarefolders_c_c_appliesConstraint = "Vmwarefolders::appliesConstraint";
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

		public static final /*@NonNull*/ EcoreExecutorEnumeration _GuestOsIdentifiers = new EcoreExecutorEnumeration(VmwarePackage.Literals.GUEST_OS_IDENTIFIERS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instancevmware = new EcoreExecutorType(VmwarePackage.Literals.INSTANCEVMWARE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Linux = new EcoreExecutorType(VmwarePackage.Literals.LINUX, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Macosx = new EcoreExecutorType(VmwarePackage.Literals.MACOSX, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networkadapter = new EcoreExecutorType(VmwarePackage.Literals.NETWORKADAPTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Os_tpl_vmware = new EcoreExecutorType(VmwarePackage.Literals.OS_TPL_VMWARE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ssh_user_data = new EcoreExecutorType(VmwarePackage.Literals.SSH_USER_DATA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storagelinkvmware = new EcoreExecutorType(VmwarePackage.Literals.STORAGELINKVMWARE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storagevmware = new EcoreExecutorType(VmwarePackage.Literals.STORAGEVMWARE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vcenteraccount = new EcoreExecutorType(VmwarePackage.Literals.VCENTERACCOUNT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vcentercredential = new EcoreExecutorType(VmwarePackage.Literals.VCENTERCREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vmwarefolders = new EcoreExecutorType(VmwarePackage.Literals.VMWAREFOLDERS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vswitch = new EcoreExecutorType(VmwarePackage.Literals.VSWITCH, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Windows = new EcoreExecutorType(VmwarePackage.Literals.WINDOWS, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_GuestOsIdentifiers,
			_Instancevmware,
			_Linux,
			_Macosx,
			_Networkadapter,
			_Os_tpl_vmware,
			_Ssh_user_data,
			_Storagelinkvmware,
			_Storagevmware,
			_Vcenteraccount,
			_Vcentercredential,
			_Vmwarefolders,
			_Vswitch,
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

		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__GuestOsIdentifiers = new ExecutorFragment(Types._GuestOsIdentifiers, VmwareTables.Types._GuestOsIdentifiers);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclAny = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclElement = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclEnumeration = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _GuestOsIdentifiers__OclType = new ExecutorFragment(Types._GuestOsIdentifiers, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Instancevmware__Compute = new ExecutorFragment(Types._Instancevmware, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Instancevmware__Entity = new ExecutorFragment(Types._Instancevmware, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Instancevmware__Instancevmware = new ExecutorFragment(Types._Instancevmware, VmwareTables.Types._Instancevmware);
		private static final /*@NonNull*/ ExecutorFragment _Instancevmware__OclAny = new ExecutorFragment(Types._Instancevmware, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Instancevmware__OclElement = new ExecutorFragment(Types._Instancevmware, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Instancevmware__Resource = new ExecutorFragment(Types._Instancevmware, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Linux__Linux = new ExecutorFragment(Types._Linux, VmwareTables.Types._Linux);
		private static final /*@NonNull*/ ExecutorFragment _Linux__MixinBase = new ExecutorFragment(Types._Linux, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Linux__OclAny = new ExecutorFragment(Types._Linux, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Linux__OclElement = new ExecutorFragment(Types._Linux, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Linux__Os_tpl = new ExecutorFragment(Types._Linux, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Linux__Os_tpl_vmware = new ExecutorFragment(Types._Linux, VmwareTables.Types._Os_tpl_vmware);

		private static final /*@NonNull*/ ExecutorFragment _Macosx__Macosx = new ExecutorFragment(Types._Macosx, VmwareTables.Types._Macosx);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__MixinBase = new ExecutorFragment(Types._Macosx, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__OclAny = new ExecutorFragment(Types._Macosx, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__OclElement = new ExecutorFragment(Types._Macosx, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__Os_tpl = new ExecutorFragment(Types._Macosx, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Macosx__Os_tpl_vmware = new ExecutorFragment(Types._Macosx, VmwareTables.Types._Os_tpl_vmware);

		private static final /*@NonNull*/ ExecutorFragment _Networkadapter__Entity = new ExecutorFragment(Types._Networkadapter, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networkadapter__Link = new ExecutorFragment(Types._Networkadapter, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Networkadapter__Networkadapter = new ExecutorFragment(Types._Networkadapter, VmwareTables.Types._Networkadapter);
		private static final /*@NonNull*/ ExecutorFragment _Networkadapter__Networkinterface = new ExecutorFragment(Types._Networkadapter, InfrastructureTables.Types._Networkinterface);
		private static final /*@NonNull*/ ExecutorFragment _Networkadapter__OclAny = new ExecutorFragment(Types._Networkadapter, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networkadapter__OclElement = new ExecutorFragment(Types._Networkadapter, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Os_tpl_vmware__MixinBase = new ExecutorFragment(Types._Os_tpl_vmware, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Os_tpl_vmware__OclAny = new ExecutorFragment(Types._Os_tpl_vmware, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Os_tpl_vmware__OclElement = new ExecutorFragment(Types._Os_tpl_vmware, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Os_tpl_vmware__Os_tpl = new ExecutorFragment(Types._Os_tpl_vmware, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Os_tpl_vmware__Os_tpl_vmware = new ExecutorFragment(Types._Os_tpl_vmware, VmwareTables.Types._Os_tpl_vmware);

		private static final /*@NonNull*/ ExecutorFragment _Ssh_user_data__MixinBase = new ExecutorFragment(Types._Ssh_user_data, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ssh_user_data__OclAny = new ExecutorFragment(Types._Ssh_user_data, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ssh_user_data__OclElement = new ExecutorFragment(Types._Ssh_user_data, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ssh_user_data__Ssh_user_data = new ExecutorFragment(Types._Ssh_user_data, VmwareTables.Types._Ssh_user_data);
		private static final /*@NonNull*/ ExecutorFragment _Ssh_user_data__User_data = new ExecutorFragment(Types._Ssh_user_data, InfrastructureTables.Types._User_data);

		private static final /*@NonNull*/ ExecutorFragment _Storagelinkvmware__Entity = new ExecutorFragment(Types._Storagelinkvmware, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Storagelinkvmware__Link = new ExecutorFragment(Types._Storagelinkvmware, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Storagelinkvmware__OclAny = new ExecutorFragment(Types._Storagelinkvmware, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storagelinkvmware__OclElement = new ExecutorFragment(Types._Storagelinkvmware, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storagelinkvmware__Storagelink = new ExecutorFragment(Types._Storagelinkvmware, InfrastructureTables.Types._Storagelink);
		private static final /*@NonNull*/ ExecutorFragment _Storagelinkvmware__Storagelinkvmware = new ExecutorFragment(Types._Storagelinkvmware, VmwareTables.Types._Storagelinkvmware);

		private static final /*@NonNull*/ ExecutorFragment _Storagevmware__Entity = new ExecutorFragment(Types._Storagevmware, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Storagevmware__OclAny = new ExecutorFragment(Types._Storagevmware, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storagevmware__OclElement = new ExecutorFragment(Types._Storagevmware, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storagevmware__Resource = new ExecutorFragment(Types._Storagevmware, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Storagevmware__Storage = new ExecutorFragment(Types._Storagevmware, InfrastructureTables.Types._Storage);
		private static final /*@NonNull*/ ExecutorFragment _Storagevmware__Storagevmware = new ExecutorFragment(Types._Storagevmware, VmwareTables.Types._Storagevmware);

		private static final /*@NonNull*/ ExecutorFragment _Vcenteraccount__Cloudaccount = new ExecutorFragment(Types._Vcenteraccount, AccountsTables.Types._Cloudaccount);
		private static final /*@NonNull*/ ExecutorFragment _Vcenteraccount__Entity = new ExecutorFragment(Types._Vcenteraccount, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Vcenteraccount__OclAny = new ExecutorFragment(Types._Vcenteraccount, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vcenteraccount__OclElement = new ExecutorFragment(Types._Vcenteraccount, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vcenteraccount__Resource = new ExecutorFragment(Types._Vcenteraccount, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Vcenteraccount__Vcenteraccount = new ExecutorFragment(Types._Vcenteraccount, VmwareTables.Types._Vcenteraccount);

		private static final /*@NonNull*/ ExecutorFragment _Vcentercredential__Basiccredential = new ExecutorFragment(Types._Vcentercredential, AccountsTables.Types._Basiccredential);
		private static final /*@NonNull*/ ExecutorFragment _Vcentercredential__MixinBase = new ExecutorFragment(Types._Vcentercredential, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Vcentercredential__OclAny = new ExecutorFragment(Types._Vcentercredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vcentercredential__OclElement = new ExecutorFragment(Types._Vcentercredential, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vcentercredential__Vcentercredential = new ExecutorFragment(Types._Vcentercredential, VmwareTables.Types._Vcentercredential);

		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__MixinBase = new ExecutorFragment(Types._Vmwarefolders, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__OclAny = new ExecutorFragment(Types._Vmwarefolders, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__OclElement = new ExecutorFragment(Types._Vmwarefolders, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vmwarefolders__Vmwarefolders = new ExecutorFragment(Types._Vmwarefolders, VmwareTables.Types._Vmwarefolders);

		private static final /*@NonNull*/ ExecutorFragment _Vswitch__Entity = new ExecutorFragment(Types._Vswitch, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Vswitch__Network = new ExecutorFragment(Types._Vswitch, InfrastructureTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Vswitch__OclAny = new ExecutorFragment(Types._Vswitch, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vswitch__OclElement = new ExecutorFragment(Types._Vswitch, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vswitch__Resource = new ExecutorFragment(Types._Vswitch, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Vswitch__Vswitch = new ExecutorFragment(Types._Vswitch, VmwareTables.Types._Vswitch);

		private static final /*@NonNull*/ ExecutorFragment _Windows__MixinBase = new ExecutorFragment(Types._Windows, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Windows__OclAny = new ExecutorFragment(Types._Windows, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Windows__OclElement = new ExecutorFragment(Types._Windows, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Windows__Os_tpl = new ExecutorFragment(Types._Windows, InfrastructureTables.Types._Os_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Windows__Os_tpl_vmware = new ExecutorFragment(Types._Windows, VmwareTables.Types._Os_tpl_vmware);
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


		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__guestIpv4Address = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__GUEST_IPV4_ADDRESS, Types._Instancevmware, 0);
		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__guestIpv6Address = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__GUEST_IPV6_ADDRESS, Types._Instancevmware, 1);
		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__guestosid = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__GUESTOSID, Types._Instancevmware, 2);
		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__gueststate = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__GUESTSTATE, Types._Instancevmware, 3);
		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__imagename = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__IMAGENAME, Types._Instancevmware, 4);
		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__instanceId = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__INSTANCE_ID, Types._Instancevmware, 5);
		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__markedastemplate = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__MARKEDASTEMPLATE, Types._Instancevmware, 6);
		public static final /*@NonNull*/ ExecutorProperty _Instancevmware__vcpu = new EcoreExecutorProperty(VmwarePackage.Literals.INSTANCEVMWARE__VCPU, Types._Instancevmware, 7);

		public static final /*@NonNull*/ ExecutorProperty _Os_tpl_vmware__datastoreisopath = new EcoreExecutorProperty(VmwarePackage.Literals.OS_TPL_VMWARE__DATASTOREISOPATH, Types._Os_tpl_vmware, 0);
		public static final /*@NonNull*/ ExecutorProperty _Os_tpl_vmware__guestid = new EcoreExecutorProperty(VmwarePackage.Literals.OS_TPL_VMWARE__GUESTID, Types._Os_tpl_vmware, 1);

		public static final /*@NonNull*/ ExecutorProperty _Ssh_user_data__occiComputeUserdataFile = new EcoreExecutorProperty(VmwarePackage.Literals.SSH_USER_DATA__OCCI_COMPUTE_USERDATA_FILE, Types._Ssh_user_data, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ssh_user_data__password = new EcoreExecutorProperty(VmwarePackage.Literals.SSH_USER_DATA__PASSWORD, Types._Ssh_user_data, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ssh_user_data__user = new EcoreExecutorProperty(VmwarePackage.Literals.SSH_USER_DATA__USER, Types._Ssh_user_data, 2);

		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__clustername = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__CLUSTERNAME, Types._Vmwarefolders, 0);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__datacentername = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__DATACENTERNAME, Types._Vmwarefolders, 1);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__datastorename = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__DATASTORENAME, Types._Vmwarefolders, 2);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__hostsystemname = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__HOSTSYSTEMNAME, Types._Vmwarefolders, 3);
		public static final /*@NonNull*/ ExecutorProperty _Vmwarefolders__inventorypath = new EcoreExecutorProperty(VmwarePackage.Literals.VMWAREFOLDERS__INVENTORYPATH, Types._Vmwarefolders, 4);

		public static final /*@NonNull*/ ExecutorProperty _Vswitch__nbport = new EcoreExecutorProperty(VmwarePackage.Literals.VSWITCH__NBPORT, Types._Vswitch, 0);
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GuestOsIdentifiers =
			{
				Fragments._GuestOsIdentifiers__OclAny /* 0 */,
				Fragments._GuestOsIdentifiers__OclElement /* 1 */,
				Fragments._GuestOsIdentifiers__OclType /* 2 */,
				Fragments._GuestOsIdentifiers__OclEnumeration /* 3 */,
				Fragments._GuestOsIdentifiers__GuestOsIdentifiers /* 4 */
			};
		private static final int /*@NonNull*/ [] __GuestOsIdentifiers = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Instancevmware =
			{
				Fragments._Instancevmware__OclAny /* 0 */,
				Fragments._Instancevmware__OclElement /* 1 */,
				Fragments._Instancevmware__Entity /* 2 */,
				Fragments._Instancevmware__Resource /* 3 */,
				Fragments._Instancevmware__Compute /* 4 */,
				Fragments._Instancevmware__Instancevmware /* 5 */
			};
		private static final int /*@NonNull*/ [] __Instancevmware = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Linux =
			{
				Fragments._Linux__OclAny /* 0 */,
				Fragments._Linux__OclElement /* 1 */,
				Fragments._Linux__MixinBase /* 2 */,
				Fragments._Linux__Os_tpl /* 3 */,
				Fragments._Linux__Os_tpl_vmware /* 4 */,
				Fragments._Linux__Linux /* 5 */
			};
		private static final int /*@NonNull*/ [] __Linux = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Macosx =
			{
				Fragments._Macosx__OclAny /* 0 */,
				Fragments._Macosx__OclElement /* 1 */,
				Fragments._Macosx__MixinBase /* 2 */,
				Fragments._Macosx__Os_tpl /* 3 */,
				Fragments._Macosx__Os_tpl_vmware /* 4 */,
				Fragments._Macosx__Macosx /* 5 */
			};
		private static final int /*@NonNull*/ [] __Macosx = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networkadapter =
			{
				Fragments._Networkadapter__OclAny /* 0 */,
				Fragments._Networkadapter__OclElement /* 1 */,
				Fragments._Networkadapter__Entity /* 2 */,
				Fragments._Networkadapter__Link /* 3 */,
				Fragments._Networkadapter__Networkinterface /* 4 */,
				Fragments._Networkadapter__Networkadapter /* 5 */
			};
		private static final int /*@NonNull*/ [] __Networkadapter = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Os_tpl_vmware =
			{
				Fragments._Os_tpl_vmware__OclAny /* 0 */,
				Fragments._Os_tpl_vmware__OclElement /* 1 */,
				Fragments._Os_tpl_vmware__MixinBase /* 2 */,
				Fragments._Os_tpl_vmware__Os_tpl /* 3 */,
				Fragments._Os_tpl_vmware__Os_tpl_vmware /* 4 */
			};
		private static final int /*@NonNull*/ [] __Os_tpl_vmware = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ssh_user_data =
			{
				Fragments._Ssh_user_data__OclAny /* 0 */,
				Fragments._Ssh_user_data__OclElement /* 1 */,
				Fragments._Ssh_user_data__MixinBase /* 2 */,
				Fragments._Ssh_user_data__User_data /* 3 */,
				Fragments._Ssh_user_data__Ssh_user_data /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ssh_user_data = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Storagelinkvmware =
			{
				Fragments._Storagelinkvmware__OclAny /* 0 */,
				Fragments._Storagelinkvmware__OclElement /* 1 */,
				Fragments._Storagelinkvmware__Entity /* 2 */,
				Fragments._Storagelinkvmware__Link /* 3 */,
				Fragments._Storagelinkvmware__Storagelink /* 4 */,
				Fragments._Storagelinkvmware__Storagelinkvmware /* 5 */
			};
		private static final int /*@NonNull*/ [] __Storagelinkvmware = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Storagevmware =
			{
				Fragments._Storagevmware__OclAny /* 0 */,
				Fragments._Storagevmware__OclElement /* 1 */,
				Fragments._Storagevmware__Entity /* 2 */,
				Fragments._Storagevmware__Resource /* 3 */,
				Fragments._Storagevmware__Storage /* 4 */,
				Fragments._Storagevmware__Storagevmware /* 5 */
			};
		private static final int /*@NonNull*/ [] __Storagevmware = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vcenteraccount =
			{
				Fragments._Vcenteraccount__OclAny /* 0 */,
				Fragments._Vcenteraccount__OclElement /* 1 */,
				Fragments._Vcenteraccount__Entity /* 2 */,
				Fragments._Vcenteraccount__Resource /* 3 */,
				Fragments._Vcenteraccount__Cloudaccount /* 4 */,
				Fragments._Vcenteraccount__Vcenteraccount /* 5 */
			};
		private static final int /*@NonNull*/ [] __Vcenteraccount = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vcentercredential =
			{
				Fragments._Vcentercredential__OclAny /* 0 */,
				Fragments._Vcentercredential__OclElement /* 1 */,
				Fragments._Vcentercredential__MixinBase /* 2 */,
				Fragments._Vcentercredential__Basiccredential /* 3 */,
				Fragments._Vcentercredential__Vcentercredential /* 4 */
			};
		private static final int /*@NonNull*/ [] __Vcentercredential = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vmwarefolders =
			{
				Fragments._Vmwarefolders__OclAny /* 0 */,
				Fragments._Vmwarefolders__OclElement /* 1 */,
				Fragments._Vmwarefolders__MixinBase /* 2 */,
				Fragments._Vmwarefolders__Vmwarefolders /* 3 */
			};
		private static final int /*@NonNull*/ [] __Vmwarefolders = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vswitch =
			{
				Fragments._Vswitch__OclAny /* 0 */,
				Fragments._Vswitch__OclElement /* 1 */,
				Fragments._Vswitch__Entity /* 2 */,
				Fragments._Vswitch__Resource /* 3 */,
				Fragments._Vswitch__Network /* 4 */,
				Fragments._Vswitch__Vswitch /* 5 */
			};
		private static final int /*@NonNull*/ [] __Vswitch = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Windows =
			{
				Fragments._Windows__OclAny /* 0 */,
				Fragments._Windows__OclElement /* 1 */,
				Fragments._Windows__MixinBase /* 2 */,
				Fragments._Windows__Os_tpl /* 3 */,
				Fragments._Windows__Os_tpl_vmware /* 4 */,
				Fragments._Windows__Windows /* 5 */
			};
		private static final int /*@NonNull*/ [] __Windows = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._GuestOsIdentifiers.initFragments(_GuestOsIdentifiers, __GuestOsIdentifiers);
			Types._Instancevmware.initFragments(_Instancevmware, __Instancevmware);
			Types._Linux.initFragments(_Linux, __Linux);
			Types._Macosx.initFragments(_Macosx, __Macosx);
			Types._Networkadapter.initFragments(_Networkadapter, __Networkadapter);
			Types._Os_tpl_vmware.initFragments(_Os_tpl_vmware, __Os_tpl_vmware);
			Types._Ssh_user_data.initFragments(_Ssh_user_data, __Ssh_user_data);
			Types._Storagelinkvmware.initFragments(_Storagelinkvmware, __Storagelinkvmware);
			Types._Storagevmware.initFragments(_Storagevmware, __Storagevmware);
			Types._Vcenteraccount.initFragments(_Vcenteraccount, __Vcenteraccount);
			Types._Vcentercredential.initFragments(_Vcentercredential, __Vcentercredential);
			Types._Vmwarefolders.initFragments(_Vmwarefolders, __Vmwarefolders);
			Types._Vswitch.initFragments(_Vswitch, __Vswitch);
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevmware__Instancevmware = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevmware__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevmware__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevmware__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevmware__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevmware__Resource = {};

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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linux__Os_tpl_vmware = {};

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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Macosx__Os_tpl_vmware = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkadapter__Networkadapter = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkadapter__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkadapter__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkadapter__Networkinterface = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkadapter__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkadapter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl_vmware__Os_tpl_vmware = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl_vmware__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl_vmware__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl_vmware__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl_vmware__Os_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_user_data__Ssh_user_data = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_user_data__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_user_data__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_user_data__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_user_data__User_data = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelinkvmware__Storagelinkvmware = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelinkvmware__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelinkvmware__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelinkvmware__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelinkvmware__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelinkvmware__Storagelink = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagevmware__Storagevmware = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagevmware__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagevmware__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagevmware__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagevmware__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagevmware__Storage = {
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcenteraccount__Vcenteraccount = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcenteraccount__Cloudaccount = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcenteraccount__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcenteraccount__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcenteraccount__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcenteraccount__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcentercredential__Vcentercredential = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcentercredential__Basiccredential = {
			AccountsTables.Operations._Basiccredential__updatepassword /* updatepassword() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcentercredential__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcentercredential__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vcentercredential__OclElement = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitch__Vswitch = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitch__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitch__Network = {
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__up /* up() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitch__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vswitch__Resource = {};

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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Windows__Os_tpl_vmware = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._GuestOsIdentifiers__GuestOsIdentifiers.initOperations(_GuestOsIdentifiers__GuestOsIdentifiers);
			Fragments._GuestOsIdentifiers__OclAny.initOperations(_GuestOsIdentifiers__OclAny);
			Fragments._GuestOsIdentifiers__OclElement.initOperations(_GuestOsIdentifiers__OclElement);
			Fragments._GuestOsIdentifiers__OclEnumeration.initOperations(_GuestOsIdentifiers__OclEnumeration);
			Fragments._GuestOsIdentifiers__OclType.initOperations(_GuestOsIdentifiers__OclType);

			Fragments._Instancevmware__Compute.initOperations(_Instancevmware__Compute);
			Fragments._Instancevmware__Entity.initOperations(_Instancevmware__Entity);
			Fragments._Instancevmware__Instancevmware.initOperations(_Instancevmware__Instancevmware);
			Fragments._Instancevmware__OclAny.initOperations(_Instancevmware__OclAny);
			Fragments._Instancevmware__OclElement.initOperations(_Instancevmware__OclElement);
			Fragments._Instancevmware__Resource.initOperations(_Instancevmware__Resource);

			Fragments._Linux__Linux.initOperations(_Linux__Linux);
			Fragments._Linux__MixinBase.initOperations(_Linux__MixinBase);
			Fragments._Linux__OclAny.initOperations(_Linux__OclAny);
			Fragments._Linux__OclElement.initOperations(_Linux__OclElement);
			Fragments._Linux__Os_tpl.initOperations(_Linux__Os_tpl);
			Fragments._Linux__Os_tpl_vmware.initOperations(_Linux__Os_tpl_vmware);

			Fragments._Macosx__Macosx.initOperations(_Macosx__Macosx);
			Fragments._Macosx__MixinBase.initOperations(_Macosx__MixinBase);
			Fragments._Macosx__OclAny.initOperations(_Macosx__OclAny);
			Fragments._Macosx__OclElement.initOperations(_Macosx__OclElement);
			Fragments._Macosx__Os_tpl.initOperations(_Macosx__Os_tpl);
			Fragments._Macosx__Os_tpl_vmware.initOperations(_Macosx__Os_tpl_vmware);

			Fragments._Networkadapter__Entity.initOperations(_Networkadapter__Entity);
			Fragments._Networkadapter__Link.initOperations(_Networkadapter__Link);
			Fragments._Networkadapter__Networkadapter.initOperations(_Networkadapter__Networkadapter);
			Fragments._Networkadapter__Networkinterface.initOperations(_Networkadapter__Networkinterface);
			Fragments._Networkadapter__OclAny.initOperations(_Networkadapter__OclAny);
			Fragments._Networkadapter__OclElement.initOperations(_Networkadapter__OclElement);

			Fragments._Os_tpl_vmware__MixinBase.initOperations(_Os_tpl_vmware__MixinBase);
			Fragments._Os_tpl_vmware__OclAny.initOperations(_Os_tpl_vmware__OclAny);
			Fragments._Os_tpl_vmware__OclElement.initOperations(_Os_tpl_vmware__OclElement);
			Fragments._Os_tpl_vmware__Os_tpl.initOperations(_Os_tpl_vmware__Os_tpl);
			Fragments._Os_tpl_vmware__Os_tpl_vmware.initOperations(_Os_tpl_vmware__Os_tpl_vmware);

			Fragments._Ssh_user_data__MixinBase.initOperations(_Ssh_user_data__MixinBase);
			Fragments._Ssh_user_data__OclAny.initOperations(_Ssh_user_data__OclAny);
			Fragments._Ssh_user_data__OclElement.initOperations(_Ssh_user_data__OclElement);
			Fragments._Ssh_user_data__Ssh_user_data.initOperations(_Ssh_user_data__Ssh_user_data);
			Fragments._Ssh_user_data__User_data.initOperations(_Ssh_user_data__User_data);

			Fragments._Storagelinkvmware__Entity.initOperations(_Storagelinkvmware__Entity);
			Fragments._Storagelinkvmware__Link.initOperations(_Storagelinkvmware__Link);
			Fragments._Storagelinkvmware__OclAny.initOperations(_Storagelinkvmware__OclAny);
			Fragments._Storagelinkvmware__OclElement.initOperations(_Storagelinkvmware__OclElement);
			Fragments._Storagelinkvmware__Storagelink.initOperations(_Storagelinkvmware__Storagelink);
			Fragments._Storagelinkvmware__Storagelinkvmware.initOperations(_Storagelinkvmware__Storagelinkvmware);

			Fragments._Storagevmware__Entity.initOperations(_Storagevmware__Entity);
			Fragments._Storagevmware__OclAny.initOperations(_Storagevmware__OclAny);
			Fragments._Storagevmware__OclElement.initOperations(_Storagevmware__OclElement);
			Fragments._Storagevmware__Resource.initOperations(_Storagevmware__Resource);
			Fragments._Storagevmware__Storage.initOperations(_Storagevmware__Storage);
			Fragments._Storagevmware__Storagevmware.initOperations(_Storagevmware__Storagevmware);

			Fragments._Vcenteraccount__Cloudaccount.initOperations(_Vcenteraccount__Cloudaccount);
			Fragments._Vcenteraccount__Entity.initOperations(_Vcenteraccount__Entity);
			Fragments._Vcenteraccount__OclAny.initOperations(_Vcenteraccount__OclAny);
			Fragments._Vcenteraccount__OclElement.initOperations(_Vcenteraccount__OclElement);
			Fragments._Vcenteraccount__Resource.initOperations(_Vcenteraccount__Resource);
			Fragments._Vcenteraccount__Vcenteraccount.initOperations(_Vcenteraccount__Vcenteraccount);

			Fragments._Vcentercredential__Basiccredential.initOperations(_Vcentercredential__Basiccredential);
			Fragments._Vcentercredential__MixinBase.initOperations(_Vcentercredential__MixinBase);
			Fragments._Vcentercredential__OclAny.initOperations(_Vcentercredential__OclAny);
			Fragments._Vcentercredential__OclElement.initOperations(_Vcentercredential__OclElement);
			Fragments._Vcentercredential__Vcentercredential.initOperations(_Vcentercredential__Vcentercredential);

			Fragments._Vmwarefolders__MixinBase.initOperations(_Vmwarefolders__MixinBase);
			Fragments._Vmwarefolders__OclAny.initOperations(_Vmwarefolders__OclAny);
			Fragments._Vmwarefolders__OclElement.initOperations(_Vmwarefolders__OclElement);
			Fragments._Vmwarefolders__Vmwarefolders.initOperations(_Vmwarefolders__Vmwarefolders);

			Fragments._Vswitch__Entity.initOperations(_Vswitch__Entity);
			Fragments._Vswitch__Network.initOperations(_Vswitch__Network);
			Fragments._Vswitch__OclAny.initOperations(_Vswitch__OclAny);
			Fragments._Vswitch__OclElement.initOperations(_Vswitch__OclElement);
			Fragments._Vswitch__Resource.initOperations(_Vswitch__Resource);
			Fragments._Vswitch__Vswitch.initOperations(_Vswitch__Vswitch);

			Fragments._Windows__MixinBase.initOperations(_Windows__MixinBase);
			Fragments._Windows__OclAny.initOperations(_Windows__OclAny);
			Fragments._Windows__OclElement.initOperations(_Windows__OclElement);
			Fragments._Windows__Os_tpl.initOperations(_Windows__Os_tpl);
			Fragments._Windows__Os_tpl_vmware.initOperations(_Windows__Os_tpl_vmware);
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GuestOsIdentifiers = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instancevmware = {
			VmwareTables.Properties._Instancevmware__guestIpv4Address,
			VmwareTables.Properties._Instancevmware__guestIpv6Address,
			VmwareTables.Properties._Instancevmware__guestosid,
			VmwareTables.Properties._Instancevmware__gueststate,
			VmwareTables.Properties._Instancevmware__imagename,
			VmwareTables.Properties._Instancevmware__instanceId,
			VmwareTables.Properties._Instancevmware__markedastemplate,
			VmwareTables.Properties._Instancevmware__vcpu
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Linux = {
			VmwareTables.Properties._Os_tpl_vmware__datastoreisopath,
			VmwareTables.Properties._Os_tpl_vmware__guestid
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Macosx = {
			VmwareTables.Properties._Os_tpl_vmware__datastoreisopath,
			VmwareTables.Properties._Os_tpl_vmware__guestid
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networkadapter = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Os_tpl_vmware = {
			VmwareTables.Properties._Os_tpl_vmware__datastoreisopath,
			VmwareTables.Properties._Os_tpl_vmware__guestid
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ssh_user_data = {
			VmwareTables.Properties._Ssh_user_data__occiComputeUserdataFile,
			VmwareTables.Properties._Ssh_user_data__password,
			VmwareTables.Properties._Ssh_user_data__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Storagelinkvmware = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Storagevmware = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vcenteraccount = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vcentercredential = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vmwarefolders = {
			VmwareTables.Properties._Vmwarefolders__clustername,
			VmwareTables.Properties._Vmwarefolders__datacentername,
			VmwareTables.Properties._Vmwarefolders__datastorename,
			VmwareTables.Properties._Vmwarefolders__hostsystemname,
			VmwareTables.Properties._Vmwarefolders__inventorypath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vswitch = {
			VmwareTables.Properties._Vswitch__nbport
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Windows = {
			VmwareTables.Properties._Os_tpl_vmware__datastoreisopath,
			VmwareTables.Properties._Os_tpl_vmware__guestid
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._GuestOsIdentifiers__GuestOsIdentifiers.initProperties(_GuestOsIdentifiers);
			Fragments._Instancevmware__Instancevmware.initProperties(_Instancevmware);
			Fragments._Linux__Linux.initProperties(_Linux);
			Fragments._Macosx__Macosx.initProperties(_Macosx);
			Fragments._Networkadapter__Networkadapter.initProperties(_Networkadapter);
			Fragments._Os_tpl_vmware__Os_tpl_vmware.initProperties(_Os_tpl_vmware);
			Fragments._Ssh_user_data__Ssh_user_data.initProperties(_Ssh_user_data);
			Fragments._Storagelinkvmware__Storagelinkvmware.initProperties(_Storagelinkvmware);
			Fragments._Storagevmware__Storagevmware.initProperties(_Storagevmware);
			Fragments._Vcenteraccount__Vcenteraccount.initProperties(_Vcenteraccount);
			Fragments._Vcentercredential__Vcentercredential.initProperties(_Vcentercredential);
			Fragments._Vmwarefolders__Vmwarefolders.initProperties(_Vmwarefolders);
			Fragments._Vswitch__Vswitch.initProperties(_Vswitch);
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
