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
 *   /org.eclipse.cmf.occi.multicloud.elasticzabbix/model/elasticzabbix.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.elasticzabbix/model/elasticzabbix.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.elasticzabbix;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.monitoring.MonitoringTables;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * ElasticzabbixTables provides the dispatch tables for the elasticzabbix for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class ElasticzabbixTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ElasticzabbixPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticzabbix_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/multicloud/elasticzabbix/ecore", null, org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/monitoring/ecore", null, org.eclipse.cmf.occi.monitoring.MonitoringPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Collector = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Collector", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cpu = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticzabbix_s_ecore.getClassId("Cpu", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ram = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticzabbix_s_ecore.getClassId("Ram", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Supervisorapiconnect = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticzabbix_s_ecore.getClassId("Supervisorapiconnect", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Zabbixapiconnect = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticzabbix_s_ecore.getClassId("Zabbixapiconnect", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Zabbixcollector = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticzabbix_s_ecore.getClassId("Zabbixcollector", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Percent = org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticzabbix_s_ecore.getDataTypeId("Percent", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Cpu_c_c_appliesConstraint = "Cpu::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Ram_c_c_appliesConstraint = "Ram::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Supervisorapiconnect_c_c_appliesConstraint = "Supervisorapiconnect::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Zabbixapiconnect_c_c_appliesConstraint = "Zabbixapiconnect::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ElasticzabbixTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticzabbixTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Average = new EcoreExecutorType("Average", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cpu = new EcoreExecutorType(ElasticzabbixPackage.Literals.CPU, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PerSec = new EcoreExecutorType("PerSec", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Percent = new EcoreExecutorType("Percent", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ram = new EcoreExecutorType(ElasticzabbixPackage.Literals.RAM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Supervisorapiconnect = new EcoreExecutorType(ElasticzabbixPackage.Literals.SUPERVISORAPICONNECT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Temperature = new EcoreExecutorType("Temperature", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zabbixapiconnect = new EcoreExecutorType(ElasticzabbixPackage.Literals.ZABBIXAPICONNECT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zabbixcollector = new EcoreExecutorType(ElasticzabbixPackage.Literals.ZABBIXCOLLECTOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zabbixsensor = new EcoreExecutorType(ElasticzabbixPackage.Literals.ZABBIXSENSOR, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Average,
			_Cpu,
			_PerSec,
			_Percent,
			_Ram,
			_Supervisorapiconnect,
			_Temperature,
			_Zabbixapiconnect,
			_Zabbixcollector,
			_Zabbixsensor
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticzabbixTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Average__Average = new ExecutorFragment(Types._Average, ElasticzabbixTables.Types._Average);
		private static final /*@NonNull*/ ExecutorFragment _Average__OclAny = new ExecutorFragment(Types._Average, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Cpu__Cpu = new ExecutorFragment(Types._Cpu, ElasticzabbixTables.Types._Cpu);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__Metric = new ExecutorFragment(Types._Cpu, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__MixinBase = new ExecutorFragment(Types._Cpu, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__OclAny = new ExecutorFragment(Types._Cpu, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__OclElement = new ExecutorFragment(Types._Cpu, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _PerSec__OclAny = new ExecutorFragment(Types._PerSec, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PerSec__PerSec = new ExecutorFragment(Types._PerSec, ElasticzabbixTables.Types._PerSec);

		private static final /*@NonNull*/ ExecutorFragment _Percent__OclAny = new ExecutorFragment(Types._Percent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Percent__Percent = new ExecutorFragment(Types._Percent, ElasticzabbixTables.Types._Percent);

		private static final /*@NonNull*/ ExecutorFragment _Ram__Metric = new ExecutorFragment(Types._Ram, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Ram__MixinBase = new ExecutorFragment(Types._Ram, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ram__OclAny = new ExecutorFragment(Types._Ram, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ram__OclElement = new ExecutorFragment(Types._Ram, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ram__Ram = new ExecutorFragment(Types._Ram, ElasticzabbixTables.Types._Ram);

		private static final /*@NonNull*/ ExecutorFragment _Supervisorapiconnect__MixinBase = new ExecutorFragment(Types._Supervisorapiconnect, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Supervisorapiconnect__OclAny = new ExecutorFragment(Types._Supervisorapiconnect, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Supervisorapiconnect__OclElement = new ExecutorFragment(Types._Supervisorapiconnect, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Supervisorapiconnect__Supervisorapiconnect = new ExecutorFragment(Types._Supervisorapiconnect, ElasticzabbixTables.Types._Supervisorapiconnect);

		private static final /*@NonNull*/ ExecutorFragment _Temperature__OclAny = new ExecutorFragment(Types._Temperature, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Temperature__Temperature = new ExecutorFragment(Types._Temperature, ElasticzabbixTables.Types._Temperature);

		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__MixinBase = new ExecutorFragment(Types._Zabbixapiconnect, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__OclAny = new ExecutorFragment(Types._Zabbixapiconnect, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__OclElement = new ExecutorFragment(Types._Zabbixapiconnect, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__Supervisorapiconnect = new ExecutorFragment(Types._Zabbixapiconnect, ElasticzabbixTables.Types._Supervisorapiconnect);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__Zabbixapiconnect = new ExecutorFragment(Types._Zabbixapiconnect, ElasticzabbixTables.Types._Zabbixapiconnect);

		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Collector = new ExecutorFragment(Types._Zabbixcollector, MonitoringTables.Types._Collector);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Entity = new ExecutorFragment(Types._Zabbixcollector, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Link = new ExecutorFragment(Types._Zabbixcollector, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__OclAny = new ExecutorFragment(Types._Zabbixcollector, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__OclElement = new ExecutorFragment(Types._Zabbixcollector, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Zabbixcollector = new ExecutorFragment(Types._Zabbixcollector, ElasticzabbixTables.Types._Zabbixcollector);

		private static final /*@NonNull*/ ExecutorFragment _Zabbixsensor__Entity = new ExecutorFragment(Types._Zabbixsensor, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixsensor__OclAny = new ExecutorFragment(Types._Zabbixsensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixsensor__OclElement = new ExecutorFragment(Types._Zabbixsensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixsensor__Resource = new ExecutorFragment(Types._Zabbixsensor, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixsensor__Sensor = new ExecutorFragment(Types._Zabbixsensor, MonitoringTables.Types._Sensor);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixsensor__Zabbixsensor = new ExecutorFragment(Types._Zabbixsensor, ElasticzabbixTables.Types._Zabbixsensor);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticzabbixTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ElasticzabbixTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of ElasticzabbixTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Cpu__cpuUsed = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.CPU__CPU_USED, Types._Cpu, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cpu__loadAvg = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.CPU__LOAD_AVG, Types._Cpu, 1);

		public static final /*@NonNull*/ ExecutorProperty _Ram__free = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.RAM__FREE, Types._Ram, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ram__ramUsed = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.RAM__RAM_USED, Types._Ram, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ram__swap = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.RAM__SWAP, Types._Ram, 2);

		public static final /*@NonNull*/ ExecutorProperty _Supervisorapiconnect__httpApiAddress = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.SUPERVISORAPICONNECT__HTTP_API_ADDRESS, Types._Supervisorapiconnect, 0);
		public static final /*@NonNull*/ ExecutorProperty _Supervisorapiconnect__password = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.SUPERVISORAPICONNECT__PASSWORD, Types._Supervisorapiconnect, 1);
		public static final /*@NonNull*/ ExecutorProperty _Supervisorapiconnect__username = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.SUPERVISORAPICONNECT__USERNAME, Types._Supervisorapiconnect, 2);

		public static final /*@NonNull*/ ExecutorProperty _Zabbixapiconnect__hostGroupName = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.ZABBIXAPICONNECT__HOST_GROUP_NAME, Types._Zabbixapiconnect, 0);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixapiconnect__port = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.ZABBIXAPICONNECT__PORT, Types._Zabbixapiconnect, 1);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixapiconnect__templateName = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.ZABBIXAPICONNECT__TEMPLATE_NAME, Types._Zabbixapiconnect, 2);

		public static final /*@NonNull*/ ExecutorProperty _Zabbixcollector__instanceIp = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.ZABBIXCOLLECTOR__INSTANCE_IP, Types._Zabbixcollector, 0);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixcollector__instanceName = new EcoreExecutorProperty(ElasticzabbixPackage.Literals.ZABBIXCOLLECTOR__INSTANCE_NAME, Types._Zabbixcollector, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticzabbixTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Average =
		{
			Fragments._Average__OclAny /* 0 */,
			Fragments._Average__Average /* 1 */
		};
		private static final int /*@NonNull*/ [] __Average = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cpu =
		{
			Fragments._Cpu__OclAny /* 0 */,
			Fragments._Cpu__OclElement /* 1 */,
			Fragments._Cpu__MixinBase /* 2 */,
			Fragments._Cpu__Metric /* 3 */,
			Fragments._Cpu__Cpu /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cpu = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PerSec =
		{
			Fragments._PerSec__OclAny /* 0 */,
			Fragments._PerSec__PerSec /* 1 */
		};
		private static final int /*@NonNull*/ [] __PerSec = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Percent =
		{
			Fragments._Percent__OclAny /* 0 */,
			Fragments._Percent__Percent /* 1 */
		};
		private static final int /*@NonNull*/ [] __Percent = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ram =
		{
			Fragments._Ram__OclAny /* 0 */,
			Fragments._Ram__OclElement /* 1 */,
			Fragments._Ram__MixinBase /* 2 */,
			Fragments._Ram__Metric /* 3 */,
			Fragments._Ram__Ram /* 4 */
		};
		private static final int /*@NonNull*/ [] __Ram = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Supervisorapiconnect =
		{
			Fragments._Supervisorapiconnect__OclAny /* 0 */,
			Fragments._Supervisorapiconnect__OclElement /* 1 */,
			Fragments._Supervisorapiconnect__MixinBase /* 2 */,
			Fragments._Supervisorapiconnect__Supervisorapiconnect /* 3 */
		};
		private static final int /*@NonNull*/ [] __Supervisorapiconnect = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Temperature =
		{
			Fragments._Temperature__OclAny /* 0 */,
			Fragments._Temperature__Temperature /* 1 */
		};
		private static final int /*@NonNull*/ [] __Temperature = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Zabbixapiconnect =
		{
			Fragments._Zabbixapiconnect__OclAny /* 0 */,
			Fragments._Zabbixapiconnect__OclElement /* 1 */,
			Fragments._Zabbixapiconnect__MixinBase /* 2 */,
			Fragments._Zabbixapiconnect__Supervisorapiconnect /* 3 */,
			Fragments._Zabbixapiconnect__Zabbixapiconnect /* 4 */
		};
		private static final int /*@NonNull*/ [] __Zabbixapiconnect = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Zabbixcollector =
		{
			Fragments._Zabbixcollector__OclAny /* 0 */,
			Fragments._Zabbixcollector__OclElement /* 1 */,
			Fragments._Zabbixcollector__Entity /* 2 */,
			Fragments._Zabbixcollector__Link /* 3 */,
			Fragments._Zabbixcollector__Collector /* 4 */,
			Fragments._Zabbixcollector__Zabbixcollector /* 5 */
		};
		private static final int /*@NonNull*/ [] __Zabbixcollector = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Zabbixsensor =
		{
			Fragments._Zabbixsensor__OclAny /* 0 */,
			Fragments._Zabbixsensor__OclElement /* 1 */,
			Fragments._Zabbixsensor__Entity /* 2 */,
			Fragments._Zabbixsensor__Resource /* 3 */,
			Fragments._Zabbixsensor__Sensor /* 4 */,
			Fragments._Zabbixsensor__Zabbixsensor /* 5 */
		};
		private static final int /*@NonNull*/ [] __Zabbixsensor = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Average.initFragments(_Average, __Average);
			Types._Cpu.initFragments(_Cpu, __Cpu);
			Types._PerSec.initFragments(_PerSec, __PerSec);
			Types._Percent.initFragments(_Percent, __Percent);
			Types._Ram.initFragments(_Ram, __Ram);
			Types._Supervisorapiconnect.initFragments(_Supervisorapiconnect, __Supervisorapiconnect);
			Types._Temperature.initFragments(_Temperature, __Temperature);
			Types._Zabbixapiconnect.initFragments(_Zabbixapiconnect, __Zabbixapiconnect);
			Types._Zabbixcollector.initFragments(_Zabbixcollector, __Zabbixcollector);
			Types._Zabbixsensor.initFragments(_Zabbixsensor, __Zabbixsensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticzabbixTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Average__Average = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Average__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpu__Cpu = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpu__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpu__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpu__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpu__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PerSec__PerSec = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PerSec__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Percent__Percent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Percent__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ram__Ram = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ram__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ram__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ram__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ram__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Supervisorapiconnect__Supervisorapiconnect = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Supervisorapiconnect__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Supervisorapiconnect__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Supervisorapiconnect__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Temperature__Temperature = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Temperature__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixapiconnect__Zabbixapiconnect = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixapiconnect__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixapiconnect__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixapiconnect__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixapiconnect__Supervisorapiconnect = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixcollector__Zabbixcollector = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixcollector__Collector = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixcollector__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixcollector__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixcollector__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixcollector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixsensor__Zabbixsensor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixsensor__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixsensor__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixsensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixsensor__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zabbixsensor__Sensor = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Average__Average.initOperations(_Average__Average);
			Fragments._Average__OclAny.initOperations(_Average__OclAny);

			Fragments._Cpu__Cpu.initOperations(_Cpu__Cpu);
			Fragments._Cpu__Metric.initOperations(_Cpu__Metric);
			Fragments._Cpu__MixinBase.initOperations(_Cpu__MixinBase);
			Fragments._Cpu__OclAny.initOperations(_Cpu__OclAny);
			Fragments._Cpu__OclElement.initOperations(_Cpu__OclElement);

			Fragments._PerSec__OclAny.initOperations(_PerSec__OclAny);
			Fragments._PerSec__PerSec.initOperations(_PerSec__PerSec);

			Fragments._Percent__OclAny.initOperations(_Percent__OclAny);
			Fragments._Percent__Percent.initOperations(_Percent__Percent);

			Fragments._Ram__Metric.initOperations(_Ram__Metric);
			Fragments._Ram__MixinBase.initOperations(_Ram__MixinBase);
			Fragments._Ram__OclAny.initOperations(_Ram__OclAny);
			Fragments._Ram__OclElement.initOperations(_Ram__OclElement);
			Fragments._Ram__Ram.initOperations(_Ram__Ram);

			Fragments._Supervisorapiconnect__MixinBase.initOperations(_Supervisorapiconnect__MixinBase);
			Fragments._Supervisorapiconnect__OclAny.initOperations(_Supervisorapiconnect__OclAny);
			Fragments._Supervisorapiconnect__OclElement.initOperations(_Supervisorapiconnect__OclElement);
			Fragments._Supervisorapiconnect__Supervisorapiconnect.initOperations(_Supervisorapiconnect__Supervisorapiconnect);

			Fragments._Temperature__OclAny.initOperations(_Temperature__OclAny);
			Fragments._Temperature__Temperature.initOperations(_Temperature__Temperature);

			Fragments._Zabbixapiconnect__MixinBase.initOperations(_Zabbixapiconnect__MixinBase);
			Fragments._Zabbixapiconnect__OclAny.initOperations(_Zabbixapiconnect__OclAny);
			Fragments._Zabbixapiconnect__OclElement.initOperations(_Zabbixapiconnect__OclElement);
			Fragments._Zabbixapiconnect__Supervisorapiconnect.initOperations(_Zabbixapiconnect__Supervisorapiconnect);
			Fragments._Zabbixapiconnect__Zabbixapiconnect.initOperations(_Zabbixapiconnect__Zabbixapiconnect);

			Fragments._Zabbixcollector__Collector.initOperations(_Zabbixcollector__Collector);
			Fragments._Zabbixcollector__Entity.initOperations(_Zabbixcollector__Entity);
			Fragments._Zabbixcollector__Link.initOperations(_Zabbixcollector__Link);
			Fragments._Zabbixcollector__OclAny.initOperations(_Zabbixcollector__OclAny);
			Fragments._Zabbixcollector__OclElement.initOperations(_Zabbixcollector__OclElement);
			Fragments._Zabbixcollector__Zabbixcollector.initOperations(_Zabbixcollector__Zabbixcollector);

			Fragments._Zabbixsensor__Entity.initOperations(_Zabbixsensor__Entity);
			Fragments._Zabbixsensor__OclAny.initOperations(_Zabbixsensor__OclAny);
			Fragments._Zabbixsensor__OclElement.initOperations(_Zabbixsensor__OclElement);
			Fragments._Zabbixsensor__Resource.initOperations(_Zabbixsensor__Resource);
			Fragments._Zabbixsensor__Sensor.initOperations(_Zabbixsensor__Sensor);
			Fragments._Zabbixsensor__Zabbixsensor.initOperations(_Zabbixsensor__Zabbixsensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticzabbixTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Average = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cpu = {
			ElasticzabbixTables.Properties._Cpu__cpuUsed,
			ElasticzabbixTables.Properties._Cpu__loadAvg
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PerSec = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Percent = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ram = {
			ElasticzabbixTables.Properties._Ram__free,
			ElasticzabbixTables.Properties._Ram__ramUsed,
			ElasticzabbixTables.Properties._Ram__swap
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Supervisorapiconnect = {
			ElasticzabbixTables.Properties._Supervisorapiconnect__httpApiAddress,
			ElasticzabbixTables.Properties._Supervisorapiconnect__password,
			ElasticzabbixTables.Properties._Supervisorapiconnect__username
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Temperature = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixapiconnect = {
			ElasticzabbixTables.Properties._Zabbixapiconnect__hostGroupName,
			ElasticzabbixTables.Properties._Supervisorapiconnect__httpApiAddress,
			ElasticzabbixTables.Properties._Supervisorapiconnect__password,
			ElasticzabbixTables.Properties._Zabbixapiconnect__port,
			ElasticzabbixTables.Properties._Zabbixapiconnect__templateName,
			ElasticzabbixTables.Properties._Supervisorapiconnect__username
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixcollector = {
			ElasticzabbixTables.Properties._Zabbixcollector__instanceIp,
			ElasticzabbixTables.Properties._Zabbixcollector__instanceName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixsensor = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Average__Average.initProperties(_Average);
			Fragments._Cpu__Cpu.initProperties(_Cpu);
			Fragments._PerSec__PerSec.initProperties(_PerSec);
			Fragments._Percent__Percent.initProperties(_Percent);
			Fragments._Ram__Ram.initProperties(_Ram);
			Fragments._Supervisorapiconnect__Supervisorapiconnect.initProperties(_Supervisorapiconnect);
			Fragments._Temperature__Temperature.initProperties(_Temperature);
			Fragments._Zabbixapiconnect__Zabbixapiconnect.initProperties(_Zabbixapiconnect);
			Fragments._Zabbixcollector__Zabbixcollector.initProperties(_Zabbixcollector);
			Fragments._Zabbixsensor__Zabbixsensor.initProperties(_Zabbixsensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticzabbixTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of ElasticzabbixTables::EnumerationLiterals and all preceding sub-packages.
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
