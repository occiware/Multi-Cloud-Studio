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
package org.eclipse.cmf.occi.multicloud.interoperability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage
 * @generated
 */
public interface InteroperabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteroperabilityFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.interoperability.impl.InteroperabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Filetransferoperations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filetransferoperations</em>'.
	 * @generated
	 */
	Filetransferoperations createFiletransferoperations();

	/**
	 * Returns a new object of class '<em>Httptransfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Httptransfer</em>'.
	 * @generated
	 */
	Httptransfer createHttptransfer();

	/**
	 * Returns a new object of class '<em>Sshtransfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sshtransfer</em>'.
	 * @generated
	 */
	Sshtransfer createSshtransfer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteroperabilityPackage getInteroperabilityPackage();

} //InteroperabilityFactory
