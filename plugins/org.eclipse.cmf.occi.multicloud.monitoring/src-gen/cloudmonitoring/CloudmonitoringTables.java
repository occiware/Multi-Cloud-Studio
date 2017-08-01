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
 *   /org.eclipse.cmf.occi.multicloud.monitoring/model/cloudmonitoring.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.monitoring/model/cloudmonitoring.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package cloudmonitoring;

import cloudmonitoring.CloudmonitoringTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.monitoring.MonitoringTables;
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
 * CloudmonitoringTables provides the dispatch tables for the cloudmonitoring for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class CloudmonitoringTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CloudmonitoringPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/multicloud/monitoring/ecore", null, cloudmonitoring.CloudmonitoringPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/monitoring/ecore", null, org.eclipse.cmf.occi.monitoring.MonitoringPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = cloudmonitoring.CloudmonitoringTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Collector = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Collector", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cpu = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Cpu", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Disk = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Disk", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Diskio = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Diskio", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Emfpublisher = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Emfpublisher", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Inputoutput = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Inputoutput", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mailpublisher = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Mailpublisher", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mainmetric = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Mainmetric", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networkio = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Networkio", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Publishercontrol = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Publishercontrol", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ram = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Ram", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sensor = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Sensor", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sensorcontrol = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Sensorcontrol", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Systemoutpublisher = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getClassId("Systemoutpublisher", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Average = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getDataTypeId("Average", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_PerSec = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getDataTypeId("PerSec", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Percent = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getDataTypeId("Percent", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Temperature = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getDataTypeId("Temperature", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_IOUnit = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getEnumerationId("IOUnit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_MonitorState = cloudmonitoring.CloudmonitoringTables.PACKid_http_c_s_s_occiware_org_s_occi_s_multicloud_s_monitoring_s_ecore.getEnumerationId("MonitorState");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Cpu_c_c_appliesConstraint = "Cpu::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Disk_c_c_appliesConstraint = "Disk::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Diskio_c_c_appliesConstraint = "Diskio::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Emfpublisher_c_c_appliesConstraint = "Emfpublisher::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Inputoutput_c_c_appliesConstraint = "Inputoutput::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Mailpublisher_c_c_appliesConstraint = "Mailpublisher::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Mainmetric_c_c_appliesConstraint = "Mainmetric::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Networkio_c_c_appliesConstraint = "Networkio::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Publishercontrol_c_c_appliesConstraint = "Publishercontrol::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Ram_c_c_appliesConstraint = "Ram::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Sensorcontrol_c_c_appliesConstraint = "Sensorcontrol::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Systemoutpublisher_c_c_appliesConstraint = "Systemoutpublisher::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CloudmonitoringTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::TypeParameters and all preceding sub-packages.
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
		public static final /*@NonNull*/ EcoreExecutorType _Cpu = new EcoreExecutorType(CloudmonitoringPackage.Literals.CPU, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Disk = new EcoreExecutorType(CloudmonitoringPackage.Literals.DISK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Diskio = new EcoreExecutorType(CloudmonitoringPackage.Literals.DISKIO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Emfpublisher = new EcoreExecutorType(CloudmonitoringPackage.Literals.EMFPUBLISHER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _IOUnit = new EcoreExecutorEnumeration(CloudmonitoringPackage.Literals.IO_UNIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Inputoutput = new EcoreExecutorType(CloudmonitoringPackage.Literals.INPUTOUTPUT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mailpublisher = new EcoreExecutorType(CloudmonitoringPackage.Literals.MAILPUBLISHER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mainmetric = new EcoreExecutorType(CloudmonitoringPackage.Literals.MAINMETRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _MonitorState = new EcoreExecutorEnumeration(CloudmonitoringPackage.Literals.MONITOR_STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networkio = new EcoreExecutorType(CloudmonitoringPackage.Literals.NETWORKIO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PerSec = new EcoreExecutorType("PerSec", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Percent = new EcoreExecutorType("Percent", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Publishercontrol = new EcoreExecutorType(CloudmonitoringPackage.Literals.PUBLISHERCONTROL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ram = new EcoreExecutorType(CloudmonitoringPackage.Literals.RAM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sensorcontrol = new EcoreExecutorType(CloudmonitoringPackage.Literals.SENSORCONTROL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sshcollector = new EcoreExecutorType(CloudmonitoringPackage.Literals.SSHCOLLECTOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Systemoutpublisher = new EcoreExecutorType(CloudmonitoringPackage.Literals.SYSTEMOUTPUBLISHER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Temperature = new EcoreExecutorType("Temperature", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zabbixcollector = new EcoreExecutorType(CloudmonitoringPackage.Literals.ZABBIXCOLLECTOR, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Average,
			_Cpu,
			_Disk,
			_Diskio,
			_Emfpublisher,
			_IOUnit,
			_Inputoutput,
			_Mailpublisher,
			_Mainmetric,
			_MonitorState,
			_Networkio,
			_PerSec,
			_Percent,
			_Publishercontrol,
			_Ram,
			_Sensorcontrol,
			_Sshcollector,
			_Systemoutpublisher,
			_Temperature,
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
		 * Force initialization of the fields of CloudmonitoringTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Average__Average = new ExecutorFragment(Types._Average, CloudmonitoringTables.Types._Average);
		private static final /*@NonNull*/ ExecutorFragment _Average__OclAny = new ExecutorFragment(Types._Average, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Cpu__Cpu = new ExecutorFragment(Types._Cpu, CloudmonitoringTables.Types._Cpu);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__Mainmetric = new ExecutorFragment(Types._Cpu, CloudmonitoringTables.Types._Mainmetric);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__Metric = new ExecutorFragment(Types._Cpu, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__MixinBase = new ExecutorFragment(Types._Cpu, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__OclAny = new ExecutorFragment(Types._Cpu, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cpu__OclElement = new ExecutorFragment(Types._Cpu, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Disk__Disk = new ExecutorFragment(Types._Disk, CloudmonitoringTables.Types._Disk);
		private static final /*@NonNull*/ ExecutorFragment _Disk__Mainmetric = new ExecutorFragment(Types._Disk, CloudmonitoringTables.Types._Mainmetric);
		private static final /*@NonNull*/ ExecutorFragment _Disk__Metric = new ExecutorFragment(Types._Disk, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Disk__MixinBase = new ExecutorFragment(Types._Disk, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Disk__OclAny = new ExecutorFragment(Types._Disk, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Disk__OclElement = new ExecutorFragment(Types._Disk, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Diskio__Diskio = new ExecutorFragment(Types._Diskio, CloudmonitoringTables.Types._Diskio);
		private static final /*@NonNull*/ ExecutorFragment _Diskio__Inputoutput = new ExecutorFragment(Types._Diskio, CloudmonitoringTables.Types._Inputoutput);
		private static final /*@NonNull*/ ExecutorFragment _Diskio__Metric = new ExecutorFragment(Types._Diskio, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Diskio__MixinBase = new ExecutorFragment(Types._Diskio, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Diskio__OclAny = new ExecutorFragment(Types._Diskio, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Diskio__OclElement = new ExecutorFragment(Types._Diskio, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Emfpublisher__Emfpublisher = new ExecutorFragment(Types._Emfpublisher, CloudmonitoringTables.Types._Emfpublisher);
		private static final /*@NonNull*/ ExecutorFragment _Emfpublisher__MixinBase = new ExecutorFragment(Types._Emfpublisher, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Emfpublisher__OclAny = new ExecutorFragment(Types._Emfpublisher, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Emfpublisher__OclElement = new ExecutorFragment(Types._Emfpublisher, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Emfpublisher__Publisher = new ExecutorFragment(Types._Emfpublisher, MonitoringTables.Types._Publisher);
		private static final /*@NonNull*/ ExecutorFragment _Emfpublisher__Publishercontrol = new ExecutorFragment(Types._Emfpublisher, CloudmonitoringTables.Types._Publishercontrol);

		private static final /*@NonNull*/ ExecutorFragment _IOUnit__IOUnit = new ExecutorFragment(Types._IOUnit, CloudmonitoringTables.Types._IOUnit);
		private static final /*@NonNull*/ ExecutorFragment _IOUnit__OclAny = new ExecutorFragment(Types._IOUnit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _IOUnit__OclElement = new ExecutorFragment(Types._IOUnit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _IOUnit__OclEnumeration = new ExecutorFragment(Types._IOUnit, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _IOUnit__OclType = new ExecutorFragment(Types._IOUnit, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Inputoutput__Inputoutput = new ExecutorFragment(Types._Inputoutput, CloudmonitoringTables.Types._Inputoutput);
		private static final /*@NonNull*/ ExecutorFragment _Inputoutput__Metric = new ExecutorFragment(Types._Inputoutput, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Inputoutput__MixinBase = new ExecutorFragment(Types._Inputoutput, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Inputoutput__OclAny = new ExecutorFragment(Types._Inputoutput, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Inputoutput__OclElement = new ExecutorFragment(Types._Inputoutput, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mailpublisher__Mailpublisher = new ExecutorFragment(Types._Mailpublisher, CloudmonitoringTables.Types._Mailpublisher);
		private static final /*@NonNull*/ ExecutorFragment _Mailpublisher__MixinBase = new ExecutorFragment(Types._Mailpublisher, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mailpublisher__OclAny = new ExecutorFragment(Types._Mailpublisher, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mailpublisher__OclElement = new ExecutorFragment(Types._Mailpublisher, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mailpublisher__Publisher = new ExecutorFragment(Types._Mailpublisher, MonitoringTables.Types._Publisher);
		private static final /*@NonNull*/ ExecutorFragment _Mailpublisher__Publishercontrol = new ExecutorFragment(Types._Mailpublisher, CloudmonitoringTables.Types._Publishercontrol);

		private static final /*@NonNull*/ ExecutorFragment _Mainmetric__Mainmetric = new ExecutorFragment(Types._Mainmetric, CloudmonitoringTables.Types._Mainmetric);
		private static final /*@NonNull*/ ExecutorFragment _Mainmetric__Metric = new ExecutorFragment(Types._Mainmetric, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Mainmetric__MixinBase = new ExecutorFragment(Types._Mainmetric, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mainmetric__OclAny = new ExecutorFragment(Types._Mainmetric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mainmetric__OclElement = new ExecutorFragment(Types._Mainmetric, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _MonitorState__MonitorState = new ExecutorFragment(Types._MonitorState, CloudmonitoringTables.Types._MonitorState);
		private static final /*@NonNull*/ ExecutorFragment _MonitorState__OclAny = new ExecutorFragment(Types._MonitorState, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MonitorState__OclElement = new ExecutorFragment(Types._MonitorState, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MonitorState__OclEnumeration = new ExecutorFragment(Types._MonitorState, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _MonitorState__OclType = new ExecutorFragment(Types._MonitorState, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Networkio__Inputoutput = new ExecutorFragment(Types._Networkio, CloudmonitoringTables.Types._Inputoutput);
		private static final /*@NonNull*/ ExecutorFragment _Networkio__Metric = new ExecutorFragment(Types._Networkio, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Networkio__MixinBase = new ExecutorFragment(Types._Networkio, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Networkio__Networkio = new ExecutorFragment(Types._Networkio, CloudmonitoringTables.Types._Networkio);
		private static final /*@NonNull*/ ExecutorFragment _Networkio__OclAny = new ExecutorFragment(Types._Networkio, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networkio__OclElement = new ExecutorFragment(Types._Networkio, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _PerSec__OclAny = new ExecutorFragment(Types._PerSec, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PerSec__PerSec = new ExecutorFragment(Types._PerSec, CloudmonitoringTables.Types._PerSec);

		private static final /*@NonNull*/ ExecutorFragment _Percent__OclAny = new ExecutorFragment(Types._Percent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Percent__Percent = new ExecutorFragment(Types._Percent, CloudmonitoringTables.Types._Percent);

		private static final /*@NonNull*/ ExecutorFragment _Publishercontrol__MixinBase = new ExecutorFragment(Types._Publishercontrol, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Publishercontrol__OclAny = new ExecutorFragment(Types._Publishercontrol, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Publishercontrol__OclElement = new ExecutorFragment(Types._Publishercontrol, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Publishercontrol__Publisher = new ExecutorFragment(Types._Publishercontrol, MonitoringTables.Types._Publisher);
		private static final /*@NonNull*/ ExecutorFragment _Publishercontrol__Publishercontrol = new ExecutorFragment(Types._Publishercontrol, CloudmonitoringTables.Types._Publishercontrol);

		private static final /*@NonNull*/ ExecutorFragment _Ram__Mainmetric = new ExecutorFragment(Types._Ram, CloudmonitoringTables.Types._Mainmetric);
		private static final /*@NonNull*/ ExecutorFragment _Ram__Metric = new ExecutorFragment(Types._Ram, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Ram__MixinBase = new ExecutorFragment(Types._Ram, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ram__OclAny = new ExecutorFragment(Types._Ram, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ram__OclElement = new ExecutorFragment(Types._Ram, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ram__Ram = new ExecutorFragment(Types._Ram, CloudmonitoringTables.Types._Ram);

		private static final /*@NonNull*/ ExecutorFragment _Sensorcontrol__MixinBase = new ExecutorFragment(Types._Sensorcontrol, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sensorcontrol__OclAny = new ExecutorFragment(Types._Sensorcontrol, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sensorcontrol__OclElement = new ExecutorFragment(Types._Sensorcontrol, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sensorcontrol__Sensorcontrol = new ExecutorFragment(Types._Sensorcontrol, CloudmonitoringTables.Types._Sensorcontrol);

		private static final /*@NonNull*/ ExecutorFragment _Sshcollector__Collector = new ExecutorFragment(Types._Sshcollector, MonitoringTables.Types._Collector);
		private static final /*@NonNull*/ ExecutorFragment _Sshcollector__Entity = new ExecutorFragment(Types._Sshcollector, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Sshcollector__Link = new ExecutorFragment(Types._Sshcollector, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Sshcollector__OclAny = new ExecutorFragment(Types._Sshcollector, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sshcollector__OclElement = new ExecutorFragment(Types._Sshcollector, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sshcollector__Sshcollector = new ExecutorFragment(Types._Sshcollector, CloudmonitoringTables.Types._Sshcollector);

		private static final /*@NonNull*/ ExecutorFragment _Systemoutpublisher__MixinBase = new ExecutorFragment(Types._Systemoutpublisher, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Systemoutpublisher__OclAny = new ExecutorFragment(Types._Systemoutpublisher, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Systemoutpublisher__OclElement = new ExecutorFragment(Types._Systemoutpublisher, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Systemoutpublisher__Publisher = new ExecutorFragment(Types._Systemoutpublisher, MonitoringTables.Types._Publisher);
		private static final /*@NonNull*/ ExecutorFragment _Systemoutpublisher__Publishercontrol = new ExecutorFragment(Types._Systemoutpublisher, CloudmonitoringTables.Types._Publishercontrol);
		private static final /*@NonNull*/ ExecutorFragment _Systemoutpublisher__Systemoutpublisher = new ExecutorFragment(Types._Systemoutpublisher, CloudmonitoringTables.Types._Systemoutpublisher);

		private static final /*@NonNull*/ ExecutorFragment _Temperature__OclAny = new ExecutorFragment(Types._Temperature, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Temperature__Temperature = new ExecutorFragment(Types._Temperature, CloudmonitoringTables.Types._Temperature);

		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Collector = new ExecutorFragment(Types._Zabbixcollector, MonitoringTables.Types._Collector);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Entity = new ExecutorFragment(Types._Zabbixcollector, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Link = new ExecutorFragment(Types._Zabbixcollector, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__OclAny = new ExecutorFragment(Types._Zabbixcollector, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__OclElement = new ExecutorFragment(Types._Zabbixcollector, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zabbixcollector__Zabbixcollector = new ExecutorFragment(Types._Zabbixcollector, CloudmonitoringTables.Types._Zabbixcollector);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of CloudmonitoringTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Publishercontrol__disable = new ExecutorOperation("disable", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Publishercontrol,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Publishercontrol__enable = new ExecutorOperation("enable", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Publishercontrol,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Sensorcontrol__startmonitoring = new ExecutorOperation("startmonitoring", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Sensorcontrol,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Sensorcontrol__stopmonitoring = new ExecutorOperation("stopmonitoring", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Sensorcontrol,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Cpu__loadAvg = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.CPU__LOAD_AVG, Types._Cpu, 0);

		public static final /*@NonNull*/ ExecutorProperty _Disk__free = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.DISK__FREE, Types._Disk, 0);
		public static final /*@NonNull*/ ExecutorProperty _Disk__swap = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.DISK__SWAP, Types._Disk, 1);
		public static final /*@NonNull*/ ExecutorProperty _Disk__volumeName = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.DISK__VOLUME_NAME, Types._Disk, 2);

		public static final /*@NonNull*/ ExecutorProperty _Diskio__diskRead = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.DISKIO__DISK_READ, Types._Diskio, 0);
		public static final /*@NonNull*/ ExecutorProperty _Diskio__diskWrite = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.DISKIO__DISK_WRITE, Types._Diskio, 1);

		public static final /*@NonNull*/ ExecutorProperty _Inputoutput__unit = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.INPUTOUTPUT__UNIT, Types._Inputoutput, 0);

		public static final /*@NonNull*/ ExecutorProperty _Mailpublisher__mailAddress = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAILPUBLISHER__MAIL_ADDRESS, Types._Mailpublisher, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mailpublisher__nbEmail = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAILPUBLISHER__NB_EMAIL, Types._Mailpublisher, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mailpublisher__postOnCpuAlert = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_CPU_ALERT, Types._Mailpublisher, 2);
		public static final /*@NonNull*/ ExecutorProperty _Mailpublisher__postOnDiskIOAlert = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_DISK_IO_ALERT, Types._Mailpublisher, 3);
		public static final /*@NonNull*/ ExecutorProperty _Mailpublisher__postOnNetworkIOAlert = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT, Types._Mailpublisher, 4);
		public static final /*@NonNull*/ ExecutorProperty _Mailpublisher__postOnRamAlert = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAILPUBLISHER__POST_ON_RAM_ALERT, Types._Mailpublisher, 5);

		public static final /*@NonNull*/ ExecutorProperty _Mainmetric__temperature = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAINMETRIC__TEMPERATURE, Types._Mainmetric, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mainmetric__thresholdTemperature = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAINMETRIC__THRESHOLD_TEMPERATURE, Types._Mainmetric, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mainmetric__thresholdUsage = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAINMETRIC__THRESHOLD_USAGE, Types._Mainmetric, 2);
		public static final /*@NonNull*/ ExecutorProperty _Mainmetric__utilization = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.MAINMETRIC__UTILIZATION, Types._Mainmetric, 3);

		public static final /*@NonNull*/ ExecutorProperty _Networkio__networkIn = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.NETWORKIO__NETWORK_IN, Types._Networkio, 0);
		public static final /*@NonNull*/ ExecutorProperty _Networkio__networkOut = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.NETWORKIO__NETWORK_OUT, Types._Networkio, 1);

		public static final /*@NonNull*/ ExecutorProperty _Publishercontrol__publisherState = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.PUBLISHERCONTROL__PUBLISHER_STATE, Types._Publishercontrol, 0);

		public static final /*@NonNull*/ ExecutorProperty _Ram__free = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.RAM__FREE, Types._Ram, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ram__swap = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.RAM__SWAP, Types._Ram, 1);

		public static final /*@NonNull*/ ExecutorProperty _Sensorcontrol__monitorState = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.SENSORCONTROL__MONITOR_STATE, Types._Sensorcontrol, 0);

		public static final /*@NonNull*/ ExecutorProperty _Sshcollector__label = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.SSHCOLLECTOR__LABEL, Types._Sshcollector, 0);

		public static final /*@NonNull*/ ExecutorProperty _Zabbixcollector__httpApiAddress = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.ZABBIXCOLLECTOR__HTTP_API_ADDRESS, Types._Zabbixcollector, 0);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixcollector__password = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.ZABBIXCOLLECTOR__PASSWORD, Types._Zabbixcollector, 1);
		public static final /*@NonNull*/ ExecutorProperty _Zabbixcollector__username = new EcoreExecutorProperty(CloudmonitoringPackage.Literals.ZABBIXCOLLECTOR__USERNAME, Types._Zabbixcollector, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::Properties and all preceding sub-packages.
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
			Fragments._Cpu__Mainmetric /* 4 */,
			Fragments._Cpu__Cpu /* 5 */
		};
		private static final int /*@NonNull*/ [] __Cpu = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Disk =
		{
			Fragments._Disk__OclAny /* 0 */,
			Fragments._Disk__OclElement /* 1 */,
			Fragments._Disk__MixinBase /* 2 */,
			Fragments._Disk__Metric /* 3 */,
			Fragments._Disk__Mainmetric /* 4 */,
			Fragments._Disk__Disk /* 5 */
		};
		private static final int /*@NonNull*/ [] __Disk = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Diskio =
		{
			Fragments._Diskio__OclAny /* 0 */,
			Fragments._Diskio__OclElement /* 1 */,
			Fragments._Diskio__MixinBase /* 2 */,
			Fragments._Diskio__Metric /* 3 */,
			Fragments._Diskio__Inputoutput /* 4 */,
			Fragments._Diskio__Diskio /* 5 */
		};
		private static final int /*@NonNull*/ [] __Diskio = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Emfpublisher =
		{
			Fragments._Emfpublisher__OclAny /* 0 */,
			Fragments._Emfpublisher__OclElement /* 1 */,
			Fragments._Emfpublisher__MixinBase /* 2 */,
			Fragments._Emfpublisher__Publisher /* 3 */,
			Fragments._Emfpublisher__Publishercontrol /* 4 */,
			Fragments._Emfpublisher__Emfpublisher /* 5 */
		};
		private static final int /*@NonNull*/ [] __Emfpublisher = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _IOUnit =
		{
			Fragments._IOUnit__OclAny /* 0 */,
			Fragments._IOUnit__OclElement /* 1 */,
			Fragments._IOUnit__OclType /* 2 */,
			Fragments._IOUnit__OclEnumeration /* 3 */,
			Fragments._IOUnit__IOUnit /* 4 */
		};
		private static final int /*@NonNull*/ [] __IOUnit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Inputoutput =
		{
			Fragments._Inputoutput__OclAny /* 0 */,
			Fragments._Inputoutput__OclElement /* 1 */,
			Fragments._Inputoutput__MixinBase /* 2 */,
			Fragments._Inputoutput__Metric /* 3 */,
			Fragments._Inputoutput__Inputoutput /* 4 */
		};
		private static final int /*@NonNull*/ [] __Inputoutput = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mailpublisher =
		{
			Fragments._Mailpublisher__OclAny /* 0 */,
			Fragments._Mailpublisher__OclElement /* 1 */,
			Fragments._Mailpublisher__MixinBase /* 2 */,
			Fragments._Mailpublisher__Publisher /* 3 */,
			Fragments._Mailpublisher__Publishercontrol /* 4 */,
			Fragments._Mailpublisher__Mailpublisher /* 5 */
		};
		private static final int /*@NonNull*/ [] __Mailpublisher = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mainmetric =
		{
			Fragments._Mainmetric__OclAny /* 0 */,
			Fragments._Mainmetric__OclElement /* 1 */,
			Fragments._Mainmetric__MixinBase /* 2 */,
			Fragments._Mainmetric__Metric /* 3 */,
			Fragments._Mainmetric__Mainmetric /* 4 */
		};
		private static final int /*@NonNull*/ [] __Mainmetric = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MonitorState =
		{
			Fragments._MonitorState__OclAny /* 0 */,
			Fragments._MonitorState__OclElement /* 1 */,
			Fragments._MonitorState__OclType /* 2 */,
			Fragments._MonitorState__OclEnumeration /* 3 */,
			Fragments._MonitorState__MonitorState /* 4 */
		};
		private static final int /*@NonNull*/ [] __MonitorState = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networkio =
		{
			Fragments._Networkio__OclAny /* 0 */,
			Fragments._Networkio__OclElement /* 1 */,
			Fragments._Networkio__MixinBase /* 2 */,
			Fragments._Networkio__Metric /* 3 */,
			Fragments._Networkio__Inputoutput /* 4 */,
			Fragments._Networkio__Networkio /* 5 */
		};
		private static final int /*@NonNull*/ [] __Networkio = { 1,1,1,1,1,1 };

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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Publishercontrol =
		{
			Fragments._Publishercontrol__OclAny /* 0 */,
			Fragments._Publishercontrol__OclElement /* 1 */,
			Fragments._Publishercontrol__MixinBase /* 2 */,
			Fragments._Publishercontrol__Publisher /* 3 */,
			Fragments._Publishercontrol__Publishercontrol /* 4 */
		};
		private static final int /*@NonNull*/ [] __Publishercontrol = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ram =
		{
			Fragments._Ram__OclAny /* 0 */,
			Fragments._Ram__OclElement /* 1 */,
			Fragments._Ram__MixinBase /* 2 */,
			Fragments._Ram__Metric /* 3 */,
			Fragments._Ram__Mainmetric /* 4 */,
			Fragments._Ram__Ram /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ram = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sensorcontrol =
		{
			Fragments._Sensorcontrol__OclAny /* 0 */,
			Fragments._Sensorcontrol__OclElement /* 1 */,
			Fragments._Sensorcontrol__MixinBase /* 2 */,
			Fragments._Sensorcontrol__Sensorcontrol /* 3 */
		};
		private static final int /*@NonNull*/ [] __Sensorcontrol = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sshcollector =
		{
			Fragments._Sshcollector__OclAny /* 0 */,
			Fragments._Sshcollector__OclElement /* 1 */,
			Fragments._Sshcollector__Entity /* 2 */,
			Fragments._Sshcollector__Link /* 3 */,
			Fragments._Sshcollector__Collector /* 4 */,
			Fragments._Sshcollector__Sshcollector /* 5 */
		};
		private static final int /*@NonNull*/ [] __Sshcollector = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Systemoutpublisher =
		{
			Fragments._Systemoutpublisher__OclAny /* 0 */,
			Fragments._Systemoutpublisher__OclElement /* 1 */,
			Fragments._Systemoutpublisher__MixinBase /* 2 */,
			Fragments._Systemoutpublisher__Publisher /* 3 */,
			Fragments._Systemoutpublisher__Publishercontrol /* 4 */,
			Fragments._Systemoutpublisher__Systemoutpublisher /* 5 */
		};
		private static final int /*@NonNull*/ [] __Systemoutpublisher = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Temperature =
		{
			Fragments._Temperature__OclAny /* 0 */,
			Fragments._Temperature__Temperature /* 1 */
		};
		private static final int /*@NonNull*/ [] __Temperature = { 1,1 };

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
			Types._Average.initFragments(_Average, __Average);
			Types._Cpu.initFragments(_Cpu, __Cpu);
			Types._Disk.initFragments(_Disk, __Disk);
			Types._Diskio.initFragments(_Diskio, __Diskio);
			Types._Emfpublisher.initFragments(_Emfpublisher, __Emfpublisher);
			Types._IOUnit.initFragments(_IOUnit, __IOUnit);
			Types._Inputoutput.initFragments(_Inputoutput, __Inputoutput);
			Types._Mailpublisher.initFragments(_Mailpublisher, __Mailpublisher);
			Types._Mainmetric.initFragments(_Mainmetric, __Mainmetric);
			Types._MonitorState.initFragments(_MonitorState, __MonitorState);
			Types._Networkio.initFragments(_Networkio, __Networkio);
			Types._PerSec.initFragments(_PerSec, __PerSec);
			Types._Percent.initFragments(_Percent, __Percent);
			Types._Publishercontrol.initFragments(_Publishercontrol, __Publishercontrol);
			Types._Ram.initFragments(_Ram, __Ram);
			Types._Sensorcontrol.initFragments(_Sensorcontrol, __Sensorcontrol);
			Types._Sshcollector.initFragments(_Sshcollector, __Sshcollector);
			Types._Systemoutpublisher.initFragments(_Systemoutpublisher, __Systemoutpublisher);
			Types._Temperature.initFragments(_Temperature, __Temperature);
			Types._Zabbixcollector.initFragments(_Zabbixcollector, __Zabbixcollector);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::TypeFragments and all preceding sub-packages.
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpu__Mainmetric = {};
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Disk__Disk = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Disk__Mainmetric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Disk__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Disk__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Disk__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Disk__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskio__Diskio = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskio__Inputoutput = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskio__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskio__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskio__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskio__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Emfpublisher__Emfpublisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Emfpublisher__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Emfpublisher__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Emfpublisher__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Emfpublisher__Publisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Emfpublisher__Publishercontrol = {
			CloudmonitoringTables.Operations._Publishercontrol__disable /* disable() */,
			CloudmonitoringTables.Operations._Publishercontrol__enable /* enable() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IOUnit__IOUnit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IOUnit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IOUnit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IOUnit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IOUnit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Inputoutput__Inputoutput = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Inputoutput__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Inputoutput__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Inputoutput__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Inputoutput__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mailpublisher__Mailpublisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mailpublisher__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mailpublisher__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mailpublisher__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mailpublisher__Publisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mailpublisher__Publishercontrol = {
			CloudmonitoringTables.Operations._Publishercontrol__disable /* disable() */,
			CloudmonitoringTables.Operations._Publishercontrol__enable /* enable() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mainmetric__Mainmetric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mainmetric__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mainmetric__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mainmetric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mainmetric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitorState__MonitorState = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitorState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitorState__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitorState__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MonitorState__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkio__Networkio = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkio__Inputoutput = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkio__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkio__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkio__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkio__OclElement = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publishercontrol__Publishercontrol = {
			CloudmonitoringTables.Operations._Publishercontrol__disable /* disable() */,
			CloudmonitoringTables.Operations._Publishercontrol__enable /* enable() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publishercontrol__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publishercontrol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publishercontrol__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publishercontrol__Publisher = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ram__Ram = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ram__Mainmetric = {};
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensorcontrol__Sensorcontrol = {
			CloudmonitoringTables.Operations._Sensorcontrol__startmonitoring /* startmonitoring() */,
			CloudmonitoringTables.Operations._Sensorcontrol__stopmonitoring /* stopmonitoring() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensorcontrol__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensorcontrol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensorcontrol__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sshcollector__Sshcollector = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sshcollector__Collector = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sshcollector__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sshcollector__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sshcollector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sshcollector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Systemoutpublisher__Systemoutpublisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Systemoutpublisher__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Systemoutpublisher__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Systemoutpublisher__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Systemoutpublisher__Publisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Systemoutpublisher__Publishercontrol = {
			CloudmonitoringTables.Operations._Publishercontrol__disable /* disable() */,
			CloudmonitoringTables.Operations._Publishercontrol__enable /* enable() */
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
			Fragments._Average__Average.initOperations(_Average__Average);
			Fragments._Average__OclAny.initOperations(_Average__OclAny);

			Fragments._Cpu__Cpu.initOperations(_Cpu__Cpu);
			Fragments._Cpu__Mainmetric.initOperations(_Cpu__Mainmetric);
			Fragments._Cpu__Metric.initOperations(_Cpu__Metric);
			Fragments._Cpu__MixinBase.initOperations(_Cpu__MixinBase);
			Fragments._Cpu__OclAny.initOperations(_Cpu__OclAny);
			Fragments._Cpu__OclElement.initOperations(_Cpu__OclElement);

			Fragments._Disk__Disk.initOperations(_Disk__Disk);
			Fragments._Disk__Mainmetric.initOperations(_Disk__Mainmetric);
			Fragments._Disk__Metric.initOperations(_Disk__Metric);
			Fragments._Disk__MixinBase.initOperations(_Disk__MixinBase);
			Fragments._Disk__OclAny.initOperations(_Disk__OclAny);
			Fragments._Disk__OclElement.initOperations(_Disk__OclElement);

			Fragments._Diskio__Diskio.initOperations(_Diskio__Diskio);
			Fragments._Diskio__Inputoutput.initOperations(_Diskio__Inputoutput);
			Fragments._Diskio__Metric.initOperations(_Diskio__Metric);
			Fragments._Diskio__MixinBase.initOperations(_Diskio__MixinBase);
			Fragments._Diskio__OclAny.initOperations(_Diskio__OclAny);
			Fragments._Diskio__OclElement.initOperations(_Diskio__OclElement);

			Fragments._Emfpublisher__Emfpublisher.initOperations(_Emfpublisher__Emfpublisher);
			Fragments._Emfpublisher__MixinBase.initOperations(_Emfpublisher__MixinBase);
			Fragments._Emfpublisher__OclAny.initOperations(_Emfpublisher__OclAny);
			Fragments._Emfpublisher__OclElement.initOperations(_Emfpublisher__OclElement);
			Fragments._Emfpublisher__Publisher.initOperations(_Emfpublisher__Publisher);
			Fragments._Emfpublisher__Publishercontrol.initOperations(_Emfpublisher__Publishercontrol);

			Fragments._IOUnit__IOUnit.initOperations(_IOUnit__IOUnit);
			Fragments._IOUnit__OclAny.initOperations(_IOUnit__OclAny);
			Fragments._IOUnit__OclElement.initOperations(_IOUnit__OclElement);
			Fragments._IOUnit__OclEnumeration.initOperations(_IOUnit__OclEnumeration);
			Fragments._IOUnit__OclType.initOperations(_IOUnit__OclType);

			Fragments._Inputoutput__Inputoutput.initOperations(_Inputoutput__Inputoutput);
			Fragments._Inputoutput__Metric.initOperations(_Inputoutput__Metric);
			Fragments._Inputoutput__MixinBase.initOperations(_Inputoutput__MixinBase);
			Fragments._Inputoutput__OclAny.initOperations(_Inputoutput__OclAny);
			Fragments._Inputoutput__OclElement.initOperations(_Inputoutput__OclElement);

			Fragments._Mailpublisher__Mailpublisher.initOperations(_Mailpublisher__Mailpublisher);
			Fragments._Mailpublisher__MixinBase.initOperations(_Mailpublisher__MixinBase);
			Fragments._Mailpublisher__OclAny.initOperations(_Mailpublisher__OclAny);
			Fragments._Mailpublisher__OclElement.initOperations(_Mailpublisher__OclElement);
			Fragments._Mailpublisher__Publisher.initOperations(_Mailpublisher__Publisher);
			Fragments._Mailpublisher__Publishercontrol.initOperations(_Mailpublisher__Publishercontrol);

			Fragments._Mainmetric__Mainmetric.initOperations(_Mainmetric__Mainmetric);
			Fragments._Mainmetric__Metric.initOperations(_Mainmetric__Metric);
			Fragments._Mainmetric__MixinBase.initOperations(_Mainmetric__MixinBase);
			Fragments._Mainmetric__OclAny.initOperations(_Mainmetric__OclAny);
			Fragments._Mainmetric__OclElement.initOperations(_Mainmetric__OclElement);

			Fragments._MonitorState__MonitorState.initOperations(_MonitorState__MonitorState);
			Fragments._MonitorState__OclAny.initOperations(_MonitorState__OclAny);
			Fragments._MonitorState__OclElement.initOperations(_MonitorState__OclElement);
			Fragments._MonitorState__OclEnumeration.initOperations(_MonitorState__OclEnumeration);
			Fragments._MonitorState__OclType.initOperations(_MonitorState__OclType);

			Fragments._Networkio__Inputoutput.initOperations(_Networkio__Inputoutput);
			Fragments._Networkio__Metric.initOperations(_Networkio__Metric);
			Fragments._Networkio__MixinBase.initOperations(_Networkio__MixinBase);
			Fragments._Networkio__Networkio.initOperations(_Networkio__Networkio);
			Fragments._Networkio__OclAny.initOperations(_Networkio__OclAny);
			Fragments._Networkio__OclElement.initOperations(_Networkio__OclElement);

			Fragments._PerSec__OclAny.initOperations(_PerSec__OclAny);
			Fragments._PerSec__PerSec.initOperations(_PerSec__PerSec);

			Fragments._Percent__OclAny.initOperations(_Percent__OclAny);
			Fragments._Percent__Percent.initOperations(_Percent__Percent);

			Fragments._Publishercontrol__MixinBase.initOperations(_Publishercontrol__MixinBase);
			Fragments._Publishercontrol__OclAny.initOperations(_Publishercontrol__OclAny);
			Fragments._Publishercontrol__OclElement.initOperations(_Publishercontrol__OclElement);
			Fragments._Publishercontrol__Publisher.initOperations(_Publishercontrol__Publisher);
			Fragments._Publishercontrol__Publishercontrol.initOperations(_Publishercontrol__Publishercontrol);

			Fragments._Ram__Mainmetric.initOperations(_Ram__Mainmetric);
			Fragments._Ram__Metric.initOperations(_Ram__Metric);
			Fragments._Ram__MixinBase.initOperations(_Ram__MixinBase);
			Fragments._Ram__OclAny.initOperations(_Ram__OclAny);
			Fragments._Ram__OclElement.initOperations(_Ram__OclElement);
			Fragments._Ram__Ram.initOperations(_Ram__Ram);

			Fragments._Sensorcontrol__MixinBase.initOperations(_Sensorcontrol__MixinBase);
			Fragments._Sensorcontrol__OclAny.initOperations(_Sensorcontrol__OclAny);
			Fragments._Sensorcontrol__OclElement.initOperations(_Sensorcontrol__OclElement);
			Fragments._Sensorcontrol__Sensorcontrol.initOperations(_Sensorcontrol__Sensorcontrol);

			Fragments._Sshcollector__Collector.initOperations(_Sshcollector__Collector);
			Fragments._Sshcollector__Entity.initOperations(_Sshcollector__Entity);
			Fragments._Sshcollector__Link.initOperations(_Sshcollector__Link);
			Fragments._Sshcollector__OclAny.initOperations(_Sshcollector__OclAny);
			Fragments._Sshcollector__OclElement.initOperations(_Sshcollector__OclElement);
			Fragments._Sshcollector__Sshcollector.initOperations(_Sshcollector__Sshcollector);

			Fragments._Systemoutpublisher__MixinBase.initOperations(_Systemoutpublisher__MixinBase);
			Fragments._Systemoutpublisher__OclAny.initOperations(_Systemoutpublisher__OclAny);
			Fragments._Systemoutpublisher__OclElement.initOperations(_Systemoutpublisher__OclElement);
			Fragments._Systemoutpublisher__Publisher.initOperations(_Systemoutpublisher__Publisher);
			Fragments._Systemoutpublisher__Publishercontrol.initOperations(_Systemoutpublisher__Publishercontrol);
			Fragments._Systemoutpublisher__Systemoutpublisher.initOperations(_Systemoutpublisher__Systemoutpublisher);

			Fragments._Temperature__OclAny.initOperations(_Temperature__OclAny);
			Fragments._Temperature__Temperature.initOperations(_Temperature__Temperature);

			Fragments._Zabbixcollector__Collector.initOperations(_Zabbixcollector__Collector);
			Fragments._Zabbixcollector__Entity.initOperations(_Zabbixcollector__Entity);
			Fragments._Zabbixcollector__Link.initOperations(_Zabbixcollector__Link);
			Fragments._Zabbixcollector__OclAny.initOperations(_Zabbixcollector__OclAny);
			Fragments._Zabbixcollector__OclElement.initOperations(_Zabbixcollector__OclElement);
			Fragments._Zabbixcollector__Zabbixcollector.initOperations(_Zabbixcollector__Zabbixcollector);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::FragmentOperations and all preceding sub-packages.
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
			CloudmonitoringTables.Properties._Cpu__loadAvg,
			CloudmonitoringTables.Properties._Mainmetric__temperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdTemperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdUsage,
			CloudmonitoringTables.Properties._Mainmetric__utilization
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Disk = {
			CloudmonitoringTables.Properties._Disk__free,
			CloudmonitoringTables.Properties._Disk__swap,
			CloudmonitoringTables.Properties._Mainmetric__temperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdTemperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdUsage,
			CloudmonitoringTables.Properties._Mainmetric__utilization,
			CloudmonitoringTables.Properties._Disk__volumeName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Diskio = {
			CloudmonitoringTables.Properties._Diskio__diskRead,
			CloudmonitoringTables.Properties._Diskio__diskWrite,
			CloudmonitoringTables.Properties._Inputoutput__unit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Emfpublisher = {
			CloudmonitoringTables.Properties._Publishercontrol__publisherState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _IOUnit = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Inputoutput = {
			CloudmonitoringTables.Properties._Inputoutput__unit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mailpublisher = {
			CloudmonitoringTables.Properties._Mailpublisher__mailAddress,
			CloudmonitoringTables.Properties._Mailpublisher__nbEmail,
			CloudmonitoringTables.Properties._Mailpublisher__postOnCpuAlert,
			CloudmonitoringTables.Properties._Mailpublisher__postOnDiskIOAlert,
			CloudmonitoringTables.Properties._Mailpublisher__postOnNetworkIOAlert,
			CloudmonitoringTables.Properties._Mailpublisher__postOnRamAlert,
			CloudmonitoringTables.Properties._Publishercontrol__publisherState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mainmetric = {
			CloudmonitoringTables.Properties._Mainmetric__temperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdTemperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdUsage,
			CloudmonitoringTables.Properties._Mainmetric__utilization
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MonitorState = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networkio = {
			CloudmonitoringTables.Properties._Networkio__networkIn,
			CloudmonitoringTables.Properties._Networkio__networkOut,
			CloudmonitoringTables.Properties._Inputoutput__unit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PerSec = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Percent = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Publishercontrol = {
			CloudmonitoringTables.Properties._Publishercontrol__publisherState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ram = {
			CloudmonitoringTables.Properties._Ram__free,
			CloudmonitoringTables.Properties._Ram__swap,
			CloudmonitoringTables.Properties._Mainmetric__temperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdTemperature,
			CloudmonitoringTables.Properties._Mainmetric__thresholdUsage,
			CloudmonitoringTables.Properties._Mainmetric__utilization
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sensorcontrol = {
			CloudmonitoringTables.Properties._Sensorcontrol__monitorState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sshcollector = {
			CloudmonitoringTables.Properties._Sshcollector__label
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Systemoutpublisher = {
			CloudmonitoringTables.Properties._Publishercontrol__publisherState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Temperature = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zabbixcollector = {
			CloudmonitoringTables.Properties._Zabbixcollector__httpApiAddress,
			CloudmonitoringTables.Properties._Zabbixcollector__password,
			CloudmonitoringTables.Properties._Zabbixcollector__username
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Average__Average.initProperties(_Average);
			Fragments._Cpu__Cpu.initProperties(_Cpu);
			Fragments._Disk__Disk.initProperties(_Disk);
			Fragments._Diskio__Diskio.initProperties(_Diskio);
			Fragments._Emfpublisher__Emfpublisher.initProperties(_Emfpublisher);
			Fragments._IOUnit__IOUnit.initProperties(_IOUnit);
			Fragments._Inputoutput__Inputoutput.initProperties(_Inputoutput);
			Fragments._Mailpublisher__Mailpublisher.initProperties(_Mailpublisher);
			Fragments._Mainmetric__Mainmetric.initProperties(_Mainmetric);
			Fragments._MonitorState__MonitorState.initProperties(_MonitorState);
			Fragments._Networkio__Networkio.initProperties(_Networkio);
			Fragments._PerSec__PerSec.initProperties(_PerSec);
			Fragments._Percent__Percent.initProperties(_Percent);
			Fragments._Publishercontrol__Publishercontrol.initProperties(_Publishercontrol);
			Fragments._Ram__Ram.initProperties(_Ram);
			Fragments._Sensorcontrol__Sensorcontrol.initProperties(_Sensorcontrol);
			Fragments._Sshcollector__Sshcollector.initProperties(_Sshcollector);
			Fragments._Systemoutpublisher__Systemoutpublisher.initProperties(_Systemoutpublisher);
			Fragments._Temperature__Temperature.initProperties(_Temperature);
			Fragments._Zabbixcollector__Zabbixcollector.initProperties(_Zabbixcollector);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _IOUnit__bytePerSec = new EcoreExecutorEnumerationLiteral(CloudmonitoringPackage.Literals.IO_UNIT.getEEnumLiteral("bytePerSec"), Types._IOUnit, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _IOUnit__kiloBytePerSec = new EcoreExecutorEnumerationLiteral(CloudmonitoringPackage.Literals.IO_UNIT.getEEnumLiteral("kiloBytePerSec"), Types._IOUnit, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _IOUnit__megaBytePerSec = new EcoreExecutorEnumerationLiteral(CloudmonitoringPackage.Literals.IO_UNIT.getEEnumLiteral("megaBytePerSec"), Types._IOUnit, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _IOUnit__gigaBytePerSec = new EcoreExecutorEnumerationLiteral(CloudmonitoringPackage.Literals.IO_UNIT.getEEnumLiteral("gigaBytePerSec"), Types._IOUnit, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _IOUnit = {
			_IOUnit__bytePerSec,
			_IOUnit__kiloBytePerSec,
			_IOUnit__megaBytePerSec,
			_IOUnit__gigaBytePerSec
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MonitorState__on = new EcoreExecutorEnumerationLiteral(CloudmonitoringPackage.Literals.MONITOR_STATE.getEEnumLiteral("on"), Types._MonitorState, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _MonitorState__off = new EcoreExecutorEnumerationLiteral(CloudmonitoringPackage.Literals.MONITOR_STATE.getEEnumLiteral("off"), Types._MonitorState, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MonitorState = {
			_MonitorState__on,
			_MonitorState__off
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._IOUnit.initLiterals(_IOUnit);
			Types._MonitorState.initLiterals(_MonitorState);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CloudmonitoringTables::EnumerationLiterals and all preceding sub-packages.
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
