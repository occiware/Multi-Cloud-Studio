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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.multicloud.occimonitoring.OccimonitoringFactory;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Zabbixtemplate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZabbixtemplateTest extends TestCase {

	/**
	 * The fixture for this Zabbixtemplate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zabbixtemplate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ZabbixtemplateTest.class);
	}

	/**
	 * Constructs a new Zabbixtemplate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZabbixtemplateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Zabbixtemplate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Zabbixtemplate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Zabbixtemplate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zabbixtemplate getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OccimonitoringFactory.eINSTANCE.createZabbixtemplate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ZabbixtemplateTest
