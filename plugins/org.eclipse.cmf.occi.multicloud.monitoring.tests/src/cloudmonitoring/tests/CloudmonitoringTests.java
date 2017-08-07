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
package cloudmonitoring.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>cloudmonitoring</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudmonitoringTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CloudmonitoringTests("cloudmonitoring Tests");
		suite.addTestSuite(CloudsensorTest.class);
		suite.addTestSuite(CpuTest.class);
		suite.addTestSuite(DiskioTest.class);
		suite.addTestSuite(RamTest.class);
		suite.addTestSuite(NetworkioTest.class);
		suite.addTestSuite(InputoutputTest.class);
		suite.addTestSuite(SensorcontrolTest.class);
		suite.addTestSuite(EmfpublisherTest.class);
		suite.addTestSuite(SystemoutpublisherTest.class);
		suite.addTestSuite(PublishercontrolTest.class);
		suite.addTestSuite(DiskTest.class);
		suite.addTestSuite(MailpublisherTest.class);
		suite.addTestSuite(MainmetricTest.class);
		suite.addTestSuite(SupervisorapiconnectTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudmonitoringTests(String name) {
		super(name);
	}

} //CloudmonitoringTests
