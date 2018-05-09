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
package org.eclipse.cmf.occi.multicloud.interoperability;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/OCL/Import occi='http://schemas.ogf.org/occi/core/ecore' infrastructure='http://schemas.ogf.org/occi/infrastructure/ecore'"
 * @generated
 */
public interface InteroperabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interoperability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/multicloud/specialfeatures/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interoperability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteroperabilityPackage eINSTANCE = org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl <em>Filetransferoperations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getFiletransferoperations()
	 * @generated
	 */
	int FILETRANSFEROPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Path Location Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path Location Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Progress Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__PROGRESS_PERCENT = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transfer Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS__TRANSFER_MODE = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Filetransferoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___COPY = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___CANCEL = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Encryptandcopy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS___ENCRYPTANDCOPY = OCCIPackage.LINK_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filetransferoperations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILETRANSFEROPERATIONS_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl <em>Httptransfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getHttptransfer()
	 * @generated
	 */
	int HTTPTRANSFER = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__USERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__PASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__SOURCE_URL = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__TARGET_URL = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Http Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__HTTP_MODE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Http Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER__HTTP_PORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Httptransfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Httptransfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPTRANSFER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl <em>Sshtransfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getSshtransfer()
	 * @generated
	 */
	int SSHTRANSFER = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Srcusername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__SRCUSERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Srcpassword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__SRCPASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Srcprivate Key Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__SRCPRIVATE_KEY_PATH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targetusername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__TARGETUSERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Targetpassword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__TARGETPASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Targetprivatekeypath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__TARGETPRIVATEKEYPATH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sshport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER__SSHPORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sshtransfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Sshtransfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHTRANSFER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.TransferType <em>Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.TransferType
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getTransferType()
	 * @generated
	 */
	int TRANSFER_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.HttpMode <em>Http Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.HttpMode
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getHttpMode()
	 * @generated
	 */
	int HTTP_MODE = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations <em>Filetransferoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filetransferoperations</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations
	 * @generated
	 */
	EClass getFiletransferoperations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationSource <em>Path Location Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Location Source</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationSource()
	 * @see #getFiletransferoperations()
	 * @generated
	 */
	EAttribute getFiletransferoperations_PathLocationSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationTarget <em>Path Location Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Location Target</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationTarget()
	 * @see #getFiletransferoperations()
	 * @generated
	 */
	EAttribute getFiletransferoperations_PathLocationTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getProgressPercent <em>Progress Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Percent</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getProgressPercent()
	 * @see #getFiletransferoperations()
	 * @generated
	 */
	EAttribute getFiletransferoperations_ProgressPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getTransferMode <em>Transfer Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer Mode</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getTransferMode()
	 * @see #getFiletransferoperations()
	 * @generated
	 */
	EAttribute getFiletransferoperations_TransferMode();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#copy() <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#copy()
	 * @generated
	 */
	EOperation getFiletransferoperations__Copy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#cancel()
	 * @generated
	 */
	EOperation getFiletransferoperations__Cancel();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#encryptandcopy() <em>Encryptandcopy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encryptandcopy</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#encryptandcopy()
	 * @generated
	 */
	EOperation getFiletransferoperations__Encryptandcopy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer <em>Httptransfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Httptransfer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer
	 * @generated
	 */
	EClass getHttptransfer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getUsername()
	 * @see #getHttptransfer()
	 * @generated
	 */
	EAttribute getHttptransfer_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getPassword()
	 * @see #getHttptransfer()
	 * @generated
	 */
	EAttribute getHttptransfer_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getSourceUrl <em>Source Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Url</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getSourceUrl()
	 * @see #getHttptransfer()
	 * @generated
	 */
	EAttribute getHttptransfer_SourceUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getTargetUrl <em>Target Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Url</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getTargetUrl()
	 * @see #getHttptransfer()
	 * @generated
	 */
	EAttribute getHttptransfer_TargetUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpMode <em>Http Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Mode</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpMode()
	 * @see #getHttptransfer()
	 * @generated
	 */
	EAttribute getHttptransfer_HttpMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpPort <em>Http Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Port</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Httptransfer#getHttpPort()
	 * @see #getHttptransfer()
	 * @generated
	 */
	EAttribute getHttptransfer_HttpPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer <em>Sshtransfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sshtransfer</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer
	 * @generated
	 */
	EClass getSshtransfer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcusername <em>Srcusername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcusername</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcusername()
	 * @see #getSshtransfer()
	 * @generated
	 */
	EAttribute getSshtransfer_Srcusername();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcpassword <em>Srcpassword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcpassword</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcpassword()
	 * @see #getSshtransfer()
	 * @generated
	 */
	EAttribute getSshtransfer_Srcpassword();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcprivateKeyPath <em>Srcprivate Key Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcprivate Key Path</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcprivateKeyPath()
	 * @see #getSshtransfer()
	 * @generated
	 */
	EAttribute getSshtransfer_SrcprivateKeyPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetusername <em>Targetusername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetusername</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetusername()
	 * @see #getSshtransfer()
	 * @generated
	 */
	EAttribute getSshtransfer_Targetusername();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetpassword <em>Targetpassword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetpassword</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetpassword()
	 * @see #getSshtransfer()
	 * @generated
	 */
	EAttribute getSshtransfer_Targetpassword();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetprivatekeypath <em>Targetprivatekeypath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetprivatekeypath</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetprivatekeypath()
	 * @see #getSshtransfer()
	 * @generated
	 */
	EAttribute getSshtransfer_Targetprivatekeypath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshport <em>Sshport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sshport</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshport()
	 * @see #getSshtransfer()
	 * @generated
	 */
	EAttribute getSshtransfer_Sshport();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.interoperability.TransferType <em>Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.TransferType
	 * @generated
	 */
	EEnum getTransferType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.interoperability.HttpMode <em>Http Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Mode</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.HttpMode
	 * @generated
	 */
	EEnum getHttpMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteroperabilityFactory getInteroperabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl <em>Filetransferoperations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getFiletransferoperations()
		 * @generated
		 */
		EClass FILETRANSFEROPERATIONS = eINSTANCE.getFiletransferoperations();

		/**
		 * The meta object literal for the '<em><b>Path Location Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE = eINSTANCE.getFiletransferoperations_PathLocationSource();

		/**
		 * The meta object literal for the '<em><b>Path Location Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET = eINSTANCE.getFiletransferoperations_PathLocationTarget();

		/**
		 * The meta object literal for the '<em><b>Progress Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILETRANSFEROPERATIONS__PROGRESS_PERCENT = eINSTANCE.getFiletransferoperations_ProgressPercent();

		/**
		 * The meta object literal for the '<em><b>Transfer Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILETRANSFEROPERATIONS__TRANSFER_MODE = eINSTANCE.getFiletransferoperations_TransferMode();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILETRANSFEROPERATIONS___COPY = eINSTANCE.getFiletransferoperations__Copy();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILETRANSFEROPERATIONS___CANCEL = eINSTANCE.getFiletransferoperations__Cancel();

		/**
		 * The meta object literal for the '<em><b>Encryptandcopy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILETRANSFEROPERATIONS___ENCRYPTANDCOPY = eINSTANCE.getFiletransferoperations__Encryptandcopy();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl <em>Httptransfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.HttptransferImpl
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getHttptransfer()
		 * @generated
		 */
		EClass HTTPTRANSFER = eINSTANCE.getHttptransfer();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTPTRANSFER__USERNAME = eINSTANCE.getHttptransfer_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTPTRANSFER__PASSWORD = eINSTANCE.getHttptransfer_Password();

		/**
		 * The meta object literal for the '<em><b>Source Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTPTRANSFER__SOURCE_URL = eINSTANCE.getHttptransfer_SourceUrl();

		/**
		 * The meta object literal for the '<em><b>Target Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTPTRANSFER__TARGET_URL = eINSTANCE.getHttptransfer_TargetUrl();

		/**
		 * The meta object literal for the '<em><b>Http Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTPTRANSFER__HTTP_MODE = eINSTANCE.getHttptransfer_HttpMode();

		/**
		 * The meta object literal for the '<em><b>Http Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTPTRANSFER__HTTP_PORT = eINSTANCE.getHttptransfer_HttpPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl <em>Sshtransfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getSshtransfer()
		 * @generated
		 */
		EClass SSHTRANSFER = eINSTANCE.getSshtransfer();

		/**
		 * The meta object literal for the '<em><b>Srcusername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSHTRANSFER__SRCUSERNAME = eINSTANCE.getSshtransfer_Srcusername();

		/**
		 * The meta object literal for the '<em><b>Srcpassword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSHTRANSFER__SRCPASSWORD = eINSTANCE.getSshtransfer_Srcpassword();

		/**
		 * The meta object literal for the '<em><b>Srcprivate Key Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSHTRANSFER__SRCPRIVATE_KEY_PATH = eINSTANCE.getSshtransfer_SrcprivateKeyPath();

		/**
		 * The meta object literal for the '<em><b>Targetusername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSHTRANSFER__TARGETUSERNAME = eINSTANCE.getSshtransfer_Targetusername();

		/**
		 * The meta object literal for the '<em><b>Targetpassword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSHTRANSFER__TARGETPASSWORD = eINSTANCE.getSshtransfer_Targetpassword();

		/**
		 * The meta object literal for the '<em><b>Targetprivatekeypath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSHTRANSFER__TARGETPRIVATEKEYPATH = eINSTANCE.getSshtransfer_Targetprivatekeypath();

		/**
		 * The meta object literal for the '<em><b>Sshport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSHTRANSFER__SSHPORT = eINSTANCE.getSshtransfer_Sshport();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.TransferType <em>Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.TransferType
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getTransferType()
		 * @generated
		 */
		EEnum TRANSFER_TYPE = eINSTANCE.getTransferType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.interoperability.HttpMode <em>Http Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.HttpMode
		 * @see org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityPackageImpl#getHttpMode()
		 * @generated
		 */
		EEnum HTTP_MODE = eINSTANCE.getHttpMode();

	}

} //InteroperabilityPackage
