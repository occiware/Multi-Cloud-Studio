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
package org.eclipse.cmf.occi.multicloud.occimonitoring.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>occimonitoring</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OccimonitoringTests extends TestSuite {

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
		TestSuite suite = new OccimonitoringTests("occimonitoring Tests");
		suite.addTestSuite(ZabbixinstanceTest.class);
		suite.addTestSuite(HostgroupTest.class);
		suite.addTestSuite(ZabbixtemplateTest.class);
		suite.addTestSuite(MetricsTest.class);
		suite.addTestSuite(CpuusageTest.class);
		suite.addTestSuite(MemoryusageTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccimonitoringTests(String name) {
		super(name);
	}

} //OccimonitoringTests
