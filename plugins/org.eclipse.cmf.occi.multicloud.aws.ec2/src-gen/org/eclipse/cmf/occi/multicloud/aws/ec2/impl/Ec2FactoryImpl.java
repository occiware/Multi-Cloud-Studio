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
package org.eclipse.cmf.occi.multicloud.aws.ec2.impl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.*;

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
public class Ec2FactoryImpl extends EFactoryImpl implements Ec2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ec2Factory init() {
		try {
			Ec2Factory theEc2Factory = (Ec2Factory)EPackage.Registry.INSTANCE.getEFactory(Ec2Package.eNS_URI);
			if (theEc2Factory != null) {
				return theEc2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ec2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2FactoryImpl() {
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
			case Ec2Package.INSTANCEEC2: return createInstanceec2();
			case Ec2Package.AWSACCOUNT: return createAwsaccount();
			case Ec2Package.AWSCREDENTIAL: return createAwscredential();
			case Ec2Package.T2_NANO: return createT2_nano();
			case Ec2Package.T2_MICRO: return createT2_micro();
			case Ec2Package.T2_SMALL: return createT2_small();
			case Ec2Package.T2_MEDIUM: return createT2_medium();
			case Ec2Package.T2_LARGE: return createT2_large();
			case Ec2Package.T2_XLARGE: return createT2_xlarge();
			case Ec2Package.T2_2XLARGE: return createT2_2xlarge();
			case Ec2Package.M5_LARGE: return createM5_large();
			case Ec2Package.M5_XLARGE: return createM5_xlarge();
			case Ec2Package.M5_2XLARGE: return createM5_2xlarge();
			case Ec2Package.M5_4XLARGE: return createM5_4xlarge();
			case Ec2Package.M5_12XLARGE: return createM5_12xlarge();
			case Ec2Package.M5_24XLARGE: return createM5_24xlarge();
			case Ec2Package.M4_LARGE: return createM4_large();
			case Ec2Package.M4_XLARGE: return createM4_xlarge();
			case Ec2Package.M4_2XLARGE: return createM4_2xlarge();
			case Ec2Package.M4_10XLARGE: return createM4_10xlarge();
			case Ec2Package.M4_16XLARGE: return createM4_16xlarge();
			case Ec2Package.M3_MEDIUM: return createM3_medium();
			case Ec2Package.M3_LARGE: return createM3_large();
			case Ec2Package.M3_XLARGE: return createM3_xlarge();
			case Ec2Package.M3_2XLARGE: return createM3_2xlarge();
			case Ec2Package.C5_LARGE: return createC5_large();
			case Ec2Package.C5_XLARGE: return createC5_xlarge();
			case Ec2Package.C5_2XLARGE: return createC5_2xlarge();
			case Ec2Package.C5_4XLARGE: return createC5_4xlarge();
			case Ec2Package.C5_9XLARGE: return createC5_9xlarge();
			case Ec2Package.C5_18XLARGE: return createC5_18xlarge();
			case Ec2Package.C4_LARGE: return createC4_large();
			case Ec2Package.C4_XLARGE: return createC4_xlarge();
			case Ec2Package.C4_2XLARGE: return createC4_2xlarge();
			case Ec2Package.C4_4XLARGE: return createC4_4xlarge();
			case Ec2Package.C4_8XLARGE: return createC4_8xlarge();
			case Ec2Package.C3_LARGE: return createC3_large();
			case Ec2Package.C3_XLARGE: return createC3_xlarge();
			case Ec2Package.C3_2XLARGE: return createC3_2xlarge();
			case Ec2Package.C3_4XLARGE: return createC3_4xlarge();
			case Ec2Package.C3_8XLARGE: return createC3_8xlarge();
			case Ec2Package.X1E_XLARGE: return createX1e_xlarge();
			case Ec2Package.X1E_2XLARGE: return createX1e_2xlarge();
			case Ec2Package.X1E_4XLARGE: return createX1e_4xlarge();
			case Ec2Package.X1E_8XLARGE: return createX1e_8xlarge();
			case Ec2Package.X1E_16XLARGE: return createX1e_16xlarge();
			case Ec2Package.X1E_32XLARGE: return createX1e_32xlarge();
			case Ec2Package.X1_16XLARGE: return createX1_16xlarge();
			case Ec2Package.X1_32XLARGE: return createX1_32xlarge();
			case Ec2Package.R4_LARGE: return createR4_large();
			case Ec2Package.R4_XLARGE: return createR4_xlarge();
			case Ec2Package.R4_2XLARGE: return createR4_2xlarge();
			case Ec2Package.R4_4XLARGE: return createR4_4xlarge();
			case Ec2Package.R4_8XLARGE: return createR4_8xlarge();
			case Ec2Package.R4_16XLARGE: return createR4_16xlarge();
			case Ec2Package.R3_LARGE: return createR3_large();
			case Ec2Package.R3_XLARGE: return createR3_xlarge();
			case Ec2Package.R3_2XLARGE: return createR3_2xlarge();
			case Ec2Package.R3_4XLARGE: return createR3_4xlarge();
			case Ec2Package.R3_8XLARGE: return createR3_8xlarge();
			case Ec2Package.P3_2XLARGE: return createP3_2xlarge();
			case Ec2Package.P3_8XLARGE: return createP3_8xlarge();
			case Ec2Package.P3_16XLARGE: return createP3_16xlarge();
			case Ec2Package.P2_XLARGE: return createP2_xlarge();
			case Ec2Package.P2_8XLARGE: return createP2_8xlarge();
			case Ec2Package.P2_16XLARGE: return createP2_16xlarge();
			case Ec2Package.GENERALPURPOSE: return createGeneralpurpose();
			case Ec2Package.COMPUTEOPTIMIZED: return createComputeoptimized();
			case Ec2Package.MEMORYOPTIMIZED: return createMemoryoptimized();
			case Ec2Package.ACCELERATEDCOMPUTING: return createAcceleratedcomputing();
			case Ec2Package.STORAGEOPTIMIZED: return createStorageoptimized();
			case Ec2Package.G3_4XLARGE: return createG3_4xlarge();
			case Ec2Package.G3_8XLARGE: return createG3_8xlarge();
			case Ec2Package.G3_16XLARGE: return createG3_16xlarge();
			case Ec2Package.F1_2XLARGE: return createF1_2xlarge();
			case Ec2Package.F1_16XLARGE: return createF1_16xlarge();
			case Ec2Package.H1_2XLARGE: return createH1_2xlarge();
			case Ec2Package.H1_4XLARGE: return createH1_4xlarge();
			case Ec2Package.H1_8XLARGE: return createH1_8xlarge();
			case Ec2Package.H1_16XLARGE: return createH1_16xlarge();
			case Ec2Package.I3_LARGE: return createI3_large();
			case Ec2Package.I3_XLARGE: return createI3_xlarge();
			case Ec2Package.I3_2XLARGE: return createI3_2xlarge();
			case Ec2Package.I3_4XLARGE: return createI3_4xlarge();
			case Ec2Package.I3_8XLARGE: return createI3_8xlarge();
			case Ec2Package.I3_16XLARGE: return createI3_16xlarge();
			case Ec2Package.I3_METAL: return createI3_metal();
			case Ec2Package.D2_XLARGE: return createD2_xlarge();
			case Ec2Package.D2_2XLARGE: return createD2_2xlarge();
			case Ec2Package.D2_4XLARGE: return createD2_4xlarge();
			case Ec2Package.D2_8XLARGE: return createD2_8xlarge();
			case Ec2Package.US_EAST_1: return createUs_east_1();
			case Ec2Package.US_EAST_2: return createUs_east_2();
			case Ec2Package.US_WEST_1: return createUs_west_1();
			case Ec2Package.US_WEST_2: return createUs_west_2();
			case Ec2Package.CA_CENTRAL_1: return createCa_central_1();
			case Ec2Package.EU_CENTRAL_1: return createEu_central_1();
			case Ec2Package.EU_WEST_1: return createEu_west_1();
			case Ec2Package.EU_WEST_2: return createEu_west_2();
			case Ec2Package.EU_WEST_3: return createEu_west_3();
			case Ec2Package.AP_NORTHEAST_1: return createAp_northeast_1();
			case Ec2Package.AP_NORTHEAST_2: return createAp_northeast_2();
			case Ec2Package.AP_SOUTHEAST_1: return createAp_southeast_1();
			case Ec2Package.AP_SOUTH_EAST2: return createAp_south_east2();
			case Ec2Package.AP_SOUTH_1: return createAp_south_1();
			case Ec2Package.SA_EAST_1: return createSa_east_1();
			case Ec2Package.M1_SMALL: return createM1_small();
			case Ec2Package.T1_MICRO: return createT1_micro();
			case Ec2Package.M1_MEDIUM: return createM1_medium();
			case Ec2Package.M1_LARGE: return createM1_large();
			case Ec2Package.M1_XLARGE: return createM1_xlarge();
			case Ec2Package.C1_MEDIUM: return createC1_medium();
			case Ec2Package.C1_XLARGE: return createC1_xlarge();
			case Ec2Package.CC2_8XLARGE: return createCc2_8xlarge();
			case Ec2Package.G2_2XLARGE: return createG2_2xlarge();
			case Ec2Package.G2_8XLARGE: return createG2_8xlarge();
			case Ec2Package.CG1_4XLARGE: return createCg1_4xlarge();
			case Ec2Package.M2_XLARGE: return createM2_xlarge();
			case Ec2Package.M2_2XLARGE: return createM2_2xlarge();
			case Ec2Package.M2_4XLARGE: return createM2_4xlarge();
			case Ec2Package.CR1_8XLARGE: return createCr1_8xlarge();
			case Ec2Package.I2_XLARGE: return createI2_xlarge();
			case Ec2Package.I2_2XLARGE: return createI2_2xlarge();
			case Ec2Package.I2_4XLARGE: return createI2_4xlarge();
			case Ec2Package.I2_8XLARGE: return createI2_8xlarge();
			case Ec2Package.HS1_8XLARGE: return createHs1_8xlarge();
			case Ec2Package.PLACEMENTGROUP: return createPlacementgroup();
			case Ec2Package.ROOTDEVICEVOLUME: return createRootdevicevolume();
			case Ec2Package.STATUSTRANSITIONREASON: return createStatustransitionreason();
			case Ec2Package.TAGS: return createTags();
			case Ec2Package.INSTANCEVPCINFO: return createInstancevpcinfo();
			case Ec2Package.EUROPE: return createEurope();
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
			case Ec2Package.AWS_INSTANCE_STATE:
				return createAWSInstanceStateFromString(eDataType, initialValue);
			case Ec2Package.HYPERVISOR_TYPE:
				return createHypervisorTypeFromString(eDataType, initialValue);
			case Ec2Package.INSTANCE_LIFE_CYCLE_TYPE:
				return createInstanceLifeCycleTypeFromString(eDataType, initialValue);
			case Ec2Package.MONITORING_STATE:
				return createMonitoringStateFromString(eDataType, initialValue);
			case Ec2Package.VIRTUALIZATION_TYPE:
				return createVirtualizationTypeFromString(eDataType, initialValue);
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
			case Ec2Package.AWS_INSTANCE_STATE:
				return convertAWSInstanceStateToString(eDataType, instanceValue);
			case Ec2Package.HYPERVISOR_TYPE:
				return convertHypervisorTypeToString(eDataType, instanceValue);
			case Ec2Package.INSTANCE_LIFE_CYCLE_TYPE:
				return convertInstanceLifeCycleTypeToString(eDataType, instanceValue);
			case Ec2Package.MONITORING_STATE:
				return convertMonitoringStateToString(eDataType, instanceValue);
			case Ec2Package.VIRTUALIZATION_TYPE:
				return convertVirtualizationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instanceec2 createInstanceec2() {
		Instanceec2Impl instanceec2 = new Instanceec2Impl();
		return instanceec2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Awsaccount createAwsaccount() {
		AwsaccountImpl awsaccount = new AwsaccountImpl();
		return awsaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Awscredential createAwscredential() {
		AwscredentialImpl awscredential = new AwscredentialImpl();
		return awscredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2_nano createT2_nano() {
		T2_nanoImpl t2_nano = new T2_nanoImpl();
		return t2_nano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2_micro createT2_micro() {
		T2_microImpl t2_micro = new T2_microImpl();
		return t2_micro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2_small createT2_small() {
		T2_smallImpl t2_small = new T2_smallImpl();
		return t2_small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2_medium createT2_medium() {
		T2_mediumImpl t2_medium = new T2_mediumImpl();
		return t2_medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2_large createT2_large() {
		T2_largeImpl t2_large = new T2_largeImpl();
		return t2_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2_xlarge createT2_xlarge() {
		T2_xlargeImpl t2_xlarge = new T2_xlargeImpl();
		return t2_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2_2xlarge createT2_2xlarge() {
		T2_2xlargeImpl t2_2xlarge = new T2_2xlargeImpl();
		return t2_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M5_large createM5_large() {
		M5_largeImpl m5_large = new M5_largeImpl();
		return m5_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M5_xlarge createM5_xlarge() {
		M5_xlargeImpl m5_xlarge = new M5_xlargeImpl();
		return m5_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M5_2xlarge createM5_2xlarge() {
		M5_2xlargeImpl m5_2xlarge = new M5_2xlargeImpl();
		return m5_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M5_4xlarge createM5_4xlarge() {
		M5_4xlargeImpl m5_4xlarge = new M5_4xlargeImpl();
		return m5_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M5_12xlarge createM5_12xlarge() {
		M5_12xlargeImpl m5_12xlarge = new M5_12xlargeImpl();
		return m5_12xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M5_24xlarge createM5_24xlarge() {
		M5_24xlargeImpl m5_24xlarge = new M5_24xlargeImpl();
		return m5_24xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M4_large createM4_large() {
		M4_largeImpl m4_large = new M4_largeImpl();
		return m4_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M4_xlarge createM4_xlarge() {
		M4_xlargeImpl m4_xlarge = new M4_xlargeImpl();
		return m4_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M4_2xlarge createM4_2xlarge() {
		M4_2xlargeImpl m4_2xlarge = new M4_2xlargeImpl();
		return m4_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M4_10xlarge createM4_10xlarge() {
		M4_10xlargeImpl m4_10xlarge = new M4_10xlargeImpl();
		return m4_10xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M4_16xlarge createM4_16xlarge() {
		M4_16xlargeImpl m4_16xlarge = new M4_16xlargeImpl();
		return m4_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M3_medium createM3_medium() {
		M3_mediumImpl m3_medium = new M3_mediumImpl();
		return m3_medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M3_large createM3_large() {
		M3_largeImpl m3_large = new M3_largeImpl();
		return m3_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M3_xlarge createM3_xlarge() {
		M3_xlargeImpl m3_xlarge = new M3_xlargeImpl();
		return m3_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M3_2xlarge createM3_2xlarge() {
		M3_2xlargeImpl m3_2xlarge = new M3_2xlargeImpl();
		return m3_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C5_large createC5_large() {
		C5_largeImpl c5_large = new C5_largeImpl();
		return c5_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C5_xlarge createC5_xlarge() {
		C5_xlargeImpl c5_xlarge = new C5_xlargeImpl();
		return c5_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C5_2xlarge createC5_2xlarge() {
		C5_2xlargeImpl c5_2xlarge = new C5_2xlargeImpl();
		return c5_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C5_4xlarge createC5_4xlarge() {
		C5_4xlargeImpl c5_4xlarge = new C5_4xlargeImpl();
		return c5_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C5_9xlarge createC5_9xlarge() {
		C5_9xlargeImpl c5_9xlarge = new C5_9xlargeImpl();
		return c5_9xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C5_18xlarge createC5_18xlarge() {
		C5_18xlargeImpl c5_18xlarge = new C5_18xlargeImpl();
		return c5_18xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4_large createC4_large() {
		C4_largeImpl c4_large = new C4_largeImpl();
		return c4_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4_xlarge createC4_xlarge() {
		C4_xlargeImpl c4_xlarge = new C4_xlargeImpl();
		return c4_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4_2xlarge createC4_2xlarge() {
		C4_2xlargeImpl c4_2xlarge = new C4_2xlargeImpl();
		return c4_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4_4xlarge createC4_4xlarge() {
		C4_4xlargeImpl c4_4xlarge = new C4_4xlargeImpl();
		return c4_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4_8xlarge createC4_8xlarge() {
		C4_8xlargeImpl c4_8xlarge = new C4_8xlargeImpl();
		return c4_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C3_large createC3_large() {
		C3_largeImpl c3_large = new C3_largeImpl();
		return c3_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C3_xlarge createC3_xlarge() {
		C3_xlargeImpl c3_xlarge = new C3_xlargeImpl();
		return c3_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C3_2xlarge createC3_2xlarge() {
		C3_2xlargeImpl c3_2xlarge = new C3_2xlargeImpl();
		return c3_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C3_4xlarge createC3_4xlarge() {
		C3_4xlargeImpl c3_4xlarge = new C3_4xlargeImpl();
		return c3_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C3_8xlarge createC3_8xlarge() {
		C3_8xlargeImpl c3_8xlarge = new C3_8xlargeImpl();
		return c3_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1e_xlarge createX1e_xlarge() {
		X1e_xlargeImpl x1e_xlarge = new X1e_xlargeImpl();
		return x1e_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1e_2xlarge createX1e_2xlarge() {
		X1e_2xlargeImpl x1e_2xlarge = new X1e_2xlargeImpl();
		return x1e_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1e_4xlarge createX1e_4xlarge() {
		X1e_4xlargeImpl x1e_4xlarge = new X1e_4xlargeImpl();
		return x1e_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1e_8xlarge createX1e_8xlarge() {
		X1e_8xlargeImpl x1e_8xlarge = new X1e_8xlargeImpl();
		return x1e_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1e_16xlarge createX1e_16xlarge() {
		X1e_16xlargeImpl x1e_16xlarge = new X1e_16xlargeImpl();
		return x1e_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1e_32xlarge createX1e_32xlarge() {
		X1e_32xlargeImpl x1e_32xlarge = new X1e_32xlargeImpl();
		return x1e_32xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1_16xlarge createX1_16xlarge() {
		X1_16xlargeImpl x1_16xlarge = new X1_16xlargeImpl();
		return x1_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X1_32xlarge createX1_32xlarge() {
		X1_32xlargeImpl x1_32xlarge = new X1_32xlargeImpl();
		return x1_32xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R4_large createR4_large() {
		R4_largeImpl r4_large = new R4_largeImpl();
		return r4_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R4_xlarge createR4_xlarge() {
		R4_xlargeImpl r4_xlarge = new R4_xlargeImpl();
		return r4_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R4_2xlarge createR4_2xlarge() {
		R4_2xlargeImpl r4_2xlarge = new R4_2xlargeImpl();
		return r4_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R4_4xlarge createR4_4xlarge() {
		R4_4xlargeImpl r4_4xlarge = new R4_4xlargeImpl();
		return r4_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R4_8xlarge createR4_8xlarge() {
		R4_8xlargeImpl r4_8xlarge = new R4_8xlargeImpl();
		return r4_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R4_16xlarge createR4_16xlarge() {
		R4_16xlargeImpl r4_16xlarge = new R4_16xlargeImpl();
		return r4_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R3_large createR3_large() {
		R3_largeImpl r3_large = new R3_largeImpl();
		return r3_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R3_xlarge createR3_xlarge() {
		R3_xlargeImpl r3_xlarge = new R3_xlargeImpl();
		return r3_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R3_2xlarge createR3_2xlarge() {
		R3_2xlargeImpl r3_2xlarge = new R3_2xlargeImpl();
		return r3_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R3_4xlarge createR3_4xlarge() {
		R3_4xlargeImpl r3_4xlarge = new R3_4xlargeImpl();
		return r3_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R3_8xlarge createR3_8xlarge() {
		R3_8xlargeImpl r3_8xlarge = new R3_8xlargeImpl();
		return r3_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P3_2xlarge createP3_2xlarge() {
		P3_2xlargeImpl p3_2xlarge = new P3_2xlargeImpl();
		return p3_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P3_8xlarge createP3_8xlarge() {
		P3_8xlargeImpl p3_8xlarge = new P3_8xlargeImpl();
		return p3_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P3_16xlarge createP3_16xlarge() {
		P3_16xlargeImpl p3_16xlarge = new P3_16xlargeImpl();
		return p3_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2_xlarge createP2_xlarge() {
		P2_xlargeImpl p2_xlarge = new P2_xlargeImpl();
		return p2_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2_8xlarge createP2_8xlarge() {
		P2_8xlargeImpl p2_8xlarge = new P2_8xlargeImpl();
		return p2_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2_16xlarge createP2_16xlarge() {
		P2_16xlargeImpl p2_16xlarge = new P2_16xlargeImpl();
		return p2_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalpurpose createGeneralpurpose() {
		GeneralpurposeImpl generalpurpose = new GeneralpurposeImpl();
		return generalpurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computeoptimized createComputeoptimized() {
		ComputeoptimizedImpl computeoptimized = new ComputeoptimizedImpl();
		return computeoptimized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memoryoptimized createMemoryoptimized() {
		MemoryoptimizedImpl memoryoptimized = new MemoryoptimizedImpl();
		return memoryoptimized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Acceleratedcomputing createAcceleratedcomputing() {
		AcceleratedcomputingImpl acceleratedcomputing = new AcceleratedcomputingImpl();
		return acceleratedcomputing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storageoptimized createStorageoptimized() {
		StorageoptimizedImpl storageoptimized = new StorageoptimizedImpl();
		return storageoptimized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_4xlarge createG3_4xlarge() {
		G3_4xlargeImpl g3_4xlarge = new G3_4xlargeImpl();
		return g3_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_8xlarge createG3_8xlarge() {
		G3_8xlargeImpl g3_8xlarge = new G3_8xlargeImpl();
		return g3_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_16xlarge createG3_16xlarge() {
		G3_16xlargeImpl g3_16xlarge = new G3_16xlargeImpl();
		return g3_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public F1_2xlarge createF1_2xlarge() {
		F1_2xlargeImpl f1_2xlarge = new F1_2xlargeImpl();
		return f1_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public F1_16xlarge createF1_16xlarge() {
		F1_16xlargeImpl f1_16xlarge = new F1_16xlargeImpl();
		return f1_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1_2xlarge createH1_2xlarge() {
		H1_2xlargeImpl h1_2xlarge = new H1_2xlargeImpl();
		return h1_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1_4xlarge createH1_4xlarge() {
		H1_4xlargeImpl h1_4xlarge = new H1_4xlargeImpl();
		return h1_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1_8xlarge createH1_8xlarge() {
		H1_8xlargeImpl h1_8xlarge = new H1_8xlargeImpl();
		return h1_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1_16xlarge createH1_16xlarge() {
		H1_16xlargeImpl h1_16xlarge = new H1_16xlargeImpl();
		return h1_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I3_large createI3_large() {
		I3_largeImpl i3_large = new I3_largeImpl();
		return i3_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I3_xlarge createI3_xlarge() {
		I3_xlargeImpl i3_xlarge = new I3_xlargeImpl();
		return i3_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I3_2xlarge createI3_2xlarge() {
		I3_2xlargeImpl i3_2xlarge = new I3_2xlargeImpl();
		return i3_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I3_4xlarge createI3_4xlarge() {
		I3_4xlargeImpl i3_4xlarge = new I3_4xlargeImpl();
		return i3_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I3_8xlarge createI3_8xlarge() {
		I3_8xlargeImpl i3_8xlarge = new I3_8xlargeImpl();
		return i3_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I3_16xlarge createI3_16xlarge() {
		I3_16xlargeImpl i3_16xlarge = new I3_16xlargeImpl();
		return i3_16xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I3_metal createI3_metal() {
		I3_metalImpl i3_metal = new I3_metalImpl();
		return i3_metal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D2_xlarge createD2_xlarge() {
		D2_xlargeImpl d2_xlarge = new D2_xlargeImpl();
		return d2_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D2_2xlarge createD2_2xlarge() {
		D2_2xlargeImpl d2_2xlarge = new D2_2xlargeImpl();
		return d2_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D2_4xlarge createD2_4xlarge() {
		D2_4xlargeImpl d2_4xlarge = new D2_4xlargeImpl();
		return d2_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D2_8xlarge createD2_8xlarge() {
		D2_8xlargeImpl d2_8xlarge = new D2_8xlargeImpl();
		return d2_8xlarge;
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
	public Us_east_2 createUs_east_2() {
		Us_east_2Impl us_east_2 = new Us_east_2Impl();
		return us_east_2;
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
	public Us_west_2 createUs_west_2() {
		Us_west_2Impl us_west_2 = new Us_west_2Impl();
		return us_west_2;
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
	public Eu_central_1 createEu_central_1() {
		Eu_central_1Impl eu_central_1 = new Eu_central_1Impl();
		return eu_central_1;
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
	public Eu_west_2 createEu_west_2() {
		Eu_west_2Impl eu_west_2 = new Eu_west_2Impl();
		return eu_west_2;
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
	public Ap_northeast_1 createAp_northeast_1() {
		Ap_northeast_1Impl ap_northeast_1 = new Ap_northeast_1Impl();
		return ap_northeast_1;
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
	public Ap_southeast_1 createAp_southeast_1() {
		Ap_southeast_1Impl ap_southeast_1 = new Ap_southeast_1Impl();
		return ap_southeast_1;
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
	public M1_small createM1_small() {
		M1_smallImpl m1_small = new M1_smallImpl();
		return m1_small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T1_micro createT1_micro() {
		T1_microImpl t1_micro = new T1_microImpl();
		return t1_micro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1_medium createM1_medium() {
		M1_mediumImpl m1_medium = new M1_mediumImpl();
		return m1_medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1_large createM1_large() {
		M1_largeImpl m1_large = new M1_largeImpl();
		return m1_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1_xlarge createM1_xlarge() {
		M1_xlargeImpl m1_xlarge = new M1_xlargeImpl();
		return m1_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C1_medium createC1_medium() {
		C1_mediumImpl c1_medium = new C1_mediumImpl();
		return c1_medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C1_xlarge createC1_xlarge() {
		C1_xlargeImpl c1_xlarge = new C1_xlargeImpl();
		return c1_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cc2_8xlarge createCc2_8xlarge() {
		Cc2_8xlargeImpl cc2_8xlarge = new Cc2_8xlargeImpl();
		return cc2_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G2_2xlarge createG2_2xlarge() {
		G2_2xlargeImpl g2_2xlarge = new G2_2xlargeImpl();
		return g2_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G2_8xlarge createG2_8xlarge() {
		G2_8xlargeImpl g2_8xlarge = new G2_8xlargeImpl();
		return g2_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cg1_4xlarge createCg1_4xlarge() {
		Cg1_4xlargeImpl cg1_4xlarge = new Cg1_4xlargeImpl();
		return cg1_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2_xlarge createM2_xlarge() {
		M2_xlargeImpl m2_xlarge = new M2_xlargeImpl();
		return m2_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2_2xlarge createM2_2xlarge() {
		M2_2xlargeImpl m2_2xlarge = new M2_2xlargeImpl();
		return m2_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2_4xlarge createM2_4xlarge() {
		M2_4xlargeImpl m2_4xlarge = new M2_4xlargeImpl();
		return m2_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cr1_8xlarge createCr1_8xlarge() {
		Cr1_8xlargeImpl cr1_8xlarge = new Cr1_8xlargeImpl();
		return cr1_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2_xlarge createI2_xlarge() {
		I2_xlargeImpl i2_xlarge = new I2_xlargeImpl();
		return i2_xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2_2xlarge createI2_2xlarge() {
		I2_2xlargeImpl i2_2xlarge = new I2_2xlargeImpl();
		return i2_2xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2_4xlarge createI2_4xlarge() {
		I2_4xlargeImpl i2_4xlarge = new I2_4xlargeImpl();
		return i2_4xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2_8xlarge createI2_8xlarge() {
		I2_8xlargeImpl i2_8xlarge = new I2_8xlargeImpl();
		return i2_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hs1_8xlarge createHs1_8xlarge() {
		Hs1_8xlargeImpl hs1_8xlarge = new Hs1_8xlargeImpl();
		return hs1_8xlarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placementgroup createPlacementgroup() {
		PlacementgroupImpl placementgroup = new PlacementgroupImpl();
		return placementgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rootdevicevolume createRootdevicevolume() {
		RootdevicevolumeImpl rootdevicevolume = new RootdevicevolumeImpl();
		return rootdevicevolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statustransitionreason createStatustransitionreason() {
		StatustransitionreasonImpl statustransitionreason = new StatustransitionreasonImpl();
		return statustransitionreason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instancevpcinfo createInstancevpcinfo() {
		InstancevpcinfoImpl instancevpcinfo = new InstancevpcinfoImpl();
		return instancevpcinfo;
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
	public AWSInstanceState createAWSInstanceStateFromString(EDataType eDataType, String initialValue) {
		AWSInstanceState result = AWSInstanceState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAWSInstanceStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorType createHypervisorTypeFromString(EDataType eDataType, String initialValue) {
		HypervisorType result = HypervisorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHypervisorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceLifeCycleType createInstanceLifeCycleTypeFromString(EDataType eDataType, String initialValue) {
		InstanceLifeCycleType result = InstanceLifeCycleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceLifeCycleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringState createMonitoringStateFromString(EDataType eDataType, String initialValue) {
		MonitoringState result = MonitoringState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualizationType createVirtualizationTypeFromString(EDataType eDataType, String initialValue) {
		VirtualizationType result = VirtualizationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualizationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2Package getEc2Package() {
		return (Ec2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ec2Package getPackage() {
		return Ec2Package.eINSTANCE;
	}

} //Ec2FactoryImpl
