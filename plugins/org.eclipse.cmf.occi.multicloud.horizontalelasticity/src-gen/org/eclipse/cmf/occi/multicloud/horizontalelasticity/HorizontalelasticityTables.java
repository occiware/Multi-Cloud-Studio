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
 *   /org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.horizontalelasticity;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables;
import org.eclipse.ocl.pivot.TemplateParameters;
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
 * HorizontalelasticityTables provides the dispatch tables for the horizontalelasticity for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class HorizontalelasticityTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(HorizontalelasticityPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore", null, org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Creation = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Creation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Dynamic = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Dynamic", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Grouplink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Grouplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Horizontalelasticcontroller = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Horizontalelasticcontroller", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Horizontalgroup = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Horizontalgroup", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instancegrouplink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Instancegrouplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Linkbalancer = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Linkbalancer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Loadbalancer = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Loadbalancer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Manual = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Manual", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Strategy = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Strategy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Date = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getDataTypeId("Date", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Creation_c_c_appliesConstraint = "Creation::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Dynamic_c_c_appliesConstraint = "Dynamic::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Grouplink_c_c_targetConstraint = "Grouplink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Instancegrouplink_c_c_targetConstraint = "Instancegrouplink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Linkbalancer_c_c_targetConstraint = "Linkbalancer::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Manual_c_c_appliesConstraint = "Manual::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Strategy_c_c_appliesConstraint = "Strategy::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			HorizontalelasticityTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Creation = new EcoreExecutorType(HorizontalelasticityPackage.Literals.CREATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Date = new EcoreExecutorType("Date", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamic = new EcoreExecutorType(HorizontalelasticityPackage.Literals.DYNAMIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Grouplink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.GROUPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Horizontalelasticcontroller = new EcoreExecutorType(HorizontalelasticityPackage.Literals.HORIZONTALELASTICCONTROLLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Horizontalgroup = new EcoreExecutorType(HorizontalelasticityPackage.Literals.HORIZONTALGROUP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instancegrouplink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.INSTANCEGROUPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Linkbalancer = new EcoreExecutorType(HorizontalelasticityPackage.Literals.LINKBALANCER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadbalancer = new EcoreExecutorType(HorizontalelasticityPackage.Literals.LOADBALANCER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manual = new EcoreExecutorType(HorizontalelasticityPackage.Literals.MANUAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Strategy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.STRATEGY, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Creation,
			_Date,
			_Dynamic,
			_Grouplink,
			_Horizontalelasticcontroller,
			_Horizontalgroup,
			_Instancegrouplink,
			_Linkbalancer,
			_Loadbalancer,
			_Manual,
			_Strategy
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Creation__Creation = new ExecutorFragment(Types._Creation, HorizontalelasticityTables.Types._Creation);
		private static final /*@NonNull*/ ExecutorFragment _Creation__MixinBase = new ExecutorFragment(Types._Creation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclAny = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclElement = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Date__Date = new ExecutorFragment(Types._Date, HorizontalelasticityTables.Types._Date);
		private static final /*@NonNull*/ ExecutorFragment _Date__OclAny = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Dynamic__Dynamic = new ExecutorFragment(Types._Dynamic, HorizontalelasticityTables.Types._Dynamic);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__MixinBase = new ExecutorFragment(Types._Dynamic, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__OclAny = new ExecutorFragment(Types._Dynamic, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__OclElement = new ExecutorFragment(Types._Dynamic, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__Strategy = new ExecutorFragment(Types._Dynamic, HorizontalelasticityTables.Types._Strategy);

		private static final /*@NonNull*/ ExecutorFragment _Grouplink__Entity = new ExecutorFragment(Types._Grouplink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Grouplink__Grouplink = new ExecutorFragment(Types._Grouplink, HorizontalelasticityTables.Types._Grouplink);
		private static final /*@NonNull*/ ExecutorFragment _Grouplink__Link = new ExecutorFragment(Types._Grouplink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Grouplink__OclAny = new ExecutorFragment(Types._Grouplink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Grouplink__OclElement = new ExecutorFragment(Types._Grouplink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Horizontalelasticcontroller__Entity = new ExecutorFragment(Types._Horizontalelasticcontroller, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalelasticcontroller__Horizontalelasticcontroller = new ExecutorFragment(Types._Horizontalelasticcontroller, HorizontalelasticityTables.Types._Horizontalelasticcontroller);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalelasticcontroller__OclAny = new ExecutorFragment(Types._Horizontalelasticcontroller, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalelasticcontroller__OclElement = new ExecutorFragment(Types._Horizontalelasticcontroller, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalelasticcontroller__Resource = new ExecutorFragment(Types._Horizontalelasticcontroller, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__Entity = new ExecutorFragment(Types._Horizontalgroup, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__Horizontalgroup = new ExecutorFragment(Types._Horizontalgroup, HorizontalelasticityTables.Types._Horizontalgroup);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__OclAny = new ExecutorFragment(Types._Horizontalgroup, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__OclElement = new ExecutorFragment(Types._Horizontalgroup, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Horizontalgroup__Resource = new ExecutorFragment(Types._Horizontalgroup, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__Entity = new ExecutorFragment(Types._Instancegrouplink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__Instancegrouplink = new ExecutorFragment(Types._Instancegrouplink, HorizontalelasticityTables.Types._Instancegrouplink);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__Link = new ExecutorFragment(Types._Instancegrouplink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__OclAny = new ExecutorFragment(Types._Instancegrouplink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Instancegrouplink__OclElement = new ExecutorFragment(Types._Instancegrouplink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Linkbalancer__Entity = new ExecutorFragment(Types._Linkbalancer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Linkbalancer__Link = new ExecutorFragment(Types._Linkbalancer, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Linkbalancer__Linkbalancer = new ExecutorFragment(Types._Linkbalancer, HorizontalelasticityTables.Types._Linkbalancer);
		private static final /*@NonNull*/ ExecutorFragment _Linkbalancer__OclAny = new ExecutorFragment(Types._Linkbalancer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Linkbalancer__OclElement = new ExecutorFragment(Types._Linkbalancer, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Entity = new ExecutorFragment(Types._Loadbalancer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Loadbalancer = new ExecutorFragment(Types._Loadbalancer, HorizontalelasticityTables.Types._Loadbalancer);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__OclAny = new ExecutorFragment(Types._Loadbalancer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__OclElement = new ExecutorFragment(Types._Loadbalancer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Resource = new ExecutorFragment(Types._Loadbalancer, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Manual__Manual = new ExecutorFragment(Types._Manual, HorizontalelasticityTables.Types._Manual);
		private static final /*@NonNull*/ ExecutorFragment _Manual__MixinBase = new ExecutorFragment(Types._Manual, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Manual__OclAny = new ExecutorFragment(Types._Manual, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manual__OclElement = new ExecutorFragment(Types._Manual, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Manual__Strategy = new ExecutorFragment(Types._Manual, HorizontalelasticityTables.Types._Strategy);

		private static final /*@NonNull*/ ExecutorFragment _Strategy__MixinBase = new ExecutorFragment(Types._Strategy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__OclAny = new ExecutorFragment(Types._Strategy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__OclElement = new ExecutorFragment(Types._Strategy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__Strategy = new ExecutorFragment(Types._Strategy, HorizontalelasticityTables.Types._Strategy);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of HorizontalelasticityTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Dynamic__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Dynamic,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Dynamic__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Dynamic,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Horizontalgroup__create = new ExecutorOperation("create", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Horizontalgroup,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Loadbalancer__addbackendserver = new ExecutorOperation("addbackendserver", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancer,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Loadbalancer__removebackendserver = new ExecutorOperation("removebackendserver", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancer,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Manual__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Manual,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Creation__occiComputeCreationDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.CREATION__OCCI_COMPUTE_CREATION_DATE, Types._Creation, 0);

		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__HorizontalGroupGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE, Types._Horizontalgroup, 0);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__HorizontalGroupLoadBalancer = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER, Types._Horizontalgroup, 1);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__HorizontalGroupMaximum = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM, Types._Horizontalgroup, 2);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__HorizontalGroupMinimum = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM, Types._Horizontalgroup, 3);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__HorizontalGroupName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_NAME, Types._Horizontalgroup, 4);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__HorizontalGroupTemplateName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME, Types._Horizontalgroup, 5);

		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__LoadbalancerAddress = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_ADDRESS, Types._Loadbalancer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__LoadbalancerInstanceIP = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_INSTANCE_IP, Types._Loadbalancer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__LoadbalancerName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_NAME, Types._Loadbalancer, 2);

		public static final /*@NonNull*/ ExecutorProperty _Manual__ManualGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.MANUAL__MANUAL_GROUP_SIZE, Types._Manual, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Creation =
		{
			Fragments._Creation__OclAny /* 0 */,
			Fragments._Creation__OclElement /* 1 */,
			Fragments._Creation__MixinBase /* 2 */,
			Fragments._Creation__Creation /* 3 */
		};
		private static final int /*@NonNull*/ [] __Creation = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Date =
		{
			Fragments._Date__OclAny /* 0 */,
			Fragments._Date__Date /* 1 */
		};
		private static final int /*@NonNull*/ [] __Date = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamic =
		{
			Fragments._Dynamic__OclAny /* 0 */,
			Fragments._Dynamic__OclElement /* 1 */,
			Fragments._Dynamic__MixinBase /* 2 */,
			Fragments._Dynamic__Strategy /* 3 */,
			Fragments._Dynamic__Dynamic /* 4 */
		};
		private static final int /*@NonNull*/ [] __Dynamic = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Grouplink =
		{
			Fragments._Grouplink__OclAny /* 0 */,
			Fragments._Grouplink__OclElement /* 1 */,
			Fragments._Grouplink__Entity /* 2 */,
			Fragments._Grouplink__Link /* 3 */,
			Fragments._Grouplink__Grouplink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Grouplink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Horizontalelasticcontroller =
		{
			Fragments._Horizontalelasticcontroller__OclAny /* 0 */,
			Fragments._Horizontalelasticcontroller__OclElement /* 1 */,
			Fragments._Horizontalelasticcontroller__Entity /* 2 */,
			Fragments._Horizontalelasticcontroller__Resource /* 3 */,
			Fragments._Horizontalelasticcontroller__Horizontalelasticcontroller /* 4 */
		};
		private static final int /*@NonNull*/ [] __Horizontalelasticcontroller = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Horizontalgroup =
		{
			Fragments._Horizontalgroup__OclAny /* 0 */,
			Fragments._Horizontalgroup__OclElement /* 1 */,
			Fragments._Horizontalgroup__Entity /* 2 */,
			Fragments._Horizontalgroup__Resource /* 3 */,
			Fragments._Horizontalgroup__Horizontalgroup /* 4 */
		};
		private static final int /*@NonNull*/ [] __Horizontalgroup = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Instancegrouplink =
		{
			Fragments._Instancegrouplink__OclAny /* 0 */,
			Fragments._Instancegrouplink__OclElement /* 1 */,
			Fragments._Instancegrouplink__Entity /* 2 */,
			Fragments._Instancegrouplink__Link /* 3 */,
			Fragments._Instancegrouplink__Instancegrouplink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Instancegrouplink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Linkbalancer =
		{
			Fragments._Linkbalancer__OclAny /* 0 */,
			Fragments._Linkbalancer__OclElement /* 1 */,
			Fragments._Linkbalancer__Entity /* 2 */,
			Fragments._Linkbalancer__Link /* 3 */,
			Fragments._Linkbalancer__Linkbalancer /* 4 */
		};
		private static final int /*@NonNull*/ [] __Linkbalancer = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Loadbalancer =
		{
			Fragments._Loadbalancer__OclAny /* 0 */,
			Fragments._Loadbalancer__OclElement /* 1 */,
			Fragments._Loadbalancer__Entity /* 2 */,
			Fragments._Loadbalancer__Resource /* 3 */,
			Fragments._Loadbalancer__Loadbalancer /* 4 */
		};
		private static final int /*@NonNull*/ [] __Loadbalancer = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manual =
		{
			Fragments._Manual__OclAny /* 0 */,
			Fragments._Manual__OclElement /* 1 */,
			Fragments._Manual__MixinBase /* 2 */,
			Fragments._Manual__Strategy /* 3 */,
			Fragments._Manual__Manual /* 4 */
		};
		private static final int /*@NonNull*/ [] __Manual = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Strategy =
		{
			Fragments._Strategy__OclAny /* 0 */,
			Fragments._Strategy__OclElement /* 1 */,
			Fragments._Strategy__MixinBase /* 2 */,
			Fragments._Strategy__Strategy /* 3 */
		};
		private static final int /*@NonNull*/ [] __Strategy = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Creation.initFragments(_Creation, __Creation);
			Types._Date.initFragments(_Date, __Date);
			Types._Dynamic.initFragments(_Dynamic, __Dynamic);
			Types._Grouplink.initFragments(_Grouplink, __Grouplink);
			Types._Horizontalelasticcontroller.initFragments(_Horizontalelasticcontroller, __Horizontalelasticcontroller);
			Types._Horizontalgroup.initFragments(_Horizontalgroup, __Horizontalgroup);
			Types._Instancegrouplink.initFragments(_Instancegrouplink, __Instancegrouplink);
			Types._Linkbalancer.initFragments(_Linkbalancer, __Linkbalancer);
			Types._Loadbalancer.initFragments(_Loadbalancer, __Loadbalancer);
			Types._Manual.initFragments(_Manual, __Manual);
			Types._Strategy.initFragments(_Strategy, __Strategy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__Creation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Creation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Date__Date = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Date__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__Dynamic = {
			HorizontalelasticityTables.Operations._Dynamic__start /* start() */,
			HorizontalelasticityTables.Operations._Dynamic__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__Strategy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Grouplink__Grouplink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Grouplink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Grouplink__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Grouplink__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Grouplink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalelasticcontroller__Horizontalelasticcontroller = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalelasticcontroller__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalelasticcontroller__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalelasticcontroller__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalelasticcontroller__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__Horizontalgroup = {
			HorizontalelasticityTables.Operations._Horizontalgroup__create /* create() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__Instancegrouplink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linkbalancer__Linkbalancer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linkbalancer__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linkbalancer__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linkbalancer__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linkbalancer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__Loadbalancer = {
			HorizontalelasticityTables.Operations._Loadbalancer__addbackendserver /* addbackendserver() */,
			HorizontalelasticityTables.Operations._Loadbalancer__removebackendserver /* removebackendserver() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancer__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__Manual = {
			HorizontalelasticityTables.Operations._Manual__start /* start() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__Strategy = {};

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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Creation__Creation.initOperations(_Creation__Creation);
			Fragments._Creation__MixinBase.initOperations(_Creation__MixinBase);
			Fragments._Creation__OclAny.initOperations(_Creation__OclAny);
			Fragments._Creation__OclElement.initOperations(_Creation__OclElement);

			Fragments._Date__Date.initOperations(_Date__Date);
			Fragments._Date__OclAny.initOperations(_Date__OclAny);

			Fragments._Dynamic__Dynamic.initOperations(_Dynamic__Dynamic);
			Fragments._Dynamic__MixinBase.initOperations(_Dynamic__MixinBase);
			Fragments._Dynamic__OclAny.initOperations(_Dynamic__OclAny);
			Fragments._Dynamic__OclElement.initOperations(_Dynamic__OclElement);
			Fragments._Dynamic__Strategy.initOperations(_Dynamic__Strategy);

			Fragments._Grouplink__Entity.initOperations(_Grouplink__Entity);
			Fragments._Grouplink__Grouplink.initOperations(_Grouplink__Grouplink);
			Fragments._Grouplink__Link.initOperations(_Grouplink__Link);
			Fragments._Grouplink__OclAny.initOperations(_Grouplink__OclAny);
			Fragments._Grouplink__OclElement.initOperations(_Grouplink__OclElement);

			Fragments._Horizontalelasticcontroller__Entity.initOperations(_Horizontalelasticcontroller__Entity);
			Fragments._Horizontalelasticcontroller__Horizontalelasticcontroller.initOperations(_Horizontalelasticcontroller__Horizontalelasticcontroller);
			Fragments._Horizontalelasticcontroller__OclAny.initOperations(_Horizontalelasticcontroller__OclAny);
			Fragments._Horizontalelasticcontroller__OclElement.initOperations(_Horizontalelasticcontroller__OclElement);
			Fragments._Horizontalelasticcontroller__Resource.initOperations(_Horizontalelasticcontroller__Resource);

			Fragments._Horizontalgroup__Entity.initOperations(_Horizontalgroup__Entity);
			Fragments._Horizontalgroup__Horizontalgroup.initOperations(_Horizontalgroup__Horizontalgroup);
			Fragments._Horizontalgroup__OclAny.initOperations(_Horizontalgroup__OclAny);
			Fragments._Horizontalgroup__OclElement.initOperations(_Horizontalgroup__OclElement);
			Fragments._Horizontalgroup__Resource.initOperations(_Horizontalgroup__Resource);

			Fragments._Instancegrouplink__Entity.initOperations(_Instancegrouplink__Entity);
			Fragments._Instancegrouplink__Instancegrouplink.initOperations(_Instancegrouplink__Instancegrouplink);
			Fragments._Instancegrouplink__Link.initOperations(_Instancegrouplink__Link);
			Fragments._Instancegrouplink__OclAny.initOperations(_Instancegrouplink__OclAny);
			Fragments._Instancegrouplink__OclElement.initOperations(_Instancegrouplink__OclElement);

			Fragments._Linkbalancer__Entity.initOperations(_Linkbalancer__Entity);
			Fragments._Linkbalancer__Link.initOperations(_Linkbalancer__Link);
			Fragments._Linkbalancer__Linkbalancer.initOperations(_Linkbalancer__Linkbalancer);
			Fragments._Linkbalancer__OclAny.initOperations(_Linkbalancer__OclAny);
			Fragments._Linkbalancer__OclElement.initOperations(_Linkbalancer__OclElement);

			Fragments._Loadbalancer__Entity.initOperations(_Loadbalancer__Entity);
			Fragments._Loadbalancer__Loadbalancer.initOperations(_Loadbalancer__Loadbalancer);
			Fragments._Loadbalancer__OclAny.initOperations(_Loadbalancer__OclAny);
			Fragments._Loadbalancer__OclElement.initOperations(_Loadbalancer__OclElement);
			Fragments._Loadbalancer__Resource.initOperations(_Loadbalancer__Resource);

			Fragments._Manual__Manual.initOperations(_Manual__Manual);
			Fragments._Manual__MixinBase.initOperations(_Manual__MixinBase);
			Fragments._Manual__OclAny.initOperations(_Manual__OclAny);
			Fragments._Manual__OclElement.initOperations(_Manual__OclElement);
			Fragments._Manual__Strategy.initOperations(_Manual__Strategy);

			Fragments._Strategy__MixinBase.initOperations(_Strategy__MixinBase);
			Fragments._Strategy__OclAny.initOperations(_Strategy__OclAny);
			Fragments._Strategy__OclElement.initOperations(_Strategy__OclElement);
			Fragments._Strategy__Strategy.initOperations(_Strategy__Strategy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Creation = {
			HorizontalelasticityTables.Properties._Creation__occiComputeCreationDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Date = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamic = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Grouplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Horizontalelasticcontroller = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Horizontalgroup = {
			HorizontalelasticityTables.Properties._Horizontalgroup__HorizontalGroupGroupSize,
			HorizontalelasticityTables.Properties._Horizontalgroup__HorizontalGroupLoadBalancer,
			HorizontalelasticityTables.Properties._Horizontalgroup__HorizontalGroupMaximum,
			HorizontalelasticityTables.Properties._Horizontalgroup__HorizontalGroupMinimum,
			HorizontalelasticityTables.Properties._Horizontalgroup__HorizontalGroupName,
			HorizontalelasticityTables.Properties._Horizontalgroup__HorizontalGroupTemplateName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instancegrouplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Linkbalancer = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadbalancer = {
			HorizontalelasticityTables.Properties._Loadbalancer__LoadbalancerAddress,
			HorizontalelasticityTables.Properties._Loadbalancer__LoadbalancerInstanceIP,
			HorizontalelasticityTables.Properties._Loadbalancer__LoadbalancerName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manual = {
			HorizontalelasticityTables.Properties._Manual__ManualGroupSize
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Strategy = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Creation__Creation.initProperties(_Creation);
			Fragments._Date__Date.initProperties(_Date);
			Fragments._Dynamic__Dynamic.initProperties(_Dynamic);
			Fragments._Grouplink__Grouplink.initProperties(_Grouplink);
			Fragments._Horizontalelasticcontroller__Horizontalelasticcontroller.initProperties(_Horizontalelasticcontroller);
			Fragments._Horizontalgroup__Horizontalgroup.initProperties(_Horizontalgroup);
			Fragments._Instancegrouplink__Instancegrouplink.initProperties(_Instancegrouplink);
			Fragments._Linkbalancer__Linkbalancer.initProperties(_Linkbalancer);
			Fragments._Loadbalancer__Loadbalancer.initProperties(_Loadbalancer);
			Fragments._Manual__Manual.initProperties(_Manual);
			Fragments._Strategy__Strategy.initProperties(_Strategy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of HorizontalelasticityTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of HorizontalelasticityTables::EnumerationLiterals and all preceding sub-packages.
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
