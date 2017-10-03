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
 *   /org.eclipse.cmf.occi.multicloud.occimonitoring/model/occimonitoring.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.occimonitoring/model/occimonitoring.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.occimonitoring;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * OccimonitoringTables provides the dispatch tables for the occimonitoring for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OccimonitoringTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OccimonitoringPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_occimonitoring_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.eclipse.cmf.occi.multicloud.occimonitoring/ecore", null, org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cpuusage = org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_occimonitoring_s_ecore.getClassId("Cpuusage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Memoryusage = org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_occimonitoring_s_ecore.getClassId("Memoryusage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Metrics = org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_occimonitoring_s_ecore.getClassId("Metrics", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Zabbixinstance = org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_occimonitoring_s_ecore.getClassId("Zabbixinstance", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Double = org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_occimonitoring_s_ecore.getDataTypeId("Double", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Cpuusage_c_c_appliesConstraint = "Cpuusage::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Memoryusage_c_c_appliesConstraint = "Memoryusage::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Metrics_c_c_appliesConstraint = "Metrics::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OccimonitoringTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Cpuusage = new EcoreExecutorType(OccimonitoringPackage.Literals.CPUUSAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Double = new EcoreExecutorType("Double", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Hostgroup = new EcoreExecutorType(OccimonitoringPackage.Literals.HOSTGROUP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Memoryusage = new EcoreExecutorType(OccimonitoringPackage.Literals.MEMORYUSAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Metrics = new EcoreExecutorType(OccimonitoringPackage.Literals.METRICS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zabbixinstance = new EcoreExecutorType(OccimonitoringPackage.Literals.ZABBIXINSTANCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zabbixtemplate = new EcoreExecutorType(OccimonitoringPackage.Literals.ZABBIXTEMPLATE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Cpuusage,
			_Double,
			_Hostgroup,
			_Memoryusage,
			_Metrics,
			_Zabbixinstance,
			_Zabbixtemplate
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Cpuusage__Cpuusage = new ExecutorFragment(Types._Cpuusage, OccimonitoringTables.Types._Cpuusage);
		private static final /*@NonNull*/ ExecutorFragment _Cpuusage__Metrics = new ExecutorFragment(Types._Cpuusage, OccimonitoringTables.Types._Metrics);
		private static final /*@NonNull*/ ExecutorFragment _Cpuusage__MixinBase = new ExecutorFragment(Types._Cpuusage, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cpuusage__OclAny = new ExecutorFragment(Types._Cpuusage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cpuusage__OclElement = new ExecutorFragment(Types._Cpuusage, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Double__Double = new ExecutorFragment(Types._Double, OccimonitoringTables.Types._Double);
		private static final /*@NonNull*/ ExecutorFragment _Double__OclAny = new ExecutorFragment(Types._Double, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Hostgroup__Entity = new ExecutorFragment(Types._Hostgroup, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Hostgroup__Hostgroup = new ExecutorFragment(Types._Hostgroup, OccimonitoringTables.Types._Hostgroup);
		private static final /*@NonNull*/ ExecutorFragment _Hostgroup__OclAny = new ExecutorFragment(Types._Hostgroup, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Hostgroup__OclElement = new ExecutorFragment(Types._Hostgroup, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Hostgroup__Resource = new ExecutorFragment(Types._Hostgroup, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Memoryusage__Memoryusage = new ExecutorFragment(Types._Memoryusage, OccimonitoringTables.Types._Memoryusage);
		private static final /*@NonNull*/ ExecutorFragment _Memoryusage__Metrics = new ExecutorFragment(Types._Memoryusage, OccimonitoringTables.Types._Metrics);
		private static final /*@NonNull*/ ExecutorFragment _Memoryusage__MixinBase = new ExecutorFragment(Types._Memoryusage, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Memoryusage__OclAny = new ExecutorFragment(Types._Memoryusage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Memoryusage__OclElement = new ExecutorFragment(Types._Memoryusage, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Metrics__Metrics = new ExecutorFragment(Types._Metrics, OccimonitoringTables.Types._Metrics);
		private static final /*@NonNull*/ ExecutorFragment _Metrics__MixinBase = new ExecutorFragment(Types._Metrics, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Metrics__OclAny = new ExecutorFragment(Types._Metrics, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Metrics__OclElement = new ExecutorFragment(Types._Metrics, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Zabbixinstance__Entity = new ExecutorFragment(Types._Zabbixinstance, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixinstance__OclAny = new ExecutorFragment(Types._Zabbixinstance, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixinstance__OclElement = new ExecutorFragment(Types._Zabbixinstance, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixinstance__Resource = new ExecutorFragment(Types._Zabbixinstance, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixinstance__Zabbixinstance = new ExecutorFragment(Types._Zabbixinstance, OccimonitoringTables.Types._Zabbixinstance);

		private static final /*@NonNull*/ ExecutorFragment _Zabbixtemplate__Entity = new ExecutorFragment(Types._Zabbixtemplate, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixtemplate__OclAny = new ExecutorFragment(Types._Zabbixtemplate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixtemplate__OclElement = new ExecutorFragment(Types._Zabbixtemplate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixtemplate__Resource = new ExecutorFragment(Types._Zabbixtemplate, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixtemplate__Zabbixtemplate = new ExecutorFragment(Types._Zabbixtemplate, OccimonitoringTables.Types._Zabbixtemplate);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of OccimonitoringTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of OccimonitoringTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Cpuusage__cpuUsageCpuUsage = new EcoreExecutorProperty(OccimonitoringPackage.Literals.CPUUSAGE__CPU_USAGE_CPU_USAGE, Types._Cpuusage, 0);

		public static final /*@NonNull*/ ExecutorProperty _Hostgroup__hostgroupIdentifier = new EcoreExecutorProperty(OccimonitoringPackage.Literals.HOSTGROUP__HOSTGROUP_IDENTIFIER, Types._Hostgroup, 0);

		public static final /*@NonNull*/ ExecutorProperty _Memoryusage__memoryUsageMemUsage = new EcoreExecutorProperty(OccimonitoringPackage.Literals.MEMORYUSAGE__MEMORY_USAGE_MEM_USAGE, Types._Memoryusage, 0);

		public static final /*@NonNull*/ ExecutorProperty _Zabbixinstance__zabbixinstanceIdentifier = new EcoreExecutorProperty(OccimonitoringPackage.Literals.ZABBIXINSTANCE__ZABBIXINSTANCE_IDENTIFIER, Types._Zabbixinstance, 0);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixinstance__zabbixinstanceIp = new EcoreExecutorProperty(OccimonitoringPackage.Literals.ZABBIXINSTANCE__ZABBIXINSTANCE_IP, Types._Zabbixinstance, 1);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixinstance__zabbixinstancePort = new EcoreExecutorProperty(OccimonitoringPackage.Literals.ZABBIXINSTANCE__ZABBIXINSTANCE_PORT, Types._Zabbixinstance, 2);

		public static final /*@NonNull*/ ExecutorProperty _Zabbixtemplate__zabbixtemplateHostgid = new EcoreExecutorProperty(OccimonitoringPackage.Literals.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTGID, Types._Zabbixtemplate, 0);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixtemplate__zabbixtemplateHostsids = new EcoreExecutorProperty(OccimonitoringPackage.Literals.ZABBIXTEMPLATE__ZABBIXTEMPLATE_HOSTSIDS, Types._Zabbixtemplate, 1);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixtemplate__zabbixtemplateIdentifier = new EcoreExecutorProperty(OccimonitoringPackage.Literals.ZABBIXTEMPLATE__ZABBIXTEMPLATE_IDENTIFIER, Types._Zabbixtemplate, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cpuusage =
		{
			Fragments._Cpuusage__OclAny /* 0 */,
			Fragments._Cpuusage__OclElement /* 1 */,
			Fragments._Cpuusage__MixinBase /* 2 */,
			Fragments._Cpuusage__Metrics /* 3 */,
			Fragments._Cpuusage__Cpuusage /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cpuusage = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Double =
		{
			Fragments._Double__OclAny /* 0 */,
			Fragments._Double__Double /* 1 */
		};
		private static final int /*@NonNull*/ [] __Double = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Hostgroup =
		{
			Fragments._Hostgroup__OclAny /* 0 */,
			Fragments._Hostgroup__OclElement /* 1 */,
			Fragments._Hostgroup__Entity /* 2 */,
			Fragments._Hostgroup__Resource /* 3 */,
			Fragments._Hostgroup__Hostgroup /* 4 */
		};
		private static final int /*@NonNull*/ [] __Hostgroup = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Memoryusage =
		{
			Fragments._Memoryusage__OclAny /* 0 */,
			Fragments._Memoryusage__OclElement /* 1 */,
			Fragments._Memoryusage__MixinBase /* 2 */,
			Fragments._Memoryusage__Metrics /* 3 */,
			Fragments._Memoryusage__Memoryusage /* 4 */
		};
		private static final int /*@NonNull*/ [] __Memoryusage = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Metrics =
		{
			Fragments._Metrics__OclAny /* 0 */,
			Fragments._Metrics__OclElement /* 1 */,
			Fragments._Metrics__MixinBase /* 2 */,
			Fragments._Metrics__Metrics /* 3 */
		};
		private static final int /*@NonNull*/ [] __Metrics = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Zabbixinstance =
		{
			Fragments._Zabbixinstance__OclAny /* 0 */,
			Fragments._Zabbixinstance__OclElement /* 1 */,
			Fragments._Zabbixinstance__Entity /* 2 */,
			Fragments._Zabbixinstance__Resource /* 3 */,
			Fragments._Zabbixinstance__Zabbixinstance /* 4 */
		};
		private static final int /*@NonNull*/ [] __Zabbixinstance = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Zabbixtemplate =
		{
			Fragments._Zabbixtemplate__OclAny /* 0 */,
			Fragments._Zabbixtemplate__OclElement /* 1 */,
			Fragments._Zabbixtemplate__Entity /* 2 */,
			Fragments._Zabbixtemplate__Resource /* 3 */,
			Fragments._Zabbixtemplate__Zabbixtemplate /* 4 */
		};
		private static final int /*@NonNull*/ [] __Zabbixtemplate = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Cpuusage.initFragments(_Cpuusage, __Cpuusage);
			Types._Double.initFragments(_Double, __Double);
			Types._Hostgroup.initFragments(_Hostgroup, __Hostgroup);
			Types._Memoryusage.initFragments(_Memoryusage, __Memoryusage);
			Types._Metrics.initFragments(_Metrics, __Metrics);
			Types._Zabbixinstance.initFragments(_Zabbixinstance, __Zabbixinstance);
			Types._Zabbixtemplate.initFragments(_Zabbixtemplate, __Zabbixtemplate);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuusage__Cpuusage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuusage__Metrics = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuusage__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuusage__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuusage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Double__Double = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Double__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hostgroup__Hostgroup = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hostgroup__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hostgroup__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hostgroup__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hostgroup__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryusage__Memoryusage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryusage__Metrics = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryusage__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryusage__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryusage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metrics__Metrics = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metrics__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metrics__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metrics__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixinstance__Zabbixinstance = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixinstance__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixinstance__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixinstance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixinstance__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixtemplate__Zabbixtemplate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixtemplate__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixtemplate__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixtemplate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixtemplate__Resource = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cpuusage__Cpuusage.initOperations(_Cpuusage__Cpuusage);
			Fragments._Cpuusage__Metrics.initOperations(_Cpuusage__Metrics);
			Fragments._Cpuusage__MixinBase.initOperations(_Cpuusage__MixinBase);
			Fragments._Cpuusage__OclAny.initOperations(_Cpuusage__OclAny);
			Fragments._Cpuusage__OclElement.initOperations(_Cpuusage__OclElement);

			Fragments._Double__Double.initOperations(_Double__Double);
			Fragments._Double__OclAny.initOperations(_Double__OclAny);

			Fragments._Hostgroup__Entity.initOperations(_Hostgroup__Entity);
			Fragments._Hostgroup__Hostgroup.initOperations(_Hostgroup__Hostgroup);
			Fragments._Hostgroup__OclAny.initOperations(_Hostgroup__OclAny);
			Fragments._Hostgroup__OclElement.initOperations(_Hostgroup__OclElement);
			Fragments._Hostgroup__Resource.initOperations(_Hostgroup__Resource);

			Fragments._Memoryusage__Memoryusage.initOperations(_Memoryusage__Memoryusage);
			Fragments._Memoryusage__Metrics.initOperations(_Memoryusage__Metrics);
			Fragments._Memoryusage__MixinBase.initOperations(_Memoryusage__MixinBase);
			Fragments._Memoryusage__OclAny.initOperations(_Memoryusage__OclAny);
			Fragments._Memoryusage__OclElement.initOperations(_Memoryusage__OclElement);

			Fragments._Metrics__Metrics.initOperations(_Metrics__Metrics);
			Fragments._Metrics__MixinBase.initOperations(_Metrics__MixinBase);
			Fragments._Metrics__OclAny.initOperations(_Metrics__OclAny);
			Fragments._Metrics__OclElement.initOperations(_Metrics__OclElement);

			Fragments._Zabbixinstance__Entity.initOperations(_Zabbixinstance__Entity);
			Fragments._Zabbixinstance__OclAny.initOperations(_Zabbixinstance__OclAny);
			Fragments._Zabbixinstance__OclElement.initOperations(_Zabbixinstance__OclElement);
			Fragments._Zabbixinstance__Resource.initOperations(_Zabbixinstance__Resource);
			Fragments._Zabbixinstance__Zabbixinstance.initOperations(_Zabbixinstance__Zabbixinstance);

			Fragments._Zabbixtemplate__Entity.initOperations(_Zabbixtemplate__Entity);
			Fragments._Zabbixtemplate__OclAny.initOperations(_Zabbixtemplate__OclAny);
			Fragments._Zabbixtemplate__OclElement.initOperations(_Zabbixtemplate__OclElement);
			Fragments._Zabbixtemplate__Resource.initOperations(_Zabbixtemplate__Resource);
			Fragments._Zabbixtemplate__Zabbixtemplate.initOperations(_Zabbixtemplate__Zabbixtemplate);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cpuusage = {
			OccimonitoringTables.Properties._Cpuusage__cpuUsageCpuUsage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Double = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Hostgroup = {
			OccimonitoringTables.Properties._Hostgroup__hostgroupIdentifier
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Memoryusage = {
			OccimonitoringTables.Properties._Memoryusage__memoryUsageMemUsage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Metrics = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixinstance = {
			OccimonitoringTables.Properties._Zabbixinstance__zabbixinstanceIdentifier,
			OccimonitoringTables.Properties._Zabbixinstance__zabbixinstanceIp,
			OccimonitoringTables.Properties._Zabbixinstance__zabbixinstancePort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixtemplate = {
			OccimonitoringTables.Properties._Zabbixtemplate__zabbixtemplateHostgid,
			OccimonitoringTables.Properties._Zabbixtemplate__zabbixtemplateHostsids,
			OccimonitoringTables.Properties._Zabbixtemplate__zabbixtemplateIdentifier
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cpuusage__Cpuusage.initProperties(_Cpuusage);
			Fragments._Double__Double.initProperties(_Double);
			Fragments._Hostgroup__Hostgroup.initProperties(_Hostgroup);
			Fragments._Memoryusage__Memoryusage.initProperties(_Memoryusage);
			Fragments._Metrics__Metrics.initProperties(_Metrics);
			Fragments._Zabbixinstance__Zabbixinstance.initProperties(_Zabbixinstance);
			Fragments._Zabbixtemplate__Zabbixtemplate.initProperties(_Zabbixtemplate);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OccimonitoringTables::EnumerationLiterals and all preceding sub-packages.
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
