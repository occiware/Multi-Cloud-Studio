/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Wed Jan 10 17:36:43 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.aws.ec2/model/ec2.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.aws.ec2.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: ec2
 * - scheme: http://occiware.org/occi/infrastructure/aws#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Ec2FactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: instanceec2
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Instanceec2 createInstanceec2() {
		return new Instanceec2Connector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: awsaccount
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount createAwsaccount() {
		return new AwsaccountConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: securitygroup
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup createSecuritygroup() {
		return new SecuritygroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: keypair
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair createKeypair() {
		return new KeypairConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: keypairlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Keypairlink createKeypairlink() {
		return new KeypairlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: awscredential
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Awscredential createAwscredential() {
		return new AwscredentialConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t2_nano
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T2_nano createT2_nano() {
		return new T2_nanoConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t2_micro
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T2_micro createT2_micro() {
		return new T2_microConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t2_small
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T2_small createT2_small() {
		return new T2_smallConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t2_medium
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T2_medium createT2_medium() {
		return new T2_mediumConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t2_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T2_large createT2_large() {
		return new T2_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t2_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T2_xlarge createT2_xlarge() {
		return new T2_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t2_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T2_2xlarge createT2_2xlarge() {
		return new T2_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m5_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large createM5_large() {
		return new M5_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m5_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M5_xlarge createM5_xlarge() {
		return new M5_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m5_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M5_2xlarge createM5_2xlarge() {
		return new M5_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m5_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M5_4xlarge createM5_4xlarge() {
		return new M5_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m5_12xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M5_12xlarge createM5_12xlarge() {
		return new M5_12xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m5_24xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M5_24xlarge createM5_24xlarge() {
		return new M5_24xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m4_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M4_large createM4_large() {
		return new M4_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m4_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M4_xlarge createM4_xlarge() {
		return new M4_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m4_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M4_2xlarge createM4_2xlarge() {
		return new M4_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m4_10xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M4_10xlarge createM4_10xlarge() {
		return new M4_10xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m4_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M4_16xlarge createM4_16xlarge() {
		return new M4_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m3_medium
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M3_medium createM3_medium() {
		return new M3_mediumConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m3_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M3_large createM3_large() {
		return new M3_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m3_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M3_xlarge createM3_xlarge() {
		return new M3_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m3_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M3_2xlarge createM3_2xlarge() {
		return new M3_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c5_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C5_large createC5_large() {
		return new C5_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c5_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C5_xlarge createC5_xlarge() {
		return new C5_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c5_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C5_2xlarge createC5_2xlarge() {
		return new C5_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c5_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C5_4xlarge createC5_4xlarge() {
		return new C5_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c5_9xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C5_9xlarge createC5_9xlarge() {
		return new C5_9xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c5_18xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C5_18xlarge createC5_18xlarge() {
		return new C5_18xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c4_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C4_large createC4_large() {
		return new C4_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c4_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C4_xlarge createC4_xlarge() {
		return new C4_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c4_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C4_2xlarge createC4_2xlarge() {
		return new C4_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c4_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C4_4xlarge createC4_4xlarge() {
		return new C4_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c4_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C4_8xlarge createC4_8xlarge() {
		return new C4_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c3_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C3_large createC3_large() {
		return new C3_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c3_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C3_xlarge createC3_xlarge() {
		return new C3_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c3_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C3_2xlarge createC3_2xlarge() {
		return new C3_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c3_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C3_4xlarge createC3_4xlarge() {
		return new C3_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c3_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C3_8xlarge createC3_8xlarge() {
		return new C3_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1e_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_xlarge createX1e_xlarge() {
		return new X1e_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1e_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_2xlarge createX1e_2xlarge() {
		return new X1e_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1e_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_4xlarge createX1e_4xlarge() {
		return new X1e_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1e_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_8xlarge createX1e_8xlarge() {
		return new X1e_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1e_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_16xlarge createX1e_16xlarge() {
		return new X1e_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1e_32xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1e_32xlarge createX1e_32xlarge() {
		return new X1e_32xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1_16xlarge createX1_16xlarge() {
		return new X1_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: x1_32xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.X1_32xlarge createX1_32xlarge() {
		return new X1_32xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r4_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R4_large createR4_large() {
		return new R4_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r4_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R4_xlarge createR4_xlarge() {
		return new R4_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r4_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R4_2xlarge createR4_2xlarge() {
		return new R4_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r4_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R4_4xlarge createR4_4xlarge() {
		return new R4_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r4_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R4_8xlarge createR4_8xlarge() {
		return new R4_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r4_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R4_16xlarge createR4_16xlarge() {
		return new R4_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r3_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R3_large createR3_large() {
		return new R3_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r3_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R3_xlarge createR3_xlarge() {
		return new R3_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r3_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R3_2xlarge createR3_2xlarge() {
		return new R3_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r3_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R3_4xlarge createR3_4xlarge() {
		return new R3_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: r3_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.R3_8xlarge createR3_8xlarge() {
		return new R3_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: p3_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.P3_2xlarge createP3_2xlarge() {
		return new P3_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: p3_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.P3_8xlarge createP3_8xlarge() {
		return new P3_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: p3_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.P3_16xlarge createP3_16xlarge() {
		return new P3_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: p2_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.P2_xlarge createP2_xlarge() {
		return new P2_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: p2_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.P2_8xlarge createP2_8xlarge() {
		return new P2_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: p2_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.P2_16xlarge createP2_16xlarge() {
		return new P2_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: generalpurpose
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Generalpurpose createGeneralpurpose() {
		return new GeneralpurposeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: computeoptimized
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Computeoptimized createComputeoptimized() {
		return new ComputeoptimizedConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: memoryoptimized
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Memoryoptimized createMemoryoptimized() {
		return new MemoryoptimizedConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: acceleratedcomputing
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Acceleratedcomputing createAcceleratedcomputing() {
		return new AcceleratedcomputingConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: storageoptimized
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Storageoptimized createStorageoptimized() {
		return new StorageoptimizedConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: g3_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.G3_4xlarge createG3_4xlarge() {
		return new G3_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: g3_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.G3_8xlarge createG3_8xlarge() {
		return new G3_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: g3_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge createG3_16xlarge() {
		return new G3_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: f1_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.F1_2xlarge createF1_2xlarge() {
		return new F1_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: f1_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.F1_16xlarge createF1_16xlarge() {
		return new F1_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: h1_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.H1_2xlarge createH1_2xlarge() {
		return new H1_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: h1_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.H1_4xlarge createH1_4xlarge() {
		return new H1_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: h1_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.H1_8xlarge createH1_8xlarge() {
		return new H1_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: h1_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.H1_16xlarge createH1_16xlarge() {
		return new H1_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i3_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I3_large createI3_large() {
		return new I3_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i3_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I3_xlarge createI3_xlarge() {
		return new I3_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i3_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I3_2xlarge createI3_2xlarge() {
		return new I3_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i3_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I3_4xlarge createI3_4xlarge() {
		return new I3_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i3_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I3_8xlarge createI3_8xlarge() {
		return new I3_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i3_16xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I3_16xlarge createI3_16xlarge() {
		return new I3_16xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i3_metal
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I3_metal createI3_metal() {
		return new I3_metalConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: d2_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.D2_xlarge createD2_xlarge() {
		return new D2_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: d2_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.D2_2xlarge createD2_2xlarge() {
		return new D2_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: d2_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.D2_4xlarge createD2_4xlarge() {
		return new D2_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: d2_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.D2_8xlarge createD2_8xlarge() {
		return new D2_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m1_small
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M1_small createM1_small() {
		return new M1_smallConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: t1_micro
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.T1_micro createT1_micro() {
		return new T1_microConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m1_medium
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M1_medium createM1_medium() {
		return new M1_mediumConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m1_large
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M1_large createM1_large() {
		return new M1_largeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m1_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M1_xlarge createM1_xlarge() {
		return new M1_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c1_medium
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C1_medium createC1_medium() {
		return new C1_mediumConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: c1_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.C1_xlarge createC1_xlarge() {
		return new C1_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: cc2_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Cc2_8xlarge createCc2_8xlarge() {
		return new Cc2_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: g2_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.G2_2xlarge createG2_2xlarge() {
		return new G2_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: g2_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.G2_8xlarge createG2_8xlarge() {
		return new G2_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: cg1_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Cg1_4xlarge createCg1_4xlarge() {
		return new Cg1_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m2_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M2_xlarge createM2_xlarge() {
		return new M2_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m2_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M2_2xlarge createM2_2xlarge() {
		return new M2_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: m2_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.M2_4xlarge createM2_4xlarge() {
		return new M2_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: cr1_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Cr1_8xlarge createCr1_8xlarge() {
		return new Cr1_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i2_xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I2_xlarge createI2_xlarge() {
		return new I2_xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i2_2xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I2_2xlarge createI2_2xlarge() {
		return new I2_2xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i2_4xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I2_4xlarge createI2_4xlarge() {
		return new I2_4xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: i2_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.I2_8xlarge createI2_8xlarge() {
		return new I2_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: hs1_8xlarge
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Hs1_8xlarge createHs1_8xlarge() {
		return new Hs1_8xlargeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: placementgroup
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup createPlacementgroup() {
		return new PlacementgroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: rootdevicevolume
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume createRootdevicevolume() {
		return new RootdevicevolumeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: statustransitionreason
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason createStatustransitionreason() {
		return new StatustransitionreasonConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: tags
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Tags createTags() {
		return new TagsConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: instancevpcinfo
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo createInstancevpcinfo() {
		return new InstancevpcinfoConnector();
	}
	
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: ippermission
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission createIppermission() {
		return new IppermissionConnector();
	}
	
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/infrastructure/aws#
	 * - term: ippermissionlink
	 * - title: 
	 */
	@Override
	public org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermissionlink createIppermissionlink() {
		return new IppermissionlinkConnector();
	}
	
}
