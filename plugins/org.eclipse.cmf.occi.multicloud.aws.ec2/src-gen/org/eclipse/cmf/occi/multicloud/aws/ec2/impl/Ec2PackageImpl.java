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

import java.io.IOException;

import java.net.URL;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Factory;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;

import org.eclipse.cmf.occi.multicloud.aws.ec2.util.Ec2Validator;

import org.eclipse.cmf.occi.multicloud.regions.RegionsPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ec2PackageImpl extends EPackageImpl implements Ec2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ec2.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceec2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsaccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awscredentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2_nanoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2_microEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2_smallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2_mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t2_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m5_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m5_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m5_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m5_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m5_12xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m5_24xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m4_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m4_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m4_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m4_10xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m4_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m3_mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m3_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m3_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m3_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c5_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c5_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c5_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c5_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c5_9xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c5_18xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c4_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c4_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c4_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c4_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c4_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c3_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c3_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c3_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c3_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c3_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1e_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1e_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1e_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1e_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1e_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1e_32xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x1_32xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r4_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r4_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r4_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r4_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r4_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r4_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r3_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r3_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r3_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r3_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r3_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p3_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p3_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p3_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p2_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p2_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p2_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalpurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeoptimizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryoptimizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceleratedcomputingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageoptimizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass f1_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass f1_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i3_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i3_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i3_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i3_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i3_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i3_16xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i3_metalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d2_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d2_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d2_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass d2_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_east_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_east_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_west_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_west_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ca_central_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_central_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_west_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_west_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_west_3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_northeast_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_northeast_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_southeast_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_south_east2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_south_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sa_east_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m1_smallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t1_microEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m1_mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m1_largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m1_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c1_mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c1_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cc2_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g2_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g2_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cg1_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m2_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cr1_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i2_xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i2_2xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i2_4xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i2_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hs1_8xlargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootdevicevolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statustransitionreasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancevpcinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass europeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum awsInstanceStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hypervisorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceLifeCycleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitoringStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum virtualizationTypeEEnum = null;

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
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ec2PackageImpl() {
		super(eNS_URI, Ec2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Ec2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Ec2Package init() {
		if (isInited) return (Ec2Package)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);

		// Obtain or create and register package
		Ec2PackageImpl theEc2Package = (Ec2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ec2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ec2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RegionsPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		AccountsPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Load packages
		theEc2Package.loadPackage();

		// Fix loaded packages
		theEc2Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEc2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Ec2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEc2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ec2Package.eNS_URI, theEc2Package);
		return theEc2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceec2() {
		if (instanceec2EClass == null) {
			instanceec2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(5);
		}
		return instanceec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_Name() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_InstanceId() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_InstanceType() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_RegionId() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_ZoneName() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_ImageId() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_AwsInstanceStatus() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_LaunchTime() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_AmiLaunchIndex() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_EbsOptimizedIO() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_EnaSupport() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_Hypervisor() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_InstanceLifeCycle() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_KernelId() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_KeyPairName() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_MonitoringState() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_Platform() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PrivateDNSName() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PrivateIpV4Address() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PublicDNSName() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PublicIpv4Address() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_RamDiskId() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_SriovNetSupport() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_VirtualizationType() {
        return (EAttribute)getInstanceec2().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceec2__Terminate() {
        return getInstanceec2().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceec2__Restart__RestartMethod() {
        return getInstanceec2().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceec2__Start() {
        return getInstanceec2().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceec2__Stop__StopMethod() {
        return getInstanceec2().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwsaccount() {
		if (awsaccountEClass == null) {
			awsaccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(6);
		}
		return awsaccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwscredential() {
		if (awscredentialEClass == null) {
			awscredentialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(7);
		}
		return awscredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAwscredential__AppliesConstraint__DiagnosticChain_Map() {
        return getAwscredential().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_nano() {
		if (t2_nanoEClass == null) {
			t2_nanoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(8);
		}
		return t2_nanoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_nano_OcciComputeMemory() {
        return (EAttribute)getT2_nano().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_nano_OcciComputeCores() {
        return (EAttribute)getT2_nano().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_nano_InstanceType() {
        return (EAttribute)getT2_nano().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_micro() {
		if (t2_microEClass == null) {
			t2_microEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(9);
		}
		return t2_microEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_micro_OcciComputeMemory() {
        return (EAttribute)getT2_micro().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_micro_OcciComputeCores() {
        return (EAttribute)getT2_micro().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_micro_InstanceType() {
        return (EAttribute)getT2_micro().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_small() {
		if (t2_smallEClass == null) {
			t2_smallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(10);
		}
		return t2_smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_small_OcciComputeMemory() {
        return (EAttribute)getT2_small().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_small_InstanceType() {
        return (EAttribute)getT2_small().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_small_OcciComputeCores() {
        return (EAttribute)getT2_small().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_medium() {
		if (t2_mediumEClass == null) {
			t2_mediumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(11);
		}
		return t2_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_medium_OcciComputeMemory() {
        return (EAttribute)getT2_medium().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_medium_InstanceType() {
        return (EAttribute)getT2_medium().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_medium_OcciComputeCores() {
        return (EAttribute)getT2_medium().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_large() {
		if (t2_largeEClass == null) {
			t2_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(12);
		}
		return t2_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_large_OcciComputeMemory() {
        return (EAttribute)getT2_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_large_InstanceType() {
        return (EAttribute)getT2_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_large_OcciComputeCores() {
        return (EAttribute)getT2_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_xlarge() {
		if (t2_xlargeEClass == null) {
			t2_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(13);
		}
		return t2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_xlarge_OcciComputeMemory() {
        return (EAttribute)getT2_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_xlarge_InstanceType() {
        return (EAttribute)getT2_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_xlarge_OcciComputeCores() {
        return (EAttribute)getT2_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_2xlarge() {
		if (t2_2xlargeEClass == null) {
			t2_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(14);
		}
		return t2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_2xlarge_OcciComputeMemory() {
        return (EAttribute)getT2_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_2xlarge_InstanceType() {
        return (EAttribute)getT2_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_2xlarge_OcciComputeCores() {
        return (EAttribute)getT2_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_large() {
		if (m5_largeEClass == null) {
			m5_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(15);
		}
		return m5_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_large_OcciComputeMemory() {
        return (EAttribute)getM5_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_large_InstanceType() {
        return (EAttribute)getM5_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_large_OcciComputeCores() {
        return (EAttribute)getM5_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_xlarge() {
		if (m5_xlargeEClass == null) {
			m5_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(16);
		}
		return m5_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_xlarge_OcciComputeMemory() {
        return (EAttribute)getM5_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_xlarge_InstanceType() {
        return (EAttribute)getM5_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_xlarge_OcciComputeCores() {
        return (EAttribute)getM5_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_2xlarge() {
		if (m5_2xlargeEClass == null) {
			m5_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(17);
		}
		return m5_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_2xlarge_OcciComputeMemory() {
        return (EAttribute)getM5_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_2xlarge_InstanceType() {
        return (EAttribute)getM5_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_2xlarge_OcciComputeCores() {
        return (EAttribute)getM5_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_4xlarge() {
		if (m5_4xlargeEClass == null) {
			m5_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(18);
		}
		return m5_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_4xlarge_OcciComputeMemory() {
        return (EAttribute)getM5_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_4xlarge_InstanceType() {
        return (EAttribute)getM5_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_4xlarge_OcciComputeCores() {
        return (EAttribute)getM5_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_12xlarge() {
		if (m5_12xlargeEClass == null) {
			m5_12xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(19);
		}
		return m5_12xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_12xlarge_OcciComputeMemory() {
        return (EAttribute)getM5_12xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_12xlarge_InstanceType() {
        return (EAttribute)getM5_12xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_12xlarge_OcciComputeCores() {
        return (EAttribute)getM5_12xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_24xlarge() {
		if (m5_24xlargeEClass == null) {
			m5_24xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(20);
		}
		return m5_24xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_24xlarge_OcciComputeMemory() {
        return (EAttribute)getM5_24xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_24xlarge_InstanceType() {
        return (EAttribute)getM5_24xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_24xlarge_OcciComputeCores() {
        return (EAttribute)getM5_24xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_large() {
		if (m4_largeEClass == null) {
			m4_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(21);
		}
		return m4_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_large_OcciComputeMemory() {
        return (EAttribute)getM4_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_large_InstanceType() {
        return (EAttribute)getM4_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_large_OcciComputeCores() {
        return (EAttribute)getM4_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_xlarge() {
		if (m4_xlargeEClass == null) {
			m4_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(22);
		}
		return m4_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_xlarge_OcciComputeMemory() {
        return (EAttribute)getM4_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_xlarge_InstanceType() {
        return (EAttribute)getM4_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_xlarge_OcciComputeCores() {
        return (EAttribute)getM4_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_2xlarge() {
		if (m4_2xlargeEClass == null) {
			m4_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(23);
		}
		return m4_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_2xlarge_OcciComputeMemory() {
        return (EAttribute)getM4_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_2xlarge_InstanceType() {
        return (EAttribute)getM4_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_2xlarge_OcciComputeCores() {
        return (EAttribute)getM4_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_10xlarge() {
		if (m4_10xlargeEClass == null) {
			m4_10xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(24);
		}
		return m4_10xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_10xlarge_OcciComputeMemory() {
        return (EAttribute)getM4_10xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_10xlarge_InstanceType() {
        return (EAttribute)getM4_10xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_10xlarge_OcciComputeCores() {
        return (EAttribute)getM4_10xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_16xlarge() {
		if (m4_16xlargeEClass == null) {
			m4_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(25);
		}
		return m4_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_16xlarge_OcciComputeMemory() {
        return (EAttribute)getM4_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_16xlarge_InstanceType() {
        return (EAttribute)getM4_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_16xlarge_OcciComputeCores() {
        return (EAttribute)getM4_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_medium() {
		if (m3_mediumEClass == null) {
			m3_mediumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(26);
		}
		return m3_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_OcciComputeMemory() {
        return (EAttribute)getM3_medium().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_InstanceType() {
        return (EAttribute)getM3_medium().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_OcciComputeCores() {
        return (EAttribute)getM3_medium().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM3_medium().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_large() {
		if (m3_largeEClass == null) {
			m3_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(27);
		}
		return m3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_OcciComputeMemory() {
        return (EAttribute)getM3_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_InstanceType() {
        return (EAttribute)getM3_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_OcciComputeCores() {
        return (EAttribute)getM3_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM3_large().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_xlarge() {
		if (m3_xlargeEClass == null) {
			m3_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(28);
		}
		return m3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_OcciComputeMemory() {
        return (EAttribute)getM3_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_InstanceType() {
        return (EAttribute)getM3_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_OcciComputeCores() {
        return (EAttribute)getM3_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM3_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_2xlarge() {
		if (m3_2xlargeEClass == null) {
			m3_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(29);
		}
		return m3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_OcciComputeMemory() {
        return (EAttribute)getM3_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_InstanceType() {
        return (EAttribute)getM3_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_OcciComputeCores() {
        return (EAttribute)getM3_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM3_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_large() {
		if (c5_largeEClass == null) {
			c5_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(30);
		}
		return c5_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_large_OcciComputeMemory() {
        return (EAttribute)getC5_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_large_InstanceType() {
        return (EAttribute)getC5_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_large_OcciComputeCores() {
        return (EAttribute)getC5_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_xlarge() {
		if (c5_xlargeEClass == null) {
			c5_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(31);
		}
		return c5_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_xlarge_OcciComputeMemory() {
        return (EAttribute)getC5_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_xlarge_InstanceType() {
        return (EAttribute)getC5_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_xlarge_OcciComputeCores() {
        return (EAttribute)getC5_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_2xlarge() {
		if (c5_2xlargeEClass == null) {
			c5_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(32);
		}
		return c5_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_2xlarge_OcciComputeMemory() {
        return (EAttribute)getC5_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_2xlarge_InstanceType() {
        return (EAttribute)getC5_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_2xlarge_OcciComputeCores() {
        return (EAttribute)getC5_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_4xlarge() {
		if (c5_4xlargeEClass == null) {
			c5_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(33);
		}
		return c5_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_4xlarge_OcciComputeMemory() {
        return (EAttribute)getC5_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_4xlarge_InstanceType() {
        return (EAttribute)getC5_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_4xlarge_OcciComputeCores() {
        return (EAttribute)getC5_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_9xlarge() {
		if (c5_9xlargeEClass == null) {
			c5_9xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(34);
		}
		return c5_9xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_9xlarge_OcciComputeMemory() {
        return (EAttribute)getC5_9xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_9xlarge_InstanceType() {
        return (EAttribute)getC5_9xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_9xlarge_OcciComputeCores() {
        return (EAttribute)getC5_9xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_18xlarge() {
		if (c5_18xlargeEClass == null) {
			c5_18xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(35);
		}
		return c5_18xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_18xlarge_OcciComputeMemory() {
        return (EAttribute)getC5_18xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_18xlarge_InstanceType() {
        return (EAttribute)getC5_18xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_18xlarge_OcciComputeCores() {
        return (EAttribute)getC5_18xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_large() {
		if (c4_largeEClass == null) {
			c4_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(36);
		}
		return c4_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_large_OcciComputeMemory() {
        return (EAttribute)getC4_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_large_InstanceType() {
        return (EAttribute)getC4_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_large_OcciComputeCores() {
        return (EAttribute)getC4_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_xlarge() {
		if (c4_xlargeEClass == null) {
			c4_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(37);
		}
		return c4_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_xlarge_OcciComputeMemory() {
        return (EAttribute)getC4_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_xlarge_InstanceType() {
        return (EAttribute)getC4_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_xlarge_OcciComputeCores() {
        return (EAttribute)getC4_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_2xlarge() {
		if (c4_2xlargeEClass == null) {
			c4_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(38);
		}
		return c4_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_2xlarge_OcciComputeMemory() {
        return (EAttribute)getC4_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_2xlarge_InstanceType() {
        return (EAttribute)getC4_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_2xlarge_OcciComputeCores() {
        return (EAttribute)getC4_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_4xlarge() {
		if (c4_4xlargeEClass == null) {
			c4_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(39);
		}
		return c4_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_4xlarge_OcciComputeMemory() {
        return (EAttribute)getC4_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_4xlarge_InstanceType() {
        return (EAttribute)getC4_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_4xlarge_OcciComputeCores() {
        return (EAttribute)getC4_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_8xlarge() {
		if (c4_8xlargeEClass == null) {
			c4_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(40);
		}
		return c4_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_8xlarge_OcciComputeMemory() {
        return (EAttribute)getC4_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_8xlarge_InstanceType() {
        return (EAttribute)getC4_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_8xlarge_OcciComputeCores() {
        return (EAttribute)getC4_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_large() {
		if (c3_largeEClass == null) {
			c3_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(41);
		}
		return c3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_OcciComputeMemory() {
        return (EAttribute)getC3_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_InstanceType() {
        return (EAttribute)getC3_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_OcciComputeCores() {
        return (EAttribute)getC3_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getC3_large().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_xlarge() {
		if (c3_xlargeEClass == null) {
			c3_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(42);
		}
		return c3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_OcciComputeMemory() {
        return (EAttribute)getC3_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_InstanceType() {
        return (EAttribute)getC3_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_OcciComputeCores() {
        return (EAttribute)getC3_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getC3_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_2xlarge() {
		if (c3_2xlargeEClass == null) {
			c3_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(43);
		}
		return c3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_OcciComputeMemory() {
        return (EAttribute)getC3_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_InstanceType() {
        return (EAttribute)getC3_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_OcciComputeCores() {
        return (EAttribute)getC3_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getC3_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_4xlarge() {
		if (c3_4xlargeEClass == null) {
			c3_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(44);
		}
		return c3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_OcciComputeMemory() {
        return (EAttribute)getC3_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_InstanceType() {
        return (EAttribute)getC3_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_OcciComputeCores() {
        return (EAttribute)getC3_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getC3_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_8xlarge() {
		if (c3_8xlargeEClass == null) {
			c3_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(45);
		}
		return c3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_OcciComputeMemory() {
        return (EAttribute)getC3_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_InstanceType() {
        return (EAttribute)getC3_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_OcciComputeCores() {
        return (EAttribute)getC3_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getC3_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_xlarge() {
		if (x1e_xlargeEClass == null) {
			x1e_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(46);
		}
		return x1e_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_OcciComputeMemory() {
        return (EAttribute)getX1e_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_InstanceType() {
        return (EAttribute)getX1e_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_OcciComputeCores() {
        return (EAttribute)getX1e_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1e_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_2xlarge() {
		if (x1e_2xlargeEClass == null) {
			x1e_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(47);
		}
		return x1e_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_OcciComputeMemory() {
        return (EAttribute)getX1e_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_InstanceType() {
        return (EAttribute)getX1e_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_OcciComputeCores() {
        return (EAttribute)getX1e_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1e_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_4xlarge() {
		if (x1e_4xlargeEClass == null) {
			x1e_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(48);
		}
		return x1e_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_OcciComputeMemory() {
        return (EAttribute)getX1e_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_InstanceType() {
        return (EAttribute)getX1e_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_OcciComputeCores() {
        return (EAttribute)getX1e_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1e_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_8xlarge() {
		if (x1e_8xlargeEClass == null) {
			x1e_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(49);
		}
		return x1e_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_OcciComputeMemory() {
        return (EAttribute)getX1e_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_InstanceType() {
        return (EAttribute)getX1e_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_OcciComputeCores() {
        return (EAttribute)getX1e_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1e_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_16xlarge() {
		if (x1e_16xlargeEClass == null) {
			x1e_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(50);
		}
		return x1e_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_OcciComputeMemory() {
        return (EAttribute)getX1e_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_InstanceType() {
        return (EAttribute)getX1e_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_OcciComputeCores() {
        return (EAttribute)getX1e_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1e_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_32xlarge() {
		if (x1e_32xlargeEClass == null) {
			x1e_32xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(51);
		}
		return x1e_32xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_OcciComputeMemory() {
        return (EAttribute)getX1e_32xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_InstanceType() {
        return (EAttribute)getX1e_32xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_OcciComputeCores() {
        return (EAttribute)getX1e_32xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1e_32xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1_16xlarge() {
		if (x1_16xlargeEClass == null) {
			x1_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(52);
		}
		return x1_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_OcciComputeMemory() {
        return (EAttribute)getX1_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_InstanceType() {
        return (EAttribute)getX1_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_OcciComputeCores() {
        return (EAttribute)getX1_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1_32xlarge() {
		if (x1_32xlargeEClass == null) {
			x1_32xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(53);
		}
		return x1_32xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_OcciComputeMemory() {
        return (EAttribute)getX1_32xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_InstanceType() {
        return (EAttribute)getX1_32xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_OcciComputeCores() {
        return (EAttribute)getX1_32xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getX1_32xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_large() {
		if (r4_largeEClass == null) {
			r4_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(54);
		}
		return r4_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_large_OcciComputeMemory() {
        return (EAttribute)getR4_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_large_InstanceType() {
        return (EAttribute)getR4_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_large_OcciComputeCores() {
        return (EAttribute)getR4_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_xlarge() {
		if (r4_xlargeEClass == null) {
			r4_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(55);
		}
		return r4_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_xlarge_OcciComputeMemory() {
        return (EAttribute)getR4_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_xlarge_InstanceType() {
        return (EAttribute)getR4_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_xlarge_OcciComputeCores() {
        return (EAttribute)getR4_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_2xlarge() {
		if (r4_2xlargeEClass == null) {
			r4_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(56);
		}
		return r4_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_2xlarge_OcciComputeMemory() {
        return (EAttribute)getR4_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_2xlarge_InstanceType() {
        return (EAttribute)getR4_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_2xlarge_OcciComputeCores() {
        return (EAttribute)getR4_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_4xlarge() {
		if (r4_4xlargeEClass == null) {
			r4_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(57);
		}
		return r4_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_4xlarge_OcciComputeMemory() {
        return (EAttribute)getR4_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_4xlarge_InstanceType() {
        return (EAttribute)getR4_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_4xlarge_OcciComputeCores() {
        return (EAttribute)getR4_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_8xlarge() {
		if (r4_8xlargeEClass == null) {
			r4_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(58);
		}
		return r4_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_8xlarge_OcciComputeMemory() {
        return (EAttribute)getR4_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_8xlarge_InstanceType() {
        return (EAttribute)getR4_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_8xlarge_OcciComputeCores() {
        return (EAttribute)getR4_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_16xlarge() {
		if (r4_16xlargeEClass == null) {
			r4_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(59);
		}
		return r4_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_16xlarge_OcciComputeMemory() {
        return (EAttribute)getR4_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_16xlarge_InstanceType() {
        return (EAttribute)getR4_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_16xlarge_OcciComputeCores() {
        return (EAttribute)getR4_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_large() {
		if (r3_largeEClass == null) {
			r3_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(60);
		}
		return r3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_OcciComputeMemory() {
        return (EAttribute)getR3_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_InstanceType() {
        return (EAttribute)getR3_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_OcciComputeCores() {
        return (EAttribute)getR3_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getR3_large().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_xlarge() {
		if (r3_xlargeEClass == null) {
			r3_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(61);
		}
		return r3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_OcciComputeMemory() {
        return (EAttribute)getR3_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_InstanceType() {
        return (EAttribute)getR3_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_OcciComputeCores() {
        return (EAttribute)getR3_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getR3_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_2xlarge() {
		if (r3_2xlargeEClass == null) {
			r3_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(62);
		}
		return r3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_OcciComputeMemory() {
        return (EAttribute)getR3_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_InstanceType() {
        return (EAttribute)getR3_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_OcciComputeCores() {
        return (EAttribute)getR3_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getR3_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_4xlarge() {
		if (r3_4xlargeEClass == null) {
			r3_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(63);
		}
		return r3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_OcciComputeMemory() {
        return (EAttribute)getR3_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_InstanceType() {
        return (EAttribute)getR3_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_OcciComputeCores() {
        return (EAttribute)getR3_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getR3_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_8xlarge() {
		if (r3_8xlargeEClass == null) {
			r3_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(64);
		}
		return r3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_OcciComputeMemory() {
        return (EAttribute)getR3_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_InstanceType() {
        return (EAttribute)getR3_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_OcciComputeCores() {
        return (EAttribute)getR3_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getR3_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP3_2xlarge() {
		if (p3_2xlargeEClass == null) {
			p3_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(65);
		}
		return p3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_OcciComputeMemory() {
        return (EAttribute)getP3_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_InstanceType() {
        return (EAttribute)getP3_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_OcciComputeCores() {
        return (EAttribute)getP3_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_Gpus() {
        return (EAttribute)getP3_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_GpuMemory() {
        return (EAttribute)getP3_2xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_GpuP2P() {
        return (EAttribute)getP3_2xlarge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP3_8xlarge() {
		if (p3_8xlargeEClass == null) {
			p3_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(66);
		}
		return p3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_OcciComputeMemory() {
        return (EAttribute)getP3_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_InstanceType() {
        return (EAttribute)getP3_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_OcciComputeCores() {
        return (EAttribute)getP3_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_Gpus() {
        return (EAttribute)getP3_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_GpuMemory() {
        return (EAttribute)getP3_8xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_GpuP2P() {
        return (EAttribute)getP3_8xlarge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP3_16xlarge() {
		if (p3_16xlargeEClass == null) {
			p3_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(67);
		}
		return p3_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_OcciComputeMemory() {
        return (EAttribute)getP3_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_InstanceType() {
        return (EAttribute)getP3_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_OcciComputeCores() {
        return (EAttribute)getP3_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_Gpus() {
        return (EAttribute)getP3_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_GpuMemory() {
        return (EAttribute)getP3_16xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_GpuP2P() {
        return (EAttribute)getP3_16xlarge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2_xlarge() {
		if (p2_xlargeEClass == null) {
			p2_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(68);
		}
		return p2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_OcciComputeMemory() {
        return (EAttribute)getP2_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_InstanceType() {
        return (EAttribute)getP2_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_OcciComputeCores() {
        return (EAttribute)getP2_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_Gpus() {
        return (EAttribute)getP2_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_GpuMemory() {
        return (EAttribute)getP2_xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_GpuP2P() {
        return (EAttribute)getP2_xlarge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2_8xlarge() {
		if (p2_8xlargeEClass == null) {
			p2_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(69);
		}
		return p2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_OcciComputeMemory() {
        return (EAttribute)getP2_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_InstanceType() {
        return (EAttribute)getP2_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_OcciComputeCores() {
        return (EAttribute)getP2_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_Gpus() {
        return (EAttribute)getP2_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_GpuMemory() {
        return (EAttribute)getP2_8xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_GpuP2P() {
        return (EAttribute)getP2_8xlarge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2_16xlarge() {
		if (p2_16xlargeEClass == null) {
			p2_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(70);
		}
		return p2_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_OcciComputeMemory() {
        return (EAttribute)getP2_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_InstanceType() {
        return (EAttribute)getP2_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_OcciComputeCores() {
        return (EAttribute)getP2_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_Gpus() {
        return (EAttribute)getP2_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_GpuMemory() {
        return (EAttribute)getP2_16xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_GpuP2P() {
        return (EAttribute)getP2_16xlarge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralpurpose() {
		if (generalpurposeEClass == null) {
			generalpurposeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(71);
		}
		return generalpurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputeoptimized() {
		if (computeoptimizedEClass == null) {
			computeoptimizedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(72);
		}
		return computeoptimizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeoptimized__AppliesConstraint__DiagnosticChain_Map() {
        return getComputeoptimized().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryoptimized() {
		if (memoryoptimizedEClass == null) {
			memoryoptimizedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(73);
		}
		return memoryoptimizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemoryoptimized__AppliesConstraint__DiagnosticChain_Map() {
        return getMemoryoptimized().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceleratedcomputing() {
		if (acceleratedcomputingEClass == null) {
			acceleratedcomputingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(74);
		}
		return acceleratedcomputingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceleratedcomputing__AppliesConstraint__DiagnosticChain_Map() {
        return getAcceleratedcomputing().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageoptimized() {
		if (storageoptimizedEClass == null) {
			storageoptimizedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(75);
		}
		return storageoptimizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStorageoptimized__AppliesConstraint__DiagnosticChain_Map() {
        return getStorageoptimized().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_4xlarge() {
		if (g3_4xlargeEClass == null) {
			g3_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(76);
		}
		return g3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_OcciComputeMemory() {
        return (EAttribute)getG3_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_InstanceType() {
        return (EAttribute)getG3_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_OcciComputeCores() {
        return (EAttribute)getG3_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_Gpus() {
        return (EAttribute)getG3_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_GpuMemory() {
        return (EAttribute)getG3_4xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_8xlarge() {
		if (g3_8xlargeEClass == null) {
			g3_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(77);
		}
		return g3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_OcciComputeMemory() {
        return (EAttribute)getG3_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_InstanceType() {
        return (EAttribute)getG3_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_OcciComputeCores() {
        return (EAttribute)getG3_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_Gpus() {
        return (EAttribute)getG3_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_GpuMemory() {
        return (EAttribute)getG3_8xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_16xlarge() {
		if (g3_16xlargeEClass == null) {
			g3_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(78);
		}
		return g3_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_OcciComputeMemory() {
        return (EAttribute)getG3_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_InstanceType() {
        return (EAttribute)getG3_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_OcciComputeCores() {
        return (EAttribute)getG3_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_Gpus() {
        return (EAttribute)getG3_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_GpuMemory() {
        return (EAttribute)getG3_16xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getF1_2xlarge() {
		if (f1_2xlargeEClass == null) {
			f1_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(79);
		}
		return f1_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_OcciComputeMemory() {
        return (EAttribute)getF1_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_InstanceType() {
        return (EAttribute)getF1_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_OcciComputeCores() {
        return (EAttribute)getF1_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_Fpga() {
        return (EAttribute)getF1_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getF1_2xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getF1_16xlarge() {
		if (f1_16xlargeEClass == null) {
			f1_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(80);
		}
		return f1_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_OcciComputeMemory() {
        return (EAttribute)getF1_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_InstanceType() {
        return (EAttribute)getF1_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_OcciComputeCores() {
        return (EAttribute)getF1_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_Fpga() {
        return (EAttribute)getF1_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getF1_16xlarge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_2xlarge() {
		if (h1_2xlargeEClass == null) {
			h1_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(81);
		}
		return h1_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_OcciComputeMemory() {
        return (EAttribute)getH1_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_InstanceType() {
        return (EAttribute)getH1_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_OcciComputeCores() {
        return (EAttribute)getH1_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getH1_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_4xlarge() {
		if (h1_4xlargeEClass == null) {
			h1_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(82);
		}
		return h1_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_OcciComputeMemory() {
        return (EAttribute)getH1_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_InstanceType() {
        return (EAttribute)getH1_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_OcciComputeCores() {
        return (EAttribute)getH1_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getH1_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_8xlarge() {
		if (h1_8xlargeEClass == null) {
			h1_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(83);
		}
		return h1_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_OcciComputeMemory() {
        return (EAttribute)getH1_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_InstanceType() {
        return (EAttribute)getH1_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_OcciComputeCores() {
        return (EAttribute)getH1_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getH1_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_16xlarge() {
		if (h1_16xlargeEClass == null) {
			h1_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(84);
		}
		return h1_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_OcciComputeMemory() {
        return (EAttribute)getH1_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_InstanceType() {
        return (EAttribute)getH1_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_OcciComputeCores() {
        return (EAttribute)getH1_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getH1_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_large() {
		if (i3_largeEClass == null) {
			i3_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(85);
		}
		return i3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_OcciComputeMemory() {
        return (EAttribute)getI3_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_InstanceType() {
        return (EAttribute)getI3_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_OcciComputeCores() {
        return (EAttribute)getI3_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI3_large().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_xlarge() {
		if (i3_xlargeEClass == null) {
			i3_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(86);
		}
		return i3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_OcciComputeMemory() {
        return (EAttribute)getI3_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_InstanceType() {
        return (EAttribute)getI3_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_OcciComputeCores() {
        return (EAttribute)getI3_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI3_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_2xlarge() {
		if (i3_2xlargeEClass == null) {
			i3_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(87);
		}
		return i3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_OcciComputeMemory() {
        return (EAttribute)getI3_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_InstanceType() {
        return (EAttribute)getI3_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_OcciComputeCores() {
        return (EAttribute)getI3_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI3_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_4xlarge() {
		if (i3_4xlargeEClass == null) {
			i3_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(88);
		}
		return i3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_OcciComputeMemory() {
        return (EAttribute)getI3_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_InstanceType() {
        return (EAttribute)getI3_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_OcciComputeCores() {
        return (EAttribute)getI3_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI3_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_8xlarge() {
		if (i3_8xlargeEClass == null) {
			i3_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(89);
		}
		return i3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_OcciComputeMemory() {
        return (EAttribute)getI3_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_InstanceType() {
        return (EAttribute)getI3_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_OcciComputeCores() {
        return (EAttribute)getI3_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI3_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_16xlarge() {
		if (i3_16xlargeEClass == null) {
			i3_16xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(90);
		}
		return i3_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_OcciComputeMemory() {
        return (EAttribute)getI3_16xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_InstanceType() {
        return (EAttribute)getI3_16xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_OcciComputeCores() {
        return (EAttribute)getI3_16xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI3_16xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_metal() {
		if (i3_metalEClass == null) {
			i3_metalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(91);
		}
		return i3_metalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_OcciComputeMemory() {
        return (EAttribute)getI3_metal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_InstanceType() {
        return (EAttribute)getI3_metal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_OcciComputeCores() {
        return (EAttribute)getI3_metal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI3_metal().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_xlarge() {
		if (d2_xlargeEClass == null) {
			d2_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(92);
		}
		return d2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_OcciComputeMemory() {
        return (EAttribute)getD2_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_InstanceType() {
        return (EAttribute)getD2_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_OcciComputeCores() {
        return (EAttribute)getD2_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getD2_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_2xlarge() {
		if (d2_2xlargeEClass == null) {
			d2_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(93);
		}
		return d2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_OcciComputeMemory() {
        return (EAttribute)getD2_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_InstanceType() {
        return (EAttribute)getD2_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_OcciComputeCores() {
        return (EAttribute)getD2_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getD2_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_4xlarge() {
		if (d2_4xlargeEClass == null) {
			d2_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(94);
		}
		return d2_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_OcciComputeMemory() {
        return (EAttribute)getD2_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_InstanceType() {
        return (EAttribute)getD2_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_OcciComputeCores() {
        return (EAttribute)getD2_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getD2_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_8xlarge() {
		if (d2_8xlargeEClass == null) {
			d2_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(95);
		}
		return d2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_OcciComputeMemory() {
        return (EAttribute)getD2_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_InstanceType() {
        return (EAttribute)getD2_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_OcciComputeCores() {
        return (EAttribute)getD2_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getD2_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_east_1() {
		if (us_east_1EClass == null) {
			us_east_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(96);
		}
		return us_east_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_RegionName() {
        return (EAttribute)getUs_east_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_Country() {
        return (EAttribute)getUs_east_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_RegionId() {
        return (EAttribute)getUs_east_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_City() {
        return (EAttribute)getUs_east_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_east_2() {
		if (us_east_2EClass == null) {
			us_east_2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(97);
		}
		return us_east_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_RegionName() {
        return (EAttribute)getUs_east_2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_Country() {
        return (EAttribute)getUs_east_2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_RegionId() {
        return (EAttribute)getUs_east_2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_City() {
        return (EAttribute)getUs_east_2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_west_1() {
		if (us_west_1EClass == null) {
			us_west_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(98);
		}
		return us_west_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_RegionName() {
        return (EAttribute)getUs_west_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_Country() {
        return (EAttribute)getUs_west_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_RegionId() {
        return (EAttribute)getUs_west_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_City() {
        return (EAttribute)getUs_west_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_west_2() {
		if (us_west_2EClass == null) {
			us_west_2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(99);
		}
		return us_west_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_RegionName() {
        return (EAttribute)getUs_west_2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_Country() {
        return (EAttribute)getUs_west_2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_RegionId() {
        return (EAttribute)getUs_west_2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_City() {
        return (EAttribute)getUs_west_2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCa_central_1() {
		if (ca_central_1EClass == null) {
			ca_central_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(100);
		}
		return ca_central_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_RegionName() {
        return (EAttribute)getCa_central_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_Country() {
        return (EAttribute)getCa_central_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_RegionId() {
        return (EAttribute)getCa_central_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_City() {
        return (EAttribute)getCa_central_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_central_1() {
		if (eu_central_1EClass == null) {
			eu_central_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(101);
		}
		return eu_central_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_Country() {
        return (EAttribute)getEu_central_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_RegionId() {
        return (EAttribute)getEu_central_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_City() {
        return (EAttribute)getEu_central_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_RegionName() {
        return (EAttribute)getEu_central_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_west_1() {
		if (eu_west_1EClass == null) {
			eu_west_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(102);
		}
		return eu_west_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_RegionName() {
        return (EAttribute)getEu_west_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_Country() {
        return (EAttribute)getEu_west_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_RegionId() {
        return (EAttribute)getEu_west_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_City() {
        return (EAttribute)getEu_west_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_west_2() {
		if (eu_west_2EClass == null) {
			eu_west_2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(103);
		}
		return eu_west_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_RegionName() {
        return (EAttribute)getEu_west_2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_Country() {
        return (EAttribute)getEu_west_2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_RegionId() {
        return (EAttribute)getEu_west_2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_City() {
        return (EAttribute)getEu_west_2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_west_3() {
		if (eu_west_3EClass == null) {
			eu_west_3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(104);
		}
		return eu_west_3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_RegionName() {
        return (EAttribute)getEu_west_3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_Country() {
        return (EAttribute)getEu_west_3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_RegionId() {
        return (EAttribute)getEu_west_3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_City() {
        return (EAttribute)getEu_west_3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_northeast_1() {
		if (ap_northeast_1EClass == null) {
			ap_northeast_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(105);
		}
		return ap_northeast_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_Country() {
        return (EAttribute)getAp_northeast_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_RegionName() {
        return (EAttribute)getAp_northeast_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_RegionId() {
        return (EAttribute)getAp_northeast_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_City() {
        return (EAttribute)getAp_northeast_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_northeast_2() {
		if (ap_northeast_2EClass == null) {
			ap_northeast_2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(106);
		}
		return ap_northeast_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_Country() {
        return (EAttribute)getAp_northeast_2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_RegionName() {
        return (EAttribute)getAp_northeast_2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_RegionId() {
        return (EAttribute)getAp_northeast_2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_City() {
        return (EAttribute)getAp_northeast_2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_southeast_1() {
		if (ap_southeast_1EClass == null) {
			ap_southeast_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(107);
		}
		return ap_southeast_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_Country() {
        return (EAttribute)getAp_southeast_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_RegionName() {
        return (EAttribute)getAp_southeast_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_RegionId() {
        return (EAttribute)getAp_southeast_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_City() {
        return (EAttribute)getAp_southeast_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_south_east2() {
		if (ap_south_east2EClass == null) {
			ap_south_east2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(108);
		}
		return ap_south_east2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_Country() {
        return (EAttribute)getAp_south_east2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_RegionName() {
        return (EAttribute)getAp_south_east2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_RegionId() {
        return (EAttribute)getAp_south_east2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_City() {
        return (EAttribute)getAp_south_east2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_south_1() {
		if (ap_south_1EClass == null) {
			ap_south_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(109);
		}
		return ap_south_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_Country() {
        return (EAttribute)getAp_south_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_RegionName() {
        return (EAttribute)getAp_south_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_RegionId() {
        return (EAttribute)getAp_south_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_City() {
        return (EAttribute)getAp_south_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSa_east_1() {
		if (sa_east_1EClass == null) {
			sa_east_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(110);
		}
		return sa_east_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_Country() {
        return (EAttribute)getSa_east_1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_RegionName() {
        return (EAttribute)getSa_east_1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_RegionId() {
        return (EAttribute)getSa_east_1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_City() {
        return (EAttribute)getSa_east_1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_small() {
		if (m1_smallEClass == null) {
			m1_smallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(111);
		}
		return m1_smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_OcciComputeMemory() {
        return (EAttribute)getM1_small().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_InstanceType() {
        return (EAttribute)getM1_small().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_OcciComputeCores() {
        return (EAttribute)getM1_small().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM1_small().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT1_micro() {
		if (t1_microEClass == null) {
			t1_microEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(112);
		}
		return t1_microEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT1_micro_OcciComputeMemory() {
        return (EAttribute)getT1_micro().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT1_micro_InstanceType() {
        return (EAttribute)getT1_micro().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT1_micro_OcciComputeCores() {
        return (EAttribute)getT1_micro().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_medium() {
		if (m1_mediumEClass == null) {
			m1_mediumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(113);
		}
		return m1_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_OcciComputeMemory() {
        return (EAttribute)getM1_medium().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_InstanceType() {
        return (EAttribute)getM1_medium().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_OcciComputeCores() {
        return (EAttribute)getM1_medium().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM1_medium().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_large() {
		if (m1_largeEClass == null) {
			m1_largeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(114);
		}
		return m1_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_OcciComputeMemory() {
        return (EAttribute)getM1_large().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_InstanceType() {
        return (EAttribute)getM1_large().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_OcciComputeCores() {
        return (EAttribute)getM1_large().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM1_large().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_xlarge() {
		if (m1_xlargeEClass == null) {
			m1_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(115);
		}
		return m1_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_OcciComputeMemory() {
        return (EAttribute)getM1_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_InstanceType() {
        return (EAttribute)getM1_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_OcciComputeCores() {
        return (EAttribute)getM1_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM1_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC1_medium() {
		if (c1_mediumEClass == null) {
			c1_mediumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(116);
		}
		return c1_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_OcciComputeMemory() {
        return (EAttribute)getC1_medium().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_InstanceType() {
        return (EAttribute)getC1_medium().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_OcciComputeCores() {
        return (EAttribute)getC1_medium().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getC1_medium().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC1_xlarge() {
		if (c1_xlargeEClass == null) {
			c1_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(117);
		}
		return c1_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_OcciComputeMemory() {
        return (EAttribute)getC1_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_InstanceType() {
        return (EAttribute)getC1_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_OcciComputeCores() {
        return (EAttribute)getC1_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getC1_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCc2_8xlarge() {
		if (cc2_8xlargeEClass == null) {
			cc2_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(118);
		}
		return cc2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_OcciComputeMemory() {
        return (EAttribute)getCc2_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_InstanceType() {
        return (EAttribute)getCc2_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_OcciComputeCores() {
        return (EAttribute)getCc2_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getCc2_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG2_2xlarge() {
		if (g2_2xlargeEClass == null) {
			g2_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(119);
		}
		return g2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_OcciComputeMemory() {
        return (EAttribute)getG2_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_InstanceType() {
        return (EAttribute)getG2_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_OcciComputeCores() {
        return (EAttribute)getG2_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getG2_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG2_8xlarge() {
		if (g2_8xlargeEClass == null) {
			g2_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(120);
		}
		return g2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_OcciComputeMemory() {
        return (EAttribute)getG2_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_InstanceType() {
        return (EAttribute)getG2_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_OcciComputeCores() {
        return (EAttribute)getG2_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getG2_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCg1_4xlarge() {
		if (cg1_4xlargeEClass == null) {
			cg1_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(121);
		}
		return cg1_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_OcciComputeMemory() {
        return (EAttribute)getCg1_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_InstanceType() {
        return (EAttribute)getCg1_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_OcciComputeCores() {
        return (EAttribute)getCg1_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getCg1_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2_xlarge() {
		if (m2_xlargeEClass == null) {
			m2_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(122);
		}
		return m2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_OcciComputeMemory() {
        return (EAttribute)getM2_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_InstanceType() {
        return (EAttribute)getM2_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_OcciComputeCores() {
        return (EAttribute)getM2_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM2_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2_2xlarge() {
		if (m2_2xlargeEClass == null) {
			m2_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(123);
		}
		return m2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_OcciComputeMemory() {
        return (EAttribute)getM2_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_InstanceType() {
        return (EAttribute)getM2_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_OcciComputeCores() {
        return (EAttribute)getM2_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM2_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2_4xlarge() {
		if (m2_4xlargeEClass == null) {
			m2_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(124);
		}
		return m2_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_OcciComputeMemory() {
        return (EAttribute)getM2_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_InstanceType() {
        return (EAttribute)getM2_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_OcciComputeCores() {
        return (EAttribute)getM2_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getM2_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCr1_8xlarge() {
		if (cr1_8xlargeEClass == null) {
			cr1_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(125);
		}
		return cr1_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_OcciComputeMemory() {
        return (EAttribute)getCr1_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_InstanceType() {
        return (EAttribute)getCr1_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_OcciComputeCores() {
        return (EAttribute)getCr1_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getCr1_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_xlarge() {
		if (i2_xlargeEClass == null) {
			i2_xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(126);
		}
		return i2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_OcciComputeMemory() {
        return (EAttribute)getI2_xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_InstanceType() {
        return (EAttribute)getI2_xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_OcciComputeCores() {
        return (EAttribute)getI2_xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI2_xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_2xlarge() {
		if (i2_2xlargeEClass == null) {
			i2_2xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(127);
		}
		return i2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_OcciComputeMemory() {
        return (EAttribute)getI2_2xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_InstanceType() {
        return (EAttribute)getI2_2xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_OcciComputeCores() {
        return (EAttribute)getI2_2xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI2_2xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_4xlarge() {
		if (i2_4xlargeEClass == null) {
			i2_4xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(128);
		}
		return i2_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_OcciComputeMemory() {
        return (EAttribute)getI2_4xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_InstanceType() {
        return (EAttribute)getI2_4xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_OcciComputeCores() {
        return (EAttribute)getI2_4xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI2_4xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_8xlarge() {
		if (i2_8xlargeEClass == null) {
			i2_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(129);
		}
		return i2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_OcciComputeMemory() {
        return (EAttribute)getI2_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_InstanceType() {
        return (EAttribute)getI2_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_OcciComputeCores() {
        return (EAttribute)getI2_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getI2_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHs1_8xlarge() {
		if (hs1_8xlargeEClass == null) {
			hs1_8xlargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(130);
		}
		return hs1_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_OcciComputeMemory() {
        return (EAttribute)getHs1_8xlarge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_InstanceType() {
        return (EAttribute)getHs1_8xlarge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_OcciComputeCores() {
        return (EAttribute)getHs1_8xlarge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_OcciComputeEphemeralStorageSize() {
        return (EAttribute)getHs1_8xlarge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacementgroup() {
		if (placementgroupEClass == null) {
			placementgroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(131);
		}
		return placementgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_GroupName() {
        return (EAttribute)getPlacementgroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_Affinity() {
        return (EAttribute)getPlacementgroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_HostId() {
        return (EAttribute)getPlacementgroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_SpreadDomain() {
        return (EAttribute)getPlacementgroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_Tenancy() {
        return (EAttribute)getPlacementgroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_ZoneName() {
        return (EAttribute)getPlacementgroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlacementgroup__AppliesConstraint__DiagnosticChain_Map() {
        return getPlacementgroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootdevicevolume() {
		if (rootdevicevolumeEClass == null) {
			rootdevicevolumeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(132);
		}
		return rootdevicevolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootdevicevolume_RootDeviceName() {
        return (EAttribute)getRootdevicevolume().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootdevicevolume_RootDeviceType() {
        return (EAttribute)getRootdevicevolume().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRootdevicevolume__AppliesConstraint__DiagnosticChain_Map() {
        return getRootdevicevolume().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatustransitionreason() {
		if (statustransitionreasonEClass == null) {
			statustransitionreasonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(133);
		}
		return statustransitionreasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatustransitionreason_StateTransitionCode() {
        return (EAttribute)getStatustransitionreason().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatustransitionreason_StateTransitionMessage() {
        return (EAttribute)getStatustransitionreason().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatustransitionreason__AppliesConstraint__DiagnosticChain_Map() {
        return getStatustransitionreason().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTags() {
		if (tagsEClass == null) {
			tagsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(134);
		}
		return tagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTags__AppliesConstraint__DiagnosticChain_Map() {
        return getTags().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancevpcinfo() {
		if (instancevpcinfoEClass == null) {
			instancevpcinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(135);
		}
		return instancevpcinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevpcinfo_VpcId() {
        return (EAttribute)getInstancevpcinfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevpcinfo_SubnetId() {
        return (EAttribute)getInstancevpcinfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevpcinfo_SourceDestCheck() {
        return (EAttribute)getInstancevpcinfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstancevpcinfo__AppliesConstraint__DiagnosticChain_Map() {
        return getInstancevpcinfo().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEurope() {
		if (europeEClass == null) {
			europeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(136);
		}
		return europeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAWSInstanceState() {
		if (awsInstanceStateEEnum == null) {
			awsInstanceStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(0);
		}
		return awsInstanceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHypervisorType() {
		if (hypervisorTypeEEnum == null) {
			hypervisorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(1);
		}
		return hypervisorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceLifeCycleType() {
		if (instanceLifeCycleTypeEEnum == null) {
			instanceLifeCycleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(2);
		}
		return instanceLifeCycleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitoringState() {
		if (monitoringStateEEnum == null) {
			monitoringStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(3);
		}
		return monitoringStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVirtualizationType() {
		if (virtualizationTypeEEnum == null) {
			virtualizationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI).getEClassifiers().get(4);
		}
		return virtualizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2Factory getEc2Factory() {
		return (Ec2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.cmf.occi.multicloud.aws.ec2." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Ec2PackageImpl
