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
 *   /org.eclipse.cmf.occi.multicloud.regions.aws/model/awsregions.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.regions.aws/model/awsregions.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package awsregions;

import awsregions.AwsregionsTables;
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
 * AwsregionsTables provides the dispatch tables for the awsregions for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class AwsregionsTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(AwsregionsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			AwsregionsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AwsregionsTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Ap_northeast_1 = new EcoreExecutorType(AwsregionsPackage.Literals.AP_NORTHEAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_northeast_2 = new EcoreExecutorType(AwsregionsPackage.Literals.AP_NORTHEAST_2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_south_1 = new EcoreExecutorType(AwsregionsPackage.Literals.AP_SOUTH_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_south_east2 = new EcoreExecutorType(AwsregionsPackage.Literals.AP_SOUTH_EAST2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ap_southeast_1 = new EcoreExecutorType(AwsregionsPackage.Literals.AP_SOUTHEAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ca_central_1 = new EcoreExecutorType(AwsregionsPackage.Literals.CA_CENTRAL_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_central_1 = new EcoreExecutorType(AwsregionsPackage.Literals.EU_CENTRAL_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_west_1 = new EcoreExecutorType(AwsregionsPackage.Literals.EU_WEST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_west_2 = new EcoreExecutorType(AwsregionsPackage.Literals.EU_WEST_2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Eu_west_3 = new EcoreExecutorType(AwsregionsPackage.Literals.EU_WEST_3, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sa_east_1 = new EcoreExecutorType(AwsregionsPackage.Literals.SA_EAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_east_1 = new EcoreExecutorType(AwsregionsPackage.Literals.US_EAST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_east_2 = new EcoreExecutorType(AwsregionsPackage.Literals.US_EAST_2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_west_1 = new EcoreExecutorType(AwsregionsPackage.Literals.US_WEST_1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Us_west_2 = new EcoreExecutorType(AwsregionsPackage.Literals.US_WEST_2, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Ap_northeast_1,
			_Ap_northeast_2,
			_Ap_south_1,
			_Ap_south_east2,
			_Ap_southeast_1,
			_Ca_central_1,
			_Eu_central_1,
			_Eu_west_1,
			_Eu_west_2,
			_Eu_west_3,
			_Sa_east_1,
			_Us_east_1,
			_Us_east_2,
			_Us_west_1,
			_Us_west_2
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AwsregionsTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__Ap_northeast_1 = new ExecutorFragment(Types._Ap_northeast_1, AwsregionsTables.Types._Ap_northeast_1);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__Asiapacific = new ExecutorFragment(Types._Ap_northeast_1, RegionsTables.Types._Asiapacific);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__MixinBase = new ExecutorFragment(Types._Ap_northeast_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__OclAny = new ExecutorFragment(Types._Ap_northeast_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__OclElement = new ExecutorFragment(Types._Ap_northeast_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_1__Region = new ExecutorFragment(Types._Ap_northeast_1, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__Ap_northeast_2 = new ExecutorFragment(Types._Ap_northeast_2, AwsregionsTables.Types._Ap_northeast_2);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__Asiapacific = new ExecutorFragment(Types._Ap_northeast_2, RegionsTables.Types._Asiapacific);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__MixinBase = new ExecutorFragment(Types._Ap_northeast_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__OclAny = new ExecutorFragment(Types._Ap_northeast_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__OclElement = new ExecutorFragment(Types._Ap_northeast_2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ap_northeast_2__Region = new ExecutorFragment(Types._Ap_northeast_2, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__Ap_south_1 = new ExecutorFragment(Types._Ap_south_1, AwsregionsTables.Types._Ap_south_1);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__Asiapacific = new ExecutorFragment(Types._Ap_south_1, RegionsTables.Types._Asiapacific);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__MixinBase = new ExecutorFragment(Types._Ap_south_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__OclAny = new ExecutorFragment(Types._Ap_south_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__OclElement = new ExecutorFragment(Types._Ap_south_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_1__Region = new ExecutorFragment(Types._Ap_south_1, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__Ap_south_east2 = new ExecutorFragment(Types._Ap_south_east2, AwsregionsTables.Types._Ap_south_east2);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__Asiapacific = new ExecutorFragment(Types._Ap_south_east2, RegionsTables.Types._Asiapacific);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__MixinBase = new ExecutorFragment(Types._Ap_south_east2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__OclAny = new ExecutorFragment(Types._Ap_south_east2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__OclElement = new ExecutorFragment(Types._Ap_south_east2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ap_south_east2__Region = new ExecutorFragment(Types._Ap_south_east2, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__Ap_southeast_1 = new ExecutorFragment(Types._Ap_southeast_1, AwsregionsTables.Types._Ap_southeast_1);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__Asiapacific = new ExecutorFragment(Types._Ap_southeast_1, RegionsTables.Types._Asiapacific);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__MixinBase = new ExecutorFragment(Types._Ap_southeast_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__OclAny = new ExecutorFragment(Types._Ap_southeast_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__OclElement = new ExecutorFragment(Types._Ap_southeast_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ap_southeast_1__Region = new ExecutorFragment(Types._Ap_southeast_1, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__Ca_central_1 = new ExecutorFragment(Types._Ca_central_1, AwsregionsTables.Types._Ca_central_1);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__MixinBase = new ExecutorFragment(Types._Ca_central_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__Northamerica = new ExecutorFragment(Types._Ca_central_1, RegionsTables.Types._Northamerica);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__OclAny = new ExecutorFragment(Types._Ca_central_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__OclElement = new ExecutorFragment(Types._Ca_central_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ca_central_1__Region = new ExecutorFragment(Types._Ca_central_1, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__Eu_central_1 = new ExecutorFragment(Types._Eu_central_1, AwsregionsTables.Types._Eu_central_1);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__Europe = new ExecutorFragment(Types._Eu_central_1, RegionsTables.Types._Europe);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__MixinBase = new ExecutorFragment(Types._Eu_central_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__OclAny = new ExecutorFragment(Types._Eu_central_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__OclElement = new ExecutorFragment(Types._Eu_central_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Eu_central_1__Region = new ExecutorFragment(Types._Eu_central_1, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__Eu_west_1 = new ExecutorFragment(Types._Eu_west_1, AwsregionsTables.Types._Eu_west_1);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__Europe = new ExecutorFragment(Types._Eu_west_1, RegionsTables.Types._Europe);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__MixinBase = new ExecutorFragment(Types._Eu_west_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__OclAny = new ExecutorFragment(Types._Eu_west_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__OclElement = new ExecutorFragment(Types._Eu_west_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_1__Region = new ExecutorFragment(Types._Eu_west_1, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__Eu_west_2 = new ExecutorFragment(Types._Eu_west_2, AwsregionsTables.Types._Eu_west_2);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__Europe = new ExecutorFragment(Types._Eu_west_2, RegionsTables.Types._Europe);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__MixinBase = new ExecutorFragment(Types._Eu_west_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__OclAny = new ExecutorFragment(Types._Eu_west_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__OclElement = new ExecutorFragment(Types._Eu_west_2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_2__Region = new ExecutorFragment(Types._Eu_west_2, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__Eu_west_3 = new ExecutorFragment(Types._Eu_west_3, AwsregionsTables.Types._Eu_west_3);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__Europe = new ExecutorFragment(Types._Eu_west_3, RegionsTables.Types._Europe);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__MixinBase = new ExecutorFragment(Types._Eu_west_3, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__OclAny = new ExecutorFragment(Types._Eu_west_3, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__OclElement = new ExecutorFragment(Types._Eu_west_3, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Eu_west_3__Region = new ExecutorFragment(Types._Eu_west_3, RegionsTables.Types._Region);

		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__MixinBase = new ExecutorFragment(Types._Sa_east_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__OclAny = new ExecutorFragment(Types._Sa_east_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__OclElement = new ExecutorFragment(Types._Sa_east_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__Region = new ExecutorFragment(Types._Sa_east_1, RegionsTables.Types._Region);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__Sa_east_1 = new ExecutorFragment(Types._Sa_east_1, AwsregionsTables.Types._Sa_east_1);
		private static final /*@NonNull*/ ExecutorFragment _Sa_east_1__Southamerica = new ExecutorFragment(Types._Sa_east_1, RegionsTables.Types._Southamerica);

		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__MixinBase = new ExecutorFragment(Types._Us_east_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__Northamerica = new ExecutorFragment(Types._Us_east_1, RegionsTables.Types._Northamerica);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__OclAny = new ExecutorFragment(Types._Us_east_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__OclElement = new ExecutorFragment(Types._Us_east_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__Region = new ExecutorFragment(Types._Us_east_1, RegionsTables.Types._Region);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_1__Us_east_1 = new ExecutorFragment(Types._Us_east_1, AwsregionsTables.Types._Us_east_1);

		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__MixinBase = new ExecutorFragment(Types._Us_east_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__Northamerica = new ExecutorFragment(Types._Us_east_2, RegionsTables.Types._Northamerica);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__OclAny = new ExecutorFragment(Types._Us_east_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__OclElement = new ExecutorFragment(Types._Us_east_2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__Region = new ExecutorFragment(Types._Us_east_2, RegionsTables.Types._Region);
		private static final /*@NonNull*/ ExecutorFragment _Us_east_2__Us_east_2 = new ExecutorFragment(Types._Us_east_2, AwsregionsTables.Types._Us_east_2);

		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__MixinBase = new ExecutorFragment(Types._Us_west_1, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__Northamerica = new ExecutorFragment(Types._Us_west_1, RegionsTables.Types._Northamerica);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__OclAny = new ExecutorFragment(Types._Us_west_1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__OclElement = new ExecutorFragment(Types._Us_west_1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__Region = new ExecutorFragment(Types._Us_west_1, RegionsTables.Types._Region);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_1__Us_west_1 = new ExecutorFragment(Types._Us_west_1, AwsregionsTables.Types._Us_west_1);

		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__MixinBase = new ExecutorFragment(Types._Us_west_2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__Northamerica = new ExecutorFragment(Types._Us_west_2, RegionsTables.Types._Northamerica);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__OclAny = new ExecutorFragment(Types._Us_west_2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__OclElement = new ExecutorFragment(Types._Us_west_2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__Region = new ExecutorFragment(Types._Us_west_2, RegionsTables.Types._Region);
		private static final /*@NonNull*/ ExecutorFragment _Us_west_2__Us_west_2 = new ExecutorFragment(Types._Us_west_2, AwsregionsTables.Types._Us_west_2);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AwsregionsTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of AwsregionsTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of AwsregionsTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_1__CITY, Types._Ap_northeast_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_1__COUNTRY, Types._Ap_northeast_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_1__REGION_ID, Types._Ap_northeast_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_1__REGION_NAME, Types._Ap_northeast_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_2__CITY, Types._Ap_northeast_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_2__COUNTRY, Types._Ap_northeast_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_2__REGION_ID, Types._Ap_northeast_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_northeast_2__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_NORTHEAST_2__REGION_NAME, Types._Ap_northeast_2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_1__CITY, Types._Ap_south_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_1__COUNTRY, Types._Ap_south_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_1__REGION_ID, Types._Ap_south_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_1__REGION_NAME, Types._Ap_south_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_EAST2__CITY, Types._Ap_south_east2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_EAST2__COUNTRY, Types._Ap_south_east2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_EAST2__REGION_ID, Types._Ap_south_east2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_south_east2__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTH_EAST2__REGION_NAME, Types._Ap_south_east2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTHEAST_1__CITY, Types._Ap_southeast_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTHEAST_1__COUNTRY, Types._Ap_southeast_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTHEAST_1__REGION_ID, Types._Ap_southeast_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ap_southeast_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.AP_SOUTHEAST_1__REGION_NAME, Types._Ap_southeast_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.CA_CENTRAL_1__CITY, Types._Ca_central_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.CA_CENTRAL_1__COUNTRY, Types._Ca_central_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.CA_CENTRAL_1__REGION_ID, Types._Ca_central_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Ca_central_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.CA_CENTRAL_1__REGION_NAME, Types._Ca_central_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_CENTRAL_1__CITY, Types._Eu_central_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_CENTRAL_1__COUNTRY, Types._Eu_central_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_CENTRAL_1__REGION_ID, Types._Eu_central_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_central_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_CENTRAL_1__REGION_NAME, Types._Eu_central_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_1__CITY, Types._Eu_west_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_1__COUNTRY, Types._Eu_west_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_1__REGION_ID, Types._Eu_west_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_1__REGION_NAME, Types._Eu_west_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_2__CITY, Types._Eu_west_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_2__COUNTRY, Types._Eu_west_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_2__REGION_ID, Types._Eu_west_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_2__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_2__REGION_NAME, Types._Eu_west_2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_3__CITY, Types._Eu_west_3, 0);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_3__COUNTRY, Types._Eu_west_3, 1);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_3__REGION_ID, Types._Eu_west_3, 2);
		public static final /*@NonNull*/ ExecutorProperty _Eu_west_3__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.EU_WEST_3__REGION_NAME, Types._Eu_west_3, 3);

		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.SA_EAST_1__CITY, Types._Sa_east_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.SA_EAST_1__COUNTRY, Types._Sa_east_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.SA_EAST_1__REGION_ID, Types._Sa_east_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Sa_east_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.SA_EAST_1__REGION_NAME, Types._Sa_east_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_1__CITY, Types._Us_east_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_1__COUNTRY, Types._Us_east_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_1__REGION_ID, Types._Us_east_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_1__REGION_NAME, Types._Us_east_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_2__CITY, Types._Us_east_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_2__COUNTRY, Types._Us_east_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_2__REGION_ID, Types._Us_east_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_east_2__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_EAST_2__REGION_NAME, Types._Us_east_2, 3);

		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_1__CITY, Types._Us_west_1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_1__COUNTRY, Types._Us_west_1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_1__REGION_ID, Types._Us_west_1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_1__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_1__REGION_NAME, Types._Us_west_1, 3);

		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__city = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_2__CITY, Types._Us_west_2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__country = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_2__COUNTRY, Types._Us_west_2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__regionId = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_2__REGION_ID, Types._Us_west_2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Us_west_2__regionName = new EcoreExecutorProperty(AwsregionsPackage.Literals.US_WEST_2__REGION_NAME, Types._Us_west_2, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AwsregionsTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_northeast_1 =
		{
			Fragments._Ap_northeast_1__OclAny /* 0 */,
			Fragments._Ap_northeast_1__OclElement /* 1 */,
			Fragments._Ap_northeast_1__MixinBase /* 2 */,
			Fragments._Ap_northeast_1__Region /* 3 */,
			Fragments._Ap_northeast_1__Asiapacific /* 4 */,
			Fragments._Ap_northeast_1__Ap_northeast_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ap_northeast_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_northeast_2 =
		{
			Fragments._Ap_northeast_2__OclAny /* 0 */,
			Fragments._Ap_northeast_2__OclElement /* 1 */,
			Fragments._Ap_northeast_2__MixinBase /* 2 */,
			Fragments._Ap_northeast_2__Region /* 3 */,
			Fragments._Ap_northeast_2__Asiapacific /* 4 */,
			Fragments._Ap_northeast_2__Ap_northeast_2 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ap_northeast_2 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_south_1 =
		{
			Fragments._Ap_south_1__OclAny /* 0 */,
			Fragments._Ap_south_1__OclElement /* 1 */,
			Fragments._Ap_south_1__MixinBase /* 2 */,
			Fragments._Ap_south_1__Region /* 3 */,
			Fragments._Ap_south_1__Asiapacific /* 4 */,
			Fragments._Ap_south_1__Ap_south_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ap_south_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_south_east2 =
		{
			Fragments._Ap_south_east2__OclAny /* 0 */,
			Fragments._Ap_south_east2__OclElement /* 1 */,
			Fragments._Ap_south_east2__MixinBase /* 2 */,
			Fragments._Ap_south_east2__Region /* 3 */,
			Fragments._Ap_south_east2__Asiapacific /* 4 */,
			Fragments._Ap_south_east2__Ap_south_east2 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ap_south_east2 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ap_southeast_1 =
		{
			Fragments._Ap_southeast_1__OclAny /* 0 */,
			Fragments._Ap_southeast_1__OclElement /* 1 */,
			Fragments._Ap_southeast_1__MixinBase /* 2 */,
			Fragments._Ap_southeast_1__Region /* 3 */,
			Fragments._Ap_southeast_1__Asiapacific /* 4 */,
			Fragments._Ap_southeast_1__Ap_southeast_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ap_southeast_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ca_central_1 =
		{
			Fragments._Ca_central_1__OclAny /* 0 */,
			Fragments._Ca_central_1__OclElement /* 1 */,
			Fragments._Ca_central_1__MixinBase /* 2 */,
			Fragments._Ca_central_1__Region /* 3 */,
			Fragments._Ca_central_1__Northamerica /* 4 */,
			Fragments._Ca_central_1__Ca_central_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Ca_central_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_central_1 =
		{
			Fragments._Eu_central_1__OclAny /* 0 */,
			Fragments._Eu_central_1__OclElement /* 1 */,
			Fragments._Eu_central_1__MixinBase /* 2 */,
			Fragments._Eu_central_1__Region /* 3 */,
			Fragments._Eu_central_1__Europe /* 4 */,
			Fragments._Eu_central_1__Eu_central_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Eu_central_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_west_1 =
		{
			Fragments._Eu_west_1__OclAny /* 0 */,
			Fragments._Eu_west_1__OclElement /* 1 */,
			Fragments._Eu_west_1__MixinBase /* 2 */,
			Fragments._Eu_west_1__Region /* 3 */,
			Fragments._Eu_west_1__Europe /* 4 */,
			Fragments._Eu_west_1__Eu_west_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Eu_west_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_west_2 =
		{
			Fragments._Eu_west_2__OclAny /* 0 */,
			Fragments._Eu_west_2__OclElement /* 1 */,
			Fragments._Eu_west_2__MixinBase /* 2 */,
			Fragments._Eu_west_2__Region /* 3 */,
			Fragments._Eu_west_2__Europe /* 4 */,
			Fragments._Eu_west_2__Eu_west_2 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Eu_west_2 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Eu_west_3 =
		{
			Fragments._Eu_west_3__OclAny /* 0 */,
			Fragments._Eu_west_3__OclElement /* 1 */,
			Fragments._Eu_west_3__MixinBase /* 2 */,
			Fragments._Eu_west_3__Region /* 3 */,
			Fragments._Eu_west_3__Europe /* 4 */,
			Fragments._Eu_west_3__Eu_west_3 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Eu_west_3 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sa_east_1 =
		{
			Fragments._Sa_east_1__OclAny /* 0 */,
			Fragments._Sa_east_1__OclElement /* 1 */,
			Fragments._Sa_east_1__MixinBase /* 2 */,
			Fragments._Sa_east_1__Region /* 3 */,
			Fragments._Sa_east_1__Southamerica /* 4 */,
			Fragments._Sa_east_1__Sa_east_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Sa_east_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_east_1 =
		{
			Fragments._Us_east_1__OclAny /* 0 */,
			Fragments._Us_east_1__OclElement /* 1 */,
			Fragments._Us_east_1__MixinBase /* 2 */,
			Fragments._Us_east_1__Region /* 3 */,
			Fragments._Us_east_1__Northamerica /* 4 */,
			Fragments._Us_east_1__Us_east_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Us_east_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_east_2 =
		{
			Fragments._Us_east_2__OclAny /* 0 */,
			Fragments._Us_east_2__OclElement /* 1 */,
			Fragments._Us_east_2__MixinBase /* 2 */,
			Fragments._Us_east_2__Region /* 3 */,
			Fragments._Us_east_2__Northamerica /* 4 */,
			Fragments._Us_east_2__Us_east_2 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Us_east_2 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_west_1 =
		{
			Fragments._Us_west_1__OclAny /* 0 */,
			Fragments._Us_west_1__OclElement /* 1 */,
			Fragments._Us_west_1__MixinBase /* 2 */,
			Fragments._Us_west_1__Region /* 3 */,
			Fragments._Us_west_1__Northamerica /* 4 */,
			Fragments._Us_west_1__Us_west_1 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Us_west_1 = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Us_west_2 =
		{
			Fragments._Us_west_2__OclAny /* 0 */,
			Fragments._Us_west_2__OclElement /* 1 */,
			Fragments._Us_west_2__MixinBase /* 2 */,
			Fragments._Us_west_2__Region /* 3 */,
			Fragments._Us_west_2__Northamerica /* 4 */,
			Fragments._Us_west_2__Us_west_2 /* 5 */
		};
		private static final int /*@NonNull*/ [] __Us_west_2 = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Ap_northeast_1.initFragments(_Ap_northeast_1, __Ap_northeast_1);
			Types._Ap_northeast_2.initFragments(_Ap_northeast_2, __Ap_northeast_2);
			Types._Ap_south_1.initFragments(_Ap_south_1, __Ap_south_1);
			Types._Ap_south_east2.initFragments(_Ap_south_east2, __Ap_south_east2);
			Types._Ap_southeast_1.initFragments(_Ap_southeast_1, __Ap_southeast_1);
			Types._Ca_central_1.initFragments(_Ca_central_1, __Ca_central_1);
			Types._Eu_central_1.initFragments(_Eu_central_1, __Eu_central_1);
			Types._Eu_west_1.initFragments(_Eu_west_1, __Eu_west_1);
			Types._Eu_west_2.initFragments(_Eu_west_2, __Eu_west_2);
			Types._Eu_west_3.initFragments(_Eu_west_3, __Eu_west_3);
			Types._Sa_east_1.initFragments(_Sa_east_1, __Sa_east_1);
			Types._Us_east_1.initFragments(_Us_east_1, __Us_east_1);
			Types._Us_east_2.initFragments(_Us_east_2, __Us_east_2);
			Types._Us_west_1.initFragments(_Us_west_1, __Us_west_1);
			Types._Us_west_2.initFragments(_Us_west_2, __Us_west_2);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AwsregionsTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_1__Ap_northeast_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_1__Asiapacific = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_2__Ap_northeast_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_2__Asiapacific = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_northeast_2__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_1__Ap_south_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_1__Asiapacific = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_east2__Ap_south_east2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_east2__Asiapacific = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_south_east2__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_southeast_1__Ap_southeast_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_southeast_1__Asiapacific = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ap_southeast_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__Ca_central_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__Northamerica = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ca_central_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_central_1__Eu_central_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_central_1__Europe = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_central_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_1__Eu_west_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_1__Europe = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_2__Eu_west_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_2__Europe = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_2__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_3__Eu_west_3 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_3__Europe = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Eu_west_3__Region = {};

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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sa_east_1__Region = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sa_east_1__Southamerica = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__Us_east_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__Northamerica = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__Us_east_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__Northamerica = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_east_2__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__Us_west_1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__Northamerica = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_1__Region = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__Us_west_2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__Northamerica = {};
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Us_west_2__Region = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ap_northeast_1__Ap_northeast_1.initOperations(_Ap_northeast_1__Ap_northeast_1);
			Fragments._Ap_northeast_1__Asiapacific.initOperations(_Ap_northeast_1__Asiapacific);
			Fragments._Ap_northeast_1__MixinBase.initOperations(_Ap_northeast_1__MixinBase);
			Fragments._Ap_northeast_1__OclAny.initOperations(_Ap_northeast_1__OclAny);
			Fragments._Ap_northeast_1__OclElement.initOperations(_Ap_northeast_1__OclElement);
			Fragments._Ap_northeast_1__Region.initOperations(_Ap_northeast_1__Region);

			Fragments._Ap_northeast_2__Ap_northeast_2.initOperations(_Ap_northeast_2__Ap_northeast_2);
			Fragments._Ap_northeast_2__Asiapacific.initOperations(_Ap_northeast_2__Asiapacific);
			Fragments._Ap_northeast_2__MixinBase.initOperations(_Ap_northeast_2__MixinBase);
			Fragments._Ap_northeast_2__OclAny.initOperations(_Ap_northeast_2__OclAny);
			Fragments._Ap_northeast_2__OclElement.initOperations(_Ap_northeast_2__OclElement);
			Fragments._Ap_northeast_2__Region.initOperations(_Ap_northeast_2__Region);

			Fragments._Ap_south_1__Ap_south_1.initOperations(_Ap_south_1__Ap_south_1);
			Fragments._Ap_south_1__Asiapacific.initOperations(_Ap_south_1__Asiapacific);
			Fragments._Ap_south_1__MixinBase.initOperations(_Ap_south_1__MixinBase);
			Fragments._Ap_south_1__OclAny.initOperations(_Ap_south_1__OclAny);
			Fragments._Ap_south_1__OclElement.initOperations(_Ap_south_1__OclElement);
			Fragments._Ap_south_1__Region.initOperations(_Ap_south_1__Region);

			Fragments._Ap_south_east2__Ap_south_east2.initOperations(_Ap_south_east2__Ap_south_east2);
			Fragments._Ap_south_east2__Asiapacific.initOperations(_Ap_south_east2__Asiapacific);
			Fragments._Ap_south_east2__MixinBase.initOperations(_Ap_south_east2__MixinBase);
			Fragments._Ap_south_east2__OclAny.initOperations(_Ap_south_east2__OclAny);
			Fragments._Ap_south_east2__OclElement.initOperations(_Ap_south_east2__OclElement);
			Fragments._Ap_south_east2__Region.initOperations(_Ap_south_east2__Region);

			Fragments._Ap_southeast_1__Ap_southeast_1.initOperations(_Ap_southeast_1__Ap_southeast_1);
			Fragments._Ap_southeast_1__Asiapacific.initOperations(_Ap_southeast_1__Asiapacific);
			Fragments._Ap_southeast_1__MixinBase.initOperations(_Ap_southeast_1__MixinBase);
			Fragments._Ap_southeast_1__OclAny.initOperations(_Ap_southeast_1__OclAny);
			Fragments._Ap_southeast_1__OclElement.initOperations(_Ap_southeast_1__OclElement);
			Fragments._Ap_southeast_1__Region.initOperations(_Ap_southeast_1__Region);

			Fragments._Ca_central_1__Ca_central_1.initOperations(_Ca_central_1__Ca_central_1);
			Fragments._Ca_central_1__MixinBase.initOperations(_Ca_central_1__MixinBase);
			Fragments._Ca_central_1__Northamerica.initOperations(_Ca_central_1__Northamerica);
			Fragments._Ca_central_1__OclAny.initOperations(_Ca_central_1__OclAny);
			Fragments._Ca_central_1__OclElement.initOperations(_Ca_central_1__OclElement);
			Fragments._Ca_central_1__Region.initOperations(_Ca_central_1__Region);

			Fragments._Eu_central_1__Eu_central_1.initOperations(_Eu_central_1__Eu_central_1);
			Fragments._Eu_central_1__Europe.initOperations(_Eu_central_1__Europe);
			Fragments._Eu_central_1__MixinBase.initOperations(_Eu_central_1__MixinBase);
			Fragments._Eu_central_1__OclAny.initOperations(_Eu_central_1__OclAny);
			Fragments._Eu_central_1__OclElement.initOperations(_Eu_central_1__OclElement);
			Fragments._Eu_central_1__Region.initOperations(_Eu_central_1__Region);

			Fragments._Eu_west_1__Eu_west_1.initOperations(_Eu_west_1__Eu_west_1);
			Fragments._Eu_west_1__Europe.initOperations(_Eu_west_1__Europe);
			Fragments._Eu_west_1__MixinBase.initOperations(_Eu_west_1__MixinBase);
			Fragments._Eu_west_1__OclAny.initOperations(_Eu_west_1__OclAny);
			Fragments._Eu_west_1__OclElement.initOperations(_Eu_west_1__OclElement);
			Fragments._Eu_west_1__Region.initOperations(_Eu_west_1__Region);

			Fragments._Eu_west_2__Eu_west_2.initOperations(_Eu_west_2__Eu_west_2);
			Fragments._Eu_west_2__Europe.initOperations(_Eu_west_2__Europe);
			Fragments._Eu_west_2__MixinBase.initOperations(_Eu_west_2__MixinBase);
			Fragments._Eu_west_2__OclAny.initOperations(_Eu_west_2__OclAny);
			Fragments._Eu_west_2__OclElement.initOperations(_Eu_west_2__OclElement);
			Fragments._Eu_west_2__Region.initOperations(_Eu_west_2__Region);

			Fragments._Eu_west_3__Eu_west_3.initOperations(_Eu_west_3__Eu_west_3);
			Fragments._Eu_west_3__Europe.initOperations(_Eu_west_3__Europe);
			Fragments._Eu_west_3__MixinBase.initOperations(_Eu_west_3__MixinBase);
			Fragments._Eu_west_3__OclAny.initOperations(_Eu_west_3__OclAny);
			Fragments._Eu_west_3__OclElement.initOperations(_Eu_west_3__OclElement);
			Fragments._Eu_west_3__Region.initOperations(_Eu_west_3__Region);

			Fragments._Sa_east_1__MixinBase.initOperations(_Sa_east_1__MixinBase);
			Fragments._Sa_east_1__OclAny.initOperations(_Sa_east_1__OclAny);
			Fragments._Sa_east_1__OclElement.initOperations(_Sa_east_1__OclElement);
			Fragments._Sa_east_1__Region.initOperations(_Sa_east_1__Region);
			Fragments._Sa_east_1__Sa_east_1.initOperations(_Sa_east_1__Sa_east_1);
			Fragments._Sa_east_1__Southamerica.initOperations(_Sa_east_1__Southamerica);

			Fragments._Us_east_1__MixinBase.initOperations(_Us_east_1__MixinBase);
			Fragments._Us_east_1__Northamerica.initOperations(_Us_east_1__Northamerica);
			Fragments._Us_east_1__OclAny.initOperations(_Us_east_1__OclAny);
			Fragments._Us_east_1__OclElement.initOperations(_Us_east_1__OclElement);
			Fragments._Us_east_1__Region.initOperations(_Us_east_1__Region);
			Fragments._Us_east_1__Us_east_1.initOperations(_Us_east_1__Us_east_1);

			Fragments._Us_east_2__MixinBase.initOperations(_Us_east_2__MixinBase);
			Fragments._Us_east_2__Northamerica.initOperations(_Us_east_2__Northamerica);
			Fragments._Us_east_2__OclAny.initOperations(_Us_east_2__OclAny);
			Fragments._Us_east_2__OclElement.initOperations(_Us_east_2__OclElement);
			Fragments._Us_east_2__Region.initOperations(_Us_east_2__Region);
			Fragments._Us_east_2__Us_east_2.initOperations(_Us_east_2__Us_east_2);

			Fragments._Us_west_1__MixinBase.initOperations(_Us_west_1__MixinBase);
			Fragments._Us_west_1__Northamerica.initOperations(_Us_west_1__Northamerica);
			Fragments._Us_west_1__OclAny.initOperations(_Us_west_1__OclAny);
			Fragments._Us_west_1__OclElement.initOperations(_Us_west_1__OclElement);
			Fragments._Us_west_1__Region.initOperations(_Us_west_1__Region);
			Fragments._Us_west_1__Us_west_1.initOperations(_Us_west_1__Us_west_1);

			Fragments._Us_west_2__MixinBase.initOperations(_Us_west_2__MixinBase);
			Fragments._Us_west_2__Northamerica.initOperations(_Us_west_2__Northamerica);
			Fragments._Us_west_2__OclAny.initOperations(_Us_west_2__OclAny);
			Fragments._Us_west_2__OclElement.initOperations(_Us_west_2__OclElement);
			Fragments._Us_west_2__Region.initOperations(_Us_west_2__Region);
			Fragments._Us_west_2__Us_west_2.initOperations(_Us_west_2__Us_west_2);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AwsregionsTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_northeast_1 = {
			AwsregionsTables.Properties._Ap_northeast_1__city,
			AwsregionsTables.Properties._Ap_northeast_1__country,
			AwsregionsTables.Properties._Ap_northeast_1__regionId,
			AwsregionsTables.Properties._Ap_northeast_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_northeast_2 = {
			AwsregionsTables.Properties._Ap_northeast_2__city,
			AwsregionsTables.Properties._Ap_northeast_2__country,
			AwsregionsTables.Properties._Ap_northeast_2__regionId,
			AwsregionsTables.Properties._Ap_northeast_2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_south_1 = {
			AwsregionsTables.Properties._Ap_south_1__city,
			AwsregionsTables.Properties._Ap_south_1__country,
			AwsregionsTables.Properties._Ap_south_1__regionId,
			AwsregionsTables.Properties._Ap_south_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_south_east2 = {
			AwsregionsTables.Properties._Ap_south_east2__city,
			AwsregionsTables.Properties._Ap_south_east2__country,
			AwsregionsTables.Properties._Ap_south_east2__regionId,
			AwsregionsTables.Properties._Ap_south_east2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ap_southeast_1 = {
			AwsregionsTables.Properties._Ap_southeast_1__city,
			AwsregionsTables.Properties._Ap_southeast_1__country,
			AwsregionsTables.Properties._Ap_southeast_1__regionId,
			AwsregionsTables.Properties._Ap_southeast_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ca_central_1 = {
			AwsregionsTables.Properties._Ca_central_1__city,
			AwsregionsTables.Properties._Ca_central_1__country,
			AwsregionsTables.Properties._Ca_central_1__regionId,
			AwsregionsTables.Properties._Ca_central_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_central_1 = {
			AwsregionsTables.Properties._Eu_central_1__city,
			AwsregionsTables.Properties._Eu_central_1__country,
			AwsregionsTables.Properties._Eu_central_1__regionId,
			AwsregionsTables.Properties._Eu_central_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_west_1 = {
			AwsregionsTables.Properties._Eu_west_1__city,
			AwsregionsTables.Properties._Eu_west_1__country,
			AwsregionsTables.Properties._Eu_west_1__regionId,
			AwsregionsTables.Properties._Eu_west_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_west_2 = {
			AwsregionsTables.Properties._Eu_west_2__city,
			AwsregionsTables.Properties._Eu_west_2__country,
			AwsregionsTables.Properties._Eu_west_2__regionId,
			AwsregionsTables.Properties._Eu_west_2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Eu_west_3 = {
			AwsregionsTables.Properties._Eu_west_3__city,
			AwsregionsTables.Properties._Eu_west_3__country,
			AwsregionsTables.Properties._Eu_west_3__regionId,
			AwsregionsTables.Properties._Eu_west_3__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sa_east_1 = {
			AwsregionsTables.Properties._Sa_east_1__city,
			AwsregionsTables.Properties._Sa_east_1__country,
			AwsregionsTables.Properties._Sa_east_1__regionId,
			AwsregionsTables.Properties._Sa_east_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_east_1 = {
			AwsregionsTables.Properties._Us_east_1__city,
			AwsregionsTables.Properties._Us_east_1__country,
			AwsregionsTables.Properties._Us_east_1__regionId,
			AwsregionsTables.Properties._Us_east_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_east_2 = {
			AwsregionsTables.Properties._Us_east_2__city,
			AwsregionsTables.Properties._Us_east_2__country,
			AwsregionsTables.Properties._Us_east_2__regionId,
			AwsregionsTables.Properties._Us_east_2__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_west_1 = {
			AwsregionsTables.Properties._Us_west_1__city,
			AwsregionsTables.Properties._Us_west_1__country,
			AwsregionsTables.Properties._Us_west_1__regionId,
			AwsregionsTables.Properties._Us_west_1__regionName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Us_west_2 = {
			AwsregionsTables.Properties._Us_west_2__city,
			AwsregionsTables.Properties._Us_west_2__country,
			AwsregionsTables.Properties._Us_west_2__regionId,
			AwsregionsTables.Properties._Us_west_2__regionName
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ap_northeast_1__Ap_northeast_1.initProperties(_Ap_northeast_1);
			Fragments._Ap_northeast_2__Ap_northeast_2.initProperties(_Ap_northeast_2);
			Fragments._Ap_south_1__Ap_south_1.initProperties(_Ap_south_1);
			Fragments._Ap_south_east2__Ap_south_east2.initProperties(_Ap_south_east2);
			Fragments._Ap_southeast_1__Ap_southeast_1.initProperties(_Ap_southeast_1);
			Fragments._Ca_central_1__Ca_central_1.initProperties(_Ca_central_1);
			Fragments._Eu_central_1__Eu_central_1.initProperties(_Eu_central_1);
			Fragments._Eu_west_1__Eu_west_1.initProperties(_Eu_west_1);
			Fragments._Eu_west_2__Eu_west_2.initProperties(_Eu_west_2);
			Fragments._Eu_west_3__Eu_west_3.initProperties(_Eu_west_3);
			Fragments._Sa_east_1__Sa_east_1.initProperties(_Sa_east_1);
			Fragments._Us_east_1__Us_east_1.initProperties(_Us_east_1);
			Fragments._Us_east_2__Us_east_2.initProperties(_Us_east_2);
			Fragments._Us_west_1__Us_west_1.initProperties(_Us_west_1);
			Fragments._Us_west_2__Us_west_2.initProperties(_Us_west_2);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AwsregionsTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of AwsregionsTables::EnumerationLiterals and all preceding sub-packages.
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
