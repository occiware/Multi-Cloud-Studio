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

import awsregions.AwsregionsPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage;

import org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Acceleratedcomputing;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Awscredential;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Computeoptimized;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Factory;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Generalpurpose;
import org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal;
import org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo;
import org.eclipse.cmf.occi.multicloud.aws.ec2.IpPermissionType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.IpProtocol;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermissionlink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Keypairlink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Memoryoptimized;
import org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygrouplink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Storageoptimized;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small;
import org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Tags;
import org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge;
import org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge;

import org.eclipse.cmf.occi.multicloud.aws.ec2.util.Ec2Validator;

import org.eclipse.cmf.occi.multicloud.regions.RegionsPackage;

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
public class Ec2PackageImpl extends EPackageImpl implements Ec2Package {
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
	private EClass securitygroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitygrouplinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keypairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keypairlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ippermissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ippermissionlinkEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ipPermissionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ipProtocolEEnum = null;

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
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ec2Package init() {
		if (isInited) return (Ec2Package)EPackage.Registry.INSTANCE.getEPackage(Ec2Package.eNS_URI);

		// Obtain or create and register package
		Ec2PackageImpl theEc2Package = (Ec2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ec2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ec2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RegionsPackage.eINSTANCE.eClass();
		AccountsPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		AwsregionsPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEc2Package.createPackageContents();

		// Initialize created meta-data
		theEc2Package.initializePackageContents();

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
		return instanceec2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_Name() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_InstanceId() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_InstanceType() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_ZoneName() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_ImageId() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_AwsInstanceStatus() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_LaunchTime() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_AmiLaunchIndex() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_EbsOptimizedIO() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_EnaSupport() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_Hypervisor() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_InstanceLifeCycle() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_KernelId() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_KeyPairName() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_MonitoringState() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_Platform() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PrivateDNSName() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PrivateIpV4Address() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PublicDNSName() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_PublicIpv4Address() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_RamDiskId() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_SriovNetSupport() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceec2_VirtualizationType() {
		return (EAttribute)instanceec2EClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceec2__Terminate() {
		return instanceec2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwsaccount() {
		return awsaccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwsaccount_RegionId() {
		return (EAttribute)awsaccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuritygroup() {
		return securitygroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritygroup_SecurityGroupName() {
		return (EAttribute)securitygroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritygroup_SecurityGroupDescription() {
		return (EAttribute)securitygroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritygroup_VpcId() {
		return (EAttribute)securitygroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecuritygroup_SecurityGroupId() {
		return (EAttribute)securitygroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuritygrouplink() {
		return securitygrouplinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeypair() {
		return keypairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypair_Name() {
		return (EAttribute)keypairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypair_PrivateKey() {
		return (EAttribute)keypairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypair_FingerPrint() {
		return (EAttribute)keypairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypair_EncodedPublicKey() {
		return (EAttribute)keypairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeypair__Importkeypair() {
		return keypairEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeypairlink() {
		return keypairlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIppermission() {
		return ippermissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIppermission_ToPort() {
		return (EAttribute)ippermissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIppermission_FromPort() {
		return (EAttribute)ippermissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIppermission_IpProtocol() {
		return (EAttribute)ippermissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIppermission_Ipv4Ranges() {
		return (EAttribute)ippermissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIppermission_Ipv6Ranges() {
		return (EAttribute)ippermissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIppermission_Traffic() {
		return (EAttribute)ippermissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIppermission_Authorized() {
		return (EAttribute)ippermissionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIppermissionlink() {
		return ippermissionlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwscredential() {
		return awscredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_nano() {
		return t2_nanoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_nano_OcciComputeMemory() {
		return (EAttribute)t2_nanoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_nano_OcciComputeCores() {
		return (EAttribute)t2_nanoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_nano_InstanceType() {
		return (EAttribute)t2_nanoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_micro() {
		return t2_microEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_micro_OcciComputeMemory() {
		return (EAttribute)t2_microEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_micro_OcciComputeCores() {
		return (EAttribute)t2_microEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_micro_InstanceType() {
		return (EAttribute)t2_microEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_small() {
		return t2_smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_small_OcciComputeMemory() {
		return (EAttribute)t2_smallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_small_InstanceType() {
		return (EAttribute)t2_smallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_small_OcciComputeCores() {
		return (EAttribute)t2_smallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_medium() {
		return t2_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_medium_OcciComputeMemory() {
		return (EAttribute)t2_mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_medium_InstanceType() {
		return (EAttribute)t2_mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_medium_OcciComputeCores() {
		return (EAttribute)t2_mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_large() {
		return t2_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_large_OcciComputeMemory() {
		return (EAttribute)t2_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_large_InstanceType() {
		return (EAttribute)t2_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_large_OcciComputeCores() {
		return (EAttribute)t2_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_xlarge() {
		return t2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_xlarge_OcciComputeMemory() {
		return (EAttribute)t2_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_xlarge_InstanceType() {
		return (EAttribute)t2_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_xlarge_OcciComputeCores() {
		return (EAttribute)t2_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT2_2xlarge() {
		return t2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_2xlarge_OcciComputeMemory() {
		return (EAttribute)t2_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_2xlarge_InstanceType() {
		return (EAttribute)t2_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT2_2xlarge_OcciComputeCores() {
		return (EAttribute)t2_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_large() {
		return m5_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_large_OcciComputeMemory() {
		return (EAttribute)m5_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_large_InstanceType() {
		return (EAttribute)m5_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_large_OcciComputeCores() {
		return (EAttribute)m5_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_xlarge() {
		return m5_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_xlarge_OcciComputeMemory() {
		return (EAttribute)m5_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_xlarge_InstanceType() {
		return (EAttribute)m5_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_xlarge_OcciComputeCores() {
		return (EAttribute)m5_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_2xlarge() {
		return m5_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_2xlarge_OcciComputeMemory() {
		return (EAttribute)m5_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_2xlarge_InstanceType() {
		return (EAttribute)m5_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_2xlarge_OcciComputeCores() {
		return (EAttribute)m5_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_4xlarge() {
		return m5_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_4xlarge_OcciComputeMemory() {
		return (EAttribute)m5_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_4xlarge_InstanceType() {
		return (EAttribute)m5_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_4xlarge_OcciComputeCores() {
		return (EAttribute)m5_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_12xlarge() {
		return m5_12xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_12xlarge_OcciComputeMemory() {
		return (EAttribute)m5_12xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_12xlarge_InstanceType() {
		return (EAttribute)m5_12xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_12xlarge_OcciComputeCores() {
		return (EAttribute)m5_12xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM5_24xlarge() {
		return m5_24xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_24xlarge_OcciComputeMemory() {
		return (EAttribute)m5_24xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_24xlarge_InstanceType() {
		return (EAttribute)m5_24xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM5_24xlarge_OcciComputeCores() {
		return (EAttribute)m5_24xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_large() {
		return m4_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_large_OcciComputeMemory() {
		return (EAttribute)m4_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_large_InstanceType() {
		return (EAttribute)m4_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_large_OcciComputeCores() {
		return (EAttribute)m4_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_xlarge() {
		return m4_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_xlarge_OcciComputeMemory() {
		return (EAttribute)m4_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_xlarge_InstanceType() {
		return (EAttribute)m4_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_xlarge_OcciComputeCores() {
		return (EAttribute)m4_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_2xlarge() {
		return m4_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_2xlarge_OcciComputeMemory() {
		return (EAttribute)m4_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_2xlarge_InstanceType() {
		return (EAttribute)m4_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_2xlarge_OcciComputeCores() {
		return (EAttribute)m4_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_10xlarge() {
		return m4_10xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_10xlarge_OcciComputeMemory() {
		return (EAttribute)m4_10xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_10xlarge_InstanceType() {
		return (EAttribute)m4_10xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_10xlarge_OcciComputeCores() {
		return (EAttribute)m4_10xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM4_16xlarge() {
		return m4_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_16xlarge_OcciComputeMemory() {
		return (EAttribute)m4_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_16xlarge_InstanceType() {
		return (EAttribute)m4_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM4_16xlarge_OcciComputeCores() {
		return (EAttribute)m4_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_medium() {
		return m3_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_OcciComputeMemory() {
		return (EAttribute)m3_mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_InstanceType() {
		return (EAttribute)m3_mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_OcciComputeCores() {
		return (EAttribute)m3_mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_medium_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m3_mediumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_large() {
		return m3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_OcciComputeMemory() {
		return (EAttribute)m3_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_InstanceType() {
		return (EAttribute)m3_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_OcciComputeCores() {
		return (EAttribute)m3_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_large_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m3_largeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_xlarge() {
		return m3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_OcciComputeMemory() {
		return (EAttribute)m3_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_InstanceType() {
		return (EAttribute)m3_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_OcciComputeCores() {
		return (EAttribute)m3_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m3_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM3_2xlarge() {
		return m3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_OcciComputeMemory() {
		return (EAttribute)m3_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_InstanceType() {
		return (EAttribute)m3_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_OcciComputeCores() {
		return (EAttribute)m3_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM3_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m3_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_large() {
		return c5_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_large_OcciComputeMemory() {
		return (EAttribute)c5_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_large_InstanceType() {
		return (EAttribute)c5_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_large_OcciComputeCores() {
		return (EAttribute)c5_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_xlarge() {
		return c5_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_xlarge_OcciComputeMemory() {
		return (EAttribute)c5_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_xlarge_InstanceType() {
		return (EAttribute)c5_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_xlarge_OcciComputeCores() {
		return (EAttribute)c5_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_2xlarge() {
		return c5_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_2xlarge_OcciComputeMemory() {
		return (EAttribute)c5_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_2xlarge_InstanceType() {
		return (EAttribute)c5_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_2xlarge_OcciComputeCores() {
		return (EAttribute)c5_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_4xlarge() {
		return c5_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_4xlarge_OcciComputeMemory() {
		return (EAttribute)c5_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_4xlarge_InstanceType() {
		return (EAttribute)c5_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_4xlarge_OcciComputeCores() {
		return (EAttribute)c5_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_9xlarge() {
		return c5_9xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_9xlarge_OcciComputeMemory() {
		return (EAttribute)c5_9xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_9xlarge_InstanceType() {
		return (EAttribute)c5_9xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_9xlarge_OcciComputeCores() {
		return (EAttribute)c5_9xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC5_18xlarge() {
		return c5_18xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_18xlarge_OcciComputeMemory() {
		return (EAttribute)c5_18xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_18xlarge_InstanceType() {
		return (EAttribute)c5_18xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC5_18xlarge_OcciComputeCores() {
		return (EAttribute)c5_18xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_large() {
		return c4_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_large_OcciComputeMemory() {
		return (EAttribute)c4_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_large_InstanceType() {
		return (EAttribute)c4_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_large_OcciComputeCores() {
		return (EAttribute)c4_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_xlarge() {
		return c4_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_xlarge_OcciComputeMemory() {
		return (EAttribute)c4_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_xlarge_InstanceType() {
		return (EAttribute)c4_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_xlarge_OcciComputeCores() {
		return (EAttribute)c4_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_2xlarge() {
		return c4_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_2xlarge_OcciComputeMemory() {
		return (EAttribute)c4_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_2xlarge_InstanceType() {
		return (EAttribute)c4_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_2xlarge_OcciComputeCores() {
		return (EAttribute)c4_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_4xlarge() {
		return c4_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_4xlarge_OcciComputeMemory() {
		return (EAttribute)c4_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_4xlarge_InstanceType() {
		return (EAttribute)c4_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_4xlarge_OcciComputeCores() {
		return (EAttribute)c4_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4_8xlarge() {
		return c4_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_8xlarge_OcciComputeMemory() {
		return (EAttribute)c4_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_8xlarge_InstanceType() {
		return (EAttribute)c4_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4_8xlarge_OcciComputeCores() {
		return (EAttribute)c4_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_large() {
		return c3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_OcciComputeMemory() {
		return (EAttribute)c3_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_InstanceType() {
		return (EAttribute)c3_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_OcciComputeCores() {
		return (EAttribute)c3_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_large_OcciComputeEphemeralStorageSize() {
		return (EAttribute)c3_largeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_xlarge() {
		return c3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_OcciComputeMemory() {
		return (EAttribute)c3_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_InstanceType() {
		return (EAttribute)c3_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_OcciComputeCores() {
		return (EAttribute)c3_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)c3_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_2xlarge() {
		return c3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_OcciComputeMemory() {
		return (EAttribute)c3_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_InstanceType() {
		return (EAttribute)c3_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_OcciComputeCores() {
		return (EAttribute)c3_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)c3_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_4xlarge() {
		return c3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_OcciComputeMemory() {
		return (EAttribute)c3_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_InstanceType() {
		return (EAttribute)c3_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_OcciComputeCores() {
		return (EAttribute)c3_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)c3_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC3_8xlarge() {
		return c3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_OcciComputeMemory() {
		return (EAttribute)c3_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_InstanceType() {
		return (EAttribute)c3_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_OcciComputeCores() {
		return (EAttribute)c3_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC3_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)c3_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_xlarge() {
		return x1e_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_OcciComputeMemory() {
		return (EAttribute)x1e_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_InstanceType() {
		return (EAttribute)x1e_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_OcciComputeCores() {
		return (EAttribute)x1e_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1e_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_2xlarge() {
		return x1e_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_OcciComputeMemory() {
		return (EAttribute)x1e_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_InstanceType() {
		return (EAttribute)x1e_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_OcciComputeCores() {
		return (EAttribute)x1e_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1e_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_4xlarge() {
		return x1e_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_OcciComputeMemory() {
		return (EAttribute)x1e_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_InstanceType() {
		return (EAttribute)x1e_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_OcciComputeCores() {
		return (EAttribute)x1e_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1e_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_8xlarge() {
		return x1e_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_OcciComputeMemory() {
		return (EAttribute)x1e_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_InstanceType() {
		return (EAttribute)x1e_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_OcciComputeCores() {
		return (EAttribute)x1e_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1e_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_16xlarge() {
		return x1e_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_OcciComputeMemory() {
		return (EAttribute)x1e_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_InstanceType() {
		return (EAttribute)x1e_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_OcciComputeCores() {
		return (EAttribute)x1e_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_16xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1e_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1e_32xlarge() {
		return x1e_32xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_OcciComputeMemory() {
		return (EAttribute)x1e_32xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_InstanceType() {
		return (EAttribute)x1e_32xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_OcciComputeCores() {
		return (EAttribute)x1e_32xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1e_32xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1e_32xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1_16xlarge() {
		return x1_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_OcciComputeMemory() {
		return (EAttribute)x1_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_InstanceType() {
		return (EAttribute)x1_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_OcciComputeCores() {
		return (EAttribute)x1_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_16xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX1_32xlarge() {
		return x1_32xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_OcciComputeMemory() {
		return (EAttribute)x1_32xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_InstanceType() {
		return (EAttribute)x1_32xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_OcciComputeCores() {
		return (EAttribute)x1_32xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX1_32xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)x1_32xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_large() {
		return r4_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_large_OcciComputeMemory() {
		return (EAttribute)r4_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_large_InstanceType() {
		return (EAttribute)r4_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_large_OcciComputeCores() {
		return (EAttribute)r4_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_xlarge() {
		return r4_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_xlarge_OcciComputeMemory() {
		return (EAttribute)r4_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_xlarge_InstanceType() {
		return (EAttribute)r4_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_xlarge_OcciComputeCores() {
		return (EAttribute)r4_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_2xlarge() {
		return r4_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_2xlarge_OcciComputeMemory() {
		return (EAttribute)r4_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_2xlarge_InstanceType() {
		return (EAttribute)r4_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_2xlarge_OcciComputeCores() {
		return (EAttribute)r4_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_4xlarge() {
		return r4_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_4xlarge_OcciComputeMemory() {
		return (EAttribute)r4_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_4xlarge_InstanceType() {
		return (EAttribute)r4_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_4xlarge_OcciComputeCores() {
		return (EAttribute)r4_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_8xlarge() {
		return r4_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_8xlarge_OcciComputeMemory() {
		return (EAttribute)r4_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_8xlarge_InstanceType() {
		return (EAttribute)r4_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_8xlarge_OcciComputeCores() {
		return (EAttribute)r4_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR4_16xlarge() {
		return r4_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_16xlarge_OcciComputeMemory() {
		return (EAttribute)r4_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_16xlarge_InstanceType() {
		return (EAttribute)r4_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR4_16xlarge_OcciComputeCores() {
		return (EAttribute)r4_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_large() {
		return r3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_OcciComputeMemory() {
		return (EAttribute)r3_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_InstanceType() {
		return (EAttribute)r3_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_OcciComputeCores() {
		return (EAttribute)r3_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_large_OcciComputeEphemeralStorageSize() {
		return (EAttribute)r3_largeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_xlarge() {
		return r3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_OcciComputeMemory() {
		return (EAttribute)r3_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_InstanceType() {
		return (EAttribute)r3_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_OcciComputeCores() {
		return (EAttribute)r3_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)r3_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_2xlarge() {
		return r3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_OcciComputeMemory() {
		return (EAttribute)r3_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_InstanceType() {
		return (EAttribute)r3_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_OcciComputeCores() {
		return (EAttribute)r3_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)r3_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_4xlarge() {
		return r3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_OcciComputeMemory() {
		return (EAttribute)r3_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_InstanceType() {
		return (EAttribute)r3_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_OcciComputeCores() {
		return (EAttribute)r3_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)r3_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR3_8xlarge() {
		return r3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_OcciComputeMemory() {
		return (EAttribute)r3_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_InstanceType() {
		return (EAttribute)r3_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_OcciComputeCores() {
		return (EAttribute)r3_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR3_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)r3_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP3_2xlarge() {
		return p3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_OcciComputeMemory() {
		return (EAttribute)p3_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_InstanceType() {
		return (EAttribute)p3_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_OcciComputeCores() {
		return (EAttribute)p3_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_Gpus() {
		return (EAttribute)p3_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_GpuMemory() {
		return (EAttribute)p3_2xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_2xlarge_GpuP2P() {
		return (EAttribute)p3_2xlargeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP3_8xlarge() {
		return p3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_OcciComputeMemory() {
		return (EAttribute)p3_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_InstanceType() {
		return (EAttribute)p3_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_OcciComputeCores() {
		return (EAttribute)p3_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_Gpus() {
		return (EAttribute)p3_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_GpuMemory() {
		return (EAttribute)p3_8xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_8xlarge_GpuP2P() {
		return (EAttribute)p3_8xlargeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP3_16xlarge() {
		return p3_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_OcciComputeMemory() {
		return (EAttribute)p3_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_InstanceType() {
		return (EAttribute)p3_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_OcciComputeCores() {
		return (EAttribute)p3_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_Gpus() {
		return (EAttribute)p3_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_GpuMemory() {
		return (EAttribute)p3_16xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP3_16xlarge_GpuP2P() {
		return (EAttribute)p3_16xlargeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2_xlarge() {
		return p2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_OcciComputeMemory() {
		return (EAttribute)p2_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_InstanceType() {
		return (EAttribute)p2_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_OcciComputeCores() {
		return (EAttribute)p2_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_Gpus() {
		return (EAttribute)p2_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_GpuMemory() {
		return (EAttribute)p2_xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_xlarge_GpuP2P() {
		return (EAttribute)p2_xlargeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2_8xlarge() {
		return p2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_OcciComputeMemory() {
		return (EAttribute)p2_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_InstanceType() {
		return (EAttribute)p2_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_OcciComputeCores() {
		return (EAttribute)p2_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_Gpus() {
		return (EAttribute)p2_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_GpuMemory() {
		return (EAttribute)p2_8xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_8xlarge_GpuP2P() {
		return (EAttribute)p2_8xlargeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2_16xlarge() {
		return p2_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_OcciComputeMemory() {
		return (EAttribute)p2_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_InstanceType() {
		return (EAttribute)p2_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_OcciComputeCores() {
		return (EAttribute)p2_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_Gpus() {
		return (EAttribute)p2_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_GpuMemory() {
		return (EAttribute)p2_16xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP2_16xlarge_GpuP2P() {
		return (EAttribute)p2_16xlargeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralpurpose() {
		return generalpurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputeoptimized() {
		return computeoptimizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryoptimized() {
		return memoryoptimizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceleratedcomputing() {
		return acceleratedcomputingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageoptimized() {
		return storageoptimizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_4xlarge() {
		return g3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_OcciComputeMemory() {
		return (EAttribute)g3_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_InstanceType() {
		return (EAttribute)g3_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_OcciComputeCores() {
		return (EAttribute)g3_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_Gpus() {
		return (EAttribute)g3_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_4xlarge_GpuMemory() {
		return (EAttribute)g3_4xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_8xlarge() {
		return g3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_OcciComputeMemory() {
		return (EAttribute)g3_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_InstanceType() {
		return (EAttribute)g3_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_OcciComputeCores() {
		return (EAttribute)g3_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_Gpus() {
		return (EAttribute)g3_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_8xlarge_GpuMemory() {
		return (EAttribute)g3_8xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_16xlarge() {
		return g3_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_OcciComputeMemory() {
		return (EAttribute)g3_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_InstanceType() {
		return (EAttribute)g3_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_OcciComputeCores() {
		return (EAttribute)g3_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_Gpus() {
		return (EAttribute)g3_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG3_16xlarge_GpuMemory() {
		return (EAttribute)g3_16xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getF1_2xlarge() {
		return f1_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_OcciComputeMemory() {
		return (EAttribute)f1_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_InstanceType() {
		return (EAttribute)f1_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_OcciComputeCores() {
		return (EAttribute)f1_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_Fpga() {
		return (EAttribute)f1_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)f1_2xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getF1_16xlarge() {
		return f1_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_OcciComputeMemory() {
		return (EAttribute)f1_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_InstanceType() {
		return (EAttribute)f1_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_OcciComputeCores() {
		return (EAttribute)f1_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_Fpga() {
		return (EAttribute)f1_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getF1_16xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)f1_16xlargeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_2xlarge() {
		return h1_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_OcciComputeMemory() {
		return (EAttribute)h1_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_InstanceType() {
		return (EAttribute)h1_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_OcciComputeCores() {
		return (EAttribute)h1_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)h1_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_4xlarge() {
		return h1_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_OcciComputeMemory() {
		return (EAttribute)h1_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_InstanceType() {
		return (EAttribute)h1_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_OcciComputeCores() {
		return (EAttribute)h1_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)h1_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_8xlarge() {
		return h1_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_OcciComputeMemory() {
		return (EAttribute)h1_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_InstanceType() {
		return (EAttribute)h1_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_OcciComputeCores() {
		return (EAttribute)h1_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)h1_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1_16xlarge() {
		return h1_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_OcciComputeMemory() {
		return (EAttribute)h1_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_InstanceType() {
		return (EAttribute)h1_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_OcciComputeCores() {
		return (EAttribute)h1_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1_16xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)h1_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_large() {
		return i3_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_OcciComputeMemory() {
		return (EAttribute)i3_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_InstanceType() {
		return (EAttribute)i3_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_OcciComputeCores() {
		return (EAttribute)i3_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_large_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i3_largeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_xlarge() {
		return i3_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_OcciComputeMemory() {
		return (EAttribute)i3_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_InstanceType() {
		return (EAttribute)i3_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_OcciComputeCores() {
		return (EAttribute)i3_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i3_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_2xlarge() {
		return i3_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_OcciComputeMemory() {
		return (EAttribute)i3_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_InstanceType() {
		return (EAttribute)i3_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_OcciComputeCores() {
		return (EAttribute)i3_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i3_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_4xlarge() {
		return i3_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_OcciComputeMemory() {
		return (EAttribute)i3_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_InstanceType() {
		return (EAttribute)i3_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_OcciComputeCores() {
		return (EAttribute)i3_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i3_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_8xlarge() {
		return i3_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_OcciComputeMemory() {
		return (EAttribute)i3_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_InstanceType() {
		return (EAttribute)i3_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_OcciComputeCores() {
		return (EAttribute)i3_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i3_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_16xlarge() {
		return i3_16xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_OcciComputeMemory() {
		return (EAttribute)i3_16xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_InstanceType() {
		return (EAttribute)i3_16xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_OcciComputeCores() {
		return (EAttribute)i3_16xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_16xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i3_16xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI3_metal() {
		return i3_metalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_OcciComputeMemory() {
		return (EAttribute)i3_metalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_InstanceType() {
		return (EAttribute)i3_metalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_OcciComputeCores() {
		return (EAttribute)i3_metalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI3_metal_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i3_metalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_xlarge() {
		return d2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_OcciComputeMemory() {
		return (EAttribute)d2_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_InstanceType() {
		return (EAttribute)d2_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_OcciComputeCores() {
		return (EAttribute)d2_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)d2_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_2xlarge() {
		return d2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_OcciComputeMemory() {
		return (EAttribute)d2_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_InstanceType() {
		return (EAttribute)d2_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_OcciComputeCores() {
		return (EAttribute)d2_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)d2_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_4xlarge() {
		return d2_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_OcciComputeMemory() {
		return (EAttribute)d2_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_InstanceType() {
		return (EAttribute)d2_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_OcciComputeCores() {
		return (EAttribute)d2_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)d2_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD2_8xlarge() {
		return d2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_OcciComputeMemory() {
		return (EAttribute)d2_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_InstanceType() {
		return (EAttribute)d2_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_OcciComputeCores() {
		return (EAttribute)d2_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getD2_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)d2_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_small() {
		return m1_smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_OcciComputeMemory() {
		return (EAttribute)m1_smallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_InstanceType() {
		return (EAttribute)m1_smallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_OcciComputeCores() {
		return (EAttribute)m1_smallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_small_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m1_smallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT1_micro() {
		return t1_microEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT1_micro_OcciComputeMemory() {
		return (EAttribute)t1_microEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT1_micro_InstanceType() {
		return (EAttribute)t1_microEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT1_micro_OcciComputeCores() {
		return (EAttribute)t1_microEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_medium() {
		return m1_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_OcciComputeMemory() {
		return (EAttribute)m1_mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_InstanceType() {
		return (EAttribute)m1_mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_OcciComputeCores() {
		return (EAttribute)m1_mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_medium_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m1_mediumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_large() {
		return m1_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_OcciComputeMemory() {
		return (EAttribute)m1_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_InstanceType() {
		return (EAttribute)m1_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_OcciComputeCores() {
		return (EAttribute)m1_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_large_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m1_largeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM1_xlarge() {
		return m1_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_OcciComputeMemory() {
		return (EAttribute)m1_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_InstanceType() {
		return (EAttribute)m1_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_OcciComputeCores() {
		return (EAttribute)m1_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM1_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m1_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC1_medium() {
		return c1_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_OcciComputeMemory() {
		return (EAttribute)c1_mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_InstanceType() {
		return (EAttribute)c1_mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_OcciComputeCores() {
		return (EAttribute)c1_mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_medium_OcciComputeEphemeralStorageSize() {
		return (EAttribute)c1_mediumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC1_xlarge() {
		return c1_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_OcciComputeMemory() {
		return (EAttribute)c1_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_InstanceType() {
		return (EAttribute)c1_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_OcciComputeCores() {
		return (EAttribute)c1_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC1_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)c1_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCc2_8xlarge() {
		return cc2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_OcciComputeMemory() {
		return (EAttribute)cc2_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_InstanceType() {
		return (EAttribute)cc2_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_OcciComputeCores() {
		return (EAttribute)cc2_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCc2_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)cc2_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG2_2xlarge() {
		return g2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_OcciComputeMemory() {
		return (EAttribute)g2_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_InstanceType() {
		return (EAttribute)g2_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_OcciComputeCores() {
		return (EAttribute)g2_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)g2_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG2_8xlarge() {
		return g2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_OcciComputeMemory() {
		return (EAttribute)g2_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_InstanceType() {
		return (EAttribute)g2_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_OcciComputeCores() {
		return (EAttribute)g2_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getG2_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)g2_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCg1_4xlarge() {
		return cg1_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_OcciComputeMemory() {
		return (EAttribute)cg1_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_InstanceType() {
		return (EAttribute)cg1_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_OcciComputeCores() {
		return (EAttribute)cg1_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCg1_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)cg1_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2_xlarge() {
		return m2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_OcciComputeMemory() {
		return (EAttribute)m2_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_InstanceType() {
		return (EAttribute)m2_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_OcciComputeCores() {
		return (EAttribute)m2_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m2_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2_2xlarge() {
		return m2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_OcciComputeMemory() {
		return (EAttribute)m2_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_InstanceType() {
		return (EAttribute)m2_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_OcciComputeCores() {
		return (EAttribute)m2_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m2_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM2_4xlarge() {
		return m2_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_OcciComputeMemory() {
		return (EAttribute)m2_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_InstanceType() {
		return (EAttribute)m2_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_OcciComputeCores() {
		return (EAttribute)m2_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getM2_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)m2_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCr1_8xlarge() {
		return cr1_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_OcciComputeMemory() {
		return (EAttribute)cr1_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_InstanceType() {
		return (EAttribute)cr1_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_OcciComputeCores() {
		return (EAttribute)cr1_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCr1_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)cr1_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_xlarge() {
		return i2_xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_OcciComputeMemory() {
		return (EAttribute)i2_xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_InstanceType() {
		return (EAttribute)i2_xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_OcciComputeCores() {
		return (EAttribute)i2_xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i2_xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_2xlarge() {
		return i2_2xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_OcciComputeMemory() {
		return (EAttribute)i2_2xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_InstanceType() {
		return (EAttribute)i2_2xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_OcciComputeCores() {
		return (EAttribute)i2_2xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_2xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i2_2xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_4xlarge() {
		return i2_4xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_OcciComputeMemory() {
		return (EAttribute)i2_4xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_InstanceType() {
		return (EAttribute)i2_4xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_OcciComputeCores() {
		return (EAttribute)i2_4xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_4xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i2_4xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2_8xlarge() {
		return i2_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_OcciComputeMemory() {
		return (EAttribute)i2_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_InstanceType() {
		return (EAttribute)i2_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_OcciComputeCores() {
		return (EAttribute)i2_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)i2_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHs1_8xlarge() {
		return hs1_8xlargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_OcciComputeMemory() {
		return (EAttribute)hs1_8xlargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_InstanceType() {
		return (EAttribute)hs1_8xlargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_OcciComputeCores() {
		return (EAttribute)hs1_8xlargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHs1_8xlarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)hs1_8xlargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacementgroup() {
		return placementgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_GroupName() {
		return (EAttribute)placementgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_Affinity() {
		return (EAttribute)placementgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_HostId() {
		return (EAttribute)placementgroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_SpreadDomain() {
		return (EAttribute)placementgroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_Tenancy() {
		return (EAttribute)placementgroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementgroup_ZoneName() {
		return (EAttribute)placementgroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootdevicevolume() {
		return rootdevicevolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootdevicevolume_RootDeviceName() {
		return (EAttribute)rootdevicevolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootdevicevolume_RootDeviceType() {
		return (EAttribute)rootdevicevolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatustransitionreason() {
		return statustransitionreasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatustransitionreason_StateTransitionCode() {
		return (EAttribute)statustransitionreasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatustransitionreason_StateTransitionMessage() {
		return (EAttribute)statustransitionreasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTags() {
		return tagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancevpcinfo() {
		return instancevpcinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevpcinfo_VpcId() {
		return (EAttribute)instancevpcinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevpcinfo_SubnetId() {
		return (EAttribute)instancevpcinfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstancevpcinfo_SourceDestCheck() {
		return (EAttribute)instancevpcinfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAWSInstanceState() {
		return awsInstanceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHypervisorType() {
		return hypervisorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceLifeCycleType() {
		return instanceLifeCycleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitoringState() {
		return monitoringStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVirtualizationType() {
		return virtualizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIpPermissionType() {
		return ipPermissionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIpProtocol() {
		return ipProtocolEEnum;
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
		instanceec2EClass = createEClass(INSTANCEEC2);
		createEAttribute(instanceec2EClass, INSTANCEEC2__NAME);
		createEAttribute(instanceec2EClass, INSTANCEEC2__INSTANCE_ID);
		createEAttribute(instanceec2EClass, INSTANCEEC2__INSTANCE_TYPE);
		createEAttribute(instanceec2EClass, INSTANCEEC2__ZONE_NAME);
		createEAttribute(instanceec2EClass, INSTANCEEC2__IMAGE_ID);
		createEAttribute(instanceec2EClass, INSTANCEEC2__AWS_INSTANCE_STATUS);
		createEAttribute(instanceec2EClass, INSTANCEEC2__LAUNCH_TIME);
		createEAttribute(instanceec2EClass, INSTANCEEC2__AMI_LAUNCH_INDEX);
		createEAttribute(instanceec2EClass, INSTANCEEC2__EBS_OPTIMIZED_IO);
		createEAttribute(instanceec2EClass, INSTANCEEC2__ENA_SUPPORT);
		createEAttribute(instanceec2EClass, INSTANCEEC2__HYPERVISOR);
		createEAttribute(instanceec2EClass, INSTANCEEC2__INSTANCE_LIFE_CYCLE);
		createEAttribute(instanceec2EClass, INSTANCEEC2__KERNEL_ID);
		createEAttribute(instanceec2EClass, INSTANCEEC2__KEY_PAIR_NAME);
		createEAttribute(instanceec2EClass, INSTANCEEC2__MONITORING_STATE);
		createEAttribute(instanceec2EClass, INSTANCEEC2__PLATFORM);
		createEAttribute(instanceec2EClass, INSTANCEEC2__PRIVATE_DNS_NAME);
		createEAttribute(instanceec2EClass, INSTANCEEC2__PRIVATE_IP_V4_ADDRESS);
		createEAttribute(instanceec2EClass, INSTANCEEC2__PUBLIC_DNS_NAME);
		createEAttribute(instanceec2EClass, INSTANCEEC2__PUBLIC_IPV4_ADDRESS);
		createEAttribute(instanceec2EClass, INSTANCEEC2__RAM_DISK_ID);
		createEAttribute(instanceec2EClass, INSTANCEEC2__SRIOV_NET_SUPPORT);
		createEAttribute(instanceec2EClass, INSTANCEEC2__VIRTUALIZATION_TYPE);
		createEOperation(instanceec2EClass, INSTANCEEC2___TERMINATE);

		awsaccountEClass = createEClass(AWSACCOUNT);
		createEAttribute(awsaccountEClass, AWSACCOUNT__REGION_ID);

		securitygroupEClass = createEClass(SECURITYGROUP);
		createEAttribute(securitygroupEClass, SECURITYGROUP__SECURITY_GROUP_NAME);
		createEAttribute(securitygroupEClass, SECURITYGROUP__SECURITY_GROUP_DESCRIPTION);
		createEAttribute(securitygroupEClass, SECURITYGROUP__VPC_ID);
		createEAttribute(securitygroupEClass, SECURITYGROUP__SECURITY_GROUP_ID);

		securitygrouplinkEClass = createEClass(SECURITYGROUPLINK);

		keypairEClass = createEClass(KEYPAIR);
		createEAttribute(keypairEClass, KEYPAIR__NAME);
		createEAttribute(keypairEClass, KEYPAIR__PRIVATE_KEY);
		createEAttribute(keypairEClass, KEYPAIR__FINGER_PRINT);
		createEAttribute(keypairEClass, KEYPAIR__ENCODED_PUBLIC_KEY);
		createEOperation(keypairEClass, KEYPAIR___IMPORTKEYPAIR);

		keypairlinkEClass = createEClass(KEYPAIRLINK);

		ippermissionEClass = createEClass(IPPERMISSION);
		createEAttribute(ippermissionEClass, IPPERMISSION__TO_PORT);
		createEAttribute(ippermissionEClass, IPPERMISSION__FROM_PORT);
		createEAttribute(ippermissionEClass, IPPERMISSION__IP_PROTOCOL);
		createEAttribute(ippermissionEClass, IPPERMISSION__IPV4_RANGES);
		createEAttribute(ippermissionEClass, IPPERMISSION__IPV6_RANGES);
		createEAttribute(ippermissionEClass, IPPERMISSION__TRAFFIC);
		createEAttribute(ippermissionEClass, IPPERMISSION__AUTHORIZED);

		ippermissionlinkEClass = createEClass(IPPERMISSIONLINK);

		awscredentialEClass = createEClass(AWSCREDENTIAL);

		t2_nanoEClass = createEClass(T2_NANO);
		createEAttribute(t2_nanoEClass, T2_NANO__OCCI_COMPUTE_MEMORY);
		createEAttribute(t2_nanoEClass, T2_NANO__OCCI_COMPUTE_CORES);
		createEAttribute(t2_nanoEClass, T2_NANO__INSTANCE_TYPE);

		t2_microEClass = createEClass(T2_MICRO);
		createEAttribute(t2_microEClass, T2_MICRO__OCCI_COMPUTE_MEMORY);
		createEAttribute(t2_microEClass, T2_MICRO__OCCI_COMPUTE_CORES);
		createEAttribute(t2_microEClass, T2_MICRO__INSTANCE_TYPE);

		t2_smallEClass = createEClass(T2_SMALL);
		createEAttribute(t2_smallEClass, T2_SMALL__OCCI_COMPUTE_MEMORY);
		createEAttribute(t2_smallEClass, T2_SMALL__INSTANCE_TYPE);
		createEAttribute(t2_smallEClass, T2_SMALL__OCCI_COMPUTE_CORES);

		t2_mediumEClass = createEClass(T2_MEDIUM);
		createEAttribute(t2_mediumEClass, T2_MEDIUM__OCCI_COMPUTE_MEMORY);
		createEAttribute(t2_mediumEClass, T2_MEDIUM__INSTANCE_TYPE);
		createEAttribute(t2_mediumEClass, T2_MEDIUM__OCCI_COMPUTE_CORES);

		t2_largeEClass = createEClass(T2_LARGE);
		createEAttribute(t2_largeEClass, T2_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(t2_largeEClass, T2_LARGE__INSTANCE_TYPE);
		createEAttribute(t2_largeEClass, T2_LARGE__OCCI_COMPUTE_CORES);

		t2_xlargeEClass = createEClass(T2_XLARGE);
		createEAttribute(t2_xlargeEClass, T2_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(t2_xlargeEClass, T2_XLARGE__INSTANCE_TYPE);
		createEAttribute(t2_xlargeEClass, T2_XLARGE__OCCI_COMPUTE_CORES);

		t2_2xlargeEClass = createEClass(T2_2XLARGE);
		createEAttribute(t2_2xlargeEClass, T2_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(t2_2xlargeEClass, T2_2XLARGE__INSTANCE_TYPE);
		createEAttribute(t2_2xlargeEClass, T2_2XLARGE__OCCI_COMPUTE_CORES);

		m5_largeEClass = createEClass(M5_LARGE);
		createEAttribute(m5_largeEClass, M5_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m5_largeEClass, M5_LARGE__INSTANCE_TYPE);
		createEAttribute(m5_largeEClass, M5_LARGE__OCCI_COMPUTE_CORES);

		m5_xlargeEClass = createEClass(M5_XLARGE);
		createEAttribute(m5_xlargeEClass, M5_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m5_xlargeEClass, M5_XLARGE__INSTANCE_TYPE);
		createEAttribute(m5_xlargeEClass, M5_XLARGE__OCCI_COMPUTE_CORES);

		m5_2xlargeEClass = createEClass(M5_2XLARGE);
		createEAttribute(m5_2xlargeEClass, M5_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m5_2xlargeEClass, M5_2XLARGE__INSTANCE_TYPE);
		createEAttribute(m5_2xlargeEClass, M5_2XLARGE__OCCI_COMPUTE_CORES);

		m5_4xlargeEClass = createEClass(M5_4XLARGE);
		createEAttribute(m5_4xlargeEClass, M5_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m5_4xlargeEClass, M5_4XLARGE__INSTANCE_TYPE);
		createEAttribute(m5_4xlargeEClass, M5_4XLARGE__OCCI_COMPUTE_CORES);

		m5_12xlargeEClass = createEClass(M5_12XLARGE);
		createEAttribute(m5_12xlargeEClass, M5_12XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m5_12xlargeEClass, M5_12XLARGE__INSTANCE_TYPE);
		createEAttribute(m5_12xlargeEClass, M5_12XLARGE__OCCI_COMPUTE_CORES);

		m5_24xlargeEClass = createEClass(M5_24XLARGE);
		createEAttribute(m5_24xlargeEClass, M5_24XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m5_24xlargeEClass, M5_24XLARGE__INSTANCE_TYPE);
		createEAttribute(m5_24xlargeEClass, M5_24XLARGE__OCCI_COMPUTE_CORES);

		m4_largeEClass = createEClass(M4_LARGE);
		createEAttribute(m4_largeEClass, M4_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m4_largeEClass, M4_LARGE__INSTANCE_TYPE);
		createEAttribute(m4_largeEClass, M4_LARGE__OCCI_COMPUTE_CORES);

		m4_xlargeEClass = createEClass(M4_XLARGE);
		createEAttribute(m4_xlargeEClass, M4_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m4_xlargeEClass, M4_XLARGE__INSTANCE_TYPE);
		createEAttribute(m4_xlargeEClass, M4_XLARGE__OCCI_COMPUTE_CORES);

		m4_2xlargeEClass = createEClass(M4_2XLARGE);
		createEAttribute(m4_2xlargeEClass, M4_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m4_2xlargeEClass, M4_2XLARGE__INSTANCE_TYPE);
		createEAttribute(m4_2xlargeEClass, M4_2XLARGE__OCCI_COMPUTE_CORES);

		m4_10xlargeEClass = createEClass(M4_10XLARGE);
		createEAttribute(m4_10xlargeEClass, M4_10XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m4_10xlargeEClass, M4_10XLARGE__INSTANCE_TYPE);
		createEAttribute(m4_10xlargeEClass, M4_10XLARGE__OCCI_COMPUTE_CORES);

		m4_16xlargeEClass = createEClass(M4_16XLARGE);
		createEAttribute(m4_16xlargeEClass, M4_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m4_16xlargeEClass, M4_16XLARGE__INSTANCE_TYPE);
		createEAttribute(m4_16xlargeEClass, M4_16XLARGE__OCCI_COMPUTE_CORES);

		m3_mediumEClass = createEClass(M3_MEDIUM);
		createEAttribute(m3_mediumEClass, M3_MEDIUM__OCCI_COMPUTE_MEMORY);
		createEAttribute(m3_mediumEClass, M3_MEDIUM__INSTANCE_TYPE);
		createEAttribute(m3_mediumEClass, M3_MEDIUM__OCCI_COMPUTE_CORES);
		createEAttribute(m3_mediumEClass, M3_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m3_largeEClass = createEClass(M3_LARGE);
		createEAttribute(m3_largeEClass, M3_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m3_largeEClass, M3_LARGE__INSTANCE_TYPE);
		createEAttribute(m3_largeEClass, M3_LARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m3_largeEClass, M3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m3_xlargeEClass = createEClass(M3_XLARGE);
		createEAttribute(m3_xlargeEClass, M3_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m3_xlargeEClass, M3_XLARGE__INSTANCE_TYPE);
		createEAttribute(m3_xlargeEClass, M3_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m3_xlargeEClass, M3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m3_2xlargeEClass = createEClass(M3_2XLARGE);
		createEAttribute(m3_2xlargeEClass, M3_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m3_2xlargeEClass, M3_2XLARGE__INSTANCE_TYPE);
		createEAttribute(m3_2xlargeEClass, M3_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m3_2xlargeEClass, M3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		c5_largeEClass = createEClass(C5_LARGE);
		createEAttribute(c5_largeEClass, C5_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c5_largeEClass, C5_LARGE__INSTANCE_TYPE);
		createEAttribute(c5_largeEClass, C5_LARGE__OCCI_COMPUTE_CORES);

		c5_xlargeEClass = createEClass(C5_XLARGE);
		createEAttribute(c5_xlargeEClass, C5_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c5_xlargeEClass, C5_XLARGE__INSTANCE_TYPE);
		createEAttribute(c5_xlargeEClass, C5_XLARGE__OCCI_COMPUTE_CORES);

		c5_2xlargeEClass = createEClass(C5_2XLARGE);
		createEAttribute(c5_2xlargeEClass, C5_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c5_2xlargeEClass, C5_2XLARGE__INSTANCE_TYPE);
		createEAttribute(c5_2xlargeEClass, C5_2XLARGE__OCCI_COMPUTE_CORES);

		c5_4xlargeEClass = createEClass(C5_4XLARGE);
		createEAttribute(c5_4xlargeEClass, C5_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c5_4xlargeEClass, C5_4XLARGE__INSTANCE_TYPE);
		createEAttribute(c5_4xlargeEClass, C5_4XLARGE__OCCI_COMPUTE_CORES);

		c5_9xlargeEClass = createEClass(C5_9XLARGE);
		createEAttribute(c5_9xlargeEClass, C5_9XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c5_9xlargeEClass, C5_9XLARGE__INSTANCE_TYPE);
		createEAttribute(c5_9xlargeEClass, C5_9XLARGE__OCCI_COMPUTE_CORES);

		c5_18xlargeEClass = createEClass(C5_18XLARGE);
		createEAttribute(c5_18xlargeEClass, C5_18XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c5_18xlargeEClass, C5_18XLARGE__INSTANCE_TYPE);
		createEAttribute(c5_18xlargeEClass, C5_18XLARGE__OCCI_COMPUTE_CORES);

		c4_largeEClass = createEClass(C4_LARGE);
		createEAttribute(c4_largeEClass, C4_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c4_largeEClass, C4_LARGE__INSTANCE_TYPE);
		createEAttribute(c4_largeEClass, C4_LARGE__OCCI_COMPUTE_CORES);

		c4_xlargeEClass = createEClass(C4_XLARGE);
		createEAttribute(c4_xlargeEClass, C4_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c4_xlargeEClass, C4_XLARGE__INSTANCE_TYPE);
		createEAttribute(c4_xlargeEClass, C4_XLARGE__OCCI_COMPUTE_CORES);

		c4_2xlargeEClass = createEClass(C4_2XLARGE);
		createEAttribute(c4_2xlargeEClass, C4_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c4_2xlargeEClass, C4_2XLARGE__INSTANCE_TYPE);
		createEAttribute(c4_2xlargeEClass, C4_2XLARGE__OCCI_COMPUTE_CORES);

		c4_4xlargeEClass = createEClass(C4_4XLARGE);
		createEAttribute(c4_4xlargeEClass, C4_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c4_4xlargeEClass, C4_4XLARGE__INSTANCE_TYPE);
		createEAttribute(c4_4xlargeEClass, C4_4XLARGE__OCCI_COMPUTE_CORES);

		c4_8xlargeEClass = createEClass(C4_8XLARGE);
		createEAttribute(c4_8xlargeEClass, C4_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c4_8xlargeEClass, C4_8XLARGE__INSTANCE_TYPE);
		createEAttribute(c4_8xlargeEClass, C4_8XLARGE__OCCI_COMPUTE_CORES);

		c3_largeEClass = createEClass(C3_LARGE);
		createEAttribute(c3_largeEClass, C3_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c3_largeEClass, C3_LARGE__INSTANCE_TYPE);
		createEAttribute(c3_largeEClass, C3_LARGE__OCCI_COMPUTE_CORES);
		createEAttribute(c3_largeEClass, C3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		c3_xlargeEClass = createEClass(C3_XLARGE);
		createEAttribute(c3_xlargeEClass, C3_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c3_xlargeEClass, C3_XLARGE__INSTANCE_TYPE);
		createEAttribute(c3_xlargeEClass, C3_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(c3_xlargeEClass, C3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		c3_2xlargeEClass = createEClass(C3_2XLARGE);
		createEAttribute(c3_2xlargeEClass, C3_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c3_2xlargeEClass, C3_2XLARGE__INSTANCE_TYPE);
		createEAttribute(c3_2xlargeEClass, C3_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(c3_2xlargeEClass, C3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		c3_4xlargeEClass = createEClass(C3_4XLARGE);
		createEAttribute(c3_4xlargeEClass, C3_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c3_4xlargeEClass, C3_4XLARGE__INSTANCE_TYPE);
		createEAttribute(c3_4xlargeEClass, C3_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(c3_4xlargeEClass, C3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		c3_8xlargeEClass = createEClass(C3_8XLARGE);
		createEAttribute(c3_8xlargeEClass, C3_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c3_8xlargeEClass, C3_8XLARGE__INSTANCE_TYPE);
		createEAttribute(c3_8xlargeEClass, C3_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(c3_8xlargeEClass, C3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1e_xlargeEClass = createEClass(X1E_XLARGE);
		createEAttribute(x1e_xlargeEClass, X1E_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1e_xlargeEClass, X1E_XLARGE__INSTANCE_TYPE);
		createEAttribute(x1e_xlargeEClass, X1E_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1e_xlargeEClass, X1E_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1e_2xlargeEClass = createEClass(X1E_2XLARGE);
		createEAttribute(x1e_2xlargeEClass, X1E_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1e_2xlargeEClass, X1E_2XLARGE__INSTANCE_TYPE);
		createEAttribute(x1e_2xlargeEClass, X1E_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1e_2xlargeEClass, X1E_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1e_4xlargeEClass = createEClass(X1E_4XLARGE);
		createEAttribute(x1e_4xlargeEClass, X1E_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1e_4xlargeEClass, X1E_4XLARGE__INSTANCE_TYPE);
		createEAttribute(x1e_4xlargeEClass, X1E_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1e_4xlargeEClass, X1E_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1e_8xlargeEClass = createEClass(X1E_8XLARGE);
		createEAttribute(x1e_8xlargeEClass, X1E_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1e_8xlargeEClass, X1E_8XLARGE__INSTANCE_TYPE);
		createEAttribute(x1e_8xlargeEClass, X1E_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1e_8xlargeEClass, X1E_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1e_16xlargeEClass = createEClass(X1E_16XLARGE);
		createEAttribute(x1e_16xlargeEClass, X1E_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1e_16xlargeEClass, X1E_16XLARGE__INSTANCE_TYPE);
		createEAttribute(x1e_16xlargeEClass, X1E_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1e_16xlargeEClass, X1E_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1e_32xlargeEClass = createEClass(X1E_32XLARGE);
		createEAttribute(x1e_32xlargeEClass, X1E_32XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1e_32xlargeEClass, X1E_32XLARGE__INSTANCE_TYPE);
		createEAttribute(x1e_32xlargeEClass, X1E_32XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1e_32xlargeEClass, X1E_32XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1_16xlargeEClass = createEClass(X1_16XLARGE);
		createEAttribute(x1_16xlargeEClass, X1_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1_16xlargeEClass, X1_16XLARGE__INSTANCE_TYPE);
		createEAttribute(x1_16xlargeEClass, X1_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1_16xlargeEClass, X1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		x1_32xlargeEClass = createEClass(X1_32XLARGE);
		createEAttribute(x1_32xlargeEClass, X1_32XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(x1_32xlargeEClass, X1_32XLARGE__INSTANCE_TYPE);
		createEAttribute(x1_32xlargeEClass, X1_32XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(x1_32xlargeEClass, X1_32XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		r4_largeEClass = createEClass(R4_LARGE);
		createEAttribute(r4_largeEClass, R4_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r4_largeEClass, R4_LARGE__INSTANCE_TYPE);
		createEAttribute(r4_largeEClass, R4_LARGE__OCCI_COMPUTE_CORES);

		r4_xlargeEClass = createEClass(R4_XLARGE);
		createEAttribute(r4_xlargeEClass, R4_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r4_xlargeEClass, R4_XLARGE__INSTANCE_TYPE);
		createEAttribute(r4_xlargeEClass, R4_XLARGE__OCCI_COMPUTE_CORES);

		r4_2xlargeEClass = createEClass(R4_2XLARGE);
		createEAttribute(r4_2xlargeEClass, R4_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r4_2xlargeEClass, R4_2XLARGE__INSTANCE_TYPE);
		createEAttribute(r4_2xlargeEClass, R4_2XLARGE__OCCI_COMPUTE_CORES);

		r4_4xlargeEClass = createEClass(R4_4XLARGE);
		createEAttribute(r4_4xlargeEClass, R4_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r4_4xlargeEClass, R4_4XLARGE__INSTANCE_TYPE);
		createEAttribute(r4_4xlargeEClass, R4_4XLARGE__OCCI_COMPUTE_CORES);

		r4_8xlargeEClass = createEClass(R4_8XLARGE);
		createEAttribute(r4_8xlargeEClass, R4_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r4_8xlargeEClass, R4_8XLARGE__INSTANCE_TYPE);
		createEAttribute(r4_8xlargeEClass, R4_8XLARGE__OCCI_COMPUTE_CORES);

		r4_16xlargeEClass = createEClass(R4_16XLARGE);
		createEAttribute(r4_16xlargeEClass, R4_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r4_16xlargeEClass, R4_16XLARGE__INSTANCE_TYPE);
		createEAttribute(r4_16xlargeEClass, R4_16XLARGE__OCCI_COMPUTE_CORES);

		r3_largeEClass = createEClass(R3_LARGE);
		createEAttribute(r3_largeEClass, R3_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r3_largeEClass, R3_LARGE__INSTANCE_TYPE);
		createEAttribute(r3_largeEClass, R3_LARGE__OCCI_COMPUTE_CORES);
		createEAttribute(r3_largeEClass, R3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		r3_xlargeEClass = createEClass(R3_XLARGE);
		createEAttribute(r3_xlargeEClass, R3_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r3_xlargeEClass, R3_XLARGE__INSTANCE_TYPE);
		createEAttribute(r3_xlargeEClass, R3_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(r3_xlargeEClass, R3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		r3_2xlargeEClass = createEClass(R3_2XLARGE);
		createEAttribute(r3_2xlargeEClass, R3_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r3_2xlargeEClass, R3_2XLARGE__INSTANCE_TYPE);
		createEAttribute(r3_2xlargeEClass, R3_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(r3_2xlargeEClass, R3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		r3_4xlargeEClass = createEClass(R3_4XLARGE);
		createEAttribute(r3_4xlargeEClass, R3_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r3_4xlargeEClass, R3_4XLARGE__INSTANCE_TYPE);
		createEAttribute(r3_4xlargeEClass, R3_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(r3_4xlargeEClass, R3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		r3_8xlargeEClass = createEClass(R3_8XLARGE);
		createEAttribute(r3_8xlargeEClass, R3_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(r3_8xlargeEClass, R3_8XLARGE__INSTANCE_TYPE);
		createEAttribute(r3_8xlargeEClass, R3_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(r3_8xlargeEClass, R3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		p3_2xlargeEClass = createEClass(P3_2XLARGE);
		createEAttribute(p3_2xlargeEClass, P3_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(p3_2xlargeEClass, P3_2XLARGE__INSTANCE_TYPE);
		createEAttribute(p3_2xlargeEClass, P3_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(p3_2xlargeEClass, P3_2XLARGE__GPUS);
		createEAttribute(p3_2xlargeEClass, P3_2XLARGE__GPU_MEMORY);
		createEAttribute(p3_2xlargeEClass, P3_2XLARGE__GPU_P2P);

		p3_8xlargeEClass = createEClass(P3_8XLARGE);
		createEAttribute(p3_8xlargeEClass, P3_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(p3_8xlargeEClass, P3_8XLARGE__INSTANCE_TYPE);
		createEAttribute(p3_8xlargeEClass, P3_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(p3_8xlargeEClass, P3_8XLARGE__GPUS);
		createEAttribute(p3_8xlargeEClass, P3_8XLARGE__GPU_MEMORY);
		createEAttribute(p3_8xlargeEClass, P3_8XLARGE__GPU_P2P);

		p3_16xlargeEClass = createEClass(P3_16XLARGE);
		createEAttribute(p3_16xlargeEClass, P3_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(p3_16xlargeEClass, P3_16XLARGE__INSTANCE_TYPE);
		createEAttribute(p3_16xlargeEClass, P3_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(p3_16xlargeEClass, P3_16XLARGE__GPUS);
		createEAttribute(p3_16xlargeEClass, P3_16XLARGE__GPU_MEMORY);
		createEAttribute(p3_16xlargeEClass, P3_16XLARGE__GPU_P2P);

		p2_xlargeEClass = createEClass(P2_XLARGE);
		createEAttribute(p2_xlargeEClass, P2_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(p2_xlargeEClass, P2_XLARGE__INSTANCE_TYPE);
		createEAttribute(p2_xlargeEClass, P2_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(p2_xlargeEClass, P2_XLARGE__GPUS);
		createEAttribute(p2_xlargeEClass, P2_XLARGE__GPU_MEMORY);
		createEAttribute(p2_xlargeEClass, P2_XLARGE__GPU_P2P);

		p2_8xlargeEClass = createEClass(P2_8XLARGE);
		createEAttribute(p2_8xlargeEClass, P2_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(p2_8xlargeEClass, P2_8XLARGE__INSTANCE_TYPE);
		createEAttribute(p2_8xlargeEClass, P2_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(p2_8xlargeEClass, P2_8XLARGE__GPUS);
		createEAttribute(p2_8xlargeEClass, P2_8XLARGE__GPU_MEMORY);
		createEAttribute(p2_8xlargeEClass, P2_8XLARGE__GPU_P2P);

		p2_16xlargeEClass = createEClass(P2_16XLARGE);
		createEAttribute(p2_16xlargeEClass, P2_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(p2_16xlargeEClass, P2_16XLARGE__INSTANCE_TYPE);
		createEAttribute(p2_16xlargeEClass, P2_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(p2_16xlargeEClass, P2_16XLARGE__GPUS);
		createEAttribute(p2_16xlargeEClass, P2_16XLARGE__GPU_MEMORY);
		createEAttribute(p2_16xlargeEClass, P2_16XLARGE__GPU_P2P);

		generalpurposeEClass = createEClass(GENERALPURPOSE);

		computeoptimizedEClass = createEClass(COMPUTEOPTIMIZED);

		memoryoptimizedEClass = createEClass(MEMORYOPTIMIZED);

		acceleratedcomputingEClass = createEClass(ACCELERATEDCOMPUTING);

		storageoptimizedEClass = createEClass(STORAGEOPTIMIZED);

		g3_4xlargeEClass = createEClass(G3_4XLARGE);
		createEAttribute(g3_4xlargeEClass, G3_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(g3_4xlargeEClass, G3_4XLARGE__INSTANCE_TYPE);
		createEAttribute(g3_4xlargeEClass, G3_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(g3_4xlargeEClass, G3_4XLARGE__GPUS);
		createEAttribute(g3_4xlargeEClass, G3_4XLARGE__GPU_MEMORY);

		g3_8xlargeEClass = createEClass(G3_8XLARGE);
		createEAttribute(g3_8xlargeEClass, G3_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(g3_8xlargeEClass, G3_8XLARGE__INSTANCE_TYPE);
		createEAttribute(g3_8xlargeEClass, G3_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(g3_8xlargeEClass, G3_8XLARGE__GPUS);
		createEAttribute(g3_8xlargeEClass, G3_8XLARGE__GPU_MEMORY);

		g3_16xlargeEClass = createEClass(G3_16XLARGE);
		createEAttribute(g3_16xlargeEClass, G3_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(g3_16xlargeEClass, G3_16XLARGE__INSTANCE_TYPE);
		createEAttribute(g3_16xlargeEClass, G3_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(g3_16xlargeEClass, G3_16XLARGE__GPUS);
		createEAttribute(g3_16xlargeEClass, G3_16XLARGE__GPU_MEMORY);

		f1_2xlargeEClass = createEClass(F1_2XLARGE);
		createEAttribute(f1_2xlargeEClass, F1_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(f1_2xlargeEClass, F1_2XLARGE__INSTANCE_TYPE);
		createEAttribute(f1_2xlargeEClass, F1_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(f1_2xlargeEClass, F1_2XLARGE__FPGA);
		createEAttribute(f1_2xlargeEClass, F1_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		f1_16xlargeEClass = createEClass(F1_16XLARGE);
		createEAttribute(f1_16xlargeEClass, F1_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(f1_16xlargeEClass, F1_16XLARGE__INSTANCE_TYPE);
		createEAttribute(f1_16xlargeEClass, F1_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(f1_16xlargeEClass, F1_16XLARGE__FPGA);
		createEAttribute(f1_16xlargeEClass, F1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		h1_2xlargeEClass = createEClass(H1_2XLARGE);
		createEAttribute(h1_2xlargeEClass, H1_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(h1_2xlargeEClass, H1_2XLARGE__INSTANCE_TYPE);
		createEAttribute(h1_2xlargeEClass, H1_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(h1_2xlargeEClass, H1_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		h1_4xlargeEClass = createEClass(H1_4XLARGE);
		createEAttribute(h1_4xlargeEClass, H1_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(h1_4xlargeEClass, H1_4XLARGE__INSTANCE_TYPE);
		createEAttribute(h1_4xlargeEClass, H1_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(h1_4xlargeEClass, H1_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		h1_8xlargeEClass = createEClass(H1_8XLARGE);
		createEAttribute(h1_8xlargeEClass, H1_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(h1_8xlargeEClass, H1_8XLARGE__INSTANCE_TYPE);
		createEAttribute(h1_8xlargeEClass, H1_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(h1_8xlargeEClass, H1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		h1_16xlargeEClass = createEClass(H1_16XLARGE);
		createEAttribute(h1_16xlargeEClass, H1_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(h1_16xlargeEClass, H1_16XLARGE__INSTANCE_TYPE);
		createEAttribute(h1_16xlargeEClass, H1_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(h1_16xlargeEClass, H1_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i3_largeEClass = createEClass(I3_LARGE);
		createEAttribute(i3_largeEClass, I3_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i3_largeEClass, I3_LARGE__INSTANCE_TYPE);
		createEAttribute(i3_largeEClass, I3_LARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i3_largeEClass, I3_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i3_xlargeEClass = createEClass(I3_XLARGE);
		createEAttribute(i3_xlargeEClass, I3_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i3_xlargeEClass, I3_XLARGE__INSTANCE_TYPE);
		createEAttribute(i3_xlargeEClass, I3_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i3_xlargeEClass, I3_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i3_2xlargeEClass = createEClass(I3_2XLARGE);
		createEAttribute(i3_2xlargeEClass, I3_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i3_2xlargeEClass, I3_2XLARGE__INSTANCE_TYPE);
		createEAttribute(i3_2xlargeEClass, I3_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i3_2xlargeEClass, I3_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i3_4xlargeEClass = createEClass(I3_4XLARGE);
		createEAttribute(i3_4xlargeEClass, I3_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i3_4xlargeEClass, I3_4XLARGE__INSTANCE_TYPE);
		createEAttribute(i3_4xlargeEClass, I3_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i3_4xlargeEClass, I3_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i3_8xlargeEClass = createEClass(I3_8XLARGE);
		createEAttribute(i3_8xlargeEClass, I3_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i3_8xlargeEClass, I3_8XLARGE__INSTANCE_TYPE);
		createEAttribute(i3_8xlargeEClass, I3_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i3_8xlargeEClass, I3_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i3_16xlargeEClass = createEClass(I3_16XLARGE);
		createEAttribute(i3_16xlargeEClass, I3_16XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i3_16xlargeEClass, I3_16XLARGE__INSTANCE_TYPE);
		createEAttribute(i3_16xlargeEClass, I3_16XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i3_16xlargeEClass, I3_16XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i3_metalEClass = createEClass(I3_METAL);
		createEAttribute(i3_metalEClass, I3_METAL__OCCI_COMPUTE_MEMORY);
		createEAttribute(i3_metalEClass, I3_METAL__INSTANCE_TYPE);
		createEAttribute(i3_metalEClass, I3_METAL__OCCI_COMPUTE_CORES);
		createEAttribute(i3_metalEClass, I3_METAL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		d2_xlargeEClass = createEClass(D2_XLARGE);
		createEAttribute(d2_xlargeEClass, D2_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(d2_xlargeEClass, D2_XLARGE__INSTANCE_TYPE);
		createEAttribute(d2_xlargeEClass, D2_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(d2_xlargeEClass, D2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		d2_2xlargeEClass = createEClass(D2_2XLARGE);
		createEAttribute(d2_2xlargeEClass, D2_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(d2_2xlargeEClass, D2_2XLARGE__INSTANCE_TYPE);
		createEAttribute(d2_2xlargeEClass, D2_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(d2_2xlargeEClass, D2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		d2_4xlargeEClass = createEClass(D2_4XLARGE);
		createEAttribute(d2_4xlargeEClass, D2_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(d2_4xlargeEClass, D2_4XLARGE__INSTANCE_TYPE);
		createEAttribute(d2_4xlargeEClass, D2_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(d2_4xlargeEClass, D2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		d2_8xlargeEClass = createEClass(D2_8XLARGE);
		createEAttribute(d2_8xlargeEClass, D2_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(d2_8xlargeEClass, D2_8XLARGE__INSTANCE_TYPE);
		createEAttribute(d2_8xlargeEClass, D2_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(d2_8xlargeEClass, D2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m1_smallEClass = createEClass(M1_SMALL);
		createEAttribute(m1_smallEClass, M1_SMALL__OCCI_COMPUTE_MEMORY);
		createEAttribute(m1_smallEClass, M1_SMALL__INSTANCE_TYPE);
		createEAttribute(m1_smallEClass, M1_SMALL__OCCI_COMPUTE_CORES);
		createEAttribute(m1_smallEClass, M1_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		t1_microEClass = createEClass(T1_MICRO);
		createEAttribute(t1_microEClass, T1_MICRO__OCCI_COMPUTE_MEMORY);
		createEAttribute(t1_microEClass, T1_MICRO__INSTANCE_TYPE);
		createEAttribute(t1_microEClass, T1_MICRO__OCCI_COMPUTE_CORES);

		m1_mediumEClass = createEClass(M1_MEDIUM);
		createEAttribute(m1_mediumEClass, M1_MEDIUM__OCCI_COMPUTE_MEMORY);
		createEAttribute(m1_mediumEClass, M1_MEDIUM__INSTANCE_TYPE);
		createEAttribute(m1_mediumEClass, M1_MEDIUM__OCCI_COMPUTE_CORES);
		createEAttribute(m1_mediumEClass, M1_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m1_largeEClass = createEClass(M1_LARGE);
		createEAttribute(m1_largeEClass, M1_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m1_largeEClass, M1_LARGE__INSTANCE_TYPE);
		createEAttribute(m1_largeEClass, M1_LARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m1_largeEClass, M1_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m1_xlargeEClass = createEClass(M1_XLARGE);
		createEAttribute(m1_xlargeEClass, M1_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m1_xlargeEClass, M1_XLARGE__INSTANCE_TYPE);
		createEAttribute(m1_xlargeEClass, M1_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m1_xlargeEClass, M1_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		c1_mediumEClass = createEClass(C1_MEDIUM);
		createEAttribute(c1_mediumEClass, C1_MEDIUM__OCCI_COMPUTE_MEMORY);
		createEAttribute(c1_mediumEClass, C1_MEDIUM__INSTANCE_TYPE);
		createEAttribute(c1_mediumEClass, C1_MEDIUM__OCCI_COMPUTE_CORES);
		createEAttribute(c1_mediumEClass, C1_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		c1_xlargeEClass = createEClass(C1_XLARGE);
		createEAttribute(c1_xlargeEClass, C1_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(c1_xlargeEClass, C1_XLARGE__INSTANCE_TYPE);
		createEAttribute(c1_xlargeEClass, C1_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(c1_xlargeEClass, C1_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		cc2_8xlargeEClass = createEClass(CC2_8XLARGE);
		createEAttribute(cc2_8xlargeEClass, CC2_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(cc2_8xlargeEClass, CC2_8XLARGE__INSTANCE_TYPE);
		createEAttribute(cc2_8xlargeEClass, CC2_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(cc2_8xlargeEClass, CC2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		g2_2xlargeEClass = createEClass(G2_2XLARGE);
		createEAttribute(g2_2xlargeEClass, G2_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(g2_2xlargeEClass, G2_2XLARGE__INSTANCE_TYPE);
		createEAttribute(g2_2xlargeEClass, G2_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(g2_2xlargeEClass, G2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		g2_8xlargeEClass = createEClass(G2_8XLARGE);
		createEAttribute(g2_8xlargeEClass, G2_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(g2_8xlargeEClass, G2_8XLARGE__INSTANCE_TYPE);
		createEAttribute(g2_8xlargeEClass, G2_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(g2_8xlargeEClass, G2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		cg1_4xlargeEClass = createEClass(CG1_4XLARGE);
		createEAttribute(cg1_4xlargeEClass, CG1_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(cg1_4xlargeEClass, CG1_4XLARGE__INSTANCE_TYPE);
		createEAttribute(cg1_4xlargeEClass, CG1_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(cg1_4xlargeEClass, CG1_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m2_xlargeEClass = createEClass(M2_XLARGE);
		createEAttribute(m2_xlargeEClass, M2_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m2_xlargeEClass, M2_XLARGE__INSTANCE_TYPE);
		createEAttribute(m2_xlargeEClass, M2_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m2_xlargeEClass, M2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m2_2xlargeEClass = createEClass(M2_2XLARGE);
		createEAttribute(m2_2xlargeEClass, M2_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m2_2xlargeEClass, M2_2XLARGE__INSTANCE_TYPE);
		createEAttribute(m2_2xlargeEClass, M2_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m2_2xlargeEClass, M2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		m2_4xlargeEClass = createEClass(M2_4XLARGE);
		createEAttribute(m2_4xlargeEClass, M2_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(m2_4xlargeEClass, M2_4XLARGE__INSTANCE_TYPE);
		createEAttribute(m2_4xlargeEClass, M2_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(m2_4xlargeEClass, M2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		cr1_8xlargeEClass = createEClass(CR1_8XLARGE);
		createEAttribute(cr1_8xlargeEClass, CR1_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(cr1_8xlargeEClass, CR1_8XLARGE__INSTANCE_TYPE);
		createEAttribute(cr1_8xlargeEClass, CR1_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(cr1_8xlargeEClass, CR1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i2_xlargeEClass = createEClass(I2_XLARGE);
		createEAttribute(i2_xlargeEClass, I2_XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i2_xlargeEClass, I2_XLARGE__INSTANCE_TYPE);
		createEAttribute(i2_xlargeEClass, I2_XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i2_xlargeEClass, I2_XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i2_2xlargeEClass = createEClass(I2_2XLARGE);
		createEAttribute(i2_2xlargeEClass, I2_2XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i2_2xlargeEClass, I2_2XLARGE__INSTANCE_TYPE);
		createEAttribute(i2_2xlargeEClass, I2_2XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i2_2xlargeEClass, I2_2XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i2_4xlargeEClass = createEClass(I2_4XLARGE);
		createEAttribute(i2_4xlargeEClass, I2_4XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i2_4xlargeEClass, I2_4XLARGE__INSTANCE_TYPE);
		createEAttribute(i2_4xlargeEClass, I2_4XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i2_4xlargeEClass, I2_4XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		i2_8xlargeEClass = createEClass(I2_8XLARGE);
		createEAttribute(i2_8xlargeEClass, I2_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(i2_8xlargeEClass, I2_8XLARGE__INSTANCE_TYPE);
		createEAttribute(i2_8xlargeEClass, I2_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(i2_8xlargeEClass, I2_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		hs1_8xlargeEClass = createEClass(HS1_8XLARGE);
		createEAttribute(hs1_8xlargeEClass, HS1_8XLARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(hs1_8xlargeEClass, HS1_8XLARGE__INSTANCE_TYPE);
		createEAttribute(hs1_8xlargeEClass, HS1_8XLARGE__OCCI_COMPUTE_CORES);
		createEAttribute(hs1_8xlargeEClass, HS1_8XLARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);

		placementgroupEClass = createEClass(PLACEMENTGROUP);
		createEAttribute(placementgroupEClass, PLACEMENTGROUP__GROUP_NAME);
		createEAttribute(placementgroupEClass, PLACEMENTGROUP__AFFINITY);
		createEAttribute(placementgroupEClass, PLACEMENTGROUP__HOST_ID);
		createEAttribute(placementgroupEClass, PLACEMENTGROUP__SPREAD_DOMAIN);
		createEAttribute(placementgroupEClass, PLACEMENTGROUP__TENANCY);
		createEAttribute(placementgroupEClass, PLACEMENTGROUP__ZONE_NAME);

		rootdevicevolumeEClass = createEClass(ROOTDEVICEVOLUME);
		createEAttribute(rootdevicevolumeEClass, ROOTDEVICEVOLUME__ROOT_DEVICE_NAME);
		createEAttribute(rootdevicevolumeEClass, ROOTDEVICEVOLUME__ROOT_DEVICE_TYPE);

		statustransitionreasonEClass = createEClass(STATUSTRANSITIONREASON);
		createEAttribute(statustransitionreasonEClass, STATUSTRANSITIONREASON__STATE_TRANSITION_CODE);
		createEAttribute(statustransitionreasonEClass, STATUSTRANSITIONREASON__STATE_TRANSITION_MESSAGE);

		tagsEClass = createEClass(TAGS);

		instancevpcinfoEClass = createEClass(INSTANCEVPCINFO);
		createEAttribute(instancevpcinfoEClass, INSTANCEVPCINFO__VPC_ID);
		createEAttribute(instancevpcinfoEClass, INSTANCEVPCINFO__SUBNET_ID);
		createEAttribute(instancevpcinfoEClass, INSTANCEVPCINFO__SOURCE_DEST_CHECK);

		// Create enums
		awsInstanceStateEEnum = createEEnum(AWS_INSTANCE_STATE);
		hypervisorTypeEEnum = createEEnum(HYPERVISOR_TYPE);
		instanceLifeCycleTypeEEnum = createEEnum(INSTANCE_LIFE_CYCLE_TYPE);
		monitoringStateEEnum = createEEnum(MONITORING_STATE);
		virtualizationTypeEEnum = createEEnum(VIRTUALIZATION_TYPE);
		ipPermissionTypeEEnum = createEEnum(IP_PERMISSION_TYPE);
		ipProtocolEEnum = createEEnum(IP_PROTOCOL);
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
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);
		AccountsPackage theAccountsPackage = (AccountsPackage)EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instanceec2EClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		awsaccountEClass.getESuperTypes().add(theAccountsPackage.getCloudaccount());
		securitygroupEClass.getESuperTypes().add(theOCCIPackage.getResource());
		securitygrouplinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		keypairEClass.getESuperTypes().add(theOCCIPackage.getResource());
		keypairlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		ippermissionEClass.getESuperTypes().add(theOCCIPackage.getResource());
		ippermissionlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		awscredentialEClass.getESuperTypes().add(theAccountsPackage.getCloudcredential());
		awscredentialEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t2_nanoEClass.getESuperTypes().add(this.getGeneralpurpose());
		t2_nanoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t2_microEClass.getESuperTypes().add(this.getGeneralpurpose());
		t2_microEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t2_smallEClass.getESuperTypes().add(this.getGeneralpurpose());
		t2_smallEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t2_mediumEClass.getESuperTypes().add(this.getGeneralpurpose());
		t2_mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t2_largeEClass.getESuperTypes().add(this.getGeneralpurpose());
		t2_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t2_xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		t2_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t2_2xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		t2_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m5_largeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m5_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m5_xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m5_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m5_2xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m5_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m5_4xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m5_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m5_12xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m5_12xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m5_24xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m5_24xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m4_largeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m4_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m4_xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m4_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m4_2xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m4_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m4_10xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m4_10xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m4_16xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m4_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m3_mediumEClass.getESuperTypes().add(this.getGeneralpurpose());
		m3_mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m3_largeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m3_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m3_xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m3_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m3_2xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m3_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c5_largeEClass.getESuperTypes().add(this.getComputeoptimized());
		c5_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c5_xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c5_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c5_2xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c5_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c5_4xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c5_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c5_9xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c5_9xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c5_18xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c5_18xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c4_largeEClass.getESuperTypes().add(this.getComputeoptimized());
		c4_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c4_xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c4_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c4_2xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c4_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c4_4xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c4_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c4_8xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c4_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c3_largeEClass.getESuperTypes().add(this.getComputeoptimized());
		c3_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c3_xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c3_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c3_2xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c3_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c3_4xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c3_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c3_8xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c3_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1e_xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1e_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1e_2xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1e_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1e_4xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1e_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1e_8xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1e_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1e_16xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1e_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1e_32xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1e_32xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1_16xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		x1_32xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		x1_32xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r4_largeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r4_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r4_xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r4_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r4_2xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r4_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r4_4xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r4_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r4_8xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r4_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r4_16xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r4_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r3_largeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r3_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r3_xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r3_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r3_2xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r3_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r3_4xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r3_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		r3_8xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		r3_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		p3_2xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		p3_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		p3_8xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		p3_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		p3_16xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		p3_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		p2_xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		p2_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		p2_8xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		p2_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		p2_16xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		p2_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		generalpurposeEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		generalpurposeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		computeoptimizedEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		computeoptimizedEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		memoryoptimizedEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		memoryoptimizedEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		acceleratedcomputingEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		acceleratedcomputingEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		storageoptimizedEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		storageoptimizedEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		g3_4xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		g3_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		g3_8xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		g3_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		g3_16xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		g3_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		f1_2xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		f1_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		f1_16xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		f1_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		h1_2xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		h1_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		h1_4xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		h1_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		h1_8xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		h1_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		h1_16xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		h1_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i3_largeEClass.getESuperTypes().add(this.getStorageoptimized());
		i3_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i3_xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i3_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i3_2xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i3_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i3_4xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i3_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i3_8xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i3_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i3_16xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i3_16xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i3_metalEClass.getESuperTypes().add(this.getStorageoptimized());
		i3_metalEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		d2_xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		d2_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		d2_2xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		d2_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		d2_4xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		d2_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		d2_8xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		d2_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m1_smallEClass.getESuperTypes().add(this.getGeneralpurpose());
		m1_smallEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		t1_microEClass.getESuperTypes().add(this.getGeneralpurpose());
		t1_microEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m1_mediumEClass.getESuperTypes().add(this.getGeneralpurpose());
		m1_mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m1_largeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m1_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m1_xlargeEClass.getESuperTypes().add(this.getGeneralpurpose());
		m1_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c1_mediumEClass.getESuperTypes().add(this.getComputeoptimized());
		c1_mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		c1_xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		c1_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cc2_8xlargeEClass.getESuperTypes().add(this.getComputeoptimized());
		cc2_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		g2_2xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		g2_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		g2_8xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		g2_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cg1_4xlargeEClass.getESuperTypes().add(this.getAcceleratedcomputing());
		cg1_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m2_xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		m2_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m2_2xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		m2_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		m2_4xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		m2_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cr1_8xlargeEClass.getESuperTypes().add(this.getMemoryoptimized());
		cr1_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i2_xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i2_xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i2_2xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i2_2xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i2_4xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i2_4xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		i2_8xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		i2_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		hs1_8xlargeEClass.getESuperTypes().add(this.getStorageoptimized());
		hs1_8xlargeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		placementgroupEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		rootdevicevolumeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		statustransitionreasonEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tagsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		instancevpcinfoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(instanceec2EClass, Instanceec2.class, "Instanceec2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceec2_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_InstanceId(), theOCCIPackage.getString(), "instanceId", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.nano", 1, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_ZoneName(), theOCCIPackage.getString(), "zoneName", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_ImageId(), theOCCIPackage.getString(), "imageId", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_AwsInstanceStatus(), this.getAWSInstanceState(), "awsInstanceStatus", "notexist", 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_LaunchTime(), theOCCIPackage.getString(), "launchTime", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_AmiLaunchIndex(), theOCCIPackage.getInteger(), "amiLaunchIndex", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_EbsOptimizedIO(), theOCCIPackage.getBoolean(), "ebsOptimizedIO", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_EnaSupport(), theOCCIPackage.getBoolean(), "enaSupport", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_Hypervisor(), this.getHypervisorType(), "hypervisor", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_InstanceLifeCycle(), this.getInstanceLifeCycleType(), "instanceLifeCycle", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_KernelId(), theOCCIPackage.getString(), "kernelId", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_KeyPairName(), theOCCIPackage.getString(), "keyPairName", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_MonitoringState(), this.getMonitoringState(), "monitoringState", "disabled", 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_Platform(), theOCCIPackage.getString(), "platform", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_PrivateDNSName(), theOCCIPackage.getString(), "privateDNSName", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_PrivateIpV4Address(), theOCCIPackage.getString(), "privateIpV4Address", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_PublicDNSName(), theOCCIPackage.getString(), "publicDNSName", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_PublicIpv4Address(), theOCCIPackage.getString(), "publicIpv4Address", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_RamDiskId(), theOCCIPackage.getString(), "ramDiskId", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_SriovNetSupport(), theOCCIPackage.getString(), "sriovNetSupport", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceec2_VirtualizationType(), this.getVirtualizationType(), "virtualizationType", null, 0, 1, Instanceec2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInstanceec2__Terminate(), null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(awsaccountEClass, Awsaccount.class, "Awsaccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwsaccount_RegionId(), theOCCIPackage.getString(), "regionId", "eu-west-3", 1, 1, Awsaccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securitygroupEClass, Securitygroup.class, "Securitygroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecuritygroup_SecurityGroupName(), theOCCIPackage.getString(), "securityGroupName", null, 1, 1, Securitygroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecuritygroup_SecurityGroupDescription(), theOCCIPackage.getString(), "securityGroupDescription", null, 0, 1, Securitygroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecuritygroup_VpcId(), theOCCIPackage.getString(), "vpcId", null, 0, 1, Securitygroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecuritygroup_SecurityGroupId(), theOCCIPackage.getString(), "securityGroupId", null, 0, 1, Securitygroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securitygrouplinkEClass, Securitygrouplink.class, "Securitygrouplink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keypairEClass, Keypair.class, "Keypair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeypair_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Keypair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypair_PrivateKey(), theOCCIPackage.getString(), "privateKey", null, 0, 1, Keypair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypair_FingerPrint(), theOCCIPackage.getString(), "fingerPrint", null, 0, 1, Keypair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypair_EncodedPublicKey(), theOCCIPackage.getString(), "encodedPublicKey", null, 0, 1, Keypair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getKeypair__Importkeypair(), null, "importkeypair", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(keypairlinkEClass, Keypairlink.class, "Keypairlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ippermissionEClass, Ippermission.class, "Ippermission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIppermission_ToPort(), theOCCIPackage.getInteger(), "toPort", null, 0, 1, Ippermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIppermission_FromPort(), theOCCIPackage.getInteger(), "fromPort", null, 0, 1, Ippermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIppermission_IpProtocol(), this.getIpProtocol(), "ipProtocol", "tcp", 0, 1, Ippermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIppermission_Ipv4Ranges(), theOCCIPackage.getString(), "ipv4Ranges", null, 0, 1, Ippermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIppermission_Ipv6Ranges(), theOCCIPackage.getString(), "ipv6Ranges", null, 0, 1, Ippermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIppermission_Traffic(), this.getIpPermissionType(), "traffic", "inbound", 1, 1, Ippermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIppermission_Authorized(), theOCCIPackage.getBoolean(), "authorized", "true", 0, 1, Ippermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ippermissionlinkEClass, Ippermissionlink.class, "Ippermissionlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(awscredentialEClass, Awscredential.class, "Awscredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(t2_nanoEClass, T2_nano.class, "T2_nano", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT2_nano_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "0.5", 0, 1, T2_nano.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_nano_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, T2_nano.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_nano_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.nano", 0, 1, T2_nano.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t2_microEClass, T2_micro.class, "T2_micro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT2_micro_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "1", 0, 1, T2_micro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_micro_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, T2_micro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_micro_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.micro", 0, 1, T2_micro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t2_smallEClass, T2_small.class, "T2_small", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT2_small_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "2", 0, 1, T2_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_small_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.small", 0, 1, T2_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_small_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, T2_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t2_mediumEClass, T2_medium.class, "T2_medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT2_medium_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "4", 0, 1, T2_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_medium_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.medium", 0, 1, T2_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_medium_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, T2_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t2_largeEClass, T2_large.class, "T2_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT2_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "8", 0, 1, T2_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.large", 0, 1, T2_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, T2_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t2_xlargeEClass, T2_xlarge.class, "T2_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT2_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "16", 0, 1, T2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.xlarge", 0, 1, T2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, T2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t2_2xlargeEClass, T2_2xlarge.class, "T2_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT2_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "32", 0, 1, T2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "t2.2xlarge", 0, 1, T2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT2_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, T2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m5_largeEClass, M5_large.class, "M5_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM5_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "8", 0, 1, M5_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "m5.large", 0, 1, M5_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, M5_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m5_xlargeEClass, M5_xlarge.class, "M5_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM5_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "16", 0, 1, M5_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m5.xlarge", 0, 1, M5_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, M5_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m5_2xlargeEClass, M5_2xlarge.class, "M5_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM5_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "32", 0, 1, M5_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m5.2xlarge", 0, 1, M5_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, M5_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m5_4xlargeEClass, M5_4xlarge.class, "M5_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM5_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "64", 0, 1, M5_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m5.4xlarge", 0, 1, M5_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, M5_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m5_12xlargeEClass, M5_12xlarge.class, "M5_12xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM5_12xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "192", 0, 1, M5_12xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_12xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m5.12xlarge", 0, 1, M5_12xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_12xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "48", 0, 1, M5_12xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m5_24xlargeEClass, M5_24xlarge.class, "M5_24xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM5_24xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "384", 0, 1, M5_24xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_24xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m5.24xlarge", 0, 1, M5_24xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM5_24xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "96", 0, 1, M5_24xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m4_largeEClass, M4_large.class, "M4_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM4_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "8", 0, 1, M4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "m4.large", 0, 1, M4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, M4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m4_xlargeEClass, M4_xlarge.class, "M4_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM4_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "16", 0, 1, M4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m4.xlarge", 0, 1, M4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, M4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m4_2xlargeEClass, M4_2xlarge.class, "M4_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM4_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "32", 0, 1, M4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m4.2xlarge", 0, 1, M4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, M4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m4_10xlargeEClass, M4_10xlarge.class, "M4_10xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM4_10xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "160", 0, 1, M4_10xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_10xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m4.10xlarge", 0, 1, M4_10xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_10xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "40", 0, 1, M4_10xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m4_16xlargeEClass, M4_16xlarge.class, "M4_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM4_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "256", 0, 1, M4_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m4.16xlarge", 0, 1, M4_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM4_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, M4_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m3_mediumEClass, M3_medium.class, "M3_medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM3_medium_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "3.75", 0, 1, M3_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_medium_InstanceType(), theOCCIPackage.getString(), "instanceType", "m3.medium", 0, 1, M3_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_medium_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, M3_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_medium_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "4.0", 0, 1, M3_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m3_largeEClass, M3_large.class, "M3_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM3_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "7.5", 0, 1, M3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "m3.large", 0, 1, M3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, M3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_large_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "32", 0, 1, M3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m3_xlargeEClass, M3_xlarge.class, "M3_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM3_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15", 0, 1, M3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m3.xlarge", 0, 1, M3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, M3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "80", 0, 1, M3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m3_2xlargeEClass, M3_2xlarge.class, "M3_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM3_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30", 0, 1, M3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m3.2xlarge", 0, 1, M3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, M3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM3_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "160", 0, 1, M3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c5_largeEClass, C5_large.class, "C5_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC5_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "4", 0, 1, C5_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "c5.large", 0, 1, C5_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, C5_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c5_xlargeEClass, C5_xlarge.class, "C5_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC5_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "8", 0, 1, C5_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c5.xlarge", 0, 1, C5_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, C5_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c5_2xlargeEClass, C5_2xlarge.class, "C5_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC5_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "16", 0, 1, C5_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c5.2xlarge", 0, 1, C5_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, C5_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c5_4xlargeEClass, C5_4xlarge.class, "C5_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC5_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "32", 0, 1, C5_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c5.4xlarge", 0, 1, C5_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, C5_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c5_9xlargeEClass, C5_9xlarge.class, "C5_9xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC5_9xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "72", 0, 1, C5_9xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_9xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c5.9xlarge", 0, 1, C5_9xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_9xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "36", 0, 1, C5_9xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c5_18xlargeEClass, C5_18xlarge.class, "C5_18xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC5_18xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "144", 0, 1, C5_18xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_18xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c5.18xlarge", 0, 1, C5_18xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC5_18xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "72", 0, 1, C5_18xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c4_largeEClass, C4_large.class, "C4_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC4_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "3.75", 0, 1, C4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "c4.large", 0, 1, C4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, C4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c4_xlargeEClass, C4_xlarge.class, "C4_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC4_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "7.5", 0, 1, C4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c4.xlarge", 0, 1, C4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, C4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c4_2xlargeEClass, C4_2xlarge.class, "C4_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC4_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15", 0, 1, C4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c4.2xlarge", 0, 1, C4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, C4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c4_4xlargeEClass, C4_4xlarge.class, "C4_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC4_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30", 0, 1, C4_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c4.2xlarge", 0, 1, C4_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, C4_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c4_8xlargeEClass, C4_8xlarge.class, "C4_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC4_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "60", 0, 1, C4_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c4.2xlarge", 0, 1, C4_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "36", 0, 1, C4_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c3_largeEClass, C3_large.class, "C3_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC3_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "3.75", 0, 1, C3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "c3.large", 0, 1, C3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, C3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_large_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "32", 0, 1, C3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c3_xlargeEClass, C3_xlarge.class, "C3_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC3_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "7.5", 0, 1, C3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c3.xlarge", 0, 1, C3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, C3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "80", 0, 1, C3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c3_2xlargeEClass, C3_2xlarge.class, "C3_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC3_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15", 0, 1, C3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c3.2xlarge", 0, 1, C3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, C3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "160", 0, 1, C3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c3_4xlargeEClass, C3_4xlarge.class, "C3_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC3_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30", 0, 1, C3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c3.4xlarge", 0, 1, C3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, C3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "160", 0, 1, C3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c3_8xlargeEClass, C3_8xlarge.class, "C3_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC3_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "60", 0, 1, C3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c3.8xlarge", 0, 1, C3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, C3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC3_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "640", 0, 1, C3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1e_xlargeEClass, X1e_xlarge.class, "X1e_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1e_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, X1e_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1e.xlarge", 0, 1, X1e_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, X1e_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "120", 0, 1, X1e_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1e_2xlargeEClass, X1e_2xlarge.class, "X1e_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1e_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, X1e_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1e.2xlarge", 0, 1, X1e_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, X1e_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "240", 0, 1, X1e_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1e_4xlargeEClass, X1e_4xlarge.class, "X1e_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1e_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "488", 0, 1, X1e_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1e.4xlarge", 0, 1, X1e_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, X1e_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "480", 0, 1, X1e_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1e_8xlargeEClass, X1e_8xlarge.class, "X1e_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1e_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "976", 0, 1, X1e_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1e.8xlarge", 0, 1, X1e_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, X1e_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "960", 0, 1, X1e_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1e_16xlargeEClass, X1e_16xlarge.class, "X1e_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1e_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "1952", 0, 1, X1e_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1e.16xlarge", 0, 1, X1e_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, X1e_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_16xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1920", 0, 1, X1e_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1e_32xlargeEClass, X1e_32xlarge.class, "X1e_32xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1e_32xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "1952", 0, 1, X1e_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_32xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1e.32xlarge", 0, 1, X1e_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_32xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "128", 0, 1, X1e_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1e_32xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "3840", 0, 1, X1e_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1_16xlargeEClass, X1_16xlarge.class, "X1_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "976", 0, 1, X1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1.16xlarge", 0, 1, X1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, X1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1_16xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1920", 0, 1, X1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x1_32xlargeEClass, X1_32xlarge.class, "X1_32xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX1_32xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "1952", 0, 1, X1_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1_32xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "x1.32xlarge", 0, 1, X1_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1_32xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "128", 0, 1, X1_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX1_32xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "3840", 0, 1, X1_32xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r4_largeEClass, R4_large.class, "R4_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR4_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15.25", 0, 1, R4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "r4.large", 0, 1, R4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, R4_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r4_xlargeEClass, R4_xlarge.class, "R4_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR4_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30.5", 0, 1, R4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r4.xlarge", 0, 1, R4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, R4_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r4_2xlargeEClass, R4_2xlarge.class, "R4_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR4_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "61", 0, 1, R4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r4.2xlarge", 0, 1, R4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, R4_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r4_4xlargeEClass, R4_4xlarge.class, "R4_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR4_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, R4_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r4.4xlarge", 0, 1, R4_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, R4_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r4_8xlargeEClass, R4_8xlarge.class, "R4_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR4_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, R4_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r4.8xlarge", 0, 1, R4_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, R4_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r4_16xlargeEClass, R4_16xlarge.class, "R4_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR4_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "488", 0, 1, R4_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r4.16xlarge", 0, 1, R4_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR4_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, R4_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r3_largeEClass, R3_large.class, "R3_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR3_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15.25", 0, 1, R3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "r3.large", 0, 1, R3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, R3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_large_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "32", 0, 1, R3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r3_xlargeEClass, R3_xlarge.class, "R3_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR3_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30.5", 0, 1, R3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r3.xlarge", 0, 1, R3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, R3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "80", 0, 1, R3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r3_2xlargeEClass, R3_2xlarge.class, "R3_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR3_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "61", 0, 1, R3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r3.2xlarge", 0, 1, R3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, R3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "160", 0, 1, R3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r3_4xlargeEClass, R3_4xlarge.class, "R3_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR3_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, R3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r3.4xlarge", 0, 1, R3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, R3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "320", 0, 1, R3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r3_8xlargeEClass, R3_8xlarge.class, "R3_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR3_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, R3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "r3.8xlarge", 0, 1, R3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, R3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR3_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "640", 0, 1, R3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p3_2xlargeEClass, P3_2xlarge.class, "P3_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getP3_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "61", 0, 1, P3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "p3.2xlarge", 0, 1, P3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, P3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_2xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "1", 0, 1, P3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_2xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "16", 0, 1, P3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_2xlarge_GpuP2P(), theOCCIPackage.getString(), "gpuP2P", "None", 0, 1, P3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p3_8xlargeEClass, P3_8xlarge.class, "P3_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getP3_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, P3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "p3.8xlarge", 0, 1, P3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, P3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_8xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "4", 0, 1, P3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_8xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "64", 0, 1, P3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_8xlarge_GpuP2P(), theOCCIPackage.getString(), "gpuP2P", "NVLink", 0, 1, P3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p3_16xlargeEClass, P3_16xlarge.class, "P3_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getP3_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "488", 0, 1, P3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "p3.16xlarge", 0, 1, P3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, P3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_16xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "8", 0, 1, P3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_16xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "128", 0, 1, P3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP3_16xlarge_GpuP2P(), theOCCIPackage.getString(), "gpuP2P", "NVLink", 0, 1, P3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p2_xlargeEClass, P2_xlarge.class, "P2_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getP2_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "61", 0, 1, P2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "p2.xlarge", 0, 1, P2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, P2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "1", 0, 1, P2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "12", 0, 1, P2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_xlarge_GpuP2P(), theOCCIPackage.getString(), "gpuP2P", "GPUDirect", 0, 1, P2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p2_8xlargeEClass, P2_8xlarge.class, "P2_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getP2_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "488", 0, 1, P2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "p2.8xlarge", 0, 1, P2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, P2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_8xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "8", 0, 1, P2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_8xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "96", 0, 1, P2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_8xlarge_GpuP2P(), theOCCIPackage.getString(), "gpuP2P", "GPUDirect", 0, 1, P2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p2_16xlargeEClass, P2_16xlarge.class, "P2_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getP2_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "732", 0, 1, P2_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "p2.8xlarge", 0, 1, P2_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, P2_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_16xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "16", 0, 1, P2_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_16xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "192", 0, 1, P2_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP2_16xlarge_GpuP2P(), theOCCIPackage.getString(), "gpuP2P", "GPUDirect", 0, 1, P2_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalpurposeEClass, Generalpurpose.class, "Generalpurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computeoptimizedEClass, Computeoptimized.class, "Computeoptimized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryoptimizedEClass, Memoryoptimized.class, "Memoryoptimized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceleratedcomputingEClass, Acceleratedcomputing.class, "Acceleratedcomputing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageoptimizedEClass, Storageoptimized.class, "Storageoptimized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(g3_4xlargeEClass, G3_4xlarge.class, "G3_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG3_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, G3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "g3.4xlarge", 0, 1, G3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, G3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_4xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "1", 0, 1, G3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_4xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "8", 0, 1, G3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(g3_8xlargeEClass, G3_8xlarge.class, "G3_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG3_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, G3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "g3.8xlarge", 0, 1, G3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, G3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_8xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "4", 0, 1, G3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_8xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "32", 0, 1, G3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(g3_16xlargeEClass, G3_16xlarge.class, "G3_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG3_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "488", 0, 1, G3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "g3.16xlarge", 0, 1, G3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, G3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_16xlarge_Gpus(), theInfrastructurePackage.getCore(), "gpus", "4", 0, 1, G3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG3_16xlarge_GpuMemory(), theInfrastructurePackage.getGiB(), "gpuMemory", "32", 0, 1, G3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(f1_2xlargeEClass, F1_2xlarge.class, "F1_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getF1_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, F1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "f1.2xlarge", 0, 1, F1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, F1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_2xlarge_Fpga(), theOCCIPackage.getInteger(), "fpga", "1", 0, 1, F1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "470", 0, 1, F1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(f1_16xlargeEClass, F1_16xlarge.class, "F1_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getF1_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "976", 0, 1, F1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "f1.16xlarge", 0, 1, F1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, F1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_16xlarge_Fpga(), theInfrastructurePackage.getCore(), "fpga", "8", 0, 1, F1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getF1_16xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "3760", 0, 1, F1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h1_2xlargeEClass, H1_2xlarge.class, "H1_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH1_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "32", 0, 1, H1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "h1.2xlarge", 0, 1, H1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, H1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "2000", 0, 1, H1_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h1_4xlargeEClass, H1_4xlarge.class, "H1_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH1_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "64", 0, 1, H1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "h1.4xlarge", 0, 1, H1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, H1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "4000", 0, 1, H1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h1_8xlargeEClass, H1_8xlarge.class, "H1_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH1_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "128", 0, 1, H1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "h1.8xlarge", 0, 1, H1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, H1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "8000", 0, 1, H1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h1_16xlargeEClass, H1_16xlarge.class, "H1_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH1_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "256", 0, 1, H1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "h1.16xlarge", 0, 1, H1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, H1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1_16xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "16000", 0, 1, H1_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i3_largeEClass, I3_large.class, "I3_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI3_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15.25", 0, 1, I3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "i3.large", 0, 1, I3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, I3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_large_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "475", 0, 1, I3_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i3_xlargeEClass, I3_xlarge.class, "I3_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI3_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30.5", 0, 1, I3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i3.xlarge", 0, 1, I3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, I3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "950", 0, 1, I3_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i3_2xlargeEClass, I3_2xlarge.class, "I3_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI3_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "61", 0, 1, I3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i3.2xlarge", 0, 1, I3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, I3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1900", 0, 1, I3_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i3_4xlargeEClass, I3_4xlarge.class, "I3_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI3_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, I3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i3.4xlarge", 0, 1, I3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, I3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "3800", 0, 1, I3_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i3_8xlargeEClass, I3_8xlarge.class, "I3_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI3_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, I3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i3.8xlarge", 0, 1, I3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, I3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "7600", 0, 1, I3_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i3_16xlargeEClass, I3_16xlarge.class, "I3_16xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI3_16xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "488", 0, 1, I3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_16xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i3.16xlarge", 0, 1, I3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_16xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "64", 0, 1, I3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_16xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "15200", 0, 1, I3_16xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i3_metalEClass, I3_metal.class, "I3_metal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI3_metal_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "512", 0, 1, I3_metal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_metal_InstanceType(), theOCCIPackage.getString(), "instanceType", "i3.metal", 0, 1, I3_metal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_metal_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "0", 0, 1, I3_metal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI3_metal_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "15200", 0, 1, I3_metal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(d2_xlargeEClass, D2_xlarge.class, "D2_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getD2_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30.5", 0, 1, D2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "d2.xlarge", 0, 1, D2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, D2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "6000", 0, 1, D2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(d2_2xlargeEClass, D2_2xlarge.class, "D2_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getD2_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "61", 0, 1, D2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "d2.2xlarge", 0, 1, D2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, D2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "12000", 0, 1, D2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(d2_4xlargeEClass, D2_4xlarge.class, "D2_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getD2_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, D2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "d2.4xlarge", 0, 1, D2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, D2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "24000", 0, 1, D2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(d2_8xlargeEClass, D2_8xlarge.class, "D2_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getD2_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, D2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "d2.8xlarge", 0, 1, D2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "36", 0, 1, D2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getD2_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "48000", 0, 1, D2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m1_smallEClass, M1_small.class, "M1_small", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM1_small_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "1.7", 0, 1, M1_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_small_InstanceType(), theOCCIPackage.getString(), "instanceType", "m1.small", 0, 1, M1_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_small_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, M1_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_small_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "160", 0, 1, M1_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t1_microEClass, T1_micro.class, "T1_micro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT1_micro_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "0.613", 0, 1, T1_micro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT1_micro_InstanceType(), theOCCIPackage.getString(), "instanceType", "t1.micro", 0, 1, T1_micro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT1_micro_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, T1_micro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m1_mediumEClass, M1_medium.class, "M1_medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM1_medium_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "3.75", 0, 1, M1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_medium_InstanceType(), theOCCIPackage.getString(), "instanceType", "m1.medium", 0, 1, M1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_medium_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, M1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_medium_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "410", 0, 1, M1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m1_largeEClass, M1_large.class, "M1_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM1_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "7.5", 0, 1, M1_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_large_InstanceType(), theOCCIPackage.getString(), "instanceType", "m1.large", 0, 1, M1_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, M1_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_large_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "840", 0, 1, M1_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m1_xlargeEClass, M1_xlarge.class, "M1_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM1_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15", 0, 1, M1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m1.xlarge", 0, 1, M1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, M1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM1_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1680", 0, 1, M1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c1_mediumEClass, C1_medium.class, "C1_medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC1_medium_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "1.7", 0, 1, C1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC1_medium_InstanceType(), theOCCIPackage.getString(), "instanceType", "c1.medium", 0, 1, C1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC1_medium_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, C1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC1_medium_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "350", 0, 1, C1_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c1_xlargeEClass, C1_xlarge.class, "C1_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC1_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "7", 0, 1, C1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC1_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c1.xlarge", 0, 1, C1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC1_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, C1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC1_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1680", 0, 1, C1_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cc2_8xlargeEClass, Cc2_8xlarge.class, "Cc2_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCc2_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "60.5", 0, 1, Cc2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCc2_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "c1.xlarge", 0, 1, Cc2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCc2_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, Cc2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCc2_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "3360", 0, 1, Cc2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(g2_2xlargeEClass, G2_2xlarge.class, "G2_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG2_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "15", 0, 1, G2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG2_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "g2.2xlarge", 0, 1, G2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG2_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, G2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG2_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "60", 0, 1, G2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(g2_8xlargeEClass, G2_8xlarge.class, "G2_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getG2_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "60", 0, 1, G2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG2_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "g2.8xlarge", 0, 1, G2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG2_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, G2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getG2_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "240", 0, 1, G2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cg1_4xlargeEClass, Cg1_4xlarge.class, "Cg1_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCg1_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "22.5", 0, 1, Cg1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCg1_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "g2.2xlarge", 0, 1, Cg1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCg1_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, Cg1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCg1_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1680", 0, 1, Cg1_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m2_xlargeEClass, M2_xlarge.class, "M2_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM2_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "17.1", 0, 1, M2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m2.xlarge", 0, 1, M2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, M2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "420", 0, 1, M2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m2_2xlargeEClass, M2_2xlarge.class, "M2_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM2_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "34.2", 0, 1, M2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m2.2xlarge", 0, 1, M2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, M2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "850", 0, 1, M2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(m2_4xlargeEClass, M2_4xlarge.class, "M2_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getM2_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "68.4", 0, 1, M2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "m2.4xlarge", 0, 1, M2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, M2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getM2_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1680", 0, 1, M2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cr1_8xlargeEClass, Cr1_8xlarge.class, "Cr1_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCr1_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, Cr1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCr1_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "cr1_8xlarge", 0, 1, Cr1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCr1_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, Cr1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCr1_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "240", 0, 1, Cr1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i2_xlargeEClass, I2_xlarge.class, "I2_xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI2_xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "30.5", 0, 1, I2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i2.xlarge", 0, 1, I2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, I2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "800", 0, 1, I2_xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i2_2xlargeEClass, I2_2xlarge.class, "I2_2xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI2_2xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "61", 0, 1, I2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_2xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i2.2xlarge", 0, 1, I2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_2xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "8", 0, 1, I2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_2xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "1600", 0, 1, I2_2xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i2_4xlargeEClass, I2_4xlarge.class, "I2_4xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI2_4xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "122", 0, 1, I2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_4xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i2.4xlarge", 0, 1, I2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_4xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, I2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_4xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "3200", 0, 1, I2_4xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i2_8xlargeEClass, I2_8xlarge.class, "I2_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI2_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "244", 0, 1, I2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i2.8xlarge", 0, 1, I2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "32", 0, 1, I2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "6400", 0, 1, I2_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hs1_8xlargeEClass, Hs1_8xlarge.class, "Hs1_8xlarge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHs1_8xlarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "117", 0, 1, Hs1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHs1_8xlarge_InstanceType(), theOCCIPackage.getString(), "instanceType", "i2.8xlarge", 0, 1, Hs1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHs1_8xlarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "16", 0, 1, Hs1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHs1_8xlarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "48000", 0, 1, Hs1_8xlarge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placementgroupEClass, Placementgroup.class, "Placementgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlacementgroup_GroupName(), theOCCIPackage.getString(), "groupName", null, 0, 1, Placementgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlacementgroup_Affinity(), theOCCIPackage.getString(), "affinity", null, 0, 1, Placementgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlacementgroup_HostId(), theOCCIPackage.getString(), "hostId", null, 0, 1, Placementgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlacementgroup_SpreadDomain(), theOCCIPackage.getString(), "spreadDomain", null, 0, 1, Placementgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlacementgroup_Tenancy(), theOCCIPackage.getString(), "tenancy", null, 0, 1, Placementgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlacementgroup_ZoneName(), theOCCIPackage.getString(), "zoneName", null, 0, 1, Placementgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootdevicevolumeEClass, Rootdevicevolume.class, "Rootdevicevolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRootdevicevolume_RootDeviceName(), theOCCIPackage.getString(), "rootDeviceName", null, 0, 1, Rootdevicevolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRootdevicevolume_RootDeviceType(), theOCCIPackage.getString(), "rootDeviceType", null, 0, 1, Rootdevicevolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statustransitionreasonEClass, Statustransitionreason.class, "Statustransitionreason", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatustransitionreason_StateTransitionCode(), theOCCIPackage.getString(), "stateTransitionCode", null, 0, 1, Statustransitionreason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatustransitionreason_StateTransitionMessage(), theOCCIPackage.getString(), "stateTransitionMessage", null, 0, 1, Statustransitionreason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagsEClass, Tags.class, "Tags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instancevpcinfoEClass, Instancevpcinfo.class, "Instancevpcinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstancevpcinfo_VpcId(), theOCCIPackage.getString(), "vpcId", null, 0, 1, Instancevpcinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevpcinfo_SubnetId(), theOCCIPackage.getString(), "subnetId", null, 0, 1, Instancevpcinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstancevpcinfo_SourceDestCheck(), theOCCIPackage.getBoolean(), "sourceDestCheck", null, 0, 1, Instancevpcinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(awsInstanceStateEEnum, AWSInstanceState.class, "AWSInstanceState");
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.PENDING);
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.RUNNING);
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.SHUTTINGDOWN);
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.STOPPING);
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.STOPPED);
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.TERMINATED);
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.NOTEXIST);
		addEEnumLiteral(awsInstanceStateEEnum, AWSInstanceState.REBOOTING);

		initEEnum(hypervisorTypeEEnum, HypervisorType.class, "HypervisorType");
		addEEnumLiteral(hypervisorTypeEEnum, HypervisorType.OVM);
		addEEnumLiteral(hypervisorTypeEEnum, HypervisorType.XEN);

		initEEnum(instanceLifeCycleTypeEEnum, InstanceLifeCycleType.class, "InstanceLifeCycleType");
		addEEnumLiteral(instanceLifeCycleTypeEEnum, InstanceLifeCycleType.SCHEDULED);
		addEEnumLiteral(instanceLifeCycleTypeEEnum, InstanceLifeCycleType.SPOT);

		initEEnum(monitoringStateEEnum, MonitoringState.class, "MonitoringState");
		addEEnumLiteral(monitoringStateEEnum, MonitoringState.DISABLED);
		addEEnumLiteral(monitoringStateEEnum, MonitoringState.DISABLING);
		addEEnumLiteral(monitoringStateEEnum, MonitoringState.ENABLED);
		addEEnumLiteral(monitoringStateEEnum, MonitoringState.PENDING);

		initEEnum(virtualizationTypeEEnum, VirtualizationType.class, "VirtualizationType");
		addEEnumLiteral(virtualizationTypeEEnum, VirtualizationType.HVM);
		addEEnumLiteral(virtualizationTypeEEnum, VirtualizationType.PARAVIRTUAL);

		initEEnum(ipPermissionTypeEEnum, IpPermissionType.class, "IpPermissionType");
		addEEnumLiteral(ipPermissionTypeEEnum, IpPermissionType.INBOUND);
		addEEnumLiteral(ipPermissionTypeEEnum, IpPermissionType.OUTBOUND);

		initEEnum(ipProtocolEEnum, IpProtocol.class, "IpProtocol");
		addEEnumLiteral(ipProtocolEEnum, IpProtocol.TCP);
		addEEnumLiteral(ipProtocolEEnum, IpProtocol.UDP);
		addEEnumLiteral(ipProtocolEEnum, IpProtocol.ICMP);

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
		  (securitygrouplinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (keypairlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (ippermissionlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (awscredentialEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (computeoptimizedEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (memoryoptimizedEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (acceleratedcomputingEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (storageoptimizedEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (placementgroupEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (rootdevicevolumeEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (statustransitionreasonEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tagsEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (instancevpcinfoEClass, 
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
			 "regions", "http://occiware.org/occi/infrastructure/locations/ecore",
			 "accounts", "http://occiware.org/occi/infrastructure/security/ecore",
			 "infrastructure", "http://schemas.ogf.org/occi/infrastructure/ecore",
			 "awsregions", "http://occiware.org/occi/infrastructure/locations/aws/ecore"
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
		  (securitygrouplinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(ec2::Instanceec2)",
			 "targetConstraint", "self.target.oclIsKindOf(ec2::Securitygroup)"
		   });	
		addAnnotation
		  (keypairlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(ec2::Instanceec2)",
			 "targetConstraint", "self.target.oclIsKindOf(ec2::Keypair)"
		   });	
		addAnnotation
		  (ippermissionlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(ec2::Securitygroup)",
			 "targetConstraint", "self.target.oclIsKindOf(ec2::Ippermission)"
		   });	
		addAnnotation
		  (awscredentialEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Awsaccount)"
		   });	
		addAnnotation
		  (computeoptimizedEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (memoryoptimizedEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (acceleratedcomputingEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (storageoptimizedEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (placementgroupEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (rootdevicevolumeEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (statustransitionreasonEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (tagsEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });	
		addAnnotation
		  (instancevpcinfoEClass, 
		   source, 
		   new String[] {
			 "appliesConstraint", "self.entity.oclIsKindOf(ec2::Instanceec2)"
		   });
	}

} //Ec2PackageImpl
