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
package org.eclipse.cmf.occi.multicloud.elasticocci;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ElasticocciPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elasticocci";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/multicloud/elasticocci/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elasticocci";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElasticocciPackage eINSTANCE = org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticcontrollerImpl <em>Elasticcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticcontrollerImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getElasticcontroller()
	 * @generated
	 */
	int ELASTICCONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The number of structural features of the '<em>Elasticcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Elasticcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICCONTROLLER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticlinkImpl <em>Elasticlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticlinkImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getElasticlink()
	 * @generated
	 */
	int ELASTICLINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Elasticlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elasticlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELASTICLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategyImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl <em>Strategycompute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategycompute()
	 * @generated
	 */
	int STRATEGYCOMPUTE = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Strategy Compute Uthreshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy Compute Breath Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strategy Compute Breath Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategy Compute Poll Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strategy Compute Lthreshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Strategycompute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Must Be Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE___MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strategycompute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCOMPUTE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl <em>Strategycpu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategycpu()
	 * @generated
	 */
	int STRATEGYCPU = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Strategy Compute Uthreshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_COMPUTE_UTHRESHOLD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy Compute Breath Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_COMPUTE_BREATH_DOWN = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strategy Compute Breath Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_COMPUTE_BREATH_UP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategy Compute Poll Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_COMPUTE_POLL_TIME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strategy Compute Lthreshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_COMPUTE_LTHRESHOLD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strategy CPU Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strategy CPU Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Strategy CPU Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_MODE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Strategy CPU Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_DIRECTION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Strategy CPU Step CPU Decrease</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Strategy CPU Step CPU Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Strategy CPU Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Strategy CPU Increase Relational Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Strategy CPU Decrease Relational Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Strategycpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Must Be Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU___MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU___START = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Strategycpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYCPU_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl <em>Strategymemory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategymemory()
	 * @generated
	 */
	int STRATEGYMEMORY = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Strategy Compute Uthreshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_COMPUTE_UTHRESHOLD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy Compute Breath Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_DOWN = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strategy Compute Breath Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_COMPUTE_BREATH_UP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategy Compute Poll Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_COMPUTE_POLL_TIME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strategy Compute Lthreshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_COMPUTE_LTHRESHOLD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strategy Memory Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_MODE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strategy Memory Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Strategy Memory Step Mem Decrease</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Strategy Memory Step Mem Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Strategy Memory Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Strategy Memory Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Strategy Memory Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_DATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Strategy Memory Increase Relational Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Strategy Memory Decrease Relational Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Strategymemory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Must Be Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY___MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY___START = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Strategymemory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGYMEMORY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.ModeType <em>Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getModeType()
	 * @generated
	 */
	int MODE_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType <em>Relational Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getRelationalType()
	 * @generated
	 */
	int RELATIONAL_TYPE = 8;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 9;

	/**
	 * The meta object id for the '<em>Date Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Elasticcontroller <em>Elasticcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elasticcontroller</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Elasticcontroller
	 * @generated
	 */
	EClass getElasticcontroller();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Elasticlink <em>Elasticlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elasticlink</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Elasticlink
	 * @generated
	 */
	EClass getElasticlink();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Elasticlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Elasticlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElasticlink__TargetConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStrategy__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute <em>Strategycompute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategycompute</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute
	 * @generated
	 */
	EClass getStrategycompute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeUthreshold <em>Strategy Compute Uthreshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Compute Uthreshold</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeUthreshold()
	 * @see #getStrategycompute()
	 * @generated
	 */
	EAttribute getStrategycompute_StrategyComputeUthreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathDown <em>Strategy Compute Breath Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Compute Breath Down</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathDown()
	 * @see #getStrategycompute()
	 * @generated
	 */
	EAttribute getStrategycompute_StrategyComputeBreathDown();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathUp <em>Strategy Compute Breath Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Compute Breath Up</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathUp()
	 * @see #getStrategycompute()
	 * @generated
	 */
	EAttribute getStrategycompute_StrategyComputeBreathUp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputePollTime <em>Strategy Compute Poll Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Compute Poll Time</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputePollTime()
	 * @see #getStrategycompute()
	 * @generated
	 */
	EAttribute getStrategycompute_StrategyComputePollTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeLthreshold <em>Strategy Compute Lthreshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Compute Lthreshold</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeLthreshold()
	 * @see #getStrategycompute()
	 * @generated
	 */
	EAttribute getStrategycompute_StrategyComputeLthreshold();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#MustBeCompute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Be Compute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Compute</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#MustBeCompute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStrategycompute__MustBeCompute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu <em>Strategycpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategycpu</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu
	 * @generated
	 */
	EClass getStrategycpu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUUpperLimit <em>Strategy CPU Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Upper Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUUpperLimit()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUUpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPULowerLimit <em>Strategy CPU Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Lower Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPULowerLimit()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPULowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUMode <em>Strategy CPU Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Mode</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUMode()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDirection <em>Strategy CPU Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Direction</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDirection()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUDecrease <em>Strategy CPU Step CPU Decrease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Step CPU Decrease</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUDecrease()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUStepCPUDecrease();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUIncrease <em>Strategy CPU Step CPU Increase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Step CPU Increase</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUIncrease()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUStepCPUIncrease();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDate <em>Strategy CPU Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDate()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUIncreaseRelationalOp <em>Strategy CPU Increase Relational Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Increase Relational Op</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUIncreaseRelationalOp()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUIncreaseRelationalOp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDecreaseRelationalOp <em>Strategy CPU Decrease Relational Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy CPU Decrease Relational Op</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDecreaseRelationalOp()
	 * @see #getStrategycpu()
	 * @generated
	 */
	EAttribute getStrategycpu_StrategyCPUDecreaseRelationalOp();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#start()
	 * @generated
	 */
	EOperation getStrategycpu__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#stop()
	 * @generated
	 */
	EOperation getStrategycpu__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStrategycpu__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory <em>Strategymemory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategymemory</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory
	 * @generated
	 */
	EClass getStrategymemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryMode <em>Strategy Memory Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Mode</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryMode()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDirection <em>Strategy Memory Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Direction</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDirection()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemDecrease <em>Strategy Memory Step Mem Decrease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Step Mem Decrease</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemDecrease()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryStepMemDecrease();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemIncrease <em>Strategy Memory Step Mem Increase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Step Mem Increase</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemIncrease()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryStepMemIncrease();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryUpperLimit <em>Strategy Memory Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Upper Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryUpperLimit()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryUpperLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryLowerLimit <em>Strategy Memory Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Lower Limit</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryLowerLimit()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryLowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDate <em>Strategy Memory Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Date</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDate()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryIncreaseRelationalOp <em>Strategy Memory Increase Relational Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Increase Relational Op</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryIncreaseRelationalOp()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryIncreaseRelationalOp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDecreaseRelationalOp <em>Strategy Memory Decrease Relational Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Memory Decrease Relational Op</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDecreaseRelationalOp()
	 * @see #getStrategymemory()
	 * @generated
	 */
	EAttribute getStrategymemory_StrategyMemoryDecreaseRelationalOp();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#stop()
	 * @generated
	 */
	EOperation getStrategymemory__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#start()
	 * @generated
	 */
	EOperation getStrategymemory__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStrategymemory__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.elasticocci.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @generated
	 */
	EEnum getModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType <em>Relational Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Type</em>'.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @generated
	 */
	EEnum getRelationalType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDateType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElasticocciFactory getElasticocciFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticcontrollerImpl <em>Elasticcontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticcontrollerImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getElasticcontroller()
		 * @generated
		 */
		EClass ELASTICCONTROLLER = eINSTANCE.getElasticcontroller();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticlinkImpl <em>Elasticlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticlinkImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getElasticlink()
		 * @generated
		 */
		EClass ELASTICLINK = eINSTANCE.getElasticlink();

		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELASTICLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getElasticlink__TargetConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategyImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStrategy__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl <em>Strategycompute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycomputeImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategycompute()
		 * @generated
		 */
		EClass STRATEGYCOMPUTE = eINSTANCE.getStrategycompute();

		/**
		 * The meta object literal for the '<em><b>Strategy Compute Uthreshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCOMPUTE__STRATEGY_COMPUTE_UTHRESHOLD = eINSTANCE.getStrategycompute_StrategyComputeUthreshold();

		/**
		 * The meta object literal for the '<em><b>Strategy Compute Breath Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_DOWN = eINSTANCE.getStrategycompute_StrategyComputeBreathDown();

		/**
		 * The meta object literal for the '<em><b>Strategy Compute Breath Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCOMPUTE__STRATEGY_COMPUTE_BREATH_UP = eINSTANCE.getStrategycompute_StrategyComputeBreathUp();

		/**
		 * The meta object literal for the '<em><b>Strategy Compute Poll Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCOMPUTE__STRATEGY_COMPUTE_POLL_TIME = eINSTANCE.getStrategycompute_StrategyComputePollTime();

		/**
		 * The meta object literal for the '<em><b>Strategy Compute Lthreshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCOMPUTE__STRATEGY_COMPUTE_LTHRESHOLD = eINSTANCE.getStrategycompute_StrategyComputeLthreshold();

		/**
		 * The meta object literal for the '<em><b>Must Be Compute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGYCOMPUTE___MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStrategycompute__MustBeCompute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl <em>Strategycpu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategycpuImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategycpu()
		 * @generated
		 */
		EClass STRATEGYCPU = eINSTANCE.getStrategycpu();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_UPPER_LIMIT = eINSTANCE.getStrategycpu_StrategyCPUUpperLimit();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_LOWER_LIMIT = eINSTANCE.getStrategycpu_StrategyCPULowerLimit();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_MODE = eINSTANCE.getStrategycpu_StrategyCPUMode();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_DIRECTION = eINSTANCE.getStrategycpu_StrategyCPUDirection();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Step CPU Decrease</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_STEP_CPU_DECREASE = eINSTANCE.getStrategycpu_StrategyCPUStepCPUDecrease();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Step CPU Increase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_STEP_CPU_INCREASE = eINSTANCE.getStrategycpu_StrategyCPUStepCPUIncrease();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_DATE = eINSTANCE.getStrategycpu_StrategyCPUDate();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Increase Relational Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_INCREASE_RELATIONAL_OP = eINSTANCE.getStrategycpu_StrategyCPUIncreaseRelationalOp();

		/**
		 * The meta object literal for the '<em><b>Strategy CPU Decrease Relational Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYCPU__STRATEGY_CPU_DECREASE_RELATIONAL_OP = eINSTANCE.getStrategycpu_StrategyCPUDecreaseRelationalOp();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGYCPU___START = eINSTANCE.getStrategycpu__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGYCPU___STOP = eINSTANCE.getStrategycpu__Stop();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGYCPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStrategycpu__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl <em>Strategymemory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.StrategymemoryImpl
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getStrategymemory()
		 * @generated
		 */
		EClass STRATEGYMEMORY = eINSTANCE.getStrategymemory();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_MODE = eINSTANCE.getStrategymemory_StrategyMemoryMode();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_DIRECTION = eINSTANCE.getStrategymemory_StrategyMemoryDirection();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Step Mem Decrease</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_DECREASE = eINSTANCE.getStrategymemory_StrategyMemoryStepMemDecrease();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Step Mem Increase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_STEP_MEM_INCREASE = eINSTANCE.getStrategymemory_StrategyMemoryStepMemIncrease();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_UPPER_LIMIT = eINSTANCE.getStrategymemory_StrategyMemoryUpperLimit();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_LOWER_LIMIT = eINSTANCE.getStrategymemory_StrategyMemoryLowerLimit();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_DATE = eINSTANCE.getStrategymemory_StrategyMemoryDate();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Increase Relational Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_INCREASE_RELATIONAL_OP = eINSTANCE.getStrategymemory_StrategyMemoryIncreaseRelationalOp();

		/**
		 * The meta object literal for the '<em><b>Strategy Memory Decrease Relational Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGYMEMORY__STRATEGY_MEMORY_DECREASE_RELATIONAL_OP = eINSTANCE.getStrategymemory_StrategyMemoryDecreaseRelationalOp();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGYMEMORY___STOP = eINSTANCE.getStrategymemory__Stop();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGYMEMORY___START = eINSTANCE.getStrategymemory__Start();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGYMEMORY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStrategymemory__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.ModeType <em>Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getModeType()
		 * @generated
		 */
		EEnum MODE_TYPE = eINSTANCE.getModeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType <em>Relational Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getRelationalType()
		 * @generated
		 */
		EEnum RELATIONAL_TYPE = eINSTANCE.getRelationalType();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em>Date Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.multicloud.elasticocci.impl.ElasticocciPackageImpl#getDateType()
		 * @generated
		 */
		EDataType DATE_TYPE = eINSTANCE.getDateType();

	}

} //ElasticocciPackage
