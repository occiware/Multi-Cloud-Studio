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

import org.eclipse.cmf.occi.infrastructure.impl.Resource_tplImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Acceleratedcomputing;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acceleratedcomputing</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceleratedcomputingImpl extends Resource_tplImpl implements Acceleratedcomputing {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceleratedcomputingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getAcceleratedcomputing();
	}

} //AcceleratedcomputingImpl
