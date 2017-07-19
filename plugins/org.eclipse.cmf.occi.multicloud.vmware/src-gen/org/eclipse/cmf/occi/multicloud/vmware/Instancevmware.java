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

import org.eclipse.cmf.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instancevmware</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getImagename <em>Imagename</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getMarkedastemplate <em>Markedastemplate</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGueststate <em>Gueststate</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestosid <em>Guestosid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getVcpu <em>Vcpu</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getInstanceId <em>Instance Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getInstancevmware()
 * @model
 * @generated
 */
public interface Instancevmware extends Compute {
	/**
	 * Returns the value of the '<em><b>Imagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the template if this compute has a template or will be created with a template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imagename</em>' attribute.
	 * @see #setImagename(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getInstancevmware_Imagename()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Instancevmware!imagename'"
	 * @generated
	 */
	String getImagename();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getImagename <em>Imagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagename</em>' attribute.
	 * @see #getImagename()
	 * @generated
	 */
	void setImagename(String value);

	/**
	 * Returns the value of the '<em><b>Markedastemplate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markedastemplate</em>' attribute.
	 * @see #setMarkedastemplate(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getInstancevmware_Markedastemplate()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Instancevmware!markedastemplate'"
	 * @generated
	 */
	String getMarkedastemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getMarkedastemplate <em>Markedastemplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markedastemplate</em>' attribute.
	 * @see #getMarkedastemplate()
	 * @generated
	 */
	void setMarkedastemplate(String value);

	/**
	 * Returns the value of the '<em><b>Gueststate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gueststate</em>' attribute.
	 * @see #setGueststate(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getInstancevmware_Gueststate()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Instancevmware!gueststate'"
	 * @generated
	 */
	String getGueststate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGueststate <em>Gueststate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gueststate</em>' attribute.
	 * @see #getGueststate()
	 * @generated
	 */
	void setGueststate(String value);

	/**
	 * Returns the value of the '<em><b>Guestosid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guestosid</em>' attribute.
	 * @see #setGuestosid(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getInstancevmware_Guestosid()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Instancevmware!guestosid'"
	 * @generated
	 */
	String getGuestosid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getGuestosid <em>Guestosid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guestosid</em>' attribute.
	 * @see #getGuestosid()
	 * @generated
	 */
	void setGuestosid(String value);

	/**
	 * Returns the value of the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vcpu</em>' attribute.
	 * @see #setVcpu(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getInstancevmware_Vcpu()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Instancevmware!vcpu'"
	 * @generated
	 */
	String getVcpu();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getVcpu <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpu</em>' attribute.
	 * @see #getVcpu()
	 * @generated
	 */
	void setVcpu(String value);

	/**
	 * Returns the value of the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique Instance provider Id given by provider after creation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Id</em>' attribute.
	 * @see #setInstanceId(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getInstancevmware_InstanceId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Instancevmware!instanceId'"
	 * @generated
	 */
	String getInstanceId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Instancevmware#getInstanceId <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Id</em>' attribute.
	 * @see #getInstanceId()
	 * @generated
	 */
	void setInstanceId(String value);

} // Instancevmware
