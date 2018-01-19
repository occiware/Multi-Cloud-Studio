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

import org.eclipse.cmf.occi.core.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filetransferoperations</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationSource <em>Path Location Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationTarget <em>Path Location Target</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getProgressPercent <em>Progress Percent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getTransferMode <em>Transfer Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getFiletransferoperations()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sourceConstraint targetConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sourceConstraint='self.source.oclIsKindOf(infrastructure::Compute)' targetConstraint='self.target.oclIsKindOf(infrastructure::Compute)'"
 * @generated
 */
public interface Filetransferoperations extends Link {
	/**
	 * Returns the value of the '<em><b>Path Location Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Location Source</em>' attribute.
	 * @see #setPathLocationSource(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getFiletransferoperations_PathLocationSource()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPathLocationSource();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationSource <em>Path Location Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Location Source</em>' attribute.
	 * @see #getPathLocationSource()
	 * @generated
	 */
	void setPathLocationSource(String value);

	/**
	 * Returns the value of the '<em><b>Path Location Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Location Target</em>' attribute.
	 * @see #setPathLocationTarget(String)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getFiletransferoperations_PathLocationTarget()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPathLocationTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getPathLocationTarget <em>Path Location Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Location Target</em>' attribute.
	 * @see #getPathLocationTarget()
	 * @generated
	 */
	void setPathLocationTarget(String value);

	/**
	 * Returns the value of the '<em><b>Progress Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Percent</em>' attribute.
	 * @see #setProgressPercent(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getFiletransferoperations_ProgressPercent()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getProgressPercent();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getProgressPercent <em>Progress Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Percent</em>' attribute.
	 * @see #getProgressPercent()
	 * @generated
	 */
	void setProgressPercent(Integer value);

	/**
	 * Returns the value of the '<em><b>Transfer Mode</b></em>' attribute.
	 * The default value is <code>"scp"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.interoperability.TransferType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transfer Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.TransferType
	 * @see #setTransferMode(TransferType)
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage#getFiletransferoperations_TransferMode()
	 * @model default="scp"
	 * @generated
	 */
	TransferType getTransferMode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations#getTransferMode <em>Transfer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.interoperability.TransferType
	 * @see #getTransferMode()
	 * @generated
	 */
	void setTransferMode(TransferType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void copy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void encryptandcopy();

} // Filetransferoperations
