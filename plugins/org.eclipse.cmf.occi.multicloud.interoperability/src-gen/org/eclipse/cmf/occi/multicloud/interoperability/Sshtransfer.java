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

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sshtransfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcusername <em>Srcusername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcpassword <em>Srcpassword</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcprivateKeyPath <em>Srcprivate Key Path</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetusername <em>Targetusername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetpassword <em>Targetpassword</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetprivatekeypath <em>Targetprivatekeypath</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshport <em>Sshport</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(interoperability::Filetransferoperations)'"
 * @generated
 */
public interface Sshtransfer extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Srcusername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srcusername</em>' attribute.
	 * @see #setSrcusername(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Srcusername()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSrcusername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcusername <em>Srcusername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcusername</em>' attribute.
	 * @see #getSrcusername()
	 * @generated
	 */
	void setSrcusername(String value);

	/**
	 * Returns the value of the '<em><b>Srcpassword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srcpassword</em>' attribute.
	 * @see #setSrcpassword(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Srcpassword()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSrcpassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcpassword <em>Srcpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcpassword</em>' attribute.
	 * @see #getSrcpassword()
	 * @generated
	 */
	void setSrcpassword(String value);

	/**
	 * Returns the value of the '<em><b>Srcprivate Key Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srcprivate Key Path</em>' attribute.
	 * @see #setSrcprivateKeyPath(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_SrcprivateKeyPath()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSrcprivateKeyPath();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSrcprivateKeyPath <em>Srcprivate Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcprivate Key Path</em>' attribute.
	 * @see #getSrcprivateKeyPath()
	 * @generated
	 */
	void setSrcprivateKeyPath(String value);

	/**
	 * Returns the value of the '<em><b>Targetusername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targetusername</em>' attribute.
	 * @see #setTargetusername(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Targetusername()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getTargetusername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetusername <em>Targetusername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetusername</em>' attribute.
	 * @see #getTargetusername()
	 * @generated
	 */
	void setTargetusername(String value);

	/**
	 * Returns the value of the '<em><b>Targetpassword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targetpassword</em>' attribute.
	 * @see #setTargetpassword(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Targetpassword()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getTargetpassword();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetpassword <em>Targetpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetpassword</em>' attribute.
	 * @see #getTargetpassword()
	 * @generated
	 */
	void setTargetpassword(String value);

	/**
	 * Returns the value of the '<em><b>Targetprivatekeypath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targetprivatekeypath</em>' attribute.
	 * @see #setTargetprivatekeypath(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Targetprivatekeypath()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getTargetprivatekeypath();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getTargetprivatekeypath <em>Targetprivatekeypath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetprivatekeypath</em>' attribute.
	 * @see #getTargetprivatekeypath()
	 * @generated
	 */
	void setTargetprivatekeypath(String value);

	/**
	 * Returns the value of the '<em><b>Sshport</b></em>' attribute.
	 * The default value is <code>"22"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sshport</em>' attribute.
	 * @see #setSshport(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getSshtransfer_Sshport()
	 * @model default="22" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getSshport();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer#getSshport <em>Sshport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sshport</em>' attribute.
	 * @see #getSshport()
	 * @generated
	 */
	void setSshport(Integer value);

} // Sshtransfer
