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
package org.eclipse.cmf.occi.multicloud.aws.ec2.util;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;

import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential;

import org.eclipse.cmf.occi.multicloud.aws.ec2.*;

import org.eclipse.cmf.occi.multicloud.regions.Region;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package
 * @generated
 */
public class Ec2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ec2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ec2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ec2Switch<Adapter> modelSwitch =
		new Ec2Switch<Adapter>() {
			@Override
			public Adapter caseInstanceec2(Instanceec2 object) {
				return createInstanceec2Adapter();
			}
			@Override
			public Adapter caseAwsaccount(Awsaccount object) {
				return createAwsaccountAdapter();
			}
			@Override
			public Adapter caseAwscredential(Awscredential object) {
				return createAwscredentialAdapter();
			}
			@Override
			public Adapter caseT2_nano(T2_nano object) {
				return createT2_nanoAdapter();
			}
			@Override
			public Adapter caseT2_micro(T2_micro object) {
				return createT2_microAdapter();
			}
			@Override
			public Adapter caseT2_small(T2_small object) {
				return createT2_smallAdapter();
			}
			@Override
			public Adapter caseT2_medium(T2_medium object) {
				return createT2_mediumAdapter();
			}
			@Override
			public Adapter caseT2_large(T2_large object) {
				return createT2_largeAdapter();
			}
			@Override
			public Adapter caseT2_xlarge(T2_xlarge object) {
				return createT2_xlargeAdapter();
			}
			@Override
			public Adapter caseT2_2xlarge(T2_2xlarge object) {
				return createT2_2xlargeAdapter();
			}
			@Override
			public Adapter caseM5_large(M5_large object) {
				return createM5_largeAdapter();
			}
			@Override
			public Adapter caseM5_xlarge(M5_xlarge object) {
				return createM5_xlargeAdapter();
			}
			@Override
			public Adapter caseM5_2xlarge(M5_2xlarge object) {
				return createM5_2xlargeAdapter();
			}
			@Override
			public Adapter caseM5_4xlarge(M5_4xlarge object) {
				return createM5_4xlargeAdapter();
			}
			@Override
			public Adapter caseM5_12xlarge(M5_12xlarge object) {
				return createM5_12xlargeAdapter();
			}
			@Override
			public Adapter caseM5_24xlarge(M5_24xlarge object) {
				return createM5_24xlargeAdapter();
			}
			@Override
			public Adapter caseM4_large(M4_large object) {
				return createM4_largeAdapter();
			}
			@Override
			public Adapter caseM4_xlarge(M4_xlarge object) {
				return createM4_xlargeAdapter();
			}
			@Override
			public Adapter caseM4_2xlarge(M4_2xlarge object) {
				return createM4_2xlargeAdapter();
			}
			@Override
			public Adapter caseM4_10xlarge(M4_10xlarge object) {
				return createM4_10xlargeAdapter();
			}
			@Override
			public Adapter caseM4_16xlarge(M4_16xlarge object) {
				return createM4_16xlargeAdapter();
			}
			@Override
			public Adapter caseM3_medium(M3_medium object) {
				return createM3_mediumAdapter();
			}
			@Override
			public Adapter caseM3_large(M3_large object) {
				return createM3_largeAdapter();
			}
			@Override
			public Adapter caseM3_xlarge(M3_xlarge object) {
				return createM3_xlargeAdapter();
			}
			@Override
			public Adapter caseM3_2xlarge(M3_2xlarge object) {
				return createM3_2xlargeAdapter();
			}
			@Override
			public Adapter caseC5_large(C5_large object) {
				return createC5_largeAdapter();
			}
			@Override
			public Adapter caseC5_xlarge(C5_xlarge object) {
				return createC5_xlargeAdapter();
			}
			@Override
			public Adapter caseC5_2xlarge(C5_2xlarge object) {
				return createC5_2xlargeAdapter();
			}
			@Override
			public Adapter caseC5_4xlarge(C5_4xlarge object) {
				return createC5_4xlargeAdapter();
			}
			@Override
			public Adapter caseC5_9xlarge(C5_9xlarge object) {
				return createC5_9xlargeAdapter();
			}
			@Override
			public Adapter caseC5_18xlarge(C5_18xlarge object) {
				return createC5_18xlargeAdapter();
			}
			@Override
			public Adapter caseC4_large(C4_large object) {
				return createC4_largeAdapter();
			}
			@Override
			public Adapter caseC4_xlarge(C4_xlarge object) {
				return createC4_xlargeAdapter();
			}
			@Override
			public Adapter caseC4_2xlarge(C4_2xlarge object) {
				return createC4_2xlargeAdapter();
			}
			@Override
			public Adapter caseC4_4xlarge(C4_4xlarge object) {
				return createC4_4xlargeAdapter();
			}
			@Override
			public Adapter caseC4_8xlarge(C4_8xlarge object) {
				return createC4_8xlargeAdapter();
			}
			@Override
			public Adapter caseC3_large(C3_large object) {
				return createC3_largeAdapter();
			}
			@Override
			public Adapter caseC3_xlarge(C3_xlarge object) {
				return createC3_xlargeAdapter();
			}
			@Override
			public Adapter caseC3_2xlarge(C3_2xlarge object) {
				return createC3_2xlargeAdapter();
			}
			@Override
			public Adapter caseC3_4xlarge(C3_4xlarge object) {
				return createC3_4xlargeAdapter();
			}
			@Override
			public Adapter caseC3_8xlarge(C3_8xlarge object) {
				return createC3_8xlargeAdapter();
			}
			@Override
			public Adapter caseX1e_xlarge(X1e_xlarge object) {
				return createX1e_xlargeAdapter();
			}
			@Override
			public Adapter caseX1e_2xlarge(X1e_2xlarge object) {
				return createX1e_2xlargeAdapter();
			}
			@Override
			public Adapter caseX1e_4xlarge(X1e_4xlarge object) {
				return createX1e_4xlargeAdapter();
			}
			@Override
			public Adapter caseX1e_8xlarge(X1e_8xlarge object) {
				return createX1e_8xlargeAdapter();
			}
			@Override
			public Adapter caseX1e_16xlarge(X1e_16xlarge object) {
				return createX1e_16xlargeAdapter();
			}
			@Override
			public Adapter caseX1e_32xlarge(X1e_32xlarge object) {
				return createX1e_32xlargeAdapter();
			}
			@Override
			public Adapter caseX1_16xlarge(X1_16xlarge object) {
				return createX1_16xlargeAdapter();
			}
			@Override
			public Adapter caseX1_32xlarge(X1_32xlarge object) {
				return createX1_32xlargeAdapter();
			}
			@Override
			public Adapter caseR4_large(R4_large object) {
				return createR4_largeAdapter();
			}
			@Override
			public Adapter caseR4_xlarge(R4_xlarge object) {
				return createR4_xlargeAdapter();
			}
			@Override
			public Adapter caseR4_2xlarge(R4_2xlarge object) {
				return createR4_2xlargeAdapter();
			}
			@Override
			public Adapter caseR4_4xlarge(R4_4xlarge object) {
				return createR4_4xlargeAdapter();
			}
			@Override
			public Adapter caseR4_8xlarge(R4_8xlarge object) {
				return createR4_8xlargeAdapter();
			}
			@Override
			public Adapter caseR4_16xlarge(R4_16xlarge object) {
				return createR4_16xlargeAdapter();
			}
			@Override
			public Adapter caseR3_large(R3_large object) {
				return createR3_largeAdapter();
			}
			@Override
			public Adapter caseR3_xlarge(R3_xlarge object) {
				return createR3_xlargeAdapter();
			}
			@Override
			public Adapter caseR3_2xlarge(R3_2xlarge object) {
				return createR3_2xlargeAdapter();
			}
			@Override
			public Adapter caseR3_4xlarge(R3_4xlarge object) {
				return createR3_4xlargeAdapter();
			}
			@Override
			public Adapter caseR3_8xlarge(R3_8xlarge object) {
				return createR3_8xlargeAdapter();
			}
			@Override
			public Adapter caseP3_2xlarge(P3_2xlarge object) {
				return createP3_2xlargeAdapter();
			}
			@Override
			public Adapter caseP3_8xlarge(P3_8xlarge object) {
				return createP3_8xlargeAdapter();
			}
			@Override
			public Adapter caseP3_16xlarge(P3_16xlarge object) {
				return createP3_16xlargeAdapter();
			}
			@Override
			public Adapter caseP2_xlarge(P2_xlarge object) {
				return createP2_xlargeAdapter();
			}
			@Override
			public Adapter caseP2_8xlarge(P2_8xlarge object) {
				return createP2_8xlargeAdapter();
			}
			@Override
			public Adapter caseP2_16xlarge(P2_16xlarge object) {
				return createP2_16xlargeAdapter();
			}
			@Override
			public Adapter caseGeneralpurpose(Generalpurpose object) {
				return createGeneralpurposeAdapter();
			}
			@Override
			public Adapter caseComputeoptimized(Computeoptimized object) {
				return createComputeoptimizedAdapter();
			}
			@Override
			public Adapter caseMemoryoptimized(Memoryoptimized object) {
				return createMemoryoptimizedAdapter();
			}
			@Override
			public Adapter caseAcceleratedcomputing(Acceleratedcomputing object) {
				return createAcceleratedcomputingAdapter();
			}
			@Override
			public Adapter caseStorageoptimized(Storageoptimized object) {
				return createStorageoptimizedAdapter();
			}
			@Override
			public Adapter caseG3_4xlarge(G3_4xlarge object) {
				return createG3_4xlargeAdapter();
			}
			@Override
			public Adapter caseG3_8xlarge(G3_8xlarge object) {
				return createG3_8xlargeAdapter();
			}
			@Override
			public Adapter caseG3_16xlarge(G3_16xlarge object) {
				return createG3_16xlargeAdapter();
			}
			@Override
			public Adapter caseF1_2xlarge(F1_2xlarge object) {
				return createF1_2xlargeAdapter();
			}
			@Override
			public Adapter caseF1_16xlarge(F1_16xlarge object) {
				return createF1_16xlargeAdapter();
			}
			@Override
			public Adapter caseH1_2xlarge(H1_2xlarge object) {
				return createH1_2xlargeAdapter();
			}
			@Override
			public Adapter caseH1_4xlarge(H1_4xlarge object) {
				return createH1_4xlargeAdapter();
			}
			@Override
			public Adapter caseH1_8xlarge(H1_8xlarge object) {
				return createH1_8xlargeAdapter();
			}
			@Override
			public Adapter caseH1_16xlarge(H1_16xlarge object) {
				return createH1_16xlargeAdapter();
			}
			@Override
			public Adapter caseI3_large(I3_large object) {
				return createI3_largeAdapter();
			}
			@Override
			public Adapter caseI3_xlarge(I3_xlarge object) {
				return createI3_xlargeAdapter();
			}
			@Override
			public Adapter caseI3_2xlarge(I3_2xlarge object) {
				return createI3_2xlargeAdapter();
			}
			@Override
			public Adapter caseI3_4xlarge(I3_4xlarge object) {
				return createI3_4xlargeAdapter();
			}
			@Override
			public Adapter caseI3_8xlarge(I3_8xlarge object) {
				return createI3_8xlargeAdapter();
			}
			@Override
			public Adapter caseI3_16xlarge(I3_16xlarge object) {
				return createI3_16xlargeAdapter();
			}
			@Override
			public Adapter caseI3_metal(I3_metal object) {
				return createI3_metalAdapter();
			}
			@Override
			public Adapter caseD2_xlarge(D2_xlarge object) {
				return createD2_xlargeAdapter();
			}
			@Override
			public Adapter caseD2_2xlarge(D2_2xlarge object) {
				return createD2_2xlargeAdapter();
			}
			@Override
			public Adapter caseD2_4xlarge(D2_4xlarge object) {
				return createD2_4xlargeAdapter();
			}
			@Override
			public Adapter caseD2_8xlarge(D2_8xlarge object) {
				return createD2_8xlargeAdapter();
			}
			@Override
			public Adapter caseUs_east_1(Us_east_1 object) {
				return createUs_east_1Adapter();
			}
			@Override
			public Adapter caseUs_east_2(Us_east_2 object) {
				return createUs_east_2Adapter();
			}
			@Override
			public Adapter caseUs_west_1(Us_west_1 object) {
				return createUs_west_1Adapter();
			}
			@Override
			public Adapter caseUs_west_2(Us_west_2 object) {
				return createUs_west_2Adapter();
			}
			@Override
			public Adapter caseCa_central_1(Ca_central_1 object) {
				return createCa_central_1Adapter();
			}
			@Override
			public Adapter caseEu_central_1(Eu_central_1 object) {
				return createEu_central_1Adapter();
			}
			@Override
			public Adapter caseEu_west_1(Eu_west_1 object) {
				return createEu_west_1Adapter();
			}
			@Override
			public Adapter caseEu_west_2(Eu_west_2 object) {
				return createEu_west_2Adapter();
			}
			@Override
			public Adapter caseEu_west_3(Eu_west_3 object) {
				return createEu_west_3Adapter();
			}
			@Override
			public Adapter caseAp_northeast_1(Ap_northeast_1 object) {
				return createAp_northeast_1Adapter();
			}
			@Override
			public Adapter caseAp_northeast_2(Ap_northeast_2 object) {
				return createAp_northeast_2Adapter();
			}
			@Override
			public Adapter caseAp_southeast_1(Ap_southeast_1 object) {
				return createAp_southeast_1Adapter();
			}
			@Override
			public Adapter caseAp_south_east2(Ap_south_east2 object) {
				return createAp_south_east2Adapter();
			}
			@Override
			public Adapter caseAp_south_1(Ap_south_1 object) {
				return createAp_south_1Adapter();
			}
			@Override
			public Adapter caseSa_east_1(Sa_east_1 object) {
				return createSa_east_1Adapter();
			}
			@Override
			public Adapter caseM1_small(M1_small object) {
				return createM1_smallAdapter();
			}
			@Override
			public Adapter caseT1_micro(T1_micro object) {
				return createT1_microAdapter();
			}
			@Override
			public Adapter caseM1_medium(M1_medium object) {
				return createM1_mediumAdapter();
			}
			@Override
			public Adapter caseM1_large(M1_large object) {
				return createM1_largeAdapter();
			}
			@Override
			public Adapter caseM1_xlarge(M1_xlarge object) {
				return createM1_xlargeAdapter();
			}
			@Override
			public Adapter caseC1_medium(C1_medium object) {
				return createC1_mediumAdapter();
			}
			@Override
			public Adapter caseC1_xlarge(C1_xlarge object) {
				return createC1_xlargeAdapter();
			}
			@Override
			public Adapter caseCc2_8xlarge(Cc2_8xlarge object) {
				return createCc2_8xlargeAdapter();
			}
			@Override
			public Adapter caseG2_2xlarge(G2_2xlarge object) {
				return createG2_2xlargeAdapter();
			}
			@Override
			public Adapter caseG2_8xlarge(G2_8xlarge object) {
				return createG2_8xlargeAdapter();
			}
			@Override
			public Adapter caseCg1_4xlarge(Cg1_4xlarge object) {
				return createCg1_4xlargeAdapter();
			}
			@Override
			public Adapter caseM2_xlarge(M2_xlarge object) {
				return createM2_xlargeAdapter();
			}
			@Override
			public Adapter caseM2_2xlarge(M2_2xlarge object) {
				return createM2_2xlargeAdapter();
			}
			@Override
			public Adapter caseM2_4xlarge(M2_4xlarge object) {
				return createM2_4xlargeAdapter();
			}
			@Override
			public Adapter caseCr1_8xlarge(Cr1_8xlarge object) {
				return createCr1_8xlargeAdapter();
			}
			@Override
			public Adapter caseI2_xlarge(I2_xlarge object) {
				return createI2_xlargeAdapter();
			}
			@Override
			public Adapter caseI2_2xlarge(I2_2xlarge object) {
				return createI2_2xlargeAdapter();
			}
			@Override
			public Adapter caseI2_4xlarge(I2_4xlarge object) {
				return createI2_4xlargeAdapter();
			}
			@Override
			public Adapter caseI2_8xlarge(I2_8xlarge object) {
				return createI2_8xlargeAdapter();
			}
			@Override
			public Adapter caseHs1_8xlarge(Hs1_8xlarge object) {
				return createHs1_8xlargeAdapter();
			}
			@Override
			public Adapter casePlacementgroup(Placementgroup object) {
				return createPlacementgroupAdapter();
			}
			@Override
			public Adapter caseRootdevicevolume(Rootdevicevolume object) {
				return createRootdevicevolumeAdapter();
			}
			@Override
			public Adapter caseStatustransitionreason(Statustransitionreason object) {
				return createStatustransitionreasonAdapter();
			}
			@Override
			public Adapter caseTags(Tags object) {
				return createTagsAdapter();
			}
			@Override
			public Adapter caseInstancevpcinfo(Instancevpcinfo object) {
				return createInstancevpcinfoAdapter();
			}
			@Override
			public Adapter caseEurope(Europe object) {
				return createEuropeAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseCompute(Compute object) {
				return createComputeAdapter();
			}
			@Override
			public Adapter caseCloudaccount(Cloudaccount object) {
				return createCloudaccountAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter caseCloudcredential(Cloudcredential object) {
				return createCloudcredentialAdapter();
			}
			@Override
			public Adapter caseResource_tpl(Resource_tpl object) {
				return createResource_tplAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2 <em>Instanceec2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2
	 * @generated
	 */
	public Adapter createInstanceec2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount <em>Awsaccount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount
	 * @generated
	 */
	public Adapter createAwsaccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Awscredential <em>Awscredential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Awscredential
	 * @generated
	 */
	public Adapter createAwscredentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano <em>T2 nano</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano
	 * @generated
	 */
	public Adapter createT2_nanoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro <em>T2 micro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro
	 * @generated
	 */
	public Adapter createT2_microAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small <em>T2 small</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small
	 * @generated
	 */
	public Adapter createT2_smallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium <em>T2 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium
	 * @generated
	 */
	public Adapter createT2_mediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large <em>T2 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large
	 * @generated
	 */
	public Adapter createT2_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge <em>T2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge
	 * @generated
	 */
	public Adapter createT2_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge <em>T2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge
	 * @generated
	 */
	public Adapter createT2_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large <em>M5 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large
	 * @generated
	 */
	public Adapter createM5_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge <em>M5 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge
	 * @generated
	 */
	public Adapter createM5_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge <em>M5 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge
	 * @generated
	 */
	public Adapter createM5_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge <em>M5 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge
	 * @generated
	 */
	public Adapter createM5_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge <em>M5 12xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge
	 * @generated
	 */
	public Adapter createM5_12xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge <em>M5 24xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge
	 * @generated
	 */
	public Adapter createM5_24xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large <em>M4 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large
	 * @generated
	 */
	public Adapter createM4_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge <em>M4 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge
	 * @generated
	 */
	public Adapter createM4_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge <em>M4 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge
	 * @generated
	 */
	public Adapter createM4_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge <em>M4 10xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge
	 * @generated
	 */
	public Adapter createM4_10xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge <em>M4 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge
	 * @generated
	 */
	public Adapter createM4_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium <em>M3 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium
	 * @generated
	 */
	public Adapter createM3_mediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large <em>M3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large
	 * @generated
	 */
	public Adapter createM3_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge <em>M3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge
	 * @generated
	 */
	public Adapter createM3_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge <em>M3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge
	 * @generated
	 */
	public Adapter createM3_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large <em>C5 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large
	 * @generated
	 */
	public Adapter createC5_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge <em>C5 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge
	 * @generated
	 */
	public Adapter createC5_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge <em>C5 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge
	 * @generated
	 */
	public Adapter createC5_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge <em>C5 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge
	 * @generated
	 */
	public Adapter createC5_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge <em>C5 9xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge
	 * @generated
	 */
	public Adapter createC5_9xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge <em>C5 18xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge
	 * @generated
	 */
	public Adapter createC5_18xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large <em>C4 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large
	 * @generated
	 */
	public Adapter createC4_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge <em>C4 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge
	 * @generated
	 */
	public Adapter createC4_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge <em>C4 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge
	 * @generated
	 */
	public Adapter createC4_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge <em>C4 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge
	 * @generated
	 */
	public Adapter createC4_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge <em>C4 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge
	 * @generated
	 */
	public Adapter createC4_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large <em>C3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large
	 * @generated
	 */
	public Adapter createC3_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge <em>C3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge
	 * @generated
	 */
	public Adapter createC3_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge <em>C3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge
	 * @generated
	 */
	public Adapter createC3_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge <em>C3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge
	 * @generated
	 */
	public Adapter createC3_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge <em>C3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge
	 * @generated
	 */
	public Adapter createC3_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge <em>X1e xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge
	 * @generated
	 */
	public Adapter createX1e_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge <em>X1e 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge
	 * @generated
	 */
	public Adapter createX1e_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge <em>X1e 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge
	 * @generated
	 */
	public Adapter createX1e_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge <em>X1e 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge
	 * @generated
	 */
	public Adapter createX1e_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge <em>X1e 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge
	 * @generated
	 */
	public Adapter createX1e_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge <em>X1e 32xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge
	 * @generated
	 */
	public Adapter createX1e_32xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge <em>X1 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge
	 * @generated
	 */
	public Adapter createX1_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge <em>X1 32xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge
	 * @generated
	 */
	public Adapter createX1_32xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large <em>R4 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large
	 * @generated
	 */
	public Adapter createR4_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge <em>R4 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge
	 * @generated
	 */
	public Adapter createR4_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge <em>R4 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge
	 * @generated
	 */
	public Adapter createR4_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge <em>R4 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge
	 * @generated
	 */
	public Adapter createR4_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge <em>R4 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge
	 * @generated
	 */
	public Adapter createR4_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge <em>R4 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge
	 * @generated
	 */
	public Adapter createR4_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large <em>R3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large
	 * @generated
	 */
	public Adapter createR3_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge <em>R3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge
	 * @generated
	 */
	public Adapter createR3_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge <em>R3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge
	 * @generated
	 */
	public Adapter createR3_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge <em>R3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge
	 * @generated
	 */
	public Adapter createR3_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge <em>R3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge
	 * @generated
	 */
	public Adapter createR3_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge <em>P3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge
	 * @generated
	 */
	public Adapter createP3_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge <em>P3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge
	 * @generated
	 */
	public Adapter createP3_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge <em>P3 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge
	 * @generated
	 */
	public Adapter createP3_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge <em>P2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge
	 * @generated
	 */
	public Adapter createP2_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge <em>P2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge
	 * @generated
	 */
	public Adapter createP2_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge <em>P2 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge
	 * @generated
	 */
	public Adapter createP2_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Generalpurpose <em>Generalpurpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Generalpurpose
	 * @generated
	 */
	public Adapter createGeneralpurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Computeoptimized <em>Computeoptimized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Computeoptimized
	 * @generated
	 */
	public Adapter createComputeoptimizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Memoryoptimized <em>Memoryoptimized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Memoryoptimized
	 * @generated
	 */
	public Adapter createMemoryoptimizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Acceleratedcomputing <em>Acceleratedcomputing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Acceleratedcomputing
	 * @generated
	 */
	public Adapter createAcceleratedcomputingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Storageoptimized <em>Storageoptimized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Storageoptimized
	 * @generated
	 */
	public Adapter createStorageoptimizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge <em>G3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge
	 * @generated
	 */
	public Adapter createG3_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge <em>G3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge
	 * @generated
	 */
	public Adapter createG3_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge <em>G3 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge
	 * @generated
	 */
	public Adapter createG3_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge <em>F1 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge
	 * @generated
	 */
	public Adapter createF1_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge <em>F1 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge
	 * @generated
	 */
	public Adapter createF1_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge <em>H1 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge
	 * @generated
	 */
	public Adapter createH1_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge <em>H1 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge
	 * @generated
	 */
	public Adapter createH1_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge <em>H1 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge
	 * @generated
	 */
	public Adapter createH1_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge <em>H1 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge
	 * @generated
	 */
	public Adapter createH1_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large <em>I3 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large
	 * @generated
	 */
	public Adapter createI3_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge <em>I3 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge
	 * @generated
	 */
	public Adapter createI3_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge <em>I3 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge
	 * @generated
	 */
	public Adapter createI3_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge <em>I3 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge
	 * @generated
	 */
	public Adapter createI3_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge <em>I3 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge
	 * @generated
	 */
	public Adapter createI3_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge <em>I3 16xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge
	 * @generated
	 */
	public Adapter createI3_16xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal <em>I3 metal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal
	 * @generated
	 */
	public Adapter createI3_metalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge <em>D2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge
	 * @generated
	 */
	public Adapter createD2_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge <em>D2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge
	 * @generated
	 */
	public Adapter createD2_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge <em>D2 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge
	 * @generated
	 */
	public Adapter createD2_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge <em>D2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge
	 * @generated
	 */
	public Adapter createD2_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Us_east_1 <em>Us east 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Us_east_1
	 * @generated
	 */
	public Adapter createUs_east_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Us_east_2 <em>Us east 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Us_east_2
	 * @generated
	 */
	public Adapter createUs_east_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Us_west_1 <em>Us west 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Us_west_1
	 * @generated
	 */
	public Adapter createUs_west_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Us_west_2 <em>Us west 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Us_west_2
	 * @generated
	 */
	public Adapter createUs_west_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ca_central_1 <em>Ca central 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ca_central_1
	 * @generated
	 */
	public Adapter createCa_central_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_central_1 <em>Eu central 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_central_1
	 * @generated
	 */
	public Adapter createEu_central_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_west_1 <em>Eu west 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_west_1
	 * @generated
	 */
	public Adapter createEu_west_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_west_2 <em>Eu west 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_west_2
	 * @generated
	 */
	public Adapter createEu_west_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_west_3 <em>Eu west 3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Eu_west_3
	 * @generated
	 */
	public Adapter createEu_west_3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_northeast_1 <em>Ap northeast 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_northeast_1
	 * @generated
	 */
	public Adapter createAp_northeast_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_northeast_2 <em>Ap northeast 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_northeast_2
	 * @generated
	 */
	public Adapter createAp_northeast_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_southeast_1 <em>Ap southeast 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_southeast_1
	 * @generated
	 */
	public Adapter createAp_southeast_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_south_east2 <em>Ap south east2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_south_east2
	 * @generated
	 */
	public Adapter createAp_south_east2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_south_1 <em>Ap south 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ap_south_1
	 * @generated
	 */
	public Adapter createAp_south_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Sa_east_1 <em>Sa east 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Sa_east_1
	 * @generated
	 */
	public Adapter createSa_east_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small <em>M1 small</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small
	 * @generated
	 */
	public Adapter createM1_smallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro <em>T1 micro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro
	 * @generated
	 */
	public Adapter createT1_microAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium <em>M1 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium
	 * @generated
	 */
	public Adapter createM1_mediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large <em>M1 large</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large
	 * @generated
	 */
	public Adapter createM1_largeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge <em>M1 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge
	 * @generated
	 */
	public Adapter createM1_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium <em>C1 medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium
	 * @generated
	 */
	public Adapter createC1_mediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge <em>C1 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge
	 * @generated
	 */
	public Adapter createC1_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge <em>Cc2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge
	 * @generated
	 */
	public Adapter createCc2_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge <em>G2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge
	 * @generated
	 */
	public Adapter createG2_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge <em>G2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge
	 * @generated
	 */
	public Adapter createG2_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge <em>Cg1 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge
	 * @generated
	 */
	public Adapter createCg1_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge <em>M2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge
	 * @generated
	 */
	public Adapter createM2_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge <em>M2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge
	 * @generated
	 */
	public Adapter createM2_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge <em>M2 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge
	 * @generated
	 */
	public Adapter createM2_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge <em>Cr1 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge
	 * @generated
	 */
	public Adapter createCr1_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge <em>I2 xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge
	 * @generated
	 */
	public Adapter createI2_xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge <em>I2 2xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge
	 * @generated
	 */
	public Adapter createI2_2xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge <em>I2 4xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge
	 * @generated
	 */
	public Adapter createI2_4xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge <em>I2 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge
	 * @generated
	 */
	public Adapter createI2_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge <em>Hs1 8xlarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge
	 * @generated
	 */
	public Adapter createHs1_8xlargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup <em>Placementgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup
	 * @generated
	 */
	public Adapter createPlacementgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume <em>Rootdevicevolume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume
	 * @generated
	 */
	public Adapter createRootdevicevolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason <em>Statustransitionreason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason
	 * @generated
	 */
	public Adapter createStatustransitionreasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Tags
	 * @generated
	 */
	public Adapter createTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo <em>Instancevpcinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo
	 * @generated
	 */
	public Adapter createInstancevpcinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Europe <em>Europe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Europe
	 * @generated
	 */
	public Adapter createEuropeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.infrastructure.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute
	 * @generated
	 */
	public Adapter createComputeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount <em>Cloudaccount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount
	 * @generated
	 */
	public Adapter createCloudaccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	public Adapter createMixinBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential <em>Cloudcredential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential
	 * @generated
	 */
	public Adapter createCloudcredentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.infrastructure.Resource_tpl <em>Resource tpl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.infrastructure.Resource_tpl
	 * @generated
	 */
	public Adapter createResource_tplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.regions.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ec2AdapterFactory
