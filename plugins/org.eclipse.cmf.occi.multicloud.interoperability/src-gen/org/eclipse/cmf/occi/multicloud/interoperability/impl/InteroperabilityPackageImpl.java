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
package org.eclipse.cmf.occi.multicloud.interoperability.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations;
import org.eclipse.cmf.occi.multicloud.interoperability.HttpMode;
import org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer;
import org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityFactory;
import org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage;
import org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer;
import org.eclipse.cmf.occi.multicloud.interoperability.TransferType;

import org.eclipse.cmf.occi.multicloud.interoperability.util.InteroperabilityValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class InteroperabilityPackageImpl extends EPackageImpl implements InteroperabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filetransferoperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httptransferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sshtransferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpModeEEnum = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteroperabilityPackageImpl() {
		super(eNS_URI, InteroperabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InteroperabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteroperabilityPackage init() {
		if (isInited) return (InteroperabilityPackage)EPackage.Registry.INSTANCE.getEPackage(InteroperabilityPackage.eNS_URI);

		// Obtain or create and register package
		InteroperabilityPackageImpl theInteroperabilityPackage = (InteroperabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InteroperabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InteroperabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInteroperabilityPackage.createPackageContents();

		// Initialize created meta-data
		theInteroperabilityPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theInteroperabilityPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return InteroperabilityValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theInteroperabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteroperabilityPackage.eNS_URI, theInteroperabilityPackage);
		return theInteroperabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiletransferoperations() {
		return filetransferoperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiletransferoperations_PathLocationSource() {
		return (EAttribute)filetransferoperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiletransferoperations_PathLocationTarget() {
		return (EAttribute)filetransferoperationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiletransferoperations_ProgressPercent() {
		return (EAttribute)filetransferoperationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiletransferoperations_TransferMode() {
		return (EAttribute)filetransferoperationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFiletransferoperations__Copy() {
		return filetransferoperationsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFiletransferoperations__Cancel() {
		return filetransferoperationsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFiletransferoperations__Encryptandcopy() {
		return filetransferoperationsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttptransfer() {
		return httptransferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttptransfer_Username() {
		return (EAttribute)httptransferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttptransfer_Password() {
		return (EAttribute)httptransferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttptransfer_SourceUrl() {
		return (EAttribute)httptransferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttptransfer_TargetUrl() {
		return (EAttribute)httptransferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttptransfer_HttpMode() {
		return (EAttribute)httptransferEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttptransfer_HttpPort() {
		return (EAttribute)httptransferEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSshtransfer() {
		return sshtransferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshtransfer_Srcusername() {
		return (EAttribute)sshtransferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshtransfer_Srcpassword() {
		return (EAttribute)sshtransferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshtransfer_SrcprivateKeyPath() {
		return (EAttribute)sshtransferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshtransfer_Targetusername() {
		return (EAttribute)sshtransferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshtransfer_Targetpassword() {
		return (EAttribute)sshtransferEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshtransfer_Targetprivatekeypath() {
		return (EAttribute)sshtransferEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshtransfer_Sshport() {
		return (EAttribute)sshtransferEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferType() {
		return transferTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpMode() {
		return httpModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityFactory getInteroperabilityFactory() {
		return (InteroperabilityFactory)getEFactoryInstance();
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
		filetransferoperationsEClass = createEClass(FILETRANSFEROPERATIONS);
		createEAttribute(filetransferoperationsEClass, FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE);
		createEAttribute(filetransferoperationsEClass, FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET);
		createEAttribute(filetransferoperationsEClass, FILETRANSFEROPERATIONS__PROGRESS_PERCENT);
		createEAttribute(filetransferoperationsEClass, FILETRANSFEROPERATIONS__TRANSFER_MODE);
		createEOperation(filetransferoperationsEClass, FILETRANSFEROPERATIONS___COPY);
		createEOperation(filetransferoperationsEClass, FILETRANSFEROPERATIONS___CANCEL);
		createEOperation(filetransferoperationsEClass, FILETRANSFEROPERATIONS___ENCRYPTANDCOPY);

		httptransferEClass = createEClass(HTTPTRANSFER);
		createEAttribute(httptransferEClass, HTTPTRANSFER__USERNAME);
		createEAttribute(httptransferEClass, HTTPTRANSFER__PASSWORD);
		createEAttribute(httptransferEClass, HTTPTRANSFER__SOURCE_URL);
		createEAttribute(httptransferEClass, HTTPTRANSFER__TARGET_URL);
		createEAttribute(httptransferEClass, HTTPTRANSFER__HTTP_MODE);
		createEAttribute(httptransferEClass, HTTPTRANSFER__HTTP_PORT);

		sshtransferEClass = createEClass(SSHTRANSFER);
		createEAttribute(sshtransferEClass, SSHTRANSFER__SRCUSERNAME);
		createEAttribute(sshtransferEClass, SSHTRANSFER__SRCPASSWORD);
		createEAttribute(sshtransferEClass, SSHTRANSFER__SRCPRIVATE_KEY_PATH);
		createEAttribute(sshtransferEClass, SSHTRANSFER__TARGETUSERNAME);
		createEAttribute(sshtransferEClass, SSHTRANSFER__TARGETPASSWORD);
		createEAttribute(sshtransferEClass, SSHTRANSFER__TARGETPRIVATEKEYPATH);
		createEAttribute(sshtransferEClass, SSHTRANSFER__SSHPORT);

		// Create enums
		transferTypeEEnum = createEEnum(TRANSFER_TYPE);
		httpModeEEnum = createEEnum(HTTP_MODE);
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
		filetransferoperationsEClass.getESuperTypes().add(theOCCIPackage.getLink());
		httptransferEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sshtransferEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(filetransferoperationsEClass, Filetransferoperations.class, "Filetransferoperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiletransferoperations_PathLocationSource(), theOCCIPackage.getString(), "pathLocationSource", null, 0, 1, Filetransferoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiletransferoperations_PathLocationTarget(), theOCCIPackage.getString(), "pathLocationTarget", null, 0, 1, Filetransferoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiletransferoperations_ProgressPercent(), theOCCIPackage.getInteger(), "progressPercent", null, 0, 1, Filetransferoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiletransferoperations_TransferMode(), this.getTransferType(), "transferMode", "scp", 0, 1, Filetransferoperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFiletransferoperations__Copy(), null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFiletransferoperations__Cancel(), null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFiletransferoperations__Encryptandcopy(), null, "encryptandcopy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(httptransferEClass, Httptransfer.class, "Httptransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttptransfer_Username(), theOCCIPackage.getString(), "username", null, 0, 1, Httptransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttptransfer_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Httptransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttptransfer_SourceUrl(), theOCCIPackage.getString(), "sourceUrl", null, 0, 1, Httptransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttptransfer_TargetUrl(), theOCCIPackage.getString(), "targetUrl", null, 0, 1, Httptransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttptransfer_HttpMode(), this.getHttpMode(), "httpMode", "https", 0, 1, Httptransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttptransfer_HttpPort(), theOCCIPackage.getInteger(), "httpPort", "443", 0, 1, Httptransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sshtransferEClass, Sshtransfer.class, "Sshtransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSshtransfer_Srcusername(), theOCCIPackage.getString(), "srcusername", null, 0, 1, Sshtransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSshtransfer_Srcpassword(), theOCCIPackage.getString(), "srcpassword", null, 0, 1, Sshtransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSshtransfer_SrcprivateKeyPath(), theOCCIPackage.getString(), "srcprivateKeyPath", null, 0, 1, Sshtransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSshtransfer_Targetusername(), theOCCIPackage.getString(), "targetusername", null, 0, 1, Sshtransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSshtransfer_Targetpassword(), theOCCIPackage.getString(), "targetpassword", null, 0, 1, Sshtransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSshtransfer_Targetprivatekeypath(), theOCCIPackage.getString(), "targetprivatekeypath", null, 0, 1, Sshtransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSshtransfer_Sshport(), theOCCIPackage.getInteger(), "sshport", "22", 0, 1, Sshtransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transferTypeEEnum, TransferType.class, "TransferType");
		addEEnumLiteral(transferTypeEEnum, TransferType.SCP);
		addEEnumLiteral(transferTypeEEnum, TransferType.FTP);
		addEEnumLiteral(transferTypeEEnum, TransferType.HTTP);
		addEEnumLiteral(transferTypeEEnum, TransferType.SFTP);

		initEEnum(httpModeEEnum, HttpMode.class, "HttpMode");
		addEEnumLiteral(httpModeEEnum, HttpMode.HTTP);
		addEEnumLiteral(httpModeEEnum, HttpMode.HTTPS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (filetransferoperationsEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (httptransferEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (sshtransferEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "occi", "http://schemas.ogf.org/occi/core/ecore",
			 "infrastructure", "http://schemas.ogf.org/occi/infrastructure/ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (filetransferoperationsEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(infrastructure::Compute)",
			 "targetConstraint", "self.target.oclIsKindOf(infrastructure::Compute)"
		   });	
		addAnnotation
		  (httptransferEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(interoperability::Filetransferoperations)"
		   });	
		addAnnotation
		  (sshtransferEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(interoperability::Filetransferoperations)"
		   });
	}

} //InteroperabilityPackageImpl
