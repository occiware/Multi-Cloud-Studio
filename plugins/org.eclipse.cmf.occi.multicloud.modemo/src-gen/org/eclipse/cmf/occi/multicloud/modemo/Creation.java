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
package org.eclipse.cmf.occi.multicloud.modemo;

import java.util.Date;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Creation#getOcciComputeCreationDate <em>Occi Compute Creation Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getCreation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(infrastructure::Compute)'"
 * @generated
 */
public interface Creation extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Compute Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Creation Date</em>' attribute.
	 * @see #setOcciComputeCreationDate(Date)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getCreation_OcciComputeCreationDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Date"
	 * @generated
	 */
	Date getOcciComputeCreationDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Creation#getOcciComputeCreationDate <em>Occi Compute Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Creation Date</em>' attribute.
	 * @see #getOcciComputeCreationDate()
	 * @generated
	 */
	void setOcciComputeCreationDate(Date value);

} // Creation
