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
package org.eclipse.cmf.occi.multicloud.aws.ec2;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M5 large</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeMemory <em>Occi Compute Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeCores <em>Occi Compute Cores</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getM5_large()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(ec2::Instanceec2)'"
 * @generated
 */
public interface M5_large extends Generalpurpose, MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum RAM in gigabytes allocated to the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Memory</em>' attribute.
	 * @see #setOcciComputeMemory(Float)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getM5_large_OcciComputeMemory()
	 * @model default="8" dataType="org.eclipse.cmf.occi.infrastructure.GiB"
	 * @generated
	 */
	Float getOcciComputeMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeMemory <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Memory</em>' attribute.
	 * @see #getOcciComputeMemory()
	 * @generated
	 */
	void setOcciComputeMemory(Float value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * The default value is <code>"m5.large"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getM5_large_InstanceType()
	 * @model default="m5.large" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of CPU cores assigned to the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Cores</em>' attribute.
	 * @see #setOcciComputeCores(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getM5_large_OcciComputeCores()
	 * @model default="2" dataType="org.eclipse.cmf.occi.infrastructure.Core"
	 * @generated
	 */
	Integer getOcciComputeCores();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.M5_large#getOcciComputeCores <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Cores</em>' attribute.
	 * @see #getOcciComputeCores()
	 * @generated
	 */
	void setOcciComputeCores(Integer value);

} // M5_large
