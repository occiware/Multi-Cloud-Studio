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
 * A representation of the model object '<em><b>Instancevpcinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getSubnetId <em>Subnet Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#isSourceDestCheck <em>Source Dest Check</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstancevpcinfo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(ec2::Instanceec2)'"
 * @generated
 */
public interface Instancevpcinfo extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vpc Id</em>' attribute.
	 * @see #setVpcId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstancevpcinfo_VpcId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getVpcId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getVpcId <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Id</em>' attribute.
	 * @see #getVpcId()
	 * @generated
	 */
	void setVpcId(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [EC2-VPC] The ID of the subnet in which the instance is running.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Id</em>' attribute.
	 * @see #setSubnetId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstancevpcinfo_SubnetId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSubnetId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#getSubnetId <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Id</em>' attribute.
	 * @see #getSubnetId()
	 * @generated
	 */
	void setSubnetId(String value);

	/**
	 * Returns the value of the '<em><b>Source Dest Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to enable an instance launched in a VPC to perform NAT. 
	 * This controls whether source/destination checking is enabled on the instance. 
	 * A value of true means that checking is enabled, and false means that checking is disabled. 
	 * The value must be false for the instance to perform NAT. 
	 * For more information, see NAT Instances in the Amazon Virtual Private Cloud User Guide
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Dest Check</em>' attribute.
	 * @see #setSourceDestCheck(boolean)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getInstancevpcinfo_SourceDestCheck()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean"
	 * @generated
	 */
	boolean isSourceDestCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo#isSourceDestCheck <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dest Check</em>' attribute.
	 * @see #isSourceDestCheck()
	 * @generated
	 */
	void setSourceDestCheck(boolean value);

} // Instancevpcinfo
