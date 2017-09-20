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

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.*;

import org.eclipse.emf.ecore.EClass;
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
			case HorizontalelasticityPackage.INSTANCE: return createInstance();
			case HorizontalelasticityPackage.HORIZONTALELASTICCONTOLLER: return createHorizontalelasticcontoller();
			case HorizontalelasticityPackage.SCALINGSTRATEGY: return createScalingstrategy();
			case HorizontalelasticityPackage.MANUAL: return createManual();
			case HorizontalelasticityPackage.DYNAMIC: return createDynamic();
			case HorizontalelasticityPackage.INSTANCEGROUPLINK: return createInstancegrouplink();
			case HorizontalelasticityPackage.LINKBALANCER: return createLinkbalancer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Horizontalelasticcontoller createHorizontalelasticcontoller() {
		HorizontalelasticcontollerImpl horizontalelasticcontoller = new HorizontalelasticcontollerImpl();
		return horizontalelasticcontoller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalingstrategy createScalingstrategy() {
		ScalingstrategyImpl scalingstrategy = new ScalingstrategyImpl();
		return scalingstrategy;
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
