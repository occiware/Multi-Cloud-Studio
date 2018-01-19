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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Securitygroup</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getSecurityGroupName <em>Security Group Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getSecurityGroupDescription <em>Security Group Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getSecurityGroupId <em>Security Group Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getSecuritygroup()
 * @model
 * @generated
 */
public interface Securitygroup extends Resource {
	/**
	 * Returns the value of the '<em><b>Security Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Group Name</em>' attribute.
	 * @see #setSecurityGroupName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getSecuritygroup_SecurityGroupName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getSecurityGroupName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getSecurityGroupName <em>Security Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group Name</em>' attribute.
	 * @see #getSecurityGroupName()
	 * @generated
	 */
	void setSecurityGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Security Group Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Group Description</em>' attribute.
	 * @see #setSecurityGroupDescription(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getSecuritygroup_SecurityGroupDescription()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSecurityGroupDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getSecurityGroupDescription <em>Security Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group Description</em>' attribute.
	 * @see #getSecurityGroupDescription()
	 * @generated
	 */
	void setSecurityGroupDescription(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vpc Id</em>' attribute.
	 * @see #setVpcId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getSecuritygroup_VpcId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getVpcId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getVpcId <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Id</em>' attribute.
	 * @see #getVpcId()
	 * @generated
	 */
	void setVpcId(String value);

	/**
	 * Returns the value of the '<em><b>Security Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security group id defined by the provider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Group Id</em>' attribute.
	 * @see #setSecurityGroupId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getSecuritygroup_SecurityGroupId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSecurityGroupId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup#getSecurityGroupId <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group Id</em>' attribute.
	 * @see #getSecurityGroupId()
	 * @generated
	 */
	void setSecurityGroupId(String value);

} // Securitygroup
