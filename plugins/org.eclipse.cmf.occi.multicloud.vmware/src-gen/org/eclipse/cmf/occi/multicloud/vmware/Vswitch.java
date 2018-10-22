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
package org.eclipse.cmf.occi.multicloud.vmware;

import org.eclipse.cmf.occi.infrastructure.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vswitch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vswitch#getNbport <em>Nbport</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVswitch()
 * @model
 * @generated
 */
public interface Vswitch extends Network {
	/**
	 * Returns the value of the '<em><b>Nbport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nbport</em>' attribute.
	 * @see #setNbport(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVswitch_Nbport()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vswitch!nbport'"
	 * @generated
	 */
	Integer getNbport();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vswitch#getNbport <em>Nbport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbport</em>' attribute.
	 * @see #getNbport()
	 * @generated
	 */
	void setNbport(Integer value);

} // Vswitch
