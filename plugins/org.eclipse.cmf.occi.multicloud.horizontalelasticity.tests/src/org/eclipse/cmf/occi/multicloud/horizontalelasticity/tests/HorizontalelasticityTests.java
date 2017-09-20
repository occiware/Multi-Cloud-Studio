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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>horizontalelasticity</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HorizontalelasticityTests extends TestSuite {

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
		TestSuite suite = new HorizontalelasticityTests("horizontalelasticity Tests");
		suite.addTestSuite(HorizontalgroupTest.class);
		suite.addTestSuite(LoadbalancerTest.class);
		suite.addTestSuite(InstanceTest.class);
		suite.addTestSuite(HorizontalelasticcontollerTest.class);
		suite.addTestSuite(ScalingstrategyTest.class);
		suite.addTestSuite(ManualTest.class);
		suite.addTestSuite(DynamicTest.class);
		suite.addTestSuite(InstancegrouplinkTest.class);
		suite.addTestSuite(LinkbalancerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityTests(String name) {
		super(name);
	}

} //HorizontalelasticityTests
