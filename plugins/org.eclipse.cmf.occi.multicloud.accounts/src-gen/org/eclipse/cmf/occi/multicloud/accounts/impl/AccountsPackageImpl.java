/**
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
 */
package org.eclipse.cmf.occi.multicloud.accounts.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsFactory;
import org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage;
import org.eclipse.cmf.occi.multicloud.accounts.Basiccredential;
import org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccountlink;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential;
import org.eclipse.cmf.occi.multicloud.accounts.Keypaircredential;

import org.eclipse.cmf.occi.multicloud.accounts.util.AccountsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountsPackageImpl extends EPackageImpl implements AccountsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudaccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudaccountlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basiccredentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificatecredentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keypaircredentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudcredentialEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccountsPackageImpl() {
		super(eNS_URI, AccountsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AccountsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccountsPackage init() {
		if (isInited) return (AccountsPackage)EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI);

		// Obtain or create and register package
		AccountsPackageImpl theAccountsPackage = (AccountsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AccountsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AccountsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAccountsPackage.createPackageContents();

		// Initialize created meta-data
		theAccountsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAccountsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AccountsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAccountsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccountsPackage.eNS_URI, theAccountsPackage);
		return theAccountsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudaccount() {
		return cloudaccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudaccountlink() {
		return cloudaccountlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasiccredential() {
		return basiccredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasiccredential_Username() {
		return (EAttribute)basiccredentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasiccredential_Password() {
		return (EAttribute)basiccredentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasiccredential_Url() {
		return (EAttribute)basiccredentialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasiccredential__Updatepassword() {
		return basiccredentialEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasiccredential__AppliesConstraint__DiagnosticChain_Map() {
		return basiccredentialEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificatecredential() {
		return certificatecredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificatecredential_PublicCertificateContent() {
		return (EAttribute)certificatecredentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificatecredential_PrivateCertifcateName() {
		return (EAttribute)certificatecredentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCertificatecredential__Generate() {
		return certificatecredentialEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCertificatecredential__AppliesConstraint__DiagnosticChain_Map() {
		return certificatecredentialEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeypaircredential() {
		return keypaircredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypaircredential_PrivateKey() {
		return (EAttribute)keypaircredentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypaircredential_PublicKey() {
		return (EAttribute)keypaircredentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeypaircredential__Generate() {
		return keypaircredentialEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeypaircredential__AppliesConstraint__DiagnosticChain_Map() {
		return keypaircredentialEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudcredential() {
		return cloudcredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudcredential_AccessKey() {
		return (EAttribute)cloudcredentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudcredential_SecretKey() {
		return (EAttribute)cloudcredentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudcredential_Url() {
		return (EAttribute)cloudcredentialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudcredential__AppliesConstraint__DiagnosticChain_Map() {
		return cloudcredentialEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsFactory getAccountsFactory() {
		return (AccountsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudaccountEClass = createEClass(CLOUDACCOUNT);

		cloudaccountlinkEClass = createEClass(CLOUDACCOUNTLINK);

		basiccredentialEClass = createEClass(BASICCREDENTIAL);
		createEAttribute(basiccredentialEClass, BASICCREDENTIAL__USERNAME);
		createEAttribute(basiccredentialEClass, BASICCREDENTIAL__PASSWORD);
		createEAttribute(basiccredentialEClass, BASICCREDENTIAL__URL);
		createEOperation(basiccredentialEClass, BASICCREDENTIAL___UPDATEPASSWORD);
		createEOperation(basiccredentialEClass, BASICCREDENTIAL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		certificatecredentialEClass = createEClass(CERTIFICATECREDENTIAL);
		createEAttribute(certificatecredentialEClass, CERTIFICATECREDENTIAL__PUBLIC_CERTIFICATE_CONTENT);
		createEAttribute(certificatecredentialEClass, CERTIFICATECREDENTIAL__PRIVATE_CERTIFCATE_NAME);
		createEOperation(certificatecredentialEClass, CERTIFICATECREDENTIAL___GENERATE);
		createEOperation(certificatecredentialEClass, CERTIFICATECREDENTIAL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		keypaircredentialEClass = createEClass(KEYPAIRCREDENTIAL);
		createEAttribute(keypaircredentialEClass, KEYPAIRCREDENTIAL__PRIVATE_KEY);
		createEAttribute(keypaircredentialEClass, KEYPAIRCREDENTIAL__PUBLIC_KEY);
		createEOperation(keypaircredentialEClass, KEYPAIRCREDENTIAL___GENERATE);
		createEOperation(keypaircredentialEClass, KEYPAIRCREDENTIAL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		cloudcredentialEClass = createEClass(CLOUDCREDENTIAL);
		createEAttribute(cloudcredentialEClass, CLOUDCREDENTIAL__ACCESS_KEY);
		createEAttribute(cloudcredentialEClass, CLOUDCREDENTIAL__SECRET_KEY);
		createEAttribute(cloudcredentialEClass, CLOUDCREDENTIAL__URL);
		createEOperation(cloudcredentialEClass, CLOUDCREDENTIAL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cloudaccountEClass.getESuperTypes().add(theOCCIPackage.getResource());
		cloudaccountlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		basiccredentialEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		certificatecredentialEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		keypaircredentialEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cloudcredentialEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudaccountEClass, Cloudaccount.class, "Cloudaccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudaccountlinkEClass, Cloudaccountlink.class, "Cloudaccountlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basiccredentialEClass, Basiccredential.class, "Basiccredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasiccredential_Username(), theOCCIPackage.getString(), "username", null, 0, 1, Basiccredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasiccredential_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Basiccredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasiccredential_Url(), theOCCIPackage.getString(), "url", null, 0, 1, Basiccredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBasiccredential__Updatepassword(), null, "updatepassword", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getBasiccredential__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(certificatecredentialEClass, Certificatecredential.class, "Certificatecredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificatecredential_PublicCertificateContent(), theOCCIPackage.getString(), "publicCertificateContent", null, 0, 1, Certificatecredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificatecredential_PrivateCertifcateName(), theOCCIPackage.getString(), "privateCertifcateName", null, 0, 1, Certificatecredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCertificatecredential__Generate(), null, "generate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCertificatecredential__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(keypaircredentialEClass, Keypaircredential.class, "Keypaircredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeypaircredential_PrivateKey(), theOCCIPackage.getString(), "privateKey", null, 0, 1, Keypaircredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypaircredential_PublicKey(), theOCCIPackage.getString(), "publicKey", null, 0, 1, Keypaircredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getKeypaircredential__Generate(), null, "generate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getKeypaircredential__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cloudcredentialEClass, Cloudcredential.class, "Cloudcredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudcredential_AccessKey(), theOCCIPackage.getString(), "accessKey", null, 0, 1, Cloudcredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudcredential_SecretKey(), theOCCIPackage.getString(), "secretKey", null, 0, 1, Cloudcredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudcredential_Url(), theOCCIPackage.getString(), "url", null, 0, 1, Cloudcredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCloudcredential__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (basiccredentialEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (certificatecredentialEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (keypaircredentialEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (cloudcredentialEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

} //AccountsPackageImpl
