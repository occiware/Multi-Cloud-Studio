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
package org.eclipse.cmf.occi.multicloud.aws.ec2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package
 * @generated
 */
public interface Ec2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ec2Factory eINSTANCE = org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instanceec2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instanceec2</em>'.
	 * @generated
	 */
	Instanceec2 createInstanceec2();

	/**
	 * Returns a new object of class '<em>Awsaccount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Awsaccount</em>'.
	 * @generated
	 */
	Awsaccount createAwsaccount();

	/**
	 * Returns a new object of class '<em>Securitygroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Securitygroup</em>'.
	 * @generated
	 */
	Securitygroup createSecuritygroup();

	/**
	 * Returns a new object of class '<em>Securitygrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Securitygrouplink</em>'.
	 * @generated
	 */
	Securitygrouplink createSecuritygrouplink();

	/**
	 * Returns a new object of class '<em>Keypair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keypair</em>'.
	 * @generated
	 */
	Keypair createKeypair();

	/**
	 * Returns a new object of class '<em>Keypairlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keypairlink</em>'.
	 * @generated
	 */
	Keypairlink createKeypairlink();

	/**
	 * Returns a new object of class '<em>Ippermission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ippermission</em>'.
	 * @generated
	 */
	Ippermission createIppermission();

	/**
	 * Returns a new object of class '<em>Ippermissionlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ippermissionlink</em>'.
	 * @generated
	 */
	Ippermissionlink createIppermissionlink();

	/**
	 * Returns a new object of class '<em>Awscredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Awscredential</em>'.
	 * @generated
	 */
	Awscredential createAwscredential();

	/**
	 * Returns a new object of class '<em>T2 nano</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2 nano</em>'.
	 * @generated
	 */
	T2_nano createT2_nano();

	/**
	 * Returns a new object of class '<em>T2 micro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2 micro</em>'.
	 * @generated
	 */
	T2_micro createT2_micro();

	/**
	 * Returns a new object of class '<em>T2 small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2 small</em>'.
	 * @generated
	 */
	T2_small createT2_small();

	/**
	 * Returns a new object of class '<em>T2 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2 medium</em>'.
	 * @generated
	 */
	T2_medium createT2_medium();

	/**
	 * Returns a new object of class '<em>T2 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2 large</em>'.
	 * @generated
	 */
	T2_large createT2_large();

	/**
	 * Returns a new object of class '<em>T2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2 xlarge</em>'.
	 * @generated
	 */
	T2_xlarge createT2_xlarge();

	/**
	 * Returns a new object of class '<em>T2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T2 2xlarge</em>'.
	 * @generated
	 */
	T2_2xlarge createT2_2xlarge();

	/**
	 * Returns a new object of class '<em>M5 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M5 large</em>'.
	 * @generated
	 */
	M5_large createM5_large();

	/**
	 * Returns a new object of class '<em>M5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M5 xlarge</em>'.
	 * @generated
	 */
	M5_xlarge createM5_xlarge();

	/**
	 * Returns a new object of class '<em>M5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M5 2xlarge</em>'.
	 * @generated
	 */
	M5_2xlarge createM5_2xlarge();

	/**
	 * Returns a new object of class '<em>M5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M5 4xlarge</em>'.
	 * @generated
	 */
	M5_4xlarge createM5_4xlarge();

	/**
	 * Returns a new object of class '<em>M5 12xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M5 12xlarge</em>'.
	 * @generated
	 */
	M5_12xlarge createM5_12xlarge();

	/**
	 * Returns a new object of class '<em>M5 24xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M5 24xlarge</em>'.
	 * @generated
	 */
	M5_24xlarge createM5_24xlarge();

	/**
	 * Returns a new object of class '<em>M4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M4 large</em>'.
	 * @generated
	 */
	M4_large createM4_large();

	/**
	 * Returns a new object of class '<em>M4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M4 xlarge</em>'.
	 * @generated
	 */
	M4_xlarge createM4_xlarge();

	/**
	 * Returns a new object of class '<em>M4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M4 2xlarge</em>'.
	 * @generated
	 */
	M4_2xlarge createM4_2xlarge();

	/**
	 * Returns a new object of class '<em>M4 10xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M4 10xlarge</em>'.
	 * @generated
	 */
	M4_10xlarge createM4_10xlarge();

	/**
	 * Returns a new object of class '<em>M4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M4 16xlarge</em>'.
	 * @generated
	 */
	M4_16xlarge createM4_16xlarge();

	/**
	 * Returns a new object of class '<em>M3 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M3 medium</em>'.
	 * @generated
	 */
	M3_medium createM3_medium();

	/**
	 * Returns a new object of class '<em>M3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M3 large</em>'.
	 * @generated
	 */
	M3_large createM3_large();

	/**
	 * Returns a new object of class '<em>M3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M3 xlarge</em>'.
	 * @generated
	 */
	M3_xlarge createM3_xlarge();

	/**
	 * Returns a new object of class '<em>M3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M3 2xlarge</em>'.
	 * @generated
	 */
	M3_2xlarge createM3_2xlarge();

	/**
	 * Returns a new object of class '<em>C5 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C5 large</em>'.
	 * @generated
	 */
	C5_large createC5_large();

	/**
	 * Returns a new object of class '<em>C5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C5 xlarge</em>'.
	 * @generated
	 */
	C5_xlarge createC5_xlarge();

	/**
	 * Returns a new object of class '<em>C5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C5 2xlarge</em>'.
	 * @generated
	 */
	C5_2xlarge createC5_2xlarge();

	/**
	 * Returns a new object of class '<em>C5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C5 4xlarge</em>'.
	 * @generated
	 */
	C5_4xlarge createC5_4xlarge();

	/**
	 * Returns a new object of class '<em>C5 9xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C5 9xlarge</em>'.
	 * @generated
	 */
	C5_9xlarge createC5_9xlarge();

	/**
	 * Returns a new object of class '<em>C5 18xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C5 18xlarge</em>'.
	 * @generated
	 */
	C5_18xlarge createC5_18xlarge();

	/**
	 * Returns a new object of class '<em>C4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C4 large</em>'.
	 * @generated
	 */
	C4_large createC4_large();

	/**
	 * Returns a new object of class '<em>C4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C4 xlarge</em>'.
	 * @generated
	 */
	C4_xlarge createC4_xlarge();

	/**
	 * Returns a new object of class '<em>C4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C4 2xlarge</em>'.
	 * @generated
	 */
	C4_2xlarge createC4_2xlarge();

	/**
	 * Returns a new object of class '<em>C4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C4 4xlarge</em>'.
	 * @generated
	 */
	C4_4xlarge createC4_4xlarge();

	/**
	 * Returns a new object of class '<em>C4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C4 8xlarge</em>'.
	 * @generated
	 */
	C4_8xlarge createC4_8xlarge();

	/**
	 * Returns a new object of class '<em>C3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C3 large</em>'.
	 * @generated
	 */
	C3_large createC3_large();

	/**
	 * Returns a new object of class '<em>C3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C3 xlarge</em>'.
	 * @generated
	 */
	C3_xlarge createC3_xlarge();

	/**
	 * Returns a new object of class '<em>C3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C3 2xlarge</em>'.
	 * @generated
	 */
	C3_2xlarge createC3_2xlarge();

	/**
	 * Returns a new object of class '<em>C3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C3 4xlarge</em>'.
	 * @generated
	 */
	C3_4xlarge createC3_4xlarge();

	/**
	 * Returns a new object of class '<em>C3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C3 8xlarge</em>'.
	 * @generated
	 */
	C3_8xlarge createC3_8xlarge();

	/**
	 * Returns a new object of class '<em>X1e xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1e xlarge</em>'.
	 * @generated
	 */
	X1e_xlarge createX1e_xlarge();

	/**
	 * Returns a new object of class '<em>X1e 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1e 2xlarge</em>'.
	 * @generated
	 */
	X1e_2xlarge createX1e_2xlarge();

	/**
	 * Returns a new object of class '<em>X1e 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1e 4xlarge</em>'.
	 * @generated
	 */
	X1e_4xlarge createX1e_4xlarge();

	/**
	 * Returns a new object of class '<em>X1e 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1e 8xlarge</em>'.
	 * @generated
	 */
	X1e_8xlarge createX1e_8xlarge();

	/**
	 * Returns a new object of class '<em>X1e 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1e 16xlarge</em>'.
	 * @generated
	 */
	X1e_16xlarge createX1e_16xlarge();

	/**
	 * Returns a new object of class '<em>X1e 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1e 32xlarge</em>'.
	 * @generated
	 */
	X1e_32xlarge createX1e_32xlarge();

	/**
	 * Returns a new object of class '<em>X1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1 16xlarge</em>'.
	 * @generated
	 */
	X1_16xlarge createX1_16xlarge();

	/**
	 * Returns a new object of class '<em>X1 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X1 32xlarge</em>'.
	 * @generated
	 */
	X1_32xlarge createX1_32xlarge();

	/**
	 * Returns a new object of class '<em>R4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R4 large</em>'.
	 * @generated
	 */
	R4_large createR4_large();

	/**
	 * Returns a new object of class '<em>R4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R4 xlarge</em>'.
	 * @generated
	 */
	R4_xlarge createR4_xlarge();

	/**
	 * Returns a new object of class '<em>R4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R4 2xlarge</em>'.
	 * @generated
	 */
	R4_2xlarge createR4_2xlarge();

	/**
	 * Returns a new object of class '<em>R4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R4 4xlarge</em>'.
	 * @generated
	 */
	R4_4xlarge createR4_4xlarge();

	/**
	 * Returns a new object of class '<em>R4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R4 8xlarge</em>'.
	 * @generated
	 */
	R4_8xlarge createR4_8xlarge();

	/**
	 * Returns a new object of class '<em>R4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R4 16xlarge</em>'.
	 * @generated
	 */
	R4_16xlarge createR4_16xlarge();

	/**
	 * Returns a new object of class '<em>R3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R3 large</em>'.
	 * @generated
	 */
	R3_large createR3_large();

	/**
	 * Returns a new object of class '<em>R3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R3 xlarge</em>'.
	 * @generated
	 */
	R3_xlarge createR3_xlarge();

	/**
	 * Returns a new object of class '<em>R3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R3 2xlarge</em>'.
	 * @generated
	 */
	R3_2xlarge createR3_2xlarge();

	/**
	 * Returns a new object of class '<em>R3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R3 4xlarge</em>'.
	 * @generated
	 */
	R3_4xlarge createR3_4xlarge();

	/**
	 * Returns a new object of class '<em>R3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R3 8xlarge</em>'.
	 * @generated
	 */
	R3_8xlarge createR3_8xlarge();

	/**
	 * Returns a new object of class '<em>P3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P3 2xlarge</em>'.
	 * @generated
	 */
	P3_2xlarge createP3_2xlarge();

	/**
	 * Returns a new object of class '<em>P3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P3 8xlarge</em>'.
	 * @generated
	 */
	P3_8xlarge createP3_8xlarge();

	/**
	 * Returns a new object of class '<em>P3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P3 16xlarge</em>'.
	 * @generated
	 */
	P3_16xlarge createP3_16xlarge();

	/**
	 * Returns a new object of class '<em>P2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P2 xlarge</em>'.
	 * @generated
	 */
	P2_xlarge createP2_xlarge();

	/**
	 * Returns a new object of class '<em>P2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P2 8xlarge</em>'.
	 * @generated
	 */
	P2_8xlarge createP2_8xlarge();

	/**
	 * Returns a new object of class '<em>P2 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P2 16xlarge</em>'.
	 * @generated
	 */
	P2_16xlarge createP2_16xlarge();

	/**
	 * Returns a new object of class '<em>Generalpurpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalpurpose</em>'.
	 * @generated
	 */
	Generalpurpose createGeneralpurpose();

	/**
	 * Returns a new object of class '<em>Computeoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computeoptimized</em>'.
	 * @generated
	 */
	Computeoptimized createComputeoptimized();

	/**
	 * Returns a new object of class '<em>Memoryoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memoryoptimized</em>'.
	 * @generated
	 */
	Memoryoptimized createMemoryoptimized();

	/**
	 * Returns a new object of class '<em>Acceleratedcomputing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceleratedcomputing</em>'.
	 * @generated
	 */
	Acceleratedcomputing createAcceleratedcomputing();

	/**
	 * Returns a new object of class '<em>Storageoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storageoptimized</em>'.
	 * @generated
	 */
	Storageoptimized createStorageoptimized();

	/**
	 * Returns a new object of class '<em>G3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>G3 4xlarge</em>'.
	 * @generated
	 */
	G3_4xlarge createG3_4xlarge();

	/**
	 * Returns a new object of class '<em>G3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>G3 8xlarge</em>'.
	 * @generated
	 */
	G3_8xlarge createG3_8xlarge();

	/**
	 * Returns a new object of class '<em>G3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>G3 16xlarge</em>'.
	 * @generated
	 */
	G3_16xlarge createG3_16xlarge();

	/**
	 * Returns a new object of class '<em>F1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>F1 2xlarge</em>'.
	 * @generated
	 */
	F1_2xlarge createF1_2xlarge();

	/**
	 * Returns a new object of class '<em>F1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>F1 16xlarge</em>'.
	 * @generated
	 */
	F1_16xlarge createF1_16xlarge();

	/**
	 * Returns a new object of class '<em>H1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>H1 2xlarge</em>'.
	 * @generated
	 */
	H1_2xlarge createH1_2xlarge();

	/**
	 * Returns a new object of class '<em>H1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>H1 4xlarge</em>'.
	 * @generated
	 */
	H1_4xlarge createH1_4xlarge();

	/**
	 * Returns a new object of class '<em>H1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>H1 8xlarge</em>'.
	 * @generated
	 */
	H1_8xlarge createH1_8xlarge();

	/**
	 * Returns a new object of class '<em>H1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>H1 16xlarge</em>'.
	 * @generated
	 */
	H1_16xlarge createH1_16xlarge();

	/**
	 * Returns a new object of class '<em>I3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I3 large</em>'.
	 * @generated
	 */
	I3_large createI3_large();

	/**
	 * Returns a new object of class '<em>I3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I3 xlarge</em>'.
	 * @generated
	 */
	I3_xlarge createI3_xlarge();

	/**
	 * Returns a new object of class '<em>I3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I3 2xlarge</em>'.
	 * @generated
	 */
	I3_2xlarge createI3_2xlarge();

	/**
	 * Returns a new object of class '<em>I3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I3 4xlarge</em>'.
	 * @generated
	 */
	I3_4xlarge createI3_4xlarge();

	/**
	 * Returns a new object of class '<em>I3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I3 8xlarge</em>'.
	 * @generated
	 */
	I3_8xlarge createI3_8xlarge();

	/**
	 * Returns a new object of class '<em>I3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I3 16xlarge</em>'.
	 * @generated
	 */
	I3_16xlarge createI3_16xlarge();

	/**
	 * Returns a new object of class '<em>I3 metal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I3 metal</em>'.
	 * @generated
	 */
	I3_metal createI3_metal();

	/**
	 * Returns a new object of class '<em>D2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>D2 xlarge</em>'.
	 * @generated
	 */
	D2_xlarge createD2_xlarge();

	/**
	 * Returns a new object of class '<em>D2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>D2 2xlarge</em>'.
	 * @generated
	 */
	D2_2xlarge createD2_2xlarge();

	/**
	 * Returns a new object of class '<em>D2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>D2 4xlarge</em>'.
	 * @generated
	 */
	D2_4xlarge createD2_4xlarge();

	/**
	 * Returns a new object of class '<em>D2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>D2 8xlarge</em>'.
	 * @generated
	 */
	D2_8xlarge createD2_8xlarge();

	/**
	 * Returns a new object of class '<em>M1 small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M1 small</em>'.
	 * @generated
	 */
	M1_small createM1_small();

	/**
	 * Returns a new object of class '<em>T1 micro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>T1 micro</em>'.
	 * @generated
	 */
	T1_micro createT1_micro();

	/**
	 * Returns a new object of class '<em>M1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M1 medium</em>'.
	 * @generated
	 */
	M1_medium createM1_medium();

	/**
	 * Returns a new object of class '<em>M1 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M1 large</em>'.
	 * @generated
	 */
	M1_large createM1_large();

	/**
	 * Returns a new object of class '<em>M1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M1 xlarge</em>'.
	 * @generated
	 */
	M1_xlarge createM1_xlarge();

	/**
	 * Returns a new object of class '<em>C1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C1 medium</em>'.
	 * @generated
	 */
	C1_medium createC1_medium();

	/**
	 * Returns a new object of class '<em>C1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C1 xlarge</em>'.
	 * @generated
	 */
	C1_xlarge createC1_xlarge();

	/**
	 * Returns a new object of class '<em>Cc2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cc2 8xlarge</em>'.
	 * @generated
	 */
	Cc2_8xlarge createCc2_8xlarge();

	/**
	 * Returns a new object of class '<em>G2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>G2 2xlarge</em>'.
	 * @generated
	 */
	G2_2xlarge createG2_2xlarge();

	/**
	 * Returns a new object of class '<em>G2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>G2 8xlarge</em>'.
	 * @generated
	 */
	G2_8xlarge createG2_8xlarge();

	/**
	 * Returns a new object of class '<em>Cg1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cg1 4xlarge</em>'.
	 * @generated
	 */
	Cg1_4xlarge createCg1_4xlarge();

	/**
	 * Returns a new object of class '<em>M2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M2 xlarge</em>'.
	 * @generated
	 */
	M2_xlarge createM2_xlarge();

	/**
	 * Returns a new object of class '<em>M2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M2 2xlarge</em>'.
	 * @generated
	 */
	M2_2xlarge createM2_2xlarge();

	/**
	 * Returns a new object of class '<em>M2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M2 4xlarge</em>'.
	 * @generated
	 */
	M2_4xlarge createM2_4xlarge();

	/**
	 * Returns a new object of class '<em>Cr1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cr1 8xlarge</em>'.
	 * @generated
	 */
	Cr1_8xlarge createCr1_8xlarge();

	/**
	 * Returns a new object of class '<em>I2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I2 xlarge</em>'.
	 * @generated
	 */
	I2_xlarge createI2_xlarge();

	/**
	 * Returns a new object of class '<em>I2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I2 2xlarge</em>'.
	 * @generated
	 */
	I2_2xlarge createI2_2xlarge();

	/**
	 * Returns a new object of class '<em>I2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I2 4xlarge</em>'.
	 * @generated
	 */
	I2_4xlarge createI2_4xlarge();

	/**
	 * Returns a new object of class '<em>I2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I2 8xlarge</em>'.
	 * @generated
	 */
	I2_8xlarge createI2_8xlarge();

	/**
	 * Returns a new object of class '<em>Hs1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hs1 8xlarge</em>'.
	 * @generated
	 */
	Hs1_8xlarge createHs1_8xlarge();

	/**
	 * Returns a new object of class '<em>Placementgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placementgroup</em>'.
	 * @generated
	 */
	Placementgroup createPlacementgroup();

	/**
	 * Returns a new object of class '<em>Rootdevicevolume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rootdevicevolume</em>'.
	 * @generated
	 */
	Rootdevicevolume createRootdevicevolume();

	/**
	 * Returns a new object of class '<em>Statustransitionreason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statustransitionreason</em>'.
	 * @generated
	 */
	Statustransitionreason createStatustransitionreason();

	/**
	 * Returns a new object of class '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags</em>'.
	 * @generated
	 */
	Tags createTags();

	/**
	 * Returns a new object of class '<em>Instancevpcinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancevpcinfo</em>'.
	 * @generated
	 */
	Instancevpcinfo createInstancevpcinfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ec2Package getEc2Package();

} //Ec2Factory
