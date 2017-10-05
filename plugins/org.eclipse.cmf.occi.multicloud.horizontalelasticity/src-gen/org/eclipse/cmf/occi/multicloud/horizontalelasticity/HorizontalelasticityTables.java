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
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
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
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Action = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Action", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Array = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Array", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrayofRecurrenceStep = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("ArrayofRecurrenceStep", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Creation = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Creation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Dynamicadjustment = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Dynamicadjustment", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Grouplink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Grouplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Horizontalgroup = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Horizontalgroup", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instancegrouplink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Instancegrouplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Linkbalancer = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Linkbalancer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Loadbalancer = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Loadbalancer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RecurrenceStep = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("RecurrenceStep", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Recurringschedule = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Recurringschedule", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Rule = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Rule", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Scheduler = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Scheduler", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Simpledynamic = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Simpledynamic", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Stepdynamic = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Stepdynamic", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Steps = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Steps", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Date = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getDataTypeId("Date", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Float = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getDataTypeId("Float", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ActionOperation = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("ActionOperation");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ActionType = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("ActionType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_MetricTargetTracking = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("MetricTargetTracking");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_OperatorType = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("OperatorType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_TypeMetric = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("TypeMetric");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Unit = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("Unit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_PRIMid_Integer = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.INTEGER);
	public static final /*@NonInvalid*/ java.lang.String STR_Action_c_c_appliesConstraint = "Action::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Creation_c_c_appliesConstraint = "Creation::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Grouplink_c_c_targetConstraint = "Grouplink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Instancegrouplink_c_c_targetConstraint = "Instancegrouplink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Linkbalancer_c_c_targetConstraint = "Linkbalancer::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Rule_c_c_appliesConstraint = "Rule::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Scheduler_c_c_appliesConstraint = "Scheduler::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Steps_c_c_appliesConstraint = "Steps::appliesConstraint";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_RecurrenceStep = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.CLSSid_RecurrenceStep);

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

		public static final /*@NonNull*/ EcoreExecutorType _Action = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ACTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ActionOperation = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.ACTION_OPERATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ActionType = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.ACTION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Array = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ARRAY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrayofRecurrenceStep = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ARRAYOF_RECURRENCE_STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Creation = new EcoreExecutorType(HorizontalelasticityPackage.Literals.CREATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Date = new EcoreExecutorType("Date", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamic = new EcoreExecutorType(HorizontalelasticityPackage.Literals.DYNAMIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamicadjustment = new EcoreExecutorType(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Float = new EcoreExecutorType("Float", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Grouplink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.GROUPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Horizontalelasticcontroller = new EcoreExecutorType(HorizontalelasticityPackage.Literals.HORIZONTALELASTICCONTROLLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Horizontalgroup = new EcoreExecutorType(HorizontalelasticityPackage.Literals.HORIZONTALGROUP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instancegrouplink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.INSTANCEGROUPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Linkbalancer = new EcoreExecutorType(HorizontalelasticityPackage.Literals.LINKBALANCER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadbalancer = new EcoreExecutorType(HorizontalelasticityPackage.Literals.LOADBALANCER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manual = new EcoreExecutorType(HorizontalelasticityPackage.Literals.MANUAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MetricTargetTracking = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _OperatorType = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.OPERATOR_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RecurrenceStep = new EcoreExecutorType(HorizontalelasticityPackage.Literals.RECURRENCE_STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Recurringschedule = new EcoreExecutorType(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rule = new EcoreExecutorType(HorizontalelasticityPackage.Literals.RULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Scheduler = new EcoreExecutorType(HorizontalelasticityPackage.Literals.SCHEDULER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Simpledynamic = new EcoreExecutorType(HorizontalelasticityPackage.Literals.SIMPLEDYNAMIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Stepdynamic = new EcoreExecutorType(HorizontalelasticityPackage.Literals.STEPDYNAMIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Steps = new EcoreExecutorType(HorizontalelasticityPackage.Literals.STEPS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _TypeMetric = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.TYPE_METRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Uniqueschedule = new EcoreExecutorType(HorizontalelasticityPackage.Literals.UNIQUESCHEDULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Unit = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.UNIT, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_ActionOperation,
			_ActionType,
			_Array,
			_ArrayofRecurrenceStep,
			_Creation,
			_Date,
			_Dynamic,
			_Dynamicadjustment,
			_Float,
			_Grouplink,
			_Horizontalelasticcontroller,
			_Horizontalgroup,
			_Instancegrouplink,
			_Linkbalancer,
			_Loadbalancer,
			_Manual,
			_MetricTargetTracking,
			_OperatorType,
			_RecurrenceStep,
			_Recurringschedule,
			_Rule,
			_Scheduler,
			_Simpledynamic,
			_Stepdynamic,
			_Steps,
			_TypeMetric,
			_Uniqueschedule,
			_Unit
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

		private static final /*@NonNull*/ ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, HorizontalelasticityTables.Types._Action);
		private static final /*@NonNull*/ ExecutorFragment _Action__MixinBase = new ExecutorFragment(Types._Action, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__ActionOperation = new ExecutorFragment(Types._ActionOperation, HorizontalelasticityTables.Types._ActionOperation);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclAny = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclElement = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclEnumeration = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ActionOperation__OclType = new ExecutorFragment(Types._ActionOperation, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _ActionType__ActionType = new ExecutorFragment(Types._ActionType, HorizontalelasticityTables.Types._ActionType);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclAny = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclElement = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclEnumeration = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ActionType__OclType = new ExecutorFragment(Types._ActionType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Array__Array = new ExecutorFragment(Types._Array, HorizontalelasticityTables.Types._Array);
		private static final /*@NonNull*/ ExecutorFragment _Array__OclAny = new ExecutorFragment(Types._Array, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Array__OclElement = new ExecutorFragment(Types._Array, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrayofRecurrenceStep__ArrayofRecurrenceStep = new ExecutorFragment(Types._ArrayofRecurrenceStep, HorizontalelasticityTables.Types._ArrayofRecurrenceStep);
		private static final /*@NonNull*/ ExecutorFragment _ArrayofRecurrenceStep__OclAny = new ExecutorFragment(Types._ArrayofRecurrenceStep, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayofRecurrenceStep__OclElement = new ExecutorFragment(Types._ArrayofRecurrenceStep, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Creation__Creation = new ExecutorFragment(Types._Creation, HorizontalelasticityTables.Types._Creation);
		private static final /*@NonNull*/ ExecutorFragment _Creation__MixinBase = new ExecutorFragment(Types._Creation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclAny = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclElement = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Date__Date = new ExecutorFragment(Types._Date, HorizontalelasticityTables.Types._Date);
		private static final /*@NonNull*/ ExecutorFragment _Date__OclAny = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Date__OclComparable = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclComparable);

		private static final /*@NonNull*/ ExecutorFragment _Dynamic__Dynamic = new ExecutorFragment(Types._Dynamic, HorizontalelasticityTables.Types._Dynamic);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__Entity = new ExecutorFragment(Types._Dynamic, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__Horizontalelasticcontroller = new ExecutorFragment(Types._Dynamic, HorizontalelasticityTables.Types._Horizontalelasticcontroller);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__OclAny = new ExecutorFragment(Types._Dynamic, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__OclElement = new ExecutorFragment(Types._Dynamic, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamic__Resource = new ExecutorFragment(Types._Dynamic, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustment__Dynamic = new ExecutorFragment(Types._Dynamicadjustment, HorizontalelasticityTables.Types._Dynamic);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustment__Dynamicadjustment = new ExecutorFragment(Types._Dynamicadjustment, HorizontalelasticityTables.Types._Dynamicadjustment);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustment__Entity = new ExecutorFragment(Types._Dynamicadjustment, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustment__Horizontalelasticcontroller = new ExecutorFragment(Types._Dynamicadjustment, HorizontalelasticityTables.Types._Horizontalelasticcontroller);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustment__OclAny = new ExecutorFragment(Types._Dynamicadjustment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustment__OclElement = new ExecutorFragment(Types._Dynamicadjustment, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustment__Resource = new ExecutorFragment(Types._Dynamicadjustment, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Float__Float = new ExecutorFragment(Types._Float, HorizontalelasticityTables.Types._Float);
		private static final /*@NonNull*/ ExecutorFragment _Float__OclAny = new ExecutorFragment(Types._Float, OCLstdlibTables.Types._OclAny);

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

		private static final /*@NonNull*/ ExecutorFragment _Manual__Entity = new ExecutorFragment(Types._Manual, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Manual__Horizontalelasticcontroller = new ExecutorFragment(Types._Manual, HorizontalelasticityTables.Types._Horizontalelasticcontroller);
		private static final /*@NonNull*/ ExecutorFragment _Manual__Manual = new ExecutorFragment(Types._Manual, HorizontalelasticityTables.Types._Manual);
		private static final /*@NonNull*/ ExecutorFragment _Manual__OclAny = new ExecutorFragment(Types._Manual, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manual__OclElement = new ExecutorFragment(Types._Manual, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Manual__Resource = new ExecutorFragment(Types._Manual, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__MetricTargetTracking = new ExecutorFragment(Types._MetricTargetTracking, HorizontalelasticityTables.Types._MetricTargetTracking);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclAny = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclElement = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclEnumeration = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _MetricTargetTracking__OclType = new ExecutorFragment(Types._MetricTargetTracking, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclAny = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclElement = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclEnumeration = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OclType = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _OperatorType__OperatorType = new ExecutorFragment(Types._OperatorType, HorizontalelasticityTables.Types._OperatorType);

		private static final /*@NonNull*/ ExecutorFragment _RecurrenceStep__OclAny = new ExecutorFragment(Types._RecurrenceStep, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RecurrenceStep__OclElement = new ExecutorFragment(Types._RecurrenceStep, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RecurrenceStep__RecurrenceStep = new ExecutorFragment(Types._RecurrenceStep, HorizontalelasticityTables.Types._RecurrenceStep);

		private static final /*@NonNull*/ ExecutorFragment _Recurringschedule__MixinBase = new ExecutorFragment(Types._Recurringschedule, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedule__OclAny = new ExecutorFragment(Types._Recurringschedule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedule__OclElement = new ExecutorFragment(Types._Recurringschedule, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedule__Recurringschedule = new ExecutorFragment(Types._Recurringschedule, HorizontalelasticityTables.Types._Recurringschedule);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedule__Scheduler = new ExecutorFragment(Types._Recurringschedule, HorizontalelasticityTables.Types._Scheduler);

		private static final /*@NonNull*/ ExecutorFragment _Rule__MixinBase = new ExecutorFragment(Types._Rule, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Rule__OclAny = new ExecutorFragment(Types._Rule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rule__OclElement = new ExecutorFragment(Types._Rule, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rule__Rule = new ExecutorFragment(Types._Rule, HorizontalelasticityTables.Types._Rule);

		private static final /*@NonNull*/ ExecutorFragment _Scheduler__MixinBase = new ExecutorFragment(Types._Scheduler, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Scheduler__OclAny = new ExecutorFragment(Types._Scheduler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Scheduler__OclElement = new ExecutorFragment(Types._Scheduler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Scheduler__Scheduler = new ExecutorFragment(Types._Scheduler, HorizontalelasticityTables.Types._Scheduler);

		private static final /*@NonNull*/ ExecutorFragment _Simpledynamic__Dynamic = new ExecutorFragment(Types._Simpledynamic, HorizontalelasticityTables.Types._Dynamic);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamic__Entity = new ExecutorFragment(Types._Simpledynamic, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamic__Horizontalelasticcontroller = new ExecutorFragment(Types._Simpledynamic, HorizontalelasticityTables.Types._Horizontalelasticcontroller);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamic__OclAny = new ExecutorFragment(Types._Simpledynamic, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamic__OclElement = new ExecutorFragment(Types._Simpledynamic, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamic__Resource = new ExecutorFragment(Types._Simpledynamic, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamic__Simpledynamic = new ExecutorFragment(Types._Simpledynamic, HorizontalelasticityTables.Types._Simpledynamic);

		private static final /*@NonNull*/ ExecutorFragment _Stepdynamic__Dynamic = new ExecutorFragment(Types._Stepdynamic, HorizontalelasticityTables.Types._Dynamic);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamic__Entity = new ExecutorFragment(Types._Stepdynamic, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamic__Horizontalelasticcontroller = new ExecutorFragment(Types._Stepdynamic, HorizontalelasticityTables.Types._Horizontalelasticcontroller);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamic__OclAny = new ExecutorFragment(Types._Stepdynamic, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamic__OclElement = new ExecutorFragment(Types._Stepdynamic, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamic__Resource = new ExecutorFragment(Types._Stepdynamic, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamic__Stepdynamic = new ExecutorFragment(Types._Stepdynamic, HorizontalelasticityTables.Types._Stepdynamic);

		private static final /*@NonNull*/ ExecutorFragment _Steps__MixinBase = new ExecutorFragment(Types._Steps, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Steps__OclAny = new ExecutorFragment(Types._Steps, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Steps__OclElement = new ExecutorFragment(Types._Steps, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Steps__Steps = new ExecutorFragment(Types._Steps, HorizontalelasticityTables.Types._Steps);

		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclAny = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclElement = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclEnumeration = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclType = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__TypeMetric = new ExecutorFragment(Types._TypeMetric, HorizontalelasticityTables.Types._TypeMetric);

		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedule__MixinBase = new ExecutorFragment(Types._Uniqueschedule, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedule__OclAny = new ExecutorFragment(Types._Uniqueschedule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedule__OclElement = new ExecutorFragment(Types._Uniqueschedule, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedule__Scheduler = new ExecutorFragment(Types._Uniqueschedule, HorizontalelasticityTables.Types._Scheduler);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedule__Uniqueschedule = new ExecutorFragment(Types._Uniqueschedule, HorizontalelasticityTables.Types._Uniqueschedule);

		private static final /*@NonNull*/ ExecutorFragment _Unit__OclAny = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Unit__OclElement = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Unit__OclEnumeration = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Unit__OclType = new ExecutorFragment(Types._Unit, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Unit__Unit = new ExecutorFragment(Types._Unit, HorizontalelasticityTables.Types._Unit);

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

		public static final /*@NonNull*/ ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);

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

		public static final /*@NonNull*/ ExecutorOperation _Date__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._Date,
			0, TemplateParameters.EMPTY_LIST, null);

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
		public static final /*@NonNull*/ ExecutorOperation _Manual__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Manual,
			1, TemplateParameters.EMPTY_LIST, null);

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

		public static final /*@NonNull*/ ExecutorProperty _Action__actionAction = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ACTION__ACTION_ACTION, Types._Action, 0);
		public static final /*@NonNull*/ ExecutorProperty _Action__actionActionType = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ACTION__ACTION_ACTION_TYPE, Types._Action, 1);
		public static final /*@NonNull*/ ExecutorProperty _Action__actionAmount = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ACTION__ACTION_AMOUNT, Types._Action, 2);

		public static final /*@NonNull*/ ExecutorProperty _Array__values = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ARRAY__VALUES, Types._Array, 0);
		public static final /*@NonNull*/ ExecutorProperty _Array__RecurrenceStep__value = new ExecutorPropertyWithImplementation("RecurrenceStep", Types._Array, 1, new EcoreLibraryOppositeProperty(HorizontalelasticityPackage.Literals.RECURRENCE_STEP__VALUE));

		public static final /*@NonNull*/ ExecutorProperty _ArrayofRecurrenceStep__arrayofrecurrencestepValues = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES, Types._ArrayofRecurrenceStep, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArrayofRecurrenceStep__Recurringschedule__RecurringscheduleRecurrence = new ExecutorPropertyWithImplementation("Recurringschedule", Types._ArrayofRecurrenceStep, 1, new EcoreLibraryOppositeProperty(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE));

		public static final /*@NonNull*/ ExecutorProperty _Creation__occiComputeCreationDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.CREATION__OCCI_COMPUTE_CREATION_DATE, Types._Creation, 0);

		public static final /*@NonNull*/ ExecutorProperty _Dynamic__dynamicGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMIC__DYNAMIC_GROUP_SIZE, Types._Dynamic, 0);
		public static final /*@NonNull*/ ExecutorProperty _Dynamic__dynamicMaxGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMIC__DYNAMIC_MAX_GROUP_SIZE, Types._Dynamic, 1);
		public static final /*@NonNull*/ ExecutorProperty _Dynamic__dynamicMinGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMIC__DYNAMIC_MIN_GROUP_SIZE, Types._Dynamic, 2);

		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustment__dynamicAdjustmentCoolDuration = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_COOL_DURATION, Types._Dynamicadjustment, 0);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustment__dynamicAdjustmentDisableScaleIn = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_DISABLE_SCALE_IN, Types._Dynamicadjustment, 1);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustment__dynamicAdjustmentMetric = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_METRIC, Types._Dynamicadjustment, 2);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustment__dynamicAdjustmentName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_NAME, Types._Dynamicadjustment, 3);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustment__dynamicAdjustmentTarget = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENT__DYNAMIC_ADJUSTMENT_TARGET, Types._Dynamicadjustment, 4);

		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalGroupGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_GROUP_SIZE, Types._Horizontalgroup, 0);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalGroupLoadBalancer = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_LOAD_BALANCER, Types._Horizontalgroup, 1);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalGroupMaximum = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_MAXIMUM, Types._Horizontalgroup, 2);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalGroupMinimum = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_MINIMUM, Types._Horizontalgroup, 3);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalGroupName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_NAME, Types._Horizontalgroup, 4);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalGroupTemplateName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTAL_GROUP_TEMPLATE_NAME, Types._Horizontalgroup, 5);

		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerAddress = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_ADDRESS, Types._Loadbalancer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerInstanceIP = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_INSTANCE_IP, Types._Loadbalancer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_NAME, Types._Loadbalancer, 2);

		public static final /*@NonNull*/ ExecutorProperty _Manual__manualGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.MANUAL__MANUAL_GROUP_SIZE, Types._Manual, 0);
		public static final /*@NonNull*/ ExecutorProperty _Manual__manualMaxGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.MANUAL__MANUAL_MAX_GROUP_SIZE, Types._Manual, 1);
		public static final /*@NonNull*/ ExecutorProperty _Manual__manualMinGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.MANUAL__MANUAL_MIN_GROUP_SIZE, Types._Manual, 2);

		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__unit = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRENCE_STEP__UNIT, Types._RecurrenceStep, 0);
		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__value = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRENCE_STEP__VALUE, Types._RecurrenceStep, 1);
		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__ArrayofRecurrenceStep__arrayofrecurrencestepValues = new ExecutorPropertyWithImplementation("ArrayofRecurrenceStep", Types._RecurrenceStep, 2, new EcoreLibraryOppositeProperty(HorizontalelasticityPackage.Literals.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES));

		public static final /*@NonNull*/ ExecutorProperty _Recurringschedule__RecurringscheduleRecurrence = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULE__RECURRINGSCHEDULE_RECURRENCE, Types._Recurringschedule, 0);

		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleConsecutive = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_CONSECUTIVE, Types._Rule, 0);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleMetric = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_METRIC, Types._Rule, 1);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_NAME, Types._Rule, 2);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleOperator = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_OPERATOR, Types._Rule, 3);
		public static final /*@NonNull*/ ExecutorProperty _Rule__rulePeriod = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_PERIOD, Types._Rule, 4);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleThreshold = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_THRESHOLD, Types._Rule, 5);

		public static final /*@NonNull*/ ExecutorProperty _Scheduler__schedulerEndDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.SCHEDULER__SCHEDULER_END_DATE, Types._Scheduler, 0);
		public static final /*@NonNull*/ ExecutorProperty _Scheduler__schedulerStartDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.SCHEDULER__SCHEDULER_START_DATE, Types._Scheduler, 1);

		public static final /*@NonNull*/ ExecutorProperty _Simpledynamic__simpleDynamicCoolDuration = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_COOL_DURATION, Types._Simpledynamic, 0);
		public static final /*@NonNull*/ ExecutorProperty _Simpledynamic__simpleDynamicName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.SIMPLEDYNAMIC__SIMPLE_DYNAMIC_NAME, Types._Simpledynamic, 1);

		public static final /*@NonNull*/ ExecutorProperty _Stepdynamic__stepDynamicCoolDuration = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.STEPDYNAMIC__STEP_DYNAMIC_COOL_DURATION, Types._Stepdynamic, 0);
		public static final /*@NonNull*/ ExecutorProperty _Stepdynamic__stepDynamicName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.STEPDYNAMIC__STEP_DYNAMIC_NAME, Types._Stepdynamic, 1);

		public static final /*@NonNull*/ ExecutorProperty _Steps__stepsLowerStepBound = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.STEPS__STEPS_LOWER_STEP_BOUND, Types._Steps, 0);
		public static final /*@NonNull*/ ExecutorProperty _Steps__stepsUpperStepBound = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.STEPS__STEPS_UPPER_STEP_BOUND, Types._Steps, 1);
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Action =
		{
			Fragments._Action__OclAny /* 0 */,
			Fragments._Action__OclElement /* 1 */,
			Fragments._Action__MixinBase /* 2 */,
			Fragments._Action__Action /* 3 */
		};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ActionOperation =
		{
			Fragments._ActionOperation__OclAny /* 0 */,
			Fragments._ActionOperation__OclElement /* 1 */,
			Fragments._ActionOperation__OclType /* 2 */,
			Fragments._ActionOperation__OclEnumeration /* 3 */,
			Fragments._ActionOperation__ActionOperation /* 4 */
		};
		private static final int /*@NonNull*/ [] __ActionOperation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ActionType =
		{
			Fragments._ActionType__OclAny /* 0 */,
			Fragments._ActionType__OclElement /* 1 */,
			Fragments._ActionType__OclType /* 2 */,
			Fragments._ActionType__OclEnumeration /* 3 */,
			Fragments._ActionType__ActionType /* 4 */
		};
		private static final int /*@NonNull*/ [] __ActionType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Array =
		{
			Fragments._Array__OclAny /* 0 */,
			Fragments._Array__OclElement /* 1 */,
			Fragments._Array__Array /* 2 */
		};
		private static final int /*@NonNull*/ [] __Array = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayofRecurrenceStep =
		{
			Fragments._ArrayofRecurrenceStep__OclAny /* 0 */,
			Fragments._ArrayofRecurrenceStep__OclElement /* 1 */,
			Fragments._ArrayofRecurrenceStep__ArrayofRecurrenceStep /* 2 */
		};
		private static final int /*@NonNull*/ [] __ArrayofRecurrenceStep = { 1,1,1 };

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
			Fragments._Date__OclComparable /* 1 */,
			Fragments._Date__Date /* 2 */
		};
		private static final int /*@NonNull*/ [] __Date = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamic =
		{
			Fragments._Dynamic__OclAny /* 0 */,
			Fragments._Dynamic__OclElement /* 1 */,
			Fragments._Dynamic__Entity /* 2 */,
			Fragments._Dynamic__Resource /* 3 */,
			Fragments._Dynamic__Horizontalelasticcontroller /* 4 */,
			Fragments._Dynamic__Dynamic /* 5 */
		};
		private static final int /*@NonNull*/ [] __Dynamic = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamicadjustment =
		{
			Fragments._Dynamicadjustment__OclAny /* 0 */,
			Fragments._Dynamicadjustment__OclElement /* 1 */,
			Fragments._Dynamicadjustment__Entity /* 2 */,
			Fragments._Dynamicadjustment__Resource /* 3 */,
			Fragments._Dynamicadjustment__Horizontalelasticcontroller /* 4 */,
			Fragments._Dynamicadjustment__Dynamic /* 5 */,
			Fragments._Dynamicadjustment__Dynamicadjustment /* 6 */
		};
		private static final int /*@NonNull*/ [] __Dynamicadjustment = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Float =
		{
			Fragments._Float__OclAny /* 0 */,
			Fragments._Float__Float /* 1 */
		};
		private static final int /*@NonNull*/ [] __Float = { 1,1 };

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
			Fragments._Manual__Entity /* 2 */,
			Fragments._Manual__Resource /* 3 */,
			Fragments._Manual__Horizontalelasticcontroller /* 4 */,
			Fragments._Manual__Manual /* 5 */
		};
		private static final int /*@NonNull*/ [] __Manual = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MetricTargetTracking =
		{
			Fragments._MetricTargetTracking__OclAny /* 0 */,
			Fragments._MetricTargetTracking__OclElement /* 1 */,
			Fragments._MetricTargetTracking__OclType /* 2 */,
			Fragments._MetricTargetTracking__OclEnumeration /* 3 */,
			Fragments._MetricTargetTracking__MetricTargetTracking /* 4 */
		};
		private static final int /*@NonNull*/ [] __MetricTargetTracking = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _OperatorType =
		{
			Fragments._OperatorType__OclAny /* 0 */,
			Fragments._OperatorType__OclElement /* 1 */,
			Fragments._OperatorType__OclType /* 2 */,
			Fragments._OperatorType__OclEnumeration /* 3 */,
			Fragments._OperatorType__OperatorType /* 4 */
		};
		private static final int /*@NonNull*/ [] __OperatorType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RecurrenceStep =
		{
			Fragments._RecurrenceStep__OclAny /* 0 */,
			Fragments._RecurrenceStep__OclElement /* 1 */,
			Fragments._RecurrenceStep__RecurrenceStep /* 2 */
		};
		private static final int /*@NonNull*/ [] __RecurrenceStep = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Recurringschedule =
		{
			Fragments._Recurringschedule__OclAny /* 0 */,
			Fragments._Recurringschedule__OclElement /* 1 */,
			Fragments._Recurringschedule__MixinBase /* 2 */,
			Fragments._Recurringschedule__Scheduler /* 3 */,
			Fragments._Recurringschedule__Recurringschedule /* 4 */
		};
		private static final int /*@NonNull*/ [] __Recurringschedule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rule =
		{
			Fragments._Rule__OclAny /* 0 */,
			Fragments._Rule__OclElement /* 1 */,
			Fragments._Rule__MixinBase /* 2 */,
			Fragments._Rule__Rule /* 3 */
		};
		private static final int /*@NonNull*/ [] __Rule = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Scheduler =
		{
			Fragments._Scheduler__OclAny /* 0 */,
			Fragments._Scheduler__OclElement /* 1 */,
			Fragments._Scheduler__MixinBase /* 2 */,
			Fragments._Scheduler__Scheduler /* 3 */
		};
		private static final int /*@NonNull*/ [] __Scheduler = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Simpledynamic =
		{
			Fragments._Simpledynamic__OclAny /* 0 */,
			Fragments._Simpledynamic__OclElement /* 1 */,
			Fragments._Simpledynamic__Entity /* 2 */,
			Fragments._Simpledynamic__Resource /* 3 */,
			Fragments._Simpledynamic__Horizontalelasticcontroller /* 4 */,
			Fragments._Simpledynamic__Dynamic /* 5 */,
			Fragments._Simpledynamic__Simpledynamic /* 6 */
		};
		private static final int /*@NonNull*/ [] __Simpledynamic = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Stepdynamic =
		{
			Fragments._Stepdynamic__OclAny /* 0 */,
			Fragments._Stepdynamic__OclElement /* 1 */,
			Fragments._Stepdynamic__Entity /* 2 */,
			Fragments._Stepdynamic__Resource /* 3 */,
			Fragments._Stepdynamic__Horizontalelasticcontroller /* 4 */,
			Fragments._Stepdynamic__Dynamic /* 5 */,
			Fragments._Stepdynamic__Stepdynamic /* 6 */
		};
		private static final int /*@NonNull*/ [] __Stepdynamic = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Steps =
		{
			Fragments._Steps__OclAny /* 0 */,
			Fragments._Steps__OclElement /* 1 */,
			Fragments._Steps__MixinBase /* 2 */,
			Fragments._Steps__Steps /* 3 */
		};
		private static final int /*@NonNull*/ [] __Steps = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypeMetric =
		{
			Fragments._TypeMetric__OclAny /* 0 */,
			Fragments._TypeMetric__OclElement /* 1 */,
			Fragments._TypeMetric__OclType /* 2 */,
			Fragments._TypeMetric__OclEnumeration /* 3 */,
			Fragments._TypeMetric__TypeMetric /* 4 */
		};
		private static final int /*@NonNull*/ [] __TypeMetric = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Uniqueschedule =
		{
			Fragments._Uniqueschedule__OclAny /* 0 */,
			Fragments._Uniqueschedule__OclElement /* 1 */,
			Fragments._Uniqueschedule__MixinBase /* 2 */,
			Fragments._Uniqueschedule__Scheduler /* 3 */,
			Fragments._Uniqueschedule__Uniqueschedule /* 4 */
		};
		private static final int /*@NonNull*/ [] __Uniqueschedule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Unit =
		{
			Fragments._Unit__OclAny /* 0 */,
			Fragments._Unit__OclElement /* 1 */,
			Fragments._Unit__OclType /* 2 */,
			Fragments._Unit__OclEnumeration /* 3 */,
			Fragments._Unit__Unit /* 4 */
		};
		private static final int /*@NonNull*/ [] __Unit = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._ActionOperation.initFragments(_ActionOperation, __ActionOperation);
			Types._ActionType.initFragments(_ActionType, __ActionType);
			Types._Array.initFragments(_Array, __Array);
			Types._ArrayofRecurrenceStep.initFragments(_ArrayofRecurrenceStep, __ArrayofRecurrenceStep);
			Types._Creation.initFragments(_Creation, __Creation);
			Types._Date.initFragments(_Date, __Date);
			Types._Dynamic.initFragments(_Dynamic, __Dynamic);
			Types._Dynamicadjustment.initFragments(_Dynamicadjustment, __Dynamicadjustment);
			Types._Float.initFragments(_Float, __Float);
			Types._Grouplink.initFragments(_Grouplink, __Grouplink);
			Types._Horizontalelasticcontroller.initFragments(_Horizontalelasticcontroller, __Horizontalelasticcontroller);
			Types._Horizontalgroup.initFragments(_Horizontalgroup, __Horizontalgroup);
			Types._Instancegrouplink.initFragments(_Instancegrouplink, __Instancegrouplink);
			Types._Linkbalancer.initFragments(_Linkbalancer, __Linkbalancer);
			Types._Loadbalancer.initFragments(_Loadbalancer, __Loadbalancer);
			Types._Manual.initFragments(_Manual, __Manual);
			Types._MetricTargetTracking.initFragments(_MetricTargetTracking, __MetricTargetTracking);
			Types._OperatorType.initFragments(_OperatorType, __OperatorType);
			Types._RecurrenceStep.initFragments(_RecurrenceStep, __RecurrenceStep);
			Types._Recurringschedule.initFragments(_Recurringschedule, __Recurringschedule);
			Types._Rule.initFragments(_Rule, __Rule);
			Types._Scheduler.initFragments(_Scheduler, __Scheduler);
			Types._Simpledynamic.initFragments(_Simpledynamic, __Simpledynamic);
			Types._Stepdynamic.initFragments(_Stepdynamic, __Stepdynamic);
			Types._Steps.initFragments(_Steps, __Steps);
			Types._TypeMetric.initFragments(_TypeMetric, __TypeMetric);
			Types._Uniqueschedule.initFragments(_Uniqueschedule, __Uniqueschedule);
			Types._Unit.initFragments(_Unit, __Unit);

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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__ActionOperation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionOperation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__ActionType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ActionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Array__Array = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Array__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Array__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayofRecurrenceStep__ArrayofRecurrenceStep = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayofRecurrenceStep__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayofRecurrenceStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Date__Date = {
			HorizontalelasticityTables.Operations._Date__compareTo /* compareTo(OclSelf[1]) */
		};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Date__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__Dynamic = {
			HorizontalelasticityTables.Operations._Dynamic__start /* start() */,
			HorizontalelasticityTables.Operations._Dynamic__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__Horizontalelasticcontroller = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamic__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustment__Dynamicadjustment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustment__Dynamic = {
			HorizontalelasticityTables.Operations._Dynamic__start /* start() */,
			HorizontalelasticityTables.Operations._Dynamic__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustment__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustment__Horizontalelasticcontroller = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustment__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustment__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Float__Float = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Float__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Grouplink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancegrouplink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Linkbalancer__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
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
			HorizontalelasticityTables.Operations._Manual__start /* start() */,
			HorizontalelasticityTables.Operations._Manual__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__Horizontalelasticcontroller = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manual__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__MetricTargetTracking = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MetricTargetTracking__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OperatorType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OperatorType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecurrenceStep__RecurrenceStep = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecurrenceStep__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecurrenceStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedule__Recurringschedule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedule__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedule__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedule__Scheduler = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__Rule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scheduler__Scheduler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scheduler__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scheduler__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scheduler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamic__Simpledynamic = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamic__Dynamic = {
			HorizontalelasticityTables.Operations._Dynamic__start /* start() */,
			HorizontalelasticityTables.Operations._Dynamic__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamic__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamic__Horizontalelasticcontroller = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamic__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamic__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamic__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamic__Stepdynamic = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamic__Dynamic = {
			HorizontalelasticityTables.Operations._Dynamic__start /* start() */,
			HorizontalelasticityTables.Operations._Dynamic__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamic__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamic__Horizontalelasticcontroller = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamic__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamic__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamic__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steps__Steps = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steps__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steps__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steps__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeMetric__TypeMetric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeMetric__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeMetric__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeMetric__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TypeMetric__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedule__Uniqueschedule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedule__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedule__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedule__Scheduler = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__Unit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Unit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__MixinBase.initOperations(_Action__MixinBase);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._ActionOperation__ActionOperation.initOperations(_ActionOperation__ActionOperation);
			Fragments._ActionOperation__OclAny.initOperations(_ActionOperation__OclAny);
			Fragments._ActionOperation__OclElement.initOperations(_ActionOperation__OclElement);
			Fragments._ActionOperation__OclEnumeration.initOperations(_ActionOperation__OclEnumeration);
			Fragments._ActionOperation__OclType.initOperations(_ActionOperation__OclType);

			Fragments._ActionType__ActionType.initOperations(_ActionType__ActionType);
			Fragments._ActionType__OclAny.initOperations(_ActionType__OclAny);
			Fragments._ActionType__OclElement.initOperations(_ActionType__OclElement);
			Fragments._ActionType__OclEnumeration.initOperations(_ActionType__OclEnumeration);
			Fragments._ActionType__OclType.initOperations(_ActionType__OclType);

			Fragments._Array__Array.initOperations(_Array__Array);
			Fragments._Array__OclAny.initOperations(_Array__OclAny);
			Fragments._Array__OclElement.initOperations(_Array__OclElement);

			Fragments._ArrayofRecurrenceStep__ArrayofRecurrenceStep.initOperations(_ArrayofRecurrenceStep__ArrayofRecurrenceStep);
			Fragments._ArrayofRecurrenceStep__OclAny.initOperations(_ArrayofRecurrenceStep__OclAny);
			Fragments._ArrayofRecurrenceStep__OclElement.initOperations(_ArrayofRecurrenceStep__OclElement);

			Fragments._Creation__Creation.initOperations(_Creation__Creation);
			Fragments._Creation__MixinBase.initOperations(_Creation__MixinBase);
			Fragments._Creation__OclAny.initOperations(_Creation__OclAny);
			Fragments._Creation__OclElement.initOperations(_Creation__OclElement);

			Fragments._Date__Date.initOperations(_Date__Date);
			Fragments._Date__OclAny.initOperations(_Date__OclAny);
			Fragments._Date__OclComparable.initOperations(_Date__OclComparable);

			Fragments._Dynamic__Dynamic.initOperations(_Dynamic__Dynamic);
			Fragments._Dynamic__Entity.initOperations(_Dynamic__Entity);
			Fragments._Dynamic__Horizontalelasticcontroller.initOperations(_Dynamic__Horizontalelasticcontroller);
			Fragments._Dynamic__OclAny.initOperations(_Dynamic__OclAny);
			Fragments._Dynamic__OclElement.initOperations(_Dynamic__OclElement);
			Fragments._Dynamic__Resource.initOperations(_Dynamic__Resource);

			Fragments._Dynamicadjustment__Dynamic.initOperations(_Dynamicadjustment__Dynamic);
			Fragments._Dynamicadjustment__Dynamicadjustment.initOperations(_Dynamicadjustment__Dynamicadjustment);
			Fragments._Dynamicadjustment__Entity.initOperations(_Dynamicadjustment__Entity);
			Fragments._Dynamicadjustment__Horizontalelasticcontroller.initOperations(_Dynamicadjustment__Horizontalelasticcontroller);
			Fragments._Dynamicadjustment__OclAny.initOperations(_Dynamicadjustment__OclAny);
			Fragments._Dynamicadjustment__OclElement.initOperations(_Dynamicadjustment__OclElement);
			Fragments._Dynamicadjustment__Resource.initOperations(_Dynamicadjustment__Resource);

			Fragments._Float__Float.initOperations(_Float__Float);
			Fragments._Float__OclAny.initOperations(_Float__OclAny);

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

			Fragments._Manual__Entity.initOperations(_Manual__Entity);
			Fragments._Manual__Horizontalelasticcontroller.initOperations(_Manual__Horizontalelasticcontroller);
			Fragments._Manual__Manual.initOperations(_Manual__Manual);
			Fragments._Manual__OclAny.initOperations(_Manual__OclAny);
			Fragments._Manual__OclElement.initOperations(_Manual__OclElement);
			Fragments._Manual__Resource.initOperations(_Manual__Resource);

			Fragments._MetricTargetTracking__MetricTargetTracking.initOperations(_MetricTargetTracking__MetricTargetTracking);
			Fragments._MetricTargetTracking__OclAny.initOperations(_MetricTargetTracking__OclAny);
			Fragments._MetricTargetTracking__OclElement.initOperations(_MetricTargetTracking__OclElement);
			Fragments._MetricTargetTracking__OclEnumeration.initOperations(_MetricTargetTracking__OclEnumeration);
			Fragments._MetricTargetTracking__OclType.initOperations(_MetricTargetTracking__OclType);

			Fragments._OperatorType__OclAny.initOperations(_OperatorType__OclAny);
			Fragments._OperatorType__OclElement.initOperations(_OperatorType__OclElement);
			Fragments._OperatorType__OclEnumeration.initOperations(_OperatorType__OclEnumeration);
			Fragments._OperatorType__OclType.initOperations(_OperatorType__OclType);
			Fragments._OperatorType__OperatorType.initOperations(_OperatorType__OperatorType);

			Fragments._RecurrenceStep__OclAny.initOperations(_RecurrenceStep__OclAny);
			Fragments._RecurrenceStep__OclElement.initOperations(_RecurrenceStep__OclElement);
			Fragments._RecurrenceStep__RecurrenceStep.initOperations(_RecurrenceStep__RecurrenceStep);

			Fragments._Recurringschedule__MixinBase.initOperations(_Recurringschedule__MixinBase);
			Fragments._Recurringschedule__OclAny.initOperations(_Recurringschedule__OclAny);
			Fragments._Recurringschedule__OclElement.initOperations(_Recurringschedule__OclElement);
			Fragments._Recurringschedule__Recurringschedule.initOperations(_Recurringschedule__Recurringschedule);
			Fragments._Recurringschedule__Scheduler.initOperations(_Recurringschedule__Scheduler);

			Fragments._Rule__MixinBase.initOperations(_Rule__MixinBase);
			Fragments._Rule__OclAny.initOperations(_Rule__OclAny);
			Fragments._Rule__OclElement.initOperations(_Rule__OclElement);
			Fragments._Rule__Rule.initOperations(_Rule__Rule);

			Fragments._Scheduler__MixinBase.initOperations(_Scheduler__MixinBase);
			Fragments._Scheduler__OclAny.initOperations(_Scheduler__OclAny);
			Fragments._Scheduler__OclElement.initOperations(_Scheduler__OclElement);
			Fragments._Scheduler__Scheduler.initOperations(_Scheduler__Scheduler);

			Fragments._Simpledynamic__Dynamic.initOperations(_Simpledynamic__Dynamic);
			Fragments._Simpledynamic__Entity.initOperations(_Simpledynamic__Entity);
			Fragments._Simpledynamic__Horizontalelasticcontroller.initOperations(_Simpledynamic__Horizontalelasticcontroller);
			Fragments._Simpledynamic__OclAny.initOperations(_Simpledynamic__OclAny);
			Fragments._Simpledynamic__OclElement.initOperations(_Simpledynamic__OclElement);
			Fragments._Simpledynamic__Resource.initOperations(_Simpledynamic__Resource);
			Fragments._Simpledynamic__Simpledynamic.initOperations(_Simpledynamic__Simpledynamic);

			Fragments._Stepdynamic__Dynamic.initOperations(_Stepdynamic__Dynamic);
			Fragments._Stepdynamic__Entity.initOperations(_Stepdynamic__Entity);
			Fragments._Stepdynamic__Horizontalelasticcontroller.initOperations(_Stepdynamic__Horizontalelasticcontroller);
			Fragments._Stepdynamic__OclAny.initOperations(_Stepdynamic__OclAny);
			Fragments._Stepdynamic__OclElement.initOperations(_Stepdynamic__OclElement);
			Fragments._Stepdynamic__Resource.initOperations(_Stepdynamic__Resource);
			Fragments._Stepdynamic__Stepdynamic.initOperations(_Stepdynamic__Stepdynamic);

			Fragments._Steps__MixinBase.initOperations(_Steps__MixinBase);
			Fragments._Steps__OclAny.initOperations(_Steps__OclAny);
			Fragments._Steps__OclElement.initOperations(_Steps__OclElement);
			Fragments._Steps__Steps.initOperations(_Steps__Steps);

			Fragments._TypeMetric__OclAny.initOperations(_TypeMetric__OclAny);
			Fragments._TypeMetric__OclElement.initOperations(_TypeMetric__OclElement);
			Fragments._TypeMetric__OclEnumeration.initOperations(_TypeMetric__OclEnumeration);
			Fragments._TypeMetric__OclType.initOperations(_TypeMetric__OclType);
			Fragments._TypeMetric__TypeMetric.initOperations(_TypeMetric__TypeMetric);

			Fragments._Uniqueschedule__MixinBase.initOperations(_Uniqueschedule__MixinBase);
			Fragments._Uniqueschedule__OclAny.initOperations(_Uniqueschedule__OclAny);
			Fragments._Uniqueschedule__OclElement.initOperations(_Uniqueschedule__OclElement);
			Fragments._Uniqueschedule__Scheduler.initOperations(_Uniqueschedule__Scheduler);
			Fragments._Uniqueschedule__Uniqueschedule.initOperations(_Uniqueschedule__Uniqueschedule);

			Fragments._Unit__OclAny.initOperations(_Unit__OclAny);
			Fragments._Unit__OclElement.initOperations(_Unit__OclElement);
			Fragments._Unit__OclEnumeration.initOperations(_Unit__OclEnumeration);
			Fragments._Unit__OclType.initOperations(_Unit__OclType);
			Fragments._Unit__Unit.initOperations(_Unit__Unit);

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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Action = {
			HorizontalelasticityTables.Properties._Action__actionAction,
			HorizontalelasticityTables.Properties._Action__actionActionType,
			HorizontalelasticityTables.Properties._Action__actionAmount
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ActionOperation = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ActionType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Array = {
			HorizontalelasticityTables.Properties._Array__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayofRecurrenceStep = {
			HorizontalelasticityTables.Properties._ArrayofRecurrenceStep__arrayofrecurrencestepValues
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Creation = {
			HorizontalelasticityTables.Properties._Creation__occiComputeCreationDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Date = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamic = {
			HorizontalelasticityTables.Properties._Dynamic__dynamicGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMaxGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMinGroupSize
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamicadjustment = {
			HorizontalelasticityTables.Properties._Dynamicadjustment__dynamicAdjustmentCoolDuration,
			HorizontalelasticityTables.Properties._Dynamicadjustment__dynamicAdjustmentDisableScaleIn,
			HorizontalelasticityTables.Properties._Dynamicadjustment__dynamicAdjustmentMetric,
			HorizontalelasticityTables.Properties._Dynamicadjustment__dynamicAdjustmentName,
			HorizontalelasticityTables.Properties._Dynamicadjustment__dynamicAdjustmentTarget,
			HorizontalelasticityTables.Properties._Dynamic__dynamicGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMaxGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMinGroupSize
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Float = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Grouplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Horizontalelasticcontroller = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Horizontalgroup = {
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalGroupGroupSize,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalGroupLoadBalancer,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalGroupMaximum,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalGroupMinimum,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalGroupName,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalGroupTemplateName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instancegrouplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Linkbalancer = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadbalancer = {
			HorizontalelasticityTables.Properties._Loadbalancer__loadbalancerAddress,
			HorizontalelasticityTables.Properties._Loadbalancer__loadbalancerInstanceIP,
			HorizontalelasticityTables.Properties._Loadbalancer__loadbalancerName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manual = {
			HorizontalelasticityTables.Properties._Manual__manualGroupSize,
			HorizontalelasticityTables.Properties._Manual__manualMaxGroupSize,
			HorizontalelasticityTables.Properties._Manual__manualMinGroupSize
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MetricTargetTracking = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _OperatorType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RecurrenceStep = {
			HorizontalelasticityTables.Properties._RecurrenceStep__unit,
			HorizontalelasticityTables.Properties._RecurrenceStep__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Recurringschedule = {
			HorizontalelasticityTables.Properties._Recurringschedule__RecurringscheduleRecurrence,
			HorizontalelasticityTables.Properties._Scheduler__schedulerEndDate,
			HorizontalelasticityTables.Properties._Scheduler__schedulerStartDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rule = {
			HorizontalelasticityTables.Properties._Rule__ruleConsecutive,
			HorizontalelasticityTables.Properties._Rule__ruleMetric,
			HorizontalelasticityTables.Properties._Rule__ruleName,
			HorizontalelasticityTables.Properties._Rule__ruleOperator,
			HorizontalelasticityTables.Properties._Rule__rulePeriod,
			HorizontalelasticityTables.Properties._Rule__ruleThreshold
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Scheduler = {
			HorizontalelasticityTables.Properties._Scheduler__schedulerEndDate,
			HorizontalelasticityTables.Properties._Scheduler__schedulerStartDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Simpledynamic = {
			HorizontalelasticityTables.Properties._Dynamic__dynamicGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMaxGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMinGroupSize,
			HorizontalelasticityTables.Properties._Simpledynamic__simpleDynamicCoolDuration,
			HorizontalelasticityTables.Properties._Simpledynamic__simpleDynamicName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Stepdynamic = {
			HorizontalelasticityTables.Properties._Dynamic__dynamicGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMaxGroupSize,
			HorizontalelasticityTables.Properties._Dynamic__dynamicMinGroupSize,
			HorizontalelasticityTables.Properties._Stepdynamic__stepDynamicCoolDuration,
			HorizontalelasticityTables.Properties._Stepdynamic__stepDynamicName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Steps = {
			HorizontalelasticityTables.Properties._Steps__stepsLowerStepBound,
			HorizontalelasticityTables.Properties._Steps__stepsUpperStepBound
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypeMetric = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Uniqueschedule = {
			HorizontalelasticityTables.Properties._Scheduler__schedulerEndDate,
			HorizontalelasticityTables.Properties._Scheduler__schedulerStartDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Unit = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._ActionOperation__ActionOperation.initProperties(_ActionOperation);
			Fragments._ActionType__ActionType.initProperties(_ActionType);
			Fragments._Array__Array.initProperties(_Array);
			Fragments._ArrayofRecurrenceStep__ArrayofRecurrenceStep.initProperties(_ArrayofRecurrenceStep);
			Fragments._Creation__Creation.initProperties(_Creation);
			Fragments._Date__Date.initProperties(_Date);
			Fragments._Dynamic__Dynamic.initProperties(_Dynamic);
			Fragments._Dynamicadjustment__Dynamicadjustment.initProperties(_Dynamicadjustment);
			Fragments._Float__Float.initProperties(_Float);
			Fragments._Grouplink__Grouplink.initProperties(_Grouplink);
			Fragments._Horizontalelasticcontroller__Horizontalelasticcontroller.initProperties(_Horizontalelasticcontroller);
			Fragments._Horizontalgroup__Horizontalgroup.initProperties(_Horizontalgroup);
			Fragments._Instancegrouplink__Instancegrouplink.initProperties(_Instancegrouplink);
			Fragments._Linkbalancer__Linkbalancer.initProperties(_Linkbalancer);
			Fragments._Loadbalancer__Loadbalancer.initProperties(_Loadbalancer);
			Fragments._Manual__Manual.initProperties(_Manual);
			Fragments._MetricTargetTracking__MetricTargetTracking.initProperties(_MetricTargetTracking);
			Fragments._OperatorType__OperatorType.initProperties(_OperatorType);
			Fragments._RecurrenceStep__RecurrenceStep.initProperties(_RecurrenceStep);
			Fragments._Recurringschedule__Recurringschedule.initProperties(_Recurringschedule);
			Fragments._Rule__Rule.initProperties(_Rule);
			Fragments._Scheduler__Scheduler.initProperties(_Scheduler);
			Fragments._Simpledynamic__Simpledynamic.initProperties(_Simpledynamic);
			Fragments._Stepdynamic__Stepdynamic.initProperties(_Stepdynamic);
			Fragments._Steps__Steps.initProperties(_Steps);
			Fragments._TypeMetric__TypeMetric.initProperties(_TypeMetric);
			Fragments._Uniqueschedule__Uniqueschedule.initProperties(_Uniqueschedule);
			Fragments._Unit__Unit.initProperties(_Unit);

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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionOperation__add = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.ACTION_OPERATION.getEEnumLiteral("add"), Types._ActionOperation, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionOperation__remove = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.ACTION_OPERATION.getEEnumLiteral("remove"), Types._ActionOperation, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionOperation__set_to = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.ACTION_OPERATION.getEEnumLiteral("set_to"), Types._ActionOperation, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ActionOperation = {
			_ActionOperation__add,
			_ActionOperation__remove,
			_ActionOperation__set_to
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionType__instanceCount = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.ACTION_TYPE.getEEnumLiteral("instanceCount"), Types._ActionType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ActionType__percent = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.ACTION_TYPE.getEEnumLiteral("percent"), Types._ActionType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ActionType = {
			_ActionType__instanceCount,
			_ActionType__percent
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageCpuUtilisation = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageCpuUtilisation"), Types._MetricTargetTracking, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__LBRequestCountperTarget = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("LBRequestCountperTarget"), Types._MetricTargetTracking, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageNetworkin = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageNetworkin"), Types._MetricTargetTracking, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageNetworkout = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageNetworkout"), Types._MetricTargetTracking, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MetricTargetTracking = {
			_MetricTargetTracking__AverageCpuUtilisation,
			_MetricTargetTracking__LBRequestCountperTarget,
			_MetricTargetTracking__AverageNetworkin,
			_MetricTargetTracking__AverageNetworkout
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__GraterThan = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("GraterThan"), Types._OperatorType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__GreaterThanorEqualto = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("GreaterThanorEqualto"), Types._OperatorType, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__LessThan = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("LessThan"), Types._OperatorType, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__LessThanorEqualto = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("LessThanorEqualto"), Types._OperatorType, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__Equalto = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("Equalto"), Types._OperatorType, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__NotEqualto = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("NotEqualto"), Types._OperatorType, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OperatorType = {
			_OperatorType__GraterThan,
			_OperatorType__GreaterThanorEqualto,
			_OperatorType__LessThan,
			_OperatorType__LessThanorEqualto,
			_OperatorType__Equalto,
			_OperatorType__NotEqualto
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TypeMetric__CPUtilisation = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.TYPE_METRIC.getEEnumLiteral("CPUtilisation"), Types._TypeMetric, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TypeMetric__MemoryUtilisation = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.TYPE_METRIC.getEEnumLiteral("MemoryUtilisation"), Types._TypeMetric, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TypeMetric = {
			_TypeMetric__CPUtilisation,
			_TypeMetric__MemoryUtilisation
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__minute = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.UNIT.getEEnumLiteral("minute"), Types._Unit, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__hour = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.UNIT.getEEnumLiteral("hour"), Types._Unit, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__dayOfWeek = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.UNIT.getEEnumLiteral("dayOfWeek"), Types._Unit, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__dayOfMonth = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.UNIT.getEEnumLiteral("dayOfMonth"), Types._Unit, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Unit__month = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.UNIT.getEEnumLiteral("month"), Types._Unit, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Unit = {
			_Unit__minute,
			_Unit__hour,
			_Unit__dayOfWeek,
			_Unit__dayOfMonth,
			_Unit__month
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ActionOperation.initLiterals(_ActionOperation);
			Types._ActionType.initLiterals(_ActionType);
			Types._MetricTargetTracking.initLiterals(_MetricTargetTracking);
			Types._OperatorType.initLiterals(_OperatorType);
			Types._TypeMetric.initLiterals(_TypeMetric);
			Types._Unit.initLiterals(_Unit);

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
