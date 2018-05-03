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
package org.eclipse.cmf.occi.multicloud.regions.impl;

import org.eclipse.cmf.occi.multicloud.regions.*;

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
public class RegionsFactoryImpl extends EFactoryImpl implements RegionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegionsFactory init() {
		try {
			RegionsFactory theRegionsFactory = (RegionsFactory)EPackage.Registry.INSTANCE.getEFactory(RegionsPackage.eNS_URI);
			if (theRegionsFactory != null) {
				return theRegionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionsFactoryImpl() {
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
			case RegionsPackage.REGION: return createRegion();
			case RegionsPackage.REGIONLINK: return createRegionlink();
			case RegionsPackage.AVAILABILITYZONE: return createAvailabilityzone();
			case RegionsPackage.EUROPE: return createEurope();
			case RegionsPackage.NORTHAMERICA: return createNorthamerica();
			case RegionsPackage.SOUTHAMERICA: return createSouthamerica();
			case RegionsPackage.ASIAPACIFIC: return createAsiapacific();
			case RegionsPackage.AFRICA: return createAfrica();
			case RegionsPackage.CHINA: return createChina();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regionlink createRegionlink() {
		RegionlinkImpl regionlink = new RegionlinkImpl();
		return regionlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availabilityzone createAvailabilityzone() {
		AvailabilityzoneImpl availabilityzone = new AvailabilityzoneImpl();
		return availabilityzone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Europe createEurope() {
		EuropeImpl europe = new EuropeImpl();
		return europe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Northamerica createNorthamerica() {
		NorthamericaImpl northamerica = new NorthamericaImpl();
		return northamerica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Southamerica createSouthamerica() {
		SouthamericaImpl southamerica = new SouthamericaImpl();
		return southamerica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asiapacific createAsiapacific() {
		AsiapacificImpl asiapacific = new AsiapacificImpl();
		return asiapacific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Africa createAfrica() {
		AfricaImpl africa = new AfricaImpl();
		return africa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public China createChina() {
		ChinaImpl china = new ChinaImpl();
		return china;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionsPackage getRegionsPackage() {
		return (RegionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RegionsPackage getPackage() {
		return RegionsPackage.eINSTANCE;
	}

} //RegionsFactoryImpl
