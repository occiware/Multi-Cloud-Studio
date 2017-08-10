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
 *   /org.eclipse.cmf.occi.multicloud.monitoring.zabbix/model/zabbix.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.monitoring.zabbix/model/zabbix.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix;

import cloudmonitoring.CloudmonitoringTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.monitoring.MonitoringTables;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * ZabbixTables provides the dispatch tables for the zabbix for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class ZabbixTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ZabbixPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_zabbix_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/multicloud/monitoring/zabbix/ecore", null, org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Zabbixapiconnect = org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_zabbix_s_ecore.getClassId("Zabbixapiconnect", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Zabbixcollector = org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_zabbix_s_ecore.getClassId("Zabbixcollector", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Zabbixapiconnect_c_c_appliesConstraint = "Zabbixapiconnect::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ZabbixTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ZabbixTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Zabbixapiconnect = new EcoreExecutorType(ZabbixPackage.Literals.ZABBIXAPICONNECT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zabbixcollector = new EcoreExecutorType(ZabbixPackage.Literals.ZABBIXCOLLECTOR, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Zabbixapiconnect,
			_Zabbixcollector
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ZabbixTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__MixinBase = new ExecutorFragment(Types._Zabbixapiconnect, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__OclAny = new ExecutorFragment(Types._Zabbixapiconnect, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__OclElement = new ExecutorFragment(Types._Zabbixapiconnect, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__Supervisorapiconnect = new ExecutorFragment(Types._Zabbixapiconnect, CloudmonitoringTables.Types._Supervisorapiconnect);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixapiconnect__Zabbixapiconnect = new ExecutorFragment(Types._Zabbixapiconnect, ZabbixTables.Types._Zabbixapiconnect);

		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Collector = new ExecutorFragment(Types._Zabbixcollector, MonitoringTables.Types._Collector);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Entity = new ExecutorFragment(Types._Zabbixcollector, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Link = new ExecutorFragment(Types._Zabbixcollector, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__OclAny = new ExecutorFragment(Types._Zabbixcollector, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__OclElement = new ExecutorFragment(Types._Zabbixcollector, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Zabbixcollector = new ExecutorFragment(Types._Zabbixcollector, ZabbixTables.Types._Zabbixcollector);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ZabbixTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ZabbixTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of ZabbixTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Zabbixapiconnect__hostGroupName = new EcoreExecutorProperty(ZabbixPackage.Literals.ZABBIXAPICONNECT__HOST_GROUP_NAME, Types._Zabbixapiconnect, 0);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixapiconnect__port = new EcoreExecutorProperty(ZabbixPackage.Literals.ZABBIXAPICONNECT__PORT, Types._Zabbixapiconnect, 1);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixapiconnect__templateName = new EcoreExecutorProperty(ZabbixPackage.Literals.ZABBIXAPICONNECT__TEMPLATE_NAME, Types._Zabbixapiconnect, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ZabbixTables::Properties and all preceding sub-packages.
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

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Zabbixapiconnect.initFragments(_Zabbixapiconnect, __Zabbixapiconnect);
			Types._Zabbixcollector.initFragments(_Zabbixcollector, __Zabbixcollector);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ZabbixTables::TypeFragments and all preceding sub-packages.
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
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

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ZabbixTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixapiconnect = {
			ZabbixTables.Properties._Zabbixapiconnect__hostGroupName,
			ZabbixTables.Properties._Zabbixapiconnect__port,
			ZabbixTables.Properties._Zabbixapiconnect__templateName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixcollector = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Zabbixapiconnect__Zabbixapiconnect.initProperties(_Zabbixapiconnect);
			Fragments._Zabbixcollector__Zabbixcollector.initProperties(_Zabbixcollector);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ZabbixTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of ZabbixTables::EnumerationLiterals and all preceding sub-packages.
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
