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
 *   /org.eclipse.cmf.occi.multicloud.elasticOCCI/model/elasticocci.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.elasticOCCI/model/elasticocci.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.elasticocci;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
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
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * ElasticocciTables provides the dispatch tables for the elasticocci for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class ElasticocciTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ElasticocciPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/multicloud/elasticOCCI/ecore", null, org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Elasticcontroller = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getClassId("Elasticcontroller", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Elasticlink = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getClassId("Elasticlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Strategy = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getClassId("Strategy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Strategycpu = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getClassId("Strategycpu", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Strategymemory = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getClassId("Strategymemory", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_DateType = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getDataTypeId("DateType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Double = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getDataTypeId("Double", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_DirectionType = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getEnumerationId("DirectionType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ModeType = org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_elasticOCCI_s_ecore.getEnumerationId("ModeType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Elasticlink_c_c_targetConstraint = "Elasticlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Strategy_c_c_appliesConstraint = "Strategy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Strategycpu_c_c_appliesConstraint = "Strategycpu::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Strategymemory_c_c_appliesConstraint = "Strategymemory::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ElasticocciTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _DateType = new EcoreExecutorType("DateType", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _DirectionType = new EcoreExecutorEnumeration(ElasticocciPackage.Literals.DIRECTION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Double = new EcoreExecutorType("Double", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Elasticcontroller = new EcoreExecutorType(ElasticocciPackage.Literals.ELASTICCONTROLLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Elasticlink = new EcoreExecutorType(ElasticocciPackage.Literals.ELASTICLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ModeType = new EcoreExecutorEnumeration(ElasticocciPackage.Literals.MODE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Strategy = new EcoreExecutorType(ElasticocciPackage.Literals.STRATEGY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Strategycompute = new EcoreExecutorType(ElasticocciPackage.Literals.STRATEGYCOMPUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Strategycpu = new EcoreExecutorType(ElasticocciPackage.Literals.STRATEGYCPU, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Strategymemory = new EcoreExecutorType(ElasticocciPackage.Literals.STRATEGYMEMORY, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_DateType,
			_DirectionType,
			_Double,
			_Elasticcontroller,
			_Elasticlink,
			_ModeType,
			_Strategy,
			_Strategycompute,
			_Strategycpu,
			_Strategymemory
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _DateType__DateType = new ExecutorFragment(Types._DateType, ElasticocciTables.Types._DateType);
		private static final /*@NonNull*/ ExecutorFragment _DateType__OclAny = new ExecutorFragment(Types._DateType, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _DirectionType__DirectionType = new ExecutorFragment(Types._DirectionType, ElasticocciTables.Types._DirectionType);
		private static final /*@NonNull*/ ExecutorFragment _DirectionType__OclAny = new ExecutorFragment(Types._DirectionType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DirectionType__OclElement = new ExecutorFragment(Types._DirectionType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _DirectionType__OclEnumeration = new ExecutorFragment(Types._DirectionType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _DirectionType__OclType = new ExecutorFragment(Types._DirectionType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Double__Double = new ExecutorFragment(Types._Double, ElasticocciTables.Types._Double);
		private static final /*@NonNull*/ ExecutorFragment _Double__OclAny = new ExecutorFragment(Types._Double, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Elasticcontroller__Elasticcontroller = new ExecutorFragment(Types._Elasticcontroller, ElasticocciTables.Types._Elasticcontroller);
		private static final /*@NonNull*/ ExecutorFragment _Elasticcontroller__Entity = new ExecutorFragment(Types._Elasticcontroller, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Elasticcontroller__OclAny = new ExecutorFragment(Types._Elasticcontroller, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Elasticcontroller__OclElement = new ExecutorFragment(Types._Elasticcontroller, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Elasticcontroller__Resource = new ExecutorFragment(Types._Elasticcontroller, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Elasticlink = new ExecutorFragment(Types._Elasticlink, ElasticocciTables.Types._Elasticlink);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Entity = new ExecutorFragment(Types._Elasticlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Link = new ExecutorFragment(Types._Elasticlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__OclAny = new ExecutorFragment(Types._Elasticlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__OclElement = new ExecutorFragment(Types._Elasticlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ModeType__ModeType = new ExecutorFragment(Types._ModeType, ElasticocciTables.Types._ModeType);
		private static final /*@NonNull*/ ExecutorFragment _ModeType__OclAny = new ExecutorFragment(Types._ModeType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ModeType__OclElement = new ExecutorFragment(Types._ModeType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ModeType__OclEnumeration = new ExecutorFragment(Types._ModeType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ModeType__OclType = new ExecutorFragment(Types._ModeType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Strategy__MixinBase = new ExecutorFragment(Types._Strategy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__OclAny = new ExecutorFragment(Types._Strategy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__OclElement = new ExecutorFragment(Types._Strategy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__Strategy = new ExecutorFragment(Types._Strategy, ElasticocciTables.Types._Strategy);

		private static final /*@NonNull*/ ExecutorFragment _Strategycompute__MixinBase = new ExecutorFragment(Types._Strategycompute, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Strategycompute__OclAny = new ExecutorFragment(Types._Strategycompute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Strategycompute__OclElement = new ExecutorFragment(Types._Strategycompute, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Strategycompute__Strategy = new ExecutorFragment(Types._Strategycompute, ElasticocciTables.Types._Strategy);
		private static final /*@NonNull*/ ExecutorFragment _Strategycompute__Strategycompute = new ExecutorFragment(Types._Strategycompute, ElasticocciTables.Types._Strategycompute);

		private static final /*@NonNull*/ ExecutorFragment _Strategycpu__MixinBase = new ExecutorFragment(Types._Strategycpu, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Strategycpu__OclAny = new ExecutorFragment(Types._Strategycpu, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Strategycpu__OclElement = new ExecutorFragment(Types._Strategycpu, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Strategycpu__Strategy = new ExecutorFragment(Types._Strategycpu, ElasticocciTables.Types._Strategy);
		private static final /*@NonNull*/ ExecutorFragment _Strategycpu__Strategycompute = new ExecutorFragment(Types._Strategycpu, ElasticocciTables.Types._Strategycompute);
		private static final /*@NonNull*/ ExecutorFragment _Strategycpu__Strategycpu = new ExecutorFragment(Types._Strategycpu, ElasticocciTables.Types._Strategycpu);

		private static final /*@NonNull*/ ExecutorFragment _Strategymemory__MixinBase = new ExecutorFragment(Types._Strategymemory, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Strategymemory__OclAny = new ExecutorFragment(Types._Strategymemory, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Strategymemory__OclElement = new ExecutorFragment(Types._Strategymemory, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Strategymemory__Strategy = new ExecutorFragment(Types._Strategymemory, ElasticocciTables.Types._Strategy);
		private static final /*@NonNull*/ ExecutorFragment _Strategymemory__Strategycompute = new ExecutorFragment(Types._Strategymemory, ElasticocciTables.Types._Strategycompute);
		private static final /*@NonNull*/ ExecutorFragment _Strategymemory__Strategymemory = new ExecutorFragment(Types._Strategymemory, ElasticocciTables.Types._Strategymemory);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::Fragments and all preceding sub-packages.
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

		public static final /*@NonNull*/ ParameterTypes _Double___String___Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Real, OCCITables.Types._String, OCCITables.Types._Integer);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Strategycompute__createpolicy = new ExecutorOperation("createpolicy", Parameters._Double___String___Integer, Types._Strategycompute,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Strategycpu__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Strategycpu,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Strategycpu__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Strategycpu,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Strategymemory__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Strategymemory,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Strategymemory__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Strategymemory,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Strategycompute__StrategyComputeBreathDown = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN, Types._Strategycompute, 0);
		public static final /*@NonNull*/ ExecutorProperty _Strategycompute__StrategyComputeBreathUp = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP, Types._Strategycompute, 1);
		public static final /*@NonNull*/ ExecutorProperty _Strategycompute__StrategyComputeLthreshold = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD, Types._Strategycompute, 2);
		public static final /*@NonNull*/ ExecutorProperty _Strategycompute__StrategyComputePollTime = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME, Types._Strategycompute, 3);
		public static final /*@NonNull*/ ExecutorProperty _Strategycompute__StrategyComputeUthreshold = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD, Types._Strategycompute, 4);

		public static final /*@NonNull*/ ExecutorProperty _Strategycpu__StrategyCPUDate = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_DATE, Types._Strategycpu, 0);
		public static final /*@NonNull*/ ExecutorProperty _Strategycpu__StrategyCPUDirection = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_DIRECTION, Types._Strategycpu, 1);
		public static final /*@NonNull*/ ExecutorProperty _Strategycpu__StrategyCPULowerLimit = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT, Types._Strategycpu, 2);
		public static final /*@NonNull*/ ExecutorProperty _Strategycpu__StrategyCPUMode = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_MODE, Types._Strategycpu, 3);
		public static final /*@NonNull*/ ExecutorProperty _Strategycpu__StrategyCPUStepCPUDecrease = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE, Types._Strategycpu, 4);
		public static final /*@NonNull*/ ExecutorProperty _Strategycpu__StrategyCPUStepCPUIncrease = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE, Types._Strategycpu, 5);
		public static final /*@NonNull*/ ExecutorProperty _Strategycpu__StrategyCPUUpperLimit = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT, Types._Strategycpu, 6);

		public static final /*@NonNull*/ ExecutorProperty _Strategymemory__StrategyCPUDate = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_CPU_DATE, Types._Strategymemory, 0);
		public static final /*@NonNull*/ ExecutorProperty _Strategymemory__StrategyMemoryDirection = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION, Types._Strategymemory, 1);
		public static final /*@NonNull*/ ExecutorProperty _Strategymemory__StrategyMemoryLowerLimit = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT, Types._Strategymemory, 2);
		public static final /*@NonNull*/ ExecutorProperty _Strategymemory__StrategyMemoryMode = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_MODE, Types._Strategymemory, 3);
		public static final /*@NonNull*/ ExecutorProperty _Strategymemory__StrategyMemoryStepMemDecrease = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE, Types._Strategymemory, 4);
		public static final /*@NonNull*/ ExecutorProperty _Strategymemory__StrategyMemoryStepMemIncrease = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE, Types._Strategymemory, 5);
		public static final /*@NonNull*/ ExecutorProperty _Strategymemory__StrategyMemoryUpperLimit = new EcoreExecutorProperty(ElasticocciPackage.Literals.STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT, Types._Strategymemory, 6);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DateType =
		{
			Fragments._DateType__OclAny /* 0 */,
			Fragments._DateType__DateType /* 1 */
		};
		private static final int /*@NonNull*/ [] __DateType = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DirectionType =
		{
			Fragments._DirectionType__OclAny /* 0 */,
			Fragments._DirectionType__OclElement /* 1 */,
			Fragments._DirectionType__OclType /* 2 */,
			Fragments._DirectionType__OclEnumeration /* 3 */,
			Fragments._DirectionType__DirectionType /* 4 */
		};
		private static final int /*@NonNull*/ [] __DirectionType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Double =
		{
			Fragments._Double__OclAny /* 0 */,
			Fragments._Double__Double /* 1 */
		};
		private static final int /*@NonNull*/ [] __Double = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Elasticcontroller =
		{
			Fragments._Elasticcontroller__OclAny /* 0 */,
			Fragments._Elasticcontroller__OclElement /* 1 */,
			Fragments._Elasticcontroller__Entity /* 2 */,
			Fragments._Elasticcontroller__Resource /* 3 */,
			Fragments._Elasticcontroller__Elasticcontroller /* 4 */
		};
		private static final int /*@NonNull*/ [] __Elasticcontroller = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Elasticlink =
		{
			Fragments._Elasticlink__OclAny /* 0 */,
			Fragments._Elasticlink__OclElement /* 1 */,
			Fragments._Elasticlink__Entity /* 2 */,
			Fragments._Elasticlink__Link /* 3 */,
			Fragments._Elasticlink__Elasticlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Elasticlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ModeType =
		{
			Fragments._ModeType__OclAny /* 0 */,
			Fragments._ModeType__OclElement /* 1 */,
			Fragments._ModeType__OclType /* 2 */,
			Fragments._ModeType__OclEnumeration /* 3 */,
			Fragments._ModeType__ModeType /* 4 */
		};
		private static final int /*@NonNull*/ [] __ModeType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Strategy =
		{
			Fragments._Strategy__OclAny /* 0 */,
			Fragments._Strategy__OclElement /* 1 */,
			Fragments._Strategy__MixinBase /* 2 */,
			Fragments._Strategy__Strategy /* 3 */
		};
		private static final int /*@NonNull*/ [] __Strategy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Strategycompute =
		{
			Fragments._Strategycompute__OclAny /* 0 */,
			Fragments._Strategycompute__OclElement /* 1 */,
			Fragments._Strategycompute__MixinBase /* 2 */,
			Fragments._Strategycompute__Strategy /* 3 */,
			Fragments._Strategycompute__Strategycompute /* 4 */
		};
		private static final int /*@NonNull*/ [] __Strategycompute = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Strategycpu =
		{
			Fragments._Strategycpu__OclAny /* 0 */,
			Fragments._Strategycpu__OclElement /* 1 */,
			Fragments._Strategycpu__MixinBase /* 2 */,
			Fragments._Strategycpu__Strategy /* 3 */,
			Fragments._Strategycpu__Strategycompute /* 4 */,
			Fragments._Strategycpu__Strategycpu /* 5 */
		};
		private static final int /*@NonNull*/ [] __Strategycpu = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Strategymemory =
		{
			Fragments._Strategymemory__OclAny /* 0 */,
			Fragments._Strategymemory__OclElement /* 1 */,
			Fragments._Strategymemory__MixinBase /* 2 */,
			Fragments._Strategymemory__Strategy /* 3 */,
			Fragments._Strategymemory__Strategycompute /* 4 */,
			Fragments._Strategymemory__Strategymemory /* 5 */
		};
		private static final int /*@NonNull*/ [] __Strategymemory = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._DateType.initFragments(_DateType, __DateType);
			Types._DirectionType.initFragments(_DirectionType, __DirectionType);
			Types._Double.initFragments(_Double, __Double);
			Types._Elasticcontroller.initFragments(_Elasticcontroller, __Elasticcontroller);
			Types._Elasticlink.initFragments(_Elasticlink, __Elasticlink);
			Types._ModeType.initFragments(_ModeType, __ModeType);
			Types._Strategy.initFragments(_Strategy, __Strategy);
			Types._Strategycompute.initFragments(_Strategycompute, __Strategycompute);
			Types._Strategycpu.initFragments(_Strategycpu, __Strategycpu);
			Types._Strategymemory.initFragments(_Strategymemory, __Strategymemory);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DateType__DateType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DateType__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DirectionType__DirectionType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DirectionType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DirectionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DirectionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DirectionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticcontroller__Elasticcontroller = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticcontroller__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticcontroller__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticcontroller__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticcontroller__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Elasticlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ModeType__ModeType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ModeType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ModeType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ModeType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ModeType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategy__Strategy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycompute__Strategycompute = {
			ElasticocciTables.Operations._Strategycompute__createpolicy /* createpolicy(Double[?],String[?],Integer[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycompute__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycompute__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycompute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycompute__Strategy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycpu__Strategycpu = {
			ElasticocciTables.Operations._Strategycpu__start /* start() */,
			ElasticocciTables.Operations._Strategycpu__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycpu__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycpu__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycpu__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycpu__Strategy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategycpu__Strategycompute = {
			ElasticocciTables.Operations._Strategycompute__createpolicy /* createpolicy(Double[?],String[?],Integer[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategymemory__Strategymemory = {
			ElasticocciTables.Operations._Strategymemory__start /* start() */,
			ElasticocciTables.Operations._Strategymemory__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategymemory__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategymemory__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategymemory__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategymemory__Strategy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategymemory__Strategycompute = {
			ElasticocciTables.Operations._Strategycompute__createpolicy /* createpolicy(Double[?],String[?],Integer[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._DateType__DateType.initOperations(_DateType__DateType);
			Fragments._DateType__OclAny.initOperations(_DateType__OclAny);

			Fragments._DirectionType__DirectionType.initOperations(_DirectionType__DirectionType);
			Fragments._DirectionType__OclAny.initOperations(_DirectionType__OclAny);
			Fragments._DirectionType__OclElement.initOperations(_DirectionType__OclElement);
			Fragments._DirectionType__OclEnumeration.initOperations(_DirectionType__OclEnumeration);
			Fragments._DirectionType__OclType.initOperations(_DirectionType__OclType);

			Fragments._Double__Double.initOperations(_Double__Double);
			Fragments._Double__OclAny.initOperations(_Double__OclAny);

			Fragments._Elasticcontroller__Elasticcontroller.initOperations(_Elasticcontroller__Elasticcontroller);
			Fragments._Elasticcontroller__Entity.initOperations(_Elasticcontroller__Entity);
			Fragments._Elasticcontroller__OclAny.initOperations(_Elasticcontroller__OclAny);
			Fragments._Elasticcontroller__OclElement.initOperations(_Elasticcontroller__OclElement);
			Fragments._Elasticcontroller__Resource.initOperations(_Elasticcontroller__Resource);

			Fragments._Elasticlink__Elasticlink.initOperations(_Elasticlink__Elasticlink);
			Fragments._Elasticlink__Entity.initOperations(_Elasticlink__Entity);
			Fragments._Elasticlink__Link.initOperations(_Elasticlink__Link);
			Fragments._Elasticlink__OclAny.initOperations(_Elasticlink__OclAny);
			Fragments._Elasticlink__OclElement.initOperations(_Elasticlink__OclElement);

			Fragments._ModeType__ModeType.initOperations(_ModeType__ModeType);
			Fragments._ModeType__OclAny.initOperations(_ModeType__OclAny);
			Fragments._ModeType__OclElement.initOperations(_ModeType__OclElement);
			Fragments._ModeType__OclEnumeration.initOperations(_ModeType__OclEnumeration);
			Fragments._ModeType__OclType.initOperations(_ModeType__OclType);

			Fragments._Strategy__MixinBase.initOperations(_Strategy__MixinBase);
			Fragments._Strategy__OclAny.initOperations(_Strategy__OclAny);
			Fragments._Strategy__OclElement.initOperations(_Strategy__OclElement);
			Fragments._Strategy__Strategy.initOperations(_Strategy__Strategy);

			Fragments._Strategycompute__MixinBase.initOperations(_Strategycompute__MixinBase);
			Fragments._Strategycompute__OclAny.initOperations(_Strategycompute__OclAny);
			Fragments._Strategycompute__OclElement.initOperations(_Strategycompute__OclElement);
			Fragments._Strategycompute__Strategy.initOperations(_Strategycompute__Strategy);
			Fragments._Strategycompute__Strategycompute.initOperations(_Strategycompute__Strategycompute);

			Fragments._Strategycpu__MixinBase.initOperations(_Strategycpu__MixinBase);
			Fragments._Strategycpu__OclAny.initOperations(_Strategycpu__OclAny);
			Fragments._Strategycpu__OclElement.initOperations(_Strategycpu__OclElement);
			Fragments._Strategycpu__Strategy.initOperations(_Strategycpu__Strategy);
			Fragments._Strategycpu__Strategycompute.initOperations(_Strategycpu__Strategycompute);
			Fragments._Strategycpu__Strategycpu.initOperations(_Strategycpu__Strategycpu);

			Fragments._Strategymemory__MixinBase.initOperations(_Strategymemory__MixinBase);
			Fragments._Strategymemory__OclAny.initOperations(_Strategymemory__OclAny);
			Fragments._Strategymemory__OclElement.initOperations(_Strategymemory__OclElement);
			Fragments._Strategymemory__Strategy.initOperations(_Strategymemory__Strategy);
			Fragments._Strategymemory__Strategycompute.initOperations(_Strategymemory__Strategycompute);
			Fragments._Strategymemory__Strategymemory.initOperations(_Strategymemory__Strategymemory);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DateType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DirectionType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Double = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Elasticcontroller = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Elasticlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ModeType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Strategy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Strategycompute = {
			ElasticocciTables.Properties._Strategycompute__StrategyComputeBreathDown,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeBreathUp,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeLthreshold,
			ElasticocciTables.Properties._Strategycompute__StrategyComputePollTime,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeUthreshold
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Strategycpu = {
			ElasticocciTables.Properties._Strategycpu__StrategyCPUDate,
			ElasticocciTables.Properties._Strategycpu__StrategyCPUDirection,
			ElasticocciTables.Properties._Strategycpu__StrategyCPULowerLimit,
			ElasticocciTables.Properties._Strategycpu__StrategyCPUMode,
			ElasticocciTables.Properties._Strategycpu__StrategyCPUStepCPUDecrease,
			ElasticocciTables.Properties._Strategycpu__StrategyCPUStepCPUIncrease,
			ElasticocciTables.Properties._Strategycpu__StrategyCPUUpperLimit,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeBreathDown,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeBreathUp,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeLthreshold,
			ElasticocciTables.Properties._Strategycompute__StrategyComputePollTime,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeUthreshold
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Strategymemory = {
			ElasticocciTables.Properties._Strategymemory__StrategyCPUDate,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeBreathDown,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeBreathUp,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeLthreshold,
			ElasticocciTables.Properties._Strategycompute__StrategyComputePollTime,
			ElasticocciTables.Properties._Strategycompute__StrategyComputeUthreshold,
			ElasticocciTables.Properties._Strategymemory__StrategyMemoryDirection,
			ElasticocciTables.Properties._Strategymemory__StrategyMemoryLowerLimit,
			ElasticocciTables.Properties._Strategymemory__StrategyMemoryMode,
			ElasticocciTables.Properties._Strategymemory__StrategyMemoryStepMemDecrease,
			ElasticocciTables.Properties._Strategymemory__StrategyMemoryStepMemIncrease,
			ElasticocciTables.Properties._Strategymemory__StrategyMemoryUpperLimit
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._DateType__DateType.initProperties(_DateType);
			Fragments._DirectionType__DirectionType.initProperties(_DirectionType);
			Fragments._Double__Double.initProperties(_Double);
			Fragments._Elasticcontroller__Elasticcontroller.initProperties(_Elasticcontroller);
			Fragments._Elasticlink__Elasticlink.initProperties(_Elasticlink);
			Fragments._ModeType__ModeType.initProperties(_ModeType);
			Fragments._Strategy__Strategy.initProperties(_Strategy);
			Fragments._Strategycompute__Strategycompute.initProperties(_Strategycompute);
			Fragments._Strategycpu__Strategycpu.initProperties(_Strategycpu);
			Fragments._Strategymemory__Strategymemory.initProperties(_Strategymemory);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _DirectionType__up = new EcoreExecutorEnumerationLiteral(ElasticocciPackage.Literals.DIRECTION_TYPE.getEEnumLiteral("up"), Types._DirectionType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _DirectionType__down = new EcoreExecutorEnumerationLiteral(ElasticocciPackage.Literals.DIRECTION_TYPE.getEEnumLiteral("down"), Types._DirectionType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DirectionType = {
			_DirectionType__up,
			_DirectionType__down
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ModeType__manual = new EcoreExecutorEnumerationLiteral(ElasticocciPackage.Literals.MODE_TYPE.getEEnumLiteral("manual"), Types._ModeType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ModeType__dynamic = new EcoreExecutorEnumerationLiteral(ElasticocciPackage.Literals.MODE_TYPE.getEEnumLiteral("dynamic"), Types._ModeType, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ModeType__scheduled = new EcoreExecutorEnumerationLiteral(ElasticocciPackage.Literals.MODE_TYPE.getEEnumLiteral("scheduled"), Types._ModeType, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ModeType = {
			_ModeType__manual,
			_ModeType__dynamic,
			_ModeType__scheduled
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DirectionType.initLiterals(_DirectionType);
			Types._ModeType.initLiterals(_ModeType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ElasticocciTables::EnumerationLiterals and all preceding sub-packages.
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
