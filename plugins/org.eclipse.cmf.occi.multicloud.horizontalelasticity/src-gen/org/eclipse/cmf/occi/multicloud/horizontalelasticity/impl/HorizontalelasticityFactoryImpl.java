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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl;

import java.sql.Time;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HorizontalelasticityFactoryImpl extends EFactoryImpl implements HorizontalelasticityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HorizontalelasticityFactory init() {
		try {
			HorizontalelasticityFactory theHorizontalelasticityFactory = (HorizontalelasticityFactory)EPackage.Registry.INSTANCE.getEFactory(HorizontalelasticityPackage.eNS_URI);
			if (theHorizontalelasticityFactory != null) {
				return theHorizontalelasticityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HorizontalelasticityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HorizontalelasticityPackage.HORIZONTALGROUP: return createHorizontalgroup();
			case HorizontalelasticityPackage.LOADBALANCER: return createLoadbalancer();
			case HorizontalelasticityPackage.HORIZONTALELASTICCONTROLLER: return createHorizontalelasticcontroller();
			case HorizontalelasticityPackage.INSTANCEGROUPLINK: return createInstancegrouplink();
			case HorizontalelasticityPackage.LINKBALANCER: return createLinkbalancer();
			case HorizontalelasticityPackage.GROUPLINK: return createGrouplink();
			case HorizontalelasticityPackage.CREATION: return createCreation();
			case HorizontalelasticityPackage.STRATEGY: return createStrategy();
			case HorizontalelasticityPackage.MANUAL: return createManual();
			case HorizontalelasticityPackage.DYNAMIC: return createDynamic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HorizontalelasticityPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HorizontalelasticityPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Horizontalgroup createHorizontalgroup() {
		HorizontalgroupImpl horizontalgroup = new HorizontalgroupImpl();
		return horizontalgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadbalancer createLoadbalancer() {
		LoadbalancerImpl loadbalancer = new LoadbalancerImpl();
		return loadbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Horizontalelasticcontroller createHorizontalelasticcontroller() {
		HorizontalelasticcontrollerImpl horizontalelasticcontroller = new HorizontalelasticcontrollerImpl();
		return horizontalelasticcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instancegrouplink createInstancegrouplink() {
		InstancegrouplinkImpl instancegrouplink = new InstancegrouplinkImpl();
		return instancegrouplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkbalancer createLinkbalancer() {
		LinkbalancerImpl linkbalancer = new LinkbalancerImpl();
		return linkbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouplink createGrouplink() {
		GrouplinkImpl grouplink = new GrouplinkImpl();
		return grouplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creation createCreation() {
		CreationImpl creation = new CreationImpl();
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manual createManual() {
		ManualImpl manual = new ManualImpl();
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic createDynamic() {
		DynamicImpl dynamic = new DynamicImpl();
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createDateFromString(EDataType eDataType, String initialValue) {
		return (Time)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityPackage getHorizontalelasticityPackage() {
		return (HorizontalelasticityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HorizontalelasticityPackage getPackage() {
		return HorizontalelasticityPackage.eINSTANCE;
	}

} //HorizontalelasticityFactoryImpl
