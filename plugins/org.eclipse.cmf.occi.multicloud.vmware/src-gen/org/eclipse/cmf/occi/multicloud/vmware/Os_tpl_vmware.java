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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.infrastructure.Os_tpl;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os tpl vmware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getDatastoreisopath <em>Datastoreisopath</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getGuestid <em>Guestid</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getOs_tpl_vmware()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(vmware::Instancevmware)'"
 * @generated
 */
public interface Os_tpl_vmware extends Os_tpl, MixinBase {
	/**
	 * Returns the value of the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datastoreisopath</em>' attribute.
	 * @see #setDatastoreisopath(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getOs_tpl_vmware_Datastoreisopath()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getDatastoreisopath();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getDatastoreisopath <em>Datastoreisopath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastoreisopath</em>' attribute.
	 * @see #getDatastoreisopath()
	 * @generated
	 */
	void setDatastoreisopath(String value);

	/**
	 * Returns the value of the '<em><b>Guestid</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guestid</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
	 * @see #setGuestid(GuestOsIdentifiers)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getOs_tpl_vmware_Guestid()
	 * @model required="true"
	 * @generated
	 */
	GuestOsIdentifiers getGuestid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware#getGuestid <em>Guestid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guestid</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
	 * @see #getGuestid()
	 * @generated
	 */
	void setGuestid(GuestOsIdentifiers value);

} // Os_tpl_vmware
