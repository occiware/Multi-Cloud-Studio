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
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Actiontrigger = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Actiontrigger", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Array = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Array", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrofRecStep = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("ArrofRecStep", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Creation = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Creation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Elasticitycontroller = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Elasticitycontroller", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Elasticlink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Elasticlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Horizontalgroup = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Horizontalgroup", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instancegrouplink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Instancegrouplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Loadbalancer = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Loadbalancer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Loadbalancerlink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Loadbalancerlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Metric = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Metric", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RecurrenceStep = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("RecurrenceStep", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Recurringschedulingpolicy = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Recurringschedulingpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Rule = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Rule", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Scalingpolicy = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Scalingpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Schedulingpolicy = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Schedulingpolicy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Step = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Step", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Steplink = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getClassId("Steplink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Date = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getDataTypeId("Date", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Float = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getDataTypeId("Float", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ActionOperation = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("ActionOperation");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ActionType = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("ActionType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_MetricTargetTracking = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("MetricTargetTracking");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_OperatorType = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("OperatorType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Unit = org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_multicloud_horizontalelasticity_s_ecore.getEnumerationId("Unit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_PRIMid_Integer = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.INTEGER);
	public static final /*@NonInvalid*/ java.lang.String STR_Creation_c_c_appliesConstraint = "Creation::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Elasticlink_c_c_targetConstraint = "Elasticlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Instancegrouplink_c_c_targetConstraint = "Instancegrouplink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Loadbalancerlink_c_c_targetConstraint = "Loadbalancerlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Metric_c_c_appliesConstraint = "Metric::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Rule_c_c_targetConstraint = "Rule::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Scalingpolicy_c_c_appliesConstraint = "Scalingpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Schedulingpolicy_c_c_appliesConstraint = "Schedulingpolicy::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Steplink_c_c_targetConstraint = "Steplink::targetConstraint";
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

		public static final /*@NonNull*/ EcoreExecutorEnumeration _ActionOperation = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.ACTION_OPERATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ActionType = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.ACTION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Actiontrigger = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ACTIONTRIGGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Array = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ARRAY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrofRecStep = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ARROF_REC_STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cpuutilisation = new EcoreExecutorType(HorizontalelasticityPackage.Literals.CPUUTILISATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Creation = new EcoreExecutorType(HorizontalelasticityPackage.Literals.CREATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Date = new EcoreExecutorType("Date", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamicadjustmentscalingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dynamicscalingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.DYNAMICSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Elasticitycontroller = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ELASTICITYCONTROLLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Elasticlink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.ELASTICLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Float = new EcoreExecutorType("Float", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Horizontalgroup = new EcoreExecutorType(HorizontalelasticityPackage.Literals.HORIZONTALGROUP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instancegrouplink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.INSTANCEGROUPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadbalancer = new EcoreExecutorType(HorizontalelasticityPackage.Literals.LOADBALANCER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Loadbalancerlink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.LOADBALANCERLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manualscalingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.MANUALSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Memoryutilisation = new EcoreExecutorType(HorizontalelasticityPackage.Literals.MEMORYUTILISATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Metric = new EcoreExecutorType(HorizontalelasticityPackage.Literals.METRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MetricTargetTracking = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _OperatorType = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.OPERATOR_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RecurrenceStep = new EcoreExecutorType(HorizontalelasticityPackage.Literals.RECURRENCE_STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Recurringschedulingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rule = new EcoreExecutorType(HorizontalelasticityPackage.Literals.RULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Scalingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.SCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Schedulingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.SCHEDULINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Simpledynamicscalingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.SIMPLEDYNAMICSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Step = new EcoreExecutorType(HorizontalelasticityPackage.Literals.STEP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Stepdynamicscalingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.STEPDYNAMICSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Steplink = new EcoreExecutorType(HorizontalelasticityPackage.Literals.STEPLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _TypeMetric = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.TYPE_METRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Uniqueschedulingpolicy = new EcoreExecutorType(HorizontalelasticityPackage.Literals.UNIQUESCHEDULINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Unit = new EcoreExecutorEnumeration(HorizontalelasticityPackage.Literals.UNIT, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_ActionOperation,
			_ActionType,
			_Actiontrigger,
			_Array,
			_ArrofRecStep,
			_Cpuutilisation,
			_Creation,
			_Date,
			_Dynamicadjustmentscalingpolicy,
			_Dynamicscalingpolicy,
			_Elasticitycontroller,
			_Elasticlink,
			_Float,
			_Horizontalgroup,
			_Instancegrouplink,
			_Loadbalancer,
			_Loadbalancerlink,
			_Manualscalingpolicy,
			_Memoryutilisation,
			_Metric,
			_MetricTargetTracking,
			_OperatorType,
			_RecurrenceStep,
			_Recurringschedulingpolicy,
			_Rule,
			_Scalingpolicy,
			_Schedulingpolicy,
			_Simpledynamicscalingpolicy,
			_Step,
			_Stepdynamicscalingpolicy,
			_Steplink,
			_TypeMetric,
			_Uniqueschedulingpolicy,
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

		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__Actiontrigger = new ExecutorFragment(Types._Actiontrigger, HorizontalelasticityTables.Types._Actiontrigger);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__Entity = new ExecutorFragment(Types._Actiontrigger, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__OclAny = new ExecutorFragment(Types._Actiontrigger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__OclElement = new ExecutorFragment(Types._Actiontrigger, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Actiontrigger__Resource = new ExecutorFragment(Types._Actiontrigger, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Array__Array = new ExecutorFragment(Types._Array, HorizontalelasticityTables.Types._Array);
		private static final /*@NonNull*/ ExecutorFragment _Array__OclAny = new ExecutorFragment(Types._Array, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Array__OclElement = new ExecutorFragment(Types._Array, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrofRecStep__ArrofRecStep = new ExecutorFragment(Types._ArrofRecStep, HorizontalelasticityTables.Types._ArrofRecStep);
		private static final /*@NonNull*/ ExecutorFragment _ArrofRecStep__OclAny = new ExecutorFragment(Types._ArrofRecStep, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrofRecStep__OclElement = new ExecutorFragment(Types._ArrofRecStep, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__Cpuutilisation = new ExecutorFragment(Types._Cpuutilisation, HorizontalelasticityTables.Types._Cpuutilisation);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__Metric = new ExecutorFragment(Types._Cpuutilisation, HorizontalelasticityTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__MixinBase = new ExecutorFragment(Types._Cpuutilisation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__OclAny = new ExecutorFragment(Types._Cpuutilisation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilisation__OclElement = new ExecutorFragment(Types._Cpuutilisation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Creation__Creation = new ExecutorFragment(Types._Creation, HorizontalelasticityTables.Types._Creation);
		private static final /*@NonNull*/ ExecutorFragment _Creation__MixinBase = new ExecutorFragment(Types._Creation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclAny = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Creation__OclElement = new ExecutorFragment(Types._Creation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Date__Date = new ExecutorFragment(Types._Date, HorizontalelasticityTables.Types._Date);
		private static final /*@NonNull*/ ExecutorFragment _Date__OclAny = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Date__OclComparable = new ExecutorFragment(Types._Date, OCLstdlibTables.Types._OclComparable);

		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, HorizontalelasticityTables.Types._Dynamicadjustmentscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, HorizontalelasticityTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__MixinBase = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__OclAny = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__OclElement = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicadjustmentscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Dynamicadjustmentscalingpolicy, HorizontalelasticityTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Dynamicscalingpolicy, HorizontalelasticityTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__MixinBase = new ExecutorFragment(Types._Dynamicscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__OclAny = new ExecutorFragment(Types._Dynamicscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__OclElement = new ExecutorFragment(Types._Dynamicscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Dynamicscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Dynamicscalingpolicy, HorizontalelasticityTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__Elasticitycontroller = new ExecutorFragment(Types._Elasticitycontroller, HorizontalelasticityTables.Types._Elasticitycontroller);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__Entity = new ExecutorFragment(Types._Elasticitycontroller, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__OclAny = new ExecutorFragment(Types._Elasticitycontroller, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__OclElement = new ExecutorFragment(Types._Elasticitycontroller, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Elasticitycontroller__Resource = new ExecutorFragment(Types._Elasticitycontroller, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Elasticlink = new ExecutorFragment(Types._Elasticlink, HorizontalelasticityTables.Types._Elasticlink);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Entity = new ExecutorFragment(Types._Elasticlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__Link = new ExecutorFragment(Types._Elasticlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__OclAny = new ExecutorFragment(Types._Elasticlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Elasticlink__OclElement = new ExecutorFragment(Types._Elasticlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Float__Float = new ExecutorFragment(Types._Float, HorizontalelasticityTables.Types._Float);
		private static final /*@NonNull*/ ExecutorFragment _Float__OclAny = new ExecutorFragment(Types._Float, OCLstdlibTables.Types._OclAny);

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

		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Entity = new ExecutorFragment(Types._Loadbalancer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Loadbalancer = new ExecutorFragment(Types._Loadbalancer, HorizontalelasticityTables.Types._Loadbalancer);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__OclAny = new ExecutorFragment(Types._Loadbalancer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__OclElement = new ExecutorFragment(Types._Loadbalancer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancer__Resource = new ExecutorFragment(Types._Loadbalancer, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__Entity = new ExecutorFragment(Types._Loadbalancerlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__Link = new ExecutorFragment(Types._Loadbalancerlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__Loadbalancerlink = new ExecutorFragment(Types._Loadbalancerlink, HorizontalelasticityTables.Types._Loadbalancerlink);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__OclAny = new ExecutorFragment(Types._Loadbalancerlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Loadbalancerlink__OclElement = new ExecutorFragment(Types._Loadbalancerlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__Manualscalingpolicy = new ExecutorFragment(Types._Manualscalingpolicy, HorizontalelasticityTables.Types._Manualscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__MixinBase = new ExecutorFragment(Types._Manualscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__OclAny = new ExecutorFragment(Types._Manualscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__OclElement = new ExecutorFragment(Types._Manualscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Manualscalingpolicy, HorizontalelasticityTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__Memoryutilisation = new ExecutorFragment(Types._Memoryutilisation, HorizontalelasticityTables.Types._Memoryutilisation);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__Metric = new ExecutorFragment(Types._Memoryutilisation, HorizontalelasticityTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__MixinBase = new ExecutorFragment(Types._Memoryutilisation, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__OclAny = new ExecutorFragment(Types._Memoryutilisation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Memoryutilisation__OclElement = new ExecutorFragment(Types._Memoryutilisation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Metric__Metric = new ExecutorFragment(Types._Metric, HorizontalelasticityTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Metric__MixinBase = new ExecutorFragment(Types._Metric, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Metric__OclAny = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Metric__OclElement = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclElement);

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

		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__MixinBase = new ExecutorFragment(Types._Recurringschedulingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__OclAny = new ExecutorFragment(Types._Recurringschedulingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__OclElement = new ExecutorFragment(Types._Recurringschedulingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__Recurringschedulingpolicy = new ExecutorFragment(Types._Recurringschedulingpolicy, HorizontalelasticityTables.Types._Recurringschedulingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Recurringschedulingpolicy__Schedulingpolicy = new ExecutorFragment(Types._Recurringschedulingpolicy, HorizontalelasticityTables.Types._Schedulingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Rule__Entity = new ExecutorFragment(Types._Rule, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Rule__Link = new ExecutorFragment(Types._Rule, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Rule__OclAny = new ExecutorFragment(Types._Rule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rule__OclElement = new ExecutorFragment(Types._Rule, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rule__Rule = new ExecutorFragment(Types._Rule, HorizontalelasticityTables.Types._Rule);

		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__MixinBase = new ExecutorFragment(Types._Scalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__OclAny = new ExecutorFragment(Types._Scalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__OclElement = new ExecutorFragment(Types._Scalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Scalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Scalingpolicy, HorizontalelasticityTables.Types._Scalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__MixinBase = new ExecutorFragment(Types._Schedulingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__OclAny = new ExecutorFragment(Types._Schedulingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__OclElement = new ExecutorFragment(Types._Schedulingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Schedulingpolicy__Schedulingpolicy = new ExecutorFragment(Types._Schedulingpolicy, HorizontalelasticityTables.Types._Schedulingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Simpledynamicscalingpolicy, HorizontalelasticityTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__MixinBase = new ExecutorFragment(Types._Simpledynamicscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__OclAny = new ExecutorFragment(Types._Simpledynamicscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__OclElement = new ExecutorFragment(Types._Simpledynamicscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Simpledynamicscalingpolicy, HorizontalelasticityTables.Types._Scalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Simpledynamicscalingpolicy__Simpledynamicscalingpolicy = new ExecutorFragment(Types._Simpledynamicscalingpolicy, HorizontalelasticityTables.Types._Simpledynamicscalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Step__Entity = new ExecutorFragment(Types._Step, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Step__Resource = new ExecutorFragment(Types._Step, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, HorizontalelasticityTables.Types._Step);

		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__Dynamicscalingpolicy = new ExecutorFragment(Types._Stepdynamicscalingpolicy, HorizontalelasticityTables.Types._Dynamicscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__MixinBase = new ExecutorFragment(Types._Stepdynamicscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__OclAny = new ExecutorFragment(Types._Stepdynamicscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__OclElement = new ExecutorFragment(Types._Stepdynamicscalingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__Scalingpolicy = new ExecutorFragment(Types._Stepdynamicscalingpolicy, HorizontalelasticityTables.Types._Scalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Stepdynamicscalingpolicy__Stepdynamicscalingpolicy = new ExecutorFragment(Types._Stepdynamicscalingpolicy, HorizontalelasticityTables.Types._Stepdynamicscalingpolicy);

		private static final /*@NonNull*/ ExecutorFragment _Steplink__Entity = new ExecutorFragment(Types._Steplink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__Link = new ExecutorFragment(Types._Steplink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__OclAny = new ExecutorFragment(Types._Steplink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__OclElement = new ExecutorFragment(Types._Steplink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Steplink__Steplink = new ExecutorFragment(Types._Steplink, HorizontalelasticityTables.Types._Steplink);

		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclAny = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclElement = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclEnumeration = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__OclType = new ExecutorFragment(Types._TypeMetric, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _TypeMetric__TypeMetric = new ExecutorFragment(Types._TypeMetric, HorizontalelasticityTables.Types._TypeMetric);

		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__MixinBase = new ExecutorFragment(Types._Uniqueschedulingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__OclAny = new ExecutorFragment(Types._Uniqueschedulingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__OclElement = new ExecutorFragment(Types._Uniqueschedulingpolicy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__Schedulingpolicy = new ExecutorFragment(Types._Uniqueschedulingpolicy, HorizontalelasticityTables.Types._Schedulingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Uniqueschedulingpolicy__Uniqueschedulingpolicy = new ExecutorFragment(Types._Uniqueschedulingpolicy, HorizontalelasticityTables.Types._Uniqueschedulingpolicy);

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

		public static final /*@NonNull*/ ExecutorOperation _Loadbalancer__addbackendserver = new ExecutorOperation("addbackendserver", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancer,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Loadbalancer__removebackendserver = new ExecutorOperation("removebackendserver", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Loadbalancer,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Scalingpolicy__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Scalingpolicy,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Scalingpolicy__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Scalingpolicy,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Schedulingpolicy__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Schedulingpolicy,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Schedulingpolicy__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Schedulingpolicy,
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


		public static final /*@NonNull*/ ExecutorProperty _Actiontrigger__actiontriggerAction = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ACTIONTRIGGER__ACTIONTRIGGER_ACTION, Types._Actiontrigger, 0);
		public static final /*@NonNull*/ ExecutorProperty _Actiontrigger__actiontriggerActionType = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ACTIONTRIGGER__ACTIONTRIGGER_ACTION_TYPE, Types._Actiontrigger, 1);
		public static final /*@NonNull*/ ExecutorProperty _Actiontrigger__actiontriggerAmount = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ACTIONTRIGGER__ACTIONTRIGGER_AMOUNT, Types._Actiontrigger, 2);

		public static final /*@NonNull*/ ExecutorProperty _Array__values = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ARRAY__VALUES, Types._Array, 0);
		public static final /*@NonNull*/ ExecutorProperty _Array__RecurrenceStep__value = new ExecutorPropertyWithImplementation("RecurrenceStep", Types._Array, 1, new EcoreLibraryOppositeProperty(HorizontalelasticityPackage.Literals.RECURRENCE_STEP__VALUE));

		public static final /*@NonNull*/ ExecutorProperty _ArrofRecStep__arrofrecstepValues = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ARROF_REC_STEP__ARROFRECSTEP_VALUES, Types._ArrofRecStep, 0);
		public static final /*@NonNull*/ ExecutorProperty _ArrofRecStep__Recurringschedulingpolicy__recurringschedulingpolicyRecurrence = new ExecutorPropertyWithImplementation("Recurringschedulingpolicy", Types._ArrofRecStep, 1, new EcoreLibraryOppositeProperty(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE));

		public static final /*@NonNull*/ ExecutorProperty _Creation__occiComputeCreationDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.CREATION__OCCI_COMPUTE_CREATION_DATE, Types._Creation, 0);

		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyDisableScaleIn = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_DISABLE_SCALE_IN, Types._Dynamicadjustmentscalingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyMetric = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_METRIC, Types._Dynamicadjustmentscalingpolicy, 1);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyTarget = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICADJUSTMENTSCALINGPOLICY__DYNAMICADJUSTMENTSCALINGPOLICY_TARGET, Types._Dynamicadjustmentscalingpolicy, 2);

		public static final /*@NonNull*/ ExecutorProperty _Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_COOL_DURATION, Types._Dynamicscalingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.DYNAMICSCALINGPOLICY__DYNAMICSCALINGPOLICY_ITERATION_WAIT_TIME, Types._Dynamicscalingpolicy, 1);

		public static final /*@NonNull*/ ExecutorProperty _Elasticitycontroller__ElasticityControllerIterationWaitTime = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ELASTICITYCONTROLLER__ELASTICITY_CONTROLLER_ITERATION_WAIT_TIME, Types._Elasticitycontroller, 0);
		public static final /*@NonNull*/ ExecutorProperty _Elasticitycontroller__ElasticitycontrollerCoolDuration = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_COOL_DURATION, Types._Elasticitycontroller, 1);
		public static final /*@NonNull*/ ExecutorProperty _Elasticitycontroller__ElasticitycontrollerMaximumLimit = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MAXIMUM_LIMIT, Types._Elasticitycontroller, 2);
		public static final /*@NonNull*/ ExecutorProperty _Elasticitycontroller__ElasticitycontrollerMinimumLimit = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.ELASTICITYCONTROLLER__ELASTICITYCONTROLLER_MINIMUM_LIMIT, Types._Elasticitycontroller, 3);

		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupGroupSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_GROUP_SIZE, Types._Horizontalgroup, 0);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupLoadBalancer = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_LOAD_BALANCER, Types._Horizontalgroup, 1);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupMaximum = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_MAXIMUM, Types._Horizontalgroup, 2);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupMinimum = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_MINIMUM, Types._Horizontalgroup, 3);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_NAME, Types._Horizontalgroup, 4);
		public static final /*@NonNull*/ ExecutorProperty _Horizontalgroup__horizontalgroupTemplateName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.HORIZONTALGROUP__HORIZONTALGROUP_TEMPLATE_NAME, Types._Horizontalgroup, 5);

		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerAddress = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_ADDRESS, Types._Loadbalancer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerInstanceIP = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_INSTANCE_IP, Types._Loadbalancer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Loadbalancer__loadbalancerName = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.LOADBALANCER__LOADBALANCER_NAME, Types._Loadbalancer, 2);

		public static final /*@NonNull*/ ExecutorProperty _Manualscalingpolicy__manualscalingpolicyDesiredSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.MANUALSCALINGPOLICY__MANUALSCALINGPOLICY_DESIRED_SIZE, Types._Manualscalingpolicy, 0);

		public static final /*@NonNull*/ ExecutorProperty _Metric__name = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.METRIC__NAME, Types._Metric, 0);

		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__unit = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRENCE_STEP__UNIT, Types._RecurrenceStep, 0);
		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__value = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRENCE_STEP__VALUE, Types._RecurrenceStep, 1);
		public static final /*@NonNull*/ ExecutorProperty _RecurrenceStep__ArrofRecStep__arrofrecstepValues = new ExecutorPropertyWithImplementation("ArrofRecStep", Types._RecurrenceStep, 2, new EcoreLibraryOppositeProperty(HorizontalelasticityPackage.Literals.ARROF_REC_STEP__ARROFRECSTEP_VALUES));

		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyEndDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_END_DATE, Types._Recurringschedulingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyInterval = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_INTERVAL, Types._Recurringschedulingpolicy, 1);
		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyRecurrence = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_RECURRENCE, Types._Recurringschedulingpolicy, 2);
		public static final /*@NonNull*/ ExecutorProperty _Recurringschedulingpolicy__recurringschedulingpolicyStartDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RECURRINGSCHEDULINGPOLICY__RECURRINGSCHEDULINGPOLICY_START_DATE, Types._Recurringschedulingpolicy, 3);

		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleConsecutive = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_CONSECUTIVE, Types._Rule, 0);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleOperator = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_OPERATOR, Types._Rule, 1);
		public static final /*@NonNull*/ ExecutorProperty _Rule__rulePeriod = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_PERIOD, Types._Rule, 2);
		public static final /*@NonNull*/ ExecutorProperty _Rule__ruleThreshold = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.RULE__RULE_THRESHOLD, Types._Rule, 3);

		public static final /*@NonNull*/ ExecutorProperty _Step__stepLowerStepBound = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.STEP__STEP_LOWER_STEP_BOUND, Types._Step, 0);
		public static final /*@NonNull*/ ExecutorProperty _Step__stepSize = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.STEP__STEP_SIZE, Types._Step, 1);
		public static final /*@NonNull*/ ExecutorProperty _Step__stepUpperStepBound = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.STEP__STEP_UPPER_STEP_BOUND, Types._Step, 2);

		public static final /*@NonNull*/ ExecutorProperty _Uniqueschedulingpolicy__uniqueschedulingpolicyEndDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_END_DATE, Types._Uniqueschedulingpolicy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Uniqueschedulingpolicy__uniqueschedulingpolicyStartDate = new EcoreExecutorProperty(HorizontalelasticityPackage.Literals.UNIQUESCHEDULINGPOLICY__UNIQUESCHEDULINGPOLICY_START_DATE, Types._Uniqueschedulingpolicy, 1);
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Actiontrigger =
		{
			Fragments._Actiontrigger__OclAny /* 0 */,
			Fragments._Actiontrigger__OclElement /* 1 */,
			Fragments._Actiontrigger__Entity /* 2 */,
			Fragments._Actiontrigger__Resource /* 3 */,
			Fragments._Actiontrigger__Actiontrigger /* 4 */
		};
		private static final int /*@NonNull*/ [] __Actiontrigger = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Array =
		{
			Fragments._Array__OclAny /* 0 */,
			Fragments._Array__OclElement /* 1 */,
			Fragments._Array__Array /* 2 */
		};
		private static final int /*@NonNull*/ [] __Array = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrofRecStep =
		{
			Fragments._ArrofRecStep__OclAny /* 0 */,
			Fragments._ArrofRecStep__OclElement /* 1 */,
			Fragments._ArrofRecStep__ArrofRecStep /* 2 */
		};
		private static final int /*@NonNull*/ [] __ArrofRecStep = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cpuutilisation =
		{
			Fragments._Cpuutilisation__OclAny /* 0 */,
			Fragments._Cpuutilisation__OclElement /* 1 */,
			Fragments._Cpuutilisation__MixinBase /* 2 */,
			Fragments._Cpuutilisation__Metric /* 3 */,
			Fragments._Cpuutilisation__Cpuutilisation /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cpuutilisation = { 1,1,1,1,1 };

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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy =
		{
			Fragments._Dynamicadjustmentscalingpolicy__OclAny /* 0 */,
			Fragments._Dynamicadjustmentscalingpolicy__OclElement /* 1 */,
			Fragments._Dynamicadjustmentscalingpolicy__MixinBase /* 2 */,
			Fragments._Dynamicadjustmentscalingpolicy__Scalingpolicy /* 3 */,
			Fragments._Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy /* 4 */,
			Fragments._Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy /* 5 */
		};
		private static final int /*@NonNull*/ [] __Dynamicadjustmentscalingpolicy = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dynamicscalingpolicy =
		{
			Fragments._Dynamicscalingpolicy__OclAny /* 0 */,
			Fragments._Dynamicscalingpolicy__OclElement /* 1 */,
			Fragments._Dynamicscalingpolicy__MixinBase /* 2 */,
			Fragments._Dynamicscalingpolicy__Scalingpolicy /* 3 */,
			Fragments._Dynamicscalingpolicy__Dynamicscalingpolicy /* 4 */
		};
		private static final int /*@NonNull*/ [] __Dynamicscalingpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Elasticitycontroller =
		{
			Fragments._Elasticitycontroller__OclAny /* 0 */,
			Fragments._Elasticitycontroller__OclElement /* 1 */,
			Fragments._Elasticitycontroller__Entity /* 2 */,
			Fragments._Elasticitycontroller__Resource /* 3 */,
			Fragments._Elasticitycontroller__Elasticitycontroller /* 4 */
		};
		private static final int /*@NonNull*/ [] __Elasticitycontroller = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Elasticlink =
		{
			Fragments._Elasticlink__OclAny /* 0 */,
			Fragments._Elasticlink__OclElement /* 1 */,
			Fragments._Elasticlink__Entity /* 2 */,
			Fragments._Elasticlink__Link /* 3 */,
			Fragments._Elasticlink__Elasticlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Elasticlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Float =
		{
			Fragments._Float__OclAny /* 0 */,
			Fragments._Float__Float /* 1 */
		};
		private static final int /*@NonNull*/ [] __Float = { 1,1 };

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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Loadbalancer =
		{
			Fragments._Loadbalancer__OclAny /* 0 */,
			Fragments._Loadbalancer__OclElement /* 1 */,
			Fragments._Loadbalancer__Entity /* 2 */,
			Fragments._Loadbalancer__Resource /* 3 */,
			Fragments._Loadbalancer__Loadbalancer /* 4 */
		};
		private static final int /*@NonNull*/ [] __Loadbalancer = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Loadbalancerlink =
		{
			Fragments._Loadbalancerlink__OclAny /* 0 */,
			Fragments._Loadbalancerlink__OclElement /* 1 */,
			Fragments._Loadbalancerlink__Entity /* 2 */,
			Fragments._Loadbalancerlink__Link /* 3 */,
			Fragments._Loadbalancerlink__Loadbalancerlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Loadbalancerlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manualscalingpolicy =
		{
			Fragments._Manualscalingpolicy__OclAny /* 0 */,
			Fragments._Manualscalingpolicy__OclElement /* 1 */,
			Fragments._Manualscalingpolicy__MixinBase /* 2 */,
			Fragments._Manualscalingpolicy__Scalingpolicy /* 3 */,
			Fragments._Manualscalingpolicy__Manualscalingpolicy /* 4 */
		};
		private static final int /*@NonNull*/ [] __Manualscalingpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Memoryutilisation =
		{
			Fragments._Memoryutilisation__OclAny /* 0 */,
			Fragments._Memoryutilisation__OclElement /* 1 */,
			Fragments._Memoryutilisation__MixinBase /* 2 */,
			Fragments._Memoryutilisation__Metric /* 3 */,
			Fragments._Memoryutilisation__Memoryutilisation /* 4 */
		};
		private static final int /*@NonNull*/ [] __Memoryutilisation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Metric =
		{
			Fragments._Metric__OclAny /* 0 */,
			Fragments._Metric__OclElement /* 1 */,
			Fragments._Metric__MixinBase /* 2 */,
			Fragments._Metric__Metric /* 3 */
		};
		private static final int /*@NonNull*/ [] __Metric = { 1,1,1,1 };

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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Recurringschedulingpolicy =
		{
			Fragments._Recurringschedulingpolicy__OclAny /* 0 */,
			Fragments._Recurringschedulingpolicy__OclElement /* 1 */,
			Fragments._Recurringschedulingpolicy__MixinBase /* 2 */,
			Fragments._Recurringschedulingpolicy__Schedulingpolicy /* 3 */,
			Fragments._Recurringschedulingpolicy__Recurringschedulingpolicy /* 4 */
		};
		private static final int /*@NonNull*/ [] __Recurringschedulingpolicy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rule =
		{
			Fragments._Rule__OclAny /* 0 */,
			Fragments._Rule__OclElement /* 1 */,
			Fragments._Rule__Entity /* 2 */,
			Fragments._Rule__Link /* 3 */,
			Fragments._Rule__Rule /* 4 */
		};
		private static final int /*@NonNull*/ [] __Rule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Scalingpolicy =
		{
			Fragments._Scalingpolicy__OclAny /* 0 */,
			Fragments._Scalingpolicy__OclElement /* 1 */,
			Fragments._Scalingpolicy__MixinBase /* 2 */,
			Fragments._Scalingpolicy__Scalingpolicy /* 3 */
		};
		private static final int /*@NonNull*/ [] __Scalingpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Schedulingpolicy =
		{
			Fragments._Schedulingpolicy__OclAny /* 0 */,
			Fragments._Schedulingpolicy__OclElement /* 1 */,
			Fragments._Schedulingpolicy__MixinBase /* 2 */,
			Fragments._Schedulingpolicy__Schedulingpolicy /* 3 */
		};
		private static final int /*@NonNull*/ [] __Schedulingpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Simpledynamicscalingpolicy =
		{
			Fragments._Simpledynamicscalingpolicy__OclAny /* 0 */,
			Fragments._Simpledynamicscalingpolicy__OclElement /* 1 */,
			Fragments._Simpledynamicscalingpolicy__MixinBase /* 2 */,
			Fragments._Simpledynamicscalingpolicy__Scalingpolicy /* 3 */,
			Fragments._Simpledynamicscalingpolicy__Dynamicscalingpolicy /* 4 */,
			Fragments._Simpledynamicscalingpolicy__Simpledynamicscalingpolicy /* 5 */
		};
		private static final int /*@NonNull*/ [] __Simpledynamicscalingpolicy = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Step =
		{
			Fragments._Step__OclAny /* 0 */,
			Fragments._Step__OclElement /* 1 */,
			Fragments._Step__Entity /* 2 */,
			Fragments._Step__Resource /* 3 */,
			Fragments._Step__Step /* 4 */
		};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Stepdynamicscalingpolicy =
		{
			Fragments._Stepdynamicscalingpolicy__OclAny /* 0 */,
			Fragments._Stepdynamicscalingpolicy__OclElement /* 1 */,
			Fragments._Stepdynamicscalingpolicy__MixinBase /* 2 */,
			Fragments._Stepdynamicscalingpolicy__Scalingpolicy /* 3 */,
			Fragments._Stepdynamicscalingpolicy__Dynamicscalingpolicy /* 4 */,
			Fragments._Stepdynamicscalingpolicy__Stepdynamicscalingpolicy /* 5 */
		};
		private static final int /*@NonNull*/ [] __Stepdynamicscalingpolicy = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Steplink =
		{
			Fragments._Steplink__OclAny /* 0 */,
			Fragments._Steplink__OclElement /* 1 */,
			Fragments._Steplink__Entity /* 2 */,
			Fragments._Steplink__Link /* 3 */,
			Fragments._Steplink__Steplink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Steplink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TypeMetric =
		{
			Fragments._TypeMetric__OclAny /* 0 */,
			Fragments._TypeMetric__OclElement /* 1 */,
			Fragments._TypeMetric__OclType /* 2 */,
			Fragments._TypeMetric__OclEnumeration /* 3 */,
			Fragments._TypeMetric__TypeMetric /* 4 */
		};
		private static final int /*@NonNull*/ [] __TypeMetric = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Uniqueschedulingpolicy =
		{
			Fragments._Uniqueschedulingpolicy__OclAny /* 0 */,
			Fragments._Uniqueschedulingpolicy__OclElement /* 1 */,
			Fragments._Uniqueschedulingpolicy__MixinBase /* 2 */,
			Fragments._Uniqueschedulingpolicy__Schedulingpolicy /* 3 */,
			Fragments._Uniqueschedulingpolicy__Uniqueschedulingpolicy /* 4 */
		};
		private static final int /*@NonNull*/ [] __Uniqueschedulingpolicy = { 1,1,1,1,1 };

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
			Types._ActionOperation.initFragments(_ActionOperation, __ActionOperation);
			Types._ActionType.initFragments(_ActionType, __ActionType);
			Types._Actiontrigger.initFragments(_Actiontrigger, __Actiontrigger);
			Types._Array.initFragments(_Array, __Array);
			Types._ArrofRecStep.initFragments(_ArrofRecStep, __ArrofRecStep);
			Types._Cpuutilisation.initFragments(_Cpuutilisation, __Cpuutilisation);
			Types._Creation.initFragments(_Creation, __Creation);
			Types._Date.initFragments(_Date, __Date);
			Types._Dynamicadjustmentscalingpolicy.initFragments(_Dynamicadjustmentscalingpolicy, __Dynamicadjustmentscalingpolicy);
			Types._Dynamicscalingpolicy.initFragments(_Dynamicscalingpolicy, __Dynamicscalingpolicy);
			Types._Elasticitycontroller.initFragments(_Elasticitycontroller, __Elasticitycontroller);
			Types._Elasticlink.initFragments(_Elasticlink, __Elasticlink);
			Types._Float.initFragments(_Float, __Float);
			Types._Horizontalgroup.initFragments(_Horizontalgroup, __Horizontalgroup);
			Types._Instancegrouplink.initFragments(_Instancegrouplink, __Instancegrouplink);
			Types._Loadbalancer.initFragments(_Loadbalancer, __Loadbalancer);
			Types._Loadbalancerlink.initFragments(_Loadbalancerlink, __Loadbalancerlink);
			Types._Manualscalingpolicy.initFragments(_Manualscalingpolicy, __Manualscalingpolicy);
			Types._Memoryutilisation.initFragments(_Memoryutilisation, __Memoryutilisation);
			Types._Metric.initFragments(_Metric, __Metric);
			Types._MetricTargetTracking.initFragments(_MetricTargetTracking, __MetricTargetTracking);
			Types._OperatorType.initFragments(_OperatorType, __OperatorType);
			Types._RecurrenceStep.initFragments(_RecurrenceStep, __RecurrenceStep);
			Types._Recurringschedulingpolicy.initFragments(_Recurringschedulingpolicy, __Recurringschedulingpolicy);
			Types._Rule.initFragments(_Rule, __Rule);
			Types._Scalingpolicy.initFragments(_Scalingpolicy, __Scalingpolicy);
			Types._Schedulingpolicy.initFragments(_Schedulingpolicy, __Schedulingpolicy);
			Types._Simpledynamicscalingpolicy.initFragments(_Simpledynamicscalingpolicy, __Simpledynamicscalingpolicy);
			Types._Step.initFragments(_Step, __Step);
			Types._Stepdynamicscalingpolicy.initFragments(_Stepdynamicscalingpolicy, __Stepdynamicscalingpolicy);
			Types._Steplink.initFragments(_Steplink, __Steplink);
			Types._TypeMetric.initFragments(_TypeMetric, __TypeMetric);
			Types._Uniqueschedulingpolicy.initFragments(_Uniqueschedulingpolicy, __Uniqueschedulingpolicy);
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__Actiontrigger = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actiontrigger__Resource = {};

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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrofRecStep__ArrofRecStep = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrofRecStep__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrofRecStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__Cpuutilisation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilisation__OclElement = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy__Scalingpolicy = {
			HorizontalelasticityTables.Operations._Scalingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dynamicscalingpolicy__Scalingpolicy = {
			HorizontalelasticityTables.Operations._Scalingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__Elasticitycontroller = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticitycontroller__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Elasticlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Elasticlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Horizontalgroup__Horizontalgroup = {};
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__Loadbalancerlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Loadbalancerlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__Manualscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalingpolicy__Scalingpolicy = {
			HorizontalelasticityTables.Operations._Scalingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__Memoryutilisation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryutilisation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__Recurringschedulingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Recurringschedulingpolicy__Schedulingpolicy = {
			HorizontalelasticityTables.Operations._Schedulingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Schedulingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__Rule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rule__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__Scalingpolicy = {
			HorizontalelasticityTables.Operations._Scalingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Scalingpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__Schedulingpolicy = {
			HorizontalelasticityTables.Operations._Schedulingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Schedulingpolicy__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Schedulingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__Simpledynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Simpledynamicscalingpolicy__Scalingpolicy = {
			HorizontalelasticityTables.Operations._Scalingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Step__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__Stepdynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__Dynamicscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Stepdynamicscalingpolicy__Scalingpolicy = {
			HorizontalelasticityTables.Operations._Scalingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Scalingpolicy__stop /* stop() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__Steplink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Steplink__OclElement = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__Uniqueschedulingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Uniqueschedulingpolicy__Schedulingpolicy = {
			HorizontalelasticityTables.Operations._Schedulingpolicy__start /* start() */,
			HorizontalelasticityTables.Operations._Schedulingpolicy__stop /* stop() */
		};

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

			Fragments._Actiontrigger__Actiontrigger.initOperations(_Actiontrigger__Actiontrigger);
			Fragments._Actiontrigger__Entity.initOperations(_Actiontrigger__Entity);
			Fragments._Actiontrigger__OclAny.initOperations(_Actiontrigger__OclAny);
			Fragments._Actiontrigger__OclElement.initOperations(_Actiontrigger__OclElement);
			Fragments._Actiontrigger__Resource.initOperations(_Actiontrigger__Resource);

			Fragments._Array__Array.initOperations(_Array__Array);
			Fragments._Array__OclAny.initOperations(_Array__OclAny);
			Fragments._Array__OclElement.initOperations(_Array__OclElement);

			Fragments._ArrofRecStep__ArrofRecStep.initOperations(_ArrofRecStep__ArrofRecStep);
			Fragments._ArrofRecStep__OclAny.initOperations(_ArrofRecStep__OclAny);
			Fragments._ArrofRecStep__OclElement.initOperations(_ArrofRecStep__OclElement);

			Fragments._Cpuutilisation__Cpuutilisation.initOperations(_Cpuutilisation__Cpuutilisation);
			Fragments._Cpuutilisation__Metric.initOperations(_Cpuutilisation__Metric);
			Fragments._Cpuutilisation__MixinBase.initOperations(_Cpuutilisation__MixinBase);
			Fragments._Cpuutilisation__OclAny.initOperations(_Cpuutilisation__OclAny);
			Fragments._Cpuutilisation__OclElement.initOperations(_Cpuutilisation__OclElement);

			Fragments._Creation__Creation.initOperations(_Creation__Creation);
			Fragments._Creation__MixinBase.initOperations(_Creation__MixinBase);
			Fragments._Creation__OclAny.initOperations(_Creation__OclAny);
			Fragments._Creation__OclElement.initOperations(_Creation__OclElement);

			Fragments._Date__Date.initOperations(_Date__Date);
			Fragments._Date__OclAny.initOperations(_Date__OclAny);
			Fragments._Date__OclComparable.initOperations(_Date__OclComparable);

			Fragments._Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy.initOperations(_Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy);
			Fragments._Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy.initOperations(_Dynamicadjustmentscalingpolicy__Dynamicscalingpolicy);
			Fragments._Dynamicadjustmentscalingpolicy__MixinBase.initOperations(_Dynamicadjustmentscalingpolicy__MixinBase);
			Fragments._Dynamicadjustmentscalingpolicy__OclAny.initOperations(_Dynamicadjustmentscalingpolicy__OclAny);
			Fragments._Dynamicadjustmentscalingpolicy__OclElement.initOperations(_Dynamicadjustmentscalingpolicy__OclElement);
			Fragments._Dynamicadjustmentscalingpolicy__Scalingpolicy.initOperations(_Dynamicadjustmentscalingpolicy__Scalingpolicy);

			Fragments._Dynamicscalingpolicy__Dynamicscalingpolicy.initOperations(_Dynamicscalingpolicy__Dynamicscalingpolicy);
			Fragments._Dynamicscalingpolicy__MixinBase.initOperations(_Dynamicscalingpolicy__MixinBase);
			Fragments._Dynamicscalingpolicy__OclAny.initOperations(_Dynamicscalingpolicy__OclAny);
			Fragments._Dynamicscalingpolicy__OclElement.initOperations(_Dynamicscalingpolicy__OclElement);
			Fragments._Dynamicscalingpolicy__Scalingpolicy.initOperations(_Dynamicscalingpolicy__Scalingpolicy);

			Fragments._Elasticitycontroller__Elasticitycontroller.initOperations(_Elasticitycontroller__Elasticitycontroller);
			Fragments._Elasticitycontroller__Entity.initOperations(_Elasticitycontroller__Entity);
			Fragments._Elasticitycontroller__OclAny.initOperations(_Elasticitycontroller__OclAny);
			Fragments._Elasticitycontroller__OclElement.initOperations(_Elasticitycontroller__OclElement);
			Fragments._Elasticitycontroller__Resource.initOperations(_Elasticitycontroller__Resource);

			Fragments._Elasticlink__Elasticlink.initOperations(_Elasticlink__Elasticlink);
			Fragments._Elasticlink__Entity.initOperations(_Elasticlink__Entity);
			Fragments._Elasticlink__Link.initOperations(_Elasticlink__Link);
			Fragments._Elasticlink__OclAny.initOperations(_Elasticlink__OclAny);
			Fragments._Elasticlink__OclElement.initOperations(_Elasticlink__OclElement);

			Fragments._Float__Float.initOperations(_Float__Float);
			Fragments._Float__OclAny.initOperations(_Float__OclAny);

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

			Fragments._Loadbalancer__Entity.initOperations(_Loadbalancer__Entity);
			Fragments._Loadbalancer__Loadbalancer.initOperations(_Loadbalancer__Loadbalancer);
			Fragments._Loadbalancer__OclAny.initOperations(_Loadbalancer__OclAny);
			Fragments._Loadbalancer__OclElement.initOperations(_Loadbalancer__OclElement);
			Fragments._Loadbalancer__Resource.initOperations(_Loadbalancer__Resource);

			Fragments._Loadbalancerlink__Entity.initOperations(_Loadbalancerlink__Entity);
			Fragments._Loadbalancerlink__Link.initOperations(_Loadbalancerlink__Link);
			Fragments._Loadbalancerlink__Loadbalancerlink.initOperations(_Loadbalancerlink__Loadbalancerlink);
			Fragments._Loadbalancerlink__OclAny.initOperations(_Loadbalancerlink__OclAny);
			Fragments._Loadbalancerlink__OclElement.initOperations(_Loadbalancerlink__OclElement);

			Fragments._Manualscalingpolicy__Manualscalingpolicy.initOperations(_Manualscalingpolicy__Manualscalingpolicy);
			Fragments._Manualscalingpolicy__MixinBase.initOperations(_Manualscalingpolicy__MixinBase);
			Fragments._Manualscalingpolicy__OclAny.initOperations(_Manualscalingpolicy__OclAny);
			Fragments._Manualscalingpolicy__OclElement.initOperations(_Manualscalingpolicy__OclElement);
			Fragments._Manualscalingpolicy__Scalingpolicy.initOperations(_Manualscalingpolicy__Scalingpolicy);

			Fragments._Memoryutilisation__Memoryutilisation.initOperations(_Memoryutilisation__Memoryutilisation);
			Fragments._Memoryutilisation__Metric.initOperations(_Memoryutilisation__Metric);
			Fragments._Memoryutilisation__MixinBase.initOperations(_Memoryutilisation__MixinBase);
			Fragments._Memoryutilisation__OclAny.initOperations(_Memoryutilisation__OclAny);
			Fragments._Memoryutilisation__OclElement.initOperations(_Memoryutilisation__OclElement);

			Fragments._Metric__Metric.initOperations(_Metric__Metric);
			Fragments._Metric__MixinBase.initOperations(_Metric__MixinBase);
			Fragments._Metric__OclAny.initOperations(_Metric__OclAny);
			Fragments._Metric__OclElement.initOperations(_Metric__OclElement);

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

			Fragments._Recurringschedulingpolicy__MixinBase.initOperations(_Recurringschedulingpolicy__MixinBase);
			Fragments._Recurringschedulingpolicy__OclAny.initOperations(_Recurringschedulingpolicy__OclAny);
			Fragments._Recurringschedulingpolicy__OclElement.initOperations(_Recurringschedulingpolicy__OclElement);
			Fragments._Recurringschedulingpolicy__Recurringschedulingpolicy.initOperations(_Recurringschedulingpolicy__Recurringschedulingpolicy);
			Fragments._Recurringschedulingpolicy__Schedulingpolicy.initOperations(_Recurringschedulingpolicy__Schedulingpolicy);

			Fragments._Rule__Entity.initOperations(_Rule__Entity);
			Fragments._Rule__Link.initOperations(_Rule__Link);
			Fragments._Rule__OclAny.initOperations(_Rule__OclAny);
			Fragments._Rule__OclElement.initOperations(_Rule__OclElement);
			Fragments._Rule__Rule.initOperations(_Rule__Rule);

			Fragments._Scalingpolicy__MixinBase.initOperations(_Scalingpolicy__MixinBase);
			Fragments._Scalingpolicy__OclAny.initOperations(_Scalingpolicy__OclAny);
			Fragments._Scalingpolicy__OclElement.initOperations(_Scalingpolicy__OclElement);
			Fragments._Scalingpolicy__Scalingpolicy.initOperations(_Scalingpolicy__Scalingpolicy);

			Fragments._Schedulingpolicy__MixinBase.initOperations(_Schedulingpolicy__MixinBase);
			Fragments._Schedulingpolicy__OclAny.initOperations(_Schedulingpolicy__OclAny);
			Fragments._Schedulingpolicy__OclElement.initOperations(_Schedulingpolicy__OclElement);
			Fragments._Schedulingpolicy__Schedulingpolicy.initOperations(_Schedulingpolicy__Schedulingpolicy);

			Fragments._Simpledynamicscalingpolicy__Dynamicscalingpolicy.initOperations(_Simpledynamicscalingpolicy__Dynamicscalingpolicy);
			Fragments._Simpledynamicscalingpolicy__MixinBase.initOperations(_Simpledynamicscalingpolicy__MixinBase);
			Fragments._Simpledynamicscalingpolicy__OclAny.initOperations(_Simpledynamicscalingpolicy__OclAny);
			Fragments._Simpledynamicscalingpolicy__OclElement.initOperations(_Simpledynamicscalingpolicy__OclElement);
			Fragments._Simpledynamicscalingpolicy__Scalingpolicy.initOperations(_Simpledynamicscalingpolicy__Scalingpolicy);
			Fragments._Simpledynamicscalingpolicy__Simpledynamicscalingpolicy.initOperations(_Simpledynamicscalingpolicy__Simpledynamicscalingpolicy);

			Fragments._Step__Entity.initOperations(_Step__Entity);
			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Resource.initOperations(_Step__Resource);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._Stepdynamicscalingpolicy__Dynamicscalingpolicy.initOperations(_Stepdynamicscalingpolicy__Dynamicscalingpolicy);
			Fragments._Stepdynamicscalingpolicy__MixinBase.initOperations(_Stepdynamicscalingpolicy__MixinBase);
			Fragments._Stepdynamicscalingpolicy__OclAny.initOperations(_Stepdynamicscalingpolicy__OclAny);
			Fragments._Stepdynamicscalingpolicy__OclElement.initOperations(_Stepdynamicscalingpolicy__OclElement);
			Fragments._Stepdynamicscalingpolicy__Scalingpolicy.initOperations(_Stepdynamicscalingpolicy__Scalingpolicy);
			Fragments._Stepdynamicscalingpolicy__Stepdynamicscalingpolicy.initOperations(_Stepdynamicscalingpolicy__Stepdynamicscalingpolicy);

			Fragments._Steplink__Entity.initOperations(_Steplink__Entity);
			Fragments._Steplink__Link.initOperations(_Steplink__Link);
			Fragments._Steplink__OclAny.initOperations(_Steplink__OclAny);
			Fragments._Steplink__OclElement.initOperations(_Steplink__OclElement);
			Fragments._Steplink__Steplink.initOperations(_Steplink__Steplink);

			Fragments._TypeMetric__OclAny.initOperations(_TypeMetric__OclAny);
			Fragments._TypeMetric__OclElement.initOperations(_TypeMetric__OclElement);
			Fragments._TypeMetric__OclEnumeration.initOperations(_TypeMetric__OclEnumeration);
			Fragments._TypeMetric__OclType.initOperations(_TypeMetric__OclType);
			Fragments._TypeMetric__TypeMetric.initOperations(_TypeMetric__TypeMetric);

			Fragments._Uniqueschedulingpolicy__MixinBase.initOperations(_Uniqueschedulingpolicy__MixinBase);
			Fragments._Uniqueschedulingpolicy__OclAny.initOperations(_Uniqueschedulingpolicy__OclAny);
			Fragments._Uniqueschedulingpolicy__OclElement.initOperations(_Uniqueschedulingpolicy__OclElement);
			Fragments._Uniqueschedulingpolicy__Schedulingpolicy.initOperations(_Uniqueschedulingpolicy__Schedulingpolicy);
			Fragments._Uniqueschedulingpolicy__Uniqueschedulingpolicy.initOperations(_Uniqueschedulingpolicy__Uniqueschedulingpolicy);

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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ActionOperation = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ActionType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Actiontrigger = {
			HorizontalelasticityTables.Properties._Actiontrigger__actiontriggerAction,
			HorizontalelasticityTables.Properties._Actiontrigger__actiontriggerActionType,
			HorizontalelasticityTables.Properties._Actiontrigger__actiontriggerAmount
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Array = {
			HorizontalelasticityTables.Properties._Array__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrofRecStep = {
			HorizontalelasticityTables.Properties._ArrofRecStep__arrofrecstepValues
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cpuutilisation = {
			HorizontalelasticityTables.Properties._Metric__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Creation = {
			HorizontalelasticityTables.Properties._Creation__occiComputeCreationDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Date = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamicadjustmentscalingpolicy = {
			HorizontalelasticityTables.Properties._Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyDisableScaleIn,
			HorizontalelasticityTables.Properties._Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyMetric,
			HorizontalelasticityTables.Properties._Dynamicadjustmentscalingpolicy__dynamicadjustmentscalingpolicyTarget,
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dynamicscalingpolicy = {
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Elasticitycontroller = {
			HorizontalelasticityTables.Properties._Elasticitycontroller__ElasticityControllerIterationWaitTime,
			HorizontalelasticityTables.Properties._Elasticitycontroller__ElasticitycontrollerCoolDuration,
			HorizontalelasticityTables.Properties._Elasticitycontroller__ElasticitycontrollerMaximumLimit,
			HorizontalelasticityTables.Properties._Elasticitycontroller__ElasticitycontrollerMinimumLimit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Elasticlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Float = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Horizontalgroup = {
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalgroupGroupSize,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalgroupLoadBalancer,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalgroupMaximum,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalgroupMinimum,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalgroupName,
			HorizontalelasticityTables.Properties._Horizontalgroup__horizontalgroupTemplateName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instancegrouplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadbalancer = {
			HorizontalelasticityTables.Properties._Loadbalancer__loadbalancerAddress,
			HorizontalelasticityTables.Properties._Loadbalancer__loadbalancerInstanceIP,
			HorizontalelasticityTables.Properties._Loadbalancer__loadbalancerName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Loadbalancerlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manualscalingpolicy = {
			HorizontalelasticityTables.Properties._Manualscalingpolicy__manualscalingpolicyDesiredSize
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Memoryutilisation = {
			HorizontalelasticityTables.Properties._Metric__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Metric = {
			HorizontalelasticityTables.Properties._Metric__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MetricTargetTracking = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _OperatorType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RecurrenceStep = {
			HorizontalelasticityTables.Properties._RecurrenceStep__unit,
			HorizontalelasticityTables.Properties._RecurrenceStep__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Recurringschedulingpolicy = {
			HorizontalelasticityTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyEndDate,
			HorizontalelasticityTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyInterval,
			HorizontalelasticityTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyRecurrence,
			HorizontalelasticityTables.Properties._Recurringschedulingpolicy__recurringschedulingpolicyStartDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rule = {
			HorizontalelasticityTables.Properties._Rule__ruleConsecutive,
			HorizontalelasticityTables.Properties._Rule__ruleOperator,
			HorizontalelasticityTables.Properties._Rule__rulePeriod,
			HorizontalelasticityTables.Properties._Rule__ruleThreshold
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Scalingpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Schedulingpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Simpledynamicscalingpolicy = {
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Step = {
			HorizontalelasticityTables.Properties._Step__stepLowerStepBound,
			HorizontalelasticityTables.Properties._Step__stepSize,
			HorizontalelasticityTables.Properties._Step__stepUpperStepBound
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Stepdynamicscalingpolicy = {
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyCoolDuration,
			HorizontalelasticityTables.Properties._Dynamicscalingpolicy__dynamicscalingpolicyIterationWaitTime
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Steplink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TypeMetric = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Uniqueschedulingpolicy = {
			HorizontalelasticityTables.Properties._Uniqueschedulingpolicy__uniqueschedulingpolicyEndDate,
			HorizontalelasticityTables.Properties._Uniqueschedulingpolicy__uniqueschedulingpolicyStartDate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Unit = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ActionOperation__ActionOperation.initProperties(_ActionOperation);
			Fragments._ActionType__ActionType.initProperties(_ActionType);
			Fragments._Actiontrigger__Actiontrigger.initProperties(_Actiontrigger);
			Fragments._Array__Array.initProperties(_Array);
			Fragments._ArrofRecStep__ArrofRecStep.initProperties(_ArrofRecStep);
			Fragments._Cpuutilisation__Cpuutilisation.initProperties(_Cpuutilisation);
			Fragments._Creation__Creation.initProperties(_Creation);
			Fragments._Date__Date.initProperties(_Date);
			Fragments._Dynamicadjustmentscalingpolicy__Dynamicadjustmentscalingpolicy.initProperties(_Dynamicadjustmentscalingpolicy);
			Fragments._Dynamicscalingpolicy__Dynamicscalingpolicy.initProperties(_Dynamicscalingpolicy);
			Fragments._Elasticitycontroller__Elasticitycontroller.initProperties(_Elasticitycontroller);
			Fragments._Elasticlink__Elasticlink.initProperties(_Elasticlink);
			Fragments._Float__Float.initProperties(_Float);
			Fragments._Horizontalgroup__Horizontalgroup.initProperties(_Horizontalgroup);
			Fragments._Instancegrouplink__Instancegrouplink.initProperties(_Instancegrouplink);
			Fragments._Loadbalancer__Loadbalancer.initProperties(_Loadbalancer);
			Fragments._Loadbalancerlink__Loadbalancerlink.initProperties(_Loadbalancerlink);
			Fragments._Manualscalingpolicy__Manualscalingpolicy.initProperties(_Manualscalingpolicy);
			Fragments._Memoryutilisation__Memoryutilisation.initProperties(_Memoryutilisation);
			Fragments._Metric__Metric.initProperties(_Metric);
			Fragments._MetricTargetTracking__MetricTargetTracking.initProperties(_MetricTargetTracking);
			Fragments._OperatorType__OperatorType.initProperties(_OperatorType);
			Fragments._RecurrenceStep__RecurrenceStep.initProperties(_RecurrenceStep);
			Fragments._Recurringschedulingpolicy__Recurringschedulingpolicy.initProperties(_Recurringschedulingpolicy);
			Fragments._Rule__Rule.initProperties(_Rule);
			Fragments._Scalingpolicy__Scalingpolicy.initProperties(_Scalingpolicy);
			Fragments._Schedulingpolicy__Schedulingpolicy.initProperties(_Schedulingpolicy);
			Fragments._Simpledynamicscalingpolicy__Simpledynamicscalingpolicy.initProperties(_Simpledynamicscalingpolicy);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._Stepdynamicscalingpolicy__Stepdynamicscalingpolicy.initProperties(_Stepdynamicscalingpolicy);
			Fragments._Steplink__Steplink.initProperties(_Steplink);
			Fragments._TypeMetric__TypeMetric.initProperties(_TypeMetric);
			Fragments._Uniqueschedulingpolicy__Uniqueschedulingpolicy.initProperties(_Uniqueschedulingpolicy);
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
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageNetworkIn = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageNetworkIn"), Types._MetricTargetTracking, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MetricTargetTracking__AverageNetworkOut = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.METRIC_TARGET_TRACKING.getEEnumLiteral("AverageNetworkOut"), Types._MetricTargetTracking, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MetricTargetTracking = {
			_MetricTargetTracking__AverageCpuUtilisation,
			_MetricTargetTracking__LBRequestCountperTarget,
			_MetricTargetTracking__AverageNetworkIn,
			_MetricTargetTracking__AverageNetworkOut
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__GraterThan = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("GraterThan"), Types._OperatorType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__GreaterThanOrEqualTo = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("GreaterThanOrEqualTo"), Types._OperatorType, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__LessThan = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("LessThan"), Types._OperatorType, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__LessThanorEqualTo = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("LessThanorEqualTo"), Types._OperatorType, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__EqualTo = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("EqualTo"), Types._OperatorType, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _OperatorType__NotEqualTo = new EcoreExecutorEnumerationLiteral(HorizontalelasticityPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("NotEqualTo"), Types._OperatorType, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OperatorType = {
			_OperatorType__GraterThan,
			_OperatorType__GreaterThanOrEqualTo,
			_OperatorType__LessThan,
			_OperatorType__LessThanorEqualTo,
			_OperatorType__EqualTo,
			_OperatorType__NotEqualTo
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
