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
package org.eclipse.cmf.occi.multicloud.vmware.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>vmware</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwareTests extends TestSuite {

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
		TestSuite suite = new VmwareTests("vmware Tests");
		suite.addTestSuite(InstancevmwareTest.class);
		suite.addTestSuite(StoragevmwareTest.class);
		suite.addTestSuite(StoragelinkvmwareTest.class);
		suite.addTestSuite(VswitchTest.class);
		suite.addTestSuite(NetworkadapterTest.class);
		suite.addTestSuite(WindowsTest.class);
		suite.addTestSuite(LinuxTest.class);
		suite.addTestSuite(MacosxTest.class);
		suite.addTestSuite(VmwarefoldersTest.class);
		suite.addTestSuite(Os_tpl_vmwareTest.class);
		suite.addTestSuite(Ssh_user_dataTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareTests(String name) {
		super(name);
	}

} //VmwareTests
