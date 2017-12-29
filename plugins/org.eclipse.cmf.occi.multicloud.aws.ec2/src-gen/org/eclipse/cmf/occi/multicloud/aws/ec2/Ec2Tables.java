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
 *   /org.eclipse.cmf.occi.multicloud.aws.ec2/model/ec2.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.aws.ec2/model/ec2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.aws.ec2;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.multicloud.accounts.AccountsTables;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables;
import org.eclipse.cmf.occi.multicloud.regions.RegionsTables;
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
 * Ec2Tables provides the dispatch tables for the ec2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class Ec2Tables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Ec2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/infrastructure/aws/ecore", null, org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Acceleratedcomputing = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Acceleratedcomputing", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Awsaccount = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Awsaccount", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Awscredential = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Awscredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Computeoptimized = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Computeoptimized", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instanceec2 = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Instanceec2", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Instancevpcinfo = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Instancevpcinfo", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Memoryoptimized = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Memoryoptimized", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Placementgroup = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Placementgroup", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Rootdevicevolume = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Rootdevicevolume", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Statustransitionreason = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Statustransitionreason", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storageoptimized = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Storageoptimized", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tags = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getClassId("Tags", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Core = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Core", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_GiB = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("GiB", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AWSInstanceState = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getEnumerationId("AWSInstanceState");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_HypervisorType = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getEnumerationId("HypervisorType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_InstanceLifeCycleType = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getEnumerationId("InstanceLifeCycleType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_MonitoringState = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getEnumerationId("MonitoringState");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_VirtualizationType = org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_aws_s_ecore.getEnumerationId("VirtualizationType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Acceleratedcomputing_c_c_appliesConstraint = "Acceleratedcomputing::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Awscredential_c_c_appliesConstraint = "Awscredential::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Computeoptimized_c_c_appliesConstraint = "Computeoptimized::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Instancevpcinfo_c_c_appliesConstraint = "Instancevpcinfo::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Memoryoptimized_c_c_appliesConstraint = "Memoryoptimized::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Placementgroup_c_c_appliesConstraint = "Placementgroup::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Rootdevicevolume_c_c_appliesConstraint = "Rootdevicevolume::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Statustransitionreason_c_c_appliesConstraint = "Statustransitionreason::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Storageoptimized_c_c_appliesConstraint = "Storageoptimized::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tags_c_c_appliesConstraint = "Tags::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Ec2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumeration _AWSInstanceState = new EcoreExecutorEnumeration(Ec2Package.Literals.AWS_INSTANCE_STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Acceleratedcomputing = new EcoreExecutorType(Ec2Package.Literals.ACCELERATEDCOMPUTING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_northeast_1 = new EcoreExecutorType(Ec2Package.Literals.AP_NORTHEAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_northeast_2 = new EcoreExecutorType(Ec2Package.Literals.AP_NORTHEAST_2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_south_1 = new EcoreExecutorType(Ec2Package.Literals.AP_SOUTH_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_south_east2 = new EcoreExecutorType(Ec2Package.Literals.AP_SOUTH_EAST2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_southeast_1 = new EcoreExecutorType(Ec2Package.Literals.AP_SOUTHEAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Awsaccount = new EcoreExecutorType(Ec2Package.Literals.AWSACCOUNT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Awscredential = new EcoreExecutorType(Ec2Package.Literals.AWSCREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C1_medium = new EcoreExecutorType(Ec2Package.Literals.C1_MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C1_xlarge = new EcoreExecutorType(Ec2Package.Literals.C1_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C3_2xlarge = new EcoreExecutorType(Ec2Package.Literals.C3_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C3_4xlarge = new EcoreExecutorType(Ec2Package.Literals.C3_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C3_8xlarge = new EcoreExecutorType(Ec2Package.Literals.C3_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C3_large = new EcoreExecutorType(Ec2Package.Literals.C3_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C3_xlarge = new EcoreExecutorType(Ec2Package.Literals.C3_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C4_2xlarge = new EcoreExecutorType(Ec2Package.Literals.C4_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C4_4xlarge = new EcoreExecutorType(Ec2Package.Literals.C4_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C4_8xlarge = new EcoreExecutorType(Ec2Package.Literals.C4_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C4_large = new EcoreExecutorType(Ec2Package.Literals.C4_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C4_xlarge = new EcoreExecutorType(Ec2Package.Literals.C4_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C5_18xlarge = new EcoreExecutorType(Ec2Package.Literals.C5_18XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C5_2xlarge = new EcoreExecutorType(Ec2Package.Literals.C5_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C5_4xlarge = new EcoreExecutorType(Ec2Package.Literals.C5_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C5_9xlarge = new EcoreExecutorType(Ec2Package.Literals.C5_9XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C5_large = new EcoreExecutorType(Ec2Package.Literals.C5_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _C5_xlarge = new EcoreExecutorType(Ec2Package.Literals.C5_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ca_central_1 = new EcoreExecutorType(Ec2Package.Literals.CA_CENTRAL_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cc2_8xlarge = new EcoreExecutorType(Ec2Package.Literals.CC2_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cg1_4xlarge = new EcoreExecutorType(Ec2Package.Literals.CG1_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Computeoptimized = new EcoreExecutorType(Ec2Package.Literals.COMPUTEOPTIMIZED, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cr1_8xlarge = new EcoreExecutorType(Ec2Package.Literals.CR1_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _D2_2xlarge = new EcoreExecutorType(Ec2Package.Literals.D2_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _D2_4xlarge = new EcoreExecutorType(Ec2Package.Literals.D2_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _D2_8xlarge = new EcoreExecutorType(Ec2Package.Literals.D2_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _D2_xlarge = new EcoreExecutorType(Ec2Package.Literals.D2_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_central_1 = new EcoreExecutorType(Ec2Package.Literals.EU_CENTRAL_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_west_1 = new EcoreExecutorType(Ec2Package.Literals.EU_WEST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_west_2 = new EcoreExecutorType(Ec2Package.Literals.EU_WEST_2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_west_3 = new EcoreExecutorType(Ec2Package.Literals.EU_WEST_3, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Europe = new EcoreExecutorType(Ec2Package.Literals.EUROPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _F1_16xlarge = new EcoreExecutorType(Ec2Package.Literals.F1_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _F1_2xlarge = new EcoreExecutorType(Ec2Package.Literals.F1_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _G2_2xlarge = new EcoreExecutorType(Ec2Package.Literals.G2_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _G2_8xlarge = new EcoreExecutorType(Ec2Package.Literals.G2_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _G3_16xlarge = new EcoreExecutorType(Ec2Package.Literals.G3_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _G3_4xlarge = new EcoreExecutorType(Ec2Package.Literals.G3_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _G3_8xlarge = new EcoreExecutorType(Ec2Package.Literals.G3_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Generalpurpose = new EcoreExecutorType(Ec2Package.Literals.GENERALPURPOSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _H1_16xlarge = new EcoreExecutorType(Ec2Package.Literals.H1_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _H1_2xlarge = new EcoreExecutorType(Ec2Package.Literals.H1_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _H1_4xlarge = new EcoreExecutorType(Ec2Package.Literals.H1_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _H1_8xlarge = new EcoreExecutorType(Ec2Package.Literals.H1_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Hs1_8xlarge = new EcoreExecutorType(Ec2Package.Literals.HS1_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _HypervisorType = new EcoreExecutorEnumeration(Ec2Package.Literals.HYPERVISOR_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I2_2xlarge = new EcoreExecutorType(Ec2Package.Literals.I2_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I2_4xlarge = new EcoreExecutorType(Ec2Package.Literals.I2_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I2_8xlarge = new EcoreExecutorType(Ec2Package.Literals.I2_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I2_xlarge = new EcoreExecutorType(Ec2Package.Literals.I2_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I3_16xlarge = new EcoreExecutorType(Ec2Package.Literals.I3_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I3_2xlarge = new EcoreExecutorType(Ec2Package.Literals.I3_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I3_4xlarge = new EcoreExecutorType(Ec2Package.Literals.I3_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I3_8xlarge = new EcoreExecutorType(Ec2Package.Literals.I3_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I3_large = new EcoreExecutorType(Ec2Package.Literals.I3_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I3_metal = new EcoreExecutorType(Ec2Package.Literals.I3_METAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _I3_xlarge = new EcoreExecutorType(Ec2Package.Literals.I3_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _InstanceLifeCycleType = new EcoreExecutorEnumeration(Ec2Package.Literals.INSTANCE_LIFE_CYCLE_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instanceec2 = new EcoreExecutorType(Ec2Package.Literals.INSTANCEEC2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instancevpcinfo = new EcoreExecutorType(Ec2Package.Literals.INSTANCEVPCINFO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M1_large = new EcoreExecutorType(Ec2Package.Literals.M1_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M1_medium = new EcoreExecutorType(Ec2Package.Literals.M1_MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M1_small = new EcoreExecutorType(Ec2Package.Literals.M1_SMALL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M1_xlarge = new EcoreExecutorType(Ec2Package.Literals.M1_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M2_2xlarge = new EcoreExecutorType(Ec2Package.Literals.M2_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M2_4xlarge = new EcoreExecutorType(Ec2Package.Literals.M2_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M2_xlarge = new EcoreExecutorType(Ec2Package.Literals.M2_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M3_2xlarge = new EcoreExecutorType(Ec2Package.Literals.M3_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M3_large = new EcoreExecutorType(Ec2Package.Literals.M3_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M3_medium = new EcoreExecutorType(Ec2Package.Literals.M3_MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M3_xlarge = new EcoreExecutorType(Ec2Package.Literals.M3_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M4_10xlarge = new EcoreExecutorType(Ec2Package.Literals.M4_10XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M4_16xlarge = new EcoreExecutorType(Ec2Package.Literals.M4_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M4_2xlarge = new EcoreExecutorType(Ec2Package.Literals.M4_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M4_large = new EcoreExecutorType(Ec2Package.Literals.M4_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M4_xlarge = new EcoreExecutorType(Ec2Package.Literals.M4_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M5_12xlarge = new EcoreExecutorType(Ec2Package.Literals.M5_12XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M5_24xlarge = new EcoreExecutorType(Ec2Package.Literals.M5_24XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M5_2xlarge = new EcoreExecutorType(Ec2Package.Literals.M5_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M5_4xlarge = new EcoreExecutorType(Ec2Package.Literals.M5_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M5_large = new EcoreExecutorType(Ec2Package.Literals.M5_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _M5_xlarge = new EcoreExecutorType(Ec2Package.Literals.M5_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Memoryoptimized = new EcoreExecutorType(Ec2Package.Literals.MEMORYOPTIMIZED, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MonitoringState = new EcoreExecutorEnumeration(Ec2Package.Literals.MONITORING_STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _P2_16xlarge = new EcoreExecutorType(Ec2Package.Literals.P2_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _P2_8xlarge = new EcoreExecutorType(Ec2Package.Literals.P2_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _P2_xlarge = new EcoreExecutorType(Ec2Package.Literals.P2_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _P3_16xlarge = new EcoreExecutorType(Ec2Package.Literals.P3_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _P3_2xlarge = new EcoreExecutorType(Ec2Package.Literals.P3_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _P3_8xlarge = new EcoreExecutorType(Ec2Package.Literals.P3_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Placementgroup = new EcoreExecutorType(Ec2Package.Literals.PLACEMENTGROUP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R3_2xlarge = new EcoreExecutorType(Ec2Package.Literals.R3_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R3_4xlarge = new EcoreExecutorType(Ec2Package.Literals.R3_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R3_8xlarge = new EcoreExecutorType(Ec2Package.Literals.R3_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R3_large = new EcoreExecutorType(Ec2Package.Literals.R3_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R3_xlarge = new EcoreExecutorType(Ec2Package.Literals.R3_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R4_16xlarge = new EcoreExecutorType(Ec2Package.Literals.R4_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R4_2xlarge = new EcoreExecutorType(Ec2Package.Literals.R4_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R4_4xlarge = new EcoreExecutorType(Ec2Package.Literals.R4_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R4_8xlarge = new EcoreExecutorType(Ec2Package.Literals.R4_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R4_large = new EcoreExecutorType(Ec2Package.Literals.R4_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _R4_xlarge = new EcoreExecutorType(Ec2Package.Literals.R4_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rootdevicevolume = new EcoreExecutorType(Ec2Package.Literals.ROOTDEVICEVOLUME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sa_east_1 = new EcoreExecutorType(Ec2Package.Literals.SA_EAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Statustransitionreason = new EcoreExecutorType(Ec2Package.Literals.STATUSTRANSITIONREASON, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storageoptimized = new EcoreExecutorType(Ec2Package.Literals.STORAGEOPTIMIZED, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T1_micro = new EcoreExecutorType(Ec2Package.Literals.T1_MICRO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T2_2xlarge = new EcoreExecutorType(Ec2Package.Literals.T2_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T2_large = new EcoreExecutorType(Ec2Package.Literals.T2_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T2_medium = new EcoreExecutorType(Ec2Package.Literals.T2_MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T2_micro = new EcoreExecutorType(Ec2Package.Literals.T2_MICRO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T2_nano = new EcoreExecutorType(Ec2Package.Literals.T2_NANO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T2_small = new EcoreExecutorType(Ec2Package.Literals.T2_SMALL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _T2_xlarge = new EcoreExecutorType(Ec2Package.Literals.T2_XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tags = new EcoreExecutorType(Ec2Package.Literals.TAGS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_east_1 = new EcoreExecutorType(Ec2Package.Literals.US_EAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_east_2 = new EcoreExecutorType(Ec2Package.Literals.US_EAST_2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_west_1 = new EcoreExecutorType(Ec2Package.Literals.US_WEST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_west_2 = new EcoreExecutorType(Ec2Package.Literals.US_WEST_2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _VirtualizationType = new EcoreExecutorEnumeration(Ec2Package.Literals.VIRTUALIZATION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1_16xlarge = new EcoreExecutorType(Ec2Package.Literals.X1_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1_32xlarge = new EcoreExecutorType(Ec2Package.Literals.X1_32XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1e_16xlarge = new EcoreExecutorType(Ec2Package.Literals.X1E_16XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1e_2xlarge = new EcoreExecutorType(Ec2Package.Literals.X1E_2XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1e_32xlarge = new EcoreExecutorType(Ec2Package.Literals.X1E_32XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1e_4xlarge = new EcoreExecutorType(Ec2Package.Literals.X1E_4XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1e_8xlarge = new EcoreExecutorType(Ec2Package.Literals.X1E_8XLARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _X1e_xlarge = new EcoreExecutorType(Ec2Package.Literals.X1E_XLARGE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_AWSInstanceState,
			_Acceleratedcomputing,
			_Ap_northeast_1,
			_Ap_northeast_2,
			_Ap_south_1,
			_Ap_south_east2,
			_Ap_southeast_1,
			_Awsaccount,
			_Awscredential,
			_C1_medium,
			_C1_xlarge,
			_C3_2xlarge,
			_C3_4xlarge,
			_C3_8xlarge,
			_C3_large,
			_C3_xlarge,
			_C4_2xlarge,
			_C4_4xlarge,
			_C4_8xlarge,
			_C4_large,
			_C4_xlarge,
			_C5_18xlarge,
			_C5_2xlarge,
			_C5_4xlarge,
			_C5_9xlarge,
			_C5_large,
			_C5_xlarge,
			_Ca_central_1,
			_Cc2_8xlarge,
			_Cg1_4xlarge,
			_Computeoptimized,
			_Cr1_8xlarge,
			_D2_2xlarge,
			_D2_4xlarge,
			_D2_8xlarge,
			_D2_xlarge,
			_Eu_central_1,
			_Eu_west_1,
			_Eu_west_2,
			_Eu_west_3,
			_Europe,
			_F1_16xlarge,
			_F1_2xlarge,
			_G2_2xlarge,
			_G2_8xlarge,
			_G3_16xlarge,
			_G3_4xlarge,
			_G3_8xlarge,
			_Generalpurpose,
			_H1_16xlarge,
			_H1_2xlarge,
			_H1_4xlarge,
			_H1_8xlarge,
			_Hs1_8xlarge,
			_HypervisorType,
			_I2_2xlarge,
			_I2_4xlarge,
			_I2_8xlarge,
			_I2_xlarge,
			_I3_16xlarge,
			_I3_2xlarge,
			_I3_4xlarge,
			_I3_8xlarge,
			_I3_large,
			_I3_metal,
			_I3_xlarge,
			_InstanceLifeCycleType,
			_Instanceec2,
			_Instancevpcinfo,
			_M1_large,
			_M1_medium,
			_M1_small,
			_M1_xlarge,
			_M2_2xlarge,
			_M2_4xlarge,
			_M2_xlarge,
			_M3_2xlarge,
			_M3_large,
			_M3_medium,
			_M3_xlarge,
			_M4_10xlarge,
			_M4_16xlarge,
			_M4_2xlarge,
			_M4_large,
			_M4_xlarge,
			_M5_12xlarge,
			_M5_24xlarge,
			_M5_2xlarge,
			_M5_4xlarge,
			_M5_large,
			_M5_xlarge,
			_Memoryoptimized,
			_MonitoringState,
			_P2_16xlarge,
			_P2_8xlarge,
			_P2_xlarge,
			_P3_16xlarge,
			_P3_2xlarge,
			_P3_8xlarge,
			_Placementgroup,
			_R3_2xlarge,
			_R3_4xlarge,
			_R3_8xlarge,
			_R3_large,
			_R3_xlarge,
			_R4_16xlarge,
			_R4_2xlarge,
			_R4_4xlarge,
			_R4_8xlarge,
			_R4_large,
			_R4_xlarge,
			_Rootdevicevolume,
			_Sa_east_1,
			_Statustransitionreason,
			_Storageoptimized,
			_T1_micro,
			_T2_2xlarge,
			_T2_large,
			_T2_medium,
			_T2_micro,
			_T2_nano,
			_T2_small,
			_T2_xlarge,
			_Tags,
			_Us_east_1,
			_Us_east_2,
			_Us_west_1,
			_Us_west_2,
			_VirtualizationType,
			_X1_16xlarge,
			_X1_32xlarge,
			_X1e_16xlarge,
			_X1e_2xlarge,
			_X1e_32xlarge,
			_X1e_4xlarge,
			_X1e_8xlarge,
			_X1e_xlarge
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _AWSInstanceState__AWSInstanceState = new ExecutorFragment(Types._AWSInstanceState, Ec2Tables.Types._AWSInstanceState);
		private static final /*@NonNull*/ ExecutorFragment _AWSInstanceState__OclAny = new ExecutorFragment(Types._AWSInstanceState, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AWSInstanceState__OclElement = new ExecutorFragment(Types._AWSInstanceState, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AWSInstanceState__OclEnumeration = new ExecutorFragment(Types._AWSInstanceState, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _AWSInstanceState__OclType = new ExecutorFragment(Types._AWSInstanceState, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Acceleratedcomputing__Acceleratedcomputing = new ExecutorFragment(Types._Acceleratedcomputing, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _Acceleratedcomputing__MixinBase = new ExecutorFragment(Types._Acceleratedcomputing, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Acceleratedcomputing__OclAny = new ExecutorFragment(Types._Acceleratedcomputing, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Acceleratedcomputing__OclElement = new ExecutorFragment(Types._Acceleratedcomputing, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Acceleratedcomputing__Resource_tpl = new ExecutorFragment(Types._Acceleratedcomputing, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__Ap_northeast_1 = new ExecutorFragment(Types._Ap_northeast_1, Ec2Tables.Types._Ap_northeast_1);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__MixinBase = new ExecutorFragment(Types._Ap_northeast_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__OclAny = new ExecutorFragment(Types._Ap_northeast_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__OclElement = new ExecutorFragment(Types._Ap_northeast_1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__Ap_northeast_2 = new ExecutorFragment(Types._Ap_northeast_2, Ec2Tables.Types._Ap_northeast_2);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__MixinBase = new ExecutorFragment(Types._Ap_northeast_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__OclAny = new ExecutorFragment(Types._Ap_northeast_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__OclElement = new ExecutorFragment(Types._Ap_northeast_2, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__Ap_south_1 = new ExecutorFragment(Types._Ap_south_1, Ec2Tables.Types._Ap_south_1);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__MixinBase = new ExecutorFragment(Types._Ap_south_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__OclAny = new ExecutorFragment(Types._Ap_south_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__OclElement = new ExecutorFragment(Types._Ap_south_1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__Ap_south_east2 = new ExecutorFragment(Types._Ap_south_east2, Ec2Tables.Types._Ap_south_east2);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__MixinBase = new ExecutorFragment(Types._Ap_south_east2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__OclAny = new ExecutorFragment(Types._Ap_south_east2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__OclElement = new ExecutorFragment(Types._Ap_south_east2, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__Ap_southeast_1 = new ExecutorFragment(Types._Ap_southeast_1, Ec2Tables.Types._Ap_southeast_1);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__MixinBase = new ExecutorFragment(Types._Ap_southeast_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__OclAny = new ExecutorFragment(Types._Ap_southeast_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__OclElement = new ExecutorFragment(Types._Ap_southeast_1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Awsaccount__Awsaccount = new ExecutorFragment(Types._Awsaccount, Ec2Tables.Types._Awsaccount);
		private static final /*@NonNull*/ ExecutorFragment _Awsaccount__Cloudaccount = new ExecutorFragment(Types._Awsaccount, AccountsTables.Types._Cloudaccount);
		private static final /*@NonNull*/ ExecutorFragment _Awsaccount__Entity = new ExecutorFragment(Types._Awsaccount, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Awsaccount__OclAny = new ExecutorFragment(Types._Awsaccount, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Awsaccount__OclElement = new ExecutorFragment(Types._Awsaccount, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Awsaccount__Resource = new ExecutorFragment(Types._Awsaccount, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Awscredential__Awscredential = new ExecutorFragment(Types._Awscredential, Ec2Tables.Types._Awscredential);
		private static final /*@NonNull*/ ExecutorFragment _Awscredential__Cloudcredential = new ExecutorFragment(Types._Awscredential, AccountsTables.Types._Cloudcredential);
		private static final /*@NonNull*/ ExecutorFragment _Awscredential__MixinBase = new ExecutorFragment(Types._Awscredential, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Awscredential__OclAny = new ExecutorFragment(Types._Awscredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Awscredential__OclElement = new ExecutorFragment(Types._Awscredential, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _C1_medium__C1_medium = new ExecutorFragment(Types._C1_medium, Ec2Tables.Types._C1_medium);
		private static final /*@NonNull*/ ExecutorFragment _C1_medium__Computeoptimized = new ExecutorFragment(Types._C1_medium, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C1_medium__MixinBase = new ExecutorFragment(Types._C1_medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C1_medium__OclAny = new ExecutorFragment(Types._C1_medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C1_medium__OclElement = new ExecutorFragment(Types._C1_medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C1_medium__Resource_tpl = new ExecutorFragment(Types._C1_medium, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C1_xlarge__C1_xlarge = new ExecutorFragment(Types._C1_xlarge, Ec2Tables.Types._C1_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C1_xlarge__Computeoptimized = new ExecutorFragment(Types._C1_xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C1_xlarge__MixinBase = new ExecutorFragment(Types._C1_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C1_xlarge__OclAny = new ExecutorFragment(Types._C1_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C1_xlarge__OclElement = new ExecutorFragment(Types._C1_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C1_xlarge__Resource_tpl = new ExecutorFragment(Types._C1_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C3_2xlarge__C3_2xlarge = new ExecutorFragment(Types._C3_2xlarge, Ec2Tables.Types._C3_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C3_2xlarge__Computeoptimized = new ExecutorFragment(Types._C3_2xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C3_2xlarge__MixinBase = new ExecutorFragment(Types._C3_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C3_2xlarge__OclAny = new ExecutorFragment(Types._C3_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C3_2xlarge__OclElement = new ExecutorFragment(Types._C3_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C3_2xlarge__Resource_tpl = new ExecutorFragment(Types._C3_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C3_4xlarge__C3_4xlarge = new ExecutorFragment(Types._C3_4xlarge, Ec2Tables.Types._C3_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C3_4xlarge__Computeoptimized = new ExecutorFragment(Types._C3_4xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C3_4xlarge__MixinBase = new ExecutorFragment(Types._C3_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C3_4xlarge__OclAny = new ExecutorFragment(Types._C3_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C3_4xlarge__OclElement = new ExecutorFragment(Types._C3_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C3_4xlarge__Resource_tpl = new ExecutorFragment(Types._C3_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C3_8xlarge__C3_8xlarge = new ExecutorFragment(Types._C3_8xlarge, Ec2Tables.Types._C3_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C3_8xlarge__Computeoptimized = new ExecutorFragment(Types._C3_8xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C3_8xlarge__MixinBase = new ExecutorFragment(Types._C3_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C3_8xlarge__OclAny = new ExecutorFragment(Types._C3_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C3_8xlarge__OclElement = new ExecutorFragment(Types._C3_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C3_8xlarge__Resource_tpl = new ExecutorFragment(Types._C3_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C3_large__C3_large = new ExecutorFragment(Types._C3_large, Ec2Tables.Types._C3_large);
		private static final /*@NonNull*/ ExecutorFragment _C3_large__Computeoptimized = new ExecutorFragment(Types._C3_large, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C3_large__MixinBase = new ExecutorFragment(Types._C3_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C3_large__OclAny = new ExecutorFragment(Types._C3_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C3_large__OclElement = new ExecutorFragment(Types._C3_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C3_large__Resource_tpl = new ExecutorFragment(Types._C3_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C3_xlarge__C3_xlarge = new ExecutorFragment(Types._C3_xlarge, Ec2Tables.Types._C3_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C3_xlarge__Computeoptimized = new ExecutorFragment(Types._C3_xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C3_xlarge__MixinBase = new ExecutorFragment(Types._C3_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C3_xlarge__OclAny = new ExecutorFragment(Types._C3_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C3_xlarge__OclElement = new ExecutorFragment(Types._C3_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C3_xlarge__Resource_tpl = new ExecutorFragment(Types._C3_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C4_2xlarge__C4_2xlarge = new ExecutorFragment(Types._C4_2xlarge, Ec2Tables.Types._C4_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C4_2xlarge__Computeoptimized = new ExecutorFragment(Types._C4_2xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C4_2xlarge__MixinBase = new ExecutorFragment(Types._C4_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C4_2xlarge__OclAny = new ExecutorFragment(Types._C4_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C4_2xlarge__OclElement = new ExecutorFragment(Types._C4_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C4_2xlarge__Resource_tpl = new ExecutorFragment(Types._C4_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C4_4xlarge__C4_4xlarge = new ExecutorFragment(Types._C4_4xlarge, Ec2Tables.Types._C4_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C4_4xlarge__Computeoptimized = new ExecutorFragment(Types._C4_4xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C4_4xlarge__MixinBase = new ExecutorFragment(Types._C4_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C4_4xlarge__OclAny = new ExecutorFragment(Types._C4_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C4_4xlarge__OclElement = new ExecutorFragment(Types._C4_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C4_4xlarge__Resource_tpl = new ExecutorFragment(Types._C4_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C4_8xlarge__C4_8xlarge = new ExecutorFragment(Types._C4_8xlarge, Ec2Tables.Types._C4_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C4_8xlarge__Computeoptimized = new ExecutorFragment(Types._C4_8xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C4_8xlarge__MixinBase = new ExecutorFragment(Types._C4_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C4_8xlarge__OclAny = new ExecutorFragment(Types._C4_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C4_8xlarge__OclElement = new ExecutorFragment(Types._C4_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C4_8xlarge__Resource_tpl = new ExecutorFragment(Types._C4_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C4_large__C4_large = new ExecutorFragment(Types._C4_large, Ec2Tables.Types._C4_large);
		private static final /*@NonNull*/ ExecutorFragment _C4_large__Computeoptimized = new ExecutorFragment(Types._C4_large, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C4_large__MixinBase = new ExecutorFragment(Types._C4_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C4_large__OclAny = new ExecutorFragment(Types._C4_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C4_large__OclElement = new ExecutorFragment(Types._C4_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C4_large__Resource_tpl = new ExecutorFragment(Types._C4_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C4_xlarge__C4_xlarge = new ExecutorFragment(Types._C4_xlarge, Ec2Tables.Types._C4_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C4_xlarge__Computeoptimized = new ExecutorFragment(Types._C4_xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C4_xlarge__MixinBase = new ExecutorFragment(Types._C4_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C4_xlarge__OclAny = new ExecutorFragment(Types._C4_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C4_xlarge__OclElement = new ExecutorFragment(Types._C4_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C4_xlarge__Resource_tpl = new ExecutorFragment(Types._C4_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C5_18xlarge__C5_18xlarge = new ExecutorFragment(Types._C5_18xlarge, Ec2Tables.Types._C5_18xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C5_18xlarge__Computeoptimized = new ExecutorFragment(Types._C5_18xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C5_18xlarge__MixinBase = new ExecutorFragment(Types._C5_18xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C5_18xlarge__OclAny = new ExecutorFragment(Types._C5_18xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C5_18xlarge__OclElement = new ExecutorFragment(Types._C5_18xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C5_18xlarge__Resource_tpl = new ExecutorFragment(Types._C5_18xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C5_2xlarge__C5_2xlarge = new ExecutorFragment(Types._C5_2xlarge, Ec2Tables.Types._C5_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C5_2xlarge__Computeoptimized = new ExecutorFragment(Types._C5_2xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C5_2xlarge__MixinBase = new ExecutorFragment(Types._C5_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C5_2xlarge__OclAny = new ExecutorFragment(Types._C5_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C5_2xlarge__OclElement = new ExecutorFragment(Types._C5_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C5_2xlarge__Resource_tpl = new ExecutorFragment(Types._C5_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C5_4xlarge__C5_4xlarge = new ExecutorFragment(Types._C5_4xlarge, Ec2Tables.Types._C5_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C5_4xlarge__Computeoptimized = new ExecutorFragment(Types._C5_4xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C5_4xlarge__MixinBase = new ExecutorFragment(Types._C5_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C5_4xlarge__OclAny = new ExecutorFragment(Types._C5_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C5_4xlarge__OclElement = new ExecutorFragment(Types._C5_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C5_4xlarge__Resource_tpl = new ExecutorFragment(Types._C5_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C5_9xlarge__C5_9xlarge = new ExecutorFragment(Types._C5_9xlarge, Ec2Tables.Types._C5_9xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C5_9xlarge__Computeoptimized = new ExecutorFragment(Types._C5_9xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C5_9xlarge__MixinBase = new ExecutorFragment(Types._C5_9xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C5_9xlarge__OclAny = new ExecutorFragment(Types._C5_9xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C5_9xlarge__OclElement = new ExecutorFragment(Types._C5_9xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C5_9xlarge__Resource_tpl = new ExecutorFragment(Types._C5_9xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C5_large__C5_large = new ExecutorFragment(Types._C5_large, Ec2Tables.Types._C5_large);
		private static final /*@NonNull*/ ExecutorFragment _C5_large__Computeoptimized = new ExecutorFragment(Types._C5_large, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C5_large__MixinBase = new ExecutorFragment(Types._C5_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C5_large__OclAny = new ExecutorFragment(Types._C5_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C5_large__OclElement = new ExecutorFragment(Types._C5_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C5_large__Resource_tpl = new ExecutorFragment(Types._C5_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _C5_xlarge__C5_xlarge = new ExecutorFragment(Types._C5_xlarge, Ec2Tables.Types._C5_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _C5_xlarge__Computeoptimized = new ExecutorFragment(Types._C5_xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _C5_xlarge__MixinBase = new ExecutorFragment(Types._C5_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _C5_xlarge__OclAny = new ExecutorFragment(Types._C5_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _C5_xlarge__OclElement = new ExecutorFragment(Types._C5_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _C5_xlarge__Resource_tpl = new ExecutorFragment(Types._C5_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__Ca_central_1 = new ExecutorFragment(Types._Ca_central_1, Ec2Tables.Types._Ca_central_1);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__MixinBase = new ExecutorFragment(Types._Ca_central_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__OclAny = new ExecutorFragment(Types._Ca_central_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__OclElement = new ExecutorFragment(Types._Ca_central_1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cc2_8xlarge__Cc2_8xlarge = new ExecutorFragment(Types._Cc2_8xlarge, Ec2Tables.Types._Cc2_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _Cc2_8xlarge__Computeoptimized = new ExecutorFragment(Types._Cc2_8xlarge, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _Cc2_8xlarge__MixinBase = new ExecutorFragment(Types._Cc2_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cc2_8xlarge__OclAny = new ExecutorFragment(Types._Cc2_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cc2_8xlarge__OclElement = new ExecutorFragment(Types._Cc2_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cc2_8xlarge__Resource_tpl = new ExecutorFragment(Types._Cc2_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Cg1_4xlarge__Acceleratedcomputing = new ExecutorFragment(Types._Cg1_4xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _Cg1_4xlarge__Cg1_4xlarge = new ExecutorFragment(Types._Cg1_4xlarge, Ec2Tables.Types._Cg1_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _Cg1_4xlarge__MixinBase = new ExecutorFragment(Types._Cg1_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cg1_4xlarge__OclAny = new ExecutorFragment(Types._Cg1_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cg1_4xlarge__OclElement = new ExecutorFragment(Types._Cg1_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cg1_4xlarge__Resource_tpl = new ExecutorFragment(Types._Cg1_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Computeoptimized__Computeoptimized = new ExecutorFragment(Types._Computeoptimized, Ec2Tables.Types._Computeoptimized);
		private static final /*@NonNull*/ ExecutorFragment _Computeoptimized__MixinBase = new ExecutorFragment(Types._Computeoptimized, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Computeoptimized__OclAny = new ExecutorFragment(Types._Computeoptimized, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Computeoptimized__OclElement = new ExecutorFragment(Types._Computeoptimized, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Computeoptimized__Resource_tpl = new ExecutorFragment(Types._Computeoptimized, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Cr1_8xlarge__Cr1_8xlarge = new ExecutorFragment(Types._Cr1_8xlarge, Ec2Tables.Types._Cr1_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _Cr1_8xlarge__Memoryoptimized = new ExecutorFragment(Types._Cr1_8xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _Cr1_8xlarge__MixinBase = new ExecutorFragment(Types._Cr1_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cr1_8xlarge__OclAny = new ExecutorFragment(Types._Cr1_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cr1_8xlarge__OclElement = new ExecutorFragment(Types._Cr1_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cr1_8xlarge__Resource_tpl = new ExecutorFragment(Types._Cr1_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _D2_2xlarge__D2_2xlarge = new ExecutorFragment(Types._D2_2xlarge, Ec2Tables.Types._D2_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _D2_2xlarge__MixinBase = new ExecutorFragment(Types._D2_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _D2_2xlarge__OclAny = new ExecutorFragment(Types._D2_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _D2_2xlarge__OclElement = new ExecutorFragment(Types._D2_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _D2_2xlarge__Resource_tpl = new ExecutorFragment(Types._D2_2xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _D2_2xlarge__Storageoptimized = new ExecutorFragment(Types._D2_2xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _D2_4xlarge__D2_4xlarge = new ExecutorFragment(Types._D2_4xlarge, Ec2Tables.Types._D2_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _D2_4xlarge__MixinBase = new ExecutorFragment(Types._D2_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _D2_4xlarge__OclAny = new ExecutorFragment(Types._D2_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _D2_4xlarge__OclElement = new ExecutorFragment(Types._D2_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _D2_4xlarge__Resource_tpl = new ExecutorFragment(Types._D2_4xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _D2_4xlarge__Storageoptimized = new ExecutorFragment(Types._D2_4xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _D2_8xlarge__D2_8xlarge = new ExecutorFragment(Types._D2_8xlarge, Ec2Tables.Types._D2_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _D2_8xlarge__MixinBase = new ExecutorFragment(Types._D2_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _D2_8xlarge__OclAny = new ExecutorFragment(Types._D2_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _D2_8xlarge__OclElement = new ExecutorFragment(Types._D2_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _D2_8xlarge__Resource_tpl = new ExecutorFragment(Types._D2_8xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _D2_8xlarge__Storageoptimized = new ExecutorFragment(Types._D2_8xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _D2_xlarge__D2_xlarge = new ExecutorFragment(Types._D2_xlarge, Ec2Tables.Types._D2_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _D2_xlarge__MixinBase = new ExecutorFragment(Types._D2_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _D2_xlarge__OclAny = new ExecutorFragment(Types._D2_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _D2_xlarge__OclElement = new ExecutorFragment(Types._D2_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _D2_xlarge__Resource_tpl = new ExecutorFragment(Types._D2_xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _D2_xlarge__Storageoptimized = new ExecutorFragment(Types._D2_xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__Eu_central_1 = new ExecutorFragment(Types._Eu_central_1, Ec2Tables.Types._Eu_central_1);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__MixinBase = new ExecutorFragment(Types._Eu_central_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__OclAny = new ExecutorFragment(Types._Eu_central_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__OclElement = new ExecutorFragment(Types._Eu_central_1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__Eu_west_1 = new ExecutorFragment(Types._Eu_west_1, Ec2Tables.Types._Eu_west_1);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__MixinBase = new ExecutorFragment(Types._Eu_west_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__OclAny = new ExecutorFragment(Types._Eu_west_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__OclElement = new ExecutorFragment(Types._Eu_west_1, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__Eu_west_2 = new ExecutorFragment(Types._Eu_west_2, Ec2Tables.Types._Eu_west_2);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__MixinBase = new ExecutorFragment(Types._Eu_west_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__OclAny = new ExecutorFragment(Types._Eu_west_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__OclElement = new ExecutorFragment(Types._Eu_west_2, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__Eu_west_3 = new ExecutorFragment(Types._Eu_west_3, Ec2Tables.Types._Eu_west_3);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__MixinBase = new ExecutorFragment(Types._Eu_west_3, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__OclAny = new ExecutorFragment(Types._Eu_west_3, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__OclElement = new ExecutorFragment(Types._Eu_west_3, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Europe__Europe = new ExecutorFragment(Types._Europe, Ec2Tables.Types._Europe);
		private static final /*@NonNull*/ ExecutorFragment _Europe__MixinBase = new ExecutorFragment(Types._Europe, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Europe__OclAny = new ExecutorFragment(Types._Europe, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Europe__OclElement = new ExecutorFragment(Types._Europe, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Europe__Region = new ExecutorFragment(Types._Europe, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _F1_16xlarge__Acceleratedcomputing = new ExecutorFragment(Types._F1_16xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _F1_16xlarge__F1_16xlarge = new ExecutorFragment(Types._F1_16xlarge, Ec2Tables.Types._F1_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _F1_16xlarge__MixinBase = new ExecutorFragment(Types._F1_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _F1_16xlarge__OclAny = new ExecutorFragment(Types._F1_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _F1_16xlarge__OclElement = new ExecutorFragment(Types._F1_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _F1_16xlarge__Resource_tpl = new ExecutorFragment(Types._F1_16xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _F1_2xlarge__Acceleratedcomputing = new ExecutorFragment(Types._F1_2xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _F1_2xlarge__F1_2xlarge = new ExecutorFragment(Types._F1_2xlarge, Ec2Tables.Types._F1_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _F1_2xlarge__MixinBase = new ExecutorFragment(Types._F1_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _F1_2xlarge__OclAny = new ExecutorFragment(Types._F1_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _F1_2xlarge__OclElement = new ExecutorFragment(Types._F1_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _F1_2xlarge__Resource_tpl = new ExecutorFragment(Types._F1_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _G2_2xlarge__Acceleratedcomputing = new ExecutorFragment(Types._G2_2xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _G2_2xlarge__G2_2xlarge = new ExecutorFragment(Types._G2_2xlarge, Ec2Tables.Types._G2_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _G2_2xlarge__MixinBase = new ExecutorFragment(Types._G2_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _G2_2xlarge__OclAny = new ExecutorFragment(Types._G2_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _G2_2xlarge__OclElement = new ExecutorFragment(Types._G2_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _G2_2xlarge__Resource_tpl = new ExecutorFragment(Types._G2_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _G2_8xlarge__Acceleratedcomputing = new ExecutorFragment(Types._G2_8xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _G2_8xlarge__G2_8xlarge = new ExecutorFragment(Types._G2_8xlarge, Ec2Tables.Types._G2_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _G2_8xlarge__MixinBase = new ExecutorFragment(Types._G2_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _G2_8xlarge__OclAny = new ExecutorFragment(Types._G2_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _G2_8xlarge__OclElement = new ExecutorFragment(Types._G2_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _G2_8xlarge__Resource_tpl = new ExecutorFragment(Types._G2_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _G3_16xlarge__Acceleratedcomputing = new ExecutorFragment(Types._G3_16xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _G3_16xlarge__G3_16xlarge = new ExecutorFragment(Types._G3_16xlarge, Ec2Tables.Types._G3_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _G3_16xlarge__MixinBase = new ExecutorFragment(Types._G3_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _G3_16xlarge__OclAny = new ExecutorFragment(Types._G3_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _G3_16xlarge__OclElement = new ExecutorFragment(Types._G3_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _G3_16xlarge__Resource_tpl = new ExecutorFragment(Types._G3_16xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _G3_4xlarge__Acceleratedcomputing = new ExecutorFragment(Types._G3_4xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _G3_4xlarge__G3_4xlarge = new ExecutorFragment(Types._G3_4xlarge, Ec2Tables.Types._G3_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _G3_4xlarge__MixinBase = new ExecutorFragment(Types._G3_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _G3_4xlarge__OclAny = new ExecutorFragment(Types._G3_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _G3_4xlarge__OclElement = new ExecutorFragment(Types._G3_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _G3_4xlarge__Resource_tpl = new ExecutorFragment(Types._G3_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _G3_8xlarge__Acceleratedcomputing = new ExecutorFragment(Types._G3_8xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _G3_8xlarge__G3_8xlarge = new ExecutorFragment(Types._G3_8xlarge, Ec2Tables.Types._G3_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _G3_8xlarge__MixinBase = new ExecutorFragment(Types._G3_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _G3_8xlarge__OclAny = new ExecutorFragment(Types._G3_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _G3_8xlarge__OclElement = new ExecutorFragment(Types._G3_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _G3_8xlarge__Resource_tpl = new ExecutorFragment(Types._G3_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Generalpurpose__Generalpurpose = new ExecutorFragment(Types._Generalpurpose, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _Generalpurpose__MixinBase = new ExecutorFragment(Types._Generalpurpose, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Generalpurpose__OclAny = new ExecutorFragment(Types._Generalpurpose, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Generalpurpose__OclElement = new ExecutorFragment(Types._Generalpurpose, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Generalpurpose__Resource_tpl = new ExecutorFragment(Types._Generalpurpose, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _H1_16xlarge__H1_16xlarge = new ExecutorFragment(Types._H1_16xlarge, Ec2Tables.Types._H1_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _H1_16xlarge__MixinBase = new ExecutorFragment(Types._H1_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _H1_16xlarge__OclAny = new ExecutorFragment(Types._H1_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _H1_16xlarge__OclElement = new ExecutorFragment(Types._H1_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _H1_16xlarge__Resource_tpl = new ExecutorFragment(Types._H1_16xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _H1_16xlarge__Storageoptimized = new ExecutorFragment(Types._H1_16xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _H1_2xlarge__H1_2xlarge = new ExecutorFragment(Types._H1_2xlarge, Ec2Tables.Types._H1_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _H1_2xlarge__MixinBase = new ExecutorFragment(Types._H1_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _H1_2xlarge__OclAny = new ExecutorFragment(Types._H1_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _H1_2xlarge__OclElement = new ExecutorFragment(Types._H1_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _H1_2xlarge__Resource_tpl = new ExecutorFragment(Types._H1_2xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _H1_2xlarge__Storageoptimized = new ExecutorFragment(Types._H1_2xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _H1_4xlarge__H1_4xlarge = new ExecutorFragment(Types._H1_4xlarge, Ec2Tables.Types._H1_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _H1_4xlarge__MixinBase = new ExecutorFragment(Types._H1_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _H1_4xlarge__OclAny = new ExecutorFragment(Types._H1_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _H1_4xlarge__OclElement = new ExecutorFragment(Types._H1_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _H1_4xlarge__Resource_tpl = new ExecutorFragment(Types._H1_4xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _H1_4xlarge__Storageoptimized = new ExecutorFragment(Types._H1_4xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _H1_8xlarge__H1_8xlarge = new ExecutorFragment(Types._H1_8xlarge, Ec2Tables.Types._H1_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _H1_8xlarge__MixinBase = new ExecutorFragment(Types._H1_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _H1_8xlarge__OclAny = new ExecutorFragment(Types._H1_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _H1_8xlarge__OclElement = new ExecutorFragment(Types._H1_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _H1_8xlarge__Resource_tpl = new ExecutorFragment(Types._H1_8xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _H1_8xlarge__Storageoptimized = new ExecutorFragment(Types._H1_8xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _Hs1_8xlarge__Hs1_8xlarge = new ExecutorFragment(Types._Hs1_8xlarge, Ec2Tables.Types._Hs1_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _Hs1_8xlarge__MixinBase = new ExecutorFragment(Types._Hs1_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Hs1_8xlarge__OclAny = new ExecutorFragment(Types._Hs1_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Hs1_8xlarge__OclElement = new ExecutorFragment(Types._Hs1_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Hs1_8xlarge__Resource_tpl = new ExecutorFragment(Types._Hs1_8xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Hs1_8xlarge__Storageoptimized = new ExecutorFragment(Types._Hs1_8xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _HypervisorType__HypervisorType = new ExecutorFragment(Types._HypervisorType, Ec2Tables.Types._HypervisorType);
		private static final /*@NonNull*/ ExecutorFragment _HypervisorType__OclAny = new ExecutorFragment(Types._HypervisorType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _HypervisorType__OclElement = new ExecutorFragment(Types._HypervisorType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _HypervisorType__OclEnumeration = new ExecutorFragment(Types._HypervisorType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _HypervisorType__OclType = new ExecutorFragment(Types._HypervisorType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _I2_2xlarge__I2_2xlarge = new ExecutorFragment(Types._I2_2xlarge, Ec2Tables.Types._I2_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I2_2xlarge__MixinBase = new ExecutorFragment(Types._I2_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I2_2xlarge__OclAny = new ExecutorFragment(Types._I2_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I2_2xlarge__OclElement = new ExecutorFragment(Types._I2_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I2_2xlarge__Resource_tpl = new ExecutorFragment(Types._I2_2xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I2_2xlarge__Storageoptimized = new ExecutorFragment(Types._I2_2xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I2_4xlarge__I2_4xlarge = new ExecutorFragment(Types._I2_4xlarge, Ec2Tables.Types._I2_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I2_4xlarge__MixinBase = new ExecutorFragment(Types._I2_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I2_4xlarge__OclAny = new ExecutorFragment(Types._I2_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I2_4xlarge__OclElement = new ExecutorFragment(Types._I2_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I2_4xlarge__Resource_tpl = new ExecutorFragment(Types._I2_4xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I2_4xlarge__Storageoptimized = new ExecutorFragment(Types._I2_4xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I2_8xlarge__I2_8xlarge = new ExecutorFragment(Types._I2_8xlarge, Ec2Tables.Types._I2_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I2_8xlarge__MixinBase = new ExecutorFragment(Types._I2_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I2_8xlarge__OclAny = new ExecutorFragment(Types._I2_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I2_8xlarge__OclElement = new ExecutorFragment(Types._I2_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I2_8xlarge__Resource_tpl = new ExecutorFragment(Types._I2_8xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I2_8xlarge__Storageoptimized = new ExecutorFragment(Types._I2_8xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I2_xlarge__I2_xlarge = new ExecutorFragment(Types._I2_xlarge, Ec2Tables.Types._I2_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I2_xlarge__MixinBase = new ExecutorFragment(Types._I2_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I2_xlarge__OclAny = new ExecutorFragment(Types._I2_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I2_xlarge__OclElement = new ExecutorFragment(Types._I2_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I2_xlarge__Resource_tpl = new ExecutorFragment(Types._I2_xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I2_xlarge__Storageoptimized = new ExecutorFragment(Types._I2_xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I3_16xlarge__I3_16xlarge = new ExecutorFragment(Types._I3_16xlarge, Ec2Tables.Types._I3_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I3_16xlarge__MixinBase = new ExecutorFragment(Types._I3_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I3_16xlarge__OclAny = new ExecutorFragment(Types._I3_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I3_16xlarge__OclElement = new ExecutorFragment(Types._I3_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I3_16xlarge__Resource_tpl = new ExecutorFragment(Types._I3_16xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I3_16xlarge__Storageoptimized = new ExecutorFragment(Types._I3_16xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I3_2xlarge__I3_2xlarge = new ExecutorFragment(Types._I3_2xlarge, Ec2Tables.Types._I3_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I3_2xlarge__MixinBase = new ExecutorFragment(Types._I3_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I3_2xlarge__OclAny = new ExecutorFragment(Types._I3_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I3_2xlarge__OclElement = new ExecutorFragment(Types._I3_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I3_2xlarge__Resource_tpl = new ExecutorFragment(Types._I3_2xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I3_2xlarge__Storageoptimized = new ExecutorFragment(Types._I3_2xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I3_4xlarge__I3_4xlarge = new ExecutorFragment(Types._I3_4xlarge, Ec2Tables.Types._I3_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I3_4xlarge__MixinBase = new ExecutorFragment(Types._I3_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I3_4xlarge__OclAny = new ExecutorFragment(Types._I3_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I3_4xlarge__OclElement = new ExecutorFragment(Types._I3_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I3_4xlarge__Resource_tpl = new ExecutorFragment(Types._I3_4xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I3_4xlarge__Storageoptimized = new ExecutorFragment(Types._I3_4xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I3_8xlarge__I3_8xlarge = new ExecutorFragment(Types._I3_8xlarge, Ec2Tables.Types._I3_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I3_8xlarge__MixinBase = new ExecutorFragment(Types._I3_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I3_8xlarge__OclAny = new ExecutorFragment(Types._I3_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I3_8xlarge__OclElement = new ExecutorFragment(Types._I3_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I3_8xlarge__Resource_tpl = new ExecutorFragment(Types._I3_8xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I3_8xlarge__Storageoptimized = new ExecutorFragment(Types._I3_8xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I3_large__I3_large = new ExecutorFragment(Types._I3_large, Ec2Tables.Types._I3_large);
		private static final /*@NonNull*/ ExecutorFragment _I3_large__MixinBase = new ExecutorFragment(Types._I3_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I3_large__OclAny = new ExecutorFragment(Types._I3_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I3_large__OclElement = new ExecutorFragment(Types._I3_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I3_large__Resource_tpl = new ExecutorFragment(Types._I3_large, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I3_large__Storageoptimized = new ExecutorFragment(Types._I3_large, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I3_metal__I3_metal = new ExecutorFragment(Types._I3_metal, Ec2Tables.Types._I3_metal);
		private static final /*@NonNull*/ ExecutorFragment _I3_metal__MixinBase = new ExecutorFragment(Types._I3_metal, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I3_metal__OclAny = new ExecutorFragment(Types._I3_metal, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I3_metal__OclElement = new ExecutorFragment(Types._I3_metal, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I3_metal__Resource_tpl = new ExecutorFragment(Types._I3_metal, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I3_metal__Storageoptimized = new ExecutorFragment(Types._I3_metal, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _I3_xlarge__I3_xlarge = new ExecutorFragment(Types._I3_xlarge, Ec2Tables.Types._I3_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _I3_xlarge__MixinBase = new ExecutorFragment(Types._I3_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _I3_xlarge__OclAny = new ExecutorFragment(Types._I3_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _I3_xlarge__OclElement = new ExecutorFragment(Types._I3_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _I3_xlarge__Resource_tpl = new ExecutorFragment(Types._I3_xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _I3_xlarge__Storageoptimized = new ExecutorFragment(Types._I3_xlarge, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _InstanceLifeCycleType__InstanceLifeCycleType = new ExecutorFragment(Types._InstanceLifeCycleType, Ec2Tables.Types._InstanceLifeCycleType);
		private static final /*@NonNull*/ ExecutorFragment _InstanceLifeCycleType__OclAny = new ExecutorFragment(Types._InstanceLifeCycleType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _InstanceLifeCycleType__OclElement = new ExecutorFragment(Types._InstanceLifeCycleType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _InstanceLifeCycleType__OclEnumeration = new ExecutorFragment(Types._InstanceLifeCycleType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _InstanceLifeCycleType__OclType = new ExecutorFragment(Types._InstanceLifeCycleType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Instanceec2__Compute = new ExecutorFragment(Types._Instanceec2, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Instanceec2__Entity = new ExecutorFragment(Types._Instanceec2, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Instanceec2__Instanceec2 = new ExecutorFragment(Types._Instanceec2, Ec2Tables.Types._Instanceec2);
		private static final /*@NonNull*/ ExecutorFragment _Instanceec2__OclAny = new ExecutorFragment(Types._Instanceec2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Instanceec2__OclElement = new ExecutorFragment(Types._Instanceec2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Instanceec2__Resource = new ExecutorFragment(Types._Instanceec2, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Instancevpcinfo__Instancevpcinfo = new ExecutorFragment(Types._Instancevpcinfo, Ec2Tables.Types._Instancevpcinfo);
		private static final /*@NonNull*/ ExecutorFragment _Instancevpcinfo__MixinBase = new ExecutorFragment(Types._Instancevpcinfo, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Instancevpcinfo__OclAny = new ExecutorFragment(Types._Instancevpcinfo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Instancevpcinfo__OclElement = new ExecutorFragment(Types._Instancevpcinfo, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _M1_large__Generalpurpose = new ExecutorFragment(Types._M1_large, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M1_large__M1_large = new ExecutorFragment(Types._M1_large, Ec2Tables.Types._M1_large);
		private static final /*@NonNull*/ ExecutorFragment _M1_large__MixinBase = new ExecutorFragment(Types._M1_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M1_large__OclAny = new ExecutorFragment(Types._M1_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M1_large__OclElement = new ExecutorFragment(Types._M1_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M1_large__Resource_tpl = new ExecutorFragment(Types._M1_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M1_medium__Generalpurpose = new ExecutorFragment(Types._M1_medium, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M1_medium__M1_medium = new ExecutorFragment(Types._M1_medium, Ec2Tables.Types._M1_medium);
		private static final /*@NonNull*/ ExecutorFragment _M1_medium__MixinBase = new ExecutorFragment(Types._M1_medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M1_medium__OclAny = new ExecutorFragment(Types._M1_medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M1_medium__OclElement = new ExecutorFragment(Types._M1_medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M1_medium__Resource_tpl = new ExecutorFragment(Types._M1_medium, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M1_small__Generalpurpose = new ExecutorFragment(Types._M1_small, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M1_small__M1_small = new ExecutorFragment(Types._M1_small, Ec2Tables.Types._M1_small);
		private static final /*@NonNull*/ ExecutorFragment _M1_small__MixinBase = new ExecutorFragment(Types._M1_small, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M1_small__OclAny = new ExecutorFragment(Types._M1_small, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M1_small__OclElement = new ExecutorFragment(Types._M1_small, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M1_small__Resource_tpl = new ExecutorFragment(Types._M1_small, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M1_xlarge__Generalpurpose = new ExecutorFragment(Types._M1_xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M1_xlarge__M1_xlarge = new ExecutorFragment(Types._M1_xlarge, Ec2Tables.Types._M1_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M1_xlarge__MixinBase = new ExecutorFragment(Types._M1_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M1_xlarge__OclAny = new ExecutorFragment(Types._M1_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M1_xlarge__OclElement = new ExecutorFragment(Types._M1_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M1_xlarge__Resource_tpl = new ExecutorFragment(Types._M1_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M2_2xlarge__M2_2xlarge = new ExecutorFragment(Types._M2_2xlarge, Ec2Tables.Types._M2_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M2_2xlarge__Memoryoptimized = new ExecutorFragment(Types._M2_2xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _M2_2xlarge__MixinBase = new ExecutorFragment(Types._M2_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M2_2xlarge__OclAny = new ExecutorFragment(Types._M2_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M2_2xlarge__OclElement = new ExecutorFragment(Types._M2_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M2_2xlarge__Resource_tpl = new ExecutorFragment(Types._M2_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M2_4xlarge__M2_4xlarge = new ExecutorFragment(Types._M2_4xlarge, Ec2Tables.Types._M2_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M2_4xlarge__Memoryoptimized = new ExecutorFragment(Types._M2_4xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _M2_4xlarge__MixinBase = new ExecutorFragment(Types._M2_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M2_4xlarge__OclAny = new ExecutorFragment(Types._M2_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M2_4xlarge__OclElement = new ExecutorFragment(Types._M2_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M2_4xlarge__Resource_tpl = new ExecutorFragment(Types._M2_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M2_xlarge__M2_xlarge = new ExecutorFragment(Types._M2_xlarge, Ec2Tables.Types._M2_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M2_xlarge__Memoryoptimized = new ExecutorFragment(Types._M2_xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _M2_xlarge__MixinBase = new ExecutorFragment(Types._M2_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M2_xlarge__OclAny = new ExecutorFragment(Types._M2_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M2_xlarge__OclElement = new ExecutorFragment(Types._M2_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M2_xlarge__Resource_tpl = new ExecutorFragment(Types._M2_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M3_2xlarge__Generalpurpose = new ExecutorFragment(Types._M3_2xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M3_2xlarge__M3_2xlarge = new ExecutorFragment(Types._M3_2xlarge, Ec2Tables.Types._M3_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M3_2xlarge__MixinBase = new ExecutorFragment(Types._M3_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M3_2xlarge__OclAny = new ExecutorFragment(Types._M3_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M3_2xlarge__OclElement = new ExecutorFragment(Types._M3_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M3_2xlarge__Resource_tpl = new ExecutorFragment(Types._M3_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M3_large__Generalpurpose = new ExecutorFragment(Types._M3_large, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M3_large__M3_large = new ExecutorFragment(Types._M3_large, Ec2Tables.Types._M3_large);
		private static final /*@NonNull*/ ExecutorFragment _M3_large__MixinBase = new ExecutorFragment(Types._M3_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M3_large__OclAny = new ExecutorFragment(Types._M3_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M3_large__OclElement = new ExecutorFragment(Types._M3_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M3_large__Resource_tpl = new ExecutorFragment(Types._M3_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M3_medium__Generalpurpose = new ExecutorFragment(Types._M3_medium, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M3_medium__M3_medium = new ExecutorFragment(Types._M3_medium, Ec2Tables.Types._M3_medium);
		private static final /*@NonNull*/ ExecutorFragment _M3_medium__MixinBase = new ExecutorFragment(Types._M3_medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M3_medium__OclAny = new ExecutorFragment(Types._M3_medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M3_medium__OclElement = new ExecutorFragment(Types._M3_medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M3_medium__Resource_tpl = new ExecutorFragment(Types._M3_medium, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M3_xlarge__Generalpurpose = new ExecutorFragment(Types._M3_xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M3_xlarge__M3_xlarge = new ExecutorFragment(Types._M3_xlarge, Ec2Tables.Types._M3_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M3_xlarge__MixinBase = new ExecutorFragment(Types._M3_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M3_xlarge__OclAny = new ExecutorFragment(Types._M3_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M3_xlarge__OclElement = new ExecutorFragment(Types._M3_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M3_xlarge__Resource_tpl = new ExecutorFragment(Types._M3_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M4_10xlarge__Generalpurpose = new ExecutorFragment(Types._M4_10xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M4_10xlarge__M4_10xlarge = new ExecutorFragment(Types._M4_10xlarge, Ec2Tables.Types._M4_10xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M4_10xlarge__MixinBase = new ExecutorFragment(Types._M4_10xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M4_10xlarge__OclAny = new ExecutorFragment(Types._M4_10xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M4_10xlarge__OclElement = new ExecutorFragment(Types._M4_10xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M4_10xlarge__Resource_tpl = new ExecutorFragment(Types._M4_10xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M4_16xlarge__Generalpurpose = new ExecutorFragment(Types._M4_16xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M4_16xlarge__M4_16xlarge = new ExecutorFragment(Types._M4_16xlarge, Ec2Tables.Types._M4_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M4_16xlarge__MixinBase = new ExecutorFragment(Types._M4_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M4_16xlarge__OclAny = new ExecutorFragment(Types._M4_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M4_16xlarge__OclElement = new ExecutorFragment(Types._M4_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M4_16xlarge__Resource_tpl = new ExecutorFragment(Types._M4_16xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M4_2xlarge__Generalpurpose = new ExecutorFragment(Types._M4_2xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M4_2xlarge__M4_2xlarge = new ExecutorFragment(Types._M4_2xlarge, Ec2Tables.Types._M4_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M4_2xlarge__MixinBase = new ExecutorFragment(Types._M4_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M4_2xlarge__OclAny = new ExecutorFragment(Types._M4_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M4_2xlarge__OclElement = new ExecutorFragment(Types._M4_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M4_2xlarge__Resource_tpl = new ExecutorFragment(Types._M4_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M4_large__Generalpurpose = new ExecutorFragment(Types._M4_large, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M4_large__M4_large = new ExecutorFragment(Types._M4_large, Ec2Tables.Types._M4_large);
		private static final /*@NonNull*/ ExecutorFragment _M4_large__MixinBase = new ExecutorFragment(Types._M4_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M4_large__OclAny = new ExecutorFragment(Types._M4_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M4_large__OclElement = new ExecutorFragment(Types._M4_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M4_large__Resource_tpl = new ExecutorFragment(Types._M4_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M4_xlarge__Generalpurpose = new ExecutorFragment(Types._M4_xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M4_xlarge__M4_xlarge = new ExecutorFragment(Types._M4_xlarge, Ec2Tables.Types._M4_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M4_xlarge__MixinBase = new ExecutorFragment(Types._M4_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M4_xlarge__OclAny = new ExecutorFragment(Types._M4_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M4_xlarge__OclElement = new ExecutorFragment(Types._M4_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M4_xlarge__Resource_tpl = new ExecutorFragment(Types._M4_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M5_12xlarge__Generalpurpose = new ExecutorFragment(Types._M5_12xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M5_12xlarge__M5_12xlarge = new ExecutorFragment(Types._M5_12xlarge, Ec2Tables.Types._M5_12xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M5_12xlarge__MixinBase = new ExecutorFragment(Types._M5_12xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M5_12xlarge__OclAny = new ExecutorFragment(Types._M5_12xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M5_12xlarge__OclElement = new ExecutorFragment(Types._M5_12xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M5_12xlarge__Resource_tpl = new ExecutorFragment(Types._M5_12xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M5_24xlarge__Generalpurpose = new ExecutorFragment(Types._M5_24xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M5_24xlarge__M5_24xlarge = new ExecutorFragment(Types._M5_24xlarge, Ec2Tables.Types._M5_24xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M5_24xlarge__MixinBase = new ExecutorFragment(Types._M5_24xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M5_24xlarge__OclAny = new ExecutorFragment(Types._M5_24xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M5_24xlarge__OclElement = new ExecutorFragment(Types._M5_24xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M5_24xlarge__Resource_tpl = new ExecutorFragment(Types._M5_24xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M5_2xlarge__Generalpurpose = new ExecutorFragment(Types._M5_2xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M5_2xlarge__M5_2xlarge = new ExecutorFragment(Types._M5_2xlarge, Ec2Tables.Types._M5_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M5_2xlarge__MixinBase = new ExecutorFragment(Types._M5_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M5_2xlarge__OclAny = new ExecutorFragment(Types._M5_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M5_2xlarge__OclElement = new ExecutorFragment(Types._M5_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M5_2xlarge__Resource_tpl = new ExecutorFragment(Types._M5_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M5_4xlarge__Generalpurpose = new ExecutorFragment(Types._M5_4xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M5_4xlarge__M5_4xlarge = new ExecutorFragment(Types._M5_4xlarge, Ec2Tables.Types._M5_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M5_4xlarge__MixinBase = new ExecutorFragment(Types._M5_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M5_4xlarge__OclAny = new ExecutorFragment(Types._M5_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M5_4xlarge__OclElement = new ExecutorFragment(Types._M5_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M5_4xlarge__Resource_tpl = new ExecutorFragment(Types._M5_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M5_large__Generalpurpose = new ExecutorFragment(Types._M5_large, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M5_large__M5_large = new ExecutorFragment(Types._M5_large, Ec2Tables.Types._M5_large);
		private static final /*@NonNull*/ ExecutorFragment _M5_large__MixinBase = new ExecutorFragment(Types._M5_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M5_large__OclAny = new ExecutorFragment(Types._M5_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M5_large__OclElement = new ExecutorFragment(Types._M5_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M5_large__Resource_tpl = new ExecutorFragment(Types._M5_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _M5_xlarge__Generalpurpose = new ExecutorFragment(Types._M5_xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _M5_xlarge__M5_xlarge = new ExecutorFragment(Types._M5_xlarge, Ec2Tables.Types._M5_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _M5_xlarge__MixinBase = new ExecutorFragment(Types._M5_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _M5_xlarge__OclAny = new ExecutorFragment(Types._M5_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _M5_xlarge__OclElement = new ExecutorFragment(Types._M5_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _M5_xlarge__Resource_tpl = new ExecutorFragment(Types._M5_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Memoryoptimized__Memoryoptimized = new ExecutorFragment(Types._Memoryoptimized, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _Memoryoptimized__MixinBase = new ExecutorFragment(Types._Memoryoptimized, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Memoryoptimized__OclAny = new ExecutorFragment(Types._Memoryoptimized, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Memoryoptimized__OclElement = new ExecutorFragment(Types._Memoryoptimized, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Memoryoptimized__Resource_tpl = new ExecutorFragment(Types._Memoryoptimized, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _MonitoringState__MonitoringState = new ExecutorFragment(Types._MonitoringState, Ec2Tables.Types._MonitoringState);
		private static final /*@NonNull*/ ExecutorFragment _MonitoringState__OclAny = new ExecutorFragment(Types._MonitoringState, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MonitoringState__OclElement = new ExecutorFragment(Types._MonitoringState, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MonitoringState__OclEnumeration = new ExecutorFragment(Types._MonitoringState, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _MonitoringState__OclType = new ExecutorFragment(Types._MonitoringState, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _P2_16xlarge__Acceleratedcomputing = new ExecutorFragment(Types._P2_16xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _P2_16xlarge__MixinBase = new ExecutorFragment(Types._P2_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _P2_16xlarge__OclAny = new ExecutorFragment(Types._P2_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _P2_16xlarge__OclElement = new ExecutorFragment(Types._P2_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _P2_16xlarge__P2_16xlarge = new ExecutorFragment(Types._P2_16xlarge, Ec2Tables.Types._P2_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _P2_16xlarge__Resource_tpl = new ExecutorFragment(Types._P2_16xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _P2_8xlarge__Acceleratedcomputing = new ExecutorFragment(Types._P2_8xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _P2_8xlarge__MixinBase = new ExecutorFragment(Types._P2_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _P2_8xlarge__OclAny = new ExecutorFragment(Types._P2_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _P2_8xlarge__OclElement = new ExecutorFragment(Types._P2_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _P2_8xlarge__P2_8xlarge = new ExecutorFragment(Types._P2_8xlarge, Ec2Tables.Types._P2_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _P2_8xlarge__Resource_tpl = new ExecutorFragment(Types._P2_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _P2_xlarge__Acceleratedcomputing = new ExecutorFragment(Types._P2_xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _P2_xlarge__MixinBase = new ExecutorFragment(Types._P2_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _P2_xlarge__OclAny = new ExecutorFragment(Types._P2_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _P2_xlarge__OclElement = new ExecutorFragment(Types._P2_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _P2_xlarge__P2_xlarge = new ExecutorFragment(Types._P2_xlarge, Ec2Tables.Types._P2_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _P2_xlarge__Resource_tpl = new ExecutorFragment(Types._P2_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _P3_16xlarge__Acceleratedcomputing = new ExecutorFragment(Types._P3_16xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _P3_16xlarge__MixinBase = new ExecutorFragment(Types._P3_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _P3_16xlarge__OclAny = new ExecutorFragment(Types._P3_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _P3_16xlarge__OclElement = new ExecutorFragment(Types._P3_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _P3_16xlarge__P3_16xlarge = new ExecutorFragment(Types._P3_16xlarge, Ec2Tables.Types._P3_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _P3_16xlarge__Resource_tpl = new ExecutorFragment(Types._P3_16xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _P3_2xlarge__Acceleratedcomputing = new ExecutorFragment(Types._P3_2xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _P3_2xlarge__MixinBase = new ExecutorFragment(Types._P3_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _P3_2xlarge__OclAny = new ExecutorFragment(Types._P3_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _P3_2xlarge__OclElement = new ExecutorFragment(Types._P3_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _P3_2xlarge__P3_2xlarge = new ExecutorFragment(Types._P3_2xlarge, Ec2Tables.Types._P3_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _P3_2xlarge__Resource_tpl = new ExecutorFragment(Types._P3_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _P3_8xlarge__Acceleratedcomputing = new ExecutorFragment(Types._P3_8xlarge, Ec2Tables.Types._Acceleratedcomputing);
		private static final /*@NonNull*/ ExecutorFragment _P3_8xlarge__MixinBase = new ExecutorFragment(Types._P3_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _P3_8xlarge__OclAny = new ExecutorFragment(Types._P3_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _P3_8xlarge__OclElement = new ExecutorFragment(Types._P3_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _P3_8xlarge__P3_8xlarge = new ExecutorFragment(Types._P3_8xlarge, Ec2Tables.Types._P3_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _P3_8xlarge__Resource_tpl = new ExecutorFragment(Types._P3_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Placementgroup__MixinBase = new ExecutorFragment(Types._Placementgroup, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Placementgroup__OclAny = new ExecutorFragment(Types._Placementgroup, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Placementgroup__OclElement = new ExecutorFragment(Types._Placementgroup, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Placementgroup__Placementgroup = new ExecutorFragment(Types._Placementgroup, Ec2Tables.Types._Placementgroup);

		private static final /*@NonNull*/ ExecutorFragment _R3_2xlarge__Memoryoptimized = new ExecutorFragment(Types._R3_2xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R3_2xlarge__MixinBase = new ExecutorFragment(Types._R3_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R3_2xlarge__OclAny = new ExecutorFragment(Types._R3_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R3_2xlarge__OclElement = new ExecutorFragment(Types._R3_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R3_2xlarge__R3_2xlarge = new ExecutorFragment(Types._R3_2xlarge, Ec2Tables.Types._R3_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R3_2xlarge__Resource_tpl = new ExecutorFragment(Types._R3_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R3_4xlarge__Memoryoptimized = new ExecutorFragment(Types._R3_4xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R3_4xlarge__MixinBase = new ExecutorFragment(Types._R3_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R3_4xlarge__OclAny = new ExecutorFragment(Types._R3_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R3_4xlarge__OclElement = new ExecutorFragment(Types._R3_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R3_4xlarge__R3_4xlarge = new ExecutorFragment(Types._R3_4xlarge, Ec2Tables.Types._R3_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R3_4xlarge__Resource_tpl = new ExecutorFragment(Types._R3_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R3_8xlarge__Memoryoptimized = new ExecutorFragment(Types._R3_8xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R3_8xlarge__MixinBase = new ExecutorFragment(Types._R3_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R3_8xlarge__OclAny = new ExecutorFragment(Types._R3_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R3_8xlarge__OclElement = new ExecutorFragment(Types._R3_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R3_8xlarge__R3_8xlarge = new ExecutorFragment(Types._R3_8xlarge, Ec2Tables.Types._R3_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R3_8xlarge__Resource_tpl = new ExecutorFragment(Types._R3_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R3_large__Memoryoptimized = new ExecutorFragment(Types._R3_large, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R3_large__MixinBase = new ExecutorFragment(Types._R3_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R3_large__OclAny = new ExecutorFragment(Types._R3_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R3_large__OclElement = new ExecutorFragment(Types._R3_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R3_large__R3_large = new ExecutorFragment(Types._R3_large, Ec2Tables.Types._R3_large);
		private static final /*@NonNull*/ ExecutorFragment _R3_large__Resource_tpl = new ExecutorFragment(Types._R3_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R3_xlarge__Memoryoptimized = new ExecutorFragment(Types._R3_xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R3_xlarge__MixinBase = new ExecutorFragment(Types._R3_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R3_xlarge__OclAny = new ExecutorFragment(Types._R3_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R3_xlarge__OclElement = new ExecutorFragment(Types._R3_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R3_xlarge__R3_xlarge = new ExecutorFragment(Types._R3_xlarge, Ec2Tables.Types._R3_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R3_xlarge__Resource_tpl = new ExecutorFragment(Types._R3_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R4_16xlarge__Memoryoptimized = new ExecutorFragment(Types._R4_16xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R4_16xlarge__MixinBase = new ExecutorFragment(Types._R4_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R4_16xlarge__OclAny = new ExecutorFragment(Types._R4_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R4_16xlarge__OclElement = new ExecutorFragment(Types._R4_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R4_16xlarge__R4_16xlarge = new ExecutorFragment(Types._R4_16xlarge, Ec2Tables.Types._R4_16xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R4_16xlarge__Resource_tpl = new ExecutorFragment(Types._R4_16xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R4_2xlarge__Memoryoptimized = new ExecutorFragment(Types._R4_2xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R4_2xlarge__MixinBase = new ExecutorFragment(Types._R4_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R4_2xlarge__OclAny = new ExecutorFragment(Types._R4_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R4_2xlarge__OclElement = new ExecutorFragment(Types._R4_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R4_2xlarge__R4_2xlarge = new ExecutorFragment(Types._R4_2xlarge, Ec2Tables.Types._R4_2xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R4_2xlarge__Resource_tpl = new ExecutorFragment(Types._R4_2xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R4_4xlarge__Memoryoptimized = new ExecutorFragment(Types._R4_4xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R4_4xlarge__MixinBase = new ExecutorFragment(Types._R4_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R4_4xlarge__OclAny = new ExecutorFragment(Types._R4_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R4_4xlarge__OclElement = new ExecutorFragment(Types._R4_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R4_4xlarge__R4_4xlarge = new ExecutorFragment(Types._R4_4xlarge, Ec2Tables.Types._R4_4xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R4_4xlarge__Resource_tpl = new ExecutorFragment(Types._R4_4xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R4_8xlarge__Memoryoptimized = new ExecutorFragment(Types._R4_8xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R4_8xlarge__MixinBase = new ExecutorFragment(Types._R4_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R4_8xlarge__OclAny = new ExecutorFragment(Types._R4_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R4_8xlarge__OclElement = new ExecutorFragment(Types._R4_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R4_8xlarge__R4_8xlarge = new ExecutorFragment(Types._R4_8xlarge, Ec2Tables.Types._R4_8xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R4_8xlarge__Resource_tpl = new ExecutorFragment(Types._R4_8xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R4_large__Memoryoptimized = new ExecutorFragment(Types._R4_large, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R4_large__MixinBase = new ExecutorFragment(Types._R4_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R4_large__OclAny = new ExecutorFragment(Types._R4_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R4_large__OclElement = new ExecutorFragment(Types._R4_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R4_large__R4_large = new ExecutorFragment(Types._R4_large, Ec2Tables.Types._R4_large);
		private static final /*@NonNull*/ ExecutorFragment _R4_large__Resource_tpl = new ExecutorFragment(Types._R4_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _R4_xlarge__Memoryoptimized = new ExecutorFragment(Types._R4_xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _R4_xlarge__MixinBase = new ExecutorFragment(Types._R4_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _R4_xlarge__OclAny = new ExecutorFragment(Types._R4_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _R4_xlarge__OclElement = new ExecutorFragment(Types._R4_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _R4_xlarge__R4_xlarge = new ExecutorFragment(Types._R4_xlarge, Ec2Tables.Types._R4_xlarge);
		private static final /*@NonNull*/ ExecutorFragment _R4_xlarge__Resource_tpl = new ExecutorFragment(Types._R4_xlarge, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Rootdevicevolume__MixinBase = new ExecutorFragment(Types._Rootdevicevolume, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Rootdevicevolume__OclAny = new ExecutorFragment(Types._Rootdevicevolume, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rootdevicevolume__OclElement = new ExecutorFragment(Types._Rootdevicevolume, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rootdevicevolume__Rootdevicevolume = new ExecutorFragment(Types._Rootdevicevolume, Ec2Tables.Types._Rootdevicevolume);

		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__MixinBase = new ExecutorFragment(Types._Sa_east_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__OclAny = new ExecutorFragment(Types._Sa_east_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__OclElement = new ExecutorFragment(Types._Sa_east_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__Sa_east_1 = new ExecutorFragment(Types._Sa_east_1, Ec2Tables.Types._Sa_east_1);

		private static final /*@NonNull*/ ExecutorFragment _Statustransitionreason__MixinBase = new ExecutorFragment(Types._Statustransitionreason, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Statustransitionreason__OclAny = new ExecutorFragment(Types._Statustransitionreason, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Statustransitionreason__OclElement = new ExecutorFragment(Types._Statustransitionreason, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Statustransitionreason__Statustransitionreason = new ExecutorFragment(Types._Statustransitionreason, Ec2Tables.Types._Statustransitionreason);

		private static final /*@NonNull*/ ExecutorFragment _Storageoptimized__MixinBase = new ExecutorFragment(Types._Storageoptimized, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Storageoptimized__OclAny = new ExecutorFragment(Types._Storageoptimized, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storageoptimized__OclElement = new ExecutorFragment(Types._Storageoptimized, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storageoptimized__Resource_tpl = new ExecutorFragment(Types._Storageoptimized, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Storageoptimized__Storageoptimized = new ExecutorFragment(Types._Storageoptimized, Ec2Tables.Types._Storageoptimized);

		private static final /*@NonNull*/ ExecutorFragment _T1_micro__Generalpurpose = new ExecutorFragment(Types._T1_micro, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T1_micro__MixinBase = new ExecutorFragment(Types._T1_micro, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T1_micro__OclAny = new ExecutorFragment(Types._T1_micro, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T1_micro__OclElement = new ExecutorFragment(Types._T1_micro, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T1_micro__Resource_tpl = new ExecutorFragment(Types._T1_micro, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T1_micro__T1_micro = new ExecutorFragment(Types._T1_micro, Ec2Tables.Types._T1_micro);

		private static final /*@NonNull*/ ExecutorFragment _T2_2xlarge__Generalpurpose = new ExecutorFragment(Types._T2_2xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T2_2xlarge__MixinBase = new ExecutorFragment(Types._T2_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T2_2xlarge__OclAny = new ExecutorFragment(Types._T2_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T2_2xlarge__OclElement = new ExecutorFragment(Types._T2_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T2_2xlarge__Resource_tpl = new ExecutorFragment(Types._T2_2xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T2_2xlarge__T2_2xlarge = new ExecutorFragment(Types._T2_2xlarge, Ec2Tables.Types._T2_2xlarge);

		private static final /*@NonNull*/ ExecutorFragment _T2_large__Generalpurpose = new ExecutorFragment(Types._T2_large, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T2_large__MixinBase = new ExecutorFragment(Types._T2_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T2_large__OclAny = new ExecutorFragment(Types._T2_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T2_large__OclElement = new ExecutorFragment(Types._T2_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T2_large__Resource_tpl = new ExecutorFragment(Types._T2_large, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T2_large__T2_large = new ExecutorFragment(Types._T2_large, Ec2Tables.Types._T2_large);

		private static final /*@NonNull*/ ExecutorFragment _T2_medium__Generalpurpose = new ExecutorFragment(Types._T2_medium, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T2_medium__MixinBase = new ExecutorFragment(Types._T2_medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T2_medium__OclAny = new ExecutorFragment(Types._T2_medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T2_medium__OclElement = new ExecutorFragment(Types._T2_medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T2_medium__Resource_tpl = new ExecutorFragment(Types._T2_medium, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T2_medium__T2_medium = new ExecutorFragment(Types._T2_medium, Ec2Tables.Types._T2_medium);

		private static final /*@NonNull*/ ExecutorFragment _T2_micro__Generalpurpose = new ExecutorFragment(Types._T2_micro, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T2_micro__MixinBase = new ExecutorFragment(Types._T2_micro, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T2_micro__OclAny = new ExecutorFragment(Types._T2_micro, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T2_micro__OclElement = new ExecutorFragment(Types._T2_micro, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T2_micro__Resource_tpl = new ExecutorFragment(Types._T2_micro, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T2_micro__T2_micro = new ExecutorFragment(Types._T2_micro, Ec2Tables.Types._T2_micro);

		private static final /*@NonNull*/ ExecutorFragment _T2_nano__Generalpurpose = new ExecutorFragment(Types._T2_nano, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T2_nano__MixinBase = new ExecutorFragment(Types._T2_nano, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T2_nano__OclAny = new ExecutorFragment(Types._T2_nano, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T2_nano__OclElement = new ExecutorFragment(Types._T2_nano, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T2_nano__Resource_tpl = new ExecutorFragment(Types._T2_nano, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T2_nano__T2_nano = new ExecutorFragment(Types._T2_nano, Ec2Tables.Types._T2_nano);

		private static final /*@NonNull*/ ExecutorFragment _T2_small__Generalpurpose = new ExecutorFragment(Types._T2_small, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T2_small__MixinBase = new ExecutorFragment(Types._T2_small, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T2_small__OclAny = new ExecutorFragment(Types._T2_small, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T2_small__OclElement = new ExecutorFragment(Types._T2_small, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T2_small__Resource_tpl = new ExecutorFragment(Types._T2_small, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T2_small__T2_small = new ExecutorFragment(Types._T2_small, Ec2Tables.Types._T2_small);

		private static final /*@NonNull*/ ExecutorFragment _T2_xlarge__Generalpurpose = new ExecutorFragment(Types._T2_xlarge, Ec2Tables.Types._Generalpurpose);
		private static final /*@NonNull*/ ExecutorFragment _T2_xlarge__MixinBase = new ExecutorFragment(Types._T2_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _T2_xlarge__OclAny = new ExecutorFragment(Types._T2_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _T2_xlarge__OclElement = new ExecutorFragment(Types._T2_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _T2_xlarge__Resource_tpl = new ExecutorFragment(Types._T2_xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _T2_xlarge__T2_xlarge = new ExecutorFragment(Types._T2_xlarge, Ec2Tables.Types._T2_xlarge);

		private static final /*@NonNull*/ ExecutorFragment _Tags__MixinBase = new ExecutorFragment(Types._Tags, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tags__OclAny = new ExecutorFragment(Types._Tags, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tags__OclElement = new ExecutorFragment(Types._Tags, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tags__Tags = new ExecutorFragment(Types._Tags, Ec2Tables.Types._Tags);

		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__MixinBase = new ExecutorFragment(Types._Us_east_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__OclAny = new ExecutorFragment(Types._Us_east_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__OclElement = new ExecutorFragment(Types._Us_east_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__Us_east_1 = new ExecutorFragment(Types._Us_east_1, Ec2Tables.Types._Us_east_1);

		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__MixinBase = new ExecutorFragment(Types._Us_east_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__OclAny = new ExecutorFragment(Types._Us_east_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__OclElement = new ExecutorFragment(Types._Us_east_2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__Us_east_2 = new ExecutorFragment(Types._Us_east_2, Ec2Tables.Types._Us_east_2);

		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__MixinBase = new ExecutorFragment(Types._Us_west_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__OclAny = new ExecutorFragment(Types._Us_west_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__OclElement = new ExecutorFragment(Types._Us_west_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__Us_west_1 = new ExecutorFragment(Types._Us_west_1, Ec2Tables.Types._Us_west_1);

		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__MixinBase = new ExecutorFragment(Types._Us_west_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__OclAny = new ExecutorFragment(Types._Us_west_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__OclElement = new ExecutorFragment(Types._Us_west_2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__Us_west_2 = new ExecutorFragment(Types._Us_west_2, Ec2Tables.Types._Us_west_2);

		private static final /*@NonNull*/ ExecutorFragment _VirtualizationType__OclAny = new ExecutorFragment(Types._VirtualizationType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VirtualizationType__OclElement = new ExecutorFragment(Types._VirtualizationType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VirtualizationType__OclEnumeration = new ExecutorFragment(Types._VirtualizationType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _VirtualizationType__OclType = new ExecutorFragment(Types._VirtualizationType, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _VirtualizationType__VirtualizationType = new ExecutorFragment(Types._VirtualizationType, Ec2Tables.Types._VirtualizationType);

		private static final /*@NonNull*/ ExecutorFragment _X1_16xlarge__Memoryoptimized = new ExecutorFragment(Types._X1_16xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1_16xlarge__MixinBase = new ExecutorFragment(Types._X1_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1_16xlarge__OclAny = new ExecutorFragment(Types._X1_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1_16xlarge__OclElement = new ExecutorFragment(Types._X1_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1_16xlarge__Resource_tpl = new ExecutorFragment(Types._X1_16xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1_16xlarge__X1_16xlarge = new ExecutorFragment(Types._X1_16xlarge, Ec2Tables.Types._X1_16xlarge);

		private static final /*@NonNull*/ ExecutorFragment _X1_32xlarge__Memoryoptimized = new ExecutorFragment(Types._X1_32xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1_32xlarge__MixinBase = new ExecutorFragment(Types._X1_32xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1_32xlarge__OclAny = new ExecutorFragment(Types._X1_32xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1_32xlarge__OclElement = new ExecutorFragment(Types._X1_32xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1_32xlarge__Resource_tpl = new ExecutorFragment(Types._X1_32xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1_32xlarge__X1_32xlarge = new ExecutorFragment(Types._X1_32xlarge, Ec2Tables.Types._X1_32xlarge);

		private static final /*@NonNull*/ ExecutorFragment _X1e_16xlarge__Memoryoptimized = new ExecutorFragment(Types._X1e_16xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1e_16xlarge__MixinBase = new ExecutorFragment(Types._X1e_16xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1e_16xlarge__OclAny = new ExecutorFragment(Types._X1e_16xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1e_16xlarge__OclElement = new ExecutorFragment(Types._X1e_16xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1e_16xlarge__Resource_tpl = new ExecutorFragment(Types._X1e_16xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1e_16xlarge__X1e_16xlarge = new ExecutorFragment(Types._X1e_16xlarge, Ec2Tables.Types._X1e_16xlarge);

		private static final /*@NonNull*/ ExecutorFragment _X1e_2xlarge__Memoryoptimized = new ExecutorFragment(Types._X1e_2xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1e_2xlarge__MixinBase = new ExecutorFragment(Types._X1e_2xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1e_2xlarge__OclAny = new ExecutorFragment(Types._X1e_2xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1e_2xlarge__OclElement = new ExecutorFragment(Types._X1e_2xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1e_2xlarge__Resource_tpl = new ExecutorFragment(Types._X1e_2xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1e_2xlarge__X1e_2xlarge = new ExecutorFragment(Types._X1e_2xlarge, Ec2Tables.Types._X1e_2xlarge);

		private static final /*@NonNull*/ ExecutorFragment _X1e_32xlarge__Memoryoptimized = new ExecutorFragment(Types._X1e_32xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1e_32xlarge__MixinBase = new ExecutorFragment(Types._X1e_32xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1e_32xlarge__OclAny = new ExecutorFragment(Types._X1e_32xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1e_32xlarge__OclElement = new ExecutorFragment(Types._X1e_32xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1e_32xlarge__Resource_tpl = new ExecutorFragment(Types._X1e_32xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1e_32xlarge__X1e_32xlarge = new ExecutorFragment(Types._X1e_32xlarge, Ec2Tables.Types._X1e_32xlarge);

		private static final /*@NonNull*/ ExecutorFragment _X1e_4xlarge__Memoryoptimized = new ExecutorFragment(Types._X1e_4xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1e_4xlarge__MixinBase = new ExecutorFragment(Types._X1e_4xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1e_4xlarge__OclAny = new ExecutorFragment(Types._X1e_4xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1e_4xlarge__OclElement = new ExecutorFragment(Types._X1e_4xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1e_4xlarge__Resource_tpl = new ExecutorFragment(Types._X1e_4xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1e_4xlarge__X1e_4xlarge = new ExecutorFragment(Types._X1e_4xlarge, Ec2Tables.Types._X1e_4xlarge);

		private static final /*@NonNull*/ ExecutorFragment _X1e_8xlarge__Memoryoptimized = new ExecutorFragment(Types._X1e_8xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1e_8xlarge__MixinBase = new ExecutorFragment(Types._X1e_8xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1e_8xlarge__OclAny = new ExecutorFragment(Types._X1e_8xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1e_8xlarge__OclElement = new ExecutorFragment(Types._X1e_8xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1e_8xlarge__Resource_tpl = new ExecutorFragment(Types._X1e_8xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1e_8xlarge__X1e_8xlarge = new ExecutorFragment(Types._X1e_8xlarge, Ec2Tables.Types._X1e_8xlarge);

		private static final /*@NonNull*/ ExecutorFragment _X1e_xlarge__Memoryoptimized = new ExecutorFragment(Types._X1e_xlarge, Ec2Tables.Types._Memoryoptimized);
		private static final /*@NonNull*/ ExecutorFragment _X1e_xlarge__MixinBase = new ExecutorFragment(Types._X1e_xlarge, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _X1e_xlarge__OclAny = new ExecutorFragment(Types._X1e_xlarge, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _X1e_xlarge__OclElement = new ExecutorFragment(Types._X1e_xlarge, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _X1e_xlarge__Resource_tpl = new ExecutorFragment(Types._X1e_xlarge, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _X1e_xlarge__X1e_xlarge = new ExecutorFragment(Types._X1e_xlarge, Ec2Tables.Types._X1e_xlarge);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::Fragments and all preceding sub-packages.
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

		public static final /*@NonNull*/ ParameterTypes _RestartMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._RestartMethod);
		public static final /*@NonNull*/ ParameterTypes _StopMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._StopMethod);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Instanceec2__restart = new ExecutorOperation("restart", Parameters._RestartMethod, Types._Instanceec2,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Instanceec2__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Instanceec2,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Instanceec2__stop = new ExecutorOperation("stop", Parameters._StopMethod, Types._Instanceec2,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Instanceec2__terminate = new ExecutorOperation("terminate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Instanceec2,
			3, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__city = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_1__CITY, Types._Ap_northeast_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__country = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_1__COUNTRY, Types._Ap_northeast_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_1__REGION_ID, Types._Ap_northeast_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_1__REGION_NAME, Types._Ap_northeast_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__city = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_2__CITY, Types._Ap_northeast_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__country = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_2__COUNTRY, Types._Ap_northeast_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__regionId = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_2__REGION_ID, Types._Ap_northeast_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__regionName = new EcoreExecutorProperty(Ec2Package.Literals.AP_NORTHEAST_2__REGION_NAME, Types._Ap_northeast_2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__city = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_1__CITY, Types._Ap_south_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__country = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_1__COUNTRY, Types._Ap_south_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_1__REGION_ID, Types._Ap_south_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_1__REGION_NAME, Types._Ap_south_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__city = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_EAST2__CITY, Types._Ap_south_east2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__country = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_EAST2__COUNTRY, Types._Ap_south_east2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__regionId = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_EAST2__REGION_ID, Types._Ap_south_east2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__regionName = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTH_EAST2__REGION_NAME, Types._Ap_south_east2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__city = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTHEAST_1__CITY, Types._Ap_southeast_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__country = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTHEAST_1__COUNTRY, Types._Ap_southeast_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTHEAST_1__REGION_ID, Types._Ap_southeast_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.AP_SOUTHEAST_1__REGION_NAME, Types._Ap_southeast_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _C1_medium__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C1_MEDIUM__INSTANCE_TYPE, Types._C1_medium, 0);
		public static final /*@NonNull*/ ExecutorProperty _C1_medium__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C1_MEDIUM__OCCI_COMPUTE_CORES, Types._C1_medium, 1);
		public static final /*@NonNull*/ ExecutorProperty _C1_medium__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.C1_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._C1_medium, 2);
		public static final /*@NonNull*/ ExecutorProperty _C1_medium__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C1_MEDIUM__OCCI_COMPUTE_MEMORY, Types._C1_medium, 3);

		public static final /*@NonNull*/ ExecutorProperty _C1_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C1_XLARGE__INSTANCE_TYPE, Types._C1_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C1_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C1_XLARGE__OCCI_COMPUTE_CORES, Types._C1_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C1_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.C1_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._C1_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _C1_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C1_XLARGE__OCCI_COMPUTE_MEMORY, Types._C1_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _C3_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C3_2XLARGE__INSTANCE_TYPE, Types._C3_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C3_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C3_2XLARGE__OCCI_COMPUTE_CORES, Types._C3_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C3_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.C3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._C3_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _C3_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C3_2XLARGE__OCCI_COMPUTE_MEMORY, Types._C3_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _C3_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C3_4XLARGE__INSTANCE_TYPE, Types._C3_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C3_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C3_4XLARGE__OCCI_COMPUTE_CORES, Types._C3_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C3_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.C3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._C3_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _C3_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C3_4XLARGE__OCCI_COMPUTE_MEMORY, Types._C3_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _C3_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C3_8XLARGE__INSTANCE_TYPE, Types._C3_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C3_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C3_8XLARGE__OCCI_COMPUTE_CORES, Types._C3_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C3_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.C3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._C3_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _C3_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C3_8XLARGE__OCCI_COMPUTE_MEMORY, Types._C3_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _C3_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C3_LARGE__INSTANCE_TYPE, Types._C3_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _C3_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C3_LARGE__OCCI_COMPUTE_CORES, Types._C3_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _C3_large__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.C3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._C3_large, 2);
		public static final /*@NonNull*/ ExecutorProperty _C3_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C3_LARGE__OCCI_COMPUTE_MEMORY, Types._C3_large, 3);

		public static final /*@NonNull*/ ExecutorProperty _C3_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C3_XLARGE__INSTANCE_TYPE, Types._C3_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C3_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C3_XLARGE__OCCI_COMPUTE_CORES, Types._C3_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C3_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.C3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._C3_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _C3_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C3_XLARGE__OCCI_COMPUTE_MEMORY, Types._C3_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _C4_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C4_2XLARGE__INSTANCE_TYPE, Types._C4_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C4_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C4_2XLARGE__OCCI_COMPUTE_CORES, Types._C4_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C4_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C4_2XLARGE__OCCI_COMPUTE_MEMORY, Types._C4_2xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C4_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C4_4XLARGE__INSTANCE_TYPE, Types._C4_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C4_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C4_4XLARGE__OCCI_COMPUTE_CORES, Types._C4_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C4_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C4_4XLARGE__OCCI_COMPUTE_MEMORY, Types._C4_4xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C4_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C4_8XLARGE__INSTANCE_TYPE, Types._C4_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C4_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C4_8XLARGE__OCCI_COMPUTE_CORES, Types._C4_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C4_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C4_8XLARGE__OCCI_COMPUTE_MEMORY, Types._C4_8xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C4_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C4_LARGE__INSTANCE_TYPE, Types._C4_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _C4_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C4_LARGE__OCCI_COMPUTE_CORES, Types._C4_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _C4_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C4_LARGE__OCCI_COMPUTE_MEMORY, Types._C4_large, 2);

		public static final /*@NonNull*/ ExecutorProperty _C4_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C4_XLARGE__INSTANCE_TYPE, Types._C4_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C4_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C4_XLARGE__OCCI_COMPUTE_CORES, Types._C4_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C4_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C4_XLARGE__OCCI_COMPUTE_MEMORY, Types._C4_xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C5_18xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C5_18XLARGE__INSTANCE_TYPE, Types._C5_18xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C5_18xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C5_18XLARGE__OCCI_COMPUTE_CORES, Types._C5_18xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C5_18xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C5_18XLARGE__OCCI_COMPUTE_MEMORY, Types._C5_18xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C5_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C5_2XLARGE__INSTANCE_TYPE, Types._C5_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C5_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C5_2XLARGE__OCCI_COMPUTE_CORES, Types._C5_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C5_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C5_2XLARGE__OCCI_COMPUTE_MEMORY, Types._C5_2xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C5_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C5_4XLARGE__INSTANCE_TYPE, Types._C5_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C5_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C5_4XLARGE__OCCI_COMPUTE_CORES, Types._C5_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C5_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C5_4XLARGE__OCCI_COMPUTE_MEMORY, Types._C5_4xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C5_9xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C5_9XLARGE__INSTANCE_TYPE, Types._C5_9xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C5_9xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C5_9XLARGE__OCCI_COMPUTE_CORES, Types._C5_9xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C5_9xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C5_9XLARGE__OCCI_COMPUTE_MEMORY, Types._C5_9xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _C5_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C5_LARGE__INSTANCE_TYPE, Types._C5_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _C5_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C5_LARGE__OCCI_COMPUTE_CORES, Types._C5_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _C5_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C5_LARGE__OCCI_COMPUTE_MEMORY, Types._C5_large, 2);

		public static final /*@NonNull*/ ExecutorProperty _C5_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.C5_XLARGE__INSTANCE_TYPE, Types._C5_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _C5_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.C5_XLARGE__OCCI_COMPUTE_CORES, Types._C5_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _C5_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.C5_XLARGE__OCCI_COMPUTE_MEMORY, Types._C5_xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__city = new EcoreExecutorProperty(Ec2Package.Literals.CA_CENTRAL_1__CITY, Types._Ca_central_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__country = new EcoreExecutorProperty(Ec2Package.Literals.CA_CENTRAL_1__COUNTRY, Types._Ca_central_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.CA_CENTRAL_1__REGION_ID, Types._Ca_central_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.CA_CENTRAL_1__REGION_NAME, Types._Ca_central_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Cc2_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.CC2_8XLARGE__INSTANCE_TYPE, Types._Cc2_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cc2_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.CC2_8XLARGE__OCCI_COMPUTE_CORES, Types._Cc2_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _Cc2_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Cc2_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _Cc2_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.CC2_8XLARGE__OCCI_COMPUTE_MEMORY, Types._Cc2_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _Cg1_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.CG1_4XLARGE__INSTANCE_TYPE, Types._Cg1_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cg1_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.CG1_4XLARGE__OCCI_COMPUTE_CORES, Types._Cg1_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _Cg1_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.CG1_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Cg1_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _Cg1_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.CG1_4XLARGE__OCCI_COMPUTE_MEMORY, Types._Cg1_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _Cr1_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.CR1_8XLARGE__INSTANCE_TYPE, Types._Cr1_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cr1_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.CR1_8XLARGE__OCCI_COMPUTE_CORES, Types._Cr1_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _Cr1_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.CR1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Cr1_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _Cr1_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.CR1_8XLARGE__OCCI_COMPUTE_MEMORY, Types._Cr1_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _D2_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.D2_2XLARGE__INSTANCE_TYPE, Types._D2_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _D2_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.D2_2XLARGE__OCCI_COMPUTE_CORES, Types._D2_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _D2_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.D2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._D2_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _D2_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.D2_2XLARGE__OCCI_COMPUTE_MEMORY, Types._D2_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _D2_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.D2_4XLARGE__INSTANCE_TYPE, Types._D2_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _D2_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.D2_4XLARGE__OCCI_COMPUTE_CORES, Types._D2_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _D2_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.D2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._D2_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _D2_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.D2_4XLARGE__OCCI_COMPUTE_MEMORY, Types._D2_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _D2_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.D2_8XLARGE__INSTANCE_TYPE, Types._D2_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _D2_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.D2_8XLARGE__OCCI_COMPUTE_CORES, Types._D2_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _D2_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.D2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._D2_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _D2_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.D2_8XLARGE__OCCI_COMPUTE_MEMORY, Types._D2_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _D2_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.D2_XLARGE__INSTANCE_TYPE, Types._D2_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _D2_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.D2_XLARGE__OCCI_COMPUTE_CORES, Types._D2_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _D2_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.D2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._D2_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _D2_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.D2_XLARGE__OCCI_COMPUTE_MEMORY, Types._D2_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__city = new EcoreExecutorProperty(Ec2Package.Literals.EU_CENTRAL_1__CITY, Types._Eu_central_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__country = new EcoreExecutorProperty(Ec2Package.Literals.EU_CENTRAL_1__COUNTRY, Types._Eu_central_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.EU_CENTRAL_1__REGION_ID, Types._Eu_central_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.EU_CENTRAL_1__REGION_NAME, Types._Eu_central_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__city = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_1__CITY, Types._Eu_west_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__country = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_1__COUNTRY, Types._Eu_west_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_1__REGION_ID, Types._Eu_west_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_1__REGION_NAME, Types._Eu_west_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__city = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_2__CITY, Types._Eu_west_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__country = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_2__COUNTRY, Types._Eu_west_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__regionId = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_2__REGION_ID, Types._Eu_west_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__regionName = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_2__REGION_NAME, Types._Eu_west_2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__city = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_3__CITY, Types._Eu_west_3, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__country = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_3__COUNTRY, Types._Eu_west_3, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__regionId = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_3__REGION_ID, Types._Eu_west_3, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__regionName = new EcoreExecutorProperty(Ec2Package.Literals.EU_WEST_3__REGION_NAME, Types._Eu_west_3, 3);

		public static final /*@NonNull*/ ExecutorProperty _F1_16xlarge__fpga = new EcoreExecutorProperty(Ec2Package.Literals.F1_16XLARGE__FPGA, Types._F1_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _F1_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.F1_16XLARGE__INSTANCE_TYPE, Types._F1_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _F1_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.F1_16XLARGE__OCCI_COMPUTE_CORES, Types._F1_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _F1_16xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.F1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._F1_16xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _F1_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.F1_16XLARGE__OCCI_COMPUTE_MEMORY, Types._F1_16xlarge, 4);

		public static final /*@NonNull*/ ExecutorProperty _F1_2xlarge__fpga = new EcoreExecutorProperty(Ec2Package.Literals.F1_2XLARGE__FPGA, Types._F1_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _F1_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.F1_2XLARGE__INSTANCE_TYPE, Types._F1_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _F1_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.F1_2XLARGE__OCCI_COMPUTE_CORES, Types._F1_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _F1_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.F1_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._F1_2xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _F1_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.F1_2XLARGE__OCCI_COMPUTE_MEMORY, Types._F1_2xlarge, 4);

		public static final /*@NonNull*/ ExecutorProperty _G2_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.G2_2XLARGE__INSTANCE_TYPE, Types._G2_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _G2_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.G2_2XLARGE__OCCI_COMPUTE_CORES, Types._G2_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _G2_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.G2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._G2_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _G2_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.G2_2XLARGE__OCCI_COMPUTE_MEMORY, Types._G2_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _G2_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.G2_8XLARGE__INSTANCE_TYPE, Types._G2_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _G2_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.G2_8XLARGE__OCCI_COMPUTE_CORES, Types._G2_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _G2_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.G2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._G2_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _G2_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.G2_8XLARGE__OCCI_COMPUTE_MEMORY, Types._G2_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _G3_16xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.G3_16XLARGE__GPU_MEMORY, Types._G3_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _G3_16xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.G3_16XLARGE__GPUS, Types._G3_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _G3_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.G3_16XLARGE__INSTANCE_TYPE, Types._G3_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _G3_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.G3_16XLARGE__OCCI_COMPUTE_CORES, Types._G3_16xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _G3_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.G3_16XLARGE__OCCI_COMPUTE_MEMORY, Types._G3_16xlarge, 4);

		public static final /*@NonNull*/ ExecutorProperty _G3_4xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.G3_4XLARGE__GPU_MEMORY, Types._G3_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _G3_4xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.G3_4XLARGE__GPUS, Types._G3_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _G3_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.G3_4XLARGE__INSTANCE_TYPE, Types._G3_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _G3_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.G3_4XLARGE__OCCI_COMPUTE_CORES, Types._G3_4xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _G3_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.G3_4XLARGE__OCCI_COMPUTE_MEMORY, Types._G3_4xlarge, 4);

		public static final /*@NonNull*/ ExecutorProperty _G3_8xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.G3_8XLARGE__GPU_MEMORY, Types._G3_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _G3_8xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.G3_8XLARGE__GPUS, Types._G3_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _G3_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.G3_8XLARGE__INSTANCE_TYPE, Types._G3_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _G3_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.G3_8XLARGE__OCCI_COMPUTE_CORES, Types._G3_8xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _G3_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.G3_8XLARGE__OCCI_COMPUTE_MEMORY, Types._G3_8xlarge, 4);

		public static final /*@NonNull*/ ExecutorProperty _H1_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.H1_16XLARGE__INSTANCE_TYPE, Types._H1_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _H1_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.H1_16XLARGE__OCCI_COMPUTE_CORES, Types._H1_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _H1_16xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.H1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._H1_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _H1_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.H1_16XLARGE__OCCI_COMPUTE_MEMORY, Types._H1_16xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _H1_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.H1_2XLARGE__INSTANCE_TYPE, Types._H1_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _H1_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.H1_2XLARGE__OCCI_COMPUTE_CORES, Types._H1_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _H1_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.H1_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._H1_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _H1_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.H1_2XLARGE__OCCI_COMPUTE_MEMORY, Types._H1_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _H1_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.H1_4XLARGE__INSTANCE_TYPE, Types._H1_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _H1_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.H1_4XLARGE__OCCI_COMPUTE_CORES, Types._H1_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _H1_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.H1_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._H1_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _H1_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.H1_4XLARGE__OCCI_COMPUTE_MEMORY, Types._H1_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _H1_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.H1_8XLARGE__INSTANCE_TYPE, Types._H1_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _H1_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.H1_8XLARGE__OCCI_COMPUTE_CORES, Types._H1_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _H1_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.H1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._H1_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _H1_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.H1_8XLARGE__OCCI_COMPUTE_MEMORY, Types._H1_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _Hs1_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.HS1_8XLARGE__INSTANCE_TYPE, Types._Hs1_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _Hs1_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.HS1_8XLARGE__OCCI_COMPUTE_CORES, Types._Hs1_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _Hs1_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.HS1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Hs1_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _Hs1_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.HS1_8XLARGE__OCCI_COMPUTE_MEMORY, Types._Hs1_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I2_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I2_2XLARGE__INSTANCE_TYPE, Types._I2_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I2_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I2_2XLARGE__OCCI_COMPUTE_CORES, Types._I2_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I2_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I2_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I2_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I2_2XLARGE__OCCI_COMPUTE_MEMORY, Types._I2_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I2_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I2_4XLARGE__INSTANCE_TYPE, Types._I2_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I2_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I2_4XLARGE__OCCI_COMPUTE_CORES, Types._I2_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I2_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I2_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I2_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I2_4XLARGE__OCCI_COMPUTE_MEMORY, Types._I2_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I2_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I2_8XLARGE__INSTANCE_TYPE, Types._I2_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I2_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I2_8XLARGE__OCCI_COMPUTE_CORES, Types._I2_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I2_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I2_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I2_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I2_8XLARGE__OCCI_COMPUTE_MEMORY, Types._I2_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I2_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I2_XLARGE__INSTANCE_TYPE, Types._I2_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I2_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I2_XLARGE__OCCI_COMPUTE_CORES, Types._I2_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I2_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I2_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I2_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I2_XLARGE__OCCI_COMPUTE_MEMORY, Types._I2_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I3_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I3_16XLARGE__INSTANCE_TYPE, Types._I3_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I3_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I3_16XLARGE__OCCI_COMPUTE_CORES, Types._I3_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I3_16xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I3_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I3_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I3_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I3_16XLARGE__OCCI_COMPUTE_MEMORY, Types._I3_16xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I3_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I3_2XLARGE__INSTANCE_TYPE, Types._I3_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I3_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I3_2XLARGE__OCCI_COMPUTE_CORES, Types._I3_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I3_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I3_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I3_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I3_2XLARGE__OCCI_COMPUTE_MEMORY, Types._I3_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I3_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I3_4XLARGE__INSTANCE_TYPE, Types._I3_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I3_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I3_4XLARGE__OCCI_COMPUTE_CORES, Types._I3_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I3_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I3_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I3_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I3_4XLARGE__OCCI_COMPUTE_MEMORY, Types._I3_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I3_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I3_8XLARGE__INSTANCE_TYPE, Types._I3_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I3_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I3_8XLARGE__OCCI_COMPUTE_CORES, Types._I3_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I3_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I3_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I3_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I3_8XLARGE__OCCI_COMPUTE_MEMORY, Types._I3_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _I3_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I3_LARGE__INSTANCE_TYPE, Types._I3_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _I3_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I3_LARGE__OCCI_COMPUTE_CORES, Types._I3_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _I3_large__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I3_large, 2);
		public static final /*@NonNull*/ ExecutorProperty _I3_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I3_LARGE__OCCI_COMPUTE_MEMORY, Types._I3_large, 3);

		public static final /*@NonNull*/ ExecutorProperty _I3_metal__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I3_METAL__INSTANCE_TYPE, Types._I3_metal, 0);
		public static final /*@NonNull*/ ExecutorProperty _I3_metal__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I3_METAL__OCCI_COMPUTE_CORES, Types._I3_metal, 1);
		public static final /*@NonNull*/ ExecutorProperty _I3_metal__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I3_METAL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I3_metal, 2);
		public static final /*@NonNull*/ ExecutorProperty _I3_metal__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I3_METAL__OCCI_COMPUTE_MEMORY, Types._I3_metal, 3);

		public static final /*@NonNull*/ ExecutorProperty _I3_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.I3_XLARGE__INSTANCE_TYPE, Types._I3_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _I3_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.I3_XLARGE__OCCI_COMPUTE_CORES, Types._I3_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _I3_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.I3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._I3_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _I3_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.I3_XLARGE__OCCI_COMPUTE_MEMORY, Types._I3_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__amiLaunchIndex = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__AMI_LAUNCH_INDEX, Types._Instanceec2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__awsInstanceStatus = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__AWS_INSTANCE_STATUS, Types._Instanceec2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__ebsOptimizedIO = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__EBS_OPTIMIZED_IO, Types._Instanceec2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__enaSupport = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__ENA_SUPPORT, Types._Instanceec2, 3);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__hypervisor = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__HYPERVISOR, Types._Instanceec2, 4);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__imageId = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__IMAGE_ID, Types._Instanceec2, 5);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__instanceId = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__INSTANCE_ID, Types._Instanceec2, 6);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__instanceLifeCycle = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__INSTANCE_LIFE_CYCLE, Types._Instanceec2, 7);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__INSTANCE_TYPE, Types._Instanceec2, 8);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__kernelId = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__KERNEL_ID, Types._Instanceec2, 9);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__keyPairName = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__KEY_PAIR_NAME, Types._Instanceec2, 10);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__launchTime = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__LAUNCH_TIME, Types._Instanceec2, 11);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__monitoringState = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__MONITORING_STATE, Types._Instanceec2, 12);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__name = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__NAME, Types._Instanceec2, 13);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__platform = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__PLATFORM, Types._Instanceec2, 14);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__privateDNSName = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__PRIVATE_DNS_NAME, Types._Instanceec2, 15);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__privateIpV4Address = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__PRIVATE_IP_V4_ADDRESS, Types._Instanceec2, 16);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__publicDNSName = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__PUBLIC_DNS_NAME, Types._Instanceec2, 17);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__publicIpv4Address = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__PUBLIC_IPV4_ADDRESS, Types._Instanceec2, 18);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__ramDiskId = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__RAM_DISK_ID, Types._Instanceec2, 19);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__regionId = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__REGION_ID, Types._Instanceec2, 20);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__sriovNetSupport = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__SRIOV_NET_SUPPORT, Types._Instanceec2, 21);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__virtualizationType = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__VIRTUALIZATION_TYPE, Types._Instanceec2, 22);
		public static final /*@NonNull*/ ExecutorProperty _Instanceec2__zoneName = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEEC2__ZONE_NAME, Types._Instanceec2, 23);

		public static final /*@NonNull*/ ExecutorProperty _Instancevpcinfo__sourceDestCheck = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEVPCINFO__SOURCE_DEST_CHECK, Types._Instancevpcinfo, 0);
		public static final /*@NonNull*/ ExecutorProperty _Instancevpcinfo__subnetId = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEVPCINFO__SUBNET_ID, Types._Instancevpcinfo, 1);
		public static final /*@NonNull*/ ExecutorProperty _Instancevpcinfo__vpcId = new EcoreExecutorProperty(Ec2Package.Literals.INSTANCEVPCINFO__VPC_ID, Types._Instancevpcinfo, 2);

		public static final /*@NonNull*/ ExecutorProperty _M1_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M1_LARGE__INSTANCE_TYPE, Types._M1_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _M1_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M1_LARGE__OCCI_COMPUTE_CORES, Types._M1_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _M1_large__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M1_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M1_large, 2);
		public static final /*@NonNull*/ ExecutorProperty _M1_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M1_LARGE__OCCI_COMPUTE_MEMORY, Types._M1_large, 3);

		public static final /*@NonNull*/ ExecutorProperty _M1_medium__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M1_MEDIUM__INSTANCE_TYPE, Types._M1_medium, 0);
		public static final /*@NonNull*/ ExecutorProperty _M1_medium__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M1_MEDIUM__OCCI_COMPUTE_CORES, Types._M1_medium, 1);
		public static final /*@NonNull*/ ExecutorProperty _M1_medium__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M1_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M1_medium, 2);
		public static final /*@NonNull*/ ExecutorProperty _M1_medium__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M1_MEDIUM__OCCI_COMPUTE_MEMORY, Types._M1_medium, 3);

		public static final /*@NonNull*/ ExecutorProperty _M1_small__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M1_SMALL__INSTANCE_TYPE, Types._M1_small, 0);
		public static final /*@NonNull*/ ExecutorProperty _M1_small__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M1_SMALL__OCCI_COMPUTE_CORES, Types._M1_small, 1);
		public static final /*@NonNull*/ ExecutorProperty _M1_small__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M1_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M1_small, 2);
		public static final /*@NonNull*/ ExecutorProperty _M1_small__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M1_SMALL__OCCI_COMPUTE_MEMORY, Types._M1_small, 3);

		public static final /*@NonNull*/ ExecutorProperty _M1_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M1_XLARGE__INSTANCE_TYPE, Types._M1_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M1_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M1_XLARGE__OCCI_COMPUTE_CORES, Types._M1_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M1_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M1_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M1_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _M1_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M1_XLARGE__OCCI_COMPUTE_MEMORY, Types._M1_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _M2_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M2_2XLARGE__INSTANCE_TYPE, Types._M2_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M2_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M2_2XLARGE__OCCI_COMPUTE_CORES, Types._M2_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M2_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M2_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _M2_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M2_2XLARGE__OCCI_COMPUTE_MEMORY, Types._M2_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _M2_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M2_4XLARGE__INSTANCE_TYPE, Types._M2_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M2_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M2_4XLARGE__OCCI_COMPUTE_CORES, Types._M2_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M2_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M2_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _M2_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M2_4XLARGE__OCCI_COMPUTE_MEMORY, Types._M2_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _M2_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M2_XLARGE__INSTANCE_TYPE, Types._M2_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M2_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M2_XLARGE__OCCI_COMPUTE_CORES, Types._M2_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M2_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M2_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _M2_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M2_XLARGE__OCCI_COMPUTE_MEMORY, Types._M2_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _M3_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M3_2XLARGE__INSTANCE_TYPE, Types._M3_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M3_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M3_2XLARGE__OCCI_COMPUTE_CORES, Types._M3_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M3_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M3_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _M3_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M3_2XLARGE__OCCI_COMPUTE_MEMORY, Types._M3_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _M3_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M3_LARGE__INSTANCE_TYPE, Types._M3_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _M3_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M3_LARGE__OCCI_COMPUTE_CORES, Types._M3_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _M3_large__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M3_large, 2);
		public static final /*@NonNull*/ ExecutorProperty _M3_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M3_LARGE__OCCI_COMPUTE_MEMORY, Types._M3_large, 3);

		public static final /*@NonNull*/ ExecutorProperty _M3_medium__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M3_MEDIUM__INSTANCE_TYPE, Types._M3_medium, 0);
		public static final /*@NonNull*/ ExecutorProperty _M3_medium__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M3_MEDIUM__OCCI_COMPUTE_CORES, Types._M3_medium, 1);
		public static final /*@NonNull*/ ExecutorProperty _M3_medium__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M3_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M3_medium, 2);
		public static final /*@NonNull*/ ExecutorProperty _M3_medium__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M3_MEDIUM__OCCI_COMPUTE_MEMORY, Types._M3_medium, 3);

		public static final /*@NonNull*/ ExecutorProperty _M3_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M3_XLARGE__INSTANCE_TYPE, Types._M3_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M3_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M3_XLARGE__OCCI_COMPUTE_CORES, Types._M3_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M3_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.M3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._M3_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _M3_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M3_XLARGE__OCCI_COMPUTE_MEMORY, Types._M3_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _M4_10xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M4_10XLARGE__INSTANCE_TYPE, Types._M4_10xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M4_10xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M4_10XLARGE__OCCI_COMPUTE_CORES, Types._M4_10xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M4_10xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M4_10XLARGE__OCCI_COMPUTE_MEMORY, Types._M4_10xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M4_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M4_16XLARGE__INSTANCE_TYPE, Types._M4_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M4_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M4_16XLARGE__OCCI_COMPUTE_CORES, Types._M4_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M4_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M4_16XLARGE__OCCI_COMPUTE_MEMORY, Types._M4_16xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M4_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M4_2XLARGE__INSTANCE_TYPE, Types._M4_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M4_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M4_2XLARGE__OCCI_COMPUTE_CORES, Types._M4_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M4_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M4_2XLARGE__OCCI_COMPUTE_MEMORY, Types._M4_2xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M4_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M4_LARGE__INSTANCE_TYPE, Types._M4_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _M4_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M4_LARGE__OCCI_COMPUTE_CORES, Types._M4_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _M4_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M4_LARGE__OCCI_COMPUTE_MEMORY, Types._M4_large, 2);

		public static final /*@NonNull*/ ExecutorProperty _M4_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M4_XLARGE__INSTANCE_TYPE, Types._M4_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M4_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M4_XLARGE__OCCI_COMPUTE_CORES, Types._M4_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M4_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M4_XLARGE__OCCI_COMPUTE_MEMORY, Types._M4_xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M5_12xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M5_12XLARGE__INSTANCE_TYPE, Types._M5_12xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M5_12xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M5_12XLARGE__OCCI_COMPUTE_CORES, Types._M5_12xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M5_12xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M5_12XLARGE__OCCI_COMPUTE_MEMORY, Types._M5_12xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M5_24xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M5_24XLARGE__INSTANCE_TYPE, Types._M5_24xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M5_24xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M5_24XLARGE__OCCI_COMPUTE_CORES, Types._M5_24xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M5_24xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M5_24XLARGE__OCCI_COMPUTE_MEMORY, Types._M5_24xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M5_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M5_2XLARGE__INSTANCE_TYPE, Types._M5_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M5_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M5_2XLARGE__OCCI_COMPUTE_CORES, Types._M5_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M5_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M5_2XLARGE__OCCI_COMPUTE_MEMORY, Types._M5_2xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M5_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M5_4XLARGE__INSTANCE_TYPE, Types._M5_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M5_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M5_4XLARGE__OCCI_COMPUTE_CORES, Types._M5_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M5_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M5_4XLARGE__OCCI_COMPUTE_MEMORY, Types._M5_4xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _M5_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M5_LARGE__INSTANCE_TYPE, Types._M5_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _M5_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M5_LARGE__OCCI_COMPUTE_CORES, Types._M5_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _M5_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M5_LARGE__OCCI_COMPUTE_MEMORY, Types._M5_large, 2);

		public static final /*@NonNull*/ ExecutorProperty _M5_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.M5_XLARGE__INSTANCE_TYPE, Types._M5_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _M5_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.M5_XLARGE__OCCI_COMPUTE_CORES, Types._M5_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _M5_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.M5_XLARGE__OCCI_COMPUTE_MEMORY, Types._M5_xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _P2_16xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.P2_16XLARGE__GPU_MEMORY, Types._P2_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _P2_16xlarge__gpuP2P = new EcoreExecutorProperty(Ec2Package.Literals.P2_16XLARGE__GPU_P2P, Types._P2_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _P2_16xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.P2_16XLARGE__GPUS, Types._P2_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _P2_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.P2_16XLARGE__INSTANCE_TYPE, Types._P2_16xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _P2_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.P2_16XLARGE__OCCI_COMPUTE_CORES, Types._P2_16xlarge, 4);
		public static final /*@NonNull*/ ExecutorProperty _P2_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.P2_16XLARGE__OCCI_COMPUTE_MEMORY, Types._P2_16xlarge, 5);

		public static final /*@NonNull*/ ExecutorProperty _P2_8xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.P2_8XLARGE__GPU_MEMORY, Types._P2_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _P2_8xlarge__gpuP2P = new EcoreExecutorProperty(Ec2Package.Literals.P2_8XLARGE__GPU_P2P, Types._P2_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _P2_8xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.P2_8XLARGE__GPUS, Types._P2_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _P2_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.P2_8XLARGE__INSTANCE_TYPE, Types._P2_8xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _P2_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.P2_8XLARGE__OCCI_COMPUTE_CORES, Types._P2_8xlarge, 4);
		public static final /*@NonNull*/ ExecutorProperty _P2_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.P2_8XLARGE__OCCI_COMPUTE_MEMORY, Types._P2_8xlarge, 5);

		public static final /*@NonNull*/ ExecutorProperty _P2_xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.P2_XLARGE__GPU_MEMORY, Types._P2_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _P2_xlarge__gpuP2P = new EcoreExecutorProperty(Ec2Package.Literals.P2_XLARGE__GPU_P2P, Types._P2_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _P2_xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.P2_XLARGE__GPUS, Types._P2_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _P2_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.P2_XLARGE__INSTANCE_TYPE, Types._P2_xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _P2_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.P2_XLARGE__OCCI_COMPUTE_CORES, Types._P2_xlarge, 4);
		public static final /*@NonNull*/ ExecutorProperty _P2_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.P2_XLARGE__OCCI_COMPUTE_MEMORY, Types._P2_xlarge, 5);

		public static final /*@NonNull*/ ExecutorProperty _P3_16xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.P3_16XLARGE__GPU_MEMORY, Types._P3_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _P3_16xlarge__gpuP2P = new EcoreExecutorProperty(Ec2Package.Literals.P3_16XLARGE__GPU_P2P, Types._P3_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _P3_16xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.P3_16XLARGE__GPUS, Types._P3_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _P3_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.P3_16XLARGE__INSTANCE_TYPE, Types._P3_16xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _P3_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.P3_16XLARGE__OCCI_COMPUTE_CORES, Types._P3_16xlarge, 4);
		public static final /*@NonNull*/ ExecutorProperty _P3_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.P3_16XLARGE__OCCI_COMPUTE_MEMORY, Types._P3_16xlarge, 5);

		public static final /*@NonNull*/ ExecutorProperty _P3_2xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.P3_2XLARGE__GPU_MEMORY, Types._P3_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _P3_2xlarge__gpuP2P = new EcoreExecutorProperty(Ec2Package.Literals.P3_2XLARGE__GPU_P2P, Types._P3_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _P3_2xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.P3_2XLARGE__GPUS, Types._P3_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _P3_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.P3_2XLARGE__INSTANCE_TYPE, Types._P3_2xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _P3_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.P3_2XLARGE__OCCI_COMPUTE_CORES, Types._P3_2xlarge, 4);
		public static final /*@NonNull*/ ExecutorProperty _P3_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.P3_2XLARGE__OCCI_COMPUTE_MEMORY, Types._P3_2xlarge, 5);

		public static final /*@NonNull*/ ExecutorProperty _P3_8xlarge__gpuMemory = new EcoreExecutorProperty(Ec2Package.Literals.P3_8XLARGE__GPU_MEMORY, Types._P3_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _P3_8xlarge__gpuP2P = new EcoreExecutorProperty(Ec2Package.Literals.P3_8XLARGE__GPU_P2P, Types._P3_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _P3_8xlarge__gpus = new EcoreExecutorProperty(Ec2Package.Literals.P3_8XLARGE__GPUS, Types._P3_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _P3_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.P3_8XLARGE__INSTANCE_TYPE, Types._P3_8xlarge, 3);
		public static final /*@NonNull*/ ExecutorProperty _P3_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.P3_8XLARGE__OCCI_COMPUTE_CORES, Types._P3_8xlarge, 4);
		public static final /*@NonNull*/ ExecutorProperty _P3_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.P3_8XLARGE__OCCI_COMPUTE_MEMORY, Types._P3_8xlarge, 5);

		public static final /*@NonNull*/ ExecutorProperty _Placementgroup__affinity = new EcoreExecutorProperty(Ec2Package.Literals.PLACEMENTGROUP__AFFINITY, Types._Placementgroup, 0);
		public static final /*@NonNull*/ ExecutorProperty _Placementgroup__groupName = new EcoreExecutorProperty(Ec2Package.Literals.PLACEMENTGROUP__GROUP_NAME, Types._Placementgroup, 1);
		public static final /*@NonNull*/ ExecutorProperty _Placementgroup__hostId = new EcoreExecutorProperty(Ec2Package.Literals.PLACEMENTGROUP__HOST_ID, Types._Placementgroup, 2);
		public static final /*@NonNull*/ ExecutorProperty _Placementgroup__spreadDomain = new EcoreExecutorProperty(Ec2Package.Literals.PLACEMENTGROUP__SPREAD_DOMAIN, Types._Placementgroup, 3);
		public static final /*@NonNull*/ ExecutorProperty _Placementgroup__tenancy = new EcoreExecutorProperty(Ec2Package.Literals.PLACEMENTGROUP__TENANCY, Types._Placementgroup, 4);
		public static final /*@NonNull*/ ExecutorProperty _Placementgroup__zoneName = new EcoreExecutorProperty(Ec2Package.Literals.PLACEMENTGROUP__ZONE_NAME, Types._Placementgroup, 5);

		public static final /*@NonNull*/ ExecutorProperty _R3_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R3_2XLARGE__INSTANCE_TYPE, Types._R3_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R3_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R3_2XLARGE__OCCI_COMPUTE_CORES, Types._R3_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R3_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.R3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._R3_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _R3_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R3_2XLARGE__OCCI_COMPUTE_MEMORY, Types._R3_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _R3_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R3_4XLARGE__INSTANCE_TYPE, Types._R3_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R3_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R3_4XLARGE__OCCI_COMPUTE_CORES, Types._R3_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R3_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.R3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._R3_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _R3_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R3_4XLARGE__OCCI_COMPUTE_MEMORY, Types._R3_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _R3_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R3_8XLARGE__INSTANCE_TYPE, Types._R3_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R3_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R3_8XLARGE__OCCI_COMPUTE_CORES, Types._R3_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R3_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.R3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._R3_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _R3_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R3_8XLARGE__OCCI_COMPUTE_MEMORY, Types._R3_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _R3_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R3_LARGE__INSTANCE_TYPE, Types._R3_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _R3_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R3_LARGE__OCCI_COMPUTE_CORES, Types._R3_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _R3_large__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.R3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._R3_large, 2);
		public static final /*@NonNull*/ ExecutorProperty _R3_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R3_LARGE__OCCI_COMPUTE_MEMORY, Types._R3_large, 3);

		public static final /*@NonNull*/ ExecutorProperty _R3_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R3_XLARGE__INSTANCE_TYPE, Types._R3_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R3_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R3_XLARGE__OCCI_COMPUTE_CORES, Types._R3_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R3_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.R3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._R3_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _R3_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R3_XLARGE__OCCI_COMPUTE_MEMORY, Types._R3_xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _R4_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R4_16XLARGE__INSTANCE_TYPE, Types._R4_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R4_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R4_16XLARGE__OCCI_COMPUTE_CORES, Types._R4_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R4_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R4_16XLARGE__OCCI_COMPUTE_MEMORY, Types._R4_16xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _R4_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R4_2XLARGE__INSTANCE_TYPE, Types._R4_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R4_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R4_2XLARGE__OCCI_COMPUTE_CORES, Types._R4_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R4_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R4_2XLARGE__OCCI_COMPUTE_MEMORY, Types._R4_2xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _R4_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R4_4XLARGE__INSTANCE_TYPE, Types._R4_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R4_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R4_4XLARGE__OCCI_COMPUTE_CORES, Types._R4_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R4_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R4_4XLARGE__OCCI_COMPUTE_MEMORY, Types._R4_4xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _R4_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R4_8XLARGE__INSTANCE_TYPE, Types._R4_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R4_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R4_8XLARGE__OCCI_COMPUTE_CORES, Types._R4_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R4_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R4_8XLARGE__OCCI_COMPUTE_MEMORY, Types._R4_8xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _R4_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R4_LARGE__INSTANCE_TYPE, Types._R4_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _R4_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R4_LARGE__OCCI_COMPUTE_CORES, Types._R4_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _R4_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R4_LARGE__OCCI_COMPUTE_MEMORY, Types._R4_large, 2);

		public static final /*@NonNull*/ ExecutorProperty _R4_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.R4_XLARGE__INSTANCE_TYPE, Types._R4_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _R4_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.R4_XLARGE__OCCI_COMPUTE_CORES, Types._R4_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _R4_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.R4_XLARGE__OCCI_COMPUTE_MEMORY, Types._R4_xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _Rootdevicevolume__rootDeviceName = new EcoreExecutorProperty(Ec2Package.Literals.ROOTDEVICEVOLUME__ROOT_DEVICE_NAME, Types._Rootdevicevolume, 0);
		public static final /*@NonNull*/ ExecutorProperty _Rootdevicevolume__rootDeviceType = new EcoreExecutorProperty(Ec2Package.Literals.ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE, Types._Rootdevicevolume, 1);

		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__city = new EcoreExecutorProperty(Ec2Package.Literals.SA_EAST_1__CITY, Types._Sa_east_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__country = new EcoreExecutorProperty(Ec2Package.Literals.SA_EAST_1__COUNTRY, Types._Sa_east_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.SA_EAST_1__REGION_ID, Types._Sa_east_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.SA_EAST_1__REGION_NAME, Types._Sa_east_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Statustransitionreason__stateTransitionCode = new EcoreExecutorProperty(Ec2Package.Literals.STATUSTRANSITIONREASON__STATE_TRANSITION_CODE, Types._Statustransitionreason, 0);
		public static final /*@NonNull*/ ExecutorProperty _Statustransitionreason__stateTransitionMessage = new EcoreExecutorProperty(Ec2Package.Literals.STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE, Types._Statustransitionreason, 1);

		public static final /*@NonNull*/ ExecutorProperty _T1_micro__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T1_MICRO__INSTANCE_TYPE, Types._T1_micro, 0);
		public static final /*@NonNull*/ ExecutorProperty _T1_micro__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T1_MICRO__OCCI_COMPUTE_CORES, Types._T1_micro, 1);
		public static final /*@NonNull*/ ExecutorProperty _T1_micro__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T1_MICRO__OCCI_COMPUTE_MEMORY, Types._T1_micro, 2);

		public static final /*@NonNull*/ ExecutorProperty _T2_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T2_2XLARGE__INSTANCE_TYPE, Types._T2_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _T2_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T2_2XLARGE__OCCI_COMPUTE_CORES, Types._T2_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _T2_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T2_2XLARGE__OCCI_COMPUTE_MEMORY, Types._T2_2xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _T2_large__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T2_LARGE__INSTANCE_TYPE, Types._T2_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _T2_large__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T2_LARGE__OCCI_COMPUTE_CORES, Types._T2_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _T2_large__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T2_LARGE__OCCI_COMPUTE_MEMORY, Types._T2_large, 2);

		public static final /*@NonNull*/ ExecutorProperty _T2_medium__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T2_MEDIUM__INSTANCE_TYPE, Types._T2_medium, 0);
		public static final /*@NonNull*/ ExecutorProperty _T2_medium__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T2_MEDIUM__OCCI_COMPUTE_CORES, Types._T2_medium, 1);
		public static final /*@NonNull*/ ExecutorProperty _T2_medium__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T2_MEDIUM__OCCI_COMPUTE_MEMORY, Types._T2_medium, 2);

		public static final /*@NonNull*/ ExecutorProperty _T2_micro__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T2_MICRO__INSTANCE_TYPE, Types._T2_micro, 0);
		public static final /*@NonNull*/ ExecutorProperty _T2_micro__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T2_MICRO__OCCI_COMPUTE_CORES, Types._T2_micro, 1);
		public static final /*@NonNull*/ ExecutorProperty _T2_micro__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T2_MICRO__OCCI_COMPUTE_MEMORY, Types._T2_micro, 2);

		public static final /*@NonNull*/ ExecutorProperty _T2_nano__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T2_NANO__INSTANCE_TYPE, Types._T2_nano, 0);
		public static final /*@NonNull*/ ExecutorProperty _T2_nano__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T2_NANO__OCCI_COMPUTE_CORES, Types._T2_nano, 1);
		public static final /*@NonNull*/ ExecutorProperty _T2_nano__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T2_NANO__OCCI_COMPUTE_MEMORY, Types._T2_nano, 2);

		public static final /*@NonNull*/ ExecutorProperty _T2_small__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T2_SMALL__INSTANCE_TYPE, Types._T2_small, 0);
		public static final /*@NonNull*/ ExecutorProperty _T2_small__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T2_SMALL__OCCI_COMPUTE_CORES, Types._T2_small, 1);
		public static final /*@NonNull*/ ExecutorProperty _T2_small__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T2_SMALL__OCCI_COMPUTE_MEMORY, Types._T2_small, 2);

		public static final /*@NonNull*/ ExecutorProperty _T2_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.T2_XLARGE__INSTANCE_TYPE, Types._T2_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _T2_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.T2_XLARGE__OCCI_COMPUTE_CORES, Types._T2_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _T2_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.T2_XLARGE__OCCI_COMPUTE_MEMORY, Types._T2_xlarge, 2);

		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__city = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_1__CITY, Types._Us_east_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__country = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_1__COUNTRY, Types._Us_east_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_1__REGION_ID, Types._Us_east_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_1__REGION_NAME, Types._Us_east_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__city = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_2__CITY, Types._Us_east_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__country = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_2__COUNTRY, Types._Us_east_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__regionId = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_2__REGION_ID, Types._Us_east_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__regionName = new EcoreExecutorProperty(Ec2Package.Literals.US_EAST_2__REGION_NAME, Types._Us_east_2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__city = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_1__CITY, Types._Us_west_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__country = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_1__COUNTRY, Types._Us_west_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__regionId = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_1__REGION_ID, Types._Us_west_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__regionName = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_1__REGION_NAME, Types._Us_west_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__city = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_2__CITY, Types._Us_west_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__country = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_2__COUNTRY, Types._Us_west_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__regionId = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_2__REGION_ID, Types._Us_west_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__regionName = new EcoreExecutorProperty(Ec2Package.Literals.US_WEST_2__REGION_NAME, Types._Us_west_2, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1_16XLARGE__INSTANCE_TYPE, Types._X1_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1_16XLARGE__OCCI_COMPUTE_CORES, Types._X1_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1_16xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1_16XLARGE__OCCI_COMPUTE_MEMORY, Types._X1_16xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1_32xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1_32XLARGE__INSTANCE_TYPE, Types._X1_32xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1_32xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1_32XLARGE__OCCI_COMPUTE_CORES, Types._X1_32xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1_32xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1_32XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1_32xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1_32xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1_32XLARGE__OCCI_COMPUTE_MEMORY, Types._X1_32xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1e_16xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1E_16XLARGE__INSTANCE_TYPE, Types._X1e_16xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1e_16xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1E_16XLARGE__OCCI_COMPUTE_CORES, Types._X1e_16xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1e_16xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1E_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1e_16xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1e_16xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1E_16XLARGE__OCCI_COMPUTE_MEMORY, Types._X1e_16xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1e_2xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1E_2XLARGE__INSTANCE_TYPE, Types._X1e_2xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1e_2xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1E_2XLARGE__OCCI_COMPUTE_CORES, Types._X1e_2xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1e_2xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1E_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1e_2xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1e_2xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1E_2XLARGE__OCCI_COMPUTE_MEMORY, Types._X1e_2xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1e_32xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1E_32XLARGE__INSTANCE_TYPE, Types._X1e_32xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1e_32xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1E_32XLARGE__OCCI_COMPUTE_CORES, Types._X1e_32xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1e_32xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1E_32XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1e_32xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1e_32xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1E_32XLARGE__OCCI_COMPUTE_MEMORY, Types._X1e_32xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1e_4xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1E_4XLARGE__INSTANCE_TYPE, Types._X1e_4xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1e_4xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1E_4XLARGE__OCCI_COMPUTE_CORES, Types._X1e_4xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1e_4xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1E_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1e_4xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1e_4xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1E_4XLARGE__OCCI_COMPUTE_MEMORY, Types._X1e_4xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1e_8xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1E_8XLARGE__INSTANCE_TYPE, Types._X1e_8xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1e_8xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1E_8XLARGE__OCCI_COMPUTE_CORES, Types._X1e_8xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1e_8xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1E_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1e_8xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1e_8xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1E_8XLARGE__OCCI_COMPUTE_MEMORY, Types._X1e_8xlarge, 3);

		public static final /*@NonNull*/ ExecutorProperty _X1e_xlarge__instanceType = new EcoreExecutorProperty(Ec2Package.Literals.X1E_XLARGE__INSTANCE_TYPE, Types._X1e_xlarge, 0);
		public static final /*@NonNull*/ ExecutorProperty _X1e_xlarge__occiComputeCores = new EcoreExecutorProperty(Ec2Package.Literals.X1E_XLARGE__OCCI_COMPUTE_CORES, Types._X1e_xlarge, 1);
		public static final /*@NonNull*/ ExecutorProperty _X1e_xlarge__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(Ec2Package.Literals.X1E_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._X1e_xlarge, 2);
		public static final /*@NonNull*/ ExecutorProperty _X1e_xlarge__occiComputeMemory = new EcoreExecutorProperty(Ec2Package.Literals.X1E_XLARGE__OCCI_COMPUTE_MEMORY, Types._X1e_xlarge, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AWSInstanceState =
		{
			Fragments._AWSInstanceState__OclAny /* 0 */,
			Fragments._AWSInstanceState__OclElement /* 1 */,
			Fragments._AWSInstanceState__OclType /* 2 */,
			Fragments._AWSInstanceState__OclEnumeration /* 3 */,
			Fragments._AWSInstanceState__AWSInstanceState /* 4 */
		};
		private static final int /*@NonNull*/ [] __AWSInstanceState = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Acceleratedcomputing =
		{
			Fragments._Acceleratedcomputing__OclAny /* 0 */,
			Fragments._Acceleratedcomputing__OclElement /* 1 */,
			Fragments._Acceleratedcomputing__MixinBase /* 2 */,
			Fragments._Acceleratedcomputing__Resource_tpl /* 3 */,
			Fragments._Acceleratedcomputing__Acceleratedcomputing /* 4 */
		};
		private static final int /*@NonNull*/ [] __Acceleratedcomputing = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_northeast_1 =
		{
			Fragments._Ap_northeast_1__OclAny /* 0 */,
			Fragments._Ap_northeast_1__OclElement /* 1 */,
			Fragments._Ap_northeast_1__MixinBase /* 2 */,
			Fragments._Ap_northeast_1__Ap_northeast_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Ap_northeast_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_northeast_2 =
		{
			Fragments._Ap_northeast_2__OclAny /* 0 */,
			Fragments._Ap_northeast_2__OclElement /* 1 */,
			Fragments._Ap_northeast_2__MixinBase /* 2 */,
			Fragments._Ap_northeast_2__Ap_northeast_2 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Ap_northeast_2 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_south_1 =
		{
			Fragments._Ap_south_1__OclAny /* 0 */,
			Fragments._Ap_south_1__OclElement /* 1 */,
			Fragments._Ap_south_1__MixinBase /* 2 */,
			Fragments._Ap_south_1__Ap_south_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Ap_south_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_south_east2 =
		{
			Fragments._Ap_south_east2__OclAny /* 0 */,
			Fragments._Ap_south_east2__OclElement /* 1 */,
			Fragments._Ap_south_east2__MixinBase /* 2 */,
			Fragments._Ap_south_east2__Ap_south_east2 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Ap_south_east2 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_southeast_1 =
		{
			Fragments._Ap_southeast_1__OclAny /* 0 */,
			Fragments._Ap_southeast_1__OclElement /* 1 */,
			Fragments._Ap_southeast_1__MixinBase /* 2 */,
			Fragments._Ap_southeast_1__Ap_southeast_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Ap_southeast_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Awsaccount =
		{
			Fragments._Awsaccount__OclAny /* 0 */,
			Fragments._Awsaccount__OclElement /* 1 */,
			Fragments._Awsaccount__Entity /* 2 */,
			Fragments._Awsaccount__Resource /* 3 */,
			Fragments._Awsaccount__Cloudaccount /* 4 */,
			Fragments._Awsaccount__Awsaccount /* 5 */
		};
		private static final int /*@NonNull*/ [] __Awsaccount = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Awscredential =
		{
			Fragments._Awscredential__OclAny /* 0 */,
			Fragments._Awscredential__OclElement /* 1 */,
			Fragments._Awscredential__MixinBase /* 2 */,
			Fragments._Awscredential__Cloudcredential /* 3 */,
			Fragments._Awscredential__Awscredential /* 4 */
		};
		private static final int /*@NonNull*/ [] __Awscredential = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C1_medium =
		{
			Fragments._C1_medium__OclAny /* 0 */,
			Fragments._C1_medium__OclElement /* 1 */,
			Fragments._C1_medium__MixinBase /* 2 */,
			Fragments._C1_medium__Resource_tpl /* 3 */,
			Fragments._C1_medium__Computeoptimized /* 4 */,
			Fragments._C1_medium__C1_medium /* 5 */
		};
		private static final int /*@NonNull*/ [] __C1_medium = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C1_xlarge =
		{
			Fragments._C1_xlarge__OclAny /* 0 */,
			Fragments._C1_xlarge__OclElement /* 1 */,
			Fragments._C1_xlarge__MixinBase /* 2 */,
			Fragments._C1_xlarge__Resource_tpl /* 3 */,
			Fragments._C1_xlarge__Computeoptimized /* 4 */,
			Fragments._C1_xlarge__C1_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C1_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C3_2xlarge =
		{
			Fragments._C3_2xlarge__OclAny /* 0 */,
			Fragments._C3_2xlarge__OclElement /* 1 */,
			Fragments._C3_2xlarge__MixinBase /* 2 */,
			Fragments._C3_2xlarge__Resource_tpl /* 3 */,
			Fragments._C3_2xlarge__Computeoptimized /* 4 */,
			Fragments._C3_2xlarge__C3_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C3_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C3_4xlarge =
		{
			Fragments._C3_4xlarge__OclAny /* 0 */,
			Fragments._C3_4xlarge__OclElement /* 1 */,
			Fragments._C3_4xlarge__MixinBase /* 2 */,
			Fragments._C3_4xlarge__Resource_tpl /* 3 */,
			Fragments._C3_4xlarge__Computeoptimized /* 4 */,
			Fragments._C3_4xlarge__C3_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C3_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C3_8xlarge =
		{
			Fragments._C3_8xlarge__OclAny /* 0 */,
			Fragments._C3_8xlarge__OclElement /* 1 */,
			Fragments._C3_8xlarge__MixinBase /* 2 */,
			Fragments._C3_8xlarge__Resource_tpl /* 3 */,
			Fragments._C3_8xlarge__Computeoptimized /* 4 */,
			Fragments._C3_8xlarge__C3_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C3_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C3_large =
		{
			Fragments._C3_large__OclAny /* 0 */,
			Fragments._C3_large__OclElement /* 1 */,
			Fragments._C3_large__MixinBase /* 2 */,
			Fragments._C3_large__Resource_tpl /* 3 */,
			Fragments._C3_large__Computeoptimized /* 4 */,
			Fragments._C3_large__C3_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __C3_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C3_xlarge =
		{
			Fragments._C3_xlarge__OclAny /* 0 */,
			Fragments._C3_xlarge__OclElement /* 1 */,
			Fragments._C3_xlarge__MixinBase /* 2 */,
			Fragments._C3_xlarge__Resource_tpl /* 3 */,
			Fragments._C3_xlarge__Computeoptimized /* 4 */,
			Fragments._C3_xlarge__C3_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C3_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C4_2xlarge =
		{
			Fragments._C4_2xlarge__OclAny /* 0 */,
			Fragments._C4_2xlarge__OclElement /* 1 */,
			Fragments._C4_2xlarge__MixinBase /* 2 */,
			Fragments._C4_2xlarge__Resource_tpl /* 3 */,
			Fragments._C4_2xlarge__Computeoptimized /* 4 */,
			Fragments._C4_2xlarge__C4_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C4_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C4_4xlarge =
		{
			Fragments._C4_4xlarge__OclAny /* 0 */,
			Fragments._C4_4xlarge__OclElement /* 1 */,
			Fragments._C4_4xlarge__MixinBase /* 2 */,
			Fragments._C4_4xlarge__Resource_tpl /* 3 */,
			Fragments._C4_4xlarge__Computeoptimized /* 4 */,
			Fragments._C4_4xlarge__C4_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C4_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C4_8xlarge =
		{
			Fragments._C4_8xlarge__OclAny /* 0 */,
			Fragments._C4_8xlarge__OclElement /* 1 */,
			Fragments._C4_8xlarge__MixinBase /* 2 */,
			Fragments._C4_8xlarge__Resource_tpl /* 3 */,
			Fragments._C4_8xlarge__Computeoptimized /* 4 */,
			Fragments._C4_8xlarge__C4_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C4_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C4_large =
		{
			Fragments._C4_large__OclAny /* 0 */,
			Fragments._C4_large__OclElement /* 1 */,
			Fragments._C4_large__MixinBase /* 2 */,
			Fragments._C4_large__Resource_tpl /* 3 */,
			Fragments._C4_large__Computeoptimized /* 4 */,
			Fragments._C4_large__C4_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __C4_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C4_xlarge =
		{
			Fragments._C4_xlarge__OclAny /* 0 */,
			Fragments._C4_xlarge__OclElement /* 1 */,
			Fragments._C4_xlarge__MixinBase /* 2 */,
			Fragments._C4_xlarge__Resource_tpl /* 3 */,
			Fragments._C4_xlarge__Computeoptimized /* 4 */,
			Fragments._C4_xlarge__C4_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C4_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C5_18xlarge =
		{
			Fragments._C5_18xlarge__OclAny /* 0 */,
			Fragments._C5_18xlarge__OclElement /* 1 */,
			Fragments._C5_18xlarge__MixinBase /* 2 */,
			Fragments._C5_18xlarge__Resource_tpl /* 3 */,
			Fragments._C5_18xlarge__Computeoptimized /* 4 */,
			Fragments._C5_18xlarge__C5_18xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C5_18xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C5_2xlarge =
		{
			Fragments._C5_2xlarge__OclAny /* 0 */,
			Fragments._C5_2xlarge__OclElement /* 1 */,
			Fragments._C5_2xlarge__MixinBase /* 2 */,
			Fragments._C5_2xlarge__Resource_tpl /* 3 */,
			Fragments._C5_2xlarge__Computeoptimized /* 4 */,
			Fragments._C5_2xlarge__C5_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C5_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C5_4xlarge =
		{
			Fragments._C5_4xlarge__OclAny /* 0 */,
			Fragments._C5_4xlarge__OclElement /* 1 */,
			Fragments._C5_4xlarge__MixinBase /* 2 */,
			Fragments._C5_4xlarge__Resource_tpl /* 3 */,
			Fragments._C5_4xlarge__Computeoptimized /* 4 */,
			Fragments._C5_4xlarge__C5_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C5_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C5_9xlarge =
		{
			Fragments._C5_9xlarge__OclAny /* 0 */,
			Fragments._C5_9xlarge__OclElement /* 1 */,
			Fragments._C5_9xlarge__MixinBase /* 2 */,
			Fragments._C5_9xlarge__Resource_tpl /* 3 */,
			Fragments._C5_9xlarge__Computeoptimized /* 4 */,
			Fragments._C5_9xlarge__C5_9xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C5_9xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C5_large =
		{
			Fragments._C5_large__OclAny /* 0 */,
			Fragments._C5_large__OclElement /* 1 */,
			Fragments._C5_large__MixinBase /* 2 */,
			Fragments._C5_large__Resource_tpl /* 3 */,
			Fragments._C5_large__Computeoptimized /* 4 */,
			Fragments._C5_large__C5_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __C5_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _C5_xlarge =
		{
			Fragments._C5_xlarge__OclAny /* 0 */,
			Fragments._C5_xlarge__OclElement /* 1 */,
			Fragments._C5_xlarge__MixinBase /* 2 */,
			Fragments._C5_xlarge__Resource_tpl /* 3 */,
			Fragments._C5_xlarge__Computeoptimized /* 4 */,
			Fragments._C5_xlarge__C5_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __C5_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ca_central_1 =
		{
			Fragments._Ca_central_1__OclAny /* 0 */,
			Fragments._Ca_central_1__OclElement /* 1 */,
			Fragments._Ca_central_1__MixinBase /* 2 */,
			Fragments._Ca_central_1__Ca_central_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Ca_central_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cc2_8xlarge =
		{
			Fragments._Cc2_8xlarge__OclAny /* 0 */,
			Fragments._Cc2_8xlarge__OclElement /* 1 */,
			Fragments._Cc2_8xlarge__MixinBase /* 2 */,
			Fragments._Cc2_8xlarge__Resource_tpl /* 3 */,
			Fragments._Cc2_8xlarge__Computeoptimized /* 4 */,
			Fragments._Cc2_8xlarge__Cc2_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __Cc2_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cg1_4xlarge =
		{
			Fragments._Cg1_4xlarge__OclAny /* 0 */,
			Fragments._Cg1_4xlarge__OclElement /* 1 */,
			Fragments._Cg1_4xlarge__MixinBase /* 2 */,
			Fragments._Cg1_4xlarge__Resource_tpl /* 3 */,
			Fragments._Cg1_4xlarge__Acceleratedcomputing /* 4 */,
			Fragments._Cg1_4xlarge__Cg1_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __Cg1_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Computeoptimized =
		{
			Fragments._Computeoptimized__OclAny /* 0 */,
			Fragments._Computeoptimized__OclElement /* 1 */,
			Fragments._Computeoptimized__MixinBase /* 2 */,
			Fragments._Computeoptimized__Resource_tpl /* 3 */,
			Fragments._Computeoptimized__Computeoptimized /* 4 */
		};
		private static final int /*@NonNull*/ [] __Computeoptimized = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cr1_8xlarge =
		{
			Fragments._Cr1_8xlarge__OclAny /* 0 */,
			Fragments._Cr1_8xlarge__OclElement /* 1 */,
			Fragments._Cr1_8xlarge__MixinBase /* 2 */,
			Fragments._Cr1_8xlarge__Resource_tpl /* 3 */,
			Fragments._Cr1_8xlarge__Memoryoptimized /* 4 */,
			Fragments._Cr1_8xlarge__Cr1_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __Cr1_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _D2_2xlarge =
		{
			Fragments._D2_2xlarge__OclAny /* 0 */,
			Fragments._D2_2xlarge__OclElement /* 1 */,
			Fragments._D2_2xlarge__MixinBase /* 2 */,
			Fragments._D2_2xlarge__Resource_tpl /* 3 */,
			Fragments._D2_2xlarge__Storageoptimized /* 4 */,
			Fragments._D2_2xlarge__D2_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __D2_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _D2_4xlarge =
		{
			Fragments._D2_4xlarge__OclAny /* 0 */,
			Fragments._D2_4xlarge__OclElement /* 1 */,
			Fragments._D2_4xlarge__MixinBase /* 2 */,
			Fragments._D2_4xlarge__Resource_tpl /* 3 */,
			Fragments._D2_4xlarge__Storageoptimized /* 4 */,
			Fragments._D2_4xlarge__D2_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __D2_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _D2_8xlarge =
		{
			Fragments._D2_8xlarge__OclAny /* 0 */,
			Fragments._D2_8xlarge__OclElement /* 1 */,
			Fragments._D2_8xlarge__MixinBase /* 2 */,
			Fragments._D2_8xlarge__Resource_tpl /* 3 */,
			Fragments._D2_8xlarge__Storageoptimized /* 4 */,
			Fragments._D2_8xlarge__D2_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __D2_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _D2_xlarge =
		{
			Fragments._D2_xlarge__OclAny /* 0 */,
			Fragments._D2_xlarge__OclElement /* 1 */,
			Fragments._D2_xlarge__MixinBase /* 2 */,
			Fragments._D2_xlarge__Resource_tpl /* 3 */,
			Fragments._D2_xlarge__Storageoptimized /* 4 */,
			Fragments._D2_xlarge__D2_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __D2_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_central_1 =
		{
			Fragments._Eu_central_1__OclAny /* 0 */,
			Fragments._Eu_central_1__OclElement /* 1 */,
			Fragments._Eu_central_1__MixinBase /* 2 */,
			Fragments._Eu_central_1__Eu_central_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Eu_central_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_west_1 =
		{
			Fragments._Eu_west_1__OclAny /* 0 */,
			Fragments._Eu_west_1__OclElement /* 1 */,
			Fragments._Eu_west_1__MixinBase /* 2 */,
			Fragments._Eu_west_1__Eu_west_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Eu_west_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_west_2 =
		{
			Fragments._Eu_west_2__OclAny /* 0 */,
			Fragments._Eu_west_2__OclElement /* 1 */,
			Fragments._Eu_west_2__MixinBase /* 2 */,
			Fragments._Eu_west_2__Eu_west_2 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Eu_west_2 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_west_3 =
		{
			Fragments._Eu_west_3__OclAny /* 0 */,
			Fragments._Eu_west_3__OclElement /* 1 */,
			Fragments._Eu_west_3__MixinBase /* 2 */,
			Fragments._Eu_west_3__Eu_west_3 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Eu_west_3 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Europe =
		{
			Fragments._Europe__OclAny /* 0 */,
			Fragments._Europe__OclElement /* 1 */,
			Fragments._Europe__MixinBase /* 2 */,
			Fragments._Europe__Region /* 3 */,
			Fragments._Europe__Europe /* 4 */
		};
		private static final int /*@NonNull*/ [] __Europe = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _F1_16xlarge =
		{
			Fragments._F1_16xlarge__OclAny /* 0 */,
			Fragments._F1_16xlarge__OclElement /* 1 */,
			Fragments._F1_16xlarge__MixinBase /* 2 */,
			Fragments._F1_16xlarge__Resource_tpl /* 3 */,
			Fragments._F1_16xlarge__Acceleratedcomputing /* 4 */,
			Fragments._F1_16xlarge__F1_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __F1_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _F1_2xlarge =
		{
			Fragments._F1_2xlarge__OclAny /* 0 */,
			Fragments._F1_2xlarge__OclElement /* 1 */,
			Fragments._F1_2xlarge__MixinBase /* 2 */,
			Fragments._F1_2xlarge__Resource_tpl /* 3 */,
			Fragments._F1_2xlarge__Acceleratedcomputing /* 4 */,
			Fragments._F1_2xlarge__F1_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __F1_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _G2_2xlarge =
		{
			Fragments._G2_2xlarge__OclAny /* 0 */,
			Fragments._G2_2xlarge__OclElement /* 1 */,
			Fragments._G2_2xlarge__MixinBase /* 2 */,
			Fragments._G2_2xlarge__Resource_tpl /* 3 */,
			Fragments._G2_2xlarge__Acceleratedcomputing /* 4 */,
			Fragments._G2_2xlarge__G2_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __G2_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _G2_8xlarge =
		{
			Fragments._G2_8xlarge__OclAny /* 0 */,
			Fragments._G2_8xlarge__OclElement /* 1 */,
			Fragments._G2_8xlarge__MixinBase /* 2 */,
			Fragments._G2_8xlarge__Resource_tpl /* 3 */,
			Fragments._G2_8xlarge__Acceleratedcomputing /* 4 */,
			Fragments._G2_8xlarge__G2_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __G2_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _G3_16xlarge =
		{
			Fragments._G3_16xlarge__OclAny /* 0 */,
			Fragments._G3_16xlarge__OclElement /* 1 */,
			Fragments._G3_16xlarge__MixinBase /* 2 */,
			Fragments._G3_16xlarge__Resource_tpl /* 3 */,
			Fragments._G3_16xlarge__Acceleratedcomputing /* 4 */,
			Fragments._G3_16xlarge__G3_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __G3_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _G3_4xlarge =
		{
			Fragments._G3_4xlarge__OclAny /* 0 */,
			Fragments._G3_4xlarge__OclElement /* 1 */,
			Fragments._G3_4xlarge__MixinBase /* 2 */,
			Fragments._G3_4xlarge__Resource_tpl /* 3 */,
			Fragments._G3_4xlarge__Acceleratedcomputing /* 4 */,
			Fragments._G3_4xlarge__G3_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __G3_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _G3_8xlarge =
		{
			Fragments._G3_8xlarge__OclAny /* 0 */,
			Fragments._G3_8xlarge__OclElement /* 1 */,
			Fragments._G3_8xlarge__MixinBase /* 2 */,
			Fragments._G3_8xlarge__Resource_tpl /* 3 */,
			Fragments._G3_8xlarge__Acceleratedcomputing /* 4 */,
			Fragments._G3_8xlarge__G3_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __G3_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Generalpurpose =
		{
			Fragments._Generalpurpose__OclAny /* 0 */,
			Fragments._Generalpurpose__OclElement /* 1 */,
			Fragments._Generalpurpose__MixinBase /* 2 */,
			Fragments._Generalpurpose__Resource_tpl /* 3 */,
			Fragments._Generalpurpose__Generalpurpose /* 4 */
		};
		private static final int /*@NonNull*/ [] __Generalpurpose = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _H1_16xlarge =
		{
			Fragments._H1_16xlarge__OclAny /* 0 */,
			Fragments._H1_16xlarge__OclElement /* 1 */,
			Fragments._H1_16xlarge__MixinBase /* 2 */,
			Fragments._H1_16xlarge__Resource_tpl /* 3 */,
			Fragments._H1_16xlarge__Storageoptimized /* 4 */,
			Fragments._H1_16xlarge__H1_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __H1_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _H1_2xlarge =
		{
			Fragments._H1_2xlarge__OclAny /* 0 */,
			Fragments._H1_2xlarge__OclElement /* 1 */,
			Fragments._H1_2xlarge__MixinBase /* 2 */,
			Fragments._H1_2xlarge__Resource_tpl /* 3 */,
			Fragments._H1_2xlarge__Storageoptimized /* 4 */,
			Fragments._H1_2xlarge__H1_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __H1_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _H1_4xlarge =
		{
			Fragments._H1_4xlarge__OclAny /* 0 */,
			Fragments._H1_4xlarge__OclElement /* 1 */,
			Fragments._H1_4xlarge__MixinBase /* 2 */,
			Fragments._H1_4xlarge__Resource_tpl /* 3 */,
			Fragments._H1_4xlarge__Storageoptimized /* 4 */,
			Fragments._H1_4xlarge__H1_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __H1_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _H1_8xlarge =
		{
			Fragments._H1_8xlarge__OclAny /* 0 */,
			Fragments._H1_8xlarge__OclElement /* 1 */,
			Fragments._H1_8xlarge__MixinBase /* 2 */,
			Fragments._H1_8xlarge__Resource_tpl /* 3 */,
			Fragments._H1_8xlarge__Storageoptimized /* 4 */,
			Fragments._H1_8xlarge__H1_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __H1_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Hs1_8xlarge =
		{
			Fragments._Hs1_8xlarge__OclAny /* 0 */,
			Fragments._Hs1_8xlarge__OclElement /* 1 */,
			Fragments._Hs1_8xlarge__MixinBase /* 2 */,
			Fragments._Hs1_8xlarge__Resource_tpl /* 3 */,
			Fragments._Hs1_8xlarge__Storageoptimized /* 4 */,
			Fragments._Hs1_8xlarge__Hs1_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __Hs1_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _HypervisorType =
		{
			Fragments._HypervisorType__OclAny /* 0 */,
			Fragments._HypervisorType__OclElement /* 1 */,
			Fragments._HypervisorType__OclType /* 2 */,
			Fragments._HypervisorType__OclEnumeration /* 3 */,
			Fragments._HypervisorType__HypervisorType /* 4 */
		};
		private static final int /*@NonNull*/ [] __HypervisorType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I2_2xlarge =
		{
			Fragments._I2_2xlarge__OclAny /* 0 */,
			Fragments._I2_2xlarge__OclElement /* 1 */,
			Fragments._I2_2xlarge__MixinBase /* 2 */,
			Fragments._I2_2xlarge__Resource_tpl /* 3 */,
			Fragments._I2_2xlarge__Storageoptimized /* 4 */,
			Fragments._I2_2xlarge__I2_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I2_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I2_4xlarge =
		{
			Fragments._I2_4xlarge__OclAny /* 0 */,
			Fragments._I2_4xlarge__OclElement /* 1 */,
			Fragments._I2_4xlarge__MixinBase /* 2 */,
			Fragments._I2_4xlarge__Resource_tpl /* 3 */,
			Fragments._I2_4xlarge__Storageoptimized /* 4 */,
			Fragments._I2_4xlarge__I2_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I2_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I2_8xlarge =
		{
			Fragments._I2_8xlarge__OclAny /* 0 */,
			Fragments._I2_8xlarge__OclElement /* 1 */,
			Fragments._I2_8xlarge__MixinBase /* 2 */,
			Fragments._I2_8xlarge__Resource_tpl /* 3 */,
			Fragments._I2_8xlarge__Storageoptimized /* 4 */,
			Fragments._I2_8xlarge__I2_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I2_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I2_xlarge =
		{
			Fragments._I2_xlarge__OclAny /* 0 */,
			Fragments._I2_xlarge__OclElement /* 1 */,
			Fragments._I2_xlarge__MixinBase /* 2 */,
			Fragments._I2_xlarge__Resource_tpl /* 3 */,
			Fragments._I2_xlarge__Storageoptimized /* 4 */,
			Fragments._I2_xlarge__I2_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I2_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I3_16xlarge =
		{
			Fragments._I3_16xlarge__OclAny /* 0 */,
			Fragments._I3_16xlarge__OclElement /* 1 */,
			Fragments._I3_16xlarge__MixinBase /* 2 */,
			Fragments._I3_16xlarge__Resource_tpl /* 3 */,
			Fragments._I3_16xlarge__Storageoptimized /* 4 */,
			Fragments._I3_16xlarge__I3_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I3_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I3_2xlarge =
		{
			Fragments._I3_2xlarge__OclAny /* 0 */,
			Fragments._I3_2xlarge__OclElement /* 1 */,
			Fragments._I3_2xlarge__MixinBase /* 2 */,
			Fragments._I3_2xlarge__Resource_tpl /* 3 */,
			Fragments._I3_2xlarge__Storageoptimized /* 4 */,
			Fragments._I3_2xlarge__I3_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I3_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I3_4xlarge =
		{
			Fragments._I3_4xlarge__OclAny /* 0 */,
			Fragments._I3_4xlarge__OclElement /* 1 */,
			Fragments._I3_4xlarge__MixinBase /* 2 */,
			Fragments._I3_4xlarge__Resource_tpl /* 3 */,
			Fragments._I3_4xlarge__Storageoptimized /* 4 */,
			Fragments._I3_4xlarge__I3_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I3_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I3_8xlarge =
		{
			Fragments._I3_8xlarge__OclAny /* 0 */,
			Fragments._I3_8xlarge__OclElement /* 1 */,
			Fragments._I3_8xlarge__MixinBase /* 2 */,
			Fragments._I3_8xlarge__Resource_tpl /* 3 */,
			Fragments._I3_8xlarge__Storageoptimized /* 4 */,
			Fragments._I3_8xlarge__I3_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I3_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I3_large =
		{
			Fragments._I3_large__OclAny /* 0 */,
			Fragments._I3_large__OclElement /* 1 */,
			Fragments._I3_large__MixinBase /* 2 */,
			Fragments._I3_large__Resource_tpl /* 3 */,
			Fragments._I3_large__Storageoptimized /* 4 */,
			Fragments._I3_large__I3_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __I3_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I3_metal =
		{
			Fragments._I3_metal__OclAny /* 0 */,
			Fragments._I3_metal__OclElement /* 1 */,
			Fragments._I3_metal__MixinBase /* 2 */,
			Fragments._I3_metal__Resource_tpl /* 3 */,
			Fragments._I3_metal__Storageoptimized /* 4 */,
			Fragments._I3_metal__I3_metal /* 5 */
		};
		private static final int /*@NonNull*/ [] __I3_metal = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _I3_xlarge =
		{
			Fragments._I3_xlarge__OclAny /* 0 */,
			Fragments._I3_xlarge__OclElement /* 1 */,
			Fragments._I3_xlarge__MixinBase /* 2 */,
			Fragments._I3_xlarge__Resource_tpl /* 3 */,
			Fragments._I3_xlarge__Storageoptimized /* 4 */,
			Fragments._I3_xlarge__I3_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __I3_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _InstanceLifeCycleType =
		{
			Fragments._InstanceLifeCycleType__OclAny /* 0 */,
			Fragments._InstanceLifeCycleType__OclElement /* 1 */,
			Fragments._InstanceLifeCycleType__OclType /* 2 */,
			Fragments._InstanceLifeCycleType__OclEnumeration /* 3 */,
			Fragments._InstanceLifeCycleType__InstanceLifeCycleType /* 4 */
		};
		private static final int /*@NonNull*/ [] __InstanceLifeCycleType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Instanceec2 =
		{
			Fragments._Instanceec2__OclAny /* 0 */,
			Fragments._Instanceec2__OclElement /* 1 */,
			Fragments._Instanceec2__Entity /* 2 */,
			Fragments._Instanceec2__Resource /* 3 */,
			Fragments._Instanceec2__Compute /* 4 */,
			Fragments._Instanceec2__Instanceec2 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Instanceec2 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Instancevpcinfo =
		{
			Fragments._Instancevpcinfo__OclAny /* 0 */,
			Fragments._Instancevpcinfo__OclElement /* 1 */,
			Fragments._Instancevpcinfo__MixinBase /* 2 */,
			Fragments._Instancevpcinfo__Instancevpcinfo /* 3 */
		};
		private static final int /*@NonNull*/ [] __Instancevpcinfo = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M1_large =
		{
			Fragments._M1_large__OclAny /* 0 */,
			Fragments._M1_large__OclElement /* 1 */,
			Fragments._M1_large__MixinBase /* 2 */,
			Fragments._M1_large__Resource_tpl /* 3 */,
			Fragments._M1_large__Generalpurpose /* 4 */,
			Fragments._M1_large__M1_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __M1_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M1_medium =
		{
			Fragments._M1_medium__OclAny /* 0 */,
			Fragments._M1_medium__OclElement /* 1 */,
			Fragments._M1_medium__MixinBase /* 2 */,
			Fragments._M1_medium__Resource_tpl /* 3 */,
			Fragments._M1_medium__Generalpurpose /* 4 */,
			Fragments._M1_medium__M1_medium /* 5 */
		};
		private static final int /*@NonNull*/ [] __M1_medium = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M1_small =
		{
			Fragments._M1_small__OclAny /* 0 */,
			Fragments._M1_small__OclElement /* 1 */,
			Fragments._M1_small__MixinBase /* 2 */,
			Fragments._M1_small__Resource_tpl /* 3 */,
			Fragments._M1_small__Generalpurpose /* 4 */,
			Fragments._M1_small__M1_small /* 5 */
		};
		private static final int /*@NonNull*/ [] __M1_small = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M1_xlarge =
		{
			Fragments._M1_xlarge__OclAny /* 0 */,
			Fragments._M1_xlarge__OclElement /* 1 */,
			Fragments._M1_xlarge__MixinBase /* 2 */,
			Fragments._M1_xlarge__Resource_tpl /* 3 */,
			Fragments._M1_xlarge__Generalpurpose /* 4 */,
			Fragments._M1_xlarge__M1_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M1_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M2_2xlarge =
		{
			Fragments._M2_2xlarge__OclAny /* 0 */,
			Fragments._M2_2xlarge__OclElement /* 1 */,
			Fragments._M2_2xlarge__MixinBase /* 2 */,
			Fragments._M2_2xlarge__Resource_tpl /* 3 */,
			Fragments._M2_2xlarge__Memoryoptimized /* 4 */,
			Fragments._M2_2xlarge__M2_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M2_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M2_4xlarge =
		{
			Fragments._M2_4xlarge__OclAny /* 0 */,
			Fragments._M2_4xlarge__OclElement /* 1 */,
			Fragments._M2_4xlarge__MixinBase /* 2 */,
			Fragments._M2_4xlarge__Resource_tpl /* 3 */,
			Fragments._M2_4xlarge__Memoryoptimized /* 4 */,
			Fragments._M2_4xlarge__M2_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M2_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M2_xlarge =
		{
			Fragments._M2_xlarge__OclAny /* 0 */,
			Fragments._M2_xlarge__OclElement /* 1 */,
			Fragments._M2_xlarge__MixinBase /* 2 */,
			Fragments._M2_xlarge__Resource_tpl /* 3 */,
			Fragments._M2_xlarge__Memoryoptimized /* 4 */,
			Fragments._M2_xlarge__M2_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M2_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M3_2xlarge =
		{
			Fragments._M3_2xlarge__OclAny /* 0 */,
			Fragments._M3_2xlarge__OclElement /* 1 */,
			Fragments._M3_2xlarge__MixinBase /* 2 */,
			Fragments._M3_2xlarge__Resource_tpl /* 3 */,
			Fragments._M3_2xlarge__Generalpurpose /* 4 */,
			Fragments._M3_2xlarge__M3_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M3_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M3_large =
		{
			Fragments._M3_large__OclAny /* 0 */,
			Fragments._M3_large__OclElement /* 1 */,
			Fragments._M3_large__MixinBase /* 2 */,
			Fragments._M3_large__Resource_tpl /* 3 */,
			Fragments._M3_large__Generalpurpose /* 4 */,
			Fragments._M3_large__M3_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __M3_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M3_medium =
		{
			Fragments._M3_medium__OclAny /* 0 */,
			Fragments._M3_medium__OclElement /* 1 */,
			Fragments._M3_medium__MixinBase /* 2 */,
			Fragments._M3_medium__Resource_tpl /* 3 */,
			Fragments._M3_medium__Generalpurpose /* 4 */,
			Fragments._M3_medium__M3_medium /* 5 */
		};
		private static final int /*@NonNull*/ [] __M3_medium = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M3_xlarge =
		{
			Fragments._M3_xlarge__OclAny /* 0 */,
			Fragments._M3_xlarge__OclElement /* 1 */,
			Fragments._M3_xlarge__MixinBase /* 2 */,
			Fragments._M3_xlarge__Resource_tpl /* 3 */,
			Fragments._M3_xlarge__Generalpurpose /* 4 */,
			Fragments._M3_xlarge__M3_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M3_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M4_10xlarge =
		{
			Fragments._M4_10xlarge__OclAny /* 0 */,
			Fragments._M4_10xlarge__OclElement /* 1 */,
			Fragments._M4_10xlarge__MixinBase /* 2 */,
			Fragments._M4_10xlarge__Resource_tpl /* 3 */,
			Fragments._M4_10xlarge__Generalpurpose /* 4 */,
			Fragments._M4_10xlarge__M4_10xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M4_10xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M4_16xlarge =
		{
			Fragments._M4_16xlarge__OclAny /* 0 */,
			Fragments._M4_16xlarge__OclElement /* 1 */,
			Fragments._M4_16xlarge__MixinBase /* 2 */,
			Fragments._M4_16xlarge__Resource_tpl /* 3 */,
			Fragments._M4_16xlarge__Generalpurpose /* 4 */,
			Fragments._M4_16xlarge__M4_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M4_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M4_2xlarge =
		{
			Fragments._M4_2xlarge__OclAny /* 0 */,
			Fragments._M4_2xlarge__OclElement /* 1 */,
			Fragments._M4_2xlarge__MixinBase /* 2 */,
			Fragments._M4_2xlarge__Resource_tpl /* 3 */,
			Fragments._M4_2xlarge__Generalpurpose /* 4 */,
			Fragments._M4_2xlarge__M4_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M4_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M4_large =
		{
			Fragments._M4_large__OclAny /* 0 */,
			Fragments._M4_large__OclElement /* 1 */,
			Fragments._M4_large__MixinBase /* 2 */,
			Fragments._M4_large__Resource_tpl /* 3 */,
			Fragments._M4_large__Generalpurpose /* 4 */,
			Fragments._M4_large__M4_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __M4_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M4_xlarge =
		{
			Fragments._M4_xlarge__OclAny /* 0 */,
			Fragments._M4_xlarge__OclElement /* 1 */,
			Fragments._M4_xlarge__MixinBase /* 2 */,
			Fragments._M4_xlarge__Resource_tpl /* 3 */,
			Fragments._M4_xlarge__Generalpurpose /* 4 */,
			Fragments._M4_xlarge__M4_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M4_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M5_12xlarge =
		{
			Fragments._M5_12xlarge__OclAny /* 0 */,
			Fragments._M5_12xlarge__OclElement /* 1 */,
			Fragments._M5_12xlarge__MixinBase /* 2 */,
			Fragments._M5_12xlarge__Resource_tpl /* 3 */,
			Fragments._M5_12xlarge__Generalpurpose /* 4 */,
			Fragments._M5_12xlarge__M5_12xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M5_12xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M5_24xlarge =
		{
			Fragments._M5_24xlarge__OclAny /* 0 */,
			Fragments._M5_24xlarge__OclElement /* 1 */,
			Fragments._M5_24xlarge__MixinBase /* 2 */,
			Fragments._M5_24xlarge__Resource_tpl /* 3 */,
			Fragments._M5_24xlarge__Generalpurpose /* 4 */,
			Fragments._M5_24xlarge__M5_24xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M5_24xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M5_2xlarge =
		{
			Fragments._M5_2xlarge__OclAny /* 0 */,
			Fragments._M5_2xlarge__OclElement /* 1 */,
			Fragments._M5_2xlarge__MixinBase /* 2 */,
			Fragments._M5_2xlarge__Resource_tpl /* 3 */,
			Fragments._M5_2xlarge__Generalpurpose /* 4 */,
			Fragments._M5_2xlarge__M5_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M5_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M5_4xlarge =
		{
			Fragments._M5_4xlarge__OclAny /* 0 */,
			Fragments._M5_4xlarge__OclElement /* 1 */,
			Fragments._M5_4xlarge__MixinBase /* 2 */,
			Fragments._M5_4xlarge__Resource_tpl /* 3 */,
			Fragments._M5_4xlarge__Generalpurpose /* 4 */,
			Fragments._M5_4xlarge__M5_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M5_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M5_large =
		{
			Fragments._M5_large__OclAny /* 0 */,
			Fragments._M5_large__OclElement /* 1 */,
			Fragments._M5_large__MixinBase /* 2 */,
			Fragments._M5_large__Resource_tpl /* 3 */,
			Fragments._M5_large__Generalpurpose /* 4 */,
			Fragments._M5_large__M5_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __M5_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _M5_xlarge =
		{
			Fragments._M5_xlarge__OclAny /* 0 */,
			Fragments._M5_xlarge__OclElement /* 1 */,
			Fragments._M5_xlarge__MixinBase /* 2 */,
			Fragments._M5_xlarge__Resource_tpl /* 3 */,
			Fragments._M5_xlarge__Generalpurpose /* 4 */,
			Fragments._M5_xlarge__M5_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __M5_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Memoryoptimized =
		{
			Fragments._Memoryoptimized__OclAny /* 0 */,
			Fragments._Memoryoptimized__OclElement /* 1 */,
			Fragments._Memoryoptimized__MixinBase /* 2 */,
			Fragments._Memoryoptimized__Resource_tpl /* 3 */,
			Fragments._Memoryoptimized__Memoryoptimized /* 4 */
		};
		private static final int /*@NonNull*/ [] __Memoryoptimized = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MonitoringState =
		{
			Fragments._MonitoringState__OclAny /* 0 */,
			Fragments._MonitoringState__OclElement /* 1 */,
			Fragments._MonitoringState__OclType /* 2 */,
			Fragments._MonitoringState__OclEnumeration /* 3 */,
			Fragments._MonitoringState__MonitoringState /* 4 */
		};
		private static final int /*@NonNull*/ [] __MonitoringState = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _P2_16xlarge =
		{
			Fragments._P2_16xlarge__OclAny /* 0 */,
			Fragments._P2_16xlarge__OclElement /* 1 */,
			Fragments._P2_16xlarge__MixinBase /* 2 */,
			Fragments._P2_16xlarge__Resource_tpl /* 3 */,
			Fragments._P2_16xlarge__Acceleratedcomputing /* 4 */,
			Fragments._P2_16xlarge__P2_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __P2_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _P2_8xlarge =
		{
			Fragments._P2_8xlarge__OclAny /* 0 */,
			Fragments._P2_8xlarge__OclElement /* 1 */,
			Fragments._P2_8xlarge__MixinBase /* 2 */,
			Fragments._P2_8xlarge__Resource_tpl /* 3 */,
			Fragments._P2_8xlarge__Acceleratedcomputing /* 4 */,
			Fragments._P2_8xlarge__P2_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __P2_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _P2_xlarge =
		{
			Fragments._P2_xlarge__OclAny /* 0 */,
			Fragments._P2_xlarge__OclElement /* 1 */,
			Fragments._P2_xlarge__MixinBase /* 2 */,
			Fragments._P2_xlarge__Resource_tpl /* 3 */,
			Fragments._P2_xlarge__Acceleratedcomputing /* 4 */,
			Fragments._P2_xlarge__P2_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __P2_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _P3_16xlarge =
		{
			Fragments._P3_16xlarge__OclAny /* 0 */,
			Fragments._P3_16xlarge__OclElement /* 1 */,
			Fragments._P3_16xlarge__MixinBase /* 2 */,
			Fragments._P3_16xlarge__Resource_tpl /* 3 */,
			Fragments._P3_16xlarge__Acceleratedcomputing /* 4 */,
			Fragments._P3_16xlarge__P3_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __P3_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _P3_2xlarge =
		{
			Fragments._P3_2xlarge__OclAny /* 0 */,
			Fragments._P3_2xlarge__OclElement /* 1 */,
			Fragments._P3_2xlarge__MixinBase /* 2 */,
			Fragments._P3_2xlarge__Resource_tpl /* 3 */,
			Fragments._P3_2xlarge__Acceleratedcomputing /* 4 */,
			Fragments._P3_2xlarge__P3_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __P3_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _P3_8xlarge =
		{
			Fragments._P3_8xlarge__OclAny /* 0 */,
			Fragments._P3_8xlarge__OclElement /* 1 */,
			Fragments._P3_8xlarge__MixinBase /* 2 */,
			Fragments._P3_8xlarge__Resource_tpl /* 3 */,
			Fragments._P3_8xlarge__Acceleratedcomputing /* 4 */,
			Fragments._P3_8xlarge__P3_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __P3_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Placementgroup =
		{
			Fragments._Placementgroup__OclAny /* 0 */,
			Fragments._Placementgroup__OclElement /* 1 */,
			Fragments._Placementgroup__MixinBase /* 2 */,
			Fragments._Placementgroup__Placementgroup /* 3 */
		};
		private static final int /*@NonNull*/ [] __Placementgroup = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R3_2xlarge =
		{
			Fragments._R3_2xlarge__OclAny /* 0 */,
			Fragments._R3_2xlarge__OclElement /* 1 */,
			Fragments._R3_2xlarge__MixinBase /* 2 */,
			Fragments._R3_2xlarge__Resource_tpl /* 3 */,
			Fragments._R3_2xlarge__Memoryoptimized /* 4 */,
			Fragments._R3_2xlarge__R3_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R3_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R3_4xlarge =
		{
			Fragments._R3_4xlarge__OclAny /* 0 */,
			Fragments._R3_4xlarge__OclElement /* 1 */,
			Fragments._R3_4xlarge__MixinBase /* 2 */,
			Fragments._R3_4xlarge__Resource_tpl /* 3 */,
			Fragments._R3_4xlarge__Memoryoptimized /* 4 */,
			Fragments._R3_4xlarge__R3_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R3_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R3_8xlarge =
		{
			Fragments._R3_8xlarge__OclAny /* 0 */,
			Fragments._R3_8xlarge__OclElement /* 1 */,
			Fragments._R3_8xlarge__MixinBase /* 2 */,
			Fragments._R3_8xlarge__Resource_tpl /* 3 */,
			Fragments._R3_8xlarge__Memoryoptimized /* 4 */,
			Fragments._R3_8xlarge__R3_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R3_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R3_large =
		{
			Fragments._R3_large__OclAny /* 0 */,
			Fragments._R3_large__OclElement /* 1 */,
			Fragments._R3_large__MixinBase /* 2 */,
			Fragments._R3_large__Resource_tpl /* 3 */,
			Fragments._R3_large__Memoryoptimized /* 4 */,
			Fragments._R3_large__R3_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __R3_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R3_xlarge =
		{
			Fragments._R3_xlarge__OclAny /* 0 */,
			Fragments._R3_xlarge__OclElement /* 1 */,
			Fragments._R3_xlarge__MixinBase /* 2 */,
			Fragments._R3_xlarge__Resource_tpl /* 3 */,
			Fragments._R3_xlarge__Memoryoptimized /* 4 */,
			Fragments._R3_xlarge__R3_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R3_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R4_16xlarge =
		{
			Fragments._R4_16xlarge__OclAny /* 0 */,
			Fragments._R4_16xlarge__OclElement /* 1 */,
			Fragments._R4_16xlarge__MixinBase /* 2 */,
			Fragments._R4_16xlarge__Resource_tpl /* 3 */,
			Fragments._R4_16xlarge__Memoryoptimized /* 4 */,
			Fragments._R4_16xlarge__R4_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R4_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R4_2xlarge =
		{
			Fragments._R4_2xlarge__OclAny /* 0 */,
			Fragments._R4_2xlarge__OclElement /* 1 */,
			Fragments._R4_2xlarge__MixinBase /* 2 */,
			Fragments._R4_2xlarge__Resource_tpl /* 3 */,
			Fragments._R4_2xlarge__Memoryoptimized /* 4 */,
			Fragments._R4_2xlarge__R4_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R4_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R4_4xlarge =
		{
			Fragments._R4_4xlarge__OclAny /* 0 */,
			Fragments._R4_4xlarge__OclElement /* 1 */,
			Fragments._R4_4xlarge__MixinBase /* 2 */,
			Fragments._R4_4xlarge__Resource_tpl /* 3 */,
			Fragments._R4_4xlarge__Memoryoptimized /* 4 */,
			Fragments._R4_4xlarge__R4_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R4_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R4_8xlarge =
		{
			Fragments._R4_8xlarge__OclAny /* 0 */,
			Fragments._R4_8xlarge__OclElement /* 1 */,
			Fragments._R4_8xlarge__MixinBase /* 2 */,
			Fragments._R4_8xlarge__Resource_tpl /* 3 */,
			Fragments._R4_8xlarge__Memoryoptimized /* 4 */,
			Fragments._R4_8xlarge__R4_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R4_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R4_large =
		{
			Fragments._R4_large__OclAny /* 0 */,
			Fragments._R4_large__OclElement /* 1 */,
			Fragments._R4_large__MixinBase /* 2 */,
			Fragments._R4_large__Resource_tpl /* 3 */,
			Fragments._R4_large__Memoryoptimized /* 4 */,
			Fragments._R4_large__R4_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __R4_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _R4_xlarge =
		{
			Fragments._R4_xlarge__OclAny /* 0 */,
			Fragments._R4_xlarge__OclElement /* 1 */,
			Fragments._R4_xlarge__MixinBase /* 2 */,
			Fragments._R4_xlarge__Resource_tpl /* 3 */,
			Fragments._R4_xlarge__Memoryoptimized /* 4 */,
			Fragments._R4_xlarge__R4_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __R4_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rootdevicevolume =
		{
			Fragments._Rootdevicevolume__OclAny /* 0 */,
			Fragments._Rootdevicevolume__OclElement /* 1 */,
			Fragments._Rootdevicevolume__MixinBase /* 2 */,
			Fragments._Rootdevicevolume__Rootdevicevolume /* 3 */
		};
		private static final int /*@NonNull*/ [] __Rootdevicevolume = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sa_east_1 =
		{
			Fragments._Sa_east_1__OclAny /* 0 */,
			Fragments._Sa_east_1__OclElement /* 1 */,
			Fragments._Sa_east_1__MixinBase /* 2 */,
			Fragments._Sa_east_1__Sa_east_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Sa_east_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Statustransitionreason =
		{
			Fragments._Statustransitionreason__OclAny /* 0 */,
			Fragments._Statustransitionreason__OclElement /* 1 */,
			Fragments._Statustransitionreason__MixinBase /* 2 */,
			Fragments._Statustransitionreason__Statustransitionreason /* 3 */
		};
		private static final int /*@NonNull*/ [] __Statustransitionreason = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Storageoptimized =
		{
			Fragments._Storageoptimized__OclAny /* 0 */,
			Fragments._Storageoptimized__OclElement /* 1 */,
			Fragments._Storageoptimized__MixinBase /* 2 */,
			Fragments._Storageoptimized__Resource_tpl /* 3 */,
			Fragments._Storageoptimized__Storageoptimized /* 4 */
		};
		private static final int /*@NonNull*/ [] __Storageoptimized = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T1_micro =
		{
			Fragments._T1_micro__OclAny /* 0 */,
			Fragments._T1_micro__OclElement /* 1 */,
			Fragments._T1_micro__MixinBase /* 2 */,
			Fragments._T1_micro__Resource_tpl /* 3 */,
			Fragments._T1_micro__Generalpurpose /* 4 */,
			Fragments._T1_micro__T1_micro /* 5 */
		};
		private static final int /*@NonNull*/ [] __T1_micro = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T2_2xlarge =
		{
			Fragments._T2_2xlarge__OclAny /* 0 */,
			Fragments._T2_2xlarge__OclElement /* 1 */,
			Fragments._T2_2xlarge__MixinBase /* 2 */,
			Fragments._T2_2xlarge__Resource_tpl /* 3 */,
			Fragments._T2_2xlarge__Generalpurpose /* 4 */,
			Fragments._T2_2xlarge__T2_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __T2_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T2_large =
		{
			Fragments._T2_large__OclAny /* 0 */,
			Fragments._T2_large__OclElement /* 1 */,
			Fragments._T2_large__MixinBase /* 2 */,
			Fragments._T2_large__Resource_tpl /* 3 */,
			Fragments._T2_large__Generalpurpose /* 4 */,
			Fragments._T2_large__T2_large /* 5 */
		};
		private static final int /*@NonNull*/ [] __T2_large = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T2_medium =
		{
			Fragments._T2_medium__OclAny /* 0 */,
			Fragments._T2_medium__OclElement /* 1 */,
			Fragments._T2_medium__MixinBase /* 2 */,
			Fragments._T2_medium__Resource_tpl /* 3 */,
			Fragments._T2_medium__Generalpurpose /* 4 */,
			Fragments._T2_medium__T2_medium /* 5 */
		};
		private static final int /*@NonNull*/ [] __T2_medium = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T2_micro =
		{
			Fragments._T2_micro__OclAny /* 0 */,
			Fragments._T2_micro__OclElement /* 1 */,
			Fragments._T2_micro__MixinBase /* 2 */,
			Fragments._T2_micro__Resource_tpl /* 3 */,
			Fragments._T2_micro__Generalpurpose /* 4 */,
			Fragments._T2_micro__T2_micro /* 5 */
		};
		private static final int /*@NonNull*/ [] __T2_micro = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T2_nano =
		{
			Fragments._T2_nano__OclAny /* 0 */,
			Fragments._T2_nano__OclElement /* 1 */,
			Fragments._T2_nano__MixinBase /* 2 */,
			Fragments._T2_nano__Resource_tpl /* 3 */,
			Fragments._T2_nano__Generalpurpose /* 4 */,
			Fragments._T2_nano__T2_nano /* 5 */
		};
		private static final int /*@NonNull*/ [] __T2_nano = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T2_small =
		{
			Fragments._T2_small__OclAny /* 0 */,
			Fragments._T2_small__OclElement /* 1 */,
			Fragments._T2_small__MixinBase /* 2 */,
			Fragments._T2_small__Resource_tpl /* 3 */,
			Fragments._T2_small__Generalpurpose /* 4 */,
			Fragments._T2_small__T2_small /* 5 */
		};
		private static final int /*@NonNull*/ [] __T2_small = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _T2_xlarge =
		{
			Fragments._T2_xlarge__OclAny /* 0 */,
			Fragments._T2_xlarge__OclElement /* 1 */,
			Fragments._T2_xlarge__MixinBase /* 2 */,
			Fragments._T2_xlarge__Resource_tpl /* 3 */,
			Fragments._T2_xlarge__Generalpurpose /* 4 */,
			Fragments._T2_xlarge__T2_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __T2_xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tags =
		{
			Fragments._Tags__OclAny /* 0 */,
			Fragments._Tags__OclElement /* 1 */,
			Fragments._Tags__MixinBase /* 2 */,
			Fragments._Tags__Tags /* 3 */
		};
		private static final int /*@NonNull*/ [] __Tags = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_east_1 =
		{
			Fragments._Us_east_1__OclAny /* 0 */,
			Fragments._Us_east_1__OclElement /* 1 */,
			Fragments._Us_east_1__MixinBase /* 2 */,
			Fragments._Us_east_1__Us_east_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Us_east_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_east_2 =
		{
			Fragments._Us_east_2__OclAny /* 0 */,
			Fragments._Us_east_2__OclElement /* 1 */,
			Fragments._Us_east_2__MixinBase /* 2 */,
			Fragments._Us_east_2__Us_east_2 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Us_east_2 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_west_1 =
		{
			Fragments._Us_west_1__OclAny /* 0 */,
			Fragments._Us_west_1__OclElement /* 1 */,
			Fragments._Us_west_1__MixinBase /* 2 */,
			Fragments._Us_west_1__Us_west_1 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Us_west_1 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_west_2 =
		{
			Fragments._Us_west_2__OclAny /* 0 */,
			Fragments._Us_west_2__OclElement /* 1 */,
			Fragments._Us_west_2__MixinBase /* 2 */,
			Fragments._Us_west_2__Us_west_2 /* 3 */
		};
		private static final int /*@NonNull*/ [] __Us_west_2 = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VirtualizationType =
		{
			Fragments._VirtualizationType__OclAny /* 0 */,
			Fragments._VirtualizationType__OclElement /* 1 */,
			Fragments._VirtualizationType__OclType /* 2 */,
			Fragments._VirtualizationType__OclEnumeration /* 3 */,
			Fragments._VirtualizationType__VirtualizationType /* 4 */
		};
		private static final int /*@NonNull*/ [] __VirtualizationType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1_16xlarge =
		{
			Fragments._X1_16xlarge__OclAny /* 0 */,
			Fragments._X1_16xlarge__OclElement /* 1 */,
			Fragments._X1_16xlarge__MixinBase /* 2 */,
			Fragments._X1_16xlarge__Resource_tpl /* 3 */,
			Fragments._X1_16xlarge__Memoryoptimized /* 4 */,
			Fragments._X1_16xlarge__X1_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1_32xlarge =
		{
			Fragments._X1_32xlarge__OclAny /* 0 */,
			Fragments._X1_32xlarge__OclElement /* 1 */,
			Fragments._X1_32xlarge__MixinBase /* 2 */,
			Fragments._X1_32xlarge__Resource_tpl /* 3 */,
			Fragments._X1_32xlarge__Memoryoptimized /* 4 */,
			Fragments._X1_32xlarge__X1_32xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1_32xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1e_16xlarge =
		{
			Fragments._X1e_16xlarge__OclAny /* 0 */,
			Fragments._X1e_16xlarge__OclElement /* 1 */,
			Fragments._X1e_16xlarge__MixinBase /* 2 */,
			Fragments._X1e_16xlarge__Resource_tpl /* 3 */,
			Fragments._X1e_16xlarge__Memoryoptimized /* 4 */,
			Fragments._X1e_16xlarge__X1e_16xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1e_16xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1e_2xlarge =
		{
			Fragments._X1e_2xlarge__OclAny /* 0 */,
			Fragments._X1e_2xlarge__OclElement /* 1 */,
			Fragments._X1e_2xlarge__MixinBase /* 2 */,
			Fragments._X1e_2xlarge__Resource_tpl /* 3 */,
			Fragments._X1e_2xlarge__Memoryoptimized /* 4 */,
			Fragments._X1e_2xlarge__X1e_2xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1e_2xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1e_32xlarge =
		{
			Fragments._X1e_32xlarge__OclAny /* 0 */,
			Fragments._X1e_32xlarge__OclElement /* 1 */,
			Fragments._X1e_32xlarge__MixinBase /* 2 */,
			Fragments._X1e_32xlarge__Resource_tpl /* 3 */,
			Fragments._X1e_32xlarge__Memoryoptimized /* 4 */,
			Fragments._X1e_32xlarge__X1e_32xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1e_32xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1e_4xlarge =
		{
			Fragments._X1e_4xlarge__OclAny /* 0 */,
			Fragments._X1e_4xlarge__OclElement /* 1 */,
			Fragments._X1e_4xlarge__MixinBase /* 2 */,
			Fragments._X1e_4xlarge__Resource_tpl /* 3 */,
			Fragments._X1e_4xlarge__Memoryoptimized /* 4 */,
			Fragments._X1e_4xlarge__X1e_4xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1e_4xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1e_8xlarge =
		{
			Fragments._X1e_8xlarge__OclAny /* 0 */,
			Fragments._X1e_8xlarge__OclElement /* 1 */,
			Fragments._X1e_8xlarge__MixinBase /* 2 */,
			Fragments._X1e_8xlarge__Resource_tpl /* 3 */,
			Fragments._X1e_8xlarge__Memoryoptimized /* 4 */,
			Fragments._X1e_8xlarge__X1e_8xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1e_8xlarge = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _X1e_xlarge =
		{
			Fragments._X1e_xlarge__OclAny /* 0 */,
			Fragments._X1e_xlarge__OclElement /* 1 */,
			Fragments._X1e_xlarge__MixinBase /* 2 */,
			Fragments._X1e_xlarge__Resource_tpl /* 3 */,
			Fragments._X1e_xlarge__Memoryoptimized /* 4 */,
			Fragments._X1e_xlarge__X1e_xlarge /* 5 */
		};
		private static final int /*@NonNull*/ [] __X1e_xlarge = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AWSInstanceState.initFragments(_AWSInstanceState, __AWSInstanceState);
			Types._Acceleratedcomputing.initFragments(_Acceleratedcomputing, __Acceleratedcomputing);
			Types._Ap_northeast_1.initFragments(_Ap_northeast_1, __Ap_northeast_1);
			Types._Ap_northeast_2.initFragments(_Ap_northeast_2, __Ap_northeast_2);
			Types._Ap_south_1.initFragments(_Ap_south_1, __Ap_south_1);
			Types._Ap_south_east2.initFragments(_Ap_south_east2, __Ap_south_east2);
			Types._Ap_southeast_1.initFragments(_Ap_southeast_1, __Ap_southeast_1);
			Types._Awsaccount.initFragments(_Awsaccount, __Awsaccount);
			Types._Awscredential.initFragments(_Awscredential, __Awscredential);
			Types._C1_medium.initFragments(_C1_medium, __C1_medium);
			Types._C1_xlarge.initFragments(_C1_xlarge, __C1_xlarge);
			Types._C3_2xlarge.initFragments(_C3_2xlarge, __C3_2xlarge);
			Types._C3_4xlarge.initFragments(_C3_4xlarge, __C3_4xlarge);
			Types._C3_8xlarge.initFragments(_C3_8xlarge, __C3_8xlarge);
			Types._C3_large.initFragments(_C3_large, __C3_large);
			Types._C3_xlarge.initFragments(_C3_xlarge, __C3_xlarge);
			Types._C4_2xlarge.initFragments(_C4_2xlarge, __C4_2xlarge);
			Types._C4_4xlarge.initFragments(_C4_4xlarge, __C4_4xlarge);
			Types._C4_8xlarge.initFragments(_C4_8xlarge, __C4_8xlarge);
			Types._C4_large.initFragments(_C4_large, __C4_large);
			Types._C4_xlarge.initFragments(_C4_xlarge, __C4_xlarge);
			Types._C5_18xlarge.initFragments(_C5_18xlarge, __C5_18xlarge);
			Types._C5_2xlarge.initFragments(_C5_2xlarge, __C5_2xlarge);
			Types._C5_4xlarge.initFragments(_C5_4xlarge, __C5_4xlarge);
			Types._C5_9xlarge.initFragments(_C5_9xlarge, __C5_9xlarge);
			Types._C5_large.initFragments(_C5_large, __C5_large);
			Types._C5_xlarge.initFragments(_C5_xlarge, __C5_xlarge);
			Types._Ca_central_1.initFragments(_Ca_central_1, __Ca_central_1);
			Types._Cc2_8xlarge.initFragments(_Cc2_8xlarge, __Cc2_8xlarge);
			Types._Cg1_4xlarge.initFragments(_Cg1_4xlarge, __Cg1_4xlarge);
			Types._Computeoptimized.initFragments(_Computeoptimized, __Computeoptimized);
			Types._Cr1_8xlarge.initFragments(_Cr1_8xlarge, __Cr1_8xlarge);
			Types._D2_2xlarge.initFragments(_D2_2xlarge, __D2_2xlarge);
			Types._D2_4xlarge.initFragments(_D2_4xlarge, __D2_4xlarge);
			Types._D2_8xlarge.initFragments(_D2_8xlarge, __D2_8xlarge);
			Types._D2_xlarge.initFragments(_D2_xlarge, __D2_xlarge);
			Types._Eu_central_1.initFragments(_Eu_central_1, __Eu_central_1);
			Types._Eu_west_1.initFragments(_Eu_west_1, __Eu_west_1);
			Types._Eu_west_2.initFragments(_Eu_west_2, __Eu_west_2);
			Types._Eu_west_3.initFragments(_Eu_west_3, __Eu_west_3);
			Types._Europe.initFragments(_Europe, __Europe);
			Types._F1_16xlarge.initFragments(_F1_16xlarge, __F1_16xlarge);
			Types._F1_2xlarge.initFragments(_F1_2xlarge, __F1_2xlarge);
			Types._G2_2xlarge.initFragments(_G2_2xlarge, __G2_2xlarge);
			Types._G2_8xlarge.initFragments(_G2_8xlarge, __G2_8xlarge);
			Types._G3_16xlarge.initFragments(_G3_16xlarge, __G3_16xlarge);
			Types._G3_4xlarge.initFragments(_G3_4xlarge, __G3_4xlarge);
			Types._G3_8xlarge.initFragments(_G3_8xlarge, __G3_8xlarge);
			Types._Generalpurpose.initFragments(_Generalpurpose, __Generalpurpose);
			Types._H1_16xlarge.initFragments(_H1_16xlarge, __H1_16xlarge);
			Types._H1_2xlarge.initFragments(_H1_2xlarge, __H1_2xlarge);
			Types._H1_4xlarge.initFragments(_H1_4xlarge, __H1_4xlarge);
			Types._H1_8xlarge.initFragments(_H1_8xlarge, __H1_8xlarge);
			Types._Hs1_8xlarge.initFragments(_Hs1_8xlarge, __Hs1_8xlarge);
			Types._HypervisorType.initFragments(_HypervisorType, __HypervisorType);
			Types._I2_2xlarge.initFragments(_I2_2xlarge, __I2_2xlarge);
			Types._I2_4xlarge.initFragments(_I2_4xlarge, __I2_4xlarge);
			Types._I2_8xlarge.initFragments(_I2_8xlarge, __I2_8xlarge);
			Types._I2_xlarge.initFragments(_I2_xlarge, __I2_xlarge);
			Types._I3_16xlarge.initFragments(_I3_16xlarge, __I3_16xlarge);
			Types._I3_2xlarge.initFragments(_I3_2xlarge, __I3_2xlarge);
			Types._I3_4xlarge.initFragments(_I3_4xlarge, __I3_4xlarge);
			Types._I3_8xlarge.initFragments(_I3_8xlarge, __I3_8xlarge);
			Types._I3_large.initFragments(_I3_large, __I3_large);
			Types._I3_metal.initFragments(_I3_metal, __I3_metal);
			Types._I3_xlarge.initFragments(_I3_xlarge, __I3_xlarge);
			Types._InstanceLifeCycleType.initFragments(_InstanceLifeCycleType, __InstanceLifeCycleType);
			Types._Instanceec2.initFragments(_Instanceec2, __Instanceec2);
			Types._Instancevpcinfo.initFragments(_Instancevpcinfo, __Instancevpcinfo);
			Types._M1_large.initFragments(_M1_large, __M1_large);
			Types._M1_medium.initFragments(_M1_medium, __M1_medium);
			Types._M1_small.initFragments(_M1_small, __M1_small);
			Types._M1_xlarge.initFragments(_M1_xlarge, __M1_xlarge);
			Types._M2_2xlarge.initFragments(_M2_2xlarge, __M2_2xlarge);
			Types._M2_4xlarge.initFragments(_M2_4xlarge, __M2_4xlarge);
			Types._M2_xlarge.initFragments(_M2_xlarge, __M2_xlarge);
			Types._M3_2xlarge.initFragments(_M3_2xlarge, __M3_2xlarge);
			Types._M3_large.initFragments(_M3_large, __M3_large);
			Types._M3_medium.initFragments(_M3_medium, __M3_medium);
			Types._M3_xlarge.initFragments(_M3_xlarge, __M3_xlarge);
			Types._M4_10xlarge.initFragments(_M4_10xlarge, __M4_10xlarge);
			Types._M4_16xlarge.initFragments(_M4_16xlarge, __M4_16xlarge);
			Types._M4_2xlarge.initFragments(_M4_2xlarge, __M4_2xlarge);
			Types._M4_large.initFragments(_M4_large, __M4_large);
			Types._M4_xlarge.initFragments(_M4_xlarge, __M4_xlarge);
			Types._M5_12xlarge.initFragments(_M5_12xlarge, __M5_12xlarge);
			Types._M5_24xlarge.initFragments(_M5_24xlarge, __M5_24xlarge);
			Types._M5_2xlarge.initFragments(_M5_2xlarge, __M5_2xlarge);
			Types._M5_4xlarge.initFragments(_M5_4xlarge, __M5_4xlarge);
			Types._M5_large.initFragments(_M5_large, __M5_large);
			Types._M5_xlarge.initFragments(_M5_xlarge, __M5_xlarge);
			Types._Memoryoptimized.initFragments(_Memoryoptimized, __Memoryoptimized);
			Types._MonitoringState.initFragments(_MonitoringState, __MonitoringState);
			Types._P2_16xlarge.initFragments(_P2_16xlarge, __P2_16xlarge);
			Types._P2_8xlarge.initFragments(_P2_8xlarge, __P2_8xlarge);
			Types._P2_xlarge.initFragments(_P2_xlarge, __P2_xlarge);
			Types._P3_16xlarge.initFragments(_P3_16xlarge, __P3_16xlarge);
			Types._P3_2xlarge.initFragments(_P3_2xlarge, __P3_2xlarge);
			Types._P3_8xlarge.initFragments(_P3_8xlarge, __P3_8xlarge);
			Types._Placementgroup.initFragments(_Placementgroup, __Placementgroup);
			Types._R3_2xlarge.initFragments(_R3_2xlarge, __R3_2xlarge);
			Types._R3_4xlarge.initFragments(_R3_4xlarge, __R3_4xlarge);
			Types._R3_8xlarge.initFragments(_R3_8xlarge, __R3_8xlarge);
			Types._R3_large.initFragments(_R3_large, __R3_large);
			Types._R3_xlarge.initFragments(_R3_xlarge, __R3_xlarge);
			Types._R4_16xlarge.initFragments(_R4_16xlarge, __R4_16xlarge);
			Types._R4_2xlarge.initFragments(_R4_2xlarge, __R4_2xlarge);
			Types._R4_4xlarge.initFragments(_R4_4xlarge, __R4_4xlarge);
			Types._R4_8xlarge.initFragments(_R4_8xlarge, __R4_8xlarge);
			Types._R4_large.initFragments(_R4_large, __R4_large);
			Types._R4_xlarge.initFragments(_R4_xlarge, __R4_xlarge);
			Types._Rootdevicevolume.initFragments(_Rootdevicevolume, __Rootdevicevolume);
			Types._Sa_east_1.initFragments(_Sa_east_1, __Sa_east_1);
			Types._Statustransitionreason.initFragments(_Statustransitionreason, __Statustransitionreason);
			Types._Storageoptimized.initFragments(_Storageoptimized, __Storageoptimized);
			Types._T1_micro.initFragments(_T1_micro, __T1_micro);
			Types._T2_2xlarge.initFragments(_T2_2xlarge, __T2_2xlarge);
			Types._T2_large.initFragments(_T2_large, __T2_large);
			Types._T2_medium.initFragments(_T2_medium, __T2_medium);
			Types._T2_micro.initFragments(_T2_micro, __T2_micro);
			Types._T2_nano.initFragments(_T2_nano, __T2_nano);
			Types._T2_small.initFragments(_T2_small, __T2_small);
			Types._T2_xlarge.initFragments(_T2_xlarge, __T2_xlarge);
			Types._Tags.initFragments(_Tags, __Tags);
			Types._Us_east_1.initFragments(_Us_east_1, __Us_east_1);
			Types._Us_east_2.initFragments(_Us_east_2, __Us_east_2);
			Types._Us_west_1.initFragments(_Us_west_1, __Us_west_1);
			Types._Us_west_2.initFragments(_Us_west_2, __Us_west_2);
			Types._VirtualizationType.initFragments(_VirtualizationType, __VirtualizationType);
			Types._X1_16xlarge.initFragments(_X1_16xlarge, __X1_16xlarge);
			Types._X1_32xlarge.initFragments(_X1_32xlarge, __X1_32xlarge);
			Types._X1e_16xlarge.initFragments(_X1e_16xlarge, __X1e_16xlarge);
			Types._X1e_2xlarge.initFragments(_X1e_2xlarge, __X1e_2xlarge);
			Types._X1e_32xlarge.initFragments(_X1e_32xlarge, __X1e_32xlarge);
			Types._X1e_4xlarge.initFragments(_X1e_4xlarge, __X1e_4xlarge);
			Types._X1e_8xlarge.initFragments(_X1e_8xlarge, __X1e_8xlarge);
			Types._X1e_xlarge.initFragments(_X1e_xlarge, __X1e_xlarge);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AWSInstanceState__AWSInstanceState = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AWSInstanceState__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AWSInstanceState__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AWSInstanceState__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AWSInstanceState__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Acceleratedcomputing__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Acceleratedcomputing__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Acceleratedcomputing__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Acceleratedcomputing__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Acceleratedcomputing__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_1__Ap_northeast_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_2__Ap_northeast_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_1__Ap_south_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_east2__Ap_south_east2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_east2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_east2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_east2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_southeast_1__Ap_southeast_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_southeast_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_southeast_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_southeast_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awsaccount__Awsaccount = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awsaccount__Cloudaccount = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awsaccount__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awsaccount__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awsaccount__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awsaccount__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awscredential__Awscredential = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awscredential__Cloudcredential = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awscredential__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awscredential__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Awscredential__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_medium__C1_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_medium__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_medium__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_xlarge__C1_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C1_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_2xlarge__C3_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_2xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_4xlarge__C3_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_4xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_8xlarge__C3_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_8xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_large__C3_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_large__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_xlarge__C3_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C3_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_2xlarge__C4_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_2xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_4xlarge__C4_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_4xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_8xlarge__C4_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_8xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_large__C4_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_large__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_xlarge__C4_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C4_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_18xlarge__C5_18xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_18xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_18xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_18xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_18xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_18xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_2xlarge__C5_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_2xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_4xlarge__C5_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_4xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_9xlarge__C5_9xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_9xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_9xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_9xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_9xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_9xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_large__C5_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_large__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_xlarge__C5_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _C5_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__Ca_central_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cc2_8xlarge__Cc2_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cc2_8xlarge__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cc2_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cc2_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cc2_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cc2_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cg1_4xlarge__Cg1_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cg1_4xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cg1_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cg1_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cg1_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cg1_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computeoptimized__Computeoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computeoptimized__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computeoptimized__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computeoptimized__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computeoptimized__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cr1_8xlarge__Cr1_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cr1_8xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cr1_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cr1_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cr1_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cr1_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_2xlarge__D2_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_2xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_2xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_4xlarge__D2_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_4xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_4xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_8xlarge__D2_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_8xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_8xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_xlarge__D2_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _D2_xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_central_1__Eu_central_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_central_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_central_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_central_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_1__Eu_west_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_2__Eu_west_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_3__Eu_west_3 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_3__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_3__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_3__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Europe__Europe = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Europe__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Europe__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Europe__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Europe__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_16xlarge__F1_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_16xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_2xlarge__F1_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_2xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _F1_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_2xlarge__G2_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_2xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_8xlarge__G2_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_8xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G2_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_16xlarge__G3_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_16xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_4xlarge__G3_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_4xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_8xlarge__G3_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_8xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _G3_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Generalpurpose__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Generalpurpose__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Generalpurpose__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Generalpurpose__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Generalpurpose__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_16xlarge__H1_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_16xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_16xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_2xlarge__H1_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_2xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_2xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_4xlarge__H1_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_4xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_4xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_8xlarge__H1_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_8xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _H1_8xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hs1_8xlarge__Hs1_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hs1_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hs1_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hs1_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hs1_8xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hs1_8xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HypervisorType__HypervisorType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HypervisorType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HypervisorType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HypervisorType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _HypervisorType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_2xlarge__I2_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_2xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_2xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_4xlarge__I2_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_4xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_4xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_8xlarge__I2_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_8xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_8xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_xlarge__I2_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I2_xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_16xlarge__I3_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_16xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_16xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_2xlarge__I3_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_2xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_2xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_4xlarge__I3_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_4xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_4xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_8xlarge__I3_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_8xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_8xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_large__I3_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_large__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_large__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_metal__I3_metal = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_metal__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_metal__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_metal__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_metal__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_metal__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_xlarge__I3_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_xlarge__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _I3_xlarge__Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceLifeCycleType__InstanceLifeCycleType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceLifeCycleType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceLifeCycleType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceLifeCycleType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _InstanceLifeCycleType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instanceec2__Instanceec2 = {
			Ec2Tables.Operations._Instanceec2__restart /* restart(RestartMethod[?]) */,
			Ec2Tables.Operations._Instanceec2__start /* start() */,
			Ec2Tables.Operations._Instanceec2__stop /* stop(StopMethod[?]) */,
			Ec2Tables.Operations._Instanceec2__terminate /* terminate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instanceec2__Compute = {
			Ec2Tables.Operations._Instanceec2__restart /* restart(RestartMethod[?]) */,
			Ec2Tables.Operations._Instanceec2__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			Ec2Tables.Operations._Instanceec2__start /* start() */,
			Ec2Tables.Operations._Instanceec2__start /* start() */,
			Ec2Tables.Operations._Instanceec2__stop /* stop(StopMethod[?]) */,
			Ec2Tables.Operations._Instanceec2__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instanceec2__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instanceec2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instanceec2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instanceec2__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevpcinfo__Instancevpcinfo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevpcinfo__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevpcinfo__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instancevpcinfo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_large__M1_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_large__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_medium__M1_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_medium__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_medium__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_small__M1_small = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_small__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_small__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_small__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_small__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_small__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_xlarge__M1_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M1_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_2xlarge__M2_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_2xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_4xlarge__M2_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_4xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_xlarge__M2_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M2_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_2xlarge__M3_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_2xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_large__M3_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_large__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_medium__M3_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_medium__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_medium__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_xlarge__M3_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M3_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_10xlarge__M4_10xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_10xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_10xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_10xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_10xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_10xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_16xlarge__M4_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_16xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_2xlarge__M4_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_2xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_large__M4_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_large__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_xlarge__M4_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M4_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_12xlarge__M5_12xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_12xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_12xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_12xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_12xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_12xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_24xlarge__M5_24xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_24xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_24xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_24xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_24xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_24xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_2xlarge__M5_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_2xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_4xlarge__M5_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_4xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_large__M5_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_large__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_xlarge__M5_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _M5_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryoptimized__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryoptimized__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryoptimized__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryoptimized__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Memoryoptimized__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitoringState__MonitoringState = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitoringState__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitoringState__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitoringState__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitoringState__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_16xlarge__P2_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_16xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_8xlarge__P2_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_8xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_xlarge__P2_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P2_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_16xlarge__P3_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_16xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_2xlarge__P3_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_2xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_8xlarge__P3_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_8xlarge__Acceleratedcomputing = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _P3_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Placementgroup__Placementgroup = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Placementgroup__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Placementgroup__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Placementgroup__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_2xlarge__R3_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_2xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_4xlarge__R3_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_4xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_8xlarge__R3_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_8xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_large__R3_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_large__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_xlarge__R3_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R3_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_16xlarge__R4_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_16xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_2xlarge__R4_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_2xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_4xlarge__R4_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_4xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_8xlarge__R4_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_8xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_large__R4_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_large__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_xlarge__R4_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _R4_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootdevicevolume__Rootdevicevolume = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootdevicevolume__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootdevicevolume__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rootdevicevolume__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sa_east_1__Sa_east_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sa_east_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sa_east_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sa_east_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statustransitionreason__Statustransitionreason = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statustransitionreason__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statustransitionreason__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statustransitionreason__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storageoptimized__Storageoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storageoptimized__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storageoptimized__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storageoptimized__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storageoptimized__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T1_micro__T1_micro = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T1_micro__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T1_micro__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T1_micro__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T1_micro__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T1_micro__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_2xlarge__T2_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_2xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_large__T2_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_large__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_medium__T2_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_medium__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_medium__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_micro__T2_micro = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_micro__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_micro__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_micro__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_micro__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_micro__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_nano__T2_nano = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_nano__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_nano__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_nano__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_nano__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_nano__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_small__T2_small = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_small__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_small__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_small__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_small__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_small__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_xlarge__T2_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_xlarge__Generalpurpose = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _T2_xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tags__Tags = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tags__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tags__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tags__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__Us_east_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__Us_east_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__Us_west_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__Us_west_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VirtualizationType__VirtualizationType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VirtualizationType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VirtualizationType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VirtualizationType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VirtualizationType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_16xlarge__X1_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_16xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_32xlarge__X1_32xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_32xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_32xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_32xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_32xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1_32xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_16xlarge__X1e_16xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_16xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_16xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_16xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_16xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_16xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_2xlarge__X1e_2xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_2xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_2xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_2xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_2xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_2xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_32xlarge__X1e_32xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_32xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_32xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_32xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_32xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_32xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_4xlarge__X1e_4xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_4xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_4xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_4xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_4xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_4xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_8xlarge__X1e_8xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_8xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_8xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_8xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_8xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_8xlarge__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_xlarge__X1e_xlarge = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_xlarge__Memoryoptimized = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_xlarge__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_xlarge__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_xlarge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _X1e_xlarge__Resource_tpl = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AWSInstanceState__AWSInstanceState.initOperations(_AWSInstanceState__AWSInstanceState);
			Fragments._AWSInstanceState__OclAny.initOperations(_AWSInstanceState__OclAny);
			Fragments._AWSInstanceState__OclElement.initOperations(_AWSInstanceState__OclElement);
			Fragments._AWSInstanceState__OclEnumeration.initOperations(_AWSInstanceState__OclEnumeration);
			Fragments._AWSInstanceState__OclType.initOperations(_AWSInstanceState__OclType);

			Fragments._Acceleratedcomputing__Acceleratedcomputing.initOperations(_Acceleratedcomputing__Acceleratedcomputing);
			Fragments._Acceleratedcomputing__MixinBase.initOperations(_Acceleratedcomputing__MixinBase);
			Fragments._Acceleratedcomputing__OclAny.initOperations(_Acceleratedcomputing__OclAny);
			Fragments._Acceleratedcomputing__OclElement.initOperations(_Acceleratedcomputing__OclElement);
			Fragments._Acceleratedcomputing__Resource_tpl.initOperations(_Acceleratedcomputing__Resource_tpl);

			Fragments._Ap_northeast_1__Ap_northeast_1.initOperations(_Ap_northeast_1__Ap_northeast_1);
			Fragments._Ap_northeast_1__MixinBase.initOperations(_Ap_northeast_1__MixinBase);
			Fragments._Ap_northeast_1__OclAny.initOperations(_Ap_northeast_1__OclAny);
			Fragments._Ap_northeast_1__OclElement.initOperations(_Ap_northeast_1__OclElement);

			Fragments._Ap_northeast_2__Ap_northeast_2.initOperations(_Ap_northeast_2__Ap_northeast_2);
			Fragments._Ap_northeast_2__MixinBase.initOperations(_Ap_northeast_2__MixinBase);
			Fragments._Ap_northeast_2__OclAny.initOperations(_Ap_northeast_2__OclAny);
			Fragments._Ap_northeast_2__OclElement.initOperations(_Ap_northeast_2__OclElement);

			Fragments._Ap_south_1__Ap_south_1.initOperations(_Ap_south_1__Ap_south_1);
			Fragments._Ap_south_1__MixinBase.initOperations(_Ap_south_1__MixinBase);
			Fragments._Ap_south_1__OclAny.initOperations(_Ap_south_1__OclAny);
			Fragments._Ap_south_1__OclElement.initOperations(_Ap_south_1__OclElement);

			Fragments._Ap_south_east2__Ap_south_east2.initOperations(_Ap_south_east2__Ap_south_east2);
			Fragments._Ap_south_east2__MixinBase.initOperations(_Ap_south_east2__MixinBase);
			Fragments._Ap_south_east2__OclAny.initOperations(_Ap_south_east2__OclAny);
			Fragments._Ap_south_east2__OclElement.initOperations(_Ap_south_east2__OclElement);

			Fragments._Ap_southeast_1__Ap_southeast_1.initOperations(_Ap_southeast_1__Ap_southeast_1);
			Fragments._Ap_southeast_1__MixinBase.initOperations(_Ap_southeast_1__MixinBase);
			Fragments._Ap_southeast_1__OclAny.initOperations(_Ap_southeast_1__OclAny);
			Fragments._Ap_southeast_1__OclElement.initOperations(_Ap_southeast_1__OclElement);

			Fragments._Awsaccount__Awsaccount.initOperations(_Awsaccount__Awsaccount);
			Fragments._Awsaccount__Cloudaccount.initOperations(_Awsaccount__Cloudaccount);
			Fragments._Awsaccount__Entity.initOperations(_Awsaccount__Entity);
			Fragments._Awsaccount__OclAny.initOperations(_Awsaccount__OclAny);
			Fragments._Awsaccount__OclElement.initOperations(_Awsaccount__OclElement);
			Fragments._Awsaccount__Resource.initOperations(_Awsaccount__Resource);

			Fragments._Awscredential__Awscredential.initOperations(_Awscredential__Awscredential);
			Fragments._Awscredential__Cloudcredential.initOperations(_Awscredential__Cloudcredential);
			Fragments._Awscredential__MixinBase.initOperations(_Awscredential__MixinBase);
			Fragments._Awscredential__OclAny.initOperations(_Awscredential__OclAny);
			Fragments._Awscredential__OclElement.initOperations(_Awscredential__OclElement);

			Fragments._C1_medium__C1_medium.initOperations(_C1_medium__C1_medium);
			Fragments._C1_medium__Computeoptimized.initOperations(_C1_medium__Computeoptimized);
			Fragments._C1_medium__MixinBase.initOperations(_C1_medium__MixinBase);
			Fragments._C1_medium__OclAny.initOperations(_C1_medium__OclAny);
			Fragments._C1_medium__OclElement.initOperations(_C1_medium__OclElement);
			Fragments._C1_medium__Resource_tpl.initOperations(_C1_medium__Resource_tpl);

			Fragments._C1_xlarge__C1_xlarge.initOperations(_C1_xlarge__C1_xlarge);
			Fragments._C1_xlarge__Computeoptimized.initOperations(_C1_xlarge__Computeoptimized);
			Fragments._C1_xlarge__MixinBase.initOperations(_C1_xlarge__MixinBase);
			Fragments._C1_xlarge__OclAny.initOperations(_C1_xlarge__OclAny);
			Fragments._C1_xlarge__OclElement.initOperations(_C1_xlarge__OclElement);
			Fragments._C1_xlarge__Resource_tpl.initOperations(_C1_xlarge__Resource_tpl);

			Fragments._C3_2xlarge__C3_2xlarge.initOperations(_C3_2xlarge__C3_2xlarge);
			Fragments._C3_2xlarge__Computeoptimized.initOperations(_C3_2xlarge__Computeoptimized);
			Fragments._C3_2xlarge__MixinBase.initOperations(_C3_2xlarge__MixinBase);
			Fragments._C3_2xlarge__OclAny.initOperations(_C3_2xlarge__OclAny);
			Fragments._C3_2xlarge__OclElement.initOperations(_C3_2xlarge__OclElement);
			Fragments._C3_2xlarge__Resource_tpl.initOperations(_C3_2xlarge__Resource_tpl);

			Fragments._C3_4xlarge__C3_4xlarge.initOperations(_C3_4xlarge__C3_4xlarge);
			Fragments._C3_4xlarge__Computeoptimized.initOperations(_C3_4xlarge__Computeoptimized);
			Fragments._C3_4xlarge__MixinBase.initOperations(_C3_4xlarge__MixinBase);
			Fragments._C3_4xlarge__OclAny.initOperations(_C3_4xlarge__OclAny);
			Fragments._C3_4xlarge__OclElement.initOperations(_C3_4xlarge__OclElement);
			Fragments._C3_4xlarge__Resource_tpl.initOperations(_C3_4xlarge__Resource_tpl);

			Fragments._C3_8xlarge__C3_8xlarge.initOperations(_C3_8xlarge__C3_8xlarge);
			Fragments._C3_8xlarge__Computeoptimized.initOperations(_C3_8xlarge__Computeoptimized);
			Fragments._C3_8xlarge__MixinBase.initOperations(_C3_8xlarge__MixinBase);
			Fragments._C3_8xlarge__OclAny.initOperations(_C3_8xlarge__OclAny);
			Fragments._C3_8xlarge__OclElement.initOperations(_C3_8xlarge__OclElement);
			Fragments._C3_8xlarge__Resource_tpl.initOperations(_C3_8xlarge__Resource_tpl);

			Fragments._C3_large__C3_large.initOperations(_C3_large__C3_large);
			Fragments._C3_large__Computeoptimized.initOperations(_C3_large__Computeoptimized);
			Fragments._C3_large__MixinBase.initOperations(_C3_large__MixinBase);
			Fragments._C3_large__OclAny.initOperations(_C3_large__OclAny);
			Fragments._C3_large__OclElement.initOperations(_C3_large__OclElement);
			Fragments._C3_large__Resource_tpl.initOperations(_C3_large__Resource_tpl);

			Fragments._C3_xlarge__C3_xlarge.initOperations(_C3_xlarge__C3_xlarge);
			Fragments._C3_xlarge__Computeoptimized.initOperations(_C3_xlarge__Computeoptimized);
			Fragments._C3_xlarge__MixinBase.initOperations(_C3_xlarge__MixinBase);
			Fragments._C3_xlarge__OclAny.initOperations(_C3_xlarge__OclAny);
			Fragments._C3_xlarge__OclElement.initOperations(_C3_xlarge__OclElement);
			Fragments._C3_xlarge__Resource_tpl.initOperations(_C3_xlarge__Resource_tpl);

			Fragments._C4_2xlarge__C4_2xlarge.initOperations(_C4_2xlarge__C4_2xlarge);
			Fragments._C4_2xlarge__Computeoptimized.initOperations(_C4_2xlarge__Computeoptimized);
			Fragments._C4_2xlarge__MixinBase.initOperations(_C4_2xlarge__MixinBase);
			Fragments._C4_2xlarge__OclAny.initOperations(_C4_2xlarge__OclAny);
			Fragments._C4_2xlarge__OclElement.initOperations(_C4_2xlarge__OclElement);
			Fragments._C4_2xlarge__Resource_tpl.initOperations(_C4_2xlarge__Resource_tpl);

			Fragments._C4_4xlarge__C4_4xlarge.initOperations(_C4_4xlarge__C4_4xlarge);
			Fragments._C4_4xlarge__Computeoptimized.initOperations(_C4_4xlarge__Computeoptimized);
			Fragments._C4_4xlarge__MixinBase.initOperations(_C4_4xlarge__MixinBase);
			Fragments._C4_4xlarge__OclAny.initOperations(_C4_4xlarge__OclAny);
			Fragments._C4_4xlarge__OclElement.initOperations(_C4_4xlarge__OclElement);
			Fragments._C4_4xlarge__Resource_tpl.initOperations(_C4_4xlarge__Resource_tpl);

			Fragments._C4_8xlarge__C4_8xlarge.initOperations(_C4_8xlarge__C4_8xlarge);
			Fragments._C4_8xlarge__Computeoptimized.initOperations(_C4_8xlarge__Computeoptimized);
			Fragments._C4_8xlarge__MixinBase.initOperations(_C4_8xlarge__MixinBase);
			Fragments._C4_8xlarge__OclAny.initOperations(_C4_8xlarge__OclAny);
			Fragments._C4_8xlarge__OclElement.initOperations(_C4_8xlarge__OclElement);
			Fragments._C4_8xlarge__Resource_tpl.initOperations(_C4_8xlarge__Resource_tpl);

			Fragments._C4_large__C4_large.initOperations(_C4_large__C4_large);
			Fragments._C4_large__Computeoptimized.initOperations(_C4_large__Computeoptimized);
			Fragments._C4_large__MixinBase.initOperations(_C4_large__MixinBase);
			Fragments._C4_large__OclAny.initOperations(_C4_large__OclAny);
			Fragments._C4_large__OclElement.initOperations(_C4_large__OclElement);
			Fragments._C4_large__Resource_tpl.initOperations(_C4_large__Resource_tpl);

			Fragments._C4_xlarge__C4_xlarge.initOperations(_C4_xlarge__C4_xlarge);
			Fragments._C4_xlarge__Computeoptimized.initOperations(_C4_xlarge__Computeoptimized);
			Fragments._C4_xlarge__MixinBase.initOperations(_C4_xlarge__MixinBase);
			Fragments._C4_xlarge__OclAny.initOperations(_C4_xlarge__OclAny);
			Fragments._C4_xlarge__OclElement.initOperations(_C4_xlarge__OclElement);
			Fragments._C4_xlarge__Resource_tpl.initOperations(_C4_xlarge__Resource_tpl);

			Fragments._C5_18xlarge__C5_18xlarge.initOperations(_C5_18xlarge__C5_18xlarge);
			Fragments._C5_18xlarge__Computeoptimized.initOperations(_C5_18xlarge__Computeoptimized);
			Fragments._C5_18xlarge__MixinBase.initOperations(_C5_18xlarge__MixinBase);
			Fragments._C5_18xlarge__OclAny.initOperations(_C5_18xlarge__OclAny);
			Fragments._C5_18xlarge__OclElement.initOperations(_C5_18xlarge__OclElement);
			Fragments._C5_18xlarge__Resource_tpl.initOperations(_C5_18xlarge__Resource_tpl);

			Fragments._C5_2xlarge__C5_2xlarge.initOperations(_C5_2xlarge__C5_2xlarge);
			Fragments._C5_2xlarge__Computeoptimized.initOperations(_C5_2xlarge__Computeoptimized);
			Fragments._C5_2xlarge__MixinBase.initOperations(_C5_2xlarge__MixinBase);
			Fragments._C5_2xlarge__OclAny.initOperations(_C5_2xlarge__OclAny);
			Fragments._C5_2xlarge__OclElement.initOperations(_C5_2xlarge__OclElement);
			Fragments._C5_2xlarge__Resource_tpl.initOperations(_C5_2xlarge__Resource_tpl);

			Fragments._C5_4xlarge__C5_4xlarge.initOperations(_C5_4xlarge__C5_4xlarge);
			Fragments._C5_4xlarge__Computeoptimized.initOperations(_C5_4xlarge__Computeoptimized);
			Fragments._C5_4xlarge__MixinBase.initOperations(_C5_4xlarge__MixinBase);
			Fragments._C5_4xlarge__OclAny.initOperations(_C5_4xlarge__OclAny);
			Fragments._C5_4xlarge__OclElement.initOperations(_C5_4xlarge__OclElement);
			Fragments._C5_4xlarge__Resource_tpl.initOperations(_C5_4xlarge__Resource_tpl);

			Fragments._C5_9xlarge__C5_9xlarge.initOperations(_C5_9xlarge__C5_9xlarge);
			Fragments._C5_9xlarge__Computeoptimized.initOperations(_C5_9xlarge__Computeoptimized);
			Fragments._C5_9xlarge__MixinBase.initOperations(_C5_9xlarge__MixinBase);
			Fragments._C5_9xlarge__OclAny.initOperations(_C5_9xlarge__OclAny);
			Fragments._C5_9xlarge__OclElement.initOperations(_C5_9xlarge__OclElement);
			Fragments._C5_9xlarge__Resource_tpl.initOperations(_C5_9xlarge__Resource_tpl);

			Fragments._C5_large__C5_large.initOperations(_C5_large__C5_large);
			Fragments._C5_large__Computeoptimized.initOperations(_C5_large__Computeoptimized);
			Fragments._C5_large__MixinBase.initOperations(_C5_large__MixinBase);
			Fragments._C5_large__OclAny.initOperations(_C5_large__OclAny);
			Fragments._C5_large__OclElement.initOperations(_C5_large__OclElement);
			Fragments._C5_large__Resource_tpl.initOperations(_C5_large__Resource_tpl);

			Fragments._C5_xlarge__C5_xlarge.initOperations(_C5_xlarge__C5_xlarge);
			Fragments._C5_xlarge__Computeoptimized.initOperations(_C5_xlarge__Computeoptimized);
			Fragments._C5_xlarge__MixinBase.initOperations(_C5_xlarge__MixinBase);
			Fragments._C5_xlarge__OclAny.initOperations(_C5_xlarge__OclAny);
			Fragments._C5_xlarge__OclElement.initOperations(_C5_xlarge__OclElement);
			Fragments._C5_xlarge__Resource_tpl.initOperations(_C5_xlarge__Resource_tpl);

			Fragments._Ca_central_1__Ca_central_1.initOperations(_Ca_central_1__Ca_central_1);
			Fragments._Ca_central_1__MixinBase.initOperations(_Ca_central_1__MixinBase);
			Fragments._Ca_central_1__OclAny.initOperations(_Ca_central_1__OclAny);
			Fragments._Ca_central_1__OclElement.initOperations(_Ca_central_1__OclElement);

			Fragments._Cc2_8xlarge__Cc2_8xlarge.initOperations(_Cc2_8xlarge__Cc2_8xlarge);
			Fragments._Cc2_8xlarge__Computeoptimized.initOperations(_Cc2_8xlarge__Computeoptimized);
			Fragments._Cc2_8xlarge__MixinBase.initOperations(_Cc2_8xlarge__MixinBase);
			Fragments._Cc2_8xlarge__OclAny.initOperations(_Cc2_8xlarge__OclAny);
			Fragments._Cc2_8xlarge__OclElement.initOperations(_Cc2_8xlarge__OclElement);
			Fragments._Cc2_8xlarge__Resource_tpl.initOperations(_Cc2_8xlarge__Resource_tpl);

			Fragments._Cg1_4xlarge__Acceleratedcomputing.initOperations(_Cg1_4xlarge__Acceleratedcomputing);
			Fragments._Cg1_4xlarge__Cg1_4xlarge.initOperations(_Cg1_4xlarge__Cg1_4xlarge);
			Fragments._Cg1_4xlarge__MixinBase.initOperations(_Cg1_4xlarge__MixinBase);
			Fragments._Cg1_4xlarge__OclAny.initOperations(_Cg1_4xlarge__OclAny);
			Fragments._Cg1_4xlarge__OclElement.initOperations(_Cg1_4xlarge__OclElement);
			Fragments._Cg1_4xlarge__Resource_tpl.initOperations(_Cg1_4xlarge__Resource_tpl);

			Fragments._Computeoptimized__Computeoptimized.initOperations(_Computeoptimized__Computeoptimized);
			Fragments._Computeoptimized__MixinBase.initOperations(_Computeoptimized__MixinBase);
			Fragments._Computeoptimized__OclAny.initOperations(_Computeoptimized__OclAny);
			Fragments._Computeoptimized__OclElement.initOperations(_Computeoptimized__OclElement);
			Fragments._Computeoptimized__Resource_tpl.initOperations(_Computeoptimized__Resource_tpl);

			Fragments._Cr1_8xlarge__Cr1_8xlarge.initOperations(_Cr1_8xlarge__Cr1_8xlarge);
			Fragments._Cr1_8xlarge__Memoryoptimized.initOperations(_Cr1_8xlarge__Memoryoptimized);
			Fragments._Cr1_8xlarge__MixinBase.initOperations(_Cr1_8xlarge__MixinBase);
			Fragments._Cr1_8xlarge__OclAny.initOperations(_Cr1_8xlarge__OclAny);
			Fragments._Cr1_8xlarge__OclElement.initOperations(_Cr1_8xlarge__OclElement);
			Fragments._Cr1_8xlarge__Resource_tpl.initOperations(_Cr1_8xlarge__Resource_tpl);

			Fragments._D2_2xlarge__D2_2xlarge.initOperations(_D2_2xlarge__D2_2xlarge);
			Fragments._D2_2xlarge__MixinBase.initOperations(_D2_2xlarge__MixinBase);
			Fragments._D2_2xlarge__OclAny.initOperations(_D2_2xlarge__OclAny);
			Fragments._D2_2xlarge__OclElement.initOperations(_D2_2xlarge__OclElement);
			Fragments._D2_2xlarge__Resource_tpl.initOperations(_D2_2xlarge__Resource_tpl);
			Fragments._D2_2xlarge__Storageoptimized.initOperations(_D2_2xlarge__Storageoptimized);

			Fragments._D2_4xlarge__D2_4xlarge.initOperations(_D2_4xlarge__D2_4xlarge);
			Fragments._D2_4xlarge__MixinBase.initOperations(_D2_4xlarge__MixinBase);
			Fragments._D2_4xlarge__OclAny.initOperations(_D2_4xlarge__OclAny);
			Fragments._D2_4xlarge__OclElement.initOperations(_D2_4xlarge__OclElement);
			Fragments._D2_4xlarge__Resource_tpl.initOperations(_D2_4xlarge__Resource_tpl);
			Fragments._D2_4xlarge__Storageoptimized.initOperations(_D2_4xlarge__Storageoptimized);

			Fragments._D2_8xlarge__D2_8xlarge.initOperations(_D2_8xlarge__D2_8xlarge);
			Fragments._D2_8xlarge__MixinBase.initOperations(_D2_8xlarge__MixinBase);
			Fragments._D2_8xlarge__OclAny.initOperations(_D2_8xlarge__OclAny);
			Fragments._D2_8xlarge__OclElement.initOperations(_D2_8xlarge__OclElement);
			Fragments._D2_8xlarge__Resource_tpl.initOperations(_D2_8xlarge__Resource_tpl);
			Fragments._D2_8xlarge__Storageoptimized.initOperations(_D2_8xlarge__Storageoptimized);

			Fragments._D2_xlarge__D2_xlarge.initOperations(_D2_xlarge__D2_xlarge);
			Fragments._D2_xlarge__MixinBase.initOperations(_D2_xlarge__MixinBase);
			Fragments._D2_xlarge__OclAny.initOperations(_D2_xlarge__OclAny);
			Fragments._D2_xlarge__OclElement.initOperations(_D2_xlarge__OclElement);
			Fragments._D2_xlarge__Resource_tpl.initOperations(_D2_xlarge__Resource_tpl);
			Fragments._D2_xlarge__Storageoptimized.initOperations(_D2_xlarge__Storageoptimized);

			Fragments._Eu_central_1__Eu_central_1.initOperations(_Eu_central_1__Eu_central_1);
			Fragments._Eu_central_1__MixinBase.initOperations(_Eu_central_1__MixinBase);
			Fragments._Eu_central_1__OclAny.initOperations(_Eu_central_1__OclAny);
			Fragments._Eu_central_1__OclElement.initOperations(_Eu_central_1__OclElement);

			Fragments._Eu_west_1__Eu_west_1.initOperations(_Eu_west_1__Eu_west_1);
			Fragments._Eu_west_1__MixinBase.initOperations(_Eu_west_1__MixinBase);
			Fragments._Eu_west_1__OclAny.initOperations(_Eu_west_1__OclAny);
			Fragments._Eu_west_1__OclElement.initOperations(_Eu_west_1__OclElement);

			Fragments._Eu_west_2__Eu_west_2.initOperations(_Eu_west_2__Eu_west_2);
			Fragments._Eu_west_2__MixinBase.initOperations(_Eu_west_2__MixinBase);
			Fragments._Eu_west_2__OclAny.initOperations(_Eu_west_2__OclAny);
			Fragments._Eu_west_2__OclElement.initOperations(_Eu_west_2__OclElement);

			Fragments._Eu_west_3__Eu_west_3.initOperations(_Eu_west_3__Eu_west_3);
			Fragments._Eu_west_3__MixinBase.initOperations(_Eu_west_3__MixinBase);
			Fragments._Eu_west_3__OclAny.initOperations(_Eu_west_3__OclAny);
			Fragments._Eu_west_3__OclElement.initOperations(_Eu_west_3__OclElement);

			Fragments._Europe__Europe.initOperations(_Europe__Europe);
			Fragments._Europe__MixinBase.initOperations(_Europe__MixinBase);
			Fragments._Europe__OclAny.initOperations(_Europe__OclAny);
			Fragments._Europe__OclElement.initOperations(_Europe__OclElement);
			Fragments._Europe__Region.initOperations(_Europe__Region);

			Fragments._F1_16xlarge__Acceleratedcomputing.initOperations(_F1_16xlarge__Acceleratedcomputing);
			Fragments._F1_16xlarge__F1_16xlarge.initOperations(_F1_16xlarge__F1_16xlarge);
			Fragments._F1_16xlarge__MixinBase.initOperations(_F1_16xlarge__MixinBase);
			Fragments._F1_16xlarge__OclAny.initOperations(_F1_16xlarge__OclAny);
			Fragments._F1_16xlarge__OclElement.initOperations(_F1_16xlarge__OclElement);
			Fragments._F1_16xlarge__Resource_tpl.initOperations(_F1_16xlarge__Resource_tpl);

			Fragments._F1_2xlarge__Acceleratedcomputing.initOperations(_F1_2xlarge__Acceleratedcomputing);
			Fragments._F1_2xlarge__F1_2xlarge.initOperations(_F1_2xlarge__F1_2xlarge);
			Fragments._F1_2xlarge__MixinBase.initOperations(_F1_2xlarge__MixinBase);
			Fragments._F1_2xlarge__OclAny.initOperations(_F1_2xlarge__OclAny);
			Fragments._F1_2xlarge__OclElement.initOperations(_F1_2xlarge__OclElement);
			Fragments._F1_2xlarge__Resource_tpl.initOperations(_F1_2xlarge__Resource_tpl);

			Fragments._G2_2xlarge__Acceleratedcomputing.initOperations(_G2_2xlarge__Acceleratedcomputing);
			Fragments._G2_2xlarge__G2_2xlarge.initOperations(_G2_2xlarge__G2_2xlarge);
			Fragments._G2_2xlarge__MixinBase.initOperations(_G2_2xlarge__MixinBase);
			Fragments._G2_2xlarge__OclAny.initOperations(_G2_2xlarge__OclAny);
			Fragments._G2_2xlarge__OclElement.initOperations(_G2_2xlarge__OclElement);
			Fragments._G2_2xlarge__Resource_tpl.initOperations(_G2_2xlarge__Resource_tpl);

			Fragments._G2_8xlarge__Acceleratedcomputing.initOperations(_G2_8xlarge__Acceleratedcomputing);
			Fragments._G2_8xlarge__G2_8xlarge.initOperations(_G2_8xlarge__G2_8xlarge);
			Fragments._G2_8xlarge__MixinBase.initOperations(_G2_8xlarge__MixinBase);
			Fragments._G2_8xlarge__OclAny.initOperations(_G2_8xlarge__OclAny);
			Fragments._G2_8xlarge__OclElement.initOperations(_G2_8xlarge__OclElement);
			Fragments._G2_8xlarge__Resource_tpl.initOperations(_G2_8xlarge__Resource_tpl);

			Fragments._G3_16xlarge__Acceleratedcomputing.initOperations(_G3_16xlarge__Acceleratedcomputing);
			Fragments._G3_16xlarge__G3_16xlarge.initOperations(_G3_16xlarge__G3_16xlarge);
			Fragments._G3_16xlarge__MixinBase.initOperations(_G3_16xlarge__MixinBase);
			Fragments._G3_16xlarge__OclAny.initOperations(_G3_16xlarge__OclAny);
			Fragments._G3_16xlarge__OclElement.initOperations(_G3_16xlarge__OclElement);
			Fragments._G3_16xlarge__Resource_tpl.initOperations(_G3_16xlarge__Resource_tpl);

			Fragments._G3_4xlarge__Acceleratedcomputing.initOperations(_G3_4xlarge__Acceleratedcomputing);
			Fragments._G3_4xlarge__G3_4xlarge.initOperations(_G3_4xlarge__G3_4xlarge);
			Fragments._G3_4xlarge__MixinBase.initOperations(_G3_4xlarge__MixinBase);
			Fragments._G3_4xlarge__OclAny.initOperations(_G3_4xlarge__OclAny);
			Fragments._G3_4xlarge__OclElement.initOperations(_G3_4xlarge__OclElement);
			Fragments._G3_4xlarge__Resource_tpl.initOperations(_G3_4xlarge__Resource_tpl);

			Fragments._G3_8xlarge__Acceleratedcomputing.initOperations(_G3_8xlarge__Acceleratedcomputing);
			Fragments._G3_8xlarge__G3_8xlarge.initOperations(_G3_8xlarge__G3_8xlarge);
			Fragments._G3_8xlarge__MixinBase.initOperations(_G3_8xlarge__MixinBase);
			Fragments._G3_8xlarge__OclAny.initOperations(_G3_8xlarge__OclAny);
			Fragments._G3_8xlarge__OclElement.initOperations(_G3_8xlarge__OclElement);
			Fragments._G3_8xlarge__Resource_tpl.initOperations(_G3_8xlarge__Resource_tpl);

			Fragments._Generalpurpose__Generalpurpose.initOperations(_Generalpurpose__Generalpurpose);
			Fragments._Generalpurpose__MixinBase.initOperations(_Generalpurpose__MixinBase);
			Fragments._Generalpurpose__OclAny.initOperations(_Generalpurpose__OclAny);
			Fragments._Generalpurpose__OclElement.initOperations(_Generalpurpose__OclElement);
			Fragments._Generalpurpose__Resource_tpl.initOperations(_Generalpurpose__Resource_tpl);

			Fragments._H1_16xlarge__H1_16xlarge.initOperations(_H1_16xlarge__H1_16xlarge);
			Fragments._H1_16xlarge__MixinBase.initOperations(_H1_16xlarge__MixinBase);
			Fragments._H1_16xlarge__OclAny.initOperations(_H1_16xlarge__OclAny);
			Fragments._H1_16xlarge__OclElement.initOperations(_H1_16xlarge__OclElement);
			Fragments._H1_16xlarge__Resource_tpl.initOperations(_H1_16xlarge__Resource_tpl);
			Fragments._H1_16xlarge__Storageoptimized.initOperations(_H1_16xlarge__Storageoptimized);

			Fragments._H1_2xlarge__H1_2xlarge.initOperations(_H1_2xlarge__H1_2xlarge);
			Fragments._H1_2xlarge__MixinBase.initOperations(_H1_2xlarge__MixinBase);
			Fragments._H1_2xlarge__OclAny.initOperations(_H1_2xlarge__OclAny);
			Fragments._H1_2xlarge__OclElement.initOperations(_H1_2xlarge__OclElement);
			Fragments._H1_2xlarge__Resource_tpl.initOperations(_H1_2xlarge__Resource_tpl);
			Fragments._H1_2xlarge__Storageoptimized.initOperations(_H1_2xlarge__Storageoptimized);

			Fragments._H1_4xlarge__H1_4xlarge.initOperations(_H1_4xlarge__H1_4xlarge);
			Fragments._H1_4xlarge__MixinBase.initOperations(_H1_4xlarge__MixinBase);
			Fragments._H1_4xlarge__OclAny.initOperations(_H1_4xlarge__OclAny);
			Fragments._H1_4xlarge__OclElement.initOperations(_H1_4xlarge__OclElement);
			Fragments._H1_4xlarge__Resource_tpl.initOperations(_H1_4xlarge__Resource_tpl);
			Fragments._H1_4xlarge__Storageoptimized.initOperations(_H1_4xlarge__Storageoptimized);

			Fragments._H1_8xlarge__H1_8xlarge.initOperations(_H1_8xlarge__H1_8xlarge);
			Fragments._H1_8xlarge__MixinBase.initOperations(_H1_8xlarge__MixinBase);
			Fragments._H1_8xlarge__OclAny.initOperations(_H1_8xlarge__OclAny);
			Fragments._H1_8xlarge__OclElement.initOperations(_H1_8xlarge__OclElement);
			Fragments._H1_8xlarge__Resource_tpl.initOperations(_H1_8xlarge__Resource_tpl);
			Fragments._H1_8xlarge__Storageoptimized.initOperations(_H1_8xlarge__Storageoptimized);

			Fragments._Hs1_8xlarge__Hs1_8xlarge.initOperations(_Hs1_8xlarge__Hs1_8xlarge);
			Fragments._Hs1_8xlarge__MixinBase.initOperations(_Hs1_8xlarge__MixinBase);
			Fragments._Hs1_8xlarge__OclAny.initOperations(_Hs1_8xlarge__OclAny);
			Fragments._Hs1_8xlarge__OclElement.initOperations(_Hs1_8xlarge__OclElement);
			Fragments._Hs1_8xlarge__Resource_tpl.initOperations(_Hs1_8xlarge__Resource_tpl);
			Fragments._Hs1_8xlarge__Storageoptimized.initOperations(_Hs1_8xlarge__Storageoptimized);

			Fragments._HypervisorType__HypervisorType.initOperations(_HypervisorType__HypervisorType);
			Fragments._HypervisorType__OclAny.initOperations(_HypervisorType__OclAny);
			Fragments._HypervisorType__OclElement.initOperations(_HypervisorType__OclElement);
			Fragments._HypervisorType__OclEnumeration.initOperations(_HypervisorType__OclEnumeration);
			Fragments._HypervisorType__OclType.initOperations(_HypervisorType__OclType);

			Fragments._I2_2xlarge__I2_2xlarge.initOperations(_I2_2xlarge__I2_2xlarge);
			Fragments._I2_2xlarge__MixinBase.initOperations(_I2_2xlarge__MixinBase);
			Fragments._I2_2xlarge__OclAny.initOperations(_I2_2xlarge__OclAny);
			Fragments._I2_2xlarge__OclElement.initOperations(_I2_2xlarge__OclElement);
			Fragments._I2_2xlarge__Resource_tpl.initOperations(_I2_2xlarge__Resource_tpl);
			Fragments._I2_2xlarge__Storageoptimized.initOperations(_I2_2xlarge__Storageoptimized);

			Fragments._I2_4xlarge__I2_4xlarge.initOperations(_I2_4xlarge__I2_4xlarge);
			Fragments._I2_4xlarge__MixinBase.initOperations(_I2_4xlarge__MixinBase);
			Fragments._I2_4xlarge__OclAny.initOperations(_I2_4xlarge__OclAny);
			Fragments._I2_4xlarge__OclElement.initOperations(_I2_4xlarge__OclElement);
			Fragments._I2_4xlarge__Resource_tpl.initOperations(_I2_4xlarge__Resource_tpl);
			Fragments._I2_4xlarge__Storageoptimized.initOperations(_I2_4xlarge__Storageoptimized);

			Fragments._I2_8xlarge__I2_8xlarge.initOperations(_I2_8xlarge__I2_8xlarge);
			Fragments._I2_8xlarge__MixinBase.initOperations(_I2_8xlarge__MixinBase);
			Fragments._I2_8xlarge__OclAny.initOperations(_I2_8xlarge__OclAny);
			Fragments._I2_8xlarge__OclElement.initOperations(_I2_8xlarge__OclElement);
			Fragments._I2_8xlarge__Resource_tpl.initOperations(_I2_8xlarge__Resource_tpl);
			Fragments._I2_8xlarge__Storageoptimized.initOperations(_I2_8xlarge__Storageoptimized);

			Fragments._I2_xlarge__I2_xlarge.initOperations(_I2_xlarge__I2_xlarge);
			Fragments._I2_xlarge__MixinBase.initOperations(_I2_xlarge__MixinBase);
			Fragments._I2_xlarge__OclAny.initOperations(_I2_xlarge__OclAny);
			Fragments._I2_xlarge__OclElement.initOperations(_I2_xlarge__OclElement);
			Fragments._I2_xlarge__Resource_tpl.initOperations(_I2_xlarge__Resource_tpl);
			Fragments._I2_xlarge__Storageoptimized.initOperations(_I2_xlarge__Storageoptimized);

			Fragments._I3_16xlarge__I3_16xlarge.initOperations(_I3_16xlarge__I3_16xlarge);
			Fragments._I3_16xlarge__MixinBase.initOperations(_I3_16xlarge__MixinBase);
			Fragments._I3_16xlarge__OclAny.initOperations(_I3_16xlarge__OclAny);
			Fragments._I3_16xlarge__OclElement.initOperations(_I3_16xlarge__OclElement);
			Fragments._I3_16xlarge__Resource_tpl.initOperations(_I3_16xlarge__Resource_tpl);
			Fragments._I3_16xlarge__Storageoptimized.initOperations(_I3_16xlarge__Storageoptimized);

			Fragments._I3_2xlarge__I3_2xlarge.initOperations(_I3_2xlarge__I3_2xlarge);
			Fragments._I3_2xlarge__MixinBase.initOperations(_I3_2xlarge__MixinBase);
			Fragments._I3_2xlarge__OclAny.initOperations(_I3_2xlarge__OclAny);
			Fragments._I3_2xlarge__OclElement.initOperations(_I3_2xlarge__OclElement);
			Fragments._I3_2xlarge__Resource_tpl.initOperations(_I3_2xlarge__Resource_tpl);
			Fragments._I3_2xlarge__Storageoptimized.initOperations(_I3_2xlarge__Storageoptimized);

			Fragments._I3_4xlarge__I3_4xlarge.initOperations(_I3_4xlarge__I3_4xlarge);
			Fragments._I3_4xlarge__MixinBase.initOperations(_I3_4xlarge__MixinBase);
			Fragments._I3_4xlarge__OclAny.initOperations(_I3_4xlarge__OclAny);
			Fragments._I3_4xlarge__OclElement.initOperations(_I3_4xlarge__OclElement);
			Fragments._I3_4xlarge__Resource_tpl.initOperations(_I3_4xlarge__Resource_tpl);
			Fragments._I3_4xlarge__Storageoptimized.initOperations(_I3_4xlarge__Storageoptimized);

			Fragments._I3_8xlarge__I3_8xlarge.initOperations(_I3_8xlarge__I3_8xlarge);
			Fragments._I3_8xlarge__MixinBase.initOperations(_I3_8xlarge__MixinBase);
			Fragments._I3_8xlarge__OclAny.initOperations(_I3_8xlarge__OclAny);
			Fragments._I3_8xlarge__OclElement.initOperations(_I3_8xlarge__OclElement);
			Fragments._I3_8xlarge__Resource_tpl.initOperations(_I3_8xlarge__Resource_tpl);
			Fragments._I3_8xlarge__Storageoptimized.initOperations(_I3_8xlarge__Storageoptimized);

			Fragments._I3_large__I3_large.initOperations(_I3_large__I3_large);
			Fragments._I3_large__MixinBase.initOperations(_I3_large__MixinBase);
			Fragments._I3_large__OclAny.initOperations(_I3_large__OclAny);
			Fragments._I3_large__OclElement.initOperations(_I3_large__OclElement);
			Fragments._I3_large__Resource_tpl.initOperations(_I3_large__Resource_tpl);
			Fragments._I3_large__Storageoptimized.initOperations(_I3_large__Storageoptimized);

			Fragments._I3_metal__I3_metal.initOperations(_I3_metal__I3_metal);
			Fragments._I3_metal__MixinBase.initOperations(_I3_metal__MixinBase);
			Fragments._I3_metal__OclAny.initOperations(_I3_metal__OclAny);
			Fragments._I3_metal__OclElement.initOperations(_I3_metal__OclElement);
			Fragments._I3_metal__Resource_tpl.initOperations(_I3_metal__Resource_tpl);
			Fragments._I3_metal__Storageoptimized.initOperations(_I3_metal__Storageoptimized);

			Fragments._I3_xlarge__I3_xlarge.initOperations(_I3_xlarge__I3_xlarge);
			Fragments._I3_xlarge__MixinBase.initOperations(_I3_xlarge__MixinBase);
			Fragments._I3_xlarge__OclAny.initOperations(_I3_xlarge__OclAny);
			Fragments._I3_xlarge__OclElement.initOperations(_I3_xlarge__OclElement);
			Fragments._I3_xlarge__Resource_tpl.initOperations(_I3_xlarge__Resource_tpl);
			Fragments._I3_xlarge__Storageoptimized.initOperations(_I3_xlarge__Storageoptimized);

			Fragments._InstanceLifeCycleType__InstanceLifeCycleType.initOperations(_InstanceLifeCycleType__InstanceLifeCycleType);
			Fragments._InstanceLifeCycleType__OclAny.initOperations(_InstanceLifeCycleType__OclAny);
			Fragments._InstanceLifeCycleType__OclElement.initOperations(_InstanceLifeCycleType__OclElement);
			Fragments._InstanceLifeCycleType__OclEnumeration.initOperations(_InstanceLifeCycleType__OclEnumeration);
			Fragments._InstanceLifeCycleType__OclType.initOperations(_InstanceLifeCycleType__OclType);

			Fragments._Instanceec2__Compute.initOperations(_Instanceec2__Compute);
			Fragments._Instanceec2__Entity.initOperations(_Instanceec2__Entity);
			Fragments._Instanceec2__Instanceec2.initOperations(_Instanceec2__Instanceec2);
			Fragments._Instanceec2__OclAny.initOperations(_Instanceec2__OclAny);
			Fragments._Instanceec2__OclElement.initOperations(_Instanceec2__OclElement);
			Fragments._Instanceec2__Resource.initOperations(_Instanceec2__Resource);

			Fragments._Instancevpcinfo__Instancevpcinfo.initOperations(_Instancevpcinfo__Instancevpcinfo);
			Fragments._Instancevpcinfo__MixinBase.initOperations(_Instancevpcinfo__MixinBase);
			Fragments._Instancevpcinfo__OclAny.initOperations(_Instancevpcinfo__OclAny);
			Fragments._Instancevpcinfo__OclElement.initOperations(_Instancevpcinfo__OclElement);

			Fragments._M1_large__Generalpurpose.initOperations(_M1_large__Generalpurpose);
			Fragments._M1_large__M1_large.initOperations(_M1_large__M1_large);
			Fragments._M1_large__MixinBase.initOperations(_M1_large__MixinBase);
			Fragments._M1_large__OclAny.initOperations(_M1_large__OclAny);
			Fragments._M1_large__OclElement.initOperations(_M1_large__OclElement);
			Fragments._M1_large__Resource_tpl.initOperations(_M1_large__Resource_tpl);

			Fragments._M1_medium__Generalpurpose.initOperations(_M1_medium__Generalpurpose);
			Fragments._M1_medium__M1_medium.initOperations(_M1_medium__M1_medium);
			Fragments._M1_medium__MixinBase.initOperations(_M1_medium__MixinBase);
			Fragments._M1_medium__OclAny.initOperations(_M1_medium__OclAny);
			Fragments._M1_medium__OclElement.initOperations(_M1_medium__OclElement);
			Fragments._M1_medium__Resource_tpl.initOperations(_M1_medium__Resource_tpl);

			Fragments._M1_small__Generalpurpose.initOperations(_M1_small__Generalpurpose);
			Fragments._M1_small__M1_small.initOperations(_M1_small__M1_small);
			Fragments._M1_small__MixinBase.initOperations(_M1_small__MixinBase);
			Fragments._M1_small__OclAny.initOperations(_M1_small__OclAny);
			Fragments._M1_small__OclElement.initOperations(_M1_small__OclElement);
			Fragments._M1_small__Resource_tpl.initOperations(_M1_small__Resource_tpl);

			Fragments._M1_xlarge__Generalpurpose.initOperations(_M1_xlarge__Generalpurpose);
			Fragments._M1_xlarge__M1_xlarge.initOperations(_M1_xlarge__M1_xlarge);
			Fragments._M1_xlarge__MixinBase.initOperations(_M1_xlarge__MixinBase);
			Fragments._M1_xlarge__OclAny.initOperations(_M1_xlarge__OclAny);
			Fragments._M1_xlarge__OclElement.initOperations(_M1_xlarge__OclElement);
			Fragments._M1_xlarge__Resource_tpl.initOperations(_M1_xlarge__Resource_tpl);

			Fragments._M2_2xlarge__M2_2xlarge.initOperations(_M2_2xlarge__M2_2xlarge);
			Fragments._M2_2xlarge__Memoryoptimized.initOperations(_M2_2xlarge__Memoryoptimized);
			Fragments._M2_2xlarge__MixinBase.initOperations(_M2_2xlarge__MixinBase);
			Fragments._M2_2xlarge__OclAny.initOperations(_M2_2xlarge__OclAny);
			Fragments._M2_2xlarge__OclElement.initOperations(_M2_2xlarge__OclElement);
			Fragments._M2_2xlarge__Resource_tpl.initOperations(_M2_2xlarge__Resource_tpl);

			Fragments._M2_4xlarge__M2_4xlarge.initOperations(_M2_4xlarge__M2_4xlarge);
			Fragments._M2_4xlarge__Memoryoptimized.initOperations(_M2_4xlarge__Memoryoptimized);
			Fragments._M2_4xlarge__MixinBase.initOperations(_M2_4xlarge__MixinBase);
			Fragments._M2_4xlarge__OclAny.initOperations(_M2_4xlarge__OclAny);
			Fragments._M2_4xlarge__OclElement.initOperations(_M2_4xlarge__OclElement);
			Fragments._M2_4xlarge__Resource_tpl.initOperations(_M2_4xlarge__Resource_tpl);

			Fragments._M2_xlarge__M2_xlarge.initOperations(_M2_xlarge__M2_xlarge);
			Fragments._M2_xlarge__Memoryoptimized.initOperations(_M2_xlarge__Memoryoptimized);
			Fragments._M2_xlarge__MixinBase.initOperations(_M2_xlarge__MixinBase);
			Fragments._M2_xlarge__OclAny.initOperations(_M2_xlarge__OclAny);
			Fragments._M2_xlarge__OclElement.initOperations(_M2_xlarge__OclElement);
			Fragments._M2_xlarge__Resource_tpl.initOperations(_M2_xlarge__Resource_tpl);

			Fragments._M3_2xlarge__Generalpurpose.initOperations(_M3_2xlarge__Generalpurpose);
			Fragments._M3_2xlarge__M3_2xlarge.initOperations(_M3_2xlarge__M3_2xlarge);
			Fragments._M3_2xlarge__MixinBase.initOperations(_M3_2xlarge__MixinBase);
			Fragments._M3_2xlarge__OclAny.initOperations(_M3_2xlarge__OclAny);
			Fragments._M3_2xlarge__OclElement.initOperations(_M3_2xlarge__OclElement);
			Fragments._M3_2xlarge__Resource_tpl.initOperations(_M3_2xlarge__Resource_tpl);

			Fragments._M3_large__Generalpurpose.initOperations(_M3_large__Generalpurpose);
			Fragments._M3_large__M3_large.initOperations(_M3_large__M3_large);
			Fragments._M3_large__MixinBase.initOperations(_M3_large__MixinBase);
			Fragments._M3_large__OclAny.initOperations(_M3_large__OclAny);
			Fragments._M3_large__OclElement.initOperations(_M3_large__OclElement);
			Fragments._M3_large__Resource_tpl.initOperations(_M3_large__Resource_tpl);

			Fragments._M3_medium__Generalpurpose.initOperations(_M3_medium__Generalpurpose);
			Fragments._M3_medium__M3_medium.initOperations(_M3_medium__M3_medium);
			Fragments._M3_medium__MixinBase.initOperations(_M3_medium__MixinBase);
			Fragments._M3_medium__OclAny.initOperations(_M3_medium__OclAny);
			Fragments._M3_medium__OclElement.initOperations(_M3_medium__OclElement);
			Fragments._M3_medium__Resource_tpl.initOperations(_M3_medium__Resource_tpl);

			Fragments._M3_xlarge__Generalpurpose.initOperations(_M3_xlarge__Generalpurpose);
			Fragments._M3_xlarge__M3_xlarge.initOperations(_M3_xlarge__M3_xlarge);
			Fragments._M3_xlarge__MixinBase.initOperations(_M3_xlarge__MixinBase);
			Fragments._M3_xlarge__OclAny.initOperations(_M3_xlarge__OclAny);
			Fragments._M3_xlarge__OclElement.initOperations(_M3_xlarge__OclElement);
			Fragments._M3_xlarge__Resource_tpl.initOperations(_M3_xlarge__Resource_tpl);

			Fragments._M4_10xlarge__Generalpurpose.initOperations(_M4_10xlarge__Generalpurpose);
			Fragments._M4_10xlarge__M4_10xlarge.initOperations(_M4_10xlarge__M4_10xlarge);
			Fragments._M4_10xlarge__MixinBase.initOperations(_M4_10xlarge__MixinBase);
			Fragments._M4_10xlarge__OclAny.initOperations(_M4_10xlarge__OclAny);
			Fragments._M4_10xlarge__OclElement.initOperations(_M4_10xlarge__OclElement);
			Fragments._M4_10xlarge__Resource_tpl.initOperations(_M4_10xlarge__Resource_tpl);

			Fragments._M4_16xlarge__Generalpurpose.initOperations(_M4_16xlarge__Generalpurpose);
			Fragments._M4_16xlarge__M4_16xlarge.initOperations(_M4_16xlarge__M4_16xlarge);
			Fragments._M4_16xlarge__MixinBase.initOperations(_M4_16xlarge__MixinBase);
			Fragments._M4_16xlarge__OclAny.initOperations(_M4_16xlarge__OclAny);
			Fragments._M4_16xlarge__OclElement.initOperations(_M4_16xlarge__OclElement);
			Fragments._M4_16xlarge__Resource_tpl.initOperations(_M4_16xlarge__Resource_tpl);

			Fragments._M4_2xlarge__Generalpurpose.initOperations(_M4_2xlarge__Generalpurpose);
			Fragments._M4_2xlarge__M4_2xlarge.initOperations(_M4_2xlarge__M4_2xlarge);
			Fragments._M4_2xlarge__MixinBase.initOperations(_M4_2xlarge__MixinBase);
			Fragments._M4_2xlarge__OclAny.initOperations(_M4_2xlarge__OclAny);
			Fragments._M4_2xlarge__OclElement.initOperations(_M4_2xlarge__OclElement);
			Fragments._M4_2xlarge__Resource_tpl.initOperations(_M4_2xlarge__Resource_tpl);

			Fragments._M4_large__Generalpurpose.initOperations(_M4_large__Generalpurpose);
			Fragments._M4_large__M4_large.initOperations(_M4_large__M4_large);
			Fragments._M4_large__MixinBase.initOperations(_M4_large__MixinBase);
			Fragments._M4_large__OclAny.initOperations(_M4_large__OclAny);
			Fragments._M4_large__OclElement.initOperations(_M4_large__OclElement);
			Fragments._M4_large__Resource_tpl.initOperations(_M4_large__Resource_tpl);

			Fragments._M4_xlarge__Generalpurpose.initOperations(_M4_xlarge__Generalpurpose);
			Fragments._M4_xlarge__M4_xlarge.initOperations(_M4_xlarge__M4_xlarge);
			Fragments._M4_xlarge__MixinBase.initOperations(_M4_xlarge__MixinBase);
			Fragments._M4_xlarge__OclAny.initOperations(_M4_xlarge__OclAny);
			Fragments._M4_xlarge__OclElement.initOperations(_M4_xlarge__OclElement);
			Fragments._M4_xlarge__Resource_tpl.initOperations(_M4_xlarge__Resource_tpl);

			Fragments._M5_12xlarge__Generalpurpose.initOperations(_M5_12xlarge__Generalpurpose);
			Fragments._M5_12xlarge__M5_12xlarge.initOperations(_M5_12xlarge__M5_12xlarge);
			Fragments._M5_12xlarge__MixinBase.initOperations(_M5_12xlarge__MixinBase);
			Fragments._M5_12xlarge__OclAny.initOperations(_M5_12xlarge__OclAny);
			Fragments._M5_12xlarge__OclElement.initOperations(_M5_12xlarge__OclElement);
			Fragments._M5_12xlarge__Resource_tpl.initOperations(_M5_12xlarge__Resource_tpl);

			Fragments._M5_24xlarge__Generalpurpose.initOperations(_M5_24xlarge__Generalpurpose);
			Fragments._M5_24xlarge__M5_24xlarge.initOperations(_M5_24xlarge__M5_24xlarge);
			Fragments._M5_24xlarge__MixinBase.initOperations(_M5_24xlarge__MixinBase);
			Fragments._M5_24xlarge__OclAny.initOperations(_M5_24xlarge__OclAny);
			Fragments._M5_24xlarge__OclElement.initOperations(_M5_24xlarge__OclElement);
			Fragments._M5_24xlarge__Resource_tpl.initOperations(_M5_24xlarge__Resource_tpl);

			Fragments._M5_2xlarge__Generalpurpose.initOperations(_M5_2xlarge__Generalpurpose);
			Fragments._M5_2xlarge__M5_2xlarge.initOperations(_M5_2xlarge__M5_2xlarge);
			Fragments._M5_2xlarge__MixinBase.initOperations(_M5_2xlarge__MixinBase);
			Fragments._M5_2xlarge__OclAny.initOperations(_M5_2xlarge__OclAny);
			Fragments._M5_2xlarge__OclElement.initOperations(_M5_2xlarge__OclElement);
			Fragments._M5_2xlarge__Resource_tpl.initOperations(_M5_2xlarge__Resource_tpl);

			Fragments._M5_4xlarge__Generalpurpose.initOperations(_M5_4xlarge__Generalpurpose);
			Fragments._M5_4xlarge__M5_4xlarge.initOperations(_M5_4xlarge__M5_4xlarge);
			Fragments._M5_4xlarge__MixinBase.initOperations(_M5_4xlarge__MixinBase);
			Fragments._M5_4xlarge__OclAny.initOperations(_M5_4xlarge__OclAny);
			Fragments._M5_4xlarge__OclElement.initOperations(_M5_4xlarge__OclElement);
			Fragments._M5_4xlarge__Resource_tpl.initOperations(_M5_4xlarge__Resource_tpl);

			Fragments._M5_large__Generalpurpose.initOperations(_M5_large__Generalpurpose);
			Fragments._M5_large__M5_large.initOperations(_M5_large__M5_large);
			Fragments._M5_large__MixinBase.initOperations(_M5_large__MixinBase);
			Fragments._M5_large__OclAny.initOperations(_M5_large__OclAny);
			Fragments._M5_large__OclElement.initOperations(_M5_large__OclElement);
			Fragments._M5_large__Resource_tpl.initOperations(_M5_large__Resource_tpl);

			Fragments._M5_xlarge__Generalpurpose.initOperations(_M5_xlarge__Generalpurpose);
			Fragments._M5_xlarge__M5_xlarge.initOperations(_M5_xlarge__M5_xlarge);
			Fragments._M5_xlarge__MixinBase.initOperations(_M5_xlarge__MixinBase);
			Fragments._M5_xlarge__OclAny.initOperations(_M5_xlarge__OclAny);
			Fragments._M5_xlarge__OclElement.initOperations(_M5_xlarge__OclElement);
			Fragments._M5_xlarge__Resource_tpl.initOperations(_M5_xlarge__Resource_tpl);

			Fragments._Memoryoptimized__Memoryoptimized.initOperations(_Memoryoptimized__Memoryoptimized);
			Fragments._Memoryoptimized__MixinBase.initOperations(_Memoryoptimized__MixinBase);
			Fragments._Memoryoptimized__OclAny.initOperations(_Memoryoptimized__OclAny);
			Fragments._Memoryoptimized__OclElement.initOperations(_Memoryoptimized__OclElement);
			Fragments._Memoryoptimized__Resource_tpl.initOperations(_Memoryoptimized__Resource_tpl);

			Fragments._MonitoringState__MonitoringState.initOperations(_MonitoringState__MonitoringState);
			Fragments._MonitoringState__OclAny.initOperations(_MonitoringState__OclAny);
			Fragments._MonitoringState__OclElement.initOperations(_MonitoringState__OclElement);
			Fragments._MonitoringState__OclEnumeration.initOperations(_MonitoringState__OclEnumeration);
			Fragments._MonitoringState__OclType.initOperations(_MonitoringState__OclType);

			Fragments._P2_16xlarge__Acceleratedcomputing.initOperations(_P2_16xlarge__Acceleratedcomputing);
			Fragments._P2_16xlarge__MixinBase.initOperations(_P2_16xlarge__MixinBase);
			Fragments._P2_16xlarge__OclAny.initOperations(_P2_16xlarge__OclAny);
			Fragments._P2_16xlarge__OclElement.initOperations(_P2_16xlarge__OclElement);
			Fragments._P2_16xlarge__P2_16xlarge.initOperations(_P2_16xlarge__P2_16xlarge);
			Fragments._P2_16xlarge__Resource_tpl.initOperations(_P2_16xlarge__Resource_tpl);

			Fragments._P2_8xlarge__Acceleratedcomputing.initOperations(_P2_8xlarge__Acceleratedcomputing);
			Fragments._P2_8xlarge__MixinBase.initOperations(_P2_8xlarge__MixinBase);
			Fragments._P2_8xlarge__OclAny.initOperations(_P2_8xlarge__OclAny);
			Fragments._P2_8xlarge__OclElement.initOperations(_P2_8xlarge__OclElement);
			Fragments._P2_8xlarge__P2_8xlarge.initOperations(_P2_8xlarge__P2_8xlarge);
			Fragments._P2_8xlarge__Resource_tpl.initOperations(_P2_8xlarge__Resource_tpl);

			Fragments._P2_xlarge__Acceleratedcomputing.initOperations(_P2_xlarge__Acceleratedcomputing);
			Fragments._P2_xlarge__MixinBase.initOperations(_P2_xlarge__MixinBase);
			Fragments._P2_xlarge__OclAny.initOperations(_P2_xlarge__OclAny);
			Fragments._P2_xlarge__OclElement.initOperations(_P2_xlarge__OclElement);
			Fragments._P2_xlarge__P2_xlarge.initOperations(_P2_xlarge__P2_xlarge);
			Fragments._P2_xlarge__Resource_tpl.initOperations(_P2_xlarge__Resource_tpl);

			Fragments._P3_16xlarge__Acceleratedcomputing.initOperations(_P3_16xlarge__Acceleratedcomputing);
			Fragments._P3_16xlarge__MixinBase.initOperations(_P3_16xlarge__MixinBase);
			Fragments._P3_16xlarge__OclAny.initOperations(_P3_16xlarge__OclAny);
			Fragments._P3_16xlarge__OclElement.initOperations(_P3_16xlarge__OclElement);
			Fragments._P3_16xlarge__P3_16xlarge.initOperations(_P3_16xlarge__P3_16xlarge);
			Fragments._P3_16xlarge__Resource_tpl.initOperations(_P3_16xlarge__Resource_tpl);

			Fragments._P3_2xlarge__Acceleratedcomputing.initOperations(_P3_2xlarge__Acceleratedcomputing);
			Fragments._P3_2xlarge__MixinBase.initOperations(_P3_2xlarge__MixinBase);
			Fragments._P3_2xlarge__OclAny.initOperations(_P3_2xlarge__OclAny);
			Fragments._P3_2xlarge__OclElement.initOperations(_P3_2xlarge__OclElement);
			Fragments._P3_2xlarge__P3_2xlarge.initOperations(_P3_2xlarge__P3_2xlarge);
			Fragments._P3_2xlarge__Resource_tpl.initOperations(_P3_2xlarge__Resource_tpl);

			Fragments._P3_8xlarge__Acceleratedcomputing.initOperations(_P3_8xlarge__Acceleratedcomputing);
			Fragments._P3_8xlarge__MixinBase.initOperations(_P3_8xlarge__MixinBase);
			Fragments._P3_8xlarge__OclAny.initOperations(_P3_8xlarge__OclAny);
			Fragments._P3_8xlarge__OclElement.initOperations(_P3_8xlarge__OclElement);
			Fragments._P3_8xlarge__P3_8xlarge.initOperations(_P3_8xlarge__P3_8xlarge);
			Fragments._P3_8xlarge__Resource_tpl.initOperations(_P3_8xlarge__Resource_tpl);

			Fragments._Placementgroup__MixinBase.initOperations(_Placementgroup__MixinBase);
			Fragments._Placementgroup__OclAny.initOperations(_Placementgroup__OclAny);
			Fragments._Placementgroup__OclElement.initOperations(_Placementgroup__OclElement);
			Fragments._Placementgroup__Placementgroup.initOperations(_Placementgroup__Placementgroup);

			Fragments._R3_2xlarge__Memoryoptimized.initOperations(_R3_2xlarge__Memoryoptimized);
			Fragments._R3_2xlarge__MixinBase.initOperations(_R3_2xlarge__MixinBase);
			Fragments._R3_2xlarge__OclAny.initOperations(_R3_2xlarge__OclAny);
			Fragments._R3_2xlarge__OclElement.initOperations(_R3_2xlarge__OclElement);
			Fragments._R3_2xlarge__R3_2xlarge.initOperations(_R3_2xlarge__R3_2xlarge);
			Fragments._R3_2xlarge__Resource_tpl.initOperations(_R3_2xlarge__Resource_tpl);

			Fragments._R3_4xlarge__Memoryoptimized.initOperations(_R3_4xlarge__Memoryoptimized);
			Fragments._R3_4xlarge__MixinBase.initOperations(_R3_4xlarge__MixinBase);
			Fragments._R3_4xlarge__OclAny.initOperations(_R3_4xlarge__OclAny);
			Fragments._R3_4xlarge__OclElement.initOperations(_R3_4xlarge__OclElement);
			Fragments._R3_4xlarge__R3_4xlarge.initOperations(_R3_4xlarge__R3_4xlarge);
			Fragments._R3_4xlarge__Resource_tpl.initOperations(_R3_4xlarge__Resource_tpl);

			Fragments._R3_8xlarge__Memoryoptimized.initOperations(_R3_8xlarge__Memoryoptimized);
			Fragments._R3_8xlarge__MixinBase.initOperations(_R3_8xlarge__MixinBase);
			Fragments._R3_8xlarge__OclAny.initOperations(_R3_8xlarge__OclAny);
			Fragments._R3_8xlarge__OclElement.initOperations(_R3_8xlarge__OclElement);
			Fragments._R3_8xlarge__R3_8xlarge.initOperations(_R3_8xlarge__R3_8xlarge);
			Fragments._R3_8xlarge__Resource_tpl.initOperations(_R3_8xlarge__Resource_tpl);

			Fragments._R3_large__Memoryoptimized.initOperations(_R3_large__Memoryoptimized);
			Fragments._R3_large__MixinBase.initOperations(_R3_large__MixinBase);
			Fragments._R3_large__OclAny.initOperations(_R3_large__OclAny);
			Fragments._R3_large__OclElement.initOperations(_R3_large__OclElement);
			Fragments._R3_large__R3_large.initOperations(_R3_large__R3_large);
			Fragments._R3_large__Resource_tpl.initOperations(_R3_large__Resource_tpl);

			Fragments._R3_xlarge__Memoryoptimized.initOperations(_R3_xlarge__Memoryoptimized);
			Fragments._R3_xlarge__MixinBase.initOperations(_R3_xlarge__MixinBase);
			Fragments._R3_xlarge__OclAny.initOperations(_R3_xlarge__OclAny);
			Fragments._R3_xlarge__OclElement.initOperations(_R3_xlarge__OclElement);
			Fragments._R3_xlarge__R3_xlarge.initOperations(_R3_xlarge__R3_xlarge);
			Fragments._R3_xlarge__Resource_tpl.initOperations(_R3_xlarge__Resource_tpl);

			Fragments._R4_16xlarge__Memoryoptimized.initOperations(_R4_16xlarge__Memoryoptimized);
			Fragments._R4_16xlarge__MixinBase.initOperations(_R4_16xlarge__MixinBase);
			Fragments._R4_16xlarge__OclAny.initOperations(_R4_16xlarge__OclAny);
			Fragments._R4_16xlarge__OclElement.initOperations(_R4_16xlarge__OclElement);
			Fragments._R4_16xlarge__R4_16xlarge.initOperations(_R4_16xlarge__R4_16xlarge);
			Fragments._R4_16xlarge__Resource_tpl.initOperations(_R4_16xlarge__Resource_tpl);

			Fragments._R4_2xlarge__Memoryoptimized.initOperations(_R4_2xlarge__Memoryoptimized);
			Fragments._R4_2xlarge__MixinBase.initOperations(_R4_2xlarge__MixinBase);
			Fragments._R4_2xlarge__OclAny.initOperations(_R4_2xlarge__OclAny);
			Fragments._R4_2xlarge__OclElement.initOperations(_R4_2xlarge__OclElement);
			Fragments._R4_2xlarge__R4_2xlarge.initOperations(_R4_2xlarge__R4_2xlarge);
			Fragments._R4_2xlarge__Resource_tpl.initOperations(_R4_2xlarge__Resource_tpl);

			Fragments._R4_4xlarge__Memoryoptimized.initOperations(_R4_4xlarge__Memoryoptimized);
			Fragments._R4_4xlarge__MixinBase.initOperations(_R4_4xlarge__MixinBase);
			Fragments._R4_4xlarge__OclAny.initOperations(_R4_4xlarge__OclAny);
			Fragments._R4_4xlarge__OclElement.initOperations(_R4_4xlarge__OclElement);
			Fragments._R4_4xlarge__R4_4xlarge.initOperations(_R4_4xlarge__R4_4xlarge);
			Fragments._R4_4xlarge__Resource_tpl.initOperations(_R4_4xlarge__Resource_tpl);

			Fragments._R4_8xlarge__Memoryoptimized.initOperations(_R4_8xlarge__Memoryoptimized);
			Fragments._R4_8xlarge__MixinBase.initOperations(_R4_8xlarge__MixinBase);
			Fragments._R4_8xlarge__OclAny.initOperations(_R4_8xlarge__OclAny);
			Fragments._R4_8xlarge__OclElement.initOperations(_R4_8xlarge__OclElement);
			Fragments._R4_8xlarge__R4_8xlarge.initOperations(_R4_8xlarge__R4_8xlarge);
			Fragments._R4_8xlarge__Resource_tpl.initOperations(_R4_8xlarge__Resource_tpl);

			Fragments._R4_large__Memoryoptimized.initOperations(_R4_large__Memoryoptimized);
			Fragments._R4_large__MixinBase.initOperations(_R4_large__MixinBase);
			Fragments._R4_large__OclAny.initOperations(_R4_large__OclAny);
			Fragments._R4_large__OclElement.initOperations(_R4_large__OclElement);
			Fragments._R4_large__R4_large.initOperations(_R4_large__R4_large);
			Fragments._R4_large__Resource_tpl.initOperations(_R4_large__Resource_tpl);

			Fragments._R4_xlarge__Memoryoptimized.initOperations(_R4_xlarge__Memoryoptimized);
			Fragments._R4_xlarge__MixinBase.initOperations(_R4_xlarge__MixinBase);
			Fragments._R4_xlarge__OclAny.initOperations(_R4_xlarge__OclAny);
			Fragments._R4_xlarge__OclElement.initOperations(_R4_xlarge__OclElement);
			Fragments._R4_xlarge__R4_xlarge.initOperations(_R4_xlarge__R4_xlarge);
			Fragments._R4_xlarge__Resource_tpl.initOperations(_R4_xlarge__Resource_tpl);

			Fragments._Rootdevicevolume__MixinBase.initOperations(_Rootdevicevolume__MixinBase);
			Fragments._Rootdevicevolume__OclAny.initOperations(_Rootdevicevolume__OclAny);
			Fragments._Rootdevicevolume__OclElement.initOperations(_Rootdevicevolume__OclElement);
			Fragments._Rootdevicevolume__Rootdevicevolume.initOperations(_Rootdevicevolume__Rootdevicevolume);

			Fragments._Sa_east_1__MixinBase.initOperations(_Sa_east_1__MixinBase);
			Fragments._Sa_east_1__OclAny.initOperations(_Sa_east_1__OclAny);
			Fragments._Sa_east_1__OclElement.initOperations(_Sa_east_1__OclElement);
			Fragments._Sa_east_1__Sa_east_1.initOperations(_Sa_east_1__Sa_east_1);

			Fragments._Statustransitionreason__MixinBase.initOperations(_Statustransitionreason__MixinBase);
			Fragments._Statustransitionreason__OclAny.initOperations(_Statustransitionreason__OclAny);
			Fragments._Statustransitionreason__OclElement.initOperations(_Statustransitionreason__OclElement);
			Fragments._Statustransitionreason__Statustransitionreason.initOperations(_Statustransitionreason__Statustransitionreason);

			Fragments._Storageoptimized__MixinBase.initOperations(_Storageoptimized__MixinBase);
			Fragments._Storageoptimized__OclAny.initOperations(_Storageoptimized__OclAny);
			Fragments._Storageoptimized__OclElement.initOperations(_Storageoptimized__OclElement);
			Fragments._Storageoptimized__Resource_tpl.initOperations(_Storageoptimized__Resource_tpl);
			Fragments._Storageoptimized__Storageoptimized.initOperations(_Storageoptimized__Storageoptimized);

			Fragments._T1_micro__Generalpurpose.initOperations(_T1_micro__Generalpurpose);
			Fragments._T1_micro__MixinBase.initOperations(_T1_micro__MixinBase);
			Fragments._T1_micro__OclAny.initOperations(_T1_micro__OclAny);
			Fragments._T1_micro__OclElement.initOperations(_T1_micro__OclElement);
			Fragments._T1_micro__Resource_tpl.initOperations(_T1_micro__Resource_tpl);
			Fragments._T1_micro__T1_micro.initOperations(_T1_micro__T1_micro);

			Fragments._T2_2xlarge__Generalpurpose.initOperations(_T2_2xlarge__Generalpurpose);
			Fragments._T2_2xlarge__MixinBase.initOperations(_T2_2xlarge__MixinBase);
			Fragments._T2_2xlarge__OclAny.initOperations(_T2_2xlarge__OclAny);
			Fragments._T2_2xlarge__OclElement.initOperations(_T2_2xlarge__OclElement);
			Fragments._T2_2xlarge__Resource_tpl.initOperations(_T2_2xlarge__Resource_tpl);
			Fragments._T2_2xlarge__T2_2xlarge.initOperations(_T2_2xlarge__T2_2xlarge);

			Fragments._T2_large__Generalpurpose.initOperations(_T2_large__Generalpurpose);
			Fragments._T2_large__MixinBase.initOperations(_T2_large__MixinBase);
			Fragments._T2_large__OclAny.initOperations(_T2_large__OclAny);
			Fragments._T2_large__OclElement.initOperations(_T2_large__OclElement);
			Fragments._T2_large__Resource_tpl.initOperations(_T2_large__Resource_tpl);
			Fragments._T2_large__T2_large.initOperations(_T2_large__T2_large);

			Fragments._T2_medium__Generalpurpose.initOperations(_T2_medium__Generalpurpose);
			Fragments._T2_medium__MixinBase.initOperations(_T2_medium__MixinBase);
			Fragments._T2_medium__OclAny.initOperations(_T2_medium__OclAny);
			Fragments._T2_medium__OclElement.initOperations(_T2_medium__OclElement);
			Fragments._T2_medium__Resource_tpl.initOperations(_T2_medium__Resource_tpl);
			Fragments._T2_medium__T2_medium.initOperations(_T2_medium__T2_medium);

			Fragments._T2_micro__Generalpurpose.initOperations(_T2_micro__Generalpurpose);
			Fragments._T2_micro__MixinBase.initOperations(_T2_micro__MixinBase);
			Fragments._T2_micro__OclAny.initOperations(_T2_micro__OclAny);
			Fragments._T2_micro__OclElement.initOperations(_T2_micro__OclElement);
			Fragments._T2_micro__Resource_tpl.initOperations(_T2_micro__Resource_tpl);
			Fragments._T2_micro__T2_micro.initOperations(_T2_micro__T2_micro);

			Fragments._T2_nano__Generalpurpose.initOperations(_T2_nano__Generalpurpose);
			Fragments._T2_nano__MixinBase.initOperations(_T2_nano__MixinBase);
			Fragments._T2_nano__OclAny.initOperations(_T2_nano__OclAny);
			Fragments._T2_nano__OclElement.initOperations(_T2_nano__OclElement);
			Fragments._T2_nano__Resource_tpl.initOperations(_T2_nano__Resource_tpl);
			Fragments._T2_nano__T2_nano.initOperations(_T2_nano__T2_nano);

			Fragments._T2_small__Generalpurpose.initOperations(_T2_small__Generalpurpose);
			Fragments._T2_small__MixinBase.initOperations(_T2_small__MixinBase);
			Fragments._T2_small__OclAny.initOperations(_T2_small__OclAny);
			Fragments._T2_small__OclElement.initOperations(_T2_small__OclElement);
			Fragments._T2_small__Resource_tpl.initOperations(_T2_small__Resource_tpl);
			Fragments._T2_small__T2_small.initOperations(_T2_small__T2_small);

			Fragments._T2_xlarge__Generalpurpose.initOperations(_T2_xlarge__Generalpurpose);
			Fragments._T2_xlarge__MixinBase.initOperations(_T2_xlarge__MixinBase);
			Fragments._T2_xlarge__OclAny.initOperations(_T2_xlarge__OclAny);
			Fragments._T2_xlarge__OclElement.initOperations(_T2_xlarge__OclElement);
			Fragments._T2_xlarge__Resource_tpl.initOperations(_T2_xlarge__Resource_tpl);
			Fragments._T2_xlarge__T2_xlarge.initOperations(_T2_xlarge__T2_xlarge);

			Fragments._Tags__MixinBase.initOperations(_Tags__MixinBase);
			Fragments._Tags__OclAny.initOperations(_Tags__OclAny);
			Fragments._Tags__OclElement.initOperations(_Tags__OclElement);
			Fragments._Tags__Tags.initOperations(_Tags__Tags);

			Fragments._Us_east_1__MixinBase.initOperations(_Us_east_1__MixinBase);
			Fragments._Us_east_1__OclAny.initOperations(_Us_east_1__OclAny);
			Fragments._Us_east_1__OclElement.initOperations(_Us_east_1__OclElement);
			Fragments._Us_east_1__Us_east_1.initOperations(_Us_east_1__Us_east_1);

			Fragments._Us_east_2__MixinBase.initOperations(_Us_east_2__MixinBase);
			Fragments._Us_east_2__OclAny.initOperations(_Us_east_2__OclAny);
			Fragments._Us_east_2__OclElement.initOperations(_Us_east_2__OclElement);
			Fragments._Us_east_2__Us_east_2.initOperations(_Us_east_2__Us_east_2);

			Fragments._Us_west_1__MixinBase.initOperations(_Us_west_1__MixinBase);
			Fragments._Us_west_1__OclAny.initOperations(_Us_west_1__OclAny);
			Fragments._Us_west_1__OclElement.initOperations(_Us_west_1__OclElement);
			Fragments._Us_west_1__Us_west_1.initOperations(_Us_west_1__Us_west_1);

			Fragments._Us_west_2__MixinBase.initOperations(_Us_west_2__MixinBase);
			Fragments._Us_west_2__OclAny.initOperations(_Us_west_2__OclAny);
			Fragments._Us_west_2__OclElement.initOperations(_Us_west_2__OclElement);
			Fragments._Us_west_2__Us_west_2.initOperations(_Us_west_2__Us_west_2);

			Fragments._VirtualizationType__OclAny.initOperations(_VirtualizationType__OclAny);
			Fragments._VirtualizationType__OclElement.initOperations(_VirtualizationType__OclElement);
			Fragments._VirtualizationType__OclEnumeration.initOperations(_VirtualizationType__OclEnumeration);
			Fragments._VirtualizationType__OclType.initOperations(_VirtualizationType__OclType);
			Fragments._VirtualizationType__VirtualizationType.initOperations(_VirtualizationType__VirtualizationType);

			Fragments._X1_16xlarge__Memoryoptimized.initOperations(_X1_16xlarge__Memoryoptimized);
			Fragments._X1_16xlarge__MixinBase.initOperations(_X1_16xlarge__MixinBase);
			Fragments._X1_16xlarge__OclAny.initOperations(_X1_16xlarge__OclAny);
			Fragments._X1_16xlarge__OclElement.initOperations(_X1_16xlarge__OclElement);
			Fragments._X1_16xlarge__Resource_tpl.initOperations(_X1_16xlarge__Resource_tpl);
			Fragments._X1_16xlarge__X1_16xlarge.initOperations(_X1_16xlarge__X1_16xlarge);

			Fragments._X1_32xlarge__Memoryoptimized.initOperations(_X1_32xlarge__Memoryoptimized);
			Fragments._X1_32xlarge__MixinBase.initOperations(_X1_32xlarge__MixinBase);
			Fragments._X1_32xlarge__OclAny.initOperations(_X1_32xlarge__OclAny);
			Fragments._X1_32xlarge__OclElement.initOperations(_X1_32xlarge__OclElement);
			Fragments._X1_32xlarge__Resource_tpl.initOperations(_X1_32xlarge__Resource_tpl);
			Fragments._X1_32xlarge__X1_32xlarge.initOperations(_X1_32xlarge__X1_32xlarge);

			Fragments._X1e_16xlarge__Memoryoptimized.initOperations(_X1e_16xlarge__Memoryoptimized);
			Fragments._X1e_16xlarge__MixinBase.initOperations(_X1e_16xlarge__MixinBase);
			Fragments._X1e_16xlarge__OclAny.initOperations(_X1e_16xlarge__OclAny);
			Fragments._X1e_16xlarge__OclElement.initOperations(_X1e_16xlarge__OclElement);
			Fragments._X1e_16xlarge__Resource_tpl.initOperations(_X1e_16xlarge__Resource_tpl);
			Fragments._X1e_16xlarge__X1e_16xlarge.initOperations(_X1e_16xlarge__X1e_16xlarge);

			Fragments._X1e_2xlarge__Memoryoptimized.initOperations(_X1e_2xlarge__Memoryoptimized);
			Fragments._X1e_2xlarge__MixinBase.initOperations(_X1e_2xlarge__MixinBase);
			Fragments._X1e_2xlarge__OclAny.initOperations(_X1e_2xlarge__OclAny);
			Fragments._X1e_2xlarge__OclElement.initOperations(_X1e_2xlarge__OclElement);
			Fragments._X1e_2xlarge__Resource_tpl.initOperations(_X1e_2xlarge__Resource_tpl);
			Fragments._X1e_2xlarge__X1e_2xlarge.initOperations(_X1e_2xlarge__X1e_2xlarge);

			Fragments._X1e_32xlarge__Memoryoptimized.initOperations(_X1e_32xlarge__Memoryoptimized);
			Fragments._X1e_32xlarge__MixinBase.initOperations(_X1e_32xlarge__MixinBase);
			Fragments._X1e_32xlarge__OclAny.initOperations(_X1e_32xlarge__OclAny);
			Fragments._X1e_32xlarge__OclElement.initOperations(_X1e_32xlarge__OclElement);
			Fragments._X1e_32xlarge__Resource_tpl.initOperations(_X1e_32xlarge__Resource_tpl);
			Fragments._X1e_32xlarge__X1e_32xlarge.initOperations(_X1e_32xlarge__X1e_32xlarge);

			Fragments._X1e_4xlarge__Memoryoptimized.initOperations(_X1e_4xlarge__Memoryoptimized);
			Fragments._X1e_4xlarge__MixinBase.initOperations(_X1e_4xlarge__MixinBase);
			Fragments._X1e_4xlarge__OclAny.initOperations(_X1e_4xlarge__OclAny);
			Fragments._X1e_4xlarge__OclElement.initOperations(_X1e_4xlarge__OclElement);
			Fragments._X1e_4xlarge__Resource_tpl.initOperations(_X1e_4xlarge__Resource_tpl);
			Fragments._X1e_4xlarge__X1e_4xlarge.initOperations(_X1e_4xlarge__X1e_4xlarge);

			Fragments._X1e_8xlarge__Memoryoptimized.initOperations(_X1e_8xlarge__Memoryoptimized);
			Fragments._X1e_8xlarge__MixinBase.initOperations(_X1e_8xlarge__MixinBase);
			Fragments._X1e_8xlarge__OclAny.initOperations(_X1e_8xlarge__OclAny);
			Fragments._X1e_8xlarge__OclElement.initOperations(_X1e_8xlarge__OclElement);
			Fragments._X1e_8xlarge__Resource_tpl.initOperations(_X1e_8xlarge__Resource_tpl);
			Fragments._X1e_8xlarge__X1e_8xlarge.initOperations(_X1e_8xlarge__X1e_8xlarge);

			Fragments._X1e_xlarge__Memoryoptimized.initOperations(_X1e_xlarge__Memoryoptimized);
			Fragments._X1e_xlarge__MixinBase.initOperations(_X1e_xlarge__MixinBase);
			Fragments._X1e_xlarge__OclAny.initOperations(_X1e_xlarge__OclAny);
			Fragments._X1e_xlarge__OclElement.initOperations(_X1e_xlarge__OclElement);
			Fragments._X1e_xlarge__Resource_tpl.initOperations(_X1e_xlarge__Resource_tpl);
			Fragments._X1e_xlarge__X1e_xlarge.initOperations(_X1e_xlarge__X1e_xlarge);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AWSInstanceState = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Acceleratedcomputing = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_northeast_1 = {
			Ec2Tables.Properties._Ap_northeast_1__city,
			Ec2Tables.Properties._Ap_northeast_1__country,
			Ec2Tables.Properties._Ap_northeast_1__regionId,
			Ec2Tables.Properties._Ap_northeast_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_northeast_2 = {
			Ec2Tables.Properties._Ap_northeast_2__city,
			Ec2Tables.Properties._Ap_northeast_2__country,
			Ec2Tables.Properties._Ap_northeast_2__regionId,
			Ec2Tables.Properties._Ap_northeast_2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_south_1 = {
			Ec2Tables.Properties._Ap_south_1__city,
			Ec2Tables.Properties._Ap_south_1__country,
			Ec2Tables.Properties._Ap_south_1__regionId,
			Ec2Tables.Properties._Ap_south_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_south_east2 = {
			Ec2Tables.Properties._Ap_south_east2__city,
			Ec2Tables.Properties._Ap_south_east2__country,
			Ec2Tables.Properties._Ap_south_east2__regionId,
			Ec2Tables.Properties._Ap_south_east2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_southeast_1 = {
			Ec2Tables.Properties._Ap_southeast_1__city,
			Ec2Tables.Properties._Ap_southeast_1__country,
			Ec2Tables.Properties._Ap_southeast_1__regionId,
			Ec2Tables.Properties._Ap_southeast_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Awsaccount = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Awscredential = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C1_medium = {
			Ec2Tables.Properties._C1_medium__instanceType,
			Ec2Tables.Properties._C1_medium__occiComputeCores,
			Ec2Tables.Properties._C1_medium__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._C1_medium__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C1_xlarge = {
			Ec2Tables.Properties._C1_xlarge__instanceType,
			Ec2Tables.Properties._C1_xlarge__occiComputeCores,
			Ec2Tables.Properties._C1_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._C1_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C3_2xlarge = {
			Ec2Tables.Properties._C3_2xlarge__instanceType,
			Ec2Tables.Properties._C3_2xlarge__occiComputeCores,
			Ec2Tables.Properties._C3_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._C3_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C3_4xlarge = {
			Ec2Tables.Properties._C3_4xlarge__instanceType,
			Ec2Tables.Properties._C3_4xlarge__occiComputeCores,
			Ec2Tables.Properties._C3_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._C3_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C3_8xlarge = {
			Ec2Tables.Properties._C3_8xlarge__instanceType,
			Ec2Tables.Properties._C3_8xlarge__occiComputeCores,
			Ec2Tables.Properties._C3_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._C3_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C3_large = {
			Ec2Tables.Properties._C3_large__instanceType,
			Ec2Tables.Properties._C3_large__occiComputeCores,
			Ec2Tables.Properties._C3_large__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._C3_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C3_xlarge = {
			Ec2Tables.Properties._C3_xlarge__instanceType,
			Ec2Tables.Properties._C3_xlarge__occiComputeCores,
			Ec2Tables.Properties._C3_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._C3_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C4_2xlarge = {
			Ec2Tables.Properties._C4_2xlarge__instanceType,
			Ec2Tables.Properties._C4_2xlarge__occiComputeCores,
			Ec2Tables.Properties._C4_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C4_4xlarge = {
			Ec2Tables.Properties._C4_4xlarge__instanceType,
			Ec2Tables.Properties._C4_4xlarge__occiComputeCores,
			Ec2Tables.Properties._C4_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C4_8xlarge = {
			Ec2Tables.Properties._C4_8xlarge__instanceType,
			Ec2Tables.Properties._C4_8xlarge__occiComputeCores,
			Ec2Tables.Properties._C4_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C4_large = {
			Ec2Tables.Properties._C4_large__instanceType,
			Ec2Tables.Properties._C4_large__occiComputeCores,
			Ec2Tables.Properties._C4_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C4_xlarge = {
			Ec2Tables.Properties._C4_xlarge__instanceType,
			Ec2Tables.Properties._C4_xlarge__occiComputeCores,
			Ec2Tables.Properties._C4_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C5_18xlarge = {
			Ec2Tables.Properties._C5_18xlarge__instanceType,
			Ec2Tables.Properties._C5_18xlarge__occiComputeCores,
			Ec2Tables.Properties._C5_18xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C5_2xlarge = {
			Ec2Tables.Properties._C5_2xlarge__instanceType,
			Ec2Tables.Properties._C5_2xlarge__occiComputeCores,
			Ec2Tables.Properties._C5_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C5_4xlarge = {
			Ec2Tables.Properties._C5_4xlarge__instanceType,
			Ec2Tables.Properties._C5_4xlarge__occiComputeCores,
			Ec2Tables.Properties._C5_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C5_9xlarge = {
			Ec2Tables.Properties._C5_9xlarge__instanceType,
			Ec2Tables.Properties._C5_9xlarge__occiComputeCores,
			Ec2Tables.Properties._C5_9xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C5_large = {
			Ec2Tables.Properties._C5_large__instanceType,
			Ec2Tables.Properties._C5_large__occiComputeCores,
			Ec2Tables.Properties._C5_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _C5_xlarge = {
			Ec2Tables.Properties._C5_xlarge__instanceType,
			Ec2Tables.Properties._C5_xlarge__occiComputeCores,
			Ec2Tables.Properties._C5_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ca_central_1 = {
			Ec2Tables.Properties._Ca_central_1__city,
			Ec2Tables.Properties._Ca_central_1__country,
			Ec2Tables.Properties._Ca_central_1__regionId,
			Ec2Tables.Properties._Ca_central_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cc2_8xlarge = {
			Ec2Tables.Properties._Cc2_8xlarge__instanceType,
			Ec2Tables.Properties._Cc2_8xlarge__occiComputeCores,
			Ec2Tables.Properties._Cc2_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._Cc2_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cg1_4xlarge = {
			Ec2Tables.Properties._Cg1_4xlarge__instanceType,
			Ec2Tables.Properties._Cg1_4xlarge__occiComputeCores,
			Ec2Tables.Properties._Cg1_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._Cg1_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Computeoptimized = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cr1_8xlarge = {
			Ec2Tables.Properties._Cr1_8xlarge__instanceType,
			Ec2Tables.Properties._Cr1_8xlarge__occiComputeCores,
			Ec2Tables.Properties._Cr1_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._Cr1_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _D2_2xlarge = {
			Ec2Tables.Properties._D2_2xlarge__instanceType,
			Ec2Tables.Properties._D2_2xlarge__occiComputeCores,
			Ec2Tables.Properties._D2_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._D2_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _D2_4xlarge = {
			Ec2Tables.Properties._D2_4xlarge__instanceType,
			Ec2Tables.Properties._D2_4xlarge__occiComputeCores,
			Ec2Tables.Properties._D2_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._D2_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _D2_8xlarge = {
			Ec2Tables.Properties._D2_8xlarge__instanceType,
			Ec2Tables.Properties._D2_8xlarge__occiComputeCores,
			Ec2Tables.Properties._D2_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._D2_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _D2_xlarge = {
			Ec2Tables.Properties._D2_xlarge__instanceType,
			Ec2Tables.Properties._D2_xlarge__occiComputeCores,
			Ec2Tables.Properties._D2_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._D2_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_central_1 = {
			Ec2Tables.Properties._Eu_central_1__city,
			Ec2Tables.Properties._Eu_central_1__country,
			Ec2Tables.Properties._Eu_central_1__regionId,
			Ec2Tables.Properties._Eu_central_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_west_1 = {
			Ec2Tables.Properties._Eu_west_1__city,
			Ec2Tables.Properties._Eu_west_1__country,
			Ec2Tables.Properties._Eu_west_1__regionId,
			Ec2Tables.Properties._Eu_west_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_west_2 = {
			Ec2Tables.Properties._Eu_west_2__city,
			Ec2Tables.Properties._Eu_west_2__country,
			Ec2Tables.Properties._Eu_west_2__regionId,
			Ec2Tables.Properties._Eu_west_2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_west_3 = {
			Ec2Tables.Properties._Eu_west_3__city,
			Ec2Tables.Properties._Eu_west_3__country,
			Ec2Tables.Properties._Eu_west_3__regionId,
			Ec2Tables.Properties._Eu_west_3__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Europe = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _F1_16xlarge = {
			Ec2Tables.Properties._F1_16xlarge__fpga,
			Ec2Tables.Properties._F1_16xlarge__instanceType,
			Ec2Tables.Properties._F1_16xlarge__occiComputeCores,
			Ec2Tables.Properties._F1_16xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._F1_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _F1_2xlarge = {
			Ec2Tables.Properties._F1_2xlarge__fpga,
			Ec2Tables.Properties._F1_2xlarge__instanceType,
			Ec2Tables.Properties._F1_2xlarge__occiComputeCores,
			Ec2Tables.Properties._F1_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._F1_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _G2_2xlarge = {
			Ec2Tables.Properties._G2_2xlarge__instanceType,
			Ec2Tables.Properties._G2_2xlarge__occiComputeCores,
			Ec2Tables.Properties._G2_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._G2_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _G2_8xlarge = {
			Ec2Tables.Properties._G2_8xlarge__instanceType,
			Ec2Tables.Properties._G2_8xlarge__occiComputeCores,
			Ec2Tables.Properties._G2_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._G2_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _G3_16xlarge = {
			Ec2Tables.Properties._G3_16xlarge__gpuMemory,
			Ec2Tables.Properties._G3_16xlarge__gpus,
			Ec2Tables.Properties._G3_16xlarge__instanceType,
			Ec2Tables.Properties._G3_16xlarge__occiComputeCores,
			Ec2Tables.Properties._G3_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _G3_4xlarge = {
			Ec2Tables.Properties._G3_4xlarge__gpuMemory,
			Ec2Tables.Properties._G3_4xlarge__gpus,
			Ec2Tables.Properties._G3_4xlarge__instanceType,
			Ec2Tables.Properties._G3_4xlarge__occiComputeCores,
			Ec2Tables.Properties._G3_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _G3_8xlarge = {
			Ec2Tables.Properties._G3_8xlarge__gpuMemory,
			Ec2Tables.Properties._G3_8xlarge__gpus,
			Ec2Tables.Properties._G3_8xlarge__instanceType,
			Ec2Tables.Properties._G3_8xlarge__occiComputeCores,
			Ec2Tables.Properties._G3_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Generalpurpose = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _H1_16xlarge = {
			Ec2Tables.Properties._H1_16xlarge__instanceType,
			Ec2Tables.Properties._H1_16xlarge__occiComputeCores,
			Ec2Tables.Properties._H1_16xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._H1_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _H1_2xlarge = {
			Ec2Tables.Properties._H1_2xlarge__instanceType,
			Ec2Tables.Properties._H1_2xlarge__occiComputeCores,
			Ec2Tables.Properties._H1_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._H1_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _H1_4xlarge = {
			Ec2Tables.Properties._H1_4xlarge__instanceType,
			Ec2Tables.Properties._H1_4xlarge__occiComputeCores,
			Ec2Tables.Properties._H1_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._H1_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _H1_8xlarge = {
			Ec2Tables.Properties._H1_8xlarge__instanceType,
			Ec2Tables.Properties._H1_8xlarge__occiComputeCores,
			Ec2Tables.Properties._H1_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._H1_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Hs1_8xlarge = {
			Ec2Tables.Properties._Hs1_8xlarge__instanceType,
			Ec2Tables.Properties._Hs1_8xlarge__occiComputeCores,
			Ec2Tables.Properties._Hs1_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._Hs1_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _HypervisorType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I2_2xlarge = {
			Ec2Tables.Properties._I2_2xlarge__instanceType,
			Ec2Tables.Properties._I2_2xlarge__occiComputeCores,
			Ec2Tables.Properties._I2_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I2_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I2_4xlarge = {
			Ec2Tables.Properties._I2_4xlarge__instanceType,
			Ec2Tables.Properties._I2_4xlarge__occiComputeCores,
			Ec2Tables.Properties._I2_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I2_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I2_8xlarge = {
			Ec2Tables.Properties._I2_8xlarge__instanceType,
			Ec2Tables.Properties._I2_8xlarge__occiComputeCores,
			Ec2Tables.Properties._I2_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I2_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I2_xlarge = {
			Ec2Tables.Properties._I2_xlarge__instanceType,
			Ec2Tables.Properties._I2_xlarge__occiComputeCores,
			Ec2Tables.Properties._I2_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I2_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I3_16xlarge = {
			Ec2Tables.Properties._I3_16xlarge__instanceType,
			Ec2Tables.Properties._I3_16xlarge__occiComputeCores,
			Ec2Tables.Properties._I3_16xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I3_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I3_2xlarge = {
			Ec2Tables.Properties._I3_2xlarge__instanceType,
			Ec2Tables.Properties._I3_2xlarge__occiComputeCores,
			Ec2Tables.Properties._I3_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I3_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I3_4xlarge = {
			Ec2Tables.Properties._I3_4xlarge__instanceType,
			Ec2Tables.Properties._I3_4xlarge__occiComputeCores,
			Ec2Tables.Properties._I3_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I3_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I3_8xlarge = {
			Ec2Tables.Properties._I3_8xlarge__instanceType,
			Ec2Tables.Properties._I3_8xlarge__occiComputeCores,
			Ec2Tables.Properties._I3_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I3_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I3_large = {
			Ec2Tables.Properties._I3_large__instanceType,
			Ec2Tables.Properties._I3_large__occiComputeCores,
			Ec2Tables.Properties._I3_large__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I3_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I3_metal = {
			Ec2Tables.Properties._I3_metal__instanceType,
			Ec2Tables.Properties._I3_metal__occiComputeCores,
			Ec2Tables.Properties._I3_metal__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I3_metal__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _I3_xlarge = {
			Ec2Tables.Properties._I3_xlarge__instanceType,
			Ec2Tables.Properties._I3_xlarge__occiComputeCores,
			Ec2Tables.Properties._I3_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._I3_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _InstanceLifeCycleType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instanceec2 = {
			Ec2Tables.Properties._Instanceec2__amiLaunchIndex,
			Ec2Tables.Properties._Instanceec2__awsInstanceStatus,
			Ec2Tables.Properties._Instanceec2__ebsOptimizedIO,
			Ec2Tables.Properties._Instanceec2__enaSupport,
			Ec2Tables.Properties._Instanceec2__hypervisor,
			Ec2Tables.Properties._Instanceec2__imageId,
			Ec2Tables.Properties._Instanceec2__instanceId,
			Ec2Tables.Properties._Instanceec2__instanceLifeCycle,
			Ec2Tables.Properties._Instanceec2__instanceType,
			Ec2Tables.Properties._Instanceec2__kernelId,
			Ec2Tables.Properties._Instanceec2__keyPairName,
			Ec2Tables.Properties._Instanceec2__launchTime,
			Ec2Tables.Properties._Instanceec2__monitoringState,
			Ec2Tables.Properties._Instanceec2__name,
			Ec2Tables.Properties._Instanceec2__platform,
			Ec2Tables.Properties._Instanceec2__privateDNSName,
			Ec2Tables.Properties._Instanceec2__privateIpV4Address,
			Ec2Tables.Properties._Instanceec2__publicDNSName,
			Ec2Tables.Properties._Instanceec2__publicIpv4Address,
			Ec2Tables.Properties._Instanceec2__ramDiskId,
			Ec2Tables.Properties._Instanceec2__regionId,
			Ec2Tables.Properties._Instanceec2__sriovNetSupport,
			Ec2Tables.Properties._Instanceec2__virtualizationType,
			Ec2Tables.Properties._Instanceec2__zoneName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instancevpcinfo = {
			Ec2Tables.Properties._Instancevpcinfo__sourceDestCheck,
			Ec2Tables.Properties._Instancevpcinfo__subnetId,
			Ec2Tables.Properties._Instancevpcinfo__vpcId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M1_large = {
			Ec2Tables.Properties._M1_large__instanceType,
			Ec2Tables.Properties._M1_large__occiComputeCores,
			Ec2Tables.Properties._M1_large__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M1_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M1_medium = {
			Ec2Tables.Properties._M1_medium__instanceType,
			Ec2Tables.Properties._M1_medium__occiComputeCores,
			Ec2Tables.Properties._M1_medium__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M1_medium__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M1_small = {
			Ec2Tables.Properties._M1_small__instanceType,
			Ec2Tables.Properties._M1_small__occiComputeCores,
			Ec2Tables.Properties._M1_small__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M1_small__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M1_xlarge = {
			Ec2Tables.Properties._M1_xlarge__instanceType,
			Ec2Tables.Properties._M1_xlarge__occiComputeCores,
			Ec2Tables.Properties._M1_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M1_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M2_2xlarge = {
			Ec2Tables.Properties._M2_2xlarge__instanceType,
			Ec2Tables.Properties._M2_2xlarge__occiComputeCores,
			Ec2Tables.Properties._M2_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M2_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M2_4xlarge = {
			Ec2Tables.Properties._M2_4xlarge__instanceType,
			Ec2Tables.Properties._M2_4xlarge__occiComputeCores,
			Ec2Tables.Properties._M2_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M2_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M2_xlarge = {
			Ec2Tables.Properties._M2_xlarge__instanceType,
			Ec2Tables.Properties._M2_xlarge__occiComputeCores,
			Ec2Tables.Properties._M2_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M2_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M3_2xlarge = {
			Ec2Tables.Properties._M3_2xlarge__instanceType,
			Ec2Tables.Properties._M3_2xlarge__occiComputeCores,
			Ec2Tables.Properties._M3_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M3_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M3_large = {
			Ec2Tables.Properties._M3_large__instanceType,
			Ec2Tables.Properties._M3_large__occiComputeCores,
			Ec2Tables.Properties._M3_large__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M3_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M3_medium = {
			Ec2Tables.Properties._M3_medium__instanceType,
			Ec2Tables.Properties._M3_medium__occiComputeCores,
			Ec2Tables.Properties._M3_medium__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M3_medium__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M3_xlarge = {
			Ec2Tables.Properties._M3_xlarge__instanceType,
			Ec2Tables.Properties._M3_xlarge__occiComputeCores,
			Ec2Tables.Properties._M3_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._M3_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M4_10xlarge = {
			Ec2Tables.Properties._M4_10xlarge__instanceType,
			Ec2Tables.Properties._M4_10xlarge__occiComputeCores,
			Ec2Tables.Properties._M4_10xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M4_16xlarge = {
			Ec2Tables.Properties._M4_16xlarge__instanceType,
			Ec2Tables.Properties._M4_16xlarge__occiComputeCores,
			Ec2Tables.Properties._M4_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M4_2xlarge = {
			Ec2Tables.Properties._M4_2xlarge__instanceType,
			Ec2Tables.Properties._M4_2xlarge__occiComputeCores,
			Ec2Tables.Properties._M4_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M4_large = {
			Ec2Tables.Properties._M4_large__instanceType,
			Ec2Tables.Properties._M4_large__occiComputeCores,
			Ec2Tables.Properties._M4_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M4_xlarge = {
			Ec2Tables.Properties._M4_xlarge__instanceType,
			Ec2Tables.Properties._M4_xlarge__occiComputeCores,
			Ec2Tables.Properties._M4_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M5_12xlarge = {
			Ec2Tables.Properties._M5_12xlarge__instanceType,
			Ec2Tables.Properties._M5_12xlarge__occiComputeCores,
			Ec2Tables.Properties._M5_12xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M5_24xlarge = {
			Ec2Tables.Properties._M5_24xlarge__instanceType,
			Ec2Tables.Properties._M5_24xlarge__occiComputeCores,
			Ec2Tables.Properties._M5_24xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M5_2xlarge = {
			Ec2Tables.Properties._M5_2xlarge__instanceType,
			Ec2Tables.Properties._M5_2xlarge__occiComputeCores,
			Ec2Tables.Properties._M5_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M5_4xlarge = {
			Ec2Tables.Properties._M5_4xlarge__instanceType,
			Ec2Tables.Properties._M5_4xlarge__occiComputeCores,
			Ec2Tables.Properties._M5_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M5_large = {
			Ec2Tables.Properties._M5_large__instanceType,
			Ec2Tables.Properties._M5_large__occiComputeCores,
			Ec2Tables.Properties._M5_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _M5_xlarge = {
			Ec2Tables.Properties._M5_xlarge__instanceType,
			Ec2Tables.Properties._M5_xlarge__occiComputeCores,
			Ec2Tables.Properties._M5_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Memoryoptimized = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MonitoringState = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _P2_16xlarge = {
			Ec2Tables.Properties._P2_16xlarge__gpuMemory,
			Ec2Tables.Properties._P2_16xlarge__gpuP2P,
			Ec2Tables.Properties._P2_16xlarge__gpus,
			Ec2Tables.Properties._P2_16xlarge__instanceType,
			Ec2Tables.Properties._P2_16xlarge__occiComputeCores,
			Ec2Tables.Properties._P2_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _P2_8xlarge = {
			Ec2Tables.Properties._P2_8xlarge__gpuMemory,
			Ec2Tables.Properties._P2_8xlarge__gpuP2P,
			Ec2Tables.Properties._P2_8xlarge__gpus,
			Ec2Tables.Properties._P2_8xlarge__instanceType,
			Ec2Tables.Properties._P2_8xlarge__occiComputeCores,
			Ec2Tables.Properties._P2_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _P2_xlarge = {
			Ec2Tables.Properties._P2_xlarge__gpuMemory,
			Ec2Tables.Properties._P2_xlarge__gpuP2P,
			Ec2Tables.Properties._P2_xlarge__gpus,
			Ec2Tables.Properties._P2_xlarge__instanceType,
			Ec2Tables.Properties._P2_xlarge__occiComputeCores,
			Ec2Tables.Properties._P2_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _P3_16xlarge = {
			Ec2Tables.Properties._P3_16xlarge__gpuMemory,
			Ec2Tables.Properties._P3_16xlarge__gpuP2P,
			Ec2Tables.Properties._P3_16xlarge__gpus,
			Ec2Tables.Properties._P3_16xlarge__instanceType,
			Ec2Tables.Properties._P3_16xlarge__occiComputeCores,
			Ec2Tables.Properties._P3_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _P3_2xlarge = {
			Ec2Tables.Properties._P3_2xlarge__gpuMemory,
			Ec2Tables.Properties._P3_2xlarge__gpuP2P,
			Ec2Tables.Properties._P3_2xlarge__gpus,
			Ec2Tables.Properties._P3_2xlarge__instanceType,
			Ec2Tables.Properties._P3_2xlarge__occiComputeCores,
			Ec2Tables.Properties._P3_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _P3_8xlarge = {
			Ec2Tables.Properties._P3_8xlarge__gpuMemory,
			Ec2Tables.Properties._P3_8xlarge__gpuP2P,
			Ec2Tables.Properties._P3_8xlarge__gpus,
			Ec2Tables.Properties._P3_8xlarge__instanceType,
			Ec2Tables.Properties._P3_8xlarge__occiComputeCores,
			Ec2Tables.Properties._P3_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Placementgroup = {
			Ec2Tables.Properties._Placementgroup__affinity,
			Ec2Tables.Properties._Placementgroup__groupName,
			Ec2Tables.Properties._Placementgroup__hostId,
			Ec2Tables.Properties._Placementgroup__spreadDomain,
			Ec2Tables.Properties._Placementgroup__tenancy,
			Ec2Tables.Properties._Placementgroup__zoneName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R3_2xlarge = {
			Ec2Tables.Properties._R3_2xlarge__instanceType,
			Ec2Tables.Properties._R3_2xlarge__occiComputeCores,
			Ec2Tables.Properties._R3_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._R3_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R3_4xlarge = {
			Ec2Tables.Properties._R3_4xlarge__instanceType,
			Ec2Tables.Properties._R3_4xlarge__occiComputeCores,
			Ec2Tables.Properties._R3_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._R3_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R3_8xlarge = {
			Ec2Tables.Properties._R3_8xlarge__instanceType,
			Ec2Tables.Properties._R3_8xlarge__occiComputeCores,
			Ec2Tables.Properties._R3_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._R3_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R3_large = {
			Ec2Tables.Properties._R3_large__instanceType,
			Ec2Tables.Properties._R3_large__occiComputeCores,
			Ec2Tables.Properties._R3_large__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._R3_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R3_xlarge = {
			Ec2Tables.Properties._R3_xlarge__instanceType,
			Ec2Tables.Properties._R3_xlarge__occiComputeCores,
			Ec2Tables.Properties._R3_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._R3_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R4_16xlarge = {
			Ec2Tables.Properties._R4_16xlarge__instanceType,
			Ec2Tables.Properties._R4_16xlarge__occiComputeCores,
			Ec2Tables.Properties._R4_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R4_2xlarge = {
			Ec2Tables.Properties._R4_2xlarge__instanceType,
			Ec2Tables.Properties._R4_2xlarge__occiComputeCores,
			Ec2Tables.Properties._R4_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R4_4xlarge = {
			Ec2Tables.Properties._R4_4xlarge__instanceType,
			Ec2Tables.Properties._R4_4xlarge__occiComputeCores,
			Ec2Tables.Properties._R4_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R4_8xlarge = {
			Ec2Tables.Properties._R4_8xlarge__instanceType,
			Ec2Tables.Properties._R4_8xlarge__occiComputeCores,
			Ec2Tables.Properties._R4_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R4_large = {
			Ec2Tables.Properties._R4_large__instanceType,
			Ec2Tables.Properties._R4_large__occiComputeCores,
			Ec2Tables.Properties._R4_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _R4_xlarge = {
			Ec2Tables.Properties._R4_xlarge__instanceType,
			Ec2Tables.Properties._R4_xlarge__occiComputeCores,
			Ec2Tables.Properties._R4_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rootdevicevolume = {
			Ec2Tables.Properties._Rootdevicevolume__rootDeviceName,
			Ec2Tables.Properties._Rootdevicevolume__rootDeviceType
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sa_east_1 = {
			Ec2Tables.Properties._Sa_east_1__city,
			Ec2Tables.Properties._Sa_east_1__country,
			Ec2Tables.Properties._Sa_east_1__regionId,
			Ec2Tables.Properties._Sa_east_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Statustransitionreason = {
			Ec2Tables.Properties._Statustransitionreason__stateTransitionCode,
			Ec2Tables.Properties._Statustransitionreason__stateTransitionMessage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Storageoptimized = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T1_micro = {
			Ec2Tables.Properties._T1_micro__instanceType,
			Ec2Tables.Properties._T1_micro__occiComputeCores,
			Ec2Tables.Properties._T1_micro__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T2_2xlarge = {
			Ec2Tables.Properties._T2_2xlarge__instanceType,
			Ec2Tables.Properties._T2_2xlarge__occiComputeCores,
			Ec2Tables.Properties._T2_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T2_large = {
			Ec2Tables.Properties._T2_large__instanceType,
			Ec2Tables.Properties._T2_large__occiComputeCores,
			Ec2Tables.Properties._T2_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T2_medium = {
			Ec2Tables.Properties._T2_medium__instanceType,
			Ec2Tables.Properties._T2_medium__occiComputeCores,
			Ec2Tables.Properties._T2_medium__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T2_micro = {
			Ec2Tables.Properties._T2_micro__instanceType,
			Ec2Tables.Properties._T2_micro__occiComputeCores,
			Ec2Tables.Properties._T2_micro__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T2_nano = {
			Ec2Tables.Properties._T2_nano__instanceType,
			Ec2Tables.Properties._T2_nano__occiComputeCores,
			Ec2Tables.Properties._T2_nano__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T2_small = {
			Ec2Tables.Properties._T2_small__instanceType,
			Ec2Tables.Properties._T2_small__occiComputeCores,
			Ec2Tables.Properties._T2_small__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _T2_xlarge = {
			Ec2Tables.Properties._T2_xlarge__instanceType,
			Ec2Tables.Properties._T2_xlarge__occiComputeCores,
			Ec2Tables.Properties._T2_xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tags = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_east_1 = {
			Ec2Tables.Properties._Us_east_1__city,
			Ec2Tables.Properties._Us_east_1__country,
			Ec2Tables.Properties._Us_east_1__regionId,
			Ec2Tables.Properties._Us_east_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_east_2 = {
			Ec2Tables.Properties._Us_east_2__city,
			Ec2Tables.Properties._Us_east_2__country,
			Ec2Tables.Properties._Us_east_2__regionId,
			Ec2Tables.Properties._Us_east_2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_west_1 = {
			Ec2Tables.Properties._Us_west_1__city,
			Ec2Tables.Properties._Us_west_1__country,
			Ec2Tables.Properties._Us_west_1__regionId,
			Ec2Tables.Properties._Us_west_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_west_2 = {
			Ec2Tables.Properties._Us_west_2__city,
			Ec2Tables.Properties._Us_west_2__country,
			Ec2Tables.Properties._Us_west_2__regionId,
			Ec2Tables.Properties._Us_west_2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VirtualizationType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1_16xlarge = {
			Ec2Tables.Properties._X1_16xlarge__instanceType,
			Ec2Tables.Properties._X1_16xlarge__occiComputeCores,
			Ec2Tables.Properties._X1_16xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1_32xlarge = {
			Ec2Tables.Properties._X1_32xlarge__instanceType,
			Ec2Tables.Properties._X1_32xlarge__occiComputeCores,
			Ec2Tables.Properties._X1_32xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1_32xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1e_16xlarge = {
			Ec2Tables.Properties._X1e_16xlarge__instanceType,
			Ec2Tables.Properties._X1e_16xlarge__occiComputeCores,
			Ec2Tables.Properties._X1e_16xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1e_16xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1e_2xlarge = {
			Ec2Tables.Properties._X1e_2xlarge__instanceType,
			Ec2Tables.Properties._X1e_2xlarge__occiComputeCores,
			Ec2Tables.Properties._X1e_2xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1e_2xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1e_32xlarge = {
			Ec2Tables.Properties._X1e_32xlarge__instanceType,
			Ec2Tables.Properties._X1e_32xlarge__occiComputeCores,
			Ec2Tables.Properties._X1e_32xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1e_32xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1e_4xlarge = {
			Ec2Tables.Properties._X1e_4xlarge__instanceType,
			Ec2Tables.Properties._X1e_4xlarge__occiComputeCores,
			Ec2Tables.Properties._X1e_4xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1e_4xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1e_8xlarge = {
			Ec2Tables.Properties._X1e_8xlarge__instanceType,
			Ec2Tables.Properties._X1e_8xlarge__occiComputeCores,
			Ec2Tables.Properties._X1e_8xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1e_8xlarge__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _X1e_xlarge = {
			Ec2Tables.Properties._X1e_xlarge__instanceType,
			Ec2Tables.Properties._X1e_xlarge__occiComputeCores,
			Ec2Tables.Properties._X1e_xlarge__occiComputeEphemeralStorageSize,
			Ec2Tables.Properties._X1e_xlarge__occiComputeMemory
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AWSInstanceState__AWSInstanceState.initProperties(_AWSInstanceState);
			Fragments._Acceleratedcomputing__Acceleratedcomputing.initProperties(_Acceleratedcomputing);
			Fragments._Ap_northeast_1__Ap_northeast_1.initProperties(_Ap_northeast_1);
			Fragments._Ap_northeast_2__Ap_northeast_2.initProperties(_Ap_northeast_2);
			Fragments._Ap_south_1__Ap_south_1.initProperties(_Ap_south_1);
			Fragments._Ap_south_east2__Ap_south_east2.initProperties(_Ap_south_east2);
			Fragments._Ap_southeast_1__Ap_southeast_1.initProperties(_Ap_southeast_1);
			Fragments._Awsaccount__Awsaccount.initProperties(_Awsaccount);
			Fragments._Awscredential__Awscredential.initProperties(_Awscredential);
			Fragments._C1_medium__C1_medium.initProperties(_C1_medium);
			Fragments._C1_xlarge__C1_xlarge.initProperties(_C1_xlarge);
			Fragments._C3_2xlarge__C3_2xlarge.initProperties(_C3_2xlarge);
			Fragments._C3_4xlarge__C3_4xlarge.initProperties(_C3_4xlarge);
			Fragments._C3_8xlarge__C3_8xlarge.initProperties(_C3_8xlarge);
			Fragments._C3_large__C3_large.initProperties(_C3_large);
			Fragments._C3_xlarge__C3_xlarge.initProperties(_C3_xlarge);
			Fragments._C4_2xlarge__C4_2xlarge.initProperties(_C4_2xlarge);
			Fragments._C4_4xlarge__C4_4xlarge.initProperties(_C4_4xlarge);
			Fragments._C4_8xlarge__C4_8xlarge.initProperties(_C4_8xlarge);
			Fragments._C4_large__C4_large.initProperties(_C4_large);
			Fragments._C4_xlarge__C4_xlarge.initProperties(_C4_xlarge);
			Fragments._C5_18xlarge__C5_18xlarge.initProperties(_C5_18xlarge);
			Fragments._C5_2xlarge__C5_2xlarge.initProperties(_C5_2xlarge);
			Fragments._C5_4xlarge__C5_4xlarge.initProperties(_C5_4xlarge);
			Fragments._C5_9xlarge__C5_9xlarge.initProperties(_C5_9xlarge);
			Fragments._C5_large__C5_large.initProperties(_C5_large);
			Fragments._C5_xlarge__C5_xlarge.initProperties(_C5_xlarge);
			Fragments._Ca_central_1__Ca_central_1.initProperties(_Ca_central_1);
			Fragments._Cc2_8xlarge__Cc2_8xlarge.initProperties(_Cc2_8xlarge);
			Fragments._Cg1_4xlarge__Cg1_4xlarge.initProperties(_Cg1_4xlarge);
			Fragments._Computeoptimized__Computeoptimized.initProperties(_Computeoptimized);
			Fragments._Cr1_8xlarge__Cr1_8xlarge.initProperties(_Cr1_8xlarge);
			Fragments._D2_2xlarge__D2_2xlarge.initProperties(_D2_2xlarge);
			Fragments._D2_4xlarge__D2_4xlarge.initProperties(_D2_4xlarge);
			Fragments._D2_8xlarge__D2_8xlarge.initProperties(_D2_8xlarge);
			Fragments._D2_xlarge__D2_xlarge.initProperties(_D2_xlarge);
			Fragments._Eu_central_1__Eu_central_1.initProperties(_Eu_central_1);
			Fragments._Eu_west_1__Eu_west_1.initProperties(_Eu_west_1);
			Fragments._Eu_west_2__Eu_west_2.initProperties(_Eu_west_2);
			Fragments._Eu_west_3__Eu_west_3.initProperties(_Eu_west_3);
			Fragments._Europe__Europe.initProperties(_Europe);
			Fragments._F1_16xlarge__F1_16xlarge.initProperties(_F1_16xlarge);
			Fragments._F1_2xlarge__F1_2xlarge.initProperties(_F1_2xlarge);
			Fragments._G2_2xlarge__G2_2xlarge.initProperties(_G2_2xlarge);
			Fragments._G2_8xlarge__G2_8xlarge.initProperties(_G2_8xlarge);
			Fragments._G3_16xlarge__G3_16xlarge.initProperties(_G3_16xlarge);
			Fragments._G3_4xlarge__G3_4xlarge.initProperties(_G3_4xlarge);
			Fragments._G3_8xlarge__G3_8xlarge.initProperties(_G3_8xlarge);
			Fragments._Generalpurpose__Generalpurpose.initProperties(_Generalpurpose);
			Fragments._H1_16xlarge__H1_16xlarge.initProperties(_H1_16xlarge);
			Fragments._H1_2xlarge__H1_2xlarge.initProperties(_H1_2xlarge);
			Fragments._H1_4xlarge__H1_4xlarge.initProperties(_H1_4xlarge);
			Fragments._H1_8xlarge__H1_8xlarge.initProperties(_H1_8xlarge);
			Fragments._Hs1_8xlarge__Hs1_8xlarge.initProperties(_Hs1_8xlarge);
			Fragments._HypervisorType__HypervisorType.initProperties(_HypervisorType);
			Fragments._I2_2xlarge__I2_2xlarge.initProperties(_I2_2xlarge);
			Fragments._I2_4xlarge__I2_4xlarge.initProperties(_I2_4xlarge);
			Fragments._I2_8xlarge__I2_8xlarge.initProperties(_I2_8xlarge);
			Fragments._I2_xlarge__I2_xlarge.initProperties(_I2_xlarge);
			Fragments._I3_16xlarge__I3_16xlarge.initProperties(_I3_16xlarge);
			Fragments._I3_2xlarge__I3_2xlarge.initProperties(_I3_2xlarge);
			Fragments._I3_4xlarge__I3_4xlarge.initProperties(_I3_4xlarge);
			Fragments._I3_8xlarge__I3_8xlarge.initProperties(_I3_8xlarge);
			Fragments._I3_large__I3_large.initProperties(_I3_large);
			Fragments._I3_metal__I3_metal.initProperties(_I3_metal);
			Fragments._I3_xlarge__I3_xlarge.initProperties(_I3_xlarge);
			Fragments._InstanceLifeCycleType__InstanceLifeCycleType.initProperties(_InstanceLifeCycleType);
			Fragments._Instanceec2__Instanceec2.initProperties(_Instanceec2);
			Fragments._Instancevpcinfo__Instancevpcinfo.initProperties(_Instancevpcinfo);
			Fragments._M1_large__M1_large.initProperties(_M1_large);
			Fragments._M1_medium__M1_medium.initProperties(_M1_medium);
			Fragments._M1_small__M1_small.initProperties(_M1_small);
			Fragments._M1_xlarge__M1_xlarge.initProperties(_M1_xlarge);
			Fragments._M2_2xlarge__M2_2xlarge.initProperties(_M2_2xlarge);
			Fragments._M2_4xlarge__M2_4xlarge.initProperties(_M2_4xlarge);
			Fragments._M2_xlarge__M2_xlarge.initProperties(_M2_xlarge);
			Fragments._M3_2xlarge__M3_2xlarge.initProperties(_M3_2xlarge);
			Fragments._M3_large__M3_large.initProperties(_M3_large);
			Fragments._M3_medium__M3_medium.initProperties(_M3_medium);
			Fragments._M3_xlarge__M3_xlarge.initProperties(_M3_xlarge);
			Fragments._M4_10xlarge__M4_10xlarge.initProperties(_M4_10xlarge);
			Fragments._M4_16xlarge__M4_16xlarge.initProperties(_M4_16xlarge);
			Fragments._M4_2xlarge__M4_2xlarge.initProperties(_M4_2xlarge);
			Fragments._M4_large__M4_large.initProperties(_M4_large);
			Fragments._M4_xlarge__M4_xlarge.initProperties(_M4_xlarge);
			Fragments._M5_12xlarge__M5_12xlarge.initProperties(_M5_12xlarge);
			Fragments._M5_24xlarge__M5_24xlarge.initProperties(_M5_24xlarge);
			Fragments._M5_2xlarge__M5_2xlarge.initProperties(_M5_2xlarge);
			Fragments._M5_4xlarge__M5_4xlarge.initProperties(_M5_4xlarge);
			Fragments._M5_large__M5_large.initProperties(_M5_large);
			Fragments._M5_xlarge__M5_xlarge.initProperties(_M5_xlarge);
			Fragments._Memoryoptimized__Memoryoptimized.initProperties(_Memoryoptimized);
			Fragments._MonitoringState__MonitoringState.initProperties(_MonitoringState);
			Fragments._P2_16xlarge__P2_16xlarge.initProperties(_P2_16xlarge);
			Fragments._P2_8xlarge__P2_8xlarge.initProperties(_P2_8xlarge);
			Fragments._P2_xlarge__P2_xlarge.initProperties(_P2_xlarge);
			Fragments._P3_16xlarge__P3_16xlarge.initProperties(_P3_16xlarge);
			Fragments._P3_2xlarge__P3_2xlarge.initProperties(_P3_2xlarge);
			Fragments._P3_8xlarge__P3_8xlarge.initProperties(_P3_8xlarge);
			Fragments._Placementgroup__Placementgroup.initProperties(_Placementgroup);
			Fragments._R3_2xlarge__R3_2xlarge.initProperties(_R3_2xlarge);
			Fragments._R3_4xlarge__R3_4xlarge.initProperties(_R3_4xlarge);
			Fragments._R3_8xlarge__R3_8xlarge.initProperties(_R3_8xlarge);
			Fragments._R3_large__R3_large.initProperties(_R3_large);
			Fragments._R3_xlarge__R3_xlarge.initProperties(_R3_xlarge);
			Fragments._R4_16xlarge__R4_16xlarge.initProperties(_R4_16xlarge);
			Fragments._R4_2xlarge__R4_2xlarge.initProperties(_R4_2xlarge);
			Fragments._R4_4xlarge__R4_4xlarge.initProperties(_R4_4xlarge);
			Fragments._R4_8xlarge__R4_8xlarge.initProperties(_R4_8xlarge);
			Fragments._R4_large__R4_large.initProperties(_R4_large);
			Fragments._R4_xlarge__R4_xlarge.initProperties(_R4_xlarge);
			Fragments._Rootdevicevolume__Rootdevicevolume.initProperties(_Rootdevicevolume);
			Fragments._Sa_east_1__Sa_east_1.initProperties(_Sa_east_1);
			Fragments._Statustransitionreason__Statustransitionreason.initProperties(_Statustransitionreason);
			Fragments._Storageoptimized__Storageoptimized.initProperties(_Storageoptimized);
			Fragments._T1_micro__T1_micro.initProperties(_T1_micro);
			Fragments._T2_2xlarge__T2_2xlarge.initProperties(_T2_2xlarge);
			Fragments._T2_large__T2_large.initProperties(_T2_large);
			Fragments._T2_medium__T2_medium.initProperties(_T2_medium);
			Fragments._T2_micro__T2_micro.initProperties(_T2_micro);
			Fragments._T2_nano__T2_nano.initProperties(_T2_nano);
			Fragments._T2_small__T2_small.initProperties(_T2_small);
			Fragments._T2_xlarge__T2_xlarge.initProperties(_T2_xlarge);
			Fragments._Tags__Tags.initProperties(_Tags);
			Fragments._Us_east_1__Us_east_1.initProperties(_Us_east_1);
			Fragments._Us_east_2__Us_east_2.initProperties(_Us_east_2);
			Fragments._Us_west_1__Us_west_1.initProperties(_Us_west_1);
			Fragments._Us_west_2__Us_west_2.initProperties(_Us_west_2);
			Fragments._VirtualizationType__VirtualizationType.initProperties(_VirtualizationType);
			Fragments._X1_16xlarge__X1_16xlarge.initProperties(_X1_16xlarge);
			Fragments._X1_32xlarge__X1_32xlarge.initProperties(_X1_32xlarge);
			Fragments._X1e_16xlarge__X1e_16xlarge.initProperties(_X1e_16xlarge);
			Fragments._X1e_2xlarge__X1e_2xlarge.initProperties(_X1e_2xlarge);
			Fragments._X1e_32xlarge__X1e_32xlarge.initProperties(_X1e_32xlarge);
			Fragments._X1e_4xlarge__X1e_4xlarge.initProperties(_X1e_4xlarge);
			Fragments._X1e_8xlarge__X1e_8xlarge.initProperties(_X1e_8xlarge);
			Fragments._X1e_xlarge__X1e_xlarge.initProperties(_X1e_xlarge);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__pending = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("pending"), Types._AWSInstanceState, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__running = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("running"), Types._AWSInstanceState, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__shuttingdown = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("shuttingdown"), Types._AWSInstanceState, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__stopping = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("stopping"), Types._AWSInstanceState, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__stopped = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("stopped"), Types._AWSInstanceState, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__terminated = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("terminated"), Types._AWSInstanceState, 5);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__notexist = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("notexist"), Types._AWSInstanceState, 6);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AWSInstanceState__rebooting = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.AWS_INSTANCE_STATE.getEEnumLiteral("rebooting"), Types._AWSInstanceState, 7);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AWSInstanceState = {
			_AWSInstanceState__pending,
			_AWSInstanceState__running,
			_AWSInstanceState__shuttingdown,
			_AWSInstanceState__stopping,
			_AWSInstanceState__stopped,
			_AWSInstanceState__terminated,
			_AWSInstanceState__notexist,
			_AWSInstanceState__rebooting
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _HypervisorType__Ovm = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.HYPERVISOR_TYPE.getEEnumLiteral("Ovm"), Types._HypervisorType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _HypervisorType__Xen = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.HYPERVISOR_TYPE.getEEnumLiteral("Xen"), Types._HypervisorType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _HypervisorType = {
			_HypervisorType__Ovm,
			_HypervisorType__Xen
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InstanceLifeCycleType__Scheduled = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.INSTANCE_LIFE_CYCLE_TYPE.getEEnumLiteral("Scheduled"), Types._InstanceLifeCycleType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _InstanceLifeCycleType__Spot = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.INSTANCE_LIFE_CYCLE_TYPE.getEEnumLiteral("Spot"), Types._InstanceLifeCycleType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _InstanceLifeCycleType = {
			_InstanceLifeCycleType__Scheduled,
			_InstanceLifeCycleType__Spot
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MonitoringState__Disabled = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.MONITORING_STATE.getEEnumLiteral("Disabled"), Types._MonitoringState, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MonitoringState__Disabling = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.MONITORING_STATE.getEEnumLiteral("Disabling"), Types._MonitoringState, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MonitoringState__Enabled = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.MONITORING_STATE.getEEnumLiteral("Enabled"), Types._MonitoringState, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MonitoringState__Pending = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.MONITORING_STATE.getEEnumLiteral("Pending"), Types._MonitoringState, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MonitoringState = {
			_MonitoringState__Disabled,
			_MonitoringState__Disabling,
			_MonitoringState__Enabled,
			_MonitoringState__Pending
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VirtualizationType__Hvm = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.VIRTUALIZATION_TYPE.getEEnumLiteral("Hvm"), Types._VirtualizationType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VirtualizationType__Paravirtual = new EcoreExecutorEnumerationLiteral(Ec2Package.Literals.VIRTUALIZATION_TYPE.getEEnumLiteral("Paravirtual"), Types._VirtualizationType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VirtualizationType = {
			_VirtualizationType__Hvm,
			_VirtualizationType__Paravirtual
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AWSInstanceState.initLiterals(_AWSInstanceState);
			Types._HypervisorType.initLiterals(_HypervisorType);
			Types._InstanceLifeCycleType.initLiterals(_InstanceLifeCycleType);
			Types._MonitoringState.initLiterals(_MonitoringState);
			Types._VirtualizationType.initLiterals(_VirtualizationType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Ec2Tables::EnumerationLiterals and all preceding sub-packages.
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
