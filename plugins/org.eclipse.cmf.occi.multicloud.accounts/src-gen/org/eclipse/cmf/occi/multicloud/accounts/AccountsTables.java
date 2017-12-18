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
 *   /org.eclipse.cmf.occi.multicloud.accounts/model/accounts.ecore
 * using:
 *   /org.eclipse.cmf.occi.multicloud.accounts/model/accounts.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.multicloud.accounts;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.multicloud.accounts.AccountsTables;
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
 * AccountsTables provides the dispatch tables for the accounts for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class AccountsTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(AccountsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_security_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occiware.org/occi/infrastructure/security/ecore", null, org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Basiccredential = org.eclipse.cmf.occi.multicloud.accounts.AccountsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_security_s_ecore.getClassId("Basiccredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Certificatecredential = org.eclipse.cmf.occi.multicloud.accounts.AccountsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_security_s_ecore.getClassId("Certificatecredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.multicloud.accounts.AccountsTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cloudaccount = org.eclipse.cmf.occi.multicloud.accounts.AccountsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_security_s_ecore.getClassId("Cloudaccount", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cloudcredential = org.eclipse.cmf.occi.multicloud.accounts.AccountsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_security_s_ecore.getClassId("Cloudcredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.multicloud.accounts.AccountsTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Keypaircredential = org.eclipse.cmf.occi.multicloud.accounts.AccountsTables.PACKid_http_c_s_s_occiware_org_s_occi_s_infrastructure_s_security_s_ecore.getClassId("Keypaircredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Basiccredential_c_c_appliesConstraint = "Basiccredential::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Certificatecredential_c_c_appliesConstraint = "Certificatecredential::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Cloudcredential_c_c_appliesConstraint = "Cloudcredential::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Keypaircredential_c_c_appliesConstraint = "Keypaircredential::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			AccountsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Basiccredential = new EcoreExecutorType(AccountsPackage.Literals.BASICCREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Certificatecredential = new EcoreExecutorType(AccountsPackage.Literals.CERTIFICATECREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudaccount = new EcoreExecutorType(AccountsPackage.Literals.CLOUDACCOUNT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudaccountlink = new EcoreExecutorType(AccountsPackage.Literals.CLOUDACCOUNTLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudcredential = new EcoreExecutorType(AccountsPackage.Literals.CLOUDCREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Keypaircredential = new EcoreExecutorType(AccountsPackage.Literals.KEYPAIRCREDENTIAL, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Basiccredential,
			_Certificatecredential,
			_Cloudaccount,
			_Cloudaccountlink,
			_Cloudcredential,
			_Keypaircredential
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Basiccredential__Basiccredential = new ExecutorFragment(Types._Basiccredential, AccountsTables.Types._Basiccredential);
		private static final /*@NonNull*/ ExecutorFragment _Basiccredential__MixinBase = new ExecutorFragment(Types._Basiccredential, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Basiccredential__OclAny = new ExecutorFragment(Types._Basiccredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Basiccredential__OclElement = new ExecutorFragment(Types._Basiccredential, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Certificatecredential__Certificatecredential = new ExecutorFragment(Types._Certificatecredential, AccountsTables.Types._Certificatecredential);
		private static final /*@NonNull*/ ExecutorFragment _Certificatecredential__MixinBase = new ExecutorFragment(Types._Certificatecredential, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Certificatecredential__OclAny = new ExecutorFragment(Types._Certificatecredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Certificatecredential__OclElement = new ExecutorFragment(Types._Certificatecredential, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cloudaccount__Cloudaccount = new ExecutorFragment(Types._Cloudaccount, AccountsTables.Types._Cloudaccount);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccount__Entity = new ExecutorFragment(Types._Cloudaccount, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccount__OclAny = new ExecutorFragment(Types._Cloudaccount, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccount__OclElement = new ExecutorFragment(Types._Cloudaccount, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccount__Resource = new ExecutorFragment(Types._Cloudaccount, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Cloudaccountlink__Cloudaccountlink = new ExecutorFragment(Types._Cloudaccountlink, AccountsTables.Types._Cloudaccountlink);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccountlink__Entity = new ExecutorFragment(Types._Cloudaccountlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccountlink__Link = new ExecutorFragment(Types._Cloudaccountlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccountlink__OclAny = new ExecutorFragment(Types._Cloudaccountlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudaccountlink__OclElement = new ExecutorFragment(Types._Cloudaccountlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cloudcredential__Cloudcredential = new ExecutorFragment(Types._Cloudcredential, AccountsTables.Types._Cloudcredential);
		private static final /*@NonNull*/ ExecutorFragment _Cloudcredential__MixinBase = new ExecutorFragment(Types._Cloudcredential, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cloudcredential__OclAny = new ExecutorFragment(Types._Cloudcredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudcredential__OclElement = new ExecutorFragment(Types._Cloudcredential, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Keypaircredential__Keypaircredential = new ExecutorFragment(Types._Keypaircredential, AccountsTables.Types._Keypaircredential);
		private static final /*@NonNull*/ ExecutorFragment _Keypaircredential__MixinBase = new ExecutorFragment(Types._Keypaircredential, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Keypaircredential__OclAny = new ExecutorFragment(Types._Keypaircredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Keypaircredential__OclElement = new ExecutorFragment(Types._Keypaircredential, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of AccountsTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Basiccredential__updatepassword = new ExecutorOperation("updatepassword", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Basiccredential,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Certificatecredential__generate = new ExecutorOperation("generate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Certificatecredential,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Keypaircredential__generate = new ExecutorOperation("generate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Keypaircredential,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Basiccredential__password = new EcoreExecutorProperty(AccountsPackage.Literals.BASICCREDENTIAL__PASSWORD, Types._Basiccredential, 0);
		public static final /*@NonNull*/ ExecutorProperty _Basiccredential__url = new EcoreExecutorProperty(AccountsPackage.Literals.BASICCREDENTIAL__URL, Types._Basiccredential, 1);
		public static final /*@NonNull*/ ExecutorProperty _Basiccredential__username = new EcoreExecutorProperty(AccountsPackage.Literals.BASICCREDENTIAL__USERNAME, Types._Basiccredential, 2);

		public static final /*@NonNull*/ ExecutorProperty _Certificatecredential__privateCertifcateName = new EcoreExecutorProperty(AccountsPackage.Literals.CERTIFICATECREDENTIAL__PRIVATE_CERTIFCATE_NAME, Types._Certificatecredential, 0);
		public static final /*@NonNull*/ ExecutorProperty _Certificatecredential__publicCertificateContent = new EcoreExecutorProperty(AccountsPackage.Literals.CERTIFICATECREDENTIAL__PUBLIC_CERTIFICATE_CONTENT, Types._Certificatecredential, 1);

		public static final /*@NonNull*/ ExecutorProperty _Cloudcredential__accessKey = new EcoreExecutorProperty(AccountsPackage.Literals.CLOUDCREDENTIAL__ACCESS_KEY, Types._Cloudcredential, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cloudcredential__secretKey = new EcoreExecutorProperty(AccountsPackage.Literals.CLOUDCREDENTIAL__SECRET_KEY, Types._Cloudcredential, 1);
		public static final /*@NonNull*/ ExecutorProperty _Cloudcredential__url = new EcoreExecutorProperty(AccountsPackage.Literals.CLOUDCREDENTIAL__URL, Types._Cloudcredential, 2);

		public static final /*@NonNull*/ ExecutorProperty _Keypaircredential__privateKey = new EcoreExecutorProperty(AccountsPackage.Literals.KEYPAIRCREDENTIAL__PRIVATE_KEY, Types._Keypaircredential, 0);
		public static final /*@NonNull*/ ExecutorProperty _Keypaircredential__publicKey = new EcoreExecutorProperty(AccountsPackage.Literals.KEYPAIRCREDENTIAL__PUBLIC_KEY, Types._Keypaircredential, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Basiccredential =
		{
			Fragments._Basiccredential__OclAny /* 0 */,
			Fragments._Basiccredential__OclElement /* 1 */,
			Fragments._Basiccredential__MixinBase /* 2 */,
			Fragments._Basiccredential__Basiccredential /* 3 */
		};
		private static final int /*@NonNull*/ [] __Basiccredential = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Certificatecredential =
		{
			Fragments._Certificatecredential__OclAny /* 0 */,
			Fragments._Certificatecredential__OclElement /* 1 */,
			Fragments._Certificatecredential__MixinBase /* 2 */,
			Fragments._Certificatecredential__Certificatecredential /* 3 */
		};
		private static final int /*@NonNull*/ [] __Certificatecredential = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudaccount =
		{
			Fragments._Cloudaccount__OclAny /* 0 */,
			Fragments._Cloudaccount__OclElement /* 1 */,
			Fragments._Cloudaccount__Entity /* 2 */,
			Fragments._Cloudaccount__Resource /* 3 */,
			Fragments._Cloudaccount__Cloudaccount /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cloudaccount = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudaccountlink =
		{
			Fragments._Cloudaccountlink__OclAny /* 0 */,
			Fragments._Cloudaccountlink__OclElement /* 1 */,
			Fragments._Cloudaccountlink__Entity /* 2 */,
			Fragments._Cloudaccountlink__Link /* 3 */,
			Fragments._Cloudaccountlink__Cloudaccountlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cloudaccountlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudcredential =
		{
			Fragments._Cloudcredential__OclAny /* 0 */,
			Fragments._Cloudcredential__OclElement /* 1 */,
			Fragments._Cloudcredential__MixinBase /* 2 */,
			Fragments._Cloudcredential__Cloudcredential /* 3 */
		};
		private static final int /*@NonNull*/ [] __Cloudcredential = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Keypaircredential =
		{
			Fragments._Keypaircredential__OclAny /* 0 */,
			Fragments._Keypaircredential__OclElement /* 1 */,
			Fragments._Keypaircredential__MixinBase /* 2 */,
			Fragments._Keypaircredential__Keypaircredential /* 3 */
		};
		private static final int /*@NonNull*/ [] __Keypaircredential = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Basiccredential.initFragments(_Basiccredential, __Basiccredential);
			Types._Certificatecredential.initFragments(_Certificatecredential, __Certificatecredential);
			Types._Cloudaccount.initFragments(_Cloudaccount, __Cloudaccount);
			Types._Cloudaccountlink.initFragments(_Cloudaccountlink, __Cloudaccountlink);
			Types._Cloudcredential.initFragments(_Cloudcredential, __Cloudcredential);
			Types._Keypaircredential.initFragments(_Keypaircredential, __Keypaircredential);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basiccredential__Basiccredential = {
			AccountsTables.Operations._Basiccredential__updatepassword /* updatepassword() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basiccredential__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basiccredential__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basiccredential__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificatecredential__Certificatecredential = {
			AccountsTables.Operations._Certificatecredential__generate /* generate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificatecredential__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificatecredential__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificatecredential__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccount__Cloudaccount = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccount__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccount__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccount__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccount__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccountlink__Cloudaccountlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccountlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccountlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccountlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudaccountlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudcredential__Cloudcredential = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudcredential__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudcredential__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudcredential__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keypaircredential__Keypaircredential = {
			AccountsTables.Operations._Keypaircredential__generate /* generate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keypaircredential__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keypaircredential__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Keypaircredential__OclElement = {
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
			Fragments._Basiccredential__Basiccredential.initOperations(_Basiccredential__Basiccredential);
			Fragments._Basiccredential__MixinBase.initOperations(_Basiccredential__MixinBase);
			Fragments._Basiccredential__OclAny.initOperations(_Basiccredential__OclAny);
			Fragments._Basiccredential__OclElement.initOperations(_Basiccredential__OclElement);

			Fragments._Certificatecredential__Certificatecredential.initOperations(_Certificatecredential__Certificatecredential);
			Fragments._Certificatecredential__MixinBase.initOperations(_Certificatecredential__MixinBase);
			Fragments._Certificatecredential__OclAny.initOperations(_Certificatecredential__OclAny);
			Fragments._Certificatecredential__OclElement.initOperations(_Certificatecredential__OclElement);

			Fragments._Cloudaccount__Cloudaccount.initOperations(_Cloudaccount__Cloudaccount);
			Fragments._Cloudaccount__Entity.initOperations(_Cloudaccount__Entity);
			Fragments._Cloudaccount__OclAny.initOperations(_Cloudaccount__OclAny);
			Fragments._Cloudaccount__OclElement.initOperations(_Cloudaccount__OclElement);
			Fragments._Cloudaccount__Resource.initOperations(_Cloudaccount__Resource);

			Fragments._Cloudaccountlink__Cloudaccountlink.initOperations(_Cloudaccountlink__Cloudaccountlink);
			Fragments._Cloudaccountlink__Entity.initOperations(_Cloudaccountlink__Entity);
			Fragments._Cloudaccountlink__Link.initOperations(_Cloudaccountlink__Link);
			Fragments._Cloudaccountlink__OclAny.initOperations(_Cloudaccountlink__OclAny);
			Fragments._Cloudaccountlink__OclElement.initOperations(_Cloudaccountlink__OclElement);

			Fragments._Cloudcredential__Cloudcredential.initOperations(_Cloudcredential__Cloudcredential);
			Fragments._Cloudcredential__MixinBase.initOperations(_Cloudcredential__MixinBase);
			Fragments._Cloudcredential__OclAny.initOperations(_Cloudcredential__OclAny);
			Fragments._Cloudcredential__OclElement.initOperations(_Cloudcredential__OclElement);

			Fragments._Keypaircredential__Keypaircredential.initOperations(_Keypaircredential__Keypaircredential);
			Fragments._Keypaircredential__MixinBase.initOperations(_Keypaircredential__MixinBase);
			Fragments._Keypaircredential__OclAny.initOperations(_Keypaircredential__OclAny);
			Fragments._Keypaircredential__OclElement.initOperations(_Keypaircredential__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Basiccredential = {
			AccountsTables.Properties._Basiccredential__password,
			AccountsTables.Properties._Basiccredential__url,
			AccountsTables.Properties._Basiccredential__username
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Certificatecredential = {
			AccountsTables.Properties._Certificatecredential__privateCertifcateName,
			AccountsTables.Properties._Certificatecredential__publicCertificateContent
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudaccount = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudaccountlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudcredential = {
			AccountsTables.Properties._Cloudcredential__accessKey,
			AccountsTables.Properties._Cloudcredential__secretKey,
			AccountsTables.Properties._Cloudcredential__url
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Keypaircredential = {
			AccountsTables.Properties._Keypaircredential__privateKey,
			AccountsTables.Properties._Keypaircredential__publicKey
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Basiccredential__Basiccredential.initProperties(_Basiccredential);
			Fragments._Certificatecredential__Certificatecredential.initProperties(_Certificatecredential);
			Fragments._Cloudaccount__Cloudaccount.initProperties(_Cloudaccount);
			Fragments._Cloudaccountlink__Cloudaccountlink.initProperties(_Cloudaccountlink);
			Fragments._Cloudcredential__Cloudcredential.initProperties(_Cloudcredential);
			Fragments._Keypaircredential__Keypaircredential.initProperties(_Keypaircredential);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AccountsTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of AccountsTables::EnumerationLiterals and all preceding sub-packages.
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
