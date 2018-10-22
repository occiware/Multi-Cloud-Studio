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
 *   /org.eclipse.cmf.occi.multicloud.regions/model/regions.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.regions/model/regions.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.regions;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.multicloud.regions.RegionsTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * RegionsTables provides the dispatch tables for the regions for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RegionsTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RegionsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/infrastructure/locations/ecore", null, org.eclipse.cmf.occi.multicloud.regions.RegionsPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Africa = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Africa", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Asiapacific = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Asiapacific", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Availabilityzone = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Availabilityzone", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Availabilityzonelink = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Availabilityzonelink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_China = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("China", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Europe = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Europe", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Northamerica = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Northamerica", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Region = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Region", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Regionlink = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Regionlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Southamerica = org.eclipse.cmf.occi.multicloud.regions.RegionsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_locations_s_ecore.getClassId("Southamerica", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Africa_c_c_appliesConstraint = "Africa::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Asiapacific_c_c_appliesConstraint = "Asiapacific::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Availabilityzonelink_c_c_sourceConstraint = "Availabilityzonelink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_China_c_c_appliesConstraint = "China::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Europe_c_c_appliesConstraint = "Europe::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Northamerica_c_c_appliesConstraint = "Northamerica::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Regionlink_c_c_sourceConstraint = "Regionlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Southamerica_c_c_appliesConstraint = "Southamerica::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RegionsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RegionsTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Africa = new EcoreExecutorType(RegionsPackage.Literals.AFRICA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Asiapacific = new EcoreExecutorType(RegionsPackage.Literals.ASIAPACIFIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Availabilityzone = new EcoreExecutorType(RegionsPackage.Literals.AVAILABILITYZONE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Availabilityzonelink = new EcoreExecutorType(RegionsPackage.Literals.AVAILABILITYZONELINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _China = new EcoreExecutorType(RegionsPackage.Literals.CHINA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Europe = new EcoreExecutorType(RegionsPackage.Literals.EUROPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Northamerica = new EcoreExecutorType(RegionsPackage.Literals.NORTHAMERICA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Region = new EcoreExecutorType(RegionsPackage.Literals.REGION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Regionlink = new EcoreExecutorType(RegionsPackage.Literals.REGIONLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Southamerica = new EcoreExecutorType(RegionsPackage.Literals.SOUTHAMERICA, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Africa,
			_Asiapacific,
			_Availabilityzone,
			_Availabilityzonelink,
			_China,
			_Europe,
			_Northamerica,
			_Region,
			_Regionlink,
			_Southamerica
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RegionsTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Africa__Africa = new ExecutorFragment(Types._Africa, RegionsTables.Types._Africa);
		private static final /*@NonNull*/ ExecutorFragment _Africa__MixinBase = new ExecutorFragment(Types._Africa, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Africa__OclAny = new ExecutorFragment(Types._Africa, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Africa__OclElement = new ExecutorFragment(Types._Africa, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Asiapacific__Asiapacific = new ExecutorFragment(Types._Asiapacific, RegionsTables.Types._Asiapacific);
		private static final /*@NonNull*/ ExecutorFragment _Asiapacific__MixinBase = new ExecutorFragment(Types._Asiapacific, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Asiapacific__OclAny = new ExecutorFragment(Types._Asiapacific, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Asiapacific__OclElement = new ExecutorFragment(Types._Asiapacific, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Availabilityzone__Availabilityzone = new ExecutorFragment(Types._Availabilityzone, RegionsTables.Types._Availabilityzone);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzone__Entity = new ExecutorFragment(Types._Availabilityzone, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzone__OclAny = new ExecutorFragment(Types._Availabilityzone, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzone__OclElement = new ExecutorFragment(Types._Availabilityzone, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzone__Resource = new ExecutorFragment(Types._Availabilityzone, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Availabilityzonelink__Availabilityzonelink = new ExecutorFragment(Types._Availabilityzonelink, RegionsTables.Types._Availabilityzonelink);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzonelink__Entity = new ExecutorFragment(Types._Availabilityzonelink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzonelink__Link = new ExecutorFragment(Types._Availabilityzonelink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzonelink__OclAny = new ExecutorFragment(Types._Availabilityzonelink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Availabilityzonelink__OclElement = new ExecutorFragment(Types._Availabilityzonelink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _China__China = new ExecutorFragment(Types._China, RegionsTables.Types._China);
		private static final /*@NonNull*/ ExecutorFragment _China__MixinBase = new ExecutorFragment(Types._China, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _China__OclAny = new ExecutorFragment(Types._China, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _China__OclElement = new ExecutorFragment(Types._China, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Europe__Europe = new ExecutorFragment(Types._Europe, RegionsTables.Types._Europe);
		private static final /*@NonNull*/ ExecutorFragment _Europe__MixinBase = new ExecutorFragment(Types._Europe, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Europe__OclAny = new ExecutorFragment(Types._Europe, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Europe__OclElement = new ExecutorFragment(Types._Europe, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Northamerica__MixinBase = new ExecutorFragment(Types._Northamerica, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Northamerica__Northamerica = new ExecutorFragment(Types._Northamerica, RegionsTables.Types._Northamerica);
		private static final /*@NonNull*/ ExecutorFragment _Northamerica__OclAny = new ExecutorFragment(Types._Northamerica, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Northamerica__OclElement = new ExecutorFragment(Types._Northamerica, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Region__Entity = new ExecutorFragment(Types._Region, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Region__OclAny = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Region__OclElement = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Region__Region = new ExecutorFragment(Types._Region, RegionsTables.Types._Region);
		private static final /*@NonNull*/ ExecutorFragment _Region__Resource = new ExecutorFragment(Types._Region, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Regionlink__Entity = new ExecutorFragment(Types._Regionlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Regionlink__Link = new ExecutorFragment(Types._Regionlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Regionlink__OclAny = new ExecutorFragment(Types._Regionlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Regionlink__OclElement = new ExecutorFragment(Types._Regionlink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Regionlink__Regionlink = new ExecutorFragment(Types._Regionlink, RegionsTables.Types._Regionlink);

		private static final /*@NonNull*/ ExecutorFragment _Southamerica__MixinBase = new ExecutorFragment(Types._Southamerica, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Southamerica__OclAny = new ExecutorFragment(Types._Southamerica, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Southamerica__OclElement = new ExecutorFragment(Types._Southamerica, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Southamerica__Southamerica = new ExecutorFragment(Types._Southamerica, RegionsTables.Types._Southamerica);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RegionsTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of RegionsTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of RegionsTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Availabilityzone__available = new EcoreExecutorProperty(RegionsPackage.Literals.AVAILABILITYZONE__AVAILABLE, Types._Availabilityzone, 0);
		public static final /*@NonNull*/ ExecutorProperty _Availabilityzone__zoneMessage = new EcoreExecutorProperty(RegionsPackage.Literals.AVAILABILITYZONE__ZONE_MESSAGE, Types._Availabilityzone, 1);
		public static final /*@NonNull*/ ExecutorProperty _Availabilityzone__zoneName = new EcoreExecutorProperty(RegionsPackage.Literals.AVAILABILITYZONE__ZONE_NAME, Types._Availabilityzone, 2);

		public static final /*@NonNull*/ ExecutorProperty _Region__endpoint = new EcoreExecutorProperty(RegionsPackage.Literals.REGION__ENDPOINT, Types._Region, 0);
		public static final /*@NonNull*/ ExecutorProperty _Region__regionDescription = new EcoreExecutorProperty(RegionsPackage.Literals.REGION__REGION_DESCRIPTION, Types._Region, 1);
		public static final /*@NonNull*/ ExecutorProperty _Region__regionId = new EcoreExecutorProperty(RegionsPackage.Literals.REGION__REGION_ID, Types._Region, 2);
		public static final /*@NonNull*/ ExecutorProperty _Region__regionName = new EcoreExecutorProperty(RegionsPackage.Literals.REGION__REGION_NAME, Types._Region, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RegionsTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Africa =
			{
				Fragments._Africa__OclAny /* 0 */,
				Fragments._Africa__OclElement /* 1 */,
				Fragments._Africa__MixinBase /* 2 */,
				Fragments._Africa__Africa /* 3 */
			};
		private static final int /*@NonNull*/ [] __Africa = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Asiapacific =
			{
				Fragments._Asiapacific__OclAny /* 0 */,
				Fragments._Asiapacific__OclElement /* 1 */,
				Fragments._Asiapacific__MixinBase /* 2 */,
				Fragments._Asiapacific__Asiapacific /* 3 */
			};
		private static final int /*@NonNull*/ [] __Asiapacific = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Availabilityzone =
			{
				Fragments._Availabilityzone__OclAny /* 0 */,
				Fragments._Availabilityzone__OclElement /* 1 */,
				Fragments._Availabilityzone__Entity /* 2 */,
				Fragments._Availabilityzone__Resource /* 3 */,
				Fragments._Availabilityzone__Availabilityzone /* 4 */
			};
		private static final int /*@NonNull*/ [] __Availabilityzone = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Availabilityzonelink =
			{
				Fragments._Availabilityzonelink__OclAny /* 0 */,
				Fragments._Availabilityzonelink__OclElement /* 1 */,
				Fragments._Availabilityzonelink__Entity /* 2 */,
				Fragments._Availabilityzonelink__Link /* 3 */,
				Fragments._Availabilityzonelink__Availabilityzonelink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Availabilityzonelink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _China =
			{
				Fragments._China__OclAny /* 0 */,
				Fragments._China__OclElement /* 1 */,
				Fragments._China__MixinBase /* 2 */,
				Fragments._China__China /* 3 */
			};
		private static final int /*@NonNull*/ [] __China = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Europe =
			{
				Fragments._Europe__OclAny /* 0 */,
				Fragments._Europe__OclElement /* 1 */,
				Fragments._Europe__MixinBase /* 2 */,
				Fragments._Europe__Europe /* 3 */
			};
		private static final int /*@NonNull*/ [] __Europe = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Northamerica =
			{
				Fragments._Northamerica__OclAny /* 0 */,
				Fragments._Northamerica__OclElement /* 1 */,
				Fragments._Northamerica__MixinBase /* 2 */,
				Fragments._Northamerica__Northamerica /* 3 */
			};
		private static final int /*@NonNull*/ [] __Northamerica = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Region =
			{
				Fragments._Region__OclAny /* 0 */,
				Fragments._Region__OclElement /* 1 */,
				Fragments._Region__Entity /* 2 */,
				Fragments._Region__Resource /* 3 */,
				Fragments._Region__Region /* 4 */
			};
		private static final int /*@NonNull*/ [] __Region = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Regionlink =
			{
				Fragments._Regionlink__OclAny /* 0 */,
				Fragments._Regionlink__OclElement /* 1 */,
				Fragments._Regionlink__Entity /* 2 */,
				Fragments._Regionlink__Link /* 3 */,
				Fragments._Regionlink__Regionlink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Regionlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Southamerica =
			{
				Fragments._Southamerica__OclAny /* 0 */,
				Fragments._Southamerica__OclElement /* 1 */,
				Fragments._Southamerica__MixinBase /* 2 */,
				Fragments._Southamerica__Southamerica /* 3 */
			};
		private static final int /*@NonNull*/ [] __Southamerica = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Africa.initFragments(_Africa, __Africa);
			Types._Asiapacific.initFragments(_Asiapacific, __Asiapacific);
			Types._Availabilityzone.initFragments(_Availabilityzone, __Availabilityzone);
			Types._Availabilityzonelink.initFragments(_Availabilityzonelink, __Availabilityzonelink);
			Types._China.initFragments(_China, __China);
			Types._Europe.initFragments(_Europe, __Europe);
			Types._Northamerica.initFragments(_Northamerica, __Northamerica);
			Types._Region.initFragments(_Region, __Region);
			Types._Regionlink.initFragments(_Regionlink, __Regionlink);
			Types._Southamerica.initFragments(_Southamerica, __Southamerica);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RegionsTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Africa__Africa = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Africa__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Africa__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Africa__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Asiapacific__Asiapacific = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Asiapacific__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Asiapacific__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Asiapacific__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzone__Availabilityzone = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzone__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzone__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzone__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzone__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzonelink__Availabilityzonelink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzonelink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzonelink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzonelink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availabilityzonelink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _China__China = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _China__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _China__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _China__OclElement = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Northamerica__Northamerica = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Northamerica__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Northamerica__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Northamerica__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Region__Region = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Region__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Region__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Region__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Region__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Regionlink__Regionlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Regionlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Regionlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Regionlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Regionlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Southamerica__Southamerica = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Southamerica__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Southamerica__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Southamerica__OclElement = {
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
			Fragments._Africa__Africa.initOperations(_Africa__Africa);
			Fragments._Africa__MixinBase.initOperations(_Africa__MixinBase);
			Fragments._Africa__OclAny.initOperations(_Africa__OclAny);
			Fragments._Africa__OclElement.initOperations(_Africa__OclElement);

			Fragments._Asiapacific__Asiapacific.initOperations(_Asiapacific__Asiapacific);
			Fragments._Asiapacific__MixinBase.initOperations(_Asiapacific__MixinBase);
			Fragments._Asiapacific__OclAny.initOperations(_Asiapacific__OclAny);
			Fragments._Asiapacific__OclElement.initOperations(_Asiapacific__OclElement);

			Fragments._Availabilityzone__Availabilityzone.initOperations(_Availabilityzone__Availabilityzone);
			Fragments._Availabilityzone__Entity.initOperations(_Availabilityzone__Entity);
			Fragments._Availabilityzone__OclAny.initOperations(_Availabilityzone__OclAny);
			Fragments._Availabilityzone__OclElement.initOperations(_Availabilityzone__OclElement);
			Fragments._Availabilityzone__Resource.initOperations(_Availabilityzone__Resource);

			Fragments._Availabilityzonelink__Availabilityzonelink.initOperations(_Availabilityzonelink__Availabilityzonelink);
			Fragments._Availabilityzonelink__Entity.initOperations(_Availabilityzonelink__Entity);
			Fragments._Availabilityzonelink__Link.initOperations(_Availabilityzonelink__Link);
			Fragments._Availabilityzonelink__OclAny.initOperations(_Availabilityzonelink__OclAny);
			Fragments._Availabilityzonelink__OclElement.initOperations(_Availabilityzonelink__OclElement);

			Fragments._China__China.initOperations(_China__China);
			Fragments._China__MixinBase.initOperations(_China__MixinBase);
			Fragments._China__OclAny.initOperations(_China__OclAny);
			Fragments._China__OclElement.initOperations(_China__OclElement);

			Fragments._Europe__Europe.initOperations(_Europe__Europe);
			Fragments._Europe__MixinBase.initOperations(_Europe__MixinBase);
			Fragments._Europe__OclAny.initOperations(_Europe__OclAny);
			Fragments._Europe__OclElement.initOperations(_Europe__OclElement);

			Fragments._Northamerica__MixinBase.initOperations(_Northamerica__MixinBase);
			Fragments._Northamerica__Northamerica.initOperations(_Northamerica__Northamerica);
			Fragments._Northamerica__OclAny.initOperations(_Northamerica__OclAny);
			Fragments._Northamerica__OclElement.initOperations(_Northamerica__OclElement);

			Fragments._Region__Entity.initOperations(_Region__Entity);
			Fragments._Region__OclAny.initOperations(_Region__OclAny);
			Fragments._Region__OclElement.initOperations(_Region__OclElement);
			Fragments._Region__Region.initOperations(_Region__Region);
			Fragments._Region__Resource.initOperations(_Region__Resource);

			Fragments._Regionlink__Entity.initOperations(_Regionlink__Entity);
			Fragments._Regionlink__Link.initOperations(_Regionlink__Link);
			Fragments._Regionlink__OclAny.initOperations(_Regionlink__OclAny);
			Fragments._Regionlink__OclElement.initOperations(_Regionlink__OclElement);
			Fragments._Regionlink__Regionlink.initOperations(_Regionlink__Regionlink);

			Fragments._Southamerica__MixinBase.initOperations(_Southamerica__MixinBase);
			Fragments._Southamerica__OclAny.initOperations(_Southamerica__OclAny);
			Fragments._Southamerica__OclElement.initOperations(_Southamerica__OclElement);
			Fragments._Southamerica__Southamerica.initOperations(_Southamerica__Southamerica);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RegionsTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Africa = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Asiapacific = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Availabilityzone = {
			RegionsTables.Properties._Availabilityzone__available,
			RegionsTables.Properties._Availabilityzone__zoneMessage,
			RegionsTables.Properties._Availabilityzone__zoneName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Availabilityzonelink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _China = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Europe = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Northamerica = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Region = {
			RegionsTables.Properties._Region__endpoint,
			RegionsTables.Properties._Region__regionDescription,
			RegionsTables.Properties._Region__regionId,
			RegionsTables.Properties._Region__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Regionlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Southamerica = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Africa__Africa.initProperties(_Africa);
			Fragments._Asiapacific__Asiapacific.initProperties(_Asiapacific);
			Fragments._Availabilityzone__Availabilityzone.initProperties(_Availabilityzone);
			Fragments._Availabilityzonelink__Availabilityzonelink.initProperties(_Availabilityzonelink);
			Fragments._China__China.initProperties(_China);
			Fragments._Europe__Europe.initProperties(_Europe);
			Fragments._Northamerica__Northamerica.initProperties(_Northamerica);
			Fragments._Region__Region.initProperties(_Region);
			Fragments._Regionlink__Regionlink.initProperties(_Regionlink);
			Fragments._Southamerica__Southamerica.initProperties(_Southamerica);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RegionsTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of RegionsTables::EnumerationLiterals and all preceding sub-packages.
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
