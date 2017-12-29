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
package awsregions.impl;

import awsregions.*;

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
public class AwsregionsFactoryImpl extends EFactoryImpl implements AwsregionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AwsregionsFactory init() {
		try {
			AwsregionsFactory theAwsregionsFactory = (AwsregionsFactory)EPackage.Registry.INSTANCE.getEFactory(AwsregionsPackage.eNS_URI);
			if (theAwsregionsFactory != null) {
				return theAwsregionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AwsregionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsregionsFactoryImpl() {
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
			case AwsregionsPackage.US_EAST_2: return createUs_east_2();
			case AwsregionsPackage.US_EAST_1: return createUs_east_1();
			case AwsregionsPackage.EU_WEST_3: return createEu_west_3();
			case AwsregionsPackage.US_WEST_1: return createUs_west_1();
			case AwsregionsPackage.EU_WEST_1: return createEu_west_1();
			case AwsregionsPackage.AP_SOUTH_1: return createAp_south_1();
			case AwsregionsPackage.SA_EAST_1: return createSa_east_1();
			case AwsregionsPackage.US_WEST_2: return createUs_west_2();
			case AwsregionsPackage.EU_WEST_2: return createEu_west_2();
			case AwsregionsPackage.AP_SOUTHEAST_1: return createAp_southeast_1();
			case AwsregionsPackage.CA_CENTRAL_1: return createCa_central_1();
			case AwsregionsPackage.AP_NORTHEAST_2: return createAp_northeast_2();
			case AwsregionsPackage.AP_SOUTH_EAST2: return createAp_south_east2();
			case AwsregionsPackage.EU_CENTRAL_1: return createEu_central_1();
			case AwsregionsPackage.AP_NORTHEAST_1: return createAp_northeast_1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Us_east_2 createUs_east_2() {
		Us_east_2Impl us_east_2 = new Us_east_2Impl();
		return us_east_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Us_east_1 createUs_east_1() {
		Us_east_1Impl us_east_1 = new Us_east_1Impl();
		return us_east_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eu_west_3 createEu_west_3() {
		Eu_west_3Impl eu_west_3 = new Eu_west_3Impl();
		return eu_west_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Us_west_1 createUs_west_1() {
		Us_west_1Impl us_west_1 = new Us_west_1Impl();
		return us_west_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eu_west_1 createEu_west_1() {
		Eu_west_1Impl eu_west_1 = new Eu_west_1Impl();
		return eu_west_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ap_south_1 createAp_south_1() {
		Ap_south_1Impl ap_south_1 = new Ap_south_1Impl();
		return ap_south_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sa_east_1 createSa_east_1() {
		Sa_east_1Impl sa_east_1 = new Sa_east_1Impl();
		return sa_east_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Us_west_2 createUs_west_2() {
		Us_west_2Impl us_west_2 = new Us_west_2Impl();
		return us_west_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eu_west_2 createEu_west_2() {
		Eu_west_2Impl eu_west_2 = new Eu_west_2Impl();
		return eu_west_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ap_southeast_1 createAp_southeast_1() {
		Ap_southeast_1Impl ap_southeast_1 = new Ap_southeast_1Impl();
		return ap_southeast_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ca_central_1 createCa_central_1() {
		Ca_central_1Impl ca_central_1 = new Ca_central_1Impl();
		return ca_central_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ap_northeast_2 createAp_northeast_2() {
		Ap_northeast_2Impl ap_northeast_2 = new Ap_northeast_2Impl();
		return ap_northeast_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ap_south_east2 createAp_south_east2() {
		Ap_south_east2Impl ap_south_east2 = new Ap_south_east2Impl();
		return ap_south_east2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eu_central_1 createEu_central_1() {
		Eu_central_1Impl eu_central_1 = new Eu_central_1Impl();
		return eu_central_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ap_northeast_1 createAp_northeast_1() {
		Ap_northeast_1Impl ap_northeast_1 = new Ap_northeast_1Impl();
		return ap_northeast_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsregionsPackage getAwsregionsPackage() {
		return (AwsregionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AwsregionsPackage getPackage() {
		return AwsregionsPackage.eINSTANCE;
	}

} //AwsregionsFactoryImpl
